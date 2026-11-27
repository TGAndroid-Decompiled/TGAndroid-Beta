package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class jta implements View.OnClickListener {
    public final byte a;
    public final vta b;

    public jta(vta vtaVar, byte b) {
        this.a = b;
        this.b = vtaVar;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        tta ttaVar;
        byte b = this.a;
        boolean z = true;
        vta vtaVar = this.b;
        switch (b) {
            case 0:
                if (vtaVar.Q.getAlpha() >= 1.0f) {
                    vtaVar.h0.run();
                    return;
                }
                return;
            case 1:
                if (vtaVar.Q.getAlpha() >= 1.0f) {
                    vtaVar.h0.run();
                    return;
                }
                return;
            case 2:
                vtaVar.b((lta) view);
                return;
            case 3:
                vtaVar.b((lta) view);
                return;
            case 4:
                vta vtaVar2 = this.b;
                LinearLayout linearLayout = vtaVar2.H;
                tta[] ttaVarArr = vtaVar2.n;
                if (vtaVar2.getAlpha() >= 1.0f && !vtaVar2.i0) {
                    if (vtaVar2.k0) {
                        vtaVar2.a(vtaVar2.a0, vtaVar2.b0, vtaVar2.c0, vtaVar2.d0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (tta ttaVar2 : ttaVarArr) {
                        if (ttaVar2 != null) {
                            TL_stars.StarGift starGift4 = ttaVar2.h;
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
                    if (!arrayList.isEmpty() && vtaVar2.f0 != null) {
                        TextView textView = vtaVar2.L;
                        vtaVar2.i0 = true;
                        vtaVar2.k0 = false;
                        kg5 kg5Var = vtaVar2.U;
                        if (kg5Var != null) {
                            kg5Var.f(true);
                            vtaVar2.U = null;
                        }
                        textView.setText("");
                        vtaVar2.M.setText(ob6.a0(null, null, 2131749722, cc.J0(vtaVar2.getGiftsSuccessChance())));
                        for (int i = 0; i < ttaVarArr.length; i++) {
                            tta ttaVar3 = ttaVarArr[i];
                            if (ttaVar3 != null) {
                                ttaVar3.setClickable(false);
                                tta ttaVar4 = ttaVarArr[i];
                                TL_stars.StarGift starGift5 = ttaVar4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    ttaVar4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 < ttaVarArr.length) {
                                tta ttaVar5 = ttaVarArr[i2];
                                if (ttaVar5 != null) {
                                    TL_stars.StarGift starGift6 = ttaVar5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + ob6.E(starGift6.num, ','));
                                    }
                                }
                                i2++;
                            }
                        }
                        vtaVar2.R.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        vtaVar2.S.animate().alpha(1.0f).start();
                        vtaVar2.Q.animate().alpha(0.25f).start();
                        vtaVar2.K.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (tta ttaVar6 : ttaVarArr) {
                            TL_stars.StarGift starGift7 = ttaVar6.h;
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
                        vtaVar2.f0.a(arrayList2, new ia7(vtaVar2, arrayList2, (byte) 11), new uoa(vtaVar2, (byte) 4));
                        return;
                    }
                    hl.B3(linearLayout);
                    return;
                }
                return;
            default:
                tta ttaVar7 = (tta) view;
                TL_stars.StarGift starGift8 = ttaVar7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !ttaVar7.n) {
                    ttaVar7.a(null, true);
                    vtaVar.d(true);
                    return;
                }
                int i3 = 0;
                while (true) {
                    tta[] ttaVarArr2 = vtaVar.n;
                    if (i3 < ttaVarArr2.length && (ttaVar = ttaVarArr2[i3]) != view) {
                        if (ttaVar != null) {
                            TL_stars.StarGift starGift9 = ttaVar.h;
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
                vtaVar.g0.a(new ku9(vtaVar, ttaVar7, (byte) 10), Boolean.valueOf(z));
                return;
        }
    }
}
