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
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.c61;
public final class g5 extends oj0 {
    public final ArrayList f9047c = new ArrayList();
    public final k5 d;

    public g5(k5 k5Var) {
        this.d = k5Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f9047c;
        arrayList.clear();
        k5 k5Var = this.d;
        j5 j5Var = k5Var.E;
        int i7 = 0;
        if (k5Var.Q) {
            arrayList.add(new b5(0));
            arrayList.add(new b5(6));
        } else {
            arrayList.add(new b5(0));
            if (j5Var != null) {
                w4 w4Var = j5Var.f9271s;
                boolean z9 = j5Var.f9262j;
                if (j5Var.b() <= 0 && (z9 || (!j5Var.f9258e && !j5Var.f9265m))) {
                    if (!TextUtils.isEmpty(w4Var.f9903c)) {
                        arrayList.add(new b5(7));
                    } else if (z9) {
                        arrayList.add(new b5(5));
                    } else {
                        int i10 = j5Var.f9255a;
                        if (i10 > 0 && w4Var.f9902b) {
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
                ArrayList arrayList2 = j5Var.f9260g;
                ArrayList arrayList3 = j5Var.f9261i;
                if (j5Var.f9259f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new b5((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new b5((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (j5Var != null && (j5Var.f9258e || j5Var.f9265m)) {
                if (j5Var.b() <= 0) {
                    arrayList.add(new b5(6));
                } else {
                    arrayList.add(new b5(4));
                }
            } else if (j5Var != null && j5Var.f9263k) {
                arrayList.add(new b5(11));
            } else if (j5Var != null) {
                w4 w4Var2 = j5Var.f9271s;
                if (j5Var.b() < j5Var.f9255a && TextUtils.isEmpty(w4Var2.f9903c) && !w4Var2.f9902b) {
                    arrayList.add(new b5(12));
                }
            }
        }
        arrayList.add(new b5(9));
        f();
    }

    @Override
    public final int b() {
        return this.f9047c.size();
    }

    @Override
    public final int d(int i7) {
        return ((b5) this.f9047c.get(i7)).f8843a;
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
        k5 k5Var = this.d;
        int i15 = k5Var.f9307w;
        if (d1Var.f56955f == 1 && i7 >= 0) {
            ArrayList arrayList = this.f9047c;
            if (i7 < arrayList.size()) {
                b5 b5Var = (b5) arrayList.get(i7);
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) d1Var.f56951a;
                TL_stories.StoryView storyView = b5Var.f8844b;
                TL_stories.StoryReaction storyReaction = b5Var.f8845c;
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
                boolean remove = k5Var.F.f9268p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ch.o0.d(reaction3).f6356f) != null && str2.equals("❤")) {
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
                            r5 r5Var = k5Var.D;
                            if (r5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = r5Var.f9699a;
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
                        i14 = ((b5) arrayList.get(i7 + 1)).f8843a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    m6Var.f29546a = z11;
                    if (k5Var.d(storyView)) {
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
                        if (reaction4 != null && (str = ch.o0.d(reaction4).f6356f) != null && str.equals("❤")) {
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
                            r5 r5Var2 = k5Var.D;
                            if (r5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = r5Var2.f9699a;
                            }
                            m6Var.c(user4, M0, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z12 = true;
                    if (i7 < arrayList.size() - 1) {
                        i11 = ((b5) arrayList.get(i7 + 1)).f8843a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z12 = false;
                    }
                    m6Var.f29546a = z12;
                    m6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        w70 w70Var;
        final k5 k5Var = this.d;
        int i11 = k5Var.f9307w;
        b bVar = k5Var.f9306s;
        switch (i7) {
            case 0:
                w70Var = new d5(this, k5Var.getContext(), 0);
                break;
            case 1:
                oa0 oa0Var = org.telegram.ui.Cells.m6.H;
                w70Var = new e5(i11, k5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                w70Var = new d5(this, k5Var.getContext(), 1);
                break;
            case 3:
                w70Var = new org.telegram.ui.Cells.v3(k5Var.getContext(), 70);
                break;
            case 4:
                lz lzVar = new lz(k5Var.getContext(), bVar);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(28);
                lzVar.f35802x = false;
                w70Var = lzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (k5Var.F.f9262j) {
                    i10 = 12;
                } else if (i7 != 10 && i7 != 7 && i7 != 8 && i7 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                f5 f5Var = new f5(i10, k5Var.getContext(), bVar, this);
                xh.l lVar = f5Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(hd.M0(2131748166, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(hd.M0(2131748221, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(hd.M0(2131745563, null));
                    f5Var.setSubtitle(hd.M0(2131745565, null));
                } else if (k5Var.F.f9262j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.M0(2131750872, null)));
                    boolean D3 = qp.s1(i11).D3();
                    w70 w70Var2 = f5Var.f31925e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(hd.M0(2131750871, null), new Runnable() {
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
                        String M0 = hd.M0(2131749009, null);
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
                        ((LinearLayout.LayoutParams) w70Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(f5Var.getContext());
                        textView.setText(M0);
                        int i12 = org.telegram.ui.ActionBar.k6.Gi;
                        org.telegram.ui.ActionBar.f6 f6Var = f5Var.f31927n;
                        org.telegram.ui.ActionBar.r6.V(textView, i12, f6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        a4 a4Var = new a4(f5Var.getContext(), 20);
                        a4Var.setOnClickListener(new la0(runnable, 15));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.k6.Ci;
                        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, f6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 30);
                        a4Var.setBackground(k02);
                        org.telegram.ui.ActionBar.r6.k(a4Var, k02, N, h, f6Var);
                        ka.b(a4Var, 0.05f, 1.5f);
                        a4Var.addView(textView);
                        c61 c61Var = f5Var.f31922a;
                        c61Var.setClipChildren(false);
                        c61Var.addView(a4Var, ha.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    w70Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (k5Var.F.f9259f) {
                        lVar.setText(hd.M0(2131748174, null));
                        f5Var.setSubtitle(hd.M0(2131748172, null));
                    } else {
                        lVar.setText(hd.M0(2131748131, null));
                        f5Var.setSubtitle(hd.M0(2131748130, null));
                    }
                }
                f5Var.e(false, false);
                w70Var = f5Var;
                break;
            case 6:
                lz lzVar2 = new lz(k5Var.getContext(), bVar);
                lzVar2.setIsSingleCell(true);
                lzVar2.setIgnoreHeightCheck(true);
                lzVar2.setItemsCount(20);
                lzVar2.setViewType(28);
                lzVar2.f35802x = false;
                w70Var = lzVar2;
                break;
            case 11:
            case 12:
                w70 w70Var3 = new w70(k5Var.getContext(), null);
                w70Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(w70Var3, org.telegram.ui.ActionBar.k6.f28241y6, bVar);
                org.telegram.ui.ActionBar.r6.H(w70Var3, org.telegram.ui.ActionBar.k6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                w70Var3.setPadding(L3, L2, L3, L2);
                w70Var3.setMaxLines(Integer.MAX_VALUE);
                w70Var3.setGravity(17);
                w70Var3.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    w70Var3.setText(org.telegram.messenger.g0.U2(hd.M0(2131744447, null), new ab(this, 23)));
                } else {
                    w70Var3.setText(hd.M0(2131745564, null));
                }
                w70Var3.setLayoutParams(new v4.o0(-1, -2));
                w70Var = w70Var3;
                break;
        }
        return new v4.d1(w70Var);
    }
}
