package cg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.th;
public final class f extends LinearLayout {
    public final TextView f3112a;
    public final TextView f3113b;
    public final LimitPreviewView f3114c;

    public f(Context context, c6 c6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f3112a = textView;
        th.n(15.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        addView(textView, f6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f3113b = textView2;
        org.telegram.ui.b.m(g6.f23433y6, c6Var, textView2, 1, 14.0f);
        addView(textView2, f6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, c6Var, 20);
        this.f3114c = limitPreviewView;
        addView(limitPreviewView, f6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f3112a.setText(eVar.f3102a);
        this.f3113b.setText(eVar.f3103b);
        LimitPreviewView limitPreviewView = this.f3114c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f26473w.setText(String.format("%d", Integer.valueOf(eVar.f3104c)));
    }
}
