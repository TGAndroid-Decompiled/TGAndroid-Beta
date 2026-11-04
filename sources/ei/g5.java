package ei;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.s51;
public final class g5 extends sj0 {
    public final ArrayList f10333c = new ArrayList();
    public final k5 d;

    public g5(k5 k5Var) {
        this.d = k5Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f10333c;
        arrayList.clear();
        k5 k5Var = this.d;
        j5 j5Var = k5Var.F;
        int i3 = 0;
        if (k5Var.R) {
            arrayList.add(new b5(0));
            arrayList.add(new b5(6));
        } else {
            arrayList.add(new b5(0));
            if (j5Var != null) {
                w4 w4Var = j5Var.f10550s;
                boolean z10 = j5Var.f10541j;
                if (j5Var.b() <= 0 && (z10 || (!j5Var.f10537e && !j5Var.f10544m))) {
                    if (!TextUtils.isEmpty(w4Var.f11182c)) {
                        arrayList.add(new b5(7));
                    } else if (z10) {
                        arrayList.add(new b5(5));
                    } else {
                        int i10 = j5Var.f10534a;
                        if (i10 > 0 && w4Var.f11181b) {
                            arrayList.add(new b5(8));
                        } else if (i10 > 0) {
                            arrayList.add(new b5(10));
                        } else {
                            arrayList.add(new b5(5));
                        }
                    }
                }
            }
            if (j5Var != null) {
                ArrayList arrayList2 = j5Var.f10539g;
                ArrayList arrayList3 = j5Var.f10540i;
                if (j5Var.f10538f) {
                    while (i3 < arrayList3.size()) {
                        arrayList.add(new b5((TL_stories.StoryReaction) arrayList3.get(i3)));
                        i3++;
                    }
                } else {
                    while (i3 < arrayList2.size()) {
                        arrayList.add(new b5((TL_stories.StoryView) arrayList2.get(i3)));
                        i3++;
                    }
                }
            }
            if (j5Var != null && (j5Var.f10537e || j5Var.f10544m)) {
                if (j5Var.b() <= 0) {
                    arrayList.add(new b5(6));
                } else {
                    arrayList.add(new b5(4));
                }
            } else if (j5Var != null && j5Var.f10542k) {
                arrayList.add(new b5(11));
            } else if (j5Var != null) {
                w4 w4Var2 = j5Var.f10550s;
                if (j5Var.b() < j5Var.f10534a && TextUtils.isEmpty(w4Var2.f11182c) && !w4Var2.f11181b) {
                    arrayList.add(new b5(12));
                }
            }
        }
        arrayList.add(new b5(9));
        f();
    }

    @Override
    public final int b() {
        return this.f10333c.size();
    }

    @Override
    public final int d(int i3) {
        return ((b5) this.f10333c.get(i3)).f10127a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i10;
        long j11;
        TL_stories.StoryItem storyItem;
        int i11;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j12;
        boolean z11;
        int i12;
        int i13;
        TLRPC.Reaction reaction2;
        long j13;
        TL_stories.StoryItem storyItem2;
        int i14;
        boolean z12;
        float f10;
        String str2;
        TLRPC.Message message2;
        k5 k5Var = this.d;
        int i15 = k5Var.f10579w;
        if (d1Var.f55544f == 1 && i3 >= 0) {
            ArrayList arrayList = this.f10333c;
            if (i3 < arrayList.size()) {
                b5 b5Var = (b5) arrayList.get(i3);
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) d1Var.f55540a;
                TL_stories.StoryView storyView = b5Var.f10128b;
                TL_stories.StoryReaction storyReaction = b5Var.f10129c;
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
                long o10 = org.telegram.messenger.m5.o(peer);
                if (o10 >= 0) {
                    user = hp.s1(i15).a2(Long.valueOf(o10));
                    j10 = o10;
                    M0 = null;
                } else {
                    j10 = o10;
                    M0 = hp.s1(i15).M0(Long.valueOf(-o10));
                    user = null;
                }
                boolean remove = k5Var.G.f10547p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = dh.n0.d(reaction3).f9097f) != null && str2.equals("❤")) {
                        j12 = 0;
                        z11 = true;
                    } else {
                        j12 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i12 = 12;
                        l6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i12 = 12;
                        i13 = 11;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j13 = message3.date;
                            } else {
                                j13 = j12;
                            }
                            r5 r5Var = k5Var.E;
                            if (r5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = r5Var.f10868a;
                            }
                            l6Var.c(user3, null, null, z11, j13, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            l6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i3 < arrayList.size() - 1) {
                        i14 = ((b5) arrayList.get(i3 + 1)).f10127a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    l6Var.f29574a = z12;
                    if (k5Var.d(storyView)) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    l6Var.a(false, f10);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = dh.n0.d(reaction4).f9097f) != null && str.equals("❤")) {
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
                        l6Var.c(user4, M0, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i10 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            l6Var.c(user4, M0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            r5 r5Var2 = k5Var.E;
                            if (r5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = r5Var2.f10868a;
                            }
                            l6Var.c(user4, M0, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i3 < arrayList.size() - 1) {
                        i11 = ((b5) arrayList.get(i3 + 1)).f10127a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z13 = false;
                    }
                    l6Var.f29574a = z13;
                    l6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        s70 s70Var;
        final k5 k5Var = this.d;
        int i11 = k5Var.f10579w;
        b bVar = k5Var.f10578s;
        switch (i3) {
            case 0:
                s70Var = new d5(this, k5Var.getContext(), 0);
                break;
            case 1:
                ja0 ja0Var = org.telegram.ui.Cells.l6.I;
                s70Var = new e5(i11, k5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                s70Var = new d5(this, k5Var.getContext(), 1);
                break;
            case 3:
                s70Var = new org.telegram.ui.Cells.v3(k5Var.getContext(), 70);
                break;
            case 4:
                iz izVar = new iz(k5Var.getContext(), bVar);
                izVar.setIsSingleCell(true);
                izVar.setViewType(28);
                izVar.f34869x = false;
                s70Var = izVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (k5Var.G.f10541j) {
                    i10 = 12;
                } else if (i3 != 10 && i3 != 7 && i3 != 8 && i3 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                f5 f5Var = new f5(i10, k5Var.getContext(), bVar, this);
                yh.l lVar = f5Var.d;
                if (i3 == 7) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(bd.M0(2131748175, null));
                } else if (i3 == 8) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(bd.M0(2131748230, null));
                } else if (i3 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(bd.M0(2131745572, null));
                    f5Var.setSubtitle(bd.M0(2131745574, null));
                } else if (k5Var.G.f10541j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.M0(2131750872, null)));
                    boolean D3 = hp.s1(i11).D3();
                    s70 s70Var2 = f5Var.f41128e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(bd.M0(2131750871, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        k5.a(k5Var);
                                        return;
                                    default:
                                        k5.a(k5Var);
                                        return;
                                }
                            }
                        }));
                        String M0 = bd.M0(2131749018, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        k5.a(k5Var);
                                        return;
                                    default:
                                        k5.a(k5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) s70Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(f5Var.getContext());
                        textView.setText(M0);
                        int i12 = org.telegram.ui.ActionBar.k6.Gi;
                        org.telegram.ui.ActionBar.e6 e6Var = f5Var.f41130n;
                        org.telegram.ui.ActionBar.r6.V(textView, i12, e6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        ai.d2 d2Var = new ai.d2(f5Var.getContext(), 22);
                        d2Var.setOnClickListener(new ga0(runnable, 16));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.k6.Ci;
                        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, e6Var);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o10, o10);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 30);
                        d2Var.setBackground(k02);
                        org.telegram.ui.ActionBar.r6.k(d2Var, k02, N, h, e6Var);
                        pf.b(d2Var, 0.05f, 1.5f);
                        d2Var.addView(textView);
                        s51 s51Var = f5Var.f41125a;
                        s51Var.setClipChildren(false);
                        s51Var.addView(d2Var, mf.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    s70Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (k5Var.G.f10538f) {
                        lVar.setText(bd.M0(2131748183, null));
                        f5Var.setSubtitle(bd.M0(2131748181, null));
                    } else {
                        lVar.setText(bd.M0(2131748140, null));
                        f5Var.setSubtitle(bd.M0(2131748139, null));
                    }
                }
                f5Var.e(false, false);
                s70Var = f5Var;
                break;
            case 6:
                iz izVar2 = new iz(k5Var.getContext(), bVar);
                izVar2.setIsSingleCell(true);
                izVar2.setIgnoreHeightCheck(true);
                izVar2.setItemsCount(20);
                izVar2.setViewType(28);
                izVar2.f34869x = false;
                s70Var = izVar2;
                break;
            case 11:
            case 12:
                s70 s70Var3 = new s70(k5Var.getContext(), null);
                s70Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(s70Var3, org.telegram.ui.ActionBar.k6.f28273y6, bVar);
                org.telegram.ui.ActionBar.r6.H(s70Var3, org.telegram.ui.ActionBar.k6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                s70Var3.setPadding(L3, L2, L3, L2);
                s70Var3.setMaxLines(Integer.MAX_VALUE);
                s70Var3.setGravity(17);
                s70Var3.setDisablePaddingsOffsetY(true);
                if (i3 == 11) {
                    s70Var3.setText(org.telegram.messenger.g0.U2(bd.M0(2131744456, null), new ci.d1(this, 28)));
                } else {
                    s70Var3.setText(bd.M0(2131745573, null));
                }
                s70Var3.setLayoutParams(new u4.p0(-1, -2));
                s70Var = s70Var3;
                break;
        }
        return new u4.d1(s70Var);
    }
}
