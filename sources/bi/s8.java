package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class s8 implements RequestDelegate {
    public final int f3638a;
    public final w8 f3639b;

    public s8(w8 w8Var, int i10) {
        this.f3638a = i10;
        this.f3639b = w8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        q4 q4Var;
        TLRPC.Updates updates;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i12;
        int i13;
        switch (this.f3638a) {
            case 0:
                w8 w8Var = this.f3639b;
                long j10 = w8Var.J;
                String str = w8Var.f3916f;
                boolean z12 = w8Var.f3914b;
                di.k8 k8Var = w8Var.f3915c;
                int i14 = w8Var.M.f3962a;
                if (tLObject instanceof TLRPC.Updates) {
                    w8Var.I = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (k8Var.f7176b0) {
                        MessagesController.getInstance(i14).lambda$processUpdates$377(updates3, false);
                        AndroidUtilities.runOnUIThread(new t8(w8Var, 1));
                        return;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i15 < updates3.updates.size()) {
                        if (updates3.updates.get(i15) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i15)).story;
                            storyItem2.attachPath = w8Var.e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z12;
                            int i17 = storyItem2.f19451id;
                            if (storyItem == null) {
                                storyItem = storyItem2;
                            } else {
                                storyItem.media = storyItem2.media;
                            }
                            i16 = i17;
                        }
                        if (updates3.updates.get(i15) instanceof TL_update.TL_updateStoryID) {
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates3.updates.get(i15);
                            if (storyItem == null) {
                                storyItem = new TL_stories.TL_storyItem();
                                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                                storyItem.date = currentTime;
                                int i18 = k8Var.I0;
                                if (i18 == Integer.MAX_VALUE) {
                                    i18 = 86400;
                                }
                                storyItem.expire_date = currentTime + i18;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = k8Var.F0;
                                ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                int i19 = 0;
                                while (true) {
                                    z10 = z12;
                                    if (i19 < arrayList2.size()) {
                                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i19);
                                        if (inputPrivacyRule != null) {
                                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                                arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                                arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                                arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                                            } else {
                                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                                    arrayList = arrayList2;
                                                    i12 = i15;
                                                    int i20 = 0;
                                                    for (TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule; i20 < tL_inputPrivacyValueDisallowUsers.users.size(); tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers) {
                                                        i20 = com.google.android.gms.internal.play_billing.k3.h(tL_inputPrivacyValueDisallowUsers.users.get(i20).user_id, tL_privacyValueDisallowUsers.users, i20, 1);
                                                        i14 = i14;
                                                        updates3 = updates3;
                                                    }
                                                    updates2 = updates3;
                                                    i13 = i14;
                                                    arrayList3.add(tL_privacyValueDisallowUsers);
                                                } else {
                                                    updates2 = updates3;
                                                    arrayList = arrayList2;
                                                    i12 = i15;
                                                    i13 = i14;
                                                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                        int i21 = 0;
                                                        for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i21 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                                            i21 = com.google.android.gms.internal.play_billing.k3.h(tL_inputPrivacyValueAllowUsers.users.get(i21).user_id, tL_privacyValueAllowUsers.users, i21, 1);
                                                        }
                                                        arrayList3.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                i19++;
                                                z12 = z10;
                                                arrayList2 = arrayList;
                                                i15 = i12;
                                                i14 = i13;
                                                updates3 = updates2;
                                            }
                                        }
                                        updates2 = updates3;
                                        arrayList = arrayList2;
                                        i12 = i15;
                                        i13 = i14;
                                        i19++;
                                        z12 = z10;
                                        arrayList2 = arrayList;
                                        i15 = i12;
                                        i14 = i13;
                                        updates3 = updates2;
                                    } else {
                                        updates = updates3;
                                        i10 = i15;
                                        i11 = i14;
                                        storyItem.privacy = arrayList3;
                                        if (k8Var.I0 == Integer.MAX_VALUE) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        storyItem.pinned = z11;
                                        storyItem.dialogId = UserConfig.getInstance(i11).clientUserId;
                                        storyItem.attachPath = w8Var.e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f19451id = tL_updateStoryID.f19471id;
                                        storyItem.justUploaded = !z10;
                                        i15 = i10 + 1;
                                        z12 = z10;
                                        i14 = i11;
                                        updates3 = updates;
                                    }
                                }
                            }
                        }
                        updates = updates3;
                        z10 = z12;
                        i10 = i15;
                        i11 = i14;
                        i15 = i10 + 1;
                        z12 = z10;
                        i14 = i11;
                        updates3 = updates;
                    }
                    TLRPC.Updates updates4 = updates3;
                    boolean z13 = z12;
                    int i22 = i14;
                    if (w8Var.v) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i22).getInputPeer(j10);
                        tL_stories_deleteStories.peer = inputPeer;
                        if (inputPeer != null) {
                            tL_stories_deleteStories.f19454id.add(Integer.valueOf(i16));
                            ConnectionsManager.getInstance(i22).sendRequest(tL_stories_deleteStories, new s8(w8Var, 1));
                        }
                    } else {
                        if ((i16 == 0 || z13) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = MessagesController.getInstance(i22).getPeer(j10);
                            tL_updateStory.story = storyItem;
                            AndroidUtilities.runOnUIThread(new u8(0, w8Var, tL_updateStory));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                FileLoader.getInstance(i22).setLocalPathTo(storyItem.media.document, storyItem.attachPath);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    FileLoader.getInstance(i22).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE), storyItem.attachPath);
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new a3.i0(w8Var, j10, storyItem, 3));
                        MessagesController.getInstance(i22).processUpdateArray(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    w8Var.L = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && k8Var.f7179c0 != null && (q4Var = k8Var.f7181d0) != null) {
                    q4Var.run(new v8(w8Var, 0));
                    k8Var.f7181d0 = null;
                    return;
                } else if (tL_error != null && !z12) {
                    AndroidUtilities.runOnUIThread(new u8(1, w8Var, tL_error));
                }
                AndroidUtilities.runOnUIThread(new t8(w8Var, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new v7(this.f3639b.M, 2));
                return;
        }
    }
}
