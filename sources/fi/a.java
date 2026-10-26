package fi;

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ar;
public final class a extends View implements org.telegram.ui.ActionBar.p6 {
    public final ImageReceiver f10487a;
    public final String f10488b;
    public final String f10489c;
    public final TextPaint d;
    public StaticLayout e;
    public float f10490f;
    public float h;
    public final TextPaint f10491n;
    public StaticLayout f10492r;
    public float f10493s;
    public float v;
    public final org.telegram.ui.ActionBar.u6 f10494w;

    public a(Context context, MediaController.PhotoEntry photoEntry, String str, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10487a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f10491n = textPaint2;
        this.f10494w = u6Var;
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.y6.M0(false));
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f10488b = str4;
        this.f10489c = ic.a.i(i10, "");
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        ar arVar = new ar(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        arVar.f26599w = false;
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(18.0f);
        arVar.e = dp;
        arVar.f26595f = dp2;
        if (photoEntry != null && (str2 = photoEntry.thumbPath) != null) {
            imageReceiver.setImage(ImageLocation.getForPath(str2), "30.0_30.0", (ImageLocation) null, (String) null, arVar, (Object) null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, arVar, (Object) null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, arVar, (Object) null, 0);
            }
        } else {
            imageReceiver.setImageBitmap(arVar);
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
        ImageReceiver imageReceiver = this.f10487a;
        imageReceiver.setImageCoords(paddingLeft, (getMeasuredHeight() - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        imageReceiver.draw(canvas);
        float dp = paddingLeft + AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f);
        if (this.e != null) {
            canvas.save();
            canvas.translate(dp - this.h, (getMeasuredHeight() - this.e.getHeight()) / 2.0f);
            this.e.draw(canvas);
            dp = dp + this.f10490f + AndroidUtilities.dp(6.0f);
            canvas.restore();
        }
        if (this.f10492r != null) {
            canvas.save();
            canvas.translate(dp - this.v, AndroidUtilities.dpf2(1.6f) + ((getMeasuredHeight() - this.f10492r.getHeight()) / 2.0f));
            this.f10492r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10487a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10487a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        float f11;
        int size = (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f10488b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f7 = this.e.getLineLeft(0);
            } else {
                f7 = 0.0f;
            }
            this.h = f7;
            if (this.e.getLineCount() > 0) {
                f10 = this.e.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f10490f = f10;
            int dp = size - ((int) (f10 + AndroidUtilities.dp(8.0f)));
            TextPaint textPaint2 = this.f10491n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f10489c, textPaint2, dp, truncateAt), textPaint2, Math.max(0, dp), alignment, 1.0f, 0.0f, false);
            this.f10492r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f11 = this.f10492r.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.v = f11;
            if (this.f10492r.getLineCount() > 0) {
                f12 = this.f10492r.getLineWidth(0);
            }
            this.f10493s = f12;
        }
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(30.0f) + getPaddingLeft() + this.f10490f + AndroidUtilities.dp(8.0f) + this.f10493s + getPaddingRight(), View.MeasureSpec.getSize(i10)), AndroidUtilities.dp(48.0f));
        } else if (View.MeasureSpec.getMode(i10) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(48.0f));
        }
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f10491n;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.f10494w);
            this.d.setColor(w02);
            textPaint.setColor(w02);
            textPaint.setAlpha(102);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
