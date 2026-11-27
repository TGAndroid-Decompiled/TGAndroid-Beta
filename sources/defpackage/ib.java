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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
public final class ib implements View.OnClickListener {
    public final byte a;
    public final byte b;
    public final Object c;

    public ib(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onClick(View view) {
        pcc pccVar;
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
        xl9 O2;
        am9 q;
        boolean z13;
        String M0;
        int i;
        int i2;
        TLRPC.Chat M02;
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
                jb jbVar = (jb) obj;
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            jbVar.a2 = !jbVar.a2;
                        }
                    } else {
                        jbVar.Z1 = !jbVar.Z1;
                    }
                } else {
                    jbVar.Y1 = !jbVar.Y1;
                }
                jbVar.S1.O(true);
                jbVar.E0();
                return;
            case 1:
                View.OnClickListener onClickListener = ((fv1) obj).b[b2];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                w41 w41Var = ((vz1) obj).h;
                if (w41Var != null) {
                    w41Var.h(b2);
                    return;
                }
                return;
            case 3:
                ox5 ox5Var = (ox5) obj;
                ox5Var.R.dismiss();
                int i5 = ox5Var.d0;
                if (i5 >= 0) {
                    w51 w51Var = ox5Var.e0;
                    int[] iArr = w51Var.c;
                    if (!w51Var.b) {
                        w51Var.b = true;
                        for (int i6 = 0; i6 < 4; i6++) {
                            iArr[i6] = xea.q().getInt(uh9.k(i6, "keep_media_type_"), w51.b(i6));
                        }
                    }
                    iArr[i5] = b2;
                    xea.q().edit().putInt("keep_media_type_" + i5, b2).apply();
                    lx5 lx5Var = ox5Var.f0;
                    if (lx5Var != null) {
                        lx5Var.a(b2);
                        return;
                    }
                    return;
                }
                lx5 lx5Var2 = ox5Var.f0;
                if (lx5Var2 != null) {
                    lx5Var2.a(b2);
                    return;
                }
                return;
            case 4:
                b18 b18Var = (b18) obj;
                f08 f08Var = b18Var.E1;
                b18Var.T0 = b2;
                if (b2 == 1) {
                    b18Var.j0 = b18Var.h0;
                } else if (b2 == 4) {
                    b18Var.j0 = b18Var.i0;
                } else if (b2 == 2) {
                    b18Var.j0 = b18Var.f0;
                } else if (b2 == 3) {
                    b18Var.j0 = b18Var.g0;
                } else {
                    b18Var.j0 = b18Var.e0;
                }
                oy9 oy9Var = (oy9) view.getTag();
                PhotoViewer.q0().T1(null, b18Var, null);
                if (b2 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b18Var.k1);
                    PhotoViewer.q0().j1(arrayList, 0, f08Var);
                    return;
                } else if (b2 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(b18Var.m1);
                    PhotoViewer.q0().j1(arrayList2, 0, f08Var);
                    return;
                } else if (b2 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(b18Var.n1);
                    PhotoViewer.q0().j1(arrayList3, 0, f08Var);
                    return;
                } else if (b2 == 0) {
                    PhotoViewer q0 = PhotoViewer.q0();
                    ArrayList arrayList4 = b18Var.j1;
                    q0.j1(arrayList4, arrayList4.indexOf(oy9Var), f08Var);
                    return;
                } else {
                    PhotoViewer q02 = PhotoViewer.q0();
                    ArrayList arrayList5 = b18Var.l1;
                    q02.j1(arrayList5, arrayList5.indexOf(oy9Var), f08Var);
                    return;
                }
            case 5:
                im8 im8Var = ((gm8) obj).b;
                if (im8Var.r && (pccVar = im8Var.f) != null) {
                    pccVar.a(Integer.valueOf(b2));
                    return;
                }
                return;
            case 6:
                final v72 v72Var = ((ui9) obj).a.a;
                vnb vnbVar = v72Var.a;
                pi9 pi9Var = v72Var.r;
                mk0 N2 = pi9Var.N2();
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 4) {
                            if (b2 != 7) {
                                if (b2 == 9) {
                                    pi9Var.q3();
                                    return;
                                }
                                return;
                            }
                            if (N2 != null) {
                                TL_iv.PageBlock pageBlock = N2.b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = v72Var.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            }
                            v72.W(context, str, new rx1(v72Var, pageblockmath, (byte) 6), vnbVar);
                            return;
                        }
                        xl9 xl9Var = pi9Var.q4;
                        if (xl9Var == null && (O2 = pi9Var.O2()) != null && O2.getModel() != null) {
                            View findFocus = pi9Var.findFocus();
                            if ((findFocus instanceof dg9) && (q = O2.q((dg9) findFocus)) != null) {
                                pagetablecell = q.b;
                            }
                            if (pagetablecell != null) {
                                pi9Var.c2(O2);
                                if (O2.I.add(pagetablecell)) {
                                    O2.w.invalidate();
                                    O2.v();
                                }
                                xl9Var = O2;
                            }
                        }
                        if (xl9Var != null && xl9Var.getModel() != null && !xl9Var.I.isEmpty()) {
                            pi9Var.I4(xl9Var);
                            return;
                        } else {
                            pi9Var.O1(km9.t(2, 2));
                            return;
                        }
                    }
                    fu5 fu5Var = v72Var.I;
                    if (fu5Var != null) {
                        fu5Var.u();
                    }
                    final fu5 G3 = fu5.G(v72Var, vnbVar, view);
                    G3.W = true;
                    if (N2 != null && N2.b()) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    G3.i(z8, 2131231071, null, ob6.M0(2131753992, null), new g72(v72Var, N2, (byte) 1));
                    if (N2 != null && N2.b() && !N2.a() && !N2.c()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    G3.i(z9, 2131231568, null, ob6.M0(2131753999, null), new g72(v72Var, N2, (byte) 2));
                    if (N2 != null && N2.b() && !N2.a() && N2.c()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G3.i(z10, 2131231580, null, ob6.M0(2131753996, null), new g72(v72Var, N2, (byte) 3));
                    if (N2 != null && N2.b() && N2.a() && !N2.c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    G3.i(z11, 2131231601, null, ob6.M0(2131753994, null), new g72(v72Var, N2, (byte) 4));
                    if (N2 != null && (N2.b instanceof TL_iv.pageBlockDetails)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    G3.i(z12, 2131231556, null, ob6.M0(2131753980, null), new m72(pi9Var, (byte) 1));
                    boolean i22 = pi9Var.i2();
                    boolean l2 = pi9Var.l2();
                    if (i22 || l2) {
                        G3.j();
                        if (i22) {
                            G3.b(2131231569, ob6.M0(2131754006, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r3;
                                    fu5 fu5Var2 = G3;
                                    v72 v72Var2 = v72Var;
                                    switch (b3) {
                                        case 0:
                                            v72Var2.r.o3(false);
                                            fu5Var2.u();
                                            return;
                                        default:
                                            v72Var2.r.o3(true);
                                            fu5Var2.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (l2) {
                            G3.b(2131231570, ob6.M0(2131753991, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r3;
                                    fu5 fu5Var2 = G3;
                                    v72 v72Var2 = v72Var;
                                    switch (b3) {
                                        case 0:
                                            v72Var2.r.o3(false);
                                            fu5Var2.u();
                                            return;
                                        default:
                                            v72Var2.r.o3(true);
                                            fu5Var2.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    G3.a0 = true;
                    G3.a0();
                    v72Var.I = G3;
                    return;
                }
                int i7 = v72Var.n;
                fu5 fu5Var2 = v72Var.I;
                if (fu5Var2 != null) {
                    fu5Var2.u();
                }
                fu5 H = fu5.H(v72Var, vnbVar, view, true);
                H.W = true;
                fu5 K = H.K();
                if (!uc7.s1(i7).D4() && !yac.h(i7).p()) {
                    z = true;
                } else {
                    z = false;
                }
                K.b(2131231243, ob6.M0(2131753749, null), new vn1(H, (byte) 1), false);
                K.j();
                v72Var.O(K, N2, new TL_iv.pageBlockHeading1(), 2131231562, ob6.M0(2131754023, null), xea.S0 + 2, H);
                v72Var.O(K, N2, new TL_iv.pageBlockHeading2(), 2131231563, ob6.M0(2131754022, null), xea.S0 + 1, H);
                v72Var.O(K, N2, new TL_iv.pageBlockHeading3(), 2131231564, ob6.M0(2131754021, null), xea.S0, H);
                v72Var.O(K, N2, new TL_iv.pageBlockHeading4(), 2131231565, ob6.M0(2131754020, null), xea.S0 - 1, H);
                v72Var.O(K, N2, new TL_iv.pageBlockHeading5(), 2131231566, ob6.M0(2131754019, null), xea.S0 - 2, H);
                v72Var.O(K, N2, new TL_iv.pageBlockHeading6(), 2131231567, ob6.M0(2131754018, null), xea.S0 - 3, H);
                if (N2 != null && pi9.z3(N2.b)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wg9 wg9Var = new wg9(v72Var.getContext(), 2131231562);
                wg9Var.a(z);
                H.i(z2, 0, wg9Var, ob6.M0(2131754024, null), new c10(H, K, (byte) 5));
                if (N2 != null && (N2.b instanceof TL_iv.pageBlockParagraph)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                H.i(z3, 2131231599, null, ob6.M0(2131753981, null), new g72(v72Var, N2, (byte) 5));
                if (N2 != null && (N2.b instanceof TL_iv.pageBlockBlockquote)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                H.i(z4, 2131231584, null, ob6.M0(2131753989, null), new g72(v72Var, N2, (byte) 6));
                if (N2 != null && (N2.b instanceof TL_iv.pageBlockPullquote)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                wg9 wg9Var2 = new wg9(v72Var.getContext(), 2131231583);
                wg9Var2.a(z);
                H.i(z5, 0, wg9Var2, ob6.M0(2131753990, null), new g72(v72Var, N2, (byte) 7));
                if (N2 != null && (N2.b instanceof TL_iv.pageBlockPreformatted)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                H.i(z6, 2131231555, null, ob6.M0(2131754048, null), new g72(v72Var, N2, (byte) 8));
                if (N2 != null && (N2.b instanceof TL_iv.pageBlockFooter)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                wg9 wg9Var3 = new wg9(v72Var.getContext(), 2131231558);
                wg9Var3.a(z);
                H.i(z7, 0, wg9Var3, ob6.M0(2131754025, null), new g72(v72Var, N2, (byte) 9));
                H.a0();
                v72Var.I = H;
                return;
            default:
                final eja ejaVar = (eja) obj;
                bga bgaVar = ejaVar.a0;
                pia piaVar = ejaVar.U;
                vnb vnbVar2 = ejaVar.I1;
                long j = ejaVar.m1;
                SparseArray[] sparseArrayArr = ejaVar.c1;
                e eVar = ejaVar.y1;
                if (b2 == 101) {
                    if (!eja.j0(ejaVar.getSelectedTab()) && ejaVar.getSelectedTab() != 13) {
                        if (ejaVar.getSelectedTab() == 11) {
                            ArrayList arrayList6 = eVar.getMessagesController().F1().j;
                            final ArrayList arrayList7 = new ArrayList();
                            for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                                long j2 = ((mt9) arrayList6.get(i8)).a;
                                if (piaVar.x.contains(Long.valueOf(j2))) {
                                    arrayList7.add(Long.valueOf(j2));
                                }
                            }
                            if (!arrayList7.isEmpty()) {
                                Long l = (Long) arrayList7.get(0);
                                long longValue = l.longValue();
                                if (longValue == eVar.getUserConfig().e()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                int i9 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z14 = z15;
                                if (i9 < 0) {
                                    TLRPC.Chat M03 = eVar.getMessagesController().M0(Long.valueOf(-longValue));
                                    z14 = z15;
                                    if (M03 != null) {
                                        str = M03.title;
                                        z14 = z15;
                                    }
                                } else if (i9 >= 0) {
                                    TLRPC.User X1 = eVar.getMessagesController().X1(l);
                                    z14 = z15;
                                    if (X1 != null) {
                                        if (lbc.u(X1)) {
                                            str = ob6.M0(2131754245, null);
                                            z14 = z15;
                                        } else {
                                            str = lbc.r(X1);
                                            z14 = z15;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, ejaVar.getContext());
                            if (arrayList7.size() == 1) {
                                if (z14) {
                                    i4 = 2131752046;
                                } else {
                                    i4 = 2131752042;
                                }
                                G = ob6.a0(null, null, i4, str);
                            } else {
                                G = ob6.G(arrayList7.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            id idVar = alertDialog$Builder.a;
                            idVar.S = G;
                            if (arrayList7.size() == 1) {
                                if (z14) {
                                    i3 = 2131752047;
                                } else {
                                    i3 = 2131752048;
                                }
                                G2 = ob6.a0(null, null, i3, str);
                            } else {
                                G2 = ob6.G(arrayList7.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            idVar.U = G2;
                            alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() {
                                @Override
                                public final void w(id idVar2, int i10) {
                                    byte b3 = r3;
                                    ArrayList arrayList8 = arrayList7;
                                    eja ejaVar2 = ejaVar;
                                    switch (b3) {
                                        case 0:
                                            e eVar2 = ejaVar2.y1;
                                            eVar2.getMessagesController().O1().r(arrayList8, ejaVar2.m1);
                                            d31.b0(eVar2).Q(2131624052, 36, ob6.G(arrayList8.size(), "StoriesDeleted", new Object[0])).j();
                                            ejaVar2.E(false);
                                            return;
                                        default:
                                            for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                                                ejaVar2.y1.getMessagesController().g0(((Long) arrayList8.get(i11)).longValue(), 0, null);
                                            }
                                            ejaVar2.E(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            eVar.showDialog(idVar);
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                return;
                            }
                            return;
                        }
                        if (wf3.B(j)) {
                            encryptedChat = eVar.getMessagesController().a1(Integer.valueOf((int) (j & 4294967295L)));
                            user = null;
                            M02 = null;
                        } else if (wf3.D(j)) {
                            user = eVar.getMessagesController().X1(Long.valueOf(j));
                            M02 = null;
                            encryptedChat = null;
                        } else {
                            M02 = eVar.getMessagesController().M0(Long.valueOf(-j));
                            user = null;
                            encryptedChat = null;
                        }
                        jj.y(eVar, user, M02, encryptedChat, null, ejaVar.f1, null, ejaVar.c1, null, 0, 0, null, new gfa(ejaVar, (byte) 13), null, ejaVar.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (ejaVar.l0() && bgaVar != null && bgaVar.getCurrentList() != null) {
                            p5b currentList = bgaVar.getCurrentList();
                            ArrayList arrayList8 = new ArrayList();
                            for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                                TL_stories.StoryItem storyItem = ((r47) sparseArrayArr[0].valueAt(i10)).l;
                                if (storyItem != null) {
                                    arrayList8.add(storyItem.media);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar2, ejaVar.getContext());
                                if (arrayList8.size() > 1) {
                                    i2 = 2131751525;
                                } else {
                                    i2 = 2131751529;
                                }
                                String M04 = ob6.M0(i2, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M04;
                                idVar2.U = ob6.G(arrayList8.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.j(ob6.M0(2131751563, null), new o48(ejaVar, currentList, arrayList8, (byte) 13));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), new vr9((byte) 17));
                                idVar2.show();
                                idVar2.h();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList9 = new ArrayList();
                        for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                            TL_stories.StoryItem storyItem2 = ((r47) sparseArrayArr[0].valueAt(i11)).l;
                            if (storyItem2 != null) {
                                arrayList9.add(storyItem2);
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vnbVar2, ejaVar.getContext());
                            if (arrayList9.size() > 1) {
                                i = 2131751454;
                            } else {
                                i = 2131751452;
                            }
                            String M05 = ob6.M0(i, null);
                            id idVar3 = alertDialog$Builder3.a;
                            idVar3.S = M05;
                            idVar3.U = ob6.G(arrayList9.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.j(ob6.M0(2131751563, null), new fd() {
                                @Override
                                public final void w(id idVar22, int i102) {
                                    byte b3 = r3;
                                    ArrayList arrayList82 = arrayList9;
                                    eja ejaVar2 = ejaVar;
                                    switch (b3) {
                                        case 0:
                                            e eVar2 = ejaVar2.y1;
                                            eVar2.getMessagesController().O1().r(arrayList82, ejaVar2.m1);
                                            d31.b0(eVar2).Q(2131624052, 36, ob6.G(arrayList82.size(), "StoriesDeleted", new Object[0])).j();
                                            ejaVar2.E(false);
                                            return;
                                        default:
                                            for (int i112 = 0; i112 < arrayList82.size(); i112++) {
                                                ejaVar2.y1.getMessagesController().g0(((Long) arrayList82.get(i112)).longValue(), 0, null);
                                            }
                                            ejaVar2.E(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.g(ob6.M0(2131752570, null), new vr9((byte) 18));
                            idVar3.show();
                            idVar3.h();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (b2 == 100) {
                    if (ejaVar.h1 != null) {
                        uc7 messagesController = eVar.getMessagesController();
                        TLRPC.UserFull userFull = ejaVar.h1;
                        messagesController.getClass();
                        if (uc7.Q2(userFull)) {
                            kg5 kg5Var = ejaVar.H1;
                            if (kg5Var != null) {
                                kg5Var.t(ob6.M0(2131750494, null));
                                ejaVar.H1.x(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (ejaVar.g1 != null) {
                        TLRPC.Chat M06 = eVar.getMessagesController().M0(Long.valueOf(ejaVar.g1.id));
                        if (eVar.getMessagesController().m2(M06)) {
                            kg5 kg5Var2 = ejaVar.H1;
                            if (kg5Var2 != null) {
                                if (xc2.T(M06) && !M06.megagroup) {
                                    M0 = ob6.M0(2131750496, null);
                                } else {
                                    M0 = ob6.M0(2131750495, null);
                                }
                                kg5Var2.t(M0);
                                ejaVar.H1.x(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (ejaVar.e0()) {
                        kg5 kg5Var3 = ejaVar.H1;
                        if (kg5Var3 != null) {
                            kg5Var3.t(ob6.M0(2131750497, "ForwardsRestrictedInfoBot"));
                            ejaVar.H1.x(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    uj3 uj3Var = new uj3(bundle);
                    uj3Var.E2 = new hfa(ejaVar);
                    eVar.presentFragment(uj3Var);
                    return;
                } else if (b2 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c = 0;
                        }
                        r47 r47Var = (r47) sparseArrayArr[c].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = r47.B0(r47Var.k);
                        if (wf3.B(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (wf3.D(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat M07 = eVar.getMessagesController().M0(Long.valueOf(-B0));
                            if (M07 != null && M07.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -M07.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", r47Var.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        zu1 zu1Var = new zu1(bundle2);
                        zu1Var.d8 = r47Var.e1();
                        long j3 = ejaVar.G;
                        if (j3 != 0) {
                            ro4.a(zu1Var, jf7.a(B0, j3));
                            bundle2.putInt("message_id", r47Var.e1());
                        }
                        eVar.presentFragment(zu1Var, false);
                        return;
                    }
                    return;
                } else if (b2 == 103 || b2 == 104) {
                    if (ejaVar.getClosestTab() == 8) {
                        oha ohaVar = ejaVar.f0;
                        if (ohaVar != null && ohaVar.s != null) {
                            ArrayList arrayList10 = new ArrayList();
                            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                                arrayList10.add(Integer.valueOf(((r47) sparseArrayArr[0].valueAt(i12)).e1()));
                            }
                            if (b2 != 103) {
                                z16 = false;
                            }
                            ejaVar.a1(arrayList10, z16);
                            ejaVar.E(false);
                            return;
                        }
                        return;
                    }
                    nt9 F1 = eVar.getMessagesController().F1();
                    ArrayList arrayList11 = F1.j;
                    ArrayList arrayList12 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                        long j4 = ((mt9) arrayList11.get(i13)).a;
                        if (piaVar.x.contains(Long.valueOf(j4))) {
                            arrayList12.add(Long.valueOf(j4));
                        }
                    }
                    if (b2 == 103) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!F1.m(arrayList12, z13, true)) {
                        eVar.showDialog(new l46(33, eVar.getCurrentAccount(), null, ejaVar.getContext(), eVar));
                    } else {
                        int i14 = 0;
                        while (true) {
                            zha[] zhaVarArr = ejaVar.n0;
                            if (i14 < zhaVarArr.length) {
                                zha zhaVar = zhaVarArr[i14];
                                if (zhaVar.F == 11) {
                                    zhaVar.x.g1(0, 0);
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    ejaVar.E(true);
                    return;
                } else {
                    return;
                }
        }
    }
}
