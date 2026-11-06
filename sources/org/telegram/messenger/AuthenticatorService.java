package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static w0 f21163a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            if (f21163a == null) {
                f21163a = new AbstractAccountAuthenticator(this);
            }
            return f21163a.getIBinder();
        }
        return null;
    }
}
