package defpackage;

import android.widget.Button;
import android.widget.TextView;
public final class zw8 extends TextView {
    @Override
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
}
