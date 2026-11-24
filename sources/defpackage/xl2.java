package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl2 extends LinearLayout {
    public final wl2 a;
    public final wl2 b;
    public final wl2 c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final yl2 f;

    public xl2(yl2 yl2Var, Context context) {
        super(context);
        this.f = yl2Var;
        setOrientation(1);
        setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        wl2 wl2Var = new wl2(yl2Var, context);
        this.a = wl2Var;
        wl2Var.a(0);
        addView(wl2Var, nme.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        wl2 wl2Var2 = new wl2(yl2Var, context);
        this.b = wl2Var2;
        wl2Var2.a(1);
        addView(wl2Var2, nme.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        wl2 wl2Var3 = new wl2(yl2Var, context);
        this.c = wl2Var3;
        wl2Var3.a(2);
        addView(wl2Var3, nme.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, nme.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131747472, null).toUpperCase());
        textView.setTypeface(gl.o());
        linearLayout.addView(textView, nme.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(bkb.b0(gl.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(k96.M0(2131751342, null), 6);
        editTextBoldCursor.setTypeface(gl.o());
        editTextBoldCursor.addTextChangedListener(new vw7(this));
        editTextBoldCursor.setOnFocusChangeListener(new ls0(this, (byte) 3));
        editTextBoldCursor.setOnEditorActionListener(new ng((byte) 3));
        linearLayout.addView(editTextBoldCursor, nme.o(72, 36));
    }
}
