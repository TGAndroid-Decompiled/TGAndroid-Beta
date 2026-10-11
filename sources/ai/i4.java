package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
public final class i4 implements wi {
    public final f6 f1135a;

    public i4(f6 f6Var) {
        this.f1135a = f6Var;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        boolean z17;
        String str;
        String str2;
        f6 f6Var = this.f1135a;
        if (f6Var.J0.m0 && (storyItem = f6Var.O1.f822a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || f6Var.I2.f33228j0.getSelectedPhotos().isEmpty())) {
                h4 h4Var = f6Var.I2;
                if (h4Var != null) {
                    h4Var.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i10 != 8) {
                f6Var.I2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = f6Var.I2.f33228j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = f6Var.I2.f33228j0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = i13; i16 < min; i16++) {
                        int i17 = i15 + i16;
                        if (i17 < selectedPhotosOrder.size()) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            boolean z19 = photoEntry.isVideo;
                            if (!z19 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                String str3 = photoEntry.path;
                                if (str3 != null) {
                                    sendingMediaInfo.path = str3;
                                }
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.isVideo = z19;
                            CharSequence charSequence = photoEntry.caption;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            sendingMediaInfo.caption = str;
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
                    if (i14 == 0) {
                        z15 = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder;
                    } else {
                        z15 = i13;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = f6Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i18 = i13;
                    long j11 = f6Var.B1;
                    if (i10 != 4 && !z13) {
                        z16 = true;
                        z17 = i18;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, null, null, storyItem, null, z17, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, f6Var.f952b2.getSendMonoForumPeerId(), f6Var.f952b2.getSendMessageSuggestionParams());
                    i14++;
                    z18 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = i18;
                }
                boolean z20 = z18;
                int i19 = i13;
                f6Var.f952b2.setFieldText("");
                if (j10 <= 0) {
                    z14 = z20;
                } else {
                    z14 = i19;
                }
                f6Var.k0(z14);
            }
        }
    }

    @Override
    public final void P0() {
        this.f1135a.f952b2.N();
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        f6 f6Var = this.f1135a;
        TL_stories.StoryItem storyItem = f6Var.O1.f822a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = f6Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, f6Var.B1, null, null, storyItem, z10, i10, i11, null, null, j3, z11, j10);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            f6Var.k0(z12);
        }
    }

    @Override
    public final void f0(jh jhVar) {
        NotificationCenter.getInstance(this.f1135a.C2).doOnIdle(jhVar);
    }

    @Override
    public final boolean i0() {
        return this.f1135a.N0();
    }

    @Override
    public final void a1(Object obj) {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void B0() {
    }
}
