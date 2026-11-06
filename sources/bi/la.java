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
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.sr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Components.tw;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.az0;
import org.telegram.ui.c51;
import org.telegram.ui.je0;
import org.telegram.ui.l60;
import org.telegram.ui.n41;
import org.telegram.ui.o01;
import org.telegram.ui.q01;
import org.telegram.ui.q11;
import org.telegram.ui.uc1;
import org.telegram.ui.v01;
import org.telegram.ui.ww;
public final class la implements View.OnClickListener {
    public final int f4284a;
    public final int f4285b;
    public final Object f4286c;
    public final Object d;

    public la(int i7, View view, AtomicReference atomicReference) {
        this.f4284a = 21;
        this.f4285b = i7;
        this.f4286c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.messenger.f0 f0Var;
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        View view2;
        int R;
        int i7;
        int i10;
        int i11;
        int i12 = this.f4284a;
        boolean z12 = false;
        int i13 = 0;
        boolean z13 = false;
        int i14 = this.f4285b;
        Object obj = this.d;
        Object obj2 = this.f4286c;
        switch (i12) {
            case 0:
                vf.c.t((Context) obj2, "https://" + qp.s1(i14).U2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 1:
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) obj;
                org.telegram.ui.ActionBar.y4 y4Var = ((org.telegram.ui.ActionBar.e5) obj2).f27449a;
                if (f5Var.s()) {
                    org.telegram.ui.ActionBar.j jVar = y4Var.V;
                    if (jVar == null || jVar.a()) {
                        f5Var.U(null, null);
                        return;
                    }
                    return;
                } else if (f5Var.A0) {
                    y4Var.v(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = y4Var.V;
                    if (jVar2 != null) {
                        jVar2.b(i14);
                        return;
                    }
                    return;
                }
            case 2:
                org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) obj2;
                maVar.f29579e.a(true, true);
                qp.s1(i14).U1().f(false, (ArrayList) obj, new fi.t3(maVar, i14, 3));
                return;
            case 3:
                ((org.telegram.ui.Cells.ua) obj2).a(i14, ((org.telegram.ui.Cells.ta) obj).h);
                return;
            case 4:
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) obj2;
                c51 c51Var = (c51) obj;
                org.telegram.ui.pd pdVar = zdVar.G0;
                if (view.isEnabled() && !pdVar.Q && !zdVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (zdVar.B0 > currentTime) {
                        zdVar.P0 = org.telegram.ui.Components.hc.a0(c51Var).Q(2131624291, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131752952, z.w0(zdVar.B0 - currentTime)))).j();
                        return;
                    } else if (zdVar.N0 < qp.s1(i14).R5) {
                        org.telegram.ui.Components.hc.a0(c51Var).M(zdVar.getContext().getResources().getDrawable(2131232752).mutate(), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.G((int) qp.s1(i14).R5, "BotStarsWithdrawMinLimit", new Object[0]), new org.telegram.ui.ed(zdVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.id idVar = new org.telegram.ui.id(zdVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f42027b0 = idVar;
                        pdVar.setLoading(true);
                        twoStepVerificationActivity.x0(new org.telegram.ui.jd(zdVar, c51Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 5:
                an anVar = (an) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (anVar.l1 != null && anVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 6:
                an anVar2 = (an) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (anVar2.f43941t5 != null && i14 < arrayList.size()) {
                    anVar2.ab(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 7:
                ((hb0) obj2).setValue(i14);
                ((org.telegram.ui.Components.p2) obj).run();
                return;
            case 8:
                ik ikVar = (ik) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                k60 F = k60.F(ikVar, f6Var, ikVar.f34721y);
                F.Q = true;
                F.c(2131232044, org.telegram.messenger.hd.M0(2131743138, null), new org.telegram.ui.q8(ikVar, i14, f6Var, 4), false);
                F.c(2131231778, org.telegram.messenger.hd.M0(2131743206, null), new ck(ikVar, 0), false);
                F.f35216s = 0;
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                return;
            case 9:
                lr lrVar = (lr) obj2;
                f41 f41Var = (f41) obj;
                if (lrVar.e1()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                    String M0 = org.telegram.messenger.hd.M0(2131743720, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131743719, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                    u1Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z12 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.f35715o2;
                boolean z14 = !z12;
                tL_chatBannedRights.send_media = z14;
                tL_chatBannedRights.send_photos = z14;
                tL_chatBannedRights.send_videos = z14;
                tL_chatBannedRights.send_stickers = z14;
                tL_chatBannedRights.send_gifs = z14;
                tL_chatBannedRights.send_inline = z14;
                tL_chatBannedRights.send_games = z14;
                tL_chatBannedRights.send_audios = z14;
                tL_chatBannedRights.send_docs = z14;
                tL_chatBannedRights.send_voices = z14;
                tL_chatBannedRights.send_roundvideos = z14;
                tL_chatBannedRights.embed_links = z14;
                tL_chatBannedRights.send_polls = z14;
                tL_chatBannedRights.send_reactions = z14;
                lrVar.h1();
                f41Var.O(true);
                return;
            case 10:
                b30 b30Var = (b30) obj2;
                b30Var.f31993n = i14;
                b30Var.f31989b.e(false, view.getLeft());
                b30Var.f31990c.e(false, view.getRight());
                ((sr) obj).a(i14);
                b30Var.invalidate();
                return;
            case 11:
                ad0 ad0Var = (ad0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = ad0Var.D1;
                org.telegram.ui.ActionBar.f2 f2Var = ad0Var.f31762p1;
                int i15 = ad0Var.f31769w1;
                if (i14 >= i15 && i14 < ad0Var.f31770x1) {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i15);
                } else {
                    int i16 = ad0Var.f31771y1;
                    if (i14 >= i16 && i14 < ad0Var.f31772z1) {
                        f0Var = (org.telegram.messenger.f0) ad0Var.C1.get(i14 - i16);
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (ad0Var.A1) {
                        int i17 = f0Var.f22311c;
                        if (i17 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(268435456);
                                f2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        } else if (i17 == 1) {
                            vf.c.t(f2Var.getParentActivity(), "mailto:" + f0Var.c(false));
                            return;
                        } else if (i17 == 3) {
                            String c10 = f0Var.c(false);
                            if (!c10.startsWith("http")) {
                                c10 = "http://".concat(c10);
                            }
                            vf.c.t(f2Var.getParentActivity(), c10);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751767, null)}, new og.j(5, ad0Var, f0Var));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    f0Var.d = !f0Var.d;
                    if (i14 >= ad0Var.f31769w1 && i14 < ad0Var.f31770x1) {
                        int i18 = 0;
                        while (true) {
                            if (i18 < arrayList2.size()) {
                                if (((org.telegram.messenger.f0) arrayList2.get(i18)).d) {
                                    z13 = true;
                                } else {
                                    i18++;
                                }
                            }
                        }
                        ad0Var.f31761o1.setEnabled(z13);
                        ad0Var.I0();
                    }
                    ((yc0) viewGroup).setChecked(f0Var.d);
                    return;
                }
                return;
            case 12:
                jr0 jr0Var = (jr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                xs0 xs0Var = jr0Var.f35062f;
                org.telegram.ui.ActionBar.f2 f2Var2 = xs0Var.f40405x1;
                f2Var2.finishPreviewFragment();
                chat.left = false;
                jr0Var.E(false);
                jr0Var.s(i14);
                if (jr0Var.d.isEmpty()) {
                    xs0Var.N1(true);
                    xs0Var.N();
                }
                f2Var2.getNotificationCenter().k(201, Long.valueOf(-xs0Var.l1));
                f2Var2.getMessagesController().n(chat.f26952id, f2Var2.getUserConfig().f(), null, f2Var2, new v80(16, jr0Var, chat));
                return;
            case 13:
                ((s21) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 14:
                ww.t0((ww) obj2, i14, (k60) obj);
                return;
            case 15:
                je0.d0((je0) obj2, i14, (k60) obj);
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj;
                if (i14 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zArr[0] = z9;
                for (int i19 = 0; i19 < 2; i19++) {
                    org.telegram.ui.Cells.j6 j6Var = j6VarArr[i19];
                    boolean z15 = zArr[0];
                    if (i19 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z15 == z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j6Var.f29363c.a(z11, true);
                }
                return;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((az0) saveToGallerySettingsActivity.f41866s.get(i14)).f44118c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.f41859a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 18:
                tw twVar = (tw) obj;
                q11 q11Var = ((q01) obj2).f48971c;
                if (!twVar.f38422e && !p10.i(q11Var.V).q()) {
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.w0(q11Var.f48997c1, q11Var.getContext(), q11Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i20 = 0;
                while (true) {
                    o01 o01Var = q11Var.f49008h0;
                    if (i20 < o01Var.getChildCount()) {
                        if ((o01Var.getChildAt(i20) instanceof v01) && (R = RecyclerView.R((view2 = o01Var.getChildAt(i20)))) >= 0 && q11Var.f49045y0.get(R) == i14) {
                            num = Integer.valueOf(R);
                        } else {
                            i20++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    q11Var.i(num.intValue(), view2);
                }
                qu.J0(null, twVar.f38420b, false, null, null);
                q11Var.B0.add(Long.valueOf(twVar.f38420b.f26979id));
                q11Var.B(true, true, true);
                return;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.t5) obj2).setSelected(i14);
                return;
            case 20:
                fi.d dVar = (fi.d) obj2;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                if (!dVar.Q) {
                    a8.r7 r7Var = uc1.d;
                    if (r7Var != null && ((byte[]) r7Var.f616e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i21 = this.f4285b;
                        ConnectionsManager.getInstance(i21).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new l60(dVar, v2Var, i21, view, r7Var));
                        return;
                    }
                    org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 21:
                iz.f23398p0 = i14;
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putInt("searchEngineType", iz.f23398p0);
                edit.apply();
                ((org.telegram.ui.Cells.m8) ((View) obj2)).w(org.telegram.ui.web.f1.a().f51117a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 22:
                tg.h1 h1Var = (tg.h1) obj2;
                h1Var.a(i14);
                h1Var.f55598b.x().i(i14 - 1, true);
                h1Var.f55598b.w((sg.h) obj);
                return;
            case 23:
                v9 v9Var = (v9) obj2;
                Runnable runnable = (Runnable) obj;
                v9Var.getClass();
                if ((i14 & 15) != 0) {
                    i13 = 15;
                } else if ((i14 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(v9Var.f4911g & i13, i14, !TLObject.hasFlag(i7, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i22 = v9Var.f4911g;
                int i23 = flag | ((~i13) & i22);
                if (i22 != i23) {
                    v9Var.f4911g = i23;
                    v9Var.j(true);
                }
                runnable.run();
                return;
            default:
                up0 up0Var = (up0) obj2;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj;
                wo woVar = up0Var.F;
                woVar.a(!woVar.f40043a.f31258q, true);
                boolean z16 = woVar.f40043a.f31258q;
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(f2Var3);
                if (z16) {
                    i10 = 2131624194;
                } else {
                    i10 = 2131624193;
                }
                if (z16) {
                    i11 = 2131750255;
                } else {
                    i11 = 2131750254;
                }
                a02.P(i10, org.telegram.messenger.hd.M0(i11, null)).j();
                up0Var.d.h = Boolean.valueOf(z16);
                if (up0Var.H >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(up0Var.H, true);
                    up0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = qp.s1(i14).j1(up0Var.f60189c);
                togglechatstargiftnotifications.enabled = z16;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new n41(10, up0Var, f2Var3));
                return;
        }
    }

    public la(Object obj, int i7, Object obj2, int i10) {
        this.f4284a = i10;
        this.f4286c = obj;
        this.f4285b = i7;
        this.d = obj2;
    }

    public la(Object obj, Object obj2, int i7, int i10) {
        this.f4284a = i10;
        this.f4286c = obj;
        this.d = obj2;
        this.f4285b = i7;
    }
}
