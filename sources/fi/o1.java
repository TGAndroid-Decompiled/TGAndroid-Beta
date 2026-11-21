package fi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class o1 implements org.telegram.ui.ActionBar.q1, lh.a {
    public final int f12361a;
    public final z3 f12362b;

    public o1(z3 z3Var, int i7) {
        this.f12361a = i7;
        this.f12362b = z3Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.f12361a;
        z3 z3Var = this.f12362b;
        switch (i10) {
            case 0:
                i2 i2Var = z3Var.L1;
                if (i2Var != null) {
                    i2Var.G();
                    return;
                }
                return;
            default:
                x3 x3Var = z3Var.f12934y1;
                int i11 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (x3Var.f12766f && (storyItem = x3Var.f12762a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        c1 c1Var = c1.X;
                        if (c1Var != null && c1Var.f(inputGroupCall)) {
                            c1.X.e();
                            if (c1.X != null) {
                                c1.X = null;
                                ks.f(z3Var.f12888m2).k(176, Long.valueOf(c1.X.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = x3Var.f12762a;
                if (storyItem2 instanceof z5) {
                    a6 a6Var = ((z5) storyItem2).f12945a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    a6Var.getClass();
                    a6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    z3 z3Var2 = x3Var.f12770k;
                    p6 p6Var = z3Var2.C1;
                    long j10 = z3Var2.l1;
                    a0.h hVar = p6Var.f12428i;
                    int i12 = p6Var.f12422a;
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
                                TLRPC.UserFull d2 = mp.u1(i12).d2(j10);
                                if (d2 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = d2;
                                    peerStories = d2.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = d2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull P0 = mp.u1(i12).P0(-j10);
                                if (P0 != null) {
                                    chatFull = P0;
                                    peerStories = P0.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = P0;
                                    peerStories = chatFull4;
                                    userFull = chatFull4;
                                }
                            }
                            if (peerStories != null) {
                                int i14 = i11;
                                while (true) {
                                    if (i14 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i14).f28670id == storyItem2.f28670id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!p6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    p6Var.f12427g.remove(peerStories);
                                                    p6Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(j10));
                                                    if (c22 != null) {
                                                        c22.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat O0 = mp.u1(i12).O0(Long.valueOf(-j10));
                                                    if (O0 != null) {
                                                        O0.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i14++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                tr.a0(i12).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                tr.a0(i12).j2(userFull, z10);
                            }
                            i13++;
                            i11 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = mp.u1(i12).l1(j10);
                        tL_stories_deleteStories.f28673id.add(Integer.valueOf(storyItem2.f28670id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new o5(p6Var, 4));
                        c7 c7Var = p6Var.f12430k;
                        c7Var.f11855b.f27080a.c(new z6(c7Var, j10, storyItem2.f28670id, 1));
                        ks.f(i12).k(327, new Object[0]);
                        mp.u1(i12).D();
                        p6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    o6 o6Var = x3Var.f12763b;
                    if (o6Var != null) {
                        o6Var.a();
                    }
                }
                z3Var.h1();
                if (z3Var.f12918u1 && z3Var.f12881k1 == 0) {
                    ((w8) z3Var.A1).j();
                    return;
                }
                int i15 = z3Var.f12914t1;
                int i16 = z3Var.f12881k1;
                if (i15 >= i16) {
                    z3Var.f12914t1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        z3Var.f12914t1 = 0;
                    }
                }
                z3Var.d1(z11);
                f9 f9Var = z3Var.f12913t0;
                if (f9Var != null) {
                    f9Var.r();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(int i7) {
        if (i7 == 0) {
            this.f12362b.N0();
        }
    }
}
