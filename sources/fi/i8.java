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
import org.telegram.ui.Components.kb1;
public abstract class i8 extends FrameLayout implements p2 {
    public final h8 f11005a;
    public final FrameLayout f11006b;
    public final TextView f11007c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f11008f;
    public final TextView h;
    public float f11009n;
    public float f11010r;
    public int f11011s;
    public ValueAnimator v;
    public Utilities.Callback f11012w;
    public Utilities.Callback f11013x;

    public i8(Context context) {
        super(context);
        h8 h8Var = new h8(this, context);
        this.f11005a = h8Var;
        h8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11006b = frameLayout;
        TextView textView = new TextView(context);
        this.f11007c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout, kb1.v(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f10918b;

            {
                this.f10918b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10918b.b(-1);
                        return;
                    case 1:
                        this.f10918b.b(0);
                        return;
                    default:
                        this.f10918b.b(1);
                        return;
                }
            }
        });
        kb1.b(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, kb1.h(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout2, kb1.v(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f10918b;

            {
                this.f10918b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10918b.b(-1);
                        return;
                    case 1:
                        this.f10918b.b(0);
                        return;
                    default:
                        this.f10918b.b(1);
                        return;
                }
            }
        });
        kb1.b(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f11008f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, kb1.h(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout3, kb1.x(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final i8 f10918b;

            {
                this.f10918b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10918b.b(-1);
                        return;
                    case 1:
                        this.f10918b.b(0);
                        return;
                    default:
                        this.f10918b.b(1);
                        return;
                }
            }
        });
        kb1.b(frameLayout3);
        addView(h8Var, kb1.i(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f11011s == i10) {
            return;
        }
        this.f11011s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11010r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new e4(this, 4));
        this.v.setDuration(320L);
        this.v.setInterpolator(ds.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f11011s != i10) {
            a(i10);
            Utilities.Callback callback = this.f11012w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((ja) this).f11069y.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f11005a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f11009n = f7;
        this.f11007c.setTextColor(i0.a.f(f7, -1, -16777216));
        this.e.setTextColor(i0.a.f(f7, -1, -16777216));
        this.h.setTextColor(i0.a.f(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f11012w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f11013x = callback;
    }
}
