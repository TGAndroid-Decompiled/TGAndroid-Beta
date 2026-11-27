package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class mb9 extends FrameLayout implements snb {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final q9c f;
    public final jo0 h;
    public lb9 n;
    public FrameLayout r;
    public c51 s;
    public final nb9 w;

    public mb9(nb9 nb9Var, Context context) {
        super(context);
        this.w = nb9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, hl.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, tre.e(-1, -1, 119));
        int i = nb9.v1;
        jo0 jo0Var = new jo0(context, nb9Var.J0);
        TextView textView = (TextView) jo0Var.b;
        this.h = jo0Var;
        jo0Var.e = new kb9(this, (byte) 0);
        if (nb9Var.o1) {
            textView.setText(ob6.M0(2131745961, null));
        } else if (nb9Var.p1) {
            textView.setText(ob6.M0(2131745922, null));
        } else {
            textView.setText(ob6.M0(2131745970, null));
        }
        ((gd0) jo0Var.d).a(aob.v0(aob.G6, nb9Var.J0));
        yob.h(aob.h5, nb9Var.J0, jo0Var);
        addView(jo0Var, tre.e(-1, -2, 55));
        q9c q9cVar = new q9c(context, nb9Var.a, 0, true, new hj8(this, (byte) 7), new jz7(this, (byte) 29), null, nb9Var.J0);
        this.f = q9cVar;
        q9cVar.setClipToPadding(false);
        q9cVar.f3.j1(true);
        q9cVar.setOnScrollListener(new e98(this, (byte) 10));
        frameLayout.addView(q9cVar, tre.c(-1.0f, -1));
    }

    public final void a(int i) {
        boolean z;
        this.a = i;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h.b(z);
        q9c q9cVar = this.f;
        if (q9cVar != null) {
            q9cVar.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            hl.d3(new kb9(this, (byte) 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        gd0 gd0Var;
        try {
            jo0 jo0Var = this.h;
            if (jo0Var != null && (gd0Var = (gd0) jo0Var.d) != null) {
                int i = aob.G6;
                nb9 nb9Var = this.w;
                int i2 = nb9.v1;
                gd0Var.a(aob.v0(i, nb9Var.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
