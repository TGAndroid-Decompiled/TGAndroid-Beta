package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.yj0;
public final class b9 extends FrameLayout {
    public final ArrayList f2880a;
    public ValueAnimator f2881b;
    public int f2882c;
    public int d;
    public final a3.d e;

    public b9(Context context, gb gbVar) {
        super(context);
        this.f2882c = -1;
        int i10 = 0;
        this.d = 0;
        this.e = new a3.d(this, 25);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        sk.j(20.0f, R.string.StoriesIntroHeader, 1, textView);
        linearLayout.addView(textView, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.z5.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f2880a = arrayList;
        arrayList.add(new a9(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new a9(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new a9(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new a9(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = gbVar.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a9 a9Var = (a9) obj;
            TextPaint textPaint = a9Var.e;
            String str = a9Var.f2834a;
            int length = str.length();
            Rect rect = a9Var.f2839r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = a9Var.f2837f;
            String str2 = a9Var.f2835b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > gbVar.getMeasuredWidth() ? gbVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f2880a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((a9) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        sk.j(14.0f, R.string.StoriesIntroDismiss, 1, textView3);
        linearLayout.addView(textView3, w7.z5.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(gbVar, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new z8(this, textView3, gbVar, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f2881b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2881b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f2881b.setDuration(350L);
        this.f2881b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f2881b.getCurrentPlayTime();
        this.f2881b.addListener(new ah.b(this, 12));
        this.f2881b.addUpdateListener(new ah.c0(this, 13));
        this.f2881b.start();
        AndroidUtilities.runOnUIThread(this.e, (((a9) this.f2880a.get(this.d)).f2836c.r() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        ValueAnimator valueAnimator = this.f2881b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2881b = null;
        }
        int i10 = this.f2882c;
        ArrayList arrayList = this.f2880a;
        if (i10 != -1) {
            a9 a9Var = (a9) arrayList.get(i10);
            yj0 yj0Var = a9Var.f2836c;
            yj0Var.M(0);
            yj0Var.stop();
            a9Var.f2838n = 0.0f;
            a9Var.invalidate();
        }
        a9 a9Var2 = (a9) arrayList.get(this.d);
        yj0 yj0Var2 = a9Var2.f2836c;
        yj0Var2.M(0);
        yj0Var2.stop();
        a9Var2.f2838n = 0.0f;
        a9Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f2880a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f2882c + 1;
        this.f2882c = i11;
        if (i11 >= arrayList.size()) {
            this.f2882c = 0;
        }
    }
}
