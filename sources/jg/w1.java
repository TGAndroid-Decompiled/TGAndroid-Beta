package jg;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.cs;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.v5;
import org.telegram.ui.be;
import org.telegram.ui.e21;
import org.telegram.ui.g21;
import org.telegram.ui.g31;
import org.telegram.ui.i70;
import org.telegram.ui.l21;
import org.telegram.ui.le;
import org.telegram.ui.nd;
import org.telegram.ui.o01;
import org.telegram.ui.of0;
import org.telegram.ui.qe1;
import org.telegram.ui.rd;
import org.telegram.ui.s61;
import org.telegram.ui.sd;
import org.telegram.ui.sl0;
import org.telegram.ui.un;
import org.telegram.ui.zx;
public final class w1 implements View.OnClickListener {
    public final int f10341a;
    public final int f10342b;
    public final Object f10343c;
    public final Object d;

    public w1(int i10, View view, AtomicReference atomicReference) {
        this.f10341a = 21;
        this.f10342b = i10;
        this.f10343c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.messenger.h0 h0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i10;
        int i11;
        int i12;
        int i13 = this.f10341a;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f10342b;
        Object obj = this.d;
        Object obj2 = this.f10343c;
        switch (i13) {
            case 0:
                y1 y1Var = (y1) obj2;
                y1Var.a(i15);
                y1Var.f10373b.v().i(i15 - 1, true);
                y1Var.f10373b.z((ig.h) obj);
                return;
            case 1:
                p5 p5Var = (p5) obj;
                i5 i5Var = ((o5) obj2).f20626a;
                if (p5Var.s()) {
                    org.telegram.ui.ActionBar.k kVar = i5Var.V;
                    if (kVar == null || kVar.a()) {
                        p5Var.U(null, null);
                        return;
                    }
                    return;
                } else if (p5Var.A0) {
                    i5Var.w(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.k kVar2 = i5Var.V;
                    if (kVar2 != null) {
                        kVar2.b(i15);
                        return;
                    }
                    return;
                }
            case 2:
                ma maVar = (ma) obj2;
                maVar.e.a(true, true);
                wp.r1(i15).T1().f(false, (ArrayList) obj, new ag.s2(maVar, i15, 1));
                return;
            case 3:
                ((ua) obj2).a(i15, ((ta) obj).h);
                return;
            case 4:
                le leVar = (le) obj2;
                s61 s61Var = (s61) obj;
                be beVar = leVar.G0;
                if (view.isEnabled() && !beVar.Q && !leVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (leVar.B0 > currentTime) {
                        leVar.P0 = cc.a0(s61Var).Q(2131624289, 36, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131752952, rh.i.w0(leVar.B0 - currentTime)))).j();
                        return;
                    } else if (leVar.N0 < wp.r1(i15).S5) {
                        cc.a0(s61Var).M(leVar.getContext().getResources().getDrawable(2131232749).mutate(), org.telegram.messenger.i0.T2(dd.G((int) wp.r1(i15).S5, "BotStarsWithdrawMinLimit", new Object[0]), new nd(leVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(leVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34136b0 = rdVar;
                        beVar.setLoading(true);
                        twoStepVerificationActivity.x0(new sd(leVar, s61Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 5:
                un unVar = (un) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (unVar.l1 != null && unVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 6:
                un unVar2 = (un) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (unVar2.f42232t5 != null && i15 < arrayList.size()) {
                    unVar2.Va(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 7:
                ((ac0) obj2).setValue(i15);
                ((org.telegram.ui.Components.p2) obj).run();
                return;
            case 8:
                kk kkVar = (kk) obj2;
                p6 p6Var = (p6) obj;
                z60 F = z60.F(kkVar, p6Var, kkVar.f27888y);
                F.Q = true;
                F.c(2131232043, dd.L0(2131743163, null), new ag.o0(kkVar, i15, p6Var, 21), false);
                F.c(2131231777, dd.L0(2131743231, null), new ek(kkVar, 0), false);
                F.f33044s = 0;
                F.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
                F.Z();
                return;
            case 9:
                vr vrVar = (vr) obj2;
                q51 q51Var = (q51) obj;
                if (vrVar.e1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vrVar.getContext());
                    String L0 = dd.L0(2131743745, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = dd.L0(2131743744, null);
                    alertDialog$Builder.k(dd.L0(2131747847, null), null);
                    x1Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = vrVar.f31884o2;
                boolean z15 = !z13;
                tL_chatBannedRights.send_media = z15;
                tL_chatBannedRights.send_photos = z15;
                tL_chatBannedRights.send_videos = z15;
                tL_chatBannedRights.send_stickers = z15;
                tL_chatBannedRights.send_gifs = z15;
                tL_chatBannedRights.send_inline = z15;
                tL_chatBannedRights.send_games = z15;
                tL_chatBannedRights.send_audios = z15;
                tL_chatBannedRights.send_docs = z15;
                tL_chatBannedRights.send_voices = z15;
                tL_chatBannedRights.send_roundvideos = z15;
                tL_chatBannedRights.embed_links = z15;
                tL_chatBannedRights.send_polls = z15;
                tL_chatBannedRights.send_reactions = z15;
                vrVar.h1();
                q51Var.O(true);
                return;
            case 10:
                t30 t30Var = (t30) obj2;
                t30Var.f30512n = i15;
                t30Var.f30509b.e(false, view.getLeft());
                t30Var.f30510c.e(false, view.getRight());
                ((cs) obj).a(i15);
                t30Var.invalidate();
                return;
            case 11:
                vd0 vd0Var = (vd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = vd0Var.D1;
                org.telegram.ui.ActionBar.k2 k2Var = vd0Var.f31257p1;
                int i16 = vd0Var.f31264w1;
                if (i15 >= i16 && i15 < vd0Var.f31265x1) {
                    h0Var = (org.telegram.messenger.h0) arrayList2.get(i15 - i16);
                } else {
                    int i17 = vd0Var.f31266y1;
                    if (i15 >= i17 && i15 < vd0Var.f31267z1) {
                        h0Var = (org.telegram.messenger.h0) vd0Var.C1.get(i15 - i17);
                    } else {
                        h0Var = null;
                    }
                }
                if (h0Var != null) {
                    if (vd0Var.A1) {
                        int i18 = h0Var.f15993c;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + h0Var.c(false)));
                                intent.addFlags(268435456);
                                k2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                f8.g(e, true);
                                return;
                            }
                        } else if (i18 == 1) {
                            gf.f.r(k2Var.getParentActivity(), "mailto:" + h0Var.c(false));
                            return;
                        } else if (i18 == 3) {
                            String c10 = h0Var.c(false);
                            if (!c10.startsWith("http")) {
                                c10 = "http://".concat(c10);
                            }
                            gf.f.r(k2Var.getParentActivity(), c10);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{dd.L0(2131751767, null)}, new eg.j(6, vd0Var, h0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    h0Var.d = !h0Var.d;
                    if (i15 >= vd0Var.f31264w1 && i15 < vd0Var.f31265x1) {
                        int i19 = 0;
                        while (true) {
                            if (i19 < arrayList2.size()) {
                                if (((org.telegram.messenger.h0) arrayList2.get(i19)).d) {
                                    z14 = true;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        vd0Var.f31256o1.setEnabled(z14);
                        vd0Var.I0();
                    }
                    ((td0) viewGroup).setChecked(h0Var.d);
                    return;
                }
                return;
            case 12:
                ks0 ks0Var = (ks0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                au0 au0Var = ks0Var.f27954f;
                org.telegram.ui.ActionBar.k2 k2Var2 = au0Var.f24568x1;
                k2Var2.finishPreviewFragment();
                chat.left = false;
                ks0Var.E(false);
                ks0Var.s(i15);
                if (ks0Var.d.isEmpty()) {
                    au0Var.L1(true);
                    au0Var.M();
                }
                k2Var2.getNotificationCenter().k(201, Long.valueOf(-au0Var.l1));
                k2Var2.getMessagesController().n(chat.f19794id, k2Var2.getUserConfig().f(), null, k2Var2, new hi0(10, ks0Var, chat));
                return;
            case 13:
                ((c41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 14:
                zx.t0((zx) obj2, i15, (z60) obj);
                return;
            case 15:
                of0.g0((of0) obj2, i15, (z60) obj);
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                n6[] n6VarArr = (n6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    n6 n6Var = n6VarArr[i20];
                    boolean z16 = zArr[0];
                    if (i20 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z16 == z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    n6Var.f22362c.a(z12, true);
                }
                return;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.k1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((o01) saveToGallerySettingsActivity.f33980s.get(i15)).f40002c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f33974a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 18:
                ix ixVar = (ix) obj;
                g31 g31Var = ((g21) obj2).f37279c;
                if (!ixVar.e && !e20.i(g31Var.V).q()) {
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new kg.i1(g31Var.f37295c1, g31Var.getContext(), g31Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    e21 e21Var = g31Var.f37305h0;
                    if (i21 < e21Var.getChildCount()) {
                        if ((e21Var.getChildAt(i21) instanceof l21) && (R = RecyclerView.R((view2 = e21Var.getChildAt(i21)))) >= 0 && g31Var.f37343y0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i21++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    g31Var.i(num.intValue(), view2);
                }
                cv.J0(null, ixVar.f27193b, false, null, null);
                g31Var.B0.add(Long.valueOf(ixVar.f27193b.f19821id));
                g31Var.B(true, true, true);
                return;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i15));
                ((v5) obj2).setSelected(i15);
                return;
            case 20:
                vh.d dVar = (vh.d) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                if (!dVar.Q) {
                    bh.d dVar2 = qe1.d;
                    if (dVar2 != null && ((byte[]) dVar2.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f10342b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new a3.b(1), new i70(dVar, z2Var, i22, view, dVar2));
                        return;
                    }
                    f8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 21:
                uz.f18541p0 = i15;
                SharedPreferences.Editor edit = wp.d1().edit();
                edit.putInt("searchEngineType", uz.f18541p0);
                edit.apply();
                ((p8) ((View) obj2)).w(org.telegram.ui.web.g1.a().f42847a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 22:
                rh.v5 v5Var = (rh.v5) obj2;
                Runnable runnable = (Runnable) obj;
                v5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(v5Var.f47592g & i14, i15, !TLObject.hasFlag(i10, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = v5Var.f47592g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    v5Var.f47592g = i24;
                    v5Var.j(true);
                }
                runnable.run();
                return;
            case 23:
                wq0 wq0Var = (wq0) obj2;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj;
                ep epVar = wq0Var.F;
                epVar.a(!epVar.f25895a.f23920q, true);
                boolean z17 = epVar.f25895a.f23920q;
                cc a02 = cc.a0(k2Var3);
                if (z17) {
                    i11 = 2131624192;
                } else {
                    i11 = 2131624191;
                }
                if (z17) {
                    i12 = 2131750265;
                } else {
                    i12 = 2131750264;
                }
                a02.P(i11, dd.L0(i12, null)).j();
                wq0Var.d.h = Boolean.valueOf(z17);
                if (wq0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(wq0Var.H, true);
                    wq0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = wp.r1(i15).i1(wq0Var.f45141c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new sl0(21, wq0Var, k2Var3));
                return;
            default:
                gf.f.r((Context) obj2, "https://" + wp.r1(i15).U2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public w1(Object obj, int i10, Object obj2, int i11) {
        this.f10341a = i11;
        this.f10343c = obj;
        this.f10342b = i10;
        this.d = obj2;
    }

    public w1(Object obj, Object obj2, int i10, int i11) {
        this.f10341a = i11;
        this.f10343c = obj;
        this.d = obj2;
        this.f10342b = i10;
    }
}
