package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class yv5 extends my0 {
    public boolean l1;

    public yv5(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.w0 = false;
        this.v0 = false;
        LinearLayout i = hg9.i(context, 1);
        this.O = i;
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(45.0f));
        i.addView(bf0Var, qoe.t(90, 90, 49, 0, 29, 0, 0));
        bf0Var.f(chat, new pc0(chat));
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 18.0f);
        anb.X(textView, cmb.i5, null);
        textView.setGravity(1);
        TextView m = wi8.m(i, textView, qoe.t(-2, -2, 49, 17, 24, 17, 0), context);
        m.setTextSize(1, 14.0f);
        anb.X(m, cmb.q5, null);
        m.setGravity(1);
        i.addView(m, qoe.t(-2, -2, 49, 30, 8, 30, 0));
        qd2 f1 = oc7.r1(j5.a(this.a).a).f1(chat.id, false, null);
        if (f1 != null) {
            if (TextUtils.isEmpty(f1.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(f1.b.title);
            }
            int i2 = f1.b.participants_count;
            if (i2 == 0) {
                m.setText(jb6.M0(2131747920, null));
            } else {
                m.setText(jb6.G(i2, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            m.setText(jb6.M0(2131747920, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.a = view;
        view.setBackground(ulb.f(cmb.Ei, 4.0f));
        frameLayout.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        td4.x(textView2, cmb.Ii, null, 1, 14.0f);
        frameLayout.addView(textView2, qoe.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (sd2.W(chat)) {
            frameLayout.setText(jb6.M0(2131743159, null));
        } else {
            frameLayout.setText(jb6.M0(2131743049, null));
        }
        view.setOnClickListener(new ca5(this, (byte) 15));
        i.addView((View) frameLayout, qoe.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void D0();

    @Override
    public final void H() {
        super.H();
        if (this.l1) {
            D0();
        }
    }
}
