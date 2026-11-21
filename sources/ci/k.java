package ci;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import v4.f1;
public final class k extends v4.i0 {
    public final h0 f5728c;

    public k(h0 h0Var) {
        this.f5728c = h0Var;
    }

    @Override
    public final int b() {
        return this.f5728c.f5793s;
    }

    @Override
    public final int d(int i7) {
        h0 h0Var = this.f5728c;
        o oVar = (o) h0Var.f5791n.get(h0Var.f(i7));
        if (oVar.f5755b != null && i7 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        String str;
        int i10;
        h0 h0Var = this.f5728c;
        o oVar = (o) h0Var.f5791n.get(h0Var.f(i7));
        int i11 = f1Var.f59165f;
        View view = f1Var.f59161a;
        int i12 = 1;
        int i13 = 0;
        if (i11 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f5755b;
            if (h0Var.f5795x || oVar.f5754a != 2) {
                i12 = 0;
            }
            TextView textView = nVar.f5750b;
            TextView textView2 = nVar.f5749a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f5751c.f5796y);
            if (i12 != 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int L = org.telegram.messenger.g0.L(15.0f);
            if (i12 != 0) {
                i13 = org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i14 = L + i13;
            if (layoutParams.rightMargin != i14) {
                layoutParams.rightMargin = i14;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = oVar.f5756c;
        int i15 = i7 - oVar.d;
        if (oVar.f5755b == null) {
            i12 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i15 - i12));
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        View lVar;
        h0 h0Var = this.f5728c;
        if (i7 == 0) {
            lVar = new n(h0Var, viewGroup.getContext());
            lVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), h0Var.f5786a);
            lVar.setLayoutParams(new v4.q0(-1, -2));
        }
        return new f1(lVar);
    }
}
