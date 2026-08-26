package org.telegram.messenger.support.customtabs;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.dynamite.zzf;

public final class CustomTabsClient$2 extends Binder implements IInterface {
    public final Handler mHandler;
    public final zzf val$callback;

    public CustomTabsClient$2(zzf zzfVar) {
        this.val$callback = zzfVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        Handler handler = this.mHandler;
        if (i == 2) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            parcel.readInt();
            if (parcel.readInt() != 0) {
            }
            final int i3 = 0;
            handler.post(new Runnable(this) {
                public final CustomTabsClient$2 this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.this$1.val$callback.getClass();
                            break;
                        case 1:
                            this.this$1.val$callback.getClass();
                            break;
                        case 2:
                            this.this$1.val$callback.getClass();
                            break;
                        default:
                            this.this$1.val$callback.getClass();
                            break;
                    }
                }
            });
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            parcel.readString();
            if (parcel.readInt() != 0) {
            }
            final int i4 = 1;
            handler.post(new Runnable(this) {
                public final CustomTabsClient$2 this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.this$1.val$callback.getClass();
                            break;
                        case 1:
                            this.this$1.val$callback.getClass();
                            break;
                        case 2:
                            this.this$1.val$callback.getClass();
                            break;
                        default:
                            this.this$1.val$callback.getClass();
                            break;
                    }
                }
            });
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            if (parcel.readInt() != 0) {
            }
            final int i5 = 2;
            handler.post(new Runnable(this) {
                public final CustomTabsClient$2 this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void run() {
                    switch (i5) {
                        case 0:
                            this.this$1.val$callback.getClass();
                            break;
                        case 1:
                            this.this$1.val$callback.getClass();
                            break;
                        case 2:
                            this.this$1.val$callback.getClass();
                            break;
                        default:
                            this.this$1.val$callback.getClass();
                            break;
                    }
                }
            });
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        parcel.readString();
        if (parcel.readInt() != 0) {
        }
        final int i6 = 3;
        handler.post(new Runnable(this) {
            public final CustomTabsClient$2 this$1;

            {
                this.this$1 = this;
            }

            @Override
            public final void run() {
                switch (i6) {
                    case 0:
                        this.this$1.val$callback.getClass();
                        break;
                    case 1:
                        this.this$1.val$callback.getClass();
                        break;
                    case 2:
                        this.this$1.val$callback.getClass();
                        break;
                    default:
                        this.this$1.val$callback.getClass();
                        break;
                }
            }
        });
        parcel2.writeNoException();
        return true;
    }
}
