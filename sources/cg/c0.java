package cg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c0 extends FrameLayout {
    public final TextView f2321a;
    public final v f2322b;
    public final EditTextBoldCursor f2323c;
    public int d;
    public boolean e;
    public final e0 f2324f;

    public c0(e0 e0Var, Context context) {
        super(context);
        this.f2324f = e0Var;
        TextView textView = new TextView(context);
        this.f2321a = textView;
        y3.t(textView, -1711276033, 1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        v vVar = new v(e0Var, context);
        this.f2322b = vVar;
        addView(vVar, b6.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f2323c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(j6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new b0(this));
        editTextBoldCursor.setOnFocusChangeListener(new z(this, 0));
        editTextBoldCursor.setOnEditorActionListener(new a0(0));
        addView(editTextBoldCursor, b6.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f2322b.f2545c = i10;
        TextView textView = this.f2321a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersBlue).toUpperCase());
                }
            } else {
                textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersGreen).toUpperCase());
            }
        } else {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersRed).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        v vVar = this.f2322b;
        vVar.d = i0.a.k(vVar.e.f2362f, 255);
        vVar.a();
        vVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f2323c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        e0 e0Var = this.f2324f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(e0Var.f2362f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(e0Var.f2362f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(e0Var.f2362f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
