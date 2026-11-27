package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public final class k8d implements Runnable {
    public static final mh0 c = new mh0("RevokeAccessOperation", new String[0]);
    public final String a;
    public final e2b b;

    public k8d(String str) {
        xve.f(str);
        this.a = str;
        this.b = new e2b(null, (byte) 0);
    }

    @Override
    public final void run() {
        mh0 mh0Var = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=".concat(this.a)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(mh0Var.b, mh0Var.b("Unable to revoke access!", new Object[0]));
            }
            mh0Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e(mh0Var.b, mh0Var.b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]));
        } catch (Exception e2) {
            Log.e(mh0Var.b, mh0Var.b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]));
        }
        this.b.a(status);
    }
}
