package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fj0;

public final class c implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, fj0, QuickAckDelegate {

    public final int f19861a;

    public final Object f19862b;

    public final Object f19863c;

    public c(int i10, Object obj, Object obj2) {
        this.f19861a = i10;
        this.f19862b = obj;
        this.f19863c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f19862b).lambda$onDrawFaded$0((View) this.f19863c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f19861a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f19862b, (il) this.f19863c, b2Var, i10);
                break;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f19862b, (org.telegram.ui.ActionBar.n2) this.f19863c, b2Var, i10);
                break;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f19862b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f19863c);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return MessagesController.lambda$addUsersToChat$295((q0.a) this.f19862b, (TLRPC.User) this.f19863c, tL_error);
    }
}
