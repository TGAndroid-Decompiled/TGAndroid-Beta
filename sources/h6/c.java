package h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import r7.j;
import s7.g;
public final class c implements e {
    public final Bundle f9859a;
    public final j f9860b;

    public c(j jVar, Bundle bundle) {
        this.f9860b = jVar;
        this.f9859a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        j4.c cVar = this.f9860b.f47092a;
        Bundle bundle = this.f9859a;
        ViewGroup viewGroup = (ViewGroup) cVar.f13431b;
        g gVar = (g) cVar.f13432c;
        try {
            Bundle bundle2 = new Bundle();
            s7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            c7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            s7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            cVar.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) cVar.d);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
