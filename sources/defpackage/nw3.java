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
public final class nw3 extends j79 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final ow3 O;
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
    public final lw3 N = new lw3(this, (byte) 0);

    public nw3(ow3 ow3Var) {
        this.O = ow3Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw3.D(java.lang.String):void");
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
    public final void t(f89 f89Var, int i) {
        TLRPC.Document document;
        long longValue;
        boolean z;
        String str;
        TLRPC.StickerSet stickerSet;
        ow3 ow3Var = this.O;
        zw3 zw3Var = ow3Var.s;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new r79(-1, (int) zw3Var.r1));
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
                    t3b t3bVar = (t3b) view;
                    if (this.J == null) {
                        t3bVar.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        t3bVar.a(0, str2);
                        return;
                    } else {
                        t3bVar.b(str2, 0, null, indexOf, this.J.length());
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
            cw3 cw3Var = (cw3) view;
            if (document == zw3Var.o1) {
                cw3Var.setSticker(null);
                zm2 zm2Var = cw3Var.a;
                if (zm2Var == null) {
                    ShapeDrawable b0 = aob.b0(hl.L(28.0f), -1);
                    int i6 = aob.Ef;
                    uob K = yob.K(0.12f, i6);
                    yob.k(cw3Var, b0, K.a, -1, 2, K.d, zw3Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = ow3Var.getResources().getDrawable(2131231082).mutate();
                    yob.x(cw3Var, mutate, i6, zw3Var.J0, PorterDuff.Mode.MULTIPLY);
                    zm2Var = new zm2(b0, mutate);
                    int L = hl.L(56.0f);
                    int L2 = hl.L(56.0f);
                    zm2Var.h = L;
                    zm2Var.n = L2;
                    int L3 = hl.L(24.0f);
                    int L4 = hl.L(24.0f);
                    zm2Var.e = L3;
                    zm2Var.f = L4;
                    zm2Var.r = true;
                    cw3Var.a = zm2Var;
                }
                cw3Var.setDrawable(zm2Var);
                return;
            }
            ArrayList arrayList3 = this.w;
            if (i >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i)).longValue();
            }
            if (document != null || longValue != 0) {
                int i7 = ow3Var.a;
                if (i7 == 0) {
                    if (document != null) {
                        cw3Var.setSticker(null);
                        if (ow3Var.a == 1) {
                            z2 = true;
                        }
                        cw3Var.a(document, z2);
                        return;
                    }
                    cw3Var.setSticker(null);
                    if (ow3Var.a == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cw3Var.h != longValue) {
                        wl wlVar = cw3Var.d;
                        if (wlVar != null) {
                            wlVar.o(cw3Var);
                        }
                        if (longValue != 0) {
                            cw3Var.b = true;
                            cw3Var.h = longValue;
                            int i8 = cw3Var.c;
                            if (!z) {
                                i3 = 16388;
                            }
                            if (!i86.e(i3)) {
                                i5 = 13;
                            }
                            wl m = wl.m(i8, longValue, null, i5);
                            cw3Var.d = m;
                            if (cw3Var.w) {
                                m.b(cw3Var);
                                return;
                            }
                            return;
                        }
                        cw3Var.b = false;
                        cw3Var.h = 0L;
                        cw3Var.d = null;
                        return;
                    }
                    return;
                }
                if (i7 == 1) {
                    z2 = true;
                }
                cw3Var.a(null, z2);
                cw3Var.setSticker(document);
            }
        } else if (i2 == 3) {
            jw3 jw3Var = (jw3) view;
            int i9 = this.L;
            if (jw3Var.b != i9) {
                jw3Var.b = i9;
                n1a.D(yac.t0, jw3Var.a);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        xw3 xw3Var;
        boolean z;
        int i2;
        ow3 ow3Var = this.O;
        zw3 zw3Var = ow3Var.s;
        if (i == 0) {
            xw3Var = new View(ow3Var.getContext());
        } else if (i == 1) {
            Context context = ow3Var.getContext();
            int i3 = zw3.C1;
            xw3Var = new t3b(context, true, false, zw3Var.J0, false);
        } else if (i == 3) {
            Context context2 = ow3Var.getContext();
            if (ow3Var.a == 0) {
                z = true;
            } else {
                z = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.b = -1;
            de0 de0Var = new de0(context2);
            frameLayout.a = de0Var;
            frameLayout.addView(de0Var, tre.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z) {
                i2 = 2131747944;
            } else {
                i2 = 2131747880;
            }
            textView.setText(ob6.M0(i2, null));
            frameLayout.addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            xw3Var = frameLayout;
        } else if (i == 4) {
            xw3 xw3Var2 = new xw3(zw3Var, ow3Var.getContext());
            zw3Var.B1.add(xw3Var2);
            xw3Var2.e = new uv3(zw3Var, (byte) 2);
            xw3Var = xw3Var2;
        } else {
            xw3Var = new cw3(ow3Var.getContext(), ow3Var.b);
        }
        return new f89(xw3Var);
    }
}
