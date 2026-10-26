package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class b6 extends LinearLayout {
    public final TextView f10560a;
    public final bh.p f10561b;
    public ImageView f10562c;
    public ImageView d;
    public float e;
    public boolean f10563f;
    public ValueAnimator h;
    public final ImageView f10564n;
    public final e6 f10565r;

    public b6(e6 e6Var, Context context) {
        super(context);
        this.f10565r = e6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.y6.f23448i6;
        s5 s5Var = e6Var.f10819v1;
        setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 2, -1));
        bh.p pVar = new bh.p(this, context);
        this.f10561b = pVar;
        addView(pVar, gb1.x(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f10562c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f10562c;
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, s5Var, mode);
        pVar.addView(this.f10562c, gb1.i(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(this.d, i11, s5Var, mode);
        this.d.setVisibility(8);
        pVar.addView(this.d, gb1.i(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f10560a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i11, s5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, gb1.x(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f10564n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(imageView4, org.telegram.ui.ActionBar.y6.f23429h7, s5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, gb1.r(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i10, false, false);
                return;
            }
            this.f10563f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new bh.a0(2, this, z10));
            this.h.addListener(new bh.b(this, 21));
            this.h.setInterpolator(ds.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f10562c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        e6 e6Var = this.f10565r;
        org.telegram.ui.ActionBar.o1 o1Var = e6Var.f10821w1;
        if (o1Var != null && o1Var.isShowing()) {
            e6Var.f10821w1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f10564n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f10560a.setText(charSequence);
    }
}
