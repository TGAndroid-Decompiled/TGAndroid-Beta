package l8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.common.data.DataHolder;
import m8.a1;
import m8.c1;
import m8.e0;
import m8.l0;
import m8.m0;
import m8.w0;
public final class m extends a7.c {
    public volatile int f12128b;
    public final k f12129c;

    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 9);
        this.f12129c = kVar;
        this.f12128b = -1;
    }

    public static final void K0(e0 e0Var, boolean z4, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.f136c);
            int i10 = t7.a.f48026a;
            obtain.writeInt(z4 ? 1 : 0);
            obtain.writeByteArray(bArr);
            e0Var.f135b.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e6) {
            Log.e("WearableLS", "Failed to send a response back", e6);
        }
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        e0 aVar;
        e0 e0Var;
        if (i10 != 13) {
            if (i10 != 14) {
                switch (i10) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) t7.a.a(parcel, DataHolder.CREATOR);
                        t7.a.b(parcel);
                        Runnable kVar = new androidx.biometric.k(17, this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i11 = dataHolder.f2870n;
                            if (!J0(kVar, "onDataItemChanged", valueOf + ", rows=" + i11)) {
                                break;
                            }
                        } finally {
                            dataHolder.close();
                        }
                        break;
                    case 2:
                        Object obj = (l0) t7.a.a(parcel, l0.CREATOR);
                        t7.a.b(parcel);
                        J0(new androidx.biometric.k(18, this, obj), "onMessageReceived", obj);
                        break;
                    case 3:
                        m0 m0Var = (m0) t7.a.a(parcel, m0.CREATOR);
                        t7.a.b(parcel);
                        J0(new q(this, m0Var, 0), "onPeerConnected", m0Var);
                        break;
                    case 4:
                        m0 m0Var2 = (m0) t7.a.a(parcel, m0.CREATOR);
                        t7.a.b(parcel);
                        J0(new q(this, m0Var2, 1), "onPeerDisconnected", m0Var2);
                        break;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(m0.CREATOR);
                        t7.a.b(parcel);
                        J0(new androidx.biometric.k(19, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                        break;
                    case 6:
                        Object obj2 = (c1) t7.a.a(parcel, c1.CREATOR);
                        t7.a.b(parcel);
                        J0(new androidx.biometric.k(21, this, obj2), "onNotificationReceived", obj2);
                        break;
                    case 7:
                        Object obj3 = (m8.e) t7.a.a(parcel, m8.e.CREATOR);
                        t7.a.b(parcel);
                        J0(new androidx.biometric.k(23, this, obj3), "onChannelEvent", obj3);
                        break;
                    case 8:
                        Object obj4 = (m8.b) t7.a.a(parcel, m8.b.CREATOR);
                        t7.a.b(parcel);
                        J0(new androidx.biometric.k(20, this, obj4), "onConnectedCapabilityChanged", obj4);
                        break;
                    case 9:
                        Object obj5 = (w0) t7.a.a(parcel, w0.CREATOR);
                        t7.a.b(parcel);
                        J0(new androidx.biometric.k(22, this, obj5), "onEntityUpdate", obj5);
                        break;
                    default:
                        return false;
                }
            } else {
                m8.j jVar = (m8.j) t7.a.a(parcel, m8.j.CREATOR);
                t7.a.b(parcel);
            }
            return true;
        }
        Object obj6 = (l0) t7.a.a(parcel, l0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            e0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof e0) {
                e0Var = (e0) queryLocalInterface;
            } else {
                aVar = new a7.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 9);
                t7.a.b(parcel);
                J0(new s1(this, obj6, aVar, false, 5), "onRequestReceived", obj6);
                return true;
            }
        }
        aVar = e0Var;
        t7.a.b(parcel);
        J0(new s1(this, obj6, aVar, false, 5), "onRequestReceived", obj6);
        return true;
    }

    public final boolean J0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z4;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.f12129c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f12128b) {
            if (a1.a(this.f12129c).b() && i6.b.g(this.f12129c, "com.google.android.wearable.app.cn", callingUid)) {
                this.f12128b = callingUid;
            } else if (i6.b.e(this.f12129c, callingUid)) {
                this.f12128b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        obj2 = this.f12129c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.f12129c;
                z4 = kVar.zzg;
                if (!z4) {
                    pVar = kVar.zzb;
                    pVar.post(runnable);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
