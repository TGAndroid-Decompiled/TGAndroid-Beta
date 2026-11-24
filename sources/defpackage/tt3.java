package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tt3 extends FrameLayout {
    public final EditTextBoldCursor a;

    public tt3(Context context) {
        super(context);
        int i;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor;
        zkb.X(editTextBoldCursor, bkb.F6, null);
        zkb.D(editTextBoldCursor, bkb.G6, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i | 16);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 16384);
        addView(editTextBoldCursor, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str) {
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setText("");
        editTextBoldCursor.setHint(str);
        setWillNotDraw(true);
    }

    public String getText() {
        return this.a.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.a;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
