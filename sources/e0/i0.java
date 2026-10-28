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
    public final Context f9551a;
    public final Handler f9552b;
    public final HashMap f9553c = new HashMap();
    public HashSet d = new HashSet();

    public i0(Context context) {
        this.f9551a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f9552b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(h0 h0Var) {
        boolean z10;
        ArrayDeque arrayDeque = h0Var.d;
        ComponentName componentName = h0Var.f9548a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (h0Var.f9549b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f9551a;
                boolean bindService = context.bindService(component, this, 33);
                h0Var.f9549b = bindService;
                if (bindService) {
                    h0Var.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = h0Var.f9549b;
            }
            if (z10 && h0Var.f9550c != null) {
                while (true) {
                    f0 f0Var = (f0) arrayDeque.peek();
                    if (f0Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + f0Var);
                        }
                        f0Var.a(h0Var.f9550c);
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
                    b(h0Var);
                    return;
                }
                return;
            }
            b(h0Var);
        }
    }

    public final void b(h0 h0Var) {
        ComponentName componentName = h0Var.f9548a;
        ArrayDeque arrayDeque = h0Var.d;
        Handler handler = this.f9552b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = h0Var.e;
        int i11 = i10 + 1;
        h0Var.e = i11;
        if (i11 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + h0Var.e + " retries");
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
                    h0 h0Var = (h0) this.f9553c.get((ComponentName) message.obj);
                    if (h0Var != null) {
                        a(h0Var);
                        return true;
                    }
                } else {
                    h0 h0Var2 = (h0) this.f9553c.get((ComponentName) message.obj);
                    if (h0Var2 != null) {
                        if (h0Var2.f9549b) {
                            this.f9551a.unbindService(this);
                            h0Var2.f9549b = false;
                        }
                        h0Var2.f9550c = null;
                        return true;
                    }
                }
            } else {
                g0 g0Var = (g0) message.obj;
                ComponentName componentName = g0Var.f9540a;
                IBinder iBinder = g0Var.f9541b;
                h0 h0Var3 = (h0) this.f9553c.get(componentName);
                if (h0Var3 != null) {
                    int i11 = b.b.f3098a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f3099g);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f3097a = iBinder;
                            cVar = obj;
                        }
                    }
                    h0Var3.f9550c = cVar;
                    h0Var3.e = 0;
                    a(h0Var3);
                    return true;
                }
            }
        } else {
            f0 f0Var = (f0) message.obj;
            String string = Settings.Secure.getString(this.f9551a.getContentResolver(), "enabled_notification_listeners");
            synchronized (j0.f9554c) {
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
                            j0.e = hashSet2;
                            j0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = j0.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f9551a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f9553c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f9553c.put(componentName3, new h0(componentName3));
                    }
                }
                Iterator it2 = this.f9553c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        h0 h0Var4 = (h0) entry.getValue();
                        if (h0Var4.f9549b) {
                            this.f9551a.unbindService(this);
                            h0Var4.f9549b = false;
                        }
                        h0Var4.f9550c = null;
                        it2.remove();
                    }
                }
            }
            for (h0 h0Var5 : this.f9553c.values()) {
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
        this.f9552b.obtainMessage(1, new g0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f9552b.obtainMessage(2, componentName).sendToTarget();
    }
}
