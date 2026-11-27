package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class sa5 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public sa5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f;
        c58 c58Var;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                va5 va5Var = (va5) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(va5Var.getContext(), LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    va5Var.getContext().startActivity(action);
                    return;
                }
                return;
            case 1:
                h85 h85Var = (h85) obj;
                h85Var.F0(h85Var.q1);
                h85Var.dismiss();
                return;
            case 2:
                og2 og2Var = (og2) obj;
                CheckBoxBase checkBoxBase = og2Var.a;
                og2Var.a(!checkBoxBase.q, true);
                uc7.e1().edit().putBoolean("callmiconstart", checkBoxBase.q).apply();
                return;
            case 3:
                zb5 zb5Var = (zb5) obj;
                zb5Var.d(zb5Var);
                return;
            case 4:
                ((bc5) obj).b.a1(19);
                return;
            case 5:
                rc5 rc5Var = ((pc5) obj).J;
                rc5Var.Y = null;
                rc5Var.a0.b();
                rc5Var.h.b();
                rc5Var.l0();
                rc5Var.w0();
                return;
            case 6:
                ((ld5) obj).d.h0(null);
                return;
            case 7:
                ((xd5) obj).dismiss();
                return;
            case 8:
                ue5 ue5Var = (ue5) obj;
                ue5Var.Z(!ue5Var.E, true);
                xc7 xc7Var = ue5Var.r;
                boolean z2 = ue5Var.E;
                ValueAnimator valueAnimator = xc7Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f2 = xc7Var.e;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                xc7Var.f = ofFloat;
                ofFloat.addUpdateListener(new ce0(xc7Var, (byte) 9));
                xc7Var.f.addListener(new gf4((byte) 15, xc7Var, z2));
                xc7Var.f.setDuration(320L);
                xc7Var.f.setInterpolator(k43.h);
                xc7Var.f.start();
                return;
            case 9:
                ((ep5) obj).dismiss();
                return;
            case 10:
                ((hs5) obj).e0();
                return;
            case 11:
                ((mt5) obj).performClick();
                return;
            case 12:
                bw5 bw5Var = (bw5) obj;
                bw5Var.y1 = uc7.s1(bw5Var.a).j1(r47.B1(bw5Var.w1));
                bw5Var.z1 = true;
                bw5Var.dismiss();
                return;
            case 13:
                dw5 dw5Var = (dw5) obj;
                dw5Var.l1 = true;
                dw5Var.dismiss();
                return;
            case 14:
                ((jw5) obj).dismiss();
                return;
            case 15:
                ((l65) obj).run();
                return;
            case 16:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.D0;
                launchActivity.G0 = null;
                launchActivity.t0(new LanguageSelectActivity());
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((Dialog) arrayList.get(i)).isShowing()) {
                        ((Dialog) arrayList.get(i)).dismiss();
                    }
                }
                arrayList.clear();
                return;
            case 17:
                ((p66) obj).performClick();
                return;
            case 18:
                v56 v56Var = (v56) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v56Var.getParentActivity());
                String M0 = ob6.M0(2131745753, null);
                id idVar = alertDialog$Builder.a;
                idVar.U = M0;
                idVar.S = ob6.M0(2131745750, null);
                alertDialog$Builder.j(ob6.M0(2131745751, null), new l56(v56Var, (byte) 1));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                v56Var.showDialog(idVar);
                return;
            case 19:
                ((c58) obj).p(!c58Var.g0, true);
                return;
            case 20:
                ((vc6) obj).J();
                return;
            case 21:
                final vf6 vf6Var = (vf6) obj;
                qh6 qh6Var = vf6Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qh6Var.getParentActivity());
                String M02 = ob6.M0(2131745798, "RestorePasswordNoEmailTitle");
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M02;
                idVar2.U = ob6.M0(2131745802, "RestoreEmailTroubleText");
                alertDialog$Builder2.j(ob6.M0(2131747558, null), new fd() {
                    @Override
                    public final void w(id idVar3, int i2) {
                        byte b2 = r2;
                        vf6 vf6Var2 = vf6Var;
                        switch (b2) {
                            case 0:
                                vf6Var2.E.J1(6, true, new Bundle(), true);
                                return;
                            default:
                                vf6Var2.E.O1(vf6Var2.r, vf6Var2.s, vf6Var2.w);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.g(ob6.M0(2131745844, null), new fd() {
                    @Override
                    public final void w(id idVar3, int i2) {
                        byte b2 = r2;
                        vf6 vf6Var2 = vf6Var;
                        switch (b2) {
                            case 0:
                                vf6Var2.E.J1(6, true, new Bundle(), true);
                                return;
                            default:
                                vf6Var2.E.O1(vf6Var2.r, vf6Var2.s, vf6Var2.w);
                                return;
                        }
                    }
                });
                Dialog showDialog = qh6Var.showDialog(idVar2);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 22:
                dg6 dg6Var = (dg6) obj;
                qh6 qh6Var2 = dg6Var.H;
                if (qh6Var2.W.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qh6Var2.getParentActivity());
                    String M03 = ob6.M0(2131745826, "ResetMyAccountWarning");
                    id idVar3 = alertDialog$Builder3.a;
                    idVar3.S = M03;
                    idVar3.U = ob6.M0(2131745824, "ResetMyAccountWarningText");
                    alertDialog$Builder3.j(ob6.M0(2131745825, "ResetMyAccountWarningReset"), new e05(dg6Var, (byte) 28));
                    alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), null);
                    qh6Var2.showDialog(idVar3);
                    return;
                }
                return;
            case 23:
                fg6 fg6Var = (fg6) obj;
                jn7.e().a(new zb0(fg6Var, (byte) 2), 309);
                Context context = fg6Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str2 = f11.h;
                xve.f(str2);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                qa4 a = sne.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str2, null, hashMap, null));
                a.k().addOnCompleteListener(new u34(fg6Var, a, (byte) 25));
                return;
            case 24:
                lj6 lj6Var = (lj6) obj;
                lj6Var.M.a(lj6Var, true);
                return;
            case 25:
                final zj6 zj6Var = (zj6) obj;
                ck6 ck6Var = zj6Var.L;
                if (zj6Var.n != null) {
                    View view2 = ck6Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        fu5 G = fu5.G((ViewGroup) view2, null, zj6Var);
                        if (zj6Var.n.revoked) {
                            G.b(2131232113, ob6.M0(2131751563, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final zj6 zj6Var2 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = zj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = ob6.M0(2131751499, null);
                                            alertDialog$Builder4.a.U = ob6.M0(2131751498, null);
                                            alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                                                    zj6 zj6Var3 = zj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var3.L.i0(tL_chatInviteExported2);
                                                            return;
                                                        default:
                                                            zj6Var3.L.d0(tL_chatInviteExported2);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            zj6 zj6Var3 = zj6Var;
                                            try {
                                                if (zj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zj6Var3.n.link));
                                                    d31.j(zj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            zj6 zj6Var4 = zj6Var;
                                            ck6 ck6Var2 = zj6Var4.L;
                                            try {
                                                if (zj6Var4.n.link != null) {
                                                    Context context2 = zj6Var4.getContext();
                                                    String str3 = zj6Var4.n.link;
                                                    ck6Var2.showDialog(new yj6(zj6Var4, context2, str3, str3, ck6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                cc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            zj6 zj6Var5 = zj6Var;
                                            ck6 ck6Var3 = zj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zj6Var5.n;
                                            v56 v56Var2 = new v56(1, ck6Var3.n);
                                            v56Var2.T = ck6Var3.t0;
                                            v56Var2.c0(tL_chatInviteExported2);
                                            ck6Var3.presentFragment(v56Var2);
                                            return;
                                        default:
                                            final zj6 zj6Var6 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = zj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(zj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = ob6.M0(2131745753, null);
                                            alertDialog$Builder5.a.S = ob6.M0(2131745750, null);
                                            alertDialog$Builder5.j(ob6.M0(2131745751, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    zj6 zj6Var32 = zj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, true);
                        } else {
                            G.b(2131232108, ob6.M0(2131751727, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final zj6 zj6Var2 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = zj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = ob6.M0(2131751499, null);
                                            alertDialog$Builder4.a.U = ob6.M0(2131751498, null);
                                            alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    zj6 zj6Var32 = zj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            zj6 zj6Var3 = zj6Var;
                                            try {
                                                if (zj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zj6Var3.n.link));
                                                    d31.j(zj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            zj6 zj6Var4 = zj6Var;
                                            ck6 ck6Var2 = zj6Var4.L;
                                            try {
                                                if (zj6Var4.n.link != null) {
                                                    Context context2 = zj6Var4.getContext();
                                                    String str3 = zj6Var4.n.link;
                                                    ck6Var2.showDialog(new yj6(zj6Var4, context2, str3, str3, ck6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                cc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            zj6 zj6Var5 = zj6Var;
                                            ck6 ck6Var3 = zj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zj6Var5.n;
                                            v56 v56Var2 = new v56(1, ck6Var3.n);
                                            v56Var2.T = ck6Var3.t0;
                                            v56Var2.c0(tL_chatInviteExported2);
                                            ck6Var3.presentFragment(v56Var2);
                                            return;
                                        default:
                                            final zj6 zj6Var6 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = zj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(zj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = ob6.M0(2131745753, null);
                                            alertDialog$Builder5.a.S = ob6.M0(2131745750, null);
                                            alertDialog$Builder5.j(ob6.M0(2131745751, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    zj6 zj6Var32 = zj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, false);
                            G.b(2131232368, ob6.M0(2131745186, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final zj6 zj6Var2 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = zj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = ob6.M0(2131751499, null);
                                            alertDialog$Builder4.a.U = ob6.M0(2131751498, null);
                                            alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    zj6 zj6Var32 = zj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            zj6 zj6Var3 = zj6Var;
                                            try {
                                                if (zj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zj6Var3.n.link));
                                                    d31.j(zj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            zj6 zj6Var4 = zj6Var;
                                            ck6 ck6Var2 = zj6Var4.L;
                                            try {
                                                if (zj6Var4.n.link != null) {
                                                    Context context2 = zj6Var4.getContext();
                                                    String str3 = zj6Var4.n.link;
                                                    ck6Var2.showDialog(new yj6(zj6Var4, context2, str3, str3, ck6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                cc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            zj6 zj6Var5 = zj6Var;
                                            ck6 ck6Var3 = zj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zj6Var5.n;
                                            v56 v56Var2 = new v56(1, ck6Var3.n);
                                            v56Var2.T = ck6Var3.t0;
                                            v56Var2.c0(tL_chatInviteExported2);
                                            ck6Var3.presentFragment(v56Var2);
                                            return;
                                        default:
                                            final zj6 zj6Var6 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = zj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(zj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = ob6.M0(2131745753, null);
                                            alertDialog$Builder5.a.S = ob6.M0(2131745750, null);
                                            alertDialog$Builder5.j(ob6.M0(2131745751, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    zj6 zj6Var32 = zj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, false);
                            G.k(2131232121, ob6.M0(2131751242, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final zj6 zj6Var2 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = zj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = ob6.M0(2131751499, null);
                                            alertDialog$Builder4.a.U = ob6.M0(2131751498, null);
                                            alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    zj6 zj6Var32 = zj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            zj6 zj6Var3 = zj6Var;
                                            try {
                                                if (zj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zj6Var3.n.link));
                                                    d31.j(zj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            zj6 zj6Var4 = zj6Var;
                                            ck6 ck6Var2 = zj6Var4.L;
                                            try {
                                                if (zj6Var4.n.link != null) {
                                                    Context context2 = zj6Var4.getContext();
                                                    String str3 = zj6Var4.n.link;
                                                    ck6Var2.showDialog(new yj6(zj6Var4, context2, str3, str3, ck6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                cc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            zj6 zj6Var5 = zj6Var;
                                            ck6 ck6Var3 = zj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zj6Var5.n;
                                            v56 v56Var2 = new v56(1, ck6Var3.n);
                                            v56Var2.T = ck6Var3.t0;
                                            v56Var2.c0(tL_chatInviteExported2);
                                            ck6Var3.presentFragment(v56Var2);
                                            return;
                                        default:
                                            final zj6 zj6Var6 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = zj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(zj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = ob6.M0(2131745753, null);
                                            alertDialog$Builder5.a.S = ob6.M0(2131745750, null);
                                            alertDialog$Builder5.j(ob6.M0(2131745751, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    zj6 zj6Var32 = zj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, (zj6Var.n.permanent || !ck6Var.q0) ? false : false);
                            G.l(2131232113, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final zj6 zj6Var2 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = zj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = ob6.M0(2131751499, null);
                                            alertDialog$Builder4.a.U = ob6.M0(2131751498, null);
                                            alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    zj6 zj6Var32 = zj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            zj6 zj6Var3 = zj6Var;
                                            try {
                                                if (zj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zj6Var3.n.link));
                                                    d31.j(zj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            zj6 zj6Var4 = zj6Var;
                                            ck6 ck6Var2 = zj6Var4.L;
                                            try {
                                                if (zj6Var4.n.link != null) {
                                                    Context context2 = zj6Var4.getContext();
                                                    String str3 = zj6Var4.n.link;
                                                    ck6Var2.showDialog(new yj6(zj6Var4, context2, str3, str3, ck6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                cc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            zj6 zj6Var5 = zj6Var;
                                            ck6 ck6Var3 = zj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zj6Var5.n;
                                            v56 v56Var2 = new v56(1, ck6Var3.n);
                                            v56Var2.T = ck6Var3.t0;
                                            v56Var2.c0(tL_chatInviteExported2);
                                            ck6Var3.presentFragment(v56Var2);
                                            return;
                                        default:
                                            final zj6 zj6Var6 = zj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = zj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(zj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = ob6.M0(2131745753, null);
                                            alertDialog$Builder5.a.S = ob6.M0(2131745750, null);
                                            alertDialog$Builder5.j(ob6.M0(2131745751, null), new fd() {
                                                @Override
                                                public final void w(id idVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    zj6 zj6Var32 = zj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            zj6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            zj6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ik8.y(null, 2131752570, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, ob6.M0(2131745750, null), ck6Var.q0, true);
                        }
                        G.X(ck6Var.b.W0(zj6Var, false));
                        G.a0();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((ou6) obj).dismiss();
                return;
            case 27:
                u57 u57Var = (u57) obj;
                u57.b(u57Var.getContext(), u57Var.a, u57Var.n, false, u57Var.y, new z96(u57Var, (byte) 26), u57Var.c);
                return;
            case 28:
                z67 z67Var = (z67) obj;
                long j = z67Var.b;
                if (!z67Var.n.w4()) {
                    if (z67Var.getParentLayout().getFragmentStack().size() > 1) {
                        e eVar = (e) z67Var.getParentLayout().getFragmentStack().get(z67Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((eVar instanceof zu1) && ((zu1) eVar).e.id == j) {
                            z67Var.finishFragment();
                            return;
                        }
                    }
                    Bundle k = qu6.k(j, "chat_id");
                    k.putInt("message_id", z67Var.c);
                    k.putBoolean("need_remove_previous_same_chat_activity", false);
                    z67Var.presentFragment(new zu1(k));
                    return;
                }
                return;
            default:
                ((a77) obj).dismiss();
                return;
        }
    }
}
