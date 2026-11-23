package ki;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import hi.e7;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class a0 extends AsyncTask {
    public String f18564a;
    public long f18565b;
    public final String f18566c;
    public final e7 d;

    public a0(String str, e7 e7Var) {
        this.f18566c = str;
        this.d = e7Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f18566c).openConnection();
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
                this.f18565b = httpURLConnection.getContentLengthLong();
            } else {
                this.f18565b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f18564a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f18564a;
                this.f18564a = str.substring(0, str.indexOf("; "));
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
        g0.h.put(this.f18566c, new Pair(this.f18564a, Long.valueOf(this.f18565b)));
        this.d.a(this.f18564a, Long.valueOf(this.f18565b));
    }
}
