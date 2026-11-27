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
public abstract class bmb extends mmb {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override
    public final boolean B() {
        hmb hmbVar;
        hl9 hl9Var;
        CharSequence q;
        String str;
        if (this.u0 && (hmbVar = this.W) != null && ((wb2) hmbVar).getMessageObject() != null && (hl9Var = ((wb2) this.W).getMessageObject().y2) != null && !hl9Var.n.isEmpty() && (q = q()) != null && q.length() != 0) {
            try {
                str = hl9Var.v(this.u, this.v);
            } catch (Exception e) {
                cc4.g(e, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                hl.f(q, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(boolean z) {
        hmb hmbVar = this.W;
        if (hmbVar != null && ((wb2) hmbVar).B2() && !z) {
            wb2 wb2Var = (wb2) this.W;
            int e1 = wb2Var.getMessageObject().e1();
            SparseArray sparseArray = this.p0;
            Animator animator = (Animator) sparseArray.get(e1);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            wb2Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new dx0(wb2Var, e1, (byte) 5));
            ofFloat.addListener(new qb2(wb2Var, (byte) 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(e1, ofFloat);
        }
    }

    @Override
    public final void K(hmb hmbVar, hmb hmbVar2) {
        boolean z;
        wb2 wb2Var = (wb2) hmbVar;
        wb2 wb2Var2 = (wb2) hmbVar2;
        if (wb2Var2 != null && (wb2Var2.getMessageObject() == null || wb2Var2.getMessageObject().e1() == wb2Var.getMessageObject().e1())) {
            z = false;
        } else {
            z = true;
        }
        this.w = wb2Var.getMessageObject().e1();
        try {
            int i = wb2Var.getMessageObject().k.edit_date;
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
        ofFloat.addUpdateListener(new e20((byte) 10, this, z));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z) {
            wb2Var.setSelectedBackgroundProgress(0.0f);
        }
        boolean z2 = xea.a;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void V(r47 r47Var) {
        try {
            int i = r47Var.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == r47Var.e1()) {
            e(true);
        }
    }

    public final void W(r47 r47Var, o47 o47Var, Canvas canvas) {
        r47 messageObject;
        hmb hmbVar = this.W;
        if (hmbVar != null && ((wb2) hmbVar).getMessageObject() != null && !this.q0 && !this.s0 && !this.u0 && (messageObject = ((wb2) this.W).getMessageObject()) != null && messageObject.B2 != null && r47Var.e1() == this.w) {
            int i = this.u;
            int i2 = o47Var.n;
            int i3 = this.v - i2;
            int i4 = 0;
            int j = Utilities.j(i - i2, o47Var.e.getText().length(), 0);
            int j2 = Utilities.j(i3, o47Var.e.getText().length(), 0);
            if (j != j2) {
                boolean O3 = messageObject.O3();
                Paint paint = this.p;
                Paint paint2 = this.o;
                if (O3) {
                    int i5 = aob.Mc;
                    paint2.setColor(s(i5));
                    paint.setColor(s(i5));
                } else {
                    int i6 = aob.lg;
                    paint2.setColor(s(i6));
                    paint.setColor(s(i6));
                }
                if (o47Var.J) {
                    i4 = hl.L(10.0f);
                } else if (o47Var.I) {
                    i4 = hl.L(0.0f);
                }
                g(canvas, o47Var.e, j, j2, true, true, i4);
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
            int i = aob.Mc;
            paint2.setColor(s(i));
            paint.setColor(s(i));
        } else {
            int i2 = aob.lg;
            paint2.setColor(s(i2));
            paint.setColor(s(i2));
        }
        g(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
    }

    public final void Y(r47 r47Var, hl9 hl9Var, Canvas canvas) {
        kmb kmbVar;
        bmb bmbVar;
        Canvas canvas2;
        boolean z;
        if (this.u0 && hl9Var != null) {
            ArrayList arrayList = hl9Var.n;
            hmb hmbVar = this.W;
            if (hmbVar != null && ((wb2) hmbVar).getMessageObject() != null && ((wb2) this.W).getMessageObject().e1() == r47Var.e1()) {
                boolean O3 = r47Var.O3();
                Paint paint = this.p;
                Paint paint2 = this.o;
                if (O3) {
                    int i = aob.Mc;
                    paint2.setColor(s(i));
                    paint.setColor(s(i));
                } else {
                    int i2 = aob.lg;
                    paint2.setColor(s(i2));
                    paint.setColor(s(i2));
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    Layout a = ((kmb) arrayList.get(i3)).a();
                    if (a != null && a.getText() != null) {
                        int intValue = ((Integer) hl9Var.o.get(i3)).intValue();
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
                            canvas.translate(kmbVar.getX(), kmbVar.getY());
                            bmbVar = this;
                            canvas2 = canvas;
                            bmbVar.g(canvas2, a, j, j2, z, z2, 0.0f);
                            canvas2.restore();
                            i3++;
                            this = bmbVar;
                            canvas = canvas2;
                        }
                    }
                    bmbVar = this;
                    canvas2 = canvas;
                    i3++;
                    this = bmbVar;
                    canvas = canvas2;
                }
            }
        }
    }

    public final void Z(wb2 wb2Var, int i, int i2) {
        boolean z;
        if (wb2Var == null) {
            return;
        }
        this.W = wb2Var;
        this.w = wb2Var.getMessageObject().e1();
        if (((wb2) this.W).getMessageObject().D == 36 && ((wb2) this.W).getMessageObject().y2 != null) {
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
        b0f b0fVar = this.D;
        if (b0fVar != null) {
            b0fVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            lmbVar.setVisibility(0);
        }
        S();
    }

    public final void a0(wb2 wb2Var) {
        ArrayList arrayList;
        hl9 hl9Var;
        this.X = wb2Var;
        r47 messageObject = wb2Var.getMessageObject();
        dc2 dc2Var = wb2Var.ub;
        boolean z = this.r0;
        Rect rect = this.B;
        if (z && wb2Var.getDescriptionlayout() != null) {
            int i = this.c;
            rect.set(i, this.d, wb2Var.getDescriptionlayout().getWidth() + i, wb2Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.t0 && wb2Var.getFactCheckLayout() != null) {
            int i2 = this.c;
            rect.set(i2, this.d, wb2Var.getFactCheckLayout().getWidth() + i2, wb2Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.v0 && messageObject != null && (hl9Var = messageObject.y2) != null && !hl9Var.n.isEmpty()) {
            hl9 hl9Var2 = messageObject.y2;
            int i3 = this.c;
            int i4 = this.d;
            rect.set(i3, i4, hl9Var2.C + i3, hl9Var2.t() + i4);
        } else if (wb2Var.f2() && wb2Var.getCaptionLayout().e.size() > 0) {
            o47 o47Var = (o47) c00.g(1, wb2Var.getCaptionLayout().e);
            int i5 = this.c;
            rect.set(i5, this.d, o47Var.e.getWidth() + i5, (int) (o47Var.p(wb2Var.getCaptionLayout().e, dc2Var) + this.d + o47Var.f + o47Var.e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.B2) != null && arrayList.size() > 0) {
            o47 o47Var2 = (o47) c00.g(1, messageObject.B2);
            int i6 = this.c;
            rect.set(i6, this.d, o47Var2.e.getWidth() + i6, (int) (o47Var2.p(messageObject.B2, dc2Var) + this.d + o47Var2.f + o47Var2.e.getHeight()));
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
    public final void h(int i, dj2 dj2Var, boolean z) {
        hmb hmbVar;
        int i2;
        int L;
        o47 o47Var;
        int i3;
        int i4;
        int L2;
        int i5;
        int L3;
        o47 o47Var2;
        int i6;
        int i7;
        int L4;
        hl9 hl9Var;
        kmb kmbVar;
        if (z) {
            hmbVar = this.X;
        } else {
            hmbVar = this.W;
        }
        wb2 wb2Var = (wb2) hmbVar;
        if (wb2Var == null) {
            dj2Var.d = null;
            return;
        }
        r47 messageObject = wb2Var.getMessageObject();
        int i8 = 0;
        if (this.q0) {
            dj2Var.d = wb2Var.getDescriptionlayout();
            dj2Var.b = 0.0f;
            dj2Var.c = 0.0f;
            dj2Var.a = 0;
        } else if (this.s0) {
            dj2Var.d = wb2Var.getFactCheckLayout();
            dj2Var.b = 0.0f;
            dj2Var.c = 0.0f;
            dj2Var.a = 0;
        } else if (this.u0) {
            if (messageObject != null) {
                hl9Var = messageObject.y2;
            } else {
                hl9Var = null;
            }
            if (hl9Var != null) {
                ArrayList arrayList = hl9Var.o;
                ArrayList arrayList2 = hl9Var.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i8 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i8)).intValue();
                            int length = ((kmb) arrayList2.get(i8)).a().getText().length();
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
                    dj2Var.d = ((kmb) arrayList2.get(i8)).a();
                    dj2Var.b = kmbVar.getY();
                    dj2Var.c = kmbVar.getX();
                    dj2Var.a = ((Integer) arrayList.get(i8)).intValue();
                    return;
                }
            }
            dj2Var.d = null;
        } else if (wb2Var.f2()) {
            p47 captionLayout = wb2Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f = captionLayout.d;
            if (arrayList3.size() == 1) {
                dj2Var.d = ((o47) arrayList3.get(0)).e;
                dj2Var.b = o47Var2.f;
                o47 o47Var3 = (o47) arrayList3.get(0);
                if (o47Var3.J) {
                    i6 = hl.L(10.0f);
                } else {
                    i6 = 0;
                }
                if (o47Var3.l()) {
                    i7 = ((int) Math.ceil(f)) - i6;
                } else {
                    i7 = 0;
                }
                float f2 = -i7;
                dj2Var.c = f2;
                if (o47Var3.I && !o47Var3.J) {
                    if (o47Var3.V) {
                        L4 = hl.L(14.0f);
                    } else {
                        L4 = hl.L(8.0f);
                    }
                    dj2Var.c = f2 + L4;
                }
                dj2Var.a = 0;
                return;
            }
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                o47 o47Var4 = (o47) arrayList3.get(i9);
                int i10 = i - o47Var4.n;
                if (i10 >= 0 && i10 <= o47Var4.e.getText().length()) {
                    dj2Var.d = o47Var4.e;
                    dj2Var.b = o47Var4.o(arrayList3) + o47Var4.f;
                    if (o47Var4.J) {
                        i5 = hl.L(10.0f);
                    } else {
                        i5 = 0;
                    }
                    if (o47Var4.l()) {
                        i8 = ((int) Math.ceil(f)) - i5;
                    }
                    float f3 = -i8;
                    dj2Var.c = f3;
                    if (o47Var4.I && !o47Var4.J) {
                        if (o47Var4.V) {
                            L3 = hl.L(14.0f);
                        } else {
                            L3 = hl.L(8.0f);
                        }
                        dj2Var.c = f3 + L3;
                    }
                    dj2Var.a = o47Var4.n;
                    return;
                }
            }
            dj2Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.B2;
            if (arrayList4 == null) {
                dj2Var.d = null;
            } else if (arrayList4.size() == 1) {
                dj2Var.d = ((o47) messageObject.B2.get(0)).e;
                dj2Var.b = o47Var.f;
                o47 o47Var5 = (o47) messageObject.B2.get(0);
                if (o47Var5.J) {
                    i3 = hl.L(10.0f);
                } else {
                    i3 = 0;
                }
                if (o47Var5.l()) {
                    i4 = ((int) Math.ceil(messageObject.x2)) - i3;
                } else {
                    i4 = 0;
                }
                float f4 = -i4;
                dj2Var.c = f4;
                if (o47Var5.I && !o47Var5.J) {
                    if (o47Var5.V) {
                        L2 = hl.L(14.0f);
                    } else {
                        L2 = hl.L(8.0f);
                    }
                    dj2Var.c = f4 + L2;
                }
                dj2Var.a = 0;
            } else {
                for (int i11 = 0; i11 < messageObject.B2.size(); i11++) {
                    o47 o47Var6 = (o47) messageObject.B2.get(i11);
                    int i12 = i - o47Var6.n;
                    if (i12 >= 0 && i12 <= o47Var6.e.getText().length()) {
                        dj2Var.d = o47Var6.e;
                        dj2Var.b = o47Var6.o(messageObject.B2) + o47Var6.f;
                        if (o47Var6.J) {
                            i2 = hl.L(10.0f);
                        } else {
                            i2 = 0;
                        }
                        if (o47Var6.l()) {
                            i8 = ((int) Math.ceil(messageObject.x2)) - i2;
                        }
                        float f5 = -i8;
                        dj2Var.c = f5;
                        if (o47Var6.I && !o47Var6.J) {
                            if (o47Var6.V) {
                                L = hl.L(14.0f);
                            } else {
                                L = hl.L(8.0f);
                            }
                            dj2Var.c = f5 + L;
                        }
                        dj2Var.a = o47Var6.n;
                        return;
                    }
                }
                dj2Var.d = null;
            }
        }
    }

    @Override
    public final int j(int r19, int r20, int r21, int r22, defpackage.hmb r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmb.j(int, int, int, int, hmb, boolean):int");
    }

    @Override
    public final int l() {
        Layout layout;
        hl9 hl9Var;
        hmb hmbVar = this.W;
        if (hmbVar != null && ((wb2) hmbVar).getMessageObject() != null) {
            r47 messageObject = ((wb2) this.W).getMessageObject();
            if (this.q0) {
                layout = ((wb2) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((wb2) this.W).getFactCheckLayout();
            } else if (this.u0) {
                if (messageObject != null) {
                    hl9Var = messageObject.y2;
                } else {
                    hl9Var = null;
                }
                if (hl9Var != null) {
                    ArrayList arrayList = hl9Var.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((kmb) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((wb2) this.W).f2()) {
                layout = ((o47) ((wb2) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((o47) arrayList2.get(0)).e;
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
    public final java.lang.CharSequence r(defpackage.hmb r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmb.r(hmb, boolean):java.lang.CharSequence");
    }

    @Override
    public void v() {
        super.v();
        hmb hmbVar = this.W;
        if (hmbVar != null && ((wb2) hmbVar).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        hmb hmbVar2 = this.W;
        if (hmbVar2 != null) {
            if (this.s0 || this.t0) {
                ((wb2) hmbVar2).r2();
            }
        }
    }
}
