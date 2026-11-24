package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class v45 extends c20 {
    public final LaunchActivity E;
    public final h75 F;

    public v45(h75 h75Var, LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity);
        this.F = h75Var;
        this.E = launchActivity2;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        tb4.w(textView, bkb.Xg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new xf3(this, textView, (byte) 20));
        return textView;
    }
}
