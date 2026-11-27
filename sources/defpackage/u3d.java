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
public abstract class u3d extends Binder implements IInterface {
    public final byte a;

    public u3d(String str, byte b) {
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
        int i = hld.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract void P(Status status, qp5 qp5Var);

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

    public abstract void f(Status status, n54 n54Var);

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        io createFromParcel;
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
                o5d o5dVar = (o5d) this;
                if (i == 3) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = j4d.a;
                    Status createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    w4d createFromParcel3 = parcel.readInt() == 0 ? null : w4d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? io.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        createFromParcel2.getClass();
                        if (createFromParcel2.b() && createFromParcel3 != null) {
                            mh0 mh0Var = t3d.l;
                            Log.i(mh0Var.b, mh0Var.b("Verification support info received.", new Object[0]));
                            mh0Var.a("result: " + createFromParcel3, new Object[0]);
                        } else {
                            mh0 mh0Var2 = t3d.l;
                            Log.w(mh0Var2.b, mh0Var2.b("Failed to get verification support info. Status: " + createFromParcel2, new Object[0]));
                        }
                        vze.a(createFromParcel2, createFromParcel3, o5dVar.b);
                        return true;
                    }
                    throw new BadParcelableException(uh9.k(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                if (i == 4) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = j4d.a;
                    Status createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    o4d createFromParcel5 = parcel.readInt() == 0 ? null : o4d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? io.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 <= 0) {
                        createFromParcel4.getClass();
                        p3d.a();
                    } else {
                        throw new BadParcelableException(uh9.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                } else if (i == 5) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i5 = j4d.a;
                    Status createFromParcel6 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    a5d createFromParcel7 = parcel.readInt() == 0 ? null : a5d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? io.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 <= 0) {
                        createFromParcel6.getClass();
                        p3d.a();
                    } else {
                        throw new BadParcelableException(uh9.k(dataAvail3, "Parcel data not fully consumed, unread size: "));
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
                mmd mmdVar = (mmd) this;
                if (i == 1) {
                    int readInt = parcel.readInt();
                    int i6 = udd.a;
                    int dataAvail4 = parcel.dataAvail();
                    if (dataAvail4 <= 0) {
                        mmdVar.b.a(Integer.valueOf(readInt));
                        return true;
                    }
                    throw new BadParcelableException(uh9.k(dataAvail4, "Parcel data not fully consumed, unread size: "));
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
                lme lmeVar = (lme) this;
                switch (i) {
                    case 1:
                        lmeVar.b.a((Status) bld.a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        Status status = (Status) bld.a(parcel, Status.CREATOR);
                        p3d.a();
                        break;
                    case 3:
                        Status status2 = (Status) bld.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        p3d.a();
                        break;
                    case 4:
                        Status status3 = (Status) bld.a(parcel, Status.CREATOR);
                        p3d.a();
                        break;
                    case 5:
                        Status status4 = (Status) bld.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        p3d.a();
                        break;
                    case 6:
                        Status status5 = (Status) bld.a(parcel, Status.CREATOR);
                        cyd[] cydVarArr = (cyd[]) parcel.createTypedArray(cyd.CREATOR);
                        p3d.a();
                        break;
                    case 7:
                        DataHolder dataHolder = (DataHolder) bld.a(parcel, DataHolder.CREATOR);
                        p3d.a();
                        break;
                    case 8:
                        Status status6 = (Status) bld.a(parcel, Status.CREATOR);
                        kld kldVar = (kld) bld.a(parcel, kld.CREATOR);
                        p3d.a();
                        break;
                    case 9:
                        Status status7 = (Status) bld.a(parcel, Status.CREATOR);
                        kld kldVar2 = (kld) bld.a(parcel, kld.CREATOR);
                        p3d.a();
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
                sr5 sr5Var = (sr5) this;
                TaskCompletionSource taskCompletionSource = sr5Var.c;
                byte b = sr5Var.b;
                switch (i) {
                    case 1:
                        Status status8 = (Status) hld.a(parcel, Status.CREATOR);
                        p68 p68Var = (p68) hld.a(parcel, p68.CREATOR);
                        a(parcel);
                        status8.getClass();
                        switch (b) {
                            case 1:
                                vze.a(status8, p68Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        h99 h99Var = (h99) hld.a(parcel, h99.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 3:
                        aj2 aj2Var = (aj2) hld.a(parcel, aj2.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 4:
                        q68 q68Var = (q68) hld.a(parcel, q68.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 5:
                        w89 w89Var = (w89) hld.a(parcel, w89.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 6:
                        c13 c13Var = (c13) hld.a(parcel, c13.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 7:
                        Status status9 = (Status) hld.a(parcel, Status.CREATOR);
                        x03 x03Var = (x03) hld.a(parcel, x03.CREATOR);
                        a(parcel);
                        status9.getClass();
                        switch (b) {
                            case 0:
                                vze.a(status9, x03Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        v89 v89Var = (v89) hld.a(parcel, v89.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 9:
                        ti2 ti2Var = (ti2) hld.a(parcel, ti2.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        dla dlaVar = (dla) hld.a(parcel, dla.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        ui2 ui2Var = (ui2) hld.a(parcel, ui2.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 12:
                        cp5 cp5Var = (cp5) hld.a(parcel, cp5.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 13:
                        n74 n74Var = (n74) hld.a(parcel, n74.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 14:
                        e33 e33Var = (e33) hld.a(parcel, e33.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
                        break;
                    case 15:
                        qi2 qi2Var = (qi2) hld.a(parcel, qi2.CREATOR);
                        a(parcel);
                        ((Status) hld.a(parcel, Status.CREATOR)).getClass();
                        p3d.a();
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
                vdf vdfVar = (vdf) this;
                if (i == 1) {
                    vdfVar.b.a(new zbf((Status) qld.a(parcel, Status.CREATOR), (l9d) qld.a(parcel, l9d.CREATOR)));
                    return true;
                }
                if (i == 2) {
                    parcel.readString();
                    p3d.a();
                } else if (i == 3) {
                    Status status10 = (Status) qld.a(parcel, Status.CREATOR);
                    fs9 fs9Var = (fs9) qld.a(parcel, fs9.CREATOR);
                    p3d.a();
                } else if (i == 4) {
                    Status status11 = (Status) qld.a(parcel, Status.CREATOR);
                    parcel.readInt();
                    p3d.a();
                } else if (i == 6) {
                    Status status12 = (Status) qld.a(parcel, Status.CREATOR);
                    h3e h3eVar = (h3e) qld.a(parcel, h3e.CREATOR);
                    p3d.a();
                } else if (i == 8) {
                    Status status13 = (Status) qld.a(parcel, Status.CREATOR);
                    wrd wrdVar = (wrd) qld.a(parcel, wrd.CREATOR);
                    p3d.a();
                } else if (i == 10) {
                    Status status14 = (Status) qld.a(parcel, Status.CREATOR);
                    parcel.readInt();
                    p3d.a();
                } else if (i == 11) {
                    Status status15 = (Status) qld.a(parcel, Status.CREATOR);
                    p3d.a();
                } else if (i == 15) {
                    Status status16 = (Status) qld.a(parcel, Status.CREATOR);
                    yge ygeVar = (yge) qld.a(parcel, yge.CREATOR);
                    p3d.a();
                } else if (i == 16) {
                    Status status17 = (Status) qld.a(parcel, Status.CREATOR);
                    parcel.readString();
                    parcel.readInt();
                    p3d.a();
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
                    Status status18 = (Status) pld.a(parcel, Status.CREATOR);
                    qp5 qp5Var = (qp5) pld.a(parcel, qp5.CREATOR);
                    int dataAvail5 = parcel.dataAvail();
                    if (dataAvail5 <= 0) {
                        P(status18, qp5Var);
                        return true;
                    }
                    throw new BadParcelableException(uh9.k(dataAvail5, "Parcel data not fully consumed, unread size: "));
                } else if (i != 2) {
                    return false;
                } else {
                    Status status19 = (Status) pld.a(parcel, Status.CREATOR);
                    n54 n54Var = (n54) pld.a(parcel, n54.CREATOR);
                    int dataAvail6 = parcel.dataAvail();
                    if (dataAvail6 <= 0) {
                        f(status19, n54Var);
                        return true;
                    }
                    throw new BadParcelableException(uh9.k(dataAvail6, "Parcel data not fully consumed, unread size: "));
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
                        MaskedWallet maskedWallet = (MaskedWallet) rld.a(parcel, MaskedWallet.CREATOR);
                        Bundle bundle = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 2:
                        parcel.readInt();
                        FullWallet fullWallet = (FullWallet) rld.a(parcel, FullWallet.CREATOR);
                        Bundle bundle2 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 3:
                        int readInt2 = parcel.readInt();
                        int i7 = rld.a;
                        z4 = parcel.readInt() != 0;
                        Bundle bundle3 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        S(readInt2, z4);
                        return true;
                    case 4:
                        parcel.readInt();
                        Bundle bundle4 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i8 = rld.a;
                        parcel.readInt();
                        Bundle bundle5 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 7:
                        Status status20 = (Status) rld.a(parcel, Status.CREATOR);
                        hme hmeVar = (hme) rld.a(parcel, hme.CREATOR);
                        Bundle bundle6 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 8:
                        Status status21 = (Status) rld.a(parcel, Status.CREATOR);
                        Bundle bundle7 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 9:
                        Status status22 = (Status) rld.a(parcel, Status.CREATOR);
                        z4 = parcel.readInt() != 0;
                        Bundle bundle8 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        Q(status22, z4);
                        return true;
                    case 10:
                        Status status23 = (Status) rld.a(parcel, Status.CREATOR);
                        rwe rweVar = (rwe) rld.a(parcel, rwe.CREATOR);
                        Bundle bundle9 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 11:
                        Status status24 = (Status) rld.a(parcel, Status.CREATOR);
                        Bundle bundle10 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 12:
                        Status status25 = (Status) rld.a(parcel, Status.CREATOR);
                        led ledVar = (led) rld.a(parcel, led.CREATOR);
                        Bundle bundle11 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 13:
                        Status status26 = (Status) rld.a(parcel, Status.CREATOR);
                        Bundle bundle12 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 14:
                        Bundle bundle13 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        R((Status) rld.a(parcel, Status.CREATOR), (u18) rld.a(parcel, u18.CREATOR));
                        return true;
                    case 15:
                        Status status27 = (Status) rld.a(parcel, Status.CREATOR);
                        wdf wdfVar = (wdf) rld.a(parcel, wdf.CREATOR);
                        Bundle bundle14 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 16:
                        Status status28 = (Status) rld.a(parcel, Status.CREATOR);
                        r4f r4fVar = (r4f) rld.a(parcel, r4f.CREATOR);
                        Bundle bundle15 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 17:
                        Status status29 = (Status) rld.a(parcel, Status.CREATOR);
                        r9f r9fVar = (r9f) rld.a(parcel, r9f.CREATOR);
                        Bundle bundle16 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 18:
                        parcel.readInt();
                        Bundle bundle17 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                    case 19:
                        Status status30 = (Status) rld.a(parcel, Status.CREATOR);
                        t18 t18Var = (t18) rld.a(parcel, t18.CREATOR);
                        Bundle bundle18 = (Bundle) rld.a(parcel, Bundle.CREATOR);
                        return true;
                }
        }
    }

    public void Q(Status status, boolean z) {
    }

    public void R(Status status, u18 u18Var) {
    }

    public void S(int i, boolean z) {
    }

    public u3d(byte b) {
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
}
