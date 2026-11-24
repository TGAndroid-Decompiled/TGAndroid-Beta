package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
public final class av6 extends Binder implements li5 {
    public static final int b = 0;
    public final WeakReference a;

    public av6(bv6 bv6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(bv6Var);
    }

    public final void a(hi5 hi5Var) {
        bv6 bv6Var = (bv6) this.a.get();
        if (bv6Var != null && hi5Var != null) {
            bv6Var.f.register(hi5Var, new mw6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (bv6Var.d) {
            }
        }
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        Bundle bundle;
        hi5 hi5Var = null;
        r5 = null;
        Bundle bundle2 = null;
        dc8 dc8Var = null;
        hi5 hi5Var2 = null;
        if (i != 3) {
            if (i != 4) {
                if (i != 28) {
                    int i3 = -1;
                    if (i != 37) {
                        if (i != 45) {
                            if (i != 47) {
                                if (i != 50) {
                                    if (i != 1598968902) {
                                        return super.onTransact(i, parcel, parcel2, i2);
                                    }
                                    parcel2.getClass();
                                    parcel2.writeString("android.support.v4.media.session.IMediaSession");
                                    return true;
                                }
                                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                                bv6 bv6Var = (bv6) this.a.get();
                                if (bv6Var != null && (bundle = bv6Var.e) != null) {
                                    bundle2 = new Bundle(bundle);
                                }
                                parcel2.getClass();
                                parcel2.writeNoException();
                                if (bundle2 != null) {
                                    parcel2.writeInt(1);
                                    bundle2.writeToParcel(parcel2, 1);
                                    return true;
                                }
                                parcel2.writeInt(0);
                                return true;
                            }
                            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                            bv6 bv6Var2 = (bv6) this.a.get();
                            if (bv6Var2 != null) {
                                i3 = bv6Var2.k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i3);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        bv6 bv6Var3 = (bv6) this.a.get();
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    bv6 bv6Var4 = (bv6) this.a.get();
                    if (bv6Var4 != null) {
                        i3 = bv6Var4.j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                bv6 bv6Var5 = (bv6) this.a.get();
                if (bv6Var5 != null) {
                    dc8Var = bv6Var5.g;
                    kr6 kr6Var = bv6Var5.i;
                    if (dc8Var != null) {
                        float f = dc8Var.d;
                        long j2 = dc8Var.n;
                        int i4 = dc8Var.a;
                        long j3 = dc8Var.b;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = (f * ((float) (elapsedRealtime - j2))) + j3;
                            if (kr6Var != null) {
                                Bundle bundle3 = kr6Var.a;
                                if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                    j4 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            if (j4 >= 0 && j5 > j4) {
                                j = j4;
                            } else if (j5 < 0) {
                                j = 0;
                            } else {
                                j = j5;
                            }
                            ArrayList arrayList = new ArrayList();
                            long j6 = dc8Var.c;
                            long j7 = dc8Var.e;
                            int i5 = dc8Var.f;
                            CharSequence charSequence = dc8Var.h;
                            List list = dc8Var.r;
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            dc8Var = new dc8(dc8Var.a, j, j6, dc8Var.d, j7, i5, charSequence, elapsedRealtime, arrayList, dc8Var.s, dc8Var.w);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (dc8Var != null) {
                    parcel2.writeInt(1);
                    dc8Var.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof hi5)) {
                    hi5Var2 = (hi5) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.a = readStrongBinder;
                    hi5Var2 = obj;
                }
            }
            bv6 bv6Var6 = (bv6) this.a.get();
            if (bv6Var6 != null && hi5Var2 != null) {
                bv6Var6.f.unregister(hi5Var2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (bv6Var6.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof hi5)) {
                hi5Var = (hi5) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.a = readStrongBinder2;
                hi5Var = obj2;
            }
        }
        a(hi5Var);
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
