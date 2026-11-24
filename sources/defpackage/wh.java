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
public final class wh implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public wh(int i, View view, AtomicReference atomicReference) {
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
        fm fmVar;
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
                ((lp7) obj2).setValue(i3);
                ((uh) obj).run();
                return;
            case 1:
                ik1 ik1Var = (ik1) obj2;
                xza xzaVar = (xza) obj;
                xj1 xj1Var = ik1Var.G0;
                if (view.isEnabled() && !xj1Var.R && !ik1Var.A0.R) {
                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                    if (ik1Var.B0 > currentTime) {
                        ik1Var.P0 = c41.b0(xzaVar).Q(2131624287, 36, gm.S2(jb6.a0(null, null, 2131752905, au0.x0(ik1Var.B0 - currentTime)))).j();
                        return;
                    } else if (ik1Var.N0 < oc7.r1(i3).l4.q2.f()) {
                        c41.b0(xzaVar).M(ik1Var.getContext().getResources().getDrawable(2131232769).mutate(), gm.N2(jb6.G((int) oc7.r1(i3).l4.q2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new nj1(ik1Var, i3, (byte) 1), null)).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        oj1 oj1Var = new oj1(ik1Var, twoStepVerificationActivity, (byte) 2);
                        twoStepVerificationActivity.a0 = (byte) 1;
                        twoStepVerificationActivity.c0 = oj1Var;
                        xj1Var.setLoading(true);
                        twoStepVerificationActivity.x0(new pj1(ik1Var, xzaVar, twoStepVerificationActivity, (byte) 2));
                        return;
                    }
                }
                return;
            case 2:
                yv1 yv1Var = (yv1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (yv1Var.m1 != null && yv1Var.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i3);
                    return;
                }
                return;
            case 3:
                yv1 yv1Var2 = (yv1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (yv1Var2.v5 != null && i3 < arrayList.size()) {
                    yv1Var2.Ta(((Integer) arrayList.get(i3)).intValue());
                    return;
                }
                return;
            case 4:
                ((xv4) obj2).c(new eh((zkc) obj, i3, (byte) 23));
                return;
            case 5:
                c52 c52Var = (c52) obj2;
                ylb ylbVar = (ylb) obj;
                bu5 G = bu5.G(c52Var, ylbVar, c52Var.y);
                G.T = true;
                G.b(2131232050, jb6.M0(2131742820, null), new wc7(c52Var, i3, ylbVar, (byte) 15), false);
                G.b(2131231783, jb6.M0(2131742888, null), new v42(c52Var, (byte) 0), false);
                G.s = (short) 0;
                G.b0(0.0f, -gm.L(48.0f));
                G.a0();
                return;
            case 6:
                ef3 ef3Var = (ef3) obj2;
                l7c l7cVar = (l7c) obj;
                if (ef3Var.Y0()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ef3Var.getContext());
                    String M0 = jb6.M0(2131743406, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131743405, null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                    heVar.show();
                    return;
                }
                if (i3 <= 0) {
                    z4 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = ef3Var.r2;
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
                ef3Var.c1();
                l7cVar.O(true);
                return;
            case 7:
                ((nk3) obj2).V3(i3, (bu5) obj);
                return;
            case 8:
                wh5 wh5Var = (wh5) obj2;
                wh5Var.n = i3;
                wh5Var.b.e(false, view.getLeft());
                wh5Var.c.e(false, view.getRight());
                ((we7) obj).a(i3);
                wh5Var.invalidate();
                return;
            case 9:
                ((bj6) obj2).j0(i3, (bu5) obj);
                return;
            case 10:
                boolean[] zArr = (boolean[]) obj2;
                x09[] x09VarArr = (x09[]) obj;
                if (i3 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[0] = z;
                for (int i4 = 0; i4 < 2; i4++) {
                    x09 x09Var = x09VarArr[i4];
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
                    x09Var.c.a(z3, true);
                }
                return;
            case 11:
                lu7 lu7Var = (lu7) obj2;
                lu7Var.a(i3);
                lu7Var.b.w().i(i3 - 1, true);
                lu7Var.b.s((u11) obj);
                return;
            case 12:
                d68 d68Var = (d68) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = d68Var.G1;
                d dVar = d68Var.s1;
                int i5 = d68Var.z1;
                if (i3 >= i5 && i3 < d68Var.A1) {
                    fmVar = (fm) arrayList2.get(i3 - i5);
                } else {
                    int i6 = d68Var.B1;
                    if (i3 >= i6 && i3 < d68Var.C1) {
                        fmVar = (fm) d68Var.F1.get(i3 - i6);
                    } else {
                        fmVar = null;
                    }
                }
                if (fmVar != null) {
                    if (d68Var.D1) {
                        int i7 = fmVar.c;
                        if (i7 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + fmVar.c(false)));
                                intent.addFlags(268435456);
                                dVar.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                fc4.g(e, true);
                                return;
                            }
                        } else if (i7 == 1) {
                            l11.u(dVar.getParentActivity(), "mailto:" + fmVar.c(false));
                            return;
                        } else if (i7 == 3) {
                            String c = fmVar.c(false);
                            if (!c.startsWith("http")) {
                                c = "http://".concat(c);
                            }
                            l11.u(dVar.getParentActivity(), c);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dVar.getParentActivity());
                            alertDialog$Builder2.e(new CharSequence[]{jb6.M0(2131751704, null)}, new ff(d68Var, fmVar, (byte) 8));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    fmVar.d = !fmVar.d;
                    if (i3 >= d68Var.z1 && i3 < d68Var.A1) {
                        int i8 = 0;
                        while (true) {
                            if (i8 < arrayList2.size()) {
                                if (((fm) arrayList2.get(i8)).d) {
                                    z4 = true;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        d68Var.r1.setEnabled(z4);
                        d68Var.D0();
                    }
                    ((b68) viewGroup).setChecked(fmVar.d);
                    return;
                }
                return;
            case 13:
                lea leaVar = (lea) obj2;
                d dVar2 = (d) obj;
                jh2 jh2Var = leaVar.G;
                jh2Var.a(!jh2Var.a.q, true);
                boolean z7 = jh2Var.a.q;
                c41 b0 = c41.b0(dVar2);
                if (z7) {
                    i = 2131624189;
                    i2 = 2131750189;
                } else {
                    i = 2131624188;
                    i2 = 2131750188;
                }
                b0.P(i, jb6.M0(i2, null)).j();
                leaVar.d.h = Boolean.valueOf(z7);
                if (leaVar.I >= 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(leaVar.I, true);
                    leaVar.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = oc7.r1(i3).i1(leaVar.c);
                togglechatstargiftnotifications.enabled = z7;
                ConnectionsManager.getInstance(i3).sendRequest(togglechatstargiftnotifications, new jl7(leaVar, dVar2, (byte) 15));
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                ((m8) obj).d(true);
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((pr9) saveToGallerySettingsActivity.s.get(i3)).c.d);
                bundle.putInt("type", saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                s14 s14Var = (s14) obj;
                vz9 vz9Var = ((vy9) obj2).c;
                if (!s14Var.e && !z8c.h(vz9Var.W).p()) {
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new kj8(vz9Var.d1, vz9Var.getContext(), vz9Var.W, 11, false));
                        return;
                    }
                    return;
                }
                int i9 = 0;
                while (true) {
                    ty9 ty9Var = vz9Var.i0;
                    if (i9 < ty9Var.getChildCount()) {
                        if ((ty9Var.getChildAt(i9) instanceof az9) && (R = RecyclerView.R((view2 = ty9Var.getChildAt(i9)))) >= 0 && vz9Var.z0.get(R) == i3) {
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
                    vz9Var.h(num.intValue(), view2);
                }
                az3.E0(null, s14Var.b, false, null, null);
                vz9Var.C0.add(Long.valueOf(s14Var.b.id));
                vz9Var.B(true, true, true);
                return;
            case 16:
                zfa zfaVar = (zfa) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nha nhaVar = zfaVar.f;
                d dVar3 = nhaVar.y1;
                dVar3.finishPreviewFragment();
                chat.left = false;
                zfaVar.E(false);
                zfaVar.s(i3);
                if (zfaVar.d.isEmpty()) {
                    nhaVar.N1(true);
                    nhaVar.y();
                }
                dVar3.getNotificationCenter().k(204, Long.valueOf(-nhaVar.m1));
                dVar3.getMessagesController().k(chat.id, dVar3.getUserConfig().f(), null, dVar3, false, new e6a(zfaVar, chat, (byte) 7), null);
                return;
            case 17:
                l11.u((Context) obj2, "https://" + oc7.r1(i3).N2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 18:
                ((r35) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i3);
                return;
            case 19:
                x6c x6cVar = (x6c) obj2;
                x6cVar.e.a(true, true);
                oc7.r1(i3).Q1().f(false, (ArrayList) obj, new jr0(x6cVar, i3, (byte) 5));
                return;
            case 20:
                ((eg9) obj).a(Integer.valueOf(i3));
                ((boc) obj2).setSelected(i3);
                return;
            case 21:
                ((ssc) obj2).a(i3, ((rsc) obj).h);
                return;
            case 22:
                b61 b61Var = (b61) obj2;
                my0 my0Var = (my0) obj;
                if (!b61Var.R) {
                    sm2 sm2Var = auc.d;
                    if (sm2Var != null && ((byte[]) sm2Var.f) != null) {
                        b61Var.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_requestUrlAuth, new kc((byte) 0), new v35(b61Var, my0Var, i10, view, sm2Var));
                        return;
                    }
                    fc4.b("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            default:
                gda.m0 = i3;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putInt("searchEngineType", gda.m0);
                edit.apply();
                ((xib) ((View) obj2)).w(ku9.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
        }
    }

    public wh(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public wh(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
