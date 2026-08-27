package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;

public final class o0 extends org.telegram.ui.Components.qa {

    public static final int[] f9796s0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final b T;
    public final TL_stars.TL_starGiftUnique U;
    public final String V;
    public final long W;
    public final a40 X;
    public final jc0 Y;
    public final EditTextBoldCursor Z;

    public final TextView f9797a0;

    public final m0 f9798b0;

    public final TextView f9799c0;

    public final lh.d f9800d0;

    public final org.telegram.ui.Components.j6 f9801e0;

    public final ImageView f9802f0;

    public final ImageView f9803g0;

    public final ga.c f9804h0;

    public hf.a f9805i0;

    public int f9806j0;

    public int f9807k0;

    public boolean f9808l0;
    public final v1 m0;

    public final cq[] f9809n0;

    public final cq[] f9810o0;

    public boolean f9811p0;

    public b51 f9812q0;

    public final n41 f9813r0;

    public o0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.c6 c6Var, v1 v1Var) {
        TLRPC.User user;
        super(context, null, true, false, false, false, false, 2, c6Var);
        ga.c cVar = new ga.c(16);
        g5.b[] bVarArr = (g5.b[]) cVar.f6834b;
        this.f9804h0 = cVar;
        this.f9809n0 = new cq[1];
        this.f9810o0 = new cq[1];
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.W = j10;
        this.U = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.V = i0.a.m(tL_starGiftUnique.num, ',', sb2);
        this.m0 = v1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean zJ = u7.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        hf.b bVar = hf.b.f8921a;
        hf.a aVarG = hf.a.g(j11, bVar);
        hf.a aVarG2 = hf.a.g(Math.max(aVarG.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        hf.b bVar2 = hf.b.f8922b;
        hf.a aVarI = hf.a.i(Math.max(aVarG.e(bVar2).n(2).f8920b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        hf.a aVarI2 = hf.a.i(Math.max(aVarI.f8920b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        hf.b bVar3 = aVarG.f8919a;
        if (bVar3 == aVarG2.f8919a) {
            bVarArr[bVar3.ordinal()] = new g5.b(5, aVarG, aVarG2);
        }
        hf.b bVar4 = aVarI.f8919a;
        if (bVar4 == aVarI2.f8919a) {
            bVarArr[bVar4.ordinal()] = new g5.b(5, aVarI, aVarI2);
        }
        b bVar5 = new b(context, i10, c6Var);
        this.T = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(false);
        bVar5.setClickable(false);
        this.container.addView(bVar5, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        h7.b6.a(bVar5);
        bVar5.setOnClickListener(new gg.f(this, context, c6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.Z = editTextBoldCursor;
        if (zJ) {
            a40 a40Var = new a40(context, c6Var);
            this.X = a40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            a40Var.b(arrayList, new k0(this, 0));
            linearLayout.addView(a40Var, h7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.X = null;
        }
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayout.addView(linearLayoutG, h7.z5.l(1.0f, -1, -2));
        jc0 jc0Var = new jc0(context, null);
        this.Y = jc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        jc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        jc0Var.e(editTextBoldCursor);
        jc0Var.b(1.0f, 0.0f, false);
        jc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 1));
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        linearLayoutG.addView(jc0Var, h7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f9802f0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        jc0Var.addView(imageView, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9803g0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        jc0Var.addView(imageView2, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f9801e0 = j6Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        jc0Var.addView(j6Var, h7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9797a0 = textView;
        textView.setTextSize(1, 13.0f);
        linearLayoutG.addView(textView, h7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        m0 m0Var = new m0(context);
        this.f9798b0 = m0Var;
        m0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        m0Var.setCursorWidth(1.5f);
        m0Var.setTextSize(1, 17.0f);
        m0Var.setMaxLines(1);
        m0Var.setBackground(null);
        m0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        m0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        m0Var.setFocusable(false);
        m0Var.setClickable(false);
        m0Var.setEnabled(false);
        jc0 jc0Var2 = new jc0(context, null);
        jc0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        jc0Var2.e(m0Var);
        jc0Var2.addView(m0Var, h7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        h7.b6.b(jc0Var2, 0.02f, 1.2f);
        jc0Var2.setOnClickListener(new ag.q0(14, this, context));
        linearLayoutG.addView(jc0Var2, h7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, c6Var), PorterDuff.Mode.SRC_IN));
        jc0Var2.addView(imageView3, h7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9799c0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView2.setTextSize(1, 13.0f);
        linearLayoutG.addView(textView2, h7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.f9800d0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                o0.Q(this.f9633a, i10, context, c6Var, j10);
            }
        });
        U(hf.a.i(0L, bVar), false, true, false);
        if (this.f9806j0 != 86400) {
            this.f9806j0 = 86400;
            m0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new n0(this));
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i13 = layoutParamsD.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i13 + i14;
        layoutParamsD.rightMargin += i14;
        this.containerView.addView(dVar, layoutParamsD);
        zk0 zk0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f9813r0 = n41.k(linearLayout);
        this.f9812q0.N(false);
    }

    public static void P(o0 o0Var, long j10, boolean z10, hf.a aVar, long j11, org.telegram.ui.ActionBar.b2 b2Var) {
        if (j10 > 0) {
            int i10 = o0Var.currentAccount;
            hf.b bVar = hf.b.f8921a;
            u7 u7VarX = u7.x(i10, bVar);
            hf.a aVarL = u7VarX.f10154e ? hf.a.l(u7VarX.p()) : null;
            hf.a aVarG = z10 ? hf.a.g(j10, bVar) : hf.a.i(o0Var.f9805i0.f8920b + aVar.f8920b, bVar);
            if (aVarL == null || aVarL.f8920b < aVarG.f8920b) {
                new ea(o0Var.getContext(), o0Var.resourcesProvider, aVarG.a(), 14, null, null, o0Var.W).show();
                return;
            }
        }
        we.d dVarG = b2Var.g(-1, true, true);
        dVarG.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = o0Var.f9805i0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(o0Var.currentAccount).getInputPeer(o0Var.W);
        tL_sendStarGiftOffer.duration = o0Var.f9806j0;
        tL_sendStarGiftOffer.slug = o0Var.U.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(o0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new gh.d0(o0Var, dVarG, b2Var, 2));
    }

    public static void Q(final o0 o0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10) {
        ?? r14;
        if (o0Var.f9800d0.S) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            u7 u7VarX = u7.x(i10, o0Var.f9805i0.f8919a);
            hf.a aVarL = u7VarX.f10154e ? hf.a.l(u7VarX.p()) : null;
            hf.b bVar = hf.b.f8921a;
            hf.b bVar2 = hf.b.f8922b;
            if (aVarL != null) {
                long j11 = aVarL.f8920b;
                hf.a aVar = o0Var.f9805i0;
                if (j11 >= aVar.f8920b) {
                    String str = o0Var.V;
                    long j12 = o0Var.W;
                    String strD = aVar.d();
                    boolean z10 = o0Var.f9805i0.f8919a == bVar2;
                    LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(o0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
                    rl.w(i11, o0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, h7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(o0Var.getContext());
                    rl.l(i11, o0Var.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(o0Var.f9805i0.f8919a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, strD, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, strD, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, h7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    yy0 yy0Var = new yy0(o0Var.getContext(), o0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(o0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final hf.a aVarG = hf.a.g(sendPaidMessagesStars, bVar);
                    yy0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), oa.X0(z10, LocaleController.formatString(R.string.GiftOfferAmount, strD), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        yy0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), oa.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, aVarG.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    yy0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", o0Var.f9806j0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(yy0Var, h7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(o0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars != 0) {
                        if (z10) {
                            spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, oa.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, strD), true), oa.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, aVarG.d()))));
                        } else {
                            spannableStringBuilder.append((CharSequence) oa.Q0(LocaleController.formatString(R.string.GiftOfferPay, hf.a.i(o0Var.f9805i0.f8920b + aVarG.f8920b, bVar).d())));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o0Var.getContext(), 0, o0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z11 = z10;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                                o0.P(this.f9432a, sendPaidMessagesStars, z11, aVarG, nextRandomId, b2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.T0 = true;
                        b2Var.show();
                        return;
                    }
                    spannableStringBuilder.append((CharSequence) oa.S0(LocaleController.formatString(R.string.GiftOfferPay, strD), z10));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o0Var.getContext(), 0, o0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z12 = z10;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i12) {
                            o0.P(this.f9432a, sendPaidMessagesStars, z12, aVarG, nextRandomId, b2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                    b2Var2.T0 = true;
                    b2Var2.show();
                    return;
                }
            }
            hf.a aVar2 = o0Var.f9805i0;
            hf.b bVar3 = aVar2.f8919a;
            if (bVar3 == bVar) {
                new ea(context, c6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new mh.f(context, c6Var, aVar2, true, null).show();
            }
        }
    }

    public static void R(o0 o0Var, we.d dVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(o0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new cg.k0((Object) o0Var, (Object) dVar, (Object) b2Var, (Object) updates, tL_error, 5));
    }

    public final void S() {
        boolean z10 = this.f9811p0;
        b bVar = this.T;
        boolean z11 = (z10 && !isDismissed() && bVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.X == null;
        if (this.f9808l0 != z11) {
            this.f9808l0 = z11;
            if (bVar != null) {
                bVar.setEnabled(z11);
                bVar.setClickable(z11);
                bVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11 = this.f9807k0 == 0 && this.f9805i0.f8920b > 0;
        lh.d dVar = this.f9800d0;
        if (dVar.S != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                dVar.animate().alpha(z11 ? 1.0f : 0.6f).setDuration(180L).start();
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    public final void U(hf.a aVar, boolean z10, boolean z11, boolean z12) {
        char c10;
        hf.b bVar;
        hf.a aVar2 = this.f9805i0;
        int i10 = this.f9807k0;
        this.f9807k0 = 0;
        if (aVar != null) {
            this.f9805i0 = aVar;
        } else {
            this.f9805i0 = hf.a.i(0L, aVar2.f8919a);
            this.f9807k0 |= 1;
        }
        hf.b bVar2 = this.f9805i0.f8919a;
        ga.c cVar = this.f9804h0;
        g5.b[] bVarArr = (g5.b[]) cVar.f6834b;
        g5.b[] bVarArr2 = (g5.b[]) cVar.f6834b;
        long j10 = ((hf.a) bVarArr[bVar2.ordinal()].f6390c).f8920b;
        hf.a aVar3 = this.f9805i0;
        if (j10 < aVar3.f8920b) {
            this.f9807k0 |= 4;
        }
        if (!aVar3.k() && ((hf.a) bVarArr2[this.f9805i0.f8919a.ordinal()].f6389b).f8920b > this.f9805i0.f8920b) {
            this.f9807k0 |= 2;
        }
        boolean z13 = z11 || aVar2.f8919a != this.f9805i0.f8919a;
        boolean z14 = z11 || aVar2.f8920b != this.f9805i0.f8920b;
        boolean z15 = z11 || i10 != this.f9807k0;
        hf.b bVar3 = hf.b.f8921a;
        EditTextBoldCursor editTextBoldCursor = this.Z;
        hf.b bVar4 = hf.b.f8922b;
        if (z13) {
            a40 a40Var = this.X;
            if (a40Var != null) {
                a40Var.a(this.f9805i0.f8919a == bVar3 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.W);
            hf.b bVar5 = this.f9805i0.f8919a;
            TextView textView = this.f9799c0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((hf.a) bVarArr2[this.f9805i0.f8919a.ordinal()].f6390c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((hf.a) bVarArr2[this.f9805i0.f8919a.ordinal()].f6390c).a()).length() + 3)});
            }
            ImageView imageView = this.f9803g0;
            ImageView imageView2 = this.f9802f0;
            if (z12) {
                c10 = 0;
                imageView2.animate().alpha(this.f9805i0.f8919a == bVar3 ? 1.0f : 0.0f).scaleX(this.f9805i0.f8919a == bVar3 ? 1.0f : 0.0f).scaleY(this.f9805i0.f8919a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.f9805i0.f8919a == bVar4 ? 1.0f : 0.0f).scaleX(this.f9805i0.f8919a == bVar4 ? 1.0f : 0.0f).scaleY(this.f9805i0.f8919a == bVar4 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                c10 = 0;
                imageView2.setAlpha(this.f9805i0.f8919a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.f9805i0.f8919a == bVar4 ? 1.0f : 0.0f);
            }
            b bVar6 = this.T;
            if (bVar6 != null && bVar6.f8981e != (bVar = this.f9805i0.f8919a)) {
                bVar6.f8981e = bVar;
                bVar6.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            this.Y.setText(LocaleController.getString(this.f9805i0.f8919a == bVar3 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            hf.b bVar7 = this.f9805i0.f8919a;
            int i11 = this.f9807k0;
            int i12 = i11 & 4;
            String str = this.V;
            TextView textView2 = this.f9797a0;
            if (i12 != 0) {
                int i13 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String strD = ((hf.a) bVarArr2[bVar7.ordinal()].f6390c).d();
                Object[] objArr = new Object[2];
                objArr[c10] = strD;
                objArr[1] = str;
                rl.n(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String strD2 = ((hf.a) bVarArr2[bVar7.ordinal()].f6389b).d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = strD2;
                objArr2[1] = str;
                rl.n(i14, objArr2, textView2);
            } else {
                int i15 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                rl.n(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.f9807k0 & (-9)) == 0 ? org.telegram.ui.ActionBar.g6.f23423y6 : org.telegram.ui.ActionBar.g6.f23284q7));
        }
        if (z13 || z14 || z15) {
            hf.a aVar4 = this.f9805i0;
            boolean z16 = aVar4.f8919a == bVar4;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[c10] = z16 ? aVar4.b() : LocaleController.formatNumber(aVar4.a(), ',');
            this.f9800d0.g(oa.V0(z16, LocaleController.formatString(i16, objArr4), z16 ? this.f9810o0 : this.f9809n0), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.f9805i0.c() * (this.f9805i0.f8919a == bVar4 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d) * 100.0d), "USD", 2));
            this.f9801e0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String strB = this.f9805i0.b();
            editTextBoldCursor.setText(strB);
            editTextBoldCursor.setSelection(strB.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (!this.f9808l0 || (bVar = this.T) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        S();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f9811p0 = true;
        S();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f2.r(this, 18), 50L);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 15), this.resourcesProvider);
        this.f9812q0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
