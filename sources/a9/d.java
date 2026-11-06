package a9;

import a8.q;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import b9.b1;
import b9.c0;
import b9.j;
import b9.k0;
import b9.l0;
import b9.v0;
import b9.z0;
import com.google.android.gms.common.data.DataHolder;
import m9.u;
import org.telegram.messenger.WearAuthListenerService;
public final class d extends q {
    public volatile int f756b;
    public final WearAuthListenerService f757c;

    public d(WearAuthListenerService wearAuthListenerService) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 6);
        this.f757c = wearAuthListenerService;
        this.f756b = -1;
    }

    @Override
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        a8.a aVar;
        if (i7 != 13) {
            if (i7 != 14) {
                switch (i7) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) i8.a.a(parcel, DataHolder.CREATOR);
                        i8.a.b(parcel);
                        Runnable uVar = new u(this, dataHolder, false, 2);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i10 = dataHolder.f6734n;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(valueOf);
                            sb2.append(", rows=");
                            sb2.append(i10);
                            return !M0(uVar, "onDataItemChanged", sb2.toString()) ? true : true;
                        } finally {
                            dataHolder.close();
                        }
                    case 2:
                        Object obj = (k0) i8.a.a(parcel, k0.CREATOR);
                        i8.a.b(parcel);
                        M0(new u(this, obj, false, 3), "onMessageReceived", obj);
                        return true;
                    case 3:
                        l0 l0Var = (l0) i8.a.a(parcel, l0.CREATOR);
                        i8.a.b(parcel);
                        M0(new i(this, l0Var, 0), "onPeerConnected", l0Var);
                        return true;
                    case 4:
                        l0 l0Var2 = (l0) i8.a.a(parcel, l0.CREATOR);
                        i8.a.b(parcel);
                        M0(new i(this, l0Var2, 1), "onPeerDisconnected", l0Var2);
                        return true;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(l0.CREATOR);
                        i8.a.b(parcel);
                        M0(new u(this, createTypedArrayList, false, 4), "onConnectedNodes", createTypedArrayList);
                        return true;
                    case 6:
                        b1 b1Var = (b1) i8.a.a(parcel, b1.CREATOR);
                        i8.a.b(parcel);
                        M0(new i(this, b1Var, 3), "onNotificationReceived", b1Var);
                        return true;
                    case 7:
                        Object obj2 = (b9.e) i8.a.a(parcel, b9.e.CREATOR);
                        i8.a.b(parcel);
                        M0(new u(this, obj2, false, 5), "onChannelEvent", obj2);
                        return true;
                    case 8:
                        b9.b bVar = (b9.b) i8.a.a(parcel, b9.b.CREATOR);
                        i8.a.b(parcel);
                        M0(new i(this, bVar, 2), "onConnectedCapabilityChanged", bVar);
                        return true;
                    case 9:
                        v0 v0Var = (v0) i8.a.a(parcel, v0.CREATOR);
                        i8.a.b(parcel);
                        M0(new i(this, v0Var, 4), "onEntityUpdate", v0Var);
                        return true;
                    default:
                        return false;
                }
            }
            j jVar = (j) i8.a.a(parcel, j.CREATOR);
            i8.a.b(parcel);
            return true;
        }
        Object obj3 = (k0) i8.a.a(parcel, k0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof c0) {
                aVar = (c0) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 6);
            }
        }
        i8.a.b(parcel);
        M0(new h(this, obj3, aVar, 0), "onRequestReceived", obj3);
        return true;
    }

    public final boolean M0(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f757c.f21345a.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f756b) {
            if (z0.a(this.f757c).b() && x6.b.g(callingUid, this.f757c, "com.google.android.wearable.app.cn")) {
                this.f756b = callingUid;
            } else if (x6.b.e(this.f757c, callingUid)) {
                this.f756b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        synchronized (this.f757c.f21349f) {
            try {
                WearAuthListenerService wearAuthListenerService = this.f757c;
                if (wearAuthListenerService.h) {
                    return false;
                }
                wearAuthListenerService.f21346b.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
