package n4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class m extends Binder implements d {
    public static final int f17169b = 0;
    public final WeakReference f17170a;

    public m(n nVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f17170a = new WeakReference(nVar);
    }

    public final void F0(b bVar) {
        n nVar = (n) this.f17170a.get();
        if (nVar != null && bVar != null) {
            nVar.f17174f.register(bVar, new t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (nVar.d) {
            }
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        long j10;
        Bundle bundle;
        b bVar = null;
        r5 = null;
        Bundle bundle2 = null;
        y yVar = null;
        b bVar2 = null;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 28) {
                    int i12 = -1;
                    if (i10 != 37) {
                        if (i10 != 45) {
                            if (i10 != 47) {
                                if (i10 != 50) {
                                    if (i10 != 1598968902) {
                                        return super.onTransact(i10, parcel, parcel2, i11);
                                    }
                                    parcel2.getClass();
                                    parcel2.writeString("android.support.v4.media.session.IMediaSession");
                                    return true;
                                }
                                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                                n nVar = (n) this.f17170a.get();
                                if (nVar != null && (bundle = nVar.e) != null) {
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
                            n nVar2 = (n) this.f17170a.get();
                            if (nVar2 != null) {
                                i12 = nVar2.f17178k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i12);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        n nVar3 = (n) this.f17170a.get();
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n nVar4 = (n) this.f17170a.get();
                    if (nVar4 != null) {
                        i12 = nVar4.f17177j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                n nVar5 = (n) this.f17170a.get();
                if (nVar5 != null) {
                    yVar = nVar5.f17175g;
                    i iVar = nVar5.f17176i;
                    if (yVar != null) {
                        float f7 = yVar.d;
                        long j11 = yVar.f17204n;
                        int i13 = yVar.f17200a;
                        long j12 = yVar.f17201b;
                        long j13 = -1;
                        if (j12 != -1 && ((i13 == 3 || i13 == 4 || i13 == 5) && j11 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j14 = (f7 * ((float) (elapsedRealtime - j11))) + j12;
                            if (iVar != null) {
                                Bundle bundle3 = iVar.f17163a;
                                if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                    j13 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            if (j13 >= 0 && j14 > j13) {
                                j10 = j13;
                            } else if (j14 < 0) {
                                j10 = 0;
                            } else {
                                j10 = j14;
                            }
                            ArrayList arrayList = new ArrayList();
                            long j15 = yVar.f17202c;
                            long j16 = yVar.e;
                            int i14 = yVar.f17203f;
                            CharSequence charSequence = yVar.h;
                            AbstractCollection abstractCollection = yVar.f17205r;
                            if (abstractCollection != null) {
                                arrayList.addAll(abstractCollection);
                            }
                            yVar = new y(yVar.f17200a, j10, j15, yVar.d, j16, i14, charSequence, elapsedRealtime, arrayList, yVar.f17206s, yVar.v);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (yVar != null) {
                    parcel2.writeInt(1);
                    yVar.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar2 = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f17148a = readStrongBinder;
                    bVar2 = obj;
                }
            }
            n nVar6 = (n) this.f17170a.get();
            if (nVar6 != null && bVar2 != null) {
                nVar6.f17174f.unregister(bVar2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (nVar6.d) {
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
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof b)) {
                bVar = (b) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f17148a = readStrongBinder2;
                bVar = obj2;
            }
        }
        F0(bVar);
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
