package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class lz6 implements ww6 {
    public final gk5 a;
    public final int b;

    public lz6(gk5 gk5Var, int i) {
        this.a = gk5Var;
        this.b = i;
    }

    @Override
    public final void a(int i, h9a h9aVar) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a = h9aVar.a();
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            qoe.a(obtain, a);
            qoe.a(obtain, bundle);
            fk5Var.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i) {
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            fk5Var.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i, int i2, int i3) {
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            fk5Var.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i, u26 u26Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(u26.d, u26Var.a);
        bundle.putLong(u26.e, u26Var.b);
        bundle.putBundle(u26.g, u26Var.c.a());
        bundle.putInt(u26.f, 4);
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            qoe.a(obtain, bundle);
            fk5Var.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e() {
        pye.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == lz6.class) {
            return Objects.equals(this.a.asBinder(), ((lz6) obj).a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i, zf8 zf8Var) {
        Bundle b = zf8Var.b();
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            qoe.a(obtain, b);
            fk5Var.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g(int i, gaa gaaVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(gaa.e, gaaVar.a);
        bundle.putBundle(gaa.f, gaaVar.b);
        bundle.putLong(gaa.g, gaaVar.c);
        t9a t9aVar = gaaVar.d;
        if (t9aVar != null) {
            bundle.putBundle(gaa.h, t9aVar.a());
        }
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            qoe.a(obtain, bundle);
            fk5Var.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void h(int i, kg8 kg8Var, zf8 zf8Var, boolean z, boolean z2) {
        boolean z3;
        ?? r3;
        Parcel obtain;
        boolean z4 = false;
        int i2 = this.b;
        if (i2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        yve.p(z3);
        if (!z && zf8Var.a(17)) {
            r3 = 0;
        } else {
            r3 = 1;
        }
        if (z2 || !zf8Var.a(30)) {
            z4 = true;
        }
        gk5 gk5Var = this.a;
        if (i2 >= 2) {
            Bundle f = kg8Var.e(zf8Var, z, z2).f(i2);
            Bundle bundle = new Bundle();
            bundle.putBoolean(jg8.a, r3);
            bundle.putBoolean(jg8.b, z4);
            fk5 fk5Var = (fk5) gk5Var;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i);
                qoe.a(obtain, f);
                qoe.a(obtain, bundle);
                fk5Var.a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f2 = kg8Var.e(zf8Var, z, true).f(i2);
        fk5 fk5Var2 = (fk5) gk5Var;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            qoe.a(obtain, f2);
            obtain.writeInt(r3);
            fk5Var2.a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override
    public final void i(int i, daa daaVar, boolean z, boolean z2, int i2) {
        Bundle b = daaVar.a(z, z2).b(i2);
        fk5 fk5Var = (fk5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            qoe.a(obtain, b);
            fk5Var.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
