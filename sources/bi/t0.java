package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.ay;
import org.telegram.ui.c8;
import org.telegram.ui.er0;
import org.telegram.ui.o40;
import org.telegram.ui.p10;
import org.telegram.ui.wu;
import org.telegram.ui.x7;
public final class t0 extends View {
    public final int f3355a;
    public Object f3356b;

    public t0(Context context) {
        super(context);
        this.f3355a = 13;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3355a) {
            case 2:
                super.dispatchDraw(canvas);
                jg.j0 j0Var = ((er0) this.f3356b).F0;
                if (j0Var != null) {
                    j0Var.d(canvas);
                    return;
                }
                return;
            case 27:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f3356b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3355a) {
            case 13:
                super.draw(canvas);
                ((qz0) this.f3356b).e(canvas, (getMeasuredWidth() - ((qz0) this.f3356b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 17:
                super.draw(canvas);
                op0 op0Var = (op0) this.f3356b;
                op0Var.N2.setBounds(0, (getMeasuredHeight() - op0Var.f29152y2.d) - org.telegram.messenger.i0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                op0Var.N2.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3355a) {
            case 21:
                super.invalidate();
                ((uu0) this.f3356b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f3355a) {
            case 1:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f3356b).f23914l = true;
                return;
            case 27:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f3356b;
                if (bVar != null) {
                    bVar.f7142i = this;
                    int i10 = 0;
                    while (true) {
                        o40[] o40VarArr = (o40[]) bVar.e;
                        if (i10 < o40VarArr.length) {
                            o40 o40Var = o40VarArr[i10];
                            o40Var.f40133i.add(this);
                            o40Var.a();
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3355a) {
            case 1:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f3356b).f23914l = false;
                return;
            case 27:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f3356b;
                if (bVar != null && ((t0) bVar.f7142i) != this) {
                    int i10 = 0;
                    while (true) {
                        o40[] o40VarArr = (o40[]) bVar.e;
                        if (i10 < o40VarArr.length) {
                            o40 o40Var = o40VarArr[i10];
                            o40Var.f40133i.remove(this);
                            o40Var.a();
                            i10++;
                        } else {
                            bVar.f7142i = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.t0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        switch (this.f3355a) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(24.0f));
                return;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 12:
            case 16:
            case 17:
            case 19:
            case 21:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                s4.a0 a0Var = ((org.telegram.ui.m5) this.f3356b).d.F;
                if (a0Var instanceof az) {
                    i12 = ((az) a0Var).J;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824));
                return;
            case 8:
                ha haVar = (ha) this.f3356b;
                int i15 = haVar.f26668n1;
                if (i15 == 0) {
                    i13 = org.telegram.messenger.i0.L(300.0f);
                } else {
                    i13 = (int) (i15 * haVar.f26672r1);
                }
                int i16 = i13 - (((haVar.f26678x1 - haVar.f26679y1) - haVar.f26680z1) - haVar.A1);
                if (i16 < 1) {
                    i16 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((bm) this.f3356b).f24837w.J, 1073741824));
                return;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((jn) ((fg.j) this.f3356b).e).R0);
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((kn) ((x7) this.f3356b).d).f27830x, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((qz0) this.f3356b).k()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((qz0) this.f3356b).i()), org.telegram.messenger.i0.L(26.0f)), 1073741824));
                return;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f) + ((g60) this.f3356b).f26263c.f28301f2, 1073741824));
                return;
            case 15:
                int L = org.telegram.messenger.i0.L(48.0f);
                m60 m60Var = ((i60) this.f3356b).f26894n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L + m60Var.f28301f2 + m60Var.f28307l2, 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((lp0) this.f3356b).K.B1.R, 1073741824));
                return;
            case 20:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((ku0) this.f3356b).getMeasuredHeight());
                return;
            case 22:
                sv0 sv0Var = (sv0) this.f3356b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(4.0f);
                bw0 bw0Var = sv0Var.d;
                int i17 = bw0Var.f24897n3;
                if (i17 > 0) {
                    i14 = org.telegram.messenger.i0.L(4.0f) + i17;
                } else {
                    i14 = 0;
                }
                int max = Math.max(i14, (int) (size - Math.min(org.telegram.messenger.i0.L(4.0f) + ((sv0Var.b() - 1) * size2), sv0Var.d.f24888e3 * size2)));
                bw0Var.f24896m3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 23:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
                return;
            case 26:
                p10 p10Var = (p10) this.f3356b;
                if (p10Var.H) {
                    p10Var.J = (p10Var.o0().getMeasuredHeight() + p10Var.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.i0.L(140.0f) + p10Var.I;
                    if (org.telegram.messenger.i0.L(24.0f) + p10Var.D.getMeasuredHeight() > L2) {
                        L2 = Math.max(L2, (org.telegram.messenger.i0.L(24.0f) + p10Var.D.getMeasuredHeight()) - p10Var.L);
                    }
                    p10Var.J = L2;
                }
                int i18 = (int) (p10Var.J - (0 * 2.5f));
                p10Var.J = i18;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                return;
            case 27:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(38.0f));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f3355a) {
            case 24:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.s0) this.f3356b).f31651n.f31436f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f3355a) {
            case 6:
                super.setAlpha(f7);
                View view = ((c8) this.f3356b).f36413b.f36982y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 25:
                super.setAlpha(f7);
                View view2 = ((ay) this.f3356b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f3355a) {
            case 19:
                super.setTranslationX(f7);
                invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f3355a) {
            case 8:
                super.setTranslationY(f7);
                int i10 = ha.O1;
                ((ha) this.f3356b).f21586b.invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public t0(Object obj, Context context, int i10) {
        super(context);
        this.f3355a = i10;
        this.f3356b = obj;
    }

    public t0(ha haVar, Context context) {
        super(context);
        this.f3355a = 8;
        this.f3356b = haVar;
        setTag(-33024);
    }

    public t0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f3355a = 1;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, p6Var);
        this.f3356b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.f21329z5, org.telegram.ui.ActionBar.t6.f21059k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.i0.L(5.0f));
    }

    public t0(Context context, g.b bVar) {
        super(context);
        this.f3355a = 27;
        this.f3356b = bVar;
        zs.i(this);
        setOnClickListener(new wu(10, this, context));
    }
}
