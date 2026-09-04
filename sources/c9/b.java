package c9;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class b implements ServiceConnection {
    public b9.c f4705a;
    public final c f4706b;

    public b(c cVar) {
        this.f4706b = cVar;
    }

    public static boolean a(b bVar) {
        if (bVar.f4705a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z10;
        b9.c cVar = this.f4705a;
        if (cVar != null) {
            b9.a aVar = (b9.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = h5.a.f10890a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel G0 = aVar.G0(obtain, 1);
            if (G0.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            G0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z10;
        b9.c aVar;
        z10 = this.f4706b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = b9.b.f2517a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof b9.c) {
                aVar = (b9.c) queryLocalInterface;
            } else {
                aVar = new b9.a(iBinder);
            }
        }
        this.f4705a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        this.f4705a = null;
        z10 = this.f4706b.dbg;
        if (z10) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
