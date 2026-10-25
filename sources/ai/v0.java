package ai;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.p9;
import org.telegram.ui.x9;
public final class v0 implements x9 {
    public final int f1951a;
    public final r2 f1952b;

    public v0(int i10, r2 r2Var) {
        this.f1951a = i10;
        this.f1952b = r2Var;
    }

    @Override
    public final void H(String str) {
        String b10 = qf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new ag.c(1));
        } else {
            MessagesController.getInstance(this.f1951a).getUserNameResolver().resolve(b10, new i(this.f1952b, 1));
        }
    }

    @Override
    public final String H0() {
        return null;
    }

    @Override
    public final boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override
    public final void R0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
