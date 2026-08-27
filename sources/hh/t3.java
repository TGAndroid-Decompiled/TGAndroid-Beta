package hh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

public final class t3 implements View.OnClickListener {

    public final int f10054a;

    public final g4 f10055b;

    public t3(g4 g4Var, int i10) {
        this.f10054a = i10;
        this.f10055b = g4Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        e4 e4Var;
        int i10 = this.f10054a;
        boolean z10 = true;
        g4 g4Var = this.f10055b;
        switch (i10) {
            case 0:
                if (g4Var.L.getAlpha() >= 1.0f) {
                    g4Var.f9306c0.run();
                    break;
                }
                break;
            case 1:
                if (g4Var.L.getAlpha() >= 1.0f) {
                    g4Var.f9306c0.run();
                    break;
                }
                break;
            case 2:
                g4Var.getClass();
                g4Var.b((v3) view);
                break;
            case 3:
                g4Var.getClass();
                g4Var.b((v3) view);
                break;
            case 4:
                g4 g4Var2 = this.f10055b;
                LinearLayout linearLayout = g4Var2.C;
                e4[] e4VarArr = g4Var2.f9315n;
                if (g4Var2.getAlpha() >= 1.0f && !g4Var2.f9307d0) {
                    if (g4Var2.f9311f0) {
                        g4Var2.a(g4Var2.S, g4Var2.T, g4Var2.U, g4Var2.V);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (e4 e4Var2 : e4VarArr) {
                            if (e4Var2 != null) {
                                TL_stars.StarGift starGift3 = e4Var2.h;
                                if ((starGift3 != null ? starGift3 : null) != null) {
                                    if (starGift3 == null) {
                                        starGift3 = null;
                                    }
                                    arrayList2.add(starGift3);
                                }
                            }
                        }
                        if (arrayList2.isEmpty() || g4Var2.f9302a0 == null) {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                        } else {
                            TextView textView = g4Var2.G;
                            g4Var2.f9307d0 = true;
                            g4Var2.f9311f0 = false;
                            lh.w3 w3Var = g4Var2.P;
                            if (w3Var != null) {
                                w3Var.e(true);
                                g4Var2.P = null;
                            }
                            textView.setText("");
                            g4Var2.H.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, nh.k.G0(g4Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < e4VarArr.length; i11++) {
                                e4 e4Var3 = e4VarArr[i11];
                                if (e4Var3 != null) {
                                    e4Var3.setClickable(false);
                                    e4 e4Var4 = e4VarArr[i11];
                                    TL_stars.StarGift starGift4 = e4Var4.h;
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    if (starGift4 == null) {
                                        e4Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            for (e4 e4Var5 : e4VarArr) {
                                if (e4Var5 != null) {
                                    TL_stars.StarGift starGift5 = e4Var5.h;
                                    if ((starGift5 != null ? starGift5 : null) != null) {
                                        if (starGift5 == null) {
                                            starGift5 = null;
                                        }
                                        textView.setText(starGift5.title + " #" + LocaleController.formatNumber(starGift5.num, ','));
                                        g4Var2.M.animate().alpha(0.0f).start();
                                        linearLayout.animate().alpha(0.0f).start();
                                        g4Var2.N.animate().alpha(1.0f).start();
                                        g4Var2.L.animate().alpha(0.25f).start();
                                        g4Var2.F.d();
                                        arrayList = new ArrayList();
                                        for (e4 e4Var6 : e4VarArr) {
                                            starGift = e4Var6.h;
                                            if (starGift != null) {
                                                starGift2 = starGift;
                                            } else {
                                                starGift2 = null;
                                            }
                                            if (starGift2 == null) {
                                                if (starGift == null) {
                                                    starGift = null;
                                                }
                                                arrayList.add(starGift);
                                            }
                                        }
                                        g4Var2.f9302a0.run(arrayList, new cg.u0(2, g4Var2, arrayList), new f2.r(g4Var2, 21));
                                        break;
                                    }
                                }
                            }
                            g4Var2.M.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            g4Var2.N.animate().alpha(1.0f).start();
                            g4Var2.L.animate().alpha(0.25f).start();
                            g4Var2.F.d();
                            arrayList = new ArrayList();
                            while (i < e4VarArr.length) {
                                starGift = e4Var6.h;
                                if (starGift != null) {
                                    starGift2 = starGift;
                                } else {
                                    starGift2 = null;
                                }
                                if (starGift2 == null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                            g4Var2.f9302a0.run(arrayList, new cg.u0(2, g4Var2, arrayList), new f2.r(g4Var2, 21));
                        }
                    }
                }
                break;
            default:
                e4 e4Var7 = (e4) view;
                TL_stars.StarGift starGift6 = e4Var7.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 == null || e4Var7.f9171n) {
                    int i12 = 0;
                    while (true) {
                        e4[] e4VarArr2 = g4Var.f9315n;
                        if (i12 < e4VarArr2.length && (e4Var = e4VarArr2[i12]) != view) {
                            if (e4Var != null) {
                                TL_stars.StarGift starGift7 = e4Var.h;
                                if (starGift7 == null) {
                                    starGift7 = null;
                                }
                                if (starGift7 != null) {
                                    z10 = false;
                                }
                            }
                            i12++;
                        }
                    }
                    g4Var.f9304b0.run(new gh.d1(6, g4Var, e4Var7), Boolean.valueOf(z10));
                } else {
                    e4Var7.a(null, true);
                    g4Var.d(true);
                }
                break;
        }
    }
}
