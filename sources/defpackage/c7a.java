package defpackage;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SessionsActivity;
public final class c7a extends UndoView {
    public final SessionsActivity k0;

    public c7a(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.k0 = sessionsActivity;
    }

    @Override
    public final void d(int i, boolean z) {
        int i2;
        if (!z && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i2 = ((d) this.k0).currentAccount;
            ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new hj7(this, tL_authorization, (byte) 21));
        }
        super.d(i, z);
    }
}
