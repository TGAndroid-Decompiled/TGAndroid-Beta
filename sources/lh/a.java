package lh;

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
import org.telegram.ui.Components.dq;

public final class a extends View {

    public final ImageReceiver f15616a;

    public final String f15617b;

    public final String f15618c;
    public final TextPaint d;

    public StaticLayout f15619e;

    public float f15620f;
    public float h;

    public final TextPaint f15621n;

    public StaticLayout f15622r;

    public float f15623s;
    public float v;

    public a(Context context, MediaController.PhotoEntry photoEntry, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f15616a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f15621n = textPaint2;
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
        this.f15617b = str4;
        this.f15618c = i0.a.k(i10, "");
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        dq dqVar = new dq(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), -13750737), drawableMutate);
        dqVar.f27828w = false;
        int iDp = AndroidUtilities.dp(18.0f);
        int iDp2 = AndroidUtilities.dp(18.0f);
        dqVar.f27823e = iDp;
        dqVar.f27824f = iDp2;
        if (photoEntry != null && (str2 = photoEntry.thumbPath) != null) {
            imageReceiver.setImage(ImageLocation.getForPath(str2), "30.0_30.0", (ImageLocation) null, (String) null, dqVar, (Object) null, 0);
        } else if (photoEntry == null || photoEntry.path == null) {
            imageReceiver.setImageBitmap(dqVar);
        } else if (photoEntry.isVideo) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, dqVar, (Object) null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, dqVar, (Object) null, 0);
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
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(30.0f)) / 2.0f;
        float fDp = AndroidUtilities.dp(30.0f);
        float fDp2 = AndroidUtilities.dp(30.0f);
        ImageReceiver imageReceiver = this.f15616a;
        imageReceiver.setImageCoords(paddingLeft, measuredHeight, fDp, fDp2);
        imageReceiver.draw(canvas);
        float fDp3 = paddingLeft + AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f);
        if (this.f15619e != null) {
            canvas.save();
            canvas.translate(fDp3 - this.h, (getMeasuredHeight() - this.f15619e.getHeight()) / 2.0f);
            this.f15619e.draw(canvas);
            fDp3 = fDp3 + this.f15620f + AndroidUtilities.dp(6.0f);
            canvas.restore();
        }
        if (this.f15622r != null) {
            canvas.save();
            canvas.translate(fDp3 - this.v, AndroidUtilities.dpf2(1.6f) + ((getMeasuredHeight() - this.f15622r.getHeight()) / 2.0f));
            this.f15622r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15616a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15616a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.f15619e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f15617b;
            TextPaint textPaint = this.d;
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int iMax = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(charSequenceEllipsize, textPaint, iMax, alignment, 1.0f, 0.0f, false);
            this.f15619e = staticLayout2;
            this.h = staticLayout2.getLineCount() > 0 ? this.f15619e.getLineLeft(0) : 0.0f;
            float lineWidth = this.f15619e.getLineCount() > 0 ? this.f15619e.getLineWidth(0) : 0.0f;
            this.f15620f = lineWidth;
            int iDp = size - ((int) (lineWidth + AndroidUtilities.dp(8.0f)));
            TextPaint textPaint2 = this.f15621n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f15618c, textPaint2, iDp, truncateAt), textPaint2, Math.max(0, iDp), alignment, 1.0f, 0.0f, false);
            this.f15622r = staticLayout3;
            this.v = staticLayout3.getLineCount() > 0 ? this.f15622r.getLineLeft(0) : 0.0f;
            this.f15623s = this.f15622r.getLineCount() > 0 ? this.f15622r.getLineWidth(0) : 0.0f;
        }
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(30.0f) + getPaddingLeft() + this.f15620f + AndroidUtilities.dp(8.0f) + this.f15623s + getPaddingRight(), View.MeasureSpec.getSize(i10)), AndroidUtilities.dp(48.0f));
        } else if (View.MeasureSpec.getMode(i10) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(48.0f));
        }
    }
}
