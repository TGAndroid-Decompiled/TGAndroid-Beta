package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wj extends r99 {
    public final yh n1;

    public wj(Context context, int i, r63 r63Var, yh yhVar) {
        super(1, r63Var, context, true);
        int i2;
        this.n1 = yhVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, qoe.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624178, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, qoe.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 24.0f);
        anb.X(textView, cmb.i5, r63Var);
        if (i == 0) {
            textView.setText(jb6.M0(2131745924, null));
        } else if (i == 6) {
            textView.setText(jb6.M0(2131745926, null));
        } else if (i == 1) {
            textView.setText(jb6.M0(2131745923, null));
        } else if (i == 2) {
            textView.setText(jb6.M0(2131745927, null));
        } else if (i == 5) {
            textView.setText(jb6.M0(2131745925, null));
        } else if (i == 100) {
            textView.setText(jb6.M0(2131745963, null));
        }
        TextView l = wi8.l(frameLayout, textView, qoe.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l.setTextSize(1, 14.0f);
        anb.X(l, cmb.q5, r63Var);
        hg9.p(l, 1, null, 2131745950);
        frameLayout.addView(l, qoe.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        anb.D(editTextBoldCursor, cmb.G6, r63Var);
        int i3 = cmb.F6;
        anb.X(editTextBoldCursor, i3, r63Var);
        editTextBoldCursor.setBackgroundDrawable(null);
        anb.F(editTextBoldCursor, cmb.j6, cmb.k6, cmb.o7, r63Var);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        editTextBoldCursor.setGravity(i2);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(jb6.M0(2131745951, null));
        anb.l(editTextBoldCursor, 30, i3, r63Var);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 21));
        frameLayout.addView(editTextBoldCursor, qoe.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.a = view;
        view.setBackground(ulb.f(cmb.Ei, 8.0f));
        frameLayout2.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        anb.X(textView2, cmb.Ii, r63Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        frameLayout2.addView(textView2, qoe.e(-2, -2, 17));
        this.l1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(jb6.M0(2131745941, null));
        rve.a(frameLayout2);
        view.setOnClickListener(new v0(this, i, (byte) 20));
        frameLayout.addView((View) frameLayout2, qoe.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
