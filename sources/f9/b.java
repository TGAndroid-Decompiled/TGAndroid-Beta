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
    public e9.c f11467a;
    public final c f11468b;

    public b(c cVar) {
        this.f11468b = cVar;
    }

    public static boolean a(b bVar) {
        if (bVar.f11467a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z9;
        e9.c cVar = this.f11467a;
        if (cVar != null) {
            e9.a aVar = (e9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i7 = k5.a.f17218a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel H0 = aVar.H0(obtain, 1);
            if (H0.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            H0.recycle();
            if (z9) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e9.c aVar;
        if (this.f11468b.f11469a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i7 = e9.b.f10725a;
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
        this.f11467a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11467a = null;
        if (this.f11468b.f11469a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
