package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.di1;
import org.telegram.ui.fi1;
import org.telegram.ui.gx;
import org.telegram.ui.kb0;
import org.telegram.ui.ob0;
import org.telegram.ui.zd0;
public final class jh implements Utilities.Callback2 {
    public final int f18777a;
    public final int f18778b;
    public final Object f18779c;
    public final Object d;
    public final Object e;
    public final Object f18780f;

    public jh(Context context, int i10, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        this.f18777a = 3;
        this.f18780f = context;
        this.f18778b = i10;
        this.f18779c = l0Var;
        this.d = g6Var;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.o2 U;
        org.telegram.ui.Wallet.a2 a2Var;
        org.telegram.ui.Wallet.e2 e2Var;
        boolean z10;
        final int i10;
        char c10;
        CharSequence formatSpannable;
        CharSequence charSequence;
        org.telegram.ui.Wallet.l0 l0Var;
        String string;
        int i11;
        int i12;
        int i13 = this.f18777a;
        int i14 = this.f18778b;
        Object obj3 = this.f18780f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f18779c;
        switch (i13) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) obj6, (Utilities.Callback2) obj5, (l5.j) obj4, (Context) obj3, this.f18778b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                pf.c cVar = (pf.c) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                if (cVar != null) {
                    cVar.b();
                }
                if (user2 != null) {
                    messagesController.putUser(user2, false);
                    messagesController.loadFullUser(user2, 0, true);
                }
                launchActivity.n0(i14, user.f20491id, tL_error);
                return;
            case 2:
                ob0 ob0Var = (ob0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = ob0Var.f40145a;
                ob0Var.h = -1;
                if (ob0Var.f40151j || launchActivity2.isFinishing() || launchActivity2.isDestroyed()) {
                    ob0Var.c();
                    return;
                }
                if (tL_error2 != null) {
                    ob0Var.c();
                    if (ob0Var.a()) {
                        ob0.d().f0(tL_error2, false);
                    }
                } else {
                    if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str.equals(tonconnectsession.dapp_client_id)) {
                        ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                        int size = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i15);
                                i15++;
                                TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f20602id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ob0Var.f40146b).getCurrentTime()) {
                                    if (ob0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                        ob0Var.c();
                                        org.telegram.ui.Wallet.e2.o(ob0Var.f40145a, ob0Var.f40146b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new kb0(ob0Var, str3, 0));
                                    }
                                }
                            }
                        }
                    }
                    int i16 = this.f18778b;
                    if (i16 < 10) {
                        ai.vb vbVar = new ai.vb((Object) ob0Var, str, str2, str3, i16, 28);
                        ob0Var.f40150i = vbVar;
                        AndroidUtilities.runOnUIThread(vbVar, 500L);
                        return;
                    }
                    ob0Var.c();
                    if (ob0Var.a()) {
                        org.telegram.ui.Components.vc.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj6;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                String str4 = (String) obj2;
                if (a2Var2 == null) {
                    if (str4 != null) {
                        org.telegram.ui.Components.vc.b0(str4);
                        return;
                    }
                    return;
                }
                int i17 = a2Var2.f34276c;
                TL_wallet.tonConnectSession tonconnectsession2 = a2Var2.f34274a;
                String str5 = a2Var2.e;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i14) {
                        l0Var2.f34747g.s(a2Var2);
                        return;
                    }
                }
                if ("signData".equals(str5)) {
                    final org.telegram.ui.Wallet.e2 e2Var2 = org.telegram.ui.Wallet.l0.w(i14).f34747g;
                    try {
                        JSONObject jSONObject = new JSONObject(a2Var2.f34281k);
                        boolean equals = "text".equals(jSONObject.optString("type"));
                        org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context, g6Var, new View[0]);
                        i2Var.t(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, g6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setGravity(16);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_close);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.G6, g6Var, PorterDuff.Mode.SRC_IN);
                        int i18 = org.telegram.ui.ActionBar.k6.f21273i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i18, g6Var), 1, -1);
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
                        imageView.setBackground(g02);
                        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
                        imageView.setContentDescription(LocaleController.getString(R.string.Close));
                        imageView.setOnClickListener(new zd0(23, a2Var2, i2Var));
                        linearLayout2.addView(imageView, w7.z5.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                        u9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            u9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "44_44", null, tonconnectsession2.manifest);
                        }
                        linearLayout2.addView(u9Var, w7.z5.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        TextView t10 = org.telegram.ui.Wallet.e2.t(18, context, LocaleController.getString(R.string.WalletSignData), g6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        t10.setGravity(3);
                        linearLayout3.addView(t10, w7.z5.n(-1, -2));
                        TextView t11 = org.telegram.ui.Wallet.e2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), g6Var);
                        int i19 = org.telegram.ui.ActionBar.k6.f21589z6;
                        org.telegram.ui.ActionBar.r6.W(t11, i19, g6Var);
                        t11.setGravity(3);
                        t11.setSingleLine(true);
                        t11.setEllipsize(TextUtils.TruncateAt.END);
                        linearLayout3.addView(t11, w7.z5.n(-1, -2));
                        linearLayout2.addView(linearLayout3, w7.z5.m(1.0f, 0, -2, 0, 16, 0));
                        linearLayout.addView(linearLayout2, w7.z5.n(-1, 56));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(1);
                        linearLayout4.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                        int dp = AndroidUtilities.dp(16.0f);
                        int i20 = org.telegram.ui.ActionBar.k6.f21184d6;
                        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i20, g6Var));
                        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i20);
                        linearLayout4.setBackground(c02);
                        org.telegram.ui.ActionBar.r6.k(linearLayout4, c02, O2, null, g6Var);
                        if (equals) {
                            string = jSONObject.optString("text");
                        } else {
                            string = LocaleController.getString(R.string.WalletBinaryDataWarning);
                        }
                        TextView t12 = org.telegram.ui.Wallet.e2.t(equals ? 14 : 16, context, string, g6Var);
                        t12.setGravity(3);
                        t12.setTextIsSelectable(equals);
                        if (equals) {
                            TextView t13 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletSigningData), g6Var);
                            t13.setGravity(3);
                            t13.setTypeface(AndroidUtilities.bold());
                            org.telegram.ui.ActionBar.r6.W(t13, org.telegram.ui.ActionBar.k6.L6, g6Var);
                            linearLayout4.addView(t13, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                            t12.setTypeface(Typeface.MONOSPACE);
                            i11 = -1;
                            i12 = -2;
                        } else {
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setGravity(16);
                            TextView t14 = org.telegram.ui.Wallet.e2.t(12, context, "!", g6Var);
                            t14.setTypeface(AndroidUtilities.bold());
                            t14.setTextColor(-1);
                            int dp2 = AndroidUtilities.dp(8.0f);
                            int i21 = org.telegram.ui.ActionBar.k6.f21422q7;
                            ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.w0(i21, g6Var));
                            org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i21);
                            t14.setBackground(c03);
                            org.telegram.ui.ActionBar.r6.k(t14, c03, O3, null, g6Var);
                            linearLayout5.addView(t14, w7.z5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                            TextView t15 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), g6Var);
                            t15.setGravity(3);
                            t15.setTypeface(AndroidUtilities.bold());
                            i11 = -1;
                            i12 = -2;
                            linearLayout5.addView(t15, w7.z5.n(-1, -2));
                            linearLayout4.addView(linearLayout5, w7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                        }
                        linearLayout4.addView(t12, w7.z5.n(i11, i12));
                        if (equals) {
                            t12.setOnClickListener(new org.telegram.ui.Wallet.m1(jSONObject, i2Var, g6Var, 0));
                        }
                        gx gxVar = new gx(context, 2);
                        gxVar.addView(linearLayout4);
                        linearLayout.addView(gxVar, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                        org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context);
                        h2Var.getContent().addView(linearLayout, w7.z5.c(-2.0f, -1));
                        i2Var.s(h2Var);
                        LinearLayout e = tl.e(context, 1);
                        if (equals) {
                            TextView t16 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), g6Var);
                            t16.setGravity(3);
                            org.telegram.ui.ActionBar.r6.W(t16, i19, g6Var);
                            e.addView(t16, w7.z5.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                        }
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        ei.d dVar = new ei.d(context, g6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(LocaleController.getString(R.string.Cancel));
                        ei.d dVar2 = new ei.d(context, g6Var, true);
                        dVar2.setRoundRadius(24);
                        dVar2.setText(LocaleController.getString(R.string.WalletSign));
                        dVar2.setEnabled(false);
                        linearLayout6.addView(dVar, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                        linearLayout6.addView(dVar2, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                        e.addView(linearLayout6);
                        i2Var.u(e);
                        i2Var.setDelegate(new org.telegram.ui.i0(a2Var2, 2));
                        org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(gxVar, a2Var2, dVar2, 2);
                        gxVar.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.n1(hVar, 0));
                        gxVar.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.o1(hVar, 0));
                        final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(dVar2, dVar, e2Var2, a2Var2, i2Var, g6Var, hVar);
                        dVar2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        p1Var.run(Boolean.FALSE);
                                        return;
                                    default:
                                        p1Var.run(Boolean.TRUE);
                                        return;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        p1Var.run(Boolean.FALSE);
                                        return;
                                    default:
                                        p1Var.run(Boolean.TRUE);
                                        return;
                                }
                            }
                        });
                        final boolean[] zArr = {false};
                        final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var2, i2Var, 0);
                        a2Var2.f34288r = new org.telegram.ui.Wallet.m(i2Var, 5);
                        i2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (r6) {
                                    case 0:
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread((y1) y1Var);
                                        e2Var2.s(a2Var2);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread((y1) y1Var);
                                        e2Var2.s(a2Var2);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        i2Var.show();
                        AndroidUtilities.runOnUIThread(y1Var, Math.max(0L, i17 - e2Var2.f34434f.getCurrentTime()) * 1000);
                        return;
                    } catch (JSONException e7) {
                        e2Var2.s(a2Var2);
                        org.telegram.ui.Components.vc.b0(org.telegram.ui.Wallet.e2.h("display signing data", e7));
                        return;
                    }
                }
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i14);
                org.telegram.ui.Wallet.e2 e2Var3 = w9.f34747g;
                org.telegram.ui.Wallet.d2 d2Var = a2Var2.f34277f;
                boolean equals2 = "signMessage".equals(str5);
                final org.telegram.ui.Wallet.i2 i2Var2 = new org.telegram.ui.Wallet.i2(context, g6Var, new View[0]);
                i2Var2.t(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, g6Var));
                LinearLayout linearLayout7 = new LinearLayout(context);
                linearLayout7.setOrientation(1);
                org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(context);
                u9Var2.setRoundRadius(AndroidUtilities.dp(38.0f));
                TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                if (webDocument2 != null) {
                    a2Var = a2Var2;
                    e2Var = e2Var3;
                    z10 = equals2;
                    u9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                } else {
                    a2Var = a2Var2;
                    e2Var = e2Var3;
                    z10 = equals2;
                }
                linearLayout7.addView(u9Var2, w7.z5.t(76, 76, 1, 0, 24, 0, 0));
                TextView t17 = org.telegram.ui.Wallet.e2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), g6Var);
                t17.setTypeface(AndroidUtilities.bold());
                linearLayout7.addView(t17, w7.z5.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    linearLayout7.addView(org.telegram.ui.Wallet.e2.g(context, hostAuthority, g6Var), w7.z5.t(-2, -2, 1, 36, 6, 36, 12));
                }
                org.telegram.ui.Wallet.x5 x5Var = new org.telegram.ui.Wallet.x5(context, R.drawable.wallet_card_info, 24);
                x5Var.getCardHolderView().setMaxLines(2);
                x5Var.getCardHolderView().setSingleLine(false);
                List<org.telegram.ui.Wallet.c2> list = d2Var.f34401b;
                long j10 = d2Var.f34402c;
                x5Var.setCardHolder(org.telegram.ui.Wallet.w7.X(((org.telegram.ui.Wallet.c2) list.get(0)).f34358a));
                org.telegram.ui.Components.o6 balanceView = x5Var.getBalanceView();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("GRAM");
                spannableString.setSpan(new vq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.n(-j10, true)).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                balanceView.setText(spannableStringBuilder);
                x5Var.getUsdBalanceView().setText(w9.l(j10, false));
                linearLayout7.addView(x5Var, w7.z5.n(-1, -2));
                x5Var.setCardOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (r2) {
                            case 0:
                                i2 i2Var3 = i2Var2;
                                ei.h1 h1Var = i2Var3.f34596b;
                                if (1 < i2Var3.f34597c.size() && 1 != h1Var.getCurrentPosition()) {
                                    for (View view2 : h1Var.getViewPages()) {
                                        if (view2 != null) {
                                            AndroidUtilities.hideKeyboard(view2);
                                        }
                                    }
                                    h1Var.D(1);
                                    return;
                                }
                                return;
                            default:
                                i2 i2Var4 = i2Var2;
                                ei.h1 h1Var2 = i2Var4.f34596b;
                                if (i2Var4.f34597c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                    for (View view3 : h1Var2.getViewPages()) {
                                        if (view3 != null) {
                                            AndroidUtilities.hideKeyboard(view3);
                                        }
                                    }
                                    h1Var2.D(0);
                                    return;
                                }
                                return;
                        }
                    }
                });
                org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(context);
                h2Var2.getContent().addView(linearLayout7, w7.z5.c(-2.0f, -1));
                i2Var2.s(h2Var2);
                LinearLayout e10 = tl.e(context, 1);
                LinearLayout e11 = tl.e(context, 0);
                e10.addView(e11, w7.z5.n(-1, 56));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.ic_ab_back);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                int i22 = org.telegram.ui.ActionBar.k6.f21273i6;
                org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i22, g6Var), 1, -1);
                org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i22);
                imageView2.setBackground(g03);
                org.telegram.ui.ActionBar.r6.k(imageView2, g03, null, O4, g6Var);
                int i23 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.t(imageView2, i23, g6Var, PorterDuff.Mode.SRC_IN);
                w7.b6.a(imageView2);
                e11.addView(imageView2, w7.z5.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                org.telegram.ui.Components.u9 u9Var3 = new org.telegram.ui.Components.u9(context);
                u9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                if (webDocument3 != null) {
                    u9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                }
                e11.addView(u9Var3, w7.z5.t(44, 44, 19, 12, 0, 11, 0));
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(1);
                e11.addView(linearLayout8, w7.z5.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.ActionBar.r6.W(textView, i23, g6Var);
                textView.setTextSize(1, 18.0f);
                linearLayout8.addView(textView, w7.z5.n(-1, -2));
                textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                if (TextUtils.isEmpty(hostAuthority)) {
                    i10 = 1;
                } else {
                    TextView textView2 = new TextView(context);
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21589z6, g6Var);
                    i10 = 1;
                    textView2.setTextSize(1, 14.0f);
                    linearLayout8.addView(textView2, w7.z5.n(-1, -2));
                    textView2.setText(hostAuthority);
                }
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (i10) {
                            case 0:
                                i2 i2Var3 = i2Var2;
                                ei.h1 h1Var = i2Var3.f34596b;
                                if (1 < i2Var3.f34597c.size() && 1 != h1Var.getCurrentPosition()) {
                                    for (View view2 : h1Var.getViewPages()) {
                                        if (view2 != null) {
                                            AndroidUtilities.hideKeyboard(view2);
                                        }
                                    }
                                    h1Var.D(1);
                                    return;
                                }
                                return;
                            default:
                                i2 i2Var4 = i2Var2;
                                ei.h1 h1Var2 = i2Var4.f34596b;
                                if (i2Var4.f34597c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                    for (View view3 : h1Var2.getViewPages()) {
                                        if (view3 != null) {
                                            AndroidUtilities.hideKeyboard(view3);
                                        }
                                    }
                                    h1Var2.D(0);
                                    return;
                                }
                                return;
                        }
                    }
                });
                LinearLayout linearLayout9 = new LinearLayout(context);
                linearLayout9.setOrientation(i10);
                LinearLayout D = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletPreview), g6Var);
                String A = org.telegram.ui.Wallet.e2.A(((org.telegram.ui.Wallet.c2) list.get(0)).f34358a);
                int i24 = R.drawable.mini_gram_24;
                SpannableStringBuilder r10 = org.telegram.ui.Wallet.l0.r(j10, i10);
                if (list.size() > i10) {
                    int i25 = R.string.WalletTransferToMultiple;
                    Integer valueOf = Integer.valueOf(list.size() - i10);
                    char c11 = i10;
                    c10 = 2;
                    Object[] objArr = new Object[2];
                    objArr[0] = A;
                    objArr[c11] = valueOf;
                    formatSpannable = LocaleController.formatSpannable(i25, objArr);
                } else {
                    c10 = 2;
                    int i26 = R.string.WalletTransferTo;
                    Object[] objArr2 = new Object[i10];
                    objArr2[0] = A;
                    formatSpannable = LocaleController.formatSpannable(i26, objArr2);
                }
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                D.addView(org.telegram.ui.Wallet.e2.b(context, i24, r10, formatSpannable, null, null, g6Var), w7.z5.n(-1, -2));
                linearLayout9.addView(D, w7.z5.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                LinearLayout D2 = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletActions), g6Var2);
                for (org.telegram.ui.Wallet.c2 c2Var : list) {
                    int i27 = R.drawable.mini_gram_24;
                    String string2 = LocaleController.getString((c2Var.f34359b == null || c2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                    CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.e2.A(c2Var.f34358a));
                    String n10 = org.telegram.ui.Wallet.l0.n(-c2Var.e, true);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                    int indexOf = n10.indexOf(46);
                    if (indexOf >= 0) {
                        charSequence = formatSpannable2;
                        l0Var = w9;
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                    } else {
                        charSequence = formatSpannable2;
                        l0Var = w9;
                    }
                    if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                        spannableStringBuilder2.append((CharSequence) " x");
                    }
                    vq vqVar = new vq(R.drawable.wallet_gram_small, 2);
                    vqVar.recolorDrawable = false;
                    vqVar.setSize(AndroidUtilities.dp(16.0f));
                    spannableStringBuilder2.setSpan(vqVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                    D2.addView(org.telegram.ui.Wallet.e2.b(context, i27, string2, charSequence, spannableStringBuilder2, c2Var.d, g6Var3), w7.z5.n(-1, -2));
                    g6Var2 = g6Var3;
                    w9 = l0Var;
                }
                org.telegram.ui.Wallet.l0 l0Var3 = w9;
                org.telegram.ui.ActionBar.g6 g6Var4 = g6Var2;
                linearLayout9.addView(D2, w7.z5.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                gx gxVar2 = new gx(context, 3);
                gxVar2.setFillViewport(false);
                gxVar2.addView(linearLayout9);
                e10.addView(gxVar2, w7.z5.n(-1, -2));
                org.telegram.ui.Wallet.h2 h2Var3 = new org.telegram.ui.Wallet.h2(context);
                h2Var3.getContent().addView(e10, w7.z5.c(-2.0f, -1));
                i2Var2.s(h2Var3);
                LinearLayout e12 = tl.e(context, 1);
                TextView t18 = org.telegram.ui.Wallet.e2.t(14, context, null, g6Var4);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                spannableStringBuilder3.setSpan(new ba0(AndroidUtilities.dp(80.0f), t18), 0, spannableStringBuilder3.length(), 33);
                t18.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                t18.setVisibility(z10 ? 8 : 0);
                org.telegram.ui.ActionBar.r6.W(t18, org.telegram.ui.ActionBar.k6.f21589z6, g6Var4);
                e12.addView(t18, w7.z5.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                LinearLayout linearLayout10 = new LinearLayout(context);
                linearLayout10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ei.d dVar3 = new ei.d(context, g6Var4, true);
                dVar3.setRoundRadius(24);
                dVar3.e();
                dVar3.setText(LocaleController.getString(R.string.WalletDecline));
                linearLayout10.addView(dVar3, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                ei.d g10 = tl.g(24, context, g6Var4, true);
                g10.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                g10.setEnabled(false);
                linearLayout10.addView(g10, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                e12.addView(linearLayout10);
                i2Var2.u(e12);
                final boolean[] zArr2 = {false};
                boolean[] zArr3 = {false};
                final org.telegram.ui.Wallet.a2 a2Var3 = a2Var;
                final org.telegram.ui.Wallet.e2 e2Var4 = e2Var;
                final org.telegram.ui.Wallet.j1 j1Var = new org.telegram.ui.Wallet.j1(a2Var3, zArr3, g10, dVar3, e2Var4, i2Var2, zArr2, g6Var4);
                g10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                j1Var.run(Boolean.FALSE);
                                return;
                            default:
                                j1Var.run(Boolean.TRUE);
                                return;
                        }
                    }
                });
                dVar3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                j1Var.run(Boolean.FALSE);
                                return;
                            default:
                                j1Var.run(Boolean.TRUE);
                                return;
                        }
                    }
                });
                final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr2, a2Var3, i2Var2, 1);
                long j11 = i17;
                long j12 = d2Var.f34400a;
                if (j12 == 0) {
                    j12 = Long.MAX_VALUE;
                }
                a2Var3.f34288r = new org.telegram.ui.Wallet.m(i2Var2, 5);
                i2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r6) {
                            case 0:
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread((y1) y1Var2);
                                e2Var4.s(a2Var3);
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                    return;
                                }
                                return;
                            default:
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread((y1) y1Var2);
                                e2Var4.s(a2Var3);
                                Runnable runnable3 = runnable;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
                i2Var2.show();
                AndroidUtilities.runOnUIThread(y1Var2, Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000);
                ki.c cVar2 = new ki.c(zArr2, a2Var3, zArr3, g10, z10, l0Var3, t18, i2Var2, g6Var4);
                WalletEngine2 walletEngine2 = e2Var4.f34432b.f34744b;
                if (!a2Var3.f34284n && !e2Var4.i(a2Var3) && e2Var4.y(a2Var3) && walletEngine2 != null) {
                    if ("signMessage".equals(str5)) {
                        walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.o(e2Var4, a2Var3, cVar2, 1));
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var4, a2Var3, cVar2, 9));
                        return;
                    }
                }
                cVar2.run(null, "Request expired, was processed, or the wallet changed");
                return;
            default:
                ei.d dVar4 = (ei.d) obj6;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                View view = (View) obj4;
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Cells.b1.s(h3Var.topBulletinContainer, h3Var.getResourcesProvider(), tL_error3, false);
                        return;
                    } else {
                        new org.telegram.ui.Components.vc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        return;
                    }
                }
                Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                if (queryParameter == null) {
                    new org.telegram.ui.Components.vc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    return;
                }
                int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                StringBuilder k10 = com.google.android.gms.internal.play_billing.k3.k("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                k10.append(isTestBackend);
                FileLog.d(k10.toString());
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] c12 = fi1.c(z5Var, queryParameter, currentDatacenterId, isTestBackend);
                    com.google.android.gms.common.api.internal.s0 s0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6368c).h;
                    b8.e eVar = new b8.e(s0Var, (String) z5Var.f6892a, "/tg-wear-auth/token", c12);
                    s0Var.f6503b.d(0, eVar);
                    n6.l.n(eVar, y8.j0.f50459a).addOnSuccessListener(new org.telegram.ui.Wallet.e8(1, z5Var, dVar4)).addOnFailureListener(new di1(dVar4, 1));
                    h3Var.dismiss();
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    new org.telegram.ui.Components.vc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0(e13.getMessage(), false);
                    return;
                }
        }
    }

    public jh(ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, int i10, View view, com.google.android.gms.internal.cast.z5 z5Var) {
        this.f18777a = 4;
        this.f18779c = dVar;
        this.d = h3Var;
        this.f18778b = i10;
        this.e = view;
        this.f18780f = z5Var;
    }

    public jh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f18777a = i11;
        this.f18779c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18780f = obj4;
        this.f18778b = i10;
    }

    public jh(LaunchActivity launchActivity, pf.c cVar, MessagesController messagesController, int i10, TLRPC.User user) {
        this.f18777a = 1;
        this.f18779c = launchActivity;
        this.d = cVar;
        this.e = messagesController;
        this.f18778b = i10;
        this.f18780f = user;
    }
}
