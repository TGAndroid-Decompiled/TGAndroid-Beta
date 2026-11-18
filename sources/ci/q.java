package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.g1;
import di.h1;
import fi.z5;
import hi.m3;
import hi.m9;
import hi.n5;
import hi.p5;
import java.io.File;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ov;
import org.telegram.messenger.pv;
import org.telegram.messenger.sr;
import org.telegram.messenger.v2;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.wb0;
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
    public final int f5745a;
    public final int f5746b;
    public final Object f5747c;

    public q(Object obj, int i7, int i10) {
        this.f5745a = i10;
        this.f5747c = obj;
        this.f5746b = i7;
    }

    @Override
    public final void onClick(View view) {
        x10 x10Var;
        boolean z10;
        boolean z11;
        boolean z12;
        String M0;
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
        int i13 = this.f5745a;
        int i14 = 1;
        char c10 = 1;
        boolean z15 = true;
        int i15 = this.f5746b;
        Object obj = this.f5747c;
        switch (i13) {
            case 0:
                h0 h0Var = ((r) obj).h;
                v4.t tVar = h0Var.d;
                ArrayList arrayList = h0Var.f5762n;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    h0Var.f5765w = true;
                    h0Var.h.a(i15, true);
                    int i16 = ((o) arrayList.get(i15)).d;
                    int L0 = tVar.L0();
                    if ((tVar.m(i16) == null && Math.abs(i16 - L0) > h0Var.f5763r * 9) || !bz.c()) {
                        h0Var.f5759c.C0();
                        l5 l5Var = h0Var.f5761f;
                        if (L0 < i16) {
                            i14 = 0;
                        }
                        l5Var.f29199b = i14;
                        l5Var.k(i16, 0, false, false);
                        return;
                    }
                    v4.d0 d0Var = new v4.d0(h0Var.getContext());
                    d0Var.f59067a = ((o) arrayList.get(i15)).d;
                    tVar.w0(d0Var);
                    return;
                }
                return;
            case 1:
                g1 g1Var = ((h1) obj).f8898f2;
                int i17 = g1.f8845w;
                g1Var.a(i15);
                return;
            case 2:
                ((g1) obj).a(i15);
                return;
            case 3:
                m9 m9Var = (m9) obj;
                if (m9Var.f15715e.contains(Integer.valueOf(i15))) {
                    if (m9Var.f15715e.size() > 1) {
                        m9Var.f15715e.remove(Integer.valueOf(i15));
                    } else {
                        return;
                    }
                } else {
                    m9Var.f15715e.add(Integer.valueOf(i15));
                }
                org.telegram.messenger.g0.d0(m9Var.f15713b, new ai.g0(m9Var, 26));
                return;
            case 4:
                p5 p5Var = ((n5) obj).f15099b;
                if (p5Var.f15234r && (x10Var = p5Var.f15232f) != null) {
                    x10Var.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f19855b[i15];
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
                ((z1) obj).Q.b4(i15);
                return;
            case 8:
                ((bn) obj).ha(i15);
                return;
            case 9:
                ((x10) obj).a(Integer.valueOf(i15));
                return;
            case 10:
                ((org.telegram.ui.Components.j) obj).a(Integer.valueOf(i15));
                return;
            case 11:
                org.telegram.ui.Components.o0 o0Var = (org.telegram.ui.Components.o0) obj;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            o0Var.f37916b2 = !o0Var.f37916b2;
                        }
                    } else {
                        o0Var.f37915a2 = !o0Var.f37915a2;
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
                boolean z17 = ChatAttachAlertPhotoLayout.f32762r1;
                chatAttachAlertPhotoLayout.f36766b.V2.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f32808x.V(null, null);
                return;
            case 14:
                ((g30) obj).f36984m1.x(i15, true);
                return;
            case 15:
                g30 g30Var = (g30) ((k20) obj).d;
                g30Var.K0(i15);
                g30Var.dismiss();
                return;
            case 16:
                ((i90) obj).S.k1(i15 + 8);
                return;
            case 17:
                bc0 bc0Var = (bc0) obj;
                if (bc0Var.f33656e.getAdapter() instanceof lx) {
                    ry ryVar = ((lx) bc0Var.f33656e.getAdapter()).f37256c;
                    if ((i15 != 1 && i15 != 2) || !ryVar.f39408x1) {
                        z10 = false;
                        if (i15 == 0 && ryVar.f39404w1) {
                            ryVar.Q(true, true, false);
                            return;
                        }
                    } else {
                        if (i15 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ryVar.Q(true, false, z11);
                        return;
                    }
                } else {
                    z10 = false;
                }
                bc0Var.f33656e.x(i15, z10);
                return;
            case 18:
                q4 q4Var = (q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                q4Var.f38692o1.a(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 19:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i15, scrollSlidingTextTabStrip.f33097a.indexOfChild(view));
                return;
            case 20:
                final gt0 gt0Var = (gt0) obj;
                dq0 dq0Var = gt0Var.f35568a0;
                rs0 rs0Var = gt0Var.U;
                i6 i6Var = gt0Var.I1;
                long j3 = gt0Var.f35606m1;
                SparseArray[] sparseArrayArr = gt0Var.f35577c1;
                h2 h2Var = gt0Var.f35642y1;
                if (i15 == 101) {
                    if (!gt0.z0(gt0Var.getSelectedTab()) && gt0Var.getSelectedTab() != 13) {
                        if (gt0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = h2Var.getMessagesController().I1().f26300j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                long j10 = ((ov) arrayList2.get(i18)).f26104a;
                                if (rs0Var.f39299x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (!arrayList3.isEmpty()) {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                if (longValue == h2Var.getUserConfig().e()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i19 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z13 = z14;
                                if (i19 < 0) {
                                    TLRPC.Chat O02 = h2Var.getMessagesController().O0(Long.valueOf(-longValue));
                                    z13 = z14;
                                    if (O02 != null) {
                                        str = O02.title;
                                        z13 = z14;
                                    }
                                } else if (i19 >= 0) {
                                    TLRPC.User c22 = h2Var.getMessagesController().c2(l10);
                                    z13 = z14;
                                    if (c22 != null) {
                                        if (o10.t(c22)) {
                                            str = gd.M0(2131754250, null);
                                            z13 = z14;
                                        } else {
                                            str = o10.q(c22);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), i6Var);
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i12 = 2131752070;
                                } else {
                                    i12 = 2131752066;
                                }
                                G = gd.a0(null, null, i12, str);
                            } else {
                                G = gd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            u1 u1Var = alertDialog$Builder.f28744a;
                            u1Var.S = G;
                            if (arrayList3.size() == 1) {
                                if (z13) {
                                    i11 = 2131752071;
                                } else {
                                    i11 = 2131752072;
                                }
                                G2 = gd.a0(null, null, i11, str);
                            } else {
                                G2 = gd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            u1Var.U = G2;
                            alertDialog$Builder.k(gd.M0(2131746126, null), new r1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    gt0 gt0Var2 = gt0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                            h2Var2.getMessagesController().R1().s(arrayList4, gt0Var2.f35606m1);
                                            lc.b0(h2Var2).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            gt0Var2.V(false);
                                            return;
                                        default:
                                            gt0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                                gt0Var2.f35642y1.getMessagesController().i0(((Long) arrayList4.get(i22)).longValue(), 0, null);
                                            }
                                            gt0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(gd.M0(2131752578, null), null);
                            h2Var.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                u6.U(textView, n6.f29635q7, null);
                                return;
                            }
                            return;
                        }
                        if (org.telegram.messenger.n5.C(j3)) {
                            encryptedChat = h2Var.getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L)));
                            user = null;
                            O0 = null;
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            user = h2Var.getMessagesController().c2(Long.valueOf(j3));
                            O0 = null;
                            encryptedChat = null;
                        } else {
                            O0 = h2Var.getMessagesController().O0(Long.valueOf(-j3));
                            user = null;
                            encryptedChat = null;
                        }
                        b5.y(h2Var, user, O0, encryptedChat, null, gt0Var.f35587f1, null, gt0Var.f35577c1, null, 0, 0, null, new fp0(gt0Var, 14), null, gt0Var.I1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (gt0Var.B0() && dq0Var != null && dq0Var.getCurrentList() != null) {
                            z5 currentList = dq0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((fj) sparseArrayArr[0].valueAt(i20)).f23970l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, gt0Var.getContext(), i6Var);
                                if (arrayList4.size() > 1) {
                                    i10 = 2131751549;
                                } else {
                                    i10 = 2131751553;
                                }
                                String M02 = gd.M0(i10, null);
                                u1 u1Var2 = alertDialog$Builder2.f28744a;
                                u1Var2.S = M02;
                                u1Var2.U = gd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(gd.M0(2131751587, null), new rm(gt0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(gd.M0(2131752578, null), new wb0(13));
                                u1Var2.show();
                                u1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList5 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((fj) sparseArrayArr[0].valueAt(i21)).f23970l;
                            if (storyItem2 != null) {
                                arrayList5.add(storyItem2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, gt0Var.getContext(), i6Var);
                            if (arrayList5.size() > 1) {
                                i7 = 2131751478;
                            } else {
                                i7 = 2131751476;
                            }
                            String M03 = gd.M0(i7, null);
                            u1 u1Var3 = alertDialog$Builder3.f28744a;
                            u1Var3.S = M03;
                            u1Var3.U = gd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(gd.M0(2131751587, null), new r1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList42 = arrayList5;
                                    gt0 gt0Var2 = gt0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                            h2Var2.getMessagesController().R1().s(arrayList42, gt0Var2.f35606m1);
                                            lc.b0(h2Var2).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                            gt0Var2.V(false);
                                            return;
                                        default:
                                            gt0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                                gt0Var2.f35642y1.getMessagesController().i0(((Long) arrayList42.get(i22)).longValue(), 0, null);
                                            }
                                            gt0Var2.V(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(gd.M0(2131752578, null), new wb0(14));
                            u1Var3.show();
                            u1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i15 == 100) {
                    if (gt0Var.f35593h1 != null) {
                        mp messagesController = h2Var.getMessagesController();
                        TLRPC.UserFull userFull = gt0Var.f35593h1;
                        messagesController.getClass();
                        if (mp.Q2(userFull)) {
                            m3 m3Var = gt0Var.H1;
                            if (m3Var != null) {
                                m3Var.v(gd.M0(2131750518, null));
                                gt0Var.H1.z(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (gt0Var.f35590g1 != null) {
                        TLRPC.Chat O03 = h2Var.getMessagesController().O0(Long.valueOf(gt0Var.f35590g1.f28404id));
                        if (h2Var.getMessagesController().r2(O03)) {
                            m3 m3Var2 = gt0Var.H1;
                            if (m3Var2 != null) {
                                if (v3.T(O03) && !O03.megagroup) {
                                    M0 = gd.M0(2131750520, null);
                                } else {
                                    M0 = gd.M0(2131750519, null);
                                }
                                m3Var2.v(M0);
                                gt0Var.H1.z(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (gt0Var.u0()) {
                        m3 m3Var3 = gt0Var.H1;
                        if (m3Var3 != null) {
                            m3Var3.v(gd.M0(2131750521, "ForwardsRestrictedInfoBot"));
                            gt0Var.H1.z(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    cx cxVar = new cx(bundle);
                    cxVar.E2 = new hp0(gt0Var);
                    h2Var.presentFragment(cxVar);
                    return;
                } else if (i15 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        fj fjVar = (fj) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = fj.B0(fjVar.f23965k);
                        if (org.telegram.messenger.n5.C(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (org.telegram.messenger.n5.E(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat O04 = h2Var.getMessagesController().O0(Long.valueOf(-B0));
                            if (O04 != null && O04.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -O04.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", fjVar.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        bn bnVar = new bn(bundle2);
                        bnVar.f45973d8 = fjVar.e1();
                        long j11 = gt0Var.G;
                        if (j11 != 0) {
                            qg.c.a(bnVar, sr.a(B0, j11));
                            bundle2.putInt("message_id", fjVar.e1());
                        }
                        h2Var.presentFragment(bnVar, false);
                        return;
                    }
                    return;
                } else if (i15 == 103 || i15 == 104) {
                    if (gt0Var.getClosestTab() == 8) {
                        qr0 qr0Var = gt0Var.f35586f0;
                        if (qr0Var != null && qr0Var.f34504s != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList6.add(Integer.valueOf(((fj) sparseArrayArr[0].valueAt(i22)).e1()));
                            }
                            if (i15 != 103) {
                                z15 = false;
                            }
                            gt0Var.f1(arrayList6, z15);
                            gt0Var.V(false);
                            return;
                        }
                        return;
                    }
                    pv I1 = h2Var.getMessagesController().I1();
                    ArrayList arrayList7 = I1.f26300j;
                    ArrayList arrayList8 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                        long j12 = ((ov) arrayList7.get(i23)).f26104a;
                        if (rs0Var.f39299x.contains(Long.valueOf(j12))) {
                            arrayList8.add(Long.valueOf(j12));
                        }
                    }
                    if (i15 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!I1.n(arrayList8, z12, true)) {
                        h2Var.showDialog(new ug.l0(33, h2Var.getCurrentAccount(), gt0Var.getContext(), h2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            bs0[] bs0VarArr = gt0Var.f35609n0;
                            if (i24 < bs0VarArr.length) {
                                bs0 bs0Var = bs0VarArr[i24];
                                if (bs0Var.F == 11) {
                                    bs0Var.f33775x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    gt0Var.V(true);
                    return;
                } else {
                    return;
                }
            case 21:
                l51 l51Var = (l51) obj;
                int i25 = l51Var.f37034b.f33058i.f34340q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26912a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    l51Var.updateAppUpdateViews(i15, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26912a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.f24347j) {
                            HttpGetFileTask httpGetFileTask = e10.f24349l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.f24347j = false;
                            ks.e().k(296, new Object[0]);
                        }
                    }
                    l51Var.updateAppUpdateViews(i15, true);
                    return;
                } else {
                    File g10 = org.telegram.messenger.t0.f26912a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", l51Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 22:
                ((org.telegram.ui.Components.voip.w0) obj).f41280b.x(i15, true);
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
                if (qxVar.f51314n != null && i15 != qxVar.f51316s) {
                    l41 l41Var = qxVar.f51315r;
                    if (l41Var != null) {
                        l41Var.A = i15;
                    }
                    qxVar.b(i15, true);
                    qxVar.f51314n.a(Integer.valueOf(i15));
                    return;
                }
                return;
            case 26:
                f60 f60Var = (f60) obj;
                f60Var.R.dismiss();
                int i26 = f60Var.f47540d0;
                if (i26 >= 0) {
                    v2 v2Var = f60Var.f47541e0;
                    int[] iArr = v2Var.f27319c;
                    if (!v2Var.f27318b) {
                        v2Var.f27318b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = bz.q().getInt(i5.c.i(i27, "keep_media_type_"), v2.b(i27));
                        }
                    }
                    iArr[i26] = i15;
                    bz.q().edit().putInt("keep_media_type_" + i26, i15).apply();
                    c60 c60Var = f60Var.f47542f0;
                    if (c60Var != null) {
                        c60Var.a(i15);
                        return;
                    }
                    return;
                }
                c60 c60Var2 = f60Var.f47542f0;
                if (c60Var2 != null) {
                    c60Var2.a(i15);
                    return;
                }
                return;
            case 27:
                me0 me0Var = (me0) obj;
                ValueAnimator valueAnimator = me0Var.f51153c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pb1 pb1Var = me0Var.f51153c;
                    if (!pb1Var.I) {
                        if (pb1Var.getCurrentPosition() == i15) {
                            h2 c02 = me0Var.c0();
                            if (c02 instanceof le0) {
                                ((le0) c02).v();
                                return;
                            }
                            return;
                        }
                        me0Var.s0(i15, true);
                        me0Var.f51153c.A(i15);
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
                    hk0Var.f48392j0 = hk0Var.f48388h0;
                } else if (i15 == 4) {
                    hk0Var.f48392j0 = hk0Var.f48390i0;
                } else if (i15 == 2) {
                    hk0Var.f48392j0 = hk0Var.f48384f0;
                } else if (i15 == 3) {
                    hk0Var.f48392j0 = hk0Var.f48386g0;
                } else {
                    hk0Var.f48392j0 = hk0Var.f48381e0;
                }
                yv yvVar = (yv) view.getTag();
                PhotoViewer.p1().I2(null, hk0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(hk0Var.f48395k1);
                    PhotoViewer.p1().b2(arrayList9, 0, ij0Var);
                    return;
                } else if (i15 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(hk0Var.f48397m1);
                    PhotoViewer.p1().b2(arrayList10, 0, ij0Var);
                    return;
                } else if (i15 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(hk0Var.n1);
                    PhotoViewer.p1().b2(arrayList11, 0, ij0Var);
                    return;
                } else if (i15 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = hk0Var.f48393j1;
                    p12.b2(arrayList12, arrayList12.indexOf(yvVar), ij0Var);
                    return;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = hk0Var.l1;
                    p13.b2(arrayList13, arrayList13.indexOf(yvVar), ij0Var);
                    return;
                }
            default:
                qm0 qm0Var = (qm0) obj;
                org.telegram.ui.ActionBar.h1 h1Var = qm0Var.J;
                if (h1Var != null && h1Var.isShowing()) {
                    qm0Var.J.d(true);
                }
                if (i15 == 0) {
                    b5.I(qm0Var.getParentActivity(), qm0Var.G.a(), new mm0(qm0Var, 2));
                    return;
                }
                qm0Var.a0(qm0Var.f51246b, qm0Var.f51247c, true, 0);
                qm0Var.finishFragment();
                return;
        }
    }
}
