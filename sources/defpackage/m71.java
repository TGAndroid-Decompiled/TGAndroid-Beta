package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m71 extends i71 {
    public final ArrayList f;
    public final w71 h;

    public m71(w71 w71Var) {
        super(0);
        this.h = w71Var;
        this.f = new ArrayList();
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w71 w71Var = this.h;
        if (w71Var.h != null) {
            for (int i = 0; i < w71Var.h.b.size(); i++) {
                ?? kaVar = new ka(1, true);
                kaVar.c = (t61) w71Var.h.b.get(i);
                arrayList2.add(kaVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        String G;
        float f;
        boolean z2;
        if (f89Var.f == 1) {
            y61 y61Var = (y61) f89Var.a;
            ArrayList arrayList = this.e;
            t61 t61Var = ((p71) arrayList.get(i)).c;
            w71 w71Var = this.h;
            TLObject b2 = w71Var.e.getMessagesController().b2(t61Var.a);
            t61 t61Var2 = y61Var.a;
            if (t61Var2 != null && t61Var2.a == t61Var.a) {
                z = true;
            } else {
                z = false;
            }
            if (t61Var.a == Long.MAX_VALUE) {
                G = ob6.M0(2131752628, null);
                y61Var.getImageView().getAvatarDrawable().f(14);
                y61Var.getImageView().f(null, y61Var.getImageView().getAvatarDrawable());
            } else {
                de0 imageView = y61Var.getImageView();
                if (imageView != null) {
                    G = wf3.G(imageView.getImageReceiver(), imageView.getAvatarDrawable(), b2);
                } else {
                    G = wf3.G(null, null, b2);
                }
            }
            y61Var.a = t61Var;
            de0 imageView2 = y61Var.getImageView();
            if ((b2 instanceof TLRPC.Chat) && ((TLRPC.Chat) b2).forum) {
                f = 12.0f;
            } else {
                f = 19.0f;
            }
            imageView2.setRoundRadius(hl.L(f));
            String i0 = hl.i0(t61Var.c, false, false);
            if (i < arrayList.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            TextView textView = y61Var.c;
            textView.setText(pv3.m(G, textView.getPaint().getFontMetricsInt(), false, null, 0));
            in inVar = y61Var.d;
            inVar.c(i0, false, true);
            inVar.setVisibility(0);
            y61Var.f = z2;
            y61Var.setWillNotDraw(!z2);
            y61Var.requestLayout();
            boolean contains = w71Var.h.l.contains(Long.valueOf(t61Var.a));
            if (y61Var.n == null) {
                if (!contains) {
                    return;
                }
                og2 og2Var = new og2(21, y61Var.b, y61Var.getContext());
                y61Var.n = og2Var;
                og2Var.b(-1, aob.d6, aob.k7);
                y61Var.n.setDrawUnchecked(false);
                int i2 = 3;
                y61Var.n.setDrawBackgroundAsArc(3);
                og2 og2Var2 = y61Var.n;
                if (ob6.a0) {
                    i2 = 5;
                }
                y61Var.addView(og2Var2, tre.d(24, 24.0f, i2 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y61Var.n.a(contains, z);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        y61 y61Var = null;
        if (i == 1) {
            y61Var = new y61(this.h.getContext(), null);
        }
        return new f89(y61Var);
    }
}
