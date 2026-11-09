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
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.d61;
public final class h5 extends pj0 {
    public final ArrayList f9073c = new ArrayList();
    public final l5 d;

    public h5(l5 l5Var) {
        this.d = l5Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f9073c;
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
                x4 x4Var = k5Var.f9297s;
                boolean z9 = k5Var.f9288j;
                if (k5Var.b() <= 0 && (z9 || (!k5Var.f9284e && !k5Var.f9291m))) {
                    if (!TextUtils.isEmpty(x4Var.f9928c)) {
                        arrayList.add(new c5(7));
                    } else if (z9) {
                        arrayList.add(new c5(5));
                    } else {
                        int i10 = k5Var.f9281a;
                        if (i10 > 0 && x4Var.f9927b) {
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
                ArrayList arrayList2 = k5Var.f9286g;
                ArrayList arrayList3 = k5Var.f9287i;
                if (k5Var.f9285f) {
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
            if (k5Var != null && (k5Var.f9284e || k5Var.f9291m)) {
                if (k5Var.b() <= 0) {
                    arrayList.add(new c5(6));
                } else {
                    arrayList.add(new c5(4));
                }
            } else if (k5Var != null && k5Var.f9289k) {
                arrayList.add(new c5(11));
            } else if (k5Var != null) {
                x4 x4Var2 = k5Var.f9297s;
                if (k5Var.b() < k5Var.f9281a && TextUtils.isEmpty(x4Var2.f9928c) && !x4Var2.f9927b) {
                    arrayList.add(new c5(12));
                }
            }
        }
        arrayList.add(new c5(9));
        f();
    }

    @Override
    public final int b() {
        return this.f9073c.size();
    }

    @Override
    public final int d(int i7) {
        return ((c5) this.f9073c.get(i7)).f8869a;
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
        int i15 = l5Var.f9331w;
        if (d1Var.f57060f == 1 && i7 >= 0) {
            ArrayList arrayList = this.f9073c;
            if (i7 < arrayList.size()) {
                c5 c5Var = (c5) arrayList.get(i7);
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) d1Var.f57056a;
                TL_stories.StoryView storyView = c5Var.f8870b;
                TL_stories.StoryReaction storyReaction = c5Var.f8871c;
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
                boolean remove = l5Var.F.f9294p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ch.o0.d(reaction3).f6354f) != null && str2.equals("❤")) {
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
                                storyItem2 = s5Var.f9730a;
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
                        i14 = ((c5) arrayList.get(i7 + 1)).f8869a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    m6Var.f29553a = z11;
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
                        if (reaction4 != null && (str = ch.o0.d(reaction4).f6354f) != null && str.equals("❤")) {
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
                                storyItem = s5Var2.f9730a;
                            }
                            m6Var.c(user4, M0, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z12 = true;
                    if (i7 < arrayList.size() - 1) {
                        i11 = ((c5) arrayList.get(i7 + 1)).f8869a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z12 = false;
                    }
                    m6Var.f29553a = z12;
                    m6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        x70 x70Var;
        final l5 l5Var = this.d;
        int i11 = l5Var.f9331w;
        b bVar = l5Var.f9330s;
        switch (i7) {
            case 0:
                x70Var = new e5(this, l5Var.getContext(), 0);
                break;
            case 1:
                pa0 pa0Var = org.telegram.ui.Cells.m6.H;
                x70Var = new f5(i11, l5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                x70Var = new e5(this, l5Var.getContext(), 1);
                break;
            case 3:
                x70Var = new org.telegram.ui.Cells.v3(l5Var.getContext(), 70);
                break;
            case 4:
                mz mzVar = new mz(l5Var.getContext(), bVar);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(28);
                mzVar.f36181x = false;
                x70Var = mzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (l5Var.F.f9288j) {
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
                } else if (l5Var.F.f9288j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.M0(2131750871, null)));
                    boolean D3 = qp.s1(i11).D3();
                    x70 x70Var2 = g5Var.f32768e;
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
                        ((LinearLayout.LayoutParams) x70Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(g5Var.getContext());
                        textView.setText(M0);
                        int i12 = org.telegram.ui.ActionBar.l6.Gi;
                        org.telegram.ui.ActionBar.g6 g6Var = g5Var.f32770n;
                        org.telegram.ui.ActionBar.s6.U(textView, i12, g6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        b4 b4Var = new b4(g5Var.getContext(), 20);
                        b4Var.setOnClickListener(new ma0(runnable, 15));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.l6.Ci;
                        int w02 = org.telegram.ui.ActionBar.l6.w0(i13, g6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(i12, g6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
                        org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i12, 30);
                        b4Var.setBackground(k02);
                        org.telegram.ui.ActionBar.s6.j(b4Var, k02, M, g10, g6Var);
                        ka.b(b4Var, 0.05f, 1.5f);
                        b4Var.addView(textView);
                        d61 d61Var = g5Var.f32765a;
                        d61Var.setClipChildren(false);
                        d61Var.addView(b4Var, ha.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    x70Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (l5Var.F.f9285f) {
                        lVar.setText(id.M0(2131748175, null));
                        g5Var.setSubtitle(id.M0(2131748173, null));
                    } else {
                        lVar.setText(id.M0(2131748132, null));
                        g5Var.setSubtitle(id.M0(2131748131, null));
                    }
                }
                g5Var.e(false, false);
                x70Var = g5Var;
                break;
            case 6:
                mz mzVar2 = new mz(l5Var.getContext(), bVar);
                mzVar2.setIsSingleCell(true);
                mzVar2.setIgnoreHeightCheck(true);
                mzVar2.setItemsCount(20);
                mzVar2.setViewType(28);
                mzVar2.f36181x = false;
                x70Var = mzVar2;
                break;
            case 11:
            case 12:
                x70 x70Var3 = new x70(l5Var.getContext(), null);
                x70Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.s6.U(x70Var3, org.telegram.ui.ActionBar.l6.f28257y6, bVar);
                org.telegram.ui.ActionBar.s6.G(x70Var3, org.telegram.ui.ActionBar.l6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                x70Var3.setPadding(L3, L2, L3, L2);
                x70Var3.setMaxLines(Integer.MAX_VALUE);
                x70Var3.setGravity(17);
                x70Var3.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    x70Var3.setText(org.telegram.messenger.g0.U2(id.M0(2131744446, null), new ab(this, 22)));
                } else {
                    x70Var3.setText(id.M0(2131745563, null));
                }
                x70Var3.setLayoutParams(new v4.o0(-1, -2));
                x70Var = x70Var3;
                break;
        }
        return new v4.d1(x70Var);
    }
}
