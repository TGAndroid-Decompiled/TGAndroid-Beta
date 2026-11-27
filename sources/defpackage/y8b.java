package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public abstract class y8b extends FrameLayout implements qk4 {
    public final x8b a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public float n;
    public float r;
    public int s;
    public ValueAnimator w;
    public pcc x;
    public pcc y;

    public y8b(Activity activity) {
        super(activity);
        x8b x8bVar = new x8b(this, activity);
        this.a = x8bVar;
        x8bVar.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131744285, null));
        frameLayout.addView(textView, tre.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        x8bVar.addView(frameLayout, tre.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y8b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y8b y8bVar = this.b;
                switch (b) {
                    case 0:
                        y8bVar.b(-1);
                        return;
                    case 1:
                        y8bVar.b(0);
                        return;
                    default:
                        y8bVar.b(1);
                        return;
                }
            }
        });
        iye.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.d = frameLayout2;
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setTextColor(-1);
        textView2.setText(ob6.M0(2131744239, null));
        frameLayout2.addView(textView2, tre.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        x8bVar.addView(frameLayout2, tre.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y8b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y8b y8bVar = this.b;
                switch (b) {
                    case 0:
                        y8bVar.b(-1);
                        return;
                    case 1:
                        y8bVar.b(0);
                        return;
                    default:
                        y8bVar.b(1);
                        return;
                }
            }
        });
        iye.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f = frameLayout3;
        TextView textView3 = new TextView(activity);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(hl.o());
        textView3.setTextColor(-1);
        textView3.setText(ob6.M0(2131744104, null));
        frameLayout3.addView(textView3, tre.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        x8bVar.addView(frameLayout3, tre.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final y8b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y8b y8bVar = this.b;
                switch (b) {
                    case 0:
                        y8bVar.b(-1);
                        return;
                    case 1:
                        y8bVar.b(0);
                        return;
                    default:
                        y8bVar.b(1);
                        return;
                }
            }
        });
        iye.a(frameLayout3);
        addView(x8bVar, tre.e(-2, -1, 113));
    }

    public final void a(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new ija(this, (byte) 18));
        this.w.setDuration(320L);
        this.w.setInterpolator(k43.h);
        this.w.start();
    }

    public final void b(int i) {
        if (this.s != i) {
            a(i);
            pcc pccVar = this.x;
            if (pccVar != null) {
                pccVar.a(Integer.valueOf(i));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((oab) this).E.G()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public void setInvert(float f) {
        this.n = f;
        this.c.setTextColor(vm2.f(f, -1, -16777216));
        this.e.setTextColor(vm2.f(f, -1, -16777216));
        this.h.setTextColor(vm2.f(f, -1, -16777216));
    }

    public void setOnSwitchModeListener(pcc pccVar) {
        this.x = pccVar;
    }

    public void setOnSwitchingModeListener(pcc pccVar) {
        this.y = pccVar;
    }
}
