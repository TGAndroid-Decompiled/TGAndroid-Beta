package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
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
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.yq;
public final class b1 extends org.telegram.ui.Components.bb {
    public static final int[] f996w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final c X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long f997a0;
    public final u40 f998b0;
    public final sd0 f999c0;
    public final EditTextBoldCursor f1000d0;
    public final TextView f1001e0;
    public final z0 f1002f0;
    public final TextView f1003g0;
    public final ei.d f1004h0;
    public final org.telegram.ui.Components.q6 f1005i0;
    public final ImageView f1006j0;
    public final ImageView f1007k0;
    public final ag.b f1008l0;
    public ag.a m0;
    public int f1009n0;
    public int f1010o0;
    public boolean f1011p0;
    public final b2 f1012q0;
    public final yq[] f1013r0;
    public final yq[] f1014s0;
    public boolean f1015t0;
    public s61 f1016u0;
    public final f61 f1017v0;

    public b1(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.d6 d6Var, b2 b2Var) {
        super(context, null, true, false, 2, d6Var);
        TLRPC.User user;
        ag.b bVar = new ag.b(0);
        n4.s[] sVarArr = (n4.s[]) bVar.f634b;
        this.f1008l0 = bVar;
        this.f1013r0 = new yq[1];
        this.f1014s0 = new yq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f997a0 = j10;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        this.f1012q0 = b2Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = ga.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        ag.c cVar = ag.c.f635a;
        ag.a g10 = ag.a.g(j12, cVar);
        ag.a g11 = ag.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), cVar);
        ag.c cVar2 = ag.c.f636b;
        ag.a i11 = ag.a.i(Math.max(g10.e(cVar2).n(2).f632b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), cVar2);
        ag.a i12 = ag.a.i(Math.max(i11.f632b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), cVar2);
        ag.c cVar3 = g10.f631a;
        if (cVar3 == g11.f631a) {
            sVarArr[cVar3.ordinal()] = new n4.s(4, g10, g11);
        }
        ag.c cVar4 = i11.f631a;
        if (cVar4 == i12.f631a) {
            sVarArr[cVar4.ordinal()] = new n4.s(4, i11, i12);
        }
        c cVar5 = new c(context, i10, d6Var);
        this.X = cVar5;
        cVar5.setScaleX(0.6f);
        cVar5.setScaleY(0.6f);
        cVar5.setAlpha(0.0f);
        cVar5.setEnabled(false);
        cVar5.setClickable(false);
        this.container.addView(cVar5, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(cVar5);
        cVar5.setOnClickListener(new v0(this, context, d6Var, 0));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f1000d0 = editTextBoldCursor;
        if (j11) {
            u40 u40Var = new u40(context, d6Var);
            this.f998b0 = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            u40Var.b(arrayList, new w0(this, 0));
            linearLayout.addView(u40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f998b0 = null;
        }
        LinearLayout e = lk.e(context, 1);
        linearLayout.addView(e, w7.z5.l(1.0f, -1, -2));
        sd0 sd0Var = new sd0(context, null);
        this.f999c0 = sd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        sd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        sd0Var.e(editTextBoldCursor);
        sd0Var.b(1.0f, 0.0f, false);
        sd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 2));
        sd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e.addView(sd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f1006j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        sd0Var.addView(imageView, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f1007k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        sd0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.f1005i0 = q6Var;
        int i14 = org.telegram.ui.ActionBar.h6.f21374y6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setGravity(5);
        sd0Var.addView(q6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f1001e0 = textView;
        textView.setTextSize(1, 13.0f);
        e.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f1002f0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        sd0 sd0Var2 = new sd0(context, null);
        sd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        sd0Var2.e(editTextBoldCursor2);
        sd0Var2.addView((View) editTextBoldCursor2, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(sd0Var2, 0.02f, 1.2f);
        sd0Var2.setOnClickListener(new p(1, this, context));
        e.addView(sd0Var2, w7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, d6Var), PorterDuff.Mode.SRC_IN));
        sd0Var2.addView(imageView3, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1003g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ei.d dVar = new ei.d(context, d6Var, true);
        this.f1004h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                b1.R(b1.this, i10, context, d6Var, j10);
            }
        });
        V(ag.a.i(0L, cVar), false, true, false);
        if (this.f1009n0 != 86400) {
            this.f1009n0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        U(false);
        editTextBoldCursor.addTextChangedListener(new a1(this));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        im0 im0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        im0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f1017v0 = f61.k(linearLayout);
        this.f1016u0.N(false);
    }

    public static void Q(b1 b1Var, long j10, boolean z10, ag.a aVar, long j11, org.telegram.ui.ActionBar.b2 b2Var) {
        ag.a aVar2;
        ag.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = b1Var.currentAccount;
            ag.c cVar = ag.c.f635a;
            ga x10 = ga.x(i12, cVar);
            if (x10.e) {
                aVar2 = ag.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = ag.a.g(j10, cVar);
            } else {
                i10 = ag.a.i(b1Var.m0.f632b + aVar.f632b, cVar);
            }
            if (aVar2 == null || aVar2.f632b < i10.f632b) {
                new cd(b1Var.getContext(), b1Var.resourcesProvider, i10.a(), 14, null, null, b1Var.f997a0).show();
                return;
            }
        }
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = b1Var.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(b1Var.currentAccount).getInputPeer(b1Var.f997a0);
        tL_sendStarGiftOffer.duration = b1Var.f1009n0;
        tL_sendStarGiftOffer.slug = b1Var.Y.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(b1Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new s0(b1Var, g10, b2Var, 0));
    }

    public static void R(b1 b1Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10) {
        ag.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (b1Var.f1004h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            ga x10 = ga.x(i10, b1Var.m0.f631a);
            if (x10.e) {
                aVar = ag.a.l(x10.p());
            } else {
                aVar = null;
            }
            ag.c cVar = ag.c.f635a;
            ag.c cVar2 = ag.c.f636b;
            if (aVar != null) {
                long j11 = aVar.f632b;
                ag.a aVar2 = b1Var.m0;
                if (j11 >= aVar2.f632b) {
                    String str2 = b1Var.Z;
                    long j12 = b1Var.f997a0;
                    String d = aVar2.d();
                    if (b1Var.m0.f631a == cVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(b1Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(b1Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
                    org.telegram.ui.Cells.c1.r(i11, b1Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b1Var.getContext());
                    lk.o(i11, b1Var.resourcesProvider, textView2, 1, 16.0f);
                    if (b1Var.m0.f631a == cVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    j01 j01Var = new j01(b1Var.getContext(), b1Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b1Var.currentAccount).getSendPaidMessagesStars(j12);
                    final ag.a g10 = ag.a.g(sendPaidMessagesStars, cVar);
                    j01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), md.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        j01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), md.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    j01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b1Var.f1009n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(j01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b1Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) md.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, md.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), md.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) md.R0(LocaleController.formatString(R.string.GiftOfferPay, ag.a.i(b1Var.m0.f632b + g10.f632b, cVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                                b1.Q(b1.this, sendPaidMessagesStars, z12, g10, nextRandomId, b2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                        b2Var.X0 = true;
                        b2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                            b1.Q(b1.this, sendPaidMessagesStars, z122, g10, nextRandomId, b2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                    b2Var2.X0 = true;
                    b2Var2.show();
                    return;
                }
            }
            ag.a aVar3 = b1Var.m0;
            ag.c cVar3 = aVar3.f631a;
            if (cVar3 == cVar) {
                new cd(context, d6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (cVar3 == cVar2) {
                new fi.f(context, d6Var, aVar3, true, null).show();
            }
        }
    }

    public static void S(b1 b1Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b1Var.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new t0(b1Var, cVar, b2Var, updates, tL_error, 0));
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    public final void T() {
        boolean z10;
        float f7;
        boolean z11 = this.f1015t0;
        c cVar = this.X;
        if ((z11 && !isDismissed() && cVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f998b0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f1011p0 != z10) {
            this.f1011p0 = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                ViewPropertyAnimator animate = cVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                lk.s(scaleY, f11, 180L);
            }
        }
    }

    public final void U(boolean z10) {
        boolean z11;
        if (this.f1010o0 == 0 && this.m0.f632b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ei.d dVar = this.f1004h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                lk.s(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void V(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z16;
        String formatNumber;
        yq[] yqVarArr;
        double d;
        boolean z17;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i15;
        ag.a aVar2 = this.m0;
        int i16 = this.f1010o0;
        this.f1010o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = ag.a.i(0L, aVar2.f631a);
            this.f1010o0 |= 1;
        }
        ag.c cVar = this.m0.f631a;
        ag.b bVar = this.f1008l0;
        n4.s[] sVarArr = (n4.s[]) bVar.f634b;
        long j10 = ((ag.a) ((n4.s[]) bVar.f634b)[cVar.ordinal()].f17125c).f632b;
        ag.a aVar3 = this.m0;
        if (j10 < aVar3.f632b) {
            this.f1010o0 |= 4;
        }
        if (!aVar3.k() && ((ag.a) sVarArr[this.m0.f631a.ordinal()].f17124b).f632b > this.m0.f632b) {
            this.f1010o0 |= 2;
        }
        if (!z11 && aVar2.f631a == this.m0.f631a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f632b == this.m0.f632b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f1010o0) {
            z15 = false;
        } else {
            z15 = true;
        }
        ag.c cVar2 = ag.c.f635a;
        EditTextBoldCursor editTextBoldCursor = this.f1000d0;
        ag.c cVar3 = ag.c.f636b;
        if (z13) {
            u40 u40Var = this.f998b0;
            if (u40Var != null) {
                if (this.m0.f631a == cVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                u40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f997a0);
            ag.c cVar4 = this.m0.f631a;
            TextView textView = this.f1003g0;
            if (cVar4 == cVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr[this.m0.f631a.ordinal()].f17125c).a()).length())});
            } else if (cVar4 == cVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr[this.m0.f631a.ordinal()].f17125c).a()).length() + 3)});
            }
            ImageView imageView = this.f1007k0;
            ImageView imageView2 = this.f1006j0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                z17 = false;
                if (this.m0.f631a == cVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.m0.f631a == cVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.m0.f631a == cVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.m0.f631a == cVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.m0.f631a == cVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.m0.f631a == cVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                z17 = false;
                if (this.m0.f631a == cVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.m0.f631a == cVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            c cVar5 = this.X;
            r16 = z17;
            if (cVar5 != null) {
                ag.c cVar6 = this.m0.f631a;
                r16 = z17;
                if (cVar5.e != cVar6) {
                    cVar5.e = cVar6;
                    cVar5.a();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
        }
        if (z13 || z15) {
            if (this.m0.f631a == cVar2) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f999c0.setText(LocaleController.getString(i10));
            ag.c cVar7 = this.m0.f631a;
            int i17 = this.f1010o0;
            int i18 = i17 & 4;
            String str = this.Z;
            TextView textView2 = this.f1001e0;
            if (i18 != 0) {
                if (cVar7 == cVar2) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((ag.a) sVarArr[cVar7.ordinal()].f17125c).d();
                objArr[1] = str;
                lk.r(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (cVar7 == cVar2) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((ag.a) sVarArr[cVar7.ordinal()].f17124b).d();
                objArr2[1] = str;
                lk.r(i12, objArr2, textView2);
            } else {
                if (cVar7 == cVar2) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                lk.r(i11, objArr3, textView2);
            }
            if ((this.f1010o0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.h6.f21374y6;
            } else {
                i13 = org.telegram.ui.ActionBar.h6.f21224q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            ag.a aVar4 = this.m0;
            if (aVar4.f631a == cVar3) {
                z16 = true;
            } else {
                z16 = r16;
            }
            int i19 = R.string.GiftOfferButtonStars;
            if (z16) {
                formatNumber = aVar4.b();
            } else {
                formatNumber = LocaleController.formatNumber(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r16] = formatNumber;
            String formatString = LocaleController.formatString(i19, objArr4);
            if (z16) {
                yqVarArr = this.f1014s0;
            } else {
                yqVarArr = this.f1013r0;
            }
            this.f1004h0.g(md.n1(md.W0(z16, formatString, yqVarArr), z16), z12, true);
            U(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.m0.f631a == cVar3) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * d * 100.0d), "USD", 2));
            this.f1005i0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.m0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (this.f1011p0 && (cVar = this.X) != null && f7 >= cVar.getX() && f7 <= cVar.getX() + cVar.getWidth() && f10 >= cVar.getY() && f10 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        T();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f1015t0 = true;
        T();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 9), 50L);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 2), this.resourcesProvider);
        this.f1016u0 = s61Var;
        s61Var.f30201r = false;
        return s61Var;
    }
}
