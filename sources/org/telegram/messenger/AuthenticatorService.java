package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static z0 f14356a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            if (f14356a == null) {
                f14356a = new AbstractAccountAuthenticator(this);
            }
            return f14356a.getIBinder();
        }
        return null;
    }
}
