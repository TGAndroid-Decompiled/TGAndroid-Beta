package ci;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import v4.e1;
public final class k extends v4.h0 {
    public final h0 f5694c;

    public k(h0 h0Var) {
        this.f5694c = h0Var;
    }

    @Override
    public final int b() {
        return this.f5694c.f5759s;
    }

    @Override
    public final int d(int i7) {
        h0 h0Var = this.f5694c;
        o oVar = (o) h0Var.f5757n.get(h0Var.f(i7));
        if (oVar.f5721b != null && i7 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        String str;
        int i10;
        h0 h0Var = this.f5694c;
        o oVar = (o) h0Var.f5757n.get(h0Var.f(i7));
        int i11 = e1Var.f59115f;
        View view = e1Var.f59111a;
        int i12 = 1;
        int i13 = 0;
        if (i11 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f5721b;
            if (h0Var.f5761x || oVar.f5720a != 2) {
                i12 = 0;
            }
            TextView textView = nVar.f5716b;
            TextView textView2 = nVar.f5715a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f5717c.f5762y);
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
        ArrayList arrayList = oVar.f5722c;
        int i15 = i7 - oVar.d;
        if (oVar.f5721b == null) {
            i12 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i15 - i12));
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        View lVar;
        h0 h0Var = this.f5694c;
        if (i7 == 0) {
            lVar = new n(h0Var, viewGroup.getContext());
            lVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), h0Var.f5752a);
            lVar.setLayoutParams(new v4.p0(-1, -2));
        }
        return new e1(lVar);
    }
}
