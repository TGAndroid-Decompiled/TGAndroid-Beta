package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final a5.a f291c = new a5.a("RevokeAccessOperation", new String[0]);
    public final String f292a;
    public final t f293b;

    public c(String str) {
        n6.l.f(str);
        this.f292a = str;
        this.f293b = new t(null, 0);
    }

    @Override
    public final void run() {
        a5.a aVar = f291c;
        Status status = Status.h;
        try {
            String str = this.f292a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) aVar.f282c, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.k("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) aVar.f282c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e7) {
            Log.e((String) aVar.f282c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e7.toString()))));
        }
        this.f293b.a(status);
    }
}
