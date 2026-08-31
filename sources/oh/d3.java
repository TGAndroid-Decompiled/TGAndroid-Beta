package oh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s50;
public final class d3 implements s50 {
    public final f4 f16960a;

    public d3(f4 f4Var) {
        this.f16960a = f4Var;
    }

    @Override
    public final long a() {
        return this.f16960a.f17128y1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f16960a.f17121w2;
    }

    @Override
    public final View getFragmentView() {
        return this.f16960a;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f16960a.getContext());
    }

    @Override
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z4, int i10, int i11, boolean z10, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        boolean z11;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        f4 f4Var = this.f16960a;
        TL_stories.StoryItem storyItem = f4Var.L1.f16961a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = f4Var.f17128y1;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    accountInstance4 = f4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, f4Var.f17128y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                } else {
                    accountInstance3 = f4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, f4Var.f17128y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                }
            } else if (photoEntry.imagePath != null) {
                accountInstance2 = f4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, f4Var.f17128y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
            } else if (photoEntry.path != null) {
                accountInstance = f4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, f4Var.f17128y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
            }
            if (j10 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            f4Var.k0(z11);
        }
    }

    @Override
    public final boolean w() {
        return false;
    }
}
