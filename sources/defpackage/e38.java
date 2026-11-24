package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e38 implements ee, v51 {
    public final byte a;
    public final a58 b;

    public e38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override
    public final void h(int i) {
        if (i == 0) {
            this.b.J0();
        }
    }

    @Override
    public final void r(he heVar, int i) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.StoryItem storyItem;
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                t38 t38Var = a58Var.R1;
                if (t38Var != null) {
                    t38Var.E();
                    return;
                }
                return;
            default:
                z48 z48Var = a58Var.E1;
                TLRPC.ChatFull chatFull2 = null;
                if (z48Var.f && (storyItem = z48Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        s96 s96Var = s96.N;
                        if (s96Var != null && s96Var.i(inputGroupCall)) {
                            s96.N.h();
                            if (s96.N != null) {
                                s96.N = null;
                                nm7.f(a58Var.s2).k(177, Long.valueOf(s96.N.j()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = z48Var.a;
                if (storyItem2 instanceof s3b) {
                    t3b t3bVar = ((s3b) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    t3bVar.getClass();
                    t3bVar.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    a58 a58Var2 = z48Var.k;
                    h4b h4bVar = a58Var2.I1;
                    long j = a58Var2.r1;
                    vh6 vh6Var = h4bVar.i;
                    int i2 = h4bVar.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i3 = 0;
                        while (i3 < 2) {
                            if (i3 == 0) {
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) vh6Var.f(j);
                                userFull = chatFull3;
                            } else if (j >= 0) {
                                TLRPC.UserFull X1 = oc7.r1(i2).X1(j);
                                if (X1 != null) {
                                    userFull = X1;
                                    peerStories = X1.stories;
                                    chatFull = chatFull2;
                                } else {
                                    chatFull = chatFull2;
                                    userFull = X1;
                                    peerStories = chatFull;
                                }
                            } else {
                                TLRPC.ChatFull M0 = oc7.r1(i2).M0(-j);
                                if (M0 != null) {
                                    chatFull = M0;
                                    peerStories = M0.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = M0;
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
                                                if (!h4bVar.L(j)) {
                                                    vh6Var.l(j);
                                                    h4bVar.g.remove(peerStories);
                                                    h4bVar.h.remove(peerStories);
                                                }
                                                if (j > 0) {
                                                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                                                    if (W1 != null) {
                                                        W1.stories_unavailable = true;
                                                    }
                                                } else {
                                                    TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
                                                    if (L0 != null) {
                                                        L0.stories_unavailable = true;
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
                                cf7.Y(i2).K1(chatFull, false);
                            }
                            if (userFull != 0) {
                                cf7.Y(i2).g2(userFull, false);
                            }
                            i3++;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = oc7.r1(i2).i1(j);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_deleteStories, new k3b(h4bVar, (byte) 4));
                        t4b t4bVar = h4bVar.k;
                        t4bVar.b.a.c(new r4b(t4bVar, j, storyItem2.id, (byte) 1));
                        nm7.f(i2).k(329, new Object[0]);
                        oc7.r1(i2).z();
                        h4bVar.n0(j, Arrays.asList(storyItem2));
                    }
                } else {
                    g4b g4bVar = z48Var.b;
                    if (g4bVar != null) {
                        g4bVar.a();
                    }
                }
                a58Var.h1();
                if (a58Var.A1 && a58Var.q1 == 0) {
                    ((fab) a58Var.G1).j();
                    return;
                }
                int i5 = a58Var.z1;
                int i6 = a58Var.q1;
                if (i5 >= i6) {
                    a58Var.z1 = i6 - 1;
                } else if (i5 < 0) {
                    a58Var.z1 = 0;
                }
                a58Var.c1(false);
                oab oabVar = a58Var.z0;
                if (oabVar != null) {
                    oabVar.m();
                    return;
                }
                return;
        }
    }
}
