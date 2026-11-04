package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static w0 f21216a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            if (f21216a == null) {
                f21216a = new AbstractAccountAuthenticator(this);
            }
            return f21216a.getIBinder();
        }
        return null;
    }
}
