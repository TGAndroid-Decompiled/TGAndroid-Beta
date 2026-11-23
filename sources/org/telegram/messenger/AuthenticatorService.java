package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static w0 f22639a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            if (f22639a == null) {
                f22639a = new AbstractAccountAuthenticator(this);
            }
            return f22639a.getIBinder();
        }
        return null;
    }
}
