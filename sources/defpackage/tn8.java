package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class tn8 extends cja implements ti7 {
    public final zw8 m0;
    public final ProfileActivity n0;
    public boolean o0;
    public final Paint p0;
    public boolean q0;
    public final ArrayList r0;
    public final fx7 s0;
    public final ProfileActivity t0;

    public tn8(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.t0 = profileActivity;
        this.n0 = profileActivity;
        this.m0 = new zw8((byte) 3);
        this.p0 = new Paint();
        this.r0 = new ArrayList();
        this.s0 = new fx7((byte) 5);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        a aVar;
        boolean z;
        ProfileActivity profileActivity = this.t0;
        wm8 wm8Var = profileActivity.y0;
        Paint paint = profileActivity.r2;
        Paint paint2 = profileActivity.z0;
        float f2 = 0.0f;
        int i = (profileActivity.G5 > 0.0f ? 1 : (profileActivity.G5 == 0.0f ? 0 : -1));
        Paint paint3 = this.p0;
        if (i > 0) {
            paint3.setColor(bkb.v0(bkb.Z6, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), profileActivity.b2(), paint3);
        }
        int i2 = bkb.Z6;
        paint.setColor(bkb.v0(i2, profileActivity.A0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(bkb.v0(i2, profileActivity.A0));
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.r0;
            arrayList.clear();
            boolean z2 = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = profileActivity.a.getChildAt(i3);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i3));
                } else {
                    z2 = true;
                }
            }
            Collections.sort(arrayList, this.s0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z2) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z3 = false;
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList.get(i4);
                if (view.getBackground() != null) {
                    z = true;
                } else {
                    z = false;
                }
                profileActivity.a.getY();
                view.getY();
                if (z3 == z) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z3 = z;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (wm8Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.y0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.x0.getLeft(), profileActivity.x0.getTop());
            View view2 = profileActivity.x0;
            aVar = ((d) profileActivity).actionBar;
            if (view2 == aVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((wm8Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.x0.getMeasuredWidth(), profileActivity.x0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        sb sbVar = profileActivity.U;
        if (sbVar != null && sbVar.getVisibility() == 0) {
            int i5 = (profileActivity.U.getAlpha() > 1.0f ? 1 : (profileActivity.U.getAlpha() == 1.0f ? 0 : -1));
            sb sbVar2 = profileActivity.U;
            if (i5 != 0) {
                if (sbVar2.getAlpha() != 0.0f) {
                    canvas2.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                    profileActivity.U.draw(canvas);
                    canvas.restore();
                }
            } else {
                sbVar2.draw(canvas);
            }
        }
        if (!profileActivity.J0) {
            canvas.save();
            om8 om8Var = profileActivity.a;
            if (om8Var != null) {
                f = om8Var.getTranslationX();
            } else {
                f = 0.0f;
            }
            canvas.translate(f, 0.0f);
            int v0 = bkb.v0(bkb.c6, profileActivity.A0);
            int i6 = profileActivity.P6;
            om8 om8Var2 = profileActivity.a;
            if (om8Var2 != null) {
                f2 = om8Var2.getAlpha();
            }
            gl.O(canvas, this, v0, i6, f2);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iea[] ieaVarArr;
        iea ieaVar;
        ProfileActivity profileActivity = this.t0;
        cn8 cn8Var = profileActivity.Z4;
        if (cn8Var.n) {
            return cn8Var.g(motionEvent);
        }
        vn8 vn8Var = profileActivity.O;
        if (vn8Var != null && (ieaVar = (ieaVarArr = vn8Var.n0)[0]) != null && ieaVar.h.getFastScroll() != null && ieaVarArr[0].h.getFastScroll().n) {
            vn8 vn8Var2 = profileActivity.O;
            if (vn8Var2.d) {
                return vn8Var2.I(motionEvent);
            }
        }
        vn8 vn8Var3 = profileActivity.O;
        if (vn8Var3 != null && vn8Var3.A(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        ProfileActivity profileActivity = this.t0;
        if (profileActivity.Z4.n) {
            if (view != profileActivity.Z) {
                aVar = ((d) profileActivity).actionBar;
                if (view == aVar || view == profileActivity.s) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void k(int i, View view) {
        this.m0.b = 0;
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ProfileActivity profileActivity = this.n0;
        try {
            if (view == profileActivity.a && profileActivity.Q) {
                o39 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
            gl.d3(new sn8(this, (byte) 1));
        }
    }

    @Override
    public final boolean n(View view, View view2, int i, int i2) {
        if (this.n0.N4 != -1 && i == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.t0;
        profileActivity.H0 = true;
        tl tlVar = profileActivity.G;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = profileActivity.H;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.t0;
        profileActivity.H0 = false;
        tl tlVar = profileActivity.G;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = profileActivity.H;
        if (tlVar2 != null) {
            tlVar2.b();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProfileActivity profileActivity = this.t0;
        profileActivity.r6 = -1;
        profileActivity.X4 = false;
        profileActivity.Y4 = false;
        profileActivity.F1();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn8.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ProfileActivity profileActivity = this.t0;
        tk0.c(profileActivity.Q6, profileActivity.fragmentView);
        profileActivity.R6.d();
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        this.m0.b = i;
    }

    @Override
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        a aVar;
        int i4;
        o39 currentListView;
        int K0;
        int max;
        ProfileActivity profileActivity = this.n0;
        if (view == profileActivity.a) {
            int i5 = -1;
            if (profileActivity.N4 != -1 && profileActivity.Q) {
                aVar = ((d) profileActivity).actionBar;
                boolean z = aVar.o0;
                int top = profileActivity.O.getTop();
                boolean z2 = false;
                if (i2 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (K0 = ((t26) currentListView.getLayoutManager()).K0()) != -1) {
                        s49 K = currentListView.K(K0);
                        if (K != null) {
                            i5 = K.a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i5 != paddingTop || K0 != 0) {
                            if (K0 != 0) {
                                max = i2;
                            } else {
                                max = Math.max(i2, i5 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i2);
                            z2 = true;
                        }
                    }
                    if (z) {
                        if (!z2 && top < 0) {
                            iArr[1] = i2 - Math.max(top, i2);
                        } else {
                            iArr[1] = i2;
                        }
                    }
                } else if (z) {
                    o39 currentListView2 = profileActivity.O.getCurrentListView();
                    iArr[1] = i2;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 != null && (i4 = iArr[1]) > 0) {
                        currentListView2.scrollBy(0, i4);
                    }
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
