package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import n6.m;
public final class c implements Runnable {
    public static final a5.a f309c = new a5.a("RevokeAccessOperation", new String[0]);
    public final String f310a;
    public final u f311b;

    public c(String str) {
        m.f(str);
        this.f310a = str;
        this.f311b = new u(null, 0);
    }

    @Override
    public final void run() {
        a5.a aVar = f309c;
        Status status = Status.h;
        try {
            String str = this.f310a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6520e;
            } else {
                Log.e((String) aVar.f300c, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.j("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            Log.e((String) aVar.f300c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e7.toString()))));
        } catch (Exception e10) {
            Log.e((String) aVar.f300c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.f311b.a(status);
    }
}
