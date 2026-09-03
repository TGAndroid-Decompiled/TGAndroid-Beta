package nh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class t1 implements org.telegram.ui.ActionBar.c2, wg.a {
    public final int f15881a;
    public final d4 f15882b;

    public t1(d4 d4Var, int i10) {
        this.f15881a = i10;
        this.f15882b = d4Var;
    }

    @Override
    public void j(int i10) {
        if (i10 == 0) {
            this.f15882b.P0();
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z4;
        boolean z10;
        TL_stories.StoryItem storyItem;
        int i11 = this.f15881a;
        d4 d4Var = this.f15882b;
        switch (i11) {
            case 0:
                o2 o2Var = d4Var.Y1;
                if (o2Var != null) {
                    o2Var.B();
                    return;
                }
                return;
            default:
                b4 b4Var = d4Var.L1;
                boolean z11 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (b4Var.f15094f && (storyItem = b4Var.f15091a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        e1 e1Var = e1.T;
                        if (e1Var != null && e1Var.f(inputGroupCall)) {
                            e1.T.e();
                            if (e1.T != null) {
                                e1.T = null;
                                NotificationCenter.getInstance(d4Var.f15243z2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1.T.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = b4Var.f15091a;
                if (storyItem2 instanceof c6) {
                    d6 d6Var = ((c6) storyItem2).f15142a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    d6Var.getClass();
                    d6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    d4 d4Var2 = b4Var.f15098k;
                    t6 t6Var = d4Var2.P1;
                    long j11 = d4Var2.f15238y1;
                    a0.h hVar = t6Var.f15902i;
                    int i12 = t6Var.f15897a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                userFull = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(j11);
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
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j11);
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
                                int i14 = 0;
                                while (true) {
                                    if (i14 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i14).f19394id == storyItem2.f19394id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!t6Var.K(j11)) {
                                                    hVar.l(j11);
                                                    t6Var.f15901g.remove(peerStories);
                                                    t6Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z11;
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
                                            z11 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z4 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(chatFull, false);
                            } else {
                                z4 = false;
                            }
                            if (userFull != 0) {
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, z4);
                            }
                            i13++;
                            z11 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                        tL_stories_deleteStories.f19397id.add(Integer.valueOf(storyItem2.f19394id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new s5(t6Var, 5));
                        g7 g7Var = t6Var.f15904k;
                        g7Var.f15346b.getStorageQueue().postRunnable(new e7(g7Var, j11, storyItem2.f19394id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        t6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    s6 s6Var = b4Var.f15092b;
                    if (s6Var != null) {
                        s6Var.a();
                    }
                }
                d4Var.j1();
                if (d4Var.H1 && d4Var.f15234x1 == 0) {
                    ((z8) d4Var.N1).j();
                    return;
                }
                int i15 = d4Var.G1;
                int i16 = d4Var.f15234x1;
                if (i15 >= i16) {
                    d4Var.G1 = i16 - 1;
                    z10 = false;
                } else {
                    z10 = false;
                    if (i15 < 0) {
                        d4Var.G1 = 0;
                    }
                }
                d4Var.f1(z10);
                i9 i9Var = d4Var.G0;
                if (i9Var != null) {
                    i9Var.p();
                    return;
                }
                return;
        }
    }
}
