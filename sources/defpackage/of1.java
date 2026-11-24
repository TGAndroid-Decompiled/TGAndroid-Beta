package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class of1 extends FrameLayout implements vlb {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final uf1 c;

    public of1(uf1 uf1Var, Activity activity) {
        super(activity);
        int i;
        this.c = uf1Var;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        anb.D(editTextBoldCursor, cmb.G6, null);
        int i2 = cmb.F6;
        anb.X(editTextBoldCursor, i2, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor.setGravity(i | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(jb6.M0(2131743335, null));
        anb.l(editTextBoldCursor, 30, i2, null);
        editTextBoldCursor.setCursorSize(gm.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 5));
        String str = uf1Var.r;
        long j = uf1Var.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new b7(this, (byte) 6));
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
        textView.setText(uf1Var.getMessagesController().N2 + "/");
        textView.setTextSize(1, 17.0f);
        anb.X(textView, i2, null);
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-gm.L(3.0f));
        linearLayout.addView(textView, qoe.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, qoe.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, qoe.e(-1, -1, 48));
        if (i3 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setCursorColor(cmb.w0(null, cmb.F6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
