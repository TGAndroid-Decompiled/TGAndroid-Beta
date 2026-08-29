package lh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.zg;
public final class t2 implements li {
    public final d4 f16258a;

    public t2(d4 d4Var) {
        this.f16258a = d4Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        String str;
        String str2;
        d4 d4Var = this.f16258a;
        if (d4Var.F0.f15763i0 && (storyItem = d4Var.K1.f15374a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || d4Var.E2.f31005f0.getSelectedPhotos().isEmpty())) {
                s2 s2Var = d4Var.E2;
                if (s2Var != null) {
                    s2Var.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            if (i10 != 8) {
                d4Var.E2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = d4Var.E2.f31005f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = d4Var.E2.f31005f0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = 0; i16 < min; i16++) {
                        int i17 = i15 + i16;
                        if (i17 < selectedPhotosOrder.size()) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            boolean z17 = photoEntry.isVideo;
                            if (!z17 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                String str3 = photoEntry.path;
                                if (str3 != null) {
                                    sendingMediaInfo.path = str3;
                                }
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.isVideo = z17;
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
                        z15 = false;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = d4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    long j12 = d4Var.f15540x1;
                    if (i10 != 4 && !z13) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, null, null, storyItem, null, z16, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, d4Var.X1.getSendMonoForumPeerId(), d4Var.X1.getSendMessageSuggestionParams());
                    i14++;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = 0;
                }
                d4Var.X1.setFieldText("");
                if (j11 <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                d4Var.k0(z14);
            }
        }
    }

    @Override
    public final void L0() {
        this.f16258a.X1.P();
    }

    @Override
    public final boolean T1() {
        return false;
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        d4 d4Var = this.f16258a;
        TL_stories.StoryItem storyItem = d4Var.K1.f15374a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = d4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, d4Var.f15540x1, null, null, storyItem, z10, i10, i11, null, null, j10, z11, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            d4Var.k0(z12);
        }
    }

    @Override
    public final boolean a0() {
        return this.f16258a.N0();
    }

    @Override
    public final void x0(zg zgVar) {
        NotificationCenter.getInstance(this.f16258a.f15545y2).doOnIdle(zgVar);
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }
}
