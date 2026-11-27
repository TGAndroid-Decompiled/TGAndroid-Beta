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
public final class dy3 extends FrameLayout {
    public final ly3 E;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final mm s;
    public ImageReceiver w;
    public boolean x;
    public final mm y;

    public dy3(ly3 ly3Var, Context context) {
        super(context);
        this.E = ly3Var;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        k43 k43Var = k43.h;
        this.s = new mm(this, 0L, 350L, k43Var);
        this.y = new mm(this, 0L, 320L, k43Var);
    }

    public final void a() {
        hm[] hmVarArr;
        ly3 ly3Var = this.E;
        iw iwVar = ly3Var.q1;
        if (iwVar == null) {
            hmVarArr = new hm[0];
        } else {
            hm[] hmVarArr2 = new hm[iwVar.getChildCount()];
            for (int i = 0; i < iwVar.getChildCount(); i++) {
                View childAt = iwVar.getChildAt(i);
                if (childAt instanceof ey3) {
                    hmVarArr2[i] = ((ey3) childAt).c;
                }
            }
            hmVarArr = hmVarArr2;
        }
        ly3Var.l1 = hm.update(3, this, hmVarArr, ly3Var.l1);
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
        cy3 cy3Var;
        float f3;
        float f4;
        hm hmVar;
        PorterDuffColorFilter porterDuffColorFilter;
        Canvas canvas2 = canvas;
        ly3 ly3Var = this.E;
        di2 di2Var = ly3Var.z1;
        iw iwVar = ly3Var.q1;
        if (!this.d) {
            return;
        }
        int v0 = aob.v0(aob.h5, ly3Var.J0);
        Paint paint = this.a;
        paint.setColor(v0);
        aob.m(paint);
        Path path = this.b;
        path.reset();
        float E0 = ly3Var.E0();
        if (E0 <= ly3Var.b.getPaddingTop()) {
            z = true;
        } else {
            z = false;
        }
        float d = this.s.d(z);
        float R1 = hl.R1(E0, 0.0f, d);
        if (this.w != null) {
            float L = hl.L(140.0f);
            f = 20.0f;
            float L2 = hl.L(20.0f);
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
        float L3 = hl.L((1.0f - d) * 14.0f);
        RectF rectF = hl.P;
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
            ly3Var.K0(z2);
        }
        aob.s0.setColor(aob.v0(aob.zj, ly3Var.J0));
        aob.s0.setAlpha((int) (ete.a(R1 / hl.L(f), 0.0f, 1.0f) * aob.s0.getAlpha()));
        int L4 = hl.L(36.0f);
        float L5 = R1 + hl.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, hl.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, hl.L(f2), hl.L(f2), aob.s0);
        View view = ly3Var.s1;
        if (!iwVar.canScrollVertically(1) && ly3Var.v1.getVisibility() != 0) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (iwVar != null) {
            canvas2.save();
            canvas2.translate(iwVar.getLeft(), iwVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, iwVar.getWidth(), iwVar.getHeight());
            float f7 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, iwVar.getWidth(), iwVar.getHeight(), (int) (iwVar.getAlpha() * 255.0f), 31);
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
            while (i4 < iwVar.getChildCount()) {
                View childAt = iwVar.getChildAt(i4);
                if (childAt instanceof ey3) {
                    ey3 ey3Var = (ey3) childAt;
                    if (ey3Var.isPressed()) {
                        float f8 = ey3Var.e;
                        if (f8 != f6) {
                            ey3Var.e = Utilities.i(f8 + 0.16f, f6, 0.0f);
                            ey3Var.invalidate();
                        }
                    }
                    if (ly3Var.l1 == null || (hmVar = ey3Var.c) == null) {
                        f3 = f6;
                    } else {
                        f3 = f6;
                        wl wlVar = (wl) ly3Var.l1.get(hmVar.getDocumentId());
                        if (wlVar != null) {
                            int v02 = aob.v0(aob.G6, ly3Var.J0);
                            if (v02 == ly3Var.O1 && (porterDuffColorFilter = ly3Var.N1) != null) {
                                f4 = f7;
                            } else {
                                ly3Var.O1 = v02;
                                f4 = f7;
                                porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                                ly3Var.N1 = porterDuffColorFilter;
                            }
                            wlVar.setColorFilter(porterDuffColorFilter);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) qd4.l(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(ey3Var);
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
                iwVar.getClass();
                int S = RecyclerView.S(view2);
                long j = currentTimeMillis;
                int i6 = 0;
                while (true) {
                    if (i6 < arrayList5.size()) {
                        if (((cy3) arrayList5.get(i6)).N == S) {
                            cy3Var = (cy3) arrayList5.get(i6);
                            arrayList5.remove(i6);
                            break;
                        }
                        i6++;
                    } else {
                        cy3Var = null;
                        break;
                    }
                }
                if (cy3Var == null) {
                    if (!arrayList2.isEmpty()) {
                        cy3Var = (cy3) qd4.l(1, arrayList2);
                    } else {
                        cy3Var = new cy3(this);
                        cy3Var.l(7);
                    }
                    cy3Var.N = S;
                    cy3Var.e();
                }
                arrayList6.add(cy3Var);
                cy3Var.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                cy3 cy3Var2 = cy3Var;
                currentTimeMillis = j;
                cy3Var2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i5++;
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((cy3) arrayList5.get(i7));
                    ((cy3) arrayList5.get(i7)).O = null;
                    ((cy3) arrayList5.get(i7)).k();
                } else {
                    ((cy3) arrayList5.get(i7)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (iwVar.getAlpha() < f9) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = hl.L(16.0f);
                di2Var.setAlpha((int) ((f9 - iwVar.getAlpha()) * f10));
                di2Var.setBounds(width - L6, height - L6, width + L6, height + L6);
                di2Var.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            ly3 ly3Var = this.E;
            if (y < ly3Var.E0() - hl.L(6.0f)) {
                ly3Var.dismiss();
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
            ((cy3) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                break;
            }
            ((cy3) arrayList2.get(i)).f();
            i++;
        }
        arrayList.clear();
        hm.release(this, this.E.l1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }
}
