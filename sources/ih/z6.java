package ih;

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
import org.telegram.ui.Components.mi0;
public final class z6 extends FrameLayout {
    public final ArrayList f12376a;
    public ValueAnimator f12377b;
    public int f12378c;
    public int d;
    public final g f12379e;

    public z6(Context context, a9 a9Var) {
        super(context);
        this.f12378c = -1;
        int i9 = 0;
        this.d = 0;
        this.f12379e = new g(this, 12);
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
        linearLayout.addView(textView, g7.e6.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, g7.e6.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f12376a = arrayList;
        arrayList.add(new y6(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new y6(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new y6(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new y6(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = a9Var.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y6 y6Var = (y6) obj;
            TextPaint textPaint = y6Var.f12350e;
            String str = y6Var.f12347a;
            int length = str.length();
            Rect rect = y6Var.f12353r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = y6Var.f12351f;
            String str2 = y6Var.f12348b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > a9Var.getMeasuredWidth() ? a9Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f12376a;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            linearLayout.addView((y6) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.StoriesIntroDismiss));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, g7.e6.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, g7.e6.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(a9Var, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new x6(this, textView3, a9Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f12377b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12377b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f12377b.setDuration(350L);
        this.f12377b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f12377b.getCurrentPlayTime();
        this.f12377b.addListener(new ag.e(this, 18));
        this.f12377b.addUpdateListener(new bg.b(this, 22));
        this.f12377b.start();
        AndroidUtilities.runOnUIThread(this.f12379e, (((y6) this.f12376a.get(this.d)).f12349c.p() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.f12379e);
        ValueAnimator valueAnimator = this.f12377b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12377b = null;
        }
        int i9 = this.f12378c;
        ArrayList arrayList = this.f12376a;
        if (i9 != -1) {
            y6 y6Var = (y6) arrayList.get(i9);
            mi0 mi0Var = y6Var.f12349c;
            mi0Var.K(0);
            mi0Var.stop();
            y6Var.f12352n = 0.0f;
            y6Var.invalidate();
        }
        y6 y6Var2 = (y6) arrayList.get(this.d);
        mi0 mi0Var2 = y6Var2.f12349c;
        mi0Var2.K(0);
        mi0Var2.stop();
        y6Var2.f12352n = 0.0f;
        y6Var2.invalidate();
        c();
    }

    public final void c() {
        int i9 = this.d + 1;
        this.d = i9;
        ArrayList arrayList = this.f12376a;
        if (i9 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.f12378c + 1;
        this.f12378c = i10;
        if (i10 >= arrayList.size()) {
            this.f12378c = 0;
        }
    }
}
