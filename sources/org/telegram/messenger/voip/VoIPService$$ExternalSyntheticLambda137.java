package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Business.BusinessLinksActivity;

public final class VoIPService$$ExternalSyntheticLambda137 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;

    public VoIPService$$ExternalSyntheticLambda137(KeyEvent.Callback callback, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((BottomSheet) this.f$0, (Integer) this.f$1, dialogInterface);
                break;
            default:
                View view = (View) this.f$0;
                if (view != null) {
                    view.clearFocus();
                }
                BusinessLinksActivity.AnonymousClass1 anonymousClass1 = (BusinessLinksActivity.AnonymousClass1) this.f$1;
                anonymousClass1.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass1);
                break;
        }
    }
}
