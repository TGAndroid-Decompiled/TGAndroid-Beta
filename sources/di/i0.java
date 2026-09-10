package di;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class i0 extends AsyncTask {
    public String f6668a;
    public long f6669b;
    public final String f6670c;
    public final ai.c0 d;

    public i0(String str, ai.c0 c0Var) {
        this.f6670c = str;
        this.d = c0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6670c).openConnection();
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
                this.f6669b = httpURLConnection.getContentLengthLong();
            } else {
                this.f6669b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f6668a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f6668a;
                this.f6668a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        o0.h.put(this.f6670c, new Pair(this.f6668a, Long.valueOf(this.f6669b)));
        this.d.run(this.f6668a, Long.valueOf(this.f6669b));
    }
}
