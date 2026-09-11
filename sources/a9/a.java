package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class a implements IInterface {
    public final int f323a;
    public final IBinder f324b;
    public final String f325c;

    public a(IBinder iBinder, String str, int i10) {
        this.f323a = i10;
        this.f324b = iBinder;
        this.f325c = str;
    }

    public Parcel G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f325c);
        return obtain;
    }

    public void H0(Parcel parcel, int i10) {
        try {
            this.f324b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel I0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f325c);
        return obtain;
    }

    public void J0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f324b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel K0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f325c);
        return obtain;
    }

    public void L0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f324b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel M0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f324b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel N0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f324b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel O0() {
        switch (this.f323a) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f325c);
                return obtain;
            case 7:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f325c);
                return obtain2;
            case 8:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f325c);
                return obtain3;
            case 9:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.f325c);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.f325c);
                return obtain5;
        }
    }

    public Parcel P0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f324b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel Q0(Parcel parcel, int i10) {
        switch (this.f323a) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.f324b.transact(i10, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e7) {
                        obtain.recycle();
                        throw e7;
                    }
                } finally {
                }
            case 10:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f324b.transact(i10, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } finally {
                    }
                } catch (RuntimeException e10) {
                    obtain2.recycle();
                    throw e10;
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.f324b.transact(i10, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e11) {
                        obtain3.recycle();
                        throw e11;
                    }
                } finally {
                }
        }
    }

    public void R0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f324b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void S0(Parcel parcel, int i10) {
        Parcel obtain;
        switch (this.f323a) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.f324b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 8:
                obtain = Parcel.obtain();
                try {
                    this.f324b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 9:
                obtain = Parcel.obtain();
                try {
                    this.f324b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 10:
                obtain = Parcel.obtain();
                try {
                    this.f324b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f324b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void T0(Parcel parcel, int i10) {
        try {
            this.f324b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel U0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f325c);
        return obtain;
    }

    public Parcel V0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f324b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        switch (this.f323a) {
            case 0:
                return this.f324b;
            case 1:
                return this.f324b;
            case 2:
                return this.f324b;
            case 3:
                return this.f324b;
            case 4:
                return this.f324b;
            case 5:
                return this.f324b;
            case 6:
                return this.f324b;
            case 7:
                return this.f324b;
            case 8:
                return this.f324b;
            case 9:
                return this.f324b;
            case 10:
                return this.f324b;
            default:
                return this.f324b;
        }
    }
}
