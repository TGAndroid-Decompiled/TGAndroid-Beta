package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wi extends p79 {
    public final yg n1;

    public wi(Context context, int i, f53 f53Var, yg ygVar) {
        super(1, f53Var, context, true);
        int i2;
        this.n1 = ygVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, nme.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624179, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, nme.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 24.0f);
        zkb.X(textView, bkb.i5, f53Var);
        if (i == 0) {
            textView.setText(k96.M0(2131745998, null));
        } else if (i == 6) {
            textView.setText(k96.M0(2131746000, null));
        } else if (i == 1) {
            textView.setText(k96.M0(2131745997, null));
        } else if (i == 2) {
            textView.setText(k96.M0(2131746001, null));
        } else if (i == 5) {
            textView.setText(k96.M0(2131745999, null));
        } else if (i == 100) {
            textView.setText(k96.M0(2131746037, null));
        }
        TextView l = ug8.l(frameLayout, textView, nme.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l.setTextSize(1, 14.0f);
        zkb.X(l, bkb.q5, f53Var);
        de9.q(l, 1, null, 2131746024);
        frameLayout.addView(l, nme.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        zkb.D(editTextBoldCursor, bkb.G6, f53Var);
        int i3 = bkb.F6;
        zkb.X(editTextBoldCursor, i3, f53Var);
        editTextBoldCursor.setBackgroundDrawable(null);
        zkb.F(editTextBoldCursor, bkb.j6, bkb.k6, bkb.o7, f53Var);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        editTextBoldCursor.setGravity(i2);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(k96.M0(2131746025, null));
        zkb.l(editTextBoldCursor, 30, i3, f53Var);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 20));
        frameLayout.addView(editTextBoldCursor, nme.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.a = view;
        view.setBackground(sjb.f(bkb.Ei, 8.0f));
        frameLayout2.addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        zkb.X(textView2, bkb.Ii, f53Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        frameLayout2.addView(textView2, nme.e(-2, -2, 17));
        this.l1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(k96.M0(2131746015, null));
        ote.a(frameLayout2);
        view.setOnClickListener(new v0(this, i, (byte) 20));
        frameLayout.addView((View) frameLayout2, nme.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
