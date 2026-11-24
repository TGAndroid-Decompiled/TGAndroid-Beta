package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public abstract class gib extends rib {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override
    public final boolean B() {
        mib mibVar;
        rh9 rh9Var;
        CharSequence q;
        String str;
        if (this.u0 && (mibVar = this.W) != null && ((gb2) mibVar).getMessageObject() != null && (rh9Var = ((gb2) this.W).getMessageObject().y2) != null && !rh9Var.n.isEmpty() && (q = q()) != null && q.length() != 0) {
            try {
                str = rh9Var.v(this.u, this.v);
            } catch (Exception e) {
                fa4.g(e, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                gl.f(q, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(boolean z) {
        mib mibVar = this.W;
        if (mibVar != null && ((gb2) mibVar).B2() && !z) {
            gb2 gb2Var = (gb2) this.W;
            int e1 = gb2Var.getMessageObject().e1();
            SparseArray sparseArray = this.p0;
            Animator animator = (Animator) sparseArray.get(e1);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            gb2Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new tw0(gb2Var, e1, (byte) 5));
            ofFloat.addListener(new ab2(gb2Var, (byte) 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(e1, ofFloat);
        }
    }

    @Override
    public final void K(mib mibVar, mib mibVar2) {
        boolean z;
        gb2 gb2Var = (gb2) mibVar;
        gb2 gb2Var2 = (gb2) mibVar2;
        if (gb2Var2 != null && (gb2Var2.getMessageObject() == null || gb2Var2.getMessageObject().e1() == gb2Var.getMessageObject().e1())) {
            z = false;
        } else {
            z = true;
        }
        this.w = gb2Var.getMessageObject().e1();
        try {
            int i = gb2Var.getMessageObject().k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.q0 = this.r0;
        this.s0 = this.t0;
        this.u0 = this.v0;
        int i2 = this.w;
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(i2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d20((byte) 10, this, z));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z) {
            gb2Var.setSelectedBackgroundProgress(0.0f);
        }
        boolean z2 = gba.a;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void V(k27 k27Var) {
        try {
            int i = k27Var.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == k27Var.e1()) {
            e(true);
        }
    }

    public final void W(k27 k27Var, h27 h27Var, Canvas canvas) {
        k27 messageObject;
        mib mibVar = this.W;
        if (mibVar != null && ((gb2) mibVar).getMessageObject() != null && !this.q0 && !this.s0 && !this.u0 && (messageObject = ((gb2) this.W).getMessageObject()) != null && messageObject.B2 != null && k27Var.e1() == this.w) {
            int i = this.u;
            int i2 = h27Var.n;
            int i3 = this.v - i2;
            int i4 = 0;
            int j = Utilities.j(i - i2, h27Var.e.getText().length(), 0);
            int j2 = Utilities.j(i3, h27Var.e.getText().length(), 0);
            if (j != j2) {
                boolean O3 = messageObject.O3();
                Paint paint = this.p;
                Paint paint2 = this.o;
                if (O3) {
                    int i5 = bkb.Lc;
                    paint2.setColor(s(i5));
                    paint.setColor(s(i5));
                } else {
                    int i6 = bkb.kg;
                    paint2.setColor(s(i6));
                    paint.setColor(s(i6));
                }
                if (h27Var.J) {
                    i4 = gl.L(10.0f);
                } else if (h27Var.I) {
                    i4 = gl.L(0.0f);
                }
                g(canvas, h27Var.e, j, j2, true, true, i4);
            }
        }
    }

    public final void X(boolean z, StaticLayout staticLayout, Canvas canvas) {
        if (!this.q0) {
            return;
        }
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (z) {
            int i = bkb.Lc;
            paint2.setColor(s(i));
            paint.setColor(s(i));
        } else {
            int i2 = bkb.kg;
            paint2.setColor(s(i2));
            paint.setColor(s(i2));
        }
        g(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
    }

    public final void Y(k27 k27Var, rh9 rh9Var, Canvas canvas) {
        pib pibVar;
        gib gibVar;
        Canvas canvas2;
        boolean z;
        if (this.u0 && rh9Var != null) {
            ArrayList arrayList = rh9Var.n;
            mib mibVar = this.W;
            if (mibVar != null && ((gb2) mibVar).getMessageObject() != null && ((gb2) this.W).getMessageObject().e1() == k27Var.e1()) {
                boolean O3 = k27Var.O3();
                Paint paint = this.p;
                Paint paint2 = this.o;
                if (O3) {
                    int i = bkb.Lc;
                    paint2.setColor(s(i));
                    paint.setColor(s(i));
                } else {
                    int i2 = bkb.kg;
                    paint2.setColor(s(i2));
                    paint.setColor(s(i2));
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    Layout a = ((pib) arrayList.get(i3)).a();
                    if (a != null && a.getText() != null) {
                        int intValue = ((Integer) rh9Var.o.get(i3)).intValue();
                        int length = a.getText().length();
                        int j = Utilities.j(this.u - intValue, length, 0);
                        int j2 = Utilities.j(this.v - intValue, length, 0);
                        if (j != j2) {
                            boolean z2 = true;
                            if (this.u >= intValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.v > intValue + length) {
                                z2 = false;
                            }
                            canvas.save();
                            canvas.translate(pibVar.getX(), pibVar.getY());
                            gibVar = this;
                            canvas2 = canvas;
                            gibVar.g(canvas2, a, j, j2, z, z2, 0.0f);
                            canvas2.restore();
                            i3++;
                            this = gibVar;
                            canvas = canvas2;
                        }
                    }
                    gibVar = this;
                    canvas2 = canvas;
                    i3++;
                    this = gibVar;
                    canvas = canvas2;
                }
            }
        }
    }

    public final void Z(gb2 gb2Var, int i, int i2) {
        boolean z;
        if (gb2Var == null) {
            return;
        }
        this.W = gb2Var;
        this.w = gb2Var.getMessageObject().e1();
        if (((gb2) this.W).getMessageObject().D == 36 && ((gb2) this.W).getMessageObject().y2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.u0 = z;
        if (z) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i;
        this.v = i2;
        v();
        ive iveVar = this.D;
        if (iveVar != null) {
            iveVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        qib qibVar = this.C;
        if (qibVar != null) {
            qibVar.setVisibility(0);
        }
        S();
    }

    public final void a0(gb2 gb2Var) {
        ArrayList arrayList;
        rh9 rh9Var;
        this.X = gb2Var;
        k27 messageObject = gb2Var.getMessageObject();
        nb2 nb2Var = gb2Var.ub;
        boolean z = this.r0;
        Rect rect = this.B;
        if (z && gb2Var.getDescriptionlayout() != null) {
            int i = this.c;
            rect.set(i, this.d, gb2Var.getDescriptionlayout().getWidth() + i, gb2Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.t0 && gb2Var.getFactCheckLayout() != null) {
            int i2 = this.c;
            rect.set(i2, this.d, gb2Var.getFactCheckLayout().getWidth() + i2, gb2Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.v0 && messageObject != null && (rh9Var = messageObject.y2) != null && !rh9Var.n.isEmpty()) {
            rh9 rh9Var2 = messageObject.y2;
            int i3 = this.c;
            int i4 = this.d;
            rect.set(i3, i4, rh9Var2.C + i3, rh9Var2.t() + i4);
        } else if (gb2Var.f2() && gb2Var.getCaptionLayout().e.size() > 0) {
            h27 h27Var = (h27) b00.f(1, gb2Var.getCaptionLayout().e);
            int i5 = this.c;
            rect.set(i5, this.d, h27Var.e.getWidth() + i5, (int) (h27Var.p(gb2Var.getCaptionLayout().e, nb2Var) + this.d + h27Var.f + h27Var.e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.B2) != null && arrayList.size() > 0) {
            h27 h27Var2 = (h27) b00.f(1, messageObject.B2);
            int i6 = this.c;
            rect.set(i6, this.d, h27Var2.e.getWidth() + i6, (int) (h27Var2.p(messageObject.B2, nb2Var) + this.d + h27Var2.f + h27Var2.e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void b0(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        v();
    }

    @Override
    public final void e(boolean z) {
        super.e(z);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override
    public final void h(int i, hi2 hi2Var, boolean z) {
        mib mibVar;
        int i2;
        int L;
        h27 h27Var;
        int i3;
        int i4;
        int L2;
        int i5;
        int L3;
        h27 h27Var2;
        int i6;
        int i7;
        int L4;
        rh9 rh9Var;
        pib pibVar;
        if (z) {
            mibVar = this.X;
        } else {
            mibVar = this.W;
        }
        gb2 gb2Var = (gb2) mibVar;
        if (gb2Var == null) {
            hi2Var.d = null;
            return;
        }
        k27 messageObject = gb2Var.getMessageObject();
        int i8 = 0;
        if (this.q0) {
            hi2Var.d = gb2Var.getDescriptionlayout();
            hi2Var.b = 0.0f;
            hi2Var.c = 0.0f;
            hi2Var.a = 0;
        } else if (this.s0) {
            hi2Var.d = gb2Var.getFactCheckLayout();
            hi2Var.b = 0.0f;
            hi2Var.c = 0.0f;
            hi2Var.a = 0;
        } else if (this.u0) {
            if (messageObject != null) {
                rh9Var = messageObject.y2;
            } else {
                rh9Var = null;
            }
            if (rh9Var != null) {
                ArrayList arrayList = rh9Var.o;
                ArrayList arrayList2 = rh9Var.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i8 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i8)).intValue();
                            int length = ((pib) arrayList2.get(i8)).a().getText().length();
                            if (i >= intValue && i <= intValue + length) {
                                break;
                            }
                            i8++;
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    if (i8 < 0) {
                        i8 = arrayList2.size() - 1;
                    }
                    hi2Var.d = ((pib) arrayList2.get(i8)).a();
                    hi2Var.b = pibVar.getY();
                    hi2Var.c = pibVar.getX();
                    hi2Var.a = ((Integer) arrayList.get(i8)).intValue();
                    return;
                }
            }
            hi2Var.d = null;
        } else if (gb2Var.f2()) {
            i27 captionLayout = gb2Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f = captionLayout.d;
            if (arrayList3.size() == 1) {
                hi2Var.d = ((h27) arrayList3.get(0)).e;
                hi2Var.b = h27Var2.f;
                h27 h27Var3 = (h27) arrayList3.get(0);
                if (h27Var3.J) {
                    i6 = gl.L(10.0f);
                } else {
                    i6 = 0;
                }
                if (h27Var3.l()) {
                    i7 = ((int) Math.ceil(f)) - i6;
                } else {
                    i7 = 0;
                }
                float f2 = -i7;
                hi2Var.c = f2;
                if (h27Var3.I && !h27Var3.J) {
                    if (h27Var3.V) {
                        L4 = gl.L(14.0f);
                    } else {
                        L4 = gl.L(8.0f);
                    }
                    hi2Var.c = f2 + L4;
                }
                hi2Var.a = 0;
                return;
            }
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                h27 h27Var4 = (h27) arrayList3.get(i9);
                int i10 = i - h27Var4.n;
                if (i10 >= 0 && i10 <= h27Var4.e.getText().length()) {
                    hi2Var.d = h27Var4.e;
                    hi2Var.b = h27Var4.o(arrayList3) + h27Var4.f;
                    if (h27Var4.J) {
                        i5 = gl.L(10.0f);
                    } else {
                        i5 = 0;
                    }
                    if (h27Var4.l()) {
                        i8 = ((int) Math.ceil(f)) - i5;
                    }
                    float f3 = -i8;
                    hi2Var.c = f3;
                    if (h27Var4.I && !h27Var4.J) {
                        if (h27Var4.V) {
                            L3 = gl.L(14.0f);
                        } else {
                            L3 = gl.L(8.0f);
                        }
                        hi2Var.c = f3 + L3;
                    }
                    hi2Var.a = h27Var4.n;
                    return;
                }
            }
            hi2Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.B2;
            if (arrayList4 == null) {
                hi2Var.d = null;
            } else if (arrayList4.size() == 1) {
                hi2Var.d = ((h27) messageObject.B2.get(0)).e;
                hi2Var.b = h27Var.f;
                h27 h27Var5 = (h27) messageObject.B2.get(0);
                if (h27Var5.J) {
                    i3 = gl.L(10.0f);
                } else {
                    i3 = 0;
                }
                if (h27Var5.l()) {
                    i4 = ((int) Math.ceil(messageObject.x2)) - i3;
                } else {
                    i4 = 0;
                }
                float f4 = -i4;
                hi2Var.c = f4;
                if (h27Var5.I && !h27Var5.J) {
                    if (h27Var5.V) {
                        L2 = gl.L(14.0f);
                    } else {
                        L2 = gl.L(8.0f);
                    }
                    hi2Var.c = f4 + L2;
                }
                hi2Var.a = 0;
            } else {
                for (int i11 = 0; i11 < messageObject.B2.size(); i11++) {
                    h27 h27Var6 = (h27) messageObject.B2.get(i11);
                    int i12 = i - h27Var6.n;
                    if (i12 >= 0 && i12 <= h27Var6.e.getText().length()) {
                        hi2Var.d = h27Var6.e;
                        hi2Var.b = h27Var6.o(messageObject.B2) + h27Var6.f;
                        if (h27Var6.J) {
                            i2 = gl.L(10.0f);
                        } else {
                            i2 = 0;
                        }
                        if (h27Var6.l()) {
                            i8 = ((int) Math.ceil(messageObject.x2)) - i2;
                        }
                        float f5 = -i8;
                        hi2Var.c = f5;
                        if (h27Var6.I && !h27Var6.J) {
                            if (h27Var6.V) {
                                L = gl.L(14.0f);
                            } else {
                                L = gl.L(8.0f);
                            }
                            hi2Var.c = f5 + L;
                        }
                        hi2Var.a = h27Var6.n;
                        return;
                    }
                }
                hi2Var.d = null;
            }
        }
    }

    @Override
    public final int j(int r19, int r20, int r21, int r22, defpackage.mib r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gib.j(int, int, int, int, mib, boolean):int");
    }

    @Override
    public final int l() {
        Layout layout;
        rh9 rh9Var;
        mib mibVar = this.W;
        if (mibVar != null && ((gb2) mibVar).getMessageObject() != null) {
            k27 messageObject = ((gb2) this.W).getMessageObject();
            if (this.q0) {
                layout = ((gb2) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((gb2) this.W).getFactCheckLayout();
            } else if (this.u0) {
                if (messageObject != null) {
                    rh9Var = messageObject.y2;
                } else {
                    rh9Var = null;
                }
                if (rh9Var != null) {
                    ArrayList arrayList = rh9Var.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((pib) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((gb2) this.W).f2()) {
                layout = ((h27) ((gb2) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((h27) arrayList2.get(0)).e;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override
    public final java.lang.CharSequence r(defpackage.mib r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gib.r(mib, boolean):java.lang.CharSequence");
    }

    @Override
    public void v() {
        super.v();
        mib mibVar = this.W;
        if (mibVar != null && ((gb2) mibVar).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        mib mibVar2 = this.W;
        if (mibVar2 != null) {
            if (this.s0 || this.t0) {
                ((gb2) mibVar2).r2();
            }
        }
    }
}
