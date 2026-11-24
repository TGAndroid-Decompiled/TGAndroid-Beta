package defpackage;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class t66 extends LinearLayout {
    public final ArrayList a;
    public RenderNode b;
    public float c;
    public p65 d;
    public Runnable e;
    public int f;
    public final tp5 h;

    public t66(LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = new ArrayList();
        this.h = new tp5(this, (byte) 13);
        setOrientation(1);
        setGravity(80);
        setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        setClipToPadding(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(320L);
        s33 s33Var = s33.h;
        layoutTransition.setInterpolator(4, s33Var);
        layoutTransition.setInterpolator(0, s33Var);
        layoutTransition.setInterpolator(1, s33Var);
        Property property = View.ALPHA;
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.6f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.6f, 1.0f)));
        layoutTransition.setInterpolator(2, s33Var);
        layoutTransition.setAnimator(3, ObjectAnimator.ofFloat((Object) null, property, 1.0f, 0.0f));
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(1, 0L);
        setLayoutTransition(layoutTransition);
    }

    public final void a(int i, long j, long j2, String str, boolean z) {
        s66 s66Var;
        String str2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s66Var = (s66) obj;
                if (s66Var.a == j2) {
                    break;
                }
            } else {
                s66Var = null;
                break;
            }
        }
        if (s66Var == null) {
            if (!str.trim().isEmpty()) {
                s66Var = new s66(this, getContext(), j2);
                TLObject Z1 = na7.q1(i).Z1(j);
                if (Z1 instanceof TLRPC.User) {
                    str2 = l7c.k((TLRPC.User) Z1, true);
                } else if (Z1 instanceof TLRPC.Chat) {
                    str2 = ((TLRPC.Chat) Z1).title;
                } else {
                    str2 = "";
                }
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.o(Z1);
                s66Var.d.U(Z1, pb0Var, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                s66Var.x = spannableStringBuilder.length();
                s66Var.e.setText(spannableStringBuilder, TextView.BufferType.EDITABLE);
                arrayList.add(s66Var);
                addView(s66Var, nme.k(0.0f, 6.0f, 0.0f, 0.0f, -1, -2));
                while (arrayList.size() > 3) {
                    View view = (s66) arrayList.get(0);
                    arrayList.remove(view);
                    removeView(view);
                }
            } else {
                return;
            }
        }
        s66Var.f.e(s66Var.x, -1, str.trim());
        s66Var.b = z;
        s66Var.c = SystemClock.uptimeMillis();
        Runnable runnable = this.h;
        removeCallbacks(runnable);
        if (!arrayList.isEmpty()) {
            postDelayed(runnable, 500L);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                height = Math.min(height, childAt.getY() - gl.L(6.0f));
            }
        }
        int max = Math.max(0, Math.round(getHeight() - height));
        if (max != this.f) {
            this.f = max;
            Runnable runnable = this.e;
            if (runnable != null) {
                post(runnable);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.h);
    }

    public void setOnContentHeightChanged(Runnable runnable) {
        this.e = runnable;
    }
}
