package ki;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import hi.y7;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class a0 extends AsyncTask {
    public String f18660a;
    public long f18661b;
    public final String f18662c;
    public final y7 d;

    public a0(String str, y7 y7Var) {
        this.f18662c = str;
        this.d = y7Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f18662c).openConnection();
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
                this.f18661b = httpURLConnection.getContentLengthLong();
            } else {
                this.f18661b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f18660a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f18660a;
                this.f18660a = str.substring(0, str.indexOf("; "));
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
        g0.h.put(this.f18662c, new Pair(this.f18660a, Long.valueOf(this.f18661b)));
        this.d.a(this.f18660a, Long.valueOf(this.f18661b));
    }
}
