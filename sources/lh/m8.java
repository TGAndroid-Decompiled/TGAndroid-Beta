package lh;

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
import org.telegram.ui.Components.er;

public abstract class m8 extends FrameLayout implements q2 {

    public final l8 f16388a;

    public final FrameLayout f16389b;

    public final TextView f16390c;
    public final FrameLayout d;

    public final TextView f16391e;

    public final FrameLayout f16392f;
    public final TextView h;

    public float f16393n;

    public float f16394r;

    public int f16395s;
    public ValueAnimator v;

    public Utilities.Callback f16396w;

    public Utilities.Callback f16397x;

    public m8(Context context) {
        super(context);
        l8 l8Var = new l8(this, context);
        this.f16388a = l8Var;
        l8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16389b = frameLayout;
        TextView textView = new TextView(context);
        this.f16390c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout, h7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i10 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {

            public final m8 f16248b;

            {
                this.f16248b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f16248b.b(-1);
                        break;
                    case 1:
                        this.f16248b.b(0);
                        break;
                    default:
                        this.f16248b.b(1);
                        break;
                }
            }
        });
        h7.b6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f16391e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, h7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout2, h7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i11 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {

            public final m8 f16248b;

            {
                this.f16248b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f16248b.b(-1);
                        break;
                    case 1:
                        this.f16248b.b(0);
                        break;
                    default:
                        this.f16248b.b(1);
                        break;
                }
            }
        });
        h7.b6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f16392f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, h7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout3, h7.z5.t(-2, -1, 112, 0, 0, 0, 0));
        final int i12 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {

            public final m8 f16248b;

            {
                this.f16248b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f16248b.b(-1);
                        break;
                    case 1:
                        this.f16248b.b(0);
                        break;
                    default:
                        this.f16248b.b(1);
                        break;
                }
            }
        });
        h7.b6.a(frameLayout3);
        addView(l8Var, h7.z5.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f16395s == i10) {
            return;
        }
        this.f16395s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16394r, i10);
        this.v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m2(this, 7));
        this.v.setDuration(320L);
        this.v.setInterpolator(er.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f16395s == i10) {
            return;
        }
        a(i10);
        Utilities.Callback callback = this.f16396w;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((la) this).f16325y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f16388a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f16393n = f10;
        this.f16390c.setTextColor(i0.b.d(f10, -1, -16777216));
        this.f16391e.setTextColor(i0.b.d(f10, -1, -16777216));
        this.h.setTextColor(i0.b.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f16396w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f16397x = callback;
    }
}
