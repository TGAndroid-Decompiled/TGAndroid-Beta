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
public final class l0 implements Handler.Callback, ServiceConnection {
    public final Context f4819a;
    public final Handler f4820b;
    public final HashMap f4821c = new HashMap();
    public HashSet d = new HashSet();

    public l0(Context context) {
        this.f4819a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f4820b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(k0 k0Var) {
        boolean z4;
        ArrayDeque arrayDeque = k0Var.d;
        ComponentName componentName = k0Var.f4815a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (k0Var.f4816b) {
                z4 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f4819a;
                boolean bindService = context.bindService(component, this, 33);
                k0Var.f4816b = bindService;
                if (bindService) {
                    k0Var.f4818e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z4 = k0Var.f4816b;
            }
            if (z4 && k0Var.f4817c != null) {
                while (true) {
                    i0 i0Var = (i0) arrayDeque.peek();
                    if (i0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + i0Var);
                        }
                        i0Var.a(k0Var.f4817c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e6) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e6);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(k0Var);
                    return;
                }
                return;
            }
            b(k0Var);
        }
    }

    public final void b(k0 k0Var) {
        ComponentName componentName = k0Var.f4815a;
        ArrayDeque arrayDeque = k0Var.d;
        Handler handler = this.f4820b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = k0Var.f4818e;
        int i11 = i10 + 1;
        k0Var.f4818e = i11;
        if (i11 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + k0Var.f4818e + " retries");
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
                    k0 k0Var = (k0) this.f4821c.get((ComponentName) message.obj);
                    if (k0Var != null) {
                        a(k0Var);
                        return true;
                    }
                } else {
                    k0 k0Var2 = (k0) this.f4821c.get((ComponentName) message.obj);
                    if (k0Var2 != null) {
                        if (k0Var2.f4816b) {
                            this.f4819a.unbindService(this);
                            k0Var2.f4816b = false;
                        }
                        k0Var2.f4817c = null;
                        return true;
                    }
                }
            } else {
                j0 j0Var = (j0) message.obj;
                ComponentName componentName = j0Var.f4806a;
                IBinder iBinder = j0Var.f4807b;
                k0 k0Var3 = (k0) this.f4821c.get(componentName);
                if (k0Var3 != null) {
                    int i11 = b.b.f1364a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f1365g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f1363a = iBinder;
                            cVar = obj;
                        }
                    }
                    k0Var3.f4817c = cVar;
                    k0Var3.f4818e = 0;
                    a(k0Var3);
                    return true;
                }
            }
        } else {
            i0 i0Var = (i0) message.obj;
            String string = Settings.Secure.getString(this.f4819a.getContentResolver(), "enabled_notification_listeners");
            synchronized (m0.f4822c) {
                if (string != null) {
                    try {
                        if (!string.equals(m0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            m0.f4823e = hashSet2;
                            m0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = m0.f4823e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f4819a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f4821c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f4821c.put(componentName3, new k0(componentName3));
                    }
                }
                Iterator it2 = this.f4821c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        k0 k0Var4 = (k0) entry.getValue();
                        if (k0Var4.f4816b) {
                            this.f4819a.unbindService(this);
                            k0Var4.f4816b = false;
                        }
                        k0Var4.f4817c = null;
                        it2.remove();
                    }
                }
            }
            for (k0 k0Var5 : this.f4821c.values()) {
                k0Var5.d.add(i0Var);
                a(k0Var5);
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f4820b.obtainMessage(1, new j0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f4820b.obtainMessage(2, componentName).sendToTarget();
    }
}
