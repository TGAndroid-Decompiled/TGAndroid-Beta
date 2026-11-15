package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.h1;
import di.i1;
import fi.c6;
import hi.l3;
import hi.l9;
import hi.o5;
import hi.r5;
import java.io.File;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.cw;
import org.telegram.messenger.ez;
import org.telegram.messenger.fk;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.sv;
import org.telegram.messenger.t3;
import org.telegram.messenger.tv;
import org.telegram.messenger.u2;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.a60;
import org.telegram.ui.an;
import org.telegram.ui.d30;
import org.telegram.ui.d60;
import org.telegram.ui.ek0;
import org.telegram.ui.fj0;
import org.telegram.ui.ie0;
import org.telegram.ui.je0;
import org.telegram.ui.km0;
import org.telegram.ui.lb1;
import org.telegram.ui.nx;
import org.telegram.ui.om0;
import org.telegram.ui.sm0;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yb1;
import org.telegram.ui.yw;
import org.telegram.ui.zm0;
public final class q implements View.OnClickListener {
    public final int f5466a;
    public final int f5467b;
    public final Object f5468c;

    public q(int i7, gj gjVar) {
        this.f5466a = 29;
        this.f5467b = i7;
        this.f5468c = gjVar;
    }

    @Override
    public final void onClick(View view) {
        z10 z10Var;
        boolean z10;
        boolean z11;
        boolean z12;
        String M0;
        int i7;
        int i10;
        TLRPC.Chat M02;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z13;
        String G;
        String G2;
        int i11;
        int i12;
        boolean z14;
        int i13 = this.f5466a;
        int i14 = 1;
        char c10 = 1;
        boolean z15 = true;
        Object obj = this.f5468c;
        int i15 = this.f5467b;
        switch (i13) {
            case 0:
                g0 g0Var = ((r) obj).h;
                v4.s sVar = g0Var.d;
                ArrayList arrayList = g0Var.f5483n;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    g0Var.f5486w = true;
                    g0Var.h.a(i15, true);
                    int i16 = ((o) arrayList.get(i15)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i16) == null && Math.abs(i16 - L0) > g0Var.f5484r * 9) || !gz.c()) {
                        g0Var.f5480c.C0();
                        wi0 wi0Var = g0Var.f5482f;
                        if (L0 < i16) {
                            i14 = 0;
                        }
                        wi0Var.f41357b = i14;
                        wi0Var.d(i16, 0, false, false);
                        return;
                    }
                    v4.c0 c0Var = new v4.c0(g0Var.getContext());
                    c0Var.f58480a = ((o) arrayList.get(i15)).d;
                    sVar.w0(c0Var);
                    return;
                }
                return;
            case 1:
                h1 h1Var = ((i1) obj).f8767f2;
                int i17 = h1.f8680w;
                h1Var.a(i15);
                return;
            case 2:
                ((h1) obj).a(i15);
                return;
            case 3:
                l9 l9Var = (l9) obj;
                if (l9Var.f15328e.contains(Integer.valueOf(i15))) {
                    if (l9Var.f15328e.size() > 1) {
                        l9Var.f15328e.remove(Integer.valueOf(i15));
                    } else {
                        return;
                    }
                } else {
                    l9Var.f15328e.add(Integer.valueOf(i15));
                }
                org.telegram.messenger.g0.d0(l9Var.f15326b, new ai.g0(l9Var, 25));
                return;
            case 4:
                r5 r5Var = ((o5) obj).f14810b;
                if (r5Var.f14992r && (z10Var = r5Var.f14990f) != null) {
                    z10Var.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f19491b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 6:
                lh.a aVar = ((lh.h) obj).h;
                if (aVar != null) {
                    aVar.g(i15);
                    return;
                }
                return;
            case 7:
                ((z1) obj).Q.b4(i15);
                return;
            case 8:
                ((an) obj).ha(i15);
                return;
            case 9:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            f0Var.f34463b2 = !f0Var.f34463b2;
                        }
                    } else {
                        f0Var.f34462a2 = !f0Var.f34462a2;
                    }
                } else {
                    f0Var.Z1 = !f0Var.Z1;
                }
                f0Var.T1.O(true);
                f0Var.I0();
                return;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                boolean z16 = !zArr[i15];
                zArr[i15] = z16;
                ((c2) view).c(z16, true);
                return;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z17 = ChatAttachAlertPhotoLayout.f32365r1;
                chatAttachAlertPhotoLayout.f33609b.V2.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f32411x.V(null, null);
                return;
            case 12:
                ((d30) obj).f34152m1.x(i15, true);
                return;
            case 13:
                d30 d30Var = (d30) ((d20) obj).d;
                d30Var.J0(i15);
                d30Var.dismiss();
                return;
            case 14:
                ((y80) obj).S.k1(i15 + 8);
                return;
            case 15:
                qb0 qb0Var = (qb0) obj;
                if (qb0Var.f38616e.getAdapter() instanceof fx) {
                    ly lyVar = ((fx) qb0Var.f38616e.getAdapter()).f34717c;
                    if ((i15 != 1 && i15 != 2) || !lyVar.f37004x1) {
                        z10 = false;
                        if (i15 == 0 && lyVar.f37000w1) {
                            lyVar.Q(true, true, false);
                            return;
                        }
                    } else {
                        if (i15 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        lyVar.Q(true, false, z11);
                        return;
                    }
                } else {
                    z10 = false;
                }
                qb0Var.f38616e.x(i15, z10);
                return;
            case 16:
                i4 i4Var = (i4) obj;
                EditTextBoldCursor editTextBoldCursor = i4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                i4Var.f35435o1.a(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                i4Var.dismiss();
                return;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i15, scrollSlidingTextTabStrip.f32700a.indexOfChild(view));
                return;
            case 18:
                final ys0 ys0Var = (ys0) obj;
                vp0 vp0Var = ys0Var.f42078a0;
                js0 js0Var = ys0Var.U;
                e6 e6Var = ys0Var.I1;
                long j3 = ys0Var.f42116m1;
                SparseArray[] sparseArrayArr = ys0Var.f42087c1;
                e2 e2Var = ys0Var.f42152y1;
                if (i15 == 101) {
                    if (!ys0.z0(ys0Var.getSelectedTab()) && ys0Var.getSelectedTab() != 13) {
                        if (ys0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = e2Var.getMessagesController().G1().f26742j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                long j10 = ((sv) arrayList2.get(i18)).f26578a;
                                if (js0Var.f36168x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (!arrayList3.isEmpty()) {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                if (longValue == e2Var.getUserConfig().e()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i19 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z13 = z14;
                                if (i19 < 0) {
                                    TLRPC.Chat M03 = e2Var.getMessagesController().M0(Long.valueOf(-longValue));
                                    z13 = z14;
                                    if (M03 != null) {
                                        str = M03.title;
                                        z13 = z14;
                                    }
                                } else if (i19 >= 0) {
                                    TLRPC.User a22 = e2Var.getMessagesController().a2(l10);
                                    z13 = z14;
                                    if (a22 != null) {
                                        if (q10.s(a22)) {
                                            str = hd.M0(2131754252, null);
                                            z13 = z14;
                                        } else {
                                            str = q10.p(a22);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), e6Var);
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i12 = 2131752081;
                                } else {
                                    i12 = 2131752077;
                                }
                                G = hd.a0(null, null, i12, str);
                            } else {
                                G = hd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = G;
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i11 = 2131752082;
                                } else {
                                    i11 = 2131752083;
                                }
                                G2 = hd.a0(null, null, i11, str);
                            } else {
                                G2 = hd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            t1Var.U = G2;
                            alertDialog$Builder.k(hd.M0(2131746321, null), new q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    ys0 ys0Var2 = ys0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var2.f42152y1;
                                            e2Var2.getMessagesController().P1().s(arrayList4, ys0Var2.f42116m1);
                                            cc.a0(e2Var2).Q(2131624052, 36, org.telegram.messenger.hd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            ys0Var2.V(false);
                                            return;
                                        default:
                                            ys0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                                ys0Var2.f42152y1.getMessagesController().i0(((Long) arrayList4.get(i22)).longValue(), 0, null);
                                            }
                                            ys0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            e2Var.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                q6.U(textView, j6.f29090q7, null);
                                return;
                            }
                            return;
                        }
                        if (m5.C(j3)) {
                            encryptedChat = e2Var.getMessagesController().a1(Integer.valueOf((int) (j3 & 4294967295L)));
                            user = null;
                            M02 = null;
                        } else if (m5.E(j3)) {
                            user = e2Var.getMessagesController().a2(Long.valueOf(j3));
                            M02 = null;
                            encryptedChat = null;
                        } else {
                            M02 = e2Var.getMessagesController().M0(Long.valueOf(-j3));
                            user = null;
                            encryptedChat = null;
                        }
                        t4.y(e2Var, user, M02, encryptedChat, null, ys0Var.f42097f1, null, ys0Var.f42087c1, null, 0, 0, null, new wo0(ys0Var, 14), null, ys0Var.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (ys0Var.B0() && vp0Var != null && vp0Var.getCurrentList() != null) {
                            c6 currentList = vp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((gj) sparseArrayArr[0].valueAt(i20)).f23824l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ys0Var.getContext(), e6Var);
                                if (arrayList4.size() > 1) {
                                    i10 = 2131751560;
                                } else {
                                    i10 = 2131751564;
                                }
                                String M04 = hd.M0(i10, null);
                                t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.S = M04;
                                t1Var2.U = hd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(hd.M0(2131751598, null), new km(ys0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(hd.M0(2131752589, null), new rb0(12));
                                t1Var2.show();
                                t1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList5 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((gj) sparseArrayArr[0].valueAt(i21)).f23824l;
                            if (storyItem2 != null) {
                                arrayList5.add(storyItem2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ys0Var.getContext(), e6Var);
                            if (arrayList5.size() > 1) {
                                i7 = 2131751489;
                            } else {
                                i7 = 2131751487;
                            }
                            String M05 = hd.M0(i7, null);
                            t1 t1Var3 = alertDialog$Builder3.f28392a;
                            t1Var3.S = M05;
                            t1Var3.U = hd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(hd.M0(2131751598, null), new q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList42 = arrayList5;
                                    ys0 ys0Var2 = ys0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var2.f42152y1;
                                            e2Var2.getMessagesController().P1().s(arrayList42, ys0Var2.f42116m1);
                                            cc.a0(e2Var2).Q(2131624052, 36, org.telegram.messenger.hd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                            ys0Var2.V(false);
                                            return;
                                        default:
                                            ys0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                                ys0Var2.f42152y1.getMessagesController().i0(((Long) arrayList42.get(i22)).longValue(), 0, null);
                                            }
                                            ys0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(hd.M0(2131752589, null), new rb0(13));
                            t1Var3.show();
                            t1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i15 == 100) {
                    if (ys0Var.f42103h1 != null) {
                        np messagesController = e2Var.getMessagesController();
                        TLRPC.UserFull userFull = ys0Var.f42103h1;
                        messagesController.getClass();
                        if (np.K2(userFull)) {
                            l3 l3Var = ys0Var.H1;
                            if (l3Var != null) {
                                l3Var.u(hd.M0(2131750534, null));
                                ys0Var.H1.y(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (ys0Var.f42100g1 != null) {
                        TLRPC.Chat M06 = e2Var.getMessagesController().M0(Long.valueOf(ys0Var.f42100g1.f28052id));
                        if (e2Var.getMessagesController().o2(M06)) {
                            l3 l3Var2 = ys0Var.H1;
                            if (l3Var2 != null) {
                                if (t3.T(M06) && !M06.megagroup) {
                                    M0 = hd.M0(2131750536, null);
                                } else {
                                    M0 = hd.M0(2131750535, null);
                                }
                                l3Var2.u(M0);
                                ys0Var.H1.y(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (ys0Var.u0()) {
                        l3 l3Var3 = ys0Var.H1;
                        if (l3Var3 != null) {
                            l3Var3.u(hd.M0(2131750537, "ForwardsRestrictedInfoBot"));
                            ys0Var.H1.y(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    yw ywVar = new yw(bundle);
                    ywVar.E2 = new yo0(ys0Var);
                    e2Var.presentFragment(ywVar);
                    return;
                } else if (i15 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        gj gjVar = (gj) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = gj.B0(gjVar.f23819k);
                        if (m5.C(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (m5.E(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat M07 = e2Var.getMessagesController().M0(Long.valueOf(-B0));
                            if (M07 != null && M07.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -M07.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", gjVar.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        an anVar = new an(bundle2);
                        anVar.f45154c8 = gjVar.e1();
                        long j11 = ys0Var.G;
                        if (j11 != 0) {
                            qg.c.a(anVar, ur.a(B0, j11));
                            bundle2.putInt("message_id", gjVar.e1());
                        }
                        e2Var.presentFragment(anVar, false);
                        return;
                    }
                    return;
                } else if (i15 == 103 || i15 == 104) {
                    if (ys0Var.getClosestTab() == 8) {
                        ir0 ir0Var = ys0Var.f42096f0;
                        if (ir0Var != null && ir0Var.f41149s != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList6.add(Integer.valueOf(((gj) sparseArrayArr[0].valueAt(i22)).e1()));
                            }
                            if (i15 != 103) {
                                z15 = false;
                            }
                            ys0Var.f1(arrayList6, z15);
                            ys0Var.V(false);
                            return;
                        }
                        return;
                    }
                    tv G1 = e2Var.getMessagesController().G1();
                    ArrayList arrayList7 = G1.f26742j;
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                        long j12 = ((sv) arrayList7.get(i23)).f26578a;
                        if (js0Var.f36168x.contains(Long.valueOf(j12))) {
                            arrayList8.add(Long.valueOf(j12));
                        }
                    }
                    if (i15 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!G1.n(arrayList8, z12, true)) {
                        e2Var.showDialog(new ug.j0(33, e2Var.getCurrentAccount(), ys0Var.getContext(), e2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            tr0[] tr0VarArr = ys0Var.f42119n0;
                            if (i24 < tr0VarArr.length) {
                                tr0 tr0Var = tr0VarArr[i24];
                                if (tr0Var.F == 11) {
                                    tr0Var.f39796x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    ys0Var.V(true);
                    return;
                } else {
                    return;
                }
            case 19:
                b51 b51Var = (b51) obj;
                int i25 = b51Var.f33205b.f32661i.f39227q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26608a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    b51Var.updateAppUpdateViews(i15, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26608a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.f24024j) {
                            HttpGetFileTask httpGetFileTask = e10.f24026l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.f24024j = false;
                            ns.e().k(293, new Object[0]);
                        }
                    }
                    b51Var.updateAppUpdateViews(i15, true);
                    return;
                } else {
                    File g10 = org.telegram.messenger.t0.f26608a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", b51Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 20:
                ((org.telegram.ui.Components.voip.x0) obj).f41036b.x(i15, true);
                return;
            case 21:
                yb1 yb1Var = (yb1) obj;
                if (yb1Var.V == null && view.getAlpha() != 0.0f) {
                    yb1Var.c(i15, true);
                    return;
                }
                return;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 23:
                nx nxVar = (nx) obj;
                if (nxVar.f49703n != null && i15 != nxVar.f49705s) {
                    b41 b41Var = nxVar.f49704r;
                    if (b41Var != null) {
                        b41Var.f33197z = i15;
                    }
                    nxVar.b(i15, true);
                    nxVar.f49703n.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 24:
                d60 d60Var = (d60) obj;
                d60Var.R.dismiss();
                int i26 = d60Var.f46281d0;
                if (i26 >= 0) {
                    u2 u2Var = d60Var.f46282e0;
                    int[] iArr = u2Var.f26776c;
                    if (!u2Var.f26775b) {
                        u2Var.f26775b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = gz.q().getInt(i5.c.i(i27, "keep_media_type_"), u2.b(i27));
                        }
                    }
                    iArr[i26] = i15;
                    gz.q().edit().putInt("keep_media_type_" + i26, i15).apply();
                    a60 a60Var = d60Var.f46283f0;
                    if (a60Var != null) {
                        a60Var.a(i15);
                        return;
                    }
                    return;
                }
                a60 a60Var2 = d60Var.f46283f0;
                if (a60Var2 != null) {
                    a60Var2.a(i15);
                    return;
                }
                return;
            case 25:
                je0 je0Var = (je0) obj;
                ValueAnimator valueAnimator = je0Var.f49201c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    lb1 lb1Var = je0Var.f49201c;
                    if (!lb1Var.I) {
                        if (lb1Var.getCurrentPosition() == i15) {
                            e2 c02 = je0Var.c0();
                            if (c02 instanceof ie0) {
                                ((ie0) c02).v();
                                return;
                            }
                            return;
                        }
                        je0Var.s0(i15, true);
                        je0Var.f49201c.C(i15);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ek0 ek0Var = (ek0) obj;
                fj0 fj0Var = ek0Var.E1;
                ek0Var.T0 = i15;
                if (i15 == 1) {
                    ek0Var.f46815j0 = ek0Var.f46811h0;
                } else if (i15 == 4) {
                    ek0Var.f46815j0 = ek0Var.f46813i0;
                } else if (i15 == 2) {
                    ek0Var.f46815j0 = ek0Var.f46807f0;
                } else if (i15 == 3) {
                    ek0Var.f46815j0 = ek0Var.f46809g0;
                } else {
                    ek0Var.f46815j0 = ek0Var.f46804e0;
                }
                cw cwVar = (cw) view.getTag();
                PhotoViewer.p1().I2(null, ek0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(ek0Var.f46818k1);
                    PhotoViewer.p1().b2(arrayList9, 0, fj0Var);
                    return;
                } else if (i15 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(ek0Var.f46820m1);
                    PhotoViewer.p1().b2(arrayList10, 0, fj0Var);
                    return;
                } else if (i15 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(ek0Var.n1);
                    PhotoViewer.p1().b2(arrayList11, 0, fj0Var);
                    return;
                } else if (i15 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = ek0Var.f46816j1;
                    p12.b2(arrayList12, arrayList12.indexOf(cwVar), fj0Var);
                    return;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = ek0Var.l1;
                    p13.b2(arrayList13, arrayList13.indexOf(cwVar), fj0Var);
                    return;
                }
            case 27:
                om0 om0Var = (om0) obj;
                g1 g1Var = om0Var.J;
                if (g1Var != null && g1Var.isShowing()) {
                    om0Var.J.d(true);
                }
                if (i15 == 0) {
                    t4.I(om0Var.getParentActivity(), om0Var.G.a(), new km0(om0Var, 2));
                    return;
                }
                om0Var.a0(om0Var.f49995b, om0Var.f49996c, true, 0);
                om0Var.finishFragment();
                return;
            case 28:
                zm0 zm0Var = (zm0) obj;
                g1 g1Var2 = zm0Var.f53973n0;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    zm0Var.f53973n0.d(true);
                }
                if (i15 == 0) {
                    t4.I(zm0Var.getParentActivity(), zm0Var.V.a(), new sm0(zm0Var, 1));
                    return;
                } else {
                    zm0Var.j0(0, true);
                    return;
                }
            default:
                gj gjVar2 = (gj) obj;
                int i28 = PopupNotificationActivity.f42961c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.h3(new fk(ez.C(i15), gj.B0(gjVar2.f23819k), gjVar2.e1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
        }
    }

    public q(Object obj, int i7, int i10) {
        this.f5466a = i10;
        this.f5468c = obj;
        this.f5467b = i7;
    }
}
