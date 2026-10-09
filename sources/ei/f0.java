package ei;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class f0 extends AsyncTask {
    public String f9053a;
    public long f9054b;
    public final String f9055c;
    public final bi.v d;

    public f0(String str, bi.v vVar) {
        this.f9055c = str;
        this.d = vVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9055c).openConnection();
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
                this.f9054b = httpURLConnection.getContentLengthLong();
            } else {
                this.f9054b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f9053a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f9053a;
                this.f9053a = str.substring(0, str.indexOf("; "));
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
        l0.h.put(this.f9055c, new Pair(this.f9053a, Long.valueOf(this.f9054b)));
        this.d.run(this.f9053a, Long.valueOf(this.f9054b));
    }
}
