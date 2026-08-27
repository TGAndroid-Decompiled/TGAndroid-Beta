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

    public final Context f5090a;

    public final Handler f5091b;

    public final HashMap f5092c = new HashMap();
    public HashSet d = new HashSet();

    public m0(Context context) {
        this.f5090a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f5091b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(l0 l0Var) {
        boolean z10;
        ArrayDeque arrayDeque = l0Var.d;
        ComponentName componentName = l0Var.f5086a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (l0Var.f5087b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f5090a;
            boolean zBindService = context.bindService(component, this, 33);
            l0Var.f5087b = zBindService;
            if (zBindService) {
                l0Var.f5089e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = l0Var.f5087b;
        }
        if (!z10 || l0Var.f5088c == null) {
            b(l0Var);
            return;
        }
        while (true) {
            j0 j0Var = (j0) arrayDeque.peek();
            if (j0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + j0Var);
                }
                j0Var.a(l0Var.f5088c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e9) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e9);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(l0Var);
    }

    public final void b(l0 l0Var) {
        ComponentName componentName = l0Var.f5086a;
        ArrayDeque arrayDeque = l0Var.d;
        Handler handler = this.f5091b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = l0Var.f5089e;
        int i11 = i10 + 1;
        l0Var.f5089e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + l0Var.f5089e + " retries");
        arrayDeque.clear();
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        b.c cVar = null;
        if (i10 == 0) {
            j0 j0Var = (j0) message.obj;
            String string = Settings.Secure.getString(this.f5090a.getContentResolver(), "enabled_notification_listeners");
            synchronized (n0.f5096c) {
                if (string != null) {
                    try {
                        if (!string.equals(n0.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            n0.f5097e = hashSet2;
                            n0.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = n0.f5097e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f5090a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f5092c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f5092c.put(componentName2, new l0(componentName2));
                    }
                }
                Iterator it = this.f5092c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        l0 l0Var = (l0) entry.getValue();
                        if (l0Var.f5087b) {
                            this.f5090a.unbindService(this);
                            l0Var.f5087b = false;
                        }
                        l0Var.f5088c = null;
                        it.remove();
                    }
                }
            }
            for (l0 l0Var2 : this.f5092c.values()) {
                l0Var2.d.add(j0Var);
                a(l0Var2);
            }
        } else if (i10 == 1) {
            k0 k0Var = (k0) message.obj;
            ComponentName componentName3 = k0Var.f5084a;
            IBinder iBinder = k0Var.f5085b;
            l0 l0Var3 = (l0) this.f5092c.get(componentName3);
            if (l0Var3 != null) {
                int i11 = b.b.f1879a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.c.f1880g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.c)) {
                        b.a aVar = new b.a();
                        aVar.f1878a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (b.c) iInterfaceQueryLocalInterface;
                    }
                }
                l0Var3.f5088c = cVar;
                l0Var3.f5089e = 0;
                a(l0Var3);
                return true;
            }
        } else if (i10 == 2) {
            l0 l0Var4 = (l0) this.f5092c.get((ComponentName) message.obj);
            if (l0Var4 != null) {
                if (l0Var4.f5087b) {
                    this.f5090a.unbindService(this);
                    l0Var4.f5087b = false;
                }
                l0Var4.f5088c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            l0 l0Var5 = (l0) this.f5092c.get((ComponentName) message.obj);
            if (l0Var5 != null) {
                a(l0Var5);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f5091b.obtainMessage(1, new k0(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f5091b.obtainMessage(2, componentName).sendToTarget();
    }
}
