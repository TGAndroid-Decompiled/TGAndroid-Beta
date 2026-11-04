package c6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.d1;
import p6.m;
public final class c implements Runnable {
    public static final d1 f4218c = new d1("RevokeAccessOperation", new String[0]);
    public final String f4219a;
    public final r f4220b;

    public c(String str) {
        m.e(str);
        this.f4219a = str;
        this.f4220b = new r(null, 0);
    }

    @Override
    public final void run() {
        d1 d1Var = f4218c;
        Status status = Status.h;
        try {
            String str = this.f4219a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6577e;
            } else {
                Log.e(d1Var.f22118a, d1Var.f22119b.concat("Unable to revoke access!"));
            }
            d1Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e(d1Var.f22118a, d1Var.f22119b.concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e(d1Var.f22118a, d1Var.f22119b.concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f4220b.a(status);
    }
}
