package mh;

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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.np;
public final class v0 extends org.telegram.ui.ActionBar.h3 {
    public mf.a B;
    public int C;
    public final cd0 f14915b;
    public final EditTextBoldCursor f14916c;
    public final TextView d;
    public final org.telegram.ui.Components.k6 f14917e;
    public final qh.d f14918f;
    public final org.telegram.ui.Components.k6 h;
    public final org.telegram.ui.Cells.t8 f14919n;
    public final ImageView f14920r;
    public final ImageView f14921s;
    public final mf.a v;
    public final mf.a f14922w;
    public final mf.a f14923x;
    public final mf.a f14924y;

    public v0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, mf.a aVar, lh.a1 a1Var) {
        super(context, g6Var, true, false);
        boolean z4;
        float f10;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        mf.b bVar = mf.b.f13654b;
        this.f14923x = mf.a.i(max, bVar);
        this.f14924y = mf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        mf.b bVar2 = mf.b.f13653a;
        this.v = mf.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f14922w = mf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f11, k7.c6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f14917e = k6Var;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        k6Var.setTextSize(AndroidUtilities.dp(20.0f));
        k6Var.setGravity(8388627);
        k6Var.setTypeface(AndroidUtilities.bold());
        f11.addView(k6Var, k7.c6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.c6.l(1.0f, -1, -2));
        cd0 cd0Var = new cd0(context, null);
        this.f14915b = cd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f14916c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        cd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        cd0Var.e(editTextBoldCursor);
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
        cd0Var.b(1.0f, f10, false);
        cd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new dg.z(this, 5));
        cd0Var.addView(editTextBoldCursor, k7.c6.e(-1, -2, 48));
        linearLayout2.addView(cd0Var, k7.c6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f14920r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        cd0Var.addView(imageView, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f14921s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        cd0Var.addView(imageView2, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.h = k6Var2;
        int i12 = org.telegram.ui.ActionBar.k6.f22038y6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setGravity(5);
        cd0Var.addView(k6Var2, k7.c6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.f14919n = t8Var;
        t8Var.f24178c.setLayoutParams(k7.c6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        t8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        t8Var.setOnClickListener(new androidx.mediarouter.app.c(this, 16));
        linearLayout2.addView(t8Var, k7.c6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, k7.c6.q(-1, -2, 80));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.f14918f = p10;
        p10.setOnClickListener(new dg.n(18, this, a1Var));
        p10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(p10, k7.c6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(mf.a.i(aVar.f13652b, aVar.f13651a), !aVar.k(), true, false);
        } else {
            n(mf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new u0(this));
    }

    public final mf.a m() {
        if (this.B.f13651a == mf.b.f13654b) {
            return this.f14924y;
        }
        return this.f14922w;
    }

    public final void n(mf.a aVar, boolean z4, boolean z10, boolean z11) {
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        mf.a aVar2;
        char c3;
        int i10;
        mf.a aVar3;
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
        mf.a aVar4;
        mf.a aVar5 = this.B;
        int i11 = this.C;
        this.C = 0;
        if (aVar != null) {
            this.B = aVar;
        } else {
            this.B = mf.a.i(0L, aVar5.f13651a);
            this.C |= 1;
        }
        long j11 = m().f13652b;
        mf.a aVar6 = this.B;
        if (j11 < aVar6.f13652b) {
            this.C |= 4;
        }
        boolean k10 = aVar6.k();
        mf.a aVar7 = this.v;
        mf.a aVar8 = this.f14923x;
        mf.b bVar = mf.b.f13654b;
        if (!k10) {
            mf.a aVar9 = this.B;
            if (aVar9.f13651a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f13652b > aVar9.f13652b) {
                this.C |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z10 && aVar5.f13651a == this.B.f13651a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar5.f13652b == this.B.f13652b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i11 == this.C) {
            z14 = false;
        } else {
            z14 = true;
        }
        cd0 cd0Var = this.f14915b;
        if (z14) {
            if ((this.C & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            cd0Var.a(f20);
        }
        mf.b bVar2 = mf.b.f13653a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f14916c;
        if (z12) {
            c3 = 0;
            mf.b bVar3 = this.B.f13651a;
            org.telegram.ui.Components.k6 k6Var = this.f14917e;
            if (bVar3 == bVar2) {
                k6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z11, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                k6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z11, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            np npVar = this.f14919n.f24178c;
            if (this.B.f13651a == bVar) {
                z16 = true;
            } else {
                z16 = false;
            }
            npVar.a(z16, z11);
            ImageView imageView = this.f14921s;
            ImageView imageView2 = this.f14920r;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.B.f13651a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.B.f13651a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.B.f13651a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.B.f13651a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.B.f13651a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.B.f13651a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.B.f13651a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.B.f13651a == bVar) {
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
                cd0Var.setText(LocaleController.formatString(i13, objArr));
            } else if ((i12 & 2) != 0) {
                int i14 = R.string.ResellGiftPriceTooSmall;
                if (this.B.f13651a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f21 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c3] = f21;
                cd0Var.setText(LocaleController.formatString(i14, objArr2));
            } else {
                if (this.B.f13651a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                cd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z12 || z13 || z14) {
            if (this.C == 0 && this.B.f13652b > j12) {
                z15 = true;
            } else {
                z15 = false;
            }
            qh.d dVar = this.f14918f;
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
            mf.a aVar10 = this.B;
            mf.b bVar4 = aVar10.f13651a;
            mf.b bVar5 = aVar10.f13651a;
            long j13 = aVar10.f13652b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) mf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.ui.b.o(R.string.ResellGiftInfoTON, new Object[]{mf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            if (this.B.f13651a == bVar) {
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
        AndroidUtilities.runOnUIThread(new lh.c3(this, 6), 50L);
    }
}
