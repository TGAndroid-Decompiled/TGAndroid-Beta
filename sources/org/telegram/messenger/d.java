package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, tj0, QuickAckDelegate {
    public final int f15921a;
    public final Object f15922b;
    public final Object f15923c;

    public d(int i10, Object obj, Object obj2) {
        this.f15921a = i10;
        this.f15922b = obj;
        this.f15923c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f15922b).lambda$onDrawFaded$0((View) this.f15923c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f15921a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f15922b, (org.telegram.ui.ActionBar.n2) this.f15923c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f15922b, (f0) this.f15923c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f15922b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f15923c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f15922b, (org.telegram.ui.Components.xc[]) this.f15923c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f15922b, (TLRPC.User) this.f15923c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
