package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jn2 extends FrameLayout {
    public final TextView a;
    public final gn2 b;
    public final EditTextBoldCursor c;
    public byte d;
    public boolean e;
    public final ln2 f;

    public jn2(ln2 ln2Var, Context context) {
        super(context);
        this.f = ln2Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        addView(textView, qoe.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        gn2 gn2Var = new gn2(ln2Var, context);
        this.b = gn2Var;
        addView(gn2Var, qoe.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(cmb.b0(gm.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(jb6.M0(2131751291, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(gm.o());
        editTextBoldCursor.addTextChangedListener(new qz(this));
        editTextBoldCursor.setOnFocusChangeListener(new tt0(this, (byte) 2));
        editTextBoldCursor.setOnEditorActionListener(new nh((byte) 2));
        addView(editTextBoldCursor, qoe.e(72, 36, 85));
    }

    public final void a(int i) {
        this.d = i;
        this.b.c = i;
        TextView textView = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    textView.setText(jb6.M0(2131747400, null).toUpperCase());
                }
            } else {
                textView.setText(jb6.M0(2131747399, null).toUpperCase());
            }
        } else {
            textView.setText(jb6.M0(2131747397, null).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        gn2 gn2Var = this.b;
        gn2Var.d = on2.p(gn2Var.e.p1, 255);
        gn2Var.a();
        gn2Var.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        byte b = this.d;
        ln2 ln2Var = this.f;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(ln2Var.p1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(ln2Var.p1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(ln2Var.p1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), 1073741824));
    }
}
