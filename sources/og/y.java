package og;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import hi.y5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.a2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import w7.a6;
public final class y extends FrameLayout {
    public final TextView f14561a;
    public final s f14562b;
    public final EditTextBoldCursor f14563c;
    public int d;
    public boolean e;
    public final a0 f14564f;

    public y(a0 a0Var, Context context) {
        super(context);
        this.f14564f = a0Var;
        TextView textView = new TextView(context);
        this.f14561a = textView;
        a2.q(textView, -1711276033, 1, 14.0f);
        addView(textView, a6.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        s sVar = new s(a0Var, context);
        this.f14562b = sVar;
        addView(sVar, a6.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f14563c = editTextBoldCursor;
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
        editTextBoldCursor.addTextChangedListener(new x(this));
        editTextBoldCursor.setOnFocusChangeListener(new y5(this, 1));
        editTextBoldCursor.setOnEditorActionListener(new w(0));
        addView(editTextBoldCursor, a6.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f14562b.f14473c = i10;
        TextView textView = this.f14561a;
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
        s sVar = this.f14562b;
        sVar.d = i0.a.k(sVar.e.f14319f, 255);
        sVar.a();
        sVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f14563c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        a0 a0Var = this.f14564f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(a0Var.f14319f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(a0Var.f14319f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(a0Var.f14319f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
