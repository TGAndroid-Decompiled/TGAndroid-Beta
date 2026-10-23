package ei;

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
import org.telegram.ui.Components.bs;
public abstract class m8 extends FrameLayout implements r2 {
    public final l8 f9484a;
    public final FrameLayout f9485b;
    public final TextView f9486c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f9487f;
    public final TextView h;
    public float f9488n;
    public float f9489r;
    public int f9490s;
    public ValueAnimator v;
    public Utilities.Callback f9491w;
    public Utilities.Callback f9492x;

    public m8(Context context) {
        super(context);
        l8 l8Var = new l8(this, context);
        this.f9484a = l8Var;
        l8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9485b = frameLayout;
        TextView textView = new TextView(context);
        this.f9486c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout, w7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f9335b;

            {
                this.f9335b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9335b.b(-1);
                        return;
                    case 1:
                        this.f9335b.b(0);
                        return;
                    default:
                        this.f9335b.b(1);
                        return;
                }
            }
        });
        w7.b6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, w7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout2, w7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f9335b;

            {
                this.f9335b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9335b.b(-1);
                        return;
                    case 1:
                        this.f9335b.b(0);
                        return;
                    default:
                        this.f9335b.b(1);
                        return;
                }
            }
        });
        w7.b6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f9487f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout3, w7.z5.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f9335b;

            {
                this.f9335b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9335b.b(-1);
                        return;
                    case 1:
                        this.f9335b.b(0);
                        return;
                    default:
                        this.f9335b.b(1);
                        return;
                }
            }
        });
        w7.b6.a(frameLayout3);
        addView(l8Var, w7.z5.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f9490s == i10) {
            return;
        }
        this.f9490s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9489r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new i6(this, 2));
        this.v.setDuration(320L);
        this.v.setInterpolator(bs.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f9490s != i10) {
            a(i10);
            Utilities.Callback callback = this.f9491w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((na) this).f9539y.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f9484a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f9488n = f7;
        this.f9486c.setTextColor(i0.a.f(f7, -1, -16777216));
        this.e.setTextColor(i0.a.f(f7, -1, -16777216));
        this.h.setTextColor(i0.a.f(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f9491w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f9492x = callback;
    }
}
