package fi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class f0 extends AsyncTask {
    public String f9645a;
    public long f9646b;
    public final String f9647c;
    public final ci.u d;

    public f0(String str, ci.u uVar) {
        this.f9647c = str;
        this.d = uVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9647c).openConnection();
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
                this.f9646b = httpURLConnection.getContentLengthLong();
            } else {
                this.f9646b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f9645a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f9645a;
                this.f9645a = str.substring(0, str.indexOf("; "));
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
        l0.h.put(this.f9647c, new Pair(this.f9645a, Long.valueOf(this.f9646b)));
        this.d.run(this.f9645a, Long.valueOf(this.f9646b));
    }
}
