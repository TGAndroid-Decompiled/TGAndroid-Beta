package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lj0;
public final class c implements RequestTimeDelegate, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, lj0, QuickAckDelegate {
    public final int f16875a;
    public final Object f16876b;
    public final Object f16877c;

    public c(int i10, Object obj, Object obj2) {
        this.f16875a = i10;
        this.f16876b = obj;
        this.f16877c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16876b).lambda$onDrawFaded$0((View) this.f16877c, canvas);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f16875a) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16876b, (g0) this.f16877c, d2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16876b, (org.telegram.ui.ActionBar.p2) this.f16877c, d2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16876b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f16877c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f16876b, (org.telegram.ui.Components.sc[]) this.f16877c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f16876b, (TLRPC.User) this.f16877c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
