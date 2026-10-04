package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class w0 implements q {
    public final i f16307a;
    public final int f16308b;

    public w0(i iVar, int i10) {
        this.f16307a = iVar;
        this.f16308b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f16232a);
        bundle.putLong(l.f16229e, lVar.f16233b);
        bundle.putBundle(l.f16231g, lVar.f16234c.a());
        bundle.putInt(l.f16230f, 4);
        h hVar = (h) this.f16307a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            hVar.f16174a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f16307a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f16174a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f16307a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, b10);
            hVar.f16174a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, g1 g1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(g1.f16169f, g1Var.f16171a);
        bundle2.putString(g1.f16170g, g1Var.f16172b);
        bundle2.putBundle(g1.h, g1Var.f16173c);
        h hVar = (h) this.f16307a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle2);
            w7.s.a(obtain, bundle);
            hVar.f16174a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, j1 j1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = j1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f16307a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, b10);
            hVar.f16174a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == w0.class) {
            return Objects.equals(this.f16307a.asBinder(), ((w0) obj).f16307a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.v.a(this.f16307a);
    }

    @Override
    public final void g(int i10, c1 c1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f16308b;
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
        z13 = (z11 || !x0Var.a(30)) ? true : true;
        i iVar = this.f16307a;
        if (i11 >= 2) {
            Bundle f7 = c1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(b1.f16068a, r32);
            bundle.putBoolean(b1.f16069b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.s.a(obtain, f7);
                w7.s.a(obtain, bundle);
                hVar.f16174a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = c1Var.e(x0Var, z10, true).f(i11);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f16174a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16307a.asBinder());
    }

    @Override
    public final void i(int i10, k1 k1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(k1.f16223e, k1Var.f16226a);
        bundle.putBundle(k1.f16224f, k1Var.f16227b);
        bundle.putLong(k1.f16225g, k1Var.f16228c);
        i1 i1Var = k1Var.d;
        if (i1Var != null) {
            bundle.putBundle(k1.h, i1Var.a());
        }
        h hVar = (h) this.f16307a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            hVar.f16174a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
