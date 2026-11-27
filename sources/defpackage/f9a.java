package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;
public final class f9a extends nx0 {
    public TLRPC.TL_authorization l1;
    public SessionsActivity m1;
    public e29 n1;

    public final void E0(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.e(new CharSequence[]{ob6.M0(2131751732, null)}, new oh(this, str, (byte) 11));
        alertDialog$Builder.o();
    }

    public final void F0() {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = this.l1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(this.a).sendRequest(changeauthorizationsettings, new xe2((byte) 0));
    }

    @Override
    public final void show() {
        super.show();
        this.n1.d();
    }
}
