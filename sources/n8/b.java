package n8;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

public final class b implements ServiceConnection {

    public m8.c f18444a;

    public final c f18445b;

    public b(c cVar) {
        this.f18445b = cVar;
    }

    public static boolean a(b bVar) {
        return bVar.f18444a != null;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        m8.c cVar = this.f18444a;
        if (cVar != null) {
            m8.a aVar = (m8.a) cVar;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = s2.a.f47660a;
            if (intent == null) {
                parcelObtain.writeInt(0);
            } else {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            }
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            Parcel parcelE0 = aVar.E0(parcelObtain, 1);
            boolean z10 = parcelE0.readInt() != 0;
            parcelE0.recycle();
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m8.c aVar;
        if (this.f18445b.dbg) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = m8.b.f17880a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            aVar = iInterfaceQueryLocalInterface instanceof m8.c ? (m8.c) iInterfaceQueryLocalInterface : new m8.a(iBinder);
        }
        this.f18444a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f18444a = null;
        if (this.f18445b.dbg) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
