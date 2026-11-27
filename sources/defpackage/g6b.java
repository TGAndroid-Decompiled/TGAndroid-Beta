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
public final class g6b extends FrameLayout {
    public final ArrayList a;
    public ValueAnimator b;
    public int c;
    public int d;
    public final uoa e;

    public g6b(Context context, ybb ybbVar) {
        super(context);
        this.c = -1;
        int i = 0;
        this.d = 0;
        this.e = new uoa(this, (byte) 23);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, hl.L(48.0f), 0, hl.L(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131744420, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, tre.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(ob6.M0(2131744417, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, tre.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.a = arrayList;
        arrayList.add(new f6b(context, 2131624227, ob6.M0(2131744424, null), ob6.M0(2131744423, null)));
        arrayList.add(new f6b(context, 2131624229, ob6.M0(2131744419, null), ob6.M0(2131744418, null)));
        arrayList.add(new f6b(context, 2131624226, ob6.M0(2131744426, null), ob6.M0(2131744425, null)));
        arrayList.add(new f6b(context, 2131624228, ob6.M0(2131744422, null), ob6.M0(2131744421, null)));
        int measuredWidth = ybbVar.getMeasuredWidth() - hl.L(100.0f);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            f6b f6bVar = (f6b) obj;
            TextPaint textPaint = f6bVar.e;
            String str = f6bVar.a;
            int length = str.length();
            Rect rect = f6bVar.r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = f6bVar.f;
            String str2 = f6bVar.b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + hl.L(8.0f) + hl.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(hl.L(8.0f) + measuredWidth > ybbVar.getMeasuredWidth() ? ybbVar.getMeasuredWidth() - hl.L(8.0f) : measuredWidth, hl.L(64.0f));
        layoutParams.setMargins(0, hl.L(5.0f), 0, hl.L(5.0f));
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            linearLayout.addView((f6b) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(hl.o());
        textView3.setText(ob6.M0(2131744427, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, tre.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, tre.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), hl.h2(12.0f, 10, ybbVar));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new e6b(this, textView3, ybbVar, textView2));
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
        this.b.addListener(new po9(this, (byte) 25));
        this.b.addUpdateListener(new ija(this, (byte) 15));
        this.b.start();
        hl.d3(this.e, (((f6b) this.a.get(this.d)).c.m() << 1) + 100);
    }

    public final void b() {
        hl.r(this.e);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != -1) {
            f6b f6bVar = (f6b) arrayList.get(i);
            b29 b29Var = f6bVar.c;
            b29Var.H(0);
            b29Var.stop();
            f6bVar.n = 0.0f;
            f6bVar.invalidate();
        }
        f6b f6bVar2 = (f6b) arrayList.get(this.d);
        b29 b29Var2 = f6bVar2.c;
        b29Var2.H(0);
        b29Var2.stop();
        f6bVar2.n = 0.0f;
        f6bVar2.invalidate();
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
