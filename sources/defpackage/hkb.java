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
public abstract class hkb extends skb {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override
    public final boolean B() {
        nkb nkbVar;
        uj9 uj9Var;
        CharSequence q;
        String str;
        if (this.u0 && (nkbVar = this.W) != null && ((rc2) nkbVar).getMessageObject() != null && (uj9Var = ((rc2) this.W).getMessageObject().y2) != null && !uj9Var.n.isEmpty() && (q = q()) != null && q.length() != 0) {
            try {
                str = uj9Var.v(this.u, this.v);
            } catch (Exception e) {
                fc4.g(e, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                gm.f(q, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(boolean z) {
        nkb nkbVar = this.W;
        if (nkbVar != null && ((rc2) nkbVar).B2() && !z) {
            rc2 rc2Var = (rc2) this.W;
            int e1 = rc2Var.getMessageObject().e1();
            SparseArray sparseArray = this.p0;
            Animator animator = (Animator) sparseArray.get(e1);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            rc2Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new by0(rc2Var, e1, (byte) 5));
            ofFloat.addListener(new lc2(rc2Var, (byte) 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(e1, ofFloat);
        }
    }

    @Override
    public final void K(nkb nkbVar, nkb nkbVar2) {
        boolean z;
        rc2 rc2Var = (rc2) nkbVar;
        rc2 rc2Var2 = (rc2) nkbVar2;
        if (rc2Var2 != null && (rc2Var2.getMessageObject() == null || rc2Var2.getMessageObject().e1() == rc2Var.getMessageObject().e1())) {
            z = false;
        } else {
            z = true;
        }
        this.w = rc2Var.getMessageObject().e1();
        try {
            int i = rc2Var.getMessageObject().k.edit_date;
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
        ofFloat.addUpdateListener(new d30((byte) 10, this, z));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z) {
            rc2Var.setSelectedBackgroundProgress(0.0f);
        }
        boolean z2 = gda.a;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void V(k47 k47Var) {
        try {
            int i = k47Var.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == k47Var.e1()) {
            e(true);
        }
    }

    public final void W(k47 k47Var, h47 h47Var, Canvas canvas) {
        k47 messageObject;
        nkb nkbVar = this.W;
        if (nkbVar != null && ((rc2) nkbVar).getMessageObject() != null && !this.q0 && !this.s0 && !this.u0 && (messageObject = ((rc2) this.W).getMessageObject()) != null && messageObject.B2 != null && k47Var.e1() == this.w) {
            int i = this.u;
            int i2 = h47Var.n;
            int i3 = this.v - i2;
            int i4 = 0;
            int j = Utilities.j(i - i2, h47Var.e.getText().length(), 0);
            int j2 = Utilities.j(i3, h47Var.e.getText().length(), 0);
            if (j != j2) {
                boolean O3 = messageObject.O3();
                Paint paint = this.p;
                Paint paint2 = this.o;
                if (O3) {
                    int i5 = cmb.Lc;
                    paint2.setColor(s(i5));
                    paint.setColor(s(i5));
                } else {
                    int i6 = cmb.kg;
                    paint2.setColor(s(i6));
                    paint.setColor(s(i6));
                }
                if (h47Var.J) {
                    i4 = gm.L(10.0f);
                } else if (h47Var.I) {
                    i4 = gm.L(0.0f);
                }
                g(canvas, h47Var.e, j, j2, true, true, i4);
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
            int i = cmb.Lc;
            paint2.setColor(s(i));
            paint.setColor(s(i));
        } else {
            int i2 = cmb.kg;
            paint2.setColor(s(i2));
            paint.setColor(s(i2));
        }
        g(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
    }

    public final void Y(k47 k47Var, uj9 uj9Var, Canvas canvas) {
        qkb qkbVar;
        hkb hkbVar;
        Canvas canvas2;
        boolean z;
        if (this.u0 && uj9Var != null) {
            ArrayList arrayList = uj9Var.n;
            nkb nkbVar = this.W;
            if (nkbVar != null && ((rc2) nkbVar).getMessageObject() != null && ((rc2) this.W).getMessageObject().e1() == k47Var.e1()) {
                boolean O3 = k47Var.O3();
                Paint paint = this.p;
                Paint paint2 = this.o;
                if (O3) {
                    int i = cmb.Lc;
                    paint2.setColor(s(i));
                    paint.setColor(s(i));
                } else {
                    int i2 = cmb.kg;
                    paint2.setColor(s(i2));
                    paint.setColor(s(i2));
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    Layout a = ((qkb) arrayList.get(i3)).a();
                    if (a != null && a.getText() != null) {
                        int intValue = ((Integer) uj9Var.o.get(i3)).intValue();
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
                            canvas.translate(qkbVar.getX(), qkbVar.getY());
                            hkbVar = this;
                            canvas2 = canvas;
                            hkbVar.g(canvas2, a, j, j2, z, z2, 0.0f);
                            canvas2.restore();
                            i3++;
                            this = hkbVar;
                            canvas = canvas2;
                        }
                    }
                    hkbVar = this;
                    canvas2 = canvas;
                    i3++;
                    this = hkbVar;
                    canvas = canvas2;
                }
            }
        }
    }

    public final void Z(rc2 rc2Var, int i, int i2) {
        boolean z;
        if (rc2Var == null) {
            return;
        }
        this.W = rc2Var;
        this.w = rc2Var.getMessageObject().e1();
        if (((rc2) this.W).getMessageObject().D == 36 && ((rc2) this.W).getMessageObject().y2 != null) {
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
        kxe kxeVar = this.D;
        if (kxeVar != null) {
            kxeVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        rkb rkbVar = this.C;
        if (rkbVar != null) {
            rkbVar.setVisibility(0);
        }
        S();
    }

    public final void a0(rc2 rc2Var) {
        ArrayList arrayList;
        uj9 uj9Var;
        this.X = rc2Var;
        k47 messageObject = rc2Var.getMessageObject();
        yc2 yc2Var = rc2Var.ub;
        boolean z = this.r0;
        Rect rect = this.B;
        if (z && rc2Var.getDescriptionlayout() != null) {
            int i = this.c;
            rect.set(i, this.d, rc2Var.getDescriptionlayout().getWidth() + i, rc2Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.t0 && rc2Var.getFactCheckLayout() != null) {
            int i2 = this.c;
            rect.set(i2, this.d, rc2Var.getFactCheckLayout().getWidth() + i2, rc2Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.v0 && messageObject != null && (uj9Var = messageObject.y2) != null && !uj9Var.n.isEmpty()) {
            uj9 uj9Var2 = messageObject.y2;
            int i3 = this.c;
            int i4 = this.d;
            rect.set(i3, i4, uj9Var2.C + i3, uj9Var2.t() + i4);
        } else if (rc2Var.f2() && rc2Var.getCaptionLayout().e.size() > 0) {
            h47 h47Var = (h47) b10.f(1, rc2Var.getCaptionLayout().e);
            int i5 = this.c;
            rect.set(i5, this.d, h47Var.e.getWidth() + i5, (int) (h47Var.p(rc2Var.getCaptionLayout().e, yc2Var) + this.d + h47Var.f + h47Var.e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.B2) != null && arrayList.size() > 0) {
            h47 h47Var2 = (h47) b10.f(1, messageObject.B2);
            int i6 = this.c;
            rect.set(i6, this.d, h47Var2.e.getWidth() + i6, (int) (h47Var2.p(messageObject.B2, yc2Var) + this.d + h47Var2.f + h47Var2.e.getHeight()));
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
    public final void h(int i, vj2 vj2Var, boolean z) {
        nkb nkbVar;
        int i2;
        int L;
        h47 h47Var;
        int i3;
        int i4;
        int L2;
        int i5;
        int L3;
        h47 h47Var2;
        int i6;
        int i7;
        int L4;
        uj9 uj9Var;
        qkb qkbVar;
        if (z) {
            nkbVar = this.X;
        } else {
            nkbVar = this.W;
        }
        rc2 rc2Var = (rc2) nkbVar;
        if (rc2Var == null) {
            vj2Var.d = null;
            return;
        }
        k47 messageObject = rc2Var.getMessageObject();
        int i8 = 0;
        if (this.q0) {
            vj2Var.d = rc2Var.getDescriptionlayout();
            vj2Var.b = 0.0f;
            vj2Var.c = 0.0f;
            vj2Var.a = 0;
        } else if (this.s0) {
            vj2Var.d = rc2Var.getFactCheckLayout();
            vj2Var.b = 0.0f;
            vj2Var.c = 0.0f;
            vj2Var.a = 0;
        } else if (this.u0) {
            if (messageObject != null) {
                uj9Var = messageObject.y2;
            } else {
                uj9Var = null;
            }
            if (uj9Var != null) {
                ArrayList arrayList = uj9Var.o;
                ArrayList arrayList2 = uj9Var.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i8 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i8)).intValue();
                            int length = ((qkb) arrayList2.get(i8)).a().getText().length();
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
                    vj2Var.d = ((qkb) arrayList2.get(i8)).a();
                    vj2Var.b = qkbVar.getY();
                    vj2Var.c = qkbVar.getX();
                    vj2Var.a = ((Integer) arrayList.get(i8)).intValue();
                    return;
                }
            }
            vj2Var.d = null;
        } else if (rc2Var.f2()) {
            i47 captionLayout = rc2Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f = captionLayout.d;
            if (arrayList3.size() == 1) {
                vj2Var.d = ((h47) arrayList3.get(0)).e;
                vj2Var.b = h47Var2.f;
                h47 h47Var3 = (h47) arrayList3.get(0);
                if (h47Var3.J) {
                    i6 = gm.L(10.0f);
                } else {
                    i6 = 0;
                }
                if (h47Var3.l()) {
                    i7 = ((int) Math.ceil(f)) - i6;
                } else {
                    i7 = 0;
                }
                float f2 = -i7;
                vj2Var.c = f2;
                if (h47Var3.I && !h47Var3.J) {
                    if (h47Var3.V) {
                        L4 = gm.L(14.0f);
                    } else {
                        L4 = gm.L(8.0f);
                    }
                    vj2Var.c = f2 + L4;
                }
                vj2Var.a = 0;
                return;
            }
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                h47 h47Var4 = (h47) arrayList3.get(i9);
                int i10 = i - h47Var4.n;
                if (i10 >= 0 && i10 <= h47Var4.e.getText().length()) {
                    vj2Var.d = h47Var4.e;
                    vj2Var.b = h47Var4.o(arrayList3) + h47Var4.f;
                    if (h47Var4.J) {
                        i5 = gm.L(10.0f);
                    } else {
                        i5 = 0;
                    }
                    if (h47Var4.l()) {
                        i8 = ((int) Math.ceil(f)) - i5;
                    }
                    float f3 = -i8;
                    vj2Var.c = f3;
                    if (h47Var4.I && !h47Var4.J) {
                        if (h47Var4.V) {
                            L3 = gm.L(14.0f);
                        } else {
                            L3 = gm.L(8.0f);
                        }
                        vj2Var.c = f3 + L3;
                    }
                    vj2Var.a = h47Var4.n;
                    return;
                }
            }
            vj2Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.B2;
            if (arrayList4 == null) {
                vj2Var.d = null;
            } else if (arrayList4.size() == 1) {
                vj2Var.d = ((h47) messageObject.B2.get(0)).e;
                vj2Var.b = h47Var.f;
                h47 h47Var5 = (h47) messageObject.B2.get(0);
                if (h47Var5.J) {
                    i3 = gm.L(10.0f);
                } else {
                    i3 = 0;
                }
                if (h47Var5.l()) {
                    i4 = ((int) Math.ceil(messageObject.x2)) - i3;
                } else {
                    i4 = 0;
                }
                float f4 = -i4;
                vj2Var.c = f4;
                if (h47Var5.I && !h47Var5.J) {
                    if (h47Var5.V) {
                        L2 = gm.L(14.0f);
                    } else {
                        L2 = gm.L(8.0f);
                    }
                    vj2Var.c = f4 + L2;
                }
                vj2Var.a = 0;
            } else {
                for (int i11 = 0; i11 < messageObject.B2.size(); i11++) {
                    h47 h47Var6 = (h47) messageObject.B2.get(i11);
                    int i12 = i - h47Var6.n;
                    if (i12 >= 0 && i12 <= h47Var6.e.getText().length()) {
                        vj2Var.d = h47Var6.e;
                        vj2Var.b = h47Var6.o(messageObject.B2) + h47Var6.f;
                        if (h47Var6.J) {
                            i2 = gm.L(10.0f);
                        } else {
                            i2 = 0;
                        }
                        if (h47Var6.l()) {
                            i8 = ((int) Math.ceil(messageObject.x2)) - i2;
                        }
                        float f5 = -i8;
                        vj2Var.c = f5;
                        if (h47Var6.I && !h47Var6.J) {
                            if (h47Var6.V) {
                                L = gm.L(14.0f);
                            } else {
                                L = gm.L(8.0f);
                            }
                            vj2Var.c = f5 + L;
                        }
                        vj2Var.a = h47Var6.n;
                        return;
                    }
                }
                vj2Var.d = null;
            }
        }
    }

    @Override
    public final int j(int r19, int r20, int r21, int r22, defpackage.nkb r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkb.j(int, int, int, int, nkb, boolean):int");
    }

    @Override
    public final int l() {
        Layout layout;
        uj9 uj9Var;
        nkb nkbVar = this.W;
        if (nkbVar != null && ((rc2) nkbVar).getMessageObject() != null) {
            k47 messageObject = ((rc2) this.W).getMessageObject();
            if (this.q0) {
                layout = ((rc2) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((rc2) this.W).getFactCheckLayout();
            } else if (this.u0) {
                if (messageObject != null) {
                    uj9Var = messageObject.y2;
                } else {
                    uj9Var = null;
                }
                if (uj9Var != null) {
                    ArrayList arrayList = uj9Var.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((qkb) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((rc2) this.W).f2()) {
                layout = ((h47) ((rc2) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((h47) arrayList2.get(0)).e;
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
    public final java.lang.CharSequence r(defpackage.nkb r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkb.r(nkb, boolean):java.lang.CharSequence");
    }

    @Override
    public void v() {
        super.v();
        nkb nkbVar = this.W;
        if (nkbVar != null && ((rc2) nkbVar).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        nkb nkbVar2 = this.W;
        if (nkbVar2 != null) {
            if (this.s0 || this.t0) {
                ((rc2) nkbVar2).r2();
            }
        }
    }
}
