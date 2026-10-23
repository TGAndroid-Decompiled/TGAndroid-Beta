package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ey;
import org.telegram.ui.nb0;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.u91;
public final class v3 implements Runnable {
    public final int f2295a;
    public final long f2296b;
    public final Object f2297c;

    public v3(Object obj, long j10, int i10) {
        this.f2295a = i10;
        this.f2297c = obj;
        this.f2296b = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g6 g6Var;
        ei.qb qbVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f2295a;
        org.telegram.ui.ActionBar.g6 g6Var2 = null;
        boolean z12 = false;
        r6 = 0;
        int i14 = 0;
        long j10 = this.f2296b;
        Object obj = this.f2297c;
        switch (i13) {
            case 0:
                org.telegram.ui.Components.xc.a0((nd) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0((u91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 2:
                ((ci.r) obj).f5834s.e0(j10, false);
                return;
            case 3:
                ci.p4 p4Var = ((ci.v2) obj).f6013a;
                if (j10 <= 0) {
                    z12 = true;
                }
                p4Var.j0(z12);
                return;
            case 4:
                AndroidUtilities.runOnUIThread((ci.z3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 5:
                org.telegram.ui.ActionBar.o2 d02 = u91.d0(MessagesController.getInstance(((ci.h7) obj).f5399a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ei.vb vbVar = ei.vb.F2;
                    if (vbVar != null && vbVar.d) {
                        ?? obj2 = new Object();
                        obj2.f21636a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 6:
                MessagesStorage messagesStorage = ((ci.v7) obj).f6031b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 7:
                ei.k9 k9Var = (ei.k9) obj;
                Context context2 = k9Var.getContext();
                ei.r9 r9Var = k9Var.W;
                org.telegram.ui.ActionBar.o2 o2Var = r9Var.attachedFragment;
                g6Var = ((org.telegram.ui.ActionBar.h3) r9Var).resourcesProvider;
                org.telegram.ui.Components.f5.S(context2, o2Var, g6Var, new ci.d1(k9Var, j10, 1));
                return;
            case 8:
                ei.vb vbVar2 = (ei.vb) obj;
                ei.qb qbVar2 = vbVar2.F;
                if (qbVar2 != null) {
                    qbVar2.f(true);
                    vbVar2.F = null;
                }
                ei.mb mbVar = vbVar2.f10038x;
                if (mbVar != null) {
                    qbVar = mbVar.a(j10);
                } else {
                    qbVar = null;
                }
                vbVar2.F = qbVar;
                if (qbVar != null) {
                    vbVar2.J = qbVar.f9679a;
                    vbVar2.f10017r.c();
                    ei.hb hbVar = vbVar2.f9988h0;
                    int i15 = vbVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    hbVar.setBackgroundColor(i14);
                    vbVar2.H.set(vbVar2.F.f9681c);
                    ei.qb qbVar3 = vbVar2.F;
                    vbVar2.G = qbVar3.f9680b;
                    qbVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                vbVar2.f10038x = null;
                Activity activity = vbVar2.f9967b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f33505z0.post(new ei.t9(vbVar2, 5));
                    return;
                } else {
                    vbVar2.p(true);
                    return;
                }
            case 9:
                ei.zb zbVar = ((ei.gc) obj).f9089a;
                if (zbVar != null) {
                    zbVar.i(j10, false);
                    return;
                }
                return;
            case 10:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.f11921s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                MessagesController.getInstance(r10.currentAccount).unlinkCommunity(j10, r10.e, new hi.s((hi.k0) obj, 1));
                return;
            case 12:
                hi.s0 s0Var = (hi.s0) obj;
                s0Var.f12255i = null;
                s0Var.f12254g.l(j10);
                s0Var.f12258l++;
                s0Var.a();
                hi.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.q();
                    return;
                }
                return;
            case 13:
                String str = e2.m0.f8259a;
                j2.e eVar = ((i2.b0) ((k2.v) ((qf.b) obj).f44865c)).f12353a.f12442s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1010, new j2.d(p5, j10));
                return;
            case 14:
                ki.q qVar = (ki.q) obj;
                org.telegram.ui.Components.f5.M(qVar.f28366b.f30730f0.getParentActivity(), j10, new ya.c(qVar, 27), qVar.f28365a);
                return;
            case 15:
                ki.d2 d2Var = (ki.d2) obj;
                org.telegram.ui.Components.f5.M(d2Var.getParentActivity(), j10, new ki.t1(d2Var, 0), d2Var.getResourceProvider());
                return;
            case 16:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                return;
            case 17:
                ((NotificationsController) obj).lambda$processIgnoreStories$20(j10);
                return;
            case 18:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 19:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 20:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 21:
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) obj;
                if (w3Var != null) {
                    w3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new sn(si.o0.e(j10, "user_id")));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0((org.telegram.ui.c7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f29840r = false;
                Q.j();
                return;
            case 23:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(sn.W9(j10));
                return;
            case 24:
                al alVar = (al) obj;
                ti tiVar = alVar.f28366b;
                if (!alVar.K && alVar.L0 && alVar.isShown()) {
                    ji jiVar = tiVar.f30777u1;
                    org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f30730f0;
                    if ((jiVar.Q() <= AndroidUtilities.dp(20.0f) || alVar.B0 || alVar.K0) && SystemClock.uptimeMillis() < j10) {
                        alVar.postDelayed(alVar.O0, 32L);
                        return;
                    }
                    alVar.O0 = null;
                    org.telegram.ui.ActionBar.g6 g6Var3 = alVar.f28365a;
                    if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                        context = o2Var2.getParentActivity();
                    } else {
                        context = alVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var3);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.R = string;
                        ig.z0 z0Var = new ig.z0(alVar, context);
                        z0Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.r6.W(z0Var, org.telegram.ui.ActionBar.k6.f21289j5, g6Var3);
                        org.telegram.ui.ActionBar.r6.F(z0Var, org.telegram.ui.ActionBar.k6.f21478t5, g6Var3);
                        z0Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        z0Var.setText(alVar.f24759s0);
                        z0Var.setSelection(z0Var.length());
                        z0Var.setInputType(147457);
                        z0Var.setMaxLines(5);
                        z0Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.r6.H(z0Var, org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, g6Var3);
                        z0Var.setBackground(null);
                        z0Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, g6Var3);
                        int i16 = org.telegram.ui.ActionBar.k6.f21272i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i16, g6Var3), 7, AndroidUtilities.dp(12.0f));
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i16);
                        z1Var.setBackground(g02);
                        org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var3);
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (alVar.f24760t0 && alVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z1Var.e(string2, "", z10, false, false);
                        z1Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (LocaleController.isRTL) {
                            i10 = 5;
                        } else {
                            i10 = 3;
                        }
                        layoutParams.gravity = i10 | 16;
                        z1Var.getCheckBoxView().setLayoutParams(layoutParams);
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
                        z1Var.setPadding(i11, dp2, dp, AndroidUtilities.dp(12.0f));
                        if (alVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z1Var.setEnabled(z11);
                        z1Var.setOnClickListener(new org.telegram.ui.Components.h1(z1Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(z0Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(z1Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                        c2Var.G = 6;
                        alertDialog$Builder.o(linearLayout);
                        c2Var.f20742a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.e2(19));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new u2(alVar, z0Var, z1Var, 26));
                        alVar.T0 = c2Var;
                        c2Var.f20764j0 = false;
                        c2Var.setOnShowListener(new org.telegram.ui.Components.i2(z0Var, 1));
                        c2Var.setOnDismissListener(new org.telegram.ui.Components.a1(alVar, 5));
                        c2Var.create();
                        Window window = c2Var.getWindow();
                        Rect rect = new Rect();
                        tiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        if (window != null && rect.height() > 0) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            View decorView = window.getDecorView();
                            int i17 = attributes.width;
                            if (i17 <= 0) {
                                i17 = rect.width();
                            }
                            if (attributes.width > 0) {
                                i12 = 1073741824;
                            } else {
                                i12 = Integer.MIN_VALUE;
                            }
                            decorView.measure(View.MeasureSpec.makeMeasureSpec(i17, i12), View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE));
                            attributes.gravity = 49;
                            attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                            window.setAttributes(attributes);
                        }
                        c2Var.show();
                        View d = c2Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(alVar.f24759s0)) {
                            z0Var.addTextChangedListener(new zk(z0Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                alVar.O0 = null;
                return;
            case 25:
                pg0 pg0Var = (pg0) obj;
                pg0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new kg0(pg0Var, 1), 100L);
                return;
            case 26:
                xh0 xh0Var = (xh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (!PhotoViewer.u1().T1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        g6Var2 = U2.getResourceProvider();
                    }
                } else {
                    g6Var2 = new ci.b();
                }
                new dd(activity2, g6Var2, this.f2296b, 15, "", new uh0(xh0Var, 0), 0L).show();
                return;
            case 27:
                ey eyVar = (ey) obj;
                eyVar.y4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                eyVar.C2.w(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                return;
            case 28:
                ((u50) obj).m1(j10, false);
                return;
            default:
                nb0 nb0Var = (nb0) obj;
                nb0Var.getClass();
                nb0Var.presentFragment(sn.W9(j10));
                return;
        }
    }
}
