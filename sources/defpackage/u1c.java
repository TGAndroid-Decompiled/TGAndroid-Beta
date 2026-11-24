package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class u1c implements View.OnClickListener {
    public final byte a;
    public final c2c b;

    public u1c(c2c c2cVar, byte b) {
        this.a = b;
        this.b = c2cVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        c2c c2cVar = this.b;
        switch (b) {
            case 0:
                c2cVar.dismiss();
                return;
            case 1:
                c2cVar.dismiss();
                return;
            case 2:
                c2cVar.dismiss();
                return;
            case 3:
                CharSequence charSequence = c2cVar.X1;
                if (charSequence != null) {
                    c2cVar.Y1.a(charSequence);
                }
                c2cVar.dismiss();
                return;
            default:
                final c2c c2cVar2 = this.b;
                bu5 G = bu5.G(c2cVar2.c, c2cVar2.J0, view);
                G.a0 = gm.L(450.0f);
                int i = 0;
                G.t = false;
                G.b0 = true;
                ScrollView scrollView = new ScrollView(c2cVar2.getContext());
                LinearLayout linearLayout = new LinearLayout(c2cVar2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                G.p(scrollView);
                for (int i2 = 0; i2 < c2cVar2.c2.length; i2++) {
                    if (c2cVar2.b2 == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c2cVar2.Y0(G, linearLayout, z, c2cVar2.d2[i2], new ge7(c2cVar2, i2, (byte) 22));
                }
                View j8Var = new j8(c2cVar2.getContext(), c2cVar2.J0);
                j8Var.setTag(2131296439, 1);
                linearLayout.addView(j8Var, qoe.o(-1, 8));
                ArrayList n = b3c.n(null);
                ArrayList m = b3c.m();
                if (!TextUtils.isEmpty(c2cVar2.a2)) {
                    c2cVar2.Y0(G, linearLayout, true, s1c.E0(s1c.J0(c2cVar2.a2, null, null)), null);
                }
                int size = n.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    final u2c u2cVar = (u2c) n.get(i3);
                    if (!TextUtils.equals(u2cVar.a, c2cVar2.a2)) {
                        c2cVar2.Y0(G, linearLayout, false, u2cVar.b, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                u2c u2cVar2 = u2cVar;
                                c2c c2cVar3 = c2cVar2;
                                switch (b2) {
                                    case 0:
                                        c2cVar3.Z0();
                                        String str = u2cVar2.a;
                                        c2cVar3.a2 = str;
                                        s1c.O0(str);
                                        c2cVar3.a1();
                                        return;
                                    default:
                                        c2cVar3.Z0();
                                        String str2 = u2cVar2.a;
                                        c2cVar3.a2 = str2;
                                        s1c.O0(str2);
                                        c2cVar3.a1();
                                        return;
                                }
                            }
                        });
                    }
                    i3 = i4;
                }
                View j8Var2 = new j8(c2cVar2.getContext(), c2cVar2.J0);
                j8Var2.setTag(2131296439, 1);
                linearLayout.addView(j8Var2, qoe.o(-1, 8));
                int size2 = m.size();
                while (i < size2) {
                    Object obj = m.get(i);
                    i++;
                    final u2c u2cVar2 = (u2c) obj;
                    c2cVar2.Y0(G, linearLayout, TextUtils.equals(u2cVar2.a, c2cVar2.a2), u2cVar2.b, new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            u2c u2cVar22 = u2cVar2;
                            c2c c2cVar3 = c2cVar2;
                            switch (b2) {
                                case 0:
                                    c2cVar3.Z0();
                                    String str = u2cVar22.a;
                                    c2cVar3.a2 = str;
                                    s1c.O0(str);
                                    c2cVar3.a1();
                                    return;
                                default:
                                    c2cVar3.Z0();
                                    String str2 = u2cVar22.a;
                                    c2cVar3.a2 = str2;
                                    s1c.O0(str2);
                                    c2cVar3.a1();
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
