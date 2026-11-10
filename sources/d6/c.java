package d6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.d1;
import q6.m;
public final class c implements Runnable {
    public static final d1 f8195c = new d1("RevokeAccessOperation", new String[0]);
    public final String f8196a;
    public final r f8197b;

    public c(String str) {
        m.e(str);
        this.f8196a = str;
        this.f8197b = new r(null, 0);
    }

    @Override
    public final void run() {
        d1 d1Var = f8195c;
        Status status = Status.h;
        try {
            String str = this.f8196a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6528e;
            } else {
                Log.e(d1Var.f21974b, d1Var.b("Unable to revoke access!", new Object[0]));
            }
            d1Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e(d1Var.f21974b, d1Var.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]));
        } catch (Exception e11) {
            Log.e(d1Var.f21974b, d1Var.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]));
        }
        this.f8197b.a(status);
    }
}
