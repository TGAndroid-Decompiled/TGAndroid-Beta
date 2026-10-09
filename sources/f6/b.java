package f6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import ci.u5;
import com.google.android.gms.internal.cast.v;
public final class b extends AsyncTask {
    public static final g6.b f9751c = new g6.b("FetchBitmapTask", null);
    public final e f9752a;
    public final u5 f9753b;

    public b(Context context, int i10, int i11, u5 u5Var) {
        e eVar;
        this.f9753b = u5Var;
        Context applicationContext = context.getApplicationContext();
        d6.j jVar = new d6.j(this);
        g6.b bVar = com.google.android.gms.internal.cast.e.f6862a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            x6.b bVar2 = new x6.b(applicationContext.getApplicationContext());
            Parcel P0 = b10.P0(b10.N0(), 8);
            int readInt = P0.readInt();
            P0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.Z0(bVar2, new x6.b(this), jVar, i10, i11);
            } else {
                eVar = b10.Y0(new x6.b(this), jVar, i10, i11);
            }
        } catch (RemoteException e7) {
            e = e7;
            com.google.android.gms.internal.cast.e.f6862a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f9752a = eVar;
        } catch (d6.d e10) {
            e = e10;
            com.google.android.gms.internal.cast.e.f6862a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f9752a = eVar;
        }
        this.f9752a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f9752a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel N0 = cVar.N0();
                v.c(N0, uri);
                Parcel P0 = cVar.P0(N0, 1);
                Bitmap bitmap = (Bitmap) v.a(P0, Bitmap.CREATOR);
                P0.recycle();
                return bitmap;
            } catch (RemoteException e7) {
                f9751c.a(e7, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        u5 u5Var = this.f9753b;
        if (u5Var != null) {
            a aVar = (a) u5Var.f6068e;
            if (aVar != null) {
                aVar.s(bitmap);
            }
            u5Var.d = null;
        }
    }
}
