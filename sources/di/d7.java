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
import org.telegram.messenger.id;
import org.telegram.ui.Components.zg0;
public final class d7 extends FrameLayout {
    public final ArrayList f8933a;
    public ValueAnimator f8934b;
    public int f8935c;
    public int d;
    public final ab f8936e;

    public d7(Context context, e9 e9Var) {
        super(context);
        this.f8935c = -1;
        int i7 = 0;
        this.d = 0;
        this.f8936e = new ab(this, 26);
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
        textView.setText(id.M0(2131744763, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, ha.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(id.M0(2131744760, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, ha.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f8933a = arrayList;
        arrayList.add(new c7(context, 2131624232, id.M0(2131744767, null), id.M0(2131744766, null)));
        arrayList.add(new c7(context, 2131624234, id.M0(2131744762, null), id.M0(2131744761, null)));
        arrayList.add(new c7(context, 2131624231, id.M0(2131744769, null), id.M0(2131744768, null)));
        arrayList.add(new c7(context, 2131624233, id.M0(2131744765, null), id.M0(2131744764, null)));
        int measuredWidth = e9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c7 c7Var = (c7) obj;
            TextPaint textPaint = c7Var.f8883e;
            String str = c7Var.f8880a;
            int length = str.length();
            Rect rect = c7Var.f8886r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = c7Var.f8884f;
            String str2 = c7Var.f8881b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(8.0f) + measuredWidth > e9Var.getMeasuredWidth() ? e9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f) : measuredWidth, org.telegram.messenger.g0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        ArrayList arrayList2 = this.f8933a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            linearLayout.addView((c7) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(id.M0(2131744770, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, ha.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, ha.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, e9Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new b7(this, textView3, e9Var, textView2));
    }

    public final void a(boolean z9) {
        ValueAnimator valueAnimator = this.f8934b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8934b = ofFloat;
        if (z9) {
            ofFloat.setStartDelay(50L);
        }
        this.f8934b.setDuration(350L);
        this.f8934b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f8934b.getCurrentPlayTime();
        this.f8934b.addListener(new bi.t5(this, 14));
        this.f8934b.addUpdateListener(new ah.h(this, 22));
        this.f8934b.start();
        org.telegram.messenger.g0.i3(this.f8936e, (((c7) this.f8933a.get(this.d)).f8882c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.g0.r(this.f8936e);
        ValueAnimator valueAnimator = this.f8934b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8934b = null;
        }
        int i7 = this.f8935c;
        ArrayList arrayList = this.f8933a;
        if (i7 != -1) {
            c7 c7Var = (c7) arrayList.get(i7);
            zg0 zg0Var = c7Var.f8882c;
            zg0Var.M(0);
            zg0Var.stop();
            c7Var.f8885n = 0.0f;
            c7Var.invalidate();
        }
        c7 c7Var2 = (c7) arrayList.get(this.d);
        zg0 zg0Var2 = c7Var2.f8882c;
        zg0Var2.M(0);
        zg0Var2.stop();
        c7Var2.f8885n = 0.0f;
        c7Var2.invalidate();
        c();
    }

    public final void c() {
        int i7 = this.d + 1;
        this.d = i7;
        ArrayList arrayList = this.f8933a;
        if (i7 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.f8935c + 1;
        this.f8935c = i10;
        if (i10 >= arrayList.size()) {
            this.f8935c = 0;
        }
    }
}
