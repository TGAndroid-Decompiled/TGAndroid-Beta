package o4;

import android.os.Bundle;
import android.os.Parcel;
import b8.ve;
import b8.ye;
import b8.zb;
import j$.util.Objects;
public final class c1 implements u {
    public final l f20602a;
    public final int f20603b;

    public c1(l lVar, int i3) {
        this.f20602a = lVar;
        this.f20603b = i3;
    }

    @Override
    public final void a(int i3, d2.a1 a1Var) {
        Bundle b10 = a1Var.b();
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, b10);
            kVar.f20742a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i3) {
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            kVar.f20742a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i3, int i10, int i11) {
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            kVar.f20742a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i3, n1 n1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = n1Var.a();
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, a10);
            ve.a(obtain, bundle);
            kVar.f20742a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i3, r1 r1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(r1.f20840e, r1Var.f20843a);
        bundle.putBundle(r1.f20841f, r1Var.f20844b);
        bundle.putLong(r1.f20842g, r1Var.f20845c);
        p1 p1Var = r1Var.d;
        if (p1Var != null) {
            bundle.putBundle(r1.h, p1Var.a());
        }
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, bundle);
            kVar.f20742a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == c1.class) {
            return Objects.equals(this.f20602a.asBinder(), ((c1) obj).f20602a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i3, j1 j1Var, d2.a1 a1Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i10 = this.f20603b;
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        zb.p(z12);
        if (!z10 && a1Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !a1Var.a(30)) {
            z13 = true;
        }
        l lVar = this.f20602a;
        if (i10 >= 2) {
            Bundle f10 = j1Var.e(a1Var, z10, z11).f(i10);
            Bundle bundle = new Bundle();
            bundle.putBoolean(i1.f20678a, r32);
            bundle.putBoolean(i1.f20679b, z13);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i3);
                ve.a(obtain, f10);
                ve.a(obtain, bundle);
                kVar.f20742a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = j1Var.e(a1Var, z10, true).f(i10);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, f11);
            obtain.writeInt(r32);
            kVar2.f20742a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    @Override
    public final void g() {
        ye.a(this.f20602a);
    }

    public final int hashCode() {
        return Objects.hash(this.f20602a.asBinder());
    }

    @Override
    public final void i(int i3, q1 q1Var, boolean z10, boolean z11, int i10) {
        Bundle b10 = q1Var.a(z10, z11).b(i10);
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, b10);
            kVar.f20742a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void j(int i3, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.f20769a);
        bundle.putLong(o.f20766e, oVar.f20770b);
        bundle.putBundle(o.f20768g, oVar.f20771c.a());
        bundle.putInt(o.f20767f, 4);
        k kVar = (k) this.f20602a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, bundle);
            kVar.f20742a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
