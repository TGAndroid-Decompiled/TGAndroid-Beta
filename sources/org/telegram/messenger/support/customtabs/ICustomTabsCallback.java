package org.telegram.messenger.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICustomTabsCallback extends IInterface {

    public static abstract class Stub extends Binder implements ICustomTabsCallback {
        public Stub() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                onNavigationEvent(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                extraCallback(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                onMessageChannelReady(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                onPostMessage(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void extraCallback(String str, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onNavigationEvent(int i, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);
}
