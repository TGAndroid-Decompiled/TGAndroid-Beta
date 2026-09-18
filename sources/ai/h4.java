package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ti;
public final class h4 implements ti {
    public final f6 f943a;

    public h4(f6 f6Var) {
        this.f943a = f6Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        String str;
        String str2;
        f6 f6Var = this.f943a;
        if (f6Var.J0.m0 && (storyItem = f6Var.O1.f706a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || f6Var.I2.f28757j0.getSelectedPhotos().isEmpty())) {
                g4 g4Var = f6Var.I2;
                if (g4Var != null) {
                    g4Var.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            if (i10 != 8) {
                f6Var.I2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = f6Var.I2.f28757j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = f6Var.I2.f28757j0.getSelectedPhotosOrder();
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
                    accountInstance = f6Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    long j11 = f6Var.B1;
                    if (i10 != 4 && !z13) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, null, null, storyItem, null, z16, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, f6Var.f800b2.getSendMonoForumPeerId(), f6Var.f800b2.getSendMessageSuggestionParams());
                    i14++;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = 0;
                }
                f6Var.f800b2.setFieldText("");
                if (j10 <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                f6Var.k0(z14);
            }
        }
    }

    @Override
    public final void K0() {
        this.f943a.f800b2.Q();
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        f6 f6Var = this.f943a;
        TL_stories.StoryItem storyItem = f6Var.O1.f706a;
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
    public final boolean c0() {
        return this.f943a.N0();
    }

    @Override
    public final void x0(fh fhVar) {
        NotificationCenter.getInstance(this.f943a.C2).doOnIdle(fhVar);
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }
}
