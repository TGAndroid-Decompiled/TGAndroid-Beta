package eg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.yh;
public final class f extends LinearLayout {
    public final TextView f5283a;
    public final TextView f5284b;
    public final LimitPreviewView f5285c;

    public f(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f5283a = textView;
        yh.p(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        addView(textView, b6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f5284b = textView2;
        org.telegram.ui.b.l(j6.f20281y6, f6Var, textView2, 1, 14.0f);
        addView(textView2, b6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, f6Var, 20);
        this.f5285c = limitPreviewView;
        addView(limitPreviewView, b6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f5283a.setText(eVar.f5249a);
        this.f5284b.setText(eVar.f5250b);
        LimitPreviewView limitPreviewView = this.f5285c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f23106w.setText(String.format("%d", Integer.valueOf(eVar.f5251c)));
    }
}
