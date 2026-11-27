package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class p0a extends d79 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final n1a m3;

    public p0a(n1a n1aVar, Context context) {
        super(context, null);
        this.m3 = n1aVar;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(hl.L(4.0f));
        yob.l(this, 20, aob.i6, this.o2);
    }

    public static void A1(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((o0a) arrayList.get(i)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean J0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0a.J0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        o0a o0aVar;
        int i;
        View view;
        int top;
        float interpolation;
        float f;
        float f2;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z2;
        float f3;
        boolean z3;
        float f4;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.k3 = false;
            int saveCount = canvas2.getSaveCount();
            n1a n1aVar = this.m3;
            int i2 = n1aVar.a0;
            int i3 = 14;
            if (i2 != 6 && i2 != 14 && i2 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    pt2 pt2Var = this.n2;
                    if (pt2Var != null) {
                        pt2Var.accept(canvas2);
                    }
                    this.C1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i4 = 0;
            while (true) {
                sparseArray = this.f3;
                int size = sparseArray.size();
                arrayList = this.g3;
                if (i4 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i4);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i4++;
            }
            sparseArray.clear();
            if (n1aVar.R1 > 0 && SystemClock.elapsedRealtime() - n1aVar.R1 < n1aVar.e() && n1aVar.O1 != null && n1aVar.P1 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.l3 != null) {
                int i5 = 0;
                boolean z4 = false;
                while (i5 < getChildCount()) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof w0a) {
                        w0a w0aVar = (w0a) childAt;
                        n1a n1aVar2 = w0aVar.W;
                        int i6 = n1aVar2.a0;
                        if (w0aVar.isPressed()) {
                            float f5 = w0aVar.O;
                            if (f5 != 1.0f && i6 != i3) {
                                w0aVar.O = Utilities.i(f5 + 0.16f, 1.0f, 0.0f);
                                w0aVar.invalidate();
                            }
                        }
                        int i7 = w0aVar.c;
                        if (n1aVar.y1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(w0aVar.getX(), w0aVar.getY());
                        if (w0aVar.x != null) {
                            yza collectionParticles = n1aVar.getCollectionParticles();
                            i = i5;
                            boolean z5 = z4;
                            collectionParticles.f(0, 0, w0aVar.getWidth(), w0aVar.getHeight());
                            if (!z5) {
                                collectionParticles.d();
                                z2 = true;
                            } else {
                                z2 = z5;
                            }
                            canvas2.save();
                            if (i7 % 6 == 2) {
                                f3 = -1.0f;
                                f4 = -1.0f;
                                z3 = z2;
                            } else {
                                f3 = 1.0f;
                                z3 = z2;
                                f4 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f4, f3, w0aVar.getWidth() / 2.0f, w0aVar.getHeight() / 2.0f);
                            canvas2.rotate((i7 % 4) * 90, w0aVar.getWidth() / 2.0f, w0aVar.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, w0aVar.x.intValue());
                            canvas2.restore();
                            z4 = z3;
                        } else {
                            i = i5;
                            view = childAt;
                        }
                        boolean z6 = w0aVar.M;
                        if ((z6 || w0aVar.N || w0aVar.T > 0.0f) && !w0aVar.b) {
                            if (z6 || w0aVar.N) {
                                float f6 = w0aVar.S;
                                if (f6 < 1.0f) {
                                    w0aVar.S = ((1000.0f / hl.r) / 240.0f) + f6;
                                    invalidate();
                                }
                            }
                            if (!w0aVar.M && !w0aVar.N) {
                                float f7 = w0aVar.S;
                                if (f7 > 0.0f) {
                                    w0aVar.S = f7 - ((1000.0f / hl.r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (w0aVar.M) {
                                interpolation = k43.h.getInterpolation(w0aVar.S);
                            } else {
                                interpolation = 1.0f - k43.h.getInterpolation(1.0f - w0aVar.S);
                            }
                            w0aVar.T = Utilities.i(interpolation, 1.0f, 0.0f);
                            if (i6 == 6) {
                                f = 1.5f;
                            } else {
                                f = 1.0f;
                            }
                            int L = hl.L(f);
                            if (i6 == 6) {
                                f2 = 6.0f;
                            } else {
                                f2 = 4.0f;
                            }
                            int L2 = hl.L(f2);
                            RectF rectF = hl.P;
                            rectF.set(0.0f, 0.0f, w0aVar.getMeasuredWidth(), w0aVar.getMeasuredHeight());
                            float f8 = L;
                            rectF.inset(f8, f8);
                            if (!w0aVar.a) {
                                Drawable drawable = w0aVar.F;
                                if (!(drawable instanceof wl) || !((wl) drawable).c()) {
                                    paint = n1aVar2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (w0aVar.getAlpha() * alpha * w0aVar.T));
                                    float f9 = L2;
                                    canvas2.drawRoundRect(rectF, f9, f9, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = n1aVar2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (w0aVar.getAlpha() * alpha2 * w0aVar.T));
                            float f92 = L2;
                            canvas2.drawRoundRect(rectF, f92, f92, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (w0aVar.getBackground() != null) {
                            w0aVar.getBackground().setBounds((int) w0aVar.getX(), (int) w0aVar.getY(), w0aVar.getWidth() + ((int) w0aVar.getX()), w0aVar.getHeight() + ((int) w0aVar.getY()));
                            w0aVar.getBackground().setAlpha((int) (w0aVar.getAlpha() * 255.0f));
                            w0aVar.getBackground().draw(canvas2);
                            w0aVar.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) qd4.l(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(w0aVar);
                        v0a v0aVar = w0aVar.K;
                        if (v0aVar != null && v0aVar.getVisibility() == 0 && w0aVar.K.getImageReceiver() == null && (imageReceiver2 = w0aVar.r) != null) {
                            w0aVar.K.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i = i5;
                        view = childAt;
                    }
                    boolean z7 = z4;
                    if (z && view != null && RecyclerView.S(view) == n1aVar.P1 - 1) {
                        float interpolation2 = k43.g.getInterpolation(ete.a(((float) (SystemClock.elapsedRealtime() - n1aVar.R1)) / 200.0f, 0.0f, 1.0f));
                        if (interpolation2 < 1.0f) {
                            float f10 = 1.0f - interpolation2;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (f10 * 255.0f), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f11 = (f10 * 0.5f) + 0.5f;
                            canvas2.scale(f11, f11, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            n1aVar.O1.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    i5 = i + 1;
                    z4 = z7;
                    i3 = 14;
                }
            }
            ArrayList arrayList6 = this.j3;
            arrayList6.clear();
            ArrayList arrayList7 = this.i3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i8 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.h3;
                if (i8 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i8);
                w0a w0aVar2 = (w0a) arrayList8.get(0);
                int S = RecyclerView.S(w0aVar2);
                int i9 = 0;
                while (true) {
                    if (i9 < arrayList6.size()) {
                        if (((o0a) arrayList6.get(i9)).N == S) {
                            o0aVar = (o0a) arrayList6.get(i9);
                            arrayList6.remove(i9);
                            break;
                        }
                        i9++;
                    } else {
                        o0aVar = null;
                        break;
                    }
                }
                if (o0aVar == null) {
                    if (!arrayList2.isEmpty()) {
                        o0aVar = (o0a) qd4.l(1, arrayList2);
                    } else {
                        o0aVar = new o0a(this);
                        o0aVar.l(7);
                    }
                    o0aVar.N = S;
                    o0aVar.e();
                }
                arrayList7.add(o0aVar);
                o0aVar.P = arrayList8;
                canvas2.save();
                canvas2.translate(w0aVar2.getLeft(), w0aVar2.getY());
                o0aVar.O = w0aVar2.getLeft();
                int measuredWidth = getMeasuredWidth() - (w0aVar2.getLeft() << 1);
                int measuredHeight = w0aVar2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    o0aVar.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i8++;
            }
            for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((o0a) arrayList6.get(i10));
                    ((o0a) arrayList6.get(i10)).P = null;
                    ((o0a) arrayList6.get(i10)).k();
                } else {
                    ((o0a) arrayList6.get(i10)).f();
                }
            }
            arrayList6.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2 instanceof w0a) {
                    w0a w0aVar3 = (w0a) childAt2;
                    v0a v0aVar2 = w0aVar3.K;
                    if (v0aVar2 != null && v0aVar2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((w0aVar3.getX() + w0aVar3.getMeasuredWidth()) - w0aVar3.K.getMeasuredWidth()), (int) ((w0aVar3.getY() + w0aVar3.getMeasuredHeight()) - w0aVar3.K.getMeasuredHeight()));
                        Drawable drawable2 = w0aVar3.F;
                        if (drawable2 instanceof wl) {
                            imageReceiver = ((wl) drawable2).k;
                        } else {
                            imageReceiver = w0aVar3.h;
                        }
                        v0a v0aVar3 = w0aVar3.K;
                        if (!v0aVar3.h) {
                            v0aVar3.setImageReceiver(imageReceiver);
                        }
                        w0aVar3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (w0aVar3.L != null) {
                        canvas2.save();
                        int L3 = hl.L(17.0f);
                        float f12 = L3;
                        canvas2.translate((int) ((w0aVar3.getX() + w0aVar3.getMeasuredWidth()) - f12), (int) ((w0aVar3.getY() + w0aVar3.getMeasuredHeight()) - f12));
                        w0aVar3.L.setBounds(0, 0, L3, L3);
                        w0aVar3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != n1aVar.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ri5.c;
            if (runnable != null) {
                runnable.run();
                ri5.c = null;
            }
        }
    }

    @Override
    public final void i1() {
        if (ri5.b(this)) {
            return;
        }
        super.i1();
    }

    @Override
    public final void invalidate() {
        if (ri5.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n1a n1aVar = this.m3;
        if (this == n1aVar.i0) {
            n1aVar.W0.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n1a n1aVar = this.m3;
        if (this == n1aVar.i0) {
            n1aVar.W0.K();
        }
        A1(this.h3);
        A1(this.i3);
        A1(this.j3);
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        invalidate();
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
