package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class b2b implements RequestDelegate {
    public final byte a;
    public final f2b b;

    public b2b(f2b f2bVar, byte b) {
        this.a = b;
        this.b = f2bVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        f28 f28Var;
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
                f2b f2bVar = this.b;
                long j = f2bVar.K;
                String str = f2bVar.f;
                boolean z4 = f2bVar.b;
                f4b f4bVar = f2bVar.c;
                int i7 = f2bVar.N.a;
                w5b w5bVar = null;
                if (tLObject instanceof TLRPC.Updates) {
                    f2bVar.J = false;
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (f4bVar.b0) {
                        na7.q1(i7).Q3(updates, false);
                        gl.d3(new c2b(f2bVar, (byte) 1));
                        return;
                    }
                    int i8 = 0;
                    int i9 = 0;
                    TL_stories.StoryItem storyItem = null;
                    while (i8 < updates.updates.size()) {
                        if (updates.updates.get(i8) instanceof TL_stories.TL_updateStory) {
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates.updates.get(i8)).story;
                            storyItem2.attachPath = f2bVar.e;
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
                                int i11 = f4bVar.I0;
                                if (i11 == Integer.MAX_VALUE) {
                                    i11 = 86400;
                                }
                                storyItem.expire_date = currentTime + i11;
                                storyItem.parsedPrivacy = w5bVar;
                                ArrayList arrayList2 = f4bVar.F0;
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
                                                    i14 = mue.c(i14, 1, tL_inputPrivacyValueDisallowUsers.users.get(i14).user_id, tL_privacyValueDisallowUsers.users);
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
                                                    for (int i15 = 0; i15 < tL_inputPrivacyValueAllowUsers.users.size(); i15 = mue.c(i15, 1, tL_inputPrivacyValueAllowUsers.users.get(i15).user_id, tL_privacyValueAllowUsers.users)) {
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
                                if (f4bVar.I0 == Integer.MAX_VALUE) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                storyItem.pinned = z2;
                                storyItem.dialogId = y6c.h(i3).n;
                                storyItem.attachPath = f2bVar.e;
                                storyItem.firstFramePath = str;
                                storyItem.id = tL_updateStoryID.id;
                                storyItem.justUploaded = !z;
                                i8 = i + 1;
                                z4 = z;
                                i9 = i2;
                                i7 = i3;
                                w5bVar = null;
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
                        w5bVar = null;
                    }
                    boolean z5 = z4;
                    int i16 = i7;
                    if (f2bVar.w) {
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = na7.q1(i16).h1(j);
                        tL_stories_deleteStories.id.add(Integer.valueOf(i9));
                        ConnectionsManager.getInstance(i16).sendRequest(tL_stories_deleteStories, new b2b(f2bVar, (byte) 1));
                    } else {
                        if ((i9 == 0 || z5) && storyItem != null) {
                            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                            tL_updateStory.peer = na7.q1(i16).w1(j);
                            tL_updateStory.story = storyItem;
                            gl.d3(new iya(f2bVar, tL_updateStory, (byte) 10));
                        }
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia != null && storyItem.attachPath != null) {
                            if (messageMedia.document != null) {
                                ba4.G(i16).e0(storyItem.attachPath, storyItem.media.document);
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    ba4.G(i16).e0(storyItem.attachPath, ba4.w(photo.sizes, Integer.MAX_VALUE, false, null, false));
                                }
                            }
                        }
                        gl.d3(new d2b(f2bVar, j, storyItem, (byte) 0));
                        na7.q1(i16).P3(updates.updates, updates.users, updates.chats, false, updates.date);
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    f2bVar.M = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && ab4.r(tL_error.text) && f4bVar.c0 != null && (f28Var = f4bVar.d0) != null) {
                    f28Var.a(new e2b(f2bVar, (byte) 0));
                    f4bVar.d0 = null;
                    return;
                } else if (tL_error != null && !z4) {
                    gl.d3(new iya(f2bVar, tL_error, (byte) 11));
                }
                gl.d3(new c2b(f2bVar, (byte) 1));
                return;
            default:
                gl.d3(new m1b(this.b.N, (byte) 2));
                return;
        }
    }
}
