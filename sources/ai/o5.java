package ai;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class o5 implements View.OnClickListener {
    public final int f1946a;
    public final d6 f1947b;

    public o5(d6 d6Var, int i10) {
        this.f1946a = i10;
        this.f1947b = d6Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        b6 b6Var;
        int i10 = this.f1946a;
        boolean z10 = true;
        d6 d6Var = this.f1947b;
        switch (i10) {
            case 0:
                if (d6Var.P.getAlpha() >= 1.0f) {
                    d6Var.f1155g0.run();
                    return;
                }
                return;
            case 1:
                if (d6Var.P.getAlpha() >= 1.0f) {
                    d6Var.f1155g0.run();
                    return;
                }
                return;
            case 2:
                d6Var.getClass();
                d6Var.b((r5) view);
                return;
            case 3:
                d6Var.getClass();
                d6Var.b((r5) view);
                return;
            case 4:
                d6 d6Var2 = this.f1947b;
                LinearLayout linearLayout = d6Var2.G;
                b6[] b6VarArr = d6Var2.f1161n;
                if (d6Var2.getAlpha() >= 1.0f && !d6Var2.f1156h0) {
                    if (d6Var2.f1158j0) {
                        d6Var2.a(d6Var2.W, d6Var2.f1146a0, d6Var2.f1148b0, d6Var2.f1150c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (b6 b6Var2 : b6VarArr) {
                        if (b6Var2 != null) {
                            TL_stars.StarGift starGift4 = b6Var2.h;
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
                    if (!arrayList.isEmpty() && d6Var2.f1152e0 != null) {
                        TextView textView = d6Var2.K;
                        d6Var2.f1156h0 = true;
                        d6Var2.f1158j0 = false;
                        ei.x3 x3Var = d6Var2.T;
                        if (x3Var != null) {
                            x3Var.e(true);
                            d6Var2.T = null;
                        }
                        textView.setText("");
                        d6Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, gi.l.H0(d6Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < b6VarArr.length; i11++) {
                            b6 b6Var3 = b6VarArr[i11];
                            if (b6Var3 != null) {
                                b6Var3.setClickable(false);
                                b6 b6Var4 = b6VarArr[i11];
                                TL_stars.StarGift starGift5 = b6Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    b6Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < b6VarArr.length) {
                                b6 b6Var5 = b6VarArr[i12];
                                if (b6Var5 != null) {
                                    TL_stars.StarGift starGift6 = b6Var5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + LocaleController.formatNumber(starGift6.num, ','));
                                    }
                                }
                                i12++;
                            }
                        }
                        d6Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        d6Var2.R.animate().alpha(1.0f).start();
                        d6Var2.P.animate().alpha(0.25f).start();
                        d6Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (b6 b6Var6 : b6VarArr) {
                            TL_stars.StarGift starGift7 = b6Var6.h;
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
                        d6Var2.f1152e0.run(arrayList2, new q5(0, d6Var2, arrayList2), new a3.d(d6Var2, 14));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                b6 b6Var7 = (b6) view;
                TL_stars.StarGift starGift8 = b6Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !b6Var7.f1028n) {
                    b6Var7.a(null, true);
                    d6Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    b6[] b6VarArr2 = d6Var.f1161n;
                    if (i13 < b6VarArr2.length && (b6Var = b6VarArr2[i13]) != view) {
                        if (b6Var != null) {
                            TL_stars.StarGift starGift9 = b6Var.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                                z10 = false;
                            }
                        }
                        i13++;
                    }
                }
                d6Var.f1154f0.run(new n2(3, d6Var, b6Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
