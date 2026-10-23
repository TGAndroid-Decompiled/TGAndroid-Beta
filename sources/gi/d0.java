package gi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class d0 extends AsyncTask {
    public String f11141a;
    public long f11142b;
    public final String f11143c;
    public final ai.q d;

    public d0(String str, ai.q qVar) {
        this.f11143c = str;
        this.d = qVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f11143c).openConnection();
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
                this.f11142b = httpURLConnection.getContentLengthLong();
            } else {
                this.f11142b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f11141a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f11141a;
                this.f11141a = str.substring(0, str.indexOf("; "));
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
        j0.h.put(this.f11143c, new Pair(this.f11141a, Long.valueOf(this.f11142b)));
        this.d.run(this.f11141a, Long.valueOf(this.f11142b));
    }
}
