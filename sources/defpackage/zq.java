package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
public abstract class zq {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) ar.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
