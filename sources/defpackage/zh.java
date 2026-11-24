package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class zh extends LinearLayout {
    public final byte a;
    public boolean b;
    public final Object c;
    public Object d;
    public final hn7 e;

    public zh(Activity activity, yh yhVar) {
        super(activity);
        this.a = (byte) 0;
        this.e = yhVar;
        this.c = new tgb(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        tgb tgbVar;
        String str;
        switch (this.a) {
            case 0:
                Object obj = this.c;
                int i = bkb.F6;
                ((tgb) obj).c((getWidth() - ((tgb) obj).c) / 2.0f, getHeight() / 2.0f, 1.0f, bkb.w0(null, i, false), canvas);
                if (!k96.c0) {
                    if (((yh) this.e).getValue() % 24 < 12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.b != z || (tgbVar = (tgb) this.d) == null) {
                        this.b = z;
                        if (z) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        tgbVar = new tgb(str, 18.0f, null);
                        this.d = tgbVar;
                    }
                    tgbVar.c((getWidth() / 2.0f) + gl.L(43.0f), (getHeight() / 2.0f) + gl.L(1.0f), 1.0f, bkb.w0(null, i, false), canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        int i3 = 5;
        Object obj = this.c;
        hn7 hn7Var = this.e;
        switch (b) {
            case 1:
                di diVar = (di) hn7Var;
                ci ciVar = (ci) this.d;
                hn7 hn7Var2 = (hn7) obj;
                this.b = true;
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                hn7Var2.setItemCount(i3);
                ciVar.setItemCount(i3);
                diVar.setItemCount(i3);
                hn7Var2.getLayoutParams().height = gl.L(42.0f) * i3;
                ciVar.getLayoutParams().height = gl.L(42.0f) * i3;
                diVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 2:
                gi giVar = (gi) hn7Var;
                ei eiVar = (ei) this.d;
                hn7 hn7Var3 = (hn7) obj;
                this.b = true;
                Point point2 = gl.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                hn7Var3.setItemCount(i3);
                eiVar.setItemCount(i3);
                giVar.setItemCount(i3);
                hn7Var3.getLayoutParams().height = gl.L(42.0f) * i3;
                eiVar.getLayoutParams().height = gl.L(42.0f) * i3;
                giVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 3:
                li liVar = (li) hn7Var;
                ki kiVar = (ki) this.d;
                hn7 hn7Var4 = (hn7) obj;
                this.b = true;
                Point point3 = gl.q;
                if (point3.x > point3.y) {
                    i3 = 3;
                }
                hn7Var4.setItemCount(i3);
                kiVar.setItemCount(i3);
                liVar.setItemCount(i3);
                hn7Var4.getLayoutParams().height = gl.L(42.0f) * i3;
                kiVar.getLayoutParams().height = gl.L(42.0f) * i3;
                liVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 4:
                oi oiVar = (oi) hn7Var;
                ni niVar = (ni) this.d;
                hn7 hn7Var5 = (hn7) obj;
                this.b = true;
                Point point4 = gl.q;
                if (point4.x > point4.y) {
                    i3 = 3;
                }
                hn7Var5.setItemCount(i3);
                niVar.setItemCount(i3);
                oiVar.setItemCount(i3);
                hn7Var5.getLayoutParams().height = gl.L(42.0f) * i3;
                niVar.getLayoutParams().height = gl.L(42.0f) * i3;
                oiVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 5:
                ti tiVar = (ti) this.d;
                si siVar = (si) obj;
                this.b = true;
                Point point5 = gl.q;
                if (point5.x > point5.y) {
                    i3 = 3;
                }
                siVar.setItemCount(i3);
                siVar.getLayoutParams().height = gl.L(42.0f) * i3;
                tiVar.setItemCount(i3);
                tiVar.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var.setItemCount(i3);
                hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 6:
                hn7 hn7Var6 = (hn7) this.d;
                hn7 hn7Var7 = (hn7) obj;
                this.b = true;
                Point point6 = gl.q;
                if (point6.x > point6.y) {
                    i3 = 3;
                }
                hn7Var7.setItemCount(i3);
                hn7Var6.setItemCount(i3);
                hn7Var.setItemCount(i3);
                hn7Var7.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var6.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 7:
                bj bjVar = (bj) hn7Var;
                aj ajVar = (aj) this.d;
                hn7 hn7Var8 = (hn7) obj;
                this.b = true;
                Point point7 = gl.q;
                if (point7.x > point7.y) {
                    i3 = 3;
                }
                hn7Var8.setItemCount(i3);
                ajVar.setItemCount(i3);
                bjVar.setItemCount(i3);
                hn7Var8.getLayoutParams().height = gl.L(42.0f) * i3;
                ajVar.getLayoutParams().height = gl.L(42.0f) * i3;
                bjVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public zh(Context context, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, byte b) {
        super(context);
        this.a = b;
        this.c = hn7Var;
        this.d = hn7Var2;
        this.e = hn7Var3;
        this.b = false;
    }
}
