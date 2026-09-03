package o5;

import android.util.Log;
import b4.e0;
import b6.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final e0 f16600c = new e0("RevokeAccessOperation", new String[0]);
    public final String f16601a;
    public final u f16602b;

    public c(String str) {
        m.f(str);
        this.f16601a = str;
        this.f16602b = new u(null, 0);
    }

    @Override
    public final void run() {
        e0 e0Var = f16600c;
        Status status = Status.h;
        try {
            String str = this.f16601a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2642e;
            } else {
                Log.e((String) e0Var.f1475c, ((String) e0Var.d).concat("Unable to revoke access!"));
            }
            e0Var.g("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e6) {
            Log.e((String) e0Var.f1475c, ((String) e0Var.d).concat("IOException when revoking access: ".concat(String.valueOf(e6.toString()))));
        } catch (Exception e10) {
            Log.e((String) e0Var.f1475c, ((String) e0Var.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.f16602b.a(status);
    }
}
