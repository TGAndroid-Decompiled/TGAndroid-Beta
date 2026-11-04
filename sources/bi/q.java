package bi;

import ai.v2;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import ci.o1;
import ci.p1;
import gi.l3;
import gi.o5;
import gi.o9;
import gi.q5;
import java.io.File;
import java.util.ArrayList;
import mi.c2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h1;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.mv;
import org.telegram.messenger.nv;
import org.telegram.messenger.pr;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.u2;
import org.telegram.messenger.wv;
import org.telegram.messenger.yj;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.yw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.de0;
import org.telegram.ui.dm0;
import org.telegram.ui.ee0;
import org.telegram.ui.fb1;
import org.telegram.ui.hm0;
import org.telegram.ui.jx;
import org.telegram.ui.lm0;
import org.telegram.ui.sb1;
import org.telegram.ui.sm0;
import org.telegram.ui.uw;
import org.telegram.ui.v50;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wm;
import org.telegram.ui.x20;
import org.telegram.ui.y50;
import org.telegram.ui.yj0;
import org.telegram.ui.zi0;
public final class q implements View.OnClickListener {
    public final int f3823a;
    public final int f3824b;
    public final Object f3825c;

    public q(int i3, zi ziVar) {
        this.f3823a = 29;
        this.f3824b = i3;
        this.f3825c = ziVar;
    }

    @Override
    public final void onClick(View view) {
        u10 u10Var;
        boolean z10;
        boolean z11;
        boolean z12;
        String M0;
        int i3;
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
        int i13 = this.f3823a;
        int i14 = 1;
        char c2 = 1;
        boolean z15 = true;
        Object obj = this.f3825c;
        int i15 = this.f3824b;
        switch (i13) {
            case 0:
                h0 h0Var = ((r) obj).h;
                u4.s sVar = h0Var.d;
                ArrayList arrayList = h0Var.f3843n;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    h0Var.f3846w = true;
                    h0Var.h.a(i15, true);
                    int i16 = ((o) arrayList.get(i15)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i16) == null && Math.abs(i16 - L0) > h0Var.f3844r * 9) || !az.c()) {
                        h0Var.f3840c.C0();
                        vi0 vi0Var = h0Var.f3842f;
                        if (L0 < i16) {
                            i14 = 0;
                        }
                        vi0Var.f39126b = i14;
                        vi0Var.d(i16, 0, false, false);
                        return;
                    }
                    u4.c0 c0Var = new u4.c0(h0Var.getContext());
                    c0Var.f55704a = ((o) arrayList.get(i15)).d;
                    sVar.w0(c0Var);
                    return;
                }
                return;
            case 1:
                o1 o1Var = ((p1) obj).c2;
                int i17 = o1.f5667w;
                o1Var.a(i15);
                return;
            case 2:
                ((o1) obj).a(i15);
                return;
            case 3:
                o9 o9Var = (o9) obj;
                if (o9Var.f13925e.contains(Integer.valueOf(i15))) {
                    if (o9Var.f13925e.size() > 1) {
                        o9Var.f13925e.remove(Integer.valueOf(i15));
                    } else {
                        return;
                    }
                } else {
                    o9Var.f13925e.add(Integer.valueOf(i15));
                }
                org.telegram.messenger.g0.d0(o9Var.f13923b, new v2(o9Var, 24));
                return;
            case 4:
                q5 q5Var = ((o5) obj).f13333b;
                if (q5Var.f13433r && (u10Var = q5Var.f13431f) != null) {
                    u10Var.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((mh.e) obj).f19397b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 6:
                mh.a aVar = ((mh.h) obj).h;
                if (aVar != null) {
                    aVar.d(i15);
                    return;
                }
                return;
            case 7:
                ((c2) obj).Q.b4(i15);
                return;
            case 8:
                ((wm) obj).fa(i15);
                return;
            case 9:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            g0Var.Y1 = !g0Var.Y1;
                        }
                    } else {
                        g0Var.X1 = !g0Var.X1;
                    }
                } else {
                    g0Var.W1 = !g0Var.W1;
                }
                g0Var.Q1.O(true);
                g0Var.I0();
                return;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                boolean z16 = !zArr[i15];
                zArr[i15] = z16;
                ((org.telegram.ui.Cells.c2) view).c(z16, true);
                return;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z17 = ChatAttachAlertPhotoLayout.f31258r1;
                chatAttachAlertPhotoLayout.f38416b.S2.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f31304x.U(null, null);
                return;
            case 12:
                ((x20) obj).f40192j1.x(i15, true);
                return;
            case 13:
                x20 x20Var = (x20) ((w10) obj).d;
                x20Var.J0(i15);
                x20Var.dismiss();
                return;
            case 14:
                ((r80) obj).S.i1(i15 + 8);
                return;
            case 15:
                lb0 lb0Var = (lb0) obj;
                if (lb0Var.f35679e.getAdapter() instanceof yw) {
                    ey eyVar = ((yw) lb0Var.f35679e.getAdapter()).f40840c;
                    if ((i15 != 1 && i15 != 2) || !eyVar.f33593x1) {
                        z10 = false;
                        if (i15 == 0 && eyVar.f33589w1) {
                            eyVar.P(true, true, false);
                            return;
                        }
                    } else {
                        if (i15 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        eyVar.P(true, false, z11);
                        return;
                    }
                } else {
                    z10 = false;
                }
                lb0Var.f35679e.x(i15, z10);
                return;
            case 16:
                i4 i4Var = (i4) obj;
                EditTextBoldCursor editTextBoldCursor = i4Var.k1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                i4Var.f34585l1.a(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                i4Var.dismiss();
                return;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i15, scrollSlidingTextTabStrip.f31593a.indexOfChild(view));
                return;
            case 18:
                final ws0 ws0Var = (ws0) obj;
                tp0 tp0Var = ws0Var.f40068a0;
                hs0 hs0Var = ws0Var.U;
                e6 e6Var = ws0Var.I1;
                long j10 = ws0Var.m1;
                SparseArray[] sparseArrayArr = ws0Var.f40077c1;
                d2 d2Var = ws0Var.f40142y1;
                if (i15 == 101) {
                    if (!ws0.z0(ws0Var.getSelectedTab()) && ws0Var.getSelectedTab() != 13) {
                        if (ws0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = d2Var.getMessagesController().G1().f24441j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                long j11 = ((mv) arrayList2.get(i18)).f24264a;
                                if (hs0Var.f34498x.contains(Long.valueOf(j11))) {
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            String str = "";
                            if (!arrayList3.isEmpty()) {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                if (longValue == d2Var.getUserConfig().e()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i19 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z13 = z14;
                                if (i19 < 0) {
                                    TLRPC.Chat M03 = d2Var.getMessagesController().M0(Long.valueOf(-longValue));
                                    z13 = z14;
                                    if (M03 != null) {
                                        str = M03.title;
                                        z13 = z14;
                                    }
                                } else if (i19 >= 0) {
                                    TLRPC.User a22 = d2Var.getMessagesController().a2(l10);
                                    z13 = z14;
                                    if (a22 != null) {
                                        if (l10.s(a22)) {
                                            str = bd.M0(2131754252, null);
                                            z13 = z14;
                                        } else {
                                            str = l10.p(a22);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), e6Var);
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i12 = 2131752081;
                                } else {
                                    i12 = 2131752077;
                                }
                                G = bd.a0(null, null, i12, str);
                            } else {
                                G = bd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = G;
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i11 = 2131752082;
                                } else {
                                    i11 = 2131752083;
                                }
                                G2 = bd.a0(null, null, i11, str);
                            } else {
                                G2 = bd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            s1Var.U = G2;
                            alertDialog$Builder.k(bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    ws0 ws0Var2 = ws0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var2.f40142y1;
                                            d2Var2.getMessagesController().P1().s(arrayList4, ws0Var2.m1);
                                            fc.a0(d2Var2).Q(2131624051, 36, org.telegram.messenger.bd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            ws0Var2.V(false);
                                            return;
                                        default:
                                            ws0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                                ws0Var2.f40142y1.getMessagesController().i0(((Long) arrayList4.get(i22)).longValue(), 0, null);
                                            }
                                            ws0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            d2Var.showDialog(s1Var);
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                r6.V(textView, k6.f28122q7, null);
                                return;
                            }
                            return;
                        }
                        if (m5.C(j10)) {
                            encryptedChat = d2Var.getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L)));
                            user = null;
                            M02 = null;
                        } else if (m5.E(j10)) {
                            user = d2Var.getMessagesController().a2(Long.valueOf(j10));
                            M02 = null;
                            encryptedChat = null;
                        } else {
                            M02 = d2Var.getMessagesController().M0(Long.valueOf(-j10));
                            user = null;
                            encryptedChat = null;
                        }
                        t4.y(d2Var, user, M02, encryptedChat, null, ws0Var.f40087f1, null, ws0Var.f40077c1, null, 0, 0, null, new uo0(ws0Var, 14), null, ws0Var.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (ws0Var.B0() && tp0Var != null && tp0Var.getCurrentList() != null) {
                            ei.k6 currentList = tp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((zi) sparseArrayArr[0].valueAt(i20)).f26871l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ws0Var.getContext(), e6Var);
                                if (arrayList4.size() > 1) {
                                    i10 = 2131751561;
                                } else {
                                    i10 = 2131751565;
                                }
                                String M04 = bd.M0(i10, null);
                                s1 s1Var2 = alertDialog$Builder2.f27343a;
                                s1Var2.S = M04;
                                s1Var2.U = bd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(bd.M0(2131751599, null), new hr(ws0Var, currentList, arrayList4));
                                alertDialog$Builder2.h(bd.M0(2131752589, null), new lf0(9));
                                s1Var2.show();
                                s1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList5 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((zi) sparseArrayArr[0].valueAt(i21)).f26871l;
                            if (storyItem2 != null) {
                                arrayList5.add(storyItem2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ws0Var.getContext(), e6Var);
                            if (arrayList5.size() > 1) {
                                i3 = 2131751490;
                            } else {
                                i3 = 2131751488;
                            }
                            String M05 = bd.M0(i3, null);
                            s1 s1Var3 = alertDialog$Builder3.f27343a;
                            s1Var3.S = M05;
                            s1Var3.U = bd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList42 = arrayList5;
                                    ws0 ws0Var2 = ws0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var2.f40142y1;
                                            d2Var2.getMessagesController().P1().s(arrayList42, ws0Var2.m1);
                                            fc.a0(d2Var2).Q(2131624051, 36, org.telegram.messenger.bd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                            ws0Var2.V(false);
                                            return;
                                        default:
                                            ws0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                                ws0Var2.f40142y1.getMessagesController().i0(((Long) arrayList42.get(i22)).longValue(), 0, null);
                                            }
                                            ws0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(bd.M0(2131752589, null), new lf0(10));
                            s1Var3.show();
                            s1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i15 == 100) {
                    if (ws0Var.f40093h1 != null) {
                        hp messagesController = d2Var.getMessagesController();
                        TLRPC.UserFull userFull = ws0Var.f40093h1;
                        messagesController.getClass();
                        if (hp.K2(userFull)) {
                            l3 l3Var = ws0Var.H1;
                            if (l3Var != null) {
                                l3Var.u(bd.M0(2131750535, null));
                                ws0Var.H1.y(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (ws0Var.f40090g1 != null) {
                        TLRPC.Chat M06 = d2Var.getMessagesController().M0(Long.valueOf(ws0Var.f40090g1.f27002id));
                        if (d2Var.getMessagesController().o2(M06)) {
                            l3 l3Var2 = ws0Var.H1;
                            if (l3Var2 != null) {
                                if (t3.T(M06) && !M06.megagroup) {
                                    M0 = bd.M0(2131750537, null);
                                } else {
                                    M0 = bd.M0(2131750536, null);
                                }
                                l3Var2.u(M0);
                                ws0Var.H1.y(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (ws0Var.u0()) {
                        l3 l3Var3 = ws0Var.H1;
                        if (l3Var3 != null) {
                            l3Var3.u(bd.M0(2131750538, "ForwardsRestrictedInfoBot"));
                            ws0Var.H1.y(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    uw uwVar = new uw(bundle);
                    uwVar.D2 = new wo0(ws0Var);
                    d2Var.presentFragment(uwVar);
                    return;
                } else if (i15 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c2 = 0;
                        }
                        zi ziVar = (zi) sparseArrayArr[c2].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = zi.B0(ziVar.f26868k);
                        if (m5.C(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (m5.E(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat M07 = d2Var.getMessagesController().M0(Long.valueOf(-B0));
                            if (M07 != null && M07.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -M07.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", ziVar.f1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        wm wmVar = new wm(bundle2);
                        wmVar.f51273c8 = ziVar.f1();
                        long j12 = ws0Var.G;
                        if (j12 != 0) {
                            rg.c.a(wmVar, pr.a(B0, j12));
                            bundle2.putInt("message_id", ziVar.f1());
                        }
                        d2Var.presentFragment(wmVar, false);
                        return;
                    }
                    return;
                } else if (i15 == 103 || i15 == 104) {
                    if (ws0Var.getClosestTab() == 8) {
                        gr0 gr0Var = ws0Var.f40086f0;
                        if (gr0Var != null && gr0Var.f38550s != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList6.add(Integer.valueOf(((zi) sparseArrayArr[0].valueAt(i22)).f1()));
                            }
                            if (i15 != 103) {
                                z15 = false;
                            }
                            ws0Var.d1(arrayList6, z15);
                            ws0Var.V(false);
                            return;
                        }
                        return;
                    }
                    nv G1 = d2Var.getMessagesController().G1();
                    ArrayList arrayList7 = G1.f24441j;
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                        long j13 = ((mv) arrayList7.get(i23)).f24264a;
                        if (hs0Var.f34498x.contains(Long.valueOf(j13))) {
                            arrayList8.add(Long.valueOf(j13));
                        }
                    }
                    if (i15 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!G1.n(arrayList8, z12, true)) {
                        d2Var.showDialog(new vg.i0(33, d2Var.getCurrentAccount(), ws0Var.getContext(), d2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            rr0[] rr0VarArr = ws0Var.f40108n0;
                            if (i24 < rr0VarArr.length) {
                                rr0 rr0Var = rr0VarArr[i24];
                                if (rr0Var.F == 11) {
                                    rr0Var.f37791x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    ws0Var.V(true);
                    return;
                } else {
                    return;
                }
            case 19:
                s41 s41Var = (s41) obj;
                int i25 = s41Var.f37904b.f31554i.f36083q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                        h1.e().b(false);
                    }
                    s41Var.updateAppUpdateViews(i15, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                        h1 e10 = h1.e();
                        if (e10.f22826j) {
                            HttpGetFileTask httpGetFileTask = e10.f22828l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.f22826j = false;
                            hs.e().k(293, new Object[0]);
                        }
                    }
                    s41Var.updateAppUpdateViews(i15, true);
                    return;
                } else {
                    File g7 = org.telegram.messenger.t0.f25456a.g();
                    if (g7 != null) {
                        org.telegram.messenger.g0.t2(g7, "Telegram.apk", "application/vnd.android.package-archive", s41Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 20:
                ((org.telegram.ui.Components.voip.f0) obj).f39326b.x(i15, true);
                return;
            case 21:
                sb1 sb1Var = (sb1) obj;
                if (sb1Var.V == null && view.getAlpha() != 0.0f) {
                    sb1Var.c(i15, true);
                    return;
                }
                return;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 23:
                jx jxVar = (jx) obj;
                if (jxVar.f46704n != null && i15 != jxVar.f46706s) {
                    r31 r31Var = jxVar.f46705r;
                    if (r31Var != null) {
                        r31Var.f37640z = i15;
                    }
                    jxVar.b(i15, true);
                    jxVar.f46704n.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 24:
                y50 y50Var = (y50) obj;
                y50Var.R.dismiss();
                int i26 = y50Var.f52197d0;
                if (i26 >= 0) {
                    u2 u2Var = y50Var.f52198e0;
                    int[] iArr = u2Var.f25645c;
                    if (!u2Var.f25644b) {
                        u2Var.f25644b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = az.q().getInt(k2.p1.i(i27, "keep_media_type_"), u2.b(i27));
                        }
                    }
                    iArr[i26] = i15;
                    az.q().edit().putInt("keep_media_type_" + i26, i15).apply();
                    v50 v50Var = y50Var.f52199f0;
                    if (v50Var != null) {
                        v50Var.a(i15);
                        return;
                    }
                    return;
                }
                v50 v50Var2 = y50Var.f52199f0;
                if (v50Var2 != null) {
                    v50Var2.a(i15);
                    return;
                }
                return;
            case 25:
                ee0 ee0Var = (ee0) obj;
                ValueAnimator valueAnimator = ee0Var.f45622c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    fb1 fb1Var = ee0Var.f45622c;
                    if (!fb1Var.I) {
                        if (fb1Var.getCurrentPosition() == i15) {
                            d2 c02 = ee0Var.c0();
                            if (c02 instanceof de0) {
                                ((de0) c02).v();
                                return;
                            }
                            return;
                        }
                        ee0Var.s0(i15, true);
                        ee0Var.f45622c.D(i15);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                yj0 yj0Var = (yj0) obj;
                zi0 zi0Var = yj0Var.E1;
                yj0Var.T0 = i15;
                if (i15 == 1) {
                    yj0Var.f52307j0 = yj0Var.f52303h0;
                } else if (i15 == 4) {
                    yj0Var.f52307j0 = yj0Var.f52305i0;
                } else if (i15 == 2) {
                    yj0Var.f52307j0 = yj0Var.f52299f0;
                } else if (i15 == 3) {
                    yj0Var.f52307j0 = yj0Var.f52301g0;
                } else {
                    yj0Var.f52307j0 = yj0Var.f52296e0;
                }
                wv wvVar = (wv) view.getTag();
                PhotoViewer.v1().N2(null, yj0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(yj0Var.k1);
                    PhotoViewer.v1().f2(arrayList9, 0, zi0Var);
                    return;
                } else if (i15 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(yj0Var.m1);
                    PhotoViewer.v1().f2(arrayList10, 0, zi0Var);
                    return;
                } else if (i15 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(yj0Var.f52314n1);
                    PhotoViewer.v1().f2(arrayList11, 0, zi0Var);
                    return;
                } else if (i15 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList12 = yj0Var.f52308j1;
                    v12.f2(arrayList12, arrayList12.indexOf(wvVar), zi0Var);
                    return;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList13 = yj0Var.f52311l1;
                    v13.f2(arrayList13, arrayList13.indexOf(wvVar), zi0Var);
                    return;
                }
            case 27:
                hm0 hm0Var = (hm0) obj;
                f1 f1Var = hm0Var.J;
                if (f1Var != null && f1Var.isShowing()) {
                    hm0Var.J.d(true);
                }
                if (i15 == 0) {
                    t4.K(hm0Var.getParentActivity(), hm0Var.G.a(), new dm0(hm0Var, 2));
                    return;
                }
                hm0Var.a0(hm0Var.f45936b, hm0Var.f45937c, true, 0);
                hm0Var.finishFragment();
                return;
            case 28:
                sm0 sm0Var = (sm0) obj;
                f1 f1Var2 = sm0Var.f49556n0;
                if (f1Var2 != null && f1Var2.isShowing()) {
                    sm0Var.f49556n0.d(true);
                }
                if (i15 == 0) {
                    t4.K(sm0Var.getParentActivity(), sm0Var.V.a(), new lm0(sm0Var, 1));
                    return;
                } else {
                    sm0Var.j0(0, true);
                    return;
                }
            default:
                zi ziVar2 = (zi) obj;
                int i28 = PopupNotificationActivity.f41618c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.h3(new yj(yy.C(i15), zi.B0(ziVar2.f26868k), ziVar2.f1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
        }
    }

    public q(Object obj, int i3, int i10) {
        this.f3823a = i10;
        this.f3825c = obj;
        this.f3824b = i3;
    }
}
