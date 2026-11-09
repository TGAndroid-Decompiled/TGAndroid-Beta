package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public abstract class p7 extends FrameLayout implements o2 {
    public final o7 f12598a;
    public final FrameLayout f12599b;
    public final TextView f12600c;
    public final FrameLayout d;
    public final TextView f12601e;
    public final FrameLayout f12602f;
    public final TextView h;
    public float f12603n;
    public float f12604r;
    public int f12605s;
    public ValueAnimator f12606w;
    public c20 f12607x;
    public c20 f12608y;

    public p7(Context context) {
        super(context);
        o7 o7Var = new o7(this, context);
        this.f12598a = o7Var;
        o7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12599b = frameLayout;
        TextView textView = new TextView(context);
        this.f12600c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(id.M0(2131744631, null));
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout, c8.ha.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f12484b;

            {
                this.f12484b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12484b.b(-1);
                        return;
                    case 1:
                        this.f12484b.b(0);
                        return;
                    default:
                        this.f12484b.b(1);
                        return;
                }
            }
        });
        c8.ka.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f12601e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(id.M0(2131744585, null));
        frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout2, c8.ha.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f12484b;

            {
                this.f12484b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12484b.b(-1);
                        return;
                    case 1:
                        this.f12484b.b(0);
                        return;
                    default:
                        this.f12484b.b(1);
                        return;
                }
            }
        });
        c8.ka.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f12602f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(id.M0(2131744450, null));
        frameLayout3.addView(textView3, c8.ha.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout3, c8.ha.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f12484b;

            {
                this.f12484b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12484b.b(-1);
                        return;
                    case 1:
                        this.f12484b.b(0);
                        return;
                    default:
                        this.f12484b.b(1);
                        return;
                }
            }
        });
        c8.ka.a(frameLayout3);
        addView(o7Var, c8.ha.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f12605s == i7) {
            return;
        }
        this.f12605s = i7;
        ValueAnimator valueAnimator = this.f12606w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12604r, i7);
        this.f12606w = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 4));
        this.f12606w.setDuration(320L);
        this.f12606w.setInterpolator(xq.h);
        this.f12606w.start();
    }

    public final void b(int i7) {
        if (this.f12605s != i7) {
            a(i7);
            c20 c20Var = this.f12607x;
            if (c20Var != null) {
                c20Var.a(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((o9) this).D.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f12598a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f12603n = f10;
        this.f12600c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f12601e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(c20 c20Var) {
        this.f12607x = c20Var;
    }

    public void setOnSwitchingModeListener(c20 c20Var) {
        this.f12608y = c20Var;
    }
}
