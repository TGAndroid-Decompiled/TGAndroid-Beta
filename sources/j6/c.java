package j6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import l3.g0;
import t7.j;
import u7.g;
public final class c implements e {
    public final Bundle f10895a;
    public final j f10896b;

    public c(j jVar, Bundle bundle) {
        this.f10896b = jVar;
        this.f10895a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        g0 g0Var = this.f10896b.f48175a;
        Bundle bundle = this.f10895a;
        ViewGroup viewGroup = (ViewGroup) g0Var.f14096b;
        g gVar = (g) g0Var.f14097c;
        try {
            Bundle bundle2 = new Bundle();
            u7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            e7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            u7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            g0Var.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) g0Var.d);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
