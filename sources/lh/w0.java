package lh;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.kp;
public final class w0 extends org.telegram.ui.ActionBar.g3 {
    public lf.a B;
    public int C;
    public final bd0 f13253b;
    public final EditTextBoldCursor f13254c;
    public final TextView d;
    public final org.telegram.ui.Components.k6 e;
    public final ph.d f13255f;
    public final org.telegram.ui.Components.k6 h;
    public final org.telegram.ui.Cells.s8 f13256n;
    public final ImageView f13257r;
    public final ImageView f13258s;
    public final lf.a v;
    public final lf.a f13259w;
    public final lf.a f13260x;
    public final lf.a f13261y;

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, lf.a aVar, kh.a1 a1Var) {
        super(context, f6Var, true, false);
        boolean z4;
        float f10;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        lf.b bVar = lf.b.f12057b;
        this.f13260x = lf.a.i(max, bVar);
        this.f13261y = lf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        lf.b bVar2 = lf.b.f12056a;
        this.v = lf.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f13259w = lf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f11, k7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.e = k6Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        k6Var.setTextSize(AndroidUtilities.dp(20.0f));
        k6Var.setGravity(8388627);
        k6Var.setTypeface(AndroidUtilities.bold());
        f11.addView(k6Var, k7.b6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.b6.l(1.0f, -1, -2));
        bd0 bd0Var = new bd0(context, null);
        this.f13253b = bd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f13254c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        bd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        bd0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        bd0Var.b(1.0f, f10, false);
        bd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 5));
        bd0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        linearLayout2.addView(bd0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f13257r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        bd0Var.addView(imageView, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13258s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        bd0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.h = k6Var2;
        int i12 = org.telegram.ui.ActionBar.j6.f20256y6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setGravity(5);
        bd0Var.addView(k6Var2, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.f13256n = s8Var;
        s8Var.f22309c.setLayoutParams(k7.b6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        s8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        s8Var.setOnClickListener(new androidx.mediarouter.app.c(this, 16));
        linearLayout2.addView(s8Var, k7.b6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, k7.b6.q(-1, -2, 80));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.f13255f = p10;
        p10.setOnClickListener(new cg.n(18, this, a1Var));
        p10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(p10, k7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(lf.a.i(aVar.f12055b, aVar.f12054a), !aVar.k(), true, false);
        } else {
            n(lf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new v0(this));
    }

    public final lf.a m() {
        if (this.B.f12054a == lf.b.f12057b) {
            return this.f13261y;
        }
        return this.f13259w;
    }

    public final void n(lf.a aVar, boolean z4, boolean z10, boolean z11) {
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        lf.a aVar2;
        char c3;
        int i10;
        lf.a aVar3;
        boolean z15;
        float f10;
        float f11;
        double d;
        boolean z16;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        lf.a aVar4;
        lf.a aVar5 = this.B;
        int i11 = this.C;
        this.C = 0;
        if (aVar != null) {
            this.B = aVar;
        } else {
            this.B = lf.a.i(0L, aVar5.f12054a);
            this.C |= 1;
        }
        long j11 = m().f12055b;
        lf.a aVar6 = this.B;
        if (j11 < aVar6.f12055b) {
            this.C |= 4;
        }
        boolean k10 = aVar6.k();
        lf.a aVar7 = this.v;
        lf.a aVar8 = this.f13260x;
        lf.b bVar = lf.b.f12057b;
        if (!k10) {
            lf.a aVar9 = this.B;
            if (aVar9.f12054a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f12055b > aVar9.f12055b) {
                this.C |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z10 && aVar5.f12054a == this.B.f12054a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar5.f12055b == this.B.f12055b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i11 == this.C) {
            z14 = false;
        } else {
            z14 = true;
        }
        bd0 bd0Var = this.f13253b;
        if (z14) {
            if ((this.C & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            bd0Var.a(f20);
        }
        lf.b bVar2 = lf.b.f12056a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f13254c;
        if (z12) {
            c3 = 0;
            lf.b bVar3 = this.B.f12054a;
            org.telegram.ui.Components.k6 k6Var = this.e;
            if (bVar3 == bVar2) {
                k6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z11, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                k6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z11, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            kp kpVar = this.f13256n.f22309c;
            if (this.B.f12054a == bVar) {
                z16 = true;
            } else {
                z16 = false;
            }
            kpVar.a(z16, z11);
            ImageView imageView = this.f13258s;
            ImageView imageView2 = this.f13257r;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.B.f12054a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.B.f12054a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.B.f12054a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.B.f12054a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.B.f12054a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.B.f12054a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.B.f12054a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.B.f12054a == bVar) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                imageView.setAlpha(f13);
            }
        } else {
            aVar2 = aVar7;
            c3 = 0;
        }
        if (z12 || z14) {
            int i12 = this.C;
            if ((i12 & 4) != 0) {
                int i13 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = m().f();
                bd0Var.setText(LocaleController.formatString(i13, objArr));
            } else if ((i12 & 2) != 0) {
                int i14 = R.string.ResellGiftPriceTooSmall;
                if (this.B.f12054a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f21 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f21;
                bd0Var.setText(LocaleController.formatString(i14, objArr2));
            } else {
                if (this.B.f12054a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                bd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z12 || z13 || z14) {
            if (this.C == 0 && this.B.f12055b > j12) {
                z15 = true;
            } else {
                z15 = false;
            }
            ph.d dVar = this.f13255f;
            if (dVar.T != z15) {
                dVar.setEnabled(z15);
                dVar.setClickable(z15);
                if (z11) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z15) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    animate3.alpha(f11).setDuration(180L).start();
                } else {
                    if (z15) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    dVar.setAlpha(f10);
                }
            }
        }
        if (z12 || z13) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            lf.a aVar10 = this.B;
            lf.b bVar4 = aVar10.f12054a;
            lf.b bVar5 = aVar10.f12054a;
            long j13 = aVar10.f12055b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) lf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.ui.b.o(R.string.ResellGiftInfoTON, new Object[]{lf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            if (this.B.f12054a == bVar) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb.append(BillingController.getInstance().formatCurrency((long) (this.B.c() * d * 100.0d), "USD", 2));
            this.h.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.B.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new b(this, 5), 50L);
    }
}
