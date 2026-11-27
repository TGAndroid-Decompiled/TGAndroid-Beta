package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class dw5 extends nx0 {
    public boolean l1;

    public dw5(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.w0 = false;
        this.v0 = false;
        LinearLayout j = uh9.j(context, 1);
        this.O = j;
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(45.0f));
        j.addView(de0Var, tre.t(90, 90, 49, 0, 29, 0, 0));
        de0Var.f(chat, new rb0(chat));
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 18.0f);
        yob.X(textView, aob.j5, null);
        textView.setGravity(1);
        TextView m = ik8.m(j, textView, tre.t(-2, -2, 49, 17, 24, 17, 0), context);
        m.setTextSize(1, 14.0f);
        yob.X(m, aob.r5, null);
        m.setGravity(1);
        j.addView(m, tre.t(-2, -2, 49, 30, 8, 30, 0));
        vc2 g1 = uc7.s1(k5.a(this.a).a).g1(chat.id, false, null);
        if (g1 != null) {
            if (TextUtils.isEmpty(g1.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(g1.b.title);
            }
            int i = g1.b.participants_count;
            if (i == 0) {
                m.setText(ob6.M0(2131747917, null));
            } else {
                m.setText(ob6.G(i, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            m.setText(ob6.M0(2131747917, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.a = view;
        view.setBackground(rnb.f(aob.Fi, 4.0f));
        frameLayout.addView(view, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        qd4.w(textView2, aob.Ji, null, 1, 14.0f);
        frameLayout.addView(textView2, tre.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (xc2.W(chat)) {
            frameLayout.setText(ob6.M0(2131743127, null));
        } else {
            frameLayout.setText(ob6.M0(2131743017, null));
        }
        view.setOnClickListener(new sa5(this, (byte) 13));
        j.addView((View) frameLayout, tre.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void E0();

    @Override
    public final void H() {
        super.H();
        if (this.l1) {
            E0();
        }
    }
}
