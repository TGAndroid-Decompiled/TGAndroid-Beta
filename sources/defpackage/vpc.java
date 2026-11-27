package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class vpc extends vic {
    public boolean W;
    public final upc a0;
    public final ArrayList b0;
    public final b c0;
    public final int d0;
    public final Rect e0;
    public final View[] f0;

    public vpc(Context context, vnb vnbVar, final ArrayList arrayList, final b bVar, int i, Rect rect, View[] viewArr) {
        super(context, vnbVar);
        this.b0 = arrayList;
        this.c0 = bVar;
        this.d0 = i;
        this.e0 = rect;
        this.f0 = viewArr;
        this.a0 = new fn7() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                int i4;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = bVar.c;
                c[] cVarArr = c.T;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    c.I(identityHashMap, hashMap, i5, (TL_wallet.walletTransaction) arrayList2.get(i5), true);
                }
                int size = arrayList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList3.get(i6);
                    i6++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    if (treeSet != null && !treeSet.isEmpty()) {
                        i4 = ((Integer) treeSet.first()).intValue();
                    } else {
                        i4 = -1;
                    }
                    ArrayList v0 = c.v0(wallettransaction);
                    int size2 = v0.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = v0.get(i7);
                        i7++;
                        TreeSet treeSet2 = (TreeSet) hashMap.get((String) obj2);
                        if (treeSet2 != null && !treeSet2.isEmpty()) {
                            int intValue = ((Integer) treeSet2.first()).intValue();
                            if (i4 < 0) {
                                i4 = intValue;
                            } else {
                                i4 = Math.min(i4, intValue);
                            }
                        }
                    }
                    if (i4 >= 0) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList2.get(i4);
                        if (wallettransaction2 != wallettransaction) {
                            c.I(identityHashMap, hashMap, i4, wallettransaction2, false);
                            arrayList2.set(i4, wallettransaction);
                            c.I(identityHashMap, hashMap, i4, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        c.I(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override
    public final void G(View view, float f) {
        float measuredWidth;
        view.setTranslationX(f);
        if (getMeasuredWidth() > 0) {
            float i = Utilities.i(f / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f - ((2.0f * i) * this.e0.left));
            if (i > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * i));
            view.setRotationY(10.0f * i);
            yrc yrcVar = (yrc) view.findViewWithTag(yrc.class);
            if (yrcVar != null) {
                boolean z = this.W;
                long nanoTime = System.nanoTime();
                if (!yrcVar.T) {
                    yrcVar.T = true;
                    yrcVar.O = i;
                    yrcVar.S = nanoTime;
                    return;
                }
                float f2 = i - yrcVar.O;
                yrcVar.O = i;
                if (!z) {
                    yrcVar.R = 0.0f;
                    yrcVar.S = nanoTime;
                } else if (f2 != 0.0f) {
                    float w = qu6.w((float) (nanoTime - yrcVar.S), 1.0E9f, 0.033333335f, 0.008333334f);
                    yrcVar.S = nanoTime;
                    float f3 = f2 / w;
                    float L = (-(f3 - yrcVar.R)) * hl.L(140.0f);
                    yrcVar.R = f3;
                    if (yrcVar.P == null) {
                        vpa vpaVar = new vpa(yrcVar, vpa.o);
                        yrcVar.P = vpaVar;
                        wpa wpaVar = new wpa(0.0f);
                        wpaVar.a(0.32f);
                        wpaVar.b(300.0f);
                        vpaVar.m = wpaVar;
                        yrcVar.P.b(new trc(yrcVar, (byte) 1));
                    }
                    float f4 = xnb.f(yrcVar.Q, L, hl.L(1600.0f), -hl.L(1600.0f));
                    yrcVar.Q = f4;
                    vpa vpaVar2 = yrcVar.P;
                    vpaVar2.a = f4;
                    vpaVar2.c(0.0f);
                }
                if (f2 != 0.0f) {
                    yrcVar.V = Math.max(-720.0f, Math.min(720.0f, yrcVar.V - (f2 * 300.0f)));
                    if (!yrcVar.a0 && yrcVar.n) {
                        yrcVar.a0 = true;
                        yrcVar.W = 0L;
                        Choreographer.getInstance().postFrameCallback(yrcVar.b0);
                    }
                }
            }
        }
    }

    public final void M() {
        if (this.b >= this.b0.size() - 2) {
            b bVar = this.c0;
            if (!bVar.k && !bVar.h) {
                bVar.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.e0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() << 1);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.W = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.W = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.d0).b(this.a0, jn7.e4);
        M();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.d0).n(this.a0, jn7.e4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i, 0);
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i, 0);
                measuredHeight = hl.U1(Utilities.i(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f), measuredHeight, view2.getMeasuredHeight());
            }
            i2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void t(View view, View view2, int i, int i2) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        M();
        v21 v21Var = v21.x;
        if (v21Var != null) {
            v21Var.c(0L, false);
        }
    }

    @Override
    public final void x(boolean z) {
        requestLayout();
        View view = this.f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
