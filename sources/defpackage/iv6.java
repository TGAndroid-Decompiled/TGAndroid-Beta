package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public final class iv6 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final rv6 d;

    public iv6(rv6 rv6Var) {
        Bitmap bitmap;
        this.d = rv6Var;
        MediaDescriptionCompat mediaDescriptionCompat = rv6Var.c0;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
        }
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = rv6Var.c0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(30000);
            openConnection.setReadTimeout(30000);
            openInputStream = openConnection.getInputStream();
        } else {
            openInputStream = this.d.E.getContentResolver().openInputStream(uri);
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv6.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        rv6 rv6Var = this.d;
        rv6Var.d0 = null;
        Bitmap bitmap2 = rv6Var.e0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(rv6Var.f0, uri)) {
            return;
        }
        rv6Var.e0 = bitmap3;
        rv6Var.h0 = bitmap;
        rv6Var.f0 = uri;
        rv6Var.i0 = this.c;
        rv6Var.g0 = true;
        rv6Var.k();
    }

    @Override
    public final void onPreExecute() {
        rv6 rv6Var = this.d;
        rv6Var.g0 = false;
        rv6Var.h0 = null;
        rv6Var.i0 = 0;
    }
}
