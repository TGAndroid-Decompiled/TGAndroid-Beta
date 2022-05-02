package android.support.p000v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface INotificationSideChannel extends IInterface {
    void cancel(String packageName, int id, String tag) throws RemoteException;

    void cancelAll(String packageName) throws RemoteException;

    void notify(String packageName, int id, String tag, Notification notification) throws RemoteException;

    public static abstract class Stub extends Binder implements INotificationSideChannel {
        public static INotificationSideChannel asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                return new Proxy(obj);
            }
            return (INotificationSideChannel) queryLocalInterface;
        }

        public static class Proxy implements INotificationSideChannel {
            public static INotificationSideChannel sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override
            public void notify(String packageName, int id, String tag, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(packageName);
                    obtain.writeInt(id);
                    obtain.writeString(tag);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().notify(packageName, id, tag, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override
            public void cancel(String packageName, int id, String tag) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(packageName);
                    obtain.writeInt(id);
                    obtain.writeString(tag);
                    if (!this.mRemote.transact(2, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancel(packageName, id, tag);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override
            public void cancelAll(String packageName) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(packageName);
                    if (!this.mRemote.transact(3, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelAll(packageName);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static INotificationSideChannel getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
