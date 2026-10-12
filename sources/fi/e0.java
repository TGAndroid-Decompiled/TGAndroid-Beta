package fi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
public final class e0 extends AsyncTask {
    public String f9238a;
    public long f9239b;
    public final String f9240c;
    public final ci.u d;

    public e0(String str, ci.u uVar) {
        this.f9240c = str;
        this.d = uVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9240c).openConnection();
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
                this.f9239b = httpURLConnection.getContentLengthLong();
            } else {
                this.f9239b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f9238a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f9238a;
                this.f9238a = str.substring(0, str.indexOf("; "));
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
        k0.h.put(this.f9240c, new Pair(this.f9238a, Long.valueOf(this.f9239b)));
        this.d.run(this.f9238a, Long.valueOf(this.f9239b));
    }
}
