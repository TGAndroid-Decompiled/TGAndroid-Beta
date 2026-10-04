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
    public final int f17613a;
    public final Object f17614b;
    public final Object f17615c;

    public d(int i10, Object obj, Object obj2) {
        this.f17613a = i10;
        this.f17614b = obj;
        this.f17615c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17614b).lambda$onDrawFaded$0((View) this.f17615c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f17613a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17614b, (org.telegram.ui.ActionBar.n2) this.f17615c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17614b, (g0) this.f17615c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17614b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f17615c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17614b, (org.telegram.ui.Components.ad[]) this.f17615c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f17614b, (TLRPC.User) this.f17615c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
