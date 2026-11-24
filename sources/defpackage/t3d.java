package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class t3d implements Runnable {
    public static final lh0 c = new lh0("RevokeAccessOperation", new String[0]);
    public final String a;
    public final cya b;

    public t3d(String str) {
        fre.f(str);
        this.a = str;
        this.b = new cya(null, (byte) 0);
    }

    @Override
    public final void run() {
        lh0 lh0Var = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=".concat(this.a)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(lh0Var.b, lh0Var.b("Unable to revoke access!", new Object[0]));
            }
            lh0Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e(lh0Var.b, lh0Var.b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]));
        } catch (Exception e2) {
            Log.e(lh0Var.b, lh0Var.b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]));
        }
        this.b.a(status);
    }
}
