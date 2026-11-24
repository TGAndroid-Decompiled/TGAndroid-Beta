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
public final class t86 extends LinearLayout {
    public final ArrayList a;
    public RenderNode b;
    public float c;
    public n85 d;
    public Runnable e;
    public int f;
    public final kg5 h;

    public t86(LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = new ArrayList();
        this.h = new kg5(this, (byte) 20);
        setOrientation(1);
        setGravity(80);
        setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        setClipToPadding(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(320L);
        d53 d53Var = d53.h;
        layoutTransition.setInterpolator(4, d53Var);
        layoutTransition.setInterpolator(0, d53Var);
        layoutTransition.setInterpolator(1, d53Var);
        Property property = View.ALPHA;
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.6f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.6f, 1.0f)));
        layoutTransition.setInterpolator(2, d53Var);
        layoutTransition.setAnimator(3, ObjectAnimator.ofFloat((Object) null, property, 1.0f, 0.0f));
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(1, 0L);
        setLayoutTransition(layoutTransition);
    }

    public final void a(int i, long j, long j2, String str, boolean z) {
        s86 s86Var;
        String str2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s86Var = (s86) obj;
                if (s86Var.a == j2) {
                    break;
                }
            } else {
                s86Var = null;
                break;
            }
        }
        if (s86Var == null) {
            if (!str.trim().isEmpty()) {
                s86Var = new s86(this, getContext(), j2);
                TLObject a2 = oc7.r1(i).a2(j);
                if (a2 instanceof TLRPC.User) {
                    str2 = m9c.k((TLRPC.User) a2, true);
                } else if (a2 instanceof TLRPC.Chat) {
                    str2 = ((TLRPC.Chat) a2).title;
                } else {
                    str2 = "";
                }
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.o(a2);
                s86Var.d.U(a2, pc0Var, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                s86Var.x = spannableStringBuilder.length();
                s86Var.e.setText(spannableStringBuilder, TextView.BufferType.EDITABLE);
                arrayList.add(s86Var);
                addView(s86Var, qoe.k(0.0f, 6.0f, 0.0f, 0.0f, -1, -2));
                while (arrayList.size() > 3) {
                    View view = (s86) arrayList.get(0);
                    arrayList.remove(view);
                    removeView(view);
                }
            } else {
                return;
            }
        }
        s86Var.f.e(s86Var.x, -1, str.trim());
        s86Var.b = z;
        s86Var.c = SystemClock.uptimeMillis();
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
                height = Math.min(height, childAt.getY() - gm.L(6.0f));
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
