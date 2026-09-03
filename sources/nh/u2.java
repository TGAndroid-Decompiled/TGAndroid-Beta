package nh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.wg;
public final class u2 implements ji {
    public final d4 f15934a;

    public u2(d4 d4Var) {
        this.f15934a = d4Var;
    }

    @Override
    public final void C0(wg wgVar) {
        NotificationCenter.getInstance(this.f15934a.f15243z2).doOnIdle(wgVar);
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        TL_stories.StoryItem storyItem;
        boolean z13;
        boolean z14;
        AccountInstance accountInstance;
        boolean z15;
        String str;
        String str2;
        d4 d4Var = this.f15934a;
        if (d4Var.G0.f15450j0 && (storyItem = d4Var.L1.f15091a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || d4Var.F2.f26698g0.getSelectedPhotos().isEmpty())) {
                t2 t2Var = d4Var.F2;
                if (t2Var != null) {
                    t2Var.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            if (i10 != 8) {
                d4Var.F2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = d4Var.F2.f26698g0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = d4Var.F2.f26698g0.getSelectedPhotosOrder();
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
                            boolean z16 = photoEntry.isVideo;
                            if (!z16 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                String str3 = photoEntry.path;
                                if (str3 != null) {
                                    sendingMediaInfo.path = str3;
                                }
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.isVideo = z16;
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
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = d4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    long j12 = d4Var.f15238y1;
                    if (i10 != 4 && !z12) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, null, null, storyItem, null, z15, z4, null, z10, i11, i12, 0, z14, null, null, 0L, false, 0L, d4Var.Y1.getSendMonoForumPeerId(), d4Var.Y1.getSendMessageSuggestionParams());
                    i14++;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = 0;
                }
                d4Var.Y1.setFieldText("");
                if (j11 <= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                d4Var.k0(z13);
            }
        }
    }

    @Override
    public final void Q0() {
        this.f15934a.Y1.P();
    }

    @Override
    public final boolean X1() {
        return false;
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z11;
        d4 d4Var = this.f15934a;
        TL_stories.StoryItem storyItem = d4Var.L1.f15091a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = d4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, d4Var.f15238y1, null, null, storyItem, z4, i10, i11, null, null, j10, z10, j11);
            if (j11 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d4Var.k0(z11);
        }
    }

    @Override
    public final boolean h0() {
        return this.f15934a.N0();
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }
}
