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
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ch0;
public final class w6 extends FrameLayout {
    public final ArrayList f12466a;
    public ValueAnimator f12467b;
    public int f12468c;
    public int d;
    public final c1 f12469e;

    public w6(Context context, w8 w8Var) {
        super(context);
        this.f12468c = -1;
        int i7 = 0;
        this.d = 0;
        this.f12469e = new c1(this, 10);
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
        textView.setText(hd.M0(2131744763, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, ja.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(hd.M0(2131744760, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, ja.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f12466a = arrayList;
        arrayList.add(new v6(context, 2131624233, hd.M0(2131744767, null), hd.M0(2131744766, null)));
        arrayList.add(new v6(context, 2131624235, hd.M0(2131744762, null), hd.M0(2131744761, null)));
        arrayList.add(new v6(context, 2131624232, hd.M0(2131744769, null), hd.M0(2131744768, null)));
        arrayList.add(new v6(context, 2131624234, hd.M0(2131744765, null), hd.M0(2131744764, null)));
        int measuredWidth = w8Var.getMeasuredWidth() - org.telegram.messenger.g0.L(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v6 v6Var = (v6) obj;
            TextPaint textPaint = v6Var.f12423e;
            String str = v6Var.f12420a;
            int length = str.length();
            Rect rect = v6Var.f12426r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = v6Var.f12424f;
            String str2 = v6Var.f12421b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(8.0f) + measuredWidth > w8Var.getMeasuredWidth() ? w8Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f) : measuredWidth, org.telegram.messenger.g0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        ArrayList arrayList2 = this.f12466a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            linearLayout.addView((v6) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(hd.M0(2131744770, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, ja.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, ja.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, w8Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new u6(this, textView3, w8Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f12467b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12467b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f12467b.setDuration(350L);
        this.f12467b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f12467b.getCurrentPlayTime();
        this.f12467b.addListener(new ai.j0(this, 16));
        this.f12467b.addUpdateListener(new ah.h(this, 23));
        this.f12467b.start();
        org.telegram.messenger.g0.i3(this.f12469e, (((v6) this.f12466a.get(this.d)).f12422c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.g0.r(this.f12469e);
        ValueAnimator valueAnimator = this.f12467b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12467b = null;
        }
        int i7 = this.f12468c;
        ArrayList arrayList = this.f12466a;
        if (i7 != -1) {
            v6 v6Var = (v6) arrayList.get(i7);
            ch0 ch0Var = v6Var.f12422c;
            ch0Var.M(0);
            ch0Var.stop();
            v6Var.f12425n = 0.0f;
            v6Var.invalidate();
        }
        v6 v6Var2 = (v6) arrayList.get(this.d);
        ch0 ch0Var2 = v6Var2.f12422c;
        ch0Var2.M(0);
        ch0Var2.stop();
        v6Var2.f12425n = 0.0f;
        v6Var2.invalidate();
        c();
    }

    public final void c() {
        int i7 = this.d + 1;
        this.d = i7;
        ArrayList arrayList = this.f12466a;
        if (i7 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.f12468c + 1;
        this.f12468c = i10;
        if (i10 >= arrayList.size()) {
            this.f12468c = 0;
        }
    }
}
