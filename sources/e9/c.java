package e9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class c implements ServiceConnection {
    public d9.c f9910a;
    public final d f9911b;

    public c(d dVar) {
        this.f9911b = dVar;
    }

    public static boolean a(c cVar) {
        if (cVar.f9910a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z10;
        d9.c cVar = this.f9910a;
        if (cVar != null) {
            d9.a aVar = (d9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i3 = j5.a.f16203a;
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
                z10 = true;
            } else {
                z10 = false;
            }
            H0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d9.c aVar;
        if (this.f9911b.f9912a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i3 = d9.b.f8593a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof d9.c) {
                aVar = (d9.c) queryLocalInterface;
            } else {
                aVar = new d9.a(iBinder);
            }
        }
        this.f9910a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9910a = null;
        if (this.f9911b.f9912a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
