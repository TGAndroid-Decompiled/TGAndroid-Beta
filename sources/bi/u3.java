package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
public final class u3 implements ti {
    public final o5 f3791a;

    public u3(o5 o5Var) {
        this.f3791a = o5Var;
    }

    @Override
    public final void B(hh hhVar) {
        NotificationCenter.getInstance(this.f3791a.C2).doOnIdle(hhVar);
    }

    @Override
    public final boolean D0() {
        return false;
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        CharSequence charSequence2;
        boolean z12;
        o5 o5Var = this.f3791a;
        TL_stories.StoryItem storyItem = o5Var.O1.f3310a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = o5Var.getAccountInstance();
            if (charSequence != null) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, o5Var.B1, null, null, storyItem, z10, i10, i11, null, null, j3, z11, j10);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            o5Var.k0(z12);
        }
    }

    @Override
    public final void H() {
        this.f3791a.f3406b2.P();
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        boolean z14;
        boolean z15;
        AccountInstance accountInstance;
        boolean z16;
        String str;
        String str2;
        o5 o5Var = this.f3791a;
        if (o5Var.J0.m0 && (storyItem = o5Var.O1.f3310a) != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            if (i10 != 8 && i10 != 7 && (i10 != 4 || o5Var.I2.f31291j0.getSelectedPhotos().isEmpty())) {
                t3 t3Var = o5Var.I2;
                if (t3Var != null) {
                    t3Var.dismissWithButtonClick(i10);
                    return;
                }
                return;
            }
            if (i10 != 8) {
                o5Var.I2.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = o5Var.I2.f31291j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = o5Var.I2.f31291j0.getSelectedPhotosOrder();
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
                    accountInstance = o5Var.getAccountInstance();
                    ArrayList<Object> arrayList2 = selectedPhotosOrder;
                    long j11 = o5Var.B1;
                    if (i10 != 4 && !z13) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, null, null, storyItem, null, z16, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, o5Var.f3406b2.getSendMonoForumPeerId(), o5Var.f3406b2.getSendMessageSuggestionParams());
                    i14++;
                    selectedPhotos = hashMap;
                    selectedPhotosOrder = arrayList2;
                    i13 = 0;
                }
                o5Var.f3406b2.setFieldText("");
                if (j10 <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                o5Var.k0(z14);
            }
        }
    }

    @Override
    public final boolean q() {
        return this.f3791a.N0();
    }

    @Override
    public final void x() {
    }

    @Override
    public final void K(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }
}
