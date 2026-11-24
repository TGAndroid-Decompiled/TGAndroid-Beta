package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class b0 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public b0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        ob1 ob1Var;
        String G;
        eg egVar;
        x02 x02Var;
        boolean p1;
        k37 k37Var;
        boolean z;
        boolean z2;
        TLRPC.Document document;
        byte b = this.a;
        int i = 4;
        long j = 0;
        CharSequence charSequence = null;
        boolean z3 = false;
        boolean z4 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                e0 e0Var = (e0) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                wjb wjbVar = (wjb) obj;
                u41 u41Var = e0Var.a2;
                if (u41Var.e0 && !u41Var.R) {
                    if (e0Var.Y0()) {
                        e0Var.dismiss();
                        return;
                    }
                    u41Var.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(e0Var.a).sendRequestTyped(savetone, new hc((byte) 0), new p(e0Var, wjbVar, aiComposeTone, (byte) 1));
                    return;
                }
                return;
            case 1:
                new ty((Context) obj2, null, null, (gt4) obj).show();
                ((j9) obj3).dismiss();
                return;
            case 2:
                ((boolean[]) obj3)[0] = false;
                ((gj) obj2).s(-1, 0, true);
                ((fx0) ((i4d) obj).a).y0.run();
                return;
            case 3:
                tc tcVar = (tc) obj2;
                ej ejVar = (ej) obj;
                hd hdVar = ((hd[]) obj3)[0];
                if (hdVar != null) {
                    hdVar.setOnDismissListener(null);
                }
                tcVar.run();
                ejVar.a(((k5) view).getAccountNumber());
                return;
            case 4:
                gba.l0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putInt("mapPreviewType", gba.l0);
                edit.apply();
                ((Runnable) obj2).run();
                ((AlertDialog$Builder) obj).a.M0.run();
                return;
            case 5:
                au8 au8Var = (au8) obj3;
                rw0 rw0Var = (rw0) obj;
                SharedPreferences.Editor edit2 = na7.c1().edit();
                edit2.putBoolean("proxy_enabled", true);
                au8Var.i(edit2);
                edit2.commit();
                gba.x1 = gba.a(new fba(au8Var));
                ConnectionsManager.setProxySettings(true, au8Var);
                kk7.e().k(280, new Object[0]);
                d lastFragment = ((LaunchActivity) obj2).N().getLastFragment();
                if (lastFragment instanceof mu1) {
                    mu1 mu1Var = (mu1) lastFragment;
                    mu1Var.b6();
                    UndoView undoView = mu1Var.N3;
                    if (undoView != null) {
                        undoView.j(87, 0L, null);
                        rw0Var.run();
                        return;
                    }
                }
                kk7.e().k(295, 6, k96.M0(2131746417, null));
                rw0Var.run();
                return;
            case 6:
                o oVar = (o) obj3;
                String str = (String) obj2;
                m mVar = (m) obj;
                oVar.i0.k(false);
                gl.t1(oVar.i0.c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                gl.g(str);
                new u21(mVar.f, null).k(false).k(true);
                return;
            case 7:
                ty tyVar = (ty) obj3;
                boolean[] zArr = (boolean[]) obj2;
                wjb wjbVar2 = (wjb) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    kt4.c(tyVar.a).e(tyVar.S1, new ht(tyVar, zArr, wjbVar2, (byte) 2));
                    return;
                }
                return;
            case 8:
                ez ezVar = (ez) obj3;
                int i2 = ezVar.a;
                gt4 gt4Var = ezVar.h2;
                new kna((Context) obj2, (wjb) obj, i2, gt4Var.d.title, gt4Var.h, false).show();
                ezVar.dismiss();
                return;
            case 9:
                ez ezVar2 = (ez) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                wjb wjbVar3 = (wjb) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    kt4.c(ezVar2.a).e(ezVar2.T1, new ht(ezVar2, zArr2, wjbVar3, (byte) 3));
                    return;
                }
                return;
            case 10:
                ((h20) obj3).n.R0((j20) obj2, (k27) obj);
                return;
            case 11:
                o31 o31Var = (o31) obj3;
                cs5 G2 = cs5.G(((mu1) obj2).getLayoutContainer(), (wjb) obj, o31Var.n);
                G2.b(2131232092, k96.M0(2131753699, null), new n31(o31Var, (byte) 1), true);
                G2.F();
                if (o31Var.y != null) {
                    G2.b(2131232365, k96.M0(2131753700, null), new n31(o31Var, (byte) 2), false);
                }
                G2.b0(gl.L(10.0f), gl.L(7.0f));
                G2.s = (short) 0;
                G2.a0();
                return;
            case 12:
                z61 z61Var = (z61) obj3;
                d dVar = (d) obj;
                Bundle bundle = new Bundle();
                u61 u61Var = ((h71) obj2).d;
                long j2 = u61Var.b;
                if (j2 > 0) {
                    bundle.putLong("user_id", j2);
                } else {
                    bundle.putLong("chat_id", -j2);
                }
                bundle.putInt("message_id", u61Var.g);
                dVar.presentFragment(new mu1(bundle));
                z61Var.f.G.dismiss();
                m8 m8Var = z61Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    return;
                }
                return;
            case 13:
                j7b j7bVar = (j7b) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                f53 f53Var = (f53) obj;
                cs5 cs5Var = j7bVar.V0;
                if (cs5Var == null || !cs5Var.E()) {
                    ob1 ob1Var2 = new ob1(j7bVar, (byte) 0);
                    boolean p = y6c.h(j7bVar.V).p();
                    if (p) {
                        ob1Var = null;
                    } else {
                        ob1Var = new ob1(j7bVar, (byte) 1);
                    }
                    cs5 G3 = cs5.G(frameLayout, f53Var, j7bVar.T0);
                    j7bVar.V0 = G3;
                    G3.o(13, gl.L(200.0f), k96.N0("StoryPeriodHint"));
                    j7bVar.V0.j();
                    int i3 = 0;
                    while (true) {
                        int[] iArr = rb1.Q1;
                        if (i3 < i) {
                            int i4 = iArr[i3];
                            cs5 cs5Var2 = j7bVar.V0;
                            if (i4 == Integer.MAX_VALUE) {
                                G = k96.N0("StoryPeriodKeep");
                            } else {
                                G = k96.G(i4 / 3600, "Hours", new Object[0]);
                            }
                            String str2 = G;
                            int i5 = bkb.D8;
                            cs5Var2.a(0, null, str2, i5, i5, new eg(ob1Var2, i4, (byte) 11));
                            if (!p && i4 != 86400 && i4 != Integer.MAX_VALUE) {
                                egVar = new eg(ob1Var, i4, (byte) 12);
                            } else {
                                egVar = null;
                            }
                            cs5Var2.N(egVar);
                            if (j7bVar.X0 == i3) {
                                j7bVar.V0.M();
                            }
                            i3++;
                            i = 4;
                        } else {
                            cs5 cs5Var3 = j7bVar.V0;
                            cs5Var3.s = (short) 0;
                            cs5Var3.a0();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 14:
                a09 a09Var = (a09) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr2 = (int[]) obj;
                if (a09Var == null || a09Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr2[0]);
                    return;
                }
                return;
            case 15:
                mu1 mu1Var2 = (mu1) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                k27 k27Var = (k27) obj;
                if (mu1Var2.getParentActivity() != null) {
                    if (mu1Var2.d1.getVisibility() != 0 || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        mu1Var2.a0.s0(keyboardInlineButton, k27Var, k27Var, null);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((mu1) obj3).Ca((hf0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 17:
                ((mu1) obj3).A8((boolean[]) obj2, (Context) obj);
                return;
            case 18:
                ((mu1) obj3).C8((cr1) obj2, (boolean[]) obj);
                return;
            case 19:
                wt1 wt1Var = (wt1) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                gb2 gb2Var = (gb2) obj;
                d dVar2 = wt1Var.a;
                dVar2.finishPreviewFragment();
                chat.left = false;
                if (gb2Var.w != null) {
                    dVar2.getNotificationCenter().k(203, Long.valueOf(gb2Var.w.e));
                }
                dVar2.getMessagesController().k(chat.id, dVar2.getUserConfig().f(), null, dVar2, new it1(wt1Var, chat, (byte) 3));
                return;
            case 20:
                x02 x02Var2 = (x02) obj3;
                d dVar3 = (d) obj2;
                wjb wjbVar4 = (wjb) obj;
                d dVar4 = x02Var2.Z1;
                int i6 = x02Var2.G3;
                e02 e02Var = x02Var2.F2;
                bx1 bx1Var = x02Var2.b2;
                if (bx1Var != null) {
                    j = bx1Var.i();
                }
                long j3 = j;
                x02Var2.K2 = j3;
                e02Var.setEffect(j3);
                x02Var2.f1 = true;
                if (x02Var2.E1 - x02Var2.F1 < 0) {
                    gl.z3(x02Var2.t1);
                    gl.z3(x02Var2.u1);
                    try {
                        e02Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!na7.q1(i6).F3() && na7.q1(i6).k4.h1.f() > x02Var2.F1) {
                        x02Var2.y1(dVar3);
                    }
                    bx1 bx1Var2 = x02Var2.b2;
                    if (bx1Var2 != null) {
                        bx1Var2.f(false);
                        x02Var2.b2 = null;
                        return;
                    }
                    return;
                }
                if (x02Var2.E3 == null && (dVar4 instanceof mu1)) {
                    mu1 mu1Var3 = (mu1) dVar4;
                    if (mu1Var3.P7()) {
                        ij.J(x02Var2.getContext(), mu1Var3.a(), new rz1(x02Var2, j3, (byte) 0), wjbVar4);
                        x02Var = x02Var2;
                        x02Var.q1(false, false);
                        return;
                    }
                }
                p02 p02Var = x02Var2.v2;
                if (p02Var != x02Var2.d2 && p02Var != x02Var2.k2) {
                    if (!p02Var.M(true, 0, 0, j3, x02Var2.a1())) {
                        x02Var2.A4 = true;
                        x02Var2.dismiss();
                    }
                    x02Var = x02Var2;
                    p1 = false;
                } else {
                    x02Var = x02Var2;
                    p1 = x02Var.p1(true, 0, 0, j3, x02Var2.a1());
                }
                bx1 bx1Var3 = x02Var.b2;
                if (bx1Var3 != null) {
                    bx1Var3.f(!p1);
                    x02Var.b2 = null;
                }
                x02Var.q1(false, false);
                return;
            case 21:
                x02 x02Var3 = (x02) obj3;
                k27 k27Var2 = (k27) obj2;
                x02Var3.q1(!x02Var3.W1, true);
                TLRPC.Message message = k27Var2.k;
                boolean z5 = x02Var3.W1;
                message.invert_media = z5;
                ((k37) obj).a(!z5, true);
                x02Var3.b2.d(k27Var2);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var3.d2;
                if (chatAttachAlertPhotoLayout != null && (k37Var = chatAttachAlertPhotoLayout.e1) != null) {
                    k37Var.a(!x02Var3.W1, true);
                }
                x02Var3.b2.n(!x02Var3.W1);
                return;
            case 22:
                p82 p82Var = (p82) obj3;
                uy8[] uy8VarArr = (uy8[]) obj2;
                i4d i4dVar = (i4d) obj;
                Integer num = (Integer) view.getTag();
                uy8 uy8Var = uy8VarArr[0];
                if (num.intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                uy8Var.a(z);
                uy8 uy8Var2 = uy8VarArr[1];
                if (num.intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                uy8Var2.a(z2);
                if (num.intValue() == 1) {
                    z3 = true;
                }
                p82Var.K0 = z3;
                ((fx0) i4dVar.a).y0.run();
                p82Var.t0(true, true);
                return;
            case 23:
                mf2 mf2Var = (mf2) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                on7 on7Var = (on7) obj;
                u41 u41Var2 = mf2Var.X1;
                if (!u41Var2.R) {
                    u41Var2.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = na7.q1(mf2Var.a).m1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(mf2Var.a).sendRequest(updateconnectedbot, new pl(mf2Var, on7Var, (byte) 24));
                    return;
                }
                return;
            case 24:
                k27 k27Var3 = (k27) obj2;
                PhotoViewer photoViewer = ((lg2) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList = ((hbc) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj4 = arrayList.get(i7);
                            i7++;
                            jbc jbcVar = (jbc) obj4;
                            if (jbcVar.b()) {
                                document = jbcVar.g;
                            }
                        } else {
                            long j4 = Long.MAX_VALUE;
                            jbc jbcVar2 = null;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                jbc jbcVar3 = (jbc) arrayList.get(i8);
                                if (jbcVar3.k < j4 && lbc.C0(jbcVar3.m)) {
                                    j4 = jbcVar3.k;
                                    jbcVar2 = jbcVar3;
                                }
                            }
                            if (jbcVar2 != null) {
                                document = jbcVar2.g;
                            } else {
                                document = ((jbc) arrayList.get(0)).g;
                            }
                        }
                    }
                }
                if (document != null) {
                    ba4.G(photoViewer.U);
                    File J = ba4.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        ba4.G(photoViewer.U);
                        J = ba4.J(document, null, true, true);
                    }
                    if (J != null && J.exists()) {
                        MediaController.d0(J.toString(), photoViewer.E, 1, null, null, new r68(photoViewer, (byte) 2));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        k27Var3.f3 = document;
                        arrayList2.add(k27Var3);
                        MediaController.f0(photoViewer.E, j5.a(photoViewer.U), arrayList2, new re1(photoViewer, (byte) 4));
                    }
                    photoViewer.p0.U(null, null);
                    return;
                }
                return;
            case 25:
                qm2 qm2Var = (qm2) obj3;
                p8c p8cVar = (p8c) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                boolean z6 = qm2Var.T1;
                if (chat2 != null && !hc2.w(27, chat2)) {
                    z3 = true;
                }
                qm2Var.Y0(p8cVar, z6, z3);
                return;
            case 26:
                it2 it2Var = (it2) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                ij.L((Context) obj2, k96.M0(2131745893, null), k96.a0(null, null, 2131745894, user.first_name), k96.M0(2131745925, null), new ys2(it2Var, user, (byte) 1), it2Var.r).o();
                return;
            case 27:
                gt3 gt3Var = (gt3) obj3;
                ps0 ps0Var = (ps0) obj2;
                z77 z77Var = (z77) obj;
                try {
                    charSequence = ((ClipboardManager) gt3Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(gt3Var.getContext());
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (charSequence != null) {
                    ps0Var.setText(charSequence);
                    ps0Var.setSelection(0, ps0Var.getText().length());
                }
                z77Var.run();
                return;
            case 28:
                rt3 rt3Var = (rt3) obj3;
                cja cjaVar = (cja) obj2;
                wjb wjbVar5 = (wjb) obj;
                mt3 mt3Var = rt3Var.a;
                v31 v31Var = rt3Var.b;
                if (v31Var.isEnabled() && v31Var.getAlpha() >= 0.5f) {
                    gb gbVar = rt3Var.L;
                    if (gbVar == null || !gbVar.f) {
                        if (rt3Var.n) {
                            mt3Var.m();
                            cs5 cs5Var4 = new cs5(cjaVar, wjbVar5, v31Var, false, false, true);
                            cs5Var4.a0 = gl.L(280.0f);
                            mt3Var.o(null, new t07(cs5Var4, mt3Var));
                            cs5Var4.X = true;
                            cs5Var4.a0();
                            return;
                        } else if (!rt3Var.e) {
                            rt3Var.x(1);
                            boolean isFocused = mt3Var.isFocused();
                            nt3 nt3Var = rt3Var.d;
                            if (mt3Var.length() <= 0) {
                                z4 = false;
                            }
                            nt3Var.B(z4, false);
                            mt3Var.requestFocus();
                            if (!isFocused) {
                                mt3Var.setSelection(mt3Var.length());
                                return;
                            }
                            return;
                        } else {
                            if (rt3Var.y) {
                                rt3Var.k(true);
                                rt3Var.y = false;
                                rt3Var.p();
                            }
                            rt3Var.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                jm6 jm6Var = (jm6) obj2;
                or4 or4Var = (or4) obj;
                sr4 sr4Var = ((mr4) obj3).c;
                ArrayList arrayList3 = sr4Var.i0;
                if (arrayList3.contains(jm6Var)) {
                    arrayList3.remove(jm6Var);
                } else if (arrayList3.size() + 1 > sr4Var.S) {
                    int i9 = -sr4Var.O;
                    sr4Var.O = i9;
                    gl.A3(i9, or4Var, null);
                    pw0.APP_ERROR.a();
                    return;
                } else {
                    arrayList3.add(jm6Var);
                }
                gl.V3(sr4Var.d);
                sr4Var.j();
                return;
        }
    }
}
