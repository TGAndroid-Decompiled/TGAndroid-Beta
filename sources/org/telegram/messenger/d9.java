package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
public final class d9 implements Runnable {
    public final int f23522a;
    public final boolean f23523b;

    public d9(int i7, boolean z10) {
        this.f23522a = i7;
        this.f23523b = z10;
    }

    @Override
    public final void run() {
        switch (this.f23522a) {
            case 0:
                boolean z10 = this.f23523b;
                KeyPairGenerator keyPairGenerator = wr.f27791f;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        wr.f27791f = keyPairGenerator;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        keyPairGenerator = null;
                    }
                }
                if (keyPairGenerator != null) {
                    try {
                        Locale locale = Locale.getDefault();
                        Locale locale2 = Locale.ENGLISH;
                        Locale.setDefault(locale2);
                        Resources resources = t0.f26931b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = t0.f26931b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        g0.g3(new d9(1, z10));
                        return;
                    } catch (InvalidAlgorithmParameterException e11) {
                        a8.g(e11, true);
                        return;
                    } catch (Exception e12) {
                        if (!e12.getClass().getName().equals("android.security.KeyStoreException")) {
                            a8.g(e12, true);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                ls.e().k(132, Boolean.valueOf(this.f23523b));
                return;
            case 2:
                boolean z11 = this.f23523b;
                Iterator it = qc.f26433n.iterator();
                while (it.hasNext()) {
                    y10 y10Var = (y10) it.next();
                    if (y10Var != null) {
                        y10Var.a(Boolean.valueOf(z11));
                    }
                }
                return;
            default:
                ls.e().k(267, Boolean.FALSE, Boolean.valueOf(this.f23523b));
                return;
        }
    }
}
