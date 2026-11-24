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
public final class k2b extends FrameLayout {
    public final ArrayList a;
    public ValueAnimator b;
    public int c;
    public int d;
    public final kya e;

    public k2b(Context context, a8b a8bVar) {
        super(context);
        this.c = -1;
        int i = 0;
        this.d = 0;
        this.e = new kya(this, (byte) 6);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gl.L(48.0f), 0, gl.L(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131744526, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, nme.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(k96.M0(2131744523, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, nme.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.a = arrayList;
        arrayList.add(new j2b(context, 2131624228, k96.M0(2131744530, null), k96.M0(2131744529, null)));
        arrayList.add(new j2b(context, 2131624230, k96.M0(2131744525, null), k96.M0(2131744524, null)));
        arrayList.add(new j2b(context, 2131624227, k96.M0(2131744532, null), k96.M0(2131744531, null)));
        arrayList.add(new j2b(context, 2131624229, k96.M0(2131744528, null), k96.M0(2131744527, null)));
        int measuredWidth = a8bVar.getMeasuredWidth() - gl.L(100.0f);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j2b j2bVar = (j2b) obj;
            TextPaint textPaint = j2bVar.e;
            String str = j2bVar.a;
            int length = str.length();
            Rect rect = j2bVar.r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = j2bVar.f;
            String str2 = j2bVar.b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + gl.L(8.0f) + gl.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gl.L(8.0f) + measuredWidth > a8bVar.getMeasuredWidth() ? a8bVar.getMeasuredWidth() - gl.L(8.0f) : measuredWidth, gl.L(64.0f));
        layoutParams.setMargins(0, gl.L(5.0f), 0, gl.L(5.0f));
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            linearLayout.addView((j2b) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(gl.o());
        textView3.setText(k96.M0(2131744533, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, nme.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, nme.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), gl.h2(12.0f, 10, a8bVar));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new i2b(this, textView3, a8bVar, textView2));
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
        this.b.addListener(new ng9(this, (byte) 26));
        this.b.addUpdateListener(new gja(this, (byte) 13));
        this.b.start();
        gl.e3(this.e, (((j2b) this.a.get(this.d)).c.m() << 1) + 100);
    }

    public final void b() {
        gl.r(this.e);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != -1) {
            j2b j2bVar = (j2b) arrayList.get(i);
            oy8 oy8Var = j2bVar.c;
            oy8Var.H(0);
            oy8Var.stop();
            j2bVar.n = 0.0f;
            j2bVar.invalidate();
        }
        j2b j2bVar2 = (j2b) arrayList.get(this.d);
        oy8 oy8Var2 = j2bVar2.c;
        oy8Var2.H(0);
        oy8Var2.stop();
        j2bVar2.n = 0.0f;
        j2bVar2.invalidate();
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
