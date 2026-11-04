package h6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import b8.ke;
import com.google.android.gms.internal.cast.u;
import f6.j;
public final class b extends AsyncTask {
    public static final i6.b f14308c = new i6.b("FetchBitmapTask", null);
    public final e f14309a;
    public final ke f14310b;

    public b(Context context, int i3, int i10, ke keVar) {
        e eVar;
        this.f14310b = keVar;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        i6.b bVar = com.google.android.gms.internal.cast.d.f6891a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            z6.b bVar2 = new z6.b(applicationContext.getApplicationContext());
            Parcel R0 = b10.R0(b10.P0(), 8);
            int readInt = R0.readInt();
            R0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.b1(bVar2, new z6.b(this), jVar, i3, i10);
            } else {
                eVar = b10.a1(new z6.b(this), jVar, i3, i10);
            }
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.f6891a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f14309a = eVar;
        } catch (f6.d e11) {
            e = e11;
            com.google.android.gms.internal.cast.d.f6891a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f14309a = eVar;
        }
        this.f14309a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f14309a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel P0 = cVar.P0();
                u.c(P0, uri);
                Parcel R0 = cVar.R0(P0, 1);
                Bitmap bitmap = (Bitmap) u.a(R0, Bitmap.CREATOR);
                R0.recycle();
                return bitmap;
            } catch (RemoteException e10) {
                f14308c.a(e10, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ke keVar = this.f14310b;
        if (keVar != null) {
            a aVar = (a) keVar.f2719f;
            if (aVar != null) {
                aVar.z(bitmap);
            }
            keVar.f2718e = null;
        }
    }
}
