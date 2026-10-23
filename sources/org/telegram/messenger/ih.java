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
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cf0;
import org.telegram.ui.eb0;
import org.telegram.ui.en0;
import org.telegram.ui.ex;
import org.telegram.ui.ib0;
import org.telegram.ui.xh1;
import org.telegram.ui.yh1;
public final class ih implements Utilities.Callback2 {
    public final int f18639a;
    public final int f18640b;
    public final Object f18641c;
    public final Object d;
    public final Object e;
    public final Object f18642f;

    public ih(Context context, int i10, org.telegram.ui.Wallet.m0 m0Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        this.f18639a = 3;
        this.f18642f = context;
        this.f18640b = i10;
        this.f18641c = m0Var;
        this.d = d6Var;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.n2 U;
        org.telegram.ui.Wallet.b2 b2Var;
        org.telegram.ui.Wallet.f2 f2Var;
        boolean z10;
        final int i10;
        char c10;
        CharSequence formatSpannable;
        CharSequence charSequence;
        org.telegram.ui.Wallet.m0 m0Var;
        String string;
        int i11;
        int i12;
        int i13 = this.f18639a;
        int i14 = this.f18640b;
        Object obj3 = this.f18642f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f18641c;
        switch (i13) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) obj6, (Utilities.Callback2) obj5, (l5.j) obj4, (Context) obj3, this.f18640b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                pf.c cVar = (pf.c) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                if (cVar != null) {
                    cVar.b();
                }
                if (user2 != null) {
                    messagesController.putUser(user2, false);
                    messagesController.loadFullUser(user2, 0, true);
                }
                launchActivity.m0(i14, user.f20427id, tL_error);
                return;
            case 2:
                ib0 ib0Var = (ib0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = ib0Var.f37916a;
                ib0Var.h = -1;
                if (ib0Var.f37922j || launchActivity2.isFinishing() || launchActivity2.isDestroyed()) {
                    ib0Var.c();
                    return;
                }
                if (tL_error2 != null) {
                    ib0Var.c();
                    if (ib0Var.a()) {
                        ib0.d().f0(tL_error2, false);
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
                                if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f20538id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ib0Var.f37917b).getCurrentTime()) {
                                    if (ib0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                        ib0Var.c();
                                        org.telegram.ui.Wallet.f2.o(ib0Var.f37916a, ib0Var.f37917b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new eb0(ib0Var, str3, 0));
                                    }
                                }
                            }
                        }
                    }
                    int i16 = this.f18640b;
                    if (i16 < 10) {
                        ai.ub ubVar = new ai.ub((Object) ib0Var, str, str2, str3, i16, 28);
                        ib0Var.f37921i = ubVar;
                        AndroidUtilities.runOnUIThread(ubVar, 500L);
                        return;
                    }
                    ib0Var.c();
                    if (ib0Var.a()) {
                        org.telegram.ui.Components.xc.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) obj6;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.b2 b2Var2 = (org.telegram.ui.Wallet.b2) obj;
                String str4 = (String) obj2;
                if (b2Var2 == null) {
                    if (str4 != null) {
                        org.telegram.ui.Components.xc.b0(str4);
                        return;
                    }
                    return;
                }
                int i17 = b2Var2.f34022c;
                TL_wallet.tonConnectSession tonconnectsession2 = b2Var2.f34020a;
                String str5 = b2Var2.e;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.F1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i14) {
                        m0Var2.f34485g.s(b2Var2);
                        return;
                    }
                }
                if ("signData".equals(str5)) {
                    final org.telegram.ui.Wallet.f2 f2Var2 = org.telegram.ui.Wallet.m0.w(i14).f34485g;
                    try {
                        JSONObject jSONObject = new JSONObject(b2Var2.f34027k);
                        boolean equals = "text".equals(jSONObject.optString("type"));
                        org.telegram.ui.Wallet.j2 j2Var = new org.telegram.ui.Wallet.j2(context, d6Var, new View[0]);
                        j2Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20936a7, d6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setGravity(16);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_close);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
                        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21083i6, d6Var), 1, -1));
                        imageView.setContentDescription(LocaleController.getString(R.string.Close));
                        imageView.setOnClickListener(new cf0(22, b2Var2, j2Var));
                        linearLayout2.addView(imageView, w7.z5.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                        w9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "44_44", null, tonconnectsession2.manifest);
                        }
                        linearLayout2.addView(w9Var, w7.z5.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        TextView t10 = org.telegram.ui.Wallet.f2.t(18, context, LocaleController.getString(R.string.WalletSignData), d6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        t10.setGravity(3);
                        linearLayout3.addView(t10, w7.z5.n(-1, -2));
                        TextView t11 = org.telegram.ui.Wallet.f2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), d6Var);
                        int i18 = org.telegram.ui.ActionBar.h6.f21399z6;
                        t11.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
                        t11.setGravity(3);
                        t11.setSingleLine(true);
                        t11.setEllipsize(TextUtils.TruncateAt.END);
                        linearLayout3.addView(t11, w7.z5.n(-1, -2));
                        linearLayout2.addView(linearLayout3, w7.z5.m(1.0f, 0, -2, 0, 16, 0));
                        linearLayout.addView(linearLayout2, w7.z5.n(-1, 56));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(1);
                        linearLayout4.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var)));
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
                            linearLayout4.addView(t13, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                            t12.setTypeface(Typeface.MONOSPACE);
                            i11 = -1;
                            i12 = -2;
                        } else {
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setGravity(16);
                            TextView t14 = org.telegram.ui.Wallet.f2.t(12, context, "!", d6Var);
                            t14.setTypeface(AndroidUtilities.bold());
                            t14.setTextColor(-1);
                            t14.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, d6Var)));
                            linearLayout5.addView(t14, w7.z5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                            TextView t15 = org.telegram.ui.Wallet.f2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), d6Var);
                            t15.setGravity(3);
                            t15.setTypeface(AndroidUtilities.bold());
                            i11 = -1;
                            i12 = -2;
                            linearLayout5.addView(t15, w7.z5.n(-1, -2));
                            linearLayout4.addView(linearLayout5, w7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                        }
                        linearLayout4.addView(t12, w7.z5.n(i11, i12));
                        if (equals) {
                            t12.setOnClickListener(new org.telegram.ui.Wallet.n1(jSONObject, j2Var, d6Var, 0));
                        }
                        ex exVar = new ex(context, 2);
                        exVar.addView(linearLayout4);
                        linearLayout.addView(exVar, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                        org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context);
                        i2Var.getContent().addView(linearLayout, w7.z5.c(-2.0f, -1));
                        j2Var.t(i2Var);
                        LinearLayout e = nk.e(context, 1);
                        if (equals) {
                            TextView t16 = org.telegram.ui.Wallet.f2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), d6Var);
                            t16.setGravity(3);
                            t16.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
                            e.addView(t16, w7.z5.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                        }
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        ei.d dVar = new ei.d(context, d6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.d();
                        dVar.setText(LocaleController.getString(R.string.Cancel));
                        ei.d dVar2 = new ei.d(context, d6Var, true);
                        dVar2.setRoundRadius(24);
                        dVar2.setText(LocaleController.getString(R.string.WalletSign));
                        dVar2.setEnabled(false);
                        linearLayout6.addView(dVar, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                        linearLayout6.addView(dVar2, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                        e.addView(linearLayout6);
                        j2Var.v(e);
                        j2Var.setDelegate(new org.telegram.ui.j0(b2Var2, 2));
                        org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(exVar, b2Var2, dVar2, 2);
                        exVar.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.o1(hVar, 0));
                        exVar.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.p1(hVar, 0));
                        final org.telegram.ui.Wallet.q1 q1Var = new org.telegram.ui.Wallet.q1(dVar2, dVar, f2Var2, b2Var2, j2Var, d6Var, hVar);
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
                        b2Var2.f34034r = new org.telegram.ui.Wallet.n(j2Var, 5);
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
                        AndroidUtilities.runOnUIThread(z1Var, Math.max(0L, i17 - f2Var2.f34202f.getCurrentTime()) * 1000);
                        return;
                    } catch (JSONException e7) {
                        f2Var2.s(b2Var2);
                        org.telegram.ui.Components.xc.b0(org.telegram.ui.Wallet.f2.h("display signing data", e7));
                        return;
                    }
                }
                org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i14);
                org.telegram.ui.Wallet.f2 f2Var3 = w9.f34485g;
                org.telegram.ui.Wallet.e2 e2Var = b2Var2.f34023f;
                boolean equals2 = "signMessage".equals(str5);
                final org.telegram.ui.Wallet.j2 j2Var2 = new org.telegram.ui.Wallet.j2(context, d6Var, new View[0]);
                j2Var2.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20936a7, d6Var));
                LinearLayout linearLayout7 = new LinearLayout(context);
                linearLayout7.setOrientation(1);
                org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
                w9Var2.setRoundRadius(AndroidUtilities.dp(38.0f));
                TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                if (webDocument2 != null) {
                    b2Var = b2Var2;
                    f2Var = f2Var3;
                    z10 = equals2;
                    w9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                } else {
                    b2Var = b2Var2;
                    f2Var = f2Var3;
                    z10 = equals2;
                }
                linearLayout7.addView(w9Var2, w7.z5.t(76, 76, 1, 0, 24, 0, 0));
                TextView t17 = org.telegram.ui.Wallet.f2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), d6Var);
                t17.setTypeface(AndroidUtilities.bold());
                linearLayout7.addView(t17, w7.z5.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    linearLayout7.addView(org.telegram.ui.Wallet.f2.g(context, hostAuthority, d6Var), w7.z5.t(-2, -2, 1, 36, 6, 36, 12));
                }
                org.telegram.ui.Wallet.x5 x5Var = new org.telegram.ui.Wallet.x5(context, R.drawable.wallet_card_info, 24);
                x5Var.getCardHolderView().setMaxLines(2);
                x5Var.getCardHolderView().setSingleLine(false);
                List<org.telegram.ui.Wallet.d2> list = e2Var.f34151b;
                long j10 = e2Var.f34152c;
                x5Var.setCardHolder(org.telegram.ui.Wallet.w7.X(((org.telegram.ui.Wallet.d2) list.get(0)).f34100a));
                org.telegram.ui.Components.q6 balanceView = x5Var.getBalanceView();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("GRAM");
                spannableString.setSpan(new yq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.m0.n(-j10, true)).append((CharSequence) " ");
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
                                j2 j2Var3 = j2Var2;
                                ei.h1 h1Var = j2Var3.f34381b;
                                if (1 < j2Var3.f34382c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                ei.h1 h1Var2 = j2Var4.f34381b;
                                if (j2Var4.f34382c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                i2Var2.getContent().addView(linearLayout7, w7.z5.c(-2.0f, -1));
                j2Var2.t(i2Var2);
                LinearLayout e10 = nk.e(context, 1);
                LinearLayout e11 = nk.e(context, 0);
                e10.addView(e11, w7.z5.n(-1, 56));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.ic_ab_back);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21083i6, d6Var), 1, -1));
                int i19 = org.telegram.ui.ActionBar.h6.G6;
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i19, d6Var), PorterDuff.Mode.SRC_IN));
                w7.b6.a(imageView2);
                e11.addView(imageView2, w7.z5.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var3 = new org.telegram.ui.Components.w9(context);
                w9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                if (webDocument3 != null) {
                    w9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                }
                e11.addView(w9Var3, w7.z5.t(44, 44, 19, 12, 0, 11, 0));
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(1);
                e11.addView(linearLayout8, w7.z5.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var));
                textView.setTextSize(1, 18.0f);
                linearLayout8.addView(textView, w7.z5.n(-1, -2));
                textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                if (TextUtils.isEmpty(hostAuthority)) {
                    i10 = 1;
                } else {
                    TextView textView2 = new TextView(context);
                    i10 = 1;
                    nk.o(org.telegram.ui.ActionBar.h6.f21399z6, d6Var, textView2, 1, 14.0f);
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
                                j2 j2Var3 = j2Var2;
                                ei.h1 h1Var = j2Var3.f34381b;
                                if (1 < j2Var3.f34382c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                ei.h1 h1Var2 = j2Var4.f34381b;
                                if (j2Var4.f34382c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                String A = org.telegram.ui.Wallet.f2.A(((org.telegram.ui.Wallet.d2) list.get(0)).f34100a);
                int i20 = R.drawable.mini_gram_24;
                SpannableStringBuilder r10 = org.telegram.ui.Wallet.m0.r(j10, i10);
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
                D.addView(org.telegram.ui.Wallet.f2.b(context, i20, r10, formatSpannable, null, null, d6Var), w7.z5.n(-1, -2));
                linearLayout9.addView(D, w7.z5.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                LinearLayout D2 = org.telegram.ui.Wallet.f2.D(context, LocaleController.getString(R.string.WalletActions), d6Var2);
                for (org.telegram.ui.Wallet.d2 d2Var : list) {
                    int i23 = R.drawable.mini_gram_24;
                    String string2 = LocaleController.getString((d2Var.f34101b == null || d2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                    CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.f2.A(d2Var.f34100a));
                    String n10 = org.telegram.ui.Wallet.m0.n(-d2Var.e, true);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                    int indexOf = n10.indexOf(46);
                    if (indexOf >= 0) {
                        charSequence = formatSpannable2;
                        m0Var = w9;
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                    } else {
                        charSequence = formatSpannable2;
                        m0Var = w9;
                    }
                    if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                        spannableStringBuilder2.append((CharSequence) " x");
                    }
                    yq yqVar = new yq(R.drawable.wallet_gram_small, 2);
                    yqVar.recolorDrawable = false;
                    yqVar.setSize(AndroidUtilities.dp(16.0f));
                    spannableStringBuilder2.setSpan(yqVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                    D2.addView(org.telegram.ui.Wallet.f2.b(context, i23, string2, charSequence, spannableStringBuilder2, d2Var.d, d6Var3), w7.z5.n(-1, -2));
                    d6Var2 = d6Var3;
                    w9 = m0Var;
                }
                org.telegram.ui.Wallet.m0 m0Var3 = w9;
                org.telegram.ui.ActionBar.d6 d6Var4 = d6Var2;
                linearLayout9.addView(D2, w7.z5.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                ex exVar2 = new ex(context, 3);
                exVar2.setFillViewport(false);
                exVar2.addView(linearLayout9);
                e10.addView(exVar2, w7.z5.n(-1, -2));
                org.telegram.ui.Wallet.i2 i2Var3 = new org.telegram.ui.Wallet.i2(context);
                i2Var3.getContent().addView(e10, w7.z5.c(-2.0f, -1));
                j2Var2.t(i2Var3);
                LinearLayout e12 = nk.e(context, 1);
                TextView t18 = org.telegram.ui.Wallet.f2.t(14, context, null, d6Var4);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                spannableStringBuilder3.setSpan(new ca0(AndroidUtilities.dp(80.0f), t18), 0, spannableStringBuilder3.length(), 33);
                t18.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                t18.setVisibility(z10 ? 8 : 0);
                t18.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21399z6, d6Var4));
                e12.addView(t18, w7.z5.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                LinearLayout linearLayout10 = new LinearLayout(context);
                linearLayout10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ei.d dVar3 = new ei.d(context, d6Var4, true);
                dVar3.setRoundRadius(24);
                dVar3.d();
                dVar3.setText(LocaleController.getString(R.string.WalletDecline));
                linearLayout10.addView(dVar3, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                ei.d f7 = nk.f(24, context, d6Var4, true);
                f7.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                f7.setEnabled(false);
                linearLayout10.addView(f7, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                e12.addView(linearLayout10);
                j2Var2.v(e12);
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
                long j11 = i17;
                long j12 = e2Var.f34150a;
                if (j12 == 0) {
                    j12 = Long.MAX_VALUE;
                }
                b2Var3.f34034r = new org.telegram.ui.Wallet.n(j2Var2, 5);
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
                AndroidUtilities.runOnUIThread(z1Var2, Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000);
                ki.c cVar2 = new ki.c(zArr2, b2Var3, zArr3, f7, z10, m0Var3, t18, j2Var2, d6Var4);
                WalletEngine2 walletEngine2 = f2Var4.f34200b.f34482b;
                if (!b2Var3.f34030n && !f2Var4.i(b2Var3) && f2Var4.y(b2Var3) && walletEngine2 != null) {
                    if ("signMessage".equals(str5)) {
                        walletEngine2.previewSignMessage(e2Var, new org.telegram.ui.Wallet.p(f2Var4, b2Var3, cVar2, 1));
                        return;
                    } else {
                        walletEngine2.previewTonConnect(e2Var, new org.telegram.ui.Wallet.k(f2Var4, b2Var3, cVar2, 9));
                        return;
                    }
                }
                cVar2.run(null, "Request expired, was processed, or the wallet changed");
                return;
            default:
                ei.d dVar4 = (ei.d) obj6;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                View view = (View) obj4;
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Cells.c1.t(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error3, false);
                        return;
                    } else {
                        new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        return;
                    }
                }
                Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                if (queryParameter == null) {
                    new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    return;
                }
                int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                StringBuilder m10 = i2.e.m("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                m10.append(isTestBackend);
                FileLog.d(m10.toString());
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] c12 = yh1.c(z5Var, queryParameter, currentDatacenterId, isTestBackend);
                    com.google.android.gms.common.api.internal.s0 s0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6356c).h;
                    b8.e eVar = new b8.e(s0Var, (String) z5Var.f6880a, "/tg-wear-auth/token", c12);
                    s0Var.f6491b.d(0, eVar);
                    n6.l.n(eVar, y8.j0.f50020a).addOnSuccessListener(new en0(29, z5Var, dVar4)).addOnFailureListener(new xh1(dVar4, 1));
                    f3Var.dismiss();
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0(e13.getMessage(), false);
                    return;
                }
        }
    }

    public ih(ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, com.google.android.gms.internal.cast.z5 z5Var) {
        this.f18639a = 4;
        this.f18641c = dVar;
        this.d = f3Var;
        this.f18640b = i10;
        this.e = view;
        this.f18642f = z5Var;
    }

    public ih(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f18639a = i11;
        this.f18641c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18642f = obj4;
        this.f18640b = i10;
    }

    public ih(LaunchActivity launchActivity, pf.c cVar, MessagesController messagesController, int i10, TLRPC.User user) {
        this.f18639a = 1;
        this.f18641c = launchActivity;
        this.d = cVar;
        this.e = messagesController;
        this.f18640b = i10;
        this.f18642f = user;
    }
}
