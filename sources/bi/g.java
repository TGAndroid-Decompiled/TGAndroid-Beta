package bi;

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
import di.fc;
import di.kc;
import di.oc;
import di.uc;
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
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import org.telegram.ui.ic0;
import org.telegram.ui.n60;
import org.telegram.ui.qi;
import org.telegram.ui.vc;
import org.telegram.ui.yy;
public final class g implements Runnable {
    public final int f3045a;
    public final long f3046b;
    public final Object f3047c;

    public g(Object obj, long j10, int i10) {
        this.f3045a = i10;
        this.f3047c = obj;
        this.f3046b = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.c6 c6Var;
        fc fcVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f3045a;
        org.telegram.ui.ActionBar.c6 c6Var2 = null;
        boolean z12 = false;
        r7 = 0;
        int i14 = 0;
        long j10 = this.f3046b;
        Object obj = this.f3047c;
        switch (i13) {
            case 0:
                ((v) obj).f3834s.e0(j10, false);
                return;
            case 1:
                q5 q5Var = ((r3) obj).f3606a;
                if (j10 <= 0) {
                    z12 = true;
                }
                q5Var.k0(z12);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((z4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 3:
                org.telegram.ui.ActionBar.m2 d02 = hb1.d0(MessagesController.getInstance(((x8) obj).f3962a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != 0) {
                    kc kcVar = kc.F2;
                    if (kcVar != null && kcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f20469a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((k9) obj).f3252b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                di.x9 x9Var = (di.x9) obj;
                Context context2 = x9Var.getContext();
                di.ea eaVar = x9Var.W;
                org.telegram.ui.ActionBar.m2 m2Var = eaVar.attachedFragment;
                c6Var = ((org.telegram.ui.ActionBar.e3) eaVar).resourcesProvider;
                org.telegram.ui.Components.g5.R(context2, m2Var, c6Var, new p1(x9Var, j10, 1));
                return;
            case 6:
                kc kcVar2 = (kc) obj;
                fc fcVar2 = kcVar2.F;
                if (fcVar2 != null) {
                    fcVar2.f(true);
                    kcVar2.F = null;
                }
                di.bc bcVar = kcVar2.f7308x;
                if (bcVar != null) {
                    fcVar = bcVar.a(j10);
                } else {
                    fcVar = null;
                }
                kcVar2.F = fcVar;
                if (fcVar != null) {
                    kcVar2.J = fcVar.f6955a;
                    kcVar2.f7287r.c();
                    di.wb wbVar = kcVar2.f7258h0;
                    int i15 = kcVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    wbVar.setBackgroundColor(i14);
                    kcVar2.H.set(kcVar2.F.f6957c);
                    fc fcVar3 = kcVar2.F;
                    kcVar2.G = fcVar3.f6956b;
                    fcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                kcVar2.f7308x = null;
                Activity activity = kcVar2.f7237b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f32151z0.post(new di.ga(kcVar2, 5));
                    return;
                } else {
                    kcVar2.p(true);
                    return;
                }
            case 7:
                oc ocVar = ((uc) obj).f7908a;
                if (ocVar != null) {
                    ocVar.n(j10, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new gi.t((gi.k0) obj, 1));
                return;
            case 9:
                gi.t0 t0Var = (gi.t0) obj;
                t0Var.f10259i = null;
                t0Var.f10258g.l(j10);
                t0Var.f10262l++;
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.b();
                    return;
                }
                return;
            case 10:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.f10586s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ji.r rVar = (ji.r) obj;
                org.telegram.ui.Components.g5.L(rVar.f27671b.f30001f0.getParentActivity(), j10, new qb.c(rVar, 26), rVar.f27670a);
                return;
            case 12:
                ji.d2 d2Var = (ji.d2) obj;
                org.telegram.ui.Components.g5.L(d2Var.getParentActivity(), j10, new qb.c(d2Var, 27), d2Var.getResourceProvider());
                return;
            case 13:
                String str = e2.m0.f8372a;
                j2.f fVar = ((i2.b0) ((k2.u) ((qf.b) obj).f43356c)).f10925a.f11012s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.e(p5, j10));
                return;
            case 14:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                return;
            case 15:
                ((NotificationsController) obj).lambda$processIgnoreStories$20(j10);
                return;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 19:
                org.telegram.ui.x3 x3Var = (org.telegram.ui.x3) obj;
                if (x3Var != null) {
                    x3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new fo(t8.b.e(j10, "user_id")));
                    return;
                }
                return;
            case 20:
                sc Q = zc.a0((org.telegram.ui.d7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f29110r = false;
                Q.j();
                return;
            case 21:
                eg egVar = (eg) obj;
                egVar.getClass();
                egVar.presentFragment(fo.W9(j10));
                return;
            case 22:
                dl dlVar = (dl) obj;
                vi viVar = dlVar.f27671b;
                if (!dlVar.H && dlVar.I0 && dlVar.isShown()) {
                    li liVar = viVar.f30048u1;
                    org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f30001f0;
                    if ((liVar.R() <= AndroidUtilities.dp(20.0f) || dlVar.f24444y0 || dlVar.H0) && SystemClock.uptimeMillis() < j10) {
                        dlVar.postDelayed(dlVar.L0, 32L);
                        return;
                    }
                    dlVar.L0 = null;
                    org.telegram.ui.ActionBar.c6 c6Var3 = dlVar.f27670a;
                    if (m2Var2 != null && m2Var2.getParentActivity() != null) {
                        context = m2Var2.getParentActivity();
                    } else {
                        context = dlVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var3);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.R = string;
                        ig.b1 b1Var = new ig.b1(dlVar, context);
                        b1Var.setTextSize(1, 18.0f);
                        b1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var3));
                        b1Var.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20196t5, c6Var3));
                        b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        b1Var.setText(dlVar.f24430p0);
                        b1Var.setSelection(b1Var.length());
                        b1Var.setInputType(147457);
                        b1Var.setMaxLines(5);
                        b1Var.setImeOptions(6);
                        b1Var.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20028k6, c6Var3), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20045l6, c6Var3), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20122p7, c6Var3));
                        b1Var.setBackground(null);
                        b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 1, c6Var3);
                        a2Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var3), 7, AndroidUtilities.dp(12.0f)));
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (dlVar.f24431q0 && dlVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        a2Var2.e(string2, "", z10, false, false);
                        a2Var2.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var2.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (LocaleController.isRTL) {
                            i10 = 5;
                        } else {
                            i10 = 3;
                        }
                        layoutParams.gravity = i10 | 16;
                        a2Var2.getCheckBoxView().setLayoutParams(layoutParams);
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
                        a2Var2.setPadding(i11, dp2, dp, AndroidUtilities.dp(12.0f));
                        if (dlVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a2Var2.setEnabled(z11);
                        a2Var2.setOnClickListener(new org.telegram.ui.Components.i1(a2Var2, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(b1Var, w7.a6.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(a2Var2, w7.a6.t(-1, -2, 83, 8, 0, 8, 0));
                        a2Var.G = 6;
                        alertDialog$Builder.n(linearLayout);
                        a2Var.f19557a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.l2(13));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new androidx.car.app.utils.a(dlVar, b1Var, a2Var2, 25));
                        dlVar.Q0 = a2Var;
                        a2Var.f19570h0 = false;
                        a2Var.setOnShowListener(new org.telegram.ui.Components.i2(1, b1Var));
                        a2Var.setOnDismissListener(new org.telegram.ui.Components.b1(dlVar, 5));
                        a2Var.create();
                        Window window = a2Var.getWindow();
                        Rect rect = new Rect();
                        viVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        a2Var.show();
                        View d = a2Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(dlVar.f24430p0)) {
                            b1Var.addTextChangedListener(new cl(b1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                dlVar.L0 = null;
                return;
            case 23:
                qg0 qg0Var = (qg0) obj;
                qg0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new lg0(qg0Var, 1), 100L);
                return;
            case 24:
                zh0 zh0Var = (zh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().R1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        c6Var2 = U2.getResourceProvider();
                    }
                } else {
                    c6Var2 = new b();
                }
                new zh.e7(activity2, c6Var2, this.f3046b, 15, "", new wh0(zh0Var, 0), 0L).show();
                return;
            case 25:
                yy yyVar = (yy) obj;
                yyVar.x4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                yyVar.C2.w(yyVar, arrayList, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
                return;
            case 26:
                ((n60) obj).n1(j10, false);
                return;
            case 27:
                ic0 ic0Var = (ic0) obj;
                ic0Var.getClass();
                ic0Var.presentFragment(fo.W9(j10));
                return;
            case 28:
                fo foVar = ((qi) obj).e;
                foVar.D7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == foVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                foVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                ((vc) obj).run(Long.valueOf(j10));
                return;
        }
    }
}
