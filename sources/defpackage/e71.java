package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e71 extends a71 {
    public final ArrayList f;
    public final o71 h;

    public e71(o71 o71Var) {
        super(0);
        this.h = o71Var;
        this.f = new ArrayList();
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        o71 o71Var = this.h;
        if (o71Var.h != null) {
            for (int i = 0; i < o71Var.h.b.size(); i++) {
                ?? jaVar = new ja(1, true);
                jaVar.c = (l61) o71Var.h.b.get(i);
                arrayList2.add(jaVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        String G;
        float f;
        boolean z2;
        if (s49Var.f == 1) {
            q61 q61Var = (q61) s49Var.a;
            ArrayList arrayList = this.e;
            l61 l61Var = ((h71) arrayList.get(i)).c;
            o71 o71Var = this.h;
            TLObject Z1 = o71Var.e.getMessagesController().Z1(l61Var.a);
            l61 l61Var2 = q61Var.a;
            if (l61Var2 != null && l61Var2.a == l61Var.a) {
                z = true;
            } else {
                z = false;
            }
            if (l61Var.a == Long.MAX_VALUE) {
                G = k96.M0(2131752635, null);
                q61Var.getImageView().getAvatarDrawable().f(14);
                q61Var.getImageView().f(null, q61Var.getImageView().getAvatarDrawable());
            } else {
                be0 imageView = q61Var.getImageView();
                if (imageView != null) {
                    G = cf3.G(imageView.getImageReceiver(), imageView.getAvatarDrawable(), Z1);
                } else {
                    G = cf3.G(null, null, Z1);
                }
            }
            q61Var.a = l61Var;
            be0 imageView2 = q61Var.getImageView();
            if ((Z1 instanceof TLRPC.Chat) && ((TLRPC.Chat) Z1).forum) {
                f = 12.0f;
            } else {
                f = 19.0f;
            }
            imageView2.setRoundRadius(gl.L(f));
            String i0 = gl.i0(l61Var.c, false, false);
            if (i < arrayList.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            TextView textView = q61Var.c;
            textView.setText(vu3.m(G, textView.getPaint().getFontMetricsInt(), false, null, 0));
            hn hnVar = q61Var.d;
            hnVar.c(i0, false, true);
            hnVar.setVisibility(0);
            q61Var.f = z2;
            q61Var.setWillNotDraw(!z2);
            q61Var.requestLayout();
            boolean contains = o71Var.h.l.contains(Long.valueOf(l61Var.a));
            if (q61Var.n == null) {
                if (!contains) {
                    return;
                }
                wf2 wf2Var = new wf2(21, q61Var.b, q61Var.getContext());
                q61Var.n = wf2Var;
                wf2Var.b(-1, bkb.c6, bkb.j7);
                q61Var.n.setDrawUnchecked(false);
                int i2 = 3;
                q61Var.n.setDrawBackgroundAsArc(3);
                wf2 wf2Var2 = q61Var.n;
                if (k96.a0) {
                    i2 = 5;
                }
                q61Var.addView(wf2Var2, nme.d(24, 24.0f, i2 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            q61Var.n.a(contains, z);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        q61 q61Var = null;
        if (i == 1) {
            q61Var = new q61(this.h.getContext(), null);
        }
        return new s49(q61Var);
    }
}
