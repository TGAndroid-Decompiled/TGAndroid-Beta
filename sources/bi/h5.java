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
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.or;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.cz0;
import org.telegram.ui.dd;
import org.telegram.ui.id;
import org.telegram.ui.ii;
import org.telegram.ui.me0;
import org.telegram.ui.n60;
import org.telegram.ui.nd;
import org.telegram.ui.q01;
import org.telegram.ui.s01;
import org.telegram.ui.s11;
import org.telegram.ui.x01;
import org.telegram.ui.xd;
import org.telegram.ui.yc1;
public final class h5 implements View.OnClickListener {
    public final int f3706a;
    public final int f3707b;
    public final Object f3708c;
    public final Object d;

    public h5(int i7, View view, AtomicReference atomicReference) {
        this.f3706a = 24;
        this.f3707b = i7;
        this.f3708c = view;
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
        int i12 = this.f3706a;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i14 = this.f3707b;
        Object obj = this.d;
        Object obj2 = this.f3708c;
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
                int flag = TLObject.setFlag(p8Var.f9548g & i13, i14, !TLObject.hasFlag(i7, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i15 = p8Var.f9548g;
                int i16 = flag | ((~i13) & i15);
                if (i15 != i16) {
                    p8Var.f9548g = i16;
                    p8Var.k(true);
                }
                runnable.run();
                return;
            case 1:
                gq0 gq0Var = (gq0) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                op opVar = gq0Var.G;
                opVar.a(!opVar.f38320a.f32874q, true);
                boolean z15 = opVar.f38320a.f32874q;
                lc b02 = lc.b0(g2Var);
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
                b02.P(i10, hd.N0(i11, null)).j();
                gq0Var.d.h = Boolean.valueOf(z15);
                if (gq0Var.I >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(gq0Var.I, true);
                    gq0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = np.u1(i14).l1(gq0Var.f4093c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new o1(1, gq0Var, g2Var));
                return;
            case 2:
                vf.c.t((Context) obj2, "https://" + np.u1(i14).X2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 3:
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) obj;
                org.telegram.ui.ActionBar.z4 z4Var = ((org.telegram.ui.ActionBar.f5) obj2).f28958a;
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
                oa oaVar = (oa) obj2;
                oaVar.f31221e.a(true, true);
                np.u1(i14).W1().f(false, (ArrayList) obj, new ai.b2(oaVar, i14, 5));
                return;
            case 5:
                ((va) obj2).a(i14, ((ua) obj).h);
                return;
            case 6:
                xd xdVar = (xd) obj2;
                c51 c51Var = (c51) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (xdVar.C0 > currentTime) {
                        xdVar.Q0 = lc.b0(c51Var).Q(2131624292, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752940, di.t.x0(xdVar.C0 - currentTime)))).j();
                        return;
                    } else if (xdVar.O0 < np.u1(i14).U5) {
                        lc.b0(c51Var).M(xdVar.getContext().getResources().getDrawable(2131232754).mutate(), org.telegram.messenger.g0.T2(hd.G((int) np.u1(i14).U5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.f43917a0 = 1;
                        twoStepVerificationActivity.f43921c0 = hdVar;
                        ndVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                bn bnVar = (bn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (bnVar.f46111m1 != null && bnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 8:
                bn bnVar2 = (bn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (bnVar2.f46228v5 != null && i14 < arrayList.size()) {
                    bnVar2.db(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 9:
                ((tb0) obj2).setValue(i14);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 10:
                ((b1) obj2).c(new ii((ji.f) obj, i14, 8));
                return;
            case 11:
                zk zkVar = (zk) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                a70 G = a70.G(zkVar, h6Var, zkVar.f42930y);
                G.T = true;
                G.c(2131232046, hd.N0(2131742891, null), new org.telegram.ui.f0(zkVar, i14, h6Var, 7), false);
                G.c(2131231779, hd.N0(2131742959, null), new tk(zkVar, 0), false);
                G.f33397s = 0;
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                return;
            case 12:
                as asVar = (as) obj2;
                org.telegram.ui.Components.c51 c51Var2 = (org.telegram.ui.Components.c51) obj;
                if (asVar.f1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                    String N0 = hd.N0(2131743474, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N0;
                    t1Var.U = hd.N0(2131743473, null);
                    alertDialog$Builder.k(hd.N0(2131747637, null), null);
                    t1Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.f33622s2;
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
                asVar.i1();
                c51Var2.O(true);
                return;
            case 13:
                p30 p30Var = (p30) obj2;
                p30Var.f38470n = i14;
                p30Var.f38466b.e(false, view.getLeft());
                p30Var.f38467c.e(false, view.getRight());
                ((or) obj).a(i14);
                p30Var.invalidate();
                return;
            case 14:
                md0 md0Var = (md0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = md0Var.H1;
                org.telegram.ui.ActionBar.g2 g2Var2 = md0Var.f37492t1;
                int i17 = md0Var.A1;
                if (i14 >= i17 && i14 < md0Var.B1) {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i17);
                } else {
                    int i18 = md0Var.C1;
                    if (i14 >= i18 && i14 < md0Var.D1) {
                        f0Var = (org.telegram.messenger.f0) md0Var.G1.get(i14 - i18);
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (md0Var.E1) {
                        int i19 = f0Var.f23805c;
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
                            alertDialog$Builder2.f(new CharSequence[]{hd.N0(2131751755, null)}, new og.j(5, md0Var, f0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    f0Var.d = !f0Var.d;
                    if (i14 >= md0Var.A1 && i14 < md0Var.B1) {
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
                        md0Var.f37491s1.setEnabled(z13);
                        md0Var.J0();
                    }
                    ((kd0) viewGroup).setChecked(f0Var.d);
                    return;
                }
                return;
            case 15:
                ur0 ur0Var = (ur0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jt0 jt0Var = ur0Var.f40568f;
                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var.f36683y1;
                g2Var3.finishPreviewFragment();
                chat.left = false;
                ur0Var.E(false);
                ur0Var.s(i14);
                if (ur0Var.d.isEmpty()) {
                    jt0Var.P1(true);
                    jt0Var.N();
                }
                g2Var3.getNotificationCenter().k(203, Long.valueOf(-jt0Var.f36647m1));
                g2Var3.getMessagesController().n(chat.f28434id, g2Var3.getUserConfig().f(), null, g2Var3, new fm0(8, ur0Var, chat));
                return;
            case 16:
                ((p31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 17:
                cx.w0((cx) obj2, i14, (a70) obj);
                return;
            case 18:
                me0.g0((me0) obj2, i14, (a70) obj);
                return;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i21 = 0; i21 < 2; i21++) {
                    org.telegram.ui.Cells.k6 k6Var = k6VarArr[i21];
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
                    k6Var.f30958c.a(z12, true);
                }
                return;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((cz0) saveToGallerySettingsActivity.f43756s.get(i14)).f46841c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f43749a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 21:
                hx hxVar = (hx) obj;
                s11 s11Var = ((s01) obj2).f51812c;
                if (!hxVar.f35983e && !k10.i(s11Var.W).q()) {
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(s11Var.f51833d1, s11Var.getContext(), s11Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i22 = 0;
                while (true) {
                    q01 q01Var = s11Var.f51844i0;
                    if (i22 < q01Var.getChildCount()) {
                        if ((q01Var.getChildAt(i22) instanceof x01) && (R = RecyclerView.R((view2 = q01Var.getChildAt(i22)))) >= 0 && s11Var.f51881z0.get(R) == i14) {
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
                    s11Var.i(num.intValue(), view2);
                }
                ev.K0(null, hxVar.f35981b, false, null, null);
                s11Var.C0.add(Long.valueOf(hxVar.f35981b.f28461id));
                s11Var.B(true, true, true);
                return;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.i6) obj2).setSelected(i14);
                return;
            case 23:
                hi.e eVar = (hi.e) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!eVar.R) {
                    a8.r7 r7Var = yc1.d;
                    if (r7Var != null && ((byte[]) r7Var.f619e) != null) {
                        eVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.f3707b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new n60(eVar, w2Var, i23, view, r7Var));
                        return;
                    }
                    org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 24:
                cz.f23431p0 = i14;
                SharedPreferences.Editor edit = np.g1().edit();
                edit.putInt("searchEngineType", cz.f23431p0);
                edit.apply();
                ((org.telegram.ui.Cells.n8) ((View) obj2)).w(org.telegram.ui.web.e1.a().f53126a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            default:
                tg.i1 i1Var = (tg.i1) obj2;
                i1Var.a(i14);
                i1Var.f57962b.x().i(i14 - 1, true);
                i1Var.f57962b.w((sg.h) obj);
                return;
        }
    }

    public h5(Object obj, int i7, Object obj2, int i10) {
        this.f3706a = i10;
        this.f3708c = obj;
        this.f3707b = i7;
        this.d = obj2;
    }

    public h5(Object obj, Object obj2, int i7, int i10) {
        this.f3706a = i10;
        this.f3708c = obj;
        this.d = obj2;
        this.f3707b = i7;
    }
}
