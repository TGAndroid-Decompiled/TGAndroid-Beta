package di;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class u6 implements RequestDelegate {
    public final int f9837a;
    public final x6 f9838b;

    public u6(x6 x6Var, int i7) {
        this.f9837a = i7;
        this.f9838b = x6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        bi.v3 v3Var;
        TLRPC.Updates updates;
        boolean z9;
        int i7;
        int i10;
        boolean z10;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i11;
        int i12;
        switch (this.f9837a) {
            case 0:
                x6 x6Var = this.f9838b;
                long j3 = x6Var.J;
                String str = x6Var.f9932f;
                boolean z11 = x6Var.f9929b;
                fi.e7 e7Var = x6Var.f9930c;
                int i13 = x6Var.M.f9963a;
                if (tLObject instanceof TLRPC.Updates) {
                    x6Var.I = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (e7Var.f11880b0) {
                        qp.s1(i13).O3(updates3, false);
                        org.telegram.messenger.g0.h3(new v6(x6Var, 1));
                        return;
                    }
                    int i14 = 0;
                    int i15 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i14 < updates3.updates.size()) {
                        if (updates3.updates.get(i14) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i14)).story;
                            storyItem2.attachPath = x6Var.f9931e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z11;
                            int i16 = storyItem2.f27195id;
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
                                int i17 = e7Var.I0;
                                if (i17 == Integer.MAX_VALUE) {
                                    i17 = 86400;
                                }
                                storyItem.expire_date = currentTime + i17;
                                storyItem.parsedPrivacy = null;
                                ArrayList arrayList2 = e7Var.F0;
                                ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                int i18 = 0;
                                while (true) {
                                    z9 = z11;
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
                                                        i19 = com.google.android.recaptcha.internal.a.g(i19, 1, tL_inputPrivacyValueDisallowUsers.users.get(i19).user_id, tL_privacyValueDisallowUsers.users);
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
                                                            i20 = com.google.android.recaptcha.internal.a.g(i20, 1, tL_inputPrivacyValueAllowUsers.users.get(i20).user_id, tL_privacyValueAllowUsers.users);
                                                        }
                                                        arrayList3.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                i18++;
                                                z11 = z9;
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
                                        z11 = z9;
                                        arrayList2 = arrayList;
                                        i14 = i11;
                                        i13 = i12;
                                        updates3 = updates2;
                                    } else {
                                        updates = updates3;
                                        i7 = i14;
                                        i10 = i13;
                                        storyItem.privacy = arrayList3;
                                        if (e7Var.I0 == Integer.MAX_VALUE) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        storyItem.pinned = z10;
                                        storyItem.dialogId = p10.i(i10).f24489n;
                                        storyItem.attachPath = x6Var.f9931e;
                                        storyItem.firstFramePath = str;
                                        storyItem.f27195id = tL_updateStoryID.f27215id;
                                        storyItem.justUploaded = !z9;
                                        i14 = i7 + 1;
                                        z11 = z9;
                                        i13 = i10;
                                        updates3 = updates;
                                    }
                                }
                            }
                        }
                        updates = updates3;
                        z9 = z11;
                        i7 = i14;
                        i10 = i13;
                        i14 = i7 + 1;
                        z11 = z9;
                        i13 = i10;
                        updates3 = updates;
                    }
                    TLRPC.Updates updates4 = updates3;
                    boolean z12 = z11;
                    int i21 = i13;
                    if (x6Var.f9936w) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = qp.s1(i21).j1(j3);
                        tL_stories_deleteStories.f27198id.add(Integer.valueOf(i15));
                        ConnectionsManager.getInstance(i21).sendRequest(tL_stories_deleteStories, new u6(x6Var, 1));
                    } else {
                        if ((i15 == 0 || z12) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = qp.s1(i21).z1(j3);
                            tL_updateStory.story = storyItem;
                            org.telegram.messenger.g0.h3(new z0(11, x6Var, tL_updateStory));
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
                        org.telegram.messenger.g0.h3(new bi.d3(x6Var, j3, storyItem, 6));
                        qp.s1(i21).N3(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    x6Var.L = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && e7Var.f11883c0 != null && (v3Var = e7Var.f11885d0) != null) {
                    v3Var.a(new w6(x6Var, 0));
                    e7Var.f11885d0 = null;
                    return;
                } else if (tL_error != null && !z11) {
                    org.telegram.messenger.g0.h3(new z0(12, x6Var, tL_error));
                }
                org.telegram.messenger.g0.h3(new v6(x6Var, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new e6(this.f9838b.M, 2));
                return;
        }
    }
}
