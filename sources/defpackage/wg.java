package defpackage;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class wg implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public wg(int i, View view, AtomicReference atomicReference) {
        this.a = (byte) 23;
        this.b = i;
        this.c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        fl flVar;
        int i;
        int i2;
        Integer num;
        View view2;
        int R;
        byte b = this.a;
        boolean z4 = false;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((hn7) obj2).setValue(i3);
                ((ug) obj).run();
                return;
            case 1:
                zi1 zi1Var = (zi1) obj2;
                uxa uxaVar = (uxa) obj;
                oi1 oi1Var = zi1Var.G0;
                if (view.isEnabled() && !oi1Var.R && !zi1Var.A0.R) {
                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                    if (zi1Var.B0 > currentTime) {
                        zi1Var.P0 = u21.b0(uxaVar).Q(2131624286, 36, gl.S2(k96.a0(null, null, 2131752940, ss0.w0(zi1Var.B0 - currentTime)))).j();
                        return;
                    } else if (zi1Var.N0 < na7.q1(i3).k4.q2.f()) {
                        u21.b0(uxaVar).M(zi1Var.getContext().getResources().getDrawable(2131232757).mutate(), gl.N2(k96.G((int) na7.q1(i3).k4.q2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new fi1(zi1Var, i3, (byte) 1), null)).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        gi1 gi1Var = new gi1(zi1Var, twoStepVerificationActivity, (byte) 2);
                        twoStepVerificationActivity.a0 = (byte) 1;
                        twoStepVerificationActivity.c0 = gi1Var;
                        oi1Var.setLoading(true);
                        twoStepVerificationActivity.w0(new hi1(zi1Var, uxaVar, twoStepVerificationActivity, (byte) 2));
                        return;
                    }
                }
                return;
            case 2:
                mu1 mu1Var = (mu1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (mu1Var.m1 != null && mu1Var.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i3);
                    return;
                }
                return;
            case 3:
                mu1 mu1Var2 = (mu1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (mu1Var2.v5 != null && i3 < arrayList.size()) {
                    mu1Var2.Ja(((Integer) arrayList.get(i3)).intValue());
                    return;
                }
                return;
            case 4:
                ((vt4) obj2).c(new eg((zic) obj, i3, (byte) 23));
                return;
            case 5:
                r32 r32Var = (r32) obj2;
                wjb wjbVar = (wjb) obj;
                cs5 G = cs5.G(r32Var, wjbVar, r32Var.y);
                G.T = true;
                G.b(2131232049, k96.M0(2131742894, null), new va7(r32Var, i3, wjbVar, (byte) 15), false);
                G.b(2131231782, k96.M0(2131742962, null), new j32(r32Var, (byte) 0), false);
                G.s = (short) 0;
                G.b0(0.0f, -gl.L(48.0f));
                G.a0();
                return;
            case 6:
                sd3 sd3Var = (sd3) obj2;
                l5c l5cVar = (l5c) obj;
                if (sd3Var.Y0()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sd3Var.getContext());
                    String M0 = k96.M0(2131743480, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131743479, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    hdVar.show();
                    return;
                }
                if (i3 <= 0) {
                    z4 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = sd3Var.r2;
                boolean z5 = !z4;
                tL_chatBannedRights.send_media = z5;
                tL_chatBannedRights.send_photos = z5;
                tL_chatBannedRights.send_videos = z5;
                tL_chatBannedRights.send_stickers = z5;
                tL_chatBannedRights.send_gifs = z5;
                tL_chatBannedRights.send_inline = z5;
                tL_chatBannedRights.send_games = z5;
                tL_chatBannedRights.send_audios = z5;
                tL_chatBannedRights.send_docs = z5;
                tL_chatBannedRights.send_voices = z5;
                tL_chatBannedRights.send_roundvideos = z5;
                tL_chatBannedRights.embed_links = z5;
                tL_chatBannedRights.send_polls = z5;
                tL_chatBannedRights.send_reactions = z5;
                sd3Var.c1();
                l5cVar.O(true);
                return;
            case 7:
                ((cj3) obj2).S3(i3, (cs5) obj);
                return;
            case 8:
                xf5 xf5Var = (xf5) obj2;
                xf5Var.n = i3;
                xf5Var.b.e(false, view.getLeft());
                xf5Var.c.e(false, view.getRight());
                ((uc7) obj).a(i3);
                xf5Var.invalidate();
                return;
            case 9:
                ((ah6) obj2).k0(i3, (cs5) obj);
                return;
            case 10:
                boolean[] zArr = (boolean[]) obj2;
                wy8[] wy8VarArr = (wy8[]) obj;
                if (i3 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[0] = z;
                for (int i4 = 0; i4 < 2; i4++) {
                    wy8 wy8Var = wy8VarArr[i4];
                    boolean z6 = zArr[0];
                    if (i4 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z6 == z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    wy8Var.c.a(z3, true);
                }
                return;
            case 11:
                ks7 ks7Var = (ks7) obj2;
                ks7Var.a(i3);
                ks7Var.b.w().i(i3 - 1, true);
                ks7Var.b.s((m01) obj);
                return;
            case 12:
                b48 b48Var = (b48) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = b48Var.G1;
                d dVar = b48Var.s1;
                int i5 = b48Var.z1;
                if (i3 >= i5 && i3 < b48Var.A1) {
                    flVar = (fl) arrayList2.get(i3 - i5);
                } else {
                    int i6 = b48Var.B1;
                    if (i3 >= i6 && i3 < b48Var.C1) {
                        flVar = (fl) b48Var.F1.get(i3 - i6);
                    } else {
                        flVar = null;
                    }
                }
                if (flVar != null) {
                    if (b48Var.D1) {
                        int i7 = flVar.c;
                        if (i7 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + flVar.c(false)));
                                intent.addFlags(268435456);
                                dVar.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                fa4.g(e, true);
                                return;
                            }
                        } else if (i7 == 1) {
                            d01.t(dVar.getParentActivity(), "mailto:" + flVar.c(false));
                            return;
                        } else if (i7 == 3) {
                            String c = flVar.c(false);
                            if (!c.startsWith("http")) {
                                c = "http://".concat(c);
                            }
                            d01.t(dVar.getParentActivity(), c);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dVar.getParentActivity());
                            alertDialog$Builder2.e(new CharSequence[]{k96.M0(2131751755, null)}, new fe(b48Var, flVar, (byte) 8));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    flVar.d = !flVar.d;
                    if (i3 >= b48Var.z1 && i3 < b48Var.A1) {
                        int i8 = 0;
                        while (true) {
                            if (i8 < arrayList2.size()) {
                                if (((fl) arrayList2.get(i8)).d) {
                                    z4 = true;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        b48Var.r1.setEnabled(z4);
                        b48Var.D0();
                    }
                    ((z38) viewGroup).setChecked(flVar.d);
                    return;
                }
                return;
            case 13:
                lca lcaVar = (lca) obj2;
                d dVar2 = (d) obj;
                wf2 wf2Var = lcaVar.G;
                wf2Var.a(!wf2Var.a.q, true);
                boolean z7 = wf2Var.a.q;
                u21 b0 = u21.b0(dVar2);
                if (z7) {
                    i = 2131624189;
                    i2 = 2131750240;
                } else {
                    i = 2131624188;
                    i2 = 2131750239;
                }
                b0.P(i, k96.M0(i2, null)).j();
                lcaVar.d.h = Boolean.valueOf(z7);
                if (lcaVar.I >= 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(lcaVar.I, true);
                    lcaVar.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = na7.q1(i3).h1(lcaVar.c);
                togglechatstargiftnotifications.enabled = z7;
                ConnectionsManager.getInstance(i3).sendRequest(togglechatstargiftnotifications, new hj7(lcaVar, dVar2, (byte) 15));
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                ((m8) obj).d(true);
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((op9) saveToGallerySettingsActivity.s.get(i3)).c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                h04 h04Var = (h04) obj;
                tx9 tx9Var = ((tw9) obj2).c;
                if (!h04Var.e && !y6c.h(tx9Var.W).p()) {
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new jh8(tx9Var.d1, tx9Var.getContext(), tx9Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i9 = 0;
                while (true) {
                    rw9 rw9Var = tx9Var.i0;
                    if (i9 < rw9Var.getChildCount()) {
                        if ((rw9Var.getChildAt(i9) instanceof yw9) && (R = RecyclerView.R((view2 = rw9Var.getChildAt(i9)))) >= 0 && tx9Var.z0.get(R) == i3) {
                            num = Integer.valueOf(R);
                        } else {
                            i9++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    tx9Var.h(num.intValue(), view2);
                }
                qx3.E0(null, h04Var.b, false, null, null);
                tx9Var.C0.add(Long.valueOf(h04Var.b.id));
                tx9Var.B(true, true, true);
                return;
            case 16:
                zda zdaVar = (zda) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nfa nfaVar = zdaVar.f;
                d dVar3 = nfaVar.y1;
                dVar3.finishPreviewFragment();
                chat.left = false;
                zdaVar.E(false);
                zdaVar.r(i3);
                if (zdaVar.d.isEmpty()) {
                    nfaVar.N1(true);
                    nfaVar.y();
                }
                dVar3.getNotificationCenter().k(203, Long.valueOf(-nfaVar.m1));
                dVar3.getMessagesController().k(chat.id, dVar3.getUserConfig().f(), null, dVar3, new t7a(zdaVar, chat, (byte) 5));
                return;
            case 17:
                d01.t((Context) obj2, "https://" + na7.q1(i3).N2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 18:
                ((r15) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i3);
                return;
            case 19:
                x4c x4cVar = (x4c) obj2;
                x4cVar.e.a(true, true);
                na7.q1(i3).P1().f(false, (ArrayList) obj, new jq0(x4cVar, i3, (byte) 5));
                return;
            case 20:
                ((ae9) obj).a(Integer.valueOf(i3));
                ((cmc) obj2).setSelected(i3);
                return;
            case 21:
                ((qqc) obj2).a(i3, ((pqc) obj).h);
                return;
            case 22:
                u41 u41Var = (u41) obj2;
                fx0 fx0Var = (fx0) obj;
                if (!u41Var.R) {
                    gl2 gl2Var = xrc.d;
                    if (gl2Var != null && ((byte[]) gl2Var.f) != null) {
                        u41Var.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_requestUrlAuth, new hc((byte) 0), new u15(u41Var, fx0Var, i10, view, gl2Var));
                        return;
                    }
                    fa4.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            default:
                gba.m0 = i3;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putInt("searchEngineType", gba.m0);
                edit.apply();
                ((wgb) ((View) obj2)).w(is9.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
        }
    }

    public wg(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public wg(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
