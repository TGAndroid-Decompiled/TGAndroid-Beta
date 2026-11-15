package ai;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import java.util.Arrays;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Dictation.DictationAsr;
public final class t2 implements Runnable {
    public final int f1556a;
    public final x2 f1557b;

    public t2(x2 x2Var, int i7) {
        this.f1556a = i7;
        this.f1557b = x2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f1556a;
        x2 x2Var = this.f1557b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(x2Var.h, DictationAsr.C()) && x2Var.getParentActivity() != null && x2Var.f38880a != null) {
                    x2Var.d0(x2Var.getParentActivity());
                    x2Var.f38880a.f39892g3.O(true);
                    return;
                }
                x2Var.e0();
                return;
            default:
                Activity parentActivity = x2Var.getParentActivity();
                e6 resourceProvider = x2Var.getResourceProvider();
                r2 r2Var = new r2(parentActivity, 0);
                r2Var.setOrientation(1);
                r2Var.addView(new s2(parentActivity, resourceProvider), ja.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(j6.w0(j6.f28957j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText("Private by design");
                r2Var.addView(textView, ja.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(j6.w0(j6.f29260z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText("Voice messages turn into text\nright here, on your phone.");
                r2Var.addView(textView2, ja.t(-1, -2, 1, 32, 0, 32, 25));
                r2Var.addView(a8.i1.a(parentActivity, resourceProvider, 2131232024, "Recognized on your phone", "Speech turns into text right on this phone, even offline."), ja.t(-1, -2, 7, 32, 0, 32, 16));
                r2Var.addView(a8.i1.a(parentActivity, resourceProvider, 2131231860, "Nothing leaves the phone", "Your voice and its text are never sent to a server for this."), ja.t(-1, -2, 7, 32, 0, 32, 16));
                r2Var.addView(a8.i1.a(parentActivity, resourceProvider, 2131232023, "Compact languages", "About 30 MB per language. Keep only the ones you need."), ja.t(-1, -2, 7, 32, 0, 32, 16));
                hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
                dVar.setRoundRadius(24);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("👌  Got it");
                spannableStringBuilder.setSpan(new eq(2131231180, 0), 0, 2, 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new q2(r3, 0));
                r2Var.addView(dVar, ja.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(r2Var, ja.e(-1, -2, 1));
                org.telegram.ui.ActionBar.u2 i10 = i20.i(parentActivity, false, 1, resourceProvider);
                i10.O = frameLayout;
                i10.V0 = 49;
                i10.show();
                org.telegram.ui.ActionBar.u2[] u2VarArr = {i10};
                i10.Q(j6.f28922h5);
                return;
        }
    }
}
