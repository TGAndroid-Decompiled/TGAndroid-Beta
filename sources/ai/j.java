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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.db1;
import org.telegram.ui.ec0;
import org.telegram.ui.eo;
import org.telegram.ui.i60;
import org.telegram.ui.vy;
public final class j implements Runnable {
    public final int f1169a;
    public final long f1170b;
    public final Object f1171c;

    public j(Object obj, long j3, int i10) {
        this.f1169a = i10;
        this.f1171c = obj;
        this.f1170b = j3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.c6 c6Var;
        ci.gc gcVar;
        Context context;
        boolean z10;
        int i10;
        int i11;
        int dp;
        boolean z11;
        int i12;
        int i13 = this.f1169a;
        org.telegram.ui.ActionBar.c6 c6Var2 = null;
        boolean z12 = false;
        r8 = 0;
        int i14 = 0;
        long j3 = this.f1170b;
        Object obj = this.f1171c;
        switch (i13) {
            case 0:
                ((b0) obj).f686s.e0(j3, false);
                return;
            case 1:
                f6 f6Var = ((c4) obj).f753a;
                if (j3 <= 0) {
                    z12 = true;
                }
                f6Var.k0(z12);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((n5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.m2 d02 = db1.d0(MessagesController.getInstance(((m9) obj).f1404a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != 0) {
                    ci.lc lcVar = ci.lc.F2;
                    if (lcVar != null && lcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f21087a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((z9) obj).f2020b;
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
                org.telegram.ui.ActionBar.m2 m2Var = faVar.attachedFragment;
                c6Var = ((org.telegram.ui.ActionBar.e3) faVar).resourcesProvider;
                org.telegram.ui.Components.g5.R(context2, m2Var, c6Var, new z1(y9Var, j3, 1));
                return;
            case 6:
                ci.lc lcVar2 = (ci.lc) obj;
                ci.gc gcVar2 = lcVar2.F;
                if (gcVar2 != null) {
                    gcVar2.f(true);
                    lcVar2.F = null;
                }
                ci.cc ccVar = lcVar2.f5531x;
                if (ccVar != null) {
                    gcVar = ccVar.a(j3);
                } else {
                    gcVar = null;
                }
                lcVar2.F = gcVar;
                if (gcVar != null) {
                    lcVar2.J = gcVar.f5131a;
                    lcVar2.f5510r.c();
                    ci.xb xbVar = lcVar2.f5481h0;
                    int i15 = lcVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i14 = -14737633;
                    }
                    xbVar.setBackgroundColor(i14);
                    lcVar2.H.set(lcVar2.F.f5133c);
                    ci.gc gcVar3 = lcVar2.F;
                    lcVar2.G = gcVar3.f5132b;
                    gcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                lcVar2.f5531x = null;
                Activity activity = lcVar2.f5459b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f33662z0.post(new ci.ha(lcVar2, 5));
                    return;
                } else {
                    lcVar2.p(true);
                    return;
                }
            case 7:
                ci.pc pcVar = ((wc) obj).f6225a;
                if (pcVar != null) {
                    pcVar.h(j3, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r12.currentAccount).unlinkCommunity(j3, r12.f9990e, new fi.t((fi.k0) obj, 1));
                return;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.f10054i = null;
                t0Var.f10053g.l(j3);
                t0Var.f10057l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.i();
                    return;
                }
                return;
            case 10:
                gg.h0 h0Var = (gg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.f10636s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.g5.L(rVar.f30574b.f24342f0.getParentActivity(), j3, new xa.c(rVar, 24), rVar.f30573a);
                return;
            case 12:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.g5.L(e2Var.getParentActivity(), j3, new xa.c(e2Var, 25), e2Var.getResourceProvider());
                return;
            case 13:
                String str = e2.d0.f8529a;
                j2.f fVar = ((i2.c0) ((k2.j) ((n4.y) obj).f16363c)).f11618a.f11681s;
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
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new eo(sc.v.f(j3, "user_id")));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.sc Q = zc.a0((org.telegram.ui.b7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f30548r = false;
                Q.j();
                return;
            case 21:
                hg hgVar = (hg) obj;
                hgVar.getClass();
                hgVar.presentFragment(eo.W9(j3));
                return;
            case 22:
                il ilVar = (il) obj;
                aj ajVar = ilVar.f30574b;
                if (!ilVar.H && ilVar.I0 && ilVar.isShown()) {
                    qi qiVar = ajVar.f24389u1;
                    org.telegram.ui.ActionBar.m2 m2Var2 = ajVar.f24342f0;
                    if ((qiVar.R() <= AndroidUtilities.dp(20.0f) || ilVar.f27221y0 || ilVar.H0) && SystemClock.uptimeMillis() < j3) {
                        ilVar.postDelayed(ilVar.L0, 32L);
                        return;
                    }
                    ilVar.L0 = null;
                    org.telegram.ui.ActionBar.c6 c6Var3 = ilVar.f30573a;
                    if (m2Var2 != null && m2Var2.getParentActivity() != null) {
                        context = m2Var2.getParentActivity();
                    } else {
                        context = ilVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var3);
                        String string = LocaleController.getString(R.string.WalletAddComment);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                        a2Var.R = string;
                        hg.b1 b1Var = new hg.b1(ilVar, context);
                        b1Var.setTextSize(1, 18.0f);
                        b1Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, c6Var3));
                        b1Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20855t5, c6Var3));
                        b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                        b1Var.setText(ilVar.f27207p0);
                        b1Var.setSelection(b1Var.length());
                        b1Var.setInputType(147457);
                        b1Var.setMaxLines(5);
                        b1Var.setImeOptions(6);
                        b1Var.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20687k6, c6Var3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20705l6, c6Var3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20780p7, c6Var3));
                        b1Var.setBackground(null);
                        b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 1, c6Var3);
                        a2Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, c6Var3), 7, AndroidUtilities.dp(12.0f)));
                        String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
                        if (ilVar.f27208q0 && ilVar.getPublicKey() != null) {
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
                        if (ilVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a2Var2.setEnabled(z11);
                        a2Var2.setOnClickListener(new org.telegram.ui.Components.i1(a2Var2, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(b1Var, w7.w5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(a2Var2, w7.w5.t(-1, -2, 83, 8, 0, 8, 0));
                        a2Var.G = 6;
                        alertDialog$Builder.n(linearLayout);
                        a2Var.f20150a = AndroidUtilities.dp(292.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.f2(18));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new r5(ilVar, b1Var, a2Var2, 25));
                        ilVar.Q0 = a2Var;
                        a2Var.f20164h0 = false;
                        a2Var.setOnShowListener(new org.telegram.ui.Components.j2(1, b1Var));
                        a2Var.setOnDismissListener(new org.telegram.ui.Components.b1(ilVar, 5));
                        a2Var.create();
                        Window window = a2Var.getWindow();
                        Rect rect = new Rect();
                        ajVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(ilVar.f27207p0)) {
                            b1Var.addTextChangedListener(new hl(b1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ilVar.L0 = null;
                return;
            case 23:
                vg0 vg0Var = (vg0) obj;
                vg0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new rg0(vg0Var, 1), 100L);
                return;
            case 24:
                fi0 fi0Var = (fi0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().R1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        c6Var2 = U2.getResourceProvider();
                    }
                } else {
                    c6Var2 = new d();
                }
                new yh.e7(activity2, c6Var2, this.f1170b, 15, "", new ci0(fi0Var, 0), 0L).show();
                return;
            case 25:
                vy vyVar = (vy) obj;
                vyVar.x4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                vyVar.C2.w(vyVar, arrayList, null, false, vyVar.J2, vyVar.K2, vyVar.L2, null);
                return;
            case 26:
                ((i60) obj).n1(j3, false);
                return;
            case 27:
                ec0 ec0Var = (ec0) obj;
                ec0Var.getClass();
                ec0Var.presentFragment(eo.W9(j3));
                return;
            case 28:
                eo eoVar = ((org.telegram.ui.qi) obj).f41339e;
                eoVar.D7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == eoVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                ((org.telegram.ui.tc) obj).run(Long.valueOf(j3));
                return;
        }
    }
}
