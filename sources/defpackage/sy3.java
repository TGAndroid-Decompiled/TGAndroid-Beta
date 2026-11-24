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
public final class sy3 extends FrameLayout {
    public final az3 E;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final ln s;
    public ImageReceiver w;
    public boolean x;
    public final ln y;

    public sy3(az3 az3Var, Context context) {
        super(context);
        this.E = az3Var;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        d53 d53Var = d53.h;
        this.s = new ln(this, 0L, 350L, d53Var);
        this.y = new ln(this, 0L, 320L, d53Var);
    }

    public final void a() {
        gn[] gnVarArr;
        az3 az3Var = this.E;
        hx hxVar = az3Var.q1;
        if (hxVar == null) {
            gnVarArr = new gn[0];
        } else {
            gn[] gnVarArr2 = new gn[hxVar.getChildCount()];
            for (int i = 0; i < hxVar.getChildCount(); i++) {
                View childAt = hxVar.getChildAt(i);
                if (childAt instanceof ty3) {
                    gnVarArr2[i] = ((ty3) childAt).c;
                }
            }
            gnVarArr = gnVarArr2;
        }
        az3Var.l1 = gn.update(3, this, gnVarArr, az3Var.l1);
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
        ry3 ry3Var;
        float f3;
        float f4;
        gn gnVar;
        PorterDuffColorFilter porterDuffColorFilter;
        Canvas canvas2 = canvas;
        az3 az3Var = this.E;
        wi2 wi2Var = az3Var.z1;
        hx hxVar = az3Var.q1;
        if (!this.d) {
            return;
        }
        int v0 = cmb.v0(cmb.g5, az3Var.J0);
        Paint paint = this.a;
        paint.setColor(v0);
        cmb.m(paint);
        Path path = this.b;
        path.reset();
        float D0 = az3Var.D0();
        if (D0 <= az3Var.b.getPaddingTop()) {
            z = true;
        } else {
            z = false;
        }
        float d = this.s.d(z);
        float R1 = gm.R1(D0, 0.0f, d);
        if (this.w != null) {
            float L = gm.L(140.0f);
            f = 20.0f;
            float L2 = gm.L(20.0f);
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
        float L3 = gm.L((1.0f - d) * 14.0f);
        RectF rectF = gm.P;
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
            az3Var.J0(z2);
        }
        cmb.s0.setColor(cmb.v0(cmb.yj, az3Var.J0));
        cmb.s0.setAlpha((int) (pqe.a(R1 / gm.L(f), 0.0f, 1.0f) * cmb.s0.getAlpha()));
        int L4 = gm.L(36.0f);
        float L5 = R1 + gm.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, gm.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, gm.L(f2), gm.L(f2), cmb.s0);
        View view = az3Var.s1;
        if (!hxVar.canScrollVertically(1) && az3Var.v1.getVisibility() != 0) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (hxVar != null) {
            canvas2.save();
            canvas2.translate(hxVar.getLeft(), hxVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, hxVar.getWidth(), hxVar.getHeight());
            float f7 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, hxVar.getWidth(), hxVar.getHeight(), (int) (hxVar.getAlpha() * 255.0f), 31);
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
            while (i4 < hxVar.getChildCount()) {
                View childAt = hxVar.getChildAt(i4);
                if (childAt instanceof ty3) {
                    ty3 ty3Var = (ty3) childAt;
                    if (ty3Var.isPressed()) {
                        float f8 = ty3Var.e;
                        if (f8 != f6) {
                            ty3Var.e = Utilities.i(f8 + 0.16f, f6, 0.0f);
                            ty3Var.invalidate();
                        }
                    }
                    if (az3Var.l1 == null || (gnVar = ty3Var.c) == null) {
                        f3 = f6;
                    } else {
                        f3 = f6;
                        vm vmVar = (vm) az3Var.l1.get(gnVar.getDocumentId());
                        if (vmVar != null) {
                            int v02 = cmb.v0(cmb.F6, az3Var.J0);
                            if (v02 == az3Var.O1 && (porterDuffColorFilter = az3Var.N1) != null) {
                                f4 = f7;
                            } else {
                                az3Var.O1 = v02;
                                f4 = f7;
                                porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                                az3Var.N1 = porterDuffColorFilter;
                            }
                            vmVar.setColorFilter(porterDuffColorFilter);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) td4.m(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(ty3Var);
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
                hxVar.getClass();
                int R = RecyclerView.R(view2);
                long j = currentTimeMillis;
                int i6 = 0;
                while (true) {
                    if (i6 < arrayList5.size()) {
                        if (((ry3) arrayList5.get(i6)).N == R) {
                            ry3Var = (ry3) arrayList5.get(i6);
                            arrayList5.remove(i6);
                            break;
                        }
                        i6++;
                    } else {
                        ry3Var = null;
                        break;
                    }
                }
                if (ry3Var == null) {
                    if (!arrayList2.isEmpty()) {
                        ry3Var = (ry3) td4.m(1, arrayList2);
                    } else {
                        ry3Var = new ry3(this);
                        ry3Var.l(7);
                    }
                    ry3Var.N = R;
                    ry3Var.e();
                }
                arrayList6.add(ry3Var);
                ry3Var.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                ry3 ry3Var2 = ry3Var;
                currentTimeMillis = j;
                ry3Var2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i5++;
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((ry3) arrayList5.get(i7));
                    ((ry3) arrayList5.get(i7)).O = null;
                    ((ry3) arrayList5.get(i7)).k();
                } else {
                    ((ry3) arrayList5.get(i7)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (hxVar.getAlpha() < f9) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = gm.L(16.0f);
                wi2Var.setAlpha((int) ((f9 - hxVar.getAlpha()) * f10));
                wi2Var.setBounds(width - L6, height - L6, width + L6, height + L6);
                wi2Var.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            az3 az3Var = this.E;
            if (y < az3Var.D0() - gm.L(6.0f)) {
                az3Var.dismiss();
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
            ((ry3) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                break;
            }
            ((ry3) arrayList2.get(i)).f();
            i++;
        }
        arrayList.clear();
        gn.release(this, this.E.l1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }
}
