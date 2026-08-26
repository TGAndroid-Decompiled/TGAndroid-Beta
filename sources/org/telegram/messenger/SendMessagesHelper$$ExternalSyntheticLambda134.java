package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class SendMessagesHelper$$ExternalSyntheticLambda134 implements Runnable {
    public final int $r8$classId = 1;
    public final BaseController f$0;
    public final boolean f$1;
    public final TLObject f$2;
    public final int f$3;
    public final Object f$4;
    public final int f$5;

    public SendMessagesHelper$$ExternalSyntheticLambda134(MediaDataController mediaDataController, int i, TLObject tLObject, BaseFragment baseFragment, boolean z, int i2) {
        this.f$0 = mediaDataController;
        this.f$3 = i;
        this.f$2 = tLObject;
        this.f$4 = baseFragment;
        this.f$1 = z;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f$4;
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$99(this.f$1, (TLRPC.Message) this.f$2, this.f$3, arrayList, this.f$5);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$toggleStickerSets$118(this.f$3, this.f$2, (BaseFragment) this.f$4, this.f$1, this.f$5);
                break;
        }
    }

    public SendMessagesHelper$$ExternalSyntheticLambda134(SendMessagesHelper sendMessagesHelper, boolean z, TLRPC.Message message, int i, ArrayList arrayList, int i2) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = z;
        this.f$2 = message;
        this.f$3 = i;
        this.f$4 = arrayList;
        this.f$5 = i2;
    }
}
