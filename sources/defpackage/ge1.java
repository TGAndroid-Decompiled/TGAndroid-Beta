package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ge1 extends FrameLayout implements tjb {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final me1 c;

    public ge1(me1 me1Var, Activity activity) {
        super(activity);
        int i;
        this.c = me1Var;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        zkb.D(editTextBoldCursor, bkb.G6, null);
        int i2 = bkb.F6;
        zkb.X(editTextBoldCursor, i2, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(k96.M0(2131743409, null));
        zkb.l(editTextBoldCursor, 30, i2, null);
        editTextBoldCursor.setCursorSize(gl.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 4));
        String str = me1Var.r;
        long j = me1Var.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new b7(this, (byte) 5));
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
        textView.setText(me1Var.getMessagesController().N2 + "/");
        textView.setTextSize(1, 17.0f);
        zkb.X(textView, i2, null);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-gl.L(3.0f));
        linearLayout.addView(textView, nme.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, nme.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, nme.e(-1, -1, 48));
        if (i3 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setCursorColor(bkb.w0(null, bkb.F6, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
