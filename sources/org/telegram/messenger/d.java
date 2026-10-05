package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, qj0, QuickAckDelegate {
    public final int f17617a;
    public final Object f17618b;
    public final Object f17619c;

    public d(int i10, Object obj, Object obj2) {
        this.f17617a = i10;
        this.f17618b = obj;
        this.f17619c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17618b).lambda$onDrawFaded$0((View) this.f17619c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f17617a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17618b, (org.telegram.ui.ActionBar.n2) this.f17619c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17618b, (g0) this.f17619c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17618b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f17619c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17618b, (org.telegram.ui.Components.ad[]) this.f17619c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f17618b, (TLRPC.User) this.f17619c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
