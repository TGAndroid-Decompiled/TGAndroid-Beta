package gh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.qn;
public final class t0 extends org.telegram.ui.ActionBar.f3 {
    public final gf.a A;
    public final gf.a B;
    public final gf.a C;
    public gf.a D;
    public long E;
    public int F;
    public boolean G;
    public final eq[] H;
    public final eq[] I;
    public boolean J;
    public final b f8895b;
    public final boolean f8896c;
    public final int d;
    public final v30 f8897e;
    public final fc0 f8898f;
    public final EditTextBoldCursor h;
    public final TextView f8899n;
    public final r0 f8900r;
    public final kh.d f8901s;
    public final org.telegram.ui.Components.j6 v;
    public final ImageView f8902w;
    public final ImageView f8903x;
    public final gf.a f8904y;

    public t0(final Context context, int i9, long j10, MessageSuggestionParams messageSuggestionParams, qn qnVar, final org.telegram.ui.ActionBar.b6 b6Var, int i10, Utilities.Callback callback) {
        super(context, b6Var, true, false);
        int i11;
        boolean z10;
        this.E = -1L;
        this.H = new eq[1];
        this.I = new eq[1];
        this.d = i10;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i9, j10);
        this.f8896c = canManageMonoForum;
        boolean z11 = canManageMonoForum || v7.y(i9, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i9).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        gf.b bVar = gf.b.f7750b;
        this.B = gf.a.i(j11, bVar);
        this.C = gf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        gf.b bVar2 = gf.b.f7749a;
        this.f8904y = gf.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.A = gf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            b bVar3 = new b(context, i9, b6Var);
            this.f8895b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            g7.g6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) {
                public final t0 f8700b;

                {
                    this.f8700b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f8700b.D.f7747a == gf.b.f7749a) {
                                new fa(context, b6Var).show();
                                return;
                            }
                            return;
                        default:
                            t0 t0Var = this.f8700b;
                            org.telegram.ui.Components.y4.T(context, t0Var.E, new a1.c(t0Var, 29), b6Var, 0).f22713a.show();
                            return;
                    }
                }
            });
        } else {
            this.f8895b = null;
        }
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = ll.f(context, 0);
        linearLayout.addView(f10, g7.e6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i10 == 0) {
            i11 = R.string.PostSuggestionsOfferTitle;
        } else {
            i11 = R.string.PostSuggestionsOfferChangeTitle;
        }
        textView.setText(LocaleController.getString(i11));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, g7.e6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.f6.W5;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        g7.g6.a(imageView);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 9));
        f10.addView(imageView, g7.e6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            v30 v30Var = new v30(context, b6Var);
            this.f8897e = v30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            v30Var.b(arrayList, new k0(this, 1));
            linearLayout.addView(v30Var, g7.e6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f8897e = null;
        }
        LinearLayout f11 = ll.f(context, 1);
        linearLayout.addView(f11, g7.e6.l(1.0f, -1, -2));
        fc0 fc0Var = new fc0(context, null);
        this.f8898f = fc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        editTextBoldCursor.requestFocus();
        fc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        fc0Var.e(editTextBoldCursor);
        gf.a aVar = messageSuggestionParams.amount;
        fc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        fc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 2));
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        f11.addView(fc0Var, g7.e6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f8902w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        fc0Var.addView(imageView2, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f8903x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        fc0Var.addView(imageView3, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.v = j6Var;
        int i14 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        fc0Var.addView(j6Var, g7.e6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f8899n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f8900r = editTextBoldCursor2;
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
        fc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        fc0Var2.e(editTextBoldCursor2);
        fc0Var2.addView((View) editTextBoldCursor2, g7.e6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        g7.g6.b(fc0Var2, 0.02f, 1.2f);
        fc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t0 f8700b;

            {
                this.f8700b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f8700b.D.f7747a == gf.b.f7749a) {
                            new fa(context, b6Var).show();
                            return;
                        }
                        return;
                    default:
                        t0 t0Var = this.f8700b;
                        org.telegram.ui.Components.y4.T(context, t0Var.E, new a1.c(t0Var, 29), b6Var, 0).f22713a.show();
                        return;
                }
            }
        });
        f11.addView(fc0Var2, g7.e6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), mode));
        fc0Var2.addView(imageView4, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i9).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, g7.e6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, g7.e6.q(-1, -2, 80));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.f8901s = dVar;
        dVar.setOnClickListener(new q0(this, qnVar, i9, context, b6Var, j10, callback));
        if (i10 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, g7.e6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        gf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            q(gf.a.i(aVar2.f7748b, aVar2.f7747a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            q(gf.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.E != j12) {
            this.E = j12;
            editTextBoldCursor2.setText(o(j12));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new s0(this));
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
        if (this.G && (bVar = this.f8895b) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    public final void m() {
        boolean z10;
        float f10;
        boolean z11 = this.J;
        b bVar = this.f8895b;
        if ((z11 && !isDismissed() && bVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f8897e == null) {
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

    public final void n(boolean z10) {
        boolean z11;
        if (this.F == 0 && (this.D.f7748b >= 0 || this.E > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        kh.d dVar = this.f8901s;
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

    public final gf.a p() {
        if (this.D.f7747a == gf.b.f7750b) {
            return this.C;
        }
        return this.A;
    }

    public final void q(gf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        gf.a aVar2;
        char c10;
        int i9;
        gf.a aVar3;
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
        int i10;
        float f18;
        gf.a aVar4;
        gf.a aVar5 = this.D;
        int i11 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.D = aVar;
        } else {
            this.D = gf.a.i(0L, aVar5.f7747a);
            this.F |= 1;
        }
        long j10 = p().f7748b;
        gf.a aVar6 = this.D;
        if (j10 < aVar6.f7748b) {
            this.F |= 4;
        }
        boolean k10 = aVar6.k();
        gf.a aVar7 = this.f8904y;
        gf.a aVar8 = this.B;
        gf.b bVar2 = gf.b.f7750b;
        if (!k10) {
            gf.a aVar9 = this.D;
            if (aVar9.f7747a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f7748b > aVar9.f7748b) {
                this.F |= 2;
            }
        }
        if (!z11 && aVar5.f7747a == this.D.f7747a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f7748b == this.D.f7748b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        fc0 fc0Var = this.f8898f;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            fc0Var.a(f18);
        }
        gf.b bVar3 = gf.b.f7749a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            v30 v30Var = this.f8897e;
            if (v30Var != null) {
                if (this.D.f7747a == bVar3) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                v30Var.a(i10, z12);
            }
            gf.b bVar4 = this.D.f7747a;
            TextView textView = this.f8899n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f8903x;
            ImageView imageView2 = this.f8902w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.D.f7747a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.D.f7747a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.D.f7747a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.D.f7747a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.D.f7747a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.D.f7747a == bVar2) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.D.f7747a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.D.f7747a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar5 = this.f8895b;
            if (bVar5 != null && bVar5.f7823e != (bVar = this.D.f7747a)) {
                bVar5.f7823e = bVar;
                bVar5.a();
            }
        } else {
            aVar2 = aVar7;
            c10 = 0;
        }
        if (z13 || z15) {
            int i12 = this.F;
            if ((i12 & 4) != 0) {
                int i13 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = p().f();
                fc0Var.setText(LocaleController.formatString(i13, objArr));
            } else if ((i12 & 2) != 0) {
                int i14 = R.string.SuggestAPostTooSmall;
                if (this.D.f7747a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f19 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c10] = f19;
                fc0Var.setText(LocaleController.formatString(i14, objArr2));
            } else {
                if (this.D.f7747a == bVar3) {
                    i9 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i9 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                fc0Var.setText(LocaleController.getString(i9));
            }
        }
        if (z13 || z14 || z15) {
            int i15 = this.d;
            kh.d dVar = this.f8901s;
            if (i15 == 0) {
                if (!this.D.k()) {
                    gf.a aVar10 = this.D;
                    if (aVar10.f7747a == bVar2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    int i16 = R.string.PostSuggestionsOfferStars;
                    if (z16) {
                        formatNumber = aVar10.b();
                    } else {
                        formatNumber = LocaleController.formatNumber(aVar10.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = formatNumber;
                    String formatString = LocaleController.formatString(i16, objArr3);
                    if (z16) {
                        eqVarArr = this.I;
                    } else {
                        eqVarArr = this.H;
                    }
                    dVar.g(oa.V0(z16, formatString, eqVarArr), z12, true);
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
            if (this.D.f7747a == bVar2) {
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
        AndroidUtilities.runOnUIThread(new fh.o1(this, 8), 50L);
    }
}
