package g8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import p6.m;
import x8.s;
public final class a extends Binder implements j, IInterface {
    public final int f12033a;
    public final TaskCompletionSource f12034b;

    public a(int i3, TaskCompletionSource taskCompletionSource) {
        this.f12033a = i3;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.f12034b = taskCompletionSource;
    }

    @Override
    public void H(int i3, boolean z10) {
        switch (this.f12033a) {
            case 1:
                y9.a(new Status(i3, null, null, null), Boolean.valueOf(z10), this.f12034b);
                return;
            default:
                return;
        }
    }

    @Override
    public void m0(Status status, boolean z10) {
        switch (this.f12033a) {
            case 1:
                y9.a(status, Boolean.valueOf(z10), this.f12034b);
                return;
            default:
                return;
        }
    }

    @Override
    public void o(Status status, x8.i iVar) {
        switch (this.f12033a) {
            case 0:
                int i3 = x8.a.f58513c;
                boolean b10 = status.b();
                TaskCompletionSource taskCompletionSource = this.f12034b;
                if (b10) {
                    taskCompletionSource.setResult(iVar);
                    return;
                } else {
                    taskCompletionSource.setException(m.l(status));
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 > 16777215) {
            if (super.onTransact(i3, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        boolean z10 = false;
        switch (i3) {
            case 1:
                parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) c.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 2:
                parcel.readInt();
                FullWallet fullWallet = (FullWallet) c.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i11 = c.f12035a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                Bundle bundle3 = (Bundle) c.a(parcel, Bundle.CREATOR);
                H(readInt, z10);
                return true;
            case 4:
                parcel.readInt();
                Bundle bundle4 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i12 = c.f12035a;
                parcel.readInt();
                Bundle bundle5 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 7:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                d dVar = (d) c.a(parcel, d.CREATOR);
                Bundle bundle6 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 8:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 9:
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                Bundle bundle8 = (Bundle) c.a(parcel, Bundle.CREATOR);
                m0(status3, z10);
                return true;
            case 10:
                Status status4 = (Status) c.a(parcel, Status.CREATOR);
                e eVar = (e) c.a(parcel, e.CREATOR);
                Bundle bundle9 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 11:
                Status status5 = (Status) c.a(parcel, Status.CREATOR);
                Bundle bundle10 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 12:
                Status status6 = (Status) c.a(parcel, Status.CREATOR);
                s sVar = (s) c.a(parcel, s.CREATOR);
                Bundle bundle11 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 13:
                Status status7 = (Status) c.a(parcel, Status.CREATOR);
                Bundle bundle12 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 14:
                Bundle bundle13 = (Bundle) c.a(parcel, Bundle.CREATOR);
                o((Status) c.a(parcel, Status.CREATOR), (x8.i) c.a(parcel, x8.i.CREATOR));
                return true;
            case 15:
                Status status8 = (Status) c.a(parcel, Status.CREATOR);
                h hVar = (h) c.a(parcel, h.CREATOR);
                Bundle bundle14 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 16:
                Status status9 = (Status) c.a(parcel, Status.CREATOR);
                f fVar = (f) c.a(parcel, f.CREATOR);
                Bundle bundle15 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 17:
                Status status10 = (Status) c.a(parcel, Status.CREATOR);
                g gVar = (g) c.a(parcel, g.CREATOR);
                Bundle bundle16 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle17 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
            case 19:
                Status status11 = (Status) c.a(parcel, Status.CREATOR);
                x8.h hVar2 = (x8.h) c.a(parcel, x8.h.CREATOR);
                Bundle bundle18 = (Bundle) c.a(parcel, Bundle.CREATOR);
                return true;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    public final void H0(Status status, boolean z10) {
    }

    public final void I0(Status status, x8.i iVar) {
    }

    public final void J0(int i3, boolean z10) {
    }
}
