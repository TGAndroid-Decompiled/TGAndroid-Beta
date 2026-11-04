package ii;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class c0 extends AsyncTask {
    public String f14855a;
    public long f14856b;
    public final String f14857c;
    public final gi.q4 d;

    public c0(String str, gi.q4 q4Var) {
        this.f14857c = str;
        this.d = q4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f14857c).openConnection();
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
                this.f14856b = httpURLConnection.getContentLengthLong();
            } else {
                this.f14856b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f14855a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f14855a;
                this.f14855a = str.substring(0, str.indexOf("; "));
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
        i0.h.put(this.f14857c, new Pair(this.f14855a, Long.valueOf(this.f14856b)));
        this.d.a(this.f14855a, Long.valueOf(this.f14856b));
    }
}
