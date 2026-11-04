package ai;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b8.ke;
import ci.v8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.kr;
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
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.x20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dd;
import org.telegram.ui.e01;
import org.telegram.ui.ee0;
import org.telegram.ui.g01;
import org.telegram.ui.g11;
import org.telegram.ui.hd;
import org.telegram.ui.id;
import org.telegram.ui.l01;
import org.telegram.ui.nd;
import org.telegram.ui.qc1;
import org.telegram.ui.qy0;
import org.telegram.ui.r41;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
public final class h3 implements View.OnClickListener {
    public final int f675a;
    public final int f676b;
    public final Object f677c;
    public final Object d;

    public h3(int i3, View view, AtomicReference atomicReference) {
        this.f675a = 23;
        this.f676b = i3;
        this.f677c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        int i11;
        org.telegram.messenger.f0 f0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i12 = this.f675a;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i14 = this.f676b;
        Object obj = this.d;
        Object obj2 = this.f677c;
        switch (i12) {
            case 0:
                v8 v8Var = (v8) obj2;
                Runnable runnable = (Runnable) obj;
                v8Var.getClass();
                if ((i14 & 15) != 0) {
                    i13 = 15;
                } else if ((i14 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(v8Var.f6199g & i13, i14, !TLObject.hasFlag(i3, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i15 = v8Var.f6199g;
                int i16 = flag | ((~i13) & i15);
                if (i15 != i16) {
                    v8Var.f6199g = i16;
                    v8Var.j(true);
                }
                runnable.run();
                return;
            case 1:
                vp0 vp0Var = (vp0) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                wo woVar = vp0Var.G;
                woVar.a(!woVar.f40035a.f31334q, true);
                boolean z15 = woVar.f40035a.f31334q;
                fc a02 = fc.a0(d2Var);
                if (z15) {
                    i10 = 2131624194;
                } else {
                    i10 = 2131624193;
                }
                if (z15) {
                    i11 = 2131750264;
                } else {
                    i11 = 2131750263;
                }
                a02.P(i10, bd.M0(i11, null)).j();
                vp0Var.d.h = Boolean.valueOf(z15);
                if (vp0Var.I >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(vp0Var.I, true);
                    vp0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = hp.s1(i14).j1(vp0Var.f1012c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new f3(0, vp0Var, d2Var));
                return;
            case 2:
                sf.c.t((Context) obj2, "https://" + hp.s1(i14).V2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 3:
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) obj;
                org.telegram.ui.ActionBar.y4 y4Var = ((org.telegram.ui.ActionBar.e5) obj2).f27477a;
                if (f5Var.s()) {
                    org.telegram.ui.ActionBar.j jVar = y4Var.W;
                    if (jVar == null || jVar.a()) {
                        f5Var.U(null, null);
                        return;
                    }
                    return;
                } else if (f5Var.B0) {
                    y4Var.v(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = y4Var.W;
                    if (jVar2 != null) {
                        jVar2.b(i14);
                        return;
                    }
                    return;
                }
            case 4:
                ma maVar = (ma) obj2;
                maVar.f29640e.a(true, true);
                hp.s1(i14).U1().f(false, (ArrayList) obj, new gi.s3(maVar, i14, 3));
                return;
            case 5:
                ((ta) obj2).a(i14, ((sa) obj).h);
                return;
            case 6:
                xd xdVar = (xd) obj2;
                r41 r41Var = (r41) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (xdVar.C0 > currentTime) {
                        xdVar.Q0 = fc.a0(r41Var).Q(2131624291, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752952, ci.v.w0(xdVar.C0 - currentTime)))).j();
                        return;
                    } else if (xdVar.O0 < hp.s1(i14).R5) {
                        fc.a0(r41Var).M(xdVar.getContext().getResources().getDrawable(2131232750).mutate(), org.telegram.messenger.g0.U2(bd.G((int) hp.s1(i14).R5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.f42083a0 = 1;
                        twoStepVerificationActivity.f42087c0 = hdVar;
                        ndVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, r41Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                wm wmVar = (wm) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (wmVar.m1 != null && wmVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 8:
                wm wmVar2 = (wm) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (wmVar2.f51500u5 != null && i14 < arrayList.size()) {
                    wmVar2.ab(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 9:
                ((cb0) obj2).setValue(i14);
                ((org.telegram.ui.Components.m2) obj).run();
                return;
            case 10:
                hk hkVar = (hk) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                f60 F = f60.F(hkVar, e6Var, hkVar.f34432y);
                F.Q = true;
                F.c(2131232044, bd.M0(2131743147, null), new org.telegram.ui.f4(hkVar, i14, e6Var, 5), false);
                F.c(2131231778, bd.M0(2131743215, null), new bk(hkVar, 0), false);
                F.f33747s = 0;
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                return;
            case 11:
                lr lrVar = (lr) obj2;
                f41 f41Var = (f41) obj;
                if (lrVar.e1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                    String M0 = bd.M0(2131743729, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = bd.M0(2131743728, null);
                    alertDialog$Builder.k(bd.M0(2131747839, null), null);
                    s1Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.f35841p2;
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
                lrVar.h1();
                f41Var.O(true);
                return;
            case 12:
                x20 x20Var = (x20) obj2;
                x20Var.f40207n = i14;
                x20Var.f40203b.e(false, view.getLeft());
                x20Var.f40204c.e(false, view.getRight());
                ((kr) obj).a(i14);
                x20Var.invalidate();
                return;
            case 13:
                vc0 vc0Var = (vc0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = vc0Var.E1;
                org.telegram.ui.ActionBar.d2 d2Var2 = vc0Var.f39071q1;
                int i17 = vc0Var.f39078x1;
                if (i14 >= i17 && i14 < vc0Var.f39079y1) {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i17);
                } else {
                    int i18 = vc0Var.f39080z1;
                    if (i14 >= i18 && i14 < vc0Var.A1) {
                        f0Var = (org.telegram.messenger.f0) vc0Var.D1.get(i14 - i18);
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (vc0Var.B1) {
                        int i19 = f0Var.f22428c;
                        if (i19 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(268435456);
                                d2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        } else if (i19 == 1) {
                            sf.c.t(d2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                            return;
                        } else if (i19 == 3) {
                            String c2 = f0Var.c(false);
                            if (!c2.startsWith("http")) {
                                c2 = "http://".concat(c2);
                            }
                            sf.c.t(d2Var2.getParentActivity(), c2);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{bd.M0(2131751767, null)}, new org.telegram.ui.u(4, vc0Var, f0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    f0Var.d = !f0Var.d;
                    if (i14 >= vc0Var.f39078x1 && i14 < vc0Var.f39079y1) {
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
                        vc0Var.f39070p1.setEnabled(z13);
                        vc0Var.I0();
                    }
                    ((tc0) viewGroup).setChecked(f0Var.d);
                    return;
                }
                return;
            case 14:
                ir0 ir0Var = (ir0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ws0 ws0Var = ir0Var.f34804f;
                org.telegram.ui.ActionBar.d2 d2Var3 = ws0Var.f40142y1;
                d2Var3.finishPreviewFragment();
                chat.left = false;
                ir0Var.E(false);
                ir0Var.s(i14);
                if (ir0Var.d.isEmpty()) {
                    ws0Var.N1(true);
                    ws0Var.N();
                }
                d2Var3.getNotificationCenter().k(201, Long.valueOf(-ws0Var.m1));
                d2Var3.getMessagesController().n(chat.f27001id, d2Var3.getUserConfig().f(), null, d2Var3, new j50(21, ir0Var, chat));
                return;
            case 15:
                ((t21) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 16:
                uw.t0((uw) obj2, i14, (f60) obj);
                return;
            case 17:
                ee0.d0((ee0) obj2, i14, (f60) obj);
                return;
            case 18:
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
                    i6Var.f29378c.a(z12, true);
                }
                return;
            case 19:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.f1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((qy0) saveToGallerySettingsActivity.f41922s.get(i14)).f48971c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f41915a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 20:
                sw swVar = (sw) obj;
                g11 g11Var = ((g01) obj2).f45427c;
                if (!swVar.f38127e && !h10.i(g11Var.W).q()) {
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new vg.v0(g11Var.f45445d1, g11Var.getContext(), g11Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i22 = 0;
                while (true) {
                    e01 e01Var = g11Var.f45456i0;
                    if (i22 < e01Var.getChildCount()) {
                        if ((e01Var.getChildAt(i22) instanceof l01) && (R = RecyclerView.R((view2 = e01Var.getChildAt(i22)))) >= 0 && g11Var.f45493z0.get(R) == i14) {
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
                    g11Var.i(num.intValue(), view2);
                }
                pu.J0(null, swVar.f38125b, false, null, null);
                g11Var.C0.add(Long.valueOf(swVar.f38125b.f27028id));
                g11Var.B(true, true, true);
                return;
            case 21:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.r5) obj2).setSelected(i14);
                return;
            case 22:
                gi.d dVar = (gi.d) obj2;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                if (!dVar.R) {
                    ke keVar = qc1.d;
                    if (keVar != null && ((byte[]) keVar.f2718e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.f676b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new c3.b(1), new org.telegram.ui.f60(dVar, t2Var, i23, view, keVar));
                        return;
                    }
                    a8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 23:
                az.f21653p0 = i14;
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putInt("searchEngineType", az.f21653p0);
                edit.apply();
                ((l8) ((View) obj2)).w(org.telegram.ui.web.d1.a().f50829a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            default:
                ug.g1 g1Var = (ug.g1) obj2;
                g1Var.a(i14);
                g1Var.f56015b.w().i(i14 - 1, true);
                g1Var.f56015b.C((tg.h) obj);
                return;
        }
    }

    public h3(Object obj, int i3, Object obj2, int i10) {
        this.f675a = i10;
        this.f677c = obj;
        this.f676b = i3;
        this.d = obj2;
    }

    public h3(Object obj, Object obj2, int i3, int i10) {
        this.f675a = i10;
        this.f677c = obj;
        this.d = obj2;
        this.f676b = i3;
    }
}
