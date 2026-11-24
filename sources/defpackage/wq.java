package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
public class wq extends yq {
    @Override
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) zq.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
