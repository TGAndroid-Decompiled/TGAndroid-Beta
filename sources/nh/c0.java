package nh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import lh.a8;
import org.telegram.messenger.FileLog;

public final class c0 extends AsyncTask {

    public String f18608a;

    public long f18609b;

    public final String f18610c;
    public final a8 d;

    public c0(String str, a8 a8Var) {
        this.f18610c = str;
        this.d = a8Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f18610c).openConnection();
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
                this.f18609b = httpURLConnection.getContentLengthLong();
            } else {
                this.f18609b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f18608a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f18608a;
                this.f18608a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        j0.h.put(this.f18610c, new Pair(this.f18608a, Long.valueOf(this.f18609b)));
        this.d.run(this.f18608a, Long.valueOf(this.f18609b));
    }
}
