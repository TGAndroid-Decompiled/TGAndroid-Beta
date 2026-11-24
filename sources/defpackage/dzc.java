package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
public abstract class dzc extends Binder implements IInterface {
    public final byte a;

    public dzc(String str, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                attachInterface(this, str);
                return;
            case 3:
            case 5:
            case 7:
            case 10:
            case 11:
            default:
                attachInterface(this, str);
                return;
            case 4:
                attachInterface(this, str);
                return;
            case 6:
                attachInterface(this, str);
                return;
            case 8:
                attachInterface(this, str);
                return;
            case 9:
                attachInterface(this, str);
                return;
            case 12:
                attachInterface(this, str);
                return;
        }
    }

    public static void a(Parcel parcel) {
        int i = qgd.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract void P(Status status, nn5 nn5Var);

    @Override
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    public abstract boolean b(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean c(int i, Parcel parcel, Parcel parcel2);

    public boolean d(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean e(Parcel parcel, int i);

    public abstract void f(Status status, r44 r44Var);

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        ho createFromParcel;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.a) {
            case 0:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                x0d x0dVar = (x0d) this;
                if (i == 3) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = szc.a;
                    Status createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    f0d createFromParcel3 = parcel.readInt() == 0 ? null : f0d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? ho.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        createFromParcel2.getClass();
                        if (createFromParcel2.b() && createFromParcel3 != null) {
                            lh0 lh0Var = czc.l;
                            Log.i(lh0Var.b, lh0Var.b("Verification support info received.", new Object[0]));
                            lh0Var.a("result: " + createFromParcel3, new Object[0]);
                        } else {
                            lh0 lh0Var2 = czc.l;
                            Log.w(lh0Var2.b, lh0Var2.b("Failed to get verification support info. Status: " + createFromParcel2, new Object[0]));
                        }
                        dve.a(createFromParcel2, createFromParcel3, x0dVar.b);
                        return true;
                    }
                    throw new BadParcelableException(de9.k(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                if (i == 4) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = szc.a;
                    Status createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    xzc createFromParcel5 = parcel.readInt() == 0 ? null : xzc.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? ho.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 <= 0) {
                        createFromParcel4.getClass();
                        fvc.b();
                    } else {
                        throw new BadParcelableException(de9.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                } else if (i == 5) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i5 = szc.a;
                    Status createFromParcel6 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    j0d createFromParcel7 = parcel.readInt() == 0 ? null : j0d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? ho.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 <= 0) {
                        createFromParcel6.getClass();
                        fvc.b();
                    } else {
                        throw new BadParcelableException(de9.k(dataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                }
                return false;
            case 1:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return b(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return c(i, parcel, parcel2);
            case 3:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                vhd vhdVar = (vhd) this;
                if (i == 1) {
                    int readInt = parcel.readInt();
                    int i6 = b9d.a;
                    int dataAvail4 = parcel.dataAvail();
                    if (dataAvail4 <= 0) {
                        vhdVar.b.a(Integer.valueOf(readInt));
                        return true;
                    }
                    throw new BadParcelableException(de9.k(dataAvail4, "Parcel data not fully consumed, unread size: "));
                }
                return false;
            case 4:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return d(i, parcel, parcel2);
            case 5:
                if (i > 16777215) {
                    z2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
                uhe uheVar = (uhe) this;
                switch (i) {
                    case 1:
                        uheVar.b.a((Status) kgd.a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        Status status = (Status) kgd.a(parcel, Status.CREATOR);
                        fvc.b();
                        break;
                    case 3:
                        Status status2 = (Status) kgd.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        fvc.b();
                        break;
                    case 4:
                        Status status3 = (Status) kgd.a(parcel, Status.CREATOR);
                        fvc.b();
                        break;
                    case 5:
                        Status status4 = (Status) kgd.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        fvc.b();
                        break;
                    case 6:
                        Status status5 = (Status) kgd.a(parcel, Status.CREATOR);
                        mtd[] mtdVarArr = (mtd[]) parcel.createTypedArray(mtd.CREATOR);
                        fvc.b();
                        break;
                    case 7:
                        DataHolder dataHolder = (DataHolder) kgd.a(parcel, DataHolder.CREATOR);
                        fvc.b();
                        break;
                    case 8:
                        Status status6 = (Status) kgd.a(parcel, Status.CREATOR);
                        tgd tgdVar = (tgd) kgd.a(parcel, tgd.CREATOR);
                        fvc.b();
                        break;
                    case 9:
                        Status status7 = (Status) kgd.a(parcel, Status.CREATOR);
                        tgd tgdVar2 = (tgd) kgd.a(parcel, tgd.CREATOR);
                        fvc.b();
                        break;
                }
                return false;
            case 6:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return d(i, parcel, parcel2);
            case 7:
                if (i > 16777215) {
                    z3 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
                pp5 pp5Var = (pp5) this;
                TaskCompletionSource taskCompletionSource = pp5Var.c;
                byte b = pp5Var.b;
                switch (i) {
                    case 1:
                        Status status8 = (Status) qgd.a(parcel, Status.CREATOR);
                        z28 z28Var = (z28) qgd.a(parcel, z28.CREATOR);
                        a(parcel);
                        status8.getClass();
                        switch (b) {
                            case 1:
                                dve.a(status8, z28Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        u59 u59Var = (u59) qgd.a(parcel, u59.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 3:
                        ei2 ei2Var = (ei2) qgd.a(parcel, ei2.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 4:
                        a38 a38Var = (a38) qgd.a(parcel, a38.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 5:
                        j59 j59Var = (j59) qgd.a(parcel, j59.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 6:
                        j03 j03Var = (j03) qgd.a(parcel, j03.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 7:
                        Status status9 = (Status) qgd.a(parcel, Status.CREATOR);
                        e03 e03Var = (e03) qgd.a(parcel, e03.CREATOR);
                        a(parcel);
                        status9.getClass();
                        switch (b) {
                            case 0:
                                dve.a(status9, e03Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        i59 i59Var = (i59) qgd.a(parcel, i59.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 9:
                        xh2 xh2Var = (xh2) qgd.a(parcel, xh2.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        kha khaVar = (kha) qgd.a(parcel, kha.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        yh2 yh2Var = (yh2) qgd.a(parcel, yh2.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 12:
                        zm5 zm5Var = (zm5) qgd.a(parcel, zm5.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 13:
                        t64 t64Var = (t64) qgd.a(parcel, t64.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 14:
                        m23 m23Var = (m23) qgd.a(parcel, m23.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                    case 15:
                        uh2 uh2Var = (uh2) qgd.a(parcel, uh2.CREATOR);
                        a(parcel);
                        ((Status) qgd.a(parcel, Status.CREATOR)).getClass();
                        fvc.b();
                        break;
                }
                return false;
            case 8:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return e(parcel, i);
            case 9:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return d(i, parcel, parcel2);
            case 10:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 11:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                e9f e9fVar = (e9f) this;
                if (i == 1) {
                    e9fVar.b.a(new i7f((Status) zgd.a(parcel, Status.CREATOR), (s4d) zgd.a(parcel, s4d.CREATOR)));
                    return true;
                }
                if (i == 2) {
                    parcel.readString();
                    fvc.b();
                } else if (i == 3) {
                    Status status10 = (Status) zgd.a(parcel, Status.CREATOR);
                    no9 no9Var = (no9) zgd.a(parcel, no9.CREATOR);
                    fvc.b();
                } else if (i == 4) {
                    Status status11 = (Status) zgd.a(parcel, Status.CREATOR);
                    parcel.readInt();
                    fvc.b();
                } else if (i == 6) {
                    Status status12 = (Status) zgd.a(parcel, Status.CREATOR);
                    ryd rydVar = (ryd) zgd.a(parcel, ryd.CREATOR);
                    fvc.b();
                } else if (i == 8) {
                    Status status13 = (Status) zgd.a(parcel, Status.CREATOR);
                    fnd fndVar = (fnd) zgd.a(parcel, fnd.CREATOR);
                    fvc.b();
                } else if (i == 10) {
                    Status status14 = (Status) zgd.a(parcel, Status.CREATOR);
                    parcel.readInt();
                    fvc.b();
                } else if (i == 11) {
                    Status status15 = (Status) zgd.a(parcel, Status.CREATOR);
                    fvc.b();
                } else if (i == 15) {
                    Status status16 = (Status) zgd.a(parcel, Status.CREATOR);
                    ice iceVar = (ice) zgd.a(parcel, ice.CREATOR);
                    fvc.b();
                } else if (i == 16) {
                    Status status17 = (Status) zgd.a(parcel, Status.CREATOR);
                    parcel.readString();
                    parcel.readInt();
                    fvc.b();
                }
                return false;
            case 12:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return d(i, parcel, parcel2);
            case 13:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i == 1) {
                    Status status18 = (Status) ygd.a(parcel, Status.CREATOR);
                    nn5 nn5Var = (nn5) ygd.a(parcel, nn5.CREATOR);
                    int dataAvail5 = parcel.dataAvail();
                    if (dataAvail5 <= 0) {
                        P(status18, nn5Var);
                        return true;
                    }
                    throw new BadParcelableException(de9.k(dataAvail5, "Parcel data not fully consumed, unread size: "));
                } else if (i != 2) {
                    return false;
                } else {
                    Status status19 = (Status) ygd.a(parcel, Status.CREATOR);
                    r44 r44Var = (r44) ygd.a(parcel, r44.CREATOR);
                    int dataAvail6 = parcel.dataAvail();
                    if (dataAvail6 <= 0) {
                        f(status19, r44Var);
                        return true;
                    }
                    throw new BadParcelableException(de9.k(dataAvail6, "Parcel data not fully consumed, unread size: "));
                }
            case 14:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                switch (i) {
                    case 1:
                        parcel.readInt();
                        MaskedWallet maskedWallet = (MaskedWallet) ahd.a(parcel, MaskedWallet.CREATOR);
                        Bundle bundle = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 2:
                        parcel.readInt();
                        FullWallet fullWallet = (FullWallet) ahd.a(parcel, FullWallet.CREATOR);
                        Bundle bundle2 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 3:
                        int readInt2 = parcel.readInt();
                        int i7 = ahd.a;
                        z4 = parcel.readInt() != 0;
                        Bundle bundle3 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        S(readInt2, z4);
                        return true;
                    case 4:
                        parcel.readInt();
                        Bundle bundle4 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i8 = ahd.a;
                        parcel.readInt();
                        Bundle bundle5 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 7:
                        Status status20 = (Status) ahd.a(parcel, Status.CREATOR);
                        qhe qheVar = (qhe) ahd.a(parcel, qhe.CREATOR);
                        Bundle bundle6 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 8:
                        Status status21 = (Status) ahd.a(parcel, Status.CREATOR);
                        Bundle bundle7 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 9:
                        Status status22 = (Status) ahd.a(parcel, Status.CREATOR);
                        z4 = parcel.readInt() != 0;
                        Bundle bundle8 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        Q(status22, z4);
                        return true;
                    case 10:
                        Status status23 = (Status) ahd.a(parcel, Status.CREATOR);
                        ase aseVar = (ase) ahd.a(parcel, ase.CREATOR);
                        Bundle bundle9 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 11:
                        Status status24 = (Status) ahd.a(parcel, Status.CREATOR);
                        Bundle bundle10 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 12:
                        Status status25 = (Status) ahd.a(parcel, Status.CREATOR);
                        s9d s9dVar = (s9d) ahd.a(parcel, s9d.CREATOR);
                        Bundle bundle11 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 13:
                        Status status26 = (Status) ahd.a(parcel, Status.CREATOR);
                        Bundle bundle12 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 14:
                        Bundle bundle13 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        R((Status) ahd.a(parcel, Status.CREATOR), (oy7) ahd.a(parcel, oy7.CREATOR));
                        return true;
                    case 15:
                        Status status27 = (Status) ahd.a(parcel, Status.CREATOR);
                        f9f f9fVar = (f9f) ahd.a(parcel, f9f.CREATOR);
                        Bundle bundle14 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 16:
                        Status status28 = (Status) ahd.a(parcel, Status.CREATOR);
                        a0f a0fVar = (a0f) ahd.a(parcel, a0f.CREATOR);
                        Bundle bundle15 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 17:
                        Status status29 = (Status) ahd.a(parcel, Status.CREATOR);
                        a5f a5fVar = (a5f) ahd.a(parcel, a5f.CREATOR);
                        Bundle bundle16 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 18:
                        parcel.readInt();
                        Bundle bundle17 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 19:
                        Status status30 = (Status) ahd.a(parcel, Status.CREATOR);
                        ny7 ny7Var = (ny7) ahd.a(parcel, ny7.CREATOR);
                        Bundle bundle18 = (Bundle) ahd.a(parcel, Bundle.CREATOR);
                        return true;
                }
        }
    }

    public void Q(Status status, boolean z) {
    }

    public void R(Status status, oy7 oy7Var) {
    }

    public void S(int i, boolean z) {
    }

    public dzc(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                return;
            default:
                attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
                return;
        }
    }

    public dzc(byte b, boolean z) {
        this.a = b;
    }
}
