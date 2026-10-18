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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ey;
import org.telegram.ui.jb0;
import org.telegram.ui.r91;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
public final class r3 implements Runnable {
    public final int f2098a;
    public final long f2099b;
    public final Object f2100c;

    public r3(Object obj, long j10, int i10) {
        this.f2098a = i10;
        this.f2100c = obj;
        this.f2099b = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d6 d6Var;
        ei.qb qbVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f2098a;
        org.telegram.ui.ActionBar.d6 d6Var2 = null;
        boolean z12 = false;
        r6 = 0;
        int i14 = 0;
        long j10 = this.f2099b;
        Object obj = this.f2100c;
        switch (i13) {
            case 0:
                org.telegram.ui.Components.xc.a0((md) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0((r91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 2:
                ((ci.r) obj).f5892s.e0(j10, false);
                return;
            case 3:
                ci.q4 q4Var = ((ci.w2) obj).f6111a;
                if (j10 <= 0) {
                    z12 = true;
                }
                q4Var.k0(z12);
                return;
            case 4:
                AndroidUtilities.runOnUIThread((ci.a4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 d02 = r91.d0(MessagesController.getInstance(((ci.i7) obj).f5494a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ei.vb vbVar = ei.vb.F2;
                    if (vbVar != null && vbVar.d) {
                        ?? obj2 = new Object();
                        obj2.f21559a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 6:
                MessagesStorage messagesStorage = ((ci.w7) obj).f6129b;
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
                org.telegram.ui.ActionBar.n2 n2Var = r9Var.attachedFragment;
                d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                org.telegram.ui.Components.f5.R(context2, n2Var, d6Var, new ci.d1(k9Var, j10, 1));
                return;
            case 8:
                ei.vb vbVar2 = (ei.vb) obj;
                ei.qb qbVar2 = vbVar2.F;
                if (qbVar2 != null) {
                    qbVar2.f(true);
                    vbVar2.F = null;
                }
                ei.mb mbVar = vbVar2.f10024x;
                if (mbVar != null) {
                    qbVar = mbVar.a(j10);
                } else {
                    qbVar = null;
                }
                vbVar2.F = qbVar;
                if (qbVar != null) {
                    vbVar2.J = qbVar.f9666a;
                    vbVar2.f10003r.c();
                    ei.hb hbVar = vbVar2.f9974h0;
                    int i15 = vbVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    hbVar.setBackgroundColor(i14);
                    vbVar2.H.set(vbVar2.F.f9668c);
                    ei.qb qbVar3 = vbVar2.F;
                    vbVar2.G = qbVar3.f9667b;
                    qbVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                vbVar2.f10024x = null;
                Activity activity = vbVar2.f9953b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f33198z0.post(new ei.t9(vbVar2, 5));
                    return;
                } else {
                    vbVar2.p(true);
                    return;
                }
            case 9:
                ei.zb zbVar = ((ei.gc) obj).f9082a;
                if (zbVar != null) {
                    zbVar.o(j10, false);
                    return;
                }
                return;
            case 10:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.f11897s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
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
                s0Var.f12226i = null;
                s0Var.f12225g.l(j10);
                s0Var.f12229l++;
                s0Var.a();
                hi.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.p();
                    return;
                }
                return;
            case 13:
                String str = e2.m0.f8255a;
                j2.f fVar = ((i2.b0) ((k2.u) ((qf.b) obj).f44486c)).f12324a.f12412s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.e(p5, j10));
                return;
            case 14:
                ki.q qVar = (ki.q) obj;
                org.telegram.ui.Components.f5.L(qVar.f28245b.f30581f0.getParentActivity(), j10, new ya.c(qVar, 27), qVar.f28244a);
                return;
            case 15:
                ki.d2 d2Var = (ki.d2) obj;
                org.telegram.ui.Components.f5.L(d2Var.getParentActivity(), j10, new ki.t1(d2Var, 0), d2Var.getResourceProvider());
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
                org.telegram.ui.x3 x3Var = (org.telegram.ui.x3) obj;
                if (x3Var != null) {
                    x3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new sn(zf.d0.b(j10, "user_id")));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0((org.telegram.ui.c7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f29653r = false;
                Q.j();
                return;
            case 23:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(sn.W9(j10));
                return;
            case 24:
                al alVar = (al) obj;
                ti tiVar = alVar.f28245b;
                if (!alVar.H && alVar.I0 && alVar.isShown()) {
                    ji jiVar = tiVar.f30628u1;
                    org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30581f0;
                    if ((jiVar.R() <= AndroidUtilities.dp(20.0f) || alVar.f24654y0 || alVar.H0) && SystemClock.uptimeMillis() < j10) {
                        alVar.postDelayed(alVar.L0, 32L);
                        return;
                    }
                    alVar.L0 = null;
                    org.telegram.ui.ActionBar.d6 d6Var3 = alVar.f28244a;
                    if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                        context = n2Var2.getParentActivity();
                    } else {
                        context = alVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var3);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                        b2Var.R = string;
                        ig.a1 a1Var = new ig.a1(alVar, context);
                        a1Var.setTextSize(1, 18.0f);
                        a1Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21099j5, d6Var3));
                        a1Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21288t5, d6Var3));
                        a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        a1Var.setText(alVar.f24640p0);
                        a1Var.setSelection(a1Var.length());
                        a1Var.setInputType(147457);
                        a1Var.setMaxLines(5);
                        a1Var.setImeOptions(6);
                        a1Var.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21120k6, d6Var3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21137l6, d6Var3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21214p7, d6Var3));
                        a1Var.setBackground(null);
                        a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, d6Var3);
                        a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var3), 7, AndroidUtilities.dp(12.0f)));
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (alVar.f24641q0 && alVar.getPublicKey() != null) {
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
                        if (alVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a2Var.setEnabled(z11);
                        a2Var.setOnClickListener(new org.telegram.ui.Components.i1(a2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(a1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(a2Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                        b2Var.G = 6;
                        alertDialog$Builder.n(linearLayout);
                        b2Var.f20656a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.k2(13));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new t2(alVar, a1Var, a2Var, 26));
                        alVar.Q0 = b2Var;
                        b2Var.f20669h0 = false;
                        b2Var.setOnShowListener(new org.telegram.ui.Components.i2(1, a1Var));
                        b2Var.setOnDismissListener(new org.telegram.ui.Components.b1(alVar, 5));
                        b2Var.create();
                        Window window = b2Var.getWindow();
                        Rect rect = new Rect();
                        tiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(alVar.f24640p0)) {
                            a1Var.addTextChangedListener(new zk(a1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                alVar.L0 = null;
                return;
            case 25:
                kg0 kg0Var = (kg0) obj;
                kg0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new fg0(kg0Var, 1), 100L);
                return;
            case 26:
                th0 th0Var = (th0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().R1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        d6Var2 = U2.getResourceProvider();
                    }
                } else {
                    d6Var2 = new ci.b();
                }
                new cd(activity2, d6Var2, this.f2099b, 15, "", new qh0(th0Var, 0), 0L).show();
                return;
            case 27:
                ey eyVar = (ey) obj;
                eyVar.y4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                eyVar.C2.w(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                return;
            case 28:
                ((s50) obj).n1(j10, false);
                return;
            default:
                jb0 jb0Var = (jb0) obj;
                jb0Var.getClass();
                jb0Var.presentFragment(sn.W9(j10));
                return;
        }
    }
}
