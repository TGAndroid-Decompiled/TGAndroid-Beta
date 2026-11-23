package d6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.d1;
import q6.m;
public final class c implements Runnable {
    public static final d1 f7855c = new d1("RevokeAccessOperation", new String[0]);
    public final String f7856a;
    public final s f7857b;

    public c(String str) {
        m.f(str);
        this.f7856a = str;
        this.f7857b = new s(null, 0);
    }

    @Override
    public final void run() {
        d1 d1Var = f7855c;
        Status status = Status.h;
        try {
            String str = this.f7856a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6185e;
            } else {
                Log.e(d1Var.f23579b, d1Var.b("Unable to revoke access!", new Object[0]));
            }
            d1Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e(d1Var.f23579b, d1Var.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]));
        } catch (Exception e11) {
            Log.e(d1Var.f23579b, d1Var.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]));
        }
        this.f7857b.a(status);
    }
}
