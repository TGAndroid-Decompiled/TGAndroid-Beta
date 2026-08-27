package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.rn;

public final class t0 extends org.telegram.ui.ActionBar.e3 {
    public final hf.a A;
    public final hf.a B;
    public final hf.a C;
    public hf.a D;
    public long E;
    public int F;
    public boolean G;
    public final cq[] H;
    public final cq[] I;
    public boolean J;

    public final b f10037b;

    public final boolean f10038c;
    public final int d;

    public final a40 f10039e;

    public final jc0 f10040f;
    public final EditTextBoldCursor h;

    public final TextView f10041n;

    public final r0 f10042r;

    public final lh.d f10043s;
    public final org.telegram.ui.Components.j6 v;

    public final ImageView f10044w;

    public final ImageView f10045x;

    public final hf.a f10046y;

    public t0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, rn rnVar, final org.telegram.ui.ActionBar.c6 c6Var, int i11, Utilities.Callback callback) {
        boolean z10;
        super(context, c6Var, true, false);
        final int i12 = 0;
        this.E = -1L;
        this.H = new cq[1];
        this.I = new cq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean zCanManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f10038c = zCanManageMonoForum;
        boolean z11 = zCanManageMonoForum || u7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        hf.b bVar = hf.b.f8922b;
        this.B = hf.a.i(j11, bVar);
        this.C = hf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        hf.b bVar2 = hf.b.f8921a;
        this.f10046y = hf.a.g(j12, bVar2);
        this.A = hf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (zCanManageMonoForum) {
            this.f10037b = null;
        } else {
            b bVar3 = new b(context, i10, c6Var);
            this.f10037b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            h7.b6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) {

                public final t0 f9852b;

                {
                    this.f9852b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.f9852b.D.f8919a == hf.b.f8921a) {
                                new fa(context, c6Var).show();
                            }
                            break;
                        default:
                            t0 t0Var = this.f9852b;
                            org.telegram.ui.Components.y4.T(context, t0Var.E, new h3.x(t0Var, 5), c6Var, 0).f23994a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        linearLayout.addView(linearLayoutG, h7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayoutG.addView(textView, h7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.g6.W5;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        h7.b6.a(imageView);
        imageView.setOnClickListener(new ag.w0(this, 11));
        linearLayoutG.addView(imageView, h7.z5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            a40 a40Var = new a40(context, c6Var);
            this.f10039e = a40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            a40Var.b(arrayList, new k0(this, 1));
            linearLayout.addView(a40Var, h7.z5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f10039e = null;
        }
        LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context, 1);
        linearLayout.addView(linearLayoutG2, h7.z5.l(1.0f, -1, -2));
        jc0 jc0Var = new jc0(context, null);
        this.f10040f = jc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        jc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        jc0Var.e(editTextBoldCursor);
        hf.a aVar = messageSuggestionParams.amount;
        jc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        jc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 2));
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        linearLayoutG2.addView(jc0Var, h7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f10044w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        jc0Var.addView(imageView2, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f10045x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        jc0Var.addView(imageView3, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.v = j6Var;
        int i15 = org.telegram.ui.ActionBar.g6.f23423y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        jc0Var.addView(j6Var, h7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f10041n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        linearLayoutG2.addView(textView2, h7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        r0 r0Var = new r0(context);
        this.f10042r = r0Var;
        r0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        r0Var.setCursorWidth(1.5f);
        r0Var.setTextSize(1, 17.0f);
        r0Var.setMaxLines(1);
        r0Var.setBackground(null);
        r0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        r0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        r0Var.setFocusable(false);
        r0Var.setClickable(false);
        r0Var.setEnabled(false);
        jc0 jc0Var2 = new jc0(context, null);
        jc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        jc0Var2.e(r0Var);
        jc0Var2.addView(r0Var, h7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        h7.b6.b(jc0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        jc0Var2.setOnClickListener(new View.OnClickListener(this) {

            public final t0 f9852b;

            {
                this.f9852b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.f9852b.D.f8919a == hf.b.f8921a) {
                            new fa(context, c6Var).show();
                        }
                        break;
                    default:
                        t0 t0Var = this.f9852b;
                        org.telegram.ui.Components.y4.T(context, t0Var.E, new h3.x(t0Var, 5), c6Var, 0).f23994a.show();
                        break;
                }
            }
        });
        linearLayoutG2.addView(jc0Var2, h7.z5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        jc0Var2.addView(imageView4, h7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        linearLayoutG2.addView(textView3, h7.z5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, h7.z5.q(-1, -2, 80));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.f10043s = dVar;
        dVar.setOnClickListener(new q0(this, rnVar, i10, context, c6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, h7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        hf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            r(hf.a.i(aVar2.f8920b, aVar2.f8919a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            r(hf.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.E != j13) {
            this.E = j13;
            r0Var.setText(p(j13));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new s0(this));
    }

    public static String p(long j10) {
        if (j10 <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String dateTime = LocaleController.formatDateTime(j10, true);
        if (dateTime.isEmpty()) {
            return dateTime;
        }
        return Character.toUpperCase(dateTime.charAt(0)) + dateTime.substring(1);
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (!this.G || (bVar = this.f10037b) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    public final void m() {
        boolean z10 = this.J;
        b bVar = this.f10037b;
        boolean z11 = (z10 && !isDismissed() && bVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.f10039e == null;
        if (this.G != z11) {
            this.G = z11;
            if (bVar != null) {
                bVar.setEnabled(z11);
                bVar.setClickable(z11);
                bVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11 = this.F == 0 && (this.D.f8920b >= 0 || this.E > 0);
        lh.d dVar = this.f10043s;
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

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        m();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.J = true;
        m();
    }

    public final hf.a q() {
        return this.D.f8919a == hf.b.f8922b ? this.C : this.A;
    }

    public final void r(hf.a aVar, boolean z10, boolean z11, boolean z12) {
        char c10;
        hf.b bVar;
        hf.a aVar2 = this.D;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.D = aVar;
        } else {
            this.D = hf.a.i(0L, aVar2.f8919a);
            this.F |= 1;
        }
        long j10 = q().f8920b;
        hf.a aVar3 = this.D;
        if (j10 < aVar3.f8920b) {
            this.F |= 4;
        }
        boolean zK = aVar3.k();
        hf.a aVar4 = this.f10046y;
        hf.a aVar5 = this.B;
        hf.b bVar2 = hf.b.f8922b;
        if (!zK) {
            hf.a aVar6 = this.D;
            if ((aVar6.f8919a == bVar2 ? aVar5 : aVar4).f8920b > aVar6.f8920b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar2.f8919a != this.D.f8919a;
        boolean z14 = z11 || aVar2.f8920b != this.D.f8920b;
        boolean z15 = z11 || i10 != this.F;
        jc0 jc0Var = this.f10040f;
        if (z15) {
            jc0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        hf.b bVar3 = hf.b.f8921a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            a40 a40Var = this.f10039e;
            if (a40Var != null) {
                a40Var.a(this.D.f8919a == bVar3 ? 0 : 1, z12);
            }
            hf.b bVar4 = this.D.f8919a;
            TextView textView = this.f10041n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(q().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(q().a()).length() + 3)});
            }
            ImageView imageView = this.f10045x;
            ImageView imageView2 = this.f10044w;
            if (z12) {
                imageView2.animate().alpha(this.D.f8919a == bVar3 ? 1.0f : 0.0f).scaleX(this.D.f8919a == bVar3 ? 1.0f : 0.0f).scaleY(this.D.f8919a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.D.f8919a == bVar2 ? 1.0f : 0.0f).scaleX(this.D.f8919a == bVar2 ? 1.0f : 0.0f).scaleY(this.D.f8919a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.D.f8919a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.D.f8919a == bVar2 ? 1.0f : 0.0f);
            }
            b bVar5 = this.f10037b;
            if (bVar5 != null && bVar5.f8981e != (bVar = this.D.f8919a)) {
                bVar5.f8981e = bVar;
                bVar5.a();
            }
        } else {
            aVar4 = aVar4;
            c10 = 0;
        }
        if (z13 || z15) {
            int i11 = this.F;
            if ((i11 & 4) != 0) {
                int i12 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = q().f();
                jc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.D.f8919a == bVar2 ? aVar5 : aVar4).f();
                jc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                jc0Var.setText(LocaleController.getString(this.D.f8919a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.d;
            lh.d dVar = this.f10043s;
            if (i14 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.D.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                hf.a aVar7 = this.D;
                boolean z16 = aVar7.f8919a == bVar2;
                int i15 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = z16 ? aVar7.b() : LocaleController.formatNumber(aVar7.a(), ',');
                dVar.g(oa.V0(z16, LocaleController.formatString(i15, objArr3), z16 ? this.I : this.H), z12, true);
            }
            n(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.D.c() * (this.D.f8919a == bVar2 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d) * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String strB = this.D.b();
            editTextBoldCursor.setText(strB);
            editTextBoldCursor.setSelection(strB.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f2.r(this, 19), 50L);
    }
}
