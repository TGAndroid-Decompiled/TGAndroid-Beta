package jh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.sg;

public final class u2 implements ei {

    public final e4 f14024a;

    public u2(e4 e4Var) {
        this.f14024a = e4Var;
    }

    @Override
    public final void F() {
        this.f14024a.X1.P();
    }

    @Override
    public final boolean N0() {
        return false;
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        e4 e4Var = this.f14024a;
        TL_stories.StoryItem storyItem = e4Var.K1.f13141a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        SendMessagesHelper.prepareSendingAudioDocuments(e4Var.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, e4Var.f13291x1, null, null, storyItem, z10, i10, i11, null, null, j10, z11, j11);
        e4Var.k0(j11 <= 0);
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        String str;
        e4 e4Var = this.f14024a;
        if (!e4Var.F0.f13485i0 || (storyItem = e4Var.K1.f13141a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || e4Var.E2.f28650f0.getSelectedPhotos().isEmpty())) {
            t2 t2Var = e4Var.E2;
            if (t2Var != null) {
                t2Var.dismissWithButtonClick(i10);
                return;
            }
            return;
        }
        if (i10 != 8) {
            e4Var.E2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = e4Var.E2.f28650f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = e4Var.E2.f28650f0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i15 = i14 * 10;
            int iMin = Math.min(10, selectedPhotos.size() - i15);
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = i15 + i16;
                if (i17 < selectedPhotosOrder.size()) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    boolean z14 = photoEntry.isVideo;
                    if (z14 || (str = photoEntry.imagePath) == null) {
                        String str2 = photoEntry.path;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        }
                    } else {
                        sendingMediaInfo.path = str;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.isVideo = z14;
                    CharSequence charSequence = photoEntry.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                    sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                    sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                    arrayList.add(sendingMediaInfo);
                    photoEntry.reset();
                }
            }
            HashMap<Object, Object> map = selectedPhotos;
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            SendMessagesHelper.prepareSendingMedia(e4Var.getAccountInstance(), arrayList, e4Var.f13291x1, null, null, storyItem, null, i10 == 4 || z13, z10, null, z11, i11, i12, 0, i14 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder : false, null, null, 0L, false, 0L, e4Var.X1.getSendMonoForumPeerId(), e4Var.X1.getSendMessageSuggestionParams());
            i14++;
            selectedPhotos = map;
            selectedPhotosOrder = arrayList2;
            i13 = 0;
        }
        e4Var.X1.setFieldText("");
        e4Var.k0(j11 <= 0);
    }

    @Override
    public final boolean s() {
        return this.f14024a.N0();
    }

    @Override
    public final void y(sg sgVar) {
        NotificationCenter.getInstance(this.f14024a.f13296y2).doOnIdle(sgVar);
    }

    @Override
    public final void w() {
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }
}
