package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ab;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.e61;
public final class h5 extends oj0 {
    public final ArrayList f9078c = new ArrayList();
    public final l5 d;

    public h5(l5 l5Var) {
        this.d = l5Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f9078c;
        arrayList.clear();
        l5 l5Var = this.d;
        k5 k5Var = l5Var.E;
        int i7 = 0;
        if (l5Var.Q) {
            arrayList.add(new c5(0));
            arrayList.add(new c5(6));
        } else {
            arrayList.add(new c5(0));
            if (k5Var != null) {
                x4 x4Var = k5Var.f9302s;
                boolean z9 = k5Var.f9293j;
                if (k5Var.b() <= 0 && (z9 || (!k5Var.f9289e && !k5Var.f9296m))) {
                    if (!TextUtils.isEmpty(x4Var.f9933c)) {
                        arrayList.add(new c5(7));
                    } else if (z9) {
                        arrayList.add(new c5(5));
                    } else {
                        int i10 = k5Var.f9286a;
                        if (i10 > 0 && x4Var.f9932b) {
                            arrayList.add(new c5(8));
                        } else if (i10 > 0) {
                            arrayList.add(new c5(10));
                        } else {
                            arrayList.add(new c5(5));
                        }
                    }
                }
            }
            if (k5Var != null) {
                ArrayList arrayList2 = k5Var.f9291g;
                ArrayList arrayList3 = k5Var.f9292i;
                if (k5Var.f9290f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new c5((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new c5((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (k5Var != null && (k5Var.f9289e || k5Var.f9296m)) {
                if (k5Var.b() <= 0) {
                    arrayList.add(new c5(6));
                } else {
                    arrayList.add(new c5(4));
                }
            } else if (k5Var != null && k5Var.f9294k) {
                arrayList.add(new c5(11));
            } else if (k5Var != null) {
                x4 x4Var2 = k5Var.f9302s;
                if (k5Var.b() < k5Var.f9286a && TextUtils.isEmpty(x4Var2.f9933c) && !x4Var2.f9932b) {
                    arrayList.add(new c5(12));
                }
            }
        }
        arrayList.add(new c5(9));
        f();
    }

    @Override
    public final int b() {
        return this.f9078c.size();
    }

    @Override
    public final int d(int i7) {
        return ((c5) this.f9078c.get(i7)).f8874a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i10;
        long j10;
        TL_stories.StoryItem storyItem;
        int i11;
        boolean z9;
        TLRPC.Reaction reaction;
        String str;
        long j11;
        boolean z10;
        int i12;
        int i13;
        TLRPC.Reaction reaction2;
        long j12;
        TL_stories.StoryItem storyItem2;
        int i14;
        boolean z11;
        float f10;
        String str2;
        TLRPC.Message message2;
        l5 l5Var = this.d;
        int i15 = l5Var.f9336w;
        if (d1Var.f57056f == 1 && i7 >= 0) {
            ArrayList arrayList = this.f9078c;
            if (i7 < arrayList.size()) {
                c5 c5Var = (c5) arrayList.get(i7);
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) d1Var.f57052a;
                TL_stories.StoryView storyView = c5Var.f8875b;
                TL_stories.StoryReaction storyReaction = c5Var.f8876c;
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
                long o4 = org.telegram.messenger.m5.o(peer);
                if (o4 >= 0) {
                    user = qp.s1(i15).a2(Long.valueOf(o4));
                    j3 = o4;
                    M0 = null;
                } else {
                    j3 = o4;
                    M0 = qp.s1(i15).M0(Long.valueOf(-o4));
                    user = null;
                }
                boolean remove = l5Var.F.f9299p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ch.o0.d(reaction3).f6359f) != null && str2.equals("❤")) {
                        j11 = 0;
                        z10 = true;
                    } else {
                        j11 = 0;
                        z10 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i12 = 12;
                        m6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i12 = 12;
                        i13 = 11;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j12 = message3.date;
                            } else {
                                j12 = j11;
                            }
                            s5 s5Var = l5Var.D;
                            if (s5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = s5Var.f9735a;
                            }
                            m6Var.c(user3, null, null, z10, j12, storyItem2, true, true, remove);
                        } else {
                            if (z10) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            m6Var.c(user3, null, reaction2, z10, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i7 < arrayList.size() - 1) {
                        i14 = ((c5) arrayList.get(i7 + 1)).f8874a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    m6Var.f29564a = z11;
                    if (l5Var.d(storyView)) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    m6Var.a(false, f10);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = ch.o0.d(reaction4).f6359f) != null && str.equals("❤")) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            reaction = null;
                        } else {
                            reaction = tL_storyReaction.reaction;
                        }
                        i10 = 12;
                        m6Var.c(user4, M0, reaction, z9, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i10 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            m6Var.c(user4, M0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            s5 s5Var2 = l5Var.D;
                            if (s5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = s5Var2.f9735a;
                            }
                            m6Var.c(user4, M0, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z12 = true;
                    if (i7 < arrayList.size() - 1) {
                        i11 = ((c5) arrayList.get(i7 + 1)).f8874a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z12 = false;
                    }
                    m6Var.f29564a = z12;
                    m6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        w70 w70Var;
        final l5 l5Var = this.d;
        int i11 = l5Var.f9336w;
        b bVar = l5Var.f9335s;
        switch (i7) {
            case 0:
                w70Var = new e5(this, l5Var.getContext(), 0);
                break;
            case 1:
                oa0 oa0Var = org.telegram.ui.Cells.m6.H;
                w70Var = new f5(i11, l5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                w70Var = new e5(this, l5Var.getContext(), 1);
                break;
            case 3:
                w70Var = new org.telegram.ui.Cells.v3(l5Var.getContext(), 70);
                break;
            case 4:
                lz lzVar = new lz(l5Var.getContext(), bVar);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(28);
                lzVar.f35774x = false;
                w70Var = lzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (l5Var.F.f9293j) {
                    i10 = 12;
                } else if (i7 != 10 && i7 != 7 && i7 != 8 && i7 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                g5 g5Var = new g5(i10, l5Var.getContext(), bVar, this);
                xh.l lVar = g5Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    g5Var.setSubtitle(id.M0(2131748167, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    g5Var.setSubtitle(id.M0(2131748222, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(id.M0(2131745562, null));
                    g5Var.setSubtitle(id.M0(2131745564, null));
                } else if (l5Var.F.f9293j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.M0(2131750871, null)));
                    boolean D3 = qp.s1(i11).D3();
                    w70 w70Var2 = g5Var.f32368e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(id.M0(2131750870, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        l5.a(l5Var);
                                        return;
                                    default:
                                        l5.a(l5Var);
                                        return;
                                }
                            }
                        }));
                        String M0 = id.M0(2131749010, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        l5.a(l5Var);
                                        return;
                                    default:
                                        l5.a(l5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) w70Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(g5Var.getContext());
                        textView.setText(M0);
                        int i12 = org.telegram.ui.ActionBar.m6.Gi;
                        org.telegram.ui.ActionBar.h6 h6Var = g5Var.f32370n;
                        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        b4 b4Var = new b4(g5Var.getContext(), 20);
                        b4Var.setOnClickListener(new la0(runnable, 15));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.m6.Ci;
                        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i12, 30);
                        b4Var.setBackground(k02);
                        org.telegram.ui.ActionBar.t6.j(b4Var, k02, M, g10, h6Var);
                        ka.b(b4Var, 0.05f, 1.5f);
                        b4Var.addView(textView);
                        e61 e61Var = g5Var.f32365a;
                        e61Var.setClipChildren(false);
                        e61Var.addView(b4Var, ha.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    w70Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (l5Var.F.f9290f) {
                        lVar.setText(id.M0(2131748175, null));
                        g5Var.setSubtitle(id.M0(2131748173, null));
                    } else {
                        lVar.setText(id.M0(2131748132, null));
                        g5Var.setSubtitle(id.M0(2131748131, null));
                    }
                }
                g5Var.e(false, false);
                w70Var = g5Var;
                break;
            case 6:
                lz lzVar2 = new lz(l5Var.getContext(), bVar);
                lzVar2.setIsSingleCell(true);
                lzVar2.setIgnoreHeightCheck(true);
                lzVar2.setItemsCount(20);
                lzVar2.setViewType(28);
                lzVar2.f35774x = false;
                w70Var = lzVar2;
                break;
            case 11:
            case 12:
                w70 w70Var3 = new w70(l5Var.getContext(), null);
                w70Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(w70Var3, org.telegram.ui.ActionBar.m6.f28282y6, bVar);
                org.telegram.ui.ActionBar.t6.G(w70Var3, org.telegram.ui.ActionBar.m6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                w70Var3.setPadding(L3, L2, L3, L2);
                w70Var3.setMaxLines(Integer.MAX_VALUE);
                w70Var3.setGravity(17);
                w70Var3.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    w70Var3.setText(org.telegram.messenger.g0.U2(id.M0(2131744446, null), new ab(this, 22)));
                } else {
                    w70Var3.setText(id.M0(2131745563, null));
                }
                w70Var3.setLayoutParams(new v4.o0(-1, -2));
                w70Var = w70Var3;
                break;
        }
        return new v4.d1(w70Var);
    }
}
