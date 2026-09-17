package bi;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o50;
public final class d4 implements o50 {
    public final o5 f2857a;

    public d4(o5 o5Var) {
        this.f2857a = o5Var;
    }

    @Override
    public final long a() {
        return this.f2857a.B1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f2857a.f3482z2;
    }

    @Override
    public final View getFragmentView() {
        return this.f2857a;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f2857a.getContext());
    }

    @Override
    public final void q(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j3) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        boolean z12;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        o5 o5Var = this.f2857a;
        TL_stories.StoryItem storyItem = o5Var.O1.f3310a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = o5Var.B1;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    accountInstance4 = o5Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
                } else {
                    accountInstance3 = o5Var.getAccountInstance();
                    SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
                }
            } else if (photoEntry.imagePath != null) {
                accountInstance2 = o5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j3);
            } else if (photoEntry.path != null) {
                accountInstance = o5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j3);
            }
            if (j3 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            o5Var.k0(z12);
        }
    }

    @Override
    public final boolean v() {
        return false;
    }
}
