package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
import v7.u6;
public final class d1 implements u {
    public final l f15149a;
    public final int f15150b;

    public d1(l lVar, int i10) {
        this.f15149a = lVar;
        this.f15150b = i10;
    }

    @Override
    public final void a(int i10, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.f15293a);
        bundle.putLong(o.e, oVar.f15294b);
        bundle.putBundle(o.f15292g, oVar.f15295c.a());
        bundle.putInt(o.f15291f, 4);
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, bundle);
            kVar.f15235a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            kVar.f15235a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.c1 c1Var) {
        Bundle b10 = c1Var.b();
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, b10);
            kVar.f15235a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, int i11, int i12) {
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            kVar.f15235a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, o1 o1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a2 = o1Var.a();
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, a2);
            w7.t.a(obtain, bundle);
            kVar.f15235a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == d1.class) {
            return Objects.equals(this.f15149a.asBinder(), ((d1) obj).f15149a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i10, r1 r1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = r1Var.a(z10, z11).b(i11);
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, b10);
            kVar.f15235a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g() {
        w7.w.a(this.f15149a);
    }

    @Override
    public final void h(int i10, k1 k1Var, b2.c1 c1Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f15150b;
        if (i11 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        u6.p(z12);
        if (!z10 && c1Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !c1Var.a(30)) {
            z13 = true;
        }
        l lVar = this.f15149a;
        if (i11 >= 2) {
            Bundle f7 = k1Var.e(c1Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(j1.f15233a, r32);
            bundle.putBoolean(j1.f15234b, z13);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.t.a(obtain, f7);
                w7.t.a(obtain, bundle);
                kVar.f15235a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = k1Var.e(c1Var, z10, true).f(i11);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, f10);
            obtain.writeInt(r32);
            kVar2.f15235a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f15149a.asBinder());
    }

    @Override
    public final void j(int i10, s1 s1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(s1.e, s1Var.f15370a);
        bundle.putBundle(s1.f15368f, s1Var.f15371b);
        bundle.putLong(s1.f15369g, s1Var.f15372c);
        q1 q1Var = s1Var.d;
        if (q1Var != null) {
            bundle.putBundle(s1.h, q1Var.a());
        }
        k kVar = (k) this.f15149a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, bundle);
            kVar.f15235a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
