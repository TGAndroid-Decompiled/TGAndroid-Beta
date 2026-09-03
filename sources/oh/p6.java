package oh;

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
public final class p6 implements RequestDelegate {
    public final int f17629a;
    public final s6 f17630b;

    public p6(s6 s6Var, int i10) {
        this.f17629a = i10;
        this.f17630b = s6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        lh.h hVar;
        TLRPC.Updates updates;
        boolean z4;
        int i10;
        int i11;
        boolean z10;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i12;
        int i13;
        switch (this.f17629a) {
            case 0:
                s6 s6Var = this.f17630b;
                long j10 = s6Var.G;
                String str = s6Var.f17741f;
                boolean z11 = s6Var.f17738b;
                qh.r6 r6Var = s6Var.f17739c;
                int i14 = s6Var.J.f17772a;
                if (tLObject instanceof TLRPC.Updates) {
                    s6Var.F = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (r6Var.f45996b0) {
                        MessagesController.getInstance(i14).processUpdates(updates3, false);
                        AndroidUtilities.runOnUIThread(new q6(s6Var, 1));
                        return;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i15 < updates3.updates.size()) {
                        if (updates3.updates.get(i15) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i15)).story;
                            storyItem2.attachPath = s6Var.f17740e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z11;
                            int i17 = storyItem2.f21082id;
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
                                int i18 = r6Var.I0;
                                if (i18 == Integer.MAX_VALUE) {
                                    i18 = 86400;
                                }
                                storyItem.expire_date = currentTime + i18;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = r6Var.F0;
                                ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                int i19 = 0;
                                while (true) {
                                    z4 = z11;
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
                                                        i20 = android.support.v4.media.a.g(tL_inputPrivacyValueDisallowUsers.users.get(i20).user_id, tL_privacyValueDisallowUsers.users, i20, 1);
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
                                                            i21 = android.support.v4.media.a.g(tL_inputPrivacyValueAllowUsers.users.get(i21).user_id, tL_privacyValueAllowUsers.users, i21, 1);
                                                        }
                                                        arrayList3.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                i19++;
                                                z11 = z4;
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
                                        z11 = z4;
                                        arrayList2 = arrayList;
                                        i15 = i12;
                                        i14 = i13;
                                        updates3 = updates2;
                                    } else {
                                        updates = updates3;
                                        i10 = i15;
                                        i11 = i14;
                                        storyItem.privacy = arrayList3;
                                        if (r6Var.I0 == Integer.MAX_VALUE) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        storyItem.pinned = z10;
                                        storyItem.dialogId = UserConfig.getInstance(i11).clientUserId;
                                        storyItem.attachPath = s6Var.f17740e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f21082id = tL_updateStoryID.f21101id;
                                        storyItem.justUploaded = !z4;
                                        i15 = i10 + 1;
                                        z11 = z4;
                                        i14 = i11;
                                        updates3 = updates;
                                    }
                                }
                            }
                        }
                        updates = updates3;
                        z4 = z11;
                        i10 = i15;
                        i11 = i14;
                        i15 = i10 + 1;
                        z11 = z4;
                        i14 = i11;
                        updates3 = updates;
                    }
                    TLRPC.Updates updates4 = updates3;
                    boolean z12 = z11;
                    int i22 = i14;
                    if (s6Var.v) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i22).getInputPeer(j10);
                        tL_stories_deleteStories.peer = inputPeer;
                        if (inputPeer != null) {
                            tL_stories_deleteStories.f21085id.add(Integer.valueOf(i16));
                            ConnectionsManager.getInstance(i22).sendRequest(tL_stories_deleteStories, new p6(s6Var, 1));
                        }
                    } else {
                        if ((i16 == 0 || z12) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = MessagesController.getInstance(i22).getPeer(j10);
                            tL_updateStory.story = storyItem;
                            AndroidUtilities.runOnUIThread(new z1(9, s6Var, tL_updateStory));
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
                        AndroidUtilities.runOnUIThread(new i5.v(s6Var, j10, storyItem, 7));
                        MessagesController.getInstance(i22).processUpdateArray(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    s6Var.I = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && r6Var.f45999c0 != null && (hVar = r6Var.f46001d0) != null) {
                    hVar.run(new r6(s6Var, 0));
                    r6Var.f46001d0 = null;
                    return;
                } else if (tL_error != null && !z11) {
                    AndroidUtilities.runOnUIThread(new z1(10, s6Var, tL_error));
                }
                AndroidUtilities.runOnUIThread(new q6(s6Var, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new x5(this.f17630b.J, 2));
                return;
        }
    }
}
