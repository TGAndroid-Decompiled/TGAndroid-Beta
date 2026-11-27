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
public final class x86 extends LinearLayout {
    public final ArrayList a;
    public RenderNode b;
    public float c;
    public r85 d;
    public Runnable e;
    public int f;
    public final ea5 h;

    public x86(LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = new ArrayList();
        this.h = new ea5(this, (byte) 28);
        setOrientation(1);
        setGravity(80);
        setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
        setClipToPadding(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(320L);
        k43 k43Var = k43.h;
        layoutTransition.setInterpolator(4, k43Var);
        layoutTransition.setInterpolator(0, k43Var);
        layoutTransition.setInterpolator(1, k43Var);
        Property property = View.ALPHA;
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.6f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.6f, 1.0f)));
        layoutTransition.setInterpolator(2, k43Var);
        layoutTransition.setAnimator(3, ObjectAnimator.ofFloat((Object) null, property, 1.0f, 0.0f));
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(1, 0L);
        setLayoutTransition(layoutTransition);
    }

    public final void a(int i, long j, long j2, String str, boolean z) {
        w86 w86Var;
        String str2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                w86Var = (w86) obj;
                if (w86Var.a == j2) {
                    break;
                }
            } else {
                w86Var = null;
                break;
            }
        }
        if (w86Var == null) {
            if (!str.trim().isEmpty()) {
                w86Var = new w86(this, getContext(), j2);
                TLObject b2 = uc7.s1(i).b2(j);
                if (b2 instanceof TLRPC.User) {
                    str2 = lbc.k((TLRPC.User) b2, true);
                } else if (b2 instanceof TLRPC.Chat) {
                    str2 = ((TLRPC.Chat) b2).title;
                } else {
                    str2 = "";
                }
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.o(b2);
                w86Var.d.U(b2, rb0Var, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                w86Var.x = spannableStringBuilder.length();
                w86Var.e.setText(spannableStringBuilder, TextView.BufferType.EDITABLE);
                arrayList.add(w86Var);
                addView(w86Var, tre.k(0.0f, 6.0f, 0.0f, 0.0f, -1, -2));
                while (arrayList.size() > 3) {
                    View view = (w86) arrayList.get(0);
                    arrayList.remove(view);
                    removeView(view);
                }
            } else {
                return;
            }
        }
        w86Var.f.e(w86Var.x, -1, str.trim());
        w86Var.b = z;
        w86Var.c = SystemClock.uptimeMillis();
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
                height = Math.min(height, childAt.getY() - hl.L(6.0f));
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
