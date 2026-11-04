package ei;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class v6 implements RequestDelegate {
    public final int f11127a;
    public final y6 f11128b;

    public v6(y6 y6Var, int i3) {
        this.f11127a = i3;
        this.f11128b = y6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ai.m mVar;
        TLRPC.Updates updates;
        boolean z10;
        int i3;
        int i10;
        boolean z11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i11;
        int i12;
        switch (this.f11127a) {
            case 0:
                y6 y6Var = this.f11128b;
                long j10 = y6Var.K;
                String str = y6Var.f11238f;
                boolean z12 = y6Var.f11235b;
                gi.f7 f7Var = y6Var.f11236c;
                int i13 = y6Var.N.f11274a;
                if (tLObject instanceof TLRPC.Updates) {
                    y6Var.J = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (f7Var.f12706b0) {
                        hp.s1(i13).O3(updates3, false);
                        org.telegram.messenger.g0.h3(new w6(y6Var, 1));
                        return;
                    }
                    int i14 = 0;
                    int i15 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i14 < updates3.updates.size()) {
                        if (updates3.updates.get(i14) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i14)).story;
                            storyItem2.attachPath = y6Var.f11237e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z12;
                            int i16 = storyItem2.f27240id;
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
                                int i17 = f7Var.I0;
                                if (i17 == Integer.MAX_VALUE) {
                                    i17 = 86400;
                                }
                                storyItem.expire_date = currentTime + i17;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = f7Var.F0;
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
                                                        i19 = a1.g.h(i19, 1, tL_inputPrivacyValueDisallowUsers.users.get(i19).user_id, tL_privacyValueDisallowUsers.users);
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
                                                            i20 = a1.g.h(i20, 1, tL_inputPrivacyValueAllowUsers.users.get(i20).user_id, tL_privacyValueAllowUsers.users);
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
                                        i3 = i14;
                                        i10 = i13;
                                        storyItem.privacy = arrayList3;
                                        if (f7Var.I0 == Integer.MAX_VALUE) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        storyItem.pinned = z11;
                                        storyItem.dialogId = h10.i(i10).f22848n;
                                        storyItem.attachPath = y6Var.f11237e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f27240id = tL_updateStoryID.f27260id;
                                        storyItem.justUploaded = !z10;
                                        i14 = i3 + 1;
                                        z12 = z10;
                                        i13 = i10;
                                        updates3 = updates;
                                    }
                                }
                            }
                        }
                        updates = updates3;
                        z10 = z12;
                        i3 = i14;
                        i10 = i13;
                        i14 = i3 + 1;
                        z12 = z10;
                        i13 = i10;
                        updates3 = updates;
                    }
                    TLRPC.Updates updates4 = updates3;
                    boolean z13 = z12;
                    int i21 = i13;
                    if (y6Var.f11242w) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = hp.s1(i21).j1(j10);
                        tL_stories_deleteStories.f27243id.add(Integer.valueOf(i15));
                        ConnectionsManager.getInstance(i21).sendRequest(tL_stories_deleteStories, new v6(y6Var, 1));
                    } else {
                        if ((i15 == 0 || z13) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = hp.s1(i21).z1(j10);
                            tL_updateStory.story = storyItem;
                            org.telegram.messenger.g0.h3(new b0(14, y6Var, tL_updateStory));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                org.telegram.messenger.w7.G(i21).f0(storyItem.attachPath, storyItem.media.document);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    org.telegram.messenger.w7.G(i21).f0(storyItem.attachPath, org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false));
                                }
                            }
                        }
                        org.telegram.messenger.g0.h3(new ai.r1(y6Var, j10, storyItem, 7));
                        hp.s1(i21).N3(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    y6Var.M = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && f7Var.f12709c0 != null && (mVar = f7Var.f12711d0) != null) {
                    mVar.a(new x6(y6Var, 0));
                    f7Var.f12711d0 = null;
                    return;
                } else if (tL_error != null && !z12) {
                    org.telegram.messenger.g0.h3(new b0(15, y6Var, tL_error));
                }
                org.telegram.messenger.g0.h3(new w6(y6Var, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new f6(this.f11128b.N, 2));
                return;
        }
    }
}
