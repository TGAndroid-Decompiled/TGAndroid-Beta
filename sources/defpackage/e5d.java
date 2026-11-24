package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import org.telegram.messenger.WearAuthListenerService;
public final class e5d extends dzc {
    public volatile int b;
    public final WearAuthListenerService c;

    public e5d(WearAuthListenerService wearAuthListenerService) {
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
            if (tle.a(this.c).b() && axe.b(callingUid, this.c, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else if (axe.a(this.c, callingUid)) {
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
        ezc ezcVar;
        if (i != 13) {
            if (i != 14) {
                switch (i) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) bhd.a(parcel, DataHolder.CREATOR);
                        bhd.b(parcel);
                        Runnable bodVar = new bod(this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i2 = dataHolder.n;
                            StringBuilder sb = new StringBuilder();
                            sb.append(valueOf);
                            sb.append(", rows=");
                            sb.append(i2);
                            return !T(bodVar, "onDataItemChanged", sb.toString()) ? true : true;
                        } finally {
                            dataHolder.close();
                        }
                    case 2:
                        Object obj = (h5e) bhd.a(parcel, h5e.CREATOR);
                        bhd.b(parcel);
                        T(new tq4(this, obj, false, (byte) 23), "onMessageReceived", obj);
                        return true;
                    case 3:
                        Object obj2 = (a9e) bhd.a(parcel, a9e.CREATOR);
                        bhd.b(parcel);
                        T(new sv(this, obj2, (byte) 17), "onPeerConnected", obj2);
                        return true;
                    case 4:
                        Object obj3 = (a9e) bhd.a(parcel, a9e.CREATOR);
                        bhd.b(parcel);
                        T(new sv(this, obj3, (byte) 18), "onPeerDisconnected", obj3);
                        return true;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(a9e.CREATOR);
                        bhd.b(parcel);
                        T(new sv(this, createTypedArrayList, (byte) 19), "onConnectedNodes", createTypedArrayList);
                        return true;
                    case 6:
                        Object obj4 = (mwe) bhd.a(parcel, mwe.CREATOR);
                        bhd.b(parcel);
                        T(new sv(this, obj4, (byte) 21), "onNotificationReceived", obj4);
                        return true;
                    case 7:
                        Object obj5 = (tcd) bhd.a(parcel, tcd.CREATOR);
                        bhd.b(parcel);
                        T(new tq4(this, obj5, false, (byte) 25), "onChannelEvent", obj5);
                        return true;
                    case 8:
                        Object obj6 = (p8d) bhd.a(parcel, p8d.CREATOR);
                        bhd.b(parcel);
                        T(new sv(this, obj6, (byte) 20), "onConnectedCapabilityChanged", obj6);
                        return true;
                    case 9:
                        Object obj7 = (the) bhd.a(parcel, the.CREATOR);
                        bhd.b(parcel);
                        T(new sv(this, obj7, (byte) 22), "onEntityUpdate", obj7);
                        return true;
                    default:
                        return false;
                }
            }
            rid ridVar = (rid) bhd.a(parcel, rid.CREATOR);
            bhd.b(parcel);
            return true;
        }
        h5e h5eVar = (h5e) bhd.a(parcel, h5e.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            ezcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof sxd) {
                ezcVar = (sxd) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", (byte) 9);
            }
        }
        bhd.b(parcel);
        T(new rld(this, h5eVar, ezcVar, (byte) 20), "onRequestReceived", h5eVar);
        return true;
    }
}
