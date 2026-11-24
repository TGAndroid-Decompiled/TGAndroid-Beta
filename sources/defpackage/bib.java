package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
public final class bib implements Runnable {
    public final byte a;
    public final rib b;

    public bib(rib ribVar, byte b) {
        this.a = b;
        this.b = ribVar;
    }

    @Override
    public final void run() {
        int l;
        int i;
        int o;
        byte b = this.a;
        rib ribVar = this.b;
        switch (b) {
            case 0:
                if (ribVar.N && ribVar.E != null) {
                    if (ribVar.Z && ribVar.W == null) {
                        l = gl.L(8.0f);
                    } else if (ribVar.W != null) {
                        l = ribVar.l() >> 1;
                    } else {
                        return;
                    }
                    if (!ribVar.Z && !ribVar.j0) {
                        boolean z = ribVar.O;
                        mib mibVar = ribVar.W;
                        if (z) {
                            if (mibVar.getBottom() - l < ribVar.F.getMeasuredHeight() - ribVar.n()) {
                                i = ribVar.W.getBottom() - ribVar.F.getMeasuredHeight();
                                o = ribVar.n();
                                l = i + o;
                            }
                        } else if (mibVar.getTop() + l > ribVar.o()) {
                            i = -ribVar.W.getTop();
                            o = ribVar.o();
                            l = i + o;
                        }
                    }
                    o39 o39Var = ribVar.E;
                    if (o39Var != null) {
                        if (!ribVar.O) {
                            l = -l;
                        }
                        o39Var.scrollBy(0, l);
                    }
                    gl.c3(this);
                    return;
                }
                return;
            case 1:
                rib ribVar2 = this.b;
                kya kyaVar = ribVar2.m0;
                Rect rect = ribVar2.B;
                hi2 hi2Var = ribVar2.a0;
                mib mibVar2 = ribVar2.X;
                if (mibVar2 != null && ribVar2.C != null) {
                    mib mibVar3 = ribVar2.W;
                    CharSequence r = ribVar2.r(mibVar2, true);
                    o39 o39Var2 = ribVar2.E;
                    if (o39Var2 != null) {
                        o39Var2.J0(false);
                    }
                    int i2 = ribVar2.s;
                    int i3 = ribVar2.t;
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
                    int j = ribVar2.j(i2, i3, ribVar2.c, ribVar2.d, mibVar2, true);
                    if (j >= r.length()) {
                        ribVar2.h(j, hi2Var, true);
                        Layout layout = (Layout) hi2Var.d;
                        if (layout == null) {
                            ribVar2.v = -1;
                            ribVar2.u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f = i2 - ribVar2.c;
                        if (f < ((Layout) hi2Var.d).getLineRight(lineCount) + gl.L(4.0f) && f > ((Layout) hi2Var.d).getLineLeft(lineCount)) {
                            j = r.length() - 1;
                        }
                    }
                    if (j >= 0 && j < r.length() && r.charAt(j) != '\n') {
                        int i8 = ribVar2.c;
                        int i9 = ribVar2.d;
                        ribVar2.e(false);
                        ribVar2.C.setVisibility(0);
                        ribVar2.K(mibVar2, mibVar3);
                        ribVar2.u = j;
                        ribVar2.v = j;
                        if (r instanceof Spanned) {
                            Spanned spanned = (Spanned) r;
                            su3[] su3VarArr = (su3[]) spanned.getSpans(0, r.length(), su3.class);
                            int length = su3VarArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    su3 su3Var = su3VarArr[i10];
                                    int spanStart = spanned.getSpanStart(su3Var);
                                    int spanEnd = spanned.getSpanEnd(su3Var);
                                    if (j >= spanStart && j <= spanEnd) {
                                        ribVar2.u = spanStart;
                                        ribVar2.v = spanEnd;
                                    } else {
                                        i10++;
                                    }
                                } else {
                                    gm[] gmVarArr = (gm[]) spanned.getSpans(0, r.length(), gm.class);
                                    int length2 = gmVarArr.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            gm gmVar = gmVarArr[i11];
                                            int spanStart2 = spanned.getSpanStart(gmVar);
                                            int spanEnd2 = spanned.getSpanEnd(gmVar);
                                            if (j >= spanStart2 && j <= spanEnd2) {
                                                ribVar2.u = spanStart2;
                                                ribVar2.v = spanEnd2;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (ribVar2.u == ribVar2.v) {
                            while (true) {
                                int i12 = ribVar2.u;
                                if (i12 > 0 && rib.x(r.charAt(i12 - 1))) {
                                    ribVar2.u--;
                                }
                            }
                            while (ribVar2.v < r.length() && rib.x(r.charAt(ribVar2.v))) {
                                ribVar2.v++;
                            }
                        }
                        ribVar2.a = i8;
                        ribVar2.b = i9;
                        ribVar2.W = mibVar2;
                        try {
                            ribVar2.C.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                        gl.r(kyaVar);
                        gl.c3(kyaVar);
                        ribVar2.S();
                        ribVar2.v();
                        if (mibVar3 != null) {
                            mibVar3.invalidate();
                        }
                        ive iveVar = ribVar2.D;
                        if (iveVar != null) {
                            iveVar.a(true);
                        }
                        ribVar2.i = true;
                        ribVar2.R = true;
                        ribVar2.k = true;
                        ribVar2.g = 0.0f;
                        ribVar2.f = 0.0f;
                        ribVar2.E();
                    }
                    ribVar2.z = false;
                    ribVar2.e = false;
                    return;
                }
                return;
            default:
                yi4 yi4Var = ribVar.Y;
                if (yi4Var != null && !ribVar.P) {
                    yi4Var.hide(Long.MAX_VALUE);
                    gl.d3(ribVar.n0, 1000L);
                    return;
                }
                return;
        }
    }
}
