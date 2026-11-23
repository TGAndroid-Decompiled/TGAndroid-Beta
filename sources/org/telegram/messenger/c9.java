package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
public final class c9 implements Runnable {
    public final int f23396a;
    public final boolean f23397b;

    public c9(int i7, boolean z10) {
        this.f23396a = i7;
        this.f23397b = z10;
    }

    @Override
    public final void run() {
        switch (this.f23396a) {
            case 0:
                boolean z10 = this.f23397b;
                KeyPairGenerator keyPairGenerator = vr.f27683f;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        vr.f27683f = keyPairGenerator;
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
                        Resources resources = t0.f27013b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = t0.f27013b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        g0.g3(new c9(1, z10));
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
                ks.e().k(132, Boolean.valueOf(this.f23397b));
                return;
            case 2:
                boolean z11 = this.f23397b;
                Iterator it = pc.f26318n.iterator();
                while (it.hasNext()) {
                    w10 w10Var = (w10) it.next();
                    if (w10Var != null) {
                        w10Var.a(Boolean.valueOf(z11));
                    }
                }
                return;
            default:
                ks.e().k(267, Boolean.FALSE, Boolean.valueOf(this.f23397b));
                return;
        }
    }
}
