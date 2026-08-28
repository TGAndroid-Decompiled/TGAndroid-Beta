package gh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.fc0;
public final class x0 extends org.telegram.ui.ActionBar.f3 {
    public gf.a A;
    public int B;
    public final fc0 f9128b;
    public final EditTextBoldCursor f9129c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 f9130e;
    public final kh.d f9131f;
    public final org.telegram.ui.Components.j6 h;
    public final org.telegram.ui.Cells.u8 f9132n;
    public final ImageView f9133r;
    public final ImageView f9134s;
    public final gf.a v;
    public final gf.a f9135w;
    public final gf.a f9136x;
    public final gf.a f9137y;

    public x0(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, gf.a aVar, fh.f1 f1Var) {
        super(context, b6Var, true, false);
        boolean z10;
        float f10;
        this.currentAccount = i9;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i9).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        gf.b bVar = gf.b.f7750b;
        this.f9136x = gf.a.i(max, bVar);
        this.f9137y = gf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        gf.b bVar2 = gf.b.f7749a;
        this.v = gf.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f9135w = gf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = ll.f(context, 0);
        linearLayout.addView(f11, g7.e6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f9130e = j6Var;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setGravity(8388627);
        j6Var.setTypeface(AndroidUtilities.bold());
        f11.addView(j6Var, g7.e6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, g7.e6.l(1.0f, -1, -2));
        fc0 fc0Var = new fc0(context, null);
        this.f9128b = fc0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f9129c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        editTextBoldCursor.requestFocus();
        fc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        fc0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        fc0Var.b(1.0f, f10, false);
        fc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 3));
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        linearLayout2.addView(fc0Var, g7.e6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f9133r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        fc0Var.addView(imageView, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9134s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        fc0Var.addView(imageView2, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.h = j6Var2;
        int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(5);
        fc0Var.addView(j6Var2, g7.e6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.u8 u8Var = new org.telegram.ui.Cells.u8(context);
        this.f9132n = u8Var;
        u8Var.f25762c.setLayoutParams(g7.e6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        u8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        u8Var.setOnClickListener(new androidx.mediarouter.app.c(this, 10));
        linearLayout2.addView(u8Var, g7.e6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, g7.e6.q(-1, -2, 80));
        kh.d i12 = ll.i(24, context, b6Var, true);
        this.f9131f = i12;
        i12.setOnClickListener(new bg.u1(14, this, f1Var));
        i12.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(i12, g7.e6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(gf.a.i(aVar.f7748b, aVar.f7747a), !aVar.k(), true, false);
        } else {
            n(gf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new w0(this));
    }

    public final gf.a m() {
        if (this.A.f7747a == gf.b.f7750b) {
            return this.f9137y;
        }
        return this.f9135w;
    }

    public final void n(gf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        gf.a aVar2;
        char c10;
        int i9;
        gf.a aVar3;
        boolean z16;
        float f10;
        float f11;
        double d;
        boolean z17;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        gf.a aVar4;
        gf.a aVar5 = this.A;
        int i10 = this.B;
        this.B = 0;
        if (aVar != null) {
            this.A = aVar;
        } else {
            this.A = gf.a.i(0L, aVar5.f7747a);
            this.B |= 1;
        }
        long j11 = m().f7748b;
        gf.a aVar6 = this.A;
        if (j11 < aVar6.f7748b) {
            this.B |= 4;
        }
        boolean k10 = aVar6.k();
        gf.a aVar7 = this.v;
        gf.a aVar8 = this.f9136x;
        gf.b bVar = gf.b.f7750b;
        if (!k10) {
            gf.a aVar9 = this.A;
            if (aVar9.f7747a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f7748b > aVar9.f7748b) {
                this.B |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f7747a == this.A.f7747a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f7748b == this.A.f7748b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i10 == this.B) {
            z15 = false;
        } else {
            z15 = true;
        }
        fc0 fc0Var = this.f9128b;
        if (z15) {
            if ((this.B & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            fc0Var.a(f20);
        }
        gf.b bVar2 = gf.b.f7749a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f9129c;
        if (z13) {
            c10 = 0;
            gf.b bVar3 = this.A.f7747a;
            org.telegram.ui.Components.j6 j6Var = this.f9130e;
            if (bVar3 == bVar2) {
                j6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                j6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            dp dpVar = this.f9132n.f25762c;
            if (this.A.f7747a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            dpVar.a(z17, z12);
            ImageView imageView = this.f9134s;
            ImageView imageView2 = this.f9133r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.A.f7747a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.A.f7747a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.A.f7747a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.A.f7747a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.A.f7747a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.A.f7747a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.A.f7747a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.A.f7747a == bVar) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                imageView.setAlpha(f13);
            }
        } else {
            aVar2 = aVar7;
            c10 = 0;
        }
        if (z13 || z15) {
            int i11 = this.B;
            if ((i11 & 4) != 0) {
                int i12 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = m().f();
                fc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                if (this.A.f7747a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                String f21 = aVar3.f();
                Object[] objArr2 = new Object[1];
                objArr2[c10] = f21;
                fc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                if (this.A.f7747a == bVar2) {
                    i9 = R.string.ResellGiftPriceTitle;
                } else {
                    i9 = R.string.ResellGiftPriceTitleTON;
                }
                fc0Var.setText(LocaleController.getString(i9));
            }
        }
        if (z13 || z14 || z15) {
            if (this.B == 0 && this.A.f7748b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            kh.d dVar = this.f9131f;
            if (dVar.S != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    animate3.alpha(f11).setDuration(180L).start();
                } else {
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    dVar.setAlpha(f10);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            gf.a aVar10 = this.A;
            gf.b bVar4 = aVar10.f7747a;
            gf.b bVar5 = aVar10.f7747a;
            long j13 = aVar10.f7748b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) gf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                ll.q(R.string.ResellGiftInfoTON, new Object[]{gf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.A.f7747a == bVar) {
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
        AndroidUtilities.runOnUIThread(new fh.o1(this, 9), 50L);
    }
}
