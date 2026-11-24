package defpackage;

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
import org.telegram.tgnet.TLRPC;
public final class sv3 extends w39 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final tv3 O;
    public int c;
    public boolean x;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public int y = 0;
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final li3 N = new li3(this, (byte) 21);

    public sv3(tv3 tv3Var) {
        this.O = tv3Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv3.D(java.lang.String):void");
    }

    @Override
    public final int b() {
        return this.y;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.x && i == this.y - 1) {
            return 3;
        }
        if (this.E.get(i, -1) >= 0) {
            return 1;
        }
        if (i >= 0) {
            ArrayList arrayList = this.s;
            if (i < arrayList.size() && arrayList.get(i) == this.O.s.n1) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLRPC.Document document;
        long longValue;
        boolean z;
        String str;
        TLRPC.StickerSet stickerSet;
        tv3 tv3Var = this.O;
        ew3 ew3Var = tv3Var.s;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new e49(-1, (int) ew3Var.r1));
            return;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 == 1) {
            int i4 = this.E.get(i);
            if (i4 >= 0) {
                ArrayList arrayList = this.n;
                if (i4 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    vza vzaVar = (vza) view;
                    if (this.J == null) {
                        vzaVar.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        vzaVar.a(0, str2);
                        return;
                    } else {
                        vzaVar.b(str2, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i5 = 3;
        if (i2 == 2) {
            ArrayList arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i);
            }
            iv3 iv3Var = (iv3) view;
            if (document == ew3Var.o1) {
                iv3Var.setSticker(null);
                fm2 fm2Var = iv3Var.a;
                if (fm2Var == null) {
                    ShapeDrawable b0 = bkb.b0(gl.L(28.0f), -1);
                    int i6 = bkb.Df;
                    vkb K = zkb.K(0.12f, i6);
                    zkb.k(iv3Var, b0, K.a, -1, 2, K.d, ew3Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = tv3Var.getResources().getDrawable(2131231082).mutate();
                    zkb.x(iv3Var, mutate, i6, ew3Var.J0, PorterDuff.Mode.MULTIPLY);
                    fm2Var = new fm2(b0, mutate);
                    int L = gl.L(56.0f);
                    int L2 = gl.L(56.0f);
                    fm2Var.h = L;
                    fm2Var.n = L2;
                    int L3 = gl.L(24.0f);
                    int L4 = gl.L(24.0f);
                    fm2Var.e = L3;
                    fm2Var.f = L4;
                    fm2Var.r = true;
                    iv3Var.a = fm2Var;
                }
                iv3Var.setDrawable(fm2Var);
                return;
            }
            ArrayList arrayList3 = this.w;
            if (i >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i)).longValue();
            }
            if (document != null || longValue != 0) {
                int i7 = tv3Var.a;
                if (i7 == 0) {
                    if (document != null) {
                        iv3Var.setSticker(null);
                        if (tv3Var.a == 1) {
                            z2 = true;
                        }
                        iv3Var.a(document, z2);
                        return;
                    }
                    iv3Var.setSticker(null);
                    if (tv3Var.a == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iv3Var.h != longValue) {
                        vl vlVar = iv3Var.d;
                        if (vlVar != null) {
                            vlVar.o(iv3Var);
                        }
                        if (longValue != 0) {
                            iv3Var.b = true;
                            iv3Var.h = longValue;
                            int i8 = iv3Var.c;
                            if (!z) {
                                i3 = 16388;
                            }
                            if (!e66.e(i3)) {
                                i5 = 13;
                            }
                            vl m = vl.m(i8, longValue, null, i5);
                            iv3Var.d = m;
                            if (iv3Var.w) {
                                m.b(iv3Var);
                                return;
                            }
                            return;
                        }
                        iv3Var.b = false;
                        iv3Var.h = 0L;
                        iv3Var.d = null;
                        return;
                    }
                    return;
                }
                if (i7 == 1) {
                    z2 = true;
                }
                iv3Var.a(null, z2);
                iv3Var.setSticker(document);
            }
        } else if (i2 == 3) {
            pv3 pv3Var = (pv3) view;
            int i9 = this.L;
            if (pv3Var.b != i9) {
                pv3Var.b = i9;
                tx9.D(y6c.t0, pv3Var.a);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        cw3 cw3Var;
        boolean z;
        int i2;
        tv3 tv3Var = this.O;
        ew3 ew3Var = tv3Var.s;
        if (i == 0) {
            cw3Var = new View(tv3Var.getContext());
        } else if (i == 1) {
            Context context = tv3Var.getContext();
            int i3 = ew3.C1;
            cw3Var = new vza(context, true, false, ew3Var.J0, false);
        } else if (i == 3) {
            Context context2 = tv3Var.getContext();
            if (tv3Var.a == 0) {
                z = true;
            } else {
                z = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.b = -1;
            be0 be0Var = new be0(context2);
            frameLayout.a = be0Var;
            frameLayout.addView(be0Var, nme.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z) {
                i2 = 2131748021;
            } else {
                i2 = 2131747957;
            }
            textView.setText(k96.M0(i2, null));
            frameLayout.addView(textView, nme.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            cw3Var = frameLayout;
        } else if (i == 4) {
            cw3 cw3Var2 = new cw3(ew3Var, tv3Var.getContext());
            ew3Var.B1.add(cw3Var2);
            cw3Var2.e = new av3(ew3Var, (byte) 2);
            cw3Var = cw3Var2;
        } else {
            cw3Var = new iv3(tv3Var.getContext(), tv3Var.b);
        }
        return new s49(cw3Var);
    }
}
