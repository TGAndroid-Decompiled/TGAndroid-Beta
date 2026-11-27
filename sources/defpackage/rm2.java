package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rm2 extends LinearLayout {
    public final qm2 a;
    public final qm2 b;
    public final qm2 c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final sm2 f;

    public rm2(sm2 sm2Var, Context context) {
        super(context);
        this.f = sm2Var;
        setOrientation(1);
        setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        qm2 qm2Var = new qm2(sm2Var, context);
        this.a = qm2Var;
        qm2Var.a(0);
        addView(qm2Var, tre.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        qm2 qm2Var2 = new qm2(sm2Var, context);
        this.b = qm2Var2;
        qm2Var2.a(1);
        addView(qm2Var2, tre.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        qm2 qm2Var3 = new qm2(sm2Var, context);
        this.c = qm2Var3;
        qm2Var3.a(2);
        addView(qm2Var3, tre.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, tre.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131747392, null).toUpperCase());
        textView.setTypeface(hl.o());
        linearLayout.addView(textView, tre.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(aob.b0(hl.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(ob6.M0(2131751319, null), 6);
        editTextBoldCursor.setTypeface(hl.o());
        editTextBoldCursor.addTextChangedListener(new d08(this));
        editTextBoldCursor.setOnFocusChangeListener(new ts0(this, (byte) 3));
        editTextBoldCursor.setOnEditorActionListener(new mh((byte) 3));
        linearLayout.addView(editTextBoldCursor, tre.o(72, 36));
    }
}
