package ai;

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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.dk0;
public final class q9 extends FrameLayout {
    public final ArrayList f1625a;
    public ValueAnimator f1626b;
    public int f1627c;
    public int d;
    public final a3.d f1628e;

    public q9(Context context, yb ybVar) {
        super(context);
        this.f1627c = -1;
        int i10 = 0;
        this.d = 0;
        this.f1628e = new a3.d(this, 14);
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
        ai.j(20.0f, R.string.StoriesIntroHeader, 1, textView);
        linearLayout.addView(textView, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.x5.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f1625a = arrayList;
        arrayList.add(new p9(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new p9(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new p9(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new p9(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = ybVar.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            p9 p9Var = (p9) obj;
            TextPaint textPaint = p9Var.f1582e;
            String str = p9Var.f1579a;
            int length = str.length();
            Rect rect = p9Var.f1585r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = p9Var.f1583f;
            String str2 = p9Var.f1580b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > ybVar.getMeasuredWidth() ? ybVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f1625a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((p9) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        ai.j(14.0f, R.string.StoriesIntroDismiss, 1, textView3);
        linearLayout.addView(textView3, w7.x5.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.x5.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(ybVar, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new o9(this, textView3, ybVar, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f1626b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1626b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f1626b.setDuration(350L);
        this.f1626b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f1626b.getCurrentPlayTime();
        this.f1626b.addListener(new b(this, 9));
        this.f1626b.addUpdateListener(new a(this, 12));
        this.f1626b.start();
        AndroidUtilities.runOnUIThread(this.f1628e, (((p9) this.f1625a.get(this.d)).f1581c.r() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.f1628e);
        ValueAnimator valueAnimator = this.f1626b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1626b = null;
        }
        int i10 = this.f1627c;
        ArrayList arrayList = this.f1625a;
        if (i10 != -1) {
            p9 p9Var = (p9) arrayList.get(i10);
            dk0 dk0Var = p9Var.f1581c;
            dk0Var.M(0);
            dk0Var.stop();
            p9Var.f1584n = 0.0f;
            p9Var.invalidate();
        }
        p9 p9Var2 = (p9) arrayList.get(this.d);
        dk0 dk0Var2 = p9Var2.f1581c;
        dk0Var2.M(0);
        dk0Var2.stop();
        p9Var2.f1584n = 0.0f;
        p9Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f1625a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f1627c + 1;
        this.f1627c = i11;
        if (i11 >= arrayList.size()) {
            this.f1627c = 0;
        }
    }
}
