package og;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import hi.y5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.km0;
import w7.a6;
public final class z extends LinearLayout {
    public final y f14573a;
    public final y f14574b;
    public final y f14575c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final a0 f14576f;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f14576f = a0Var;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        y yVar = new y(a0Var, context);
        this.f14573a = yVar;
        yVar.a(0);
        addView(yVar, a6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        y yVar2 = new y(a0Var, context);
        this.f14574b = yVar2;
        yVar2.a(1);
        addView(yVar2, a6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        y yVar3 = new y(a0Var, context);
        this.f14575c = yVar3;
        yVar3.a(2);
        addView(yVar3, a6.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, a6.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, a6.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
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
        editTextBoldCursor.addTextChangedListener(new km0(this));
        editTextBoldCursor.setOnFocusChangeListener(new y5(this, 2));
        editTextBoldCursor.setOnEditorActionListener(new w(1));
        linearLayout.addView(editTextBoldCursor, a6.n(72, 36));
    }
}
