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
import org.telegram.messenger.j10;
import org.telegram.messenger.nr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yr;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.cz0;
import org.telegram.ui.dd;
import org.telegram.ui.hd;
import org.telegram.ui.id;
import org.telegram.ui.ii;
import org.telegram.ui.m60;
import org.telegram.ui.me0;
import org.telegram.ui.nd;
import org.telegram.ui.p01;
import org.telegram.ui.r01;
import org.telegram.ui.r11;
import org.telegram.ui.w01;
import org.telegram.ui.xd;
import org.telegram.ui.yc1;
public final class e5 implements View.OnClickListener {
    public final int f3546a;
    public final int f3547b;
    public final Object f3548c;
    public final Object d;

    public e5(int i7, View view, AtomicReference atomicReference) {
        this.f3546a = 24;
        this.f3547b = i7;
        this.f3548c = view;
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
        int i12 = this.f3546a;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i14 = this.f3547b;
        Object obj = this.d;
        Object obj2 = this.f3548c;
        switch (i12) {
            case 0:
                di.o8 o8Var = (di.o8) obj2;
                Runnable runnable = (Runnable) obj;
                o8Var.getClass();
                if ((i14 & 15) != 0) {
                    i13 = 15;
                } else if ((i14 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(o8Var.f9463g & i13, i14, !TLObject.hasFlag(i7, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i15 = o8Var.f9463g;
                int i16 = flag | ((~i13) & i15);
                if (i15 != i16) {
                    o8Var.f9463g = i16;
                    o8Var.k(true);
                }
                runnable.run();
                return;
            case 1:
                eq0 eq0Var = (eq0) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                mp mpVar = eq0Var.G;
                mpVar.a(!mpVar.f37598a.f32838q, true);
                boolean z15 = mpVar.f37598a.f32838q;
                lc b02 = lc.b0(h2Var);
                if (z15) {
                    i10 = 2131624195;
                } else {
                    i10 = 2131624194;
                }
                if (z15) {
                    i11 = 2131750240;
                } else {
                    i11 = 2131750239;
                }
                b02.P(i10, gd.M0(i11, null)).j();
                eq0Var.d.h = Boolean.valueOf(z15);
                if (eq0Var.I >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(eq0Var.I, true);
                    eq0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = org.telegram.messenger.mp.u1(i14).l1(eq0Var.f3943c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new k1(1, eq0Var, h2Var));
                return;
            case 2:
                vf.c.t((Context) obj2, "https://" + org.telegram.messenger.mp.u1(i14).X2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 3:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) obj;
                org.telegram.ui.ActionBar.a5 a5Var = ((org.telegram.ui.ActionBar.g5) obj2).f28973a;
                if (h5Var.t()) {
                    org.telegram.ui.ActionBar.j jVar = a5Var.W;
                    if (jVar == null || jVar.a()) {
                        h5Var.V(null, null);
                        return;
                    }
                    return;
                } else if (h5Var.B0) {
                    a5Var.B(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = a5Var.W;
                    if (jVar2 != null) {
                        jVar2.b(i14);
                        return;
                    }
                    return;
                }
            case 4:
                oa oaVar = (oa) obj2;
                oaVar.f31190e.a(true, true);
                org.telegram.messenger.mp.u1(i14).W1().f(false, (ArrayList) obj, new ai.y1(oaVar, i14, 5));
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
                        xdVar.Q0 = lc.b0(c51Var).Q(2131624292, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752941, di.t.x0(xdVar.C0 - currentTime)))).j();
                        return;
                    } else if (xdVar.O0 < org.telegram.messenger.mp.u1(i14).U5) {
                        lc.b0(c51Var).M(xdVar.getContext().getResources().getDrawable(2131232754).mutate(), org.telegram.messenger.g0.T2(gd.G((int) org.telegram.messenger.mp.u1(i14).U5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.f43872a0 = 1;
                        twoStepVerificationActivity.f43876c0 = hdVar;
                        ndVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                bn bnVar = (bn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (bnVar.f46084m1 != null && bnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 8:
                bn bnVar2 = (bn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (bnVar2.f46201v5 != null && i14 < arrayList.size()) {
                    bnVar2.db(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 9:
                ((sb0) obj2).setValue(i14);
                ((org.telegram.ui.Components.w2) obj).run();
                return;
            case 10:
                ((x0) obj2).c(new ii((ji.g) obj, i14, 9));
                return;
            case 11:
                xk xkVar = (xk) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                y60 G = y60.G(xkVar, i6Var, xkVar.f42134y);
                G.T = true;
                G.c(2131232046, gd.M0(2131742899, null), new org.telegram.ui.b0(xkVar, i14, i6Var, 8), false);
                G.c(2131231779, gd.M0(2131742967, null), new rk(xkVar, 0), false);
                G.f42375s = 0;
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                return;
            case 12:
                yr yrVar = (yr) obj2;
                z41 z41Var = (z41) obj;
                if (yrVar.f1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yrVar.getContext());
                    String M0 = gd.M0(2131743482, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = gd.M0(2131743481, null);
                    alertDialog$Builder.k(gd.M0(2131747638, null), null);
                    u1Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = yrVar.f42613s2;
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
                yrVar.i1();
                z41Var.O(true);
                return;
            case 13:
                m30 m30Var = (m30) obj2;
                m30Var.f37349n = i14;
                m30Var.f37345b.e(false, view.getLeft());
                m30Var.f37346c.e(false, view.getRight());
                ((nr) obj).a(i14);
                m30Var.invalidate();
                return;
            case 14:
                ld0 ld0Var = (ld0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = ld0Var.H1;
                org.telegram.ui.ActionBar.h2 h2Var2 = ld0Var.f37102t1;
                int i17 = ld0Var.A1;
                if (i14 >= i17 && i14 < ld0Var.B1) {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i17);
                } else {
                    int i18 = ld0Var.C1;
                    if (i14 >= i18 && i14 < ld0Var.D1) {
                        f0Var = (org.telegram.messenger.f0) ld0Var.G1.get(i14 - i18);
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (ld0Var.E1) {
                        int i19 = f0Var.f23809c;
                        if (i19 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(268435456);
                                h2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        } else if (i19 == 1) {
                            vf.c.t(h2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                            return;
                        } else if (i19 == 3) {
                            String c10 = f0Var.c(false);
                            if (!c10.startsWith("http")) {
                                c10 = "http://".concat(c10);
                            }
                            vf.c.t(h2Var2.getParentActivity(), c10);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{gd.M0(2131751756, null)}, new og.j(5, ld0Var, f0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    f0Var.d = !f0Var.d;
                    if (i14 >= ld0Var.A1 && i14 < ld0Var.B1) {
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
                        ld0Var.f37101s1.setEnabled(z13);
                        ld0Var.J0();
                    }
                    ((jd0) viewGroup).setChecked(f0Var.d);
                    return;
                }
                return;
            case 15:
                sr0 sr0Var = (sr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                gt0 gt0Var = sr0Var.f39833f;
                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var.f35642y1;
                h2Var3.finishPreviewFragment();
                chat.left = false;
                sr0Var.E(false);
                sr0Var.s(i14);
                if (sr0Var.d.isEmpty()) {
                    gt0Var.P1(true);
                    gt0Var.N();
                }
                h2Var3.getNotificationCenter().k(203, Long.valueOf(-gt0Var.f35606m1));
                h2Var3.getMessagesController().n(chat.f28403id, h2Var3.getUserConfig().f(), null, h2Var3, new hn0(6, sr0Var, chat));
                return;
            case 16:
                ((n31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 17:
                cx.w0((cx) obj2, i14, (y60) obj);
                return;
            case 18:
                me0.g0((me0) obj2, i14, (y60) obj);
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
                    k6Var.f30927c.a(z12, true);
                }
                return;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.h1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((cz0) saveToGallerySettingsActivity.f43711s.get(i14)).f46782c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f43704a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 21:
                fx fxVar = (fx) obj;
                r11 r11Var = ((r01) obj2).f51359c;
                if (!fxVar.f35174e && !j10.i(r11Var.W).q()) {
                    org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.z0(r11Var.f51387d1, r11Var.getContext(), r11Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i22 = 0;
                while (true) {
                    p01 p01Var = r11Var.f51398i0;
                    if (i22 < p01Var.getChildCount()) {
                        if ((p01Var.getChildAt(i22) instanceof w01) && (R = RecyclerView.R((view2 = p01Var.getChildAt(i22)))) >= 0 && r11Var.f51435z0.get(R) == i14) {
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
                    r11Var.i(num.intValue(), view2);
                }
                bv.K0(null, fxVar.f35172b, false, null, null);
                r11Var.C0.add(Long.valueOf(fxVar.f35172b.f28430id));
                r11Var.B(true, true, true);
                return;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.i6) obj2).setSelected(i14);
                return;
            case 23:
                hi.d dVar = (hi.d) obj2;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                if (!dVar.R) {
                    a8.r7 r7Var = yc1.d;
                    if (r7Var != null && ((byte[]) r7Var.f619e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.f3547b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new m60(dVar, x2Var, i23, view, r7Var));
                        return;
                    }
                    org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 24:
                bz.f23186p0 = i14;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("searchEngineType", bz.f23186p0);
                edit.apply();
                ((org.telegram.ui.Cells.n8) ((View) obj2)).w(org.telegram.ui.web.e1.a().f53079a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            default:
                tg.h1 h1Var = (tg.h1) obj2;
                h1Var.a(i14);
                h1Var.f57899b.x().i(i14 - 1, true);
                h1Var.f57899b.w((sg.h) obj);
                return;
        }
    }

    public e5(Object obj, int i7, Object obj2, int i10) {
        this.f3546a = i10;
        this.f3548c = obj;
        this.f3547b = i7;
        this.d = obj2;
    }

    public e5(Object obj, Object obj2, int i7, int i10) {
        this.f3546a = i10;
        this.f3548c = obj;
        this.d = obj2;
        this.f3547b = i7;
    }
}
