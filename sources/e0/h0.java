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
public final class h0 implements Handler.Callback, ServiceConnection {
    public final Context f10073a;
    public final Handler f10074b;
    public final HashMap f10075c = new HashMap();
    public HashSet d = new HashSet();

    public h0(Context context) {
        this.f10073a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f10074b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(g0 g0Var) {
        boolean z9;
        ArrayDeque arrayDeque = g0Var.d;
        ComponentName componentName = g0Var.f10062a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (g0Var.f10063b) {
                z9 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f10073a;
                boolean bindService = context.bindService(component, this, 33);
                g0Var.f10063b = bindService;
                if (bindService) {
                    g0Var.f10065e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z9 = g0Var.f10063b;
            }
            if (z9 && g0Var.f10064c != null) {
                while (true) {
                    e0 e0Var = (e0) arrayDeque.peek();
                    if (e0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + e0Var);
                        }
                        e0Var.a(g0Var.f10064c);
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
                    b(g0Var);
                    return;
                }
                return;
            }
            b(g0Var);
        }
    }

    public final void b(g0 g0Var) {
        ComponentName componentName = g0Var.f10062a;
        ArrayDeque arrayDeque = g0Var.d;
        Handler handler = this.f10074b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = g0Var.f10065e;
        int i10 = i7 + 1;
        g0Var.f10065e = i10;
        if (i10 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + g0Var.f10065e + " retries");
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i7) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        b.c cVar = null;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return false;
                    }
                    g0 g0Var = (g0) this.f10075c.get((ComponentName) message.obj);
                    if (g0Var != null) {
                        a(g0Var);
                        return true;
                    }
                } else {
                    g0 g0Var2 = (g0) this.f10075c.get((ComponentName) message.obj);
                    if (g0Var2 != null) {
                        if (g0Var2.f10063b) {
                            this.f10073a.unbindService(this);
                            g0Var2.f10063b = false;
                        }
                        g0Var2.f10064c = null;
                        return true;
                    }
                }
            } else {
                f0 f0Var = (f0) message.obj;
                ComponentName componentName = f0Var.f10054a;
                IBinder iBinder = f0Var.f10055b;
                g0 g0Var3 = (g0) this.f10075c.get(componentName);
                if (g0Var3 != null) {
                    int i10 = b.b.f2886a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f2887g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f2885a = iBinder;
                            cVar = obj;
                        }
                    }
                    g0Var3.f10064c = cVar;
                    g0Var3.f10065e = 0;
                    a(g0Var3);
                    return true;
                }
            }
        } else {
            e0 e0Var = (e0) message.obj;
            String string = Settings.Secure.getString(this.f10073a.getContentResolver(), "enabled_notification_listeners");
            synchronized (i0.f10076c) {
                if (string != null) {
                    try {
                        if (!string.equals(i0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            i0.f10077e = hashSet2;
                            i0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = i0.f10077e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f10073a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f10075c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f10075c.put(componentName3, new g0(componentName3));
                    }
                }
                Iterator it2 = this.f10075c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        g0 g0Var4 = (g0) entry.getValue();
                        if (g0Var4.f10063b) {
                            this.f10073a.unbindService(this);
                            g0Var4.f10063b = false;
                        }
                        g0Var4.f10064c = null;
                        it2.remove();
                    }
                }
            }
            for (g0 g0Var5 : this.f10075c.values()) {
                g0Var5.d.add(e0Var);
                a(g0Var5);
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f10074b.obtainMessage(1, new f0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f10074b.obtainMessage(2, componentName).sendToTarget();
    }
}
