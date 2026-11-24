package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class zi extends LinearLayout {
    public final byte a;
    public boolean b;
    public final Object c;
    public Object d;
    public final lp7 e;

    public zi(Activity activity, yi yiVar) {
        super(activity);
        this.a = (byte) 0;
        this.e = yiVar;
        this.c = new uib(":", 18.0f, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        uib uibVar;
        String str;
        switch (this.a) {
            case 0:
                Object obj = this.c;
                int i = cmb.F6;
                ((uib) obj).c((getWidth() - ((uib) obj).c) / 2.0f, getHeight() / 2.0f, 1.0f, cmb.w0(null, i, false), canvas);
                if (!jb6.c0) {
                    if (((yi) this.e).getValue() % 24 < 12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.b != z || (uibVar = (uib) this.d) == null) {
                        this.b = z;
                        if (z) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        uibVar = new uib(str, 18.0f, null);
                        this.d = uibVar;
                    }
                    uibVar.c((getWidth() / 2.0f) + gm.L(43.0f), (getHeight() / 2.0f) + gm.L(1.0f), 1.0f, cmb.w0(null, i, false), canvas);
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
        lp7 lp7Var = this.e;
        switch (b) {
            case 1:
                dj djVar = (dj) lp7Var;
                cj cjVar = (cj) this.d;
                lp7 lp7Var2 = (lp7) obj;
                this.b = true;
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                lp7Var2.setItemCount(i3);
                cjVar.setItemCount(i3);
                djVar.setItemCount(i3);
                lp7Var2.getLayoutParams().height = gm.L(42.0f) * i3;
                cjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                djVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 2:
                gj gjVar = (gj) lp7Var;
                ej ejVar = (ej) this.d;
                lp7 lp7Var3 = (lp7) obj;
                this.b = true;
                Point point2 = gm.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                lp7Var3.setItemCount(i3);
                ejVar.setItemCount(i3);
                gjVar.setItemCount(i3);
                lp7Var3.getLayoutParams().height = gm.L(42.0f) * i3;
                ejVar.getLayoutParams().height = gm.L(42.0f) * i3;
                gjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 3:
                lj ljVar = (lj) lp7Var;
                kj kjVar = (kj) this.d;
                lp7 lp7Var4 = (lp7) obj;
                this.b = true;
                Point point3 = gm.q;
                if (point3.x > point3.y) {
                    i3 = 3;
                }
                lp7Var4.setItemCount(i3);
                kjVar.setItemCount(i3);
                ljVar.setItemCount(i3);
                lp7Var4.getLayoutParams().height = gm.L(42.0f) * i3;
                kjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                ljVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 4:
                oj ojVar = (oj) lp7Var;
                nj njVar = (nj) this.d;
                lp7 lp7Var5 = (lp7) obj;
                this.b = true;
                Point point4 = gm.q;
                if (point4.x > point4.y) {
                    i3 = 3;
                }
                lp7Var5.setItemCount(i3);
                njVar.setItemCount(i3);
                ojVar.setItemCount(i3);
                lp7Var5.getLayoutParams().height = gm.L(42.0f) * i3;
                njVar.getLayoutParams().height = gm.L(42.0f) * i3;
                ojVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 5:
                tj tjVar = (tj) this.d;
                sj sjVar = (sj) obj;
                this.b = true;
                Point point5 = gm.q;
                if (point5.x > point5.y) {
                    i3 = 3;
                }
                sjVar.setItemCount(i3);
                sjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                tjVar.setItemCount(i3);
                tjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var.setItemCount(i3);
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 6:
                lp7 lp7Var6 = (lp7) this.d;
                lp7 lp7Var7 = (lp7) obj;
                this.b = true;
                Point point6 = gm.q;
                if (point6.x > point6.y) {
                    i3 = 3;
                }
                lp7Var7.setItemCount(i3);
                lp7Var6.setItemCount(i3);
                lp7Var.setItemCount(i3);
                lp7Var7.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var6.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            case 7:
                bk bkVar = (bk) lp7Var;
                ak akVar = (ak) this.d;
                lp7 lp7Var8 = (lp7) obj;
                this.b = true;
                Point point7 = gm.q;
                if (point7.x > point7.y) {
                    i3 = 3;
                }
                lp7Var8.setItemCount(i3);
                akVar.setItemCount(i3);
                bkVar.setItemCount(i3);
                lp7Var8.getLayoutParams().height = gm.L(42.0f) * i3;
                akVar.getLayoutParams().height = gm.L(42.0f) * i3;
                bkVar.getLayoutParams().height = gm.L(42.0f) * i3;
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

    public zi(Context context, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, byte b) {
        super(context);
        this.a = b;
        this.c = lp7Var;
        this.d = lp7Var2;
        this.e = lp7Var3;
        this.b = false;
    }
}
