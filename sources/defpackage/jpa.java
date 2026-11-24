package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class jpa implements View.OnClickListener {
    public final byte a;
    public final upa b;

    public jpa(upa upaVar, byte b) {
        this.a = b;
        this.b = upaVar;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        spa spaVar;
        byte b = this.a;
        boolean z = true;
        upa upaVar = this.b;
        switch (b) {
            case 0:
                if (upaVar.Q.getAlpha() >= 1.0f) {
                    upaVar.h0.run();
                    return;
                }
                return;
            case 1:
                if (upaVar.Q.getAlpha() >= 1.0f) {
                    upaVar.h0.run();
                    return;
                }
                return;
            case 2:
                upaVar.b((kpa) view);
                return;
            case 3:
                upaVar.b((kpa) view);
                return;
            case 4:
                upa upaVar2 = this.b;
                LinearLayout linearLayout = upaVar2.H;
                spa[] spaVarArr = upaVar2.n;
                if (upaVar2.getAlpha() >= 1.0f && !upaVar2.i0) {
                    if (upaVar2.k0) {
                        upaVar2.a(upaVar2.a0, upaVar2.b0, upaVar2.c0, upaVar2.d0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (spa spaVar2 : spaVarArr) {
                        if (spaVar2 != null) {
                            TL_stars.StarGift starGift4 = spaVar2.h;
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
                    if (!arrayList.isEmpty() && upaVar2.f0 != null) {
                        TextView textView = upaVar2.L;
                        upaVar2.i0 = true;
                        upaVar2.k0 = false;
                        je5 je5Var = upaVar2.U;
                        if (je5Var != null) {
                            je5Var.f(true);
                            upaVar2.U = null;
                        }
                        textView.setText("");
                        upaVar2.M.setText(k96.a0(null, null, 2131749760, bc.I0(upaVar2.getGiftsSuccessChance())));
                        for (int i = 0; i < spaVarArr.length; i++) {
                            spa spaVar3 = spaVarArr[i];
                            if (spaVar3 != null) {
                                spaVar3.setClickable(false);
                                spa spaVar4 = spaVarArr[i];
                                TL_stars.StarGift starGift5 = spaVar4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    spaVar4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 < spaVarArr.length) {
                                spa spaVar5 = spaVarArr[i2];
                                if (spaVar5 != null) {
                                    TL_stars.StarGift starGift6 = spaVar5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + k96.E(starGift6.num, ','));
                                    }
                                }
                                i2++;
                            }
                        }
                        upaVar2.R.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        upaVar2.S.animate().alpha(1.0f).start();
                        upaVar2.Q.animate().alpha(0.25f).start();
                        upaVar2.K.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (spa spaVar6 : spaVarArr) {
                            TL_stars.StarGift starGift7 = spaVar6.h;
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
                        upaVar2.f0.a(arrayList2, new w77(upaVar2, arrayList2, (byte) 11), new z6a(upaVar2, (byte) 17));
                        return;
                    }
                    gl.B3(linearLayout);
                    return;
                }
                return;
            default:
                spa spaVar7 = (spa) view;
                TL_stars.StarGift starGift8 = spaVar7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !spaVar7.n) {
                    spaVar7.a(null, true);
                    upaVar.d(true);
                    return;
                }
                int i3 = 0;
                while (true) {
                    spa[] spaVarArr2 = upaVar.n;
                    if (i3 < spaVarArr2.length && (spaVar = spaVarArr2[i3]) != view) {
                        if (spaVar != null) {
                            TL_stars.StarGift starGift9 = spaVar.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                                z = false;
                            }
                        }
                        i3++;
                    }
                }
                upaVar.g0.a(new nu9(upaVar, spaVar7, (byte) 10), Boolean.valueOf(z));
                return;
        }
    }
}
