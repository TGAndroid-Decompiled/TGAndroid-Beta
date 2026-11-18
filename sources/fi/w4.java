package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.za0;
import org.telegram.ui.d61;
public final class w4 extends bk0 {
    public final ArrayList f12699c = new ArrayList();
    public final a5 d;

    public w4(a5 a5Var) {
        this.d = a5Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f12699c;
        arrayList.clear();
        a5 a5Var = this.d;
        z4 z4Var = a5Var.F;
        int i7 = 0;
        if (a5Var.R) {
            arrayList.add(new r4(0));
            arrayList.add(new r4(6));
        } else {
            arrayList.add(new r4(0));
            if (z4Var != null) {
                m4 m4Var = z4Var.f12919s;
                boolean z10 = z4Var.f12910j;
                if (z4Var.b() <= 0 && (z10 || (!z4Var.f12906e && !z4Var.f12913m))) {
                    if (!TextUtils.isEmpty(m4Var.f12269c)) {
                        arrayList.add(new r4(7));
                    } else if (z10) {
                        arrayList.add(new r4(5));
                    } else {
                        int i10 = z4Var.f12903a;
                        if (i10 > 0 && m4Var.f12268b) {
                            arrayList.add(new r4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new r4(10));
                        } else {
                            arrayList.add(new r4(5));
                        }
                    }
                }
            }
            if (z4Var != null) {
                ArrayList arrayList2 = z4Var.f12908g;
                ArrayList arrayList3 = z4Var.f12909i;
                if (z4Var.f12907f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new r4((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new r4((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (z4Var != null && (z4Var.f12906e || z4Var.f12913m)) {
                if (z4Var.b() <= 0) {
                    arrayList.add(new r4(6));
                } else {
                    arrayList.add(new r4(4));
                }
            } else if (z4Var != null && z4Var.f12911k) {
                arrayList.add(new r4(11));
            } else if (z4Var != null) {
                m4 m4Var2 = z4Var.f12919s;
                if (z4Var.b() < z4Var.f12903a && TextUtils.isEmpty(m4Var2.f12269c) && !m4Var2.f12268b) {
                    arrayList.add(new r4(12));
                }
            }
        }
        arrayList.add(new r4(9));
        f();
    }

    @Override
    public final int b() {
        return this.f12699c.size();
    }

    @Override
    public final int d(int i7) {
        return ((r4) this.f12699c.get(i7)).f12502a;
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
        a5 a5Var = this.d;
        int i15 = a5Var.f11736w;
        if (f1Var.f59126f == 1 && i7 >= 0) {
            ArrayList arrayList = this.f12699c;
            if (i7 < arrayList.size()) {
                r4 r4Var = (r4) arrayList.get(i7);
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) f1Var.f59122a;
                TL_stories.StoryView storyView = r4Var.f12503b;
                TL_stories.StoryReaction storyReaction = r4Var.f12504c;
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
                    user = mp.u1(i15).c2(Long.valueOf(o4));
                    j3 = o4;
                    O0 = null;
                } else {
                    j3 = o4;
                    O0 = mp.u1(i15).O0(Long.valueOf(-o4));
                    user = null;
                }
                boolean remove = a5Var.G.f12916p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ch.p0.d(reaction3).f5478f) != null && str2.equals("❤")) {
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
                        m6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
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
                            h5 h5Var = a5Var.E;
                            if (h5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = h5Var.f12040a;
                            }
                            m6Var.c(user3, null, null, z11, j12, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            m6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i7 < arrayList.size() - 1) {
                        i14 = ((r4) arrayList.get(i7 + 1)).f12502a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    m6Var.f31061a = z12;
                    if (a5Var.d(storyView)) {
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
                        if (reaction4 != null && (str = ch.p0.d(reaction4).f5478f) != null && str.equals("❤")) {
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
                        m6Var.c(user4, O0, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i10 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            m6Var.c(user4, O0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            h5 h5Var2 = a5Var.E;
                            if (h5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = h5Var2.f12040a;
                            }
                            m6Var.c(user4, O0, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i7 < arrayList.size() - 1) {
                        i11 = ((r4) arrayList.get(i7 + 1)).f12502a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z13 = false;
                    }
                    m6Var.f31061a = z13;
                    m6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        k80 k80Var;
        final a5 a5Var = this.d;
        int i11 = a5Var.f11736w;
        b bVar = a5Var.f11735s;
        switch (i7) {
            case 0:
                k80Var = new t4(this, a5Var.getContext(), 0);
                break;
            case 1:
                za0 za0Var = org.telegram.ui.Cells.m6.I;
                k80Var = new u4(i11, a5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                k80Var = new t4(this, a5Var.getContext(), 1);
                break;
            case 3:
                k80Var = new org.telegram.ui.Cells.v3(a5Var.getContext(), 70);
                break;
            case 4:
                wz wzVar = new wz(a5Var.getContext(), bVar);
                wzVar.setIsSingleCell(true);
                wzVar.setViewType(28);
                wzVar.f41829x = false;
                k80Var = wzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (a5Var.G.f12910j) {
                    i10 = 12;
                } else if (i7 != 10 && i7 != 7 && i7 != 8 && i7 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                v4 v4Var = new v4(i10, a5Var.getContext(), bVar, this);
                xh.l lVar = v4Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    v4Var.setSubtitle(gd.M0(2131747975, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    v4Var.setSubtitle(gd.M0(2131748030, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(gd.M0(2131745367, null));
                    v4Var.setSubtitle(gd.M0(2131745369, null));
                } else if (a5Var.G.f12910j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131750860, null)));
                    boolean K3 = mp.u1(i11).K3();
                    k80 k80Var2 = v4Var.f36896e;
                    if (!K3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.T2(gd.M0(2131750859, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        a5.a(a5Var);
                                        return;
                                    default:
                                        a5.a(a5Var);
                                        return;
                                }
                            }
                        }));
                        String M0 = gd.M0(2131748818, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        a5.a(a5Var);
                                        return;
                                    default:
                                        a5.a(a5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) k80Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(v4Var.getContext());
                        textView.setText(M0);
                        int i12 = org.telegram.ui.ActionBar.n6.Ji;
                        org.telegram.ui.ActionBar.i6 i6Var = v4Var.f36898n;
                        org.telegram.ui.ActionBar.u6.U(textView, i12, i6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        bi.p2 p2Var = new bi.p2(v4Var.getContext(), 22);
                        p2Var.setOnClickListener(new h70(runnable, 17));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.n6.Fi;
                        int w02 = org.telegram.ui.ActionBar.n6.w0(i13, i6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i12, 30);
                        p2Var.setBackground(k02);
                        org.telegram.ui.ActionBar.u6.j(p2Var, k02, M, g10, i6Var);
                        ra.b(p2Var, 0.05f, 1.5f);
                        p2Var.addView(textView);
                        d61 d61Var = v4Var.f36893a;
                        d61Var.setClipChildren(false);
                        d61Var.addView(p2Var, ma.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    k80Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (a5Var.G.f12907f) {
                        lVar.setText(gd.M0(2131747983, null));
                        v4Var.setSubtitle(gd.M0(2131747981, null));
                    } else {
                        lVar.setText(gd.M0(2131747940, null));
                        v4Var.setSubtitle(gd.M0(2131747939, null));
                    }
                }
                v4Var.e(false, false);
                k80Var = v4Var;
                break;
            case 6:
                wz wzVar2 = new wz(a5Var.getContext(), bVar);
                wzVar2.setIsSingleCell(true);
                wzVar2.setIgnoreHeightCheck(true);
                wzVar2.setItemsCount(20);
                wzVar2.setViewType(28);
                wzVar2.f41829x = false;
                k80Var = wzVar2;
                break;
            case 11:
            case 12:
                k80 k80Var3 = new k80(a5Var.getContext(), null);
                k80Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.u6.U(k80Var3, org.telegram.ui.ActionBar.n6.f29788y6, bVar);
                org.telegram.ui.ActionBar.u6.G(k80Var3, org.telegram.ui.ActionBar.n6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                k80Var3.setPadding(L3, L2, L3, L2);
                k80Var3.setMaxLines(Integer.MAX_VALUE);
                k80Var3.setGravity(17);
                k80Var3.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    k80Var3.setText(org.telegram.messenger.g0.T2(gd.M0(2131744211, null), new f2.a(this, 10)));
                } else {
                    k80Var3.setText(gd.M0(2131745368, null));
                }
                k80Var3.setLayoutParams(new v4.q0(-1, -2));
                k80Var = k80Var3;
                break;
        }
        return new v4.f1(k80Var);
    }
}
