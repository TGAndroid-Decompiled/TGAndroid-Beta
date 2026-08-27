package jh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class s1 implements org.telegram.ui.ActionBar.a2, sg.a {

    public final int f13935a;

    public final e4 f13936b;

    public s1(e4 e4Var, int i10) {
        this.f13935a = i10;
        this.f13936b = e4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j10;
        TLRPC.UserFull userFull;
        ?? r13;
        ?? r10;
        TLRPC.UserFull userFull2;
        boolean z10;
        TL_stories.PeerStories peerStories;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f13935a;
        e4 e4Var = this.f13936b;
        switch (i11) {
            case 0:
                o2 o2Var = e4Var.X1;
                if (o2Var != null) {
                    o2Var.C();
                }
                break;
            default:
                c4 c4Var = e4Var.K1;
                boolean z12 = true;
                TLRPC.UserFull userFull3 = null;
                if (c4Var.f13145f && (storyItem = c4Var.f13141a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d1 d1Var = d1.S;
                        if (d1Var != null && d1Var.f(inputGroupCall)) {
                            d1.S.e();
                            if (d1.S != null) {
                                d1.S = null;
                                NotificationCenter.getInstance(e4Var.f13296y2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1.S.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = c4Var.f13141a;
                if (storyItem2 instanceof a6) {
                    b6 b6Var = ((a6) storyItem2).f13045a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    b6Var.getClass();
                    b6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    e4 e4Var2 = c4Var.f13149k;
                    s6 s6Var = e4Var2.O1;
                    long j11 = e4Var2.f13291x1;
                    a0.h hVar = s6Var.f13961i;
                    int i12 = s6Var.f13955a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                j10 = 0;
                                userFull = userFull3;
                                r13 = userFull;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull4 = MessagesController.getInstance(i12).getUserFull(j11);
                                if (userFull4 != null) {
                                    j10 = 0;
                                    r13 = userFull3;
                                    userFull = userFull4;
                                    r10 = userFull4.stories;
                                } else {
                                    j10 = 0;
                                    userFull2 = userFull3;
                                    userFull = userFull4;
                                    r10 = userFull2;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j11);
                                if (chatFull != null) {
                                    r13 = chatFull;
                                    r10 = chatFull.stories;
                                    userFull = userFull3;
                                } else {
                                    userFull = userFull3;
                                    r13 = chatFull;
                                    r10 = userFull;
                                }
                            }
                            if (r10 != 0) {
                                r13 = userFull2;
                                r10 = peerStories;
                                int i14 = 0;
                                while (i14 < r10.stories.size()) {
                                    if (r10.stories.get(i14).f22617id == storyItem2.f22617id) {
                                        r10.stories.remove(i14);
                                        if (r10.stories.size() == 0) {
                                            if (!s6Var.K(j11)) {
                                                hVar.l(j11);
                                                s6Var.f13960g.remove(r10);
                                                s6Var.h.remove(r10);
                                            }
                                            if (j11 > j10) {
                                                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                                                if (user != null) {
                                                    user.stories_unavailable = z12;
                                                }
                                            } else {
                                                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
                                                if (chat != null) {
                                                    chat.stories_unavailable = true;
                                                }
                                            }
                                        }
                                    } else {
                                        i14++;
                                        z12 = true;
                                    }
                                }
                            }
                            if (r13 != 0) {
                                z10 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(r13, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != null) {
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, z10);
                            }
                            i13++;
                            z12 = true;
                            userFull3 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                        tL_stories_deleteStories.f22620id.add(Integer.valueOf(storyItem2.f22617id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new p5(s6Var, 5));
                        f7 f7Var = s6Var.f13963k;
                        f7Var.f13332b.getStorageQueue().postRunnable(new d7(f7Var, j11, storyItem2.f22617id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        s6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    r6 r6Var = c4Var.f13142b;
                    if (r6Var != null) {
                        r6Var.a();
                    }
                }
                e4Var.j1();
                if (e4Var.G1 && e4Var.f13287w1 == 0) {
                    ((z8) e4Var.M1).j();
                } else {
                    int i15 = e4Var.F1;
                    int i16 = e4Var.f13287w1;
                    if (i15 >= i16) {
                        e4Var.F1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            e4Var.F1 = 0;
                        }
                    }
                    e4Var.f1(z11);
                    i9 i9Var = e4Var.F0;
                    if (i9Var != null) {
                        i9Var.p();
                    }
                }
                break;
        }
    }

    @Override
    public void k(int i10) {
        if (i10 == 0) {
            this.f13936b.P0();
        }
    }
}
