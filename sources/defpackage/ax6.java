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
public final class ax6 extends Binder implements kk5 {
    public static final int b = 0;
    public final WeakReference a;

    public ax6(bx6 bx6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(bx6Var);
    }

    public final void a(gk5 gk5Var) {
        bx6 bx6Var = (bx6) this.a.get();
        if (bx6Var != null && gk5Var != null) {
            bx6Var.f.register(gk5Var, new my6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (bx6Var.d) {
            }
        }
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        Bundle bundle;
        gk5 gk5Var = null;
        r5 = null;
        Bundle bundle2 = null;
        ge8 ge8Var = null;
        gk5 gk5Var2 = null;
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
                                bx6 bx6Var = (bx6) this.a.get();
                                if (bx6Var != null && (bundle = bx6Var.e) != null) {
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
                            bx6 bx6Var2 = (bx6) this.a.get();
                            if (bx6Var2 != null) {
                                i3 = bx6Var2.k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i3);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        bx6 bx6Var3 = (bx6) this.a.get();
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    bx6 bx6Var4 = (bx6) this.a.get();
                    if (bx6Var4 != null) {
                        i3 = bx6Var4.j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                bx6 bx6Var5 = (bx6) this.a.get();
                if (bx6Var5 != null) {
                    ge8Var = bx6Var5.g;
                    lt6 lt6Var = bx6Var5.i;
                    if (ge8Var != null) {
                        float f = ge8Var.d;
                        long j2 = ge8Var.n;
                        int i4 = ge8Var.a;
                        long j3 = ge8Var.b;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = (f * ((float) (elapsedRealtime - j2))) + j3;
                            if (lt6Var != null) {
                                Bundle bundle3 = lt6Var.a;
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
                            long j6 = ge8Var.c;
                            long j7 = ge8Var.e;
                            int i5 = ge8Var.f;
                            CharSequence charSequence = ge8Var.h;
                            List list = ge8Var.r;
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            ge8Var = new ge8(ge8Var.a, j, j6, ge8Var.d, j7, i5, charSequence, elapsedRealtime, arrayList, ge8Var.s, ge8Var.w);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (ge8Var != null) {
                    parcel2.writeInt(1);
                    ge8Var.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof gk5)) {
                    gk5Var2 = (gk5) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.a = readStrongBinder;
                    gk5Var2 = obj;
                }
            }
            bx6 bx6Var6 = (bx6) this.a.get();
            if (bx6Var6 != null && gk5Var2 != null) {
                bx6Var6.f.unregister(gk5Var2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (bx6Var6.d) {
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
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof gk5)) {
                gk5Var = (gk5) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.a = readStrongBinder2;
                gk5Var = obj2;
            }
        }
        a(gk5Var);
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
