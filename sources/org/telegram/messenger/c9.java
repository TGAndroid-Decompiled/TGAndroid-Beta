package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
public final class c9 implements Runnable {
    public final int f21950a;
    public final boolean f21951b;

    public c9(int i3, boolean z10) {
        this.f21950a = i3;
        this.f21951b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21950a) {
            case 0:
                boolean z10 = this.f21951b;
                KeyPairGenerator keyPairGenerator = sr.f25407f;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        sr.f25407f = keyPairGenerator;
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
                        Resources resources = t0.f25457b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = t0.f25457b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        g0.h3(new c9(1, z10));
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
                hs.e().k(132, Boolean.valueOf(this.f21951b));
                return;
            case 2:
                boolean z11 = this.f21951b;
                Iterator it = lc.f23973n.iterator();
                while (it.hasNext()) {
                    u10 u10Var = (u10) it.next();
                    if (u10Var != null) {
                        u10Var.a(Boolean.valueOf(z11));
                    }
                }
                return;
            default:
                hs.e().k(264, Boolean.FALSE, Boolean.valueOf(this.f21951b));
                return;
        }
    }
}
