package hi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class a0 extends AsyncTask {
    public String f14494a;
    public long f14495b;
    public final String f14496c;
    public final ai.e d;

    public a0(String str, ai.e eVar) {
        this.f14496c = str;
        this.d = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f14496c).openConnection();
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
                this.f14495b = httpURLConnection.getContentLengthLong();
            } else {
                this.f14495b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f14494a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f14494a;
                this.f14494a = str.substring(0, str.indexOf("; "));
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
        g0.h.put(this.f14496c, new Pair(this.f14494a, Long.valueOf(this.f14495b)));
        this.d.a(this.f14494a, Long.valueOf(this.f14495b));
    }
}
