package fi;

import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class o6 implements RequestDelegate {
    public final int f12123a;
    public final r6 f12124b;

    public o6(r6 r6Var, int i7) {
        this.f12123a = i7;
        this.f12124b = r6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        bi.j jVar;
        TLRPC.Updates updates;
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i11;
        int i12;
        switch (this.f12123a) {
            case 0:
                r6 r6Var = this.f12124b;
                long j3 = r6Var.K;
                String str = r6Var.f12276f;
                boolean z12 = r6Var.f12273b;
                hi.d7 d7Var = r6Var.f12274c;
                int i13 = r6Var.N.f12319a;
                if (tLObject instanceof TLRPC.Updates) {
                    r6Var.J = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (d7Var.f14127b0) {
                        np.s1(i13).O3(updates3, false);
                        org.telegram.messenger.g0.h3(new p6(r6Var, 1));
                        return;
                    }
                    int i14 = 0;
                    int i15 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i14 < updates3.updates.size()) {
                        if (updates3.updates.get(i14) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i14)).story;
                            storyItem2.attachPath = r6Var.f12275e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z12;
                            int i16 = storyItem2.f28290id;
                            if (storyItem == null) {
                                storyItem = storyItem2;
                            } else {
                                storyItem.media = storyItem2.media;
                            }
                            i15 = i16;
                        }
                        if (updates3.updates.get(i14) instanceof TL_update.TL_updateStoryID) {
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates3.updates.get(i14);
                            if (storyItem == null) {
                                storyItem = new TL_stories.TL_storyItem();
                                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                                storyItem.date = currentTime;
                                int i17 = d7Var.I0;
                                if (i17 == Integer.MAX_VALUE) {
                                    i17 = 86400;
                                }
                                storyItem.expire_date = currentTime + i17;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = d7Var.F0;
                                ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                int i18 = 0;
                                while (true) {
                                    z10 = z12;
                                    if (i18 < arrayList2.size()) {
                                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i18);
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
                                                    i11 = i14;
                                                    int i19 = 0;
                                                    for (TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule; i19 < tL_inputPrivacyValueDisallowUsers.users.size(); tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers) {
                                                        i19 = com.google.android.gms.internal.vision.e2.g(i19, 1, tL_inputPrivacyValueDisallowUsers.users.get(i19).user_id, tL_privacyValueDisallowUsers.users);
                                                        i13 = i13;
                                                        updates3 = updates3;
                                                    }
                                                    updates2 = updates3;
                                                    i12 = i13;
                                                    arrayList3.add(tL_privacyValueDisallowUsers);
                                                } else {
                                                    updates2 = updates3;
                                                    arrayList = arrayList2;
                                                    i11 = i14;
                                                    i12 = i13;
                                                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                        int i20 = 0;
                                                        for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i20 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                                            i20 = com.google.android.gms.internal.vision.e2.g(i20, 1, tL_inputPrivacyValueAllowUsers.users.get(i20).user_id, tL_privacyValueAllowUsers.users);
                                                        }
                                                        arrayList3.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                i18++;
                                                z12 = z10;
                                                arrayList2 = arrayList;
                                                i14 = i11;
                                                i13 = i12;
                                                updates3 = updates2;
                                            }
                                        }
                                        updates2 = updates3;
                                        arrayList = arrayList2;
                                        i11 = i14;
                                        i12 = i13;
                                        i18++;
                                        z12 = z10;
                                        arrayList2 = arrayList;
                                        i14 = i11;
                                        i13 = i12;
                                        updates3 = updates2;
                                    } else {
                                        updates = updates3;
                                        i7 = i14;
                                        i10 = i13;
                                        storyItem.privacy = arrayList3;
                                        if (d7Var.I0 == Integer.MAX_VALUE) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        storyItem.pinned = z11;
                                        storyItem.dialogId = m10.i(i10).f24953n;
                                        storyItem.attachPath = r6Var.f12275e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f28290id = tL_updateStoryID.f28310id;
                                        storyItem.justUploaded = !z10;
                                        i14 = i7 + 1;
                                        z12 = z10;
                                        i13 = i10;
                                        updates3 = updates;
                                    }
                                }
                            }
                        }
                        updates = updates3;
                        z10 = z12;
                        i7 = i14;
                        i10 = i13;
                        i14 = i7 + 1;
                        z12 = z10;
                        i13 = i10;
                        updates3 = updates;
                    }
                    TLRPC.Updates updates4 = updates3;
                    boolean z13 = z12;
                    int i21 = i13;
                    if (r6Var.f12280w) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = np.s1(i21).j1(j3);
                        tL_stories_deleteStories.f28293id.add(Integer.valueOf(i15));
                        ConnectionsManager.getInstance(i21).sendRequest(tL_stories_deleteStories, new o6(r6Var, 1));
                    } else {
                        if ((i15 == 0 || z13) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = np.s1(i21).z1(j3);
                            tL_updateStory.story = storyItem;
                            org.telegram.messenger.g0.h3(new f6(2, r6Var, tL_updateStory));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                org.telegram.messenger.w7.G(i21).e0(storyItem.attachPath, storyItem.media.document);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    org.telegram.messenger.w7.G(i21).e0(storyItem.attachPath, org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false));
                                }
                            }
                        }
                        org.telegram.messenger.g0.h3(new bi.m1(r6Var, j3, storyItem, 7));
                        np.s1(i21).N3(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    r6Var.M = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && d7Var.f14130c0 != null && (jVar = d7Var.f14132d0) != null) {
                    jVar.a(new q6(r6Var, 0));
                    d7Var.f14132d0 = null;
                    return;
                } else if (tL_error != null && !z12) {
                    org.telegram.messenger.g0.h3(new f6(3, r6Var, tL_error));
                }
                org.telegram.messenger.g0.h3(new p6(r6Var, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new x5(this.f12124b.N, 2));
                return;
        }
    }
}
