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
import org.telegram.ui.Components.xi0;
public final class y8 extends FrameLayout {
    public final ArrayList f4020a;
    public ValueAnimator f4021b;
    public int f4022c;
    public int d;
    public final a3.c f4023e;

    public y8(Context context, db dbVar) {
        super(context);
        this.f4022c = -1;
        int i10 = 0;
        this.d = 0;
        this.f4023e = new a3.c(this, 24);
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
        linearLayout.addView(textView, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(LocaleController.getString(R.string.StoriesIntroSubHeader));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.x5.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f4020a = arrayList;
        arrayList.add(new x8(context, R.raw.stories_intro_go_forward, LocaleController.getString(R.string.StoriesIntroGoForwardHeader), LocaleController.getString(R.string.StoriesIntroGoForwardSubHeader)));
        arrayList.add(new x8(context, R.raw.stories_intro_pause, LocaleController.getString(R.string.StoriesIntroPauseAndSeekHeader), LocaleController.getString(R.string.StoriesIntroPauseAndSeekSubHeader)));
        arrayList.add(new x8(context, R.raw.stories_intro_go_back, LocaleController.getString(R.string.StoriesIntroGoBackHeader), LocaleController.getString(R.string.StoriesIntroGoBackSubHeader)));
        arrayList.add(new x8(context, R.raw.stories_intro_go_to_next, LocaleController.getString(R.string.StoriesIntroGoToNextAuthorHeader), LocaleController.getString(R.string.StoriesIntroGoToNextAuthorSubHeader)));
        int measuredWidth = dbVar.getMeasuredWidth() - AndroidUtilities.dp(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x8 x8Var = (x8) obj;
            TextPaint textPaint = x8Var.f3993e;
            String str = x8Var.f3990a;
            int length = str.length();
            Rect rect = x8Var.f3996r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = x8Var.f3994f;
            String str2 = x8Var.f3991b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(8.0f) + measuredWidth > dbVar.getMeasuredWidth() ? dbVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f) : measuredWidth, AndroidUtilities.dp(64.0f));
        layoutParams.setMargins(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        ArrayList arrayList2 = this.f4020a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((x8) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.StoriesIntroDismiss));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, w7.x5.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.x5.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), AndroidUtilities.makeBlurBitmap(dbVar, 12.0f, 10));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new w8(this, textView3, dbVar, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f4021b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4021b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f4021b.setDuration(350L);
        this.f4021b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f4021b.getCurrentPlayTime();
        this.f4021b.addListener(new ah.b(this, 12));
        this.f4021b.addUpdateListener(new ah.d0(this, 13));
        this.f4021b.start();
        AndroidUtilities.runOnUIThread(this.f4023e, (((x8) this.f4020a.get(this.d)).f3992c.p() * 2) + 100);
    }

    public final void b() {
        AndroidUtilities.cancelRunOnUIThread(this.f4023e);
        ValueAnimator valueAnimator = this.f4021b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4021b = null;
        }
        int i10 = this.f4022c;
        ArrayList arrayList = this.f4020a;
        if (i10 != -1) {
            x8 x8Var = (x8) arrayList.get(i10);
            xi0 xi0Var = x8Var.f3992c;
            xi0Var.K(0);
            xi0Var.stop();
            x8Var.f3995n = 0.0f;
            x8Var.invalidate();
        }
        x8 x8Var2 = (x8) arrayList.get(this.d);
        xi0 xi0Var2 = x8Var2.f3992c;
        xi0Var2.K(0);
        xi0Var2.stop();
        x8Var2.f3995n = 0.0f;
        x8Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f4020a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f4022c + 1;
        this.f4022c = i11;
        if (i11 >= arrayList.size()) {
            this.f4022c = 0;
        }
    }
}
