package ai;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.sn;
public final class h1 extends org.telegram.ui.ActionBar.h3 {
    public final ag.a E;
    public final ag.a F;
    public final ag.a G;
    public ag.a H;
    public long I;
    public int J;
    public boolean K;
    public final vq[] L;
    public final vq[] M;
    public boolean N;
    public final c f1383b;
    public final boolean f1384c;
    public final int d;
    public final s40 e;
    public final td0 f1385f;
    public final EditTextBoldCursor h;
    public final TextView f1386n;
    public final f1 f1387r;
    public final ei.d f1388s;
    public final org.telegram.ui.Components.o6 v;
    public final ImageView f1389w;
    public final ImageView f1390x;
    public final ag.a f1391y;

    public h1(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, sn snVar, final org.telegram.ui.ActionBar.g6 g6Var, int i11, Utilities.Callback callback) {
        super(1, context, g6Var, true);
        boolean z10;
        int i12;
        boolean z11;
        float f7;
        boolean z12;
        this.I = -1L;
        this.L = new vq[1];
        this.M = new vq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f1384c = canManageMonoForum;
        if (!canManageMonoForum && !ha.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        ag.b bVar = ag.b.f634b;
        this.F = ag.a.i(j11, bVar);
        this.G = ag.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        ag.b bVar2 = ag.b.f633a;
        this.f1391y = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.E = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            c cVar = new c(context, i10, g6Var);
            this.f1383b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.b6.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) {
                public final h1 f1121b;

                {
                    this.f1121b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f1121b.H.f631a == ag.b.f633a) {
                                new ed(context, g6Var).show();
                                return;
                            }
                            return;
                        default:
                            h1 h1Var = this.f1121b;
                            org.telegram.ui.Components.d5.S(context, h1Var.I, new a1.c(h1Var, 3), g6Var, 0).f20729a.show();
                            return;
                    }
                }
            });
        } else {
            this.f1383b = null;
        }
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = tl.e(context, 0);
        linearLayout.addView(e, w7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i13, null);
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
        e.addView(textView, w7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.k6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, g6Var, mode);
        w7.b6.a(imageView);
        imageView.setOnClickListener(new ah.g0(this, 2));
        e.addView(imageView, w7.z5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            s40 s40Var = new s40(context, g6Var);
            this.e = s40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            s40Var.b(arrayList, new w0(this, 1));
            linearLayout.addView(s40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout e7 = tl.e(context, 1);
        linearLayout.addView(e7, w7.z5.l(1.0f, -1, -2));
        td0 td0Var = new td0(context, null);
        this.f1385f = td0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        td0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        td0Var.e(editTextBoldCursor);
        ag.a aVar = messageSuggestionParams.amount;
        if (aVar != null && !aVar.k()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        td0Var.b(1.0f, f7, false);
        td0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 3));
        td0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e7.addView(td0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f1389w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        td0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f1390x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        td0Var.addView(imageView3, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.v = o6Var;
        int i15 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.a0(o6Var, i15, null);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        td0Var.addView(o6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1386n = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i15, null);
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f1387r = editTextBoldCursor2;
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
        td0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        td0Var2.e(editTextBoldCursor2);
        td0Var2.addView((View) editTextBoldCursor2, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(td0Var2, 0.02f, 1.2f);
        td0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h1 f1121b;

            {
                this.f1121b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f1121b.H.f631a == ag.b.f633a) {
                            new ed(context, g6Var).show();
                            return;
                        }
                        return;
                    default:
                        h1 h1Var = this.f1121b;
                        org.telegram.ui.Components.d5.S(context, h1Var.I, new a1.c(h1Var, 3), g6Var, 0).f20729a.show();
                        return;
                }
            }
        });
        e7.addView(td0Var2, w7.z5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView4, i14, g6Var, mode);
        td0Var2.addView(imageView4, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView3, i15, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        e7.addView(textView3, w7.z5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 80));
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f1388s = dVar;
        dVar.setOnClickListener(new e1(this, snVar, i10, context, g6Var, j10, callback));
        if (i11 == 1) {
            dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        ag.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z12 = false;
            r(ag.a.i(aVar2.f632b, aVar2.f631a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z12 = false;
            r(ag.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.I != j12) {
            this.I = j12;
            editTextBoldCursor2.setText(p(j12));
        }
        n(z12);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new g1(this));
    }

    public static String p(long j10) {
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
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (this.K && (cVar = this.f1383b) != null && f7 >= cVar.getX() && f7 <= cVar.getX() + cVar.getWidth() && f10 >= cVar.getY() && f10 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void m() {
        boolean z10;
        float f7;
        boolean z11 = this.N;
        c cVar = this.f1383b;
        if ((z11 && !isDismissed() && cVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.K != z10) {
            this.K = z10;
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

    public final void n(boolean z10) {
        boolean z11;
        if (this.J == 0 && (this.H.f632b >= 0 || this.I > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ei.d dVar = this.f1388s;
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

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        m();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.N = true;
        m();
    }

    public final ag.a q() {
        if (this.H.f631a == ag.b.f634b) {
            return this.G;
        }
        return this.E;
    }

    public final void r(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ag.a aVar2;
        int i10;
        ag.a aVar3;
        boolean z16;
        String formatNumber;
        vq[] vqVarArr;
        double d;
        float f7;
        float f10;
        ag.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        ag.a aVar4;
        ag.a aVar5 = this.H;
        int i12 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = ag.a.i(0L, aVar5.f631a);
            this.J |= 1;
        }
        long j10 = q().f632b;
        ag.a aVar6 = this.H;
        if (j10 < aVar6.f632b) {
            this.J |= 4;
        }
        boolean k10 = aVar6.k();
        ag.a aVar7 = this.f1391y;
        ag.a aVar8 = this.F;
        ag.b bVar2 = ag.b.f634b;
        if (!k10) {
            ag.a aVar9 = this.H;
            if (aVar9.f631a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f632b > aVar9.f632b) {
                this.J |= 2;
            }
        }
        if (!z11 && aVar5.f631a == this.H.f631a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f632b == this.H.f632b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.J) {
            z15 = false;
        } else {
            z15 = true;
        }
        td0 td0Var = this.f1385f;
        if (z15) {
            if ((this.J & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            td0Var.a(f17);
        }
        ag.b bVar3 = ag.b.f633a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            s40 s40Var = this.e;
            if (s40Var != null) {
                if (this.H.f631a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                s40Var.a(i11, z12);
            }
            ag.b bVar4 = this.H.f631a;
            TextView textView = this.f1386n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(q().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(q().a()).length() + 3)});
            }
            ImageView imageView = this.f1390x;
            ImageView imageView2 = this.f1389w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.H.f631a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.H.f631a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.H.f631a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.H.f631a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.H.f631a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.H.f631a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.H.f631a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.H.f631a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            c cVar = this.f1383b;
            if (cVar != null && cVar.e != (bVar = this.H.f631a)) {
                cVar.e = bVar;
                cVar.a();
            }
        } else {
            aVar2 = aVar7;
        }
        if (z13 || z15) {
            int i13 = this.J;
            if ((i13 & 4) != 0) {
                td0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooMuch, q().f()));
            } else if ((i13 & 2) != 0) {
                int i14 = R.string.SuggestAPostTooSmall;
                if (this.H.f631a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                td0Var.setText(LocaleController.formatString(i14, aVar3.f()));
            } else {
                if (this.H.f631a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                td0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i15 = this.d;
            ei.d dVar = this.f1388s;
            if (i15 == 0) {
                if (!this.H.k()) {
                    ag.a aVar10 = this.H;
                    if (aVar10.f631a == bVar2) {
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
                    String formatString = LocaleController.formatString(i16, formatNumber);
                    if (z16) {
                        vqVarArr = this.M;
                    } else {
                        vqVarArr = this.L;
                    }
                    dVar.i(nd.n1(nd.W0(z16, formatString, vqVarArr), z16), z12, true);
                } else {
                    dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
                }
            } else {
                dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            }
            n(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.H.f631a == bVar2) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.H.c() * d * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.H.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 10), 50L);
    }
}
