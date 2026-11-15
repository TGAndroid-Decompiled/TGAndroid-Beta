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
import di.vb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.n11;
public final class x1 extends v4.h0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final y1 O;
    public int f15315c;
    public boolean f15322x;
    public final HashMap d = new HashMap();
    public final HashMap f15316e = new HashMap();
    public final HashMap f15317f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f15318n = new ArrayList();
    public final ArrayList f15319r = new ArrayList();
    public final ArrayList f15320s = new ArrayList();
    public final ArrayList f15321w = new ArrayList();
    public int f15323y = 0;
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final e1 N = new e1(this, 2);

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
        return this.f15323y;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f15322x && i7 == this.f15323y - 1) {
            return 3;
        }
        if (this.E.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 >= 0) {
            ArrayList arrayList = this.f15320s;
            if (i7 < arrayList.size() && arrayList.get(i7) == this.O.f15414s.f14404o1) {
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
        i2 i2Var = y1Var.f15414s;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.p0(-1, (int) i2Var.f14408s1));
            return;
        }
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.E.get(i7);
            if (i12 >= 0) {
                ArrayList arrayList = this.f15318n;
                if (i12 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                    if (this.J == null) {
                        i8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        i8Var.a(0, str2);
                        return;
                    } else {
                        i8Var.b(str2, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i13 = 3;
        if (i10 == 2) {
            ArrayList arrayList2 = this.f15320s;
            if (i7 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i7);
            }
            n1 n1Var = (n1) view;
            if (document == i2Var.f14405p1) {
                n1Var.setSticker(null);
                if (n1Var.f14730a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                    int i14 = org.telegram.ui.ActionBar.j6.Ef;
                    org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i14);
                    org.telegram.ui.ActionBar.q6.k(n1Var, d02, K.f29392a, -1, 2, K.d, i2Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = y1Var.getResources().getDrawable(2131231080).mutate();
                    org.telegram.ui.ActionBar.q6.x(n1Var, mutate, i14, i2Var.J0, PorterDuff.Mode.MULTIPLY);
                    fq fqVar = new fq(d02, mutate);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    fqVar.h = L;
                    fqVar.f34674n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    fqVar.f34672e = L3;
                    fqVar.f34673f = L4;
                    fqVar.f34675r = true;
                    n1Var.f14730a = fqVar;
                }
                n1Var.setDrawable(n1Var.f14730a);
                return;
            }
            ArrayList arrayList3 = this.f15321w;
            if (i7 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i7)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = y1Var.f15179a;
                if (i15 == 0) {
                    if (document != null) {
                        n1Var.setSticker(null);
                        if (y1Var.f15179a == 1) {
                            z11 = true;
                        }
                        n1Var.a(document, z11);
                        return;
                    }
                    n1Var.setSticker(null);
                    if (y1Var.f15179a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n1Var.h != longValue) {
                        org.telegram.ui.Components.g5 g5Var = n1Var.d;
                        if (g5Var != null) {
                            g5Var.n(n1Var);
                        }
                        if (longValue != 0) {
                            n1Var.f14731b = true;
                            n1Var.h = longValue;
                            int i16 = n1Var.f14732c;
                            if (!z10) {
                                i11 = 16388;
                            }
                            if (!qc.e(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(i16, longValue, null, i13);
                            n1Var.d = m10;
                            if (n1Var.f14738w) {
                                m10.a(n1Var);
                                return;
                            }
                            return;
                        }
                        n1Var.f14731b = false;
                        n1Var.h = 0L;
                        n1Var.d = null;
                        return;
                    }
                    return;
                }
                if (i15 == 1) {
                    z11 = true;
                }
                n1Var.a(null, z11);
                n1Var.setSticker(document);
            }
        } else if (i10 == 3) {
            v1 v1Var = (v1) view;
            int i17 = this.L;
            if (v1Var.f15214b != i17) {
                v1Var.f15214b = i17;
                n11.D(m10.f24934t0, v1Var.f15213a);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        vb i8Var;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.f15414s;
        if (i7 == 0) {
            i8Var = new View(y1Var.getContext());
        } else if (i7 == 1) {
            Context context = y1Var.getContext();
            int i11 = i2.C1;
            i8Var = new org.telegram.ui.Cells.i8(context, true, false, i2Var.J0, false);
        } else if (i7 == 3) {
            Context context2 = y1Var.getContext();
            if (y1Var.f15179a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f15214b = -1;
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context2);
            frameLayout.f15213a = i9Var;
            frameLayout.addView(i9Var, c8.ja.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i10 = 2131748213;
            } else {
                i10 = 2131748149;
            }
            textView.setText(hd.M0(i10, null));
            frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            i8Var = frameLayout;
        } else if (i7 == 4) {
            vb vbVar = new vb(i2Var, y1Var.getContext());
            vbVar.f9635f = new d1(i2Var, 2);
            i8Var = vbVar;
        } else {
            i8Var = new n1(y1Var.getContext(), y1Var.f15408b);
        }
        return new v4.e1(i8Var);
    }
}
