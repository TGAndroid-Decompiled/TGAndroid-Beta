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
import di.yb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.r11;
public final class x1 extends v4.h0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final y1 O;
    public int f15658c;
    public boolean f15665x;
    public final HashMap d = new HashMap();
    public final HashMap f15659e = new HashMap();
    public final HashMap f15660f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f15661n = new ArrayList();
    public final ArrayList f15662r = new ArrayList();
    public final ArrayList f15663s = new ArrayList();
    public final ArrayList f15664w = new ArrayList();
    public int f15666y = 0;
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final b0 N = new b0(this, 5);

    public x1(y1 y1Var) {
        this.O = y1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: hi.x1.D(java.lang.String):void");
    }

    @Override
    public final int b() {
        return this.f15666y;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f15665x && i7 == this.f15666y - 1) {
            return 3;
        }
        if (this.E.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 >= 0) {
            ArrayList arrayList = this.f15663s;
            if (i7 < arrayList.size() && arrayList.get(i7) == this.O.f15715s.f14705o1) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.f15715s;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.p0(-1, (int) i2Var.f14709s1));
            return;
        }
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.E.get(i7);
            if (i12 >= 0) {
                ArrayList arrayList = this.f15661n;
                if (i12 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                    if (this.J == null) {
                        k8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        k8Var.a(0, str2);
                        return;
                    } else {
                        k8Var.b(str2, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i13 = 3;
        if (i10 == 2) {
            ArrayList arrayList2 = this.f15663s;
            if (i7 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i7);
            }
            m1 m1Var = (m1) view;
            if (document == i2Var.f14706p1) {
                m1Var.setSticker(null);
                if (m1Var.f15001a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                    int i14 = org.telegram.ui.ActionBar.m6.Ef;
                    org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i14);
                    org.telegram.ui.ActionBar.t6.k(m1Var, d02, K.f29861a, -1, 2, K.d, i2Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = y1Var.getResources().getDrawable(2131231080).mutate();
                    org.telegram.ui.ActionBar.t6.x(m1Var, mutate, i14, i2Var.J0, PorterDuff.Mode.MULTIPLY);
                    oq oqVar = new oq(d02, mutate);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    oqVar.h = L;
                    oqVar.f38305n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    oqVar.f38303e = L3;
                    oqVar.f38304f = L4;
                    oqVar.f38306r = true;
                    m1Var.f15001a = oqVar;
                }
                m1Var.setDrawable(m1Var.f15001a);
                return;
            }
            ArrayList arrayList3 = this.f15664w;
            if (i7 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i7)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = y1Var.f15489a;
                if (i15 == 0) {
                    if (document != null) {
                        m1Var.setSticker(null);
                        if (y1Var.f15489a == 1) {
                            z11 = true;
                        }
                        m1Var.a(document, z11);
                        return;
                    }
                    m1Var.setSticker(null);
                    if (y1Var.f15489a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m1Var.h != longValue) {
                        org.telegram.ui.Components.p5 p5Var = m1Var.d;
                        if (p5Var != null) {
                            p5Var.n(m1Var);
                        }
                        if (longValue != 0) {
                            m1Var.f15002b = true;
                            m1Var.h = longValue;
                            int i16 = m1Var.f15003c;
                            if (!z10) {
                                i11 = 16388;
                            }
                            if (!qc.e(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(i16, longValue, null, i13);
                            m1Var.d = m10;
                            if (m1Var.f15009w) {
                                m10.a(m1Var);
                                return;
                            }
                            return;
                        }
                        m1Var.f15002b = false;
                        m1Var.h = 0L;
                        m1Var.d = null;
                        return;
                    }
                    return;
                }
                if (i15 == 1) {
                    z11 = true;
                }
                m1Var.a(null, z11);
                m1Var.setSticker(document);
            }
        } else if (i10 == 3) {
            v1 v1Var = (v1) view;
            int i17 = this.L;
            if (v1Var.f15520b != i17) {
                v1Var.f15520b = i17;
                r11.D(k10.f24932t0, v1Var.f15519a);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        yb k8Var;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.f15715s;
        if (i7 == 0) {
            k8Var = new View(y1Var.getContext());
        } else if (i7 == 1) {
            Context context = y1Var.getContext();
            int i11 = i2.C1;
            k8Var = new org.telegram.ui.Cells.k8(context, true, false, i2Var.J0, false);
        } else if (i7 == 3) {
            Context context2 = y1Var.getContext();
            if (y1Var.f15489a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f15520b = -1;
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context2);
            frameLayout.f15519a = q9Var;
            frameLayout.addView(q9Var, c8.na.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i10 = 2131748020;
            } else {
                i10 = 2131747956;
            }
            textView.setText(hd.N0(i10, null));
            frameLayout.addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            k8Var = frameLayout;
        } else if (i7 == 4) {
            yb ybVar = new yb(i2Var, y1Var.getContext());
            ybVar.f10085f = new d1(i2Var, 2);
            k8Var = ybVar;
        } else {
            k8Var = new m1(y1Var.getContext(), y1Var.f15709b);
        }
        return new v4.e1(k8Var);
    }
}
