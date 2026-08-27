package jh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c50;

public final class c3 implements c50 {

    public final e4 f13140a;

    public c3(e4 e4Var) {
        this.f13140a = e4Var;
    }

    @Override
    public final long a() {
        return this.f13140a.f13291x1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f13140a.f13284v2;
    }

    @Override
    public final View getFragmentView() {
        return this.f13140a;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f13140a.getContext());
    }

    @Override
    public final void s(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j10) {
        e4 e4Var = this.f13140a;
        TL_stories.StoryItem storyItem = e4Var.K1.f13141a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = e4Var.f13291x1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                SendMessagesHelper.prepareSendingVideo(e4Var.getAccountInstance(), photoEntry.path, videoEditedInfo, null, null, e4Var.f13291x1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            } else {
                SendMessagesHelper.prepareSendingVideo(e4Var.getAccountInstance(), photoEntry.path, null, null, null, e4Var.f13291x1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            }
        } else if (photoEntry.imagePath != null) {
            SendMessagesHelper.prepareSendingPhoto(e4Var.getAccountInstance(), photoEntry.imagePath, photoEntry.thumbPath, null, e4Var.f13291x1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
        } else if (photoEntry.path != null) {
            SendMessagesHelper.prepareSendingPhoto(e4Var.getAccountInstance(), photoEntry.path, photoEntry.thumbPath, null, e4Var.f13291x1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
        }
        e4Var.k0(j10 <= 0);
    }

    @Override
    public final boolean x() {
        return false;
    }
}
