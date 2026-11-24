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
public abstract class e1d extends Binder implements IInterface {
    public final byte a;

    public e1d(String str, byte b) {
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
        int i = rid.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract void P(Status status, np5 np5Var);

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

    public abstract void f(Status status, c64 c64Var);

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        hp createFromParcel;
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
                z2d z2dVar = (z2d) this;
                if (i == 3) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = t1d.a;
                    Status createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    g2d createFromParcel3 = parcel.readInt() == 0 ? null : g2d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? hp.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        createFromParcel2.getClass();
                        if (createFromParcel2.b() && createFromParcel3 != null) {
                            li0 li0Var = d1d.l;
                            Log.i(li0Var.b, li0Var.b("Verification support info received.", new Object[0]));
                            li0Var.a("result: " + createFromParcel3, new Object[0]);
                        } else {
                            li0 li0Var2 = d1d.l;
                            Log.w(li0Var2.b, li0Var2.b("Failed to get verification support info. Status: " + createFromParcel2, new Object[0]));
                        }
                        fxe.a(createFromParcel2, createFromParcel3, z2dVar.b);
                        return true;
                    }
                    throw new BadParcelableException(hg9.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                if (i == 4) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = t1d.a;
                    Status createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    y1d createFromParcel5 = parcel.readInt() == 0 ? null : y1d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? hp.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 <= 0) {
                        createFromParcel4.getClass();
                        gxc.b();
                    } else {
                        throw new BadParcelableException(hg9.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                } else if (i == 5) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i5 = t1d.a;
                    Status createFromParcel6 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    l2d createFromParcel7 = parcel.readInt() == 0 ? null : l2d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? hp.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 <= 0) {
                        createFromParcel6.getClass();
                        gxc.b();
                    } else {
                        throw new BadParcelableException(hg9.j(dataAvail3, "Parcel data not fully consumed, unread size: "));
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
                wjd wjdVar = (wjd) this;
                if (i == 1) {
                    int readInt = parcel.readInt();
                    int i6 = dbd.a;
                    int dataAvail4 = parcel.dataAvail();
                    if (dataAvail4 <= 0) {
                        wjdVar.b.a(Integer.valueOf(readInt));
                        return true;
                    }
                    throw new BadParcelableException(hg9.j(dataAvail4, "Parcel data not fully consumed, unread size: "));
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
                vje vjeVar = (vje) this;
                switch (i) {
                    case 1:
                        vjeVar.b.a((Status) lid.a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        Status status = (Status) lid.a(parcel, Status.CREATOR);
                        gxc.b();
                        break;
                    case 3:
                        Status status2 = (Status) lid.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        gxc.b();
                        break;
                    case 4:
                        Status status3 = (Status) lid.a(parcel, Status.CREATOR);
                        gxc.b();
                        break;
                    case 5:
                        Status status4 = (Status) lid.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        gxc.b();
                        break;
                    case 6:
                        Status status5 = (Status) lid.a(parcel, Status.CREATOR);
                        pvd[] pvdVarArr = (pvd[]) parcel.createTypedArray(pvd.CREATOR);
                        gxc.b();
                        break;
                    case 7:
                        DataHolder dataHolder = (DataHolder) lid.a(parcel, DataHolder.CREATOR);
                        gxc.b();
                        break;
                    case 8:
                        Status status6 = (Status) lid.a(parcel, Status.CREATOR);
                        uid uidVar = (uid) lid.a(parcel, uid.CREATOR);
                        gxc.b();
                        break;
                    case 9:
                        Status status7 = (Status) lid.a(parcel, Status.CREATOR);
                        uid uidVar2 = (uid) lid.a(parcel, uid.CREATOR);
                        gxc.b();
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
                pr5 pr5Var = (pr5) this;
                TaskCompletionSource taskCompletionSource = pr5Var.c;
                byte b = pr5Var.b;
                switch (i) {
                    case 1:
                        Status status8 = (Status) rid.a(parcel, Status.CREATOR);
                        b58 b58Var = (b58) rid.a(parcel, b58.CREATOR);
                        a(parcel);
                        status8.getClass();
                        switch (b) {
                            case 1:
                                fxe.a(status8, b58Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        w79 w79Var = (w79) rid.a(parcel, w79.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 3:
                        sj2 sj2Var = (sj2) rid.a(parcel, sj2.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 4:
                        c58 c58Var = (c58) rid.a(parcel, c58.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 5:
                        l79 l79Var = (l79) rid.a(parcel, l79.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 6:
                        v13 v13Var = (v13) rid.a(parcel, v13.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 7:
                        Status status9 = (Status) rid.a(parcel, Status.CREATOR);
                        p13 p13Var = (p13) rid.a(parcel, p13.CREATOR);
                        a(parcel);
                        status9.getClass();
                        switch (b) {
                            case 0:
                                fxe.a(status9, p13Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        k79 k79Var = (k79) rid.a(parcel, k79.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 9:
                        lj2 lj2Var = (lj2) rid.a(parcel, lj2.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        mja mjaVar = (mja) rid.a(parcel, mja.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        mj2 mj2Var = (mj2) rid.a(parcel, mj2.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 12:
                        zo5 zo5Var = (zo5) rid.a(parcel, zo5.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 13:
                        c84 c84Var = (c84) rid.a(parcel, c84.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 14:
                        x33 x33Var = (x33) rid.a(parcel, x33.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
                        break;
                    case 15:
                        ij2 ij2Var = (ij2) rid.a(parcel, ij2.CREATOR);
                        a(parcel);
                        ((Status) rid.a(parcel, Status.CREATOR)).getClass();
                        gxc.b();
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
                gbf gbfVar = (gbf) this;
                if (i == 1) {
                    gbfVar.b.a(new k9f((Status) ajd.a(parcel, Status.CREATOR), (u6d) ajd.a(parcel, u6d.CREATOR)));
                    return true;
                }
                if (i == 2) {
                    parcel.readString();
                    gxc.b();
                } else if (i == 3) {
                    Status status10 = (Status) ajd.a(parcel, Status.CREATOR);
                    oq9 oq9Var = (oq9) ajd.a(parcel, oq9.CREATOR);
                    gxc.b();
                } else if (i == 4) {
                    Status status11 = (Status) ajd.a(parcel, Status.CREATOR);
                    parcel.readInt();
                    gxc.b();
                } else if (i == 6) {
                    Status status12 = (Status) ajd.a(parcel, Status.CREATOR);
                    u0e u0eVar = (u0e) ajd.a(parcel, u0e.CREATOR);
                    gxc.b();
                } else if (i == 8) {
                    Status status13 = (Status) ajd.a(parcel, Status.CREATOR);
                    ipd ipdVar = (ipd) ajd.a(parcel, ipd.CREATOR);
                    gxc.b();
                } else if (i == 10) {
                    Status status14 = (Status) ajd.a(parcel, Status.CREATOR);
                    parcel.readInt();
                    gxc.b();
                } else if (i == 11) {
                    Status status15 = (Status) ajd.a(parcel, Status.CREATOR);
                    gxc.b();
                } else if (i == 15) {
                    Status status16 = (Status) ajd.a(parcel, Status.CREATOR);
                    jee jeeVar = (jee) ajd.a(parcel, jee.CREATOR);
                    gxc.b();
                } else if (i == 16) {
                    Status status17 = (Status) ajd.a(parcel, Status.CREATOR);
                    parcel.readString();
                    parcel.readInt();
                    gxc.b();
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
                    Status status18 = (Status) zid.a(parcel, Status.CREATOR);
                    np5 np5Var = (np5) zid.a(parcel, np5.CREATOR);
                    int dataAvail5 = parcel.dataAvail();
                    if (dataAvail5 <= 0) {
                        P(status18, np5Var);
                        return true;
                    }
                    throw new BadParcelableException(hg9.j(dataAvail5, "Parcel data not fully consumed, unread size: "));
                } else if (i != 2) {
                    return false;
                } else {
                    Status status19 = (Status) zid.a(parcel, Status.CREATOR);
                    c64 c64Var = (c64) zid.a(parcel, c64.CREATOR);
                    int dataAvail6 = parcel.dataAvail();
                    if (dataAvail6 <= 0) {
                        f(status19, c64Var);
                        return true;
                    }
                    throw new BadParcelableException(hg9.j(dataAvail6, "Parcel data not fully consumed, unread size: "));
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
                        MaskedWallet maskedWallet = (MaskedWallet) bjd.a(parcel, MaskedWallet.CREATOR);
                        Bundle bundle = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 2:
                        parcel.readInt();
                        FullWallet fullWallet = (FullWallet) bjd.a(parcel, FullWallet.CREATOR);
                        Bundle bundle2 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 3:
                        int readInt2 = parcel.readInt();
                        int i7 = bjd.a;
                        z4 = parcel.readInt() != 0;
                        Bundle bundle3 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        S(readInt2, z4);
                        return true;
                    case 4:
                        parcel.readInt();
                        Bundle bundle4 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i8 = bjd.a;
                        parcel.readInt();
                        Bundle bundle5 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 7:
                        Status status20 = (Status) bjd.a(parcel, Status.CREATOR);
                        rje rjeVar = (rje) bjd.a(parcel, rje.CREATOR);
                        Bundle bundle6 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 8:
                        Status status21 = (Status) bjd.a(parcel, Status.CREATOR);
                        Bundle bundle7 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 9:
                        Status status22 = (Status) bjd.a(parcel, Status.CREATOR);
                        z4 = parcel.readInt() != 0;
                        Bundle bundle8 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        Q(status22, z4);
                        return true;
                    case 10:
                        Status status23 = (Status) bjd.a(parcel, Status.CREATOR);
                        due dueVar = (due) bjd.a(parcel, due.CREATOR);
                        Bundle bundle9 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 11:
                        Status status24 = (Status) bjd.a(parcel, Status.CREATOR);
                        Bundle bundle10 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 12:
                        Status status25 = (Status) bjd.a(parcel, Status.CREATOR);
                        ubd ubdVar = (ubd) bjd.a(parcel, ubd.CREATOR);
                        Bundle bundle11 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 13:
                        Status status26 = (Status) bjd.a(parcel, Status.CREATOR);
                        Bundle bundle12 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 14:
                        Bundle bundle13 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        R((Status) bjd.a(parcel, Status.CREATOR), (q08) bjd.a(parcel, q08.CREATOR));
                        return true;
                    case 15:
                        Status status27 = (Status) bjd.a(parcel, Status.CREATOR);
                        hbf hbfVar = (hbf) bjd.a(parcel, hbf.CREATOR);
                        Bundle bundle14 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 16:
                        Status status28 = (Status) bjd.a(parcel, Status.CREATOR);
                        c2f c2fVar = (c2f) bjd.a(parcel, c2f.CREATOR);
                        Bundle bundle15 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 17:
                        Status status29 = (Status) bjd.a(parcel, Status.CREATOR);
                        c7f c7fVar = (c7f) bjd.a(parcel, c7f.CREATOR);
                        Bundle bundle16 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 18:
                        parcel.readInt();
                        Bundle bundle17 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                    case 19:
                        Status status30 = (Status) bjd.a(parcel, Status.CREATOR);
                        p08 p08Var = (p08) bjd.a(parcel, p08.CREATOR);
                        Bundle bundle18 = (Bundle) bjd.a(parcel, Bundle.CREATOR);
                        return true;
                }
        }
    }

    public void Q(Status status, boolean z) {
    }

    public void R(Status status, q08 q08Var) {
    }

    public void S(int i, boolean z) {
    }

    public e1d(byte b) {
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

    public e1d(byte b, boolean z) {
        this.a = b;
    }
}
