package defpackage;

import android.widget.Button;
import android.widget.TextView;
public final class ji extends TextView {
    @Override
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
}
