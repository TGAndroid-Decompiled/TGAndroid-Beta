package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class x65 extends d20 {
    public final LaunchActivity E;
    public final j95 F;

    public x65(j95 j95Var, LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity);
        this.F = j95Var;
        this.E = launchActivity2;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        qd4.w(textView, aob.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new je3(this, textView, (byte) 23));
        return textView;
    }
}
