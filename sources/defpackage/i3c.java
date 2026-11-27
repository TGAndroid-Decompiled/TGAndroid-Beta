package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3c extends r3c {
    public final gn1 T1;

    public i3c(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i, TL_iv.RichMessage richMessage, gn1 gn1Var) {
        super(activity, str, str2, null, inputPeer, i, false, richMessage);
        this.T1 = gn1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
