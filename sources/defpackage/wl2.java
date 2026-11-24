package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wl2 extends FrameLayout {
    public final TextView a;
    public final tl2 b;
    public final EditTextBoldCursor c;
    public byte d;
    public boolean e;
    public final yl2 f;

    public wl2(yl2 yl2Var, Context context) {
        super(context);
        this.f = yl2Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        addView(textView, nme.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        tl2 tl2Var = new tl2(yl2Var, context);
        this.b = tl2Var;
        addView(tl2Var, nme.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(bkb.b0(gl.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(k96.M0(2131751342, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(gl.o());
        editTextBoldCursor.addTextChangedListener(new qy(this));
        editTextBoldCursor.setOnFocusChangeListener(new ls0(this, (byte) 2));
        editTextBoldCursor.setOnEditorActionListener(new mg((byte) 2));
        addView(editTextBoldCursor, nme.e(72, 36, 85));
    }

    public final void a(int i) {
        this.d = i;
        this.b.c = i;
        TextView textView = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    textView.setText(k96.M0(2131747474, null).toUpperCase());
                }
            } else {
                textView.setText(k96.M0(2131747473, null).toUpperCase());
            }
        } else {
            textView.setText(k96.M0(2131747471, null).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        tl2 tl2Var = this.b;
        tl2Var.d = bm2.o(tl2Var.e.p1, 255);
        tl2Var.a();
        tl2Var.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        byte b = this.d;
        yl2 yl2Var = this.f;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(yl2Var.p1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(yl2Var.p1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(yl2Var.p1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), 1073741824));
    }
}
