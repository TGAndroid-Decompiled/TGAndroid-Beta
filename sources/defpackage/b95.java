package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class b95 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public b95(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f;
        l18 l18Var;
        ahb ahbVar;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                f65 f65Var = (f65) obj;
                f65Var.E0(f65Var.q1);
                f65Var.dismiss();
                return;
            case 1:
                wf2 wf2Var = (wf2) obj;
                CheckBoxBase checkBoxBase = wf2Var.a;
                wf2Var.a(!checkBoxBase.q, true);
                na7.c1().edit().putBoolean("callmiconstart", checkBoxBase.q).apply();
                return;
            case 2:
                y95 y95Var = (y95) obj;
                y95Var.d(y95Var);
                return;
            case 3:
                ((aa5) obj).b.Z0(19);
                return;
            case 4:
                qa5 qa5Var = ((oa5) obj).J;
                qa5Var.Y = null;
                qa5Var.a0.b();
                qa5Var.h.b();
                qa5Var.l0();
                qa5Var.v0();
                return;
            case 5:
                ((kb5) obj).d.h0(null);
                return;
            case 6:
                ((wb5) obj).dismiss();
                return;
            case 7:
                tc5 tc5Var = (tc5) obj;
                tc5Var.Z(!tc5Var.E, true);
                qa7 qa7Var = tc5Var.r;
                boolean z2 = tc5Var.E;
                ValueAnimator valueAnimator = qa7Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f2 = qa7Var.e;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                qa7Var.f = ofFloat;
                ofFloat.addUpdateListener(new ae0(qa7Var, (byte) 9));
                qa7Var.f.addListener(new id4((byte) 15, qa7Var, z2));
                qa7Var.f.setDuration(320L);
                qa7Var.f.setInterpolator(s33.h);
                qa7Var.f.start();
                return;
            case 8:
                ((bn5) obj).dismiss();
                return;
            case 9:
                ((gq5) obj).e0();
                return;
            case 10:
                ((kr5) obj).performClick();
                return;
            case 11:
                xt5 xt5Var = (xt5) obj;
                xt5Var.y1 = na7.q1(xt5Var.a).h1(k27.B1(xt5Var.w1));
                xt5Var.z1 = true;
                xt5Var.dismiss();
                return;
            case 12:
                zt5 zt5Var = (zt5) obj;
                zt5Var.l1 = true;
                zt5Var.dismiss();
                return;
            case 13:
                ((fu5) obj).dismiss();
                return;
            case 14:
                ((j45) obj).run();
                return;
            case 15:
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
            case 16:
                ((l46) obj).performClick();
                return;
            case 17:
                s36 s36Var = (s36) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s36Var.getParentActivity());
                String M0 = k96.M0(2131745833, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.U = M0;
                hdVar.S = k96.M0(2131745830, null);
                alertDialog$Builder.j(k96.M0(2131745831, null), new i36(s36Var, (byte) 1));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                s36Var.showDialog(hdVar);
                return;
            case 18:
                ((l18) obj).p(!l18Var.g0, true);
                return;
            case 19:
                ((ra6) obj).J();
                return;
            case 20:
                final td6 td6Var = (td6) obj;
                mf6 mf6Var = td6Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mf6Var.getParentActivity());
                String M02 = k96.M0(2131745878, "RestorePasswordNoEmailTitle");
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M02;
                hdVar2.U = k96.M0(2131745882, "RestoreEmailTroubleText");
                alertDialog$Builder2.j(k96.M0(2131747638, null), new ed() {
                    @Override
                    public final void u(hd hdVar3, int i2) {
                        byte b2 = r2;
                        td6 td6Var2 = td6Var;
                        switch (b2) {
                            case 0:
                                td6Var2.E.I1(6, true, new Bundle(), true);
                                return;
                            default:
                                td6Var2.E.N1(td6Var2.r, td6Var2.s, td6Var2.w);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.g(k96.M0(2131745924, null), new ed() {
                    @Override
                    public final void u(hd hdVar3, int i2) {
                        byte b2 = r2;
                        td6 td6Var2 = td6Var;
                        switch (b2) {
                            case 0:
                                td6Var2.E.I1(6, true, new Bundle(), true);
                                return;
                            default:
                                td6Var2.E.N1(td6Var2.r, td6Var2.s, td6Var2.w);
                                return;
                        }
                    }
                });
                Dialog showDialog = mf6Var.showDialog(hdVar2);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 21:
                be6 be6Var = (be6) obj;
                mf6 mf6Var2 = be6Var.H;
                if (mf6Var2.W.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mf6Var2.getParentActivity());
                    String M03 = k96.M0(2131745906, "ResetMyAccountWarning");
                    hd hdVar3 = alertDialog$Builder3.a;
                    hdVar3.S = M03;
                    hdVar3.U = k96.M0(2131745904, "ResetMyAccountWarningText");
                    alertDialog$Builder3.j(k96.M0(2131745905, "ResetMyAccountWarningReset"), new ry4(be6Var, (byte) 26));
                    alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), null);
                    mf6Var2.showDialog(hdVar3);
                    return;
                }
                return;
            case 22:
                de6 de6Var = (de6) obj;
                kk7.e().a(new xb0(de6Var, (byte) 2), 308);
                Context context = de6Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str2 = w01.h;
                fre.f(str2);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                u84 a = aje.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str2, null, hashMap, null));
                a.k().addOnCompleteListener(new h45(de6Var, a, (byte) 20));
                return;
            case 23:
                gh6 gh6Var = (gh6) obj;
                gh6Var.M.a(gh6Var, true);
                return;
            case 24:
                final vh6 vh6Var = (vh6) obj;
                yh6 yh6Var = vh6Var.L;
                if (vh6Var.n != null) {
                    View view2 = yh6Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        cs5 G = cs5.G((ViewGroup) view2, null, vh6Var);
                        if (vh6Var.n.revoked) {
                            G.b(2131232113, k96.M0(2131751586, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                                                    vh6 vh6Var3 = vh6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var3.L.i0(tL_chatInviteExported2);
                                                            return;
                                                        default:
                                                            vh6Var3.L.d0(tL_chatInviteExported2);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            return;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, true);
                        } else {
                            G.b(2131232108, k96.M0(2131751750, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            return;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, false);
                            G.b(2131232368, k96.M0(2131745266, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            return;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, false);
                            G.k(2131232121, k96.M0(2131751265, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            return;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, (vh6Var.n.permanent || !yh6Var.q0) ? false : false);
                            G.l(2131232113, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            return;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() {
                                                @Override
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, k96.M0(2131745830, null), yh6Var.q0, true);
                        }
                        G.X(yh6Var.b.V0(vh6Var, false));
                        G.a0();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((js6) obj).dismiss();
                return;
            case 26:
                n37 n37Var = (n37) obj;
                n37.b(n37Var.getContext(), n37Var.a, n37Var.n, false, n37Var.y, new vl6(n37Var, (byte) 13), n37Var.c);
                return;
            case 27:
                s47 s47Var = (s47) obj;
                long j = s47Var.b;
                if (!s47Var.n.w4()) {
                    if (s47Var.getParentLayout().getFragmentStack().size() > 1) {
                        d dVar = (d) s47Var.getParentLayout().getFragmentStack().get(s47Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((dVar instanceof mu1) && ((mu1) dVar).e.id == j) {
                            s47Var.finishFragment();
                            return;
                        }
                    }
                    Bundle k = ls6.k(j, "chat_id");
                    k.putInt("message_id", s47Var.c);
                    k.putBoolean("need_remove_previous_same_chat_activity", false);
                    s47Var.presentFragment(new mu1(k));
                    return;
                }
                return;
            case 28:
                ((t47) obj).dismiss();
                return;
            default:
                ((ahb) obj).setChecked(!ahbVar.e.h);
                return;
        }
    }
}
