package bi;

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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.zp;
public final class k1 extends org.telegram.ui.ActionBar.k3 {
    public bg.a E;
    public int F;
    public final rd0 f4933b;
    public final EditTextBoldCursor f4934c;
    public final TextView d;
    public final org.telegram.ui.Components.s6 e;
    public final fi.d f4935f;
    public final org.telegram.ui.Components.s6 h;
    public final org.telegram.ui.Cells.b9 f4936n;
    public final ImageView f4937r;
    public final ImageView f4938s;
    public final bg.a v;
    public final bg.a f4939w;
    public final bg.a f4940x;
    public final bg.a f4941y;

    public k1(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, bg.a aVar, ai.n1 n1Var) {
        super(1, context, u6Var, true);
        boolean z10;
        float f7;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        bg.b bVar = bg.b.f3981b;
        this.f4940x = bg.a.i(max, bVar);
        this.f4941y = bg.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        bg.b bVar2 = bg.b.f3980a;
        this.v = bg.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), bVar2);
        this.f4939w = bg.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23425h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout d = vh.d(context, 0);
        linearLayout.addView(d, gb1.x(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.e = s6Var;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, null);
        s6Var.setTextSize(AndroidUtilities.dp(20.0f));
        s6Var.setGravity(8388627);
        s6Var.setTypeface(AndroidUtilities.bold());
        d.addView(s6Var, gb1.t(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, gb1.p(1.0f, -1, -2));
        rd0 rd0Var = new rd0(context, null);
        this.f4933b = rd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f4934c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.requestFocus();
        rd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        rd0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        rd0Var.b(1.0f, f7, false);
        rd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 4));
        rd0Var.addView(editTextBoldCursor, gb1.i(-1, -2, 48));
        linearLayout2.addView(rd0Var, gb1.o(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f4937r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        rd0Var.addView(imageView, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f4938s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        rd0Var.addView(imageView2, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.h = s6Var2;
        int i12 = org.telegram.ui.ActionBar.y6.f23746y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, null);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(5);
        rd0Var.addView(s6Var2, gb1.h(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, gb1.x(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f4936n = b9Var;
        b9Var.f23909c.setLayoutParams(gb1.h(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        b9Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        b9Var.setOnClickListener(new ai.s(this, 5));
        linearLayout2.addView(b9Var, gb1.x(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, gb1.u(-1, -2, 80));
        fi.d f10 = vh.f(24, context, u6Var, true);
        this.f4935f = f10;
        f10.setOnClickListener(new q(2, this, n1Var));
        f10.i(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f10, gb1.o(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(bg.a.i(aVar.f3979b, aVar.f3978a), !aVar.k(), true, false);
        } else {
            n(bg.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new j1(this));
    }

    public final bg.a m() {
        if (this.E.f3978a == bg.b.f3981b) {
            return this.f4941y;
        }
        return this.f4939w;
    }

    public final void n(bg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        bg.a aVar2;
        int i10;
        bg.a aVar3;
        boolean z16;
        float f7;
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
        bg.a aVar4;
        bg.a aVar5 = this.E;
        int i11 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = bg.a.i(0L, aVar5.f3978a);
            this.F |= 1;
        }
        long j11 = m().f3979b;
        bg.a aVar6 = this.E;
        if (j11 < aVar6.f3979b) {
            this.F |= 4;
        }
        boolean k10 = aVar6.k();
        bg.a aVar7 = this.v;
        bg.a aVar8 = this.f4940x;
        bg.b bVar = bg.b.f3981b;
        if (!k10) {
            bg.a aVar9 = this.E;
            if (aVar9.f3978a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f3979b > aVar9.f3979b) {
                this.F |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f3978a == this.E.f3978a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f3979b == this.E.f3979b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        rd0 rd0Var = this.f4933b;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            rd0Var.a(f19);
        }
        bg.b bVar2 = bg.b.f3980a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f4934c;
        if (z13) {
            bg.b bVar3 = this.E.f3978a;
            org.telegram.ui.Components.s6 s6Var = this.e;
            if (bVar3 == bVar2) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            zp zpVar = this.f4936n.f23909c;
            if (this.E.f3978a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            zpVar.a(z17, z12);
            ImageView imageView = this.f4938s;
            ImageView imageView2 = this.f4937r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f3978a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.E.f3978a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.E.f3978a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f3978a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.E.f3978a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.E.f3978a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f3978a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.E.f3978a == bVar) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView.setAlpha(f12);
            }
        } else {
            aVar2 = aVar7;
        }
        if (z13 || z15) {
            int i12 = this.F;
            if ((i12 & 4) != 0) {
                rd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, m().f()));
            } else if ((i12 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                if (this.E.f3978a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                rd0Var.setText(LocaleController.formatString(i13, aVar3.f()));
            } else {
                if (this.E.f3978a == bVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                rd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            if (this.F == 0 && this.E.f3979b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            fi.d dVar = this.f4935f;
            if (dVar.f10687c0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    vh.p(animate3, f10, 180L);
                } else {
                    if (z16) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.6f;
                    }
                    dVar.setAlpha(f7);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            bg.a aVar10 = this.E;
            bg.b bVar4 = aVar10.f3978a;
            bg.b bVar5 = aVar10.f3978a;
            long j13 = aVar10.f3979b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) bg.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                vh.o(R.string.ResellGiftInfoTON, new Object[]{bg.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.E.f3978a == bVar) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * d * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 21), 50L);
    }
}
