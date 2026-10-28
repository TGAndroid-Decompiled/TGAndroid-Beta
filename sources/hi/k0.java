package hi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class k0 extends AsyncTask {
    public String f13057a;
    public long f13058b;
    public final String f13059c;
    public final ai.e d;

    public k0(String str, ai.e eVar) {
        this.f13059c = str;
        this.d = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f13059c).openConnection();
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
                this.f13058b = httpURLConnection.getContentLengthLong();
            } else {
                this.f13058b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f13057a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f13057a;
                this.f13057a = str.substring(0, str.indexOf("; "));
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
        q0.h.put(this.f13059c, new Pair(this.f13057a, Long.valueOf(this.f13058b)));
        this.d.run(this.f13057a, Long.valueOf(this.f13058b));
    }
}
