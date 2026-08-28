package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dj0;
public final class c implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, dj0, QuickAckDelegate {
    public final int f19897a;
    public final Object f19898b;
    public final Object f19899c;

    public c(int i9, Object obj, Object obj2) {
        this.f19897a = i9;
        this.f19898b = obj;
        this.f19899c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f19898b).lambda$onDrawFaded$0((View) this.f19899c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f19897a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f19898b, (dl) this.f19899c, c2Var, i9);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f19898b, (org.telegram.ui.ActionBar.o2) this.f19899c, c2Var, i9);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f19898b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f19899c);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f19898b, (TLRPC.User) this.f19899c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
