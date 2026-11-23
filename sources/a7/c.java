package a7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h6.m;
import j$.util.Objects;
import l8.f;
public final class c {
    public final int f300a;
    public final ga.d f301b;

    public c(ga.d dVar, int i7) {
        this.f300a = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(dVar);
                this.f301b = dVar;
                return;
            default:
                Objects.requireNonNull(dVar);
                this.f301b = dVar;
                return;
        }
    }

    public final int a() {
        switch (this.f300a) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.f300a) {
            case 0:
                m mVar = (m) this.f301b.f13270a;
                ViewGroup viewGroup = (ViewGroup) mVar.f13931b;
                f fVar = (f) mVar.f13932c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel p12 = fVar.p1();
                    v7.b.b(p12, bundle);
                    fVar.t1(p12, 2);
                    l8.c.b(bundle, null);
                    Parcel o12 = fVar.o1(fVar.p1(), 8);
                    a m12 = b.m1(o12.readStrongBinder());
                    o12.recycle();
                    mVar.d = (View) b.n1(m12);
                    viewGroup.removeAllViews();
                    viewGroup.addView((View) mVar.d);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                m mVar2 = (m) this.f301b.f13270a;
                mVar2.getClass();
                try {
                    f fVar2 = (f) mVar2.f13932c;
                    fVar2.t1(fVar2.p1(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
        }
    }
}
