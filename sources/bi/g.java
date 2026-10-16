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
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.rg0;
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
import org.telegram.ui.hc0;
import org.telegram.ui.n60;
import org.telegram.ui.qi;
import org.telegram.ui.yy;
public final class g implements Runnable {
    public final int f3049a;
    public final long f3050b;
    public final Object f3051c;

    public g(Object obj, long j10, int i10) {
        this.f3049a = i10;
        this.f3051c = obj;
        this.f3050b = j10;
    }

    @Override
    public final void run() {
        fc fcVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f3049a;
        org.telegram.ui.ActionBar.c6 c6Var = null;
        boolean z12 = false;
        r8 = 0;
        int i14 = 0;
        long j10 = this.f3050b;
        Object obj = this.f3051c;
        switch (i13) {
            case 0:
                ((v) obj).f3838s.e0(j10, false);
                return;
            case 1:
                q5 q5Var = ((r3) obj).f3610a;
                if (j10 <= 0) {
                    z12 = true;
                }
                q5Var.k0(z12);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((z4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 3:
                org.telegram.ui.ActionBar.m2 d02 = hb1.d0(MessagesController.getInstance(((x8) obj).f3966a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != 0) {
                    kc kcVar = kc.F2;
                    if (kcVar != null && kcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f20169a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((k9) obj).f3256b;
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
                org.telegram.ui.Components.g5.R(context2, eaVar.attachedFragment, ((org.telegram.ui.ActionBar.e3) eaVar).resourcesProvider, new p1(x9Var, j10, 1));
                return;
            case 6:
                kc kcVar2 = (kc) obj;
                fc fcVar2 = kcVar2.F;
                if (fcVar2 != null) {
                    fcVar2.f(true);
                    kcVar2.F = null;
                }
                di.bc bcVar = kcVar2.f7311x;
                if (bcVar != null) {
                    fcVar = bcVar.a(j10);
                } else {
                    fcVar = null;
                }
                kcVar2.F = fcVar;
                if (fcVar != null) {
                    kcVar2.J = fcVar.f6958a;
                    kcVar2.f7290r.c();
                    di.wb wbVar = kcVar2.f7261h0;
                    int i15 = kcVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    wbVar.setBackgroundColor(i14);
                    kcVar2.H.set(kcVar2.F.f6960c);
                    fc fcVar3 = kcVar2.F;
                    kcVar2.G = fcVar3.f6959b;
                    fcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                kcVar2.f7311x = null;
                Activity activity = kcVar2.f7240b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f31853z0.post(new di.ga(kcVar2, 5));
                    return;
                } else {
                    kcVar2.p(true);
                    return;
                }
            case 7:
                oc ocVar = ((uc) obj).f7911a;
                if (ocVar != null) {
                    ocVar.n(j10, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r12.currentAccount).unlinkCommunity(j10, r12.e, new gi.t((gi.k0) obj, 1));
                return;
            case 9:
                gi.t0 t0Var = (gi.t0) obj;
                t0Var.f10263i = null;
                t0Var.f10262g.l(j10);
                t0Var.f10266l++;
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.p();
                    return;
                }
                return;
            case 10:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.f10590s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ji.r rVar = (ji.r) obj;
                org.telegram.ui.Components.g5.L(rVar.f27360b.f29672f0.getParentActivity(), j10, new a6.m(rVar, 25), rVar.f27359a);
                return;
            case 12:
                ji.d2 d2Var = (ji.d2) obj;
                org.telegram.ui.Components.g5.L(d2Var.getParentActivity(), j10, new a6.m(d2Var, 26), d2Var.getResourceProvider());
                return;
            case 13:
                String str = e2.m0.f8375a;
                j2.f fVar = ((i2.b0) ((k2.u) ((qf.b) obj).f43098c)).f10929a.f11016s;
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
                Q.f28813r = false;
                Q.j();
                return;
            case 21:
                eg egVar = (eg) obj;
                egVar.getClass();
                egVar.presentFragment(fo.W9(j10));
                return;
            case 22:
                cl clVar = (cl) obj;
                vi viVar = clVar.f27360b;
                if (!clVar.H && clVar.I0 && clVar.isShown()) {
                    li liVar = viVar.f29719u1;
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
                    if ((liVar.R() <= AndroidUtilities.dp(20.0f) || clVar.f23799y0 || clVar.H0) && SystemClock.uptimeMillis() < j10) {
                        clVar.postDelayed(clVar.L0, 32L);
                        return;
                    }
                    clVar.L0 = null;
                    org.telegram.ui.ActionBar.c6 c6Var2 = clVar.f27359a;
                    if (m2Var != null && m2Var.getParentActivity() != null) {
                        context = m2Var.getParentActivity();
                    } else {
                        context = clVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var2);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        a2Var.R = string;
                        ig.b1 b1Var = new ig.b1(clVar, context);
                        b1Var.setTextSize(1, 18.0f);
                        b1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var2));
                        b1Var.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19896t5, c6Var2));
                        b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        b1Var.setText(clVar.f23785p0);
                        b1Var.setSelection(b1Var.length());
                        b1Var.setInputType(147457);
                        b1Var.setMaxLines(5);
                        b1Var.setImeOptions(6);
                        b1Var.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19728k6, c6Var2), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19745l6, c6Var2), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19822p7, c6Var2));
                        b1Var.setBackground(null);
                        b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 1, c6Var2);
                        a2Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var2), 7, AndroidUtilities.dp(12.0f)));
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (clVar.f23786q0 && clVar.getPublicKey() != null) {
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
                        if (clVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a2Var2.setEnabled(z11);
                        a2Var2.setOnClickListener(new org.telegram.ui.Components.i1(a2Var2, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(b1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(a2Var2, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                        a2Var.G = 6;
                        alertDialog$Builder.n(linearLayout);
                        a2Var.f19257a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.n2(11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new androidx.car.app.utils.a(clVar, b1Var, a2Var2, 25));
                        clVar.Q0 = a2Var;
                        a2Var.f19270h0 = false;
                        a2Var.setOnShowListener(new org.telegram.ui.Components.i2(1, b1Var));
                        a2Var.setOnDismissListener(new org.telegram.ui.Components.b1(clVar, 5));
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(clVar.f23785p0)) {
                            b1Var.addTextChangedListener(new bl(b1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                clVar.L0 = null;
                return;
            case 23:
                rg0 rg0Var = (rg0) obj;
                rg0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mg0(rg0Var, 1), 100L);
                return;
            case 24:
                zh0 zh0Var = (zh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().R1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        c6Var = U2.getResourceProvider();
                    }
                } else {
                    c6Var = new b();
                }
                new zh.e7(activity2, c6Var, this.f3050b, 15, "", new wh0(zh0Var, 0), 0L).show();
                return;
            case 25:
                yy yyVar = (yy) obj;
                yyVar.y4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                yyVar.C2.w(yyVar, arrayList, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
                return;
            case 26:
                ((n60) obj).n1(j10, false);
                return;
            case 27:
                hc0 hc0Var = (hc0) obj;
                hc0Var.getClass();
                hc0Var.presentFragment(fo.W9(j10));
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
                ((org.telegram.ui.uc) obj).run(Long.valueOf(j10));
                return;
        }
    }
}
