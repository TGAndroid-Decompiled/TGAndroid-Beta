package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final a5.a f287c = new a5.a("RevokeAccessOperation", new String[0]);
    public final String f288a;
    public final u f289b;

    public c(String str) {
        n6.l.f(str);
        this.f288a = str;
        this.f289b = new u(null, 0);
    }

    @Override
    public final void run() {
        a5.a aVar = f287c;
        Status status = Status.h;
        try {
            String str = this.f288a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) aVar.f278c, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.i("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) aVar.f278c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e7) {
            Log.e((String) aVar.f278c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e7.toString()))));
        }
        this.f289b.a(status);
    }
}
