package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ci.fc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.g11;
public final class x1 extends u4.h0 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final y1 O;
    public int f13815c;
    public boolean f13822x;
    public final HashMap d = new HashMap();
    public final HashMap f13816e = new HashMap();
    public final HashMap f13817f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f13818n = new ArrayList();
    public final ArrayList f13819r = new ArrayList();
    public final ArrayList f13820s = new ArrayList();
    public final ArrayList f13821w = new ArrayList();
    public int f13823y = 0;
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final ei.z5 N = new ei.z5(this, 23);

    public x1(y1 y1Var) {
        this.O = y1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: gi.x1.D(java.lang.String):void");
    }

    @Override
    public final int b() {
        return this.f13823y;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.f13822x && i3 == this.f13823y - 1) {
            return 3;
        }
        if (this.E.get(i3, -1) >= 0) {
            return 1;
        }
        if (i3 >= 0) {
            ArrayList arrayList = this.f13820s;
            if (i3 < arrayList.size() && arrayList.get(i3) == this.O.f13920s.f12952l1) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.f13920s;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new u4.p0(-1, (int) i2Var.f12955p1));
            return;
        }
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.E.get(i3);
            if (i12 >= 0) {
                ArrayList arrayList = this.f13818n;
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
            ArrayList arrayList2 = this.f13820s;
            if (i3 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i3);
            }
            l1 l1Var = (l1) view;
            if (document == i2Var.m1) {
                l1Var.setSticker(null);
                if (l1Var.f13068a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), -1);
                    int i14 = org.telegram.ui.ActionBar.k6.Bf;
                    org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.12f, i14);
                    org.telegram.ui.ActionBar.r6.l(l1Var, d02, L.f28359a, -1, 2, L.d, i2Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = y1Var.getResources().getDrawable(2131231080).mutate();
                    org.telegram.ui.ActionBar.r6.y(l1Var, mutate, i14, i2Var.J0, PorterDuff.Mode.MULTIPLY);
                    xp xpVar = new xp(d02, mutate);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    int L3 = org.telegram.messenger.g0.L(56.0f);
                    xpVar.h = L2;
                    xpVar.f40443n = L3;
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    int L5 = org.telegram.messenger.g0.L(24.0f);
                    xpVar.f40441e = L4;
                    xpVar.f40442f = L5;
                    xpVar.f40444r = true;
                    l1Var.f13068a = xpVar;
                }
                l1Var.setDrawable(l1Var.f13068a);
                return;
            }
            ArrayList arrayList3 = this.f13821w;
            if (i3 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i3)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = y1Var.f13653a;
                if (i15 == 0) {
                    if (document != null) {
                        l1Var.setSticker(null);
                        if (y1Var.f13653a == 1) {
                            z11 = true;
                        }
                        l1Var.a(document, z11);
                        return;
                    }
                    l1Var.setSticker(null);
                    if (y1Var.f13653a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (l1Var.h != longValue) {
                        org.telegram.ui.Components.g5 g5Var = l1Var.d;
                        if (g5Var != null) {
                            g5Var.n(l1Var);
                        }
                        if (longValue != 0) {
                            l1Var.f13069b = true;
                            l1Var.h = longValue;
                            int i16 = l1Var.f13070c;
                            if (!z10) {
                                i11 = 16388;
                            }
                            if (!lc.e(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(i16, longValue, null, i13);
                            l1Var.d = m10;
                            if (l1Var.f13076w) {
                                m10.a(l1Var);
                                return;
                            }
                            return;
                        }
                        l1Var.f13069b = false;
                        l1Var.h = 0L;
                        l1Var.d = null;
                        return;
                    }
                    return;
                }
                if (i15 == 1) {
                    z11 = true;
                }
                l1Var.a(null, z11);
                l1Var.setSticker(document);
            }
        } else if (i10 == 3) {
            v1 v1Var = (v1) view;
            int i17 = this.L;
            if (v1Var.f13681b != i17) {
                v1Var.f13681b = i17;
                g11.D(h10.f22829t0, v1Var.f13680a);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        int i10;
        fc i8Var;
        y1 y1Var = this.O;
        i2 i2Var = y1Var.f13920s;
        if (i3 == 0) {
            i8Var = new View(y1Var.getContext());
        } else if (i3 == 1) {
            Context context = y1Var.getContext();
            int i11 = i2.f12950z1;
            i8Var = new org.telegram.ui.Cells.i8(context, true, false, i2Var.J0, false);
        } else if (i3 == 3) {
            Context context2 = y1Var.getContext();
            if (y1Var.f13653a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f13681b = -1;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
            frameLayout.f13680a = k9Var;
            frameLayout.addView(k9Var, mf.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i10 = 2131748221;
            } else {
                i10 = 2131748157;
            }
            textView.setText(bd.M0(i10, null));
            frameLayout.addView(textView, mf.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            i8Var = frameLayout;
        } else if (i3 == 4) {
            fc fcVar = new fc(i2Var, y1Var.getContext());
            fcVar.f5144f = new c1(i2Var, 2);
            i8Var = fcVar;
        } else {
            i8Var = new l1(y1Var.getContext(), y1Var.f13914b);
        }
        return new u4.d1(i8Var);
    }
}
