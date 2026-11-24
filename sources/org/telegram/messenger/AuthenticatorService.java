package org.telegram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class AuthenticatorService extends Service {
    public static e60 a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            e60 e60Var = a;
            e60 e60Var2 = e60Var;
            if (e60Var == null) {
                ?? abstractAccountAuthenticator = new AbstractAccountAuthenticator(this);
                a = abstractAccountAuthenticator;
                e60Var2 = abstractAccountAuthenticator;
            }
            return e60Var2.getIBinder();
        }
        return null;
    }
}
