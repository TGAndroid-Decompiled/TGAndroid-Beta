package f6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import bi.u6;
import com.google.android.gms.internal.cast.v;
public final class b extends AsyncTask {
    public static final g6.b f7847c = new g6.b("FetchBitmapTask", null);
    public final e f7848a;
    public final u6 f7849b;

    public b(Context context, int i10, int i11, u6 u6Var) {
        e eVar;
        this.f7849b = u6Var;
        Context applicationContext = context.getApplicationContext();
        d6.j jVar = new d6.j(this);
        g6.b bVar = com.google.android.gms.internal.cast.e.f5103a;
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
            com.google.android.gms.internal.cast.e.f5103a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f7848a = eVar;
        } catch (d6.d e7) {
            e = e7;
            com.google.android.gms.internal.cast.e.f5103a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f7848a = eVar;
        }
        this.f7848a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f7848a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel O0 = cVar.O0();
                v.c(O0, uri);
                Parcel Q0 = cVar.Q0(O0, 1);
                Bitmap bitmap = (Bitmap) v.a(Q0, Bitmap.CREATOR);
                Q0.recycle();
                return bitmap;
            } catch (RemoteException e) {
                f7847c.a(e, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        u6 u6Var = this.f7849b;
        if (u6Var != null) {
            a aVar = (a) u6Var.e;
            if (aVar != null) {
                aVar.s(bitmap);
            }
            u6Var.d = null;
        }
    }
}
