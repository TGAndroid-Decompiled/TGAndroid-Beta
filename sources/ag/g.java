package ag;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.Premium.LimitPreviewView;

public final class g extends LinearLayout {

    public final TextView f381a;

    public final TextView f382b;

    public final LimitPreviewView f383c;

    public g(Context context, c6 c6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f381a = textView;
        pa.m(15.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        addView(textView, z5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f382b = textView2;
        rl.l(g6.f23423y6, c6Var, textView2, 1, 14.0f);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, c6Var, 20);
        this.f383c = limitPreviewView;
        addView(limitPreviewView, z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(f fVar) {
        this.f381a.setText(fVar.f368a);
        this.f382b.setText(fVar.f369b);
        LimitPreviewView limitPreviewView = this.f383c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(fVar.d)));
        limitPreviewView.f26458w.setText(String.format("%d", Integer.valueOf(fVar.f370c)));
    }
}
