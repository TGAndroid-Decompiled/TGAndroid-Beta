package jh;

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
import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oi0;

public final class w6 extends FrameLayout {

    public final ArrayList f14095a;

    public ValueAnimator f14096b;

    public int f14097c;
    public int d;

    public final y9 f14098e;

    public w6(Context context, w8 w8Var) {
        super(context);
        this.f14097c = -1;
        int i10 = 0;
        this.d = 0;
        this.f14098e = new y9(this, 19);
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
        linearLayout.addView(textView, h7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, h7.z5.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f14095a = arrayList;
        arrayList.add(new v6(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new v6(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new v6(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new v6(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = w8Var.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            v6 v6Var = (v6) obj;
            TextPaint textPaint = v6Var.f14053e;
            String str = v6Var.f14050a;
            int length = str.length();
            Rect rect = v6Var.f14056r;
            textPaint.getTextBounds(str, 0, length, rect);
            int iWidth = rect.width();
            TextPaint textPaint2 = v6Var.f14054f;
            String str2 = v6Var.f14051b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int iMax = Math.max(iWidth, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (iMax > measuredWidth) {
                measuredWidth = iMax;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > w8Var.getMeasuredWidth() ? w8Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f14095a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((v6) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.StoriesIntroDismiss));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, h7.z5.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, h7.z5.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(w8Var, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new u6(this, textView3, w8Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f14096b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14096b = valueAnimatorOfFloat;
        if (z10) {
            valueAnimatorOfFloat.setStartDelay(50L);
        }
        this.f14096b.setDuration(350L);
        this.f14096b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f14096b.getCurrentPlayTime();
        this.f14096b.addListener(new ag.r1(this, 20));
        this.f14096b.addUpdateListener(new ag.u(this, 25));
        this.f14096b.start();
        AndroidUtilities.runOnUIThread(this.f14098e, (((v6) this.f14095a.get(this.d)).f14052c.p() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.f14098e);
        ValueAnimator valueAnimator = this.f14096b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14096b = null;
        }
        int i10 = this.f14097c;
        ArrayList arrayList = this.f14095a;
        if (i10 != -1) {
            v6 v6Var = (v6) arrayList.get(i10);
            oi0 oi0Var = v6Var.f14052c;
            oi0Var.K(0);
            oi0Var.stop();
            v6Var.f14055n = 0.0f;
            v6Var.invalidate();
        }
        v6 v6Var2 = (v6) arrayList.get(this.d);
        oi0 oi0Var2 = v6Var2.f14052c;
        oi0Var2.K(0);
        oi0Var2.stop();
        v6Var2.f14055n = 0.0f;
        v6Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f14095a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f14097c + 1;
        this.f14097c = i11;
        if (i11 >= arrayList.size()) {
            this.f14097c = 0;
        }
    }
}
