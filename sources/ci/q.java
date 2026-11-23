package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.g1;
import di.h1;
import fi.a6;
import hi.l3;
import hi.l9;
import hi.m5;
import hi.o5;
import java.io.File;
import java.util.ArrayList;
import oi.b2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.pv;
import org.telegram.messenger.qv;
import org.telegram.messenger.tr;
import org.telegram.messenger.v2;
import org.telegram.messenger.v3;
import org.telegram.messenger.y10;
import org.telegram.messenger.zv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bc1;
import org.telegram.ui.bn;
import org.telegram.ui.c60;
import org.telegram.ui.cx;
import org.telegram.ui.f60;
import org.telegram.ui.g30;
import org.telegram.ui.hk0;
import org.telegram.ui.ij0;
import org.telegram.ui.le0;
import org.telegram.ui.me0;
import org.telegram.ui.mm0;
import org.telegram.ui.pb1;
import org.telegram.ui.qm0;
import org.telegram.ui.qx;
import org.telegram.ui.web.HttpGetFileTask;
public final class q implements View.OnClickListener {
    public final int f5777a;
    public final int f5778b;
    public final Object f5779c;

    public q(Object obj, int i7, int i10) {
        this.f5777a = i10;
        this.f5779c = obj;
        this.f5778b = i7;
    }

    @Override
    public final void onClick(View view) {
        y10 y10Var;
        boolean z10;
        boolean z11;
        boolean z12;
        String N0;
        int i7;
        int i10;
        TLRPC.Chat O0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z13;
        String G;
        String G2;
        int i11;
        int i12;
        boolean z14;
        int i13 = this.f5777a;
        int i14 = 1;
        char c10 = 1;
        boolean z15 = true;
        int i15 = this.f5778b;
        Object obj = this.f5779c;
        switch (i13) {
            case 0:
                h0 h0Var = ((r) obj).h;
                v4.t tVar = h0Var.d;
                ArrayList arrayList = h0Var.f5794n;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    h0Var.f5797w = true;
                    h0Var.h.a(i15, true);
                    int i16 = ((o) arrayList.get(i15)).d;
                    int L0 = tVar.L0();
                    if ((tVar.m(i16) == null && Math.abs(i16 - L0) > h0Var.f5795r * 9) || !cz.c()) {
                        h0Var.f5791c.C0();
                        k5 k5Var = h0Var.f5793f;
                        if (L0 < i16) {
                            i14 = 0;
                        }
                        k5Var.f29186b = i14;
                        k5Var.k(i16, 0, false, false);
                        return;
                    }
                    v4.d0 d0Var = new v4.d0(h0Var.getContext());
                    d0Var.f59109a = ((o) arrayList.get(i15)).d;
                    tVar.w0(d0Var);
                    return;
                }
                return;
            case 1:
                g1 g1Var = ((h1) obj).f8930f2;
                int i17 = g1.f8881w;
                g1Var.a(i15);
                return;
            case 2:
                ((g1) obj).a(i15);
                return;
            case 3:
                l9 l9Var = (l9) obj;
                if (l9Var.f15699e.contains(Integer.valueOf(i15))) {
                    if (l9Var.f15699e.size() > 1) {
                        l9Var.f15699e.remove(Integer.valueOf(i15));
                    } else {
                        return;
                    }
                } else {
                    l9Var.f15699e.add(Integer.valueOf(i15));
                }
                org.telegram.messenger.g0.d0(l9Var.f15697b, new ai.h0(l9Var, 26));
                return;
            case 4:
                o5 o5Var = ((m5) obj).f15024b;
                if (o5Var.f15219r && (y10Var = o5Var.f15217f) != null) {
                    y10Var.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f19886b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 6:
                lh.a aVar = ((lh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i15);
                    return;
                }
                return;
            case 7:
                ((b2) obj).Q.b4(i15);
                return;
            case 8:
                ((bn) obj).ha(i15);
                return;
            case 9:
                ((y10) obj).a(Integer.valueOf(i15));
                return;
            case 10:
                ((org.telegram.ui.Components.k) obj).a(Integer.valueOf(i15));
                return;
            case 11:
                org.telegram.ui.Components.p0 p0Var = (org.telegram.ui.Components.p0) obj;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            p0Var.f38429b2 = !p0Var.f38429b2;
                        }
                    } else {
                        p0Var.f38428a2 = !p0Var.f38428a2;
                    }
                } else {
                    p0Var.Z1 = !p0Var.Z1;
                }
                p0Var.T1.O(true);
                p0Var.J0();
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj;
                boolean z16 = !zArr[i15];
                zArr[i15] = z16;
                ((d2) view).c(z16, true);
                return;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z17 = ChatAttachAlertPhotoLayout.f32798r1;
                chatAttachAlertPhotoLayout.f37520b.V2.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f32844x.V(null, null);
                return;
            case 14:
                ((g30) obj).f38062m1.x(i15, true);
                return;
            case 15:
                g30 g30Var = (g30) ((n20) obj).d;
                g30Var.K0(i15);
                g30Var.dismiss();
                return;
            case 16:
                ((k90) obj).S.k1(i15 + 8);
                return;
            case 17:
                cc0 cc0Var = (cc0) obj;
                if (cc0Var.f34176e.getAdapter() instanceof nx) {
                    ty tyVar = ((nx) cc0Var.f34176e.getAdapter()).f38004c;
                    if ((i15 != 1 && i15 != 2) || !tyVar.f40155x1) {
                        z10 = false;
                        if (i15 == 0 && tyVar.f40151w1) {
                            tyVar.Q(true, true, false);
                            return;
                        }
                    } else {
                        if (i15 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        tyVar.Q(true, false, z11);
                        return;
                    }
                } else {
                    z10 = false;
                }
                cc0Var.f34176e.x(i15, z10);
                return;
            case 18:
                r4 r4Var = (r4) obj;
                EditTextBoldCursor editTextBoldCursor = r4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                r4Var.f39067o1.a(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                r4Var.dismiss();
                return;
            case 19:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i15, scrollSlidingTextTabStrip.f33133a.indexOfChild(view));
                return;
            case 20:
                final jt0 jt0Var = (jt0) obj;
                fq0 fq0Var = jt0Var.f36610a0;
                us0 us0Var = jt0Var.U;
                h6 h6Var = jt0Var.I1;
                long j3 = jt0Var.f36648m1;
                SparseArray[] sparseArrayArr = jt0Var.f36619c1;
                g2 g2Var = jt0Var.f36684y1;
                if (i15 == 101) {
                    if (!jt0.z0(jt0Var.getSelectedTab()) && jt0Var.getSelectedTab() != 13) {
                        if (jt0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = g2Var.getMessagesController().I1().f26509j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                long j10 = ((pv) arrayList2.get(i18)).f26350a;
                                if (us0Var.f40580x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (!arrayList3.isEmpty()) {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                if (longValue == g2Var.getUserConfig().e()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i19 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z13 = z14;
                                if (i19 < 0) {
                                    TLRPC.Chat O02 = g2Var.getMessagesController().O0(Long.valueOf(-longValue));
                                    z13 = z14;
                                    if (O02 != null) {
                                        str = O02.title;
                                        z13 = z14;
                                    }
                                } else if (i19 >= 0) {
                                    TLRPC.User c22 = g2Var.getMessagesController().c2(l10);
                                    z13 = z14;
                                    if (c22 != null) {
                                        if (p10.t(c22)) {
                                            str = hd.N0(2131754249, null);
                                            z13 = z14;
                                        } else {
                                            str = p10.q(c22);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), h6Var);
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i12 = 2131752069;
                                } else {
                                    i12 = 2131752065;
                                }
                                G = hd.a0(null, null, i12, str);
                            } else {
                                G = hd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = G;
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i11 = 2131752070;
                                } else {
                                    i11 = 2131752071;
                                }
                                G2 = hd.a0(null, null, i11, str);
                            } else {
                                G2 = hd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            t1Var.U = G2;
                            alertDialog$Builder.k(hd.N0(2131746125, null), new q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    jt0 jt0Var2 = jt0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36684y1;
                                            g2Var2.getMessagesController().R1().s(arrayList4, jt0Var2.f36648m1);
                                            lc.b0(g2Var2).Q(2131624052, 36, org.telegram.messenger.hd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            jt0Var2.V(false);
                                            return;
                                        default:
                                            jt0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                                jt0Var2.f36684y1.getMessagesController().i0(((Long) arrayList4.get(i22)).longValue(), 0, null);
                                            }
                                            jt0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(hd.N0(2131752577, null), null);
                            g2Var.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                t6.U(textView, m6.f29622q7, null);
                                return;
                            }
                            return;
                        }
                        if (n5.C(j3)) {
                            encryptedChat = g2Var.getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L)));
                            user = null;
                            O0 = null;
                        } else if (n5.E(j3)) {
                            user = g2Var.getMessagesController().c2(Long.valueOf(j3));
                            O0 = null;
                            encryptedChat = null;
                        } else {
                            O0 = g2Var.getMessagesController().O0(Long.valueOf(-j3));
                            user = null;
                            encryptedChat = null;
                        }
                        c5.y(g2Var, user, O0, encryptedChat, null, jt0Var.f36629f1, null, jt0Var.f36619c1, null, 0, 0, null, new hp0(jt0Var, 14), null, jt0Var.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (jt0Var.B0() && fq0Var != null && fq0Var.getCurrentList() != null) {
                            a6 currentList = fq0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((gj) sparseArrayArr[0].valueAt(i20)).f24218l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, jt0Var.getContext(), h6Var);
                                if (arrayList4.size() > 1) {
                                    i10 = 2131751548;
                                } else {
                                    i10 = 2131751552;
                                }
                                String N02 = hd.N0(i10, null);
                                t1 t1Var2 = alertDialog$Builder2.f28777a;
                                t1Var2.S = N02;
                                t1Var2.U = hd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(hd.N0(2131751586, null), new tm(jt0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(hd.N0(2131752577, null), new xb0(13));
                                t1Var2.show();
                                t1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList5 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((gj) sparseArrayArr[0].valueAt(i21)).f24218l;
                            if (storyItem2 != null) {
                                arrayList5.add(storyItem2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, jt0Var.getContext(), h6Var);
                            if (arrayList5.size() > 1) {
                                i7 = 2131751477;
                            } else {
                                i7 = 2131751475;
                            }
                            String N03 = hd.N0(i7, null);
                            t1 t1Var3 = alertDialog$Builder3.f28777a;
                            t1Var3.S = N03;
                            t1Var3.U = hd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(hd.N0(2131751586, null), new q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList42 = arrayList5;
                                    jt0 jt0Var2 = jt0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36684y1;
                                            g2Var2.getMessagesController().R1().s(arrayList42, jt0Var2.f36648m1);
                                            lc.b0(g2Var2).Q(2131624052, 36, org.telegram.messenger.hd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                            jt0Var2.V(false);
                                            return;
                                        default:
                                            jt0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                                jt0Var2.f36684y1.getMessagesController().i0(((Long) arrayList42.get(i22)).longValue(), 0, null);
                                            }
                                            jt0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(hd.N0(2131752577, null), new xb0(14));
                            t1Var3.show();
                            t1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i15 == 100) {
                    if (jt0Var.f36635h1 != null) {
                        np messagesController = g2Var.getMessagesController();
                        TLRPC.UserFull userFull = jt0Var.f36635h1;
                        messagesController.getClass();
                        if (np.Q2(userFull)) {
                            l3 l3Var = jt0Var.H1;
                            if (l3Var != null) {
                                l3Var.v(hd.N0(2131750517, null));
                                jt0Var.H1.z(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (jt0Var.f36632g1 != null) {
                        TLRPC.Chat O03 = g2Var.getMessagesController().O0(Long.valueOf(jt0Var.f36632g1.f28435id));
                        if (g2Var.getMessagesController().r2(O03)) {
                            l3 l3Var2 = jt0Var.H1;
                            if (l3Var2 != null) {
                                if (v3.T(O03) && !O03.megagroup) {
                                    N0 = hd.N0(2131750519, null);
                                } else {
                                    N0 = hd.N0(2131750518, null);
                                }
                                l3Var2.v(N0);
                                jt0Var.H1.z(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (jt0Var.u0()) {
                        l3 l3Var3 = jt0Var.H1;
                        if (l3Var3 != null) {
                            l3Var3.v(hd.N0(2131750520, "ForwardsRestrictedInfoBot"));
                            jt0Var.H1.z(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    cx cxVar = new cx(bundle);
                    cxVar.E2 = new jp0(jt0Var);
                    g2Var.presentFragment(cxVar);
                    return;
                } else if (i15 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        gj gjVar = (gj) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = gj.B0(gjVar.f24213k);
                        if (n5.C(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (n5.E(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat O04 = g2Var.getMessagesController().O0(Long.valueOf(-B0));
                            if (O04 != null && O04.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -O04.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", gjVar.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        bn bnVar = new bn(bundle2);
                        bnVar.f46000d8 = gjVar.e1();
                        long j11 = jt0Var.G;
                        if (j11 != 0) {
                            qg.c.a(bnVar, tr.a(B0, j11));
                            bundle2.putInt("message_id", gjVar.e1());
                        }
                        g2Var.presentFragment(bnVar, false);
                        return;
                    }
                    return;
                } else if (i15 == 103 || i15 == 104) {
                    if (jt0Var.getClosestTab() == 8) {
                        sr0 sr0Var = jt0Var.f36628f0;
                        if (sr0Var != null && sr0Var.f35670s != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList6.add(Integer.valueOf(((gj) sparseArrayArr[0].valueAt(i22)).e1()));
                            }
                            if (i15 != 103) {
                                z15 = false;
                            }
                            jt0Var.f1(arrayList6, z15);
                            jt0Var.V(false);
                            return;
                        }
                        return;
                    }
                    qv I1 = g2Var.getMessagesController().I1();
                    ArrayList arrayList7 = I1.f26509j;
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                        long j12 = ((pv) arrayList7.get(i23)).f26350a;
                        if (us0Var.f40580x.contains(Long.valueOf(j12))) {
                            arrayList8.add(Long.valueOf(j12));
                        }
                    }
                    if (i15 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!I1.n(arrayList8, z12, true)) {
                        g2Var.showDialog(new ug.k0(33, g2Var.getCurrentAccount(), jt0Var.getContext(), g2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            ds0[] ds0VarArr = jt0Var.f36651n0;
                            if (i24 < ds0VarArr.length) {
                                ds0 ds0Var = ds0VarArr[i24];
                                if (ds0Var.F == 11) {
                                    ds0Var.f34565x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    jt0Var.V(true);
                    return;
                } else {
                    return;
                }
            case 21:
                o51 o51Var = (o51) obj;
                int i25 = o51Var.f38111b.f33094i.f35178q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    o51Var.updateAppUpdateViews(i15, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.f24355j) {
                            HttpGetFileTask httpGetFileTask = e10.f24357l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.f24355j = false;
                            ls.e().k(296, new Object[0]);
                        }
                    }
                    o51Var.updateAppUpdateViews(i15, true);
                    return;
                } else {
                    File g10 = org.telegram.messenger.t0.f26930a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", o51Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 22:
                ((org.telegram.ui.Components.voip.w0) obj).f41417b.x(i15, true);
                return;
            case 23:
                bc1 bc1Var = (bc1) obj;
                if (bc1Var.V == null && view.getAlpha() != 0.0f) {
                    bc1Var.c(i15, true);
                    return;
                }
                return;
            case 24:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 25:
                qx qxVar = (qx) obj;
                if (qxVar.f51372n != null && i15 != qxVar.f51374s) {
                    o41 o41Var = qxVar.f51373r;
                    if (o41Var != null) {
                        o41Var.A = i15;
                    }
                    qxVar.b(i15, true);
                    qxVar.f51372n.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 26:
                f60 f60Var = (f60) obj;
                f60Var.R.dismiss();
                int i26 = f60Var.f47612d0;
                if (i26 >= 0) {
                    v2 v2Var = f60Var.f47613e0;
                    int[] iArr = v2Var.f27315c;
                    if (!v2Var.f27314b) {
                        v2Var.f27314b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = cz.q().getInt(i5.c.i(i27, "keep_media_type_"), v2.b(i27));
                        }
                    }
                    iArr[i26] = i15;
                    cz.q().edit().putInt("keep_media_type_" + i26, i15).apply();
                    c60 c60Var = f60Var.f47614f0;
                    if (c60Var != null) {
                        c60Var.a(i15);
                        return;
                    }
                    return;
                }
                c60 c60Var2 = f60Var.f47614f0;
                if (c60Var2 != null) {
                    c60Var2.a(i15);
                    return;
                }
                return;
            case 27:
                me0 me0Var = (me0) obj;
                ValueAnimator valueAnimator = me0Var.f51203c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pb1 pb1Var = me0Var.f51203c;
                    if (!pb1Var.I) {
                        if (pb1Var.getCurrentPosition() == i15) {
                            g2 c02 = me0Var.c0();
                            if (c02 instanceof le0) {
                                ((le0) c02).v();
                                return;
                            }
                            return;
                        }
                        me0Var.s0(i15, true);
                        me0Var.f51203c.A(i15);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                hk0 hk0Var = (hk0) obj;
                ij0 ij0Var = hk0Var.E1;
                hk0Var.T0 = i15;
                if (i15 == 1) {
                    hk0Var.f48439j0 = hk0Var.f48435h0;
                } else if (i15 == 4) {
                    hk0Var.f48439j0 = hk0Var.f48437i0;
                } else if (i15 == 2) {
                    hk0Var.f48439j0 = hk0Var.f48431f0;
                } else if (i15 == 3) {
                    hk0Var.f48439j0 = hk0Var.f48433g0;
                } else {
                    hk0Var.f48439j0 = hk0Var.f48428e0;
                }
                zv zvVar = (zv) view.getTag();
                PhotoViewer.p1().I2(null, hk0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(hk0Var.f48442k1);
                    PhotoViewer.p1().b2(arrayList9, 0, ij0Var);
                    return;
                } else if (i15 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(hk0Var.f48444m1);
                    PhotoViewer.p1().b2(arrayList10, 0, ij0Var);
                    return;
                } else if (i15 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(hk0Var.n1);
                    PhotoViewer.p1().b2(arrayList11, 0, ij0Var);
                    return;
                } else if (i15 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = hk0Var.f48440j1;
                    p12.b2(arrayList12, arrayList12.indexOf(zvVar), ij0Var);
                    return;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = hk0Var.l1;
                    p13.b2(arrayList13, arrayList13.indexOf(zvVar), ij0Var);
                    return;
                }
            default:
                qm0 qm0Var = (qm0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = qm0Var.J;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    qm0Var.J.d(true);
                }
                if (i15 == 0) {
                    c5.I(qm0Var.getParentActivity(), qm0Var.G.a(), new mm0(qm0Var, 2));
                    return;
                }
                qm0Var.a0(qm0Var.f51304b, qm0Var.f51305c, true, 0);
                qm0Var.finishFragment();
                return;
        }
    }
}
