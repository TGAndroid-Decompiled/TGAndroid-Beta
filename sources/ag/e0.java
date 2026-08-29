package ag;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.rl0;
public final class e0 extends LinearLayout {
    public final d0 f453a;
    public final d0 f454b;
    public final d0 f455c;
    public final EditTextBoldCursor d;
    public boolean f456e;
    public final f0 f457f;

    public e0(f0 f0Var, Context context) {
        super(context);
        this.f457f = f0Var;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        d0 d0Var = new d0(f0Var, context);
        this.f453a = d0Var;
        d0Var.a(0);
        addView(d0Var, f6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        d0 d0Var2 = new d0(f0Var, context);
        this.f454b = d0Var2;
        d0Var2.a(1);
        addView(d0Var2, f6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        d0 d0Var3 = new d0(f0Var, context);
        this.f455c = d0Var3;
        d0Var3.a(2);
        addView(d0Var3, f6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, f6.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, f6.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(g6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new rl0(this));
        editTextBoldCursor.setOnFocusChangeListener(new a0(this, 1));
        editTextBoldCursor.setOnEditorActionListener(new b0(1));
        linearLayout.addView(editTextBoldCursor, f6.n(72, 36));
    }
}
