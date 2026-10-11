package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class z2 implements org.telegram.ui.ActionBar.z1, jh.a {
    public final int f2000a;
    public final f6 f2001b;

    public z2(f6 f6Var, int i10) {
        this.f2000a = i10;
        this.f2001b = f6Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f2000a;
        f6 f6Var = this.f2001b;
        switch (i11) {
            case 0:
                b4 b4Var = f6Var.f952b2;
                if (b4Var != null) {
                    b4Var.z();
                    return;
                }
                return;
            default:
                d6 d6Var = f6Var.O1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (d6Var.f826f && (storyItem = d6Var.f822a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d2 d2Var = d2.W;
                        if (d2Var != null && d2Var.f(inputGroupCall)) {
                            d2.W.e();
                            if (d2.W != null) {
                                d2.W = null;
                                NotificationCenter.getInstance(f6Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = d6Var.f822a;
                if (storyItem2 instanceof u8) {
                    v8 v8Var = ((u8) storyItem2).f1806a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    v8Var.getClass();
                    v8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    f6 f6Var2 = d6Var.f830k;
                    m9 m9Var = f6Var2.S1;
                    long j10 = f6Var2.B1;
                    a0.i iVar = m9Var.f1412i;
                    int i13 = m9Var.f1406a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) iVar.f(j10);
                                userFull = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i13).getUserFull(j10);
                                if (userFull2 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = userFull2.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i13).getChatFull(-j10);
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
                                        if (peerStories.stories.get(i15).f20269id == storyItem2.f20269id) {
                                            peerStories.stories.remove(i15);
                                            if (peerStories.stories.size() == 0) {
                                                if (!m9Var.K(j10)) {
                                                    iVar.l(j10);
                                                    m9Var.f1411g.remove(peerStories);
                                                    m9Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j10));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-j10));
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
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                        tL_stories_deleteStories.f20272id.add(Integer.valueOf(storyItem2.f20269id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new z7(m9Var, 5));
                        z9 z9Var = m9Var.f1414k;
                        z9Var.f2022b.getStorageQueue().postRunnable(new w9(z9Var, j10, storyItem2.f20269id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        m9Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    l9 l9Var = d6Var.f823b;
                    if (l9Var != null) {
                        l9Var.a();
                    }
                }
                f6Var.j1();
                if (f6Var.K1 && f6Var.A1 == 0) {
                    ((bc) f6Var.Q1).j();
                    return;
                }
                int i16 = f6Var.J1;
                int i17 = f6Var.A1;
                if (i16 >= i17) {
                    f6Var.J1 = i17 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i16 < 0) {
                        f6Var.J1 = 0;
                    }
                }
                f6Var.f1(z11);
                kc kcVar = f6Var.J0;
                if (kcVar != null) {
                    kcVar.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(int i10) {
        if (i10 == 0) {
            this.f2001b.P0();
        }
    }
}
