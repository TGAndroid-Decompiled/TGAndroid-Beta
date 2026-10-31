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
public final class k extends Binder implements d {
    public static final int f13508b = 0;
    public final WeakReference f13509a;

    public k(l lVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f13509a = new WeakReference(lVar);
    }

    public final void H0(b bVar) {
        l lVar = (l) this.f13509a.get();
        if (lVar != null && bVar != null) {
            lVar.f13513f.register(bVar, new r("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (lVar.d) {
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
        w wVar = null;
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
                                l lVar = (l) this.f13509a.get();
                                if (lVar != null && (bundle = lVar.e) != null) {
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
                            l lVar2 = (l) this.f13509a.get();
                            if (lVar2 != null) {
                                i12 = lVar2.f13517k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i12);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        l lVar3 = (l) this.f13509a.get();
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    l lVar4 = (l) this.f13509a.get();
                    if (lVar4 != null) {
                        i12 = lVar4.f13516j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                l lVar5 = (l) this.f13509a.get();
                if (lVar5 != null) {
                    wVar = lVar5.f13514g;
                    i iVar = lVar5.f13515i;
                    if (wVar != null) {
                        float f7 = wVar.d;
                        long j11 = wVar.f13542n;
                        int i13 = wVar.f13538a;
                        long j12 = wVar.f13539b;
                        long j13 = -1;
                        if (j12 != -1 && ((i13 == 3 || i13 == 4 || i13 == 5) && j11 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j14 = (f7 * ((float) (elapsedRealtime - j11))) + j12;
                            if (iVar != null) {
                                Bundle bundle3 = iVar.f13506a;
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
                            long j15 = wVar.f13540c;
                            long j16 = wVar.e;
                            int i14 = wVar.f13541f;
                            CharSequence charSequence = wVar.h;
                            AbstractCollection abstractCollection = wVar.f13543r;
                            if (abstractCollection != null) {
                                arrayList.addAll(abstractCollection);
                            }
                            wVar = new w(wVar.f13538a, j10, j15, wVar.d, j16, i14, charSequence, elapsedRealtime, arrayList, wVar.f13544s, wVar.f13545w);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (wVar != null) {
                    parcel2.writeInt(1);
                    wVar.writeToParcel(parcel2, 1);
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
                    obj.f13491a = readStrongBinder;
                    bVar2 = obj;
                }
            }
            l lVar6 = (l) this.f13509a.get();
            if (lVar6 != null && bVar2 != null) {
                lVar6.f13513f.unregister(bVar2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (lVar6.d) {
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
                obj2.f13491a = readStrongBinder2;
                bVar = obj2;
            }
        }
        H0(bVar);
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
