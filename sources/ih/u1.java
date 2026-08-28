package ih;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class u1 implements org.telegram.ui.ActionBar.b2, rg.a {
    public final int f12180a;
    public final i4 f12181b;

    public u1(i4 i4Var, int i9) {
        this.f12180a = i9;
        this.f12181b = i4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.f12180a;
        i4 i4Var = this.f12181b;
        switch (i10) {
            case 0:
                p2 p2Var = i4Var.X1;
                if (p2Var != null) {
                    p2Var.A();
                    return;
                }
                return;
            default:
                g4 g4Var = i4Var.K1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (g4Var.f11470f && (storyItem = g4Var.f11466a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        f1 f1Var = f1.S;
                        if (f1Var != null && f1Var.f(inputGroupCall)) {
                            f1.S.e();
                            if (f1.S != null) {
                                f1.S = null;
                                NotificationCenter.getInstance(i4Var.f11609y2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1.S.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = g4Var.f11466a;
                if (storyItem2 instanceof e6) {
                    f6 f6Var = ((e6) storyItem2).f11366a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    f6Var.getClass();
                    f6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    i4 i4Var2 = g4Var.f11474k;
                    v6 v6Var = i4Var2.O1;
                    long j11 = i4Var2.f11604x1;
                    a0.h hVar = v6Var.f12242i;
                    int i11 = v6Var.f12236a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i12 = 0;
                        while (i12 < 2) {
                            if (i12 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                userFull = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(j11);
                                if (userFull2 != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = userFull2.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i11).getChatFull(-j11);
                                if (chatFull4 != null) {
                                    chatFull = chatFull4;
                                    peerStories = chatFull4.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull5 = chatFull2;
                                    chatFull = chatFull4;
                                    peerStories = chatFull5;
                                    userFull = chatFull5;
                                }
                            }
                            if (peerStories != null) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i13).f22617id == storyItem2.f22617id) {
                                            peerStories.stories.remove(i13);
                                            if (peerStories.stories.size() == 0) {
                                                if (!v6Var.K(j11)) {
                                                    hVar.l(j11);
                                                    v6Var.f12241g.remove(peerStories);
                                                    v6Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i13++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i11).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, z10);
                            }
                            i12++;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i11).getInputPeer(j11);
                        tL_stories_deleteStories.f22620id.add(Integer.valueOf(storyItem2.f22617id));
                        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_deleteStories, new t5(v6Var, 5));
                        i7 i7Var = v6Var.f12244k;
                        i7Var.f11620b.getStorageQueue().postRunnable(new g7(i7Var, j11, storyItem2.f22617id, 0));
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i11).checkArchiveFolder();
                        v6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    u6 u6Var = g4Var.f11467b;
                    if (u6Var != null) {
                        u6Var.a();
                    }
                }
                i4Var.j1();
                if (i4Var.G1 && i4Var.f11600w1 == 0) {
                    ((d9) i4Var.M1).j();
                    return;
                }
                int i14 = i4Var.F1;
                int i15 = i4Var.f11600w1;
                if (i14 >= i15) {
                    i4Var.F1 = i15 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i14 < 0) {
                        i4Var.F1 = 0;
                    }
                }
                i4Var.f1(z11);
                m9 m9Var = i4Var.F0;
                if (m9Var != null) {
                    m9Var.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(int i9) {
        if (i9 == 0) {
            this.f12181b.P0();
        }
    }
}
