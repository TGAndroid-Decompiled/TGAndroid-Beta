package m4;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
import v7.u6;
public final class d1 implements u {
    public final l f16510a;
    public final int f16511b;

    public d1(l lVar, int i10) {
        this.f16510a = lVar;
        this.f16511b = i10;
    }

    @Override
    public final void a(int i10, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.f16650a);
        bundle.putLong(o.e, oVar.f16651b);
        bundle.putBundle(o.f16649g, oVar.f16652c.a());
        bundle.putInt(o.f16648f, 4);
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, bundle);
            kVar.f16593a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i10) {
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            kVar.f16593a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i10, b2.b1 b1Var) {
        Bundle b10 = b1Var.b();
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, b10);
            kVar.f16593a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i10, int i11, int i12) {
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            kVar.f16593a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i10, o1 o1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a2 = o1Var.a();
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, a2);
            w7.t.a(obtain, bundle);
            kVar.f16593a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == d1.class) {
            return Objects.equals(this.f16510a.asBinder(), ((d1) obj).f16510a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i10, r1 r1Var, boolean z10, boolean z11, int i11) {
        Bundle b10 = r1Var.a(z10, z11).b(i11);
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, b10);
            kVar.f16593a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g() {
        w7.w.a(this.f16510a);
    }

    @Override
    public final void h(int i10, k1 k1Var, b2.b1 b1Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i11 = this.f16511b;
        if (i11 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        u6.p(z12);
        if (!z10 && b1Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !b1Var.a(30)) {
            z13 = true;
        }
        l lVar = this.f16510a;
        if (i11 >= 2) {
            Bundle f7 = k1Var.e(b1Var, z10, z11).f(i11);
            Bundle bundle = new Bundle();
            bundle.putBoolean(j1.f16591a, r32);
            bundle.putBoolean(j1.f16592b, z13);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i10);
                w7.t.a(obtain, f7);
                w7.t.a(obtain, bundle);
                kVar.f16593a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = k1Var.e(b1Var, z10, true).f(i11);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, f10);
            obtain.writeInt(r32);
            kVar2.f16593a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16510a.asBinder());
    }

    @Override
    public final void j(int i10, s1 s1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(s1.e, s1Var.f16727a);
        bundle.putBundle(s1.f16725f, s1Var.f16728b);
        bundle.putLong(s1.f16726g, s1Var.f16729c);
        q1 q1Var = s1Var.d;
        if (q1Var != null) {
            bundle.putBundle(s1.h, q1Var.a());
        }
        k kVar = (k) this.f16510a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.t.a(obtain, bundle);
            kVar.f16593a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
