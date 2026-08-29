package m5;

import ag.j2;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final j2 f16863c = new j2("RevokeAccessOperation", new String[0]);
    public final String f16864a;
    public final u f16865b;

    public c(String str) {
        z5.l.f(str);
        this.f16864a = str;
        this.f16865b = new u(null, 0);
    }

    @Override
    public final void run() {
        j2 j2Var = f16863c;
        Status status = Status.h;
        try {
            String str = this.f16864a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f3751e;
            } else {
                Log.e((String) j2Var.f559c, ((String) j2Var.d).concat("Unable to revoke access!"));
            }
            j2Var.g("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e((String) j2Var.f559c, ((String) j2Var.d).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e((String) j2Var.f559c, ((String) j2Var.d).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f16865b.a(status);
    }
}
