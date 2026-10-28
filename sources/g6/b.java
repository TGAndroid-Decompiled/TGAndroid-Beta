package g6;

import a8.me;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.t;
import e6.j;
public final class b extends AsyncTask {
    public static final h6.b f12353c = new h6.b("FetchBitmapTask", null);
    public final e f12354a;
    public final me f12355b;

    public b(Context context, int i10, int i11, me meVar) {
        e eVar;
        this.f12355b = meVar;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        h6.b bVar = com.google.android.gms.internal.cast.d.f6761a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            y6.b bVar2 = new y6.b(applicationContext.getApplicationContext());
            Parcel P0 = b10.P0(b10.N0(), 8);
            int readInt = P0.readInt();
            P0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.Z0(bVar2, new y6.b(this), jVar, i10, i11);
            } else {
                eVar = b10.Y0(new y6.b(this), jVar, i10, i11);
            }
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.internal.cast.d.f6761a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f12354a = eVar;
        } catch (e6.d e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.f6761a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f12354a = eVar;
        }
        this.f12354a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f12354a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel N0 = cVar.N0();
                t.c(N0, uri);
                Parcel P0 = cVar.P0(N0, 1);
                Bitmap bitmap = (Bitmap) t.a(P0, Bitmap.CREATOR);
                P0.recycle();
                return bitmap;
            } catch (RemoteException e) {
                f12353c.a(e, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        me meVar = this.f12355b;
        if (meVar != null) {
            a aVar = (a) meVar.e;
            if (aVar != null) {
                aVar.k(bitmap);
            }
            meVar.d = null;
        }
    }
}
