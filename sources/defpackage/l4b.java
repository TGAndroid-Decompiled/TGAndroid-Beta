package defpackage;

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
import java.util.ArrayList;
public final class l4b extends FrameLayout {
    public final ArrayList a;
    public ValueAnimator b;
    public int c;
    public int d;
    public final nsa e;

    public l4b(Context context, cab cabVar) {
        super(context);
        this.c = -1;
        int i = 0;
        this.d = 0;
        this.e = new nsa(this, (byte) 14);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gm.L(48.0f), 0, gm.L(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131744452, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, qoe.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(jb6.M0(2131744449, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, qoe.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.a = arrayList;
        arrayList.add(new k4b(context, 2131624227, jb6.M0(2131744456, null), jb6.M0(2131744455, null)));
        arrayList.add(new k4b(context, 2131624229, jb6.M0(2131744451, null), jb6.M0(2131744450, null)));
        arrayList.add(new k4b(context, 2131624226, jb6.M0(2131744458, null), jb6.M0(2131744457, null)));
        arrayList.add(new k4b(context, 2131624228, jb6.M0(2131744454, null), jb6.M0(2131744453, null)));
        int measuredWidth = cabVar.getMeasuredWidth() - gm.L(100.0f);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            k4b k4bVar = (k4b) obj;
            TextPaint textPaint = k4bVar.e;
            String str = k4bVar.a;
            int length = str.length();
            Rect rect = k4bVar.r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = k4bVar.f;
            String str2 = k4bVar.b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + gm.L(8.0f) + gm.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm.L(8.0f) + measuredWidth > cabVar.getMeasuredWidth() ? cabVar.getMeasuredWidth() - gm.L(8.0f) : measuredWidth, gm.L(64.0f));
        layoutParams.setMargins(0, gm.L(5.0f), 0, gm.L(5.0f));
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            linearLayout.addView((k4b) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(gm.o());
        textView3.setText(jb6.M0(2131744459, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, qoe.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, qoe.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), gm.h2(12.0f, 10, cabVar));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new j4b(this, textView3, cabVar, textView2));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        if (z) {
            ofFloat.setStartDelay(50L);
        }
        this.b.setDuration(350L);
        this.b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.b.getCurrentPlayTime();
        this.b.addListener(new c39(this, (byte) 28));
        this.b.addUpdateListener(new rha(this, (byte) 15));
        this.b.start();
        gm.d3(this.e, (((k4b) this.a.get(this.d)).c.m() << 1) + 100);
    }

    public final void b() {
        gm.r(this.e);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != -1) {
            k4b k4bVar = (k4b) arrayList.get(i);
            p09 p09Var = k4bVar.c;
            p09Var.H(0);
            p09Var.stop();
            k4bVar.n = 0.0f;
            k4bVar.invalidate();
        }
        k4b k4bVar2 = (k4b) arrayList.get(this.d);
        p09 p09Var2 = k4bVar2.c;
        p09Var2.H(0);
        p09Var2.stop();
        k4bVar2.n = 0.0f;
        k4bVar2.invalidate();
        c();
    }

    public final void c() {
        int i = this.d + 1;
        this.d = i;
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            this.d = 0;
        }
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 >= arrayList.size()) {
            this.c = 0;
        }
    }
}
