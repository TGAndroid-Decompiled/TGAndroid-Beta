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
        qac qacVar;
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
        kk9 N2;
        nk9 q;
        boolean z13;
        String M0;
        int i;
        int i2;
        TLRPC.Chat L0;
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
                View.OnClickListener onClickListener = ((ew1) obj).b[b2];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                v51 v51Var = ((q02) obj).h;
                if (v51Var != null) {
                    v51Var.h(b2);
                    return;
                }
                return;
            case 3:
                jx5 jx5Var = (jx5) obj;
                jx5Var.R.dismiss();
                int i5 = jx5Var.d0;
                if (i5 >= 0) {
                    v61 v61Var = jx5Var.e0;
                    int[] iArr = v61Var.c;
                    if (!v61Var.b) {
                        v61Var.b = true;
                        for (int i6 = 0; i6 < 4; i6++) {
                            iArr[i6] = gda.q().getInt(hg9.j(i6, "keep_media_type_"), v61.b(i6));
                        }
                    }
                    iArr[i5] = b2;
                    gda.q().edit().putInt("keep_media_type_" + i5, b2).apply();
                    gx5 gx5Var = jx5Var.f0;
                    if (gx5Var != null) {
                        gx5Var.a(b2);
                        return;
                    }
                    return;
                }
                gx5 gx5Var2 = jx5Var.f0;
                if (gx5Var2 != null) {
                    gx5Var2.a(b2);
                    return;
                }
                return;
            case 4:
                xz7 xz7Var = (xz7) obj;
                az7 az7Var = xz7Var.E1;
                xz7Var.T0 = b2;
                if (b2 == 1) {
                    xz7Var.j0 = xz7Var.h0;
                } else if (b2 == 4) {
                    xz7Var.j0 = xz7Var.i0;
                } else if (b2 == 2) {
                    xz7Var.j0 = xz7Var.f0;
                } else if (b2 == 3) {
                    xz7Var.j0 = xz7Var.g0;
                } else {
                    xz7Var.j0 = xz7Var.e0;
                }
                xw9 xw9Var = (xw9) view.getTag();
                PhotoViewer.r0().T1(null, xz7Var, null);
                if (b2 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xz7Var.k1);
                    PhotoViewer.r0().j1(arrayList, 0, az7Var);
                    return;
                } else if (b2 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(xz7Var.m1);
                    PhotoViewer.r0().j1(arrayList2, 0, az7Var);
                    return;
                } else if (b2 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(xz7Var.n1);
                    PhotoViewer.r0().j1(arrayList3, 0, az7Var);
                    return;
                } else if (b2 == 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    ArrayList arrayList4 = xz7Var.j1;
                    r0.j1(arrayList4, arrayList4.indexOf(xw9Var), az7Var);
                    return;
                } else {
                    PhotoViewer r02 = PhotoViewer.r0();
                    ArrayList arrayList5 = xz7Var.l1;
                    r02.j1(arrayList5, arrayList5.indexOf(xw9Var), az7Var);
                    return;
                }
            case 5:
                yk8 yk8Var = ((vk8) obj).b;
                if (yk8Var.r && (qacVar = yk8Var.f) != null) {
                    qacVar.a(Integer.valueOf(b2));
                    return;
                }
                return;
            case 6:
                final p82 p82Var = ((hh9) obj).a.a;
                ylb ylbVar = p82Var.a;
                ch9 ch9Var = p82Var.r;
                ll0 M2 = ch9Var.M2();
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 4) {
                            if (b2 != 7) {
                                if (b2 == 9) {
                                    ch9Var.p3();
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
                            Context context = p82Var.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            }
                            p82.X(context, str, new qy1(p82Var, pageblockmath, (byte) 6), ylbVar);
                            return;
                        }
                        kk9 kk9Var = ch9Var.q4;
                        if (kk9Var == null && (N2 = ch9Var.N2()) != null && N2.getModel() != null) {
                            View findFocus = ch9Var.findFocus();
                            if ((findFocus instanceof ne9) && (q = N2.q((ne9) findFocus)) != null) {
                                pagetablecell = q.b;
                            }
                            if (pagetablecell != null) {
                                ch9Var.b2(N2);
                                if (N2.I.add(pagetablecell)) {
                                    N2.w.invalidate();
                                    N2.v();
                                }
                                kk9Var = N2;
                            }
                        }
                        if (kk9Var != null && kk9Var.getModel() != null && !kk9Var.I.isEmpty()) {
                            ch9Var.H4(kk9Var);
                            return;
                        } else {
                            ch9Var.N1(xk9.t(2, 2));
                            return;
                        }
                    }
                    bu5 bu5Var = p82Var.I;
                    if (bu5Var != null) {
                        bu5Var.u();
                    }
                    final bu5 G3 = bu5.G(p82Var, ylbVar, view);
                    G3.T = true;
                    if (M2 != null && M2.b()) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    G3.i(z8, 2131231072, null, jb6.M0(2131753964, null), new g82(p82Var, M2, (byte) 1));
                    if (M2 != null && M2.b() && !M2.a() && !M2.c()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    G3.i(z9, 2131231569, null, jb6.M0(2131753971, null), new g82(p82Var, M2, (byte) 2));
                    if (M2 != null && M2.b() && !M2.a() && M2.c()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G3.i(z10, 2131231581, null, jb6.M0(2131753968, null), new g82(p82Var, M2, (byte) 3));
                    if (M2 != null && M2.b() && M2.a() && !M2.c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    G3.i(z11, 2131231602, null, jb6.M0(2131753966, null), new g82(p82Var, M2, (byte) 4));
                    if (M2 != null && (M2.b instanceof TL_iv.pageBlockDetails)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    G3.i(z12, 2131231557, null, jb6.M0(2131753952, null), new b82(ch9Var, (byte) 1));
                    boolean h2 = ch9Var.h2();
                    boolean k2 = ch9Var.k2();
                    if (h2 || k2) {
                        G3.j();
                        if (h2) {
                            G3.b(2131231570, jb6.M0(2131753978, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r3;
                                    bu5 bu5Var2 = G3;
                                    p82 p82Var2 = p82Var;
                                    switch (b3) {
                                        case 0:
                                            p82Var2.r.n3(false);
                                            bu5Var2.u();
                                            return;
                                        default:
                                            p82Var2.r.n3(true);
                                            bu5Var2.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (k2) {
                            G3.b(2131231571, jb6.M0(2131753963, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b3 = r3;
                                    bu5 bu5Var2 = G3;
                                    p82 p82Var2 = p82Var;
                                    switch (b3) {
                                        case 0:
                                            p82Var2.r.n3(false);
                                            bu5Var2.u();
                                            return;
                                        default:
                                            p82Var2.r.n3(true);
                                            bu5Var2.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    G3.X = true;
                    G3.a0();
                    p82Var.I = G3;
                    return;
                }
                int i7 = p82Var.n;
                bu5 bu5Var2 = p82Var.I;
                if (bu5Var2 != null) {
                    bu5Var2.u();
                }
                bu5 H = bu5.H(p82Var, ylbVar, view, true);
                H.T = true;
                bu5 K = H.K();
                if (!oc7.r1(i7).x4() && !z8c.h(i7).p()) {
                    z = true;
                } else {
                    z = false;
                }
                K.b(2131231244, jb6.M0(2131753721, null), new bo1(H, (byte) 1), false);
                K.j();
                p82Var.O(K, M2, new TL_iv.pageBlockHeading1(), 2131231563, jb6.M0(2131753995, null), gda.S0 + 2, H);
                p82Var.O(K, M2, new TL_iv.pageBlockHeading2(), 2131231564, jb6.M0(2131753994, null), gda.S0 + 1, H);
                p82Var.O(K, M2, new TL_iv.pageBlockHeading3(), 2131231565, jb6.M0(2131753993, null), gda.S0, H);
                p82Var.O(K, M2, new TL_iv.pageBlockHeading4(), 2131231566, jb6.M0(2131753992, null), gda.S0 - 1, H);
                p82Var.O(K, M2, new TL_iv.pageBlockHeading5(), 2131231567, jb6.M0(2131753991, null), gda.S0 - 2, H);
                p82Var.O(K, M2, new TL_iv.pageBlockHeading6(), 2131231568, jb6.M0(2131753990, null), gda.S0 - 3, H);
                if (M2 != null && ch9.y3(M2.b)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hf9 hf9Var = new hf9(p82Var.getContext(), 2131231563);
                hf9Var.a(z);
                H.i(z2, 0, hf9Var, jb6.M0(2131753996, null), new c20(H, K, (byte) 5));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                H.i(z3, 2131231600, null, jb6.M0(2131753953, null), new g82(p82Var, M2, (byte) 5));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                H.i(z4, 2131231585, null, jb6.M0(2131753961, null), new g82(p82Var, M2, (byte) 6));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                hf9 hf9Var2 = new hf9(p82Var.getContext(), 2131231584);
                hf9Var2.a(z);
                H.i(z5, 0, hf9Var2, jb6.M0(2131753962, null), new g82(p82Var, M2, (byte) 7));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                H.i(z6, 2131231556, null, jb6.M0(2131754020, null), new g82(p82Var, M2, (byte) 8));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockFooter)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                hf9 hf9Var3 = new hf9(p82Var.getContext(), 2131231559);
                hf9Var3.a(z);
                H.i(z7, 0, hf9Var3, jb6.M0(2131753997, null), new g82(p82Var, M2, (byte) 9));
                H.a0();
                p82Var.I = H;
                return;
            default:
                final nha nhaVar = (nha) obj;
                kea keaVar = nhaVar.a0;
                yga ygaVar = nhaVar.U;
                ylb ylbVar2 = nhaVar.I1;
                long j = nhaVar.m1;
                SparseArray[] sparseArrayArr = nhaVar.c1;
                d dVar = nhaVar.y1;
                if (b2 == 101) {
                    if (!nha.j0(nhaVar.getSelectedTab()) && nhaVar.getSelectedTab() != 13) {
                        if (nhaVar.getSelectedTab() == 11) {
                            ArrayList arrayList6 = dVar.getMessagesController().E1().j;
                            final ArrayList arrayList7 = new ArrayList();
                            for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                                long j2 = ((vr9) arrayList6.get(i8)).a;
                                if (ygaVar.x.contains(Long.valueOf(j2))) {
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
                                    TLRPC.Chat L02 = dVar.getMessagesController().L0(Long.valueOf(-longValue));
                                    z14 = z15;
                                    if (L02 != null) {
                                        str = L02.title;
                                        z14 = z15;
                                    }
                                } else if (i9 >= 0) {
                                    TLRPC.User W1 = dVar.getMessagesController().W1(l);
                                    z14 = z15;
                                    if (W1 != null) {
                                        if (m9c.u(W1)) {
                                            str = jb6.M0(2131754217, null);
                                            z14 = z15;
                                        } else {
                                            str = m9c.r(W1);
                                            z14 = z15;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, nhaVar.getContext());
                            if (arrayList7.size() == 1) {
                                if (z14) {
                                    i4 = 2131752018;
                                } else {
                                    i4 = 2131752014;
                                }
                                G = jb6.a0(null, null, i4, str);
                            } else {
                                G = jb6.G(arrayList7.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            he heVar = alertDialog$Builder.a;
                            heVar.S = G;
                            if (arrayList7.size() == 1) {
                                if (z14) {
                                    i3 = 2131752019;
                                } else {
                                    i3 = 2131752020;
                                }
                                G2 = jb6.a0(null, null, i3, str);
                            } else {
                                G2 = jb6.G(arrayList7.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            heVar.U = G2;
                            alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() {
                                @Override
                                public final void r(he heVar2, int i10) {
                                    byte b3 = r3;
                                    ArrayList arrayList8 = arrayList7;
                                    nha nhaVar2 = nhaVar;
                                    switch (b3) {
                                        case 0:
                                            d dVar2 = nhaVar2.y1;
                                            dVar2.getMessagesController().N1().r(arrayList8, nhaVar2.m1);
                                            c41.b0(dVar2).Q(2131624052, 36, jb6.G(arrayList8.size(), "StoriesDeleted", new Object[0])).j();
                                            nhaVar2.E(false);
                                            return;
                                        default:
                                            for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                                                nhaVar2.y1.getMessagesController().e0(((Long) arrayList8.get(i11)).longValue(), 0, null);
                                            }
                                            nhaVar2.E(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            dVar.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                return;
                            }
                            return;
                        }
                        if (pg3.B(j)) {
                            encryptedChat = dVar.getMessagesController().Z0(Integer.valueOf((int) (j & 4294967295L)));
                            user = null;
                            L0 = null;
                        } else if (pg3.D(j)) {
                            user = dVar.getMessagesController().W1(Long.valueOf(j));
                            L0 = null;
                            encryptedChat = null;
                        } else {
                            L0 = dVar.getMessagesController().L0(Long.valueOf(-j));
                            user = null;
                            encryptedChat = null;
                        }
                        ik.y(dVar, user, L0, encryptedChat, null, nhaVar.f1, null, nhaVar.c1, null, 0, 0, null, new oda(nhaVar, (byte) 14), null, nhaVar.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (nhaVar.l0() && keaVar != null && keaVar.getCurrentList() != null) {
                            t3b currentList = keaVar.getCurrentList();
                            ArrayList arrayList8 = new ArrayList();
                            for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                                TL_stories.StoryItem storyItem = ((k47) sparseArrayArr[0].valueAt(i10)).l;
                                if (storyItem != null) {
                                    arrayList8.add(storyItem.media);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ylbVar2, nhaVar.getContext());
                                if (arrayList8.size() > 1) {
                                    i2 = 2131751497;
                                } else {
                                    i2 = 2131751501;
                                }
                                String M02 = jb6.M0(i2, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.S = M02;
                                heVar2.U = jb6.G(arrayList8.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.j(jb6.M0(2131751535, null), new jq9(nhaVar, currentList, arrayList8));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), new dq9((byte) 16));
                                heVar2.show();
                                heVar2.h();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList9 = new ArrayList();
                        for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                            TL_stories.StoryItem storyItem2 = ((k47) sparseArrayArr[0].valueAt(i11)).l;
                            if (storyItem2 != null) {
                                arrayList9.add(storyItem2);
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ylbVar2, nhaVar.getContext());
                            if (arrayList9.size() > 1) {
                                i = 2131751426;
                            } else {
                                i = 2131751424;
                            }
                            String M03 = jb6.M0(i, null);
                            he heVar3 = alertDialog$Builder3.a;
                            heVar3.S = M03;
                            heVar3.U = jb6.G(arrayList9.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.j(jb6.M0(2131751535, null), new ee() {
                                @Override
                                public final void r(he heVar22, int i102) {
                                    byte b3 = r3;
                                    ArrayList arrayList82 = arrayList9;
                                    nha nhaVar2 = nhaVar;
                                    switch (b3) {
                                        case 0:
                                            d dVar2 = nhaVar2.y1;
                                            dVar2.getMessagesController().N1().r(arrayList82, nhaVar2.m1);
                                            c41.b0(dVar2).Q(2131624052, 36, jb6.G(arrayList82.size(), "StoriesDeleted", new Object[0])).j();
                                            nhaVar2.E(false);
                                            return;
                                        default:
                                            for (int i112 = 0; i112 < arrayList82.size(); i112++) {
                                                nhaVar2.y1.getMessagesController().e0(((Long) arrayList82.get(i112)).longValue(), 0, null);
                                            }
                                            nhaVar2.E(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.g(jb6.M0(2131752542, null), new dq9((byte) 17));
                            heVar3.show();
                            heVar3.h();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (b2 == 100) {
                    if (nhaVar.h1 != null) {
                        oc7 messagesController = dVar.getMessagesController();
                        TLRPC.UserFull userFull = nhaVar.h1;
                        messagesController.getClass();
                        if (oc7.M2(userFull)) {
                            hg5 hg5Var = nhaVar.H1;
                            if (hg5Var != null) {
                                hg5Var.t(jb6.M0(2131750466, null));
                                nhaVar.H1.x(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (nhaVar.g1 != null) {
                        TLRPC.Chat L03 = dVar.getMessagesController().L0(Long.valueOf(nhaVar.g1.id));
                        if (dVar.getMessagesController().l2(L03)) {
                            hg5 hg5Var2 = nhaVar.H1;
                            if (hg5Var2 != null) {
                                if (sd2.T(L03) && !L03.megagroup) {
                                    M0 = jb6.M0(2131750468, null);
                                } else {
                                    M0 = jb6.M0(2131750467, null);
                                }
                                hg5Var2.t(M0);
                                nhaVar.H1.x(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (nhaVar.e0()) {
                        hg5 hg5Var3 = nhaVar.H1;
                        if (hg5Var3 != null) {
                            hg5Var3.t(jb6.M0(2131750469, "ForwardsRestrictedInfoBot"));
                            nhaVar.H1.x(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    nk3 nk3Var = new nk3(bundle);
                    nk3Var.E2 = new qda(nhaVar);
                    dVar.presentFragment(nk3Var);
                    return;
                } else if (b2 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c = 0;
                        }
                        k47 k47Var = (k47) sparseArrayArr[c].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = k47.B0(k47Var.k);
                        if (pg3.B(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (pg3.D(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat L04 = dVar.getMessagesController().L0(Long.valueOf(-B0));
                            if (L04 != null && L04.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -L04.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", k47Var.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        yv1 yv1Var = new yv1(bundle2);
                        yv1Var.d8 = k47Var.e1();
                        long j3 = nhaVar.G;
                        if (j3 != 0) {
                            no4.a(yv1Var, bf7.a(B0, j3));
                            bundle2.putInt("message_id", k47Var.e1());
                        }
                        dVar.presentFragment(yv1Var, false);
                        return;
                    }
                    return;
                } else if (b2 == 103 || b2 == 104) {
                    if (nhaVar.getClosestTab() == 8) {
                        xfa xfaVar = nhaVar.f0;
                        if (xfaVar != null && xfaVar.s != null) {
                            ArrayList arrayList10 = new ArrayList();
                            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                                arrayList10.add(Integer.valueOf(((k47) sparseArrayArr[0].valueAt(i12)).e1()));
                            }
                            if (b2 != 103) {
                                z16 = false;
                            }
                            nhaVar.a1(arrayList10, z16);
                            nhaVar.E(false);
                            return;
                        }
                        return;
                    }
                    wr9 E1 = dVar.getMessagesController().E1();
                    ArrayList arrayList11 = E1.j;
                    ArrayList arrayList12 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                        long j4 = ((vr9) arrayList11.get(i13)).a;
                        if (ygaVar.x.contains(Long.valueOf(j4))) {
                            arrayList12.add(Long.valueOf(j4));
                        }
                    }
                    if (b2 == 103) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!E1.m(arrayList12, z13, true)) {
                        dVar.showDialog(new i46(33, dVar.getCurrentAccount(), null, nhaVar.getContext(), dVar));
                    } else {
                        int i14 = 0;
                        while (true) {
                            iga[] igaVarArr = nhaVar.n0;
                            if (i14 < igaVarArr.length) {
                                iga igaVar = igaVarArr[i14];
                                if (igaVar.F == 11) {
                                    igaVar.x.g1(0, 0);
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    nhaVar.E(true);
                    return;
                } else {
                    return;
                }
        }
    }
}
