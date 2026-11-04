package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ch0;
public final class d7 extends FrameLayout {
    public final ArrayList f10202a;
    public ValueAnimator f10203b;
    public int f10204c;
    public int d;
    public final z5 f10205e;

    public d7(Context context, e9 e9Var) {
        super(context);
        this.f10204c = -1;
        int i3 = 0;
        this.d = 0;
        this.f10205e = new z5(this, 2);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131744773, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, mf.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(bd.M0(2131744770, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, mf.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f10202a = arrayList;
        arrayList.add(new c7(context, 2131624232, bd.M0(2131744777, null), bd.M0(2131744776, null)));
        arrayList.add(new c7(context, 2131624234, bd.M0(2131744772, null), bd.M0(2131744771, null)));
        arrayList.add(new c7(context, 2131624231, bd.M0(2131744779, null), bd.M0(2131744778, null)));
        arrayList.add(new c7(context, 2131624233, bd.M0(2131744775, null), bd.M0(2131744774, null)));
        int measuredWidth = e9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c7 c7Var = (c7) obj;
            TextPaint textPaint = c7Var.f10156e;
            String str = c7Var.f10153a;
            int length = str.length();
            Rect rect = c7Var.f10159r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = c7Var.f10157f;
            String str2 = c7Var.f10154b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(8.0f) + measuredWidth > e9Var.getMeasuredWidth() ? e9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f) : measuredWidth, org.telegram.messenger.g0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        ArrayList arrayList2 = this.f10202a;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            linearLayout.addView((c7) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(bd.M0(2131744780, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, mf.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, mf.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, e9Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new b7(this, textView3, e9Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f10203b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10203b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f10203b.setDuration(350L);
        this.f10203b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f10203b.getCurrentPlayTime();
        this.f10203b.addListener(new ai.e1(this, 16));
        this.f10203b.addUpdateListener(new bh.f(this, 23));
        this.f10203b.start();
        org.telegram.messenger.g0.i3(this.f10205e, (((c7) this.f10202a.get(this.d)).f10155c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.g0.r(this.f10205e);
        ValueAnimator valueAnimator = this.f10203b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10203b = null;
        }
        int i3 = this.f10204c;
        ArrayList arrayList = this.f10202a;
        if (i3 != -1) {
            c7 c7Var = (c7) arrayList.get(i3);
            ch0 ch0Var = c7Var.f10155c;
            ch0Var.M(0);
            ch0Var.stop();
            c7Var.f10158n = 0.0f;
            c7Var.invalidate();
        }
        c7 c7Var2 = (c7) arrayList.get(this.d);
        ch0 ch0Var2 = c7Var2.f10155c;
        ch0Var2.M(0);
        ch0Var2.stop();
        c7Var2.f10158n = 0.0f;
        c7Var2.invalidate();
        c();
    }

    public final void c() {
        int i3 = this.d + 1;
        this.d = i3;
        ArrayList arrayList = this.f10202a;
        if (i3 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.f10204c + 1;
        this.f10204c = i10;
        if (i10 >= arrayList.size()) {
            this.f10204c = 0;
        }
    }
}
