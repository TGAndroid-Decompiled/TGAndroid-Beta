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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.q11;
public final class y1 extends v4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final z1 N;
    public int f13144c;
    public boolean f13151x;
    public final HashMap d = new HashMap();
    public final HashMap f13145e = new HashMap();
    public final HashMap f13146f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f13147n = new ArrayList();
    public final ArrayList f13148r = new ArrayList();
    public final ArrayList f13149s = new ArrayList();
    public final ArrayList f13150w = new ArrayList();
    public int f13152y = 0;
    public final SparseIntArray D = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final di.s7 M = new di.s7(this, 19);

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
        return this.f13152y;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f13151x && i7 == this.f13152y - 1) {
            return 3;
        }
        if (this.D.get(i7, -1) >= 0) {
            return 1;
        }
        if (i7 >= 0) {
            ArrayList arrayList = this.f13149s;
            if (i7 < arrayList.size() && arrayList.get(i7) == this.N.f13241s.f12254k1) {
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
        k2 k2Var = z1Var.f13241s;
        int i10 = d1Var.f56956f;
        View view = d1Var.f56952a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new v4.o0(-1, (int) k2Var.f12256o1));
            return;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.D.get(i7);
            if (i12 >= 0) {
                ArrayList arrayList = this.f13147n;
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
            ArrayList arrayList2 = this.f13149s;
            if (i7 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i7);
            }
            l1 l1Var = (l1) view;
            if (document == k2Var.l1) {
                l1Var.setSticker(null);
                if (l1Var.f12302a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                    int i14 = org.telegram.ui.ActionBar.k6.Bf;
                    org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.12f, i14);
                    org.telegram.ui.ActionBar.r6.l(l1Var, d02, L.f28323a, -1, 2, L.d, k2Var.I0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = z1Var.getResources().getDrawable(2131231080).mutate();
                    org.telegram.ui.ActionBar.r6.y(l1Var, mutate, i14, k2Var.I0, PorterDuff.Mode.MULTIPLY);
                    xp xpVar = new xp(d02, mutate);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    int L3 = org.telegram.messenger.g0.L(56.0f);
                    xpVar.h = L2;
                    xpVar.f40320n = L3;
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    int L5 = org.telegram.messenger.g0.L(24.0f);
                    xpVar.f40318e = L4;
                    xpVar.f40319f = L5;
                    xpVar.f40321r = true;
                    l1Var.f12302a = xpVar;
                }
                l1Var.setDrawable(l1Var.f12302a);
                return;
            }
            ArrayList arrayList3 = this.f13150w;
            if (i7 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i7)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = z1Var.f12881a;
                if (i15 == 0) {
                    if (document != null) {
                        l1Var.setSticker(null);
                        if (z1Var.f12881a == 1) {
                            z10 = true;
                        }
                        l1Var.a(document, z10);
                        return;
                    }
                    l1Var.setSticker(null);
                    if (z1Var.f12881a == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (l1Var.h != longValue) {
                        org.telegram.ui.Components.i5 i5Var = l1Var.d;
                        if (i5Var != null) {
                            i5Var.n(l1Var);
                        }
                        if (longValue != 0) {
                            l1Var.f12303b = true;
                            l1Var.h = longValue;
                            int i16 = l1Var.f12304c;
                            if (!z9) {
                                i11 = 16388;
                            }
                            if (!rc.e(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.i5 m10 = org.telegram.ui.Components.i5.m(i16, longValue, null, i13);
                            l1Var.d = m10;
                            if (l1Var.f12310w) {
                                m10.a(l1Var);
                                return;
                            }
                            return;
                        }
                        l1Var.f12303b = false;
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
            if (v1Var.f12915b != i17) {
                v1Var.f12915b = i17;
                q11.D(p10.f24459s0, v1Var.f12914a);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        nd j8Var;
        z1 z1Var = this.N;
        k2 k2Var = z1Var.f13241s;
        if (i7 == 0) {
            j8Var = new View(z1Var.getContext());
        } else if (i7 == 1) {
            Context context = z1Var.getContext();
            int i11 = k2.f12251y1;
            j8Var = new org.telegram.ui.Cells.j8(context, true, false, k2Var.I0, false);
        } else if (i7 == 3) {
            Context context2 = z1Var.getContext();
            if (z1Var.f12881a == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f12915b = -1;
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context2);
            frameLayout.f12914a = l9Var;
            frameLayout.addView(l9Var, c8.ha.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z9) {
                i10 = 2131748212;
            } else {
                i10 = 2131748148;
            }
            textView.setText(hd.M0(i10, null));
            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = frameLayout;
        } else if (i7 == 4) {
            nd ndVar = new nd(k2Var, z1Var.getContext());
            ndVar.f4441f = new c1(k2Var, 2);
            j8Var = ndVar;
        } else {
            j8Var = new l1(z1Var.getContext(), z1Var.f13235b);
        }
        return new v4.d1(j8Var);
    }
}
