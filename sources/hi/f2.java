package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lq;
import org.telegram.ui.q11;
public final class f2 extends v4.i0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final g2 O;
    public int f14420c;
    public boolean f14427x;
    public final HashMap d = new HashMap();
    public final HashMap f14421e = new HashMap();
    public final HashMap f14422f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f14423n = new ArrayList();
    public final ArrayList f14424r = new ArrayList();
    public final ArrayList f14425s = new ArrayList();
    public final ArrayList f14426w = new ArrayList();
    public int f14428y = 0;
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final w N = new w(this, 7);

    public f2(g2 g2Var) {
        this.O = g2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f2.D(java.lang.String):void");
    }

    @Override
    public final int b() {
        return this.f14428y;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f14427x && i7 == this.f14428y - 1) {
            return 3;
        }
        if (this.E.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 >= 0) {
            ArrayList arrayList = this.f14425s;
            if (i7 < arrayList.size() && arrayList.get(i7) == this.O.f14526s.f15277o1) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        g2 g2Var = this.O;
        r2 r2Var = g2Var.f14526s;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.q0(-1, (int) r2Var.f15281s1));
            return;
        }
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.E.get(i7);
            if (i12 >= 0) {
                ArrayList arrayList = this.f14423n;
                if (i12 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                    if (this.J == null) {
                        j8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        j8Var.a(0, str2);
                        return;
                    } else {
                        j8Var.b(str2, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i13 = 3;
        if (i10 == 2) {
            ArrayList arrayList2 = this.f14425s;
            if (i7 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i7);
            }
            v1 v1Var = (v1) view;
            if (document == r2Var.f15278p1) {
                v1Var.setSticker(null);
                if (v1Var.f15541a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                    int i14 = org.telegram.ui.ActionBar.n6.Ef;
                    org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i14);
                    org.telegram.ui.ActionBar.u6.k(v1Var, d02, K.f30010a, -1, 2, K.d, r2Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = g2Var.getResources().getDrawable(2131231082).mutate();
                    org.telegram.ui.ActionBar.u6.x(v1Var, mutate, i14, r2Var.J0, PorterDuff.Mode.MULTIPLY);
                    lq lqVar = new lq(d02, mutate);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    lqVar.h = L;
                    lqVar.f37200n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    lqVar.f37198e = L3;
                    lqVar.f37199f = L4;
                    lqVar.f37201r = true;
                    v1Var.f15541a = lqVar;
                }
                v1Var.setDrawable(v1Var.f15541a);
                return;
            }
            ArrayList arrayList3 = this.f14426w;
            if (i7 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i7)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = g2Var.f14262a;
                if (i15 == 0) {
                    if (document != null) {
                        v1Var.setSticker(null);
                        if (g2Var.f14262a == 1) {
                            z11 = true;
                        }
                        v1Var.a(document, z11);
                        return;
                    }
                    v1Var.setSticker(null);
                    if (g2Var.f14262a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (v1Var.h != longValue) {
                        org.telegram.ui.Components.o5 o5Var = v1Var.d;
                        if (o5Var != null) {
                            o5Var.n(v1Var);
                        }
                        if (longValue != 0) {
                            v1Var.f15542b = true;
                            v1Var.h = longValue;
                            int i16 = v1Var.f15543c;
                            if (!z10) {
                                i11 = 16388;
                            }
                            if (!pc.e(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(i16, longValue, null, i13);
                            v1Var.d = m10;
                            if (v1Var.f15549w) {
                                m10.a(v1Var);
                                return;
                            }
                            return;
                        }
                        v1Var.f15542b = false;
                        v1Var.h = 0L;
                        v1Var.d = null;
                        return;
                    }
                    return;
                }
                if (i15 == 1) {
                    z11 = true;
                }
                v1Var.a(null, z11);
                v1Var.setSticker(document);
            }
        } else if (i10 == 3) {
            d2 d2Var = (d2) view;
            int i17 = this.L;
            if (d2Var.f14308b != i17) {
                d2Var.f14308b = i17;
                q11.D(i10.f24637t0, d2Var.f14307a);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        p2 j8Var;
        g2 g2Var = this.O;
        r2 r2Var = g2Var.f14526s;
        if (i7 == 0) {
            j8Var = new View(g2Var.getContext());
        } else if (i7 == 1) {
            Context context = g2Var.getContext();
            int i11 = r2.D1;
            j8Var = new org.telegram.ui.Cells.j8(context, true, false, r2Var.J0, false);
        } else if (i7 == 3) {
            Context context2 = g2Var.getContext();
            if (g2Var.f14262a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f14308b = -1;
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
            frameLayout.f14307a = p9Var;
            frameLayout.addView(p9Var, c8.na.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i10 = 2131748020;
            } else {
                i10 = 2131747956;
            }
            textView.setText(gd.N0(i10, null));
            frameLayout.addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = frameLayout;
        } else if (i7 == 4) {
            p2 p2Var = new p2(r2Var, g2Var.getContext());
            r2Var.C1.add(p2Var);
            p2Var.f15179e = new m1(r2Var, 2);
            j8Var = p2Var;
        } else {
            j8Var = new v1(g2Var.getContext(), g2Var.f14520b);
        }
        return new v4.f1(j8Var);
    }
}
