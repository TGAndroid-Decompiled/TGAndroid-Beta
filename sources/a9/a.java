package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public abstract class a implements IInterface {
    public final int f317a;
    public final IBinder f318b;
    public final String f319c;

    public a(IBinder iBinder, String str, int i10) {
        this.f317a = i10;
        this.f318b = iBinder;
        this.f319c = str;
    }

    public Parcel F0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f319c);
        return obtain;
    }

    public void G0(Parcel parcel, int i10) {
        try {
            this.f318b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel H0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f319c);
        return obtain;
    }

    public void I0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f318b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel J0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f319c);
        return obtain;
    }

    public void K0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f318b.transact(i10, parcel, obtain, 0);
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
                this.f318b.transact(i10, parcel, obtain, 0);
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
                this.f318b.transact(i10, parcel, obtain, 0);
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
        switch (this.f317a) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f319c);
                return obtain;
            case 7:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f319c);
                return obtain2;
            case 8:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f319c);
                return obtain3;
            case 9:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.f319c);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.f319c);
                return obtain5;
        }
    }

    public Parcel O0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f318b.transact(i10, parcel, obtain, 0);
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
        switch (this.f317a) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.f318b.transact(i10, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e) {
                        obtain.recycle();
                        throw e;
                    }
                } finally {
                }
            case 10:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f318b.transact(i10, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } finally {
                    }
                } catch (RuntimeException e7) {
                    obtain2.recycle();
                    throw e7;
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.f318b.transact(i10, parcel, obtain3, 0);
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

    public void Q0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f318b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void R0(Parcel parcel, int i10) {
        Parcel obtain;
        switch (this.f317a) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.f318b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 8:
                obtain = Parcel.obtain();
                try {
                    this.f318b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 9:
                obtain = Parcel.obtain();
                try {
                    this.f318b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 10:
                obtain = Parcel.obtain();
                try {
                    this.f318b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f318b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void S0(Parcel parcel, int i10) {
        try {
            this.f318b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel T0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f319c);
        return obtain;
    }

    public Parcel U0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f318b.transact(i10, parcel, obtain, 0);
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
        switch (this.f317a) {
            case 0:
                return this.f318b;
            case 1:
                return this.f318b;
            case 2:
                return this.f318b;
            case 3:
                return this.f318b;
            case 4:
                return this.f318b;
            case 5:
                return this.f318b;
            case 6:
                return this.f318b;
            case 7:
                return this.f318b;
            case 8:
                return this.f318b;
            case 9:
                return this.f318b;
            case 10:
                return this.f318b;
            default:
                return this.f318b;
        }
    }
}
