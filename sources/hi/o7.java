package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lr;
public abstract class o7 extends FrameLayout implements n2 {
    public final n7 f15184a;
    public final FrameLayout f15185b;
    public final TextView f15186c;
    public final FrameLayout d;
    public final TextView f15187e;
    public final FrameLayout f15188f;
    public final TextView h;
    public float f15189n;
    public float f15190r;
    public int f15191s;
    public ValueAnimator f15192w;
    public x10 f15193x;
    public x10 f15194y;

    public o7(Context context) {
        super(context);
        n7 n7Var = new n7(this, context);
        this.f15184a = n7Var;
        n7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15185b = frameLayout;
        TextView textView = new TextView(context);
        this.f15186c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(gd.M0(2131744396, null));
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout, c8.ma.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f15035b;

            {
                this.f15035b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15035b.b(-1);
                        return;
                    case 1:
                        this.f15035b.b(0);
                        return;
                    default:
                        this.f15035b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f15187e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(gd.M0(2131744350, null));
        frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout2, c8.ma.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f15035b;

            {
                this.f15035b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15035b.b(-1);
                        return;
                    case 1:
                        this.f15035b.b(0);
                        return;
                    default:
                        this.f15035b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15188f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(gd.M0(2131744215, null));
        frameLayout3.addView(textView3, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout3, c8.ma.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f15035b;

            {
                this.f15035b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15035b.b(-1);
                        return;
                    case 1:
                        this.f15035b.b(0);
                        return;
                    default:
                        this.f15035b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout3);
        addView(n7Var, c8.ma.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f15191s == i7) {
            return;
        }
        this.f15191s = i7;
        ValueAnimator valueAnimator = this.f15192w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15190r, i7);
        this.f15192w = ofFloat;
        ofFloat.addUpdateListener(new k3(this, 5));
        this.f15192w.setDuration(320L);
        this.f15192w.setInterpolator(lr.h);
        this.f15192w.start();
    }

    public final void b(int i7) {
        if (this.f15191s != i7) {
            a(i7);
            x10 x10Var = this.f15193x;
            if (x10Var != null) {
                x10Var.a(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((n9) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f15184a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f15189n = f10;
        this.f15186c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f15187e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(x10 x10Var) {
        this.f15193x = x10Var;
    }

    public void setOnSwitchingModeListener(x10 x10Var) {
        this.f15194y = x10Var;
    }
}
