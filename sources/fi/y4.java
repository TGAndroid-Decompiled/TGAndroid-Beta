package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z70;
import org.telegram.ui.z51;
public final class y4 extends tj0 {
    public final ArrayList f12546c = new ArrayList();
    public final c5 d;

    public y4(c5 c5Var) {
        this.d = c5Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f12546c;
        arrayList.clear();
        c5 c5Var = this.d;
        b5 b5Var = c5Var.F;
        int i7 = 0;
        if (c5Var.R) {
            arrayList.add(new t4(0));
            arrayList.add(new t4(6));
        } else {
            arrayList.add(new t4(0));
            if (b5Var != null) {
                o4 o4Var = b5Var.f11566s;
                boolean z10 = b5Var.f11557j;
                if (b5Var.b() <= 0 && (z10 || (!b5Var.f11553e && !b5Var.f11560m))) {
                    if (!TextUtils.isEmpty(o4Var.f12117c)) {
                        arrayList.add(new t4(7));
                    } else if (z10) {
                        arrayList.add(new t4(5));
                    } else {
                        int i10 = b5Var.f11550a;
                        if (i10 > 0 && o4Var.f12116b) {
                            arrayList.add(new t4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new t4(10));
                        } else {
                            arrayList.add(new t4(5));
                        }
                    }
                }
            }
            if (b5Var != null) {
                ArrayList arrayList2 = b5Var.f11555g;
                ArrayList arrayList3 = b5Var.f11556i;
                if (b5Var.f11554f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new t4((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new t4((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (b5Var != null && (b5Var.f11553e || b5Var.f11560m)) {
                if (b5Var.b() <= 0) {
                    arrayList.add(new t4(6));
                } else {
                    arrayList.add(new t4(4));
                }
            } else if (b5Var != null && b5Var.f11558k) {
                arrayList.add(new t4(11));
            } else if (b5Var != null) {
                o4 o4Var2 = b5Var.f11566s;
                if (b5Var.b() < b5Var.f11550a && TextUtils.isEmpty(o4Var2.f12117c) && !o4Var2.f12116b) {
                    arrayList.add(new t4(12));
                }
            }
        }
        arrayList.add(new t4(9));
        f();
    }

    @Override
    public final int b() {
        return this.f12546c.size();
    }

    @Override
    public final int d(int i7) {
        return ((t4) this.f12546c.get(i7)).f12361a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat M0;
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
        c5 c5Var = this.d;
        int i15 = c5Var.f11605w;
        if (e1Var.f58539f == 1 && i7 >= 0) {
            ArrayList arrayList = this.f12546c;
            if (i7 < arrayList.size()) {
                t4 t4Var = (t4) arrayList.get(i7);
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) e1Var.f58535a;
                TL_stories.StoryView storyView = t4Var.f12362b;
                TL_stories.StoryReaction storyReaction = t4Var.f12363c;
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
                    user = np.s1(i15).a2(Long.valueOf(o4));
                    j3 = o4;
                    M0 = null;
                } else {
                    j3 = o4;
                    M0 = np.s1(i15).M0(Long.valueOf(-o4));
                    user = null;
                }
                boolean remove = c5Var.G.f11563p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ch.p0.d(reaction3).f5191f) != null && str2.equals("❤")) {
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
                        l6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
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
                            j5 j5Var = c5Var.E;
                            if (j5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = j5Var.f11899a;
                            }
                            l6Var.c(user3, null, null, z11, j12, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            l6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i7 < arrayList.size() - 1) {
                        i14 = ((t4) arrayList.get(i7 + 1)).f12361a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i13 && i14 != i12) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    l6Var.f30635a = z12;
                    if (c5Var.d(storyView)) {
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
                        if (reaction4 != null && (str = ch.p0.d(reaction4).f5191f) != null && str.equals("❤")) {
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
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            j5 j5Var2 = c5Var.E;
                            if (j5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = j5Var2.f11899a;
                            }
                            l6Var.c(user4, M0, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i7 < arrayList.size() - 1) {
                        i11 = ((t4) arrayList.get(i7 + 1)).f12361a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z13 = false;
                    }
                    l6Var.f30635a = z13;
                    l6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        z70 z70Var;
        final c5 c5Var = this.d;
        int i11 = c5Var.f11605w;
        b bVar = c5Var.f11604s;
        switch (i7) {
            case 0:
                z70Var = new v4(this, c5Var.getContext(), 0);
                break;
            case 1:
                pa0 pa0Var = org.telegram.ui.Cells.l6.I;
                z70Var = new w4(i11, c5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                z70Var = new v4(this, c5Var.getContext(), 1);
                break;
            case 3:
                z70Var = new org.telegram.ui.Cells.v3(c5Var.getContext(), 70);
                break;
            case 4:
                pz pzVar = new pz(c5Var.getContext(), bVar);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(28);
                pzVar.f38448x = false;
                z70Var = pzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (c5Var.G.f11557j) {
                    i10 = 12;
                } else if (i7 != 10 && i7 != 7 && i7 != 8 && i7 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                x4 x4Var = new x4(i10, c5Var.getContext(), bVar, this);
                xh.l lVar = x4Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    x4Var.setSubtitle(hd.M0(2131748167, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    x4Var.setSubtitle(hd.M0(2131748222, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(hd.M0(2131745562, null));
                    x4Var.setSubtitle(hd.M0(2131745564, null));
                } else if (c5Var.G.f11557j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.M0(2131750871, null)));
                    boolean D3 = np.s1(i11).D3();
                    z70 z70Var2 = x4Var.f33709e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(hd.M0(2131750870, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        c5.a(c5Var);
                                        return;
                                    default:
                                        c5.a(c5Var);
                                        return;
                                }
                            }
                        }));
                        String M0 = hd.M0(2131749010, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        c5.a(c5Var);
                                        return;
                                    default:
                                        c5.a(c5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) z70Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(x4Var.getContext());
                        textView.setText(M0);
                        int i12 = org.telegram.ui.ActionBar.j6.Ji;
                        org.telegram.ui.ActionBar.e6 e6Var = x4Var.f33711n;
                        org.telegram.ui.ActionBar.q6.U(textView, i12, e6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        bi.v1 v1Var = new bi.v1(x4Var.getContext(), 22);
                        v1Var.setOnClickListener(new y60(runnable, 16));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i13 = org.telegram.ui.ActionBar.j6.Fi;
                        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
                        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i12, 30);
                        v1Var.setBackground(k02);
                        org.telegram.ui.ActionBar.q6.j(v1Var, k02, M, g10, e6Var);
                        na.b(v1Var, 0.05f, 1.5f);
                        v1Var.addView(textView);
                        z51 z51Var = x4Var.f33706a;
                        z51Var.setClipChildren(false);
                        z51Var.addView(v1Var, ja.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    z70Var2.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (c5Var.G.f11554f) {
                        lVar.setText(hd.M0(2131748175, null));
                        x4Var.setSubtitle(hd.M0(2131748173, null));
                    } else {
                        lVar.setText(hd.M0(2131748132, null));
                        x4Var.setSubtitle(hd.M0(2131748131, null));
                    }
                }
                x4Var.e(false, false);
                z70Var = x4Var;
                break;
            case 6:
                pz pzVar2 = new pz(c5Var.getContext(), bVar);
                pzVar2.setIsSingleCell(true);
                pzVar2.setIgnoreHeightCheck(true);
                pzVar2.setItemsCount(20);
                pzVar2.setViewType(28);
                pzVar2.f38448x = false;
                z70Var = pzVar2;
                break;
            case 11:
            case 12:
                z70 z70Var3 = new z70(c5Var.getContext(), null);
                z70Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.q6.U(z70Var3, org.telegram.ui.ActionBar.j6.f29241y6, bVar);
                org.telegram.ui.ActionBar.q6.G(z70Var3, org.telegram.ui.ActionBar.j6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                z70Var3.setPadding(L3, L2, L3, L2);
                z70Var3.setMaxLines(Integer.MAX_VALUE);
                z70Var3.setGravity(17);
                z70Var3.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    z70Var3.setText(org.telegram.messenger.g0.U2(hd.M0(2131744446, null), new c1(this, 6)));
                } else {
                    z70Var3.setText(hd.M0(2131745563, null));
                }
                z70Var3.setLayoutParams(new v4.p0(-1, -2));
                z70Var = z70Var3;
                break;
        }
        return new v4.e1(z70Var);
    }
}
