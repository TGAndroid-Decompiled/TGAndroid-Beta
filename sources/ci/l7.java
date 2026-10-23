package ci;

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
import org.telegram.messenger.sl;
import org.telegram.ui.Components.yj0;
public final class l7 extends FrameLayout {
    public final ArrayList f5526a;
    public ValueAnimator f5527b;
    public int f5528c;
    public int d;
    public final androidx.fragment.app.d e;

    public l7(Context context, n9 n9Var) {
        super(context);
        this.f5528c = -1;
        int i10 = 0;
        this.d = 0;
        this.e = new androidx.fragment.app.d(this, 18);
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
        sl.n(R.string.StoriesIntroHeader, textView, 1, 20.0f);
        linearLayout.addView(textView, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.z5.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f5526a = arrayList;
        arrayList.add(new k7(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new k7(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new k7(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new k7(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = n9Var.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            k7 k7Var = (k7) obj;
            TextPaint textPaint = k7Var.e;
            String str = k7Var.f5497a;
            int length = str.length();
            Rect rect = k7Var.f5502r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = k7Var.f5500f;
            String str2 = k7Var.f5498b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > n9Var.getMeasuredWidth() ? n9Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f5526a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((k7) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        sl.n(R.string.StoriesIntroDismiss, textView3, 1, 14.0f);
        linearLayout.addView(textView3, w7.z5.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(n9Var, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new j7(this, textView3, n9Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f5527b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5527b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f5527b.setDuration(350L);
        this.f5527b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5527b.getCurrentPlayTime();
        this.f5527b.addListener(new ah.b(this, 14));
        this.f5527b.addUpdateListener(new ah.c0(this, 20));
        this.f5527b.start();
        AndroidUtilities.runOnUIThread(this.e, (((k7) this.f5526a.get(this.d)).f5499c.r() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        ValueAnimator valueAnimator = this.f5527b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5527b = null;
        }
        int i10 = this.f5528c;
        ArrayList arrayList = this.f5526a;
        if (i10 != -1) {
            k7 k7Var = (k7) arrayList.get(i10);
            yj0 yj0Var = k7Var.f5499c;
            yj0Var.M(0);
            yj0Var.stop();
            k7Var.f5501n = 0.0f;
            k7Var.invalidate();
        }
        k7 k7Var2 = (k7) arrayList.get(this.d);
        yj0 yj0Var2 = k7Var2.f5499c;
        yj0Var2.M(0);
        yj0Var2.stop();
        k7Var2.f5501n = 0.0f;
        k7Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f5526a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f5528c + 1;
        this.f5528c = i11;
        if (i11 >= arrayList.size()) {
            this.f5528c = 0;
        }
    }
}
