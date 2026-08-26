package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.util.Consumer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.MultiLayoutTypingAnimator;

public final class GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate, MultiLayoutTypingAnimator.Renderer, QuickAckDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public void draw(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f$0).lambda$onDrawFaded$0((View) this.f$1, canvas);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f$0, (AndroidUtilities$$ExternalSyntheticLambda41) this.f$1, alertDialog, i);
                break;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f$0, (BaseFragment) this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$103((TLRPC.Message) this.f$1);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return MessagesController.lambda$addUsersToChat$295((Consumer) this.f$0, (TLRPC.User) this.f$1, tL_error);
    }
}
