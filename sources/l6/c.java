package l6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import s5.m;
import v7.j;
import w7.g;
public final class c implements e {
    public final Bundle f11468a;
    public final j f11469b;

    public c(j jVar, Bundle bundle) {
        this.f11469b = jVar;
        this.f11468a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        m mVar = this.f11469b.f45695a;
        Bundle bundle = this.f11468a;
        ViewGroup viewGroup = (ViewGroup) mVar.f44153b;
        g gVar = (g) mVar.f44154c;
        try {
            Bundle bundle2 = new Bundle();
            w7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            g7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            w7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            mVar.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) mVar.d);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
