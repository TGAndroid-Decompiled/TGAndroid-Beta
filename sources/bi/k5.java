package bi;

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
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.nr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.bz0;
import org.telegram.ui.dd;
import org.telegram.ui.hd;
import org.telegram.ui.id;
import org.telegram.ui.ii;
import org.telegram.ui.le0;
import org.telegram.ui.m60;
import org.telegram.ui.nd;
import org.telegram.ui.o01;
import org.telegram.ui.q01;
import org.telegram.ui.q11;
import org.telegram.ui.v01;
import org.telegram.ui.wc1;
import org.telegram.ui.xd;
public final class k5 implements View.OnClickListener {
    public final int f3758a;
    public final int f3759b;
    public final Object f3760c;
    public final Object d;

    public k5(int i7, View view, AtomicReference atomicReference) {
        this.f3758a = 24;
        this.f3759b = i7;
        this.f3760c = view;
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
        int i12 = this.f3758a;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i14 = this.f3759b;
        Object obj = this.d;
        Object obj2 = this.f3760c;
        switch (i12) {
            case 0:
                di.p8 p8Var = (di.p8) obj2;
                Runnable runnable = (Runnable) obj;
                p8Var.getClass();
                if ((i14 & 15) != 0) {
                    i13 = 15;
                } else if ((i14 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(p8Var.f9509g & i13, i14, !TLObject.hasFlag(i7, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i15 = p8Var.f9509g;
                int i16 = flag | ((~i13) & i15);
                if (i15 != i16) {
                    p8Var.f9509g = i16;
                    p8Var.k(true);
                }
                runnable.run();
                return;
            case 1:
                fq0 fq0Var = (fq0) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                lp lpVar = fq0Var.G;
                lpVar.a(!lpVar.f37189a.f32938q, true);
                boolean z15 = lpVar.f37189a.f32938q;
                kc b02 = kc.b0(g2Var);
                if (z15) {
                    i10 = 2131624195;
                } else {
                    i10 = 2131624194;
                }
                if (z15) {
                    i11 = 2131750239;
                } else {
                    i11 = 2131750238;
                }
                b02.P(i10, gd.N0(i11, null)).j();
                fq0Var.d.h = Boolean.valueOf(z15);
                if (fq0Var.I >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(fq0Var.I, true);
                    fq0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = mp.u1(i14).l1(fq0Var.f4150c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new o1(1, fq0Var, g2Var));
                return;
            case 2:
                vf.c.t((Context) obj2, "https://" + mp.u1(i14).X2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 3:
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) obj;
                org.telegram.ui.ActionBar.z4 z4Var = ((org.telegram.ui.ActionBar.f5) obj2).f29016a;
                if (g5Var.t()) {
                    org.telegram.ui.ActionBar.j jVar = z4Var.W;
                    if (jVar == null || jVar.a()) {
                        g5Var.V(null, null);
                        return;
                    }
                    return;
                } else if (g5Var.B0) {
                    z4Var.B(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = z4Var.W;
                    if (jVar2 != null) {
                        jVar2.b(i14);
                        return;
                    }
                    return;
                }
            case 4:
                pa paVar = (pa) obj2;
                paVar.f31345e.a(true, true);
                mp.u1(i14).W1().f(false, (ArrayList) obj, new hi.a4(paVar, i14, 4));
                return;
            case 5:
                ((wa) obj2).a(i14, ((va) obj).h);
                return;
            case 6:
                xd xdVar = (xd) obj2;
                b51 b51Var = (b51) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (xdVar.C0 > currentTime) {
                        xdVar.Q0 = kc.b0(b51Var).Q(2131624292, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752940, di.t.x0(xdVar.C0 - currentTime)))).j();
                        return;
                    } else if (xdVar.O0 < mp.u1(i14).U5) {
                        kc.b0(b51Var).M(xdVar.getContext().getResources().getDrawable(2131232757).mutate(), org.telegram.messenger.g0.T2(gd.G((int) mp.u1(i14).U5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.f43998a0 = 1;
                        twoStepVerificationActivity.f44002c0 = hdVar;
                        ndVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, b51Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                bn bnVar = (bn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (bnVar.f46279m1 != null && bnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 8:
                bn bnVar2 = (bn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (bnVar2.f46396v5 != null && i14 < arrayList.size()) {
                    bnVar2.db(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 9:
                ((qb0) obj2).setValue(i14);
                ((org.telegram.ui.Components.w2) obj).run();
                return;
            case 10:
                ((b1) obj2).c(new ii((ji.g) obj, i14, 10));
                return;
            case 11:
                xk xkVar = (xk) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                x60 G = x60.G(xkVar, i6Var, xkVar.f42087y);
                G.T = true;
                G.c(2131232049, gd.N0(2131742886, null), new org.telegram.ui.f0(xkVar, i14, i6Var, 7), false);
                G.c(2131231782, gd.N0(2131742954, null), new rk(xkVar, 0), false);
                G.f41892s = 0;
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                return;
            case 12:
                xr xrVar = (xr) obj2;
                org.telegram.ui.Components.b51 b51Var2 = (org.telegram.ui.Components.b51) obj;
                if (xrVar.f1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xrVar.getContext());
                    String N0 = gd.N0(2131743472, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = gd.N0(2131743471, null);
                    alertDialog$Builder.k(gd.N0(2131747637, null), null);
                    t1Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = xrVar.f42154s2;
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
                xrVar.i1();
                b51Var2.O(true);
                return;
            case 13:
                m30 m30Var = (m30) obj2;
                m30Var.f37364n = i14;
                m30Var.f37360b.e(false, view.getLeft());
                m30Var.f37361c.e(false, view.getRight());
                ((nr) obj).a(i14);
                m30Var.invalidate();
                return;
            case 14:
                kd0 kd0Var = (kd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = kd0Var.H1;
                org.telegram.ui.ActionBar.g2 g2Var2 = kd0Var.f36711t1;
                int i17 = kd0Var.A1;
                if (i14 >= i17 && i14 < kd0Var.B1) {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i17);
                } else {
                    int i18 = kd0Var.C1;
                    if (i14 >= i18 && i14 < kd0Var.D1) {
                        f0Var = (org.telegram.messenger.f0) kd0Var.G1.get(i14 - i18);
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (kd0Var.E1) {
                        int i19 = f0Var.f23914c;
                        if (i19 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(268435456);
                                g2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        } else if (i19 == 1) {
                            vf.c.t(g2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                            return;
                        } else if (i19 == 3) {
                            String c10 = f0Var.c(false);
                            if (!c10.startsWith("http")) {
                                c10 = "http://".concat(c10);
                            }
                            vf.c.t(g2Var2.getParentActivity(), c10);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{gd.N0(2131751755, null)}, new og.j(5, kd0Var, f0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    f0Var.d = !f0Var.d;
                    if (i14 >= kd0Var.A1 && i14 < kd0Var.B1) {
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
                        kd0Var.f36710s1.setEnabled(z13);
                        kd0Var.J0();
                    }
                    ((id0) viewGroup).setChecked(f0Var.d);
                    return;
                }
                return;
            case 15:
                tr0 tr0Var = (tr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                it0 it0Var = tr0Var.f40139f;
                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var.f36166y1;
                g2Var3.finishPreviewFragment();
                chat.left = false;
                tr0Var.E(false);
                tr0Var.s(i14);
                if (tr0Var.d.isEmpty()) {
                    it0Var.P1(true);
                    it0Var.N();
                }
                g2Var3.getNotificationCenter().k(203, Long.valueOf(-it0Var.f36130m1));
                g2Var3.getMessagesController().n(chat.f28492id, g2Var3.getUserConfig().f(), null, g2Var3, new sh0(10, tr0Var, chat));
                return;
            case 16:
                ((o31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 17:
                bx.w0((bx) obj2, i14, (x60) obj);
                return;
            case 18:
                le0.g0((le0) obj2, i14, (x60) obj);
                return;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj;
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i21 = 0; i21 < 2; i21++) {
                    org.telegram.ui.Cells.j6 j6Var = j6VarArr[i21];
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
                    j6Var.f30965c.a(z12, true);
                }
                return;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((bz0) saveToGallerySettingsActivity.f43837s.get(i14)).f46674c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f43830a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 21:
                ex exVar = (ex) obj;
                q11 q11Var = ((q01) obj2).f51208c;
                if (!exVar.f34858e && !i10.i(q11Var.W).q()) {
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(q11Var.f51236d1, q11Var.getContext(), q11Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i22 = 0;
                while (true) {
                    o01 o01Var = q11Var.f51247i0;
                    if (i22 < o01Var.getChildCount()) {
                        if ((o01Var.getChildAt(i22) instanceof v01) && (R = RecyclerView.R((view2 = o01Var.getChildAt(i22)))) >= 0 && q11Var.f51284z0.get(R) == i14) {
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
                    q11Var.i(num.intValue(), view2);
                }
                bv.K0(null, exVar.f34856b, false, null, null);
                q11Var.C0.add(Long.valueOf(exVar.f34856b.f28519id));
                q11Var.B(true, true, true);
                return;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.j6) obj2).setSelected(i14);
                return;
            case 23:
                hi.e eVar = (hi.e) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!eVar.R) {
                    a8.r7 r7Var = wc1.d;
                    if (r7Var != null && ((byte[]) r7Var.f618e) != null) {
                        eVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.f3759b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new m60(eVar, w2Var, i23, view, r7Var));
                        return;
                    }
                    org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 24:
                bz.f23311p0 = i14;
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putInt("searchEngineType", bz.f23311p0);
                edit.apply();
                ((org.telegram.ui.Cells.m8) ((View) obj2)).w(org.telegram.ui.web.e1.a().f53361a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            default:
                tg.m1 m1Var = (tg.m1) obj2;
                m1Var.a(i14);
                m1Var.f58079b.x().i(i14 - 1, true);
                m1Var.f58079b.w((sg.h) obj);
                return;
        }
    }

    public k5(Object obj, int i7, Object obj2, int i10) {
        this.f3758a = i10;
        this.f3760c = obj;
        this.f3759b = i7;
        this.d = obj2;
    }

    public k5(Object obj, Object obj2, int i7, int i10) {
        this.f3758a = i10;
        this.f3760c = obj;
        this.d = obj2;
        this.f3759b = i7;
    }
}
