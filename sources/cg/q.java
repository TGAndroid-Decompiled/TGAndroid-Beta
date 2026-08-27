package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.rl;
import org.telegram.ui.m4;

public final class q extends TextView {

    public final int f2807a;

    public q(Context context, int i10) {
        super(context);
        this.f2807a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f2807a) {
            case 3:
                super.dispatchDraw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(3.5f), AndroidUtilities.dp(11.5f), AndroidUtilities.dp(2.5f), getPaint());
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f2807a) {
            case 0:
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
            case 21:
                return Button.class.getName();
            case 22:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2807a) {
            case 5:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, m4.f40321n1);
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2807a) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 11:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int iMax = 0;
                    for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                        iMax = Math.max(iMax, (int) Math.ceil(layout.getLineWidth(i12)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + iMax, 1073741824);
                }
                super.onMeasure(i10, i11);
                break;
            case 12:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int iMax2 = 0;
                    for (int i13 = 0; i13 < layout2.getLineCount(); i13++) {
                        iMax2 = Math.max(iMax2, (int) Math.ceil(layout2.getLineWidth(i13)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + iMax2, 1073741824);
                }
                super.onMeasure(i10, i11);
                break;
            case 13:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int iMax3 = 0;
                    for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                        iMax3 = Math.max(iMax3, (int) Math.ceil(layout3.getLineWidth(i14)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + iMax3, 1073741824);
                }
                super.onMeasure(i10, i11);
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), (int) (AndroidUtilities.displaySize.x * 0.45f)), Integer.MIN_VALUE), i11);
                break;
            case 23:
                super.onMeasure(i10, i11);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() > 1) {
                        int iMax4 = 0;
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            iMax4 = Math.max(iMax4, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(iMax4 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | 1073741824, 1073741824 | getMeasuredHeight());
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 24:
                super.onMeasure(i10, i11);
                break;
            case 26:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                break;
            case 27:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                break;
            case 28:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                    i10 = rl.d(52.0f, View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
                }
                super.onMeasure(i10, i11);
                break;
            case 29:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f2807a) {
            case 4:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 5:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 6:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 7:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 8:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 9:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
        }
    }
}
