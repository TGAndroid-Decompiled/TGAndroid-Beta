package j8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.common.data.DataHolder;
import k8.b1;
import k8.d1;
import k8.e0;
import k8.m0;
import k8.n0;
import k8.x0;
public final class m extends c7.a {
    public volatile int f11284b;
    public final k f11285c;

    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 8);
        this.f11285c = kVar;
        this.f11284b = -1;
    }

    public static final void K0(e0 e0Var, boolean z10, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.f3997c);
            int i10 = r7.a.f47083a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            e0Var.f3996b.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.e("WearableLS", "Failed to send a response back", e10);
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
                        DataHolder dataHolder = (DataHolder) r7.a.a(parcel, DataHolder.CREATOR);
                        r7.a.b(parcel);
                        Runnable oVar = new ab.o(this, dataHolder, false, 17);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i11 = dataHolder.f3974n;
                            if (!J0(oVar, "onDataItemChanged", valueOf + ", rows=" + i11)) {
                                break;
                            }
                        } finally {
                            dataHolder.close();
                        }
                        break;
                    case 2:
                        Object obj = (m0) r7.a.a(parcel, m0.CREATOR);
                        r7.a.b(parcel);
                        J0(new ab.o(this, obj, false, 18), "onMessageReceived", obj);
                        break;
                    case 3:
                        n0 n0Var = (n0) r7.a.a(parcel, n0.CREATOR);
                        r7.a.b(parcel);
                        J0(new q(this, n0Var, 0), "onPeerConnected", n0Var);
                        break;
                    case 4:
                        n0 n0Var2 = (n0) r7.a.a(parcel, n0.CREATOR);
                        r7.a.b(parcel);
                        J0(new q(this, n0Var2, 1), "onPeerDisconnected", n0Var2);
                        break;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(n0.CREATOR);
                        r7.a.b(parcel);
                        J0(new ab.o(this, createTypedArrayList, false, 19), "onConnectedNodes", createTypedArrayList);
                        break;
                    case 6:
                        Object obj2 = (d1) r7.a.a(parcel, d1.CREATOR);
                        r7.a.b(parcel);
                        J0(new ab.o(this, obj2, false, 21), "onNotificationReceived", obj2);
                        break;
                    case 7:
                        Object obj3 = (k8.e) r7.a.a(parcel, k8.e.CREATOR);
                        r7.a.b(parcel);
                        J0(new ab.o(this, obj3, false, 23), "onChannelEvent", obj3);
                        break;
                    case 8:
                        Object obj4 = (k8.b) r7.a.a(parcel, k8.b.CREATOR);
                        r7.a.b(parcel);
                        J0(new ab.o(this, obj4, false, 20), "onConnectedCapabilityChanged", obj4);
                        break;
                    case 9:
                        Object obj5 = (x0) r7.a.a(parcel, x0.CREATOR);
                        r7.a.b(parcel);
                        J0(new ab.o(this, obj5, false, 22), "onEntityUpdate", obj5);
                        break;
                    default:
                        return false;
                }
            } else {
                k8.j jVar = (k8.j) r7.a.a(parcel, k8.j.CREATOR);
                r7.a.b(parcel);
            }
            return true;
        }
        Object obj6 = (m0) r7.a.a(parcel, m0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            e0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof e0) {
                e0Var = (e0) queryLocalInterface;
            } else {
                aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 8);
                r7.a.b(parcel);
                J0(new q1(this, obj6, aVar, false, 5), "onRequestReceived", obj6);
                return true;
            }
        }
        aVar = e0Var;
        r7.a.b(parcel);
        J0(new q1(this, obj6, aVar, false, 5), "onRequestReceived", obj6);
        return true;
    }

    public final boolean J0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.f11285c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f11284b) {
            if (b1.a(this.f11285c).b() && g6.b.g(this.f11285c, "com.google.android.wearable.app.cn", callingUid)) {
                this.f11284b = callingUid;
            } else if (g6.b.e(this.f11285c, callingUid)) {
                this.f11284b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        obj2 = this.f11285c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.f11285c;
                z10 = kVar.zzg;
                if (!z10) {
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
