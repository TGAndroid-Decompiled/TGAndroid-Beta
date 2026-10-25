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
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bx;
import org.telegram.ui.gi1;
import org.telegram.ui.hb0;
import org.telegram.ui.ii1;
import org.telegram.ui.lb0;
import org.telegram.ui.xd0;
import org.telegram.ui.zg1;
public final class kh implements Utilities.Callback2 {
    public final int f20529a;
    public final int f20530b;
    public final Object f20531c;
    public final Object d;
    public final Object e;
    public final Object f20532f;

    public kh(Context context, int i10, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        this.f20529a = 3;
        this.f20532f = context;
        this.f20530b = i10;
        this.f20531c = l0Var;
        this.d = u6Var;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.r2 U;
        org.telegram.ui.Wallet.e2 e2Var;
        int i10;
        boolean z10;
        Object obj3;
        final int i11;
        char c10;
        CharSequence formatSpannable;
        org.telegram.ui.Wallet.l0 l0Var;
        String string;
        int i12;
        int i13;
        int i14 = this.f20529a;
        int i15 = this.f20530b;
        Object obj4 = this.f20532f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f20531c;
        switch (i14) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.e2) obj7, (Utilities.Callback2) obj6, (s4.o0) obj5, (Context) obj4, this.f20530b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                qf.c cVar = (qf.c) obj6;
                MessagesController messagesController = (MessagesController) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
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
                launchActivity.n0(i15, user.f22174id, tL_error);
                return;
            case 2:
                lb0 lb0Var = (lb0) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = lb0Var.f41235a;
                lb0Var.h = -1;
                if (lb0Var.f41241j || launchActivity2.isFinishing() || launchActivity2.isDestroyed()) {
                    lb0Var.c();
                    return;
                }
                if (tL_error2 != null) {
                    lb0Var.c();
                    if (lb0Var.a()) {
                        lb0.d().g0(tL_error2, false);
                    }
                } else {
                    if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str.equals(tonconnectsession.dapp_client_id)) {
                        ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i16);
                                i16++;
                                TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f22288id && tonconnectrequest2.expires > ConnectionsManager.getInstance(lb0Var.f41236b).getCurrentTime()) {
                                    if (lb0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                        lb0Var.c();
                                        org.telegram.ui.Wallet.e2.o(lb0Var.f41235a, lb0Var.f41236b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new hb0(lb0Var, str3, 0));
                                    }
                                }
                            }
                        }
                    }
                    int i17 = this.f20530b;
                    if (i17 < 10) {
                        bi.sb sbVar = new bi.sb((Object) lb0Var, str, str2, str3, i17, 28);
                        lb0Var.f41240i = sbVar;
                        AndroidUtilities.runOnUIThread(sbVar, 500L);
                        return;
                    }
                    lb0Var.c();
                    if (lb0Var.a()) {
                        org.telegram.ui.Components.wc.c0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Context context = (Context) obj4;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj7;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj6;
                final Runnable runnable = (Runnable) obj5;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str4 = (String) obj2;
                if (a2Var == null) {
                    if (str4 != null) {
                        org.telegram.ui.Components.wc.c0(str4);
                        return;
                    }
                    return;
                }
                int i18 = a2Var.f36336c;
                TL_wallet.tonConnectSession tonconnectsession2 = a2Var.f36334a;
                String str5 = a2Var.e;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i15) {
                        l0Var2.f36808g.s(a2Var);
                        return;
                    }
                }
                if ("signData".equals(str5)) {
                    final org.telegram.ui.Wallet.e2 e2Var2 = org.telegram.ui.Wallet.l0.w(i15).f36808g;
                    try {
                        JSONObject jSONObject = new JSONObject(a2Var.f36341k);
                        boolean equals = "text".equals(jSONObject.optString("type"));
                        org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context, u6Var, new View[0]);
                        i2Var.s(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, u6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setGravity(16);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_close);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.G6, u6Var, PorterDuff.Mode.SRC_IN);
                        int i19 = org.telegram.ui.ActionBar.y6.f23446i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i19, u6Var), 1, -1);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
                        imageView.setBackground(g02);
                        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
                        imageView.setContentDescription(LocaleController.getString(R.string.Close));
                        imageView.setOnClickListener(new xd0(23, a2Var, i2Var));
                        linearLayout2.addView(imageView, gb1.t(48, 48, 0.0f, 16, 4, 0, 12, 0));
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                        y9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "44_44", null, tonconnectsession2.manifest);
                        }
                        linearLayout2.addView(y9Var, gb1.t(44, 44, 0.0f, 16, 0, 0, 12, 0));
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(1);
                        TextView t10 = org.telegram.ui.Wallet.e2.t(18, context, LocaleController.getString(R.string.WalletSignData), u6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        t10.setGravity(3);
                        linearLayout3.addView(t10, gb1.r(-1, -2));
                        TextView t11 = org.telegram.ui.Wallet.e2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), u6Var);
                        int i20 = org.telegram.ui.ActionBar.y6.f23765z6;
                        org.telegram.ui.ActionBar.f7.V(t11, i20, u6Var);
                        t11.setGravity(3);
                        t11.setSingleLine(true);
                        t11.setEllipsize(TextUtils.TruncateAt.END);
                        linearLayout3.addView(t11, gb1.r(-1, -2));
                        linearLayout2.addView(linearLayout3, gb1.q(1.0f, 0, -2, 0, 16, 0));
                        linearLayout.addView(linearLayout2, gb1.r(-1, 56));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(1);
                        linearLayout4.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                        int dp = AndroidUtilities.dp(16.0f);
                        int i21 = org.telegram.ui.ActionBar.y6.f23354d6;
                        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i21, u6Var));
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i21);
                        linearLayout4.setBackground(c02);
                        org.telegram.ui.ActionBar.f7.k(linearLayout4, c02, N2, null, u6Var);
                        if (equals) {
                            string = jSONObject.optString("text");
                        } else {
                            string = LocaleController.getString(R.string.WalletBinaryDataWarning);
                        }
                        TextView t12 = org.telegram.ui.Wallet.e2.t(equals ? 14 : 16, context, string, u6Var);
                        t12.setGravity(3);
                        t12.setTextIsSelectable(equals);
                        if (equals) {
                            TextView t13 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletSigningData), u6Var);
                            t13.setGravity(3);
                            t13.setTypeface(AndroidUtilities.bold());
                            org.telegram.ui.ActionBar.f7.V(t13, org.telegram.ui.ActionBar.y6.L6, u6Var);
                            linearLayout4.addView(t13, gb1.o(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                            t12.setTypeface(Typeface.MONOSPACE);
                            i12 = -1;
                            i13 = -2;
                        } else {
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setGravity(16);
                            TextView t14 = org.telegram.ui.Wallet.e2.t(12, context, "!", u6Var);
                            t14.setTypeface(AndroidUtilities.bold());
                            t14.setTextColor(-1);
                            int dp2 = AndroidUtilities.dp(8.0f);
                            int i22 = org.telegram.ui.ActionBar.y6.f23596q7;
                            ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i22, u6Var));
                            org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i22);
                            t14.setBackground(c03);
                            org.telegram.ui.ActionBar.f7.k(t14, c03, N3, null, u6Var);
                            linearLayout5.addView(t14, gb1.t(16, 16, 0.0f, 16, 0, 0, 6, 0));
                            TextView t15 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), u6Var);
                            t15.setGravity(3);
                            t15.setTypeface(AndroidUtilities.bold());
                            i12 = -1;
                            i13 = -2;
                            linearLayout5.addView(t15, gb1.r(-1, -2));
                            linearLayout4.addView(linearLayout5, gb1.o(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                        }
                        linearLayout4.addView(t12, gb1.r(i12, i13));
                        if (equals) {
                            t12.setOnClickListener(new org.telegram.ui.Wallet.m1(jSONObject, i2Var, u6Var, 0));
                        }
                        bx bxVar = new bx(context, 2);
                        bxVar.addView(linearLayout4);
                        linearLayout.addView(bxVar, gb1.o(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                        org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context);
                        h2Var.getContent().addView(linearLayout, gb1.g(-2.0f, -1));
                        i2Var.r(h2Var);
                        LinearLayout d = vh.d(context, 1);
                        if (equals) {
                            TextView t16 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), u6Var);
                            t16.setGravity(3);
                            org.telegram.ui.ActionBar.f7.V(t16, i20, u6Var);
                            d.addView(t16, gb1.o(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                        }
                        LinearLayout linearLayout6 = new LinearLayout(context);
                        linearLayout6.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        fi.d dVar = new fi.d(context, u6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(LocaleController.getString(R.string.Cancel));
                        fi.d dVar2 = new fi.d(context, u6Var, true);
                        dVar2.setRoundRadius(24);
                        dVar2.setText(LocaleController.getString(R.string.WalletSign));
                        dVar2.setEnabled(false);
                        linearLayout6.addView(dVar, gb1.q(1.0f, 0, 44, 0, 6, 0));
                        linearLayout6.addView(dVar2, gb1.q(1.0f, 0, 44, 6, 0, 0));
                        d.addView(linearLayout6);
                        i2Var.t(d);
                        i2Var.setDelegate(new org.telegram.ui.h0(a2Var, 2));
                        org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(bxVar, a2Var, dVar2, 2);
                        bxVar.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.n1(hVar, 0));
                        bxVar.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.o1(hVar, 0));
                        final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(dVar2, dVar, e2Var2, a2Var, i2Var, u6Var, hVar);
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
                        final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var, i2Var, 0);
                        a2Var.f36348r = new org.telegram.ui.Wallet.m(i2Var, 5);
                        i2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (r6) {
                                    case 0:
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread((y1) y1Var);
                                        e2Var2.s(a2Var);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread((y1) y1Var);
                                        e2Var2.s(a2Var);
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
                        AndroidUtilities.runOnUIThread(y1Var, Math.max(0L, i18 - e2Var2.f36506f.getCurrentTime()) * 1000);
                        return;
                    } catch (JSONException e) {
                        e2Var2.s(a2Var);
                        org.telegram.ui.Components.wc.c0(org.telegram.ui.Wallet.e2.h("display signing data", e));
                        return;
                    }
                }
                org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i15);
                org.telegram.ui.Wallet.e2 e2Var3 = w10.f36808g;
                org.telegram.ui.Wallet.d2 d2Var = a2Var.f36337f;
                boolean equals2 = "signMessage".equals(str5);
                final org.telegram.ui.Wallet.i2 i2Var2 = new org.telegram.ui.Wallet.i2(context, u6Var, new View[0]);
                i2Var2.s(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, u6Var));
                LinearLayout linearLayout7 = new LinearLayout(context);
                linearLayout7.setOrientation(1);
                org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                y9Var2.setRoundRadius(AndroidUtilities.dp(38.0f));
                TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                if (webDocument2 != null) {
                    e2Var = e2Var3;
                    z10 = equals2;
                    i10 = i15;
                    y9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                } else {
                    e2Var = e2Var3;
                    i10 = i15;
                    z10 = equals2;
                }
                linearLayout7.addView(y9Var2, gb1.x(76, 76, 1, 0, 24, 0, 0));
                TextView t17 = org.telegram.ui.Wallet.e2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), u6Var);
                t17.setTypeface(AndroidUtilities.bold());
                linearLayout7.addView(t17, gb1.o(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    linearLayout7.addView(org.telegram.ui.Wallet.e2.g(context, hostAuthority, u6Var), gb1.x(-2, -2, 1, 36, 6, 36, 12));
                }
                org.telegram.ui.Wallet.w5 w5Var = new org.telegram.ui.Wallet.w5(context, R.drawable.wallet_card_info, 24);
                w5Var.getCardHolderView().setMaxLines(2);
                w5Var.getCardHolderView().setSingleLine(false);
                List<org.telegram.ui.Wallet.c2> list = d2Var.f36453b;
                long j10 = d2Var.f36454c;
                w5Var.setCardHolder(org.telegram.ui.Wallet.w7.Y(((org.telegram.ui.Wallet.c2) list.get(0)).f36417a));
                org.telegram.ui.Components.s6 balanceView = w5Var.getBalanceView();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("GRAM");
                spannableString.setSpan(new zq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.n(-j10, true)).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                balanceView.setText(spannableStringBuilder);
                w5Var.getUsdBalanceView().setText(w10.l(j10, false));
                linearLayout7.addView(w5Var, gb1.r(-1, -2));
                w5Var.setCardOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (r2) {
                            case 0:
                                i2 i2Var3 = i2Var2;
                                fi.h1 h1Var = i2Var3.f36664b;
                                if (1 < i2Var3.f36665c.size() && 1 != h1Var.getCurrentPosition()) {
                                    for (View view2 : h1Var.getViewPages()) {
                                        if (view2 != null) {
                                            AndroidUtilities.hideKeyboard(view2);
                                        }
                                    }
                                    h1Var.E(1);
                                    return;
                                }
                                return;
                            default:
                                i2 i2Var4 = i2Var2;
                                fi.h1 h1Var2 = i2Var4.f36664b;
                                if (i2Var4.f36665c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                    for (View view3 : h1Var2.getViewPages()) {
                                        if (view3 != null) {
                                            AndroidUtilities.hideKeyboard(view3);
                                        }
                                    }
                                    h1Var2.E(0);
                                    return;
                                }
                                return;
                        }
                    }
                });
                org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(context);
                h2Var2.getContent().addView(linearLayout7, gb1.g(-2.0f, -1));
                i2Var2.r(h2Var2);
                LinearLayout d10 = vh.d(context, 1);
                LinearLayout d11 = vh.d(context, 0);
                d10.addView(d11, gb1.r(-1, 56));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.ic_ab_back);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                int i23 = org.telegram.ui.ActionBar.y6.f23446i6;
                org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i23, u6Var), 1, -1);
                org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i23);
                imageView2.setBackground(g03);
                org.telegram.ui.ActionBar.f7.k(imageView2, g03, null, N4, u6Var);
                int i24 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.t(imageView2, i24, u6Var, PorterDuff.Mode.SRC_IN);
                gb1.b(imageView2);
                d11.addView(imageView2, gb1.t(48, 48, 0.0f, 19, 4, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                y9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                if (webDocument3 != null) {
                    obj3 = null;
                    y9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                } else {
                    obj3 = null;
                }
                d11.addView(y9Var3, gb1.x(44, 44, 19, 12, 0, 11, 0));
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(1);
                d11.addView(linearLayout8, gb1.t(0, 44, 1.0f, 23, 0, 0, 12, 0));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.ActionBar.f7.V(textView, i24, u6Var);
                textView.setTextSize(1, 18.0f);
                linearLayout8.addView(textView, gb1.r(-1, -2));
                textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                if (TextUtils.isEmpty(hostAuthority)) {
                    i11 = 1;
                } else {
                    TextView textView2 = new TextView(context);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
                    i11 = 1;
                    textView2.setTextSize(1, 14.0f);
                    linearLayout8.addView(textView2, gb1.r(-1, -2));
                    textView2.setText(hostAuthority);
                }
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View[] viewPages;
                        View[] viewPages2;
                        switch (i11) {
                            case 0:
                                i2 i2Var3 = i2Var2;
                                fi.h1 h1Var = i2Var3.f36664b;
                                if (1 < i2Var3.f36665c.size() && 1 != h1Var.getCurrentPosition()) {
                                    for (View view2 : h1Var.getViewPages()) {
                                        if (view2 != null) {
                                            AndroidUtilities.hideKeyboard(view2);
                                        }
                                    }
                                    h1Var.E(1);
                                    return;
                                }
                                return;
                            default:
                                i2 i2Var4 = i2Var2;
                                fi.h1 h1Var2 = i2Var4.f36664b;
                                if (i2Var4.f36665c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                    for (View view3 : h1Var2.getViewPages()) {
                                        if (view3 != null) {
                                            AndroidUtilities.hideKeyboard(view3);
                                        }
                                    }
                                    h1Var2.E(0);
                                    return;
                                }
                                return;
                        }
                    }
                });
                LinearLayout linearLayout9 = new LinearLayout(context);
                linearLayout9.setOrientation(i11);
                LinearLayout D = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletPreview), u6Var);
                String A = org.telegram.ui.Wallet.e2.A(((org.telegram.ui.Wallet.c2) list.get(0)).f36417a);
                int i25 = R.drawable.mini_gram_24;
                SpannableStringBuilder r6 = org.telegram.ui.Wallet.l0.r(j10, i11);
                if (list.size() > i11) {
                    int i26 = R.string.WalletTransferToMultiple;
                    Integer valueOf = Integer.valueOf(list.size() - i11);
                    char c11 = i11;
                    c10 = 2;
                    Object[] objArr = new Object[2];
                    objArr[0] = A;
                    objArr[c11] = valueOf;
                    formatSpannable = LocaleController.formatSpannable(i26, objArr);
                } else {
                    c10 = 2;
                    int i27 = R.string.WalletTransferTo;
                    Object[] objArr2 = new Object[i11];
                    objArr2[0] = A;
                    formatSpannable = LocaleController.formatSpannable(i27, objArr2);
                }
                D.addView(org.telegram.ui.Wallet.e2.b(context, i25, r6, formatSpannable, null, null, u6Var), gb1.r(-1, -2));
                linearLayout9.addView(D, gb1.o(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                LinearLayout D2 = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletActions), u6Var);
                for (org.telegram.ui.Wallet.c2 c2Var : list) {
                    int i28 = R.drawable.mini_gram_24;
                    String string2 = LocaleController.getString((c2Var.f36418b == null || c2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                    CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.e2.A(c2Var.f36417a));
                    String n10 = org.telegram.ui.Wallet.l0.n(-c2Var.e, true);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                    int indexOf = n10.indexOf(46);
                    if (indexOf >= 0) {
                        l0Var = w10;
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                    } else {
                        l0Var = w10;
                    }
                    if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                        spannableStringBuilder2.append((CharSequence) " x");
                    }
                    zq zqVar = new zq(R.drawable.wallet_gram_small, 2);
                    zqVar.recolorDrawable = false;
                    zqVar.setSize(AndroidUtilities.dp(16.0f));
                    spannableStringBuilder2.setSpan(zqVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    D2.addView(org.telegram.ui.Wallet.e2.b(context, i28, string2, formatSpannable2, spannableStringBuilder2, c2Var.d, u6Var), gb1.r(-1, -2));
                    w10 = l0Var;
                }
                org.telegram.ui.Wallet.l0 l0Var3 = w10;
                linearLayout9.addView(D2, gb1.o(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                bx bxVar2 = new bx(context, 3);
                bxVar2.setFillViewport(false);
                bxVar2.addView(linearLayout9);
                d10.addView(bxVar2, gb1.r(-1, -2));
                org.telegram.ui.Wallet.h2 h2Var3 = new org.telegram.ui.Wallet.h2(context);
                h2Var3.getContent().addView(d10, gb1.g(-2.0f, -1));
                i2Var2.r(h2Var3);
                LinearLayout d12 = vh.d(context, 1);
                TextView t18 = org.telegram.ui.Wallet.e2.t(14, context, null, u6Var);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                spannableStringBuilder3.setSpan(new ea0(AndroidUtilities.dp(80.0f), t18), 0, spannableStringBuilder3.length(), 33);
                t18.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                t18.setVisibility(z10 ? 8 : 0);
                org.telegram.ui.ActionBar.f7.V(t18, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
                d12.addView(t18, gb1.o(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                LinearLayout linearLayout10 = new LinearLayout(context);
                linearLayout10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                fi.d dVar3 = new fi.d(context, u6Var, true);
                dVar3.setRoundRadius(24);
                dVar3.e();
                dVar3.setText(LocaleController.getString(R.string.WalletDecline));
                linearLayout10.addView(dVar3, gb1.q(1.0f, 0, 44, 0, 6, 0));
                fi.d f7 = vh.f(24, context, u6Var, true);
                f7.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                f7.setEnabled(false);
                linearLayout10.addView(f7, gb1.q(1.0f, 0, 44, 6, 0, 0));
                d12.addView(linearLayout10);
                i2Var2.t(d12);
                final boolean[] zArr2 = {false};
                boolean[] zArr3 = {false};
                final org.telegram.ui.Wallet.j1 j1Var = new org.telegram.ui.Wallet.j1(a2Var, zArr3, f7, dVar3, e2Var, i2Var2, zArr2, u6Var);
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
                final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr2, a2Var, i2Var2, 1);
                long j11 = i18;
                long j12 = d2Var.f36452a;
                if (j12 == 0) {
                    j12 = Long.MAX_VALUE;
                }
                a2Var.f36348r = new org.telegram.ui.Wallet.m(i2Var2, 5);
                final org.telegram.ui.Wallet.e2 e2Var4 = e2Var;
                i2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r6) {
                            case 0:
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread((y1) y1Var2);
                                e2Var4.s(a2Var);
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                    return;
                                }
                                return;
                            default:
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread((y1) y1Var2);
                                e2Var4.s(a2Var);
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
                AndroidUtilities.runOnUIThread(y1Var2, Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i10).getCurrentTime()) * 1000);
                li.c cVar2 = new li.c(zArr2, a2Var, zArr3, f7, z10, l0Var3, t18, i2Var2, u6Var);
                WalletEngine2 walletEngine2 = e2Var4.f36504b.f36805b;
                if (!a2Var.f36344n && !e2Var4.i(a2Var) && e2Var4.y(a2Var) && walletEngine2 != null) {
                    if ("signMessage".equals(str5)) {
                        walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.o(e2Var4, a2Var, cVar2, 1));
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var4, a2Var, cVar2, 9));
                        return;
                    }
                }
                cVar2.run(null, "Request expired, was processed, or the wallet changed");
                return;
            default:
                fi.d dVar4 = (fi.d) obj7;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj6;
                View view = (View) obj5;
                a8.me meVar = (a8.me) obj4;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.d3.t(k3Var.topBulletinContainer, k3Var.getResourcesProvider(), tL_error3, false);
                        return;
                    } else {
                        new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0("NO_TOKEN", false);
                        return;
                    }
                }
                Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                if (queryParameter == null) {
                    new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0("NO_TOKEN", false);
                    return;
                }
                int currentDatacenterId = ConnectionsManager.getInstance(i15).getCurrentDatacenterId();
                boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                StringBuilder n11 = c3.h0.n("wear-auth: sending /token account=", i15, " dcId=", currentDatacenterId, " isTest=");
                n11.append(isTestBackend);
                FileLog.d(n11.toString());
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] c12 = ii1.c(meVar, queryParameter, currentDatacenterId, isTestBackend);
                    com.google.android.gms.common.api.internal.s0 s0Var = new a6.a(applicationContext, com.google.android.gms.common.api.i.f6478c).h;
                    c8.e eVar = new c8.e(s0Var, (String) meVar.f616c, "/tg-wear-auth/token", c12);
                    s0Var.f6616b.d(0, eVar);
                    o6.l.n(eVar, z8.k0.f52742a).addOnSuccessListener(new zg1(5, meVar, dVar4)).addOnFailureListener(new gi1(dVar4, 1));
                    k3Var.dismiss();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0(e10.getMessage(), false);
                    return;
                }
        }
    }

    public kh(fi.d dVar, org.telegram.ui.ActionBar.k3 k3Var, int i10, View view, a8.me meVar) {
        this.f20529a = 4;
        this.f20531c = dVar;
        this.d = k3Var;
        this.f20530b = i10;
        this.e = view;
        this.f20532f = meVar;
    }

    public kh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f20529a = i11;
        this.f20531c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20532f = obj4;
        this.f20530b = i10;
    }

    public kh(LaunchActivity launchActivity, qf.c cVar, MessagesController messagesController, int i10, TLRPC.User user) {
        this.f20529a = 1;
        this.f20531c = launchActivity;
        this.d = cVar;
        this.e = messagesController;
        this.f20530b = i10;
        this.f20532f = user;
    }
}
