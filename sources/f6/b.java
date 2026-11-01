package f6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.u;
public final class b extends AsyncTask {
    public static final g6.b f6915c = new g6.b("FetchBitmapTask", null);
    public final e f6916a;
    public final bh.d f6917b;

    public b(Context context, int i10, int i11, bh.d dVar) {
        e eVar;
        this.f6917b = dVar;
        Context applicationContext = context.getApplicationContext();
        d6.j jVar = new d6.j(this);
        g6.b bVar = com.google.android.gms.internal.cast.d.f4635a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            x6.b bVar2 = new x6.b(applicationContext.getApplicationContext());
            Parcel R0 = b10.R0(b10.P0(), 8);
            int readInt = R0.readInt();
            R0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.b1(bVar2, new x6.b(this), jVar, i10, i11);
            } else {
                eVar = b10.a1(new x6.b(this), jVar, i10, i11);
            }
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.internal.cast.d.f4635a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f6916a = eVar;
        } catch (d6.d e7) {
            e = e7;
            com.google.android.gms.internal.cast.d.f4635a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f6916a = eVar;
        }
        this.f6916a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f6916a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel P0 = cVar.P0();
                u.c(P0, uri);
                Parcel R0 = cVar.R0(P0, 1);
                Bitmap bitmap = (Bitmap) u.a(R0, Bitmap.CREATOR);
                R0.recycle();
                return bitmap;
            } catch (RemoteException e) {
                f6915c.a(e, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bh.d dVar = this.f6917b;
        if (dVar != null) {
            a aVar = (a) dVar.e;
            if (aVar != null) {
                aVar.q(bitmap);
            }
            dVar.d = null;
        }
    }
}
