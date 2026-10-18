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
public final class j0 implements Handler.Callback, ServiceConnection {
    public final Context f8118a;
    public final Handler f8119b;
    public final HashMap f8120c = new HashMap();
    public HashSet d = new HashSet();

    public j0(Context context) {
        this.f8118a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f8119b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(i0 i0Var) {
        boolean z10;
        ArrayDeque arrayDeque = i0Var.d;
        ComponentName componentName = i0Var.f8115a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (i0Var.f8116b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f8118a;
                boolean bindService = context.bindService(component, this, 33);
                i0Var.f8116b = bindService;
                if (bindService) {
                    i0Var.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = i0Var.f8116b;
            }
            if (z10 && i0Var.f8117c != null) {
                while (true) {
                    g0 g0Var = (g0) arrayDeque.peek();
                    if (g0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + g0Var);
                        }
                        g0Var.a(i0Var.f8117c);
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
                    b(i0Var);
                    return;
                }
                return;
            }
            b(i0Var);
        }
    }

    public final void b(i0 i0Var) {
        ComponentName componentName = i0Var.f8115a;
        ArrayDeque arrayDeque = i0Var.d;
        Handler handler = this.f8119b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = i0Var.e;
        int i11 = i10 + 1;
        i0Var.e = i11;
        if (i11 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + i0Var.e + " retries");
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
                    i0 i0Var = (i0) this.f8120c.get((ComponentName) message.obj);
                    if (i0Var != null) {
                        a(i0Var);
                        return true;
                    }
                } else {
                    i0 i0Var2 = (i0) this.f8120c.get((ComponentName) message.obj);
                    if (i0Var2 != null) {
                        if (i0Var2.f8116b) {
                            this.f8118a.unbindService(this);
                            i0Var2.f8116b = false;
                        }
                        i0Var2.f8117c = null;
                        return true;
                    }
                }
            } else {
                h0 h0Var = (h0) message.obj;
                ComponentName componentName = h0Var.f8113a;
                IBinder iBinder = h0Var.f8114b;
                i0 i0Var3 = (i0) this.f8120c.get(componentName);
                if (i0Var3 != null) {
                    int i11 = b.b.f3649a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f3650g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f3648a = iBinder;
                            cVar = obj;
                        }
                    }
                    i0Var3.f8117c = cVar;
                    i0Var3.e = 0;
                    a(i0Var3);
                    return true;
                }
            }
        } else {
            g0 g0Var = (g0) message.obj;
            String string = Settings.Secure.getString(this.f8118a.getContentResolver(), "enabled_notification_listeners");
            synchronized (k0.f8123c) {
                if (string != null) {
                    try {
                        if (!string.equals(k0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            k0.e = hashSet2;
                            k0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = k0.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f8118a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f8120c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f8120c.put(componentName3, new i0(componentName3));
                    }
                }
                Iterator it2 = this.f8120c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        i0 i0Var4 = (i0) entry.getValue();
                        if (i0Var4.f8116b) {
                            this.f8118a.unbindService(this);
                            i0Var4.f8116b = false;
                        }
                        i0Var4.f8117c = null;
                        it2.remove();
                    }
                }
            }
            for (i0 i0Var5 : this.f8120c.values()) {
                i0Var5.d.add(g0Var);
                a(i0Var5);
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f8119b.obtainMessage(1, new h0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f8119b.obtainMessage(2, componentName).sendToTarget();
    }
}
