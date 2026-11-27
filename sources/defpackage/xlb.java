package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
public final class xlb implements Runnable {
    public final byte a;
    public final mmb b;

    public xlb(mmb mmbVar, byte b) {
        this.a = b;
        this.b = mmbVar;
    }

    @Override
    public final void run() {
        int l;
        int i;
        int o;
        byte b = this.a;
        mmb mmbVar = this.b;
        switch (b) {
            case 0:
                if (mmbVar.N && mmbVar.E != null) {
                    if (mmbVar.Z && mmbVar.W == null) {
                        l = hl.L(8.0f);
                    } else if (mmbVar.W != null) {
                        l = mmbVar.l() >> 1;
                    } else {
                        return;
                    }
                    if (!mmbVar.Z && !mmbVar.j0) {
                        boolean z = mmbVar.O;
                        hmb hmbVar = mmbVar.W;
                        if (z) {
                            if (hmbVar.getBottom() - l < mmbVar.F.getMeasuredHeight() - mmbVar.n()) {
                                i = mmbVar.W.getBottom() - mmbVar.F.getMeasuredHeight();
                                o = mmbVar.n();
                                l = i + o;
                            }
                        } else if (hmbVar.getTop() + l > mmbVar.o()) {
                            i = -mmbVar.W.getTop();
                            o = mmbVar.o();
                            l = i + o;
                        }
                    }
                    d79 d79Var = mmbVar.E;
                    if (d79Var != null) {
                        if (!mmbVar.O) {
                            l = -l;
                        }
                        d79Var.scrollBy(0, l);
                    }
                    hl.c3(this);
                    return;
                }
                return;
            case 1:
                mmb mmbVar2 = this.b;
                s8b s8bVar = mmbVar2.m0;
                Rect rect = mmbVar2.B;
                dj2 dj2Var = mmbVar2.a0;
                hmb hmbVar2 = mmbVar2.X;
                if (hmbVar2 != null && mmbVar2.C != null) {
                    hmb hmbVar3 = mmbVar2.W;
                    CharSequence r = mmbVar2.r(hmbVar2, true);
                    d79 d79Var2 = mmbVar2.E;
                    if (d79Var2 != null) {
                        d79Var2.K0(false);
                    }
                    int i2 = mmbVar2.s;
                    int i3 = mmbVar2.t;
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
                    int j = mmbVar2.j(i2, i3, mmbVar2.c, mmbVar2.d, hmbVar2, true);
                    if (j >= r.length()) {
                        mmbVar2.h(j, dj2Var, true);
                        Layout layout = (Layout) dj2Var.d;
                        if (layout == null) {
                            mmbVar2.v = -1;
                            mmbVar2.u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f = i2 - mmbVar2.c;
                        if (f < ((Layout) dj2Var.d).getLineRight(lineCount) + hl.L(4.0f) && f > ((Layout) dj2Var.d).getLineLeft(lineCount)) {
                            j = r.length() - 1;
                        }
                    }
                    if (j >= 0 && j < r.length() && r.charAt(j) != '\n') {
                        int i8 = mmbVar2.c;
                        int i9 = mmbVar2.d;
                        mmbVar2.e(false);
                        mmbVar2.C.setVisibility(0);
                        mmbVar2.K(hmbVar2, hmbVar3);
                        mmbVar2.u = j;
                        mmbVar2.v = j;
                        if (r instanceof Spanned) {
                            Spanned spanned = (Spanned) r;
                            mv3[] mv3VarArr = (mv3[]) spanned.getSpans(0, r.length(), mv3.class);
                            int length = mv3VarArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    mv3 mv3Var = mv3VarArr[i10];
                                    int spanStart = spanned.getSpanStart(mv3Var);
                                    int spanEnd = spanned.getSpanEnd(mv3Var);
                                    if (j >= spanStart && j <= spanEnd) {
                                        mmbVar2.u = spanStart;
                                        mmbVar2.v = spanEnd;
                                    } else {
                                        i10++;
                                    }
                                } else {
                                    hm[] hmVarArr = (hm[]) spanned.getSpans(0, r.length(), hm.class);
                                    int length2 = hmVarArr.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            hm hmVar = hmVarArr[i11];
                                            int spanStart2 = spanned.getSpanStart(hmVar);
                                            int spanEnd2 = spanned.getSpanEnd(hmVar);
                                            if (j >= spanStart2 && j <= spanEnd2) {
                                                mmbVar2.u = spanStart2;
                                                mmbVar2.v = spanEnd2;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (mmbVar2.u == mmbVar2.v) {
                            while (true) {
                                int i12 = mmbVar2.u;
                                if (i12 > 0 && mmb.x(r.charAt(i12 - 1))) {
                                    mmbVar2.u--;
                                }
                            }
                            while (mmbVar2.v < r.length() && mmb.x(r.charAt(mmbVar2.v))) {
                                mmbVar2.v++;
                            }
                        }
                        mmbVar2.a = i8;
                        mmbVar2.b = i9;
                        mmbVar2.W = hmbVar2;
                        try {
                            mmbVar2.C.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                        hl.r(s8bVar);
                        hl.c3(s8bVar);
                        mmbVar2.S();
                        mmbVar2.v();
                        if (hmbVar3 != null) {
                            hmbVar3.invalidate();
                        }
                        b0f b0fVar = mmbVar2.D;
                        if (b0fVar != null) {
                            b0fVar.a(true);
                        }
                        mmbVar2.i = true;
                        mmbVar2.R = true;
                        mmbVar2.k = true;
                        mmbVar2.g = 0.0f;
                        mmbVar2.f = 0.0f;
                        mmbVar2.E();
                    }
                    mmbVar2.z = false;
                    mmbVar2.e = false;
                    return;
                }
                return;
            default:
                cl4 cl4Var = mmbVar.Y;
                if (cl4Var != null && !mmbVar.P) {
                    cl4Var.hide(Long.MAX_VALUE);
                    hl.d3(mmbVar.n0, 1000L);
                    return;
                }
                return;
        }
    }
}
