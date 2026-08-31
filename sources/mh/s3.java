package mh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 implements View.OnClickListener {
    public final int f14731a;
    public final f4 f14732b;

    public s3(f4 f4Var, int i10) {
        this.f14731a = i10;
        this.f14732b = f4Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        d4 d4Var;
        int i10 = this.f14731a;
        boolean z4 = true;
        f4 f4Var = this.f14732b;
        switch (i10) {
            case 0:
                if (f4Var.M.getAlpha() >= 1.0f) {
                    f4Var.f14020d0.run();
                    return;
                }
                return;
            case 1:
                if (f4Var.M.getAlpha() >= 1.0f) {
                    f4Var.f14020d0.run();
                    return;
                }
                return;
            case 2:
                f4Var.getClass();
                f4Var.b((u3) view);
                return;
            case 3:
                f4Var.getClass();
                f4Var.b((u3) view);
                return;
            case 4:
                f4 f4Var2 = this.f14732b;
                LinearLayout linearLayout = f4Var2.D;
                d4[] d4VarArr = f4Var2.f14029n;
                if (f4Var2.getAlpha() >= 1.0f && !f4Var2.f14022e0) {
                    if (f4Var2.f14025g0) {
                        f4Var2.a(f4Var2.T, f4Var2.U, f4Var2.V, f4Var2.W);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (d4 d4Var2 : d4VarArr) {
                        if (d4Var2 != null) {
                            TL_stars.StarGift starGift4 = d4Var2.h;
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
                    if (!arrayList.isEmpty() && f4Var2.f14017b0 != null) {
                        TextView textView = f4Var2.H;
                        f4Var2.f14022e0 = true;
                        f4Var2.f14025g0 = false;
                        qh.f3 f3Var = f4Var2.Q;
                        if (f3Var != null) {
                            f3Var.e(true);
                            f4Var2.Q = null;
                        }
                        textView.setText("");
                        f4Var2.I.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, sh.j.G0(f4Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < d4VarArr.length; i11++) {
                            d4 d4Var3 = d4VarArr[i11];
                            if (d4Var3 != null) {
                                d4Var3.setClickable(false);
                                d4 d4Var4 = d4VarArr[i11];
                                TL_stars.StarGift starGift5 = d4Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    d4Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < d4VarArr.length) {
                                d4 d4Var5 = d4VarArr[i12];
                                if (d4Var5 != null) {
                                    TL_stars.StarGift starGift6 = d4Var5.h;
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
                        f4Var2.N.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        f4Var2.O.animate().alpha(1.0f).start();
                        f4Var2.M.animate().alpha(0.25f).start();
                        f4Var2.G.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (d4 d4Var6 : d4VarArr) {
                            TL_stars.StarGift starGift7 = d4Var6.h;
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
                        f4Var2.f14017b0.run(arrayList2, new eh.w(3, f4Var2, arrayList2), new lh.c3(f4Var2, 7));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                d4 d4Var7 = (d4) view;
                TL_stars.StarGift starGift8 = d4Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !d4Var7.f13893n) {
                    d4Var7.a(null, true);
                    f4Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    d4[] d4VarArr2 = f4Var.f14029n;
                    if (i13 < d4VarArr2.length && (d4Var = d4VarArr2[i13]) != view) {
                        if (d4Var != null) {
                            TL_stars.StarGift starGift9 = d4Var.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                                z4 = false;
                            }
                        }
                        i13++;
                    }
                }
                f4Var.f14019c0.run(new lh.a1(6, f4Var, d4Var7), Boolean.valueOf(z4));
                return;
        }
    }
}
