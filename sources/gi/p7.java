package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
public abstract class p7 extends FrameLayout implements m2 {
    public final o7 f13382a;
    public final FrameLayout f13383b;
    public final TextView f13384c;
    public final FrameLayout d;
    public final TextView f13385e;
    public final FrameLayout f13386f;
    public final TextView h;
    public float f13387n;
    public float f13388r;
    public int f13389s;
    public ValueAnimator f13390w;
    public u10 f13391x;
    public u10 f13392y;

    public p7(Context context) {
        super(context);
        o7 o7Var = new o7(this, context);
        this.f13382a = o7Var;
        o7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13383b = frameLayout;
        TextView textView = new TextView(context);
        this.f13384c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131744641, null));
        frameLayout.addView(textView, mf.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout, mf.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f13308b;

            {
                this.f13308b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f13308b.b(-1);
                        return;
                    case 1:
                        this.f13308b.b(0);
                        return;
                    default:
                        this.f13308b.b(1);
                        return;
                }
            }
        });
        pf.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f13385e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(bd.M0(2131744595, null));
        frameLayout2.addView(textView2, mf.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout2, mf.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f13308b;

            {
                this.f13308b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f13308b.b(-1);
                        return;
                    case 1:
                        this.f13308b.b(0);
                        return;
                    default:
                        this.f13308b.b(1);
                        return;
                }
            }
        });
        pf.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f13386f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(bd.M0(2131744460, null));
        frameLayout3.addView(textView3, mf.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout3, mf.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f13308b;

            {
                this.f13308b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f13308b.b(-1);
                        return;
                    case 1:
                        this.f13308b.b(0);
                        return;
                    default:
                        this.f13308b.b(1);
                        return;
                }
            }
        });
        pf.a(frameLayout3);
        addView(o7Var, mf.e(-2, -1, 113));
    }

    public final void a(int i3) {
        if (this.f13389s == i3) {
            return;
        }
        this.f13389s = i3;
        ValueAnimator valueAnimator = this.f13390w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13388r, i3);
        this.f13390w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.f13390w.setDuration(320L);
        this.f13390w.setInterpolator(xq.h);
        this.f13390w.start();
    }

    public final void b(int i3) {
        if (this.f13389s != i3) {
            a(i3);
            u10 u10Var = this.f13391x;
            if (u10Var != null) {
                u10Var.a(Integer.valueOf(i3));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((p9) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f13382a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f13387n = f10;
        this.f13384c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f13385e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(u10 u10Var) {
        this.f13391x = u10Var;
    }

    public void setOnSwitchingModeListener(u10 u10Var) {
        this.f13392y = u10Var;
    }
}
