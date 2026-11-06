package di;

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
import bi.ab;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.zg0;
public final class c7 extends FrameLayout {
    public final ArrayList f8874a;
    public ValueAnimator f8875b;
    public int f8876c;
    public int d;
    public final ab f8877e;

    public c7(Context context, d9 d9Var) {
        super(context);
        this.f8876c = -1;
        int i7 = 0;
        this.d = 0;
        this.f8877e = new ab(this, 27);
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
        textView.setText(hd.M0(2131744764, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, ha.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(hd.M0(2131744761, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, ha.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f8874a = arrayList;
        arrayList.add(new b7(context, 2131624232, hd.M0(2131744768, null), hd.M0(2131744767, null)));
        arrayList.add(new b7(context, 2131624234, hd.M0(2131744763, null), hd.M0(2131744762, null)));
        arrayList.add(new b7(context, 2131624231, hd.M0(2131744770, null), hd.M0(2131744769, null)));
        arrayList.add(new b7(context, 2131624233, hd.M0(2131744766, null), hd.M0(2131744765, null)));
        int measuredWidth = d9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b7 b7Var = (b7) obj;
            TextPaint textPaint = b7Var.f8852e;
            String str = b7Var.f8849a;
            int length = str.length();
            Rect rect = b7Var.f8855r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = b7Var.f8853f;
            String str2 = b7Var.f8850b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(8.0f) + measuredWidth > d9Var.getMeasuredWidth() ? d9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f) : measuredWidth, org.telegram.messenger.g0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        ArrayList arrayList2 = this.f8874a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            linearLayout.addView((b7) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(hd.M0(2131744771, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, ha.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, ha.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, d9Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new a7(this, textView3, d9Var, textView2));
    }

    public final void a(boolean z9) {
        ValueAnimator valueAnimator = this.f8875b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8875b = ofFloat;
        if (z9) {
            ofFloat.setStartDelay(50L);
        }
        this.f8875b.setDuration(350L);
        this.f8875b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f8875b.getCurrentPlayTime();
        this.f8875b.addListener(new bi.t5(this, 14));
        this.f8875b.addUpdateListener(new ah.h(this, 22));
        this.f8875b.start();
        org.telegram.messenger.g0.i3(this.f8877e, (((b7) this.f8874a.get(this.d)).f8851c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.g0.r(this.f8877e);
        ValueAnimator valueAnimator = this.f8875b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8875b = null;
        }
        int i7 = this.f8876c;
        ArrayList arrayList = this.f8874a;
        if (i7 != -1) {
            b7 b7Var = (b7) arrayList.get(i7);
            zg0 zg0Var = b7Var.f8851c;
            zg0Var.M(0);
            zg0Var.stop();
            b7Var.f8854n = 0.0f;
            b7Var.invalidate();
        }
        b7 b7Var2 = (b7) arrayList.get(this.d);
        zg0 zg0Var2 = b7Var2.f8851c;
        zg0Var2.M(0);
        zg0Var2.stop();
        b7Var2.f8854n = 0.0f;
        b7Var2.invalidate();
        c();
    }

    public final void c() {
        int i7 = this.d + 1;
        this.d = i7;
        ArrayList arrayList = this.f8874a;
        if (i7 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.f8876c + 1;
        this.f8876c = i10;
        if (i10 >= arrayList.size()) {
            this.f8876c = 0;
        }
    }
}
