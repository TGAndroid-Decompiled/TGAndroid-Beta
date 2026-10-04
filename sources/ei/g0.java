package ei;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class g0 extends AsyncTask {
    public String f9054a;
    public long f9055b;
    public final String f9056c;
    public final bi.v d;

    public g0(String str, bi.v vVar) {
        this.f9056c = str;
        this.d = vVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9056c).openConnection();
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
                this.f9055b = httpURLConnection.getContentLengthLong();
            } else {
                this.f9055b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f9054a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f9054a;
                this.f9054a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        m0.h.put(this.f9056c, new Pair(this.f9054a, Long.valueOf(this.f9055b)));
        this.d.run(this.f9054a, Long.valueOf(this.f9055b));
    }
}
