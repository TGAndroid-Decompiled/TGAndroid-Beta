package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.o40;
import org.telegram.ui.zn;
public final class s0 extends org.telegram.ui.ActionBar.g3 {
    public final lf.a B;
    public final lf.a C;
    public final lf.a D;
    public lf.a E;
    public long F;
    public int G;
    public boolean H;
    public final lq[] I;
    public final lq[] J;
    public boolean K;
    public final c f13033b;
    public final boolean f13034c;
    public final int d;
    public final o40 e;
    public final bd0 f13035f;
    public final EditTextBoldCursor h;
    public final TextView f13036n;
    public final q0 f13037r;
    public final ph.d f13038s;
    public final org.telegram.ui.Components.k6 v;
    public final ImageView f13039w;
    public final ImageView f13040x;
    public final lf.a f13041y;

    public s0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, zn znVar, final org.telegram.ui.ActionBar.f6 f6Var, int i11, Utilities.Callback callback) {
        super(context, f6Var, true, false);
        int i12;
        boolean z4;
        this.F = -1L;
        this.I = new lq[1];
        this.J = new lq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f13034c = canManageMonoForum;
        boolean z10 = canManageMonoForum || t7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        lf.b bVar = lf.b.f12057b;
        this.C = lf.a.i(j11, bVar);
        this.D = lf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        lf.b bVar2 = lf.b.f12056a;
        this.f13041y = lf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.B = lf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            c cVar = new c(context, i10, f6Var);
            this.f13033b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            k7.d6.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) {
                public final s0 f12849b;

                {
                    this.f12849b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f12849b.E.f12054a == lf.b.f12056a) {
                                new aa(context, f6Var).show();
                                return;
                            }
                            return;
                        default:
                            s0 s0Var = this.f12849b;
                            org.telegram.ui.Components.z4.T(context, s0Var.F, new gg.f(s0Var, 26), f6Var, 0).f19500a.show();
                            return;
                    }
                }
            });
        } else {
            this.f13033b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f10, k7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i11 == 0) {
            i12 = R.string.PostSuggestionsOfferTitle;
        } else {
            i12 = R.string.PostSuggestionsOfferChangeTitle;
        }
        textView.setText(LocaleController.getString(i12));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, k7.b6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.j6.W5;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        k7.d6.a(imageView);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 15));
        f10.addView(imageView, k7.b6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            o40 o40Var = new o40(context, f6Var);
            this.e = o40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            o40Var.b(arrayList, new j0(this, 1));
            linearLayout.addView(o40Var, k7.b6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f11, k7.b6.l(1.0f, -1, -2));
        bd0 bd0Var = new bd0(context, null);
        this.f13035f = bd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        bd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        bd0Var.e(editTextBoldCursor);
        lf.a aVar = messageSuggestionParams.amount;
        bd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        bd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 4));
        bd0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        f11.addView(bd0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f13039w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        bd0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f13040x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        bd0Var.addView(imageView3, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.v = k6Var;
        int i15 = org.telegram.ui.ActionBar.j6.f20256y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        bd0Var.addView(k6Var, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f13036n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f13037r = editTextBoldCursor2;
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
        bd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        bd0Var2.e(editTextBoldCursor2);
        bd0Var2.addView((View) editTextBoldCursor2, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.d6.b(bd0Var2, 0.02f, 1.2f);
        bd0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f12849b;

            {
                this.f12849b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f12849b.E.f12054a == lf.b.f12056a) {
                            new aa(context, f6Var).show();
                            return;
                        }
                        return;
                    default:
                        s0 s0Var = this.f12849b;
                        org.telegram.ui.Components.z4.T(context, s0Var.F, new gg.f(s0Var, 26), f6Var, 0).f19500a.show();
                        return;
                }
            }
        });
        f11.addView(bd0Var2, k7.b6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
        bd0Var2.addView(imageView4, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, k7.b6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.b6.q(-1, -2, 80));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.f13038s = dVar;
        dVar.setOnClickListener(new p0(this, znVar, i10, context, f6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, k7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        lf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z4 = false;
            q(lf.a.i(aVar2.f12055b, aVar2.f12054a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z4 = false;
            q(lf.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.F != j12) {
            this.F = j12;
            editTextBoldCursor2.setText(o(j12));
        }
        n(z4);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new r0(this));
    }

    public static String o(long j10) {
        if (j10 <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String formatDateTime = LocaleController.formatDateTime(j10, true);
        if (!formatDateTime.isEmpty()) {
            return Character.toUpperCase(formatDateTime.charAt(0)) + formatDateTime.substring(1);
        }
        return formatDateTime;
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        c cVar;
        if (this.H && (cVar = this.f13033b) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    public final void m() {
        boolean z4;
        float f10;
        boolean z10 = this.K;
        c cVar = this.f13033b;
        if ((z10 && !isDismissed() && cVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.e == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.H != z4) {
            this.H = z4;
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

    public final void n(boolean z4) {
        boolean z10;
        if (this.G == 0 && (this.E.f12055b >= 0 || this.F > 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ph.d dVar = this.f13038s;
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

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        m();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.K = true;
        m();
    }

    public final lf.a p() {
        if (this.E.f12054a == lf.b.f12057b) {
            return this.D;
        }
        return this.B;
    }

    public final void q(lf.a aVar, boolean z4, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        lf.a aVar2;
        char c3;
        int i10;
        lf.a aVar3;
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
        int i11;
        float f18;
        lf.a aVar4;
        lf.a aVar5 = this.E;
        int i12 = this.G;
        this.G = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = lf.a.i(0L, aVar5.f12054a);
            this.G |= 1;
        }
        long j10 = p().f12055b;
        lf.a aVar6 = this.E;
        if (j10 < aVar6.f12055b) {
            this.G |= 4;
        }
        boolean k10 = aVar6.k();
        lf.a aVar7 = this.f13041y;
        lf.a aVar8 = this.C;
        lf.b bVar2 = lf.b.f12057b;
        if (!k10) {
            lf.a aVar9 = this.E;
            if (aVar9.f12054a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f12055b > aVar9.f12055b) {
                this.G |= 2;
            }
        }
        if (!z10 && aVar5.f12054a == this.E.f12054a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar5.f12055b == this.E.f12055b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i12 == this.G) {
            z14 = false;
        } else {
            z14 = true;
        }
        bd0 bd0Var = this.f13035f;
        if (z14) {
            if ((this.G & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            bd0Var.a(f18);
        }
        lf.b bVar3 = lf.b.f12056a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z12) {
            c3 = 0;
            o40 o40Var = this.e;
            if (o40Var != null) {
                if (this.E.f12054a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                o40Var.a(i11, z11);
            }
            lf.b bVar4 = this.E.f12054a;
            TextView textView = this.f13036n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f13040x;
            ImageView imageView2 = this.f13039w;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f12054a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.E.f12054a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.E.f12054a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f12054a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.E.f12054a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.E.f12054a == bVar2) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f12054a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.E.f12054a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar = this.f13033b;
            if (cVar != null && cVar.e != (bVar = this.E.f12054a)) {
                cVar.e = bVar;
                cVar.a();
            }
        } else {
            aVar2 = aVar7;
            c3 = 0;
        }
        if (z12 || z14) {
            int i13 = this.G;
            if ((i13 & 4) != 0) {
                int i14 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = p().f();
                bd0Var.setText(LocaleController.formatString(i14, objArr));
            } else if ((i13 & 2) != 0) {
                int i15 = R.string.SuggestAPostTooSmall;
                if (this.E.f12054a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f19 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f19;
                bd0Var.setText(LocaleController.formatString(i15, objArr2));
            } else {
                if (this.E.f12054a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                bd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z12 || z13 || z14) {
            int i16 = this.d;
            ph.d dVar = this.f13038s;
            if (i16 == 0) {
                if (!this.E.k()) {
                    lf.a aVar10 = this.E;
                    if (aVar10.f12054a == bVar2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    int i17 = R.string.PostSuggestionsOfferStars;
                    if (z15) {
                        formatNumber = aVar10.b();
                    } else {
                        formatNumber = LocaleController.formatNumber(aVar10.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[c3] = formatNumber;
                    String formatString = LocaleController.formatString(i17, objArr3);
                    if (z15) {
                        lqVarArr = this.J;
                    } else {
                        lqVarArr = this.I;
                    }
                    dVar.g(ja.V0(z15, formatString, lqVarArr), z11, true);
                } else {
                    dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z11, true);
                }
            } else {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z11, true);
            }
            n(z11);
        }
        if (z12 || z13) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            if (this.E.f12054a == bVar2) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * d * 100.0d), "USD", 2));
            this.v.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new b(this, 4), 50L);
    }
}
