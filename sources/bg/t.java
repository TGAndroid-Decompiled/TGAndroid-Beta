package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ll;
import org.telegram.ui.l4;
public final class t extends TextView {
    public final int f1961a;

    public t(Context context, int i9) {
        super(context);
        this.f1961a = i9;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1961a) {
            case 3:
                super.dispatchDraw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(3.5f), AndroidUtilities.dp(11.5f), AndroidUtilities.dp(2.5f), getPaint());
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f1961a) {
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
        switch (this.f1961a) {
            case 5:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, l4.f40000n1);
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f1961a) {
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(220.0f)), View.MeasureSpec.getMode(i9)), i10);
                return;
            case 11:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int i11 = 0;
                    for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                        i11 = Math.max(i11, (int) Math.ceil(layout.getLineWidth(i12)));
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i11, 1073741824);
                }
                super.onMeasure(i9, i10);
                return;
            case 12:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int i13 = 0;
                    for (int i14 = 0; i14 < layout2.getLineCount(); i14++) {
                        i13 = Math.max(i13, (int) Math.ceil(layout2.getLineWidth(i14)));
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i13, 1073741824);
                }
                super.onMeasure(i9, i10);
                return;
            case 13:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int i15 = 0;
                    for (int i16 = 0; i16 < layout3.getLineCount(); i16++) {
                        i15 = Math.max(i15, (int) Math.ceil(layout3.getLineWidth(i16)));
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i15, 1073741824);
                }
                super.onMeasure(i9, i10);
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), (int) (AndroidUtilities.displaySize.x * 0.45f)), Integer.MIN_VALUE), i10);
                return;
            case 23:
                super.onMeasure(i9, i10);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() > 1) {
                        int i17 = 0;
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            i17 = Math.max(i17, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(i17 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | 1073741824, 1073741824 | getMeasuredHeight());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 24:
                super.onMeasure(i9, i10);
                return;
            case 26:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                return;
            case 27:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                return;
            case 28:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
                    i9 = ll.d(52.0f, View.MeasureSpec.getSize(i9), Integer.MIN_VALUE);
                }
                super.onMeasure(i9, i10);
                return;
            case 29:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f1961a) {
            case 4:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 5:
            default:
                super.setText(charSequence, bufferType);
                return;
            case 6:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 7:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 8:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 9:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
        }
    }
}
