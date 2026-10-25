package bi;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class k5 implements View.OnClickListener {
    public final int f4953a;
    public final z5 f4954b;

    public k5(z5 z5Var, int i10) {
        this.f4953a = i10;
        this.f4954b = z5Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        x5 x5Var;
        int i10 = this.f4953a;
        boolean z10 = true;
        z5 z5Var = this.f4954b;
        switch (i10) {
            case 0:
                if (z5Var.P.getAlpha() >= 1.0f) {
                    z5Var.f5838g0.run();
                    return;
                }
                return;
            case 1:
                if (z5Var.P.getAlpha() >= 1.0f) {
                    z5Var.f5838g0.run();
                    return;
                }
                return;
            case 2:
                z5Var.getClass();
                z5Var.b((n5) view);
                return;
            case 3:
                z5Var.getClass();
                z5Var.b((n5) view);
                return;
            case 4:
                z5 z5Var2 = this.f4954b;
                LinearLayout linearLayout = z5Var2.G;
                x5[] x5VarArr = z5Var2.f5844n;
                if (z5Var2.getAlpha() >= 1.0f && !z5Var2.f5839h0) {
                    if (z5Var2.f5841j0) {
                        z5Var2.a(z5Var2.W, z5Var2.f5829a0, z5Var2.f5831b0, z5Var2.f5833c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (x5 x5Var2 : x5VarArr) {
                        if (x5Var2 != null) {
                            TL_stars.StarGift starGift4 = x5Var2.h;
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
                    if (!arrayList.isEmpty() && z5Var2.f5835e0 != null) {
                        TextView textView = z5Var2.K;
                        z5Var2.f5839h0 = true;
                        z5Var2.f5841j0 = false;
                        fi.v3 v3Var = z5Var2.T;
                        if (v3Var != null) {
                            v3Var.e(true);
                            z5Var2.T = null;
                        }
                        textView.setText("");
                        z5Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, hi.k.F0(z5Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < x5VarArr.length; i11++) {
                            x5 x5Var3 = x5VarArr[i11];
                            if (x5Var3 != null) {
                                x5Var3.setClickable(false);
                                x5 x5Var4 = x5VarArr[i11];
                                TL_stars.StarGift starGift5 = x5Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    x5Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < x5VarArr.length) {
                                x5 x5Var5 = x5VarArr[i12];
                                if (x5Var5 != null) {
                                    TL_stars.StarGift starGift6 = x5Var5.h;
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
                        z5Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        z5Var2.R.animate().alpha(1.0f).start();
                        z5Var2.P.animate().alpha(0.25f).start();
                        z5Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (x5 x5Var6 : x5VarArr) {
                            TL_stars.StarGift starGift7 = x5Var6.h;
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
                        z5Var2.f5835e0.run(arrayList2, new m5(0, z5Var2, arrayList2), new a3.d(z5Var2, 25));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                x5 x5Var7 = (x5) view;
                TL_stars.StarGift starGift8 = x5Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !x5Var7.f5681n) {
                    x5Var7.a(null, true);
                    z5Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    x5[] x5VarArr2 = z5Var.f5844n;
                    if (i13 < x5VarArr2.length && (x5Var = x5VarArr2[i13]) != view) {
                        if (x5Var != null) {
                            TL_stars.StarGift starGift9 = x5Var.h;
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
                z5Var.f5837f0.run(new ai.n1(4, z5Var, x5Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
