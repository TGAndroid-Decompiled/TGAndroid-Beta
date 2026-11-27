package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public final class xu6 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final bv6 e;

    public xu6(bv6 bv6Var) {
        Bitmap bitmap;
        this.e = bv6Var;
        MediaDescriptionCompat mediaDescriptionCompat = bv6Var.m0;
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
        MediaDescriptionCompat mediaDescriptionCompat2 = bv6Var.m0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            short s = bv6.G0;
            openConnection.setConnectTimeout(s);
            openConnection.setReadTimeout(s);
            openInputStream = openConnection.getInputStream();
        } else {
            openInputStream = this.e.s.getContentResolver().openInputStream(uri);
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu6.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bv6 bv6Var = this.e;
        bv6Var.n0 = null;
        Bitmap bitmap2 = bv6Var.o0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(bv6Var.p0, uri)) {
            return;
        }
        bv6Var.o0 = bitmap3;
        bv6Var.r0 = bitmap;
        bv6Var.p0 = uri;
        bv6Var.s0 = this.c;
        boolean z = true;
        bv6Var.q0 = true;
        if (SystemClock.uptimeMillis() - this.d <= 120) {
            z = false;
        }
        bv6Var.q(z);
    }

    @Override
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        bv6 bv6Var = this.e;
        bv6Var.q0 = false;
        bv6Var.r0 = null;
        bv6Var.s0 = 0;
    }
}
