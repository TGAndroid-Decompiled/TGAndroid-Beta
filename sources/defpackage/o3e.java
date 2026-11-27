package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
public final class o3e extends AsyncTask {
    public static final he6 c = new he6("FetchBitmapTask", null);
    public final ome a;
    public final am2 b;

    public o3e(Context context, int i, int i2, am2 am2Var) {
        ome omeVar;
        this.b = am2Var;
        Context applicationContext = context.getApplicationContext();
        kad kadVar = new kad(this);
        he6 he6Var = mbd.a;
        try {
            hcd b = mbd.b(applicationContext.getApplicationContext());
            br7 br7Var = new br7(applicationContext.getApplicationContext());
            Parcel T = b.T(b.R(), 8);
            int readInt = T.readInt();
            T.recycle();
            if (readInt >= 233700000) {
                omeVar = b.d0(br7Var, new br7(this), kadVar, i, i2);
            } else {
                omeVar = b.c0(new br7(this), kadVar, i, i2);
            }
        } catch (ah7 | RemoteException e) {
            mbd.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", hcd.class.getSimpleName());
            omeVar = null;
        }
        this.a = omeVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        ome omeVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (omeVar = this.a) != null) {
            try {
                rae raeVar = (rae) omeVar;
                Parcel R = raeVar.R();
                ald.c(R, uri);
                Parcel T = raeVar.T(R, 1);
                Bitmap bitmap = (Bitmap) ald.a(T, Bitmap.CREATOR);
                T.recycle();
                return bitmap;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "doFetch", ome.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        am2 am2Var = this.b;
        if (am2Var != null) {
            q9d q9dVar = (q9d) am2Var.f;
            if (q9dVar != null) {
                q9dVar.b(bitmap);
            }
            am2Var.e = null;
        }
    }
}
