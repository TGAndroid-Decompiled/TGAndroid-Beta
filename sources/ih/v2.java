package ih;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.wg;
public final class v2 implements ii {
    public final i4 f12228a;

    public v2(i4 i4Var) {
        this.f12228a = i4Var;
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        String str;
        String str2;
        i4 i4Var = this.f12228a;
        if (i4Var.F0.f11804i0 && (storyItem = i4Var.K1.f11466a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i9 != 8 && i9 != 7 && (i9 != 4 || i4Var.E2.f30114f0.getSelectedPhotos().isEmpty())) {
                u2 u2Var = i4Var.E2;
                if (u2Var != null) {
                    u2Var.dismissWithButtonClick(i9);
                    return;
                }
                return;
            }
            if (i9 != 8) {
                i4Var.E2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = i4Var.E2.f30114f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = i4Var.E2.f30114f0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int i12 = 0;
                int i13 = 0;
                while (i13 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                    int i14 = i13 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i14);
                    ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < min; i15++) {
                        int i16 = i14 + i15;
                        if (i16 < selectedPhotosOrder.size()) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i16));
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
                    if (i13 == 0) {
                        z15 = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i12)).updateStickersOrder;
                    } else {
                        z15 = false;
                    }
                    HashMap<Object, Object> hashMap = selectedPhotos;
                    accountInstance = i4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    long j12 = i4Var.f11604x1;
                    if (i9 != 4 && !z13) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, null, null, storyItem, null, z16, z10, null, z11, i10, i11, 0, z15, null, null, 0L, false, 0L, i4Var.X1.getSendMonoForumPeerId(), i4Var.X1.getSendMessageSuggestionParams());
                    i13++;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i12 = 0;
                }
                i4Var.X1.setFieldText("");
                if (j11 <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i4Var.k0(z14);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.f12228a.N0();
    }

    @Override
    public final void t(wg wgVar) {
        NotificationCenter.getInstance(this.f12228a.f11609y2).doOnIdle(wgVar);
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void u() {
        this.f12228a.X1.O();
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        i4 i4Var = this.f12228a;
        TL_stories.StoryItem storyItem = i4Var.K1.f11466a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = i4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, i4Var.f11604x1, null, null, storyItem, z10, i9, i10, null, null, j10, z11, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            i4Var.k0(z12);
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void A(Object obj) {
    }

    @Override
    public final void E(TLRPC.User user) {
    }
}
