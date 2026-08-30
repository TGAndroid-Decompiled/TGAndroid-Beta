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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.n40;
import org.telegram.ui.xn;
public final class s0 extends org.telegram.ui.ActionBar.g3 {
    public final mf.a B;
    public final mf.a C;
    public final mf.a D;
    public mf.a E;
    public long F;
    public int G;
    public boolean H;
    public final mq[] I;
    public final mq[] J;
    public boolean K;
    public final c f13049b;
    public final boolean f13050c;
    public final int d;
    public final n40 e;
    public final ad0 f13051f;
    public final EditTextBoldCursor h;
    public final TextView f13052n;
    public final q0 f13053r;
    public final ph.d f13054s;
    public final org.telegram.ui.Components.k6 v;
    public final ImageView f13055w;
    public final ImageView f13056x;
    public final mf.a f13057y;

    public s0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, xn xnVar, final org.telegram.ui.ActionBar.f6 f6Var, int i11, Utilities.Callback callback) {
        super(context, f6Var, true, false);
        int i12;
        boolean z4;
        this.F = -1L;
        this.I = new mq[1];
        this.J = new mq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f13050c = canManageMonoForum;
        boolean z10 = canManageMonoForum || t7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        mf.b bVar = mf.b.f13931b;
        this.C = mf.a.i(j11, bVar);
        this.D = mf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        mf.b bVar2 = mf.b.f13930a;
        this.f13057y = mf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.B = mf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            c cVar = new c(context, i10, f6Var);
            this.f13049b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            k7.d6.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) {
                public final s0 f12865b;

                {
                    this.f12865b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f12865b.E.f13928a == mf.b.f13930a) {
                                new aa(context, f6Var).show();
                                return;
                            }
                            return;
                        default:
                            s0 s0Var = this.f12865b;
                            org.telegram.ui.Components.z4.T(context, s0Var.F, new gg.f(s0Var, 26), f6Var, 0).f19525a.show();
                            return;
                    }
                }
            });
        } else {
            this.f13049b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
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
            n40 n40Var = new n40(context, f6Var);
            this.e = n40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            n40Var.b(arrayList, new j0(this, 1));
            linearLayout.addView(n40Var, k7.b6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f11, k7.b6.l(1.0f, -1, -2));
        ad0 ad0Var = new ad0(context, null);
        this.f13051f = ad0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        ad0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        ad0Var.e(editTextBoldCursor);
        mf.a aVar = messageSuggestionParams.amount;
        ad0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        ad0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 4));
        ad0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        f11.addView(ad0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f13055w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        ad0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f13056x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        ad0Var.addView(imageView3, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.v = k6Var;
        int i15 = org.telegram.ui.ActionBar.j6.f20281y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        ad0Var.addView(k6Var, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f13052n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f13053r = editTextBoldCursor2;
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
        ad0 ad0Var2 = new ad0(context, null);
        ad0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        ad0Var2.e(editTextBoldCursor2);
        ad0Var2.addView((View) editTextBoldCursor2, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.d6.b(ad0Var2, 0.02f, 1.2f);
        ad0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f12865b;

            {
                this.f12865b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f12865b.E.f13928a == mf.b.f13930a) {
                            new aa(context, f6Var).show();
                            return;
                        }
                        return;
                    default:
                        s0 s0Var = this.f12865b;
                        org.telegram.ui.Components.z4.T(context, s0Var.F, new gg.f(s0Var, 26), f6Var, 0).f19525a.show();
                        return;
                }
            }
        });
        f11.addView(ad0Var2, k7.b6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
        ad0Var2.addView(imageView4, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
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
        this.f13054s = dVar;
        dVar.setOnClickListener(new p0(this, xnVar, i10, context, f6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, k7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        mf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z4 = false;
            q(mf.a.i(aVar2.f13929b, aVar2.f13928a), !messageSuggestionParams.amount.k(), true, false);
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
        if (this.H && (cVar = this.f13049b) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    public final void m() {
        boolean z4;
        float f10;
        boolean z10 = this.K;
        c cVar = this.f13049b;
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
        if (this.G == 0 && (this.E.f13929b >= 0 || this.F > 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ph.d dVar = this.f13054s;
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
        if (this.E.f13928a == mf.b.f13931b) {
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
        mq[] mqVarArr;
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
            this.E = mf.a.i(0L, aVar5.f13928a);
            this.G |= 1;
        }
        long j10 = p().f13929b;
        mf.a aVar6 = this.E;
        if (j10 < aVar6.f13929b) {
            this.G |= 4;
        }
        boolean k10 = aVar6.k();
        mf.a aVar7 = this.f13057y;
        mf.a aVar8 = this.C;
        mf.b bVar2 = mf.b.f13931b;
        if (!k10) {
            mf.a aVar9 = this.E;
            if (aVar9.f13928a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f13929b > aVar9.f13929b) {
                this.G |= 2;
            }
        }
        if (!z10 && aVar5.f13928a == this.E.f13928a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar5.f13929b == this.E.f13929b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i12 == this.G) {
            z14 = false;
        } else {
            z14 = true;
        }
        ad0 ad0Var = this.f13051f;
        if (z14) {
            if ((this.G & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            ad0Var.a(f18);
        }
        mf.b bVar3 = mf.b.f13930a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z12) {
            c3 = 0;
            n40 n40Var = this.e;
            if (n40Var != null) {
                if (this.E.f13928a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                n40Var.a(i11, z11);
            }
            mf.b bVar4 = this.E.f13928a;
            TextView textView = this.f13052n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f13056x;
            ImageView imageView2 = this.f13055w;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f13928a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.E.f13928a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.E.f13928a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f13928a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.E.f13928a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.E.f13928a == bVar2) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f13928a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.E.f13928a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar = this.f13049b;
            if (cVar != null && cVar.e != (bVar = this.E.f13928a)) {
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
                ad0Var.setText(LocaleController.formatString(i14, objArr));
            } else if ((i13 & 2) != 0) {
                int i15 = R.string.SuggestAPostTooSmall;
                if (this.E.f13928a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f19 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f19;
                ad0Var.setText(LocaleController.formatString(i15, objArr2));
            } else {
                if (this.E.f13928a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                ad0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z12 || z13 || z14) {
            int i16 = this.d;
            ph.d dVar = this.f13054s;
            if (i16 == 0) {
                if (!this.E.k()) {
                    mf.a aVar10 = this.E;
                    if (aVar10.f13928a == bVar2) {
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
                        mqVarArr = this.J;
                    } else {
                        mqVarArr = this.I;
                    }
                    dVar.g(ja.V0(z15, formatString, mqVarArr), z11, true);
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
            if (this.E.f13928a == bVar2) {
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
