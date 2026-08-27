package k5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class c implements Runnable {

    public static final b6.a f14463c = new b6.a("RevokeAccessOperation", new String[0]);

    public final String f14464a;

    public final u f14465b;

    public c(String str) {
        y5.l.f(str);
        this.f14464a = str;
        this.f14465b = new u(null, 0);
    }

    @Override
    public final void run() {
        b6.a aVar = f14463c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f14464a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f3182e;
            } else {
                Log.e((String) aVar.f2033b, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.e("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e9) {
            Log.e((String) aVar.f2033b, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e9.toString()))));
        } catch (Exception e10) {
            Log.e((String) aVar.f2033b, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.f14465b.a(status);
    }
}
