package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m81 extends h81 {
    public final ArrayList f;
    public final w81 h;

    public m81(w81 w81Var) {
        super(0);
        this.h = w81Var;
        this.f = new ArrayList();
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w81 w81Var = this.h;
        if (w81Var.h != null) {
            for (int i = 0; i < w81Var.h.b.size(); i++) {
                ?? jaVar = new ja(1, true);
                jaVar.c = (s71) w81Var.h.b.get(i);
                arrayList2.add(jaVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        String G;
        float f;
        boolean z2;
        if (u69Var.f == 1) {
            x71 x71Var = (x71) u69Var.a;
            ArrayList arrayList = this.e;
            s71 s71Var = ((p81) arrayList.get(i)).c;
            w81 w81Var = this.h;
            TLObject a2 = w81Var.e.getMessagesController().a2(s71Var.a);
            s71 s71Var2 = x71Var.a;
            if (s71Var2 != null && s71Var2.a == s71Var.a) {
                z = true;
            } else {
                z = false;
            }
            if (s71Var.a == Long.MAX_VALUE) {
                G = jb6.M0(2131752600, null);
                x71Var.getImageView().getAvatarDrawable().f(14);
                x71Var.getImageView().f(null, x71Var.getImageView().getAvatarDrawable());
            } else {
                bf0 imageView = x71Var.getImageView();
                if (imageView != null) {
                    G = pg3.G(imageView.getImageReceiver(), imageView.getAvatarDrawable(), a2);
                } else {
                    G = pg3.G(null, null, a2);
                }
            }
            x71Var.a = s71Var;
            bf0 imageView2 = x71Var.getImageView();
            if ((a2 instanceof TLRPC.Chat) && ((TLRPC.Chat) a2).forum) {
                f = 12.0f;
            } else {
                f = 19.0f;
            }
            imageView2.setRoundRadius(gm.L(f));
            String i0 = gm.i0(s71Var.c, false, false);
            if (i < arrayList.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            TextView textView = x71Var.c;
            textView.setText(gw3.m(G, textView.getPaint().getFontMetricsInt(), false, null, 0));
            io ioVar = x71Var.d;
            ioVar.c(i0, false, true);
            ioVar.setVisibility(0);
            x71Var.f = z2;
            x71Var.setWillNotDraw(!z2);
            x71Var.requestLayout();
            boolean contains = w81Var.h.l.contains(Long.valueOf(s71Var.a));
            if (x71Var.n == null) {
                if (!contains) {
                    return;
                }
                jh2 jh2Var = new jh2(21, x71Var.b, x71Var.getContext());
                x71Var.n = jh2Var;
                jh2Var.b(-1, cmb.c6, cmb.j7);
                x71Var.n.setDrawUnchecked(false);
                int i2 = 3;
                x71Var.n.setDrawBackgroundAsArc(3);
                jh2 jh2Var2 = x71Var.n;
                if (jb6.a0) {
                    i2 = 5;
                }
                x71Var.addView(jh2Var2, qoe.d(24, 24.0f, i2 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x71Var.n.a(contains, z);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        x71 x71Var = null;
        if (i == 1) {
            x71Var = new x71(this.h.getContext(), null);
        }
        return new u69(x71Var);
    }
}
