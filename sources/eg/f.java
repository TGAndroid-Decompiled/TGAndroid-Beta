package eg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.ai;
public final class f extends LinearLayout {
    public final TextView f5272a;
    public final TextView f5273b;
    public final LimitPreviewView f5274c;

    public f(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f5272a = textView;
        ai.o(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        addView(textView, b6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f5273b = textView2;
        org.telegram.ui.b.l(j6.f20256y6, f6Var, textView2, 1, 14.0f);
        addView(textView2, b6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, f6Var, 20);
        this.f5274c = limitPreviewView;
        addView(limitPreviewView, b6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f5272a.setText(eVar.f5238a);
        this.f5273b.setText(eVar.f5239b);
        LimitPreviewView limitPreviewView = this.f5274c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f23079w.setText(String.format("%d", Integer.valueOf(eVar.f5240c)));
    }
}
