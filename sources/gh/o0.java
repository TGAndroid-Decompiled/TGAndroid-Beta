package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
public final class o0 extends org.telegram.ui.Components.sa {
    public static final int[] f8640s0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final b T;
    public final TL_stars.TL_starGiftUnique U;
    public final String V;
    public final long W;
    public final v30 X;
    public final fc0 Y;
    public final EditTextBoldCursor Z;
    public final TextView f8641a0;
    public final m0 f8642b0;
    public final TextView f8643c0;
    public final kh.d f8644d0;
    public final org.telegram.ui.Components.j6 f8645e0;
    public final ImageView f8646f0;
    public final ImageView f8647g0;
    public final xa.c f8648h0;
    public gf.a f8649i0;
    public int f8650j0;
    public int f8651k0;
    public boolean f8652l0;
    public final v1 m0;
    public final eq[] f8653n0;
    public final eq[] f8654o0;
    public boolean f8655p0;
    public z41 f8656q0;
    public final l41 f8657r0;

    public o0(final Context context, final int i9, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.b6 b6Var, v1 v1Var) {
        super(context, null, true, false, false, false, false, 2, b6Var);
        TLRPC.User user;
        xa.c cVar = new xa.c(16);
        g5.b[] bVarArr = (g5.b[]) cVar.f49099b;
        this.f8648h0 = cVar;
        this.f8653n0 = new eq[1];
        this.f8654o0 = new eq[1];
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.W = j10;
        this.U = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.V = j3.r0.n(tL_starGiftUnique.num, ',', sb2);
        this.m0 = v1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = v7.y(i9, true).j();
        if (j10 > 0 && MessagesController.getInstance(i9).getUserFull(j10) == null && (user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i9).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i9).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        gf.b bVar = gf.b.f7749a;
        gf.a g10 = gf.a.g(j12, bVar);
        gf.a g11 = gf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        gf.b bVar2 = gf.b.f7750b;
        gf.a i10 = gf.a.i(Math.max(g10.e(bVar2).n(2).f7748b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        gf.a i11 = gf.a.i(Math.max(i10.f7748b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        gf.b bVar3 = g10.f7747a;
        if (bVar3 == g11.f7747a) {
            bVarArr[bVar3.ordinal()] = new g5.b(2, g10, g11);
        }
        gf.b bVar4 = i10.f7747a;
        if (bVar4 == i11.f7747a) {
            bVarArr[bVar4.ordinal()] = new g5.b(2, i10, i11);
        }
        b bVar5 = new b(context, i9, b6Var);
        this.T = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(false);
        bVar5.setClickable(false);
        this.container.addView(bVar5, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        g7.g6.a(bVar5);
        bVar5.setOnClickListener(new fg.f(this, context, b6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.Z = editTextBoldCursor;
        if (j11) {
            v30 v30Var = new v30(context, b6Var);
            this.X = v30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            v30Var.b(arrayList, new k0(this, 0));
            linearLayout.addView(v30Var, g7.e6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.X = null;
        }
        LinearLayout f10 = ll.f(context, 1);
        linearLayout.addView(f10, g7.e6.l(1.0f, -1, -2));
        fc0 fc0Var = new fc0(context, null);
        this.Y = fc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        editTextBoldCursor.requestFocus();
        fc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        fc0Var.e(editTextBoldCursor);
        fc0Var.b(1.0f, 0.0f, false);
        fc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 1));
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        f10.addView(fc0Var, g7.e6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f8646f0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        fc0Var.addView(imageView, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f8647g0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        fc0Var.addView(imageView2, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f8645e0 = j6Var;
        int i13 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        fc0Var.addView(j6Var, g7.e6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f8641a0 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f8642b0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        fc0 fc0Var2 = new fc0(context, null);
        fc0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        fc0Var2.e(editTextBoldCursor2);
        fc0Var2.addView((View) editTextBoldCursor2, g7.e6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        g7.g6.b(fc0Var2, 0.02f, 1.2f);
        fc0Var2.setOnClickListener(new bg.u1(13, this, context));
        f10.addView(fc0Var2, g7.e6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, b6Var), PorterDuff.Mode.SRC_IN));
        fc0Var2.addView(imageView3, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f8643c0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.f8644d0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                o0.P(o0.this, i9, context, b6Var, j10);
            }
        });
        T(gf.a.i(0L, bVar), false, true, false);
        if (this.f8650j0 != 86400) {
            this.f8650j0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        S(false);
        editTextBoldCursor.addTextChangedListener(new n0(this));
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        wk0 wk0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f8657r0 = l41.k(linearLayout);
        this.f8656q0.N(false);
    }

    public static void O(o0 o0Var, long j10, boolean z10, gf.a aVar, long j11, org.telegram.ui.ActionBar.c2 c2Var) {
        gf.a aVar2;
        gf.a i9;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            int i11 = o0Var.currentAccount;
            gf.b bVar = gf.b.f7749a;
            v7 x10 = v7.x(i11, bVar);
            if (x10.f9048e) {
                aVar2 = gf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i9 = gf.a.g(j10, bVar);
            } else {
                i9 = gf.a.i(o0Var.f8649i0.f7748b + aVar.f7748b, bVar);
            }
            if (aVar2 == null || aVar2.f7748b < i9.f7748b) {
                new ea(o0Var.getContext(), o0Var.resourcesProvider, i9.a(), 14, null, null, o0Var.W).show();
                return;
            }
        }
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = o0Var.f8649i0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(o0Var.currentAccount).getInputPeer(o0Var.W);
        tL_sendStarGiftOffer.duration = o0Var.f8650j0;
        tL_sendStarGiftOffer.slug = o0Var.U.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i10 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(o0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new fh.f0(o0Var, g10, c2Var, 2));
    }

    public static void P(o0 o0Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10) {
        gf.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (o0Var.f8644d0.S) {
            if (MessagesController.getInstance(i9).isFrozen()) {
                org.telegram.ui.b.b(i9);
                return;
            }
            v7 x10 = v7.x(i9, o0Var.f8649i0.f7747a);
            if (x10.f9048e) {
                aVar = gf.a.l(x10.p());
            } else {
                aVar = null;
            }
            gf.b bVar = gf.b.f7749a;
            gf.b bVar2 = gf.b.f7750b;
            if (aVar != null) {
                long j11 = aVar.f7748b;
                gf.a aVar2 = o0Var.f8649i0;
                if (j11 >= aVar2.f7748b) {
                    String str2 = o0Var.V;
                    long j12 = o0Var.W;
                    String d = aVar2.d();
                    if (o0Var.f8649i0.f7747a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(o0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
                    org.telegram.ui.Cells.j2.o(i10, o0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, g7.e6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(o0Var.getContext());
                    ll.n(i10, o0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (o0Var.f8649i0.f7747a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
                    wy0 wy0Var = new wy0(o0Var.getContext(), o0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(o0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final gf.a g10 = gf.a.g(sendPaidMessagesStars, bVar);
                    wy0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), oa.X0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i11 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i11 > 0) {
                        r14 = 0;
                        wy0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), oa.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    wy0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", o0Var.f8650j0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(wy0Var, g7.e6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(o0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i11 == 0) {
                        spannableStringBuilder.append((CharSequence) oa.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, oa.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), oa.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) oa.Q0(LocaleController.formatString(R.string.GiftOfferPay, gf.a.i(o0Var.f8649i0.f7748b + g10.f7748b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o0Var.getContext(), 0, o0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                                o0.O(o0.this, sendPaidMessagesStars, z12, g10, nextRandomId, c2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.T0 = true;
                        c2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o0Var.getContext(), 0, o0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                            o0.O(o0.this, sendPaidMessagesStars, z122, g10, nextRandomId, c2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.T0 = true;
                    c2Var2.show();
                    return;
                }
            }
            gf.a aVar3 = o0Var.f8649i0;
            gf.b bVar3 = aVar3.f7747a;
            if (bVar3 == bVar) {
                new ea(context, b6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new lh.f(context, b6Var, aVar3, true, null).show();
            }
        }
    }

    public static void Q(o0 o0Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(o0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new bg.o0((Object) o0Var, (Object) dVar, (Object) c2Var, (Object) updates, tL_error, 5));
    }

    public final void R() {
        boolean z10;
        float f10;
        boolean z11 = this.f8655p0;
        b bVar = this.T;
        if ((z11 && !isDismissed() && bVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.X == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f8652l0 != z10) {
            this.f8652l0 = z10;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                scaleY.alpha(f12).setDuration(180L).start();
            }
        }
    }

    public final void S(boolean z10) {
        boolean z11;
        if (this.f8651k0 == 0 && this.f8649i0.f7748b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        kh.d dVar = this.f8644d0;
        if (dVar.S != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f10 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(180L).start();
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            dVar.setAlpha(f10);
        }
    }

    public final void T(gf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        char c10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z16;
        String formatNumber;
        eq[] eqVarArr;
        double d;
        float f10;
        float f11;
        gf.b bVar;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i14;
        gf.a aVar2 = this.f8649i0;
        int i15 = this.f8651k0;
        this.f8651k0 = 0;
        if (aVar != null) {
            this.f8649i0 = aVar;
        } else {
            this.f8649i0 = gf.a.i(0L, aVar2.f7747a);
            this.f8651k0 |= 1;
        }
        gf.b bVar2 = this.f8649i0.f7747a;
        xa.c cVar = this.f8648h0;
        g5.b[] bVarArr = (g5.b[]) cVar.f49099b;
        long j10 = ((gf.a) ((g5.b[]) cVar.f49099b)[bVar2.ordinal()].f7112c).f7748b;
        gf.a aVar3 = this.f8649i0;
        if (j10 < aVar3.f7748b) {
            this.f8651k0 |= 4;
        }
        if (!aVar3.k() && ((gf.a) bVarArr[this.f8649i0.f7747a.ordinal()].f7111b).f7748b > this.f8649i0.f7748b) {
            this.f8651k0 |= 2;
        }
        if (!z11 && aVar2.f7747a == this.f8649i0.f7747a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f7748b == this.f8649i0.f7748b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i15 == this.f8651k0) {
            z15 = false;
        } else {
            z15 = true;
        }
        gf.b bVar3 = gf.b.f7749a;
        EditTextBoldCursor editTextBoldCursor = this.Z;
        gf.b bVar4 = gf.b.f7750b;
        if (z13) {
            v30 v30Var = this.X;
            if (v30Var != null) {
                if (this.f8649i0.f7747a == bVar3) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                v30Var.a(i14, z12);
            }
            String shortName = DialogObject.getShortName(this.W);
            gf.b bVar5 = this.f8649i0.f7747a;
            TextView textView = this.f8643c0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((gf.a) bVarArr[this.f8649i0.f7747a.ordinal()].f7112c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((gf.a) bVarArr[this.f8649i0.f7747a.ordinal()].f7112c).a()).length() + 3)});
            }
            ImageView imageView = this.f8647g0;
            ImageView imageView2 = this.f8646f0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                c10 = 0;
                if (this.f8649i0.f7747a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f8649i0.f7747a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f8649i0.f7747a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f8649i0.f7747a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f8649i0.f7747a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f8649i0.f7747a == bVar4) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                c10 = 0;
                if (this.f8649i0.f7747a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f8649i0.f7747a == bVar4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar6 = this.T;
            if (bVar6 != null && bVar6.f7823e != (bVar = this.f8649i0.f7747a)) {
                bVar6.f7823e = bVar;
                bVar6.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            if (this.f8649i0.f7747a == bVar3) {
                i9 = R.string.GiftOfferStarsToOffer;
            } else {
                i9 = R.string.GiftOfferTONToOffer;
            }
            this.Y.setText(LocaleController.getString(i9));
            gf.b bVar7 = this.f8649i0.f7747a;
            int i16 = this.f8651k0;
            int i17 = i16 & 4;
            String str = this.V;
            TextView textView2 = this.f8641a0;
            if (i17 != 0) {
                if (bVar7 == bVar3) {
                    i13 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i13 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c10] = ((gf.a) bVarArr[bVar7.ordinal()].f7112c).d();
                objArr[1] = str;
                ll.q(i13, objArr, textView2);
            } else if ((i16 & 2) != 0) {
                if (bVar7 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c10] = ((gf.a) bVarArr[bVar7.ordinal()].f7111b).d();
                objArr2[1] = str;
                ll.q(i11, objArr2, textView2);
            } else {
                if (bVar7 == bVar3) {
                    i10 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i10 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                ll.q(i10, objArr3, textView2);
            }
            if ((this.f8651k0 & (-9)) == 0) {
                i12 = org.telegram.ui.ActionBar.f6.f23369y6;
            } else {
                i12 = org.telegram.ui.ActionBar.f6.f23230q7;
            }
            textView2.setTextColor(getThemedColor(i12));
        }
        if (z13 || z14 || z15) {
            gf.a aVar4 = this.f8649i0;
            if (aVar4.f7747a == bVar4) {
                z16 = true;
            } else {
                z16 = false;
            }
            int i18 = R.string.GiftOfferButtonStars;
            if (z16) {
                formatNumber = aVar4.b();
            } else {
                formatNumber = LocaleController.formatNumber(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[c10] = formatNumber;
            String formatString = LocaleController.formatString(i18, objArr4);
            if (z16) {
                eqVarArr = this.f8654o0;
            } else {
                eqVarArr = this.f8653n0;
            }
            this.f8644d0.g(oa.V0(z16, formatString, eqVarArr), z12, true);
            S(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f8649i0.f7747a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.f8649i0.c() * d * 100.0d), "USD", 2));
            this.f8645e0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f8649i0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (this.f8652l0 && (bVar = this.T) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        R();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f8655p0 = true;
        R();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new fh.o1(this, 7), 50L);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 15), this.resourcesProvider);
        this.f8656q0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
