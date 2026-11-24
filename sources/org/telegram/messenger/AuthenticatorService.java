package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static e50 a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            e50 e50Var = a;
            e50 e50Var2 = e50Var;
            if (e50Var == null) {
                ?? abstractAccountAuthenticator = new AbstractAccountAuthenticator(this);
                a = abstractAccountAuthenticator;
                e50Var2 = abstractAccountAuthenticator;
            }
            return e50Var2.getIBinder();
        }
        return null;
    }
}
