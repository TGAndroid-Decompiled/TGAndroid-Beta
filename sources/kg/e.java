package kg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.b6;
public final class e extends LinearLayout {
    public final TextView f11041a;
    public final TextView f11042b;
    public final LimitPreviewView f11043c;

    public e(Context context, p6 p6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f11041a = textView;
        sc.e.t(textView, 1, 15.0f);
        a7.V(textView, t6.G6, p6Var);
        addView(textView, b6.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f11042b = textView2;
        a7.V(textView2, t6.f21312y6, p6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, b6.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, p6Var);
        this.f11043c = limitPreviewView;
        addView(limitPreviewView, b6.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f11041a.setText(dVar.f11024a);
        this.f11042b.setText(dVar.f11025b);
        LimitPreviewView limitPreviewView = this.f11043c;
        limitPreviewView.f24118w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f24119x.setText(String.format("%d", Integer.valueOf(dVar.f11026c)));
    }
}
