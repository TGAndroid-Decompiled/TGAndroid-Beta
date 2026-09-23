package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class x0 implements q {
    public final i f14697a;
    public final int f14698b;

    public x0(i iVar, int i10) {
        this.f14697a = iVar;
        this.f14698b = i10;
    }

    @Override
    public final void a(int i10, l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(l.d, lVar.f14602a);
        bundle.putLong(l.e, lVar.f14603b);
        bundle.putBundle(l.f14601g, lVar.f14604c.a());
        bundle.putInt(l.f14600f, 4);
        h hVar = (h) this.f14697a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.f14563a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        h hVar = (h) this.f14697a;
        hVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            hVar.f14563a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.x0 x0Var) {
        Bundle b10 = x0Var.b();
        h hVar = (h) this.f14697a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.f14563a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, h1 h1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(h1.f14566f, h1Var.f14568a);
        bundle2.putString(h1.f14567g, h1Var.f14569b);
        bundle2.putBundle(h1.h, h1Var.f14570c);
        h hVar = (h) this.f14697a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle2);
            w7.r.a(obtain, bundle);
            hVar.f14563a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, k1 k1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = k1Var.a(z10, z11).b(i11);
        h hVar = (h) this.f14697a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, b10);
            hVar.f14563a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == x0.class) {
            return Objects.equals(this.f14697a.asBinder(), ((x0) obj).f14697a.asBinder());
        }
        return false;
    }

    @Override
    public final void f() {
        w7.u.a(this.f14697a);
    }

    @Override
    public final void g(int i10, d1 d1Var, b2.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f14698b;
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
        i iVar = this.f14697a;
        if (i11 >= 2) {
            Bundle f7 = d1Var.e(x0Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(c1.f14473a, r32);
            bundle.putBoolean(c1.f14474b, z13);
            h hVar = (h) iVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.r.a(obtain, f7);
                w7.r.a(obtain, bundle);
                hVar.f14563a.transact(3013, obtain, null, 1);
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
            w7.r.a(obtain, f10);
            obtain.writeInt(r32);
            hVar2.f14563a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f14697a.asBinder());
    }

    @Override
    public final void i(int i10, l1 l1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(l1.e, l1Var.f14623a);
        bundle.putBundle(l1.f14621f, l1Var.f14624b);
        bundle.putLong(l1.f14622g, l1Var.f14625c);
        j1 j1Var = l1Var.d;
        if (j1Var != null) {
            bundle.putBundle(l1.h, j1Var.a());
        }
        h hVar = (h) this.f14697a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.r.a(obtain, bundle);
            hVar.f14563a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
