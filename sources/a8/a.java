package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class a implements IInterface {
    public final int f342a;
    public final IBinder f343b;
    public final String f344c;

    public a(IBinder iBinder, String str, int i10) {
        this.f342a = i10;
        this.f343b = iBinder;
        this.f344c = str;
    }

    public Parcel F0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f344c);
        return obtain;
    }

    public void G0(Parcel parcel, int i10) {
        try {
            this.f343b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel H0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f344c);
        return obtain;
    }

    public void I0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f343b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel J0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f344c);
        return obtain;
    }

    public void K0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f343b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel L0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f343b.transact(i10, parcel, obtain, 0);
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

    public Parcel M0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f343b.transact(i10, parcel, obtain, 0);
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

    public Parcel N0() {
        switch (this.f342a) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f344c);
                return obtain;
            case 8:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f344c);
                return obtain2;
            case 9:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f344c);
                return obtain3;
            case 10:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.f344c);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.f344c);
                return obtain5;
        }
    }

    public Parcel O0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f343b.transact(i10, parcel, obtain, 0);
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

    public Parcel P0(Parcel parcel, int i10) {
        switch (this.f342a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.f343b.transact(i10, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e) {
                        obtain.recycle();
                        throw e;
                    }
                } finally {
                }
            case 1:
            default:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f343b.transact(i10, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e10) {
                        obtain2.recycle();
                        throw e10;
                    }
                } finally {
                }
            case 2:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.f343b.transact(i10, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } finally {
                    }
                } catch (RuntimeException e11) {
                    obtain3.recycle();
                    throw e11;
                }
        }
    }

    public void Q0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f343b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void R0(Parcel parcel, int i10) {
        Parcel obtain;
        switch (this.f342a) {
            case 0:
                obtain = Parcel.obtain();
                try {
                    this.f343b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
                obtain = Parcel.obtain();
                try {
                    this.f343b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 9:
                obtain = Parcel.obtain();
                try {
                    this.f343b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 10:
                obtain = Parcel.obtain();
                try {
                    this.f343b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f343b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void S0(Parcel parcel, int i10) {
        try {
            this.f343b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel T0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f344c);
        return obtain;
    }

    public Parcel U0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f343b.transact(i10, parcel, obtain, 0);
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
        switch (this.f342a) {
            case 0:
                return this.f343b;
            case 1:
                return this.f343b;
            case 2:
                return this.f343b;
            case 3:
                return this.f343b;
            case 4:
                return this.f343b;
            case 5:
                return this.f343b;
            case 6:
                return this.f343b;
            case 7:
                return this.f343b;
            case 8:
                return this.f343b;
            case 9:
                return this.f343b;
            case 10:
                return this.f343b;
            default:
                return this.f343b;
        }
    }
}
