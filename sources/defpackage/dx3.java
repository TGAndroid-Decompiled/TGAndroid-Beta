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
public final class dx3 extends y59 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final ex3 O;
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
    public final bi3 N = new bi3(this, (byte) 26);

    public dx3(ex3 ex3Var) {
        this.O = ex3Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx3.D(java.lang.String):void");
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
    public final void t(u69 u69Var, int i) {
        TLRPC.Document document;
        long longValue;
        boolean z;
        String str;
        TLRPC.StickerSet stickerSet;
        ex3 ex3Var = this.O;
        px3 px3Var = ex3Var.s;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new g69(-1, (int) px3Var.r1));
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
                    w1b w1bVar = (w1b) view;
                    if (this.J == null) {
                        w1bVar.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        w1bVar.a(0, str2);
                        return;
                    } else {
                        w1bVar.b(str2, 0, null, indexOf, this.J.length());
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
            tw3 tw3Var = (tw3) view;
            if (document == px3Var.o1) {
                tw3Var.setSticker(null);
                sn2 sn2Var = tw3Var.a;
                if (sn2Var == null) {
                    ShapeDrawable b0 = cmb.b0(gm.L(28.0f), -1);
                    int i6 = cmb.Df;
                    wmb K = anb.K(0.12f, i6);
                    anb.k(tw3Var, b0, K.a, -1, 2, K.d, px3Var.J0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = ex3Var.getResources().getDrawable(2131231083).mutate();
                    anb.x(tw3Var, mutate, i6, px3Var.J0, PorterDuff.Mode.MULTIPLY);
                    sn2Var = new sn2(b0, mutate);
                    int L = gm.L(56.0f);
                    int L2 = gm.L(56.0f);
                    sn2Var.h = L;
                    sn2Var.n = L2;
                    int L3 = gm.L(24.0f);
                    int L4 = gm.L(24.0f);
                    sn2Var.e = L3;
                    sn2Var.f = L4;
                    sn2Var.r = true;
                    tw3Var.a = sn2Var;
                }
                tw3Var.setDrawable(sn2Var);
                return;
            }
            ArrayList arrayList3 = this.w;
            if (i >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i)).longValue();
            }
            if (document != null || longValue != 0) {
                int i7 = ex3Var.a;
                if (i7 == 0) {
                    if (document != null) {
                        tw3Var.setSticker(null);
                        if (ex3Var.a == 1) {
                            z2 = true;
                        }
                        tw3Var.a(document, z2);
                        return;
                    }
                    tw3Var.setSticker(null);
                    if (ex3Var.a == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tw3Var.h != longValue) {
                        vm vmVar = tw3Var.d;
                        if (vmVar != null) {
                            vmVar.o(tw3Var);
                        }
                        if (longValue != 0) {
                            tw3Var.b = true;
                            tw3Var.h = longValue;
                            int i8 = tw3Var.c;
                            if (!z) {
                                i3 = 16388;
                            }
                            if (!e86.e(i3)) {
                                i5 = 13;
                            }
                            vm m = vm.m(i8, longValue, null, i5);
                            tw3Var.d = m;
                            if (tw3Var.w) {
                                m.b(tw3Var);
                                return;
                            }
                            return;
                        }
                        tw3Var.b = false;
                        tw3Var.h = 0L;
                        tw3Var.d = null;
                        return;
                    }
                    return;
                }
                if (i7 == 1) {
                    z2 = true;
                }
                tw3Var.a(null, z2);
                tw3Var.setSticker(document);
            }
        } else if (i2 == 3) {
            ax3 ax3Var = (ax3) view;
            int i9 = this.L;
            if (ax3Var.b != i9) {
                ax3Var.b = i9;
                vz9.D(z8c.t0, ax3Var.a);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        nx3 nx3Var;
        boolean z;
        int i2;
        ex3 ex3Var = this.O;
        px3 px3Var = ex3Var.s;
        if (i == 0) {
            nx3Var = new View(ex3Var.getContext());
        } else if (i == 1) {
            Context context = ex3Var.getContext();
            int i3 = px3.C1;
            nx3Var = new w1b(context, true, false, px3Var.J0, false);
        } else if (i == 3) {
            Context context2 = ex3Var.getContext();
            if (ex3Var.a == 0) {
                z = true;
            } else {
                z = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.b = -1;
            bf0 bf0Var = new bf0(context2);
            frameLayout.a = bf0Var;
            frameLayout.addView(bf0Var, qoe.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z) {
                i2 = 2131747947;
            } else {
                i2 = 2131747883;
            }
            textView.setText(jb6.M0(i2, null));
            frameLayout.addView(textView, qoe.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            nx3Var = frameLayout;
        } else if (i == 4) {
            nx3 nx3Var2 = new nx3(px3Var, ex3Var.getContext());
            px3Var.B1.add(nx3Var2);
            nx3Var2.e = new lw3(px3Var, (byte) 2);
            nx3Var = nx3Var2;
        } else {
            nx3Var = new tw3(ex3Var.getContext(), ex3Var.b);
        }
        return new u69(nx3Var);
    }
}
