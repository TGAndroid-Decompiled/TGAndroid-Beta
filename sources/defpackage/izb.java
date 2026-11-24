package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class izb extends rzb {
    public final vm1 T1;

    public izb(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i, TL_iv.RichMessage richMessage, vm1 vm1Var) {
        super(activity, str, str2, null, inputPeer, i, false, richMessage);
        this.T1 = vm1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
