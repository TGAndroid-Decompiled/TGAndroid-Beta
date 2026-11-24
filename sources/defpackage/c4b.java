package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class c4b implements RequestDelegate {
    public final byte a;
    public final g4b b;

    public c4b(g4b g4bVar, byte b) {
        this.a = b;
        this.b = g4bVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i48 i48Var;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        switch (this.a) {
            case 0:
                g4b g4bVar = this.b;
                long j = g4bVar.K;
                String str = g4bVar.f;
                boolean z4 = g4bVar.b;
                g6b g6bVar = g4bVar.c;
                int i7 = g4bVar.N.a;
                y7b y7bVar = null;
                if (tLObject instanceof TLRPC.Updates) {
                    g4bVar.J = false;
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (g6bVar.b0) {
                        oc7.r1(i7).T3(updates, false);
                        gm.c3(new d4b(g4bVar, (byte) 1));
                        return;
                    }
                    int i8 = 0;
                    int i9 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i8 < updates.updates.size()) {
                        if (updates.updates.get(i8) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates.updates.get(i8)).story;
                            storyItem2.attachPath = g4bVar.e;
                            storyItem2.firstFramePath = str;
                            storyItem2.justUploaded = !z4;
                            int i10 = storyItem2.id;
                            if (storyItem == null) {
                                storyItem = storyItem2;
                            } else {
                                storyItem.media = storyItem2.media;
                            }
                            i9 = i10;
                        }
                        if (updates.updates.get(i8) instanceof TL_update.TL_updateStoryID) {
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates.updates.get(i8);
                            if (storyItem == null) {
                                storyItem = new TL_stories.TL_storyItem();
                                int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                                storyItem.date = currentTime;
                                int i11 = g6bVar.I0;
                                if (i11 == Integer.MAX_VALUE) {
                                    i11 = 86400;
                                }
                                storyItem.expire_date = currentTime + i11;
                                storyItem.parsedPrivacy = y7bVar;
                                ArrayList arrayList2 = g6bVar.F0;
                                ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                int i12 = 0;
                                while (i12 < arrayList2.size()) {
                                    TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i12);
                                    int i13 = i8;
                                    if (inputPrivacyRule != null) {
                                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                            arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                            arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                            arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                                        } else {
                                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                                z3 = z4;
                                                i4 = i9;
                                                int i14 = 0;
                                                while (i14 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                                    i14 = mle.c(i14, 1, tL_inputPrivacyValueDisallowUsers.users.get(i14).user_id, tL_privacyValueDisallowUsers.users);
                                                    i7 = i7;
                                                    arrayList2 = arrayList2;
                                                    i12 = i12;
                                                }
                                                i5 = i7;
                                                arrayList = arrayList2;
                                                i6 = i12;
                                                arrayList3.add(tL_privacyValueDisallowUsers);
                                            } else {
                                                z3 = z4;
                                                i4 = i9;
                                                i5 = i7;
                                                arrayList = arrayList2;
                                                i6 = i12;
                                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                    for (int i15 = 0; i15 < tL_inputPrivacyValueAllowUsers.users.size(); i15 = mle.c(i15, 1, tL_inputPrivacyValueAllowUsers.users.get(i15).user_id, tL_privacyValueAllowUsers.users)) {
                                                    }
                                                    arrayList3.add(tL_privacyValueAllowUsers);
                                                }
                                            }
                                            i12 = i6 + 1;
                                            i8 = i13;
                                            z4 = z3;
                                            i9 = i4;
                                            i7 = i5;
                                            arrayList2 = arrayList;
                                        }
                                    }
                                    z3 = z4;
                                    i4 = i9;
                                    i5 = i7;
                                    arrayList = arrayList2;
                                    i6 = i12;
                                    i12 = i6 + 1;
                                    i8 = i13;
                                    z4 = z3;
                                    i9 = i4;
                                    i7 = i5;
                                    arrayList2 = arrayList;
                                }
                                i = i8;
                                z = z4;
                                i2 = i9;
                                i3 = i7;
                                storyItem.privacy = arrayList3;
                                if (g6bVar.I0 == Integer.MAX_VALUE) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                storyItem.pinned = z2;
                                storyItem.dialogId = z8c.h(i3).n;
                                storyItem.attachPath = g4bVar.e;
                                storyItem.firstFramePath = str;
                                storyItem.id = tL_updateStoryID.id;
                                storyItem.justUploaded = !z;
                                i8 = i + 1;
                                z4 = z;
                                i9 = i2;
                                i7 = i3;
                                y7bVar = null;
                            }
                        }
                        i = i8;
                        z = z4;
                        i2 = i9;
                        i3 = i7;
                        i8 = i + 1;
                        z4 = z;
                        i9 = i2;
                        i7 = i3;
                        y7bVar = null;
                    }
                    boolean z5 = z4;
                    int i16 = i7;
                    if (g4bVar.w) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = oc7.r1(i16).i1(j);
                        tL_stories_deleteStories.id.add(Integer.valueOf(i9));
                        ConnectionsManager.getInstance(i16).sendRequest(tL_stories_deleteStories, new c4b(g4bVar, (byte) 1));
                    } else {
                        if ((i9 == 0 || z5) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = oc7.r1(i16).x1(j);
                            tL_updateStory.story = storyItem;
                            gm.c3(new uva(g4bVar, tL_updateStory, (byte) 12));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                bc4.G(i16).e0(storyItem.attachPath, storyItem.media.document);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    bc4.G(i16).e0(storyItem.attachPath, bc4.w(photo.sizes, Integer.MAX_VALUE, false, null, false));
                                }
                            }
                        }
                        gm.c3(new e4b(g4bVar, j, storyItem, (byte) 0));
                        oc7.r1(i16).S3(updates.updates, updates.users, updates.chats, false, updates.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    g4bVar.M = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && ad4.r(tL_error.text) && g6bVar.c0 != null && (i48Var = g6bVar.d0) != null) {
                    i48Var.a(new f4b(g4bVar, (byte) 0));
                    g6bVar.d0 = null;
                    return;
                } else if (tL_error != null && !z4) {
                    gm.c3(new uva(g4bVar, tL_error, (byte) 13));
                }
                gm.c3(new d4b(g4bVar, (byte) 1));
                return;
            default:
                gm.c3(new o3b(this.b.N, (byte) 2));
                return;
        }
    }
}
