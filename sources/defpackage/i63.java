package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
public final class i63 extends Binder implements IInterface {
    public final byte a = 1;
    public final Object b;

    public i63(k1f k1fVar) {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 0:
                Handler handler = (Handler) this.b;
                Bundle bundle = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 1598968902) {
                                    return super.onTransact(i, parcel, parcel2, i2);
                                }
                                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                                return true;
                            }
                            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                            String readString = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            handler.post(new sw(this, readString, bundle, (byte) 5));
                            parcel2.writeNoException();
                            return true;
                        }
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        handler.post(new sw(this, bundle, (byte) 4));
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    handler.post(new sw(this, readString2, bundle, (byte) 3));
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                handler.post(new sw(this, readInt, bundle));
                parcel2.writeNoException();
                return true;
            default:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return false;
                        }
                        y6f y6fVar = (y6f) qid.a(parcel, y6f.CREATOR);
                        return true;
                    }
                    Status status = (Status) qid.a(parcel, Status.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qid.a(parcel, ParcelFileDescriptor.CREATOR);
                    return true;
                }
                ((jbf) this.b).a((Status) qid.a(parcel, Status.CREATOR));
                return true;
        }
    }

    public i63(jbf jbfVar) {
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.b = jbfVar;
    }
}
