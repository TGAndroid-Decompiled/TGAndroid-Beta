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
    public static final e0 f16441c = new e0("RevokeAccessOperation", new String[0]);
    public final String f16442a;
    public final u f16443b;

    public c(String str) {
        m.f(str);
        this.f16442a = str;
        this.f16443b = new u(null, 0);
    }

    @Override
    public final void run() {
        e0 e0Var = f16441c;
        Status status = Status.h;
        try {
            String str = this.f16442a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) e0Var.f1368c, ((String) e0Var.d).concat("Unable to revoke access!"));
            }
            e0Var.f("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) e0Var.f1368c, ((String) e0Var.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e6) {
            Log.e((String) e0Var.f1368c, ((String) e0Var.d).concat("Exception when revoking access: ".concat(String.valueOf(e6.toString()))));
        }
        this.f16443b.a(status);
    }
}
