package f9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class b implements ServiceConnection {
    public e9.c f11472a;
    public final c f11473b;

    public b(c cVar) {
        this.f11473b = cVar;
    }

    public static boolean a(b bVar) {
        if (bVar.f11472a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z9;
        e9.c cVar = this.f11472a;
        if (cVar != null) {
            e9.a aVar = (e9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i7 = k5.a.f17221a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel h12 = aVar.h1(obtain, 1);
            if (h12.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            h12.recycle();
            if (z9) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e9.c aVar;
        if (this.f11473b.f11474a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i7 = e9.b.f10730a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof e9.c) {
                aVar = (e9.c) queryLocalInterface;
            } else {
                aVar = new e9.a(iBinder);
            }
        }
        this.f11472a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11472a = null;
        if (this.f11473b.f11474a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
