package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s48 implements fd, w41 {
    public final byte a;
    public final o68 b;

    public s48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override
    public final void h(int i) {
        if (i == 0) {
            this.b.J0();
        }
    }

    @Override
    public final void w(id idVar, int i) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.StoryItem storyItem;
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                n68 n68Var = o68Var.y1;
                TLRPC.ChatFull chatFull2 = null;
                if (n68Var.f && (storyItem = n68Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        w96 w96Var = w96.N;
                        if (w96Var != null && w96Var.i(inputGroupCall)) {
                            w96.N.h();
                            if (w96.N != null) {
                                w96.N = null;
                                jn7.f(o68Var.m2).k(177, Long.valueOf(w96.N.j()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = n68Var.a;
                if (storyItem2 instanceof n5b) {
                    o5b o5bVar = ((n5b) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    o5bVar.getClass();
                    o5bVar.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    o68 o68Var2 = n68Var.k;
                    c6b c6bVar = o68Var2.C1;
                    long j = o68Var2.l1;
                    zh6 zh6Var = c6bVar.i;
                    int i2 = c6bVar.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i3 = 0;
                        while (i3 < 2) {
                            if (i3 == 0) {
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) zh6Var.f(j);
                                userFull = chatFull3;
                            } else if (j >= 0) {
                                TLRPC.UserFull Y1 = uc7.s1(i2).Y1(j);
                                if (Y1 != null) {
                                    userFull = Y1;
                                    peerStories = Y1.stories;
                                    chatFull = chatFull2;
                                } else {
                                    chatFull = chatFull2;
                                    userFull = Y1;
                                    peerStories = chatFull;
                                }
                            } else {
                                TLRPC.ChatFull N0 = uc7.s1(i2).N0(-j);
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
                                int i4 = 0;
                                while (true) {
                                    if (i4 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i4).id == storyItem2.id) {
                                            peerStories.stories.remove(i4);
                                            if (peerStories.stories.size() == 0) {
                                                if (!c6bVar.L(j)) {
                                                    zh6Var.l(j);
                                                    c6bVar.g.remove(peerStories);
                                                    c6bVar.h.remove(peerStories);
                                                }
                                                if (j > 0) {
                                                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
                                                    if (X1 != null) {
                                                        X1.stories_unavailable = true;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
                                                    if (M0 != null) {
                                                        M0.stories_unavailable = true;
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
                                jf7.Y(i2).K1(chatFull, false);
                            }
                            if (userFull != 0) {
                                jf7.Y(i2).g2(userFull, false);
                            }
                            i3++;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = uc7.s1(i2).j1(j);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_deleteStories, new g5b(c6bVar, (byte) 3));
                        o6b o6bVar = c6bVar.k;
                        o6bVar.b.a.c(new m6b(o6bVar, j, storyItem2.id, (byte) 0));
                        jn7.f(i2).k(328, new Object[0]);
                        uc7.s1(i2).B();
                        c6bVar.n0(j, Arrays.asList(storyItem2));
                    }
                } else {
                    b6b b6bVar = n68Var.b;
                    if (b6bVar != null) {
                        b6bVar.a();
                    }
                }
                o68Var.h1();
                if (o68Var.u1 && o68Var.k1 == 0) {
                    ((ccb) o68Var.A1).j();
                    return;
                }
                int i5 = o68Var.t1;
                int i6 = o68Var.k1;
                if (i5 >= i6) {
                    o68Var.t1 = i6 - 1;
                } else if (i5 < 0) {
                    o68Var.t1 = 0;
                }
                o68Var.c1(false);
                lcb lcbVar = o68Var.t0;
                if (lcbVar != null) {
                    lcbVar.m();
                    return;
                }
                return;
            default:
                g58 g58Var = o68Var.L1;
                if (g58Var != null) {
                    g58Var.G();
                    return;
                }
                return;
        }
    }
}
