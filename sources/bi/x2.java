package bi;

import a8.r7;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import di.m8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.dd;
import org.telegram.ui.id;
import org.telegram.ui.je0;
import org.telegram.ui.k60;
import org.telegram.ui.l01;
import org.telegram.ui.n01;
import org.telegram.ui.n11;
import org.telegram.ui.nd;
import org.telegram.ui.s01;
import org.telegram.ui.vc1;
import org.telegram.ui.xd;
import org.telegram.ui.yw;
import org.telegram.ui.yy0;
import org.telegram.ui.z41;
public final class x2 implements View.OnClickListener {
    public final int f3979a;
    public final int f3980b;
    public final Object f3981c;
    public final Object d;

    public x2(int i7, View view, AtomicReference atomicReference) {
        this.f3979a = 24;
        this.f3980b = i7;
        this.f3981c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11;
        org.telegram.messenger.f0 f0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i12 = this.f3979a;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i14 = this.f3980b;
        Object obj = this.d;
        Object obj2 = this.f3981c;
        switch (i12) {
            case 0:
                m8 m8Var = (m8) obj2;
                Runnable runnable = (Runnable) obj;
                m8Var.getClass();
                if ((i14 & 15) != 0) {
                    i13 = 15;
                } else if ((i14 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(m8Var.f9047g & i13, i14, !TLObject.hasFlag(i7, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i15 = m8Var.f9047g;
                int i16 = flag | ((~i13) & i15);
                if (i15 != i16) {
                    m8Var.f9047g = i16;
                    m8Var.j(true);
                }
                runnable.run();
                return;
            case 1:
                wp0 wp0Var = (wp0) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                fp fpVar = wp0Var.G;
                fpVar.a(!fpVar.f34663a.f32441q, true);
                boolean z15 = fpVar.f34663a.f32441q;
                cc a02 = cc.a0(e2Var);
                if (z15) {
                    i10 = 2131624195;
                } else {
                    i10 = 2131624194;
                }
                if (z15) {
                    i11 = 2131750256;
                } else {
                    i11 = 2131750255;
                }
                a02.P(i10, hd.M0(i11, null)).j();
                wp0Var.d.h = Boolean.valueOf(z15);
                if (wp0Var.I >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(wp0Var.I, true);
                    wp0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = np.s1(i14).j1(wp0Var.f3609c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new v2(0, wp0Var, e2Var));
                return;
            case 2:
                vf.c.t((Context) obj2, "https://" + np.s1(i14).V2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 3:
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) obj;
                org.telegram.ui.ActionBar.w4 w4Var = ((org.telegram.ui.ActionBar.c5) obj2).f28492a;
                if (d5Var.t()) {
                    org.telegram.ui.ActionBar.j jVar = w4Var.W;
                    if (jVar == null || jVar.a()) {
                        d5Var.V(null, null);
                        return;
                    }
                    return;
                } else if (d5Var.B0) {
                    w4Var.y(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = w4Var.W;
                    if (jVar2 != null) {
                        jVar2.b(i14);
                        return;
                    }
                    return;
                }
            case 4:
                ma maVar = (ma) obj2;
                maVar.f30701e.a(true, true);
                np.s1(i14).U1().f(false, (ArrayList) obj, new ai.x1(maVar, i14, 4));
                return;
            case 5:
                ((ta) obj2).a(i14, ((sa) obj).h);
                return;
            case 6:
                xd xdVar = (xd) obj2;
                z41 z41Var = (z41) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (xdVar.C0 > currentTime) {
                        xdVar.Q0 = cc.a0(z41Var).Q(2131624292, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752952, di.t.w0(xdVar.C0 - currentTime)))).j();
                        return;
                    } else if (xdVar.O0 < np.s1(i14).S5) {
                        cc.a0(z41Var).M(xdVar.getContext().getResources().getDrawable(2131232753).mutate(), org.telegram.messenger.g0.U2(hd.G((int) np.s1(i14).S5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.f43426a0 = 1;
                        twoStepVerificationActivity.f43430c0 = hdVar;
                        ndVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, z41Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                an anVar = (an) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (anVar.f45278m1 != null && anVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 8:
                an anVar2 = (an) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (anVar2.f45382u5 != null && i14 < arrayList.size()) {
                    anVar2.db(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 9:
                ((ib0) obj2).setValue(i14);
                ((org.telegram.ui.Components.o2) obj).run();
                return;
            case 10:
                ((x0) obj2).c(new org.telegram.ui.Components.a2((ji.g) obj, i14, 5));
                return;
            case 11:
                qk qkVar = (qk) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                m60 F = m60.F(qkVar, e6Var, qkVar.f38694y);
                F.Q = true;
                F.c(2131232045, hd.M0(2131743137, null), new org.telegram.ui.f0(qkVar, i14, e6Var, 7), false);
                F.c(2131231778, hd.M0(2131743205, null), new kk(qkVar, 0), false);
                F.f37111s = 0;
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                return;
            case 12:
                rr rrVar = (rr) obj2;
                p41 p41Var = (p41) obj;
                if (rrVar.e1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rrVar.getContext());
                    String M0 = hd.M0(2131743719, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = hd.M0(2131743718, null);
                    alertDialog$Builder.k(hd.M0(2131747831, null), null);
                    t1Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rrVar.f39040s2;
                boolean z16 = !z14;
                tL_chatBannedRights.send_media = z16;
                tL_chatBannedRights.send_photos = z16;
                tL_chatBannedRights.send_videos = z16;
                tL_chatBannedRights.send_stickers = z16;
                tL_chatBannedRights.send_gifs = z16;
                tL_chatBannedRights.send_inline = z16;
                tL_chatBannedRights.send_games = z16;
                tL_chatBannedRights.send_audios = z16;
                tL_chatBannedRights.send_docs = z16;
                tL_chatBannedRights.send_voices = z16;
                tL_chatBannedRights.send_roundvideos = z16;
                tL_chatBannedRights.embed_links = z16;
                tL_chatBannedRights.send_polls = z16;
                tL_chatBannedRights.send_reactions = z16;
                rrVar.h1();
                p41Var.O(true);
                return;
            case 13:
                e30 e30Var = (e30) obj2;
                e30Var.f34180n = i14;
                e30Var.f34176b.e(false, view.getLeft());
                e30Var.f34177c.e(false, view.getRight());
                ((pr) obj).a(i14);
                e30Var.invalidate();
                return;
            case 14:
                bd0 bd0Var = (bd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = bd0Var.H1;
                org.telegram.ui.ActionBar.e2 e2Var2 = bd0Var.f33256t1;
                int i17 = bd0Var.A1;
                if (i14 >= i17 && i14 < bd0Var.B1) {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i17);
                } else {
                    int i18 = bd0Var.C1;
                    if (i14 >= i18 && i14 < bd0Var.D1) {
                        f0Var = (org.telegram.messenger.f0) bd0Var.G1.get(i14 - i18);
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (bd0Var.E1) {
                        int i19 = f0Var.f23399c;
                        if (i19 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(268435456);
                                e2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        } else if (i19 == 1) {
                            vf.c.t(e2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                            return;
                        } else if (i19 == 3) {
                            String c10 = f0Var.c(false);
                            if (!c10.startsWith("http")) {
                                c10 = "http://".concat(c10);
                            }
                            vf.c.t(e2Var2.getParentActivity(), c10);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{hd.M0(2131751767, null)}, new og.j(5, bd0Var, f0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    f0Var.d = !f0Var.d;
                    if (i14 >= bd0Var.A1 && i14 < bd0Var.B1) {
                        int i20 = 0;
                        while (true) {
                            if (i20 < arrayList2.size()) {
                                if (((org.telegram.messenger.f0) arrayList2.get(i20)).d) {
                                    z13 = true;
                                } else {
                                    i20++;
                                }
                            }
                        }
                        bd0Var.f33255s1.setEnabled(z13);
                        bd0Var.I0();
                    }
                    ((zc0) viewGroup).setChecked(f0Var.d);
                    return;
                }
                return;
            case 15:
                kr0 kr0Var = (kr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ys0 ys0Var = kr0Var.f36594f;
                org.telegram.ui.ActionBar.e2 e2Var3 = ys0Var.f42150y1;
                e2Var3.finishPreviewFragment();
                chat.left = false;
                kr0Var.E(false);
                kr0Var.s(i14);
                if (kr0Var.d.isEmpty()) {
                    ys0Var.P1(true);
                    ys0Var.N();
                }
                e2Var3.getNotificationCenter().k(201, Long.valueOf(-ys0Var.f42114m1));
                e2Var3.getMessagesController().n(chat.f28051id, e2Var3.getUserConfig().f(), null, e2Var3, new hh0(10, kr0Var, chat));
                return;
            case 16:
                ((d31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 17:
                yw.t0((yw) obj2, i14, (m60) obj);
                return;
            case 18:
                je0.d0((je0) obj2, i14, (m60) obj);
                return;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj;
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i21 = 0; i21 < 2; i21++) {
                    org.telegram.ui.Cells.i6 i6Var = i6VarArr[i21];
                    boolean z17 = zArr[0];
                    if (i21 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z17 == z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i6Var.f30439c.a(z12, true);
                }
                return;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((yy0) saveToGallerySettingsActivity.f43265s.get(i14)).f53784c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f43258a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 21:
                zw zwVar = (zw) obj;
                n11 n11Var = ((n01) obj2).f49356c;
                if (!zwVar.f42433e && !m10.i(n11Var.W).q()) {
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.x0(n11Var.f49375d1, n11Var.getContext(), n11Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i22 = 0;
                while (true) {
                    l01 l01Var = n11Var.f49386i0;
                    if (i22 < l01Var.getChildCount()) {
                        if ((l01Var.getChildAt(i22) instanceof s01) && (R = RecyclerView.R((view2 = l01Var.getChildAt(i22)))) >= 0 && n11Var.f49423z0.get(R) == i14) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    n11Var.i(num.intValue(), view2);
                }
                wu.J0(null, zwVar.f42431b, false, null, null);
                n11Var.C0.add(Long.valueOf(zwVar.f42431b.f28078id));
                n11Var.B(true, true, true);
                return;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.t5) obj2).setSelected(i14);
                return;
            case 23:
                hi.d dVar = (hi.d) obj2;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                if (!dVar.R) {
                    r7 r7Var = vc1.d;
                    if (r7Var != null && ((byte[]) r7Var.f619e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.f3980b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new k60(dVar, u2Var, i23, view, r7Var));
                        return;
                    }
                    a8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 24:
                gz.f23970p0 = i14;
                SharedPreferences.Editor edit = np.e1().edit();
                edit.putInt("searchEngineType", gz.f23970p0);
                edit.apply();
                ((l8) ((View) obj2)).w(org.telegram.ui.web.d1.a().f52586a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            default:
                tg.h1 h1Var = (tg.h1) obj2;
                h1Var.a(i14);
                h1Var.f57323b.x().i(i14 - 1, true);
                h1Var.f57323b.w((sg.h) obj);
                return;
        }
    }

    public x2(Object obj, int i7, Object obj2, int i10) {
        this.f3979a = i10;
        this.f3981c = obj;
        this.f3980b = i7;
        this.d = obj2;
    }

    public x2(Object obj, Object obj2, int i7, int i10) {
        this.f3979a = i10;
        this.f3981c = obj;
        this.d = obj2;
        this.f3980b = i7;
    }
}
