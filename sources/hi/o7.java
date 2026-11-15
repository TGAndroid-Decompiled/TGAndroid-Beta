package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
public abstract class o7 extends FrameLayout implements m2 {
    public final n7 f14812a;
    public final FrameLayout f14813b;
    public final TextView f14814c;
    public final FrameLayout d;
    public final TextView f14815e;
    public final FrameLayout f14816f;
    public final TextView h;
    public float f14817n;
    public float f14818r;
    public int f14819s;
    public ValueAnimator f14820w;
    public z10 f14821x;
    public z10 f14822y;

    public o7(Context context) {
        super(context);
        n7 n7Var = new n7(this, context);
        this.f14812a = n7Var;
        n7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14813b = frameLayout;
        TextView textView = new TextView(context);
        this.f14814c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131744631, null));
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout, c8.ja.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f14706b;

            {
                this.f14706b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14706b.b(-1);
                        return;
                    case 1:
                        this.f14706b.b(0);
                        return;
                    default:
                        this.f14706b.b(1);
                        return;
                }
            }
        });
        c8.na.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f14815e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131744585, null));
        frameLayout2.addView(textView2, c8.ja.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout2, c8.ja.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f14706b;

            {
                this.f14706b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14706b.b(-1);
                        return;
                    case 1:
                        this.f14706b.b(0);
                        return;
                    default:
                        this.f14706b.b(1);
                        return;
                }
            }
        });
        c8.na.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f14816f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(hd.M0(2131744450, null));
        frameLayout3.addView(textView3, c8.ja.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout3, c8.ja.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f14706b;

            {
                this.f14706b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14706b.b(-1);
                        return;
                    case 1:
                        this.f14706b.b(0);
                        return;
                    default:
                        this.f14706b.b(1);
                        return;
                }
            }
        });
        c8.na.a(frameLayout3);
        addView(n7Var, c8.ja.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f14819s == i7) {
            return;
        }
        this.f14819s = i7;
        ValueAnimator valueAnimator = this.f14820w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f14818r, i7);
        this.f14820w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.f14820w.setDuration(320L);
        this.f14820w.setInterpolator(er.h);
        this.f14820w.start();
    }

    public final void b(int i7) {
        if (this.f14819s != i7) {
            a(i7);
            z10 z10Var = this.f14821x;
            if (z10Var != null) {
                z10Var.a(Integer.valueOf(i7));
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
        this.f14812a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f14817n = f10;
        this.f14814c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f14815e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(z10 z10Var) {
        this.f14821x = z10Var;
    }

    public void setOnSwitchingModeListener(z10 z10Var) {
        this.f14822y = z10Var;
    }
}
