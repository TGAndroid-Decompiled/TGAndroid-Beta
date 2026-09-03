package nh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.r50;
public final class c3 implements r50 {
    public final d4 f15120a;

    public c3(d4 d4Var) {
        this.f15120a = d4Var;
    }

    @Override
    public final long a() {
        return this.f15120a.f15238y1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f15120a.f15231w2;
    }

    @Override
    public final View getFragmentView() {
        return this.f15120a;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f15120a.getContext());
    }

    @Override
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z4, int i10, int i11, boolean z10, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        boolean z11;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        d4 d4Var = this.f15120a;
        TL_stories.StoryItem storyItem = d4Var.L1.f15091a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = d4Var.f15238y1;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    accountInstance4 = d4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, d4Var.f15238y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                } else {
                    accountInstance3 = d4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, d4Var.f15238y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                }
            } else if (photoEntry.imagePath != null) {
                accountInstance2 = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, d4Var.f15238y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
            } else if (photoEntry.path != null) {
                accountInstance = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, d4Var.f15238y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
            }
            if (j10 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d4Var.k0(z11);
        }
    }

    @Override
    public final boolean v() {
        return false;
    }
}
