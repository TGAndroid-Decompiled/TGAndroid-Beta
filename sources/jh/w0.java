package jh;

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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.uc0;
public final class w0 extends org.telegram.ui.ActionBar.f3 {
    public kf.a A;
    public int B;
    public final uc0 f13002b;
    public final EditTextBoldCursor f13003c;
    public final TextView d;
    public final org.telegram.ui.Components.o6 f13004e;
    public final nh.d f13005f;
    public final org.telegram.ui.Components.o6 h;
    public final org.telegram.ui.Cells.r8 f13006n;
    public final ImageView f13007r;
    public final ImageView f13008s;
    public final kf.a v;
    public final kf.a f13009w;
    public final kf.a f13010x;
    public final kf.a f13011y;

    public w0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, kf.a aVar, ih.b1 b1Var) {
        super(context, c6Var, true, false);
        boolean z10;
        float f9;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        kf.b bVar = kf.b.f13636b;
        this.f13010x = kf.a.i(max, bVar);
        this.f13011y = kf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        kf.b bVar2 = kf.b.f13635a;
        this.v = kf.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f13009w = kf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        linearLayout.addView(g10, i7.f6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f13004e = o6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        o6Var.setTextSize(AndroidUtilities.dp(20.0f));
        o6Var.setGravity(8388627);
        o6Var.setTypeface(AndroidUtilities.bold());
        g10.addView(o6Var, i7.f6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, i7.f6.l(1.0f, -1, -2));
        uc0 uc0Var = new uc0(context, null);
        this.f13002b = uc0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f13003c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        uc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        uc0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        uc0Var.b(1.0f, f9, false);
        uc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ag.a0(this, 5));
        uc0Var.addView(editTextBoldCursor, i7.f6.e(-1, -2, 48));
        linearLayout2.addView(uc0Var, i7.f6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f13007r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        uc0Var.addView(imageView, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13008s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        uc0Var.addView(imageView2, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.h = o6Var2;
        int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setGravity(5);
        uc0Var.addView(o6Var2, i7.f6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, i7.f6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f13006n = r8Var;
        r8Var.f25242c.setLayoutParams(i7.f6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        r8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        r8Var.setOnClickListener(new ag.o(this, 16));
        linearLayout2.addView(r8Var, i7.f6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, i7.f6.q(-1, -2, 80));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f13005f = o10;
        o10.setOnClickListener(new ag.n(18, this, b1Var));
        o10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(o10, i7.f6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(kf.a.i(aVar.f13634b, aVar.f13633a), !aVar.k(), true, false);
        } else {
            n(kf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new v0(this));
    }

    public final kf.a m() {
        if (this.A.f13633a == kf.b.f13636b) {
            return this.f13011y;
        }
        return this.f13009w;
    }

    public final void n(kf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        kf.a aVar2;
        char c3;
        int i10;
        kf.a aVar3;
        boolean z16;
        float f9;
        float f10;
        double d;
        boolean z17;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        kf.a aVar4;
        kf.a aVar5 = this.A;
        int i11 = this.B;
        this.B = 0;
        if (aVar != null) {
            this.A = aVar;
        } else {
            this.A = kf.a.i(0L, aVar5.f13633a);
            this.B |= 1;
        }
        long j11 = m().f13634b;
        kf.a aVar6 = this.A;
        if (j11 < aVar6.f13634b) {
            this.B |= 4;
        }
        boolean k9 = aVar6.k();
        kf.a aVar7 = this.v;
        kf.a aVar8 = this.f13010x;
        kf.b bVar = kf.b.f13636b;
        if (!k9) {
            kf.a aVar9 = this.A;
            if (aVar9.f13633a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f13634b > aVar9.f13634b) {
                this.B |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f13633a == this.A.f13633a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f13634b == this.A.f13634b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.B) {
            z15 = false;
        } else {
            z15 = true;
        }
        uc0 uc0Var = this.f13002b;
        if (z15) {
            if ((this.B & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            uc0Var.a(f19);
        }
        kf.b bVar2 = kf.b.f13635a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f13003c;
        if (z13) {
            c3 = 0;
            kf.b bVar3 = this.A.f13633a;
            org.telegram.ui.Components.o6 o6Var = this.f13004e;
            if (bVar3 == bVar2) {
                o6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                o6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            hp hpVar = this.f13006n.f25242c;
            if (this.A.f13633a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            hpVar.a(z17, z12);
            ImageView imageView = this.f13008s;
            ImageView imageView2 = this.f13007r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.A.f13633a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.A.f13633a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.A.f13633a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.A.f13633a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.A.f13633a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.A.f13633a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.A.f13633a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.A.f13633a == bVar) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView.setAlpha(f12);
            }
        } else {
            aVar2 = aVar7;
            c3 = 0;
        }
        if (z13 || z15) {
            int i12 = this.B;
            if ((i12 & 4) != 0) {
                int i13 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = m().f();
                uc0Var.setText(LocaleController.formatString(i13, objArr));
            } else if ((i12 & 2) != 0) {
                int i14 = R.string.ResellGiftPriceTooSmall;
                if (this.A.f13633a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f20 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f20;
                uc0Var.setText(LocaleController.formatString(i14, objArr2));
            } else {
                if (this.A.f13633a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                uc0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            if (this.B == 0 && this.A.f13634b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            nh.d dVar = this.f13005f;
            if (dVar.S != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    animate3.alpha(f10).setDuration(180L).start();
                } else {
                    if (z16) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.6f;
                    }
                    dVar.setAlpha(f9);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            kf.a aVar10 = this.A;
            kf.b bVar4 = aVar10.f13633a;
            kf.b bVar5 = aVar10.f13633a;
            long j13 = aVar10.f13634b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) kf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.ui.b.p(R.string.ResellGiftInfoTON, new Object[]{kf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.A.f13633a == bVar) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.A.c() * d * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.A.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new o(this, 4), 50L);
    }
}
