package ki;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import hi.q4;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;
public final class c0 extends AsyncTask {
    public String f18229a;
    public long f18230b;
    public final String f18231c;
    public final q4 d;

    public c0(String str, q4 q4Var) {
        this.f18231c = str;
        this.d = q4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f18231c).openConnection();
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
                this.f18230b = httpURLConnection.getContentLengthLong();
            } else {
                this.f18230b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f18229a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f18229a;
                this.f18229a = str.substring(0, str.indexOf("; "));
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
        i0.h.put(this.f18231c, new Pair(this.f18229a, Long.valueOf(this.f18230b)));
        this.d.a(this.f18229a, Long.valueOf(this.f18230b));
    }
}
