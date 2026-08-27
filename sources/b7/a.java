package b7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.t;
import com.google.android.gms.internal.play_billing.d;
import kotlin.jvm.internal.j;
import n2.w;
import r6.e;
import r6.m;
import r6.r;
import s6.f;

public abstract class a extends Binder implements IInterface {

    public final int f2035a;

    public a(int i10) {
        this.f2035a = i10;
    }

    public static void E0(Parcel parcel) {
        int i10 = b.f2036a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(iDataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public abstract boolean F0(int i10, Parcel parcel, Parcel parcel2);

    public abstract boolean G0(int i10, Parcel parcel, Parcel parcel2);

    public boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean I0(Parcel parcel, int i10);

    @Override
    public IBinder asBinder() {
        int i10 = this.f2035a;
        return this;
    }

    @Override
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2;
        switch (this.f2035a) {
            case 0:
                if (i10 > 16777215) {
                    zOnTransact = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    f fVar = (f) this;
                    switch (i10) {
                        case 1:
                            Status status = (Status) b.a(parcel, Status.CREATOR);
                            m mVar = (m) b.a(parcel, m.CREATOR);
                            E0(parcel);
                            fVar.h(status, mVar);
                            break;
                        case 2:
                            Status status2 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) b.a(parcel, Status.CREATOR);
                            e eVar = (e) b.a(parcel, e.CREATOR);
                            E0(parcel);
                            fVar.U(status7, eVar);
                            break;
                        case 8:
                            Status status8 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) b.a(parcel, Status.CREATOR);
                            r6.b bVar = (r6.b) b.a(parcel, r6.b.CREATOR);
                            E0(parcel);
                            fVar.q(status9, bVar);
                            break;
                        case 10:
                            Status status10 = (Status) b.a(parcel, Status.CREATOR);
                            r rVar = (r) b.a(parcel, r.CREATOR);
                            E0(parcel);
                            fVar.u0(status10, rVar);
                            break;
                        case 11:
                            Status status11 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) b.a(parcel, Status.CREATOR);
                            E0(parcel);
                            j.e(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return I0(parcel, i10);
            case 2:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 3:
                if (i10 > 16777215) {
                    zOnTransact2 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact2 = false;
                }
                if (!zOnTransact2) {
                    a2 a2Var = (a2) this;
                    switch (i10) {
                        case 1:
                            a2Var.f3776b.a((Status) t.a(parcel, Status.CREATOR));
                            break;
                        case 2:
                            throw new UnsupportedOperationException();
                        case 3:
                            parcel.readLong();
                            throw new UnsupportedOperationException();
                        case 4:
                            throw new UnsupportedOperationException();
                        case 5:
                            parcel.readLong();
                            throw new UnsupportedOperationException();
                        case 6:
                            throw new UnsupportedOperationException();
                        case 7:
                            throw new UnsupportedOperationException();
                        case 8:
                            throw new UnsupportedOperationException();
                        case 9:
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 4:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                w wVar = (w) this;
                if (i10 != 1) {
                    return false;
                }
                int i12 = parcel.readInt();
                int i13 = d.f3991a;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(i0.a.k(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                wVar.f18188b.a(Integer.valueOf(i12));
                return true;
            case 5:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 6:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 7:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                m7.e eVar2 = (m7.e) this;
                if (i10 == 1) {
                    eVar2.f17878b.a(new m7.d((Status) m7.b.a(parcel, Status.CREATOR), (x7.e) m7.b.a(parcel, x7.e.CREATOR)));
                    return true;
                }
                if (i10 == 2) {
                    parcel.readString();
                    throw new UnsupportedOperationException();
                }
                if (i10 == 3) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 4) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i10 == 6) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 8) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 10) {
                    parcel.readInt();
                    throw new UnsupportedOperationException();
                }
                if (i10 == 11) {
                    throw new UnsupportedOperationException();
                }
                if (i10 == 15) {
                    throw new UnsupportedOperationException();
                }
                if (i10 != 16) {
                    return false;
                }
                parcel.readString();
                parcel.readInt();
                throw new UnsupportedOperationException();
            case 8:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
            case 9:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return G0(i10, parcel, parcel2);
            case 10:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return F0(i10, parcel, parcel2);
            case 11:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return H0(i10, parcel, parcel2);
        }
    }

    public a(String str, int i10) {
        this.f2035a = i10;
        switch (i10) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 8:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
            case 11:
                attachInterface(this, str);
                break;
        }
    }
}
