package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j1c extends s1c {
    public final ho1 T1;

    public j1c(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i, TL_iv.RichMessage richMessage, ho1 ho1Var) {
        super(activity, str, str2, null, inputPeer, i, false, richMessage);
        this.T1 = ho1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
