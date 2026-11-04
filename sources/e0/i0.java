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
public final class i0 implements Handler.Callback, ServiceConnection {
    public final Context f9252a;
    public final Handler f9253b;
    public final HashMap f9254c = new HashMap();
    public HashSet d = new HashSet();

    public i0(Context context) {
        this.f9252a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f9253b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(h0 h0Var) {
        boolean z10;
        ArrayDeque arrayDeque = h0Var.d;
        ComponentName componentName = h0Var.f9248a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (h0Var.f9249b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f9252a;
                boolean bindService = context.bindService(component, this, 33);
                h0Var.f9249b = bindService;
                if (bindService) {
                    h0Var.f9251e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = h0Var.f9249b;
            }
            if (z10 && h0Var.f9250c != null) {
                while (true) {
                    f0 f0Var = (f0) arrayDeque.peek();
                    if (f0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + f0Var);
                        }
                        f0Var.a(h0Var.f9250c);
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
                    b(h0Var);
                    return;
                }
                return;
            }
            b(h0Var);
        }
    }

    public final void b(h0 h0Var) {
        ComponentName componentName = h0Var.f9248a;
        ArrayDeque arrayDeque = h0Var.d;
        Handler handler = this.f9253b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = h0Var.f9251e;
        int i10 = i3 + 1;
        h0Var.f9251e = i10;
        if (i10 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + h0Var.f9251e + " retries");
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i3) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i3 = message.what;
        b.c cVar = null;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return false;
                    }
                    h0 h0Var = (h0) this.f9254c.get((ComponentName) message.obj);
                    if (h0Var != null) {
                        a(h0Var);
                        return true;
                    }
                } else {
                    h0 h0Var2 = (h0) this.f9254c.get((ComponentName) message.obj);
                    if (h0Var2 != null) {
                        if (h0Var2.f9249b) {
                            this.f9252a.unbindService(this);
                            h0Var2.f9249b = false;
                        }
                        h0Var2.f9250c = null;
                        return true;
                    }
                }
            } else {
                g0 g0Var = (g0) message.obj;
                ComponentName componentName = g0Var.f9239a;
                IBinder iBinder = g0Var.f9240b;
                h0 h0Var3 = (h0) this.f9254c.get(componentName);
                if (h0Var3 != null) {
                    int i10 = b.b.f2318a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f2319g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f2317a = iBinder;
                            cVar = obj;
                        }
                    }
                    h0Var3.f9250c = cVar;
                    h0Var3.f9251e = 0;
                    a(h0Var3);
                    return true;
                }
            }
        } else {
            f0 f0Var = (f0) message.obj;
            String string = Settings.Secure.getString(this.f9252a.getContentResolver(), "enabled_notification_listeners");
            synchronized (j0.f9255c) {
                if (string != null) {
                    try {
                        if (!string.equals(j0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            j0.f9256e = hashSet2;
                            j0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = j0.f9256e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f9252a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f9254c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f9254c.put(componentName3, new h0(componentName3));
                    }
                }
                Iterator it2 = this.f9254c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        h0 h0Var4 = (h0) entry.getValue();
                        if (h0Var4.f9249b) {
                            this.f9252a.unbindService(this);
                            h0Var4.f9249b = false;
                        }
                        h0Var4.f9250c = null;
                        it2.remove();
                    }
                }
            }
            for (h0 h0Var5 : this.f9254c.values()) {
                h0Var5.d.add(f0Var);
                a(h0Var5);
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f9253b.obtainMessage(1, new g0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f9253b.obtainMessage(2, componentName).sendToTarget();
    }
}
