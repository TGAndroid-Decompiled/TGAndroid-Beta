package mh;

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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.x51;
public final class m0 extends org.telegram.ui.Components.sa {
    public static final int[] f14421t0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final b U;
    public final TL_stars.TL_starGiftUnique V;
    public final String W;
    public final long X;
    public final p40 Y;
    public final cd0 Z;
    public final EditTextBoldCursor f14422a0;
    public final TextView f14423b0;
    public final k0 f14424c0;
    public final TextView f14425d0;
    public final qh.d f14426e0;
    public final org.telegram.ui.Components.k6 f14427f0;
    public final ImageView f14428g0;
    public final ImageView f14429h0;
    public final ja.c f14430i0;
    public mf.a f14431j0;
    public int f14432k0;
    public int f14433l0;
    public boolean m0;
    public final s1 f14434n0;
    public final oq[] f14435o0;
    public final oq[] f14436p0;
    public boolean f14437q0;
    public x51 f14438r0;
    public final j51 f14439s0;

    public m0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.g6 g6Var, s1 s1Var) {
        super(context, null, true, false, false, false, false, 2, g6Var);
        TLRPC.User user;
        ja.c cVar = new ja.c(24);
        f7.b[] bVarArr = (f7.b[]) cVar.f9988a;
        this.f14430i0 = cVar;
        this.f14435o0 = new oq[1];
        this.f14436p0 = new oq[1];
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.X = j10;
        this.V = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.W = l.d.l(tL_starGiftUnique.num, ',', sb);
        this.f14434n0 = s1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = t7.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        mf.b bVar = mf.b.f13651a;
        mf.a g10 = mf.a.g(j12, bVar);
        mf.a g11 = mf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        mf.b bVar2 = mf.b.f13652b;
        mf.a i11 = mf.a.i(Math.max(g10.e(bVar2).n(2).f13650b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        mf.a i12 = mf.a.i(Math.max(i11.f13650b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        mf.b bVar3 = g10.f13649a;
        if (bVar3 == g11.f13649a) {
            bVarArr[bVar3.ordinal()] = new f7.b(28, g10, g11);
        }
        mf.b bVar4 = i11.f13649a;
        if (bVar4 == i12.f13649a) {
            bVarArr[bVar4.ordinal()] = new f7.b(28, i11, i12);
        }
        b bVar5 = new b(context, i10, g6Var);
        this.U = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(false);
        bVar5.setClickable(false);
        this.container.addView(bVar5, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.e6.a(bVar5);
        bVar5.setOnClickListener(new eg.o(this, context, g6Var, 7));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f14422a0 = editTextBoldCursor;
        if (j11) {
            p40 p40Var = new p40(context, g6Var);
            this.Y = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            p40Var.b(arrayList, new i0(this, 0));
            linearLayout.addView(p40Var, k7.c6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.Y = null;
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f10, k7.c6.l(1.0f, -1, -2));
        cd0 cd0Var = new cd0(context, null);
        this.Z = cd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        cd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        cd0Var.e(editTextBoldCursor);
        cd0Var.b(1.0f, 0.0f, false);
        cd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new dg.z(this, 3));
        cd0Var.addView(editTextBoldCursor, k7.c6.e(-1, -2, 48));
        f10.addView(cd0Var, k7.c6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f14428g0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        cd0Var.addView(imageView, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f14429h0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        cd0Var.addView(imageView2, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f14427f0 = k6Var;
        int i14 = org.telegram.ui.ActionBar.k6.f22036y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        cd0Var.addView(k6Var, k7.c6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f14423b0 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f14424c0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        cd0 cd0Var2 = new cd0(context, null);
        cd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        cd0Var2.e(editTextBoldCursor2);
        cd0Var2.addView((View) editTextBoldCursor2, k7.c6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.e6.b(cd0Var2, 0.02f, 1.2f);
        cd0Var2.setOnClickListener(new dg.n(17, this, context));
        f10.addView(cd0Var2, k7.c6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W5, g6Var), PorterDuff.Mode.SRC_IN));
        cd0Var2.addView(imageView3, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f14425d0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f14426e0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                m0.Q(m0.this, i10, context, g6Var, j10);
            }
        });
        U(mf.a.i(0L, bVar), false, true, false);
        if (this.f14432k0 != 86400) {
            this.f14432k0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new l0(this));
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        tl0 tl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f14439s0 = j51.k(linearLayout);
        this.f14438r0.N(false);
    }

    public static void P(m0 m0Var, long j10, boolean z4, mf.a aVar, long j11, org.telegram.ui.ActionBar.d2 d2Var) {
        mf.a aVar2;
        mf.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = m0Var.currentAccount;
            mf.b bVar = mf.b.f13651a;
            t7 x10 = t7.x(i12, bVar);
            if (x10.f14831e) {
                aVar2 = mf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z4) {
                i10 = mf.a.g(j10, bVar);
            } else {
                i10 = mf.a.i(m0Var.f14431j0.f13650b + aVar.f13650b, bVar);
            }
            if (aVar2 == null || aVar2.f13650b < i10.f13650b) {
                new z9(m0Var.getContext(), m0Var.resourcesProvider, i10.a(), 14, null, null, m0Var.X).show();
                return;
            }
        }
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = m0Var.f14431j0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(m0Var.currentAccount).getInputPeer(m0Var.X);
        tL_sendStarGiftOffer.duration = m0Var.f14432k0;
        tL_sendStarGiftOffer.slug = m0Var.V.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(m0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new lh.a0(m0Var, g10, d2Var, 2));
    }

    public static void Q(m0 m0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10) {
        mf.a aVar;
        String str;
        boolean z4;
        String formatString;
        ?? r14;
        boolean z10;
        if (m0Var.f14426e0.T) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.c.b(i10);
                return;
            }
            t7 x10 = t7.x(i10, m0Var.f14431j0.f13649a);
            if (x10.f14831e) {
                aVar = mf.a.l(x10.p());
            } else {
                aVar = null;
            }
            mf.b bVar = mf.b.f13651a;
            mf.b bVar2 = mf.b.f13652b;
            if (aVar != null) {
                long j11 = aVar.f13650b;
                mf.a aVar2 = m0Var.f14431j0;
                if (j11 >= aVar2.f13650b) {
                    String str2 = m0Var.W;
                    long j12 = m0Var.X;
                    String d = aVar2.d();
                    if (m0Var.f14431j0.f13649a == bVar2) {
                        str = str2;
                        z4 = true;
                    } else {
                        str = str2;
                        z4 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(m0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(m0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
                    org.telegram.ui.b.w(i11, m0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, k7.c6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(m0Var.getContext());
                    org.telegram.ui.b.l(i11, m0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (m0Var.f14431j0.f13649a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, k7.c6.t(-1, -2, 48, 24, 4, 24, 4));
                    tz0 tz0Var = new tz0(m0Var.getContext(), m0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(m0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final mf.a g10 = mf.a.g(sendPaidMessagesStars, bVar);
                    tz0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), ja.X0(z4, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        tz0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), ja.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    tz0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", m0Var.f14432k0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(tz0Var, k7.c6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(m0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) ja.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z4));
                    } else if (z4) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, ja.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), ja.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z10 = z4;
                        spannableStringBuilder.append((CharSequence) ja.Q0(LocaleController.formatString(R.string.GiftOfferPay, mf.a.i(m0Var.f14431j0.f13650b + g10.f13650b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m0Var.getContext(), 0, m0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z11 = z10;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() {
                            @Override
                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i13) {
                                m0.P(m0.this, sendPaidMessagesStars, z11, g10, nextRandomId, d2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.U0 = true;
                        d2Var.show();
                        return;
                    }
                    z10 = z4;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m0Var.getContext(), 0, m0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z112 = z10;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() {
                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                            m0.P(m0.this, sendPaidMessagesStars, z112, g10, nextRandomId, d2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21166a;
                    d2Var2.U0 = true;
                    d2Var2.show();
                    return;
                }
            }
            mf.a aVar3 = m0Var.f14431j0;
            mf.b bVar3 = aVar3.f13649a;
            if (bVar3 == bVar) {
                new z9(context, g6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new rh.f(context, g6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(m0 m0Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(m0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new hg.j0(5, m0Var, fVar, d2Var, updates, tL_error));
    }

    public final void S() {
        boolean z4;
        float f10;
        boolean z10 = this.f14437q0;
        b bVar = this.U;
        if ((z10 && !isDismissed() && bVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.Y == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.m0 != z4) {
            this.m0 = z4;
            if (bVar != null) {
                bVar.setEnabled(z4);
                bVar.setClickable(z4);
                ViewPropertyAnimator animate = bVar.animate();
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
        if (this.f14433l0 == 0 && this.f14431j0.f13650b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qh.d dVar = this.f14426e0;
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

    public final void U(mf.a aVar, boolean z4, boolean z10, boolean z11) {
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
        oq[] oqVarArr;
        double d;
        float f10;
        float f11;
        mf.b bVar;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        mf.a aVar2 = this.f14431j0;
        int i16 = this.f14433l0;
        this.f14433l0 = 0;
        if (aVar != null) {
            this.f14431j0 = aVar;
        } else {
            this.f14431j0 = mf.a.i(0L, aVar2.f13649a);
            this.f14433l0 |= 1;
        }
        mf.b bVar2 = this.f14431j0.f13649a;
        ja.c cVar = this.f14430i0;
        f7.b[] bVarArr = (f7.b[]) cVar.f9988a;
        long j10 = ((mf.a) ((f7.b[]) cVar.f9988a)[bVar2.ordinal()].f6121c).f13650b;
        mf.a aVar3 = this.f14431j0;
        if (j10 < aVar3.f13650b) {
            this.f14433l0 |= 4;
        }
        if (!aVar3.k() && ((mf.a) bVarArr[this.f14431j0.f13649a.ordinal()].f6120b).f13650b > this.f14431j0.f13650b) {
            this.f14433l0 |= 2;
        }
        if (!z10 && aVar2.f13649a == this.f14431j0.f13649a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar2.f13650b == this.f14431j0.f13650b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i16 == this.f14433l0) {
            z14 = false;
        } else {
            z14 = true;
        }
        mf.b bVar3 = mf.b.f13651a;
        EditTextBoldCursor editTextBoldCursor = this.f14422a0;
        mf.b bVar4 = mf.b.f13652b;
        if (z12) {
            p40 p40Var = this.Y;
            if (p40Var != null) {
                if (this.f14431j0.f13649a == bVar3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                p40Var.a(i15, z11);
            }
            String shortName = DialogObject.getShortName(this.X);
            mf.b bVar5 = this.f14431j0.f13649a;
            TextView textView = this.f14425d0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((mf.a) bVarArr[this.f14431j0.f13649a.ordinal()].f6121c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((mf.a) bVarArr[this.f14431j0.f13649a.ordinal()].f6121c).a()).length() + 3)});
            }
            ImageView imageView = this.f14429h0;
            ImageView imageView2 = this.f14428g0;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                c3 = 0;
                if (this.f14431j0.f13649a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f14431j0.f13649a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f14431j0.f13649a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f14431j0.f13649a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f14431j0.f13649a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f14431j0.f13649a == bVar4) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                c3 = 0;
                if (this.f14431j0.f13649a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f14431j0.f13649a == bVar4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar6 = this.U;
            if (bVar6 != null && bVar6.f13719e != (bVar = this.f14431j0.f13649a)) {
                bVar6.f13719e = bVar;
                bVar6.a();
            }
        } else {
            c3 = 0;
        }
        if (z12 || z14) {
            if (this.f14431j0.f13649a == bVar3) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.Z.setText(LocaleController.getString(i10));
            mf.b bVar7 = this.f14431j0.f13649a;
            int i17 = this.f14433l0;
            int i18 = i17 & 4;
            String str = this.W;
            TextView textView2 = this.f14423b0;
            if (i18 != 0) {
                if (bVar7 == bVar3) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c3] = ((mf.a) bVarArr[bVar7.ordinal()].f6121c).d();
                objArr[1] = str;
                org.telegram.ui.b.o(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar7 == bVar3) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c3] = ((mf.a) bVarArr[bVar7.ordinal()].f6120b).d();
                objArr2[1] = str;
                org.telegram.ui.b.o(i12, objArr2, textView2);
            } else {
                if (bVar7 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c3] = str;
                org.telegram.ui.b.o(i11, objArr3, textView2);
            }
            if ((this.f14433l0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.k6.f22036y6;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f21895q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z12 || z13 || z14) {
            mf.a aVar4 = this.f14431j0;
            if (aVar4.f13649a == bVar4) {
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
                oqVarArr = this.f14436p0;
            } else {
                oqVarArr = this.f14435o0;
            }
            this.f14426e0.g(ja.V0(z15, formatString, oqVarArr), z11, true);
            T(z11);
        }
        if (z12 || z13) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            if (this.f14431j0.f13649a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb.append(BillingController.getInstance().formatCurrency((long) (this.f14431j0.c() * d * 100.0d), "USD", 2));
            this.f14427f0.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.f14431j0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (this.m0 && (bVar = this.U) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
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
        this.f14437q0 = true;
        S();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new lh.c3(this, 4), 50L);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 16), this.resourcesProvider);
        this.f14438r0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
