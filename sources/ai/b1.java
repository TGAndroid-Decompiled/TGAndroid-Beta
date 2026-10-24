package ai;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vq;
public final class b1 extends org.telegram.ui.Components.za {
    public static final int[] f997x0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int X;
    public final c Y;
    public final TL_stars.TL_starGiftUnique Z;
    public final String f998a0;
    public final long f999b0;
    public final s40 f1000c0;
    public final td0 f1001d0;
    public final EditTextBoldCursor f1002e0;
    public final TextView f1003f0;
    public final z0 f1004g0;
    public final TextView f1005h0;
    public final ei.d f1006i0;
    public final org.telegram.ui.Components.o6 f1007j0;
    public final ImageView f1008k0;
    public final ImageView f1009l0;
    public final a4.l m0;
    public ag.a f1010n0;
    public int f1011o0;
    public int f1012p0;
    public boolean f1013q0;
    public final d2 f1014r0;
    public final vq[] f1015s0;
    public final vq[] f1016t0;
    public boolean f1017u0;
    public a71 f1018v0;
    public final l61 f1019w0;

    public b1(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.g6 g6Var, d2 d2Var) {
        super(context, null, true, false, 2, g6Var);
        TLRPC.User user;
        a4.l lVar = new a4.l(1);
        n4.s[] sVarArr = (n4.s[]) lVar.f279b;
        this.m0 = lVar;
        this.f1015s0 = new vq[1];
        this.f1016t0 = new vq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f999b0 = j10;
        this.Z = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.f998a0 = i2.o1.m(tL_starGiftUnique.num, ',', sb2);
        this.f1014r0 = d2Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = ha.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        ag.b bVar = ag.b.f633a;
        ag.a g10 = ag.a.g(j12, bVar);
        ag.a g11 = ag.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        ag.b bVar2 = ag.b.f634b;
        ag.a i11 = ag.a.i(Math.max(g10.e(bVar2).n(2).f632b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        ag.a i12 = ag.a.i(Math.max(i11.f632b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        ag.b bVar3 = g10.f631a;
        if (bVar3 == g11.f631a) {
            sVarArr[bVar3.ordinal()] = new n4.s(4, g10, g11);
        }
        ag.b bVar4 = i11.f631a;
        if (bVar4 == i12.f631a) {
            sVarArr[bVar4.ordinal()] = new n4.s(4, i11, i12);
        }
        c cVar = new c(context, i10, g6Var);
        this.Y = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(cVar);
        cVar.setOnClickListener(new v0(this, context, g6Var, 0));
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
        this.X = this.navBarColor;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f1002e0 = editTextBoldCursor;
        if (j11) {
            s40 s40Var = new s40(context, g6Var);
            this.f1000c0 = s40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            s40Var.b(arrayList, new w0(this, 0));
            linearLayout.addView(s40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f1000c0 = null;
        }
        LinearLayout e = tl.e(context, 1);
        linearLayout.addView(e, w7.z5.l(1.0f, -1, -2));
        td0 td0Var = new td0(context, null);
        this.f1001d0 = td0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        td0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        td0Var.e(editTextBoldCursor);
        td0Var.b(1.0f, 0.0f, false);
        td0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 2));
        td0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e.addView(td0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f1008k0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        td0Var.addView(imageView, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f1009l0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        td0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f1007j0 = o6Var;
        int i14 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.a0(o6Var, i14, null);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        td0Var.addView(o6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f1003f0 = textView;
        textView.setTextSize(1, 13.0f);
        e.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f1004g0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor2, i13, null);
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        td0 td0Var2 = new td0(context, null);
        td0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        td0Var2.e(editTextBoldCursor2);
        td0Var2.addView((View) editTextBoldCursor2, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(td0Var2, 0.02f, 1.2f);
        td0Var2.setOnClickListener(new p(1, this, context));
        e.addView(td0Var2, w7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.W5, g6Var, PorterDuff.Mode.SRC_IN);
        td0Var2.addView(imageView3, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1005h0 = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f1006i0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                b1.Q(b1.this, i10, context, g6Var, j10);
            }
        });
        U(ag.a.i(0L, bVar), false, true, false);
        if (this.f1011o0 != 86400) {
            this.f1011o0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new a1(this));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        lm0 lm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f1019w0 = l61.k(linearLayout);
        this.f1018v0.N(false);
    }

    public static void P(b1 b1Var, long j10, boolean z10, ag.a aVar, long j11, org.telegram.ui.ActionBar.c2 c2Var) {
        ag.a aVar2;
        ag.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = b1Var.currentAccount;
            ag.b bVar = ag.b.f633a;
            ha x10 = ha.x(i12, bVar);
            if (x10.e) {
                aVar2 = ag.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = ag.a.g(j10, bVar);
            } else {
                i10 = ag.a.i(b1Var.f1010n0.f632b + aVar.f632b, bVar);
            }
            if (aVar2 == null || aVar2.f632b < i10.f632b) {
                new dd(b1Var.getContext(), b1Var.resourcesProvider, i10.a(), 14, null, null, b1Var.f999b0).show();
                return;
            }
        }
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = b1Var.f1010n0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(b1Var.currentAccount).getInputPeer(b1Var.f999b0);
        tL_sendStarGiftOffer.duration = b1Var.f1011o0;
        tL_sendStarGiftOffer.slug = b1Var.Z.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(b1Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new s0(b1Var, h, c2Var, 0));
    }

    public static void Q(b1 b1Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10) {
        ag.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (b1Var.f1006i0.f8862c0) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            ha x10 = ha.x(i10, b1Var.f1010n0.f631a);
            if (x10.e) {
                aVar = ag.a.l(x10.p());
            } else {
                aVar = null;
            }
            ag.b bVar = ag.b.f633a;
            ag.b bVar2 = ag.b.f634b;
            if (aVar != null) {
                long j11 = aVar.f632b;
                ag.a aVar2 = b1Var.f1010n0;
                if (j11 >= aVar2.f632b) {
                    String str2 = b1Var.f998a0;
                    long j12 = b1Var.f999b0;
                    String d = aVar2.d();
                    if (b1Var.f1010n0.f631a == bVar2) {
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
                    int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
                    org.telegram.messenger.v0.q(textView, i11, b1Var.resourcesProvider, 1, 20.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b1Var.getContext());
                    org.telegram.ui.ActionBar.r6.W(textView2, i11, b1Var.resourcesProvider);
                    textView2.setTextSize(1, 16.0f);
                    if (b1Var.f1010n0.f631a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    n01 n01Var = new n01(b1Var.getContext(), b1Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b1Var.currentAccount).getSendPaidMessagesStars(j12);
                    final ag.a g10 = ag.a.g(sendPaidMessagesStars, bVar);
                    n01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), nd.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        n01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), nd.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    n01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b1Var.f1011o0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(n01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b1Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) nd.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, nd.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), nd.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) nd.R0(LocaleController.formatString(R.string.GiftOfferPay, ag.a.i(b1Var.f1010n0.f632b + g10.f632b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                        alertDialog$Builder.o(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i13) {
                                b1.P(b1.this, sendPaidMessagesStars, z12, g10, nextRandomId, c2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.Z0 = true;
                        c2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                    alertDialog$Builder2.o(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                            b1.P(b1.this, sendPaidMessagesStars, z122, g10, nextRandomId, c2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                    c2Var2.Z0 = true;
                    c2Var2.show();
                    return;
                }
            }
            ag.a aVar3 = b1Var.f1010n0;
            ag.b bVar3 = aVar3.f631a;
            if (bVar3 == bVar) {
                new dd(context, g6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new fi.f(context, g6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(b1 b1Var, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b1Var.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new t0(b1Var, cVar, c2Var, updates, tL_error, 0));
    }

    public final void S() {
        boolean z10;
        float f7;
        boolean z11 = this.f1017u0;
        c cVar = this.Y;
        if ((z11 && !isDismissed() && cVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f1000c0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f1013q0 != z10) {
            this.f1013q0 = z10;
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
                tl.s(scaleY, f11, 180L);
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11;
        if (this.f1012p0 == 0 && this.f1010n0.f632b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ei.d dVar = this.f1006i0;
        if (dVar.f8862c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                tl.s(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void U(ag.a aVar, boolean z10, boolean z11, boolean z12) {
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
        vq[] vqVarArr;
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
        ag.a aVar2 = this.f1010n0;
        int i16 = this.f1012p0;
        this.f1012p0 = 0;
        if (aVar != null) {
            this.f1010n0 = aVar;
        } else {
            this.f1010n0 = ag.a.i(0L, aVar2.f631a);
            this.f1012p0 |= 1;
        }
        ag.b bVar = this.f1010n0.f631a;
        a4.l lVar = this.m0;
        n4.s[] sVarArr = (n4.s[]) lVar.f279b;
        long j10 = ((ag.a) ((n4.s[]) lVar.f279b)[bVar.ordinal()].f17189c).f632b;
        ag.a aVar3 = this.f1010n0;
        if (j10 < aVar3.f632b) {
            this.f1012p0 |= 4;
        }
        if (!aVar3.k() && ((ag.a) sVarArr[this.f1010n0.f631a.ordinal()].f17188b).f632b > this.f1010n0.f632b) {
            this.f1012p0 |= 2;
        }
        if (!z11 && aVar2.f631a == this.f1010n0.f631a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f632b == this.f1010n0.f632b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f1012p0) {
            z15 = false;
        } else {
            z15 = true;
        }
        ag.b bVar2 = ag.b.f633a;
        EditTextBoldCursor editTextBoldCursor = this.f1002e0;
        ag.b bVar3 = ag.b.f634b;
        if (z13) {
            s40 s40Var = this.f1000c0;
            if (s40Var != null) {
                if (this.f1010n0.f631a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                s40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f999b0);
            ag.b bVar4 = this.f1010n0.f631a;
            TextView textView = this.f1005h0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr[this.f1010n0.f631a.ordinal()].f17189c).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr[this.f1010n0.f631a.ordinal()].f17189c).a()).length() + 3)});
            }
            ImageView imageView = this.f1009l0;
            ImageView imageView2 = this.f1008k0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                z17 = false;
                if (this.f1010n0.f631a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.f1010n0.f631a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.f1010n0.f631a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f1010n0.f631a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.f1010n0.f631a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.f1010n0.f631a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                z17 = false;
                if (this.f1010n0.f631a == bVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.f1010n0.f631a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            c cVar = this.Y;
            r16 = z17;
            if (cVar != null) {
                ag.b bVar5 = this.f1010n0.f631a;
                r16 = z17;
                if (cVar.e != bVar5) {
                    cVar.e = bVar5;
                    cVar.a();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
        }
        if (z13 || z15) {
            if (this.f1010n0.f631a == bVar2) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f1001d0.setText(LocaleController.getString(i10));
            ag.b bVar6 = this.f1010n0.f631a;
            int i17 = this.f1012p0;
            int i18 = i17 & 4;
            String str = this.f998a0;
            TextView textView2 = this.f1003f0;
            if (i18 != 0) {
                if (bVar6 == bVar2) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((ag.a) sVarArr[bVar6.ordinal()].f17189c).d();
                objArr[1] = str;
                tl.r(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((ag.a) sVarArr[bVar6.ordinal()].f17188b).d();
                objArr2[1] = str;
                tl.r(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                tl.r(i11, objArr3, textView2);
            }
            if ((this.f1012p0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.k6.f21572y6;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f21422q7;
            }
            org.telegram.ui.ActionBar.r6.W(textView2, i13, this.resourcesProvider);
        }
        if (z13 || z14 || z15) {
            ag.a aVar4 = this.f1010n0;
            if (aVar4.f631a == bVar3) {
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
                vqVarArr = this.f1016t0;
            } else {
                vqVarArr = this.f1015s0;
            }
            this.f1006i0.i(nd.n1(nd.W0(z16, formatString, vqVarArr), z16), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f1010n0.f631a == bVar3) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.f1010n0.c() * d * 100.0d), "USD", 2));
            this.f1007j0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f1010n0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (this.f1013q0 && (cVar = this.Y) != null && f7 >= cVar.getX() && f7 <= cVar.getX() + cVar.getWidth() && f10 >= cVar.getY() && f10 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        S();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f1017u0 = true;
        S();
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor == this.X && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) != this.navBarColor) {
                fixNavigationBar(themedColor);
                this.X = this.navBarColor;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 9), 50L);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 2), this.resourcesProvider);
        this.f1018v0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
