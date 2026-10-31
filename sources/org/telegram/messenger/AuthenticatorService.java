package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static z0 f14355a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            if (f14355a == null) {
                f14355a = new AbstractAccountAuthenticator(this);
            }
            return f14355a.getIBinder();
        }
        return null;
    }
}
