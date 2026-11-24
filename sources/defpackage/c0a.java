package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class c0a extends n39 {
    public final ArrayList c = new ArrayList();
    public final g0a d;

    public c0a(g0a g0aVar) {
        this.d = g0aVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        g0a g0aVar = this.d;
        f0a f0aVar = g0aVar.F;
        int i = 0;
        if (g0aVar.R) {
            arrayList.add(new yz9(0));
            arrayList.add(new yz9(6));
        } else {
            arrayList.add(new yz9(0));
            if (f0aVar != null) {
                tz9 tz9Var = f0aVar.s;
                boolean z = f0aVar.j;
                if (f0aVar.b() <= 0 && (z || (!f0aVar.e && !f0aVar.m))) {
                    if (!TextUtils.isEmpty(tz9Var.c)) {
                        arrayList.add(new yz9(7));
                    } else if (z) {
                        arrayList.add(new yz9(5));
                    } else if (f0aVar.a > 0) {
                        if (tz9Var.b) {
                            arrayList.add(new yz9(8));
                        } else {
                            arrayList.add(new yz9(10));
                        }
                    } else {
                        arrayList.add(new yz9(5));
                    }
                }
            }
            if (f0aVar != null) {
                ArrayList arrayList2 = f0aVar.g;
                ArrayList arrayList3 = f0aVar.i;
                if (f0aVar.f) {
                    while (i < arrayList3.size()) {
                        arrayList.add(new yz9((TL_stories.StoryReaction) arrayList3.get(i)));
                        i++;
                    }
                } else {
                    while (i < arrayList2.size()) {
                        arrayList.add(new yz9((TL_stories.StoryView) arrayList2.get(i)));
                        i++;
                    }
                }
            }
            if (f0aVar != null) {
                if (!f0aVar.e && !f0aVar.m) {
                    if (f0aVar.k) {
                        arrayList.add(new yz9(11));
                    } else {
                        tz9 tz9Var2 = f0aVar.s;
                        if (f0aVar.b() < f0aVar.a && TextUtils.isEmpty(tz9Var2.c) && !tz9Var2.b) {
                            arrayList.add(new yz9(12));
                        }
                    }
                } else if (f0aVar.b() <= 0) {
                    arrayList.add(new yz9(6));
                } else {
                    arrayList.add(new yz9(4));
                }
            }
        }
        arrayList.add(new yz9(9));
        f();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int d(int i) {
        return ((yz9) this.c.get(i)).a;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j;
        TLRPC.Chat chat;
        TLRPC.User user;
        long j2;
        TL_stories.StoryItem storyItem;
        byte b;
        boolean z;
        boolean z2;
        String str;
        long j3;
        boolean z3;
        float f;
        byte b2;
        long j4;
        TL_stories.StoryItem storyItem2;
        byte b3;
        boolean z4;
        float f2;
        String str2;
        TLRPC.Message message2;
        if (s49Var.f == 1 && i >= 0) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                yz9 yz9Var = (yz9) arrayList.get(i);
                qz8 qz8Var = (qz8) s49Var.a;
                TL_stories.StoryView storyView = yz9Var.b;
                TL_stories.StoryReaction storyReaction = yz9Var.c;
                if (storyView != null) {
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        peer = storyView.peer_id;
                    } else if ((storyView instanceof TL_stories.TL_storyViewPublicForward) && (message2 = storyView.message) != null) {
                        peer = message2.peer_id;
                    } else {
                        peer = new TLRPC.TL_peerUser();
                        peer.user_id = storyView.user_id;
                    }
                } else if (storyReaction != null) {
                    peer = storyReaction.peer_id;
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                        peer = message.peer_id;
                    }
                } else {
                    peer = null;
                }
                long n = cf3.n(peer);
                int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                g0a g0aVar = this.d;
                int i3 = g0aVar.w;
                if (i2 >= 0) {
                    user = na7.q1(i3).V1(Long.valueOf(n));
                    j = n;
                    chat = null;
                } else {
                    TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-n));
                    j = n;
                    chat = K0;
                    user = null;
                }
                boolean remove = g0aVar.G.p.remove(Long.valueOf(j));
                if (storyView != null) {
                    TLRPC.Reaction reaction = storyView.reaction;
                    if (reaction != null && (str2 = h19.d(reaction).f) != null && str2.equals("❤")) {
                        j3 = 0;
                        z3 = true;
                    } else {
                        j3 = 0;
                        z3 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        f = 1.0f;
                        b2 = 11;
                        qz8Var.c(user, null, null, z3, 0L, storyView.story, false, true, remove);
                    } else {
                        f = 1.0f;
                        b2 = 11;
                        TLRPC.Reaction reaction2 = null;
                        TLRPC.User user2 = user;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j4 = message3.date;
                            } else {
                                j4 = j3;
                            }
                            m0a m0aVar = g0aVar.E;
                            if (m0aVar == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = m0aVar.a;
                            }
                            qz8Var.c(user2, null, null, z3, j4, storyItem2, true, true, remove);
                        } else {
                            if (!z3) {
                                reaction2 = storyView.reaction;
                            }
                            qz8Var.c(user2, null, reaction2, z3, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i < arrayList.size() - 1) {
                        b3 = ((yz9) arrayList.get(i + 1)).a;
                    } else {
                        b3 = -1;
                    }
                    if (b3 != 1 && b3 != b2 && b3 != 12) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    qz8Var.a = z4;
                    if (g0aVar.b(storyView)) {
                        f2 = f;
                    } else {
                        f2 = 0.5f;
                    }
                    qz8Var.a(false, f2);
                    return;
                }
                TLRPC.Reaction reaction3 = null;
                TLRPC.User user3 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = h19.d(reaction4).f) != null && str.equals("❤")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            reaction3 = tL_storyReaction.reaction;
                        }
                        qz8Var.c(user3, chat, reaction3, z2, tL_storyReaction.date, null, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        qz8Var.c(user3, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                        TLRPC.Message message4 = storyReaction.message;
                        if (message4 != null) {
                            j2 = message4.date;
                        } else {
                            j2 = 0;
                        }
                        m0a m0aVar2 = g0aVar.E;
                        if (m0aVar2 == null) {
                            storyItem = null;
                        } else {
                            storyItem = m0aVar2.a;
                        }
                        qz8Var.c(user3, chat, null, false, j2, storyItem, true, true, remove);
                    }
                    if (i < arrayList.size() - 1) {
                        b = ((yz9) arrayList.get(i + 1)).a;
                    } else {
                        b = -1;
                    }
                    if (b != 1 && b != 11 && b != 12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    qz8Var.a = z;
                    qz8Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        l46 l46Var;
        final g0a g0aVar = this.d;
        int i3 = g0aVar.w;
        f53 f53Var = g0aVar.s;
        switch (i) {
            case 0:
                l46Var = new a0a(this, g0aVar.getContext(), (byte) 0);
                break;
            case 1:
                p37 p37Var = qz8.I;
                l46Var = new b0a(i3, f53Var, this, g0aVar.getContext());
                break;
            case 2:
            case 9:
            default:
                l46Var = new a0a(this, g0aVar.getContext(), (byte) 1);
                break;
            case 3:
                l46Var = new wh4(g0aVar.getContext(), 70, (byte) 0);
                break;
            case 4:
                pi4 pi4Var = new pi4(g0aVar.getContext(), f53Var);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(28);
                pi4Var.x = false;
                l46Var = pi4Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (g0aVar.G.j) {
                    i2 = 12;
                } else if (i != 10 && i != 7 && i != 8 && i != 5) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                q22 q22Var = new q22(i2, f53Var, this, g0aVar.getContext());
                wla wlaVar = q22Var.d;
                if (i == 7) {
                    wlaVar.setVisibility(8);
                    q22Var.setSubtitle(k96.M0(2131747975, null));
                } else if (i == 8) {
                    wlaVar.setVisibility(8);
                    q22Var.setSubtitle(k96.M0(2131748030, null));
                } else if (i == 10) {
                    wlaVar.setVisibility(0);
                    wlaVar.setText(k96.M0(2131745370, null));
                    q22Var.setSubtitle(k96.M0(2131745372, null));
                } else if (g0aVar.G.j) {
                    wlaVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gl.S2(k96.M0(2131750859, null)));
                    boolean F3 = na7.q1(i3).F3();
                    l46 l46Var2 = q22Var.e;
                    if (!F3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) gl.N2(k96.M0(2131750858, null), -1, 0, new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                g0a g0aVar2 = g0aVar;
                                switch (b) {
                                    case 0:
                                        int i4 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        return;
                                    default:
                                        int i5 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        return;
                                }
                            }
                        }, null));
                        String M0 = k96.M0(2131748818, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                g0a g0aVar2 = g0aVar;
                                switch (b) {
                                    case 0:
                                        int i4 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        return;
                                    default:
                                        int i5 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l46Var2.getLayoutParams()).topMargin = gl.L(12.0f);
                        TextView textView = new TextView(q22Var.getContext());
                        textView.setText(M0);
                        int i4 = bkb.Ii;
                        wjb wjbVar = q22Var.n;
                        zkb.X(textView, i4, wjbVar);
                        textView.setPadding(gl.L(45.0f), gl.L(12.0f), gl.L(45.0f), gl.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(gl.o());
                        textView.setTextSize(1, 15.0f);
                        ar8 ar8Var = new ar8(q22Var.getContext(), (byte) 12);
                        ar8Var.setOnClickListener(new bna(runnable, (byte) 9));
                        int L = gl.L(8.0f);
                        int i5 = bkb.Ei;
                        int v0 = bkb.v0(i5, wjbVar);
                        int o = bm2.o(bkb.v0(i4, wjbVar), 30);
                        ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
                        vkb M = zkb.M(i5);
                        vkb g = zkb.g(i4, 30);
                        ar8Var.setBackground(i0);
                        zkb.j(ar8Var, i0, M, g, wjbVar);
                        ote.b(ar8Var, 0.05f, 1.5f);
                        ar8Var.addView(textView);
                        pkb pkbVar = q22Var.a;
                        pkbVar.setClipChildren(false);
                        pkbVar.addView(ar8Var, nme.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l46Var2.setText(spannableStringBuilder);
                } else {
                    wlaVar.setVisibility(0);
                    if (g0aVar.G.f) {
                        wlaVar.setText(k96.M0(2131747983, null));
                        q22Var.setSubtitle(k96.M0(2131747981, null));
                    } else {
                        wlaVar.setText(k96.M0(2131747940, null));
                        q22Var.setSubtitle(k96.M0(2131747939, null));
                    }
                }
                q22Var.e(false, false);
                l46Var = q22Var;
                break;
            case 6:
                pi4 pi4Var2 = new pi4(g0aVar.getContext(), f53Var);
                pi4Var2.setIsSingleCell(true);
                pi4Var2.setIgnoreHeightCheck(true);
                pi4Var2.setItemsCount(20);
                pi4Var2.setViewType(28);
                pi4Var2.x = false;
                l46Var = pi4Var2;
                break;
            case 11:
            case 12:
                l46 l46Var3 = new l46(g0aVar.getContext(), null);
                l46Var3.setTextSize(1, 13.0f);
                zkb.X(l46Var3, bkb.x6, f53Var);
                zkb.G(l46Var3, bkb.I6, f53Var);
                int L2 = gl.L(16.0f);
                int L3 = gl.L(21.0f);
                l46Var3.setPadding(L3, L2, L3, L2);
                l46Var3.setMaxLines(Integer.MAX_VALUE);
                l46Var3.setGravity(17);
                l46Var3.setDisablePaddingsOffsetY(true);
                if (i == 11) {
                    l46Var3.setText(gl.N2(k96.M0(2131744206, null), -1, 0, new zk9(this, (byte) 24), null));
                } else {
                    l46Var3.setText(k96.M0(2131745371, null));
                }
                l46Var3.setLayoutParams(new e49(-1, -2));
                l46Var = l46Var3;
                break;
        }
        return new s49(l46Var);
    }
}
