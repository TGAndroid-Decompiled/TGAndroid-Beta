package jh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class t3 implements View.OnClickListener {
    public final int f12836a;
    public final g4 f12837b;

    public t3(g4 g4Var, int i10) {
        this.f12836a = i10;
        this.f12837b = g4Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        e4 e4Var;
        int i10 = this.f12836a;
        boolean z10 = true;
        g4 g4Var = this.f12837b;
        switch (i10) {
            case 0:
                if (g4Var.L.getAlpha() >= 1.0f) {
                    g4Var.f12103c0.run();
                    return;
                }
                return;
            case 1:
                if (g4Var.L.getAlpha() >= 1.0f) {
                    g4Var.f12103c0.run();
                    return;
                }
                return;
            case 2:
                g4Var.getClass();
                g4Var.b((v3) view);
                return;
            case 3:
                g4Var.getClass();
                g4Var.b((v3) view);
                return;
            case 4:
                g4 g4Var2 = this.f12837b;
                LinearLayout linearLayout = g4Var2.C;
                e4[] e4VarArr = g4Var2.f12112n;
                if (g4Var2.getAlpha() >= 1.0f && !g4Var2.f12104d0) {
                    if (g4Var2.f12108f0) {
                        g4Var2.a(g4Var2.S, g4Var2.T, g4Var2.U, g4Var2.V);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (e4 e4Var2 : e4VarArr) {
                        if (e4Var2 != null) {
                            TL_stars.StarGift starGift4 = e4Var2.h;
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
                    if (!arrayList.isEmpty() && g4Var2.f12099a0 != null) {
                        TextView textView = g4Var2.G;
                        g4Var2.f12104d0 = true;
                        g4Var2.f12108f0 = false;
                        nh.t3 t3Var = g4Var2.P;
                        if (t3Var != null) {
                            t3Var.e(true);
                            g4Var2.P = null;
                        }
                        textView.setText("");
                        g4Var2.H.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ph.j.G0(g4Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < e4VarArr.length; i11++) {
                            e4 e4Var3 = e4VarArr[i11];
                            if (e4Var3 != null) {
                                e4Var3.setClickable(false);
                                e4 e4Var4 = e4VarArr[i11];
                                TL_stars.StarGift starGift5 = e4Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    e4Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < e4VarArr.length) {
                                e4 e4Var5 = e4VarArr[i12];
                                if (e4Var5 != null) {
                                    TL_stars.StarGift starGift6 = e4Var5.h;
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
                        g4Var2.M.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        g4Var2.N.animate().alpha(1.0f).start();
                        g4Var2.L.animate().alpha(0.25f).start();
                        g4Var2.F.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (e4 e4Var6 : e4VarArr) {
                            TL_stars.StarGift starGift7 = e4Var6.h;
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
                        g4Var2.f12099a0.run(arrayList2, new bh.v(3, g4Var2, arrayList2), new o(g4Var2, 5));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                e4 e4Var7 = (e4) view;
                TL_stars.StarGift starGift8 = e4Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !e4Var7.f12004n) {
                    e4Var7.a(null, true);
                    g4Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    e4[] e4VarArr2 = g4Var.f12112n;
                    if (i13 < e4VarArr2.length && (e4Var = e4VarArr2[i13]) != view) {
                        if (e4Var != null) {
                            TL_stars.StarGift starGift9 = e4Var.h;
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
                g4Var.f12101b0.run(new ih.b1(6, g4Var, e4Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
