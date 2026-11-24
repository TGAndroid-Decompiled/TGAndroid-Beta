package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class hb implements View.OnClickListener {
    public final byte a;
    public final byte b;
    public final Object c;

    public hb(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onClick(View view) {
        p8c p8cVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ii9 N2;
        li9 q;
        boolean z13;
        String M0;
        int i;
        int i2;
        TLRPC.Chat K0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z14;
        String G;
        String G2;
        int i3;
        int i4;
        boolean z15;
        byte b = this.a;
        String str = "";
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        byte b2 = this.b;
        Object obj = this.c;
        boolean z16 = true;
        char c = 1;
        switch (b) {
            case 0:
                ib ibVar = (ib) obj;
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            ibVar.a2 = !ibVar.a2;
                        }
                    } else {
                        ibVar.Z1 = !ibVar.Z1;
                    }
                } else {
                    ibVar.Y1 = !ibVar.Y1;
                }
                ibVar.S1.O(true);
                ibVar.D0();
                return;
            case 1:
                View.OnClickListener onClickListener = ((su1) obj).b[b2];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                o41 o41Var = ((dz1) obj).h;
                if (o41Var != null) {
                    o41Var.g(b2);
                    return;
                }
                return;
            case 3:
                jv5 jv5Var = (jv5) obj;
                jv5Var.R.dismiss();
                int i5 = jv5Var.d0;
                if (i5 >= 0) {
                    o51 o51Var = jv5Var.e0;
                    int[] iArr = o51Var.c;
                    if (!o51Var.b) {
                        o51Var.b = true;
                        for (int i6 = 0; i6 < 4; i6++) {
                            iArr[i6] = gba.q().getInt(de9.k(i6, "keep_media_type_"), o51.b(i6));
                        }
                    }
                    iArr[i5] = b2;
                    gba.q().edit().putInt("keep_media_type_" + i5, b2).apply();
                    gv5 gv5Var = jv5Var.f0;
                    if (gv5Var != null) {
                        gv5Var.a(b2);
                        return;
                    }
                    return;
                }
                gv5 gv5Var2 = jv5Var.f0;
                if (gv5Var2 != null) {
                    gv5Var2.a(b2);
                    return;
                }
                return;
            case 4:
                vx7 vx7Var = (vx7) obj;
                xw7 xw7Var = vx7Var.E1;
                vx7Var.T0 = b2;
                if (b2 == 1) {
                    vx7Var.j0 = vx7Var.h0;
                } else if (b2 == 4) {
                    vx7Var.j0 = vx7Var.i0;
                } else if (b2 == 2) {
                    vx7Var.j0 = vx7Var.f0;
                } else if (b2 == 3) {
                    vx7Var.j0 = vx7Var.g0;
                } else {
                    vx7Var.j0 = vx7Var.e0;
                }
                uu9 uu9Var = (uu9) view.getTag();
                PhotoViewer.r0().T1(null, vx7Var, null);
                if (b2 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vx7Var.k1);
                    PhotoViewer.r0().k1(arrayList, 0, xw7Var);
                    return;
                } else if (b2 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(vx7Var.m1);
                    PhotoViewer.r0().k1(arrayList2, 0, xw7Var);
                    return;
                } else if (b2 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(vx7Var.n1);
                    PhotoViewer.r0().k1(arrayList3, 0, xw7Var);
                    return;
                } else if (b2 == 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    ArrayList arrayList4 = vx7Var.j1;
                    r0.k1(arrayList4, arrayList4.indexOf(uu9Var), xw7Var);
                    return;
                } else {
                    PhotoViewer r02 = PhotoViewer.r0();
                    ArrayList arrayList5 = vx7Var.l1;
                    r02.k1(arrayList5, arrayList5.indexOf(uu9Var), xw7Var);
                    return;
                }
            case 5:
                vi8 vi8Var = ((ti8) obj).b;
                if (vi8Var.r && (p8cVar = vi8Var.f) != null) {
                    p8cVar.a(Integer.valueOf(b2));
                    return;
                }
                return;
            case 6:
                final e72 e72Var = ((df9) obj).a.a;
                wjb wjbVar = e72Var.a;
                ye9 ye9Var = e72Var.r;
                lk0 M2 = ye9Var.M2();
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 4) {
                            if (b2 != 7) {
                                if (b2 == 9) {
                                    ye9Var.p3();
                                    return;
                                }
                                return;
                            }
                            if (M2 != null) {
                                TL_iv.PageBlock pageBlock = M2.b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = e72Var.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            }
                            e72.X(context, str, new pz1(e72Var, pageblockmath, (byte) 5), wjbVar);
                            return;
                        }
                        ii9 ii9Var = ye9Var.q4;
                        if (ii9Var == null && (N2 = ye9Var.N2()) != null && N2.getModel() != null) {
                            View findFocus = ye9Var.findFocus();
                            if ((findFocus instanceof mc9) && (q = N2.q((mc9) findFocus)) != null) {
                                pagetablecell = q.b;
                            }
                            if (pagetablecell != null) {
                                ye9Var.b2(N2);
                                if (N2.I.add(pagetablecell)) {
                                    N2.w.invalidate();
                                    N2.v();
                                }
                                ii9Var = N2;
                            }
                        }
                        if (ii9Var != null && ii9Var.getModel() != null && !ii9Var.I.isEmpty()) {
                            ye9Var.H4(ii9Var);
                            return;
                        } else {
                            ye9Var.N1(wi9.t(2, 2));
                            return;
                        }
                    }
                    cs5 cs5Var = e72Var.I;
                    if (cs5Var != null) {
                        cs5Var.u();
                    }
                    final cs5 G3 = cs5.G(e72Var, wjbVar, view);
                    G3.T = true;
                    if (M2 != null && M2.b()) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    G3.i(z8, 2131231071, null, k96.M0(2131753996, null), new v62(e72Var, M2, (byte) 1));
                    if (M2 != null && M2.b() && !M2.a() && !M2.c()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    G3.i(z9, 2131231568, null, k96.M0(2131754003, null), new v62(e72Var, M2, (byte) 2));
                    if (M2 != null && M2.b() && !M2.a() && M2.c()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G3.i(z10, 2131231580, null, k96.M0(2131754000, null), new v62(e72Var, M2, (byte) 3));
                    if (M2 != null && M2.b() && M2.a() && !M2.c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    G3.i(z11, 2131231601, null, k96.M0(2131753998, null), new v62(e72Var, M2, (byte) 4));
                    if (M2 != null && (M2.b instanceof TL_iv.pageBlockDetails)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    G3.i(z12, 2131231556, null, k96.M0(2131753984, null), new q62(ye9Var, (byte) 1));
                    boolean h2 = ye9Var.h2();
                    boolean k2 = ye9Var.k2();
                    if (h2 || k2) {
                        G3.j();
                        if (h2) {
                            G3.b(2131231569, k96.M0(2131754010, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r3;
                                    cs5 cs5Var2 = G3;
                                    e72 e72Var2 = e72Var;
                                    switch (b3) {
                                        case 0:
                                            e72Var2.r.n3(false);
                                            cs5Var2.u();
                                            return;
                                        default:
                                            e72Var2.r.n3(true);
                                            cs5Var2.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (k2) {
                            G3.b(2131231570, k96.M0(2131753995, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r3;
                                    cs5 cs5Var2 = G3;
                                    e72 e72Var2 = e72Var;
                                    switch (b3) {
                                        case 0:
                                            e72Var2.r.n3(false);
                                            cs5Var2.u();
                                            return;
                                        default:
                                            e72Var2.r.n3(true);
                                            cs5Var2.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    G3.X = true;
                    G3.a0();
                    e72Var.I = G3;
                    return;
                }
                int i7 = e72Var.n;
                cs5 cs5Var2 = e72Var.I;
                if (cs5Var2 != null) {
                    cs5Var2.u();
                }
                cs5 H = cs5.H(e72Var, wjbVar, view, true);
                H.T = true;
                cs5 K = H.K();
                if (!na7.q1(i7).v4() && !y6c.h(i7).p()) {
                    z = true;
                } else {
                    z = false;
                }
                K.b(2131231243, k96.M0(2131753753, null), new en1(H, (byte) 1), false);
                K.j();
                e72Var.P(K, M2, new TL_iv.pageBlockHeading1(), 2131231562, k96.M0(2131754027, null), gba.S0 + 2, H);
                e72Var.P(K, M2, new TL_iv.pageBlockHeading2(), 2131231563, k96.M0(2131754026, null), gba.S0 + 1, H);
                e72Var.P(K, M2, new TL_iv.pageBlockHeading3(), 2131231564, k96.M0(2131754025, null), gba.S0, H);
                e72Var.P(K, M2, new TL_iv.pageBlockHeading4(), 2131231565, k96.M0(2131754024, null), gba.S0 - 1, H);
                e72Var.P(K, M2, new TL_iv.pageBlockHeading5(), 2131231566, k96.M0(2131754023, null), gba.S0 - 2, H);
                e72Var.P(K, M2, new TL_iv.pageBlockHeading6(), 2131231567, k96.M0(2131754022, null), gba.S0 - 3, H);
                if (M2 != null && ye9.y3(M2.b)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fd9 fd9Var = new fd9(e72Var.getContext(), 2131231562);
                fd9Var.a(z);
                H.i(z2, 0, fd9Var, k96.M0(2131754028, null), new c10(H, K, (byte) 5));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                H.i(z3, 2131231599, null, k96.M0(2131753985, null), new v62(e72Var, M2, (byte) 5));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                H.i(z4, 2131231584, null, k96.M0(2131753993, null), new v62(e72Var, M2, (byte) 6));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                fd9 fd9Var2 = new fd9(e72Var.getContext(), 2131231583);
                fd9Var2.a(z);
                H.i(z5, 0, fd9Var2, k96.M0(2131753994, null), new v62(e72Var, M2, (byte) 7));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                H.i(z6, 2131231555, null, k96.M0(2131754052, null), new v62(e72Var, M2, (byte) 8));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockFooter)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                fd9 fd9Var3 = new fd9(e72Var.getContext(), 2131231558);
                fd9Var3.a(z);
                H.i(z7, 0, fd9Var3, k96.M0(2131754029, null), new v62(e72Var, M2, (byte) 9));
                H.a0();
                e72Var.I = H;
                return;
            default:
                final nfa nfaVar = (nfa) obj;
                kca kcaVar = nfaVar.a0;
                yea yeaVar = nfaVar.U;
                wjb wjbVar2 = nfaVar.I1;
                long j = nfaVar.m1;
                SparseArray[] sparseArrayArr = nfaVar.c1;
                d dVar = nfaVar.y1;
                if (b2 == 101) {
                    if (!nfa.j0(nfaVar.getSelectedTab()) && nfaVar.getSelectedTab() != 13) {
                        if (nfaVar.getSelectedTab() == 11) {
                            ArrayList arrayList6 = dVar.getMessagesController().D1().j;
                            final ArrayList arrayList7 = new ArrayList();
                            for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                                long j2 = ((up9) arrayList6.get(i8)).a;
                                if (yeaVar.x.contains(Long.valueOf(j2))) {
                                    arrayList7.add(Long.valueOf(j2));
                                }
                            }
                            if (!arrayList7.isEmpty()) {
                                Long l = (Long) arrayList7.get(0);
                                long longValue = l.longValue();
                                if (longValue == dVar.getUserConfig().e()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                int i9 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z14 = z15;
                                if (i9 < 0) {
                                    TLRPC.Chat K02 = dVar.getMessagesController().K0(Long.valueOf(-longValue));
                                    z14 = z15;
                                    if (K02 != null) {
                                        str = K02.title;
                                        z14 = z15;
                                    }
                                } else if (i9 >= 0) {
                                    TLRPC.User V1 = dVar.getMessagesController().V1(l);
                                    z14 = z15;
                                    if (V1 != null) {
                                        if (l7c.u(V1)) {
                                            str = k96.M0(2131754249, null);
                                            z14 = z15;
                                        } else {
                                            str = l7c.r(V1);
                                            z14 = z15;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, nfaVar.getContext());
                            if (arrayList7.size() == 1) {
                                if (z14) {
                                    i4 = 2131752069;
                                } else {
                                    i4 = 2131752065;
                                }
                                G = k96.a0(null, null, i4, str);
                            } else {
                                G = k96.G(arrayList7.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = G;
                            if (arrayList7.size() == 1) {
                                if (z14) {
                                    i3 = 2131752070;
                                } else {
                                    i3 = 2131752071;
                                }
                                G2 = k96.a0(null, null, i3, str);
                            } else {
                                G2 = k96.G(arrayList7.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            hdVar.U = G2;
                            alertDialog$Builder.j(k96.M0(2131746128, null), new ed() {
                                @Override
                                public final void u(hd hdVar2, int i10) {
                                    byte b3 = r3;
                                    ArrayList arrayList8 = arrayList7;
                                    nfa nfaVar2 = nfaVar;
                                    switch (b3) {
                                        case 0:
                                            d dVar2 = nfaVar2.y1;
                                            dVar2.getMessagesController().M1().r(arrayList8, nfaVar2.m1);
                                            u21.b0(dVar2).Q(2131624052, 36, k96.G(arrayList8.size(), "StoriesDeleted", new Object[0])).j();
                                            nfaVar2.E(false);
                                            return;
                                        default:
                                            for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                                                nfaVar2.y1.getMessagesController().e0(((Long) arrayList8.get(i11)).longValue(), 0, null);
                                            }
                                            nfaVar2.E(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            dVar.showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        }
                        if (cf3.B(j)) {
                            encryptedChat = dVar.getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L)));
                            user = null;
                            K0 = null;
                        } else if (cf3.D(j)) {
                            user = dVar.getMessagesController().V1(Long.valueOf(j));
                            K0 = null;
                            encryptedChat = null;
                        } else {
                            K0 = dVar.getMessagesController().K0(Long.valueOf(-j));
                            user = null;
                            encryptedChat = null;
                        }
                        ij.y(dVar, user, K0, encryptedChat, null, nfaVar.f1, null, nfaVar.c1, null, 0, 0, null, new oba(nfaVar, (byte) 14), null, nfaVar.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (nfaVar.l0() && kcaVar != null && kcaVar.getCurrentList() != null) {
                            s1b currentList = kcaVar.getCurrentList();
                            ArrayList arrayList8 = new ArrayList();
                            for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                                TL_stories.StoryItem storyItem = ((k27) sparseArrayArr[0].valueAt(i10)).l;
                                if (storyItem != null) {
                                    arrayList8.add(storyItem.media);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wjbVar2, nfaVar.getContext());
                                if (arrayList8.size() > 1) {
                                    i2 = 2131751548;
                                } else {
                                    i2 = 2131751552;
                                }
                                String M02 = k96.M0(i2, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.S = M02;
                                hdVar2.U = k96.G(arrayList8.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.j(k96.M0(2131751586, null), new io9(nfaVar, currentList, arrayList8));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), new ho9((byte) 15));
                                hdVar2.show();
                                hdVar2.h();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList9 = new ArrayList();
                        for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                            TL_stories.StoryItem storyItem2 = ((k27) sparseArrayArr[0].valueAt(i11)).l;
                            if (storyItem2 != null) {
                                arrayList9.add(storyItem2);
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wjbVar2, nfaVar.getContext());
                            if (arrayList9.size() > 1) {
                                i = 2131751477;
                            } else {
                                i = 2131751475;
                            }
                            String M03 = k96.M0(i, null);
                            hd hdVar3 = alertDialog$Builder3.a;
                            hdVar3.S = M03;
                            hdVar3.U = k96.G(arrayList9.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.j(k96.M0(2131751586, null), new ed() {
                                @Override
                                public final void u(hd hdVar22, int i102) {
                                    byte b3 = r3;
                                    ArrayList arrayList82 = arrayList9;
                                    nfa nfaVar2 = nfaVar;
                                    switch (b3) {
                                        case 0:
                                            d dVar2 = nfaVar2.y1;
                                            dVar2.getMessagesController().M1().r(arrayList82, nfaVar2.m1);
                                            u21.b0(dVar2).Q(2131624052, 36, k96.G(arrayList82.size(), "StoriesDeleted", new Object[0])).j();
                                            nfaVar2.E(false);
                                            return;
                                        default:
                                            for (int i112 = 0; i112 < arrayList82.size(); i112++) {
                                                nfaVar2.y1.getMessagesController().e0(((Long) arrayList82.get(i112)).longValue(), 0, null);
                                            }
                                            nfaVar2.E(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.g(k96.M0(2131752577, null), new ho9((byte) 16));
                            hdVar3.show();
                            hdVar3.h();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (b2 == 100) {
                    if (nfaVar.h1 != null) {
                        na7 messagesController = dVar.getMessagesController();
                        TLRPC.UserFull userFull = nfaVar.h1;
                        messagesController.getClass();
                        if (na7.K2(userFull)) {
                            je5 je5Var = nfaVar.H1;
                            if (je5Var != null) {
                                je5Var.t(k96.M0(2131750517, null));
                                nfaVar.H1.x(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (nfaVar.g1 != null) {
                        TLRPC.Chat K03 = dVar.getMessagesController().K0(Long.valueOf(nfaVar.g1.id));
                        if (dVar.getMessagesController().k2(K03)) {
                            je5 je5Var2 = nfaVar.H1;
                            if (je5Var2 != null) {
                                if (hc2.T(K03) && !K03.megagroup) {
                                    M0 = k96.M0(2131750519, null);
                                } else {
                                    M0 = k96.M0(2131750518, null);
                                }
                                je5Var2.t(M0);
                                nfaVar.H1.x(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (nfaVar.e0()) {
                        je5 je5Var3 = nfaVar.H1;
                        if (je5Var3 != null) {
                            je5Var3.t(k96.M0(2131750520, "ForwardsRestrictedInfoBot"));
                            nfaVar.H1.x(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    cj3 cj3Var = new cj3(bundle);
                    cj3Var.E2 = new qba(nfaVar);
                    dVar.presentFragment(cj3Var);
                    return;
                } else if (b2 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c = 0;
                        }
                        k27 k27Var = (k27) sparseArrayArr[c].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = k27.B0(k27Var.k);
                        if (cf3.B(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (cf3.D(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat K04 = dVar.getMessagesController().K0(Long.valueOf(-B0));
                            if (K04 != null && K04.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -K04.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", k27Var.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        mu1 mu1Var = new mu1(bundle2);
                        mu1Var.d8 = k27Var.e1();
                        long j3 = nfaVar.G;
                        if (j3 != 0) {
                            mm4.a(mu1Var, zc7.a(B0, j3));
                            bundle2.putInt("message_id", k27Var.e1());
                        }
                        dVar.presentFragment(mu1Var, false);
                        return;
                    }
                    return;
                } else if (b2 == 103 || b2 == 104) {
                    if (nfaVar.getClosestTab() == 8) {
                        xda xdaVar = nfaVar.f0;
                        if (xdaVar != null && xdaVar.s != null) {
                            ArrayList arrayList10 = new ArrayList();
                            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                                arrayList10.add(Integer.valueOf(((k27) sparseArrayArr[0].valueAt(i12)).e1()));
                            }
                            if (b2 != 103) {
                                z16 = false;
                            }
                            nfaVar.a1(arrayList10, z16);
                            nfaVar.E(false);
                            return;
                        }
                        return;
                    }
                    vp9 D1 = dVar.getMessagesController().D1();
                    ArrayList arrayList11 = D1.j;
                    ArrayList arrayList12 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                        long j4 = ((up9) arrayList11.get(i13)).a;
                        if (yeaVar.x.contains(Long.valueOf(j4))) {
                            arrayList12.add(Long.valueOf(j4));
                        }
                    }
                    if (b2 == 103) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!D1.m(arrayList12, z13, true)) {
                        dVar.showDialog(new h26(33, dVar.getCurrentAccount(), null, nfaVar.getContext(), dVar));
                    } else {
                        int i14 = 0;
                        while (true) {
                            iea[] ieaVarArr = nfaVar.n0;
                            if (i14 < ieaVarArr.length) {
                                iea ieaVar = ieaVarArr[i14];
                                if (ieaVar.F == 11) {
                                    ieaVar.x.g1(0, 0);
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    nfaVar.E(true);
                    return;
                } else {
                    return;
                }
        }
    }
}
