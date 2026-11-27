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
public final class fx6 extends Binder implements nk5 {
    public static final int b = 0;
    public final WeakReference a;

    public fx6(gx6 gx6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(gx6Var);
    }

    public final void a(jk5 jk5Var) {
        gx6 gx6Var = (gx6) this.a.get();
        if (gx6Var != null && jk5Var != null) {
            gx6Var.f.register(jk5Var, new ry6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (gx6Var.d) {
            }
        }
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        Bundle bundle;
        jk5 jk5Var = null;
        r5 = null;
        Bundle bundle2 = null;
        sf8 sf8Var = null;
        jk5 jk5Var2 = null;
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
                                gx6 gx6Var = (gx6) this.a.get();
                                if (gx6Var != null && (bundle = gx6Var.e) != null) {
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
                            gx6 gx6Var2 = (gx6) this.a.get();
                            if (gx6Var2 != null) {
                                i3 = gx6Var2.k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i3);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        gx6 gx6Var3 = (gx6) this.a.get();
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    gx6 gx6Var4 = (gx6) this.a.get();
                    if (gx6Var4 != null) {
                        i3 = gx6Var4.j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                gx6 gx6Var5 = (gx6) this.a.get();
                if (gx6Var5 != null) {
                    sf8Var = gx6Var5.g;
                    pt6 pt6Var = gx6Var5.i;
                    if (sf8Var != null) {
                        float f = sf8Var.d;
                        long j2 = sf8Var.n;
                        int i4 = sf8Var.a;
                        long j3 = sf8Var.b;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = (f * ((float) (elapsedRealtime - j2))) + j3;
                            if (pt6Var != null) {
                                Bundle bundle3 = pt6Var.a;
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
                            long j6 = sf8Var.c;
                            long j7 = sf8Var.e;
                            int i5 = sf8Var.f;
                            CharSequence charSequence = sf8Var.h;
                            List list = sf8Var.r;
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            sf8Var = new sf8(sf8Var.a, j, j6, sf8Var.d, j7, i5, charSequence, elapsedRealtime, arrayList, sf8Var.s, sf8Var.w);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (sf8Var != null) {
                    parcel2.writeInt(1);
                    sf8Var.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof jk5)) {
                    jk5Var2 = (jk5) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.a = readStrongBinder;
                    jk5Var2 = obj;
                }
            }
            gx6 gx6Var6 = (gx6) this.a.get();
            if (gx6Var6 != null && jk5Var2 != null) {
                gx6Var6.f.unregister(jk5Var2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (gx6Var6.d) {
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
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof jk5)) {
                jk5Var = (jk5) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.a = readStrongBinder2;
                jk5Var = obj2;
            }
        }
        a(jk5Var);
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
