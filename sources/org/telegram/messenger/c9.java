package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
public final class c9 implements Runnable {
    public final int f22809a;
    public final boolean f22810b;

    public c9(int i7, boolean z10) {
        this.f22809a = i7;
        this.f22810b = z10;
    }

    @Override
    public final void run() {
        switch (this.f22809a) {
            case 0:
                boolean z10 = this.f22810b;
                KeyPairGenerator keyPairGenerator = xr.f27571f;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        xr.f27571f = keyPairGenerator;
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
                        Resources resources = t0.f26600b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = t0.f26600b.getResources();
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
                ns.e().k(132, Boolean.valueOf(this.f22810b));
                return;
            case 2:
                boolean z11 = this.f22810b;
                Iterator it = qc.f26077n.iterator();
                while (it.hasNext()) {
                    z10 z10Var = (z10) it.next();
                    if (z10Var != null) {
                        z10Var.a(Boolean.valueOf(z11));
                    }
                }
                return;
            default:
                ns.e().k(264, Boolean.FALSE, Boolean.valueOf(this.f22810b));
                return;
        }
    }
}
