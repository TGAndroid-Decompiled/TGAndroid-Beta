package ai;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class p5 implements View.OnClickListener {
    public final int f1989a;
    public final e6 f1990b;

    public p5(e6 e6Var, int i10) {
        this.f1989a = i10;
        this.f1990b = e6Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        c6 c6Var;
        int i10 = this.f1989a;
        boolean z10 = true;
        e6 e6Var = this.f1990b;
        switch (i10) {
            case 0:
                if (e6Var.P.getAlpha() >= 1.0f) {
                    e6Var.f1205g0.run();
                    return;
                }
                return;
            case 1:
                if (e6Var.P.getAlpha() >= 1.0f) {
                    e6Var.f1205g0.run();
                    return;
                }
                return;
            case 2:
                e6Var.getClass();
                e6Var.b((s5) view);
                return;
            case 3:
                e6Var.getClass();
                e6Var.b((s5) view);
                return;
            case 4:
                e6 e6Var2 = this.f1990b;
                LinearLayout linearLayout = e6Var2.G;
                c6[] c6VarArr = e6Var2.f1211n;
                if (e6Var2.getAlpha() >= 1.0f && !e6Var2.f1206h0) {
                    if (e6Var2.f1208j0) {
                        e6Var2.a(e6Var2.W, e6Var2.f1196a0, e6Var2.f1198b0, e6Var2.f1200c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (c6 c6Var2 : c6VarArr) {
                        if (c6Var2 != null) {
                            TL_stars.StarGift starGift4 = c6Var2.h;
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
                    if (!arrayList.isEmpty() && e6Var2.f1202e0 != null) {
                        TextView textView = e6Var2.K;
                        e6Var2.f1206h0 = true;
                        e6Var2.f1208j0 = false;
                        ei.x3 x3Var = e6Var2.T;
                        if (x3Var != null) {
                            x3Var.e(true);
                            e6Var2.T = null;
                        }
                        textView.setText("");
                        e6Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, gi.l.H0(e6Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < c6VarArr.length; i11++) {
                            c6 c6Var3 = c6VarArr[i11];
                            if (c6Var3 != null) {
                                c6Var3.setClickable(false);
                                c6 c6Var4 = c6VarArr[i11];
                                TL_stars.StarGift starGift5 = c6Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    c6Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < c6VarArr.length) {
                                c6 c6Var5 = c6VarArr[i12];
                                if (c6Var5 != null) {
                                    TL_stars.StarGift starGift6 = c6Var5.h;
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
                        e6Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        e6Var2.R.animate().alpha(1.0f).start();
                        e6Var2.P.animate().alpha(0.25f).start();
                        e6Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (c6 c6Var6 : c6VarArr) {
                            TL_stars.StarGift starGift7 = c6Var6.h;
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
                        e6Var2.f1202e0.run(arrayList2, new r5(0, e6Var2, arrayList2), new a3.d(e6Var2, 14));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                c6 c6Var7 = (c6) view;
                TL_stars.StarGift starGift8 = c6Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !c6Var7.f1086n) {
                    c6Var7.a(null, true);
                    e6Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    c6[] c6VarArr2 = e6Var.f1211n;
                    if (i13 < c6VarArr2.length && (c6Var = c6VarArr2[i13]) != view) {
                        if (c6Var != null) {
                            TL_stars.StarGift starGift9 = c6Var.h;
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
                e6Var.f1204f0.run(new o2(3, e6Var, c6Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
