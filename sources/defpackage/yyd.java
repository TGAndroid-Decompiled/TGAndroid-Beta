package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
public final class yyd extends AsyncTask {
    public static final dc6 c = new dc6("FetchBitmapTask", null);
    public final xhe a;
    public final gl2 b;

    public yyd(Context context, int i, int i2, gl2 gl2Var) {
        xhe xheVar;
        this.b = gl2Var;
        Context applicationContext = context.getApplicationContext();
        r5d r5dVar = new r5d(this);
        dc6 dc6Var = t6d.a;
        try {
            o7d b = t6d.b(applicationContext.getApplicationContext());
            bo7 bo7Var = new bo7(applicationContext.getApplicationContext());
            Parcel T = b.T(b.R(), 8);
            int readInt = T.readInt();
            T.recycle();
            if (readInt >= 233700000) {
                xheVar = b.d0(bo7Var, new bo7(this), r5dVar, i, i2);
            } else {
                xheVar = b.c0(new bo7(this), r5dVar, i, i2);
            }
        } catch (RemoteException | qe7 e) {
            t6d.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", o7d.class.getSimpleName());
            xheVar = null;
        }
        this.a = xheVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        xhe xheVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (xheVar = this.a) != null) {
            try {
                b6e b6eVar = (b6e) xheVar;
                Parcel R = b6eVar.R();
                jgd.c(R, uri);
                Parcel T = b6eVar.T(R, 1);
                Bitmap bitmap = (Bitmap) jgd.a(T, Bitmap.CREATOR);
                T.recycle();
                return bitmap;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "doFetch", xhe.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        gl2 gl2Var = this.b;
        if (gl2Var != null) {
            x4d x4dVar = (x4d) gl2Var.f;
            if (x4dVar != null) {
                x4dVar.b(bitmap);
            }
            gl2Var.e = null;
        }
    }
}
