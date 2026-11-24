package defpackage;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
public final class gq0 extends AsyncTask {
    public String a;
    public long b;
    public final String c;
    public final f d;

    public gq0(String str, f fVar) {
        this.c = str;
        this.d = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.setReadTimeout(1000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(false);
            httpURLConnection.getResponseCode();
            if (Build.VERSION.SDK_INT >= 24) {
                this.b = httpURLConnection.getContentLengthLong();
            } else {
                this.b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.a = contentType;
            if (contentType.contains("; ")) {
                String str = this.a;
                this.a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        mq0.h.put(this.c, new Pair(this.a, Long.valueOf(this.b)));
        this.d.a(this.a, Long.valueOf(this.b));
    }
}
