package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class ezc implements IInterface {
    public final byte a;
    public final IBinder b;
    public final String c;

    public ezc(IBinder iBinder, String str, byte b) {
        this.a = b;
        this.b = iBinder;
        this.c = str;
    }

    public final Parcel P(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel Q(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel R() {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 3:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            case 4:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
            case 5:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(str);
                return obtain3;
            case 6:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(str);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(str);
                return obtain5;
        }
    }

    public final Parcel S(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel T(Parcel parcel, int i) {
        byte b = this.a;
        IBinder iBinder = this.b;
        switch (b) {
            case 3:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e) {
                        obtain.recycle();
                        throw e;
                    }
                } finally {
                }
            case 7:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e2) {
                        obtain2.recycle();
                        throw e2;
                    }
                } finally {
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e3) {
                        obtain3.recycle();
                        throw e3;
                    }
                } finally {
                }
        }
    }

    public final void U(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void V(Parcel parcel, int i) {
        Parcel obtain;
        byte b = this.a;
        IBinder iBinder = this.b;
        switch (b) {
            case 3:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 4:
            default:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 5:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 6:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 7:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public final void W(Parcel parcel, int i) {
        try {
            this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel X() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public final Parcel Y(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    @Override
    public final IBinder asBinder() {
        byte b = this.a;
        return this.b;
    }

    public final void b(Parcel parcel, int i) {
        try {
            this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public final void d(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public final void f(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
