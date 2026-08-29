package ag;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d0 extends FrameLayout {
    public final TextView f431a;
    public final w f432b;
    public final EditTextBoldCursor f433c;
    public int d;
    public boolean f434e;
    public final f0 f435f;

    public d0(f0 f0Var, Context context) {
        super(context);
        this.f435f = f0Var;
        TextView textView = new TextView(context);
        this.f431a = textView;
        x3.t(textView, -1711276033, 1, 14.0f);
        addView(textView, f6.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        w wVar = new w(f0Var, context);
        this.f432b = wVar;
        addView(wVar, f6.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f433c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(g6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new c0(this));
        editTextBoldCursor.setOnFocusChangeListener(new a0(this, 0));
        editTextBoldCursor.setOnEditorActionListener(new b0(0));
        addView(editTextBoldCursor, f6.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f432b.f688c = i10;
        TextView textView = this.f431a;
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
        this.f434e = true;
        w wVar = this.f432b;
        wVar.d = i0.a.k(wVar.f689e.f466f, 255);
        wVar.a();
        wVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f433c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        f0 f0Var = this.f435f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(f0Var.f466f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(f0Var.f466f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(f0Var.f466f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f434e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
