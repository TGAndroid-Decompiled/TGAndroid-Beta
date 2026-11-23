package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;
public abstract class n7 extends FrameLayout implements m2 {
    public final m7 f15117a;
    public final FrameLayout f15118b;
    public final TextView f15119c;
    public final FrameLayout d;
    public final TextView f15120e;
    public final FrameLayout f15121f;
    public final TextView h;
    public float f15122n;
    public float f15123r;
    public int f15124s;
    public ValueAnimator f15125w;
    public y10 f15126x;
    public y10 f15127y;

    public n7(Context context) {
        super(context);
        m7 m7Var = new m7(this, context);
        this.f15117a = m7Var;
        m7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15118b = frameLayout;
        TextView textView = new TextView(context);
        this.f15119c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131744388, null));
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout, c8.ma.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final n7 f15009b;

            {
                this.f15009b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15009b.b(-1);
                        return;
                    case 1:
                        this.f15009b.b(0);
                        return;
                    default:
                        this.f15009b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f15120e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(hd.N0(2131744342, null));
        frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout2, c8.ma.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final n7 f15009b;

            {
                this.f15009b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15009b.b(-1);
                        return;
                    case 1:
                        this.f15009b.b(0);
                        return;
                    default:
                        this.f15009b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15121f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(hd.N0(2131744207, null));
        frameLayout3.addView(textView3, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout3, c8.ma.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final n7 f15009b;

            {
                this.f15009b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15009b.b(-1);
                        return;
                    case 1:
                        this.f15009b.b(0);
                        return;
                    default:
                        this.f15009b.b(1);
                        return;
                }
            }
        });
        c8.ra.a(frameLayout3);
        addView(m7Var, c8.ma.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f15124s == i7) {
            return;
        }
        this.f15124s = i7;
        ValueAnimator valueAnimator = this.f15125w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15123r, i7);
        this.f15125w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.f15125w.setDuration(320L);
        this.f15125w.setInterpolator(nr.h);
        this.f15125w.start();
    }

    public final void b(int i7) {
        if (this.f15124s != i7) {
            a(i7);
            y10 y10Var = this.f15126x;
            if (y10Var != null) {
                y10Var.a(Integer.valueOf(i7));
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
        this.f15117a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f15122n = f10;
        this.f15119c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f15120e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(y10 y10Var) {
        this.f15126x = y10Var;
    }

    public void setOnSwitchingModeListener(y10 y10Var) {
        this.f15127y = y10Var;
    }
}
