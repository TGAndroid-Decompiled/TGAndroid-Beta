package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class w0 implements q {
    public final i f16316a;
    public final int f16317b;

    public w0(i iVar, int i10) {
        this.f16316a = iVar;
        this.f16317b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f16241a);
        bundle.putLong(l.f16238e, lVar.f16242b);
        bundle.putBundle(l.f16240g, lVar.f16243c.a());
        bundle.putInt(l.f16239f, 4);
        h hVar = (h) this.f16316a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            hVar.f16183a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f16316a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f16183a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f16316a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, b10);
            hVar.f16183a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, g1 g1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(g1.f16178f, g1Var.f16180a);
        bundle2.putString(g1.f16179g, g1Var.f16181b);
        bundle2.putBundle(g1.h, g1Var.f16182c);
        h hVar = (h) this.f16316a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle2);
            w7.s.a(obtain, bundle);
            hVar.f16183a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, j1 j1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = j1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f16316a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, b10);
            hVar.f16183a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == w0.class) {
            return Objects.equals(this.f16316a.asBinder(), ((w0) obj).f16316a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.v.a(this.f16316a);
    }

    @Override
    public final void g(int i10, c1 c1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f16317b;
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
        i iVar = this.f16316a;
        if (i11 >= 2) {
            Bundle f7 = c1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(b1.f16077a, r32);
            bundle.putBoolean(b1.f16078b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.s.a(obtain, f7);
                w7.s.a(obtain, bundle);
                hVar.f16183a.transact(3013, obtain, null, 1);
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
            hVar2.f16183a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16316a.asBinder());
    }

    @Override
    public final void i(int i10, k1 k1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(k1.f16232e, k1Var.f16235a);
        bundle.putBundle(k1.f16233f, k1Var.f16236b);
        bundle.putLong(k1.f16234g, k1Var.f16237c);
        i1 i1Var = k1Var.d;
        if (i1Var != null) {
            bundle.putBundle(k1.h, i1Var.a());
        }
        h hVar = (h) this.f16316a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            hVar.f16183a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
