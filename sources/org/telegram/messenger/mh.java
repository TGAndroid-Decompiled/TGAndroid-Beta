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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.bs0;
import org.telegram.ui.bz0;
import org.telegram.ui.dc0;
import org.telegram.ui.ic0;
import org.telegram.ui.sj1;
import org.telegram.ui.tj1;
public final class mh implements Utilities.Callback2 {
    public final int f17576a;
    public final int f17577b;
    public final Object f17578c;
    public final Object d;
    public final Object e;
    public final Object f17579f;

    public mh(Context context, int i10, org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        this.f17576a = 2;
        this.f17579f = context;
        this.f17577b = i10;
        this.f17578c = k0Var;
        this.d = c6Var;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.m2 U;
        org.telegram.ui.Wallet.a2 a2Var;
        org.telegram.ui.Wallet.e2 e2Var;
        boolean z10;
        final int i10;
        char c10;
        CharSequence formatSpannable;
        CharSequence charSequence;
        org.telegram.ui.Wallet.k0 k0Var;
        String string;
        int i11;
        int i12;
        int i13 = this.f17576a;
        int i14 = this.f17577b;
        Object obj3 = this.f17579f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f17578c;
        switch (i13) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.a2) obj6, (Utilities.Callback2) obj5, (k0.b) obj4, (Context) obj3, this.f17577b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ic0 ic0Var = (ic0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity = ic0Var.f36775a;
                ic0Var.h = -1;
                if (ic0Var.f36781j || launchActivity.isFinishing() || launchActivity.isDestroyed()) {
                    ic0Var.c();
                    return;
                }
                if (tL_error != null) {
                    ic0Var.c();
                    if (ic0Var.a()) {
                        ic0.d().f0(tL_error, false);
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
                                if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f19175id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ic0Var.f36776b).getCurrentTime()) {
                                    if (ic0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                        ic0Var.c();
                                        org.telegram.ui.Wallet.e2.o(ic0Var.f36775a, ic0Var.f36776b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new dc0(ic0Var, str3, 0));
                                    }
                                }
                            }
                        }
                    }
                    int i16 = this.f17577b;
                    if (i16 < 10) {
                        fi.l3 l3Var = new fi.l3(ic0Var, str, str2, str3, i16, 27);
                        ic0Var.f36780i = l3Var;
                        AndroidUtilities.runOnUIThread(l3Var, 500L);
                        return;
                    }
                    ic0Var.c();
                    if (ic0Var.a()) {
                        org.telegram.ui.Components.zc.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj6;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                String str4 = (String) obj2;
                if (a2Var2 == null) {
                    if (str4 != null) {
                        org.telegram.ui.Components.zc.b0(str4);
                        return;
                    }
                    return;
                }
                int i17 = a2Var2.f32619c;
                TL_wallet.tonConnectSession tonconnectsession2 = a2Var2.f32617a;
                String str5 = a2Var2.e;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.E1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i14) {
                        k0Var2.f33096g.s(a2Var2);
                        return;
                    }
                }
                if ("signData".equals(str5)) {
                    final org.telegram.ui.Wallet.e2 e2Var2 = org.telegram.ui.Wallet.k0.v(i14).f33096g;
                    try {
                        JSONObject jSONObject = new JSONObject(a2Var2.f32624k);
                        boolean equals = "text".equals(jSONObject.optString("type"));
                        org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context, c6Var, new View[0]);
                        i2Var.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, c6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setGravity(16);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_close);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
                        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var), 1, -1));
                        imageView.setContentDescription(LocaleController.getString(R.string.Close));
                        imageView.setOnClickListener(new bz0(12, a2Var2, i2Var));
                        linearLayout2.addView(imageView, w7.z5.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                        z9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            z9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "44_44", null, tonconnectsession2.manifest);
                        }
                        linearLayout2.addView(z9Var, w7.z5.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        TextView t10 = org.telegram.ui.Wallet.e2.t(18, context, LocaleController.getString(R.string.WalletSignData), c6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        t10.setGravity(3);
                        linearLayout3.addView(t10, w7.z5.n(-1, -2));
                        TextView t11 = org.telegram.ui.Wallet.e2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), c6Var);
                        int i18 = org.telegram.ui.ActionBar.g6.f20005z6;
                        t11.setTextColor(org.telegram.ui.ActionBar.g6.w0(i18, c6Var));
                        t11.setGravity(3);
                        t11.setSingleLine(true);
                        t11.setEllipsize(TextUtils.TruncateAt.END);
                        linearLayout3.addView(t11, w7.z5.n(-1, -2));
                        linearLayout2.addView(linearLayout3, w7.z5.m(1.0f, 0, -2, 0, 16, 0));
                        linearLayout.addView(linearLayout2, w7.z5.n(-1, 56));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(1);
                        linearLayout4.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var)));
                        if (equals) {
                            string = jSONObject.optString("text");
                        } else {
                            string = LocaleController.getString(R.string.WalletBinaryDataWarning);
                        }
                        TextView t12 = org.telegram.ui.Wallet.e2.t(equals ? 14 : 16, context, string, c6Var);
                        t12.setGravity(3);
                        t12.setTextIsSelectable(equals);
                        if (equals) {
                            TextView t13 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletSigningData), c6Var);
                            t13.setGravity(3);
                            t13.setTypeface(AndroidUtilities.bold());
                            t13.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
                            linearLayout4.addView(t13, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                            t12.setTypeface(Typeface.MONOSPACE);
                            i11 = -1;
                            i12 = -2;
                        } else {
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setGravity(16);
                            TextView t14 = org.telegram.ui.Wallet.e2.t(12, context, "!", c6Var);
                            t14.setTypeface(AndroidUtilities.bold());
                            t14.setTextColor(-1);
                            t14.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var)));
                            linearLayout5.addView(t14, w7.z5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                            TextView t15 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), c6Var);
                            t15.setGravity(3);
                            t15.setTypeface(AndroidUtilities.bold());
                            i11 = -1;
                            i12 = -2;
                            linearLayout5.addView(t15, w7.z5.n(-1, -2));
                            linearLayout4.addView(linearLayout5, w7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                        }
                        linearLayout4.addView(t12, w7.z5.n(i11, i12));
                        if (equals) {
                            t12.setOnClickListener(new org.telegram.ui.Wallet.m1(jSONObject, i2Var, c6Var, 0));
                        }
                        ay ayVar = new ay(context, 2);
                        ayVar.addView(linearLayout4);
                        linearLayout.addView(ayVar, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                        org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context);
                        h2Var.getContent().addView(linearLayout, w7.z5.d(-2.0f, -1));
                        i2Var.t(h2Var);
                        LinearLayout e = sk.e(context, 1);
                        if (equals) {
                            TextView t16 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), c6Var);
                            t16.setGravity(3);
                            t16.setTextColor(org.telegram.ui.ActionBar.g6.w0(i18, c6Var));
                            e.addView(t16, w7.z5.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                        }
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        di.d dVar = new di.d(context, c6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.d();
                        dVar.setText(LocaleController.getString(R.string.Cancel));
                        di.d dVar2 = new di.d(context, c6Var, true);
                        dVar2.setRoundRadius(24);
                        dVar2.setText(LocaleController.getString(R.string.WalletSign));
                        dVar2.setEnabled(false);
                        linearLayout6.addView(dVar, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                        linearLayout6.addView(dVar2, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                        e.addView(linearLayout6);
                        i2Var.v(e);
                        i2Var.setDelegate(new org.telegram.ui.i0(a2Var2, 2));
                        org.telegram.ui.Wallet.l lVar = new org.telegram.ui.Wallet.l(ayVar, a2Var2, dVar2, 2);
                        ayVar.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.n1(lVar, 0));
                        ayVar.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.o1(lVar, 0));
                        final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(dVar2, dVar, e2Var2, a2Var2, i2Var, c6Var, lVar);
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
                        a2Var2.f32631r = new org.telegram.ui.Wallet.n(i2Var, 4);
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
                        AndroidUtilities.runOnUIThread(y1Var, Math.max(0L, i17 - e2Var2.f32820f.getCurrentTime()) * 1000);
                        return;
                    } catch (JSONException e7) {
                        e2Var2.s(a2Var2);
                        org.telegram.ui.Components.zc.b0(org.telegram.ui.Wallet.e2.h("display signing data", e7));
                        return;
                    }
                }
                org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i14);
                org.telegram.ui.Wallet.e2 e2Var3 = v.f33096g;
                org.telegram.ui.Wallet.d2 d2Var = a2Var2.f32620f;
                boolean equals2 = "signMessage".equals(str5);
                final org.telegram.ui.Wallet.i2 i2Var2 = new org.telegram.ui.Wallet.i2(context, c6Var, new View[0]);
                i2Var2.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, c6Var));
                LinearLayout linearLayout7 = new LinearLayout(context);
                linearLayout7.setOrientation(1);
                org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(context);
                z9Var2.setRoundRadius(AndroidUtilities.dp(38.0f));
                TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                if (webDocument2 != null) {
                    a2Var = a2Var2;
                    e2Var = e2Var3;
                    z10 = equals2;
                    z9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                } else {
                    a2Var = a2Var2;
                    e2Var = e2Var3;
                    z10 = equals2;
                }
                linearLayout7.addView(z9Var2, w7.z5.t(76, 76, 1, 0, 24, 0, 0));
                TextView t17 = org.telegram.ui.Wallet.e2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), c6Var);
                t17.setTypeface(AndroidUtilities.bold());
                linearLayout7.addView(t17, w7.z5.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    linearLayout7.addView(org.telegram.ui.Wallet.e2.g(context, hostAuthority, c6Var), w7.z5.t(-2, -2, 1, 36, 6, 36, 12));
                }
                org.telegram.ui.Wallet.i5 i5Var = new org.telegram.ui.Wallet.i5(R.drawable.wallet_card_info, 24, context, false);
                i5Var.setEngravingBitmap(null);
                i5Var.getCardHolderView().setMaxLines(2);
                i5Var.getCardHolderView().setSingleLine(false);
                List<org.telegram.ui.Wallet.c2> list = d2Var.f32776b;
                long j10 = d2Var.f32777c;
                i5Var.setCardHolder(org.telegram.ui.Wallet.a7.X(((org.telegram.ui.Wallet.c2) list.get(0)).f32729a));
                org.telegram.ui.Components.s6 balanceView = i5Var.getBalanceView();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("GRAM");
                spannableString.setSpan(new br(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.k0.n(-j10, true)).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                balanceView.setText(spannableStringBuilder);
                i5Var.getUsdBalanceView().setText(v.l(j10, false));
                linearLayout7.addView(i5Var, w7.z5.n(-1, -2));
                i5Var.setCardOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (r2) {
                            case 0:
                                i2 i2Var3 = i2Var2;
                                di.h1 h1Var = i2Var3.f33008b;
                                if (1 < i2Var3.f33009c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                di.h1 h1Var2 = i2Var4.f33008b;
                                if (i2Var4.f33009c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                h2Var2.getContent().addView(linearLayout7, w7.z5.d(-2.0f, -1));
                i2Var2.t(h2Var2);
                LinearLayout e10 = sk.e(context, 1);
                LinearLayout e11 = sk.e(context, 0);
                e10.addView(e11, w7.z5.n(-1, 56));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.ic_ab_back);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var), 1, -1));
                int i19 = org.telegram.ui.ActionBar.g6.G6;
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i19, c6Var), PorterDuff.Mode.SRC_IN));
                w7.b6.a(imageView2);
                e11.addView(imageView2, w7.z5.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                org.telegram.ui.Components.z9 z9Var3 = new org.telegram.ui.Components.z9(context);
                z9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                if (webDocument3 != null) {
                    z9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                }
                e11.addView(z9Var3, w7.z5.t(44, 44, 19, 12, 0, 11, 0));
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(1);
                e11.addView(linearLayout8, w7.z5.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
                textView.setTextSize(1, 18.0f);
                linearLayout8.addView(textView, w7.z5.n(-1, -2));
                textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                if (TextUtils.isEmpty(hostAuthority)) {
                    i10 = 1;
                } else {
                    TextView textView2 = new TextView(context);
                    i10 = 1;
                    sk.o(org.telegram.ui.ActionBar.g6.f20005z6, c6Var, textView2, 1, 14.0f);
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
                                di.h1 h1Var = i2Var3.f33008b;
                                if (1 < i2Var3.f33009c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                di.h1 h1Var2 = i2Var4.f33008b;
                                if (i2Var4.f33009c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                LinearLayout D = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletPreview), c6Var);
                String A = org.telegram.ui.Wallet.e2.A(((org.telegram.ui.Wallet.c2) list.get(0)).f32729a);
                int i20 = R.drawable.mini_gram_24;
                SpannableStringBuilder q6 = org.telegram.ui.Wallet.k0.q(j10, i10);
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
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                D.addView(org.telegram.ui.Wallet.e2.b(context, i20, q6, formatSpannable, null, null, c6Var), w7.z5.n(-1, -2));
                linearLayout9.addView(D, w7.z5.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                LinearLayout D2 = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletActions), c6Var2);
                for (org.telegram.ui.Wallet.c2 c2Var : list) {
                    int i23 = R.drawable.mini_gram_24;
                    String string2 = LocaleController.getString((c2Var.f32730b == null || c2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                    CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.e2.A(c2Var.f32729a));
                    String n10 = org.telegram.ui.Wallet.k0.n(-c2Var.e, true);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                    int indexOf = n10.indexOf(46);
                    if (indexOf >= 0) {
                        charSequence = formatSpannable2;
                        k0Var = v;
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                    } else {
                        charSequence = formatSpannable2;
                        k0Var = v;
                    }
                    if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                        spannableStringBuilder2.append((CharSequence) " x");
                    }
                    br brVar = new br(R.drawable.wallet_gram_small, 2);
                    brVar.recolorDrawable = false;
                    brVar.setSize(AndroidUtilities.dp(16.0f));
                    spannableStringBuilder2.setSpan(brVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                    D2.addView(org.telegram.ui.Wallet.e2.b(context, i23, string2, charSequence, spannableStringBuilder2, c2Var.d, c6Var3), w7.z5.n(-1, -2));
                    c6Var2 = c6Var3;
                    v = k0Var;
                }
                org.telegram.ui.Wallet.k0 k0Var3 = v;
                org.telegram.ui.ActionBar.c6 c6Var4 = c6Var2;
                linearLayout9.addView(D2, w7.z5.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                ay ayVar2 = new ay(context, 3);
                ayVar2.setFillViewport(false);
                ayVar2.addView(linearLayout9);
                e10.addView(ayVar2, w7.z5.n(-1, -2));
                org.telegram.ui.Wallet.h2 h2Var3 = new org.telegram.ui.Wallet.h2(context);
                h2Var3.getContent().addView(e10, w7.z5.d(-2.0f, -1));
                i2Var2.t(h2Var3);
                LinearLayout e12 = sk.e(context, 1);
                TextView t18 = org.telegram.ui.Wallet.e2.t(14, context, null, c6Var4);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                spannableStringBuilder3.setSpan(new ia0(AndroidUtilities.dp(80.0f), t18), 0, spannableStringBuilder3.length(), 33);
                t18.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                t18.setVisibility(z10 ? 8 : 0);
                t18.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var4));
                e12.addView(t18, w7.z5.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                LinearLayout linearLayout10 = new LinearLayout(context);
                linearLayout10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                di.d dVar3 = new di.d(context, c6Var4, true);
                dVar3.setRoundRadius(24);
                dVar3.d();
                dVar3.setText(LocaleController.getString(R.string.WalletDecline));
                linearLayout10.addView(dVar3, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                di.d f7 = sk.f(24, context, c6Var4, true);
                f7.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                f7.setEnabled(false);
                linearLayout10.addView(f7, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                e12.addView(linearLayout10);
                i2Var2.v(e12);
                final boolean[] zArr2 = {false};
                boolean[] zArr3 = {false};
                final org.telegram.ui.Wallet.a2 a2Var3 = a2Var;
                final org.telegram.ui.Wallet.e2 e2Var4 = e2Var;
                final org.telegram.ui.Wallet.j1 j1Var = new org.telegram.ui.Wallet.j1(a2Var3, zArr3, f7, dVar3, e2Var4, i2Var2, zArr2, c6Var4);
                f7.setOnClickListener(new View.OnClickListener() {
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
                long j12 = d2Var.f32775a;
                if (j12 == 0) {
                    j12 = Long.MAX_VALUE;
                }
                a2Var3.f32631r = new org.telegram.ui.Wallet.n(i2Var2, 4);
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
                ji.c cVar = new ji.c(zArr2, a2Var3, zArr3, f7, z10, k0Var3, t18, i2Var2, c6Var4);
                WalletEngine2 walletEngine2 = e2Var4.f32818b.f33093b;
                if (!a2Var3.f32627n && !e2Var4.i(a2Var3) && e2Var4.y(a2Var3) && walletEngine2 != null) {
                    if ("signMessage".equals(str5)) {
                        walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.p(e2Var4, a2Var3, cVar, 1));
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var4, a2Var3, cVar, 9));
                        return;
                    }
                }
                cVar.run(null, "Request expired, was processed, or the wallet changed");
                return;
            default:
                di.d dVar4 = (di.d) obj6;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                View view = (View) obj4;
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Cells.c1.p(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error2, false);
                        return;
                    } else {
                        new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        return;
                    }
                }
                Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                if (queryParameter == null) {
                    new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    return;
                }
                int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                StringBuilder m10 = i2.d.m("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                m10.append(isTestBackend);
                FileLog.d(m10.toString());
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] c12 = tj1.c(z5Var, queryParameter, currentDatacenterId, isTestBackend);
                    com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f4900c).h;
                    b8.e eVar = new b8.e(t0Var, (String) z5Var.f5428a, "/tg-wear-auth/token", c12);
                    t0Var.f5043b.d(0, eVar);
                    n6.l.n(eVar, y8.j0.f48627a).addOnSuccessListener(new bs0(27, z5Var, dVar4)).addOnFailureListener(new sj1(dVar4, 1));
                    e3Var.dismiss();
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0(e13.getMessage(), false);
                    return;
                }
        }
    }

    public mh(di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, com.google.android.gms.internal.cast.z5 z5Var) {
        this.f17576a = 3;
        this.f17578c = dVar;
        this.d = e3Var;
        this.f17577b = i10;
        this.e = view;
        this.f17579f = z5Var;
    }

    public mh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f17576a = i11;
        this.f17578c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17579f = obj4;
        this.f17577b = i10;
    }
}
