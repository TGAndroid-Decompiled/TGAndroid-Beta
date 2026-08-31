package mh;

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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p40;
import org.telegram.ui.xn;
public final class r0 extends org.telegram.ui.ActionBar.h3 {
    public final mf.a B;
    public final mf.a C;
    public final mf.a D;
    public mf.a E;
    public long F;
    public int G;
    public boolean H;
    public final oq[] I;
    public final oq[] J;
    public boolean K;
    public final b f14653b;
    public final boolean f14654c;
    public final int d;
    public final p40 f14655e;
    public final cd0 f14656f;
    public final EditTextBoldCursor h;
    public final TextView f14657n;
    public final p0 f14658r;
    public final qh.d f14659s;
    public final org.telegram.ui.Components.k6 v;
    public final ImageView f14660w;
    public final ImageView f14661x;
    public final mf.a f14662y;

    public r0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, xn xnVar, final org.telegram.ui.ActionBar.g6 g6Var, int i11, Utilities.Callback callback) {
        super(context, g6Var, true, false);
        int i12;
        boolean z4;
        this.F = -1L;
        this.I = new oq[1];
        this.J = new oq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f14654c = canManageMonoForum;
        boolean z10 = canManageMonoForum || t7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        mf.b bVar = mf.b.f13652b;
        this.C = mf.a.i(j11, bVar);
        this.D = mf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        mf.b bVar2 = mf.b.f13651a;
        this.f14662y = mf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.B = mf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            b bVar3 = new b(context, i10, g6Var);
            this.f14653b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            k7.e6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) {
                public final r0 f14462b;

                {
                    this.f14462b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f14462b.E.f13649a == mf.b.f13651a) {
                                new aa(context, g6Var).show();
                                return;
                            }
                            return;
                        default:
                            r0 r0Var = this.f14462b;
                            org.telegram.ui.Components.z4.T(context, r0Var.F, new hg.f(r0Var, 26), g6Var, 0).f21207a.show();
                            return;
                    }
                }
            });
        } else {
            this.f14653b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f10, k7.c6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
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
        f10.addView(textView, k7.c6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.k6.W5;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        k7.e6.a(imageView);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 15));
        f10.addView(imageView, k7.c6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            p40 p40Var = new p40(context, g6Var);
            this.f14655e = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            p40Var.b(arrayList, new i0(this, 1));
            linearLayout.addView(p40Var, k7.c6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f14655e = null;
        }
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f11, k7.c6.l(1.0f, -1, -2));
        cd0 cd0Var = new cd0(context, null);
        this.f14656f = cd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        cd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        cd0Var.e(editTextBoldCursor);
        mf.a aVar = messageSuggestionParams.amount;
        cd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        cd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new dg.z(this, 4));
        cd0Var.addView(editTextBoldCursor, k7.c6.e(-1, -2, 48));
        f11.addView(cd0Var, k7.c6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f14660w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        cd0Var.addView(imageView2, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f14661x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        cd0Var.addView(imageView3, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.v = k6Var;
        int i15 = org.telegram.ui.ActionBar.k6.f22036y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        cd0Var.addView(k6Var, k7.c6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f14657n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f14658r = editTextBoldCursor2;
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
        cd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        cd0Var2.e(editTextBoldCursor2);
        cd0Var2.addView((View) editTextBoldCursor2, k7.c6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.e6.b(cd0Var2, 0.02f, 1.2f);
        cd0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r0 f14462b;

            {
                this.f14462b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f14462b.E.f13649a == mf.b.f13651a) {
                            new aa(context, g6Var).show();
                            return;
                        }
                        return;
                    default:
                        r0 r0Var = this.f14462b;
                        org.telegram.ui.Components.z4.T(context, r0Var.F, new hg.f(r0Var, 26), g6Var, 0).f21207a.show();
                        return;
                }
            }
        });
        f11.addView(cd0Var2, k7.c6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), mode));
        cd0Var2.addView(imageView4, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, k7.c6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.c6.q(-1, -2, 80));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f14659s = dVar;
        dVar.setOnClickListener(new o0(this, xnVar, i10, context, g6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, k7.c6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        mf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z4 = false;
            q(mf.a.i(aVar2.f13650b, aVar2.f13649a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z4 = false;
            q(mf.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.F != j12) {
            this.F = j12;
            editTextBoldCursor2.setText(o(j12));
        }
        n(z4);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new q0(this));
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
        b bVar;
        if (this.H && (bVar = this.f14653b) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    public final void m() {
        boolean z4;
        float f10;
        boolean z10 = this.K;
        b bVar = this.f14653b;
        if ((z10 && !isDismissed() && bVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f14655e == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.H != z4) {
            this.H = z4;
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

    public final void n(boolean z4) {
        boolean z10;
        if (this.G == 0 && (this.E.f13650b >= 0 || this.F > 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        qh.d dVar = this.f14659s;
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

    public final mf.a p() {
        if (this.E.f13649a == mf.b.f13652b) {
            return this.D;
        }
        return this.B;
    }

    public final void q(mf.a aVar, boolean z4, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        mf.a aVar2;
        char c3;
        int i10;
        mf.a aVar3;
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
        int i11;
        float f18;
        mf.a aVar4;
        mf.a aVar5 = this.E;
        int i12 = this.G;
        this.G = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = mf.a.i(0L, aVar5.f13649a);
            this.G |= 1;
        }
        long j10 = p().f13650b;
        mf.a aVar6 = this.E;
        if (j10 < aVar6.f13650b) {
            this.G |= 4;
        }
        boolean k10 = aVar6.k();
        mf.a aVar7 = this.f14662y;
        mf.a aVar8 = this.C;
        mf.b bVar2 = mf.b.f13652b;
        if (!k10) {
            mf.a aVar9 = this.E;
            if (aVar9.f13649a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f13650b > aVar9.f13650b) {
                this.G |= 2;
            }
        }
        if (!z10 && aVar5.f13649a == this.E.f13649a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar5.f13650b == this.E.f13650b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i12 == this.G) {
            z14 = false;
        } else {
            z14 = true;
        }
        cd0 cd0Var = this.f14656f;
        if (z14) {
            if ((this.G & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            cd0Var.a(f18);
        }
        mf.b bVar3 = mf.b.f13651a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z12) {
            c3 = 0;
            p40 p40Var = this.f14655e;
            if (p40Var != null) {
                if (this.E.f13649a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                p40Var.a(i11, z11);
            }
            mf.b bVar4 = this.E.f13649a;
            TextView textView = this.f14657n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f14661x;
            ImageView imageView2 = this.f14660w;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f13649a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.E.f13649a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.E.f13649a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f13649a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.E.f13649a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.E.f13649a == bVar2) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f13649a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.E.f13649a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar5 = this.f14653b;
            if (bVar5 != null && bVar5.f13719e != (bVar = this.E.f13649a)) {
                bVar5.f13719e = bVar;
                bVar5.a();
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
                cd0Var.setText(LocaleController.formatString(i14, objArr));
            } else if ((i13 & 2) != 0) {
                int i15 = R.string.SuggestAPostTooSmall;
                if (this.E.f13649a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f19 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f19;
                cd0Var.setText(LocaleController.formatString(i15, objArr2));
            } else {
                if (this.E.f13649a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                cd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z12 || z13 || z14) {
            int i16 = this.d;
            qh.d dVar = this.f14659s;
            if (i16 == 0) {
                if (!this.E.k()) {
                    mf.a aVar10 = this.E;
                    if (aVar10.f13649a == bVar2) {
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
                        oqVarArr = this.J;
                    } else {
                        oqVarArr = this.I;
                    }
                    dVar.g(ja.V0(z15, formatString, oqVarArr), z11, true);
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
            if (this.E.f13649a == bVar2) {
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
        AndroidUtilities.runOnUIThread(new lh.c3(this, 5), 50L);
    }
}
