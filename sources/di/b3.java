package di;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
public final class b3 implements ri {
    public final q4 f8418a;

    public b3(q4 q4Var) {
        this.f8418a = q4Var;
    }

    @Override
    public final void A(gh ghVar) {
        NotificationCenter.getInstance(this.f8418a.f9021r2).doOnIdle(ghVar);
    }

    @Override
    public final boolean E() {
        return this.f8418a.L0();
    }

    @Override
    public final void R() {
        this.f8418a.Q1.M();
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        boolean z17;
        String str;
        String str2;
        q4 q4Var = this.f8418a;
        if (q4Var.f9047y0.m0 && (storyItem = q4Var.D1.f8871a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || q4Var.f9045x2.f33033j0.getSelectedPhotos().isEmpty())) {
                a3 a3Var = q4Var.f9045x2;
                if (a3Var != null) {
                    a3Var.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            boolean z18 = true;
            if (i10 != 8) {
                q4Var.f9045x2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = q4Var.f9045x2.f33033j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = q4Var.f9045x2.f33033j0.getSelectedPhotosOrder();
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
                    accountInstance = q4Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    int i18 = i13;
                    long j12 = q4Var.f9016q1;
                    if (i10 != 4 && !z13) {
                        z16 = true;
                        z17 = i18;
                    } else {
                        z16 = true;
                        z17 = 1;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, null, null, storyItem, null, z17, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, q4Var.Q1.getSendMonoForumPeerId(), q4Var.Q1.getSendMessageSuggestionParams());
                    i14++;
                    z18 = true;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = i18;
                }
                boolean z20 = z18;
                int i19 = i13;
                q4Var.Q1.setFieldText("");
                if (j11 <= 0) {
                    z14 = z20;
                } else {
                    z14 = i19;
                }
                q4Var.i0(z14);
            }
        }
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        q4 q4Var = this.f8418a;
        TL_stories.StoryItem storyItem = q4Var.D1.f8871a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = q4Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, q4Var.f9016q1, null, null, storyItem, z10, i10, i11, null, null, j10, z11, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            q4Var.i0(z12);
        }
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void H() {
    }
}
