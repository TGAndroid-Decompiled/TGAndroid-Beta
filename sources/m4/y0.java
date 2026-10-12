package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class y0 implements q {
    public final i f16003a;
    public final int f16004b;

    public y0(i iVar, int i10) {
        this.f16003a = iVar;
        this.f16004b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f15882a);
        bundle.putLong(l.f15879e, lVar.f15883b);
        bundle.putBundle(l.f15881g, lVar.f15884c.a());
        bundle.putInt(l.f15880f, 4);
        h hVar = (h) this.f16003a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.p.a(obtain, bundle);
            hVar.f15852a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f16003a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f15852a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f16003a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.p.a(obtain, b10);
            hVar.f15852a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, i1 i1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(i1.f15861f, i1Var.f15863a);
        bundle2.putString(i1.f15862g, i1Var.f15864b);
        bundle2.putBundle(i1.h, i1Var.f15865c);
        h hVar = (h) this.f16003a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.p.a(obtain, bundle2);
            w7.p.a(obtain, bundle);
            hVar.f15852a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, l1 l1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = l1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f16003a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.p.a(obtain, b10);
            hVar.f15852a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == y0.class) {
            return Objects.equals(this.f16003a.asBinder(), ((y0) obj).f16003a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.s.a(this.f16003a);
    }

    @Override
    public final void g(int i10, e1 e1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f16004b;
        if (i11 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        e2.d.g(z12);
        if (!z10 && x0Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !x0Var.a(30)) {
            z13 = true;
        }
        i iVar = this.f16003a;
        if (i11 >= 2) {
            Bundle f7 = e1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(d1.f15761a, r32);
            bundle.putBoolean(d1.f15762b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.p.a(obtain, f7);
                w7.p.a(obtain, bundle);
                hVar.f15852a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = e1Var.e(x0Var, z10, true).f(i11);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.p.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f15852a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16003a.asBinder());
    }

    @Override
    public final void i(int i10, m1 m1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.f15920e, m1Var.f15923a);
        bundle.putBundle(m1.f15921f, m1Var.f15924b);
        bundle.putLong(m1.f15922g, m1Var.f15925c);
        k1 k1Var = m1Var.d;
        if (k1Var != null) {
            bundle.putBundle(m1.h, k1Var.a());
        }
        h hVar = (h) this.f16003a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.p.a(obtain, bundle);
            hVar.f15852a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
