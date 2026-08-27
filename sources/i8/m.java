package i8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.common.data.DataHolder;
import j8.a1;
import j8.c1;
import j8.e0;
import j8.l0;
import j8.m0;
import j8.w0;

public final class m extends b7.a {

    public volatile int f10957b;

    public final k f10958c;

    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 8);
        this.f10958c = kVar;
        this.f10957b = -1;
    }

    public static final void K0(e0 e0Var, boolean z10, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(e0Var.f2457c);
            int i10 = q7.a.f46172a;
            parcelObtain.writeInt(z10 ? 1 : 0);
            parcelObtain.writeByteArray(bArr);
            try {
                e0Var.f2456b.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e9) {
            Log.e("WearableLS", "Failed to send a response back", e9);
        }
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        e0 e0Var;
        e0 e0Var2;
        if (i10 == 13) {
            Object obj = (l0) q7.a.a(parcel, l0.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (iInterfaceQueryLocalInterface instanceof e0) {
                    e0Var2 = (e0) iInterfaceQueryLocalInterface;
                } else {
                    e0Var = new e0(strongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 8);
                }
                q7.a.b(parcel);
                J0(new q1(this, obj, e0Var, false, 5), "onRequestReceived", obj);
                return true;
            }
            e0Var2 = null;
            e0Var = e0Var2;
            q7.a.b(parcel);
            J0(new q1(this, obj, e0Var, false, 5), "onRequestReceived", obj);
            return true;
        }
        if (i10 != 14) {
            switch (i10) {
                case 1:
                    DataHolder dataHolder = (DataHolder) q7.a.a(parcel, DataHolder.CREATOR);
                    q7.a.b(parcel);
                    try {
                        if (!J0(new a9.o(13, this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.f3405n)) {
                            dataHolder.close();
                        }
                    } catch (Throwable th) {
                        dataHolder.close();
                        throw th;
                    }
                    break;
                case 2:
                    Object obj2 = (l0) q7.a.a(parcel, l0.CREATOR);
                    q7.a.b(parcel);
                    J0(new a9.o(14, this, obj2), "onMessageReceived", obj2);
                    break;
                case 3:
                    m0 m0Var = (m0) q7.a.a(parcel, m0.CREATOR);
                    q7.a.b(parcel);
                    J0(new q(this, m0Var, 0), "onPeerConnected", m0Var);
                    break;
                case 4:
                    m0 m0Var2 = (m0) q7.a.a(parcel, m0.CREATOR);
                    q7.a.b(parcel);
                    J0(new q(this, m0Var2, 1), "onPeerDisconnected", m0Var2);
                    break;
                case 5:
                    Object objCreateTypedArrayList = parcel.createTypedArrayList(m0.CREATOR);
                    q7.a.b(parcel);
                    J0(new a9.o(15, this, objCreateTypedArrayList), "onConnectedNodes", objCreateTypedArrayList);
                    break;
                case 6:
                    Object obj3 = (c1) q7.a.a(parcel, c1.CREATOR);
                    q7.a.b(parcel);
                    J0(new a9.o(17, this, obj3), "onNotificationReceived", obj3);
                    break;
                case 7:
                    Object obj4 = (j8.e) q7.a.a(parcel, j8.e.CREATOR);
                    q7.a.b(parcel);
                    J0(new a9.o(19, this, obj4), "onChannelEvent", obj4);
                    break;
                case 8:
                    Object obj5 = (j8.b) q7.a.a(parcel, j8.b.CREATOR);
                    q7.a.b(parcel);
                    J0(new a9.o(16, this, obj5), "onConnectedCapabilityChanged", obj5);
                    break;
                case 9:
                    Object obj6 = (w0) q7.a.a(parcel, w0.CREATOR);
                    q7.a.b(parcel);
                    J0(new a9.o(18, this, obj6), "onEntityUpdate", obj6);
                    break;
                default:
                    return false;
            }
        } else {
            q7.a.b(parcel);
        }
        return true;
    }

    public final boolean J0(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f10958c.zza.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f10957b) {
            if ((!a1.a(this.f10958c).b() || !f6.b.g(this.f10958c, "com.google.android.wearable.app.cn", callingUid)) && !f6.b.e(this.f10958c, callingUid)) {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
            this.f10957b = callingUid;
        }
        synchronized (this.f10958c.zzf) {
            try {
                k kVar = this.f10958c;
                if (kVar.zzg) {
                    return false;
                }
                kVar.zzb.post(runnable);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
