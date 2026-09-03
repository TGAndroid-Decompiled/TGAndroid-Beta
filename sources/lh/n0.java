package lh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
public final class n0 extends org.telegram.ui.Components.sa {
    public static final int[] f12794t0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final c U;
    public final TL_stars.TL_starGiftUnique V;
    public final String W;
    public final long X;
    public final o40 Y;
    public final bd0 Z;
    public final EditTextBoldCursor f12795a0;
    public final TextView f12796b0;
    public final l0 f12797c0;
    public final TextView f12798d0;
    public final ph.d f12799e0;
    public final org.telegram.ui.Components.k6 f12800f0;
    public final ImageView f12801g0;
    public final ImageView f12802h0;
    public final o5.i f12803i0;
    public lf.a f12804j0;
    public int f12805k0;
    public int f12806l0;
    public boolean m0;
    public final t1 f12807n0;
    public final lq[] f12808o0;
    public final lq[] f12809p0;
    public boolean f12810q0;
    public w51 f12811r0;
    public final i51 f12812s0;

    public n0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.f6 f6Var, t1 t1Var) {
        super(context, null, true, false, false, false, false, 2, f6Var);
        TLRPC.User user;
        o5.i iVar = new o5.i(25);
        f7.b[] bVarArr = (f7.b[]) iVar.f16439b;
        this.f12803i0 = iVar;
        this.f12808o0 = new lq[1];
        this.f12809p0 = new lq[1];
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.X = j10;
        this.V = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.W = kf.k0.l(tL_starGiftUnique.num, ',', sb);
        this.f12807n0 = t1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = t7.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        lf.b bVar = lf.b.f12056a;
        lf.a g10 = lf.a.g(j12, bVar);
        lf.a g11 = lf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        lf.b bVar2 = lf.b.f12057b;
        lf.a i11 = lf.a.i(Math.max(g10.e(bVar2).n(2).f12055b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        lf.a i12 = lf.a.i(Math.max(i11.f12055b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        lf.b bVar3 = g10.f12054a;
        if (bVar3 == g11.f12054a) {
            bVarArr[bVar3.ordinal()] = new f7.b(27, g10, g11);
        }
        lf.b bVar4 = i11.f12054a;
        if (bVar4 == i12.f12054a) {
            bVarArr[bVar4.ordinal()] = new f7.b(27, i11, i12);
        }
        c cVar = new c(context, i10, f6Var);
        this.U = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.d6.a(cVar);
        cVar.setOnClickListener(new dg.p(this, context, f6Var, 7));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f12795a0 = editTextBoldCursor;
        if (j11) {
            o40 o40Var = new o40(context, f6Var);
            this.Y = o40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            o40Var.b(arrayList, new j0(this, 0));
            linearLayout.addView(o40Var, k7.b6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.Y = null;
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f10, k7.b6.l(1.0f, -1, -2));
        bd0 bd0Var = new bd0(context, null);
        this.Z = bd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        bd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        bd0Var.e(editTextBoldCursor);
        bd0Var.b(1.0f, 0.0f, false);
        bd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 3));
        bd0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        f10.addView(bd0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f12801g0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        bd0Var.addView(imageView, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12802h0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        bd0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f12800f0 = k6Var;
        int i14 = org.telegram.ui.ActionBar.j6.f20256y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        bd0Var.addView(k6Var, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f12796b0 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f12797c0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        bd0 bd0Var2 = new bd0(context, null);
        bd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        bd0Var2.e(editTextBoldCursor2);
        bd0Var2.addView((View) editTextBoldCursor2, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.d6.b(bd0Var2, 0.02f, 1.2f);
        bd0Var2.setOnClickListener(new cg.n(17, this, context));
        f10.addView(bd0Var2, k7.b6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), PorterDuff.Mode.SRC_IN));
        bd0Var2.addView(imageView3, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f12798d0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.f12799e0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                n0.Q(n0.this, i10, context, f6Var, j10);
            }
        });
        U(lf.a.i(0L, bVar), false, true, false);
        if (this.f12805k0 != 86400) {
            this.f12805k0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new m0(this));
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        rl0 rl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f12812s0 = i51.k(linearLayout);
        this.f12811r0.N(false);
    }

    public static void P(n0 n0Var, long j10, boolean z4, lf.a aVar, long j11, org.telegram.ui.ActionBar.d2 d2Var) {
        lf.a aVar2;
        lf.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = n0Var.currentAccount;
            lf.b bVar = lf.b.f12056a;
            t7 x10 = t7.x(i12, bVar);
            if (x10.e) {
                aVar2 = lf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z4) {
                i10 = lf.a.g(j10, bVar);
            } else {
                i10 = lf.a.i(n0Var.f12804j0.f12055b + aVar.f12055b, bVar);
            }
            if (aVar2 == null || aVar2.f12055b < i10.f12055b) {
                new z9(n0Var.getContext(), n0Var.resourcesProvider, i10.a(), 14, null, null, n0Var.X).show();
                return;
            }
        }
        ze.c g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = n0Var.f12804j0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(n0Var.currentAccount).getInputPeer(n0Var.X);
        tL_sendStarGiftOffer.duration = n0Var.f12805k0;
        tL_sendStarGiftOffer.slug = n0Var.V.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(n0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new kh.a0(n0Var, g10, d2Var, 2));
    }

    public static void Q(n0 n0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10) {
        lf.a aVar;
        String str;
        boolean z4;
        String formatString;
        ?? r14;
        boolean z10;
        if (n0Var.f12799e0.T) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.c.b(i10);
                return;
            }
            t7 x10 = t7.x(i10, n0Var.f12804j0.f12054a);
            if (x10.e) {
                aVar = lf.a.l(x10.p());
            } else {
                aVar = null;
            }
            lf.b bVar = lf.b.f12056a;
            lf.b bVar2 = lf.b.f12057b;
            if (aVar != null) {
                long j11 = aVar.f12055b;
                lf.a aVar2 = n0Var.f12804j0;
                if (j11 >= aVar2.f12055b) {
                    String str2 = n0Var.W;
                    long j12 = n0Var.X;
                    String d = aVar2.d();
                    if (n0Var.f12804j0.f12054a == bVar2) {
                        str = str2;
                        z4 = true;
                    } else {
                        str = str2;
                        z4 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(n0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(n0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
                    org.telegram.ui.b.w(i11, n0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, k7.b6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(n0Var.getContext());
                    org.telegram.ui.b.l(i11, n0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (n0Var.f12804j0.f12054a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                    sz0 sz0Var = new sz0(n0Var.getContext(), n0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(n0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final lf.a g10 = lf.a.g(sendPaidMessagesStars, bVar);
                    sz0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), ja.X0(z4, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        sz0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), ja.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    sz0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", n0Var.f12805k0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(sz0Var, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(n0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) ja.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z4));
                    } else if (z4) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, ja.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), ja.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z10 = z4;
                        spannableStringBuilder.append((CharSequence) ja.Q0(LocaleController.formatString(R.string.GiftOfferPay, lf.a.i(n0Var.f12804j0.f12055b + g10.f12055b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n0Var.getContext(), 0, n0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z11 = z10;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() {
                            @Override
                            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i13) {
                                n0.P(n0.this, sendPaidMessagesStars, z11, g10, nextRandomId, d2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.U0 = true;
                        d2Var.show();
                        return;
                    }
                    z10 = z4;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n0Var.getContext(), 0, n0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z112 = z10;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() {
                        @Override
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                            n0.P(n0.this, sendPaidMessagesStars, z112, g10, nextRandomId, d2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                    d2Var2.U0 = true;
                    d2Var2.show();
                    return;
                }
            }
            lf.a aVar3 = n0Var.f12804j0;
            lf.b bVar3 = aVar3.f12054a;
            if (bVar3 == bVar) {
                new z9(context, f6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new qh.f(context, f6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(n0 n0Var, ze.c cVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(n0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new gg.j0(5, n0Var, cVar, d2Var, updates, tL_error));
    }

    public final void S() {
        boolean z4;
        float f10;
        boolean z10 = this.f12810q0;
        c cVar = this.U;
        if ((z10 && !isDismissed() && cVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.Y == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.m0 != z4) {
            this.m0 = z4;
            if (cVar != null) {
                cVar.setEnabled(z4);
                cVar.setClickable(z4);
                ViewPropertyAnimator animate = cVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z4) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z4) {
                    f12 = 0.0f;
                }
                scaleY.alpha(f12).setDuration(180L).start();
            }
        }
    }

    public final void T(boolean z4) {
        boolean z10;
        if (this.f12806l0 == 0 && this.f12804j0.f12055b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ph.d dVar = this.f12799e0;
        if (dVar.T != z10) {
            dVar.setEnabled(z10);
            dVar.setClickable(z10);
            float f10 = 0.6f;
            if (z4) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(180L).start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            dVar.setAlpha(f10);
        }
    }

    public final void U(lf.a aVar, boolean z4, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        char c3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z15;
        String formatNumber;
        lq[] lqVarArr;
        double d;
        float f10;
        float f11;
        lf.b bVar;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        lf.a aVar2 = this.f12804j0;
        int i16 = this.f12806l0;
        this.f12806l0 = 0;
        if (aVar != null) {
            this.f12804j0 = aVar;
        } else {
            this.f12804j0 = lf.a.i(0L, aVar2.f12054a);
            this.f12806l0 |= 1;
        }
        lf.b bVar2 = this.f12804j0.f12054a;
        o5.i iVar = this.f12803i0;
        f7.b[] bVarArr = (f7.b[]) iVar.f16439b;
        long j10 = ((lf.a) ((f7.b[]) iVar.f16439b)[bVar2.ordinal()].f6002c).f12055b;
        lf.a aVar3 = this.f12804j0;
        if (j10 < aVar3.f12055b) {
            this.f12806l0 |= 4;
        }
        if (!aVar3.k() && ((lf.a) bVarArr[this.f12804j0.f12054a.ordinal()].f6001b).f12055b > this.f12804j0.f12055b) {
            this.f12806l0 |= 2;
        }
        if (!z10 && aVar2.f12054a == this.f12804j0.f12054a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar2.f12055b == this.f12804j0.f12055b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i16 == this.f12806l0) {
            z14 = false;
        } else {
            z14 = true;
        }
        lf.b bVar3 = lf.b.f12056a;
        EditTextBoldCursor editTextBoldCursor = this.f12795a0;
        lf.b bVar4 = lf.b.f12057b;
        if (z12) {
            o40 o40Var = this.Y;
            if (o40Var != null) {
                if (this.f12804j0.f12054a == bVar3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                o40Var.a(i15, z11);
            }
            String shortName = DialogObject.getShortName(this.X);
            lf.b bVar5 = this.f12804j0.f12054a;
            TextView textView = this.f12798d0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((lf.a) bVarArr[this.f12804j0.f12054a.ordinal()].f6002c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((lf.a) bVarArr[this.f12804j0.f12054a.ordinal()].f6002c).a()).length() + 3)});
            }
            ImageView imageView = this.f12802h0;
            ImageView imageView2 = this.f12801g0;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                c3 = 0;
                if (this.f12804j0.f12054a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f12804j0.f12054a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f12804j0.f12054a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f12804j0.f12054a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f12804j0.f12054a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f12804j0.f12054a == bVar4) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                c3 = 0;
                if (this.f12804j0.f12054a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f12804j0.f12054a == bVar4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar = this.U;
            if (cVar != null && cVar.e != (bVar = this.f12804j0.f12054a)) {
                cVar.e = bVar;
                cVar.a();
            }
        } else {
            c3 = 0;
        }
        if (z12 || z14) {
            if (this.f12804j0.f12054a == bVar3) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.Z.setText(LocaleController.getString(i10));
            lf.b bVar6 = this.f12804j0.f12054a;
            int i17 = this.f12806l0;
            int i18 = i17 & 4;
            String str = this.W;
            TextView textView2 = this.f12796b0;
            if (i18 != 0) {
                if (bVar6 == bVar3) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c3] = ((lf.a) bVarArr[bVar6.ordinal()].f6002c).d();
                objArr[1] = str;
                org.telegram.ui.b.o(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar3) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c3] = ((lf.a) bVarArr[bVar6.ordinal()].f6001b).d();
                objArr2[1] = str;
                org.telegram.ui.b.o(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c3] = str;
                org.telegram.ui.b.o(i11, objArr3, textView2);
            }
            if ((this.f12806l0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.j6.f20256y6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f20116q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z12 || z13 || z14) {
            lf.a aVar4 = this.f12804j0;
            if (aVar4.f12054a == bVar4) {
                z15 = true;
            } else {
                z15 = false;
            }
            int i19 = R.string.GiftOfferButtonStars;
            if (z15) {
                formatNumber = aVar4.b();
            } else {
                formatNumber = LocaleController.formatNumber(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[c3] = formatNumber;
            String formatString = LocaleController.formatString(i19, objArr4);
            if (z15) {
                lqVarArr = this.f12809p0;
            } else {
                lqVarArr = this.f12808o0;
            }
            this.f12799e0.g(ja.V0(z15, formatString, lqVarArr), z11, true);
            T(z11);
        }
        if (z12 || z13) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            if (this.f12804j0.f12054a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb.append(BillingController.getInstance().formatCurrency((long) (this.f12804j0.c() * d * 100.0d), "USD", 2));
            this.f12800f0.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.f12804j0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        c cVar;
        if (this.m0 && (cVar = this.U) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        S();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f12810q0 = true;
        S();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new b(this, 3), 50L);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 16), this.resourcesProvider);
        this.f12811r0 = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
