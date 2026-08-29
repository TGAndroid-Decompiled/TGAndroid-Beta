package cg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.y80;
public final class c2 extends y80 {
    public final int H;

    public c2(Context context, int i10, c6 c6Var) {
        super(context, c6Var);
        this.H = i10;
    }

    @Override
    public int a() {
        switch (this.H) {
            case 0:
                return 3;
            default:
                return super.a();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 5:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.H) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.H) {
            case 2:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 3:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 4:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
