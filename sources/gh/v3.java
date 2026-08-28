package gh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class v3 implements View.OnClickListener {
    public final int f9014a;
    public final i4 f9015b;

    public v3(i4 i4Var, int i9) {
        this.f9014a = i9;
        this.f9015b = i4Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        g4 g4Var;
        int i9 = this.f9014a;
        boolean z10 = true;
        i4 i4Var = this.f9015b;
        switch (i9) {
            case 0:
                if (i4Var.L.getAlpha() >= 1.0f) {
                    i4Var.f8284c0.run();
                    return;
                }
                return;
            case 1:
                if (i4Var.L.getAlpha() >= 1.0f) {
                    i4Var.f8284c0.run();
                    return;
                }
                return;
            case 2:
                i4Var.getClass();
                i4Var.b((x3) view);
                return;
            case 3:
                i4Var.getClass();
                i4Var.b((x3) view);
                return;
            case 4:
                i4 i4Var2 = this.f9015b;
                LinearLayout linearLayout = i4Var2.C;
                g4[] g4VarArr = i4Var2.f8293n;
                if (i4Var2.getAlpha() >= 1.0f && !i4Var2.f8285d0) {
                    if (i4Var2.f8289f0) {
                        i4Var2.a(i4Var2.S, i4Var2.T, i4Var2.U, i4Var2.V);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (g4 g4Var2 : g4VarArr) {
                        if (g4Var2 != null) {
                            TL_stars.StarGift starGift4 = g4Var2.h;
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
                    if (!arrayList.isEmpty() && i4Var2.f8280a0 != null) {
                        TextView textView = i4Var2.G;
                        i4Var2.f8285d0 = true;
                        i4Var2.f8289f0 = false;
                        kh.x3 x3Var = i4Var2.P;
                        if (x3Var != null) {
                            x3Var.e(true);
                            i4Var2.P = null;
                        }
                        textView.setText("");
                        i4Var2.H.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, mh.l.F0(i4Var2.getGiftsSuccessChance())));
                        for (int i10 = 0; i10 < g4VarArr.length; i10++) {
                            g4 g4Var3 = g4VarArr[i10];
                            if (g4Var3 != null) {
                                g4Var3.setClickable(false);
                                g4 g4Var4 = g4VarArr[i10];
                                TL_stars.StarGift starGift5 = g4Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    g4Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < g4VarArr.length) {
                                g4 g4Var5 = g4VarArr[i11];
                                if (g4Var5 != null) {
                                    TL_stars.StarGift starGift6 = g4Var5.h;
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
                                i11++;
                            }
                        }
                        i4Var2.M.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        i4Var2.N.animate().alpha(1.0f).start();
                        i4Var2.L.animate().alpha(0.25f).start();
                        i4Var2.F.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (g4 g4Var6 : g4VarArr) {
                            TL_stars.StarGift starGift7 = g4Var6.h;
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
                        i4Var2.f8280a0.run(arrayList2, new bg.y0(2, i4Var2, arrayList2), new fh.o1(i4Var2, 10));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                g4 g4Var7 = (g4) view;
                TL_stars.StarGift starGift8 = g4Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !g4Var7.f8105n) {
                    g4Var7.a(null, true);
                    i4Var.d(true);
                    return;
                }
                int i12 = 0;
                while (true) {
                    g4[] g4VarArr2 = i4Var.f8293n;
                    if (i12 < g4VarArr2.length && (g4Var = g4VarArr2[i12]) != view) {
                        if (g4Var != null) {
                            TL_stars.StarGift starGift9 = g4Var.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                                z10 = false;
                            }
                        }
                        i12++;
                    }
                }
                i4Var.f8282b0.run(new fh.f1(6, i4Var, g4Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
