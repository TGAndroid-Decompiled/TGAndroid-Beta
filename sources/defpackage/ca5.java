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
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class ca5 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public ca5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        n38 n38Var;
        byte b = this.a;
        float f = 0.0f;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ha5 ha5Var = (ha5) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                ha5Var.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                ((oa5) obj).f(false);
                return;
            case 2:
                ra5 ra5Var = (ra5) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(ra5Var.getContext(), LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    ra5Var.getContext().startActivity(action);
                    return;
                }
                return;
            case 3:
                d85 d85Var = (d85) obj;
                d85Var.E0(d85Var.q1);
                d85Var.dismiss();
                return;
            case 4:
                jh2 jh2Var = (jh2) obj;
                CheckBoxBase checkBoxBase = jh2Var.a;
                jh2Var.a(!checkBoxBase.q, true);
                oc7.d1().edit().putBoolean("callmiconstart", checkBoxBase.q).apply();
                return;
            case 5:
                wb5 wb5Var = (wb5) obj;
                wb5Var.d(wb5Var);
                return;
            case 6:
                ((yb5) obj).b.a1(19);
                return;
            case 7:
                oc5 oc5Var = ((mc5) obj).J;
                oc5Var.Y = null;
                oc5Var.a0.b();
                oc5Var.h.b();
                oc5Var.m0();
                oc5Var.w0();
                return;
            case 8:
                ((id5) obj).d.i0(null);
                return;
            case 9:
                ((ud5) obj).dismiss();
                return;
            case 10:
                re5 re5Var = (re5) obj;
                re5Var.a0(!re5Var.E, true);
                rc7 rc7Var = re5Var.r;
                boolean z2 = re5Var.E;
                ValueAnimator valueAnimator = rc7Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f2 = rc7Var.e;
                if (z2) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                rc7Var.f = ofFloat;
                ofFloat.addUpdateListener(new af0(rc7Var, (byte) 9));
                rc7Var.f.addListener(new jf4((byte) 15, rc7Var, z2));
                rc7Var.f.setDuration(320L);
                rc7Var.f.setInterpolator(d53.h);
                rc7Var.f.start();
                return;
            case 11:
                ((bp5) obj).dismiss();
                return;
            case 12:
                ((es5) obj).f0();
                return;
            case 13:
                ((jt5) obj).performClick();
                return;
            case 14:
                wv5 wv5Var = (wv5) obj;
                wv5Var.y1 = oc7.r1(wv5Var.a).i1(k47.B1(wv5Var.w1));
                wv5Var.z1 = true;
                wv5Var.dismiss();
                return;
            case 15:
                yv5 yv5Var = (yv5) obj;
                yv5Var.l1 = true;
                yv5Var.dismiss();
                return;
            case 16:
                ((ew5) obj).dismiss();
                return;
            case 17:
                ((h65) obj).run();
                return;
            case 18:
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
            case 19:
                ((l66) obj).performClick();
                return;
            case 20:
                s56 s56Var = (s56) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s56Var.getParentActivity());
                String M0 = jb6.M0(2131745759, null);
                he heVar = alertDialog$Builder.a;
                heVar.U = M0;
                heVar.S = jb6.M0(2131745756, null);
                alertDialog$Builder.j(jb6.M0(2131745757, null), new i56(s56Var, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                s56Var.showDialog(heVar);
                return;
            case 21:
                ((n38) obj).p(!n38Var.g0, true);
                return;
            case 22:
                ((qc6) obj).J();
                return;
            case 23:
                final sf6 sf6Var = (sf6) obj;
                mh6 mh6Var = sf6Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mh6Var.getParentActivity());
                String M02 = jb6.M0(2131745804, "RestorePasswordNoEmailTitle");
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                heVar2.U = jb6.M0(2131745808, "RestoreEmailTroubleText");
                alertDialog$Builder2.j(jb6.M0(2131747564, null), new ee() {
                    @Override
                    public final void r(he heVar3, int i2) {
                        byte b2 = r2;
                        sf6 sf6Var2 = sf6Var;
                        switch (b2) {
                            case 0:
                                sf6Var2.E.J1(6, true, new Bundle(), true);
                                return;
                            default:
                                sf6Var2.E.O1(sf6Var2.r, sf6Var2.s, sf6Var2.w);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.g(jb6.M0(2131745850, null), new ee() {
                    @Override
                    public final void r(he heVar3, int i2) {
                        byte b2 = r2;
                        sf6 sf6Var2 = sf6Var;
                        switch (b2) {
                            case 0:
                                sf6Var2.E.J1(6, true, new Bundle(), true);
                                return;
                            default:
                                sf6Var2.E.O1(sf6Var2.r, sf6Var2.s, sf6Var2.w);
                                return;
                        }
                    }
                });
                Dialog showDialog = mh6Var.showDialog(heVar2);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 24:
                ag6 ag6Var = (ag6) obj;
                mh6 mh6Var2 = ag6Var.H;
                if (mh6Var2.W.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh6Var2.getParentActivity());
                    String M03 = jb6.M0(2131745832, "ResetMyAccountWarning");
                    he heVar3 = alertDialog$Builder3.a;
                    heVar3.S = M03;
                    heVar3.U = jb6.M0(2131745830, "ResetMyAccountWarningText");
                    alertDialog$Builder3.j(jb6.M0(2131745831, "ResetMyAccountWarningReset"), new wx4(ag6Var, (byte) 29));
                    alertDialog$Builder3.g(jb6.M0(2131752542, "Cancel"), null);
                    mh6Var2.showDialog(heVar3);
                    return;
                }
                return;
            case 25:
                cg6 cg6Var = (cg6) obj;
                nm7.e().a(new xc0(cg6Var, (byte) 2), 310);
                Context context = cg6Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str2 = e21.h;
                ite.f(str2);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                ua4 a = ble.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str2, null, hashMap, null));
                a.k().addOnCompleteListener(new nv4(cg6Var, a, (byte) 21));
                return;
            case 26:
                ij6 ij6Var = (ij6) obj;
                ij6Var.M.a(ij6Var, true);
                return;
            case 27:
                final xj6 xj6Var = (xj6) obj;
                ak6 ak6Var = xj6Var.L;
                if (xj6Var.n != null) {
                    View view2 = ak6Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        bu5 G = bu5.G((ViewGroup) view2, null, xj6Var);
                        if (xj6Var.n.revoked) {
                            G.b(2131232114, jb6.M0(2131751535, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                                                    xj6 xj6Var3 = xj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var3.L.j0(tL_chatInviteExported2);
                                                            return;
                                                        default:
                                                            xj6Var3.L.e0(tL_chatInviteExported2);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            return;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, true);
                        } else {
                            G.b(2131232109, jb6.M0(2131751699, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            return;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, false);
                            G.b(2131232369, jb6.M0(2131745192, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            return;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, false);
                            G.k(2131232122, jb6.M0(2131751214, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            return;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, (xj6Var.n.permanent || !ak6Var.q0) ? false : false);
                            G.l(2131232114, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            return;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            return;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() {
                                                @Override
                                                public final void r(he heVar4, int i2) {
                                                    byte b2 = r3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b2) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            return;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            return;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            return;
                                    }
                                }
                            }, jb6.M0(2131745756, null), ak6Var.q0, true);
                        }
                        G.X(ak6Var.b.V0(xj6Var, false));
                        G.a0();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((ku6) obj).dismiss();
                return;
            default:
                n57 n57Var = (n57) obj;
                n57.b(n57Var.getContext(), n57Var.a, n57Var.n, false, n57Var.y, new pg6(n57Var, (byte) 20), n57Var.c);
                return;
        }
    }
}
