package lh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l50;
public final class b3 implements l50 {
    public final d4 f15373a;

    public b3(d4 d4Var) {
        this.f15373a = d4Var;
    }

    @Override
    public final long a() {
        return this.f15373a.f15540x1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f15373a.f15533v2;
    }

    @Override
    public final View getFragmentView() {
        return this.f15373a;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f15373a.getContext());
    }

    @Override
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        boolean z12;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        d4 d4Var = this.f15373a;
        TL_stories.StoryItem storyItem = d4Var.K1.f15374a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = d4Var.f15540x1;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    accountInstance4 = d4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, d4Var.f15540x1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                } else {
                    accountInstance3 = d4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, d4Var.f15540x1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                }
            } else if (photoEntry.imagePath != null) {
                accountInstance2 = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, d4Var.f15540x1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
            } else if (photoEntry.path != null) {
                accountInstance = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, d4Var.f15540x1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
            }
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            d4Var.k0(z12);
        }
    }

    @Override
    public final boolean w() {
        return false;
    }
}
