package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
public abstract class yr {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) zr.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
