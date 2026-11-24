package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class zt5 extends fx0 {
    public boolean l1;

    public zt5(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.w0 = false;
        this.v0 = false;
        LinearLayout j = de9.j(context, 1);
        this.O = j;
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(45.0f));
        j.addView(be0Var, nme.t(90, 90, 49, 0, 29, 0, 0));
        be0Var.f(chat, new pb0(chat));
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 18.0f);
        zkb.X(textView, bkb.i5, null);
        textView.setGravity(1);
        TextView m = ug8.m(j, textView, nme.t(-2, -2, 49, 17, 24, 17, 0), context);
        m.setTextSize(1, 14.0f);
        zkb.X(m, bkb.q5, null);
        m.setGravity(1);
        j.addView(m, nme.t(-2, -2, 49, 30, 8, 30, 0));
        fc2 e1 = na7.q1(j5.a(this.a).a).e1(chat.id, false, null);
        if (e1 != null) {
            if (TextUtils.isEmpty(e1.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(e1.b.title);
            }
            int i = e1.b.participants_count;
            if (i == 0) {
                m.setText(k96.M0(2131747994, null));
            } else {
                m.setText(k96.G(i, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            m.setText(k96.M0(2131747994, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.a = view;
        view.setBackground(sjb.f(bkb.Ei, 4.0f));
        frameLayout.addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        tb4.w(textView2, bkb.Ii, null, 1, 14.0f);
        frameLayout.addView(textView2, nme.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (hc2.W(chat)) {
            frameLayout.setText(k96.M0(2131743233, null));
        } else {
            frameLayout.setText(k96.M0(2131743123, null));
        }
        view.setOnClickListener(new b95(this, (byte) 12));
        j.addView((View) frameLayout, nme.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void D0();

    @Override
    public final void I() {
        super.I();
        if (this.l1) {
            D0();
        }
    }
}
