package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
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
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.dc0;
import org.telegram.ui.js0;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.ux;
import org.telegram.ui.uy0;
import org.telegram.ui.yb0;
public final class jh implements Utilities.Callback2 {
    public final int f18313a;
    public final int f18314b;
    public final Object f18315c;
    public final Object d;
    public final Object f18316e;
    public final Object f18317f;

    public jh(Context context, int i10, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        this.f18313a = 2;
        this.f18317f = context;
        this.f18314b = i10;
        this.f18315c = l0Var;
        this.d = d6Var;
        this.f18316e = runnable;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.m2 U;
        org.telegram.ui.Wallet.b2 b2Var;
        org.telegram.ui.Wallet.f2 f2Var;
        boolean z10;
        final int i10;
        char c10;
        CharSequence formatSpannable;
        CharSequence charSequence;
        org.telegram.ui.Wallet.l0 l0Var;
        String string;
        int i11;
        int i12;
        int i13 = this.f18313a;
        int i14 = this.f18314b;
        Object obj3 = this.f18317f;
        Object obj4 = this.f18316e;
        Object obj5 = this.d;
        Object obj6 = this.f18315c;
        switch (i13) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.a2) obj6, (Utilities.Callback2) obj5, (k6.h) obj4, (Context) obj3, this.f18314b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                dc0 dc0Var = (dc0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity = dc0Var.f37009a;
                dc0Var.h = -1;
                if (dc0Var.f37016j || launchActivity.isFinishing() || launchActivity.isDestroyed()) {
                    dc0Var.c();
                    return;
                }
                if (tL_error != null) {
                    dc0Var.c();
                    if (dc0Var.a()) {
                        dc0.d().f0(tL_error, false);
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
                                if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f20329id && tonconnectrequest2.expires > ConnectionsManager.getInstance(dc0Var.f37010b).getCurrentTime()) {
                                    if (dc0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                        dc0Var.c();
                                        org.telegram.ui.Wallet.f2.o(dc0Var.f37009a, dc0Var.f37010b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new yb0(dc0Var, str3, 0));
                                    }
                                }
                            }
                        }
                    }
                    int i16 = this.f18314b;
                    if (i16 < 10) {
                        ei.l3 l3Var = new ei.l3(dc0Var, str, str2, str3, i16, 27);
                        dc0Var.f37015i = l3Var;
                        AndroidUtilities.runOnUIThread(l3Var, 500L);
                        return;
                    }
                    dc0Var.c();
                    if (dc0Var.a()) {
                        org.telegram.ui.Components.ad.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj6;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.b2 b2Var2 = (org.telegram.ui.Wallet.b2) obj;
                String str4 = (String) obj2;
                if (b2Var2 == null) {
                    if (str4 != null) {
                        org.telegram.ui.Components.ad.b0(str4);
                        return;
                    }
                    return;
                }
                int i17 = b2Var2.f34712c;
                TL_wallet.tonConnectSession tonconnectsession2 = b2Var2.f34710a;
                String str5 = b2Var2.f34713e;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.E1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i14) {
                        l0Var2.f35224g.s(b2Var2);
                        return;
                    }
                }
                if ("signData".equals(str5)) {
                    final org.telegram.ui.Wallet.f2 f2Var2 = org.telegram.ui.Wallet.l0.v(i14).f35224g;
                    try {
                        JSONObject jSONObject = new JSONObject(b2Var2.f34718k);
                        boolean equals = "text".equals(jSONObject.optString("type"));
                        org.telegram.ui.Wallet.j2 j2Var = new org.telegram.ui.Wallet.j2(context, d6Var, new View[0]);
                        j2Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, d6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setGravity(16);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_close);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
                        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, d6Var), 1, -1));
                        imageView.setContentDescription(LocaleController.getString(R.string.Close));
                        imageView.setOnClickListener(new uy0(12, b2Var2, j2Var));
                        linearLayout2.addView(imageView, w7.x5.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                        y9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "44_44", null, tonconnectsession2.manifest);
                        }
                        linearLayout2.addView(y9Var, w7.x5.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        TextView t10 = org.telegram.ui.Wallet.f2.t(18, context, LocaleController.getString(R.string.WalletSignData), d6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        t10.setGravity(3);
                        linearLayout3.addView(t10, w7.x5.n(-1, -2));
                        TextView t11 = org.telegram.ui.Wallet.f2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), d6Var);
                        int i18 = org.telegram.ui.ActionBar.h6.f21225z6;
                        t11.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
                        t11.setGravity(3);
                        t11.setSingleLine(true);
                        t11.setEllipsize(TextUtils.TruncateAt.END);
                        linearLayout3.addView(t11, w7.x5.n(-1, -2));
                        linearLayout2.addView(linearLayout3, w7.x5.m(1.0f, 0, -2, 0, 16, 0));
                        linearLayout.addView(linearLayout2, w7.x5.n(-1, 56));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(1);
                        linearLayout4.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, d6Var)));
                        if (equals) {
                            string = jSONObject.optString("text");
                        } else {
                            string = LocaleController.getString(R.string.WalletBinaryDataWarning);
                        }
                        TextView t12 = org.telegram.ui.Wallet.f2.t(equals ? 14 : 16, context, string, d6Var);
                        t12.setGravity(3);
                        t12.setTextIsSelectable(equals);
                        if (equals) {
                            TextView t13 = org.telegram.ui.Wallet.f2.t(14, context, LocaleController.getString(R.string.WalletSigningData), d6Var);
                            t13.setGravity(3);
                            t13.setTypeface(AndroidUtilities.bold());
                            t13.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, d6Var));
                            linearLayout4.addView(t13, w7.x5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                            t12.setTypeface(Typeface.MONOSPACE);
                            i11 = -1;
                            i12 = -2;
                        } else {
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setGravity(16);
                            TextView t14 = org.telegram.ui.Wallet.f2.t(12, context, "!", d6Var);
                            t14.setTypeface(AndroidUtilities.bold());
                            t14.setTextColor(-1);
                            t14.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var)));
                            linearLayout5.addView(t14, w7.x5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                            TextView t15 = org.telegram.ui.Wallet.f2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), d6Var);
                            t15.setGravity(3);
                            t15.setTypeface(AndroidUtilities.bold());
                            i11 = -1;
                            i12 = -2;
                            linearLayout5.addView(t15, w7.x5.n(-1, -2));
                            linearLayout4.addView(linearLayout5, w7.x5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                        }
                        linearLayout4.addView(t12, w7.x5.n(i11, i12));
                        if (equals) {
                            t12.setOnClickListener(new org.telegram.ui.Wallet.n1(jSONObject, j2Var, d6Var, 0));
                        }
                        ux uxVar = new ux(context, 2);
                        uxVar.addView(linearLayout4);
                        linearLayout.addView(uxVar, w7.x5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                        org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context);
                        i2Var.getContent().addView(linearLayout, w7.x5.d(-2.0f, -1));
                        j2Var.t(i2Var);
                        LinearLayout e7 = ai.e(context, 1);
                        if (equals) {
                            TextView t16 = org.telegram.ui.Wallet.f2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), d6Var);
                            t16.setGravity(3);
                            t16.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
                            e7.addView(t16, w7.x5.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                        }
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        ci.d dVar = new ci.d(context, d6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.d();
                        dVar.setText(LocaleController.getString(R.string.Cancel));
                        ci.d dVar2 = new ci.d(context, d6Var, true);
                        dVar2.setRoundRadius(24);
                        dVar2.setText(LocaleController.getString(R.string.WalletSign));
                        dVar2.setEnabled(false);
                        linearLayout6.addView(dVar, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
                        linearLayout6.addView(dVar2, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
                        e7.addView(linearLayout6);
                        j2Var.v(e7);
                        j2Var.setDelegate(new org.telegram.ui.g0(b2Var2, 2));
                        org.telegram.ui.Wallet.m mVar = new org.telegram.ui.Wallet.m(uxVar, b2Var2, dVar2, 2);
                        uxVar.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.o1(mVar, 0));
                        uxVar.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.p1(mVar, 0));
                        final org.telegram.ui.Wallet.q1 q1Var = new org.telegram.ui.Wallet.q1(dVar2, dVar, f2Var2, b2Var2, j2Var, d6Var, mVar);
                        dVar2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        q1Var.run(Boolean.FALSE);
                                        return;
                                    default:
                                        q1Var.run(Boolean.TRUE);
                                        return;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        q1Var.run(Boolean.FALSE);
                                        return;
                                    default:
                                        q1Var.run(Boolean.TRUE);
                                        return;
                                }
                            }
                        });
                        final boolean[] zArr = {false};
                        final org.telegram.ui.Wallet.z1 z1Var = new org.telegram.ui.Wallet.z1(zArr, b2Var2, j2Var, 0);
                        b2Var2.f34725r = new org.telegram.ui.Wallet.o(j2Var, 4);
                        j2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (r6) {
                                    case 0:
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread((z1) z1Var);
                                        f2Var2.s(b2Var2);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread((z1) z1Var);
                                        f2Var2.s(b2Var2);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        j2Var.show();
                        AndroidUtilities.runOnUIThread(z1Var, Math.max(0L, i17 - f2Var2.f34928f.getCurrentTime()) * 1000);
                        return;
                    } catch (JSONException e10) {
                        f2Var2.s(b2Var2);
                        org.telegram.ui.Components.ad.b0(org.telegram.ui.Wallet.f2.h("display signing data", e10));
                        return;
                    }
                }
                org.telegram.ui.Wallet.l0 v = org.telegram.ui.Wallet.l0.v(i14);
                org.telegram.ui.Wallet.f2 f2Var3 = v.f35224g;
                org.telegram.ui.Wallet.e2 e2Var = b2Var2.f34714f;
                boolean equals2 = "signMessage".equals(str5);
                final org.telegram.ui.Wallet.j2 j2Var2 = new org.telegram.ui.Wallet.j2(context, d6Var, new View[0]);
                j2Var2.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, d6Var));
                LinearLayout linearLayout7 = new LinearLayout(context);
                linearLayout7.setOrientation(1);
                org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                y9Var2.setRoundRadius(AndroidUtilities.dp(38.0f));
                TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                if (webDocument2 != null) {
                    b2Var = b2Var2;
                    f2Var = f2Var3;
                    z10 = equals2;
                    y9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                } else {
                    b2Var = b2Var2;
                    f2Var = f2Var3;
                    z10 = equals2;
                }
                linearLayout7.addView(y9Var2, w7.x5.t(76, 76, 1, 0, 24, 0, 0));
                TextView t17 = org.telegram.ui.Wallet.f2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), d6Var);
                t17.setTypeface(AndroidUtilities.bold());
                linearLayout7.addView(t17, w7.x5.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    linearLayout7.addView(org.telegram.ui.Wallet.f2.g(context, hostAuthority, d6Var), w7.x5.t(-2, -2, 1, 36, 6, 36, 12));
                }
                org.telegram.ui.Wallet.k5 k5Var = new org.telegram.ui.Wallet.k5(R.drawable.wallet_card_info, 24, context, false);
                k5Var.setEngravingBitmap(null);
                k5Var.getCardHolderView().setMaxLines(2);
                k5Var.getCardHolderView().setSingleLine(false);
                List<org.telegram.ui.Wallet.d2> list = e2Var.f34871b;
                long j3 = e2Var.f34872c;
                k5Var.setCardHolder(org.telegram.ui.Wallet.c7.X(((org.telegram.ui.Wallet.d2) list.get(0)).f34835a));
                org.telegram.ui.Components.r6 balanceView = k5Var.getBalanceView();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("GRAM");
                spannableString.setSpan(new er(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.n(-j3, true)).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                balanceView.setText(spannableStringBuilder);
                k5Var.getUsdBalanceView().setText(v.l(j3, false));
                linearLayout7.addView(k5Var, w7.x5.n(-1, -2));
                k5Var.setCardOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (r2) {
                            case 0:
                                j2 j2Var3 = j2Var2;
                                ci.h1 h1Var = j2Var3.f35135b;
                                if (1 < j2Var3.f35136c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                j2 j2Var4 = j2Var2;
                                ci.h1 h1Var2 = j2Var4.f35135b;
                                if (j2Var4.f35136c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                org.telegram.ui.Wallet.i2 i2Var2 = new org.telegram.ui.Wallet.i2(context);
                i2Var2.getContent().addView(linearLayout7, w7.x5.d(-2.0f, -1));
                j2Var2.t(i2Var2);
                LinearLayout e11 = ai.e(context, 1);
                LinearLayout e12 = ai.e(context, 0);
                e11.addView(e12, w7.x5.n(-1, 56));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.ic_ab_back);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, d6Var), 1, -1));
                int i19 = org.telegram.ui.ActionBar.h6.G6;
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i19, d6Var), PorterDuff.Mode.SRC_IN));
                w7.z5.a(imageView2);
                e12.addView(imageView2, w7.x5.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                y9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                if (webDocument3 != null) {
                    y9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                }
                e12.addView(y9Var3, w7.x5.t(44, 44, 19, 12, 0, 11, 0));
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(1);
                e12.addView(linearLayout8, w7.x5.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var));
                textView.setTextSize(1, 18.0f);
                linearLayout8.addView(textView, w7.x5.n(-1, -2));
                textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                if (TextUtils.isEmpty(hostAuthority)) {
                    i10 = 1;
                } else {
                    TextView textView2 = new TextView(context);
                    i10 = 1;
                    ai.o(org.telegram.ui.ActionBar.h6.f21225z6, d6Var, textView2, 1, 14.0f);
                    linearLayout8.addView(textView2, w7.x5.n(-1, -2));
                    textView2.setText(hostAuthority);
                }
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (i10) {
                            case 0:
                                j2 j2Var3 = j2Var2;
                                ci.h1 h1Var = j2Var3.f35135b;
                                if (1 < j2Var3.f35136c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                j2 j2Var4 = j2Var2;
                                ci.h1 h1Var2 = j2Var4.f35135b;
                                if (j2Var4.f35136c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                LinearLayout D = org.telegram.ui.Wallet.f2.D(context, LocaleController.getString(R.string.WalletPreview), d6Var);
                String A = org.telegram.ui.Wallet.f2.A(((org.telegram.ui.Wallet.d2) list.get(0)).f34835a);
                int i20 = R.drawable.mini_gram_24;
                SpannableStringBuilder q6 = org.telegram.ui.Wallet.l0.q(j3, i10);
                if (list.size() > i10) {
                    int i21 = R.string.WalletTransferToMultiple;
                    Integer valueOf = Integer.valueOf(list.size() - i10);
                    char c11 = i10;
                    c10 = 2;
                    Object[] objArr = new Object[2];
                    objArr[0] = A;
                    objArr[c11] = valueOf;
                    formatSpannable = LocaleController.formatSpannable(i21, objArr);
                } else {
                    c10 = 2;
                    int i22 = R.string.WalletTransferTo;
                    Object[] objArr2 = new Object[i10];
                    objArr2[0] = A;
                    formatSpannable = LocaleController.formatSpannable(i22, objArr2);
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                D.addView(org.telegram.ui.Wallet.f2.b(context, i20, q6, formatSpannable, null, null, d6Var), w7.x5.n(-1, -2));
                linearLayout9.addView(D, w7.x5.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                LinearLayout D2 = org.telegram.ui.Wallet.f2.D(context, LocaleController.getString(R.string.WalletActions), d6Var2);
                for (org.telegram.ui.Wallet.d2 d2Var : list) {
                    int i23 = R.drawable.mini_gram_24;
                    String string2 = LocaleController.getString((d2Var.f34836b == null || d2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                    CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.f2.A(d2Var.f34835a));
                    String n10 = org.telegram.ui.Wallet.l0.n(-d2Var.f34838e, true);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                    int indexOf = n10.indexOf(46);
                    if (indexOf >= 0) {
                        charSequence = formatSpannable2;
                        l0Var = v;
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                    } else {
                        charSequence = formatSpannable2;
                        l0Var = v;
                    }
                    if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                        spannableStringBuilder2.append((CharSequence) " x");
                    }
                    er erVar = new er(R.drawable.wallet_gram_small, 2);
                    erVar.recolorDrawable = false;
                    erVar.setSize(AndroidUtilities.dp(16.0f));
                    spannableStringBuilder2.setSpan(erVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                    D2.addView(org.telegram.ui.Wallet.f2.b(context, i23, string2, charSequence, spannableStringBuilder2, d2Var.d, d6Var3), w7.x5.n(-1, -2));
                    d6Var2 = d6Var3;
                    v = l0Var;
                }
                org.telegram.ui.Wallet.l0 l0Var3 = v;
                org.telegram.ui.ActionBar.d6 d6Var4 = d6Var2;
                linearLayout9.addView(D2, w7.x5.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                ux uxVar2 = new ux(context, 3);
                uxVar2.setFillViewport(false);
                uxVar2.addView(linearLayout9);
                e11.addView(uxVar2, w7.x5.n(-1, -2));
                org.telegram.ui.Wallet.i2 i2Var3 = new org.telegram.ui.Wallet.i2(context);
                i2Var3.getContent().addView(e11, w7.x5.d(-2.0f, -1));
                j2Var2.t(i2Var3);
                LinearLayout e13 = ai.e(context, 1);
                TextView t18 = org.telegram.ui.Wallet.f2.t(14, context, null, d6Var4);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                spannableStringBuilder3.setSpan(new ja0(AndroidUtilities.dp(80.0f), t18), 0, spannableStringBuilder3.length(), 33);
                t18.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                t18.setVisibility(z10 ? 8 : 0);
                t18.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21225z6, d6Var4));
                e13.addView(t18, w7.x5.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                LinearLayout linearLayout10 = new LinearLayout(context);
                linearLayout10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ci.d dVar3 = new ci.d(context, d6Var4, true);
                dVar3.setRoundRadius(24);
                dVar3.d();
                dVar3.setText(LocaleController.getString(R.string.WalletDecline));
                linearLayout10.addView(dVar3, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
                ci.d f7 = ai.f(24, context, d6Var4, true);
                f7.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                f7.setEnabled(false);
                linearLayout10.addView(f7, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
                e13.addView(linearLayout10);
                j2Var2.v(e13);
                final boolean[] zArr2 = {false};
                boolean[] zArr3 = {false};
                final org.telegram.ui.Wallet.b2 b2Var3 = b2Var;
                final org.telegram.ui.Wallet.f2 f2Var4 = f2Var;
                final org.telegram.ui.Wallet.k1 k1Var = new org.telegram.ui.Wallet.k1(b2Var3, zArr3, f7, dVar3, f2Var4, j2Var2, zArr2, d6Var4);
                f7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                k1Var.run(Boolean.FALSE);
                                return;
                            default:
                                k1Var.run(Boolean.TRUE);
                                return;
                        }
                    }
                });
                dVar3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                k1Var.run(Boolean.FALSE);
                                return;
                            default:
                                k1Var.run(Boolean.TRUE);
                                return;
                        }
                    }
                });
                final org.telegram.ui.Wallet.z1 z1Var2 = new org.telegram.ui.Wallet.z1(zArr2, b2Var3, j2Var2, 1);
                long j10 = i17;
                long j11 = e2Var.f34870a;
                if (j11 == 0) {
                    j11 = Long.MAX_VALUE;
                }
                b2Var3.f34725r = new org.telegram.ui.Wallet.o(j2Var2, 4);
                j2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r6) {
                            case 0:
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread((z1) z1Var2);
                                f2Var4.s(b2Var3);
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                    return;
                                }
                                return;
                            default:
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread((z1) z1Var2);
                                f2Var4.s(b2Var3);
                                Runnable runnable3 = runnable;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
                j2Var2.show();
                AndroidUtilities.runOnUIThread(z1Var2, Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000);
                ii.c cVar = new ii.c(zArr2, b2Var3, zArr3, f7, z10, l0Var3, t18, j2Var2, d6Var4);
                WalletEngine2 walletEngine2 = f2Var4.f34925b.f35220b;
                if (!b2Var3.f34721n && !f2Var4.i(b2Var3) && f2Var4.y(b2Var3) && walletEngine2 != null) {
                    if ("signMessage".equals(str5)) {
                        walletEngine2.previewSignMessage(e2Var, new org.telegram.ui.Wallet.q(f2Var4, b2Var3, cVar, 1));
                        return;
                    } else {
                        walletEngine2.previewTonConnect(e2Var, new org.telegram.ui.Wallet.k(f2Var4, b2Var3, cVar, 9));
                        return;
                    }
                }
                cVar.run(null, "Request expired, was processed, or the wallet changed");
                return;
            default:
                ci.d dVar4 = (ci.d) obj6;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                View view = (View) obj4;
                ci.u5 u5Var = (ci.u5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Cells.c1.p(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error2, false);
                        return;
                    } else {
                        new org.telegram.ui.Components.ad(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        return;
                    }
                }
                Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                if (queryParameter == null) {
                    new org.telegram.ui.Components.ad(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    return;
                }
                int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                StringBuilder k10 = hg.c.k("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                k10.append(isTestBackend);
                FileLog.d(k10.toString());
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] c12 = lj1.c(u5Var, queryParameter, currentDatacenterId, isTestBackend);
                    com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f6536c).h;
                    b8.e eVar = new b8.e(t0Var, (String) u5Var.f6066c, "/tg-wear-auth/token", c12);
                    t0Var.f6689b.d(0, eVar);
                    n6.m.n(eVar, y8.j0.f51909a).addOnSuccessListener(new js0(26, u5Var, dVar4)).addOnFailureListener(new kj1(dVar4, 1));
                    e3Var.dismiss();
                    return;
                } catch (Exception e14) {
                    FileLog.e(e14);
                    new org.telegram.ui.Components.ad(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0(e14.getMessage(), false);
                    return;
                }
        }
    }

    public jh(ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, ci.u5 u5Var) {
        this.f18313a = 3;
        this.f18315c = dVar;
        this.d = e3Var;
        this.f18314b = i10;
        this.f18316e = view;
        this.f18317f = u5Var;
    }

    public jh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f18313a = i11;
        this.f18315c = obj;
        this.d = obj2;
        this.f18316e = obj3;
        this.f18317f = obj4;
        this.f18314b = i10;
    }
}
