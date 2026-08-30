package cg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.zl0;
public final class d0 extends LinearLayout {
    public final c0 f2330a;
    public final c0 f2331b;
    public final c0 f2332c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final e0 f2333f;

    public d0(e0 e0Var, Context context) {
        super(context);
        this.f2333f = e0Var;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        c0 c0Var = new c0(e0Var, context);
        this.f2330a = c0Var;
        c0Var.a(0);
        addView(c0Var, b6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        c0 c0Var2 = new c0(e0Var, context);
        this.f2331b = c0Var2;
        c0Var2.a(1);
        addView(c0Var2, b6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        c0 c0Var3 = new c0(e0Var, context);
        this.f2332c = c0Var3;
        c0Var3.a(2);
        addView(c0Var3, b6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, b6.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, b6.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(j6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new zl0(this));
        editTextBoldCursor.setOnFocusChangeListener(new z(this, 1));
        editTextBoldCursor.setOnEditorActionListener(new a0(1));
        linearLayout.addView(editTextBoldCursor, b6.n(72, 36));
    }
}
