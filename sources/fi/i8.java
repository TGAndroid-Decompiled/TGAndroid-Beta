package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public abstract class i8 extends FrameLayout implements p2 {
    public final h8 f11006a;
    public final FrameLayout f11007b;
    public final TextView f11008c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f11009f;
    public final TextView h;
    public float f11010n;
    public float f11011r;
    public int f11012s;
    public ValueAnimator v;
    public Utilities.Callback f11013w;
    public Utilities.Callback f11014x;

    public i8(Context context) {
        super(context);
        h8 h8Var = new h8(this, context);
        this.f11006a = h8Var;
        h8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11007b = frameLayout;
        TextView textView = new TextView(context);
        this.f11008c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, gb1.h(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout, gb1.v(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f10919b;

            {
                this.f10919b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10919b.b(-1);
                        return;
                    case 1:
                        this.f10919b.b(0);
                        return;
                    default:
                        this.f10919b.b(1);
                        return;
                }
            }
        });
        gb1.b(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, gb1.h(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout2, gb1.v(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f10919b;

            {
                this.f10919b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10919b.b(-1);
                        return;
                    case 1:
                        this.f10919b.b(0);
                        return;
                    default:
                        this.f10919b.b(1);
                        return;
                }
            }
        });
        gb1.b(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f11009f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, gb1.h(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout3, gb1.x(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f10919b;

            {
                this.f10919b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10919b.b(-1);
                        return;
                    case 1:
                        this.f10919b.b(0);
                        return;
                    default:
                        this.f10919b.b(1);
                        return;
                }
            }
        });
        gb1.b(frameLayout3);
        addView(h8Var, gb1.i(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f11012s == i10) {
            return;
        }
        this.f11012s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11011r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new e4(this, 4));
        this.v.setDuration(320L);
        this.v.setInterpolator(ds.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f11012s != i10) {
            a(i10);
            Utilities.Callback callback = this.f11013w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((ja) this).f11070y.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f11006a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f11010n = f7;
        this.f11008c.setTextColor(i0.a.f(f7, -1, -16777216));
        this.e.setTextColor(i0.a.f(f7, -1, -16777216));
        this.h.setTextColor(i0.a.f(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f11013w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f11014x = callback;
    }
}
