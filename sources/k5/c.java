package k5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class c implements Runnable {
    public static final a6.a f14642c = new a6.a("RevokeAccessOperation", new String[0]);
    public final String f14643a;
    public final u f14644b;

    public c(String str) {
        x5.l.f(str);
        this.f14643a = str;
        this.f14644b = new u(null, 0);
    }

    @Override
    public final void run() {
        a6.a aVar = f14642c;
        Status status = Status.h;
        try {
            String str = this.f14643a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2737e;
            } else {
                Log.e((String) aVar.f101b, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.e("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e((String) aVar.f101b, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e((String) aVar.f101b, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f14644b.a(status);
    }
}
