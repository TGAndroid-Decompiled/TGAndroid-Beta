package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static w0 f22608a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            if (f22608a == null) {
                f22608a = new AbstractAccountAuthenticator(this);
            }
            return f22608a.getIBinder();
        }
        return null;
    }
}
