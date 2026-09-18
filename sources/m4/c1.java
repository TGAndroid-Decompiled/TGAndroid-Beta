package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class c1 implements q {
    public final i f14498a;
    public final int f14499b;

    public c1(i iVar, int i10) {
        this.f14498a = iVar;
        this.f14499b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f14601a);
        bundle.putLong(l.e, lVar.f14602b);
        bundle.putBundle(l.f14600g, lVar.f14603c.a());
        bundle.putInt(l.f14599f, 4);
        h hVar = (h) this.f14498a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.f14550a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f14498a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f14550a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f14498a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.f14550a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, m1 m1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(m1.f14625f, m1Var.f14627a);
        bundle2.putString(m1.f14626g, m1Var.f14628b);
        bundle2.putBundle(m1.h, m1Var.f14629c);
        h hVar = (h) this.f14498a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle2);
            w7.r.a(obtain, bundle);
            hVar.f14550a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, p1 p1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = p1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f14498a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.f14550a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == c1.class) {
            return Objects.equals(this.f14498a.asBinder(), ((c1) obj).f14498a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.u.a(this.f14498a);
    }

    @Override
    public final void g(int i10, i1 i1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f14499b;
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
        i iVar = this.f14498a;
        if (i11 >= 2) {
            Bundle f7 = i1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(h1.f14553a, r32);
            bundle.putBoolean(h1.f14554b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.r.a(obtain, f7);
                w7.r.a(obtain, bundle);
                hVar.f14550a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = i1Var.e(x0Var, z10, true).f(i11);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f14550a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f14498a.asBinder());
    }

    @Override
    public final void i(int i10, q1 q1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(q1.e, q1Var.f14674a);
        bundle.putBundle(q1.f14672f, q1Var.f14675b);
        bundle.putLong(q1.f14673g, q1Var.f14676c);
        o1 o1Var = q1Var.d;
        if (o1Var != null) {
            bundle.putBundle(q1.h, o1Var.a());
        }
        h hVar = (h) this.f14498a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.f14550a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
