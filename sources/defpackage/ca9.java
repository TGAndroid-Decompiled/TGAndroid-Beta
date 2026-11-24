package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ca9 extends FrameLayout implements vlb {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final q7c f;
    public final jp0 h;
    public ba9 n;
    public FrameLayout r;
    public b61 s;
    public final da9 w;

    public ca9(da9 da9Var, Context context) {
        super(context);
        this.w = da9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, gm.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, qoe.e(-1, -1, 119));
        int i = da9.v1;
        jp0 jp0Var = new jp0(context, da9Var.J0);
        TextView textView = (TextView) jp0Var.b;
        this.h = jp0Var;
        jp0Var.e = new aa9(this, (byte) 0);
        if (da9Var.o1) {
            textView.setText(jb6.M0(2131745967, null));
        } else if (da9Var.p1) {
            textView.setText(jb6.M0(2131745928, null));
        } else {
            textView.setText(jb6.M0(2131745976, null));
        }
        ((ee0) jp0Var.d).a(cmb.v0(cmb.F6, da9Var.J0));
        anb.h(cmb.g5, da9Var.J0, jp0Var);
        addView(jp0Var, qoe.e(-1, -2, 55));
        q7c q7cVar = new q7c(context, da9Var.a, 0, true, new vh8(this, (byte) 7), new h68(this, (byte) 26), null, da9Var.J0);
        this.f = q7cVar;
        q7cVar.setClipToPadding(false);
        q7cVar.f3.j1(true);
        q7cVar.setOnScrollListener(new so7(this, (byte) 11));
        frameLayout.addView(q7cVar, qoe.c(-1.0f, -1));
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
        q7c q7cVar = this.f;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            gm.d3(new aa9(this, (byte) 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        ee0 ee0Var;
        try {
            jp0 jp0Var = this.h;
            if (jp0Var != null && (ee0Var = (ee0) jp0Var.d) != null) {
                int i = cmb.F6;
                da9 da9Var = this.w;
                int i2 = da9.v1;
                ee0Var.a(cmb.v0(i, da9Var.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
