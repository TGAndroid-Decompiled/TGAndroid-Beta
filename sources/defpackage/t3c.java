package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class t3c implements View.OnClickListener {
    public final byte a;
    public final b4c b;

    public t3c(b4c b4cVar, byte b) {
        this.a = b;
        this.b = b4cVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        b4c b4cVar = this.b;
        switch (b) {
            case 0:
                b4cVar.dismiss();
                return;
            case 1:
                b4cVar.dismiss();
                return;
            case 2:
                b4cVar.dismiss();
                return;
            case 3:
                CharSequence charSequence = b4cVar.X1;
                if (charSequence != null) {
                    b4cVar.Y1.a(charSequence);
                }
                b4cVar.dismiss();
                return;
            default:
                final b4c b4cVar2 = this.b;
                fu5 G = fu5.G(b4cVar2.c, b4cVar2.J0, view);
                G.d0 = hl.L(450.0f);
                int i = 0;
                G.t = false;
                G.e0 = true;
                ScrollView scrollView = new ScrollView(b4cVar2.getContext());
                LinearLayout linearLayout = new LinearLayout(b4cVar2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                G.p(scrollView);
                for (int i2 = 0; i2 < b4cVar2.c2.length; i2++) {
                    if (b4cVar2.b2 == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b4cVar2.Z0(G, linearLayout, z, b4cVar2.d2[i2], new me7(b4cVar2, i2, (byte) 23));
                }
                View k8Var = new k8(b4cVar2.getContext(), b4cVar2.J0);
                k8Var.setTag(2131296439, 1);
                linearLayout.addView(k8Var, tre.o(-1, 8));
                ArrayList n = a5c.n(null);
                ArrayList m = a5c.m();
                if (!TextUtils.isEmpty(b4cVar2.a2)) {
                    b4cVar2.Z0(G, linearLayout, true, r3c.F0(r3c.K0(b4cVar2.a2, null, null)), null);
                }
                int size = n.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    final t4c t4cVar = (t4c) n.get(i3);
                    if (!TextUtils.equals(t4cVar.a, b4cVar2.a2)) {
                        b4cVar2.Z0(G, linearLayout, false, t4cVar.b, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                t4c t4cVar2 = t4cVar;
                                b4c b4cVar3 = b4cVar2;
                                switch (b2) {
                                    case 0:
                                        b4cVar3.a1();
                                        String str = t4cVar2.a;
                                        b4cVar3.a2 = str;
                                        r3c.P0(str);
                                        b4cVar3.b1();
                                        return;
                                    default:
                                        b4cVar3.a1();
                                        String str2 = t4cVar2.a;
                                        b4cVar3.a2 = str2;
                                        r3c.P0(str2);
                                        b4cVar3.b1();
                                        return;
                                }
                            }
                        });
                    }
                    i3 = i4;
                }
                View k8Var2 = new k8(b4cVar2.getContext(), b4cVar2.J0);
                k8Var2.setTag(2131296439, 1);
                linearLayout.addView(k8Var2, tre.o(-1, 8));
                int size2 = m.size();
                while (i < size2) {
                    Object obj = m.get(i);
                    i++;
                    final t4c t4cVar2 = (t4c) obj;
                    b4cVar2.Z0(G, linearLayout, TextUtils.equals(t4cVar2.a, b4cVar2.a2), t4cVar2.b, new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            t4c t4cVar22 = t4cVar2;
                            b4c b4cVar3 = b4cVar2;
                            switch (b2) {
                                case 0:
                                    b4cVar3.a1();
                                    String str = t4cVar22.a;
                                    b4cVar3.a2 = str;
                                    r3c.P0(str);
                                    b4cVar3.b1();
                                    return;
                                default:
                                    b4cVar3.a1();
                                    String str2 = t4cVar22.a;
                                    b4cVar3.a2 = str2;
                                    r3c.P0(str2);
                                    b4cVar3.b1();
                                    return;
                            }
                        }
                    });
                }
                G.a0();
                return;
        }
    }
}
