package a7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class a implements IInterface {
    public final int f123a;
    public final IBinder f124b;
    public final String f125c;

    public a(IBinder iBinder, String str, int i10) {
        this.f123a = i10;
        this.f124b = iBinder;
        this.f125c = str;
    }

    public Parcel E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f125c);
        return obtain;
    }

    public void F0(Parcel parcel, int i10) {
        try {
            this.f124b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f125c);
        return obtain;
    }

    public void H0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f124b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel I0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f125c);
        return obtain;
    }

    public void J0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f124b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel K0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f124b.transact(i10, parcel, obtain, 0);
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

    public Parcel L0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f124b.transact(i10, parcel, obtain, 0);
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

    public Parcel M0() {
        switch (this.f123a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f125c);
                return obtain;
            case 1:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f125c);
                return obtain2;
            case 2:
            case 3:
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f125c);
                return obtain3;
            case 4:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.f125c);
                return obtain4;
            case 5:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.f125c);
                return obtain5;
        }
    }

    public Parcel N0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f124b.transact(i10, parcel, obtain, 0);
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

    public Parcel O0(Parcel parcel, int i10) {
        switch (this.f123a) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.f124b.transact(i10, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e) {
                        obtain.recycle();
                        throw e;
                    }
                } finally {
                }
            case 6:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f124b.transact(i10, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } finally {
                    }
                } catch (RuntimeException e6) {
                    obtain2.recycle();
                    throw e6;
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.f124b.transact(i10, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e10) {
                        obtain3.recycle();
                        throw e10;
                    }
                } finally {
                }
        }
    }

    public void P0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f124b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void Q0(Parcel parcel, int i10) {
        Parcel obtain;
        switch (this.f123a) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.f124b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
            case 3:
            default:
                obtain = Parcel.obtain();
                try {
                    this.f124b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 4:
                obtain = Parcel.obtain();
                try {
                    this.f124b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 5:
                obtain = Parcel.obtain();
                try {
                    this.f124b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 6:
                obtain = Parcel.obtain();
                try {
                    this.f124b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void R0(Parcel parcel, int i10) {
        try {
            this.f124b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel S0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f125c);
        return obtain;
    }

    public Parcel T0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f124b.transact(i10, parcel, obtain, 0);
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

    @Override
    public final IBinder asBinder() {
        switch (this.f123a) {
            case 0:
                return this.f124b;
            case 1:
                return this.f124b;
            case 2:
                return this.f124b;
            case 3:
                return this.f124b;
            case 4:
                return this.f124b;
            case 5:
                return this.f124b;
            case 6:
                return this.f124b;
            case 7:
                return this.f124b;
            case 8:
                return this.f124b;
            case 9:
                return this.f124b;
            case 10:
                return this.f124b;
            default:
                return this.f124b;
        }
    }
}
