package ai;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import bi.v1;
import bi.w1;
import di.j6;
import fi.m3;
import fi.o9;
import fi.q5;
import fi.s5;
import java.io.File;
import java.util.ArrayList;
import li.b2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.c20;
import org.telegram.messenger.ew;
import org.telegram.messenger.gz;
import org.telegram.messenger.hk;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u2;
import org.telegram.messenger.uv;
import org.telegram.messenger.vv;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.k4;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.y41;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.b60;
import org.telegram.ui.bk0;
import org.telegram.ui.c30;
import org.telegram.ui.cj0;
import org.telegram.ui.e60;
import org.telegram.ui.ie0;
import org.telegram.ui.im0;
import org.telegram.ui.je0;
import org.telegram.ui.mm0;
import org.telegram.ui.mx;
import org.telegram.ui.nb1;
import org.telegram.ui.qm0;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.ww;
import org.telegram.ui.xm0;
import org.telegram.ui.zb1;
public final class v implements View.OnClickListener {
    public final int f1652a;
    public final int f1653b;
    public final Object f1654c;

    public v(int i7, ij ijVar) {
        this.f1652a = 29;
        this.f1653b = i7;
        this.f1654c = ijVar;
    }

    @Override
    public final void onClick(View view) {
        c20 c20Var;
        boolean z9;
        boolean z10;
        boolean z11;
        String M0;
        int i7;
        int i10;
        TLRPC.Chat M02;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z12;
        String G;
        String G2;
        int i11;
        int i12;
        boolean z13;
        int i13 = this.f1652a;
        int i14 = 1;
        char c10 = 1;
        boolean z14 = true;
        Object obj = this.f1654c;
        int i15 = this.f1653b;
        switch (i13) {
            case 0:
                q0 q0Var = ((w) obj).h;
                v4.s sVar = q0Var.d;
                ArrayList arrayList = q0Var.f1676n;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    q0Var.f1679w = true;
                    q0Var.h.a(i15, true);
                    int i16 = ((t) arrayList.get(i15)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i16) == null && Math.abs(i16 - L0) > q0Var.f1677r * 9) || !iz.c()) {
                        q0Var.f1673c.C0();
                        ri0 ri0Var = q0Var.f1675f;
                        if (L0 < i16) {
                            i14 = 0;
                        }
                        ri0Var.f37673b = i14;
                        ri0Var.d(i16, 0, false, false);
                        return;
                    }
                    v4.c0 c0Var = new v4.c0(q0Var.getContext());
                    c0Var.f57213a = ((t) arrayList.get(i15)).d;
                    sVar.w0(c0Var);
                    return;
                }
                return;
            case 1:
                v1 v1Var = ((w1) obj).f4936b2;
                int i17 = v1.f4860w;
                v1Var.a(i15);
                return;
            case 2:
                ((v1) obj).a(i15);
                return;
            case 3:
                o9 o9Var = (o9) obj;
                if (o9Var.f11669e.contains(Integer.valueOf(i15))) {
                    if (o9Var.f11669e.size() > 1) {
                        o9Var.f11669e.remove(Integer.valueOf(i15));
                    } else {
                        return;
                    }
                } else {
                    o9Var.f11669e.add(Integer.valueOf(i15));
                }
                org.telegram.messenger.g0.d0(o9Var.f11667b, new i(o9Var, 21));
                return;
            case 4:
                s5 s5Var = ((q5) obj).f12663b;
                if (s5Var.f12796r && (c20Var = s5Var.f12794f) != null) {
                    c20Var.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f18358b[i15];
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
                ((b2) obj).P.b4(i15);
                return;
            case 8:
                ((an) obj).fa(i15);
                return;
            case 9:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            i0Var.X1 = !i0Var.X1;
                        }
                    } else {
                        i0Var.W1 = !i0Var.W1;
                    }
                } else {
                    i0Var.V1 = !i0Var.V1;
                }
                i0Var.P1.O(true);
                i0Var.I0();
                return;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                boolean z15 = !zArr[i15];
                zArr[i15] = z15;
                ((c2) view).c(z15, true);
                return;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z16 = ChatAttachAlertPhotoLayout.f31188q1;
                chatAttachAlertPhotoLayout.f39004b.R2.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f31233x.U(null, null);
                return;
            case 12:
                ((c30) obj).f32015i1.x(i15, true);
                return;
            case 13:
                c30 c30Var = (c30) ((a20) obj).d;
                c30Var.J0(i15);
                c30Var.dismiss();
                return;
            case 14:
                ((u80) obj).R.i1(i15 + 8);
                return;
            case 15:
                qb0 qb0Var = (qb0) obj;
                if (qb0Var.f37278e.getAdapter() instanceof ax) {
                    hy hyVar = ((ax) qb0Var.f37278e.getAdapter()).f31937c;
                    if ((i15 != 1 && i15 != 2) || !hyVar.f34462w1) {
                        z9 = false;
                        if (i15 == 0 && hyVar.f34458v1) {
                            hyVar.P(true, true, false);
                            return;
                        }
                    } else {
                        if (i15 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        hyVar.P(true, false, z10);
                        return;
                    }
                } else {
                    z9 = false;
                }
                qb0Var.f37278e.x(i15, z9);
                return;
            case 16:
                k4 k4Var = (k4) obj;
                EditTextBoldCursor editTextBoldCursor = k4Var.f32215j1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                k4Var.f35185k1.a(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                k4Var.dismiss();
                return;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i15, scrollSlidingTextTabStrip.f31521a.indexOfChild(view));
                return;
            case 18:
                final xs0 xs0Var = (xs0) obj;
                sp0 sp0Var = xs0Var.W;
                is0 is0Var = xs0Var.T;
                f6 f6Var = xs0Var.H1;
                long j3 = xs0Var.l1;
                SparseArray[] sparseArrayArr = xs0Var.f40396b1;
                f2 f2Var = xs0Var.f40461x1;
                if (i15 == 101) {
                    if (!xs0.z0(xs0Var.getSelectedTab()) && xs0Var.getSelectedTab() != 13) {
                        if (xs0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = f2Var.getMessagesController().G1().f26218j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                long j10 = ((uv) arrayList2.get(i18)).f25896a;
                                if (is0Var.f34820x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (!arrayList3.isEmpty()) {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                if (longValue == f2Var.getUserConfig().e()) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int i19 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z12 = z13;
                                if (i19 < 0) {
                                    TLRPC.Chat M03 = f2Var.getMessagesController().M0(Long.valueOf(-longValue));
                                    z12 = z13;
                                    if (M03 != null) {
                                        str = M03.title;
                                        z12 = z13;
                                    }
                                } else if (i19 >= 0) {
                                    TLRPC.User a22 = f2Var.getMessagesController().a2(l10);
                                    z12 = z13;
                                    if (a22 != null) {
                                        if (t10.s(a22)) {
                                            str = id.M0(2131754252, null);
                                            z12 = z13;
                                        } else {
                                            str = t10.p(a22);
                                            z12 = z13;
                                        }
                                    }
                                }
                            } else {
                                z12 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, xs0Var.getContext(), f6Var);
                            if (arrayList3.size() == 1) {
                                if (z12) {
                                    i12 = 2131752081;
                                } else {
                                    i12 = 2131752077;
                                }
                                G = id.a0(null, null, i12, str);
                            } else {
                                G = id.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            u1 u1Var = alertDialog$Builder.f27296a;
                            u1Var.R = G;
                            if (arrayList3.size() == 1) {
                                if (z12) {
                                    i11 = 2131752082;
                                } else {
                                    i11 = 2131752083;
                                }
                                G2 = id.a0(null, null, i11, str);
                            } else {
                                G2 = id.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            u1Var.T = G2;
                            alertDialog$Builder.k(id.M0(2131746322, null), new r1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    xs0 xs0Var2 = xs0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.f2 f2Var2 = xs0Var2.f40461x1;
                                            f2Var2.getMessagesController().P1().s(arrayList4, xs0Var2.l1);
                                            hc.a0(f2Var2).Q(2131624051, 36, org.telegram.messenger.id.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            xs0Var2.V(false);
                                            return;
                                        default:
                                            xs0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                                xs0Var2.f40461x1.getMessagesController().i0(((Long) arrayList4.get(i22)).longValue(), 0, null);
                                            }
                                            xs0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(id.M0(2131752589, null), null);
                            f2Var.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                r6.V(textView, k6.f28093q7, null);
                                return;
                            }
                            return;
                        }
                        if (m5.C(j3)) {
                            encryptedChat = f2Var.getMessagesController().a1(Integer.valueOf((int) (j3 & 4294967295L)));
                            user = null;
                            M02 = null;
                        } else if (m5.E(j3)) {
                            user = f2Var.getMessagesController().a2(Long.valueOf(j3));
                            M02 = null;
                            encryptedChat = null;
                        } else {
                            M02 = f2Var.getMessagesController().M0(Long.valueOf(-j3));
                            user = null;
                            encryptedChat = null;
                        }
                        v4.y(f2Var, user, M02, encryptedChat, null, xs0Var.f40406e1, null, xs0Var.f40396b1, null, 0, 0, null, new so0(xs0Var, 14), null, xs0Var.H1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (xs0Var.B0() && sp0Var != null && sp0Var.getCurrentList() != null) {
                            j6 currentList = sp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((ij) sparseArrayArr[0].valueAt(i20)).f23266l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, xs0Var.getContext(), f6Var);
                                if (arrayList4.size() > 1) {
                                    i10 = 2131751561;
                                } else {
                                    i10 = 2131751565;
                                }
                                String M04 = id.M0(i10, null);
                                u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.R = M04;
                                u1Var2.T = id.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(id.M0(2131751599, null), new hr(xs0Var, currentList, arrayList4));
                                alertDialog$Builder2.h(id.M0(2131752589, null), new il0(8));
                                u1Var2.show();
                                u1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList5 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((ij) sparseArrayArr[0].valueAt(i21)).f23266l;
                            if (storyItem2 != null) {
                                arrayList5.add(storyItem2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, xs0Var.getContext(), f6Var);
                            if (arrayList5.size() > 1) {
                                i7 = 2131751490;
                            } else {
                                i7 = 2131751488;
                            }
                            String M05 = id.M0(i7, null);
                            u1 u1Var3 = alertDialog$Builder3.f27296a;
                            u1Var3.R = M05;
                            u1Var3.T = id.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(id.M0(2131751599, null), new r1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList42 = arrayList5;
                                    xs0 xs0Var2 = xs0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.f2 f2Var2 = xs0Var2.f40461x1;
                                            f2Var2.getMessagesController().P1().s(arrayList42, xs0Var2.l1);
                                            hc.a0(f2Var2).Q(2131624051, 36, org.telegram.messenger.id.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                            xs0Var2.V(false);
                                            return;
                                        default:
                                            xs0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                                xs0Var2.f40461x1.getMessagesController().i0(((Long) arrayList42.get(i22)).longValue(), 0, null);
                                            }
                                            xs0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(id.M0(2131752589, null), new il0(9));
                            u1Var3.show();
                            u1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i15 == 100) {
                    if (xs0Var.f40413g1 != null) {
                        qp messagesController = f2Var.getMessagesController();
                        TLRPC.UserFull userFull = xs0Var.f40413g1;
                        messagesController.getClass();
                        if (qp.K2(userFull)) {
                            m3 m3Var = xs0Var.G1;
                            if (m3Var != null) {
                                m3Var.u(id.M0(2131750535, null));
                                xs0Var.G1.y(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (xs0Var.f40410f1 != null) {
                        TLRPC.Chat M06 = f2Var.getMessagesController().M0(Long.valueOf(xs0Var.f40410f1.f26957id));
                        if (f2Var.getMessagesController().o2(M06)) {
                            m3 m3Var2 = xs0Var.G1;
                            if (m3Var2 != null) {
                                if (t3.T(M06) && !M06.megagroup) {
                                    M0 = id.M0(2131750537, null);
                                } else {
                                    M0 = id.M0(2131750536, null);
                                }
                                m3Var2.u(M0);
                                xs0Var.G1.y(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (xs0Var.u0()) {
                        m3 m3Var3 = xs0Var.G1;
                        if (m3Var3 != null) {
                            m3Var3.u(id.M0(2131750538, "ForwardsRestrictedInfoBot"));
                            xs0Var.G1.y(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    ww wwVar = new ww(bundle);
                    wwVar.C2 = new uo0(xs0Var);
                    f2Var.presentFragment(wwVar);
                    return;
                } else if (i15 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        ij ijVar = (ij) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = ij.B0(ijVar.f23262k);
                        if (m5.C(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (m5.E(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat M07 = f2Var.getMessagesController().M0(Long.valueOf(-B0));
                            if (M07 != null && M07.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -M07.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", ijVar.f1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        an anVar = new an(bundle2);
                        anVar.f43745b8 = ijVar.f1();
                        long j11 = xs0Var.F;
                        if (j11 != 0) {
                            qg.d.a(anVar, xr.a(B0, j11));
                            bundle2.putInt("message_id", ijVar.f1());
                        }
                        f2Var.presentFragment(anVar, false);
                        return;
                    }
                    return;
                } else if (i15 == 103 || i15 == 104) {
                    if (xs0Var.getClosestTab() == 8) {
                        gr0 gr0Var = xs0Var.f40405e0;
                        if (gr0Var != null && gr0Var.f38732s != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList6.add(Integer.valueOf(((ij) sparseArrayArr[0].valueAt(i22)).f1()));
                            }
                            if (i15 != 103) {
                                z14 = false;
                            }
                            xs0Var.d1(arrayList6, z14);
                            xs0Var.V(false);
                            return;
                        }
                        return;
                    }
                    vv G1 = f2Var.getMessagesController().G1();
                    ArrayList arrayList7 = G1.f26218j;
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                        long j12 = ((uv) arrayList7.get(i23)).f25896a;
                        if (is0Var.f34820x.contains(Long.valueOf(j12))) {
                            arrayList8.add(Long.valueOf(j12));
                        }
                    }
                    if (i15 == 103) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!G1.n(arrayList8, z11, true)) {
                        f2Var.showDialog(new ug.i0(33, f2Var.getCurrentAccount(), xs0Var.getContext(), f2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            sr0[] sr0VarArr = xs0Var.m0;
                            if (i24 < sr0VarArr.length) {
                                sr0 sr0Var = sr0VarArr[i24];
                                if (sr0Var.E == 11) {
                                    sr0Var.f38130x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    xs0Var.V(true);
                    return;
                } else {
                    return;
                }
            case 19:
                y41 y41Var = (y41) obj;
                int i25 = y41Var.f40569b.f31482i.f36856q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25565a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    y41Var.updateAppUpdateViews(i15, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25565a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.f22789j) {
                            HttpGetFileTask httpGetFileTask = e10.f22791l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.f22789j = false;
                            qs.e().k(293, new Object[0]);
                        }
                    }
                    y41Var.updateAppUpdateViews(i15, true);
                    return;
                } else {
                    File g10 = org.telegram.messenger.t0.f25565a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", y41Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 20:
                ((org.telegram.ui.Components.voip.t0) obj).f39531b.x(i15, true);
                return;
            case 21:
                zb1 zb1Var = (zb1) obj;
                if (zb1Var.U == null && view.getAlpha() != 0.0f) {
                    zb1Var.c(i15, true);
                    return;
                }
                return;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 23:
                mx mxVar = (mx) obj;
                if (mxVar.f47899n != null && i15 != mxVar.f47901s) {
                    x31 x31Var = mxVar.f47900r;
                    if (x31Var != null) {
                        x31Var.f40193z = i15;
                    }
                    mxVar.b(i15, true);
                    mxVar.f47899n.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 24:
                e60 e60Var = (e60) obj;
                e60Var.Q.dismiss();
                int i26 = e60Var.f45204c0;
                if (i26 >= 0) {
                    u2 u2Var = e60Var.f45205d0;
                    int[] iArr = u2Var.f25725c;
                    if (!u2Var.f25724b) {
                        u2Var.f25724b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = iz.q().getInt(jg.g.j(i27, "keep_media_type_"), u2.b(i27));
                        }
                    }
                    iArr[i26] = i15;
                    iz.q().edit().putInt("keep_media_type_" + i26, i15).apply();
                    b60 b60Var = e60Var.f45206e0;
                    if (b60Var != null) {
                        b60Var.a(i15);
                        return;
                    }
                    return;
                }
                b60 b60Var2 = e60Var.f45206e0;
                if (b60Var2 != null) {
                    b60Var2.a(i15);
                    return;
                }
                return;
            case 25:
                je0 je0Var = (je0) obj;
                ValueAnimator valueAnimator = je0Var.f48363c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    nb1 nb1Var = je0Var.f48363c;
                    if (!nb1Var.H) {
                        if (nb1Var.getCurrentPosition() == i15) {
                            f2 c02 = je0Var.c0();
                            if (c02 instanceof ie0) {
                                ((ie0) c02).v();
                                return;
                            }
                            return;
                        }
                        je0Var.s0(i15, true);
                        je0Var.f48363c.E(i15);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                bk0 bk0Var = (bk0) obj;
                cj0 cj0Var = bk0Var.D1;
                bk0Var.S0 = i15;
                if (i15 == 1) {
                    bk0Var.f44383i0 = bk0Var.f44379g0;
                } else if (i15 == 4) {
                    bk0Var.f44383i0 = bk0Var.f44381h0;
                } else if (i15 == 2) {
                    bk0Var.f44383i0 = bk0Var.f44374e0;
                } else if (i15 == 3) {
                    bk0Var.f44383i0 = bk0Var.f44377f0;
                } else {
                    bk0Var.f44383i0 = bk0Var.f44371d0;
                }
                ew ewVar = (ew) view.getTag();
                PhotoViewer.p1().H2(null, bk0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(bk0Var.f44386j1);
                    PhotoViewer.p1().a2(arrayList9, 0, cj0Var);
                    return;
                } else if (i15 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(bk0Var.l1);
                    PhotoViewer.p1().a2(arrayList10, 0, cj0Var);
                    return;
                } else if (i15 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(bk0Var.f44390m1);
                    PhotoViewer.p1().a2(arrayList11, 0, cj0Var);
                    return;
                } else if (i15 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = bk0Var.f44384i1;
                    p12.a2(arrayList12, arrayList12.indexOf(ewVar), cj0Var);
                    return;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = bk0Var.f44388k1;
                    p13.a2(arrayList13, arrayList13.indexOf(ewVar), cj0Var);
                    return;
                }
            case 27:
                mm0 mm0Var = (mm0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = mm0Var.I;
                if (g1Var != null && g1Var.isShowing()) {
                    mm0Var.I.d(true);
                }
                if (i15 == 0) {
                    v4.I(mm0Var.getParentActivity(), mm0Var.F.a(), new im0(mm0Var, 2));
                    return;
                }
                mm0Var.a0(mm0Var.f47835b, mm0Var.f47836c, true, 0);
                mm0Var.finishFragment();
                return;
            case 28:
                xm0 xm0Var = (xm0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = xm0Var.m0;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    xm0Var.m0.d(true);
                }
                if (i15 == 0) {
                    v4.I(xm0Var.getParentActivity(), xm0Var.U.a(), new qm0(xm0Var, 1));
                    return;
                } else {
                    xm0Var.j0(0, true);
                    return;
                }
            default:
                ij ijVar2 = (ij) obj;
                int i28 = PopupNotificationActivity.f41592b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.h3(new hk(gz.C(i15), ij.B0(ijVar2.f23262k), ijVar2.f1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
        }
    }

    public v(Object obj, int i7, int i10) {
        this.f1652a = i10;
        this.f1654c = obj;
        this.f1653b = i7;
    }
}
