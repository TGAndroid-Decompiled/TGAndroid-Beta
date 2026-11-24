package defpackage;

import android.content.Context;
import android.database.Observable;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
public abstract class y59 {
    public final z59 a = new Observable();
    public boolean b = false;

    public void B(a69 a69Var) {
        this.a.registerObserver(a69Var);
    }

    public final void C(boolean z) {
        if (!this.a.a()) {
            this.b = z;
        } else {
            dq9.m("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public final u69 a(ViewGroup viewGroup, int i) {
        try {
            int i2 = ozb.a;
            Trace.beginSection("RV CreateView");
            u69 x = x(viewGroup, i);
            if (x.a.getParent() == null) {
                x.f = i;
                Trace.endSection();
                return x;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            int i3 = ozb.a;
            Trace.endSection();
            throw th;
        }
    }

    public int b() {
        return 14;
    }

    public long c(int i) {
        return -1L;
    }

    public int d(int i) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.a.b();
    }

    public void g(int i) {
        this.a.d(i, 1, null);
    }

    public final void h(int i, Object obj) {
        this.a.d(i, 1, obj);
    }

    public void i(int i) {
        this.a.e(i, 1);
    }

    public void j(int i, int i2) {
        this.a.c(i, i2);
    }

    public void l(int i, int i2) {
        this.a.d(i, i2, null);
    }

    public void n(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(int i, int i2) {
        this.a.f(i, i2);
    }

    public void s(int i) {
        this.a.f(i, 1);
    }

    public void w(u69 u69Var, int i, List list) {
        t(u69Var, i);
    }

    public u69 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gm.L(16.0f), gm.L(8.0f), gm.L(16.0f), gm.L(8.0f));
        wb wbVar = new wb(context, (byte) 13);
        linearLayout.b = wbVar;
        nm7.i(wbVar);
        wbVar.setTextSize(1, 16.0f);
        int i2 = cmb.F6;
        anb.X(wbVar, i2, null);
        wbVar.setTag(Integer.valueOf(i2));
        wbVar.setMaxLines(2);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(wbVar, qoe.q(-1, -2, 1.0f, 16, 0, 0, gm.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.a = textView;
        textView.setTextSize(1, 14.0f);
        int i3 = cmb.x6;
        anb.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        linearLayout.addView(textView, qoe.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new g69(-1, -2));
        return new u69(linearLayout);
    }

    public void A(u69 u69Var) {
    }

    public void y(u69 u69Var) {
    }

    public void z(u69 u69Var) {
    }

    public void t(u69 u69Var, int i) {
    }
}
