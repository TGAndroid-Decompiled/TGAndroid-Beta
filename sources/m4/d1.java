package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class d1 implements q {
    public final i f13326a;
    public final int f13327b;

    public d1(i iVar, int i10) {
        this.f13326a = iVar;
        this.f13327b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f13425a);
        bundle.putLong(l.e, lVar.f13426b);
        bundle.putBundle(l.f13424g, lVar.f13427c.a());
        bundle.putInt(l.f13423f, 4);
        h hVar = (h) this.f13326a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            hVar.f13372a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f13326a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f13372a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f13326a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, b10);
            hVar.f13372a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, n1 n1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(n1.f13456f, n1Var.f13458a);
        bundle2.putString(n1.f13457g, n1Var.f13459b);
        bundle2.putBundle(n1.h, n1Var.f13460c);
        h hVar = (h) this.f13326a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle2);
            w7.s.a(obtain, bundle);
            hVar.f13372a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, q1 q1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = q1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f13326a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, b10);
            hVar.f13372a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == d1.class) {
            return Objects.equals(this.f13326a.asBinder(), ((d1) obj).f13326a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.v.a(this.f13326a);
    }

    @Override
    public final void g(int i10, j1 j1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f13327b;
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
        i iVar = this.f13326a;
        if (i11 >= 2) {
            Bundle f7 = j1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(i1.f13379a, r32);
            bundle.putBoolean(i1.f13380b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.s.a(obtain, f7);
                w7.s.a(obtain, bundle);
                hVar.f13372a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = j1Var.e(x0Var, z10, true).f(i11);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f13372a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f13326a.asBinder());
    }

    @Override
    public final void i(int i10, r1 r1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(r1.e, r1Var.f13505a);
        bundle.putBundle(r1.f13503f, r1Var.f13506b);
        bundle.putLong(r1.f13504g, r1Var.f13507c);
        p1 p1Var = r1Var.d;
        if (p1Var != null) {
            bundle.putBundle(r1.h, p1Var.a());
        }
        h hVar = (h) this.f13326a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            hVar.f13372a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
