package di;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
public final class o4 implements View.OnClickListener {
    public final int f9456a;
    public final b5 f9457b;

    public o4(b5 b5Var, int i7) {
        this.f9456a = i7;
        this.f9457b = b5Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        z4 z4Var;
        int i7 = this.f9456a;
        boolean z10 = true;
        b5 b5Var = this.f9457b;
        switch (i7) {
            case 0:
                if (b5Var.Q.getAlpha() >= 1.0f) {
                    b5Var.f8567h0.run();
                    return;
                }
                return;
            case 1:
                if (b5Var.Q.getAlpha() >= 1.0f) {
                    b5Var.f8567h0.run();
                    return;
                }
                return;
            case 2:
                b5Var.getClass();
                b5Var.b((q4) view);
                return;
            case 3:
                b5Var.getClass();
                b5Var.b((q4) view);
                return;
            case 4:
                b5 b5Var2 = this.f9457b;
                LinearLayout linearLayout = b5Var2.H;
                z4[] z4VarArr = b5Var2.f8572n;
                if (b5Var2.getAlpha() >= 1.0f && !b5Var2.f8568i0) {
                    if (b5Var2.f8570k0) {
                        b5Var2.a(b5Var2.f8556a0, b5Var2.f8558b0, b5Var2.f8560c0, b5Var2.f8561d0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (z4 z4Var2 : z4VarArr) {
                        if (z4Var2 != null) {
                            TL_stars.StarGift starGift4 = z4Var2.h;
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
                    if (!arrayList.isEmpty() && b5Var2.f8565f0 != null) {
                        TextView textView = b5Var2.L;
                        b5Var2.f8568i0 = true;
                        b5Var2.f8570k0 = false;
                        hi.l3 l3Var = b5Var2.U;
                        if (l3Var != null) {
                            l3Var.f(true);
                            b5Var2.U = null;
                        }
                        textView.setText("");
                        b5Var2.M.setText(gd.a0(null, null, 2131749759, ki.j.J0(b5Var2.getGiftsSuccessChance())));
                        for (int i10 = 0; i10 < z4VarArr.length; i10++) {
                            z4 z4Var3 = z4VarArr[i10];
                            if (z4Var3 != null) {
                                z4Var3.setClickable(false);
                                z4 z4Var4 = z4VarArr[i10];
                                TL_stars.StarGift starGift5 = z4Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    z4Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < z4VarArr.length) {
                                z4 z4Var5 = z4VarArr[i11];
                                if (z4Var5 != null) {
                                    TL_stars.StarGift starGift6 = z4Var5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + gd.E(starGift6.num, ','));
                                    }
                                }
                                i11++;
                            }
                        }
                        b5Var2.R.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        b5Var2.S.animate().alpha(1.0f).start();
                        b5Var2.Q.animate().alpha(0.25f).start();
                        b5Var2.K.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (z4 z4Var6 : z4VarArr) {
                            TL_stars.StarGift starGift7 = z4Var6.h;
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
                        b5Var2.f8565f0.a(arrayList2, new bi.p6(3, b5Var2, arrayList2), new ca.r(b5Var2, 18));
                        return;
                    }
                    org.telegram.messenger.g0.F3(linearLayout);
                    return;
                }
                return;
            default:
                z4 z4Var7 = (z4) view;
                TL_stars.StarGift starGift8 = z4Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !z4Var7.f10139n) {
                    z4Var7.a(null, true);
                    b5Var.d(true);
                    return;
                }
                int i12 = 0;
                while (true) {
                    z4[] z4VarArr2 = b5Var.f8572n;
                    if (i12 < z4VarArr2.length && (z4Var = z4VarArr2[i12]) != view) {
                        if (z4Var != null) {
                            TL_stars.StarGift starGift9 = z4Var.h;
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
                b5Var.f8566g0.a(new ai.x1(11, b5Var, z4Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
