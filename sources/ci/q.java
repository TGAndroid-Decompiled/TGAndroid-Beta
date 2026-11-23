package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.g1;
import di.h1;
import fi.a6;
import hi.ga;
import hi.u3;
import hi.x5;
import hi.z5;
import java.io.File;
import java.util.ArrayList;
import oi.b2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.ov;
import org.telegram.messenger.pv;
import org.telegram.messenger.sr;
import org.telegram.messenger.v2;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.c60;
import org.telegram.ui.f30;
import org.telegram.ui.f60;
import org.telegram.ui.fk0;
import org.telegram.ui.gj0;
import org.telegram.ui.ke0;
import org.telegram.ui.km0;
import org.telegram.ui.le0;
import org.telegram.ui.nb1;
import org.telegram.ui.om0;
import org.telegram.ui.px;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.zb1;
public final class q implements View.OnClickListener {
    public final int f5740a;
    public final int f5741b;
    public final Object f5742c;

    public q(Object obj, int i7, int i10) {
        this.f5740a = i10;
        this.f5742c = obj;
        this.f5741b = i7;
    }

    @Override
    public final void onClick(View view) {
        w10 w10Var;
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
        int i13 = this.f5740a;
        int i14 = 1;
        char c10 = 1;
        boolean z15 = true;
        int i15 = this.f5741b;
        Object obj = this.f5742c;
        switch (i13) {
            case 0:
                h0 h0Var = ((r) obj).h;
                v4.t tVar = h0Var.d;
                ArrayList arrayList = h0Var.f5757n;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    h0Var.f5760w = true;
                    h0Var.h.a(i15, true);
                    int i16 = ((o) arrayList.get(i15)).d;
                    int L0 = tVar.L0();
                    if ((tVar.m(i16) == null && Math.abs(i16 - L0) > h0Var.f5758r * 9) || !bz.c()) {
                        h0Var.f5754c.C0();
                        l5 l5Var = h0Var.f5756f;
                        if (L0 < i16) {
                            i14 = 0;
                        }
                        l5Var.f29284b = i14;
                        l5Var.k(i16, 0, false, false);
                        return;
                    }
                    v4.d0 d0Var = new v4.d0(h0Var.getContext());
                    d0Var.f59190a = ((o) arrayList.get(i15)).d;
                    tVar.w0(d0Var);
                    return;
                }
                return;
            case 1:
                g1 g1Var = ((h1) obj).f8891f2;
                int i17 = g1.f8842w;
                g1Var.a(i15);
                return;
            case 2:
                ((g1) obj).a(i15);
                return;
            case 3:
                ga gaVar = (ga) obj;
                if (gaVar.f14531e.contains(Integer.valueOf(i15))) {
                    if (gaVar.f14531e.size() > 1) {
                        gaVar.f14531e.remove(Integer.valueOf(i15));
                    } else {
                        return;
                    }
                } else {
                    gaVar.f14531e.add(Integer.valueOf(i15));
                }
                org.telegram.messenger.g0.d0(gaVar.f14529b, new ai.d0(gaVar, 26));
                return;
            case 4:
                z5 z5Var = ((x5) obj).f15721b;
                if (z5Var.f15916r && (w10Var = z5Var.f15914f) != null) {
                    w10Var.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f19952b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 6:
                lh.a aVar = ((lh.h) obj).h;
                if (aVar != null) {
                    aVar.h(i15);
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
                ((w10) obj).a(Integer.valueOf(i15));
                return;
            case 10:
                ((org.telegram.ui.Components.j) obj).a(Integer.valueOf(i15));
                return;
            case 11:
                org.telegram.ui.Components.o0 o0Var = (org.telegram.ui.Components.o0) obj;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            o0Var.f37967b2 = !o0Var.f37967b2;
                        }
                    } else {
                        o0Var.f37966a2 = !o0Var.f37966a2;
                    }
                } else {
                    o0Var.Z1 = !o0Var.Z1;
                }
                o0Var.T1.O(true);
                o0Var.J0();
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj;
                boolean z16 = !zArr[i15];
                zArr[i15] = z16;
                ((d2) view).c(z16, true);
                return;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z17 = ChatAttachAlertPhotoLayout.f32862r1;
                chatAttachAlertPhotoLayout.f37135b.V2.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f32908x.V(null, null);
                return;
            case 14:
                ((f30) obj).f37351m1.x(i15, true);
                return;
            case 15:
                f30 f30Var = (f30) ((l20) obj).d;
                f30Var.K0(i15);
                f30Var.dismiss();
                return;
            case 16:
                ((h90) obj).S.k1(i15 + 8);
                return;
            case 17:
                zb0 zb0Var = (zb0) obj;
                if (zb0Var.f42816e.getAdapter() instanceof kx) {
                    qy qyVar = ((kx) zb0Var.f42816e.getAdapter()).f36919c;
                    if ((i15 != 1 && i15 != 2) || !qyVar.f39110x1) {
                        z10 = false;
                        if (i15 == 0 && qyVar.f39106w1) {
                            qyVar.Q(true, true, false);
                            return;
                        }
                    } else {
                        if (i15 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        qyVar.Q(true, false, z11);
                        return;
                    }
                } else {
                    z10 = false;
                }
                zb0Var.f42816e.x(i15, z10);
                return;
            case 18:
                q4 q4Var = (q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                q4Var.f38684o1.a(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 19:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i15, scrollSlidingTextTabStrip.f33197a.indexOfChild(view));
                return;
            case 20:
                final it0 it0Var = (it0) obj;
                eq0 eq0Var = it0Var.f36092a0;
                ts0 ts0Var = it0Var.U;
                i6 i6Var = it0Var.I1;
                long j3 = it0Var.f36130m1;
                SparseArray[] sparseArrayArr = it0Var.f36101c1;
                g2 g2Var = it0Var.f36166y1;
                if (i15 == 101) {
                    if (!it0.z0(it0Var.getSelectedTab()) && it0Var.getSelectedTab() != 13) {
                        if (it0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = g2Var.getMessagesController().I1().f26394j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                long j10 = ((ov) arrayList2.get(i18)).f26201a;
                                if (ts0Var.f40149x.contains(Long.valueOf(j10))) {
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
                                        if (n10.t(c22)) {
                                            str = gd.N0(2131754249, null);
                                            z13 = z14;
                                        } else {
                                            str = n10.q(c22);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, it0Var.getContext(), i6Var);
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i12 = 2131752069;
                                } else {
                                    i12 = 2131752065;
                                }
                                G = gd.a0(null, null, i12, str);
                            } else {
                                G = gd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = G;
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i11 = 2131752070;
                                } else {
                                    i11 = 2131752071;
                                }
                                G2 = gd.a0(null, null, i11, str);
                            } else {
                                G2 = gd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            t1Var.U = G2;
                            alertDialog$Builder.k(gd.N0(2131746125, null), new q1() {
                                @Override
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    it0 it0Var2 = it0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                            g2Var2.getMessagesController().R1().s(arrayList4, it0Var2.f36130m1);
                                            kc.b0(g2Var2).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            it0Var2.V(false);
                                            return;
                                        default:
                                            it0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                                it0Var2.f36166y1.getMessagesController().i0(((Long) arrayList4.get(i22)).longValue(), 0, null);
                                            }
                                            it0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                            g2Var.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                u6.U(textView, n6.f29692q7, null);
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
                        b5.y(g2Var, user, O0, encryptedChat, null, it0Var.f36111f1, null, it0Var.f36101c1, null, 0, 0, null, new gp0(it0Var, 14), null, it0Var.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (it0Var.B0() && eq0Var != null && eq0Var.getCurrentList() != null) {
                            a6 currentList = eq0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((fj) sparseArrayArr[0].valueAt(i20)).f24078l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, it0Var.getContext(), i6Var);
                                if (arrayList4.size() > 1) {
                                    i10 = 2131751548;
                                } else {
                                    i10 = 2131751552;
                                }
                                String N02 = gd.N0(i10, null);
                                t1 t1Var2 = alertDialog$Builder2.f28835a;
                                t1Var2.S = N02;
                                t1Var2.U = gd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(gd.N0(2131751586, null), new rm(it0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(gd.N0(2131752577, null), new ub0(13));
                                t1Var2.show();
                                t1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList5 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((fj) sparseArrayArr[0].valueAt(i21)).f24078l;
                            if (storyItem2 != null) {
                                arrayList5.add(storyItem2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, it0Var.getContext(), i6Var);
                            if (arrayList5.size() > 1) {
                                i7 = 2131751477;
                            } else {
                                i7 = 2131751475;
                            }
                            String N03 = gd.N0(i7, null);
                            t1 t1Var3 = alertDialog$Builder3.f28835a;
                            t1Var3.S = N03;
                            t1Var3.U = gd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(gd.N0(2131751586, null), new q1() {
                                @Override
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList42 = arrayList5;
                                    it0 it0Var2 = it0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                            g2Var2.getMessagesController().R1().s(arrayList42, it0Var2.f36130m1);
                                            kc.b0(g2Var2).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                            it0Var2.V(false);
                                            return;
                                        default:
                                            it0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                                it0Var2.f36166y1.getMessagesController().i0(((Long) arrayList42.get(i22)).longValue(), 0, null);
                                            }
                                            it0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(gd.N0(2131752577, null), new ub0(14));
                            t1Var3.show();
                            t1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i15 == 100) {
                    if (it0Var.f36117h1 != null) {
                        mp messagesController = g2Var.getMessagesController();
                        TLRPC.UserFull userFull = it0Var.f36117h1;
                        messagesController.getClass();
                        if (mp.Q2(userFull)) {
                            u3 u3Var = it0Var.H1;
                            if (u3Var != null) {
                                u3Var.v(gd.N0(2131750517, null));
                                it0Var.H1.z(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (it0Var.f36114g1 != null) {
                        TLRPC.Chat O03 = g2Var.getMessagesController().O0(Long.valueOf(it0Var.f36114g1.f28493id));
                        if (g2Var.getMessagesController().r2(O03)) {
                            u3 u3Var2 = it0Var.H1;
                            if (u3Var2 != null) {
                                if (v3.T(O03) && !O03.megagroup) {
                                    N0 = gd.N0(2131750519, null);
                                } else {
                                    N0 = gd.N0(2131750518, null);
                                }
                                u3Var2.v(N0);
                                it0Var.H1.z(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (it0Var.u0()) {
                        u3 u3Var3 = it0Var.H1;
                        if (u3Var3 != null) {
                            u3Var3.v(gd.N0(2131750520, "ForwardsRestrictedInfoBot"));
                            it0Var.H1.z(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    bx bxVar = new bx(bundle);
                    bxVar.E2 = new ip0(it0Var);
                    g2Var.presentFragment(bxVar);
                    return;
                } else if (i15 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        fj fjVar = (fj) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = fj.B0(fjVar.f24073k);
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
                        bundle2.putInt("message_id", fjVar.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        bn bnVar = new bn(bundle2);
                        bnVar.f46168d8 = fjVar.e1();
                        long j11 = it0Var.G;
                        if (j11 != 0) {
                            qg.c.a(bnVar, sr.a(B0, j11));
                            bundle2.putInt("message_id", fjVar.e1());
                        }
                        g2Var.presentFragment(bnVar, false);
                        return;
                    }
                    return;
                } else if (i15 == 103 || i15 == 104) {
                    if (it0Var.getClosestTab() == 8) {
                        rr0 rr0Var = it0Var.f36110f0;
                        if (rr0Var != null && rr0Var.f35199s != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList6.add(Integer.valueOf(((fj) sparseArrayArr[0].valueAt(i22)).e1()));
                            }
                            if (i15 != 103) {
                                z15 = false;
                            }
                            it0Var.f1(arrayList6, z15);
                            it0Var.V(false);
                            return;
                        }
                        return;
                    }
                    pv I1 = g2Var.getMessagesController().I1();
                    ArrayList arrayList7 = I1.f26394j;
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                        long j12 = ((ov) arrayList7.get(i23)).f26201a;
                        if (ts0Var.f40149x.contains(Long.valueOf(j12))) {
                            arrayList8.add(Long.valueOf(j12));
                        }
                    }
                    if (i15 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!I1.n(arrayList8, z12, true)) {
                        g2Var.showDialog(new ug.k0(33, g2Var.getCurrentAccount(), it0Var.getContext(), g2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            ds0[] ds0VarArr = it0Var.f36133n0;
                            if (i24 < ds0VarArr.length) {
                                ds0 ds0Var = ds0VarArr[i24];
                                if (ds0Var.F == 11) {
                                    ds0Var.f34450x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    it0Var.V(true);
                    return;
                } else {
                    return;
                }
            case 21:
                n51 n51Var = (n51) obj;
                int i25 = n51Var.f37677b.f33158i.f33986q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    n51Var.updateAppUpdateViews(i15, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.f24451j) {
                            HttpGetFileTask httpGetFileTask = e10.f24453l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.f24451j = false;
                            ks.e().k(296, new Object[0]);
                        }
                    }
                    n51Var.updateAppUpdateViews(i15, true);
                    return;
                } else {
                    File g10 = org.telegram.messenger.t0.f27012a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", n51Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 22:
                ((org.telegram.ui.Components.voip.x0) obj).f41312b.x(i15, true);
                return;
            case 23:
                zb1 zb1Var = (zb1) obj;
                if (zb1Var.V == null && view.getAlpha() != 0.0f) {
                    zb1Var.c(i15, true);
                    return;
                }
                return;
            case 24:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 25:
                px pxVar = (px) obj;
                if (pxVar.f51160n != null && i15 != pxVar.f51162s) {
                    n41 n41Var = pxVar.f51161r;
                    if (n41Var != null) {
                        n41Var.A = i15;
                    }
                    pxVar.b(i15, true);
                    pxVar.f51160n.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 26:
                f60 f60Var = (f60) obj;
                f60Var.R.dismiss();
                int i26 = f60Var.f47696d0;
                if (i26 >= 0) {
                    v2 v2Var = f60Var.f47697e0;
                    int[] iArr = v2Var.f27420c;
                    if (!v2Var.f27419b) {
                        v2Var.f27419b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = bz.q().getInt(i5.c.i(i27, "keep_media_type_"), v2.b(i27));
                        }
                    }
                    iArr[i26] = i15;
                    bz.q().edit().putInt("keep_media_type_" + i26, i15).apply();
                    c60 c60Var = f60Var.f47698f0;
                    if (c60Var != null) {
                        c60Var.a(i15);
                        return;
                    }
                    return;
                }
                c60 c60Var2 = f60Var.f47698f0;
                if (c60Var2 != null) {
                    c60Var2.a(i15);
                    return;
                }
                return;
            case 27:
                le0 le0Var = (le0) obj;
                ValueAnimator valueAnimator = le0Var.f50634c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    nb1 nb1Var = le0Var.f50634c;
                    if (!nb1Var.I) {
                        if (nb1Var.getCurrentPosition() == i15) {
                            g2 c02 = le0Var.c0();
                            if (c02 instanceof ke0) {
                                ((ke0) c02).v();
                                return;
                            }
                            return;
                        }
                        le0Var.s0(i15, true);
                        le0Var.f50634c.C(i15);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                fk0 fk0Var = (fk0) obj;
                gj0 gj0Var = fk0Var.E1;
                fk0Var.T0 = i15;
                if (i15 == 1) {
                    fk0Var.f47874j0 = fk0Var.f47870h0;
                } else if (i15 == 4) {
                    fk0Var.f47874j0 = fk0Var.f47872i0;
                } else if (i15 == 2) {
                    fk0Var.f47874j0 = fk0Var.f47866f0;
                } else if (i15 == 3) {
                    fk0Var.f47874j0 = fk0Var.f47868g0;
                } else {
                    fk0Var.f47874j0 = fk0Var.f47863e0;
                }
                yv yvVar = (yv) view.getTag();
                PhotoViewer.p1().J2(null, fk0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(fk0Var.f47877k1);
                    PhotoViewer.p1().c2(arrayList9, 0, gj0Var);
                    return;
                } else if (i15 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(fk0Var.f47879m1);
                    PhotoViewer.p1().c2(arrayList10, 0, gj0Var);
                    return;
                } else if (i15 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(fk0Var.n1);
                    PhotoViewer.p1().c2(arrayList11, 0, gj0Var);
                    return;
                } else if (i15 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = fk0Var.f47875j1;
                    p12.c2(arrayList12, arrayList12.indexOf(yvVar), gj0Var);
                    return;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = fk0Var.l1;
                    p13.c2(arrayList13, arrayList13.indexOf(yvVar), gj0Var);
                    return;
                }
            default:
                om0 om0Var = (om0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = om0Var.J;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    om0Var.J.d(true);
                }
                if (i15 == 0) {
                    b5.I(om0Var.getParentActivity(), om0Var.G.a(), new km0(om0Var, 2));
                    return;
                }
                om0Var.a0(om0Var.f50718b, om0Var.f50719c, true, 0);
                om0Var.finishFragment();
                return;
        }
    }
}
