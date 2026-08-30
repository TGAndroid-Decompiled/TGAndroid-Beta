package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.l4;
public final class q extends TextView {
    public final int f6736a;

    public q(Context context, int i10) {
        super(context);
        this.f6736a = i10;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f6736a) {
            case 0:
                return Button.class.getName();
            case 13:
                return Button.class.getName();
            case 14:
                return Button.class.getName();
            case 15:
                return Button.class.getName();
            case 16:
                return Button.class.getName();
            case 17:
                return Button.class.getName();
            case 18:
                return Button.class.getName();
            case 19:
                return Button.class.getName();
            case 20:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f6736a) {
            case 3:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, l4.f35918o1);
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f6736a) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 9:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int i12 = 0;
                    for (int i13 = 0; i13 < layout.getLineCount(); i13++) {
                        i12 = Math.max(i12, (int) Math.ceil(layout.getLineWidth(i13)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i12, 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 10:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int i14 = 0;
                    for (int i15 = 0; i15 < layout2.getLineCount(); i15++) {
                        i14 = Math.max(i14, (int) Math.ceil(layout2.getLineWidth(i15)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i14, 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 11:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int i16 = 0;
                    for (int i17 = 0; i17 < layout3.getLineCount(); i17++) {
                        i16 = Math.max(i16, (int) Math.ceil(layout3.getLineWidth(i17)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i16, 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), (int) (AndroidUtilities.displaySize.x * 0.45f)), Integer.MIN_VALUE), i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() > 1) {
                        int i18 = 0;
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            i18 = Math.max(i18, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(i18 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | 1073741824, 1073741824 | getMeasuredHeight());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                super.onMeasure(i10, i11);
                return;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                return;
            case 25:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                return;
            case 26:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                    i10 = org.telegram.ui.b.d(52.0f, View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
                }
                super.onMeasure(i10, i11);
                return;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            case 28:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(100.0f)), Integer.MIN_VALUE));
                return;
            case 29:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f6736a) {
            case 4:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 5:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 6:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 7:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
