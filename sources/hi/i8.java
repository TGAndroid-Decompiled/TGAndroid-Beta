package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
public abstract class i8 extends FrameLayout implements v2 {
    public final h8 f14690a;
    public final FrameLayout f14691b;
    public final TextView f14692c;
    public final FrameLayout d;
    public final TextView f14693e;
    public final FrameLayout f14694f;
    public final TextView h;
    public float f14695n;
    public float f14696r;
    public int f14697s;
    public ValueAnimator f14698w;
    public w10 f14699x;
    public w10 f14700y;

    public i8(Context context) {
        super(context);
        h8 h8Var = new h8(this, context);
        this.f14690a = h8Var;
        h8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14691b = frameLayout;
        TextView textView = new TextView(context);
        this.f14692c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131744387, null));
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout, c8.na.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f14556b;

            {
                this.f14556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14556b.b(-1);
                        return;
                    case 1:
                        this.f14556b.b(0);
                        return;
                    default:
                        this.f14556b.b(1);
                        return;
                }
            }
        });
        c8.sa.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f14693e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131744341, null));
        frameLayout2.addView(textView2, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout2, c8.na.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f14556b;

            {
                this.f14556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14556b.b(-1);
                        return;
                    case 1:
                        this.f14556b.b(0);
                        return;
                    default:
                        this.f14556b.b(1);
                        return;
                }
            }
        });
        c8.sa.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f14694f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(gd.N0(2131744206, null));
        frameLayout3.addView(textView3, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout3, c8.na.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f14556b;

            {
                this.f14556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14556b.b(-1);
                        return;
                    case 1:
                        this.f14556b.b(0);
                        return;
                    default:
                        this.f14556b.b(1);
                        return;
                }
            }
        });
        c8.sa.a(frameLayout3);
        addView(h8Var, c8.na.e(-2, -1, 113));
    }

    public final void a(int i7) {
        if (this.f14697s == i7) {
            return;
        }
        this.f14697s = i7;
        ValueAnimator valueAnimator = this.f14698w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f14696r, i7);
        this.f14698w = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 5));
        this.f14698w.setDuration(320L);
        this.f14698w.setInterpolator(kr.h);
        this.f14698w.start();
    }

    public final void b(int i7) {
        if (this.f14697s != i7) {
            a(i7);
            w10 w10Var = this.f14699x;
            if (w10Var != null) {
                w10Var.a(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((ha) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f14690a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f14695n = f10;
        this.f14692c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.f14693e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(w10 w10Var) {
        this.f14699x = w10Var;
    }

    public void setOnSwitchingModeListener(w10 w10Var) {
        this.f14700y = w10Var;
    }
}
