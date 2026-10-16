package m;

import android.text.StaticLayout;
import android.widget.TextView;
public final class g1 extends f1 {
    @Override
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
