package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static g50 a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            g50 g50Var = a;
            g50 g50Var2 = g50Var;
            if (g50Var == null) {
                ?? abstractAccountAuthenticator = new AbstractAccountAuthenticator(this);
                a = abstractAccountAuthenticator;
                g50Var2 = abstractAccountAuthenticator;
            }
            return g50Var2.getIBinder();
        }
        return null;
    }
}
