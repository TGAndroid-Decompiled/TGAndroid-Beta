package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class i1c extends s1c {
    public final Runnable T1;

    public i1c(Activity activity, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, Runnable runnable) {
        super(activity, str, str2, charSequence, inputPeer, i, z, null);
        this.T1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
