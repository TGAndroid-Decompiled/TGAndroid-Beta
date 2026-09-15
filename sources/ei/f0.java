package ei;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class f0 extends AsyncTask {
    public String f8319a;
    public long f8320b;
    public final String f8321c;
    public final bi.v d;

    public f0(String str, bi.v vVar) {
        this.f8321c = str;
        this.d = vVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f8321c).openConnection();
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
                this.f8320b = httpURLConnection.getContentLengthLong();
            } else {
                this.f8320b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f8319a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f8319a;
                this.f8319a = str.substring(0, str.indexOf("; "));
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
        l0.h.put(this.f8321c, new Pair(this.f8319a, Long.valueOf(this.f8320b)));
        this.d.run(this.f8319a, Long.valueOf(this.f8320b));
    }
}
