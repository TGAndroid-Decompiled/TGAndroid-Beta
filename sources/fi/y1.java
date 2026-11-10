package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.nd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.t11;
public final class y1 extends v4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final z1 N;
    public int f13146c;
    public boolean f13153x;
    public final HashMap d = new HashMap();
    public final HashMap f13147e = new HashMap();
    public final HashMap f13148f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f13149n = new ArrayList();
    public final ArrayList f13150r = new ArrayList();
    public final ArrayList f13151s = new ArrayList();
    public final ArrayList f13152w = new ArrayList();
    public int f13154y = 0;
    public final SparseIntArray D = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final di.f8 M = new di.f8(this, 18);

    public y1(z1 z1Var) {
        this.N = z1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y1.D(java.lang.String):void");
    }

    @Override
    public final int b() {
        return this.f13154y;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f13153x && i7 == this.f13154y - 1) {
            return 3;
        }
        if (this.D.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 >= 0) {
            ArrayList arrayList = this.f13151s;
            if (i7 < arrayList.size() && arrayList.get(i7) == this.N.f13243s.n1) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Document document;
        long longValue;
        boolean z9;
        String str;
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.N;
        k2 k2Var = z1Var.f13243s;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.o0(-1, (int) k2Var.f12258r1));
            return;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.D.get(i7);
            if (i12 >= 0) {
                ArrayList arrayList = this.f13149n;
                if (i12 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                    if (this.I == null) {
                        j8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.I.toLowerCase());
                    if (indexOf < 0) {
                        j8Var.a(0, str2);
                        return;
                    } else {
                        j8Var.b(str2, 0, null, indexOf, this.I.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i13 = 3;
        if (i10 == 2) {
            ArrayList arrayList2 = this.f13151s;
            if (i7 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i7);
            }
            l1 l1Var = (l1) view;
            if (document == k2Var.f12255o1) {
                l1Var.setSticker(null);
                if (l1Var.f12304a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                    int i14 = org.telegram.ui.ActionBar.m6.Bf;
                    org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i14);
                    org.telegram.ui.ActionBar.t6.k(l1Var, d02, K.f28387a, -1, 2, K.d, k2Var.I0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = z1Var.getResources().getDrawable(2131231080).mutate();
                    org.telegram.ui.ActionBar.t6.x(l1Var, mutate, i14, k2Var.I0, PorterDuff.Mode.MULTIPLY);
                    xp xpVar = new xp(d02, mutate);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    xpVar.h = L;
                    xpVar.f40379n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    xpVar.f40377e = L3;
                    xpVar.f40378f = L4;
                    xpVar.f40380r = true;
                    l1Var.f12304a = xpVar;
                }
                l1Var.setDrawable(l1Var.f12304a);
                return;
            }
            ArrayList arrayList3 = this.f13152w;
            if (i7 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i7)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = z1Var.f12883a;
                if (i15 == 0) {
                    if (document != null) {
                        l1Var.setSticker(null);
                        if (z1Var.f12883a == 1) {
                            z10 = true;
                        }
                        l1Var.a(document, z10);
                        return;
                    }
                    l1Var.setSticker(null);
                    if (z1Var.f12883a == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (l1Var.h != longValue) {
                        org.telegram.ui.Components.h5 h5Var = l1Var.d;
                        if (h5Var != null) {
                            h5Var.n(l1Var);
                        }
                        if (longValue != 0) {
                            l1Var.f12305b = true;
                            l1Var.h = longValue;
                            int i16 = l1Var.f12306c;
                            if (!z9) {
                                i11 = 16388;
                            }
                            if (!sc.e(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.h5 m10 = org.telegram.ui.Components.h5.m(i16, longValue, null, i13);
                            l1Var.d = m10;
                            if (l1Var.f12312w) {
                                m10.a(l1Var);
                                return;
                            }
                            return;
                        }
                        l1Var.f12305b = false;
                        l1Var.h = 0L;
                        l1Var.d = null;
                        return;
                    }
                    return;
                }
                if (i15 == 1) {
                    z10 = true;
                }
                l1Var.a(null, z10);
                l1Var.setSticker(document);
            }
        } else if (i10 == 3) {
            v1 v1Var = (v1) view;
            int i17 = this.K;
            if (v1Var.f12917b != i17) {
                v1Var.f12917b = i17;
                t11.D(p10.f24474s0, v1Var.f12916a);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        nd j8Var;
        z1 z1Var = this.N;
        k2 k2Var = z1Var.f13243s;
        if (i7 == 0) {
            j8Var = new View(z1Var.getContext());
        } else if (i7 == 1) {
            Context context = z1Var.getContext();
            int i11 = k2.B1;
            j8Var = new org.telegram.ui.Cells.j8(context, true, false, k2Var.I0, false);
        } else if (i7 == 3) {
            Context context2 = z1Var.getContext();
            if (z1Var.f12883a == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f12917b = -1;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
            frameLayout.f12916a = k9Var;
            frameLayout.addView(k9Var, c8.ha.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z9) {
                i10 = 2131748213;
            } else {
                i10 = 2131748149;
            }
            textView.setText(id.M0(i10, null));
            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = frameLayout;
        } else if (i7 == 4) {
            nd ndVar = new nd(k2Var, z1Var.getContext());
            ndVar.f4441f = new c1(k2Var, 2);
            j8Var = ndVar;
        } else {
            j8Var = new l1(z1Var.getContext(), z1Var.f13237b);
        }
        return new v4.d1(j8Var);
    }
}
