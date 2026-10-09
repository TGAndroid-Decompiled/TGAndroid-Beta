package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.wc;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fl;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.dc0;
import org.telegram.ui.g60;
import org.telegram.ui.mi;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
public final class j implements Runnable {
    public final int f1171a;
    public final long f1172b;
    public final Object f1173c;

    public j(Object obj, long j3, int i10) {
        this.f1171a = i10;
        this.f1173c = obj;
        this.f1172b = j3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 e6Var;
        ci.gc gcVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f1171a;
        org.telegram.ui.ActionBar.e6 e6Var2 = null;
        boolean z12 = false;
        r8 = 0;
        int i14 = 0;
        long j3 = this.f1172b;
        Object obj = this.f1173c;
        switch (i13) {
            case 0:
                ((b0) obj).f684s.e0(j3, false);
                return;
            case 1:
                f6 f6Var = ((c4) obj).f755a;
                if (j3 <= 0) {
                    z12 = true;
                }
                f6Var.k0(z12);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((n5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(MessagesController.getInstance(((m9) obj).f1406a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ci.lc lcVar = ci.lc.F2;
                    if (lcVar != null && lcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f21357a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((z9) obj).f2022b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                ci.y9 y9Var = (ci.y9) obj;
                Context context2 = y9Var.getContext();
                ci.fa faVar = y9Var.W;
                org.telegram.ui.ActionBar.n2 n2Var = faVar.attachedFragment;
                e6Var = ((org.telegram.ui.ActionBar.f3) faVar).resourcesProvider;
                org.telegram.ui.Components.g5.R(context2, n2Var, e6Var, new z1(y9Var, j3, 1));
                return;
            case 6:
                ci.lc lcVar2 = (ci.lc) obj;
                ci.gc gcVar2 = lcVar2.F;
                if (gcVar2 != null) {
                    gcVar2.f(true);
                    lcVar2.F = null;
                }
                ci.cc ccVar = lcVar2.f5533x;
                if (ccVar != null) {
                    gcVar = ccVar.a(j3);
                } else {
                    gcVar = null;
                }
                lcVar2.F = gcVar;
                if (gcVar != null) {
                    lcVar2.J = gcVar.f5133a;
                    lcVar2.f5512r.c();
                    ci.xb xbVar = lcVar2.f5483h0;
                    int i15 = lcVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    xbVar.setBackgroundColor(i14);
                    lcVar2.H.set(lcVar2.F.f5135c);
                    ci.gc gcVar3 = lcVar2.F;
                    lcVar2.G = gcVar3.f5134b;
                    gcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                lcVar2.f5533x = null;
                Activity activity = lcVar2.f5461b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f33825z0.post(new ci.ha(lcVar2, 5));
                    return;
                } else {
                    lcVar2.p(true);
                    return;
                }
            case 7:
                ci.pc pcVar = ((wc) obj).f6227a;
                if (pcVar != null) {
                    pcVar.h(j3, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r12.currentAccount).unlinkCommunity(j3, r12.f9992e, new fi.t((fi.k0) obj, 1));
                return;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.f10056i = null;
                t0Var.f10055g.l(j3);
                t0Var.f10059l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.n();
                    return;
                }
                return;
            case 10:
                gg.h0 h0Var = (gg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.f10638s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.g5.L(rVar.f30173b.f33228f0.getParentActivity(), j3, new xa.d(rVar, 24), rVar.f30172a);
                return;
            case 12:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.g5.L(e2Var.getParentActivity(), j3, new xa.d(e2Var, 25), e2Var.getResourceProvider());
                return;
            case 13:
                String str = e2.d0.f8532a;
                j2.f fVar = ((i2.c0) ((k2.j) ((n4.x) obj).f16613c)).f11620a.f11683s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.c(p5, j3));
                return;
            case 14:
                ((LocationController) obj).lambda$removeSharingLocation$21(j3);
                return;
            case 15:
                ((NotificationsController) obj).lambda$processIgnoreStories$20(j3);
                return;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                return;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                return;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                return;
            case 19:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new zn(sc.v.f(j3, "user_id")));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.tc Q = ad.a0((org.telegram.ui.y6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f31138r = false;
                Q.j();
                return;
            case 21:
                fg fgVar = (fg) obj;
                fgVar.getClass();
                fgVar.presentFragment(zn.W9(j3));
                return;
            case 22:
                gl glVar = (gl) obj;
                yi yiVar = glVar.f30173b;
                if (!glVar.H && glVar.I0 && glVar.isShown()) {
                    oi oiVar = yiVar.f33275u1;
                    org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f33228f0;
                    if ((oiVar.R() <= AndroidUtilities.dp(20.0f) || glVar.f26797y0 || glVar.H0) && SystemClock.uptimeMillis() < j3) {
                        glVar.postDelayed(glVar.L0, 32L);
                        return;
                    }
                    glVar.L0 = null;
                    org.telegram.ui.ActionBar.e6 e6Var3 = glVar.f30172a;
                    if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                        context = n2Var2.getParentActivity();
                    } else {
                        context = glVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var3);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                        b2Var.R = string;
                        hg.b1 b1Var = new hg.b1(glVar, context);
                        b1Var.setTextSize(1, 18.0f);
                        b1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, e6Var3));
                        b1Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21091t5, e6Var3));
                        b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        b1Var.setText(glVar.f26783p0);
                        b1Var.setSelection(b1Var.length());
                        b1Var.setInputType(147457);
                        b1Var.setMaxLines(5);
                        b1Var.setImeOptions(6);
                        b1Var.setLineColors(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20925k6, e6Var3), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20943l6, e6Var3), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21018p7, e6Var3));
                        b1Var.setBackground(null);
                        b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, e6Var3);
                        a2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var3), 7, AndroidUtilities.dp(12.0f)));
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (glVar.f26784q0 && glVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        a2Var.e(string2, "", z10, false, false);
                        a2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (LocaleController.isRTL) {
                            i10 = 5;
                        } else {
                            i10 = 3;
                        }
                        layoutParams.gravity = i10 | 16;
                        a2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (LocaleController.isRTL) {
                            i11 = AndroidUtilities.dp(4.0f);
                        } else {
                            i11 = 0;
                        }
                        int dp2 = AndroidUtilities.dp(12.0f);
                        if (LocaleController.isRTL) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(4.0f);
                        }
                        a2Var.setPadding(i11, dp2, dp, AndroidUtilities.dp(12.0f));
                        if (glVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a2Var.setEnabled(z11);
                        a2Var.setOnClickListener(new org.telegram.ui.Components.i1(a2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(b1Var, w7.x5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(a2Var, w7.x5.t(-1, -2, 83, 8, 0, 8, 0));
                        b2Var.G = 6;
                        alertDialog$Builder.n(linearLayout);
                        b2Var.f20407a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.f2(18));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new r5(glVar, b1Var, a2Var, 25));
                        glVar.Q0 = b2Var;
                        b2Var.f20421h0 = false;
                        b2Var.setOnShowListener(new org.telegram.ui.Components.j2(1, b1Var));
                        b2Var.setOnDismissListener(new org.telegram.ui.Components.b1(glVar, 5));
                        b2Var.create();
                        Window window = b2Var.getWindow();
                        Rect rect = new Rect();
                        yiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        if (window != null && rect.height() > 0) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            View decorView = window.getDecorView();
                            int i16 = attributes.width;
                            if (i16 <= 0) {
                                i16 = rect.width();
                            }
                            if (attributes.width > 0) {
                                i12 = 1073741824;
                            } else {
                                i12 = Integer.MIN_VALUE;
                            }
                            decorView.measure(View.MeasureSpec.makeMeasureSpec(i16, i12), View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE));
                            attributes.gravity = 49;
                            attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                            window.setAttributes(attributes);
                        }
                        b2Var.show();
                        View d = b2Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(glVar.f26783p0)) {
                            b1Var.addTextChangedListener(new fl(b1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                glVar.L0 = null;
                return;
            case 23:
                sg0 sg0Var = (sg0) obj;
                sg0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new ng0(sg0Var, 1), 100L);
                return;
            case 24:
                di0 di0Var = (di0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().R1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        e6Var2 = U2.getResourceProvider();
                    }
                } else {
                    e6Var2 = new d();
                }
                new yh.e7(activity2, e6Var2, this.f1172b, 15, "", new zh0(di0Var, 0), 0L).show();
                return;
            case 25:
                ty tyVar = (ty) obj;
                tyVar.x4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                tyVar.C2.w(tyVar, arrayList, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
                return;
            case 26:
                ((g60) obj).n1(j3, false);
                return;
            case 27:
                dc0 dc0Var = (dc0) obj;
                dc0Var.getClass();
                dc0Var.presentFragment(zn.W9(j3));
                return;
            case 28:
                zn znVar = ((mi) obj).f39927e;
                znVar.D7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == znVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                ((org.telegram.ui.pc) obj).run(Long.valueOf(j3));
                return;
        }
    }
}
