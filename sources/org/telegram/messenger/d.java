package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, uj0, QuickAckDelegate {
    public final int f16108a;
    public final Object f16109b;
    public final Object f16110c;

    public d(int i10, Object obj, Object obj2) {
        this.f16108a = i10;
        this.f16109b = obj;
        this.f16110c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16109b).lambda$onDrawFaded$0((View) this.f16110c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f16108a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16109b, (org.telegram.ui.ActionBar.n2) this.f16110c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16109b, (g0) this.f16110c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16109b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f16110c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f16109b, (org.telegram.ui.Components.zc[]) this.f16110c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f16109b, (TLRPC.User) this.f16110c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
