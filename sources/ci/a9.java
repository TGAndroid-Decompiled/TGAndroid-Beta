package ci;

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
import org.telegram.ui.Components.qr;
public abstract class a9 extends FrameLayout implements x2 {
    public final z8 f4351a;
    public final FrameLayout f4352b;
    public final TextView f4353c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f4354f;
    public final TextView h;
    public float f4355n;
    public float f4356r;
    public int f4357s;
    public ValueAnimator v;
    public Utilities.Callback f4358w;
    public Utilities.Callback f4359x;

    public a9(Context context) {
        super(context);
        z8 z8Var = new z8(this, context);
        this.f4351a = z8Var;
        z8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4352b = frameLayout;
        TextView textView = new TextView(context);
        this.f4353c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        z8Var.addView(frameLayout, w7.x5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f5833b;

            {
                this.f5833b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5833b.b(-1);
                        return;
                    case 1:
                        this.f5833b.b(0);
                        return;
                    default:
                        this.f5833b.b(1);
                        return;
                }
            }
        });
        w7.z5.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, w7.x5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        z8Var.addView(frameLayout2, w7.x5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f5833b;

            {
                this.f5833b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5833b.b(-1);
                        return;
                    case 1:
                        this.f5833b.b(0);
                        return;
                    default:
                        this.f5833b.b(1);
                        return;
                }
            }
        });
        w7.z5.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f4354f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.x5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        z8Var.addView(frameLayout3, w7.x5.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f5833b;

            {
                this.f5833b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5833b.b(-1);
                        return;
                    case 1:
                        this.f5833b.b(0);
                        return;
                    default:
                        this.f5833b.b(1);
                        return;
                }
            }
        });
        w7.z5.a(frameLayout3);
        addView(z8Var, w7.x5.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f4357s == i10) {
            return;
        }
        this.f4357s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f4356r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 24));
        this.v.setDuration(320L);
        this.v.setInterpolator(qr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f4357s != i10) {
            a(i10);
            Utilities.Callback callback = this.f4358w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((gb) this).f4724y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f4351a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f4355n = f7;
        this.f4353c.setTextColor(i0.a.d(f7, -1, -16777216));
        this.e.setTextColor(i0.a.d(f7, -1, -16777216));
        this.h.setTextColor(i0.a.d(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f4358w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f4359x = callback;
    }
}
