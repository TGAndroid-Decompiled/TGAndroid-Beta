package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pe1 extends FrameLayout implements snb {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final ve1 c;

    public pe1(ve1 ve1Var, Activity activity) {
        super(activity);
        int i;
        this.c = ve1Var;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        yob.D(editTextBoldCursor, aob.H6, null);
        int i2 = aob.G6;
        yob.X(editTextBoldCursor, i2, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(ob6.M0(2131743303, null));
        yob.l(editTextBoldCursor, 30, i2, null);
        editTextBoldCursor.setCursorSize(hl.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 4));
        String str = ve1Var.r;
        long j = ve1Var.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new c7(this, (byte) 5));
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(ve1Var.getMessagesController().N2 + "/");
        textView.setTextSize(1, 17.0f);
        yob.X(textView, i2, null);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-hl.L(3.0f));
        linearLayout.addView(textView, tre.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, tre.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, tre.e(-1, -1, 48));
        if (i3 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setCursorColor(aob.w0(null, aob.G6, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
