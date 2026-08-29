package nh;

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
import org.telegram.ui.Components.jr;
public abstract class b8 extends FrameLayout implements o2 {
    public final a8 f17420a;
    public final FrameLayout f17421b;
    public final TextView f17422c;
    public final FrameLayout d;
    public final TextView f17423e;
    public final FrameLayout f17424f;
    public final TextView h;
    public float f17425n;
    public float f17426r;
    public int f17427s;
    public ValueAnimator v;
    public Utilities.Callback f17428w;
    public Utilities.Callback f17429x;

    public b8(Context context) {
        super(context);
        a8 a8Var = new a8(this, context);
        this.f17420a = a8Var;
        a8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17421b = frameLayout;
        TextView textView = new TextView(context);
        this.f17422c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        a8Var.addView(frameLayout, i7.f6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f18967b;

            {
                this.f18967b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18967b.b(-1);
                        return;
                    case 1:
                        this.f18967b.b(0);
                        return;
                    default:
                        this.f18967b.b(1);
                        return;
                }
            }
        });
        i7.h6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f17423e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, i7.f6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        a8Var.addView(frameLayout2, i7.f6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f18967b;

            {
                this.f18967b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18967b.b(-1);
                        return;
                    case 1:
                        this.f18967b.b(0);
                        return;
                    default:
                        this.f18967b.b(1);
                        return;
                }
            }
        });
        i7.h6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f17424f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, i7.f6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        a8Var.addView(frameLayout3, i7.f6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f18967b;

            {
                this.f18967b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18967b.b(-1);
                        return;
                    case 1:
                        this.f18967b.b(0);
                        return;
                    default:
                        this.f18967b.b(1);
                        return;
                }
            }
        });
        i7.h6.a(frameLayout3);
        addView(a8Var, i7.f6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f17427s == i10) {
            return;
        }
        this.f17427s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f17426r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new lh.d5(this, 13));
        this.v.setDuration(320L);
        this.v.setInterpolator(jr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f17427s != i10) {
            a(i10);
            Utilities.Callback callback = this.f17428w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((z9) this).f18969y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f17420a.invalidate();
    }

    @Override
    public void setInvert(float f9) {
        this.f17425n = f9;
        this.f17422c.setTextColor(i0.a.d(f9, -1, -16777216));
        this.f17423e.setTextColor(i0.a.d(f9, -1, -16777216));
        this.h.setTextColor(i0.a.d(f9, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f17428w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f17429x = callback;
    }
}
