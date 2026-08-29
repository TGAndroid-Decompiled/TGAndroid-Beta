package jh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.tn;
public final class s0 extends org.telegram.ui.ActionBar.f3 {
    public final kf.a A;
    public final kf.a B;
    public final kf.a C;
    public kf.a D;
    public long E;
    public int F;
    public boolean G;
    public final iq[] H;
    public final iq[] I;
    public boolean J;
    public final b f12742b;
    public final boolean f12743c;
    public final int d;
    public final j40 f12744e;
    public final uc0 f12745f;
    public final EditTextBoldCursor h;
    public final TextView f12746n;
    public final q0 f12747r;
    public final nh.d f12748s;
    public final org.telegram.ui.Components.o6 v;
    public final ImageView f12749w;
    public final ImageView f12750x;
    public final kf.a f12751y;

    public s0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, tn tnVar, final org.telegram.ui.ActionBar.c6 c6Var, int i11, Utilities.Callback callback) {
        super(context, c6Var, true, false);
        int i12;
        boolean z10;
        this.E = -1L;
        this.H = new iq[1];
        this.I = new iq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f12743c = canManageMonoForum;
        boolean z11 = canManageMonoForum || s7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        kf.b bVar = kf.b.f13636b;
        this.B = kf.a.i(j11, bVar);
        this.C = kf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        kf.b bVar2 = kf.b.f13635a;
        this.f12751y = kf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.A = kf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            b bVar3 = new b(context, i10, c6Var);
            this.f12742b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            i7.h6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) {
                public final s0 f12531b;

                {
                    this.f12531b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f12531b.D.f13633a == kf.b.f13635a) {
                                new z9(context, c6Var).show();
                                return;
                            }
                            return;
                        default:
                            s0 s0Var = this.f12531b;
                            org.telegram.ui.Components.c5.T(context, s0Var.E, new eg.n(s0Var, 18), c6Var, 0).f22729a.show();
                            return;
                    }
                }
            });
        } else {
            this.f12742b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        linearLayout.addView(g10, i7.f6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
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
        g10.addView(textView, i7.f6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.g6.W5;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        i7.h6.a(imageView);
        imageView.setOnClickListener(new ag.o(this, 15));
        g10.addView(imageView, i7.f6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            j40 j40Var = new j40(context, c6Var);
            this.f12744e = j40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            j40Var.b(arrayList, new j0(this, 1));
            linearLayout.addView(j40Var, i7.f6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f12744e = null;
        }
        LinearLayout g11 = org.telegram.messenger.x3.g(context, 1);
        linearLayout.addView(g11, i7.f6.l(1.0f, -1, -2));
        uc0 uc0Var = new uc0(context, null);
        this.f12745f = uc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        uc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        uc0Var.e(editTextBoldCursor);
        kf.a aVar = messageSuggestionParams.amount;
        uc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        uc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ag.a0(this, 4));
        uc0Var.addView(editTextBoldCursor, i7.f6.e(-1, -2, 48));
        g11.addView(uc0Var, i7.f6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f12749w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        uc0Var.addView(imageView2, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f12750x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        uc0Var.addView(imageView3, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.v = o6Var;
        int i15 = org.telegram.ui.ActionBar.g6.f23433y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        uc0Var.addView(o6Var, i7.f6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f12746n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        g11.addView(textView2, i7.f6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f12747r = editTextBoldCursor2;
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
        uc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        uc0Var2.e(editTextBoldCursor2);
        uc0Var2.addView((View) editTextBoldCursor2, i7.f6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        i7.h6.b(uc0Var2, 0.02f, 1.2f);
        uc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f12531b;

            {
                this.f12531b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f12531b.D.f13633a == kf.b.f13635a) {
                            new z9(context, c6Var).show();
                            return;
                        }
                        return;
                    default:
                        s0 s0Var = this.f12531b;
                        org.telegram.ui.Components.c5.T(context, s0Var.E, new eg.n(s0Var, 18), c6Var, 0).f22729a.show();
                        return;
                }
            }
        });
        g11.addView(uc0Var2, i7.f6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        uc0Var2.addView(imageView4, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        g11.addView(textView3, i7.f6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, i7.f6.q(-1, -2, 80));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.f12748s = dVar;
        dVar.setOnClickListener(new p0(this, tnVar, i10, context, c6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, i7.f6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        kf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            q(kf.a.i(aVar2.f13634b, aVar2.f13633a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            q(kf.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.E != j12) {
            this.E = j12;
            editTextBoldCursor2.setText(o(j12));
        }
        n(z10);
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
    public final boolean isTouchOutside(float f9, float f10) {
        b bVar;
        if (this.G && (bVar = this.f12742b) != null && f9 >= bVar.getX() && f9 <= bVar.getX() + bVar.getWidth() && f10 >= bVar.getY() && f10 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f9, f10);
    }

    public final void m() {
        boolean z10;
        float f9;
        boolean z11 = this.J;
        b bVar = this.f12742b;
        if ((z11 && !isDismissed() && bVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f12744e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.G != z10) {
            this.G = z10;
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

    public final void n(boolean z10) {
        boolean z11;
        if (this.F == 0 && (this.D.f13634b >= 0 || this.E > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        nh.d dVar = this.f12748s;
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

    @Override
    public final void onContainerTranslationYChanged(float f9) {
        super.onContainerTranslationYChanged(f9);
        m();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.J = true;
        m();
    }

    public final kf.a p() {
        if (this.D.f13633a == kf.b.f13636b) {
            return this.C;
        }
        return this.A;
    }

    public final void q(kf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        kf.a aVar2;
        char c3;
        int i10;
        kf.a aVar3;
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
        int i11;
        float f17;
        kf.a aVar4;
        kf.a aVar5 = this.D;
        int i12 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.D = aVar;
        } else {
            this.D = kf.a.i(0L, aVar5.f13633a);
            this.F |= 1;
        }
        long j10 = p().f13634b;
        kf.a aVar6 = this.D;
        if (j10 < aVar6.f13634b) {
            this.F |= 4;
        }
        boolean k9 = aVar6.k();
        kf.a aVar7 = this.f12751y;
        kf.a aVar8 = this.B;
        kf.b bVar2 = kf.b.f13636b;
        if (!k9) {
            kf.a aVar9 = this.D;
            if (aVar9.f13633a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f13634b > aVar9.f13634b) {
                this.F |= 2;
            }
        }
        if (!z11 && aVar5.f13633a == this.D.f13633a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f13634b == this.D.f13634b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        uc0 uc0Var = this.f12745f;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            uc0Var.a(f17);
        }
        kf.b bVar3 = kf.b.f13635a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c3 = 0;
            j40 j40Var = this.f12744e;
            if (j40Var != null) {
                if (this.D.f13633a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                j40Var.a(i11, z12);
            }
            kf.b bVar4 = this.D.f13633a;
            TextView textView = this.f12746n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f12750x;
            ImageView imageView2 = this.f12749w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.D.f13633a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.D.f13633a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.D.f13633a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.D.f13633a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.D.f13633a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.D.f13633a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.D.f13633a == bVar3) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                imageView2.setAlpha(f9);
                if (this.D.f13633a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            b bVar5 = this.f12742b;
            if (bVar5 != null && bVar5.f11770e != (bVar = this.D.f13633a)) {
                bVar5.f11770e = bVar;
                bVar5.a();
            }
        } else {
            aVar2 = aVar7;
            c3 = 0;
        }
        if (z13 || z15) {
            int i13 = this.F;
            if ((i13 & 4) != 0) {
                int i14 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = p().f();
                uc0Var.setText(LocaleController.formatString(i14, objArr));
            } else if ((i13 & 2) != 0) {
                int i15 = R.string.SuggestAPostTooSmall;
                if (this.D.f13633a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f18 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f18;
                uc0Var.setText(LocaleController.formatString(i15, objArr2));
            } else {
                if (this.D.f13633a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                uc0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i16 = this.d;
            nh.d dVar = this.f12748s;
            if (i16 == 0) {
                if (!this.D.k()) {
                    kf.a aVar10 = this.D;
                    if (aVar10.f13633a == bVar2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    int i17 = R.string.PostSuggestionsOfferStars;
                    if (z16) {
                        formatNumber = aVar10.b();
                    } else {
                        formatNumber = LocaleController.formatNumber(aVar10.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[c3] = formatNumber;
                    String formatString = LocaleController.formatString(i17, objArr3);
                    if (z16) {
                        iqVarArr = this.I;
                    } else {
                        iqVarArr = this.H;
                    }
                    dVar.g(ia.V0(z16, formatString, iqVarArr), z12, true);
                } else {
                    dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
                }
            } else {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            }
            n(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.D.f13633a == bVar2) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.D.c() * d * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.D.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new o(this, 3), 50L);
    }
}
