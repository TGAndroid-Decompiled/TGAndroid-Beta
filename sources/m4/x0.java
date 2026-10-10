package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class x0 implements q {
    public final i f16254a;
    public final int f16255b;

    public x0(i iVar, int i10) {
        this.f16254a = iVar;
        this.f16255b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f16155a);
        bundle.putLong(l.f16152e, lVar.f16156b);
        bundle.putBundle(l.f16154g, lVar.f16157c.a());
        bundle.putInt(l.f16153f, 4);
        h hVar = (h) this.f16254a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.q.a(obtain, bundle);
            hVar.f16111a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f16254a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f16111a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f16254a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.q.a(obtain, b10);
            hVar.f16111a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, h1 h1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(h1.f16115f, h1Var.f16117a);
        bundle2.putString(h1.f16116g, h1Var.f16118b);
        bundle2.putBundle(h1.h, h1Var.f16119c);
        h hVar = (h) this.f16254a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.q.a(obtain, bundle2);
            w7.q.a(obtain, bundle);
            hVar.f16111a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, k1 k1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = k1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f16254a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.q.a(obtain, b10);
            hVar.f16111a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == x0.class) {
            return Objects.equals(this.f16254a.asBinder(), ((x0) obj).f16254a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.t.a(this.f16254a);
    }

    @Override
    public final void g(int i10, d1 d1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f16255b;
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
        i iVar = this.f16254a;
        if (i11 >= 2) {
            Bundle f7 = d1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(c1.f16015a, r32);
            bundle.putBoolean(c1.f16016b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.q.a(obtain, f7);
                w7.q.a(obtain, bundle);
                hVar.f16111a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = d1Var.e(x0Var, z10, true).f(i11);
        h hVar2 = (h) iVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.q.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f16111a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16254a.asBinder());
    }

    @Override
    public final void i(int i10, l1 l1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(l1.f16174e, l1Var.f16177a);
        bundle.putBundle(l1.f16175f, l1Var.f16178b);
        bundle.putLong(l1.f16176g, l1Var.f16179c);
        j1 j1Var = l1Var.d;
        if (j1Var != null) {
            bundle.putBundle(l1.h, j1Var.a());
        }
        h hVar = (h) this.f16254a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.q.a(obtain, bundle);
            hVar.f16111a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
