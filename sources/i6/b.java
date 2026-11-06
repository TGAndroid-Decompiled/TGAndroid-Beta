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
    public static final j6.b f15351c = new j6.b("FetchBitmapTask", null);
    public final e f15352a;
    public final r7 f15353b;

    public b(Context context, int i7, int i10, r7 r7Var) {
        e eVar;
        this.f15353b = r7Var;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        j6.b bVar = com.google.android.gms.internal.cast.d.f6837a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            a7.b bVar2 = new a7.b(applicationContext.getApplicationContext());
            Parcel R0 = b10.R0(b10.P0(), 8);
            int readInt = R0.readInt();
            R0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.b1(bVar2, new a7.b(this), jVar, i7, i10);
            } else {
                eVar = b10.a1(new a7.b(this), jVar, i7, i10);
            }
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.f6837a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f15352a = eVar;
        } catch (g6.d e11) {
            e = e11;
            com.google.android.gms.internal.cast.d.f6837a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f15352a = eVar;
        }
        this.f15352a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f15352a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel P0 = cVar.P0();
                t.c(P0, uri);
                Parcel R0 = cVar.R0(P0, 1);
                Bitmap bitmap = (Bitmap) t.a(R0, Bitmap.CREATOR);
                R0.recycle();
                return bitmap;
            } catch (RemoteException e10) {
                f15351c.a(e10, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        r7 r7Var = this.f15353b;
        if (r7Var != null) {
            a aVar = (a) r7Var.f617f;
            if (aVar != null) {
                aVar.p(bitmap);
            }
            r7Var.f616e = null;
        }
    }
}
