package bi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k extends u4.h0 {
    public final h0 f3777c;

    public k(h0 h0Var) {
        this.f3777c = h0Var;
    }

    @Override
    public final int b() {
        return this.f3777c.f3845s;
    }

    @Override
    public final int d(int i3) {
        h0 h0Var = this.f3777c;
        o oVar = (o) h0Var.f3843n.get(h0Var.f(i3));
        if (oVar.f3804b != null && i3 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        int i10;
        h0 h0Var = this.f3777c;
        o oVar = (o) h0Var.f3843n.get(h0Var.f(i3));
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        int i12 = 1;
        int i13 = 0;
        if (i11 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f3804b;
            if (h0Var.f3847x || oVar.f3803a != 2) {
                i12 = 0;
            }
            TextView textView = nVar.f3799b;
            TextView textView2 = nVar.f3798a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f3800c.f3848y);
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
        ArrayList arrayList = oVar.f3805c;
        int i15 = i3 - oVar.d;
        if (oVar.f3804b == null) {
            i12 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i15 - i12));
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View lVar;
        h0 h0Var = this.f3777c;
        if (i3 == 0) {
            lVar = new n(h0Var, viewGroup.getContext());
            lVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), h0Var.f3838a);
            lVar.setLayoutParams(new u4.p0(-1, -2));
        }
        return new u4.d1(lVar);
    }
}
