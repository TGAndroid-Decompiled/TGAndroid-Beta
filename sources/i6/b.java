package i6;

import a8.r7;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.t;
import g6.j;
public final class b extends AsyncTask {
    public static final j6.b f16152c = new j6.b("FetchBitmapTask", null);
    public final e f16153a;
    public final r7 f16154b;

    public b(Context context, int i7, int i10, r7 r7Var) {
        e eVar;
        this.f16154b = r7Var;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        j6.b bVar = com.google.android.gms.internal.cast.d.f6541a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            a7.b bVar2 = new a7.b(applicationContext.getApplicationContext());
            Parcel r12 = b10.r1(b10.p1(), 8);
            int readInt = r12.readInt();
            r12.recycle();
            if (readInt >= 233700000) {
                eVar = b10.B1(bVar2, new a7.b(this), jVar, i7, i10);
            } else {
                eVar = b10.A1(new a7.b(this), jVar, i7, i10);
            }
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.f6541a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f16153a = eVar;
        } catch (g6.d e11) {
            e = e11;
            com.google.android.gms.internal.cast.d.f6541a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f16153a = eVar;
        }
        this.f16153a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f16153a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel p12 = cVar.p1();
                t.c(p12, uri);
                Parcel r12 = cVar.r1(p12, 1);
                Bitmap bitmap = (Bitmap) t.a(r12, Bitmap.CREATOR);
                r12.recycle();
                return bitmap;
            } catch (RemoteException e10) {
                f16152c.a(e10, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        r7 r7Var = this.f16154b;
        if (r7Var != null) {
            a aVar = (a) r7Var.f620f;
            if (aVar != null) {
                aVar.v0(bitmap);
            }
            r7Var.f619e = null;
        }
    }
}
