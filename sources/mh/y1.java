package mh;

import android.app.Dialog;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zk0;
public final class y1 implements Utilities.Callback2 {
    public final int f15079a;
    public final Dialog f15080b;
    public final Object f15081c;
    public final Serializable d;
    public final Object f15082e;

    public y1(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i10) {
        this.f15079a = i10;
        this.f15080b = dialog;
        this.f15081c = obj;
        this.d = serializable;
        this.f15082e = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f15079a;
        Object obj3 = this.f15082e;
        Serializable serializable = this.d;
        Object obj4 = this.f15081c;
        Dialog dialog = this.f15080b;
        switch (i10) {
            case 0:
                g5.c0((g5) dialog, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.d2) dialog).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    zk0.f43980a = h3Var;
                    h3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.h3 h3Var2 = zk0.f43980a;
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    zk0.f43980a = null;
                }
                qc a2 = zk0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
        }
    }
}
