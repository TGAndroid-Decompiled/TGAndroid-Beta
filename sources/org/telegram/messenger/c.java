package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vj0;
public final class c implements RequestTimeDelegate, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, vj0, QuickAckDelegate {
    public final int f17314a;
    public final Object f17315b;
    public final Object f17316c;

    public c(int i10, Object obj, Object obj2) {
        this.f17314a = i10;
        this.f17315b = obj;
        this.f17316c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17315b).lambda$onDrawFaded$0((View) this.f17316c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f17314a) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17315b, (f0) this.f17316c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17315b, (org.telegram.ui.ActionBar.n2) this.f17316c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17315b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f17316c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17315b, (org.telegram.ui.Components.ad[]) this.f17316c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f17315b, (TLRPC.User) this.f17316c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
