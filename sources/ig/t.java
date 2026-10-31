package ig;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.g6;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.jk0;
import w7.b6;
public final class t extends LinearLayout {
    public final s f8460a;
    public final s f8461b;
    public final s f8462c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final u f8463f;

    public t(u uVar, Context context) {
        super(context);
        this.f8463f = uVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        s sVar = new s(uVar, context);
        this.f8460a = sVar;
        sVar.a(0);
        addView(sVar, b6.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        s sVar2 = new s(uVar, context);
        this.f8461b = sVar2;
        sVar2.a(1);
        addView(sVar2, b6.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        s sVar3 = new s(uVar, context);
        this.f8462c = sVar3;
        sVar3.a(2);
        addView(sVar3, b6.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, b6.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(cd.L0(2131747681, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(textView, b6.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(cd.L0(2131751355, null), 6);
        editTextBoldCursor.setTypeface(org.telegram.messenger.i0.o());
        editTextBoldCursor.addTextChangedListener(new jk0(this));
        editTextBoldCursor.setOnFocusChangeListener(new g6(this, 2));
        editTextBoldCursor.setOnEditorActionListener(new r(1));
        linearLayout.addView(editTextBoldCursor, b6.o(72, 36));
    }
}
