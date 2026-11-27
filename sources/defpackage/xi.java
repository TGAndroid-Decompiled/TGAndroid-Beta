package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xi extends cb9 {
    public final ng n1;

    public xi(Context context, int i, x53 x53Var, ng ngVar) {
        super(1, x53Var, context, true);
        int i2;
        this.n1 = ngVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, tre.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624178, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, tre.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 24.0f);
        yob.X(textView, aob.j5, x53Var);
        if (i == 0) {
            textView.setText(ob6.M0(2131745918, null));
        } else if (i == 6) {
            textView.setText(ob6.M0(2131745920, null));
        } else if (i == 1) {
            textView.setText(ob6.M0(2131745917, null));
        } else if (i == 2) {
            textView.setText(ob6.M0(2131745921, null));
        } else if (i == 5) {
            textView.setText(ob6.M0(2131745919, null));
        } else if (i == 100) {
            textView.setText(ob6.M0(2131745957, null));
        }
        TextView l = ik8.l(frameLayout, textView, tre.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l.setTextSize(1, 14.0f);
        yob.X(l, aob.r5, x53Var);
        uh9.q(l, 1, null, 2131745944);
        frameLayout.addView(l, tre.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        yob.D(editTextBoldCursor, aob.H6, x53Var);
        int i3 = aob.G6;
        yob.X(editTextBoldCursor, i3, x53Var);
        editTextBoldCursor.setBackgroundDrawable(null);
        yob.F(editTextBoldCursor, aob.k6, aob.l6, aob.p7, x53Var);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        editTextBoldCursor.setGravity(i2);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(ob6.M0(2131745945, null));
        yob.l(editTextBoldCursor, 30, i3, x53Var);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 20));
        frameLayout.addView(editTextBoldCursor, tre.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.a = view;
        view.setBackground(rnb.f(aob.Fi, 8.0f));
        frameLayout2.addView(view, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        yob.X(textView2, aob.Ji, x53Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        frameLayout2.addView(textView2, tre.e(-2, -2, 17));
        this.l1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(ob6.M0(2131745935, null));
        iye.a(frameLayout2);
        view.setOnClickListener(new w0(this, i, (byte) 21));
        frameLayout.addView((View) frameLayout2, tre.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
