package lh;

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
import org.telegram.ui.xk0;
public final class z1 implements Utilities.Callback2 {
    public final int f13424a;
    public final Dialog f13425b;
    public final Object f13426c;
    public final Serializable d;
    public final Object e;

    public z1(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i10) {
        this.f13424a = i10;
        this.f13425b = dialog;
        this.f13426c = obj;
        this.d = serializable;
        this.e = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f13424a;
        Object obj3 = this.e;
        Serializable serializable = this.d;
        Object obj4 = this.f13426c;
        Dialog dialog = this.f13425b;
        switch (i10) {
            case 0:
                g5.c0((g5) dialog, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.d2) dialog).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    xk0.f39930a = g3Var;
                    g3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.g3 g3Var2 = xk0.f39930a;
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    xk0.f39930a = null;
                }
                qc a2 = xk0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
        }
    }
}
