package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final a5.a f307c = new a5.a("RevokeAccessOperation", new String[0]);
    public final String f308a;
    public final u f309b;

    public c(String str) {
        n6.l.f(str);
        this.f308a = str;
        this.f309b = new u(null, 0);
    }

    @Override
    public final void run() {
        a5.a aVar = f307c;
        Status status = Status.h;
        try {
            String str = this.f308a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f4969e;
            } else {
                Log.e((String) aVar.f298c, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.f("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            Log.e((String) aVar.f298c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e7.toString()))));
        } catch (Exception e10) {
            Log.e((String) aVar.f298c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.f309b.a(status);
    }
}
