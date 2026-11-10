package hi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class a0 extends AsyncTask {
    public String f14496a;
    public long f14497b;
    public final String f14498c;
    public final ai.e d;

    public a0(String str, ai.e eVar) {
        this.f14498c = str;
        this.d = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f14498c).openConnection();
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
                this.f14497b = httpURLConnection.getContentLengthLong();
            } else {
                this.f14497b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f14496a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f14496a;
                this.f14496a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        g0.h.put(this.f14498c, new Pair(this.f14496a, Long.valueOf(this.f14497b)));
        this.d.a(this.f14496a, Long.valueOf(this.f14497b));
    }
}
