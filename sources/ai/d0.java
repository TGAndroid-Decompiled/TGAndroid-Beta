package ai;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.m10;
public final class d0 implements Utilities.CallbackReturn {
    public final int f1467a;

    public d0(int i10) {
        this.f1467a = i10;
    }

    @Override
    public final Object run(Object obj) {
        boolean z10 = true;
        switch (this.f1467a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || (!str.startsWith("tg:") && !qf.d.e(Uri.parse(str), false, null))) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                String str2 = (String) obj;
                ds dsVar = o0.f1580z0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !qf.d.e(Uri.parse(str2), false, null))) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 3:
                MessageObject messageObject = (MessageObject) obj;
                if (messageObject == null || messageObject.getFactCheck() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
                MessageObject messageObject2 = (MessageObject) obj;
                if (messageObject2 == null || messageObject2.getEffect() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 5:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 6:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 7:
                View view = (View) obj;
                if ((view instanceof i9) || (view instanceof f7) || (view instanceof m10) || (view instanceof z3) || (view instanceof z1) || Objects.equals(view.getTag(), -33024)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 8:
                return Boolean.valueOf(j71.K(((Integer) obj).intValue()));
            case 9:
                return Boolean.valueOf(!"running".equals(((JSONObject) obj).optString("status")));
            case 10:
                return Boolean.valueOf("done".equals(((JSONObject) obj).optString("status")));
            case 11:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 12:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 13:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 14:
                return Boolean.valueOf(m5.y0(m5.X0((String) obj)));
            default:
                if (r9.h0((String) obj) == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
