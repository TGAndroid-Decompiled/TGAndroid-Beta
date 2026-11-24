package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
public final class dkb implements Runnable {
    public final byte a;
    public final skb b;

    public dkb(skb skbVar, byte b) {
        this.a = b;
        this.b = skbVar;
    }

    @Override
    public final void run() {
        int l;
        int i;
        int o;
        byte b = this.a;
        skb skbVar = this.b;
        switch (b) {
            case 0:
                if (skbVar.N && skbVar.E != null) {
                    if (skbVar.Z && skbVar.W == null) {
                        l = gm.L(8.0f);
                    } else if (skbVar.W != null) {
                        l = skbVar.l() >> 1;
                    } else {
                        return;
                    }
                    if (!skbVar.Z && !skbVar.j0) {
                        boolean z = skbVar.O;
                        nkb nkbVar = skbVar.W;
                        if (z) {
                            if (nkbVar.getBottom() - l < skbVar.F.getMeasuredHeight() - skbVar.n()) {
                                i = skbVar.W.getBottom() - skbVar.F.getMeasuredHeight();
                                o = skbVar.n();
                                l = i + o;
                            }
                        } else if (nkbVar.getTop() + l > skbVar.o()) {
                            i = -skbVar.W.getTop();
                            o = skbVar.o();
                            l = i + o;
                        }
                    }
                    r59 r59Var = skbVar.E;
                    if (r59Var != null) {
                        if (!skbVar.O) {
                            l = -l;
                        }
                        r59Var.scrollBy(0, l);
                    }
                    gm.c3(this);
                    return;
                }
                return;
            case 1:
                skb skbVar2 = this.b;
                zcb zcbVar = skbVar2.m0;
                Rect rect = skbVar2.B;
                vj2 vj2Var = skbVar2.a0;
                nkb nkbVar2 = skbVar2.X;
                if (nkbVar2 != null && skbVar2.C != null) {
                    nkb nkbVar3 = skbVar2.W;
                    CharSequence r = skbVar2.r(nkbVar2, true);
                    r59 r59Var2 = skbVar2.E;
                    if (r59Var2 != null) {
                        r59Var2.J0(false);
                    }
                    int i2 = skbVar2.s;
                    int i3 = skbVar2.t;
                    if (!rect.isEmpty()) {
                        int i4 = rect.right;
                        if (i2 > i4) {
                            i2 = i4 - 1;
                        }
                        int i5 = rect.left;
                        if (i2 < i5) {
                            i2 = i5 + 1;
                        }
                        int i6 = rect.top;
                        if (i3 < i6) {
                            i3 = i6 + 1;
                        }
                        int i7 = rect.bottom;
                        if (i3 > i7) {
                            i3 = i7 - 1;
                        }
                    }
                    int j = skbVar2.j(i2, i3, skbVar2.c, skbVar2.d, nkbVar2, true);
                    if (j >= r.length()) {
                        skbVar2.h(j, vj2Var, true);
                        Layout layout = (Layout) vj2Var.d;
                        if (layout == null) {
                            skbVar2.v = -1;
                            skbVar2.u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f = i2 - skbVar2.c;
                        if (f < ((Layout) vj2Var.d).getLineRight(lineCount) + gm.L(4.0f) && f > ((Layout) vj2Var.d).getLineLeft(lineCount)) {
                            j = r.length() - 1;
                        }
                    }
                    if (j >= 0 && j < r.length() && r.charAt(j) != '\n') {
                        int i8 = skbVar2.c;
                        int i9 = skbVar2.d;
                        skbVar2.e(false);
                        skbVar2.C.setVisibility(0);
                        skbVar2.K(nkbVar2, nkbVar3);
                        skbVar2.u = j;
                        skbVar2.v = j;
                        if (r instanceof Spanned) {
                            Spanned spanned = (Spanned) r;
                            dw3[] dw3VarArr = (dw3[]) spanned.getSpans(0, r.length(), dw3.class);
                            int length = dw3VarArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    dw3 dw3Var = dw3VarArr[i10];
                                    int spanStart = spanned.getSpanStart(dw3Var);
                                    int spanEnd = spanned.getSpanEnd(dw3Var);
                                    if (j >= spanStart && j <= spanEnd) {
                                        skbVar2.u = spanStart;
                                        skbVar2.v = spanEnd;
                                    } else {
                                        i10++;
                                    }
                                } else {
                                    gn[] gnVarArr = (gn[]) spanned.getSpans(0, r.length(), gn.class);
                                    int length2 = gnVarArr.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            gn gnVar = gnVarArr[i11];
                                            int spanStart2 = spanned.getSpanStart(gnVar);
                                            int spanEnd2 = spanned.getSpanEnd(gnVar);
                                            if (j >= spanStart2 && j <= spanEnd2) {
                                                skbVar2.u = spanStart2;
                                                skbVar2.v = spanEnd2;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (skbVar2.u == skbVar2.v) {
                            while (true) {
                                int i12 = skbVar2.u;
                                if (i12 > 0 && skb.x(r.charAt(i12 - 1))) {
                                    skbVar2.u--;
                                }
                            }
                            while (skbVar2.v < r.length() && skb.x(r.charAt(skbVar2.v))) {
                                skbVar2.v++;
                            }
                        }
                        skbVar2.a = i8;
                        skbVar2.b = i9;
                        skbVar2.W = nkbVar2;
                        try {
                            skbVar2.C.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                        gm.r(zcbVar);
                        gm.c3(zcbVar);
                        skbVar2.S();
                        skbVar2.v();
                        if (nkbVar3 != null) {
                            nkbVar3.invalidate();
                        }
                        kxe kxeVar = skbVar2.D;
                        if (kxeVar != null) {
                            kxeVar.a(true);
                        }
                        skbVar2.i = true;
                        skbVar2.R = true;
                        skbVar2.k = true;
                        skbVar2.g = 0.0f;
                        skbVar2.f = 0.0f;
                        skbVar2.E();
                    }
                    skbVar2.z = false;
                    skbVar2.e = false;
                    return;
                }
                return;
            default:
                cl4 cl4Var = skbVar.Y;
                if (cl4Var != null && !skbVar.P) {
                    cl4Var.hide(Long.MAX_VALUE);
                    gm.d3(skbVar.n0, 1000L);
                    return;
                }
                return;
        }
    }
}
