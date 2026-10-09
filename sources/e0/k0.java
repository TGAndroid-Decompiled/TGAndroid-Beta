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
public final class k0 implements Handler.Callback, ServiceConnection {
    public final Context f8438a;
    public final Handler f8439b;
    public final HashMap f8440c = new HashMap();
    public HashSet d = new HashSet();

    public k0(Context context) {
        this.f8438a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f8439b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(j0 j0Var) {
        boolean z10;
        ArrayDeque arrayDeque = j0Var.d;
        ComponentName componentName = j0Var.f8434a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (j0Var.f8435b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f8438a;
                boolean bindService = context.bindService(component, this, 33);
                j0Var.f8435b = bindService;
                if (bindService) {
                    j0Var.f8437e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = j0Var.f8435b;
            }
            if (z10 && j0Var.f8436c != null) {
                while (true) {
                    h0 h0Var = (h0) arrayDeque.peek();
                    if (h0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + h0Var);
                        }
                        h0Var.a(j0Var.f8436c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e7) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e7);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(j0Var);
                    return;
                }
                return;
            }
            b(j0Var);
        }
    }

    public final void b(j0 j0Var) {
        ComponentName componentName = j0Var.f8434a;
        ArrayDeque arrayDeque = j0Var.d;
        Handler handler = this.f8439b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = j0Var.f8437e;
        int i11 = i10 + 1;
        j0Var.f8437e = i11;
        if (i11 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + j0Var.f8437e + " retries");
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
                    j0 j0Var = (j0) this.f8440c.get((ComponentName) message.obj);
                    if (j0Var != null) {
                        a(j0Var);
                        return true;
                    }
                } else {
                    j0 j0Var2 = (j0) this.f8440c.get((ComponentName) message.obj);
                    if (j0Var2 != null) {
                        if (j0Var2.f8435b) {
                            this.f8438a.unbindService(this);
                            j0Var2.f8435b = false;
                        }
                        j0Var2.f8436c = null;
                        return true;
                    }
                }
            } else {
                i0 i0Var = (i0) message.obj;
                ComponentName componentName = i0Var.f8432a;
                IBinder iBinder = i0Var.f8433b;
                j0 j0Var3 = (j0) this.f8440c.get(componentName);
                if (j0Var3 != null) {
                    int i11 = b.b.f3184a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f3185g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f3183a = iBinder;
                            cVar = obj;
                        }
                    }
                    j0Var3.f8436c = cVar;
                    j0Var3.f8437e = 0;
                    a(j0Var3);
                    return true;
                }
            }
        } else {
            h0 h0Var = (h0) message.obj;
            String string = Settings.Secure.getString(this.f8438a.getContentResolver(), "enabled_notification_listeners");
            synchronized (l0.f8444c) {
                if (string != null) {
                    try {
                        if (!string.equals(l0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            l0.f8445e = hashSet2;
                            l0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = l0.f8445e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f8438a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f8440c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f8440c.put(componentName3, new j0(componentName3));
                    }
                }
                Iterator it2 = this.f8440c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        j0 j0Var4 = (j0) entry.getValue();
                        if (j0Var4.f8435b) {
                            this.f8438a.unbindService(this);
                            j0Var4.f8435b = false;
                        }
                        j0Var4.f8436c = null;
                        it2.remove();
                    }
                }
            }
            for (j0 j0Var5 : this.f8440c.values()) {
                j0Var5.d.add(h0Var);
                a(j0Var5);
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f8439b.obtainMessage(1, new i0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f8439b.obtainMessage(2, componentName).sendToTarget();
    }
}
