package f6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.v;
public final class b extends AsyncTask {
    public static final g6.b f8965c = new g6.b("FetchBitmapTask", null);
    public final e f8966a;
    public final cf.c f8967b;

    public b(Context context, int i10, int i11, cf.c cVar) {
        e eVar;
        this.f8967b = cVar;
        Context applicationContext = context.getApplicationContext();
        d6.j jVar = new d6.j(this);
        g6.b bVar = com.google.android.gms.internal.cast.e.f6330a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            x6.b bVar2 = new x6.b(applicationContext.getApplicationContext());
            Parcel Q0 = b10.Q0(b10.O0(), 8);
            int readInt = Q0.readInt();
            Q0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.a1(bVar2, new x6.b(this), jVar, i10, i11);
            } else {
                eVar = b10.Z0(new x6.b(this), jVar, i10, i11);
            }
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.internal.cast.e.f6330a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f8966a = eVar;
        } catch (d6.d e7) {
            e = e7;
            com.google.android.gms.internal.cast.e.f6330a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f8966a = eVar;
        }
        this.f8966a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f8966a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel O0 = cVar.O0();
                v.c(O0, uri);
                Parcel Q0 = cVar.Q0(O0, 1);
                Bitmap bitmap = (Bitmap) v.a(Q0, Bitmap.CREATOR);
                Q0.recycle();
                return bitmap;
            } catch (RemoteException e) {
                f8965c.a(e, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        cf.c cVar = this.f8967b;
        if (cVar != null) {
            a aVar = (a) cVar.e;
            if (aVar != null) {
                aVar.q(bitmap);
            }
            cVar.d = null;
        }
    }
}
