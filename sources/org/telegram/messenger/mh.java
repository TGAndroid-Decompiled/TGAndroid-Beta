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
import org.telegram.ui.bz0;
import org.telegram.ui.cs0;
import org.telegram.ui.ec0;
import org.telegram.ui.jc0;
import org.telegram.ui.tj1;
import org.telegram.ui.uj1;
public final class mh implements Utilities.Callback2 {
    public final int f17880a;
    public final int f17881b;
    public final Object f17882c;
    public final Object d;
    public final Object e;
    public final Object f17883f;

    public mh(Context context, int i10, org.telegram.ui.Wallet.j0 j0Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        this.f17880a = 2;
        this.f17883f = context;
        this.f17881b = i10;
        this.f17882c = j0Var;
        this.d = c6Var;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.m2 U;
        org.telegram.ui.Wallet.z1 z1Var;
        org.telegram.ui.Wallet.d2 d2Var;
        boolean z10;
        int i10;
        final int i11;
        char c10;
        CharSequence formatSpannable;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        org.telegram.ui.Wallet.j0 j0Var;
        String string;
        int i15;
        int i16;
        int i17;
        int i18 = this.f17880a;
        int i19 = this.f17881b;
        Object obj3 = this.f17883f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f17882c;
        switch (i18) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.a2) obj6, (Utilities.Callback2) obj5, (k0.b) obj4, (Context) obj3, this.f17881b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                jc0 jc0Var = (jc0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity = jc0Var.f37343a;
                jc0Var.h = -1;
                if (!jc0Var.f37349j && !launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                    if (tL_error != null) {
                        jc0Var.c();
                        if (jc0Var.a()) {
                            jc0.d().f0(tL_error, false);
                        }
                    } else {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i20);
                                    i20++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f19475id && tonconnectrequest2.expires > ConnectionsManager.getInstance(jc0Var.f37344b).getCurrentTime()) {
                                        if (jc0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                            jc0Var.c();
                                            org.telegram.ui.Wallet.d2.o(jc0Var.f37343a, jc0Var.f37344b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new ec0(jc0Var, str3, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.f17881b;
                        if (i21 < 10) {
                            fi.l3 l3Var = new fi.l3(jc0Var, str, str2, str3, i21, 27);
                            jc0Var.f37348i = l3Var;
                            AndroidUtilities.runOnUIThread(l3Var, 500L);
                            return;
                        }
                        jc0Var.c();
                        if (jc0Var.a()) {
                            org.telegram.ui.Components.zc.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                            return;
                        }
                        return;
                    }
                    return;
                }
                jc0Var.c();
                return;
            case 2:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) obj6;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                String str4 = (String) obj2;
                if (z1Var2 != null) {
                    int i22 = z1Var2.f33902c;
                    TL_wallet.tonConnectSession tonconnectsession2 = z1Var2.f33900a;
                    String str5 = z1Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.E1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i19) {
                            j0Var2.f33323g.s(z1Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str5)) {
                        final org.telegram.ui.Wallet.d2 d2Var2 = org.telegram.ui.Wallet.j0.v(i19).f33323g;
                        try {
                            JSONObject jSONObject = new JSONObject(z1Var2.f33907k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context, c6Var, new View[0]);
                            h2Var.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageResource(R.drawable.ic_ab_close);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
                            imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, -1));
                            imageView.setContentDescription(LocaleController.getString(R.string.Close));
                            imageView.setOnClickListener(new bz0(12, z1Var2, h2Var));
                            linearLayout2.addView(imageView, w7.a6.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                            z9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                z9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(z9Var, w7.a6.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView t10 = org.telegram.ui.Wallet.d2.t(18, context, LocaleController.getString(R.string.WalletSignData), c6Var);
                            t10.setTypeface(AndroidUtilities.bold());
                            t10.setGravity(3);
                            linearLayout3.addView(t10, w7.a6.n(-1, -2));
                            TextView t11 = org.telegram.ui.Wallet.d2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), c6Var);
                            int i23 = org.telegram.ui.ActionBar.g6.f20305z6;
                            t11.setTextColor(org.telegram.ui.ActionBar.g6.w0(i23, c6Var));
                            t11.setGravity(3);
                            t11.setSingleLine(true);
                            t11.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(t11, w7.a6.n(-1, -2));
                            linearLayout2.addView(linearLayout3, w7.a6.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, w7.a6.n(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                            linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var)));
                            if (equals) {
                                string = jSONObject.optString("text");
                            } else {
                                string = LocaleController.getString(R.string.WalletBinaryDataWarning);
                            }
                            if (equals) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            TextView t12 = org.telegram.ui.Wallet.d2.t(i15, context, string, c6Var);
                            t12.setGravity(3);
                            t12.setTextIsSelectable(equals);
                            if (equals) {
                                TextView t13 = org.telegram.ui.Wallet.d2.t(14, context, LocaleController.getString(R.string.WalletSigningData), c6Var);
                                t13.setGravity(3);
                                t13.setTypeface(AndroidUtilities.bold());
                                t13.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
                                linearLayout4.addView(t13, w7.a6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                t12.setTypeface(Typeface.MONOSPACE);
                                i16 = -1;
                                i17 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView t14 = org.telegram.ui.Wallet.d2.t(12, context, "!", c6Var);
                                t14.setTypeface(AndroidUtilities.bold());
                                t14.setTextColor(-1);
                                t14.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, c6Var)));
                                linearLayout5.addView(t14, w7.a6.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView t15 = org.telegram.ui.Wallet.d2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), c6Var);
                                t15.setGravity(3);
                                t15.setTypeface(AndroidUtilities.bold());
                                i16 = -1;
                                i17 = -2;
                                linearLayout5.addView(t15, w7.a6.n(-1, -2));
                                linearLayout4.addView(linearLayout5, w7.a6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(t12, w7.a6.n(i16, i17));
                            if (equals) {
                                t12.setOnClickListener(new org.telegram.ui.Wallet.l1(jSONObject, h2Var, c6Var, 0));
                            }
                            ay ayVar = new ay(context, 2);
                            ayVar.addView(linearLayout4);
                            linearLayout.addView(ayVar, w7.a6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.g2 g2Var = new org.telegram.ui.Wallet.g2(context);
                            g2Var.getContent().addView(linearLayout, w7.a6.d(-2.0f, -1));
                            h2Var.t(g2Var);
                            LinearLayout e = yh.e(context, 1);
                            if (equals) {
                                TextView t16 = org.telegram.ui.Wallet.d2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), c6Var);
                                t16.setGravity(3);
                                t16.setTextColor(org.telegram.ui.ActionBar.g6.w0(i23, c6Var));
                                e.addView(t16, w7.a6.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
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
                            linearLayout6.addView(dVar, w7.a6.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(dVar2, w7.a6.m(1.0f, 0, 44, 6, 0, 0));
                            e.addView(linearLayout6);
                            h2Var.v(e);
                            h2Var.setDelegate(new org.telegram.ui.i0(z1Var2, 2));
                            org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(ayVar, z1Var2, dVar2, 2);
                            ayVar.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.m1(kVar, 0));
                            ayVar.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.n1(kVar, 0));
                            final org.telegram.ui.Wallet.o1 o1Var = new org.telegram.ui.Wallet.o1(dVar2, dVar, d2Var2, z1Var2, h2Var, c6Var, kVar);
                            dVar2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            o1Var.run(Boolean.FALSE);
                                            return;
                                        default:
                                            o1Var.run(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            dVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            o1Var.run(Boolean.FALSE);
                                            return;
                                        default:
                                            o1Var.run(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final org.telegram.ui.Wallet.x1 x1Var = new org.telegram.ui.Wallet.x1(zArr, z1Var2, h2Var, 0);
                            z1Var2.f33914r = new org.telegram.ui.Wallet.m(h2Var, 4);
                            h2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r6) {
                                        case 0:
                                            zArr[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread((x1) x1Var);
                                            d2Var2.s(z1Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread((x1) x1Var);
                                            d2Var2.s(z1Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            h2Var.show();
                            AndroidUtilities.runOnUIThread(x1Var, Math.max(0L, i22 - d2Var2.f33043f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e7) {
                            d2Var2.s(z1Var2);
                            org.telegram.ui.Components.zc.b0(org.telegram.ui.Wallet.d2.h("display signing data", e7));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i19);
                    org.telegram.ui.Wallet.d2 d2Var3 = v.f33323g;
                    org.telegram.ui.Wallet.c2 c2Var = z1Var2.f33903f;
                    boolean equals2 = "signMessage".equals(str5);
                    final org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(context, c6Var, new View[0]);
                    h2Var2.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(context);
                    z9Var2.setRoundRadius(AndroidUtilities.dp(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z10 = equals2;
                        z9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z10 = equals2;
                    }
                    linearLayout7.addView(z9Var2, w7.a6.t(76, 76, 1, 0, 24, 0, 0));
                    if (z10) {
                        i10 = R.string.WalletAppRequestsSignature;
                    } else {
                        i10 = R.string.WalletAppRequestsTransfer;
                    }
                    TextView t17 = org.telegram.ui.Wallet.d2.t(20, context, LocaleController.formatSpannable(i10, tonconnectsession2.manifest.name), c6Var);
                    t17.setTypeface(AndroidUtilities.bold());
                    linearLayout7.addView(t17, w7.a6.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                    if (!TextUtils.isEmpty(hostAuthority)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.d2.g(context, hostAuthority, c6Var), w7.a6.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.h5 h5Var = new org.telegram.ui.Wallet.h5(R.drawable.wallet_card_info, 24, context, false);
                    h5Var.setEngravingBitmap(null);
                    h5Var.getCardHolderView().setMaxLines(2);
                    h5Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.b2> list = c2Var.f33004b;
                    long j10 = c2Var.f33005c;
                    h5Var.setCardHolder(org.telegram.ui.Wallet.z6.X(((org.telegram.ui.Wallet.b2) list.get(0)).f32953a));
                    org.telegram.ui.Components.s6 balanceView = h5Var.getBalanceView();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableString spannableString = new SpannableString("GRAM");
                    spannableString.setSpan(new br(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.j0.n(-j10, true)).append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                    balanceView.setText(spannableStringBuilder);
                    h5Var.getUsdBalanceView().setText(v.l(j10, false));
                    linearLayout7.addView(h5Var, w7.a6.n(-1, -2));
                    h5Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    h2 h2Var3 = h2Var2;
                                    di.h1 h1Var = h2Var3.f33225b;
                                    if (1 < h2Var3.f33226c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                    h2 h2Var4 = h2Var2;
                                    di.h1 h1Var2 = h2Var4.f33225b;
                                    if (h2Var4.f33226c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                    org.telegram.ui.Wallet.g2 g2Var2 = new org.telegram.ui.Wallet.g2(context);
                    g2Var2.getContent().addView(linearLayout7, w7.a6.d(-2.0f, -1));
                    h2Var2.t(g2Var2);
                    LinearLayout e10 = yh.e(context, 1);
                    LinearLayout e11 = yh.e(context, 0);
                    e10.addView(e11, w7.a6.n(-1, 56));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.ic_ab_back);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, -1));
                    int i24 = org.telegram.ui.ActionBar.g6.G6;
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i24, c6Var), PorterDuff.Mode.SRC_IN));
                    w7.c6.a(imageView2);
                    e11.addView(imageView2, w7.a6.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.z9 z9Var3 = new org.telegram.ui.Components.z9(context);
                    z9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        z9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    }
                    e11.addView(z9Var3, w7.a6.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    e11.addView(linearLayout8, w7.a6.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i24, c6Var));
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, w7.a6.n(-1, -2));
                    textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                    if (!TextUtils.isEmpty(hostAuthority)) {
                        TextView textView2 = new TextView(context);
                        i11 = 1;
                        yh.n(org.telegram.ui.ActionBar.g6.f20305z6, c6Var, textView2, 1, 14.0f);
                        linearLayout8.addView(textView2, w7.a6.n(-1, -2));
                        textView2.setText(hostAuthority);
                    } else {
                        i11 = 1;
                    }
                    imageView2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (i11) {
                                case 0:
                                    h2 h2Var3 = h2Var2;
                                    di.h1 h1Var = h2Var3.f33225b;
                                    if (1 < h2Var3.f33226c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                    h2 h2Var4 = h2Var2;
                                    di.h1 h1Var2 = h2Var4.f33225b;
                                    if (h2Var4.f33226c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                    linearLayout9.setOrientation(i11);
                    LinearLayout D = org.telegram.ui.Wallet.d2.D(context, LocaleController.getString(R.string.WalletPreview), c6Var);
                    String A = org.telegram.ui.Wallet.d2.A(((org.telegram.ui.Wallet.b2) list.get(0)).f32953a);
                    int i25 = R.drawable.mini_gram_24;
                    SpannableStringBuilder q6 = org.telegram.ui.Wallet.j0.q(j10, i11);
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
                    org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    D.addView(org.telegram.ui.Wallet.d2.b(context, i25, q6, formatSpannable, null, null, c6Var), w7.a6.n(-1, -2));
                    linearLayout9.addView(D, w7.a6.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout D2 = org.telegram.ui.Wallet.d2.D(context, LocaleController.getString(R.string.WalletActions), c6Var2);
                    for (org.telegram.ui.Wallet.b2 b2Var : list) {
                        int i28 = R.drawable.mini_gram_24;
                        if (b2Var.f32954b != null && b2Var.d == null) {
                            i14 = R.string.WalletContractCall;
                        } else {
                            i14 = R.string.WalletTransfer;
                        }
                        String string2 = LocaleController.getString(i14);
                        CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.d2.A(b2Var.f32953a));
                        String n10 = org.telegram.ui.Wallet.j0.n(-b2Var.e, true);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                        int indexOf = n10.indexOf(46);
                        if (indexOf >= 0) {
                            charSequence = formatSpannable2;
                            j0Var = v;
                            spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                        } else {
                            charSequence = formatSpannable2;
                            j0Var = v;
                        }
                        if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                            spannableStringBuilder2.append((CharSequence) " x");
                        }
                        br brVar = new br(R.drawable.wallet_gram_small, 2);
                        brVar.recolorDrawable = false;
                        brVar.setSize(AndroidUtilities.dp(16.0f));
                        spannableStringBuilder2.setSpan(brVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                        D2.addView(org.telegram.ui.Wallet.d2.b(context, i28, string2, charSequence, spannableStringBuilder2, b2Var.d, c6Var3), w7.a6.n(-1, -2));
                        c6Var2 = c6Var3;
                        v = j0Var;
                    }
                    org.telegram.ui.Wallet.j0 j0Var3 = v;
                    org.telegram.ui.ActionBar.c6 c6Var4 = c6Var2;
                    linearLayout9.addView(D2, w7.a6.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    ay ayVar2 = new ay(context, 3);
                    ayVar2.setFillViewport(false);
                    ayVar2.addView(linearLayout9);
                    e10.addView(ayVar2, w7.a6.n(-1, -2));
                    org.telegram.ui.Wallet.g2 g2Var3 = new org.telegram.ui.Wallet.g2(context);
                    g2Var3.getContent().addView(e10, w7.a6.d(-2.0f, -1));
                    h2Var2.t(g2Var3);
                    LinearLayout e12 = yh.e(context, 1);
                    TextView t18 = org.telegram.ui.Wallet.d2.t(14, context, null, c6Var4);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                    spannableStringBuilder3.setSpan(new ia0(AndroidUtilities.dp(80.0f), t18), 0, spannableStringBuilder3.length(), 33);
                    t18.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                    if (z10) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    t18.setVisibility(i12);
                    t18.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var4));
                    e12.addView(t18, w7.a6.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    di.d dVar3 = new di.d(context, c6Var4, true);
                    dVar3.setRoundRadius(24);
                    dVar3.d();
                    dVar3.setText(LocaleController.getString(R.string.WalletDecline));
                    linearLayout10.addView(dVar3, w7.a6.m(1.0f, 0, 44, 0, 6, 0));
                    di.d f7 = yh.f(24, context, c6Var4, true);
                    if (z10) {
                        i13 = R.string.WalletSign;
                    } else {
                        i13 = R.string.WalletConfirm;
                    }
                    f7.setText(LocaleController.getString(i13));
                    f7.setEnabled(false);
                    linearLayout10.addView(f7, w7.a6.m(1.0f, 0, 44, 6, 0, 0));
                    e12.addView(linearLayout10);
                    h2Var2.v(e12);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.z1 z1Var3 = z1Var;
                    final org.telegram.ui.Wallet.d2 d2Var4 = d2Var;
                    final org.telegram.ui.Wallet.i1 i1Var = new org.telegram.ui.Wallet.i1(z1Var3, zArr3, f7, dVar3, d2Var4, h2Var2, zArr2, c6Var4);
                    f7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i1Var.run(Boolean.FALSE);
                                    return;
                                default:
                                    i1Var.run(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    dVar3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i1Var.run(Boolean.FALSE);
                                    return;
                                default:
                                    i1Var.run(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.x1 x1Var2 = new org.telegram.ui.Wallet.x1(zArr2, z1Var3, h2Var2, 1);
                    long j11 = i22;
                    long j12 = c2Var.f33003a;
                    if (j12 == 0) {
                        j12 = Long.MAX_VALUE;
                    }
                    z1Var3.f33914r = new org.telegram.ui.Wallet.m(h2Var2, 4);
                    h2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (r6) {
                                case 0:
                                    zArr2[0] = true;
                                    AndroidUtilities.cancelRunOnUIThread((x1) x1Var2);
                                    d2Var4.s(z1Var3);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr2[0] = true;
                                    AndroidUtilities.cancelRunOnUIThread((x1) x1Var2);
                                    d2Var4.s(z1Var3);
                                    Runnable runnable3 = runnable;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    h2Var2.show();
                    AndroidUtilities.runOnUIThread(x1Var2, Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i19).getCurrentTime()) * 1000);
                    ji.c cVar = new ji.c(zArr2, z1Var3, zArr3, f7, z10, j0Var3, t18, h2Var2, c6Var4);
                    WalletEngine2 walletEngine2 = d2Var4.f33041b.f33320b;
                    if (!z1Var3.f33910n && !d2Var4.i(z1Var3) && d2Var4.y(z1Var3) && walletEngine2 != null) {
                        if ("signMessage".equals(str5)) {
                            walletEngine2.previewSignMessage(c2Var, new org.telegram.ui.Wallet.o(d2Var4, z1Var3, cVar, 1));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.i(d2Var4, z1Var3, cVar, 9));
                            return;
                        }
                    }
                    cVar.run(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str4 != null) {
                    org.telegram.ui.Components.zc.b0(str4);
                    return;
                } else {
                    return;
                }
            default:
                di.d dVar4 = (di.d) obj6;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                View view = (View) obj4;
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i19).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    StringBuilder l4 = i2.d.l("wear-auth: sending /token account=", i19, " dcId=", currentDatacenterId, " isTest=");
                    l4.append(isTestBackend);
                    FileLog.d(l4.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c12 = uj1.c(z5Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f4897c).h;
                        b8.e eVar = new b8.e(t0Var, (String) z5Var.f5425a, "/tg-wear-auth/token", c12);
                        t0Var.f5040b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f48628a).addOnSuccessListener(new cs0(28, z5Var, dVar4)).addOnFailureListener(new tj1(dVar4, 1));
                        e3Var.dismiss();
                        return;
                    } catch (Exception e13) {
                        FileLog.e(e13);
                        new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0(e13.getMessage(), false);
                        return;
                    }
                } else if (tL_error2 != null) {
                    org.telegram.ui.Cells.d0.r(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error2, false);
                    return;
                } else {
                    new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public mh(di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, com.google.android.gms.internal.cast.z5 z5Var) {
        this.f17880a = 3;
        this.f17882c = dVar;
        this.d = e3Var;
        this.f17881b = i10;
        this.e = view;
        this.f17883f = z5Var;
    }

    public mh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f17880a = i11;
        this.f17882c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17883f = obj4;
        this.f17881b = i10;
    }
}
