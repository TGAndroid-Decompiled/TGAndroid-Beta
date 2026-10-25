package b6;

import a8.ng;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final ng f3654c = new ng("RevokeAccessOperation", new String[0]);
    public final String f3655a;
    public final t f3656b;

    public c(String str) {
        o6.l.f(str);
        this.f3655a = str;
        this.f3656b = new t(null, 0);
    }

    @Override
    public final void run() {
        ng ngVar = f3654c;
        Status status = Status.h;
        try {
            String str = this.f3655a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) ngVar.f640c, ((String) ngVar.d).concat("Unable to revoke access!"));
            }
            ngVar.j("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) ngVar.f640c, ((String) ngVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e10) {
            Log.e((String) ngVar.f640c, ((String) ngVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.f3656b.a(status);
    }
}
