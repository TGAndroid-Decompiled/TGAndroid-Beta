package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;
public abstract class n7 extends FrameLayout implements m2 {
    public final m7 f15114a;
    public final FrameLayout f15115b;
    public final TextView f15116c;
    public final FrameLayout d;
    public final TextView f15117e;
    public final FrameLayout f15118f;
    public final TextView h;
    public float f15119n;
    public float f15120r;
    public int f15121s;
    public ValueAnimator f15122w;
    public x10 f15123x;
    public x10 f15124y;

    public n7(Context context) {
        super(context);
        m7 m7Var = new m7(this, context);
        this.f15114a = m7Var;
        m7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15115b = frameLayout;
        TextView textView = new TextView(context);
        this.f15116c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131744390, null));
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout, c8.ma.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final n7 f15006b;

            {
                this.f15006b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15006b.b(-1);
                        return;
                    case 1:
                        this.f15006b.b(0);
                        return;
                    default:
                        this.f15006b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f15117e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131744344, null));
        frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout2, c8.ma.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final n7 f15006b;

            {
                this.f15006b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15006b.b(-1);
                        return;
                    case 1:
                        this.f15006b.b(0);
                        return;
                    default:
                        this.f15006b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15118f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(gd.N0(2131744209, null));
        frameLayout3.addView(textView3, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout3, c8.ma.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final n7 f15006b;

            {
                this.f15006b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15006b.b(-1);
                        return;
                    case 1:
                        this.f15006b.b(0);
                        return;
                    default:
                        this.f15006b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout3);
        addView(m7Var, c8.ma.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f15121s == i7) {
            return;
        }
        this.f15121s = i7;
        ValueAnimator valueAnimator = this.f15122w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15120r, i7);
        this.f15122w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.f15122w.setDuration(320L);
        this.f15122w.setInterpolator(nr.h);
        this.f15122w.start();
    }

    public final void b(int i7) {
        if (this.f15121s != i7) {
            a(i7);
            x10 x10Var = this.f15123x;
            if (x10Var != null) {
                x10Var.a(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((m9) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f15114a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f15119n = f10;
        this.f15116c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f15117e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(x10 x10Var) {
        this.f15123x = x10Var;
    }

    public void setOnSwitchingModeListener(x10 x10Var) {
        this.f15124y = x10Var;
    }
}
