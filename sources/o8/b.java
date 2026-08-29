package o8;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class b implements ServiceConnection {
    public n8.c f19468a;
    public final c f19469b;

    public b(c cVar) {
        this.f19469b = cVar;
    }

    public static boolean a(b bVar) {
        if (bVar.f19468a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z10;
        n8.c cVar = this.f19468a;
        if (cVar != null) {
            n8.a aVar = (n8.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = u2.a.f48960a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel E0 = aVar.E0(obtain, 1);
            if (E0.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            E0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z10;
        n8.c aVar;
        z10 = this.f19469b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = n8.b.f17163a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof n8.c) {
                aVar = (n8.c) queryLocalInterface;
            } else {
                aVar = new n8.a(iBinder);
            }
        }
        this.f19468a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        this.f19468a = null;
        z10 = this.f19469b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
