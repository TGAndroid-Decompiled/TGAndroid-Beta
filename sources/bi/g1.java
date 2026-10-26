package bi;

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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.zq;
import org.telegram.ui.un;
public final class g1 extends org.telegram.ui.ActionBar.k3 {
    public final bg.a E;
    public final bg.a F;
    public final bg.a G;
    public bg.a H;
    public long I;
    public int J;
    public boolean K;
    public final zq[] L;
    public final zq[] M;
    public boolean N;
    public final c f4633b;
    public final boolean f4634c;
    public final int d;
    public final w40 e;
    public final rd0 f4635f;
    public final EditTextBoldCursor h;
    public final TextView f4636n;
    public final e1 f4637r;
    public final fi.d f4638s;
    public final org.telegram.ui.Components.s6 v;
    public final ImageView f4639w;
    public final ImageView f4640x;
    public final bg.a f4641y;

    public g1(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, un unVar, final org.telegram.ui.ActionBar.u6 u6Var, int i11, Utilities.Callback callback) {
        super(1, context, u6Var, true);
        boolean z10;
        int i12;
        boolean z11;
        float f7;
        boolean z12;
        this.I = -1L;
        this.L = new zq[1];
        this.M = new zq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.f4634c = canManageMonoForum;
        if (!canManageMonoForum && !ca.y(i10, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        bg.b bVar = bg.b.f3981b;
        this.F = bg.a.i(j11, bVar);
        this.G = bg.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        bg.b bVar2 = bg.b.f3980a;
        this.f4641y = bg.a.g(appGlobalConfig.starsSuggestedPostAmountMin.get(), bVar2);
        this.E = bg.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (!canManageMonoForum) {
            c cVar = new c(context, i10, u6Var);
            this.f4633b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, gb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            gb1.b(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) {
                public final g1 f4416b;

                {
                    this.f4416b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f4416b.H.f3978a == bg.b.f3980a) {
                                new uc(context, u6Var).show();
                                return;
                            }
                            return;
                        default:
                            g1 g1Var = this.f4416b;
                            org.telegram.ui.Components.g5.S(context, g1Var.I, new a1.c(g1Var, 5), u6Var, 0).f22601a.show();
                            return;
                    }
                }
            });
        } else {
            this.f4633b = null;
        }
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23427h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout d = vh.d(context, 0);
        linearLayout.addView(d, gb1.x(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i13, null);
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
        d.addView(textView, gb1.t(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.y6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView, i14, u6Var, mode);
        gb1.b(imageView);
        imageView.setOnClickListener(new ai.s(this, 4));
        d.addView(imageView, gb1.t(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            w40 w40Var = new w40(context, u6Var);
            this.e = w40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            w40Var.b(arrayList, new x0(this, 1));
            linearLayout.addView(w40Var, gb1.o(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout d10 = vh.d(context, 1);
        linearLayout.addView(d10, gb1.p(1.0f, -1, -2));
        rd0 rd0Var = new rd0(context, null);
        this.f4635f = rd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        rd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        rd0Var.e(editTextBoldCursor);
        bg.a aVar = messageSuggestionParams.amount;
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
        rd0Var.b(1.0f, f7, false);
        rd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 3));
        rd0Var.addView(editTextBoldCursor, gb1.i(-1, -2, 48));
        d10.addView(rd0Var, gb1.o(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f4639w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        rd0Var.addView(imageView2, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f4640x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        rd0Var.addView(imageView3, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.v = s6Var;
        int i15 = org.telegram.ui.ActionBar.y6.f23748y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i15, null);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        rd0Var.addView(s6Var, gb1.h(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f4636n = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i15, null);
        textView2.setTextSize(1, 13.0f);
        d10.addView(textView2, gb1.x(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f4637r = editTextBoldCursor2;
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
        rd0 rd0Var2 = new rd0(context, null);
        rd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        rd0Var2.e(editTextBoldCursor2);
        rd0Var2.addView((View) editTextBoldCursor2, gb1.h(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        gb1.c(rd0Var2, 0.02f, 1.2f);
        rd0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g1 f4416b;

            {
                this.f4416b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f4416b.H.f3978a == bg.b.f3980a) {
                            new uc(context, u6Var).show();
                            return;
                        }
                        return;
                    default:
                        g1 g1Var = this.f4416b;
                        org.telegram.ui.Components.g5.S(context, g1Var.I, new a1.c(g1Var, 5), u6Var, 0).f22601a.show();
                        return;
                }
            }
        });
        d10.addView(rd0Var2, gb1.o(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.f7.t(imageView4, i14, u6Var, mode);
        rd0Var2.addView(imageView4, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView3, i15, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        d10.addView(textView3, gb1.x(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, gb1.u(-1, -2, 80));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f4638s = dVar;
        dVar.setOnClickListener(new d1(this, unVar, i10, context, u6Var, j10, callback));
        if (i11 == 1) {
            dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, gb1.o(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        bg.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z12 = false;
            q(bg.a.i(aVar2.f3979b, aVar2.f3978a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z12 = false;
            q(bg.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.I != j12) {
            this.I = j12;
            editTextBoldCursor2.setText(o(j12));
        }
        n(z12);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new f1(this));
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
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (this.K && (cVar = this.f4633b) != null && f7 >= cVar.getX() && f7 <= cVar.getX() + cVar.getWidth() && f10 >= cVar.getY() && f10 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void m() {
        boolean z10;
        float f7;
        boolean z11 = this.N;
        c cVar = this.f4633b;
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
                vh.p(scaleY, f11, 180L);
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        if (this.J == 0 && (this.H.f3979b >= 0 || this.I > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        fi.d dVar = this.f4638s;
        if (dVar.f10687c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                vh.p(animate, f7, 180L);
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

    public final bg.a p() {
        if (this.H.f3978a == bg.b.f3981b) {
            return this.G;
        }
        return this.E;
    }

    public final void q(bg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        bg.a aVar2;
        int i10;
        bg.a aVar3;
        boolean z16;
        String formatNumber;
        zq[] zqVarArr;
        double d;
        float f7;
        float f10;
        bg.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        bg.a aVar4;
        bg.a aVar5 = this.H;
        int i12 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = bg.a.i(0L, aVar5.f3978a);
            this.J |= 1;
        }
        long j10 = p().f3979b;
        bg.a aVar6 = this.H;
        if (j10 < aVar6.f3979b) {
            this.J |= 4;
        }
        boolean k10 = aVar6.k();
        bg.a aVar7 = this.f4641y;
        bg.a aVar8 = this.F;
        bg.b bVar2 = bg.b.f3981b;
        if (!k10) {
            bg.a aVar9 = this.H;
            if (aVar9.f3978a == bVar2) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            if (aVar4.f3979b > aVar9.f3979b) {
                this.J |= 2;
            }
        }
        if (!z11 && aVar5.f3978a == this.H.f3978a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f3979b == this.H.f3979b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.J) {
            z15 = false;
        } else {
            z15 = true;
        }
        rd0 rd0Var = this.f4635f;
        if (z15) {
            if ((this.J & (-9)) == 0) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            rd0Var.a(f17);
        }
        bg.b bVar3 = bg.b.f3980a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            w40 w40Var = this.e;
            if (w40Var != null) {
                if (this.H.f3978a == bVar3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                w40Var.a(i11, z12);
            }
            bg.b bVar4 = this.H.f3978a;
            TextView textView = this.f4636n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.f4640x;
            ImageView imageView2 = this.f4639w;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.H.f3978a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.H.f3978a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.H.f3978a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.H.f3978a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.H.f3978a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.H.f3978a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.H.f3978a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.H.f3978a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            c cVar = this.f4633b;
            if (cVar != null && cVar.e != (bVar = this.H.f3978a)) {
                cVar.e = bVar;
                cVar.a();
            }
        } else {
            aVar2 = aVar7;
        }
        if (z13 || z15) {
            int i13 = this.J;
            if ((i13 & 4) != 0) {
                rd0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooMuch, p().f()));
            } else if ((i13 & 2) != 0) {
                int i14 = R.string.SuggestAPostTooSmall;
                if (this.H.f3978a == bVar2) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                rd0Var.setText(LocaleController.formatString(i14, aVar3.f()));
            } else {
                if (this.H.f3978a == bVar3) {
                    i10 = R.string.PostSuggestionsOfferTitlePriceStars;
                } else {
                    i10 = R.string.PostSuggestionsOfferTitlePriceTON;
                }
                rd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            int i15 = this.d;
            fi.d dVar = this.f4638s;
            if (i15 == 0) {
                if (!this.H.k()) {
                    bg.a aVar10 = this.H;
                    if (aVar10.f3978a == bVar2) {
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
                        zqVarArr = this.M;
                    } else {
                        zqVarArr = this.L;
                    }
                    dVar.i(dd.o1(dd.U0(z16, formatString, zqVarArr), z16), z12, true);
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
            if (this.H.f3978a == bVar2) {
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
        AndroidUtilities.runOnUIThread(new a3.d(this, 20), 50L);
    }
}
