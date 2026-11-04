package bi;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.v10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.Wallet.w9;
import org.telegram.ui.zz;
public final class x implements v10 {
    public final int f3891a;

    public x(int i3) {
        this.f3891a = i3;
    }

    @Override
    public final Object a(Object obj) {
        boolean z10 = true;
        switch (this.f3891a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || (!str.startsWith("tg:") && !sf.c.g(Uri.parse(str), false, null))) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                String str2 = (String) obj;
                xq xqVar = a0.A0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !sf.c.g(Uri.parse(str2), false, null))) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 3:
                zi ziVar = (zi) obj;
                if (ziVar == null || ziVar.R0() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
                zi ziVar2 = (zi) obj;
                if (ziVar2 == null || ziVar2.M0() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 5:
                return bd.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 6:
                return bd.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 7:
                View view = (View) obj;
                if ((view instanceof y8) || (view instanceof x6) || (view instanceof zz) || (view instanceof x3) || (view instanceof d2) || Objects.equals(view.getTag(), -33024)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 8:
                return Boolean.valueOf(f41.K(((Integer) obj).intValue()));
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
                if (w9.l0((String) obj) == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
