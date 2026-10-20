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
import org.telegram.messenger.mk;
import org.telegram.ui.Components.vj0;
public final class m7 extends FrameLayout {
    public final ArrayList f5620a;
    public ValueAnimator f5621b;
    public int f5622c;
    public int d;
    public final androidx.fragment.app.d e;

    public m7(Context context, o9 o9Var) {
        super(context);
        this.f5622c = -1;
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
        mk.j(20.0f, R.string.StoriesIntroHeader, 1, textView);
        linearLayout.addView(textView, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.z5.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f5620a = arrayList;
        arrayList.add(new l7(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new l7(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new l7(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new l7(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = o9Var.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            l7 l7Var = (l7) obj;
            TextPaint textPaint = l7Var.e;
            String str = l7Var.f5589a;
            int length = str.length();
            Rect rect = l7Var.f5594r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = l7Var.f5592f;
            String str2 = l7Var.f5590b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > o9Var.getMeasuredWidth() ? o9Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f5620a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((l7) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        mk.j(14.0f, R.string.StoriesIntroDismiss, 1, textView3);
        linearLayout.addView(textView3, w7.z5.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(o9Var, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new k7(this, textView3, o9Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f5621b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5621b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f5621b.setDuration(350L);
        this.f5621b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5621b.getCurrentPlayTime();
        this.f5621b.addListener(new ah.b(this, 14));
        this.f5621b.addUpdateListener(new ah.c0(this, 20));
        this.f5621b.start();
        AndroidUtilities.runOnUIThread(this.e, (((l7) this.f5620a.get(this.d)).f5591c.r() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        ValueAnimator valueAnimator = this.f5621b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5621b = null;
        }
        int i10 = this.f5622c;
        ArrayList arrayList = this.f5620a;
        if (i10 != -1) {
            l7 l7Var = (l7) arrayList.get(i10);
            vj0 vj0Var = l7Var.f5591c;
            vj0Var.M(0);
            vj0Var.stop();
            l7Var.f5593n = 0.0f;
            l7Var.invalidate();
        }
        l7 l7Var2 = (l7) arrayList.get(this.d);
        vj0 vj0Var2 = l7Var2.f5591c;
        vj0Var2.M(0);
        vj0Var2.stop();
        l7Var2.f5593n = 0.0f;
        l7Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f5620a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f5622c + 1;
        this.f5622c = i11;
        if (i11 >= arrayList.size()) {
            this.f5622c = 0;
        }
    }
}
