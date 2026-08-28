package h8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.common.data.DataHolder;
import i8.b1;
import i8.d1;
import i8.e0;
import i8.m0;
import i8.n0;
import i8.x0;
public final class m extends a7.a {
    public volatile int f10248b;
    public final k f10249c;

    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 8);
        this.f10249c = kVar;
        this.f10248b = -1;
    }

    public static final void K0(e0 e0Var, boolean z10, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.f1550c);
            int i9 = p7.a.f45502a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            e0Var.f1549b.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.e("WearableLS", "Failed to send a response back", e10);
        }
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        e0 aVar;
        e0 e0Var;
        if (i9 != 13) {
            if (i9 != 14) {
                switch (i9) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) p7.a.a(parcel, DataHolder.CREATOR);
                        p7.a.b(parcel);
                        Runnable jVar = new androidx.biometric.j(12, this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i10 = dataHolder.f2960n;
                            if (!J0(jVar, "onDataItemChanged", valueOf + ", rows=" + i10)) {
                                break;
                            }
                        } finally {
                            dataHolder.close();
                        }
                        break;
                    case 2:
                        Object obj = (m0) p7.a.a(parcel, m0.CREATOR);
                        p7.a.b(parcel);
                        J0(new androidx.biometric.j(13, this, obj), "onMessageReceived", obj);
                        break;
                    case 3:
                        n0 n0Var = (n0) p7.a.a(parcel, n0.CREATOR);
                        p7.a.b(parcel);
                        J0(new q(this, n0Var, 0), "onPeerConnected", n0Var);
                        break;
                    case 4:
                        n0 n0Var2 = (n0) p7.a.a(parcel, n0.CREATOR);
                        p7.a.b(parcel);
                        J0(new q(this, n0Var2, 1), "onPeerDisconnected", n0Var2);
                        break;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(n0.CREATOR);
                        p7.a.b(parcel);
                        J0(new androidx.biometric.j(14, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                        break;
                    case 6:
                        Object obj2 = (d1) p7.a.a(parcel, d1.CREATOR);
                        p7.a.b(parcel);
                        J0(new androidx.biometric.j(16, this, obj2), "onNotificationReceived", obj2);
                        break;
                    case 7:
                        Object obj3 = (i8.e) p7.a.a(parcel, i8.e.CREATOR);
                        p7.a.b(parcel);
                        J0(new androidx.biometric.j(18, this, obj3), "onChannelEvent", obj3);
                        break;
                    case 8:
                        Object obj4 = (i8.b) p7.a.a(parcel, i8.b.CREATOR);
                        p7.a.b(parcel);
                        J0(new androidx.biometric.j(15, this, obj4), "onConnectedCapabilityChanged", obj4);
                        break;
                    case 9:
                        Object obj5 = (x0) p7.a.a(parcel, x0.CREATOR);
                        p7.a.b(parcel);
                        J0(new androidx.biometric.j(17, this, obj5), "onEntityUpdate", obj5);
                        break;
                    default:
                        return false;
                }
            } else {
                i8.j jVar2 = (i8.j) p7.a.a(parcel, i8.j.CREATOR);
                p7.a.b(parcel);
            }
            return true;
        }
        Object obj6 = (m0) p7.a.a(parcel, m0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            e0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof e0) {
                e0Var = (e0) queryLocalInterface;
            } else {
                aVar = new b7.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 8);
                p7.a.b(parcel);
                J0(new q1(this, obj6, aVar, false, 5), "onRequestReceived", obj6);
                return true;
            }
        }
        aVar = e0Var;
        p7.a.b(parcel);
        J0(new q1(this, obj6, aVar, false, 5), "onRequestReceived", obj6);
        return true;
    }

    public final boolean J0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.f10249c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f10248b) {
            if (b1.a(this.f10249c).b() && e6.b.g(this.f10249c, "com.google.android.wearable.app.cn", callingUid)) {
                this.f10248b = callingUid;
            } else if (e6.b.e(this.f10249c, callingUid)) {
                this.f10248b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        obj2 = this.f10249c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.f10249c;
                z10 = kVar.zzg;
                if (!z10) {
                    pVar = kVar.zzb;
                    pVar.post(runnable);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
