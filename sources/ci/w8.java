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
import org.telegram.ui.Components.tr;
public abstract class w8 extends FrameLayout implements w2 {
    public final v8 f6239a;
    public final FrameLayout f6240b;
    public final TextView f6241c;
    public final FrameLayout d;
    public final TextView f6242e;
    public final FrameLayout f6243f;
    public final TextView h;
    public float f6244n;
    public float f6245r;
    public int f6246s;
    public ValueAnimator v;
    public Utilities.Callback f6247w;
    public Utilities.Callback f6248x;

    public w8(Context context) {
        super(context);
        v8 v8Var = new v8(this, context);
        this.f6239a = v8Var;
        v8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6240b = frameLayout;
        TextView textView = new TextView(context);
        this.f6241c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v8Var.addView(frameLayout, w7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f6076b;

            {
                this.f6076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6076b.b(-1);
                        return;
                    case 1:
                        this.f6076b.b(0);
                        return;
                    default:
                        this.f6076b.b(1);
                        return;
                }
            }
        });
        w7.b6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f6242e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, w7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v8Var.addView(frameLayout2, w7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f6076b;

            {
                this.f6076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6076b.b(-1);
                        return;
                    case 1:
                        this.f6076b.b(0);
                        return;
                    default:
                        this.f6076b.b(1);
                        return;
                }
            }
        });
        w7.b6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f6243f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v8Var.addView(frameLayout3, w7.z5.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f6076b;

            {
                this.f6076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6076b.b(-1);
                        return;
                    case 1:
                        this.f6076b.b(0);
                        return;
                    default:
                        this.f6076b.b(1);
                        return;
                }
            }
        });
        w7.b6.a(frameLayout3);
        addView(v8Var, w7.z5.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f6246s == i10) {
            return;
        }
        this.f6246s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f6245r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 24));
        this.v.setDuration(320L);
        this.v.setInterpolator(tr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f6246s != i10) {
            a(i10);
            Utilities.Callback callback = this.f6247w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((cb) this).f4842y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f6239a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f6244n = f7;
        this.f6241c.setTextColor(i0.a.d(f7, -1, -16777216));
        this.f6242e.setTextColor(i0.a.d(f7, -1, -16777216));
        this.h.setTextColor(i0.a.d(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f6247w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f6248x = callback;
    }
}
