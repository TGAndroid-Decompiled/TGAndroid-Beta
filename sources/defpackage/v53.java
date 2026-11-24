package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.DataAutoDownloadActivity;
public final class v53 extends rj6 {
    public final int e;
    public final mhb f;
    public final ahb[] h;
    public final AnimatorSet[] n;
    public final DataAutoDownloadActivity r;

    public v53(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i, mhb mhbVar, ahb[] ahbVarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i2;
        int i3;
        int i4;
        this.r = dataAutoDownloadActivity;
        this.e = i;
        this.f = mhbVar;
        this.h = ahbVarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        zkb.X(textView, bkb.i5, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(textView, nme.d(-1, -1.0f, i3 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        zkb.X(textView2, bkb.m5, null);
        ug8.w(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        textView2.setGravity(i4 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        ty0 ty0Var = new ty0(activity);
        this.c = ty0Var;
        ty0Var.setReportChanges(true);
        ty0Var.setDelegate(new gi3(this));
        ty0Var.setImportantForAccessibility(2);
        addView(ty0Var, nme.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(ty0Var.getSeekBarAccessibilityDelegate());
    }
}
