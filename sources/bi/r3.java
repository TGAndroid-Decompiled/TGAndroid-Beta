package bi;

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
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ey;
import org.telegram.ui.nb0;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import org.telegram.ui.y91;
public final class r3 implements Runnable {
    public final int f5322a;
    public final long f5323b;
    public final Object f5324c;

    public r3(Object obj, long j10, int i10) {
        this.f5322a = i10;
        this.f5324c = obj;
        this.f5323b = j10;
    }

    @Override
    public final void run() {
        fi.nb nbVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f5322a;
        org.telegram.ui.ActionBar.u6 u6Var = null;
        boolean z12 = false;
        r6 = 0;
        int i14 = 0;
        long j10 = this.f5323b;
        Object obj = this.f5324c;
        switch (i13) {
            case 0:
                org.telegram.ui.Components.wc.b0((dd) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 1:
                org.telegram.ui.Components.wc.b0((y91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 2:
                ((di.r) obj).f9093s.h0(j10, false);
                return;
            case 3:
                di.q4 q4Var = ((di.v2) obj).f9249a;
                if (j10 <= 0) {
                    z12 = true;
                }
                q4Var.i0(z12);
                return;
            case 4:
                AndroidUtilities.runOnUIThread((di.z3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 5:
                org.telegram.ui.ActionBar.r2 c02 = y91.c0(MessagesController.getInstance(((di.h7) obj).f8629a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != 0) {
                    fi.sb sbVar = fi.sb.F2;
                    if (sbVar != null && sbVar.d) {
                        ?? obj2 = new Object();
                        obj2.f22929a = true;
                        R.showAsSheet(c02, obj2);
                        return;
                    }
                    R.presentFragment(c02);
                    return;
                }
                return;
            case 6:
                MessagesStorage messagesStorage = ((di.u7) obj).f9234b;
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
                fi.g9 g9Var = (fi.g9) obj;
                Context context2 = g9Var.getContext();
                fi.n9 n9Var = g9Var.W;
                org.telegram.ui.Components.g5.R(context2, n9Var.attachedFragment, fi.n9.Y(n9Var), new di.d1(g9Var, j10, 1));
                return;
            case 8:
                fi.sb sbVar2 = (fi.sb) obj;
                fi.nb nbVar2 = sbVar2.F;
                if (nbVar2 != null) {
                    nbVar2.f(true);
                    sbVar2.F = null;
                }
                fi.jb jbVar = sbVar2.f11678x;
                if (jbVar != null) {
                    nbVar = jbVar.b(j10);
                } else {
                    nbVar = null;
                }
                sbVar2.F = nbVar;
                if (nbVar != null) {
                    sbVar2.J = nbVar.f11321a;
                    sbVar2.f11657r.c();
                    fi.eb ebVar = sbVar2.f11628h0;
                    int i15 = sbVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    ebVar.setBackgroundColor(i14);
                    sbVar2.H.set(sbVar2.F.f11323c);
                    fi.nb nbVar3 = sbVar2.F;
                    sbVar2.G = nbVar3.f11322b;
                    nbVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                sbVar2.f11678x = null;
                Activity activity = sbVar2.f11607b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f35595z0.post(new fi.p9(sbVar2, 5));
                    return;
                } else {
                    sbVar2.p(true);
                    return;
                }
            case 9:
                fi.wb wbVar = ((fi.cc) obj).f10621a;
                if (wbVar != null) {
                    wbVar.h(j10, false);
                    return;
                }
                return;
            case 10:
                ig.i0 i0Var = (ig.i0) obj;
                i0Var.getClass();
                try {
                    MessagesStorage.getInstance(i0Var.f14093s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ii.j0.r((ii.j0) obj, j10);
                return;
            case 12:
                ii.r0 r0Var = (ii.r0) obj;
                r0Var.f14417i = null;
                r0Var.f14416g.l(j10);
                r0Var.f14420l++;
                r0Var.a();
                ii.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.c();
                    return;
                }
                return;
            case 13:
                String str = e2.n0.f9691a;
                j2.e eVar = ((i2.d0) ((k2.v) ((rf.b) obj).f47371c)).f13508a.f13613s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1010, new j2.d(p10, j10));
                return;
            case 14:
                li.q qVar = (li.q) obj;
                org.telegram.ui.Components.g5.L(qVar.f30254b.f32990f0.getParentActivity(), j10, new a4.l(qVar, 28), qVar.f30253a);
                return;
            case 15:
                li.b2 b2Var = (li.b2) obj;
                org.telegram.ui.Components.g5.L(b2Var.getParentActivity(), j10, new jg.i(b2Var), b2Var.getResourceProvider());
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
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new wn(a1.g.h(j10, "user_id")));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.qc R2 = org.telegram.ui.Components.wc.b0((org.telegram.ui.c7) obj).R(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                R2.f31870s = false;
                R2.j();
                return;
            case 23:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(wn.ea(j10));
                return;
            case 24:
                al alVar = (al) obj;
                ti tiVar = alVar.f30254b;
                if (!alVar.K && alVar.L0 && alVar.isShown()) {
                    gi giVar = tiVar.f33037u1;
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                    if ((giVar.Q() <= AndroidUtilities.dp(20.0f) || alVar.B0 || alVar.K0) && SystemClock.uptimeMillis() < j10) {
                        alVar.postDelayed(alVar.O0, 32L);
                        return;
                    }
                    alVar.O0 = null;
                    org.telegram.ui.ActionBar.u6 u6Var2 = alVar.f30253a;
                    if (r2Var != null && r2Var.getParentActivity() != null) {
                        context = r2Var.getParentActivity();
                    } else {
                        context = alVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var2);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        jg.a1 a1Var = new jg.a1(alVar, context);
                        a1Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.f7.V(a1Var, org.telegram.ui.ActionBar.y6.f23465j5, u6Var2);
                        org.telegram.ui.ActionBar.f7.E(a1Var, org.telegram.ui.ActionBar.y6.f23654t5, u6Var2);
                        a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        a1Var.setText(alVar.f26596s0);
                        a1Var.setSelection(a1Var.length());
                        a1Var.setInputType(147457);
                        a1Var.setMaxLines(5);
                        a1Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.f7.G(a1Var, org.telegram.ui.ActionBar.y6.f23485k6, org.telegram.ui.ActionBar.y6.f23503l6, org.telegram.ui.ActionBar.y6.f23582p7, u6Var2);
                        a1Var.setBackground(null);
                        a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, u6Var2);
                        int i16 = org.telegram.ui.ActionBar.y6.f23449i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, u6Var2), 7, AndroidUtilities.dp(12.0f));
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
                        y1Var.setBackground(g02);
                        org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var2);
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (alVar.f26597t0 && alVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        y1Var.e(string2, "", z10, false, false);
                        y1Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (LocaleController.isRTL) {
                            i10 = 5;
                        } else {
                            i10 = 3;
                        }
                        layoutParams.gravity = i10 | 16;
                        y1Var.getCheckBoxView().setLayoutParams(layoutParams);
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
                        y1Var.setPadding(i11, dp2, dp, AndroidUtilities.dp(12.0f));
                        if (alVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        y1Var.setEnabled(z11);
                        y1Var.setOnClickListener(new org.telegram.ui.Components.i1(y1Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(a1Var, kb1.o(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(y1Var, kb1.x(-1, -2, 83, 8, 0, 8, 0));
                        e2Var.G = 6;
                        alertDialog$Builder.o(linearLayout);
                        e2Var.f22556a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.f2(23));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new androidx.car.app.utils.a(alVar, a1Var, y1Var, 26));
                        alVar.T0 = e2Var;
                        e2Var.f22578j0 = false;
                        e2Var.setOnShowListener(new org.telegram.ui.Components.l2(a1Var, 1));
                        e2Var.setOnDismissListener(new org.telegram.ui.Components.z0(alVar, 5));
                        e2Var.create();
                        Window window = e2Var.getWindow();
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
                        e2Var.show();
                        View d = e2Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(alVar.f26596s0)) {
                            a1Var.addTextChangedListener(new zk(a1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                alVar.O0 = null;
                return;
            case 25:
                ng0 ng0Var = (ng0) obj;
                ng0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new ig0(ng0Var, 1), 100L);
                return;
            case 26:
                xh0 xh0Var = (xh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (!PhotoViewer.v1().U1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        u6Var = U2.getResourceProvider();
                    }
                } else {
                    u6Var = new di.b();
                }
                new tc(activity2, u6Var, this.f5323b, 15, "", new uh0(xh0Var, 0), 0L).show();
                return;
            case 27:
                ey eyVar = (ey) obj;
                eyVar.I4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                eyVar.C2.v(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                return;
            case 28:
                ((x50) obj).m1(j10, false);
                return;
            default:
                nb0 nb0Var = (nb0) obj;
                nb0Var.getClass();
                nb0Var.presentFragment(wn.ea(j10));
                return;
        }
    }
}
