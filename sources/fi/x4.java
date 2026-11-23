package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.yz;
import org.telegram.ui.d61;
public final class x4 extends dk0 {
    public final ArrayList f12774c = new ArrayList();
    public final b5 d;

    public x4(b5 b5Var) {
        this.d = b5Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f12774c;
        arrayList.clear();
        b5 b5Var = this.d;
        a5 a5Var = b5Var.F;
        int i7 = 0;
        if (b5Var.R) {
            arrayList.add(new s4(0));
            arrayList.add(new s4(6));
        } else {
            arrayList.add(new s4(0));
            if (a5Var != null) {
                n4 n4Var = a5Var.f11771s;
                boolean z10 = a5Var.f11762j;
                if (a5Var.b() <= 0 && (z10 || (!a5Var.f11758e && !a5Var.f11765m))) {
                    if (!TextUtils.isEmpty(n4Var.f12342c)) {
                        arrayList.add(new s4(7));
                    } else if (z10) {
                        arrayList.add(new s4(5));
                    } else {
                        int i10 = a5Var.f11755a;
                        if (i10 > 0 && n4Var.f12341b) {
                            arrayList.add(new s4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new s4(10));
                        } else {
                            arrayList.add(new s4(5));
                        }
                    }
                }
            }
            if (a5Var != null) {
                ArrayList arrayList2 = a5Var.f11760g;
                ArrayList arrayList3 = a5Var.f11761i;
                if (a5Var.f11759f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new s4((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new s4((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (a5Var != null && (a5Var.f11758e || a5Var.f11765m)) {
                if (a5Var.b() <= 0) {
                    arrayList.add(new s4(6));
                } else {
                    arrayList.add(new s4(4));
                }
            } else if (a5Var != null && a5Var.f11763k) {
                arrayList.add(new s4(11));
            } else if (a5Var != null) {
                n4 n4Var2 = a5Var.f11771s;
                if (a5Var.b() < a5Var.f11755a && TextUtils.isEmpty(n4Var2.f12342c) && !n4Var2.f12341b) {
                    arrayList.add(new s4(12));
                }
            }
        }
        arrayList.add(new s4(9));
        f();
    }

    @Override
    public final int b() {
        return this.f12774c.size();
    }

    @Override
    public final int d(int i7) {
        return ((s4) this.f12774c.get(i7)).f12561a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat O0;
        TLRPC.User user;
        int i10;
        long j10;
        TL_stories.StoryItem storyItem;
        int i11;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j11;
        boolean z11;
        int i12;
        int i13;
        TLRPC.Reaction reaction2;
        long j12;
        TL_stories.StoryItem storyItem2;
        int i14;
        boolean z12;
        float f10;
        String str2;
        TLRPC.Message message2;
        b5 b5Var = this.d;
        int i15 = b5Var.f11820w;
        if (f1Var.f59169f == 1 && i7 >= 0) {
            ArrayList arrayList = this.f12774c;
            if (i7 < arrayList.size()) {
                s4 s4Var = (s4) arrayList.get(i7);
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) f1Var.f59165a;
                TL_stories.StoryView storyView = s4Var.f12562b;
                TL_stories.StoryReaction storyReaction = s4Var.f12563c;
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
                long o4 = org.telegram.messenger.n5.o(peer);
                if (o4 >= 0) {
                    user = np.u1(i15).c2(Long.valueOf(o4));
                    j3 = o4;
                    O0 = null;
                } else {
                    j3 = o4;
                    O0 = np.u1(i15).O0(Long.valueOf(-o4));
                    user = null;
                }
                boolean remove = b5Var.G.f11768p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ch.p0.d(reaction3).f5507f) != null && str2.equals("❤")) {
                        j11 = 0;
                        z11 = true;
                    } else {
                        j11 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i12 = 12;
                        n6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
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
                            i5 i5Var = b5Var.E;
                            if (i5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = i5Var.f12142a;
                            }
                            n6Var.c(user3, null, null, z11, j12, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            n6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i7 < arrayList.size() - 1) {
                        i14 = ((s4) arrayList.get(i7 + 1)).f12561a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    n6Var.f31147a = z12;
                    if (b5Var.d(storyView)) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    n6Var.a(false, f10);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = ch.p0.d(reaction4).f5507f) != null && str.equals("❤")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            reaction = null;
                        } else {
                            reaction = tL_storyReaction.reaction;
                        }
                        i10 = 12;
                        n6Var.c(user4, O0, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i10 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            n6Var.c(user4, O0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            i5 i5Var2 = b5Var.E;
                            if (i5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = i5Var2.f12142a;
                            }
                            n6Var.c(user4, O0, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i7 < arrayList.size() - 1) {
                        i11 = ((s4) arrayList.get(i7 + 1)).f12561a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z13 = false;
                    }
                    n6Var.f31147a = z13;
                    n6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        m80 m80Var;
        final b5 b5Var = this.d;
        int i11 = b5Var.f11820w;
        b bVar = b5Var.f11819s;
        switch (i7) {
            case 0:
                m80Var = new u4(this, b5Var.getContext(), 0);
                break;
            case 1:
                ab0 ab0Var = org.telegram.ui.Cells.n6.I;
                m80Var = new v4(i11, b5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                m80Var = new u4(this, b5Var.getContext(), 1);
                break;
            case 3:
                m80Var = new org.telegram.ui.Cells.w3(b5Var.getContext(), 70);
                break;
            case 4:
                yz yzVar = new yz(b5Var.getContext(), bVar);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(28);
                yzVar.f42606x = false;
                m80Var = yzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (b5Var.G.f11762j) {
                    i10 = 12;
                } else if (i7 != 10 && i7 != 7 && i7 != 8 && i7 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                w4 w4Var = new w4(i10, b5Var.getContext(), bVar, this);
                xh.l lVar = w4Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    w4Var.setSubtitle(hd.N0(2131747974, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    w4Var.setSubtitle(hd.N0(2131748029, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(hd.N0(2131745366, null));
                    w4Var.setSubtitle(hd.N0(2131745368, null));
                } else if (b5Var.G.f11762j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.N0(2131750859, null)));
                    boolean K3 = np.u1(i11).K3();
                    m80 m80Var2 = w4Var.f37996e;
                    if (!K3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.T2(hd.N0(2131750858, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        b5.a(b5Var);
                                        return;
                                    default:
                                        b5.a(b5Var);
                                        return;
                                }
                            }
                        }));
                        String N0 = hd.N0(2131748817, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        b5.a(b5Var);
                                        return;
                                    default:
                                        b5.a(b5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) m80Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(w4Var.getContext());
                        textView.setText(N0);
                        int i12 = org.telegram.ui.ActionBar.m6.Ji;
                        org.telegram.ui.ActionBar.h6 h6Var = w4Var.f37998n;
                        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        bi.t2 t2Var = new bi.t2(w4Var.getContext(), 22);
                        t2Var.setOnClickListener(new j70(runnable, 18));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.m6.Fi;
                        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i12, 30);
                        t2Var.setBackground(k02);
                        org.telegram.ui.ActionBar.t6.j(t2Var, k02, M, g10, h6Var);
                        ra.b(t2Var, 0.05f, 1.5f);
                        t2Var.addView(textView);
                        d61 d61Var = w4Var.f37993a;
                        d61Var.setClipChildren(false);
                        d61Var.addView(t2Var, ma.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    m80Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (b5Var.G.f11759f) {
                        lVar.setText(hd.N0(2131747982, null));
                        w4Var.setSubtitle(hd.N0(2131747980, null));
                    } else {
                        lVar.setText(hd.N0(2131747939, null));
                        w4Var.setSubtitle(hd.N0(2131747938, null));
                    }
                }
                w4Var.e(false, false);
                m80Var = w4Var;
                break;
            case 6:
                yz yzVar2 = new yz(b5Var.getContext(), bVar);
                yzVar2.setIsSingleCell(true);
                yzVar2.setIgnoreHeightCheck(true);
                yzVar2.setItemsCount(20);
                yzVar2.setViewType(28);
                yzVar2.f42606x = false;
                m80Var = yzVar2;
                break;
            case 11:
            case 12:
                m80 m80Var3 = new m80(b5Var.getContext(), null);
                m80Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(m80Var3, org.telegram.ui.ActionBar.m6.f29773y6, bVar);
                org.telegram.ui.ActionBar.t6.G(m80Var3, org.telegram.ui.ActionBar.m6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                m80Var3.setPadding(L3, L2, L3, L2);
                m80Var3.setMaxLines(Integer.MAX_VALUE);
                m80Var3.setGravity(17);
                m80Var3.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    m80Var3.setText(org.telegram.messenger.g0.T2(hd.N0(2131744203, null), new f2.a(this, 10)));
                } else {
                    m80Var3.setText(hd.N0(2131745367, null));
                }
                m80Var3.setLayoutParams(new v4.q0(-1, -2));
                m80Var = m80Var3;
                break;
        }
        return new v4.f1(m80Var);
    }
}
