package fi;

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
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.oh0;
public final class t6 extends FrameLayout {
    public final ArrayList f12626a;
    public ValueAnimator f12627b;
    public int f12628c;
    public int d;
    public final f2.a f12629e;

    public t6(Context context, t8 t8Var) {
        super(context);
        this.f12628c = -1;
        int i7 = 0;
        this.d = 0;
        this.f12629e = new f2.a(this, 14);
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
        textView.setText(hd.N0(2131744520, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, ma.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(hd.N0(2131744517, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, ma.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f12626a = arrayList;
        arrayList.add(new s6(context, 2131624233, hd.N0(2131744524, null), hd.N0(2131744523, null)));
        arrayList.add(new s6(context, 2131624235, hd.N0(2131744519, null), hd.N0(2131744518, null)));
        arrayList.add(new s6(context, 2131624232, hd.N0(2131744526, null), hd.N0(2131744525, null)));
        arrayList.add(new s6(context, 2131624234, hd.N0(2131744522, null), hd.N0(2131744521, null)));
        int measuredWidth = t8Var.getMeasuredWidth() - org.telegram.messenger.g0.L(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s6 s6Var = (s6) obj;
            TextPaint textPaint = s6Var.f12570e;
            String str = s6Var.f12567a;
            int length = str.length();
            Rect rect = s6Var.f12573r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = s6Var.f12571f;
            String str2 = s6Var.f12568b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(8.0f) + measuredWidth > t8Var.getMeasuredWidth() ? t8Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f) : measuredWidth, org.telegram.messenger.g0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        ArrayList arrayList2 = this.f12626a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            linearLayout.addView((s6) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(hd.N0(2131744527, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, ma.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, ma.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, t8Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new r6(this, textView3, t8Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f12627b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12627b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f12627b.setDuration(350L);
        this.f12627b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f12627b.getCurrentPlayTime();
        this.f12627b.addListener(new ai.k0(this, 16));
        this.f12627b.addUpdateListener(new ah.g(this, 23));
        this.f12627b.start();
        org.telegram.messenger.g0.h3(this.f12629e, (((s6) this.f12626a.get(this.d)).f12569c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.g0.r(this.f12629e);
        ValueAnimator valueAnimator = this.f12627b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12627b = null;
        }
        int i7 = this.f12628c;
        ArrayList arrayList = this.f12626a;
        if (i7 != -1) {
            s6 s6Var = (s6) arrayList.get(i7);
            oh0 oh0Var = s6Var.f12569c;
            oh0Var.M(0);
            oh0Var.stop();
            s6Var.f12572n = 0.0f;
            s6Var.invalidate();
        }
        s6 s6Var2 = (s6) arrayList.get(this.d);
        oh0 oh0Var2 = s6Var2.f12569c;
        oh0Var2.M(0);
        oh0Var2.stop();
        s6Var2.f12572n = 0.0f;
        s6Var2.invalidate();
        c();
    }

    public final void c() {
        int i7 = this.d + 1;
        this.d = i7;
        ArrayList arrayList = this.f12626a;
        if (i7 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.f12628c + 1;
        this.f12628c = i10;
        if (i10 >= arrayList.size()) {
            this.f12628c = 0;
        }
    }
}
