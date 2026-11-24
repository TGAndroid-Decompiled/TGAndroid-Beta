package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class hx3 extends FrameLayout {
    public final qx3 E;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final lm s;
    public ImageReceiver w;
    public boolean x;
    public final lm y;

    public hx3(qx3 qx3Var, Context context) {
        super(context);
        this.E = qx3Var;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        s33 s33Var = s33.h;
        this.s = new lm(this, 0L, 350L, s33Var);
        this.y = new lm(this, 0L, 320L, s33Var);
    }

    public final void a() {
        gm[] gmVarArr;
        qx3 qx3Var = this.E;
        hw hwVar = qx3Var.q1;
        if (hwVar == null) {
            gmVarArr = new gm[0];
        } else {
            gm[] gmVarArr2 = new gm[hwVar.getChildCount()];
            for (int i = 0; i < hwVar.getChildCount(); i++) {
                View childAt = hwVar.getChildAt(i);
                if (childAt instanceof ix3) {
                    gmVarArr2[i] = ((ix3) childAt).c;
                }
            }
            gmVarArr = gmVarArr2;
        }
        qx3Var.l1 = gm.update(3, this, gmVarArr, qx3Var.l1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        int i;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        gx3 gx3Var;
        float f3;
        float f4;
        gm gmVar;
        PorterDuffColorFilter porterDuffColorFilter;
        Canvas canvas2 = canvas;
        qx3 qx3Var = this.E;
        ih2 ih2Var = qx3Var.z1;
        hw hwVar = qx3Var.q1;
        if (!this.d) {
            return;
        }
        int v0 = bkb.v0(bkb.g5, qx3Var.J0);
        Paint paint = this.a;
        paint.setColor(v0);
        bkb.m(paint);
        Path path = this.b;
        path.reset();
        float D0 = qx3Var.D0();
        if (D0 <= qx3Var.b.getPaddingTop()) {
            z = true;
        } else {
            z = false;
        }
        float d = this.s.d(z);
        float R1 = gl.R1(D0, 0.0f, d);
        if (this.w != null) {
            float L = gl.L(140.0f);
            f = 20.0f;
            float L2 = gl.L(20.0f);
            if (R1 < L + L2) {
                this.x = false;
            }
            f2 = 2.0f;
            this.w.setAlpha(this.y.d(this.x));
            int i2 = (this.w.getAlpha() > 0.0f ? 1 : (this.w.getAlpha() == 0.0f ? 0 : -1));
            ImageReceiver imageReceiver = this.w;
            if (i2 > 0) {
                float alpha = ((imageReceiver.getAlpha() * 0.4f) + 0.6f) * L;
                float f5 = alpha / 2.0f;
                this.w.i0((getWidth() / 2.0f) - f5, ((R1 - L2) - (L / 2.0f)) - f5, alpha, alpha);
                this.w.h(canvas2, null);
            } else {
                imageReceiver.K();
                this.w = null;
            }
        } else {
            f = 20.0f;
            f2 = 2.0f;
        }
        float f6 = 1.0f;
        float L3 = gl.L((1.0f - d) * 14.0f);
        RectF rectF = gl.P;
        rectF.set(getPaddingLeft(), R1, getWidth() - getPaddingRight(), getBottom() + L3);
        path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (d > 0.5f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = this.c;
        if (bool == null || z2 != bool.booleanValue()) {
            this.c = Boolean.valueOf(z2);
            qx3Var.J0(z2);
        }
        bkb.s0.setColor(bkb.v0(bkb.yj, qx3Var.J0));
        bkb.s0.setAlpha((int) (moe.a(R1 / gl.L(f), 0.0f, 1.0f) * bkb.s0.getAlpha()));
        int L4 = gl.L(36.0f);
        float L5 = R1 + gl.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, gl.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, gl.L(f2), gl.L(f2), bkb.s0);
        View view = qx3Var.s1;
        if (!hwVar.canScrollVertically(1) && qx3Var.v1.getVisibility() != 0) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (hwVar != null) {
            canvas2.save();
            canvas2.translate(hwVar.getLeft(), hwVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, hwVar.getWidth(), hwVar.getHeight());
            float f7 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, hwVar.getWidth(), hwVar.getHeight(), (int) (hwVar.getAlpha() * 255.0f), 31);
            int i3 = 0;
            while (true) {
                sparseArray = this.e;
                int size = sparseArray.size();
                arrayList = this.n;
                if (i3 >= size) {
                    break;
                }
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i3);
                arrayList3.clear();
                arrayList.add(arrayList3);
                i3++;
            }
            sparseArray.clear();
            int i4 = 0;
            while (i4 < hwVar.getChildCount()) {
                View childAt = hwVar.getChildAt(i4);
                if (childAt instanceof ix3) {
                    ix3 ix3Var = (ix3) childAt;
                    if (ix3Var.isPressed()) {
                        float f8 = ix3Var.e;
                        if (f8 != f6) {
                            ix3Var.e = Utilities.i(f8 + 0.16f, f6, 0.0f);
                            ix3Var.invalidate();
                        }
                    }
                    if (qx3Var.l1 == null || (gmVar = ix3Var.c) == null) {
                        f3 = f6;
                    } else {
                        f3 = f6;
                        vl vlVar = (vl) qx3Var.l1.get(gmVar.getDocumentId());
                        if (vlVar != null) {
                            int v02 = bkb.v0(bkb.F6, qx3Var.J0);
                            if (v02 == qx3Var.O1 && (porterDuffColorFilter = qx3Var.N1) != null) {
                                f4 = f7;
                            } else {
                                qx3Var.O1 = v02;
                                f4 = f7;
                                porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                                qx3Var.N1 = porterDuffColorFilter;
                            }
                            vlVar.setColorFilter(porterDuffColorFilter);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) tb4.l(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(ix3Var);
                        }
                    }
                    f4 = f7;
                } else {
                    f3 = f6;
                    f4 = f7;
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i4++;
                f6 = f3;
                f7 = f4;
            }
            float f9 = f6;
            float f10 = f7;
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i5 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.r;
                if (i5 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i5);
                View view2 = (View) arrayList7.get(0);
                hwVar.getClass();
                int R = RecyclerView.R(view2);
                long j = currentTimeMillis;
                int i6 = 0;
                while (true) {
                    if (i6 < arrayList5.size()) {
                        if (((gx3) arrayList5.get(i6)).N == R) {
                            gx3Var = (gx3) arrayList5.get(i6);
                            arrayList5.remove(i6);
                            break;
                        }
                        i6++;
                    } else {
                        gx3Var = null;
                        break;
                    }
                }
                if (gx3Var == null) {
                    if (!arrayList2.isEmpty()) {
                        gx3Var = (gx3) tb4.l(1, arrayList2);
                    } else {
                        gx3Var = new gx3(this);
                        gx3Var.l(7);
                    }
                    gx3Var.N = R;
                    gx3Var.e();
                }
                arrayList6.add(gx3Var);
                gx3Var.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                gx3 gx3Var2 = gx3Var;
                currentTimeMillis = j;
                gx3Var2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i5++;
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((gx3) arrayList5.get(i7));
                    ((gx3) arrayList5.get(i7)).O = null;
                    ((gx3) arrayList5.get(i7)).k();
                } else {
                    ((gx3) arrayList5.get(i7)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (hwVar.getAlpha() < f9) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = gl.L(16.0f);
                ih2Var.setAlpha((int) ((f9 - hwVar.getAlpha()) * f10));
                ih2Var.setBounds(width - L6, height - L6, width + L6, height + L6);
                ih2Var.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            qx3 qx3Var = this.E;
            if (y < qx3Var.D0() - gl.L(6.0f)) {
                qx3Var.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i = 0;
        this.d = false;
        int i2 = 0;
        while (true) {
            arrayList = this.f;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((gx3) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                break;
            }
            ((gx3) arrayList2.get(i)).f();
            i++;
        }
        arrayList.clear();
        gm.release(this, this.E.l1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }
}
