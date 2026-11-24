package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.DataAutoDownloadActivity;
public final class h73 extends ul6 {
    public final int e;
    public final njb f;
    public final bjb[] h;
    public final AnimatorSet[] n;
    public final DataAutoDownloadActivity r;

    public h73(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i, njb njbVar, bjb[] bjbVarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i2;
        int i3;
        int i4;
        this.r = dataAutoDownloadActivity;
        this.e = i;
        this.f = njbVar;
        this.h = bjbVarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        anb.X(textView, cmb.i5, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(textView, qoe.d(-1, -1.0f, i3 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        anb.X(textView2, cmb.m5, null);
        wi8.w(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        textView2.setGravity(i4 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        a01 a01Var = new a01(activity);
        this.c = a01Var;
        a01Var.setReportChanges(true);
        a01Var.setDelegate(new lj4(this));
        a01Var.setImportantForAccessibility(2);
        addView(a01Var, qoe.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(a01Var.getSeekBarAccessibilityDelegate());
    }
}
