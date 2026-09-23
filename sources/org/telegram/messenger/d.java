package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, nj0, QuickAckDelegate {
    public final int f15903a;
    public final Object f15904b;
    public final Object f15905c;

    public d(int i10, Object obj, Object obj2) {
        this.f15903a = i10;
        this.f15904b = obj;
        this.f15905c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f15904b).lambda$onDrawFaded$0((View) this.f15905c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f15903a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f15904b, (org.telegram.ui.ActionBar.n2) this.f15905c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f15904b, (f0) this.f15905c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f15904b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f15905c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f15904b, (org.telegram.ui.Components.zc[]) this.f15905c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f15904b, (TLRPC.User) this.f15905c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
