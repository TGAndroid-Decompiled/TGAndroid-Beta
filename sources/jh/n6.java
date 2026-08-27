package jh;

import java.io.FileNotFoundException;
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

public final class n6 implements RequestDelegate {

    public final int f13700a;

    public final r6 f13701b;

    public n6(r6 r6Var, int i10) {
        this.f13700a = i10;
        this.f13701b = r6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        gh.i iVar;
        TLRPC.Updates updates;
        boolean z10;
        int i10;
        int i11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i12;
        int i13;
        switch (this.f13700a) {
            case 0:
                r6 r6Var = this.f13701b;
                long j10 = r6Var.F;
                String str = r6Var.f13909f;
                boolean z11 = r6Var.f13906b;
                lh.z7 z7Var = r6Var.f13907c;
                int i14 = r6Var.I.f13955a;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tLObject instanceof TL_bots.botPreviewMedia) {
                        r6Var.H = (TL_bots.botPreviewMedia) tLObject;
                    } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && z7Var.f17200c0 != null && (iVar = z7Var.f17202d0) != null) {
                        iVar.run(new q6(r6Var, 0));
                        z7Var.f17202d0 = null;
                    } else if (tL_error != null && !z11) {
                        AndroidUtilities.runOnUIThread(new p6(1, r6Var, tL_error));
                    }
                    break;
                } else {
                    r6Var.E = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (z7Var.f17197b0) {
                        MessagesController.getInstance(i14).processUpdates(updates3, false);
                        AndroidUtilities.runOnUIThread(new o6(r6Var, 1));
                        break;
                    } else {
                        int i15 = 0;
                        int i16 = 0;
                        TL_stories.StoryItem tL_storyItem = null;
                        while (i15 < updates3.updates.size()) {
                            if (updates3.updates.get(i15) instanceof TL_stories.TL_updateStory) {
                                TL_stories.StoryItem storyItem = ((TL_stories.TL_updateStory) updates3.updates.get(i15)).story;
                                storyItem.attachPath = r6Var.f13908e;
                                storyItem.firstFramePath = str;
                                storyItem.justUploaded = !z11;
                                int i17 = storyItem.f22617id;
                                if (tL_storyItem == null) {
                                    tL_storyItem = storyItem;
                                } else {
                                    tL_storyItem.media = storyItem.media;
                                }
                                i16 = i17;
                            }
                            if (updates3.updates.get(i15) instanceof TL_update.TL_updateStoryID) {
                                TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates3.updates.get(i15);
                                if (tL_storyItem == null) {
                                    tL_storyItem = new TL_stories.TL_storyItem();
                                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                                    tL_storyItem.date = currentTime;
                                    int i18 = z7Var.I0;
                                    if (i18 == Integer.MAX_VALUE) {
                                        i18 = 86400;
                                    }
                                    tL_storyItem.expire_date = currentTime + i18;
                                    tL_storyItem.parsedPrivacy = null;
                                    ArrayList arrayList2 = z7Var.F0;
                                    ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                    int i19 = 0;
                                    while (true) {
                                        z10 = z11;
                                        if (i19 < arrayList2.size()) {
                                            TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i19);
                                            if (inputPrivacyRule != null) {
                                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                                    arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                                                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                                    arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                                                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                                    arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                                                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                                    arrayList = arrayList2;
                                                    i12 = i15;
                                                    int iF = 0;
                                                    for (TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule; iF < tL_inputPrivacyValueDisallowUsers.users.size(); tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers) {
                                                        iF = com.google.android.recaptcha.internal.a.f(tL_inputPrivacyValueDisallowUsers.users.get(iF).user_id, tL_privacyValueDisallowUsers.users, iF, 1);
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
                                                        int iF2 = 0;
                                                        for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; iF2 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                                            iF2 = com.google.android.recaptcha.internal.a.f(tL_inputPrivacyValueAllowUsers.users.get(iF2).user_id, tL_privacyValueAllowUsers.users, iF2, 1);
                                                        }
                                                        arrayList3.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                updates2 = updates3;
                                                arrayList = arrayList2;
                                                i12 = i15;
                                                i13 = i14;
                                            } else {
                                                updates2 = updates3;
                                                arrayList = arrayList2;
                                                i12 = i15;
                                                i13 = i14;
                                            }
                                            i19++;
                                            z11 = z10;
                                            arrayList2 = arrayList;
                                            i15 = i12;
                                            i14 = i13;
                                            updates3 = updates2;
                                        } else {
                                            updates = updates3;
                                            i10 = i15;
                                            i11 = i14;
                                            tL_storyItem.privacy = arrayList3;
                                            tL_storyItem.pinned = z7Var.I0 == Integer.MAX_VALUE;
                                            tL_storyItem.dialogId = UserConfig.getInstance(i11).clientUserId;
                                            tL_storyItem.attachPath = r6Var.f13908e;
                                            tL_storyItem.firstFramePath = str;
                                            tL_storyItem.f22617id = tL_updateStoryID.f22636id;
                                            tL_storyItem.justUploaded = !z10;
                                        }
                                    }
                                } else {
                                    updates = updates3;
                                    z10 = z11;
                                    i10 = i15;
                                    i11 = i14;
                                }
                            } else {
                                updates = updates3;
                                z10 = z11;
                                i10 = i15;
                                i11 = i14;
                            }
                            i15 = i10 + 1;
                            z11 = z10;
                            i14 = i11;
                            updates3 = updates;
                        }
                        TLRPC.Updates updates4 = updates3;
                        boolean z12 = z11;
                        int i20 = i14;
                        if (r6Var.v) {
                            TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i20).getInputPeer(j10);
                            tL_stories_deleteStories.peer = inputPeer;
                            if (inputPeer != null) {
                                tL_stories_deleteStories.f22620id.add(Integer.valueOf(i16));
                                ConnectionsManager.getInstance(i20).sendRequest(tL_stories_deleteStories, new n6(r6Var, 1));
                            }
                        } else {
                            if ((i16 == 0 || z12) && tL_storyItem != null) {
                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                tL_updateStory.peer = MessagesController.getInstance(i20).getPeer(j10);
                                tL_updateStory.story = tL_storyItem;
                                AndroidUtilities.runOnUIThread(new p6(0, r6Var, tL_updateStory));
                            }
                            TLRPC.MessageMedia messageMedia = tL_storyItem.media;
                            if (messageMedia != null && tL_storyItem.attachPath != null) {
                                if (messageMedia.document != null) {
                                    FileLoader.getInstance(i20).setLocalPathTo(tL_storyItem.media.document, tL_storyItem.attachPath);
                                } else {
                                    TLRPC.Photo photo = messageMedia.photo;
                                    if (photo != null) {
                                        FileLoader.getInstance(i20).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE), tL_storyItem.attachPath);
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new e5.u(r6Var, j10, tL_storyItem, 7));
                            MessagesController.getInstance(i20).processUpdateArray(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new o6(r6Var, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new v5(this.f13701b.I, 2));
                break;
        }
    }
}
