package d9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class b implements ServiceConnection {
    public c9.c f8264a;
    public final c f8265b;

    public b(c cVar) {
        this.f8265b = cVar;
    }

    public static boolean a(b bVar) {
        if (bVar.f8264a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z10;
        c9.c cVar = this.f8264a;
        if (cVar != null) {
            c9.a aVar = (c9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = i5.a.f13875a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel F0 = aVar.F0(obtain, 1);
            if (F0.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            F0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z10;
        c9.c aVar;
        z10 = this.f8265b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = c9.b.f6167a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof c9.c) {
                aVar = (c9.c) queryLocalInterface;
            } else {
                aVar = new c9.a(iBinder);
            }
        }
        this.f8264a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        this.f8264a = null;
        z10 = this.f8265b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
