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
    public final Context f7111a;
    public final Handler f7112b;
    public final HashMap f7113c = new HashMap();
    public HashSet d = new HashSet();

    public m0(Context context) {
        this.f7111a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f7112b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(l0 l0Var) {
        boolean z10;
        ArrayDeque arrayDeque = l0Var.d;
        ComponentName componentName = l0Var.f7108a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (l0Var.f7109b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f7111a;
                boolean bindService = context.bindService(component, this, 33);
                l0Var.f7109b = bindService;
                if (bindService) {
                    l0Var.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = l0Var.f7109b;
            }
            if (z10 && l0Var.f7110c != null) {
                while (true) {
                    j0 j0Var = (j0) arrayDeque.peek();
                    if (j0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + j0Var);
                        }
                        j0Var.a(l0Var.f7110c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
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
        ComponentName componentName = l0Var.f7108a;
        ArrayDeque arrayDeque = l0Var.d;
        Handler handler = this.f7112b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = l0Var.e;
        int i11 = i10 + 1;
        l0Var.e = i11;
        if (i11 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + l0Var.e + " retries");
            arrayDeque.clear();
            return;
        }
        int i12 = (1 << i10) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        b.c cVar = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    l0 l0Var = (l0) this.f7113c.get((ComponentName) message.obj);
                    if (l0Var != null) {
                        a(l0Var);
                        return true;
                    }
                } else {
                    l0 l0Var2 = (l0) this.f7113c.get((ComponentName) message.obj);
                    if (l0Var2 != null) {
                        if (l0Var2.f7109b) {
                            this.f7111a.unbindService(this);
                            l0Var2.f7109b = false;
                        }
                        l0Var2.f7110c = null;
                        return true;
                    }
                }
            } else {
                k0 k0Var = (k0) message.obj;
                ComponentName componentName = k0Var.f7106a;
                IBinder iBinder = k0Var.f7107b;
                l0 l0Var3 = (l0) this.f7113c.get(componentName);
                if (l0Var3 != null) {
                    int i11 = b.b.f1574a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f1575g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f1573a = iBinder;
                            cVar = obj;
                        }
                    }
                    l0Var3.f7110c = cVar;
                    l0Var3.e = 0;
                    a(l0Var3);
                    return true;
                }
            }
        } else {
            j0 j0Var = (j0) message.obj;
            String string = Settings.Secure.getString(this.f7111a.getContentResolver(), "enabled_notification_listeners");
            synchronized (n0.f7116c) {
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
                            n0.e = hashSet2;
                            n0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = n0.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f7111a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f7113c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f7113c.put(componentName3, new l0(componentName3));
                    }
                }
                Iterator it2 = this.f7113c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        l0 l0Var4 = (l0) entry.getValue();
                        if (l0Var4.f7109b) {
                            this.f7111a.unbindService(this);
                            l0Var4.f7109b = false;
                        }
                        l0Var4.f7110c = null;
                        it2.remove();
                    }
                }
            }
            for (l0 l0Var5 : this.f7113c.values()) {
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
        this.f7112b.obtainMessage(1, new k0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f7112b.obtainMessage(2, componentName).sendToTarget();
    }
}
