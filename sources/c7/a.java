package c7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    public final int f2455a;

    public final IBinder f2456b;

    public final String f2457c;

    public a(IBinder iBinder, String str, int i10) {
        this.f2455a = i10;
        this.f2456b = iBinder;
        this.f2457c = str;
    }

    public Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2457c);
        return parcelObtain;
    }

    public void F0(Parcel parcel, int i10) {
        try {
            this.f2456b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel G0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2457c);
        return parcelObtain;
    }

    public void H0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2456b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel I0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2457c);
        return parcelObtain;
    }

    public void J0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2456b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel K0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel L0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel M0() {
        switch (this.f2455a) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f2457c);
                return parcelObtain;
            case 1:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f2457c);
                return parcelObtain2;
            case 2:
            case 3:
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f2457c);
                return parcelObtain3;
            case 4:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(this.f2457c);
                return parcelObtain4;
            case 5:
                Parcel parcelObtain5 = Parcel.obtain();
                parcelObtain5.writeInterfaceToken(this.f2457c);
                return parcelObtain5;
        }
    }

    public Parcel N0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel O0(Parcel parcel, int i10) {
        switch (this.f2455a) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    try {
                        this.f2456b.transact(i10, parcel, parcelObtain, 0);
                        parcelObtain.readException();
                        parcel.recycle();
                        return parcelObtain;
                    } catch (RuntimeException e9) {
                        parcelObtain.recycle();
                        throw e9;
                    }
                } catch (Throwable th) {
                    parcel.recycle();
                    throw th;
                }
            case 5:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.f2456b.transact(i10, parcel, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcel.recycle();
                        return parcelObtain2;
                    } catch (Throwable th2) {
                        parcel.recycle();
                        throw th2;
                    }
                } catch (RuntimeException e10) {
                    parcelObtain2.recycle();
                    throw e10;
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    try {
                        this.f2456b.transact(i10, parcel, parcelObtain3, 0);
                        parcelObtain3.readException();
                        parcel.recycle();
                        return parcelObtain3;
                    } catch (RuntimeException e11) {
                        parcelObtain3.recycle();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    parcel.recycle();
                    throw th3;
                }
        }
    }

    public void P0(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2456b.transact(3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void Q0(Parcel parcel, int i10) {
        switch (this.f2455a) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    this.f2456b.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            case 1:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    this.f2456b.transact(i10, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
            case 2:
            case 3:
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    this.f2456b.transact(i10, parcel, parcelObtain3, 0);
                    parcelObtain3.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain3.recycle();
                }
            case 4:
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    this.f2456b.transact(i10, parcel, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain4.recycle();
                }
            case 5:
                Parcel parcelObtain5 = Parcel.obtain();
                try {
                    this.f2456b.transact(i10, parcel, parcelObtain5, 0);
                    parcelObtain5.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain5.recycle();
                }
        }
    }

    public void R0(Parcel parcel, int i10) {
        try {
            this.f2456b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel S0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2457c);
        return parcelObtain;
    }

    public Parcel T0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2456b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override
    public final IBinder asBinder() {
        switch (this.f2455a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.f2456b;
    }
}
