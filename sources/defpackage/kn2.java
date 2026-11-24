package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kn2 extends LinearLayout {
    public final jn2 a;
    public final jn2 b;
    public final jn2 c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final ln2 f;

    public kn2(ln2 ln2Var, Context context) {
        super(context);
        this.f = ln2Var;
        setOrientation(1);
        setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        jn2 jn2Var = new jn2(ln2Var, context);
        this.a = jn2Var;
        jn2Var.a(0);
        addView(jn2Var, qoe.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        jn2 jn2Var2 = new jn2(ln2Var, context);
        this.b = jn2Var2;
        jn2Var2.a(1);
        addView(jn2Var2, qoe.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        jn2 jn2Var3 = new jn2(ln2Var, context);
        this.c = jn2Var3;
        jn2Var3.a(2);
        addView(jn2Var3, qoe.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, qoe.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131747398, null).toUpperCase());
        textView.setTypeface(gm.o());
        linearLayout.addView(textView, qoe.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(cmb.b0(gm.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(jb6.M0(2131751291, null), 6);
        editTextBoldCursor.setTypeface(gm.o());
        editTextBoldCursor.addTextChangedListener(new yy7(this));
        editTextBoldCursor.setOnFocusChangeListener(new tt0(this, (byte) 3));
        editTextBoldCursor.setOnEditorActionListener(new nh((byte) 3));
        linearLayout.addView(editTextBoldCursor, qoe.o(72, 36));
    }
}
