package defpackage;

import android.os.IBinder;
import android.os.Parcel;
public final class gj5 implements hj5 {
    public IBinder a;

    @Override
    public final void B(long j, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void E(long j, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeFloat(f);
            this.a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final long H(byte[] bArr, byte[] bArr2, float f, float f2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z, jj5 jj5Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeByteArray(bArr);
            obtain.writeByteArray(bArr2);
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            obtain.writeInt(i);
            obtain.writeByteArray(bArr3);
            obtain.writeByteArray(bArr4);
            obtain.writeByteArray(bArr5);
            obtain.writeByteArray(bArr6);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeStrongInterface(jj5Var);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void I(long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void L(long j, int i, float f, float f2, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            obtain.writeInt(i2);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void M(long j, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeByteArray(bArr);
            this.a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }

    @Override
    public final void k(long j, float f, boolean z, boolean z2, boolean z3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeFloat(f);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(z3 ? 1 : 0);
            this.a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void l(long j, long j2, int i, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeLong(j2);
            obtain.writeInt(i);
            obtain.writeByteArray(bArr);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void r(long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void s(long j, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeByteArray(bArr);
            this.a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void u(long j, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeByteArray(bArr);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void v(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeStrongBinder(iBinder);
            this.a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void w(boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(13, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void y(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            obtain.writeInt(i2);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
