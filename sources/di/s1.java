package di;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s1 implements org.telegram.ui.ActionBar.r1, lh.a {
    public final int f9742a;
    public final i4 f9743b;

    public s1(i4 i4Var, int i7) {
        this.f9742a = i7;
        this.f9743b = i4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z9;
        boolean z10;
        TL_stories.StoryItem storyItem;
        int i10 = this.f9742a;
        i4 i4Var = this.f9743b;
        switch (i10) {
            case 0:
                o2 o2Var = i4Var.K1;
                if (o2Var != null) {
                    o2Var.x();
                    return;
                }
                return;
            default:
                g4 g4Var = i4Var.f9213x1;
                int i11 = 0;
                boolean z11 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (g4Var.f9042f && (storyItem = g4Var.f9038a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        g1 g1Var = g1.W;
                        if (g1Var != null && g1Var.f(inputGroupCall)) {
                            g1.W.e();
                            if (g1.W != null) {
                                g1.W = null;
                                qs.f(i4Var.f9168l2).k(176, Long.valueOf(g1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = g4Var.f9038a;
                if (storyItem2 instanceof i6) {
                    j6 j6Var = ((i6) storyItem2).f9228a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    j6Var.getClass();
                    j6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    i4 i4Var2 = g4Var.f9046k;
                    y6 y6Var = i4Var2.B1;
                    long j10 = i4Var2.f9164k1;
                    a0.h hVar = y6Var.f9969i;
                    int i12 = y6Var.f9963a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j10);
                                userFull = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull b22 = qp.s1(i12).b2(j10);
                                if (b22 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = b22;
                                    peerStories = b22.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = b22;
                                    peerStories = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull N0 = qp.s1(i12).N0(-j10);
                                if (N0 != null) {
                                    chatFull = N0;
                                    peerStories = N0.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = N0;
                                    peerStories = chatFull4;
                                    userFull = chatFull4;
                                }
                            }
                            if (peerStories != null) {
                                int i14 = i11;
                                while (true) {
                                    if (i14 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i14).f27195id == storyItem2.f27195id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!y6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    y6Var.f9968g.remove(peerStories);
                                                    y6Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(j10));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z11;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-j10));
                                                    if (M0 != null) {
                                                        M0.stories_unavailable = true;
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
                                z9 = false;
                                yr.a0(i12).N1(chatFull, false);
                            } else {
                                z9 = false;
                            }
                            if (userFull != 0) {
                                yr.a0(i12).j2(userFull, z9);
                            }
                            i13++;
                            i11 = 0;
                            z11 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = qp.s1(i12).j1(j10);
                        tL_stories_deleteStories.f27198id.add(Integer.valueOf(storyItem2.f27195id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new x5(y6Var, 4));
                        l7 l7Var = y6Var.f9971k;
                        l7Var.f9338b.f26719a.c(new i7(l7Var, j10, storyItem2.f27195id, 1));
                        qs.f(i12).k(324, new Object[0]);
                        qp.s1(i12).D();
                        y6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    x6 x6Var = g4Var.f9039b;
                    if (x6Var != null) {
                        x6Var.a();
                    }
                }
                i4Var.h1();
                if (i4Var.f9197t1 && i4Var.f9161j1 == 0) {
                    ((g9) i4Var.f9221z1).j();
                    return;
                }
                int i15 = i4Var.f9193s1;
                int i16 = i4Var.f9161j1;
                if (i15 >= i16) {
                    i4Var.f9193s1 = i16 - 1;
                    z10 = false;
                } else {
                    z10 = false;
                    if (i15 < 0) {
                        i4Var.f9193s1 = 0;
                    }
                }
                i4Var.d1(z10);
                p9 p9Var = i4Var.f9192s0;
                if (p9Var != null) {
                    p9Var.r();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(int i7) {
        if (i7 == 0) {
            this.f9743b.N0();
        }
    }
}
