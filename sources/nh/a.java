package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jq;
public final class a extends View {
    public final ImageReceiver f17362a;
    public final String f17363b;
    public final String f17364c;
    public final TextPaint d;
    public StaticLayout f17365e;
    public float f17366f;
    public float h;
    public final TextPaint f17367n;
    public StaticLayout f17368r;
    public float f17369s;
    public float v;

    public a(Context context, MediaController.PhotoEntry photoEntry, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17362a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f17367n = textPaint2;
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f17363b = str4;
        this.f17364c = j7.l1.k(i10, "");
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        jq jqVar = new jq(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        jqVar.f29792w = false;
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(18.0f);
        jqVar.f29787e = dp;
        jqVar.f29788f = dp2;
        if (photoEntry != null && (str2 = photoEntry.thumbPath) != null) {
            imageReceiver.setImage(ImageLocation.getForPath(str2), "30.0_30.0", (ImageLocation) null, (String) null, jqVar, (Object) null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, jqVar, (Object) null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, jqVar, (Object) null, 0);
            }
        } else {
            imageReceiver.setImageBitmap(jqVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i10 > 0) {
            str3 = " " + LocaleController.formatPluralStringComma("Media", i10);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.f17362a;
        imageReceiver.setImageCoords(paddingLeft, (getMeasuredHeight() - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        imageReceiver.draw(canvas);
        float dp = paddingLeft + AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f);
        if (this.f17365e != null) {
            canvas.save();
            canvas.translate(dp - this.h, (getMeasuredHeight() - this.f17365e.getHeight()) / 2.0f);
            this.f17365e.draw(canvas);
            dp = dp + this.f17366f + AndroidUtilities.dp(6.0f);
            canvas.restore();
        }
        if (this.f17368r != null) {
            canvas.save();
            canvas.translate(dp - this.v, AndroidUtilities.dpf2(1.6f) + ((getMeasuredHeight() - this.f17368r.getHeight()) / 2.0f));
            this.f17368r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17362a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17362a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        float f10;
        float f11;
        int size = (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.f17365e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f17363b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.f17365e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f9 = this.f17365e.getLineLeft(0);
            } else {
                f9 = 0.0f;
            }
            this.h = f9;
            if (this.f17365e.getLineCount() > 0) {
                f10 = this.f17365e.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f17366f = f10;
            int dp = size - ((int) (f10 + AndroidUtilities.dp(8.0f)));
            TextPaint textPaint2 = this.f17367n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f17364c, textPaint2, dp, truncateAt), textPaint2, Math.max(0, dp), alignment, 1.0f, 0.0f, false);
            this.f17368r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f11 = this.f17368r.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.v = f11;
            if (this.f17368r.getLineCount() > 0) {
                f12 = this.f17368r.getLineWidth(0);
            }
            this.f17369s = f12;
        }
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(30.0f) + getPaddingLeft() + this.f17366f + AndroidUtilities.dp(8.0f) + this.f17369s + getPaddingRight(), View.MeasureSpec.getSize(i10)), AndroidUtilities.dp(48.0f));
        } else if (View.MeasureSpec.getMode(i10) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(48.0f));
        }
    }
}
