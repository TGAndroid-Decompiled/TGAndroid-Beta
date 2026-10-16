package m;

import android.text.StaticLayout;
import android.widget.TextView;
public abstract class h1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) i1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
