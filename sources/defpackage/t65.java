package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class t65 extends c30 {
    public final LaunchActivity E;
    public final g95 F;

    public t65(g95 g95Var, LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity);
        this.F = g95Var;
        this.E = launchActivity2;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        td4.x(textView, cmb.Xg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new tf3(this, textView, (byte) 21));
        return textView;
    }
}
