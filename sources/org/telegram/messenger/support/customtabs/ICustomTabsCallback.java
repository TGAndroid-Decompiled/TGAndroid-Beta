package org.telegram.messenger.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICustomTabsCallback extends IInterface {
    void extraCallback(String str, Bundle bundle) throws RemoteException;

    void onMessageChannelReady(Bundle bundle) throws RemoteException;

    void onNavigationEvent(int i, Bundle bundle) throws RemoteException;

    void onPostMessage(String str, Bundle bundle) throws RemoteException;

    public static abstract class Stub extends Binder implements ICustomTabsCallback {
        @Override
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                onNavigationEvent(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                extraCallback(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                onMessageChannelReady(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                onPostMessage(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
