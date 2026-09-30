package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mj0;
public final class d implements org.telegram.ui.ActionBar.z1, RequestTimeDelegate, MessagesController.ErrorDelegate, mj0, QuickAckDelegate {
    public final int f16175a;
    public final Object f16176b;
    public final Object f16177c;

    public d(int i10, Object obj, Object obj2) {
        this.f16175a = i10;
        this.f16176b = obj;
        this.f16177c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16176b).lambda$onDrawFaded$0((View) this.f16177c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f16175a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16176b, (org.telegram.ui.ActionBar.m2) this.f16177c, a2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16176b, (g0) this.f16177c, a2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16176b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f16177c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f16176b, (org.telegram.ui.Components.ad[]) this.f16177c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f16176b, (TLRPC.User) this.f16177c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
