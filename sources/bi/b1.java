package bi;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.zq;
public final class b1 extends org.telegram.ui.Components.bb {
    public static final int[] f4305x0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int X;
    public final c Y;
    public final TL_stars.TL_starGiftUnique Z;
    public final String f4306a0;
    public final long f4307b0;
    public final w40 f4308c0;
    public final sd0 f4309d0;
    public final EditTextBoldCursor f4310e0;
    public final TextView f4311f0;
    public final z0 f4312g0;
    public final TextView f4313h0;
    public final fi.d f4314i0;
    public final org.telegram.ui.Components.s6 f4315j0;
    public final ImageView f4316k0;
    public final ImageView f4317l0;
    public final b6.i m0;
    public bg.a f4318n0;
    public int f4319o0;
    public int f4320p0;
    public boolean f4321q0;
    public final a2 f4322r0;
    public final zq[] f4323s0;
    public final zq[] f4324t0;
    public boolean f4325u0;
    public k71 f4326v0;
    public final u61 f4327w0;

    public b1(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.u6 u6Var, a2 a2Var) {
        super(context, null, true, false, 2, u6Var);
        TLRPC.User user;
        b6.i iVar = new b6.i(6);
        rf.b[] bVarArr = (rf.b[]) iVar.f3670b;
        this.m0 = iVar;
        this.f4323s0 = new zq[1];
        this.f4324t0 = new zq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f4307b0 = j10;
        this.Z = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.f4306a0 = org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2);
        this.f4322r0 = a2Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = ca.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        bg.b bVar = bg.b.f3980a;
        bg.a g7 = bg.a.g(j12, bVar);
        bg.a g10 = bg.a.g(Math.max(g7.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        bg.b bVar2 = bg.b.f3981b;
        bg.a i11 = bg.a.i(Math.max(g7.e(bVar2).n(2).f3979b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        bg.a i12 = bg.a.i(Math.max(i11.f3979b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        bg.b bVar3 = g7.f3978a;
        if (bVar3 == g10.f3978a) {
            bVarArr[bVar3.ordinal()] = new rf.b(9, g7, g10);
        }
        bg.b bVar4 = i11.f3978a;
        if (bVar4 == i12.f3978a) {
            bVarArr[bVar4.ordinal()] = new rf.b(9, i11, i12);
        }
        c cVar = new c(context, i10, u6Var);
        this.Y = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, kb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        kb1.b(cVar);
        cVar.setOnClickListener(new w0(this, context, u6Var, 0));
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23428h5);
        this.X = this.navBarColor;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f4310e0 = editTextBoldCursor;
        if (j11) {
            w40 w40Var = new w40(context, u6Var);
            this.f4308c0 = w40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            w40Var.b(arrayList, new x0(this, 0));
            linearLayout.addView(w40Var, kb1.o(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f4308c0 = null;
        }
        LinearLayout d = wh.d(context, 1);
        linearLayout.addView(d, kb1.p(1.0f, -1, -2));
        sd0 sd0Var = new sd0(context, null);
        this.f4309d0 = sd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        sd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        sd0Var.e(editTextBoldCursor);
        sd0Var.b(1.0f, 0.0f, false);
        sd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 2));
        sd0Var.addView(editTextBoldCursor, kb1.i(-1, -2, 48));
        d.addView(sd0Var, kb1.o(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f4316k0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        sd0Var.addView(imageView, kb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f4317l0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        sd0Var.addView(imageView2, kb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f4315j0 = s6Var;
        int i14 = org.telegram.ui.ActionBar.y6.f23749y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i14, null);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        sd0Var.addView(s6Var, kb1.h(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4311f0 = textView;
        textView.setTextSize(1, 13.0f);
        d.addView(textView, kb1.x(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f4312g0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i13, null);
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        sd0 sd0Var2 = new sd0(context, null);
        sd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        sd0Var2.e(editTextBoldCursor2);
        sd0Var2.addView((View) editTextBoldCursor2, kb1.h(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        kb1.c(sd0Var2, 0.02f, 1.2f);
        sd0Var2.setOnClickListener(new q(1, this, context));
        d.addView(sd0Var2, kb1.o(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.W5, u6Var, PorterDuff.Mode.SRC_IN);
        sd0Var2.addView(imageView3, kb1.h(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f4313h0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        d.addView(textView2, kb1.x(-1, -2, 55, 33, 4, 33, 0));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f4314i0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                b1.Q(b1.this, i10, context, u6Var, j10);
            }
        });
        U(bg.a.i(0L, bVar), false, true, false);
        if (this.f4319o0 != 86400) {
            this.f4319o0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new a1(this));
        FrameLayout.LayoutParams h = kb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = h.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        h.leftMargin = i15 + i16;
        h.rightMargin += i16;
        this.containerView.addView(dVar, h);
        nm0 nm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f4327w0 = u61.k(linearLayout);
        this.f4326v0.O(false);
    }

    public static void P(b1 b1Var, long j10, boolean z10, bg.a aVar, long j11, org.telegram.ui.ActionBar.e2 e2Var) {
        bg.a aVar2;
        bg.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = b1Var.currentAccount;
            bg.b bVar = bg.b.f3980a;
            ca x9 = ca.x(i12, bVar);
            if (x9.e) {
                aVar2 = bg.a.l(x9.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = bg.a.g(j10, bVar);
            } else {
                i10 = bg.a.i(b1Var.f4318n0.f3979b + aVar.f3979b, bVar);
            }
            if (aVar2 == null || aVar2.f3979b < i10.f3979b) {
                new tc(b1Var.getContext(), b1Var.resourcesProvider, i10.a(), 14, null, null, b1Var.f4307b0).show();
                return;
            }
        }
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = b1Var.f4318n0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(b1Var.currentAccount).getInputPeer(b1Var.f4307b0);
        tL_sendStarGiftOffer.duration = b1Var.f4319o0;
        tL_sendStarGiftOffer.slug = b1Var.Z.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(b1Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new t0(b1Var, h, e2Var, 0));
    }

    public static void Q(b1 b1Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10) {
        bg.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (b1Var.f4314i0.f10686c0) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            ca x9 = ca.x(i10, b1Var.f4318n0.f3978a);
            if (x9.e) {
                aVar = bg.a.l(x9.p());
            } else {
                aVar = null;
            }
            bg.b bVar = bg.b.f3980a;
            bg.b bVar2 = bg.b.f3981b;
            if (aVar != null) {
                long j11 = aVar.f3979b;
                bg.a aVar2 = b1Var.f4318n0;
                if (j11 >= aVar2.f3979b) {
                    String str2 = b1Var.f4306a0;
                    long j12 = b1Var.f4307b0;
                    String d = aVar2.d();
                    if (b1Var.f4318n0.f3978a == bVar2) {
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
                    int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
                    org.telegram.messenger.t.r(textView, i11, b1Var.resourcesProvider, 1, 20.0f);
                    linearLayout.addView(textView, kb1.x(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b1Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView2, i11, b1Var.resourcesProvider);
                    textView2.setTextSize(1, 16.0f);
                    if (b1Var.f4318n0.f3978a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, kb1.x(-1, -2, 48, 24, 4, 24, 4));
                    x01 x01Var = new x01(b1Var.getContext(), b1Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b1Var.currentAccount).getSendPaidMessagesStars(j12);
                    final bg.a g7 = bg.a.g(sendPaidMessagesStars, bVar);
                    x01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), dd.W0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        x01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), dd.W0(false, LocaleController.formatString(R.string.GiftOfferAmount, g7.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    x01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b1Var.f4319o0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(x01Var, kb1.x(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b1Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) dd.R0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, dd.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), dd.P0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g7.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) dd.P0(LocaleController.formatString(R.string.GiftOfferPay, bg.a.i(b1Var.f4318n0.f3979b + g7.f3979b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                        alertDialog$Builder.o(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i13) {
                                b1.P(b1.this, sendPaidMessagesStars, z12, g7, nextRandomId, e2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.Z0 = true;
                        e2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                    alertDialog$Builder2.o(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i13) {
                            b1.P(b1.this, sendPaidMessagesStars, z122, g7, nextRandomId, e2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                    e2Var2.Z0 = true;
                    e2Var2.show();
                    return;
                }
            }
            bg.a aVar3 = b1Var.f4318n0;
            bg.b bVar3 = aVar3.f3978a;
            if (bVar3 == bVar) {
                new tc(context, u6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new gi.g(context, u6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(b1 b1Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b1Var.currentAccount).lambda$processUpdates$379(updates, false);
        }
        AndroidUtilities.runOnUIThread(new u0(b1Var, cVar, e2Var, updates, tL_error, 0));
    }

    public final void S() {
        boolean z10;
        float f7;
        boolean z11 = this.f4325u0;
        c cVar = this.Y;
        if ((z11 && !isDismissed() && cVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f4308c0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4321q0 != z10) {
            this.f4321q0 = z10;
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
                wh.p(scaleY, f11, 180L);
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11;
        if (this.f4320p0 == 0 && this.f4318n0.f3979b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        fi.d dVar = this.f4314i0;
        if (dVar.f10686c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                wh.p(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void U(bg.a aVar, boolean z10, boolean z11, boolean z12) {
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
        zq[] zqVarArr;
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
        bg.a aVar2 = this.f4318n0;
        int i16 = this.f4320p0;
        this.f4320p0 = 0;
        if (aVar != null) {
            this.f4318n0 = aVar;
        } else {
            this.f4318n0 = bg.a.i(0L, aVar2.f3978a);
            this.f4320p0 |= 1;
        }
        bg.b bVar = this.f4318n0.f3978a;
        b6.i iVar = this.m0;
        rf.b[] bVarArr = (rf.b[]) iVar.f3670b;
        long j10 = ((bg.a) ((rf.b[]) iVar.f3670b)[bVar.ordinal()].f47371c).f3979b;
        bg.a aVar3 = this.f4318n0;
        if (j10 < aVar3.f3979b) {
            this.f4320p0 |= 4;
        }
        if (!aVar3.k() && ((bg.a) bVarArr[this.f4318n0.f3978a.ordinal()].f47370b).f3979b > this.f4318n0.f3979b) {
            this.f4320p0 |= 2;
        }
        if (!z11 && aVar2.f3978a == this.f4318n0.f3978a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f3979b == this.f4318n0.f3979b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f4320p0) {
            z15 = false;
        } else {
            z15 = true;
        }
        bg.b bVar2 = bg.b.f3980a;
        EditTextBoldCursor editTextBoldCursor = this.f4310e0;
        bg.b bVar3 = bg.b.f3981b;
        if (z13) {
            w40 w40Var = this.f4308c0;
            if (w40Var != null) {
                if (this.f4318n0.f3978a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                w40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f4307b0);
            bg.b bVar4 = this.f4318n0.f3978a;
            TextView textView = this.f4313h0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((bg.a) bVarArr[this.f4318n0.f3978a.ordinal()].f47371c).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((bg.a) bVarArr[this.f4318n0.f3978a.ordinal()].f47371c).a()).length() + 3)});
            }
            ImageView imageView = this.f4317l0;
            ImageView imageView2 = this.f4316k0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                z17 = false;
                if (this.f4318n0.f3978a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.f4318n0.f3978a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.f4318n0.f3978a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f4318n0.f3978a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.f4318n0.f3978a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.f4318n0.f3978a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                z17 = false;
                if (this.f4318n0.f3978a == bVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.f4318n0.f3978a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            c cVar = this.Y;
            r16 = z17;
            if (cVar != null) {
                bg.b bVar5 = this.f4318n0.f3978a;
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
            if (this.f4318n0.f3978a == bVar2) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f4309d0.setText(LocaleController.getString(i10));
            bg.b bVar6 = this.f4318n0.f3978a;
            int i17 = this.f4320p0;
            int i18 = i17 & 4;
            String str = this.f4306a0;
            TextView textView2 = this.f4311f0;
            if (i18 != 0) {
                if (bVar6 == bVar2) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((bg.a) bVarArr[bVar6.ordinal()].f47371c).d();
                objArr[1] = str;
                wh.o(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((bg.a) bVarArr[bVar6.ordinal()].f47370b).d();
                objArr2[1] = str;
                wh.o(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                wh.o(i11, objArr3, textView2);
            }
            if ((this.f4320p0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.y6.f23749y6;
            } else {
                i13 = org.telegram.ui.ActionBar.y6.f23599q7;
            }
            org.telegram.ui.ActionBar.f7.V(textView2, i13, this.resourcesProvider);
        }
        if (z13 || z14 || z15) {
            bg.a aVar4 = this.f4318n0;
            if (aVar4.f3978a == bVar3) {
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
                zqVarArr = this.f4324t0;
            } else {
                zqVarArr = this.f4323s0;
            }
            this.f4314i0.i(dd.o1(dd.U0(z16, formatString, zqVarArr), z16), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f4318n0.f3978a == bVar3) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.f4318n0.c() * d * 100.0d), "USD", 2));
            this.f4315j0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f4318n0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (this.f4321q0 && (cVar = this.Y) != null && f7 >= cVar.getX() && f7 <= cVar.getX() + cVar.getWidth() && f10 >= cVar.getY() && f10 <= cVar.getY() + cVar.getHeight()) {
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
        this.f4325u0 = true;
        S();
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor == this.X && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5)) != this.navBarColor) {
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
        AndroidUtilities.runOnUIThread(new a3.d(this, 19), 50L);
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 5), this.resourcesProvider);
        this.f4326v0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
