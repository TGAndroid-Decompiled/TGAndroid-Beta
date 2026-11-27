package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import org.telegram.messenger.WearAuthListenerService;
public final class x9d extends u3d {
    public volatile int b;
    public final WearAuthListenerService c;

    public x9d(WearAuthListenerService wearAuthListenerService) {
        super("com.google.android.gms.wearable.internal.IWearableListener", (byte) 12);
        this.c = wearAuthListenerService;
        this.b = -1;
    }

    public final boolean T(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.c.a.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (kqe.a(this.c).b() && u1f.b(callingUid, this.c, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else if (u1f.a(this.c, callingUid)) {
                this.b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        synchronized (this.c.f) {
            WearAuthListenerService wearAuthListenerService = this.c;
            if (wearAuthListenerService.h) {
                return false;
            }
            wearAuthListenerService.b.post(runnable);
            return true;
        }
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        v3d v3dVar;
        if (i != 13) {
            if (i != 14) {
                switch (i) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) sld.a(parcel, DataHolder.CREATOR);
                        sld.b(parcel);
                        Runnable dheVar = new dhe(this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i2 = dataHolder.n;
                            StringBuilder sb = new StringBuilder();
                            sb.append(valueOf);
                            sb.append(", rows=");
                            sb.append(i2);
                            return !T(dheVar, "onDataItemChanged", sb.toString()) ? true : true;
                        } finally {
                            dataHolder.close();
                        }
                    case 2:
                        Object obj = (x9e) sld.a(parcel, x9e.CREATOR);
                        sld.b(parcel);
                        T(new xs4(this, obj, false, (byte) 23), "onMessageReceived", obj);
                        return true;
                    case 3:
                        Object obj2 = (qde) sld.a(parcel, qde.CREATOR);
                        sld.b(parcel);
                        T(new tv(this, obj2, (byte) 17), "onPeerConnected", obj2);
                        return true;
                    case 4:
                        Object obj3 = (qde) sld.a(parcel, qde.CREATOR);
                        sld.b(parcel);
                        T(new tv(this, obj3, (byte) 18), "onPeerDisconnected", obj3);
                        return true;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(qde.CREATOR);
                        sld.b(parcel);
                        T(new tv(this, createTypedArrayList, (byte) 19), "onConnectedNodes", createTypedArrayList);
                        return true;
                    case 6:
                        Object obj4 = (d1f) sld.a(parcel, d1f.CREATOR);
                        sld.b(parcel);
                        T(new tv(this, obj4, (byte) 21), "onNotificationReceived", obj4);
                        return true;
                    case 7:
                        Object obj5 = (mhd) sld.a(parcel, mhd.CREATOR);
                        sld.b(parcel);
                        T(new xs4(this, obj5, false, (byte) 25), "onChannelEvent", obj5);
                        return true;
                    case 8:
                        Object obj6 = (idd) sld.a(parcel, idd.CREATOR);
                        sld.b(parcel);
                        T(new tv(this, obj6, (byte) 20), "onConnectedCapabilityChanged", obj6);
                        return true;
                    case 9:
                        Object obj7 = (kme) sld.a(parcel, kme.CREATOR);
                        sld.b(parcel);
                        T(new tv(this, obj7, (byte) 22), "onEntityUpdate", obj7);
                        return true;
                    default:
                        return false;
                }
            }
            ind indVar = (ind) sld.a(parcel, ind.CREATOR);
            sld.b(parcel);
            return true;
        }
        x9e x9eVar = (x9e) sld.a(parcel, x9e.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            v3dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof i2e) {
                v3dVar = (i2e) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", (byte) 9);
            }
        }
        sld.b(parcel);
        T(new iqd(this, x9eVar, v3dVar, (byte) 20), "onRequestReceived", x9eVar);
        return true;
    }
}
