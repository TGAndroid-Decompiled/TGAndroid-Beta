package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e2a extends q59 {
    public final ArrayList c = new ArrayList();
    public final i2a d;

    public e2a(i2a i2aVar) {
        this.d = i2aVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        i2a i2aVar = this.d;
        h2a h2aVar = i2aVar.F;
        int i = 0;
        if (i2aVar.R) {
            arrayList.add(new a2a(0));
            arrayList.add(new a2a(6));
        } else {
            arrayList.add(new a2a(0));
            if (h2aVar != null) {
                v1a v1aVar = h2aVar.s;
                boolean z = h2aVar.j;
                if (h2aVar.b() <= 0 && (z || (!h2aVar.e && !h2aVar.m))) {
                    if (!TextUtils.isEmpty(v1aVar.c)) {
                        arrayList.add(new a2a(7));
                    } else if (z) {
                        arrayList.add(new a2a(5));
                    } else if (h2aVar.a > 0) {
                        if (v1aVar.b) {
                            arrayList.add(new a2a(8));
                        } else {
                            arrayList.add(new a2a(10));
                        }
                    } else {
                        arrayList.add(new a2a(5));
                    }
                }
            }
            if (h2aVar != null) {
                ArrayList arrayList2 = h2aVar.g;
                ArrayList arrayList3 = h2aVar.i;
                if (h2aVar.f) {
                    while (i < arrayList3.size()) {
                        arrayList.add(new a2a((TL_stories.StoryReaction) arrayList3.get(i)));
                        i++;
                    }
                } else {
                    while (i < arrayList2.size()) {
                        arrayList.add(new a2a((TL_stories.StoryView) arrayList2.get(i)));
                        i++;
                    }
                }
            }
            if (h2aVar != null) {
                if (!h2aVar.e && !h2aVar.m) {
                    if (h2aVar.k) {
                        arrayList.add(new a2a(11));
                    } else {
                        v1a v1aVar2 = h2aVar.s;
                        if (h2aVar.b() < h2aVar.a && TextUtils.isEmpty(v1aVar2.c) && !v1aVar2.b) {
                            arrayList.add(new a2a(12));
                        }
                    }
                } else if (h2aVar.b() <= 0) {
                    arrayList.add(new a2a(6));
                } else {
                    arrayList.add(new a2a(4));
                }
            }
        }
        arrayList.add(new a2a(9));
        f();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int d(int i) {
        return ((a2a) this.c.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
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
        if (u69Var.f == 1 && i >= 0) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                a2a a2aVar = (a2a) arrayList.get(i);
                r19 r19Var = (r19) u69Var.a;
                TL_stories.StoryView storyView = a2aVar.b;
                TL_stories.StoryReaction storyReaction = a2aVar.c;
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
                long n = pg3.n(peer);
                int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                i2a i2aVar = this.d;
                int i3 = i2aVar.w;
                if (i2 >= 0) {
                    user = oc7.r1(i3).W1(Long.valueOf(n));
                    j = n;
                    chat = null;
                } else {
                    TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-n));
                    j = n;
                    chat = L0;
                    user = null;
                }
                boolean remove = i2aVar.G.p.remove(Long.valueOf(j));
                if (storyView != null) {
                    TLRPC.Reaction reaction = storyView.reaction;
                    if (reaction != null && (str2 = k39.d(reaction).f) != null && str2.equals("❤")) {
                        j3 = 0;
                        z3 = true;
                    } else {
                        j3 = 0;
                        z3 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        f = 1.0f;
                        b2 = 11;
                        r19Var.c(user, null, null, z3, 0L, storyView.story, false, true, remove);
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
                            o2a o2aVar = i2aVar.E;
                            if (o2aVar == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = o2aVar.a;
                            }
                            r19Var.c(user2, null, null, z3, j4, storyItem2, true, true, remove);
                        } else {
                            if (!z3) {
                                reaction2 = storyView.reaction;
                            }
                            r19Var.c(user2, null, reaction2, z3, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i < arrayList.size() - 1) {
                        b3 = ((a2a) arrayList.get(i + 1)).a;
                    } else {
                        b3 = -1;
                    }
                    if (b3 != 1 && b3 != b2 && b3 != 12) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    r19Var.a = z4;
                    if (i2aVar.b(storyView)) {
                        f2 = f;
                    } else {
                        f2 = 0.5f;
                    }
                    r19Var.a(false, f2);
                    return;
                }
                TLRPC.Reaction reaction3 = null;
                TLRPC.User user3 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = k39.d(reaction4).f) != null && str.equals("❤")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            reaction3 = tL_storyReaction.reaction;
                        }
                        r19Var.c(user3, chat, reaction3, z2, tL_storyReaction.date, null, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        r19Var.c(user3, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                        TLRPC.Message message4 = storyReaction.message;
                        if (message4 != null) {
                            j2 = message4.date;
                        } else {
                            j2 = 0;
                        }
                        o2a o2aVar2 = i2aVar.E;
                        if (o2aVar2 == null) {
                            storyItem = null;
                        } else {
                            storyItem = o2aVar2.a;
                        }
                        r19Var.c(user3, chat, null, false, j2, storyItem, true, true, remove);
                    }
                    if (i < arrayList.size() - 1) {
                        b = ((a2a) arrayList.get(i + 1)).a;
                    } else {
                        b = -1;
                    }
                    if (b != 1 && b != 11 && b != 12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    r19Var.a = z;
                    r19Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        l66 l66Var;
        final i2a i2aVar = this.d;
        int i3 = i2aVar.w;
        r63 r63Var = i2aVar.s;
        switch (i) {
            case 0:
                l66Var = new c2a(this, i2aVar.getContext(), (byte) 0);
                break;
            case 1:
                p57 p57Var = r19.I;
                l66Var = new d2a(i3, r63Var, this, i2aVar.getContext());
                break;
            case 2:
            case 9:
            default:
                l66Var = new c2a(this, i2aVar.getContext(), (byte) 1);
                break;
            case 3:
                l66Var = new ak4(i2aVar.getContext(), 70, (byte) 0);
                break;
            case 4:
                tk4 tk4Var = new tk4(i2aVar.getContext(), r63Var);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(28);
                tk4Var.x = false;
                l66Var = tk4Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (i2aVar.G.j) {
                    i2 = 12;
                } else if (i != 10 && i != 7 && i != 8 && i != 5) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                c42 c42Var = new c42(i2, r63Var, this, i2aVar.getContext());
                xna xnaVar = c42Var.d;
                if (i == 7) {
                    xnaVar.setVisibility(8);
                    c42Var.setSubtitle(jb6.M0(2131747901, null));
                } else if (i == 8) {
                    xnaVar.setVisibility(8);
                    c42Var.setSubtitle(jb6.M0(2131747956, null));
                } else if (i == 10) {
                    xnaVar.setVisibility(0);
                    xnaVar.setText(jb6.M0(2131745296, null));
                    c42Var.setSubtitle(jb6.M0(2131745298, null));
                } else if (i2aVar.G.j) {
                    xnaVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gm.S2(jb6.M0(2131750808, null)));
                    boolean H3 = oc7.r1(i3).H3();
                    l66 l66Var2 = c42Var.e;
                    if (!H3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) gm.N2(jb6.M0(2131750807, null), -1, 0, new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                i2a i2aVar2 = i2aVar;
                                switch (b) {
                                    case 0:
                                        int i4 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        return;
                                    default:
                                        int i5 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        return;
                                }
                            }
                        }, null));
                        String M0 = jb6.M0(2131748767, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                i2a i2aVar2 = i2aVar;
                                switch (b) {
                                    case 0:
                                        int i4 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        return;
                                    default:
                                        int i5 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l66Var2.getLayoutParams()).topMargin = gm.L(12.0f);
                        TextView textView = new TextView(c42Var.getContext());
                        textView.setText(M0);
                        int i4 = cmb.Ii;
                        ylb ylbVar = c42Var.n;
                        anb.X(textView, i4, ylbVar);
                        textView.setPadding(gm.L(45.0f), gm.L(12.0f), gm.L(45.0f), gm.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(gm.o());
                        textView.setTextSize(1, 15.0f);
                        ct8 ct8Var = new ct8(c42Var.getContext(), (byte) 12);
                        ct8Var.setOnClickListener(new oha(runnable, (byte) 12));
                        int L = gm.L(8.0f);
                        int i5 = cmb.Ei;
                        int v0 = cmb.v0(i5, ylbVar);
                        int p = on2.p(cmb.v0(i4, ylbVar), 30);
                        fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
                        wmb M = anb.M(i5);
                        wmb g = anb.g(i4, 30);
                        ct8Var.setBackground(i0);
                        anb.j(ct8Var, i0, M, g, ylbVar);
                        rve.b(ct8Var, 0.05f, 1.5f);
                        ct8Var.addView(textView);
                        qmb qmbVar = c42Var.a;
                        qmbVar.setClipChildren(false);
                        qmbVar.addView(ct8Var, qoe.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l66Var2.setText(spannableStringBuilder);
                } else {
                    xnaVar.setVisibility(0);
                    if (i2aVar.G.f) {
                        xnaVar.setText(jb6.M0(2131747909, null));
                        c42Var.setSubtitle(jb6.M0(2131747907, null));
                    } else {
                        xnaVar.setText(jb6.M0(2131747866, null));
                        c42Var.setSubtitle(jb6.M0(2131747865, null));
                    }
                }
                c42Var.e(false, false);
                l66Var = c42Var;
                break;
            case 6:
                tk4 tk4Var2 = new tk4(i2aVar.getContext(), r63Var);
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setIgnoreHeightCheck(true);
                tk4Var2.setItemsCount(20);
                tk4Var2.setViewType(28);
                tk4Var2.x = false;
                l66Var = tk4Var2;
                break;
            case 11:
            case 12:
                l66 l66Var3 = new l66(i2aVar.getContext(), null);
                l66Var3.setTextSize(1, 13.0f);
                anb.X(l66Var3, cmb.x6, r63Var);
                anb.G(l66Var3, cmb.I6, r63Var);
                int L2 = gm.L(16.0f);
                int L3 = gm.L(21.0f);
                l66Var3.setPadding(L3, L2, L3, L2);
                l66Var3.setMaxLines(Integer.MAX_VALUE);
                l66Var3.setGravity(17);
                l66Var3.setDisablePaddingsOffsetY(true);
                if (i == 11) {
                    l66Var3.setText(gm.N2(jb6.M0(2131744132, null), -1, 0, new c0a(this, (byte) 2), null));
                } else {
                    l66Var3.setText(jb6.M0(2131745297, null));
                }
                l66Var3.setLayoutParams(new g69(-1, -2));
                l66Var = l66Var3;
                break;
        }
        return new u69(l66Var);
    }
}
