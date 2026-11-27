package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qm2 extends FrameLayout {
    public final TextView a;
    public final nm2 b;
    public final EditTextBoldCursor c;
    public byte d;
    public boolean e;
    public final sm2 f;

    public qm2(sm2 sm2Var, Context context) {
        super(context);
        this.f = sm2Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        addView(textView, tre.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        nm2 nm2Var = new nm2(sm2Var, context);
        this.b = nm2Var;
        addView(nm2Var, tre.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(aob.b0(hl.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(ob6.M0(2131751319, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(hl.o());
        editTextBoldCursor.addTextChangedListener(new ry(this));
        editTextBoldCursor.setOnFocusChangeListener(new ts0(this, (byte) 2));
        editTextBoldCursor.setOnEditorActionListener(new mh((byte) 2));
        addView(editTextBoldCursor, tre.e(72, 36, 85));
    }

    public final void a(int i) {
        this.d = i;
        this.b.c = i;
        TextView textView = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    textView.setText(ob6.M0(2131747394, null).toUpperCase());
                }
            } else {
                textView.setText(ob6.M0(2131747393, null).toUpperCase());
            }
        } else {
            textView.setText(ob6.M0(2131747391, null).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        nm2 nm2Var = this.b;
        nm2Var.d = vm2.o(nm2Var.e.p1, 255);
        nm2Var.a();
        nm2Var.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        byte b = this.d;
        sm2 sm2Var = this.f;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(sm2Var.p1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(sm2Var.p1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(sm2Var.p1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
    }
}
