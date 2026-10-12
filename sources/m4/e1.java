package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
import v7.u6;
public final class e1 implements v {
    public final m f15419a;
    public final int f15420b;

    public e1(m mVar, int i10) {
        this.f15419a = mVar;
        this.f15420b = i10;
    }

    @Override
    public final void a(int i10, p pVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(p.d, pVar.f15563a);
        bundle.putLong(p.e, pVar.f15564b);
        bundle.putBundle(p.f15562g, pVar.f15565c.a());
        bundle.putInt(p.f15561f, 4);
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.u.a(obtain, bundle);
            lVar.f15505a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            lVar.f15505a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.c1 c1Var) {
        Bundle b10 = c1Var.b();
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.u.a(obtain, b10);
            lVar.f15505a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, int i11, int i12) {
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            lVar.f15505a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, p1 p1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a2 = p1Var.a();
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.u.a(obtain, a2);
            w7.u.a(obtain, bundle);
            lVar.f15505a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == e1.class) {
            return Objects.equals(this.f15419a.asBinder(), ((e1) obj).f15419a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = s1Var.a(z10, z11).b(i11);
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.u.a(obtain, b10);
            lVar.f15505a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g() {
        w7.x.a(this.f15419a);
    }

    @Override
    public final void h(int i10, l1 l1Var, b2.c1 c1Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f15420b;
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
        m mVar = this.f15419a;
        if (i11 >= 2) {
            Bundle f7 = l1Var.e(c1Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(k1.f15503a, r32);
            bundle.putBoolean(k1.f15504b, z13);
            l lVar = (l) mVar;
            lVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.u.a(obtain, f7);
                w7.u.a(obtain, bundle);
                lVar.f15505a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = l1Var.e(c1Var, z10, true).f(i11);
        l lVar2 = (l) mVar;
        lVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.u.a(obtain, f10);
            obtain.writeInt(r32);
            lVar2.f15505a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f15419a.asBinder());
    }

    @Override
    public final void j(int i10, t1 t1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(t1.e, t1Var.f15640a);
        bundle.putBundle(t1.f15638f, t1Var.f15641b);
        bundle.putLong(t1.f15639g, t1Var.f15642c);
        r1 r1Var = t1Var.d;
        if (r1Var != null) {
            bundle.putBundle(t1.h, r1Var.a());
        }
        l lVar = (l) this.f15419a;
        lVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.u.a(obtain, bundle);
            lVar.f15505a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
