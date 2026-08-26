package org.telegram.messenger.utils;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda136;
import org.telegram.ui.ReportBottomSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.StoriesUtilities;

public final class PhotoUtilities$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final long f$4;

    public PhotoUtilities$$ExternalSyntheticLambda2(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f$0 = conferenceCall;
        this.f$1 = getgroupcallchainblocks;
        this.f$4 = j;
        this.f$3 = atomicBoolean;
        this.f$2 = atomicInteger;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda15(tL_error, (ChatActivity) this.f$0, tLObject, (TLRPC.FileLocation[]) this.f$1, (String) this.f$2, (TLRPC.FileLocation[]) this.f$3, this.f$4));
                break;
            case 1:
                ((ConferenceCall) this.f$0).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.f$1, this.f$4, (AtomicBoolean) this.f$3, (AtomicInteger) this.f$2, tLObject, tL_error);
                break;
            default:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) this.f$0;
                userStoriesLoadOperation.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda136(userStoriesLoadOperation, tLObject, this.f$4, (View) this.f$1, (StoriesUtilities.AvatarStoryParams) this.f$3, (MessagesController) this.f$2, 6));
                break;
        }
    }

    public PhotoUtilities$$ExternalSyntheticLambda2(ChatActivity chatActivity, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.f$0 = chatActivity;
        this.f$1 = fileLocationArr;
        this.f$2 = str;
        this.f$3 = fileLocationArr2;
        this.f$4 = j;
    }

    public PhotoUtilities$$ExternalSyntheticLambda2(StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation, long j, View view, StoriesUtilities.AvatarStoryParams avatarStoryParams, MessagesController messagesController) {
        this.f$0 = userStoriesLoadOperation;
        this.f$4 = j;
        this.f$1 = view;
        this.f$3 = avatarStoryParams;
        this.f$2 = messagesController;
    }
}
