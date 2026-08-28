package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
public abstract class n8 extends FrameLayout implements r2 {
    public final m8 f15757a;
    public final FrameLayout f15758b;
    public final TextView f15759c;
    public final FrameLayout d;
    public final TextView f15760e;
    public final FrameLayout f15761f;
    public final TextView h;
    public float f15762n;
    public float f15763r;
    public int f15764s;
    public ValueAnimator v;
    public Utilities.Callback f15765w;
    public Utilities.Callback f15766x;

    public n8(Context context) {
        super(context);
        m8 m8Var = new m8(this, context);
        this.f15757a = m8Var;
        m8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15758b = frameLayout;
        TextView textView = new TextView(context);
        this.f15759c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m8Var.addView(frameLayout, g7.e6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final n8 f15608b;

            {
                this.f15608b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15608b.b(-1);
                        return;
                    case 1:
                        this.f15608b.b(0);
                        return;
                    default:
                        this.f15608b.b(1);
                        return;
                }
            }
        });
        g7.g6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f15760e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, g7.e6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m8Var.addView(frameLayout2, g7.e6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final n8 f15608b;

            {
                this.f15608b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15608b.b(-1);
                        return;
                    case 1:
                        this.f15608b.b(0);
                        return;
                    default:
                        this.f15608b.b(1);
                        return;
                }
            }
        });
        g7.g6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15761f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, g7.e6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m8Var.addView(frameLayout3, g7.e6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final n8 f15608b;

            {
                this.f15608b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15608b.b(-1);
                        return;
                    case 1:
                        this.f15608b.b(0);
                        return;
                    default:
                        this.f15608b.b(1);
                        return;
                }
            }
        });
        g7.g6.a(frameLayout3);
        addView(m8Var, g7.e6.e(-2, -1, 113));
    }

    public final void a(int i9) {
        if (this.f15764s == i9) {
            return;
        }
        this.f15764s = i9;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15763r, i9);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new g4(this, 4));
        this.v.setDuration(320L);
        this.v.setInterpolator(gr.h);
        this.v.start();
    }

    public final void b(int i9) {
        if (this.f15764s != i9) {
            a(i9);
            Utilities.Callback callback = this.f15765w;
            if (callback != null) {
                callback.run(Integer.valueOf(i9));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((oa) this).f15804y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f15757a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f15762n = f10;
        this.f15759c.setTextColor(i0.a.d(f10, -1, -16777216));
        this.f15760e.setTextColor(i0.a.d(f10, -1, -16777216));
        this.h.setTextColor(i0.a.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f15765w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f15766x = callback;
    }
}
