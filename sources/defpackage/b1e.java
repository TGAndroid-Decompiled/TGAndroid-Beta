package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
public final class b1e extends AsyncTask {
    public static final ce6 c = new ce6("FetchBitmapTask", null);
    public final yje a;
    public final sm2 b;

    public b1e(Context context, int i, int i2, sm2 sm2Var) {
        yje yjeVar;
        this.b = sm2Var;
        Context applicationContext = context.getApplicationContext();
        t7d t7dVar = new t7d(this);
        ce6 ce6Var = v8d.a;
        try {
            q9d b = v8d.b(applicationContext.getApplicationContext());
            eq7 eq7Var = new eq7(applicationContext.getApplicationContext());
            Parcel T = b.T(b.R(), 8);
            int readInt = T.readInt();
            T.recycle();
            if (readInt >= 233700000) {
                yjeVar = b.d0(eq7Var, new eq7(this), t7dVar, i, i2);
            } else {
                yjeVar = b.c0(new eq7(this), t7dVar, i, i2);
            }
        } catch (RemoteException | sg7 e) {
            v8d.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", q9d.class.getSimpleName());
            yjeVar = null;
        }
        this.a = yjeVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        yje yjeVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (yjeVar = this.a) != null) {
            try {
                e8e e8eVar = (e8e) yjeVar;
                Parcel R = e8eVar.R();
                kid.c(R, uri);
                Parcel T = e8eVar.T(R, 1);
                Bitmap bitmap = (Bitmap) kid.a(T, Bitmap.CREATOR);
                T.recycle();
                return bitmap;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "doFetch", yje.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        sm2 sm2Var = this.b;
        if (sm2Var != null) {
            z6d z6dVar = (z6d) sm2Var.f;
            if (z6dVar != null) {
                z6dVar.d(bitmap);
            }
            sm2Var.e = null;
        }
    }
}
