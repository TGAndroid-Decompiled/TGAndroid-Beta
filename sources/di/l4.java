package di;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
public final class l4 implements View.OnClickListener {
    public final int f8958a;
    public final y4 f8959b;

    public l4(y4 y4Var, int i7) {
        this.f8958a = i7;
        this.f8959b = y4Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        w4 w4Var;
        int i7 = this.f8958a;
        boolean z10 = false;
        y4 y4Var = this.f8959b;
        switch (i7) {
            case 0:
                if (y4Var.Q.getAlpha() >= 1.0f) {
                    y4Var.f9781h0.run();
                    return;
                }
                return;
            case 1:
                if (y4Var.Q.getAlpha() >= 1.0f) {
                    y4Var.f9781h0.run();
                    return;
                }
                return;
            case 2:
                y4Var.getClass();
                y4Var.b((n4) view);
                return;
            case 3:
                y4Var.getClass();
                y4Var.b((n4) view);
                return;
            case 4:
                y4 y4Var2 = this.f8959b;
                LinearLayout linearLayout = y4Var2.H;
                w4[] w4VarArr = y4Var2.f9786n;
                if (y4Var2.getAlpha() >= 1.0f && !y4Var2.f9782i0) {
                    if (y4Var2.f9784k0) {
                        y4Var2.a(y4Var2.f9770a0, y4Var2.f9772b0, y4Var2.f9774c0, y4Var2.f9775d0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (w4 w4Var2 : w4VarArr) {
                        if (w4Var2 != null) {
                            TL_stars.StarGift starGift4 = w4Var2.h;
                            if (starGift4 != null) {
                                starGift3 = starGift4;
                            } else {
                                starGift3 = null;
                            }
                            if (starGift3 != null) {
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                arrayList.add(starGift4);
                            }
                        }
                    }
                    if (!arrayList.isEmpty() && y4Var2.f9779f0 != null) {
                        TextView textView = y4Var2.L;
                        y4Var2.f9782i0 = true;
                        y4Var2.f9784k0 = false;
                        hi.l3 l3Var = y4Var2.U;
                        if (l3Var != null) {
                            l3Var.f(true);
                            y4Var2.U = null;
                        }
                        textView.setText("");
                        y4Var2.M.setText(hd.a0(null, null, 2131749776, ki.k.J0(y4Var2.getGiftsSuccessChance())));
                        for (int i10 = 0; i10 < w4VarArr.length; i10++) {
                            w4 w4Var3 = w4VarArr[i10];
                            if (w4Var3 != null) {
                                w4Var3.setClickable(false);
                                w4 w4Var4 = w4VarArr[i10];
                                TL_stars.StarGift starGift5 = w4Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    w4Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < w4VarArr.length) {
                                w4 w4Var5 = w4VarArr[i11];
                                if (w4Var5 != null) {
                                    TL_stars.StarGift starGift6 = w4Var5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + hd.E(starGift6.num, ','));
                                    }
                                }
                                i11++;
                            }
                        }
                        y4Var2.R.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        y4Var2.S.animate().alpha(1.0f).start();
                        y4Var2.Q.animate().alpha(0.25f).start();
                        y4Var2.K.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (w4 w4Var6 : w4VarArr) {
                            TL_stars.StarGift starGift7 = w4Var6.h;
                            if (starGift7 != null) {
                                starGift = starGift7;
                            } else {
                                starGift = null;
                            }
                            if (starGift != null) {
                                if (starGift7 == null) {
                                    starGift7 = null;
                                }
                                arrayList2.add(starGift7);
                            }
                        }
                        y4Var2.f9779f0.a(arrayList2, new bi.e4(1, y4Var2, arrayList2), new ch.w(y4Var2, 14));
                        return;
                    }
                    org.telegram.messenger.g0.G3(linearLayout);
                    return;
                }
                return;
            default:
                w4 w4Var7 = (w4) view;
                TL_stars.StarGift starGift8 = w4Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !w4Var7.f9656n) {
                    w4Var7.a(null, true);
                    y4Var.d(true);
                    return;
                }
                int i12 = 0;
                while (true) {
                    w4[] w4VarArr2 = y4Var.f9786n;
                    if (i12 < w4VarArr2.length && (w4Var = w4VarArr2[i12]) != view) {
                        if (w4Var != null) {
                            TL_stars.StarGift starGift9 = w4Var.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                            }
                        }
                        i12++;
                    }
                }
                z10 = true;
                y4Var.f9780g0.a(new ai.u1(9, y4Var, w4Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
