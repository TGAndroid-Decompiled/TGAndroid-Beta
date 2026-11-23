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
public abstract class o7 extends FrameLayout implements m2 {
    public final n7 f15139a;
    public final FrameLayout f15140b;
    public final TextView f15141c;
    public final FrameLayout d;
    public final TextView f15142e;
    public final FrameLayout f15143f;
    public final TextView h;
    public float f15144n;
    public float f15145r;
    public int f15146s;
    public ValueAnimator f15147w;
    public y10 f15148x;
    public y10 f15149y;

    public o7(Context context) {
        super(context);
        n7 n7Var = new n7(this, context);
        this.f15139a = n7Var;
        n7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15140b = frameLayout;
        TextView textView = new TextView(context);
        this.f15141c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131744390, null));
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout, c8.na.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f15019b;

            {
                this.f15019b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15019b.b(-1);
                        return;
                    case 1:
                        this.f15019b.b(0);
                        return;
                    default:
                        this.f15019b.b(1);
                        return;
                }
            }
        });
        c8.sa.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f15142e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(hd.N0(2131744344, null));
        frameLayout2.addView(textView2, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout2, c8.na.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f15019b;

            {
                this.f15019b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15019b.b(-1);
                        return;
                    case 1:
                        this.f15019b.b(0);
                        return;
                    default:
                        this.f15019b.b(1);
                        return;
                }
            }
        });
        c8.sa.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15143f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(hd.N0(2131744209, null));
        frameLayout3.addView(textView3, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout3, c8.na.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f15019b;

            {
                this.f15019b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15019b.b(-1);
                        return;
                    case 1:
                        this.f15019b.b(0);
                        return;
                    default:
                        this.f15019b.b(1);
                        return;
                }
            }
        });
        c8.sa.a(frameLayout3);
        addView(n7Var, c8.na.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f15146s == i7) {
            return;
        }
        this.f15146s = i7;
        ValueAnimator valueAnimator = this.f15147w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15145r, i7);
        this.f15147w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.f15147w.setDuration(320L);
        this.f15147w.setInterpolator(nr.h);
        this.f15147w.start();
    }

    public final void b(int i7) {
        if (this.f15146s != i7) {
            a(i7);
            y10 y10Var = this.f15148x;
            if (y10Var != null) {
                y10Var.a(Integer.valueOf(i7));
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
        this.f15139a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f15144n = f10;
        this.f15141c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f15142e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(y10 y10Var) {
        this.f15148x = y10Var;
    }

    public void setOnSwitchingModeListener(y10 y10Var) {
        this.f15149y = y10Var;
    }
}
