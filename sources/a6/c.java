package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.g1;
public final class c implements Runnable {
    public static final g1 f291c = new g1("RevokeAccessOperation", new String[0]);
    public final String f292a;
    public final u f293b;

    public c(String str) {
        n6.l.e(str);
        this.f292a = str;
        this.f293b = new u(null, 0);
    }

    @Override
    public final void run() {
        g1 g1Var = f291c;
        Status status = Status.h;
        try {
            String str = this.f292a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(g1Var.f15653a, g1Var.f15654b.concat("Unable to revoke access!"));
            }
            g1Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e(g1Var.f15653a, g1Var.f15654b.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e7) {
            Log.e(g1Var.f15653a, g1Var.f15654b.concat("Exception when revoking access: ".concat(String.valueOf(e7.toString()))));
        }
        this.f293b.a(status);
    }
}
