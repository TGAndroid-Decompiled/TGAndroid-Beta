package defpackage;

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.SessionsActivity;
public final class maa implements pcc {
    public final byte a;
    public final SessionsActivity b;

    public maa(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                if (connectedbots != null) {
                    sessionsActivity.f = connectedbots.connected_bots;
                    if (sessionsActivity.a != null) {
                        sessionsActivity.q0();
                        sessionsActivity.a.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                sessionsActivity.m0((Boolean) obj);
                return;
        }
    }
}
