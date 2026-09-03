package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kj0;
public final class c implements RequestTimeDelegate, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, kj0, QuickAckDelegate {
    public final int f18309a;
    public final Object f18310b;
    public final Object f18311c;

    public c(int i10, Object obj, Object obj2) {
        this.f18309a = i10;
        this.f18310b = obj;
        this.f18311c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f18310b).lambda$onDrawFaded$0((View) this.f18311c, canvas);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f18309a) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f18310b, (g0) this.f18311c, d2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f18310b, (org.telegram.ui.ActionBar.p2) this.f18311c, d2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f18310b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f18311c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f18310b, (org.telegram.ui.Components.sc[]) this.f18311c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f18310b, (TLRPC.User) this.f18311c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
