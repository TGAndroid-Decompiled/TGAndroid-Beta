package nh;

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
import org.telegram.ui.Components.gj0;
public final class x6 extends FrameLayout {
    public final ArrayList f16039a;
    public ValueAnimator f16040b;
    public int f16041c;
    public int d;
    public final n5 e;

    public x6(Context context, w8 w8Var) {
        super(context);
        this.f16041c = -1;
        int i10 = 0;
        this.d = 0;
        this.e = new n5(this, 3);
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
        textView.setText(LocaleController.getString(R.string.StoriesIntroHeader));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, k7.b6.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, k7.b6.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f16039a = arrayList;
        arrayList.add(new w6(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new w6(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new w6(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new w6(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = w8Var.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            w6 w6Var = (w6) obj;
            TextPaint textPaint = w6Var.e;
            String str = w6Var.f16012a;
            int length = str.length();
            Rect rect = w6Var.f16017r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = w6Var.f16015f;
            String str2 = w6Var.f16013b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > w8Var.getMeasuredWidth() ? w8Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f16039a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((w6) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.StoriesIntroDismiss));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, k7.b6.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, k7.b6.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(w8Var, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new v6(this, textView3, w8Var, textView2));
    }

    public final void a(boolean z4) {
        ValueAnimator valueAnimator = this.f16040b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f16040b = ofFloat;
        if (z4) {
            ofFloat.setStartDelay(50L);
        }
        this.f16040b.setDuration(350L);
        this.f16040b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f16040b.getCurrentPlayTime();
        this.f16040b.addListener(new cg.l0(this, 24));
        this.f16040b.addUpdateListener(new e5(this, 1));
        this.f16040b.start();
        AndroidUtilities.runOnUIThread(this.e, (((w6) this.f16039a.get(this.d)).f16014c.p() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        ValueAnimator valueAnimator = this.f16040b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16040b = null;
        }
        int i10 = this.f16041c;
        ArrayList arrayList = this.f16039a;
        if (i10 != -1) {
            w6 w6Var = (w6) arrayList.get(i10);
            gj0 gj0Var = w6Var.f16014c;
            gj0Var.K(0);
            gj0Var.stop();
            w6Var.f16016n = 0.0f;
            w6Var.invalidate();
        }
        w6 w6Var2 = (w6) arrayList.get(this.d);
        gj0 gj0Var2 = w6Var2.f16014c;
        gj0Var2.K(0);
        gj0Var2.stop();
        w6Var2.f16016n = 0.0f;
        w6Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f16039a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f16041c + 1;
        this.f16041c = i11;
        if (i11 >= arrayList.size()) {
            this.f16041c = 0;
        }
    }
}
