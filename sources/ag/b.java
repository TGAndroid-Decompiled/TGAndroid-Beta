package ag;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
public final class b extends Binder implements IInterface {
    public final Handler f418a;
    public final nb.a f419b;

    public b(nb.a aVar) {
        this.f419b = aVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f418a = new Handler(Looper.getMainLooper());
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        Handler handler = this.f418a;
        Bundle bundle = null;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 1598968902) {
                            return super.onTransact(i3, parcel, parcel2, i10);
                        }
                        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                        return true;
                    }
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    handler.post(new a(this, readString, bundle, 3));
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                handler.post(new a(this, bundle));
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            handler.post(new a(this, readString2, bundle, 1));
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        handler.post(new a(this, readInt, bundle));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
