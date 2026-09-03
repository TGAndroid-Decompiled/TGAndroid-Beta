package fg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.yh;
public final class f extends LinearLayout {
    public final TextView f6310a;
    public final TextView f6311b;
    public final LimitPreviewView f6312c;

    public f(Context context, g6 g6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f6310a = textView;
        yh.p(15.0f, 1, textView);
        textView.setTextColor(k6.v0(k6.G6, g6Var));
        addView(textView, c6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f6311b = textView2;
        org.telegram.ui.b.l(k6.f22038y6, g6Var, textView2, 1, 14.0f);
        addView(textView2, c6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, g6Var, 20);
        this.f6312c = limitPreviewView;
        addView(limitPreviewView, c6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f6310a.setText(eVar.f6299a);
        this.f6311b.setText(eVar.f6300b);
        LimitPreviewView limitPreviewView = this.f6312c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24962w.setText(String.format("%d", Integer.valueOf(eVar.f6301c)));
    }
}
