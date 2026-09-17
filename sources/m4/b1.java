package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class b1 implements q {
    public final i f15884a;
    public final int f15885b;

    public b1(i iVar, int i10) {
        this.f15884a = iVar;
        this.f15885b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f16016a);
        bundle.putLong(l.f16013e, lVar.f16017b);
        bundle.putBundle(l.f16015g, lVar.f16018c.a());
        bundle.putInt(l.f16014f, 4);
        h hVar = (h) this.f15884a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.f15947a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f15884a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f15947a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f15884a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.f15947a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, l1 l1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(l1.f16023f, l1Var.f16025a);
        bundle2.putString(l1.f16024g, l1Var.f16026b);
        bundle2.putBundle(l1.h, l1Var.f16027c);
        h hVar = (h) this.f15884a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle2);
            w7.r.a(obtain, bundle);
            hVar.f15947a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, o1 o1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = o1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f15884a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.f15947a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == b1.class) {
            return Objects.equals(this.f15884a.asBinder(), ((b1) obj).f15884a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.u.a(this.f15884a);
    }

    @Override
    public final void g(int i10, h1 h1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f15885b;
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
        i iVar = this.f15884a;
        if (i11 >= 2) {
            Bundle f7 = h1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(g1.f15945a, r32);
            bundle.putBoolean(g1.f15946b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.r.a(obtain, f7);
                w7.r.a(obtain, bundle);
                hVar.f15947a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = h1Var.e(x0Var, z10, true).f(i11);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f15947a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f15884a.asBinder());
    }

    @Override
    public final void i(int i10, p1 p1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(p1.f16073e, p1Var.f16076a);
        bundle.putBundle(p1.f16074f, p1Var.f16077b);
        bundle.putLong(p1.f16075g, p1Var.f16078c);
        n1 n1Var = p1Var.d;
        if (n1Var != null) {
            bundle.putBundle(p1.h, n1Var.a());
        }
        h hVar = (h) this.f15884a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.f15947a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
