package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pj0;
public final class d implements org.telegram.ui.ActionBar.b2, RequestTimeDelegate, MessagesController.ErrorDelegate, pj0, QuickAckDelegate {
    public final int f16158a;
    public final Object f16159b;
    public final Object f16160c;

    public d(int i10, Object obj, Object obj2) {
        this.f16158a = i10;
        this.f16159b = obj;
        this.f16160c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16159b).lambda$onDrawFaded$0((View) this.f16160c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f16158a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16159b, (org.telegram.ui.ActionBar.o2) this.f16160c, c2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16159b, (f0) this.f16160c, c2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16159b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f16160c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f16159b, (org.telegram.ui.Components.zc[]) this.f16160c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f16159b, (TLRPC.User) this.f16160c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
