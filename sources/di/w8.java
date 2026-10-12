package di;

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
import org.telegram.ui.Components.es;
public abstract class w8 extends FrameLayout implements v2 {
    public final v8 f8057a;
    public final FrameLayout f8058b;
    public final TextView f8059c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f8060f;
    public final TextView h;
    public float f8061n;
    public float f8062r;
    public int f8063s;
    public ValueAnimator v;
    public Utilities.Callback f8064w;
    public Utilities.Callback f8065x;

    public w8(Context context) {
        super(context);
        v8 v8Var = new v8(this, context);
        this.f8057a = v8Var;
        v8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8058b = frameLayout;
        TextView textView = new TextView(context);
        this.f8059c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 7.0f, -2, 80));
        v8Var.addView(frameLayout, w7.a6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f7901b;

            {
                this.f7901b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f7901b.b(-1);
                        return;
                    case 1:
                        this.f7901b.b(0);
                        return;
                    default:
                        this.f7901b.b(1);
                        return;
                }
            }
        });
        w7.c6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 7.0f, -2, 80));
        v8Var.addView(frameLayout2, w7.a6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f7901b;

            {
                this.f7901b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f7901b.b(-1);
                        return;
                    case 1:
                        this.f7901b.b(0);
                        return;
                    default:
                        this.f7901b.b(1);
                        return;
                }
            }
        });
        w7.c6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8060f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 7.0f, -2, 80));
        v8Var.addView(frameLayout3, w7.a6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f7901b;

            {
                this.f7901b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f7901b.b(-1);
                        return;
                    case 1:
                        this.f7901b.b(0);
                        return;
                    default:
                        this.f7901b.b(1);
                        return;
                }
            }
        });
        w7.c6.a(frameLayout3);
        addView(v8Var, w7.a6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f8063s == i10) {
            return;
        }
        this.f8063s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f8062r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 25));
        this.v.setDuration(320L);
        this.v.setInterpolator(es.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f8063s != i10) {
            a(i10);
            Utilities.Callback callback = this.f8064w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((cb) this).f6741y.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f8057a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f8061n = f7;
        this.f8059c.setTextColor(i0.a.d(f7, -1, -16777216));
        this.e.setTextColor(i0.a.d(f7, -1, -16777216));
        this.h.setTextColor(i0.a.d(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f8064w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f8065x = callback;
    }
}
