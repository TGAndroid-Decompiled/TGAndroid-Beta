package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;
public final class hz6 implements rw6 {
    public final dk5 a;
    public final int b;

    public hz6(dk5 dk5Var, int i) {
        this.a = dk5Var;
        this.b = i;
    }

    @Override
    public final void a(int i, r7a r7aVar) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a = r7aVar.a();
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, a);
            yle.a(obtain, bundle);
            ck5Var.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void b(int i) {
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            ck5Var.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i, int i2, int i3) {
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            ck5Var.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i, q26 q26Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(q26.d, q26Var.a);
        bundle.putLong(q26.e, q26Var.b);
        bundle.putBundle(q26.g, q26Var.c.a());
        bundle.putInt(q26.f, 4);
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, bundle);
            ck5Var.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e() {
        zve.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == hz6.class) {
            return Objects.equals(this.a.asBinder(), ((hz6) obj).a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i, ne8 ne8Var) {
        Bundle b = ne8Var.b();
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, b);
            ck5Var.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g(int i, q8a q8aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(q8a.e, q8aVar.a);
        bundle.putBundle(q8a.f, q8aVar.b);
        bundle.putLong(q8a.g, q8aVar.c);
        d8a d8aVar = q8aVar.d;
        if (d8aVar != null) {
            bundle.putBundle(q8a.h, d8aVar.a());
        }
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, bundle);
            ck5Var.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void h(int i, ye8 ye8Var, ne8 ne8Var, boolean z, boolean z2) {
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
        jte.p(z3);
        if (!z && ne8Var.a(17)) {
            r3 = 0;
        } else {
            r3 = 1;
        }
        if (z2 || !ne8Var.a(30)) {
            z4 = true;
        }
        dk5 dk5Var = this.a;
        if (i2 >= 2) {
            Bundle f = ye8Var.e(ne8Var, z, z2).f(i2);
            Bundle bundle = new Bundle();
            bundle.putBoolean(xe8.a, r3);
            bundle.putBoolean(xe8.b, z4);
            ck5 ck5Var = (ck5) dk5Var;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i);
                yle.a(obtain, f);
                yle.a(obtain, bundle);
                ck5Var.a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f2 = ye8Var.e(ne8Var, z, true).f(i2);
        ck5 ck5Var2 = (ck5) dk5Var;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, f2);
            obtain.writeInt(r3);
            ck5Var2.a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override
    public final void i(int i, n8a n8aVar, boolean z, boolean z2, int i2) {
        Bundle b = n8aVar.a(z, z2).b(i2);
        ck5 ck5Var = (ck5) this.a;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            yle.a(obtain, b);
            ck5Var.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
