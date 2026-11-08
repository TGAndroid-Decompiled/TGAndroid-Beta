package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
public final class d9 implements Runnable {
    public final int f22007a;
    public final boolean f22008b;

    public d9(int i7, boolean z9) {
        this.f22007a = i7;
        this.f22008b = z9;
    }

    @Override
    public final void run() {
        switch (this.f22007a) {
            case 0:
                boolean z9 = this.f22008b;
                KeyPairGenerator keyPairGenerator = as.f21512f;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        as.f21512f = keyPairGenerator;
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
                        Resources resources = t0.f25566b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = t0.f25566b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        g0.h3(new d9(1, z9));
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
                qs.e().k(132, Boolean.valueOf(this.f22008b));
                return;
            case 2:
                boolean z10 = this.f22008b;
                Iterator it = sc.f25454n.iterator();
                while (it.hasNext()) {
                    c20 c20Var = (c20) it.next();
                    if (c20Var != null) {
                        c20Var.a(Boolean.valueOf(z10));
                    }
                }
                return;
            default:
                qs.e().k(264, Boolean.FALSE, Boolean.valueOf(this.f22008b));
                return;
        }
    }
}
