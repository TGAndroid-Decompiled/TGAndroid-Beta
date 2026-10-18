package ci;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class y1 implements org.telegram.ui.ActionBar.a2, kh.a {
    public final int f6141a;
    public final p4 f6142b;

    public y1(p4 p4Var, int i10) {
        this.f6141a = i10;
        this.f6142b = p4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f6141a;
        p4 p4Var = this.f6142b;
        switch (i11) {
            case 0:
                u2 u2Var = p4Var.f5649b2;
                if (u2Var != null) {
                    u2Var.z();
                    return;
                }
                return;
            default:
                n4 n4Var = p4Var.O1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (n4Var.f5594f && (storyItem = n4Var.f5591a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        h1 h1Var = h1.W;
                        if (h1Var != null && h1Var.f(inputGroupCall)) {
                            h1.W.e();
                            if (h1.W != null) {
                                h1.W = null;
                                NotificationCenter.getInstance(p4Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = n4Var.f5591a;
                if (storyItem2 instanceof r6) {
                    s6 s6Var = ((r6) storyItem2).f5867a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    s6Var.getClass();
                    s6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    p4 p4Var2 = n4Var.f5598k;
                    h7 h7Var = p4Var2.S1;
                    long j11 = p4Var2.B1;
                    a0.h hVar = h7Var.f5402i;
                    int i13 = h7Var.f5397a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                userFull = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i13).getUserFull(j11);
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
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i13).getChatFull(-j11);
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
                                int i15 = i12;
                                while (true) {
                                    if (i15 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i15).f20506id == storyItem2.f20506id) {
                                            peerStories.stories.remove(i15);
                                            if (peerStories.stories.size() == 0) {
                                                if (!h7Var.K(j11)) {
                                                    hVar.l(j11);
                                                    h7Var.f5401g.remove(peerStories);
                                                    h7Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-j11));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i15++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i13).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                MessagesStorage.getInstance(i13).updateUserInfo(userFull, z10);
                            }
                            i14++;
                            i12 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i13).getInputPeer(j11);
                        tL_stories_deleteStories.f20509id.add(Integer.valueOf(storyItem2.f20506id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new g6(h7Var, 5));
                        v7 v7Var = h7Var.f5404k;
                        v7Var.f6024b.getStorageQueue().postRunnable(new r7(v7Var, j11, storyItem2.f20506id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        h7Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    g7 g7Var = n4Var.f5592b;
                    if (g7Var != null) {
                        g7Var.a();
                    }
                }
                p4Var.j1();
                if (p4Var.K1 && p4Var.A1 == 0) {
                    ((q9) p4Var.Q1).j();
                    return;
                }
                int i16 = p4Var.J1;
                int i17 = p4Var.A1;
                if (i16 >= i17) {
                    p4Var.J1 = i17 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i16 < 0) {
                        p4Var.J1 = 0;
                    }
                }
                p4Var.f1(z11);
                z9 z9Var = p4Var.J0;
                if (z9Var != null) {
                    z9Var.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(int i10) {
        if (i10 == 0) {
            this.f6142b.P0();
        }
    }
}
