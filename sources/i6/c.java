package i6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import s7.j;
import t7.g;

public final class c implements e {

    public final Bundle f10568a;

    public final j f10569b;

    public c(j jVar, Bundle bundle) {
        this.f10569b = jVar;
        this.f10568a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        j9.a aVar = this.f10569b.f47812a;
        Bundle bundle = this.f10568a;
        ViewGroup viewGroup = (ViewGroup) aVar.f12863b;
        g gVar = (g) aVar.f12864c;
        try {
            Bundle bundle2 = new Bundle();
            t7.d.b(bundle, bundle2);
            Parcel parcelM0 = gVar.M0();
            d7.b.b(parcelM0, bundle2);
            gVar.Q0(parcelM0, 2);
            t7.d.b(bundle2, bundle);
            Parcel parcelL0 = gVar.L0(gVar.M0(), 8);
            a aVarJ0 = b.J0(parcelL0.readStrongBinder());
            parcelL0.recycle();
            aVar.d = (View) b.K0(aVarJ0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) aVar.d);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
