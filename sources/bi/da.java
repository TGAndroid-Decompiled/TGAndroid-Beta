package bi;

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
import org.telegram.ui.Components.wr;
public abstract class da extends FrameLayout implements l3 {
    public final ca f2557a;
    public final FrameLayout f2558b;
    public final TextView f2559c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f2560f;
    public final TextView h;
    public float f2561n;
    public float f2562r;
    public int f2563s;
    public ValueAnimator v;
    public Utilities.Callback f2564w;
    public Utilities.Callback f2565x;

    public da(Context context) {
        super(context);
        ca caVar = new ca(this, context);
        this.f2557a = caVar;
        caVar.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2558b = frameLayout;
        TextView textView = new TextView(context);
        this.f2559c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        caVar.addView(frameLayout, w7.a6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final da f2375b;

            {
                this.f2375b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f2375b.b(-1);
                        return;
                    case 1:
                        this.f2375b.b(0);
                        return;
                    default:
                        this.f2375b.b(1);
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
        frameLayout2.addView(textView2, w7.a6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        caVar.addView(frameLayout2, w7.a6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final da f2375b;

            {
                this.f2375b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f2375b.b(-1);
                        return;
                    case 1:
                        this.f2375b.b(0);
                        return;
                    default:
                        this.f2375b.b(1);
                        return;
                }
            }
        });
        w7.c6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f2560f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.a6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        caVar.addView(frameLayout3, w7.a6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final da f2375b;

            {
                this.f2375b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f2375b.b(-1);
                        return;
                    case 1:
                        this.f2375b.b(0);
                        return;
                    default:
                        this.f2375b.b(1);
                        return;
                }
            }
        });
        w7.c6.a(frameLayout3);
        addView(caVar, w7.a6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f2563s == i10) {
            return;
        }
        this.f2563s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2562r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 10));
        this.v.setDuration(320L);
        this.v.setInterpolator(wr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f2563s != i10) {
            a(i10);
            Utilities.Callback callback = this.f2564w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((pc) this).f3419y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f2557a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f2561n = f7;
        this.f2559c.setTextColor(i0.a.d(f7, -1, -16777216));
        this.e.setTextColor(i0.a.d(f7, -1, -16777216));
        this.h.setTextColor(i0.a.d(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f2564w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f2565x = callback;
    }
}
