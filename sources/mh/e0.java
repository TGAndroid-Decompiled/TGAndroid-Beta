package mh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import kh.b8;
import org.telegram.messenger.FileLog;
public final class e0 extends AsyncTask {
    public String f17811a;
    public long f17812b;
    public final String f17813c;
    public final b8 d;

    public e0(String str, b8 b8Var) {
        this.f17813c = str;
        this.d = b8Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17813c).openConnection();
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
                this.f17812b = httpURLConnection.getContentLengthLong();
            } else {
                this.f17812b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f17811a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f17811a;
                this.f17811a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        k0.h.put(this.f17813c, new Pair(this.f17811a, Long.valueOf(this.f17812b)));
        this.d.run(this.f17811a, Long.valueOf(this.f17812b));
    }
}
