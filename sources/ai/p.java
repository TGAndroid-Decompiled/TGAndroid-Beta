package ai;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p extends v4.g0 {
    public final q0 f1597c;

    public p(q0 q0Var) {
        this.f1597c = q0Var;
    }

    @Override
    public final int b() {
        return this.f1597c.f1678s;
    }

    @Override
    public final int d(int i7) {
        q0 q0Var = this.f1597c;
        t tVar = (t) q0Var.f1676n.get(q0Var.f(i7));
        if (tVar.f1642b != null && i7 == tVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        int i10;
        q0 q0Var = this.f1597c;
        t tVar = (t) q0Var.f1676n.get(q0Var.f(i7));
        int i11 = d1Var.f56955f;
        View view = d1Var.f56951a;
        int i12 = 1;
        int i13 = 0;
        if (i11 == 0) {
            s sVar = (s) view;
            String str2 = tVar.f1642b;
            if (q0Var.f1680x || tVar.f1641a != 2) {
                i12 = 0;
            }
            TextView textView = sVar.f1611b;
            TextView textView2 = sVar.f1610a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(sVar.f1612c.f1681y);
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
        ArrayList arrayList = tVar.f1643c;
        int i15 = i7 - tVar.d;
        if (tVar.f1642b == null) {
            i12 = 0;
        }
        ((q) view).set((TLRPC.Document) arrayList.get(i15 - i12));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View qVar;
        q0 q0Var = this.f1597c;
        if (i7 == 0) {
            qVar = new s(q0Var, viewGroup.getContext());
            qVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            qVar = new q(viewGroup.getContext(), q0Var.f1671a);
            qVar.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(qVar);
    }
}
