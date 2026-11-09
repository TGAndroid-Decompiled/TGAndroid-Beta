package ai;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.d20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.v9;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.d00;
public final class c0 implements d20 {
    public final int f1135a;

    public c0(int i7) {
        this.f1135a = i7;
    }

    @Override
    public final Object a(Object obj) {
        boolean z9 = true;
        switch (this.f1135a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || (!str.startsWith("tg:") && !vf.c.g(Uri.parse(str), false, null))) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 1:
                String str2 = (String) obj;
                xq xqVar = i0.f1238z0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !vf.c.g(Uri.parse(str2), false, null))) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 2:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 3:
                ij ijVar = (ij) obj;
                if (ijVar == null || ijVar.R0() == null) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 4:
                ij ijVar2 = (ij) obj;
                if (ijVar2 == null || ijVar2.M0() == null) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 5:
                return id.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 6:
                return id.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 7:
                View view = (View) obj;
                if ((view instanceof z8) || (view instanceof y6) || (view instanceof d00) || (view instanceof x3) || (view instanceof d2) || Objects.equals(view.getTag(), -33024)) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 8:
                return Boolean.valueOf(m41.K(((Integer) obj).intValue()));
            case 9:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 10:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 11:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 12:
                return Boolean.valueOf(w5.C0(w5.b1((String) obj)));
            default:
                if (v9.l0((String) obj) == null) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}
