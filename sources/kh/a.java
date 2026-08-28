package kh;

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
import org.telegram.ui.Components.fq;
public final class a extends View {
    public final ImageReceiver f14838a;
    public final String f14839b;
    public final String f14840c;
    public final TextPaint d;
    public StaticLayout f14841e;
    public float f14842f;
    public float h;
    public final TextPaint f14843n;
    public StaticLayout f14844r;
    public float f14845s;
    public float v;

    public a(Context context, MediaController.PhotoEntry photoEntry, String str, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f14838a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f14843n = textPaint2;
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.f6.K0(false));
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f14839b = str4;
        this.f14840c = j3.r0.l(i9, "");
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        fq fqVar = new fq(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        fqVar.f28550w = false;
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(18.0f);
        fqVar.f28545e = dp;
        fqVar.f28546f = dp2;
        if (photoEntry != null && (str2 = photoEntry.thumbPath) != null) {
            imageReceiver.setImage(ImageLocation.getForPath(str2), "30.0_30.0", (ImageLocation) null, (String) null, fqVar, (Object) null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, fqVar, (Object) null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, fqVar, (Object) null, 0);
            }
        } else {
            imageReceiver.setImageBitmap(fqVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i9 > 0) {
            str3 = " " + LocaleController.formatPluralStringComma("Media", i9);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.f14838a;
        imageReceiver.setImageCoords(paddingLeft, (getMeasuredHeight() - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        imageReceiver.draw(canvas);
        float dp = paddingLeft + AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f);
        if (this.f14841e != null) {
            canvas.save();
            canvas.translate(dp - this.h, (getMeasuredHeight() - this.f14841e.getHeight()) / 2.0f);
            this.f14841e.draw(canvas);
            dp = dp + this.f14842f + AndroidUtilities.dp(6.0f);
            canvas.restore();
        }
        if (this.f14844r != null) {
            canvas.save();
            canvas.translate(dp - this.v, AndroidUtilities.dpf2(1.6f) + ((getMeasuredHeight() - this.f14844r.getHeight()) / 2.0f));
            this.f14844r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14838a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14838a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        float f11;
        float f12;
        int size = (((View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.f14841e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f14839b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.f14841e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f13 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f14841e.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.h = f10;
            if (this.f14841e.getLineCount() > 0) {
                f11 = this.f14841e.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.f14842f = f11;
            int dp = size - ((int) (f11 + AndroidUtilities.dp(8.0f)));
            TextPaint textPaint2 = this.f14843n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f14840c, textPaint2, dp, truncateAt), textPaint2, Math.max(0, dp), alignment, 1.0f, 0.0f, false);
            this.f14844r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f12 = this.f14844r.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.v = f12;
            if (this.f14844r.getLineCount() > 0) {
                f13 = this.f14844r.getLineWidth(0);
            }
            this.f14845s = f13;
        }
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(30.0f) + getPaddingLeft() + this.f14842f + AndroidUtilities.dp(8.0f) + this.f14845s + getPaddingRight(), View.MeasureSpec.getSize(i9)), AndroidUtilities.dp(48.0f));
        } else if (View.MeasureSpec.getMode(i9) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(48.0f));
        }
    }
}
