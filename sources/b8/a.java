package b8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class a implements IInterface {
    public final int f2455a;
    public final IBinder f2456b;
    public final String f2457c;

    public a(IBinder iBinder, String str, int i3) {
        this.f2455a = i3;
        this.f2456b = iBinder;
        this.f2457c = str;
    }

    public Parcel H0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2457c);
        return obtain;
    }

    public void I0(Parcel parcel, int i3) {
        try {
            this.f2456b.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel J0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2457c);
        return obtain;
    }

    public void K0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2456b.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel L0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2457c);
        return obtain;
    }

    public void M0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2456b.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel N0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel O0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel P0() {
        switch (this.f2455a) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f2457c);
                return obtain;
            case 8:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f2457c);
                return obtain2;
            case 9:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f2457c);
                return obtain3;
            case 10:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.f2457c);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.f2457c);
                return obtain5;
        }
    }

    public Parcel Q0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel R0(Parcel parcel, int i3) {
        switch (this.f2455a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.f2456b.transact(i3, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e10) {
                        obtain.recycle();
                        throw e10;
                    }
                } finally {
                }
            case 1:
            default:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f2456b.transact(i3, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e11) {
                        obtain2.recycle();
                        throw e11;
                    }
                } finally {
                }
            case 2:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.f2456b.transact(i3, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } finally {
                    }
                } catch (RuntimeException e12) {
                    obtain3.recycle();
                    throw e12;
                }
        }
    }

    public void S0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2456b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void T0(Parcel parcel, int i3) {
        Parcel obtain;
        switch (this.f2455a) {
            case 0:
                obtain = Parcel.obtain();
                try {
                    this.f2456b.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
                obtain = Parcel.obtain();
                try {
                    this.f2456b.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 9:
                obtain = Parcel.obtain();
                try {
                    this.f2456b.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 10:
                obtain = Parcel.obtain();
                try {
                    this.f2456b.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f2456b.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void U0(Parcel parcel, int i3) {
        try {
            this.f2456b.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel V0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2457c);
        return obtain;
    }

    public Parcel W0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        switch (this.f2455a) {
            case 0:
                return this.f2456b;
            case 1:
                return this.f2456b;
            case 2:
                return this.f2456b;
            case 3:
                return this.f2456b;
            case 4:
                return this.f2456b;
            case 5:
                return this.f2456b;
            case 6:
                return this.f2456b;
            case 7:
                return this.f2456b;
            case 8:
                return this.f2456b;
            case 9:
                return this.f2456b;
            case 10:
                return this.f2456b;
            default:
                return this.f2456b;
        }
    }
}
