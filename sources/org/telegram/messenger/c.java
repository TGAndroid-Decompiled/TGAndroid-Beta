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
    public final int f17287a;
    public final Object f17288b;
    public final Object f17289c;

    public c(int i10, Object obj, Object obj2) {
        this.f17287a = i10;
        this.f17288b = obj;
        this.f17289c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17288b).lambda$onDrawFaded$0((View) this.f17289c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f17287a) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17288b, (f0) this.f17289c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17288b, (org.telegram.ui.ActionBar.n2) this.f17289c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17288b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f17289c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17288b, (org.telegram.ui.Components.ad[]) this.f17289c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f17288b, (TLRPC.User) this.f17289c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
