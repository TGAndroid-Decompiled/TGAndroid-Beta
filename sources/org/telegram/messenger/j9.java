package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;
public final class j9 implements Runnable {
    public final int f16425a;
    public final boolean f16426b;

    public j9(int i10, boolean z10) {
        this.f16425a = i10;
        this.f16426b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16425a) {
            case 0:
                boolean z10 = this.f16426b;
                KeyPairGenerator keyPairGenerator = d6.e;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        d6.e = keyPairGenerator;
                    } catch (Exception e) {
                        f8.g(e, true);
                        keyPairGenerator = null;
                    }
                }
                if (keyPairGenerator != null) {
                    try {
                        Locale locale = Locale.getDefault();
                        Locale locale2 = Locale.ENGLISH;
                        Locale.setDefault(locale2);
                        Resources resources = w0.f18945b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = w0.f18945b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        i0.g3(new j9(1, z10));
                        return;
                    } catch (InvalidAlgorithmParameterException e7) {
                        f8.g(e7, true);
                        return;
                    } catch (Exception e10) {
                        if (!e10.getClass().getName().equals("android.security.KeyStoreException")) {
                            f8.g(e10, true);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                at.e().k(132, Boolean.valueOf(this.f16426b));
                return;
            case 2:
                boolean z11 = this.f16426b;
                Iterator it = tc.f18247n.iterator();
                while (it.hasNext()) {
                    r20 r20Var = (r20) it.next();
                    if (r20Var != null) {
                        r20Var.a(Boolean.valueOf(z11));
                    }
                }
                return;
            default:
                at.e().k(264, Boolean.FALSE, Boolean.valueOf(this.f16426b));
                return;
        }
    }
}
