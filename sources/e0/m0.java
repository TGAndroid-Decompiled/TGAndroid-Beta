package e0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public final class m0 implements Handler.Callback, ServiceConnection {
    public final Context f4733a;
    public final Handler f4734b;
    public final HashMap f4735c = new HashMap();
    public HashSet d = new HashSet();

    public m0(Context context) {
        this.f4733a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f4734b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(l0 l0Var) {
        boolean z10;
        ArrayDeque arrayDeque = l0Var.d;
        ComponentName componentName = l0Var.f4729a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (l0Var.f4730b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f4733a;
                boolean bindService = context.bindService(component, this, 33);
                l0Var.f4730b = bindService;
                if (bindService) {
                    l0Var.f4732e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = l0Var.f4730b;
            }
            if (z10 && l0Var.f4731c != null) {
                while (true) {
                    j0 j0Var = (j0) arrayDeque.peek();
                    if (j0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + j0Var);
                        }
                        j0Var.a(l0Var.f4731c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(l0Var);
                    return;
                }
                return;
            }
            b(l0Var);
        }
    }

    public final void b(l0 l0Var) {
        ComponentName componentName = l0Var.f4729a;
        ArrayDeque arrayDeque = l0Var.d;
        Handler handler = this.f4734b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i9 = l0Var.f4732e;
        int i10 = i9 + 1;
        l0Var.f4732e = i10;
        if (i10 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + l0Var.f4732e + " retries");
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i9) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i9 = message.what;
        b.c cVar = null;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return false;
                    }
                    l0 l0Var = (l0) this.f4735c.get((ComponentName) message.obj);
                    if (l0Var != null) {
                        a(l0Var);
                        return true;
                    }
                } else {
                    l0 l0Var2 = (l0) this.f4735c.get((ComponentName) message.obj);
                    if (l0Var2 != null) {
                        if (l0Var2.f4730b) {
                            this.f4733a.unbindService(this);
                            l0Var2.f4730b = false;
                        }
                        l0Var2.f4731c = null;
                        return true;
                    }
                }
            } else {
                k0 k0Var = (k0) message.obj;
                ComponentName componentName = k0Var.f4727a;
                IBinder iBinder = k0Var.f4728b;
                l0 l0Var3 = (l0) this.f4735c.get(componentName);
                if (l0Var3 != null) {
                    int i10 = b.b.f1383a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f1384g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f1382a = iBinder;
                            cVar = obj;
                        }
                    }
                    l0Var3.f4731c = cVar;
                    l0Var3.f4732e = 0;
                    a(l0Var3);
                    return true;
                }
            }
        } else {
            j0 j0Var = (j0) message.obj;
            String string = Settings.Secure.getString(this.f4733a.getContentResolver(), "enabled_notification_listeners");
            synchronized (n0.f4739c) {
                if (string != null) {
                    try {
                        if (!string.equals(n0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            n0.f4740e = hashSet2;
                            n0.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = n0.f4740e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f4733a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f4735c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f4735c.put(componentName3, new l0(componentName3));
                    }
                }
                Iterator it2 = this.f4735c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        l0 l0Var4 = (l0) entry.getValue();
                        if (l0Var4.f4730b) {
                            this.f4733a.unbindService(this);
                            l0Var4.f4730b = false;
                        }
                        l0Var4.f4731c = null;
                        it2.remove();
                    }
                }
            }
            for (l0 l0Var5 : this.f4735c.values()) {
                l0Var5.d.add(j0Var);
                a(l0Var5);
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f4734b.obtainMessage(1, new k0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f4734b.obtainMessage(2, componentName).sendToTarget();
    }
}
