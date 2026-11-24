package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class a89 extends FrameLayout implements tjb {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final q5c f;
    public final jo0 h;
    public z79 n;
    public FrameLayout r;
    public u41 s;
    public final b89 w;

    public a89(b89 b89Var, Context context) {
        super(context);
        this.w = b89Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, gl.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, nme.e(-1, -1, 119));
        int i = b89.v1;
        jo0 jo0Var = new jo0(context, b89Var.J0);
        TextView textView = (TextView) jo0Var.b;
        this.h = jo0Var;
        jo0Var.e = new y79(this, (byte) 0);
        if (b89Var.o1) {
            textView.setText(k96.M0(2131746041, null));
        } else if (b89Var.p1) {
            textView.setText(k96.M0(2131746002, null));
        } else {
            textView.setText(k96.M0(2131746050, null));
        }
        ((ed0) jo0Var.d).a(bkb.v0(bkb.F6, b89Var.J0));
        zkb.h(bkb.g5, b89Var.J0, jo0Var);
        addView(jo0Var, nme.e(-1, -2, 55));
        q5c q5cVar = new q5c(context, b89Var.a, 0, true, new tf8(this, (byte) 7), new k88(this, (byte) 22), null, b89Var.J0);
        this.f = q5cVar;
        q5cVar.setClipToPadding(false);
        q5cVar.f3.j1(true);
        q5cVar.setOnScrollListener(new n58(this, (byte) 10));
        frameLayout.addView(q5cVar, nme.c(-1.0f, -1));
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
        q5c q5cVar = this.f;
        if (q5cVar != null) {
            q5cVar.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            gl.e3(new y79(this, (byte) 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        ed0 ed0Var;
        try {
            jo0 jo0Var = this.h;
            if (jo0Var != null && (ed0Var = (ed0) jo0Var.d) != null) {
                int i = bkb.F6;
                b89 b89Var = this.w;
                int i2 = b89.v1;
                ed0Var.a(bkb.v0(i, b89Var.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
