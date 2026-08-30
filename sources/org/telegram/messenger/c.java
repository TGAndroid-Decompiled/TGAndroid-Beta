package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jj0;
public final class c implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, jj0, QuickAckDelegate {
    public final int f16889a;
    public final Object f16890b;
    public final Object f16891c;

    public c(int i10, Object obj, Object obj2) {
        this.f16889a = i10;
        this.f16890b = obj;
        this.f16891c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16890b).lambda$onDrawFaded$0((View) this.f16891c, canvas);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f16889a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16890b, (pl) this.f16891c, d2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16890b, (org.telegram.ui.ActionBar.p2) this.f16891c, d2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16890b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f16891c);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f16890b, (TLRPC.User) this.f16891c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
