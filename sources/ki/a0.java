package ki;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import hi.d7;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class a0 extends AsyncTask {
    public String f18595a;
    public long f18596b;
    public final String f18597c;
    public final d7 d;

    public a0(String str, d7 d7Var) {
        this.f18597c = str;
        this.d = d7Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f18597c).openConnection();
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
                this.f18596b = httpURLConnection.getContentLengthLong();
            } else {
                this.f18596b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f18595a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f18595a;
                this.f18595a = str.substring(0, str.indexOf("; "));
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
        g0.h.put(this.f18597c, new Pair(this.f18595a, Long.valueOf(this.f18596b)));
        this.d.a(this.f18595a, Long.valueOf(this.f18596b));
    }
}
