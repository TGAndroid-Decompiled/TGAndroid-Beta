package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class b18 implements ed, o41 {
    public final byte a;
    public final y28 b;

    public b18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override
    public final void g(int i) {
        if (i == 0) {
            this.b.J0();
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.StoryItem storyItem;
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                q18 q18Var = y28Var.R1;
                if (q18Var != null) {
                    q18Var.E();
                    return;
                }
                return;
            default:
                x28 x28Var = y28Var.E1;
                TLRPC.ChatFull chatFull2 = null;
                if (x28Var.f && (storyItem = x28Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        t76 t76Var = t76.N;
                        if (t76Var != null && t76Var.i(inputGroupCall)) {
                            t76.N.h();
                            if (t76.N != null) {
                                t76.N = null;
                                kk7.f(y28Var.s2).k(176, Long.valueOf(t76.N.j()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = x28Var.a;
                if (storyItem2 instanceof q1b) {
                    s1b s1bVar = ((q1b) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    s1bVar.getClass();
                    s1bVar.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    y28 y28Var2 = x28Var.k;
                    g2b g2bVar = y28Var2.I1;
                    long j = y28Var2.r1;
                    vf6 vf6Var = g2bVar.i;
                    int i2 = g2bVar.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i3 = 0;
                        while (i3 < 2) {
                            if (i3 == 0) {
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) vf6Var.f(j);
                                userFull = chatFull3;
                            } else if (j >= 0) {
                                TLRPC.UserFull W1 = na7.q1(i2).W1(j);
                                if (W1 != null) {
                                    userFull = W1;
                                    peerStories = W1.stories;
                                    chatFull = chatFull2;
                                } else {
                                    chatFull = chatFull2;
                                    userFull = W1;
                                    peerStories = chatFull;
                                }
                            } else {
                                TLRPC.ChatFull L0 = na7.q1(i2).L0(-j);
                                if (L0 != null) {
                                    chatFull = L0;
                                    peerStories = L0.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = L0;
                                    peerStories = chatFull4;
                                    userFull = chatFull4;
                                }
                            }
                            if (peerStories != null) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i4).id == storyItem2.id) {
                                            peerStories.stories.remove(i4);
                                            if (peerStories.stories.size() == 0) {
                                                if (!g2bVar.L(j)) {
                                                    vf6Var.l(j);
                                                    g2bVar.g.remove(peerStories);
                                                    g2bVar.h.remove(peerStories);
                                                }
                                                if (j > 0) {
                                                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                                                    if (V1 != null) {
                                                        V1.stories_unavailable = true;
                                                    }
                                                } else {
                                                    TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
                                                    if (K0 != null) {
                                                        K0.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                ad7.Y(i2).K1(chatFull, false);
                            }
                            if (userFull != 0) {
                                ad7.Y(i2).g2(userFull, false);
                            }
                            i3++;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = na7.q1(i2).h1(j);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_deleteStories, new i1b(g2bVar, (byte) 4));
                        s2b s2bVar = g2bVar.k;
                        s2bVar.b.a.c(new q2b(s2bVar, j, storyItem2.id, (byte) 1));
                        kk7.f(i2).k(327, new Object[0]);
                        na7.q1(i2).z();
                        g2bVar.n0(j, Arrays.asList(storyItem2));
                    }
                } else {
                    f2b f2bVar = x28Var.b;
                    if (f2bVar != null) {
                        f2bVar.a();
                    }
                }
                y28Var.h1();
                if (y28Var.A1 && y28Var.q1 == 0) {
                    ((d8b) y28Var.G1).j();
                    return;
                }
                int i5 = y28Var.z1;
                int i6 = y28Var.q1;
                if (i5 >= i6) {
                    y28Var.z1 = i6 - 1;
                } else if (i5 < 0) {
                    y28Var.z1 = 0;
                }
                y28Var.c1(false);
                m8b m8bVar = y28Var.z0;
                if (m8bVar != null) {
                    m8bVar.m();
                    return;
                }
                return;
        }
    }
}
