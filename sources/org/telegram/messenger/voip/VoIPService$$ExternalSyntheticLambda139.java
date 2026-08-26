package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class VoIPService$$ExternalSyntheticLambda139 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public VoIPService$$ExternalSyntheticLambda139(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$acknowledgeCall$13(this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$updateTimerProc$156(this.f$1, tLObject, tL_error);
                break;
            default:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8(searchAdapter, tLObject, this.f$1, 12));
                break;
        }
    }
}
