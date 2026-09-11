package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final a5.a f295c = new a5.a("RevokeAccessOperation", new String[0]);
    public final String f296a;
    public final u f297b;

    public c(String str) {
        n6.l.f(str);
        this.f296a = str;
        this.f297b = new u(null, 0);
    }

    @Override
    public final void run() {
        a5.a aVar = f295c;
        Status status = Status.h;
        try {
            String str = this.f296a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f4942e;
            } else {
                Log.e((String) aVar.f286c, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.f("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            Log.e((String) aVar.f286c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e7.toString()))));
        } catch (Exception e10) {
            Log.e((String) aVar.f286c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.f297b.a(status);
    }
}
