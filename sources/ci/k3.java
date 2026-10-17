package ci;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.y50;
public final class k3 implements y50 {
    public final q4 f5562a;

    public k3(q4 q4Var) {
        this.f5562a = q4Var;
    }

    @Override
    public final long a() {
        return this.f5562a.B1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f5562a.f5845z2;
    }

    @Override
    public final View getFragmentView() {
        return this.f5562a;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f5562a.getContext());
    }

    @Override
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        boolean z12;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        q4 q4Var = this.f5562a;
        TL_stories.StoryItem storyItem = q4Var.O1.f5690a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = q4Var.B1;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    accountInstance4 = q4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                } else {
                    accountInstance3 = q4Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
                }
            } else if (photoEntry.imagePath != null) {
                accountInstance2 = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
            } else if (photoEntry.path != null) {
                accountInstance = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
            }
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            q4Var.k0(z12);
        }
    }

    @Override
    public final boolean x() {
        return false;
    }
}
