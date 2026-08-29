package jh;

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
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.w41;
public final class n0 extends org.telegram.ui.Components.xa {
    public static final int[] f12481s0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final b T;
    public final TL_stars.TL_starGiftUnique U;
    public final String V;
    public final long W;
    public final j40 X;
    public final uc0 Y;
    public final EditTextBoldCursor Z;
    public final TextView f12482a0;
    public final l0 f12483b0;
    public final TextView f12484c0;
    public final nh.d f12485d0;
    public final org.telegram.ui.Components.o6 f12486e0;
    public final ImageView f12487f0;
    public final ImageView f12488g0;
    public final za.c f12489h0;
    public kf.a f12490i0;
    public int f12491j0;
    public int f12492k0;
    public boolean f12493l0;
    public final t1 m0;
    public final iq[] f12494n0;
    public final iq[] f12495o0;
    public boolean f12496p0;
    public k51 f12497q0;
    public final w41 f12498r0;

    public n0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.c6 c6Var, t1 t1Var) {
        super(context, null, true, false, false, false, false, 2, c6Var);
        TLRPC.User user;
        za.c cVar = new za.c(21);
        g9.l[] lVarArr = (g9.l[]) cVar.f50799b;
        this.f12489h0 = cVar;
        this.f12494n0 = new iq[1];
        this.f12495o0 = new iq[1];
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.W = j10;
        this.U = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.V = j7.l1.m(tL_starGiftUnique.num, ',', sb2);
        this.m0 = t1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = s7.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        kf.b bVar = kf.b.f13635a;
        kf.a g10 = kf.a.g(j12, bVar);
        kf.a g11 = kf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        kf.b bVar2 = kf.b.f13636b;
        kf.a i11 = kf.a.i(Math.max(g10.e(bVar2).n(2).f13634b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        kf.a i12 = kf.a.i(Math.max(i11.f13634b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        kf.b bVar3 = g10.f13633a;
        if (bVar3 == g11.f13633a) {
            lVarArr[bVar3.ordinal()] = new g9.l(g10, g11, false, 16);
        }
        kf.b bVar4 = i11.f13633a;
        if (bVar4 == i12.f13633a) {
            lVarArr[bVar4.ordinal()] = new g9.l(i11, i12, false, 16);
        }
        b bVar5 = new b(context, i10, c6Var);
        this.T = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(false);
        bVar5.setClickable(false);
        this.container.addView(bVar5, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        i7.h6.a(bVar5);
        bVar5.setOnClickListener(new bg.q(this, context, c6Var, 7));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.Z = editTextBoldCursor;
        if (j11) {
            j40 j40Var = new j40(context, c6Var);
            this.X = j40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            j40Var.b(arrayList, new j0(this, 0));
            linearLayout.addView(j40Var, i7.f6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.X = null;
        }
        LinearLayout g12 = org.telegram.messenger.x3.g(context, 1);
        linearLayout.addView(g12, i7.f6.l(1.0f, -1, -2));
        uc0 uc0Var = new uc0(context, null);
        this.Y = uc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        uc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        uc0Var.e(editTextBoldCursor);
        uc0Var.b(1.0f, 0.0f, false);
        uc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ag.a0(this, 3));
        uc0Var.addView(editTextBoldCursor, i7.f6.e(-1, -2, 48));
        g12.addView(uc0Var, i7.f6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f12487f0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        uc0Var.addView(imageView, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12488g0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        uc0Var.addView(imageView2, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f12486e0 = o6Var;
        int i14 = org.telegram.ui.ActionBar.g6.f23433y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        uc0Var.addView(o6Var, i7.f6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f12482a0 = textView;
        textView.setTextSize(1, 13.0f);
        g12.addView(textView, i7.f6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f12483b0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        uc0 uc0Var2 = new uc0(context, null);
        uc0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        uc0Var2.e(editTextBoldCursor2);
        uc0Var2.addView((View) editTextBoldCursor2, i7.f6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        i7.h6.b(uc0Var2, 0.02f, 1.2f);
        uc0Var2.setOnClickListener(new ag.n(17, this, context));
        g12.addView(uc0Var2, i7.f6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, c6Var), PorterDuff.Mode.SRC_IN));
        uc0Var2.addView(imageView3, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f12484c0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        g12.addView(textView2, i7.f6.t(-1, -2, 55, 33, 4, 33, 0));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.f12485d0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                n0.Q(n0.this, i10, context, c6Var, j10);
            }
        });
        U(kf.a.i(0L, bVar), false, true, false);
        if (this.f12491j0 != 86400) {
            this.f12491j0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new m0(this));
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        jl0 jl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f12498r0 = w41.k(linearLayout);
        this.f12497q0.N(false);
    }

    public static void P(n0 n0Var, long j10, boolean z10, kf.a aVar, long j11, org.telegram.ui.ActionBar.c2 c2Var) {
        kf.a aVar2;
        kf.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = n0Var.currentAccount;
            kf.b bVar = kf.b.f13635a;
            s7 x4 = s7.x(i12, bVar);
            if (x4.f12790e) {
                aVar2 = kf.a.l(x4.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = kf.a.g(j10, bVar);
            } else {
                i10 = kf.a.i(n0Var.f12490i0.f13634b + aVar.f13634b, bVar);
            }
            if (aVar2 == null || aVar2.f13634b < i10.f13634b) {
                new y9(n0Var.getContext(), n0Var.resourcesProvider, i10.a(), 14, null, null, n0Var.W).show();
                return;
            }
        }
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = n0Var.f12490i0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(n0Var.currentAccount).getInputPeer(n0Var.W);
        tL_sendStarGiftOffer.duration = n0Var.f12491j0;
        tL_sendStarGiftOffer.slug = n0Var.U.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(n0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new ih.b0(n0Var, g10, c2Var, 2));
    }

    public static void Q(n0 n0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10) {
        kf.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (n0Var.f12485d0.S) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.c.b(i10);
                return;
            }
            s7 x4 = s7.x(i10, n0Var.f12490i0.f13633a);
            if (x4.f12790e) {
                aVar = kf.a.l(x4.p());
            } else {
                aVar = null;
            }
            kf.b bVar = kf.b.f13635a;
            kf.b bVar2 = kf.b.f13636b;
            if (aVar != null) {
                long j11 = aVar.f13634b;
                kf.a aVar2 = n0Var.f12490i0;
                if (j11 >= aVar2.f13634b) {
                    String str2 = n0Var.V;
                    long j12 = n0Var.W;
                    String d = aVar2.d();
                    if (n0Var.f12490i0.f13633a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(n0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(n0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
                    org.telegram.ui.b.w(i11, n0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, i7.f6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(n0Var.getContext());
                    org.telegram.ui.b.m(i11, n0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (n0Var.f12490i0.f13633a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, i7.f6.t(-1, -2, 48, 24, 4, 24, 4));
                    hz0 hz0Var = new hz0(n0Var.getContext(), n0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(n0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final kf.a g10 = kf.a.g(sendPaidMessagesStars, bVar);
                    hz0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), ia.X0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        hz0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), ia.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    hz0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", n0Var.f12491j0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(hz0Var, i7.f6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(n0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) ia.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, ia.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), ia.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) ia.Q0(LocaleController.formatString(R.string.GiftOfferPay, kf.a.i(n0Var.f12490i0.f13634b + g10.f13634b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n0Var.getContext(), 0, n0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i13) {
                                n0.P(n0.this, sendPaidMessagesStars, z12, g10, nextRandomId, c2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.T0 = true;
                        c2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n0Var.getContext(), 0, n0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                            n0.P(n0.this, sendPaidMessagesStars, z122, g10, nextRandomId, c2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.T0 = true;
                    c2Var2.show();
                    return;
                }
            }
            kf.a aVar3 = n0Var.f12490i0;
            kf.b bVar3 = aVar3.f13633a;
            if (bVar3 == bVar) {
                new y9(context, c6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new oh.f(context, c6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(n0 n0Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(n0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new eg.k0((Object) n0Var, (Object) cVar, (Object) c2Var, (Object) updates, tL_error, 5));
    }

    public final void S() {
        boolean z10;
        float f9;
        boolean z11 = this.f12496p0;
        b bVar = this.T;
        if ((z11 && !isDismissed() && bVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.X == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12493l0 != z10) {
            this.f12493l0 = z10;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f9);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                scaleY.alpha(f11).setDuration(180L).start();
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11;
        if (this.f12492k0 == 0 && this.f12490i0.f13634b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        nh.d dVar = this.f12485d0;
        if (dVar.S != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f9 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f9 = 1.0f;
                }
                animate.alpha(f9).setDuration(180L).start();
                return;
            }
            if (z11) {
                f9 = 1.0f;
            }
            dVar.setAlpha(f9);
        }
    }

    public final void U(kf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        char c3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z16;
        String formatNumber;
        iq[] iqVarArr;
        double d;
        float f9;
        float f10;
        kf.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i15;
        kf.a aVar2 = this.f12490i0;
        int i16 = this.f12492k0;
        this.f12492k0 = 0;
        if (aVar != null) {
            this.f12490i0 = aVar;
        } else {
            this.f12490i0 = kf.a.i(0L, aVar2.f13633a);
            this.f12492k0 |= 1;
        }
        kf.b bVar2 = this.f12490i0.f13633a;
        za.c cVar = this.f12489h0;
        g9.l[] lVarArr = (g9.l[]) cVar.f50799b;
        long j10 = ((kf.a) ((g9.l[]) cVar.f50799b)[bVar2.ordinal()].f7169c).f13634b;
        kf.a aVar3 = this.f12490i0;
        if (j10 < aVar3.f13634b) {
            this.f12492k0 |= 4;
        }
        if (!aVar3.k() && ((kf.a) lVarArr[this.f12490i0.f13633a.ordinal()].f7168b).f13634b > this.f12490i0.f13634b) {
            this.f12492k0 |= 2;
        }
        if (!z11 && aVar2.f13633a == this.f12490i0.f13633a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f13634b == this.f12490i0.f13634b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f12492k0) {
            z15 = false;
        } else {
            z15 = true;
        }
        kf.b bVar3 = kf.b.f13635a;
        EditTextBoldCursor editTextBoldCursor = this.Z;
        kf.b bVar4 = kf.b.f13636b;
        if (z13) {
            j40 j40Var = this.X;
            if (j40Var != null) {
                if (this.f12490i0.f13633a == bVar3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                j40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.W);
            kf.b bVar5 = this.f12490i0.f13633a;
            TextView textView = this.f12484c0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((kf.a) lVarArr[this.f12490i0.f13633a.ordinal()].f7169c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((kf.a) lVarArr[this.f12490i0.f13633a.ordinal()].f7169c).a()).length() + 3)});
            }
            ImageView imageView = this.f12488g0;
            ImageView imageView2 = this.f12487f0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                c3 = 0;
                if (this.f12490i0.f13633a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.f12490i0.f13633a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.f12490i0.f13633a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f12490i0.f13633a == bVar4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.f12490i0.f13633a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.f12490i0.f13633a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                c3 = 0;
                if (this.f12490i0.f13633a == bVar3) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                imageView2.setAlpha(f9);
                if (this.f12490i0.f13633a == bVar4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            b bVar6 = this.T;
            if (bVar6 != null && bVar6.f11770e != (bVar = this.f12490i0.f13633a)) {
                bVar6.f11770e = bVar;
                bVar6.a();
            }
        } else {
            c3 = 0;
        }
        if (z13 || z15) {
            if (this.f12490i0.f13633a == bVar3) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.Y.setText(LocaleController.getString(i10));
            kf.b bVar7 = this.f12490i0.f13633a;
            int i17 = this.f12492k0;
            int i18 = i17 & 4;
            String str = this.V;
            TextView textView2 = this.f12482a0;
            if (i18 != 0) {
                if (bVar7 == bVar3) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c3] = ((kf.a) lVarArr[bVar7.ordinal()].f7169c).d();
                objArr[1] = str;
                org.telegram.ui.b.p(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar7 == bVar3) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c3] = ((kf.a) lVarArr[bVar7.ordinal()].f7168b).d();
                objArr2[1] = str;
                org.telegram.ui.b.p(i12, objArr2, textView2);
            } else {
                if (bVar7 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c3] = str;
                org.telegram.ui.b.p(i11, objArr3, textView2);
            }
            if ((this.f12492k0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.g6.f23433y6;
            } else {
                i13 = org.telegram.ui.ActionBar.g6.f23295q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            kf.a aVar4 = this.f12490i0;
            if (aVar4.f13633a == bVar4) {
                z16 = true;
            } else {
                z16 = false;
            }
            int i19 = R.string.GiftOfferButtonStars;
            if (z16) {
                formatNumber = aVar4.b();
            } else {
                formatNumber = LocaleController.formatNumber(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[c3] = formatNumber;
            String formatString = LocaleController.formatString(i19, objArr4);
            if (z16) {
                iqVarArr = this.f12495o0;
            } else {
                iqVarArr = this.f12494n0;
            }
            this.f12485d0.g(ia.V0(z16, formatString, iqVarArr), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f12490i0.f13633a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.f12490i0.c() * d * 100.0d), "USD", 2));
            this.f12486e0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f12490i0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f9, float f10) {
        b bVar;
        if (this.f12493l0 && (bVar = this.T) != null && f9 >= bVar.getX() && f9 <= bVar.getX() + bVar.getWidth() && f10 >= bVar.getY() && f10 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f9, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f9) {
        super.onContainerTranslationYChanged(f9);
        S();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f12496p0 = true;
        S();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new o(this, 2), 50L);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 16), this.resourcesProvider);
        this.f12497q0 = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
