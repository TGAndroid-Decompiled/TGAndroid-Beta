package gi;

import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.s61;
import org.telegram.ui.k10;
public final class c implements Utilities.CallbackReturn {
    public final int f11101a;

    public c(int i10) {
        this.f11101a = i10;
    }

    @Override
    public final Object run(Object obj) {
        boolean z10 = true;
        switch (this.f11101a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                if (messageObject == null || messageObject.getFactCheck() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                MessageObject messageObject2 = (MessageObject) obj;
                if (messageObject2 == null || messageObject2.getEffect() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 3:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 4:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 5:
                View view = (View) obj;
                if ((view instanceof d9) || (view instanceof z6) || (view instanceof k10) || (view instanceof org.telegram.ui.Cells.u3) || (view instanceof org.telegram.ui.Cells.b2) || Objects.equals(view.getTag(), -33024)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 6:
                return Boolean.valueOf(s61.K(((Integer) obj).intValue()));
            case 7:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 8:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            default:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
        }
    }
}
