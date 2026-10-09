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
import org.telegram.ui.Components.hs;
public abstract class x8 extends FrameLayout implements v2 {
    public final w8 f6311a;
    public final FrameLayout f6312b;
    public final TextView f6313c;
    public final FrameLayout d;
    public final TextView f6314e;
    public final FrameLayout f6315f;
    public final TextView h;
    public float f6316n;
    public float f6317r;
    public int f6318s;
    public ValueAnimator v;
    public Utilities.Callback f6319w;
    public Utilities.Callback f6320x;

    public x8(Context context) {
        super(context);
        w8 w8Var = new w8(this, context);
        this.f6311a = w8Var;
        w8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6312b = frameLayout;
        TextView textView = new TextView(context);
        this.f6313c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 7.0f, -2, 80));
        w8Var.addView(frameLayout, w7.x5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final x8 f6161b;

            {
                this.f6161b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6161b.b(-1);
                        return;
                    case 1:
                        this.f6161b.b(0);
                        return;
                    default:
                        this.f6161b.b(1);
                        return;
                }
            }
        });
        w7.z5.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f6314e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 7.0f, -2, 80));
        w8Var.addView(frameLayout2, w7.x5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final x8 f6161b;

            {
                this.f6161b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6161b.b(-1);
                        return;
                    case 1:
                        this.f6161b.b(0);
                        return;
                    default:
                        this.f6161b.b(1);
                        return;
                }
            }
        });
        w7.z5.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f6315f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 7.0f, -2, 80));
        w8Var.addView(frameLayout3, w7.x5.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final x8 f6161b;

            {
                this.f6161b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6161b.b(-1);
                        return;
                    case 1:
                        this.f6161b.b(0);
                        return;
                    default:
                        this.f6161b.b(1);
                        return;
                }
            }
        });
        w7.z5.a(frameLayout3);
        addView(w8Var, w7.x5.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f6318s == i10) {
            return;
        }
        this.f6318s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f6317r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 24));
        this.v.setDuration(320L);
        this.v.setInterpolator(hs.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f6318s != i10) {
            a(i10);
            Utilities.Callback callback = this.f6319w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((db) this).f4977y.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f6311a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f6316n = f7;
        this.f6313c.setTextColor(i0.a.d(f7, -1, -16777216));
        this.f6314e.setTextColor(i0.a.d(f7, -1, -16777216));
        this.h.setTextColor(i0.a.d(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f6319w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f6320x = callback;
    }
}
