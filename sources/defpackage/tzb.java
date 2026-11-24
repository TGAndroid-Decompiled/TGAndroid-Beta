package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class tzb implements View.OnClickListener {
    public final byte a;
    public final c0c b;

    public tzb(c0c c0cVar, byte b) {
        this.a = b;
        this.b = c0cVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        c0c c0cVar = this.b;
        switch (b) {
            case 0:
                c0cVar.dismiss();
                return;
            case 1:
                c0cVar.dismiss();
                return;
            case 2:
                c0cVar.dismiss();
                return;
            case 3:
                CharSequence charSequence = c0cVar.X1;
                if (charSequence != null) {
                    c0cVar.Y1.a(charSequence);
                }
                c0cVar.dismiss();
                return;
            default:
                final c0c c0cVar2 = this.b;
                cs5 G = cs5.G(c0cVar2.c, c0cVar2.J0, view);
                G.a0 = gl.L(450.0f);
                int i = 0;
                G.t = false;
                G.b0 = true;
                ScrollView scrollView = new ScrollView(c0cVar2.getContext());
                LinearLayout linearLayout = new LinearLayout(c0cVar2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                G.p(scrollView);
                for (int i2 = 0; i2 < c0cVar2.c2.length; i2++) {
                    if (c0cVar2.b2 == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0cVar2.Y0(G, linearLayout, z, c0cVar2.d2[i2], new on7(c0cVar2, i2, (byte) 20));
                }
                View j8Var = new j8(c0cVar2.getContext(), c0cVar2.J0);
                j8Var.setTag(2131296439, 1);
                linearLayout.addView(j8Var, nme.o(-1, 8));
                ArrayList n = b1c.n(null);
                ArrayList m = b1c.m();
                if (!TextUtils.isEmpty(c0cVar2.a2)) {
                    c0cVar2.Y0(G, linearLayout, true, rzb.E0(rzb.J0(c0cVar2.a2, null, null)), null);
                }
                int size = n.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    final u0c u0cVar = (u0c) n.get(i3);
                    if (!TextUtils.equals(u0cVar.a, c0cVar2.a2)) {
                        c0cVar2.Y0(G, linearLayout, false, u0cVar.b, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                u0c u0cVar2 = u0cVar;
                                c0c c0cVar3 = c0cVar2;
                                switch (b2) {
                                    case 0:
                                        c0cVar3.Z0();
                                        String str = u0cVar2.a;
                                        c0cVar3.a2 = str;
                                        rzb.O0(str);
                                        c0cVar3.a1();
                                        return;
                                    default:
                                        c0cVar3.Z0();
                                        String str2 = u0cVar2.a;
                                        c0cVar3.a2 = str2;
                                        rzb.O0(str2);
                                        c0cVar3.a1();
                                        return;
                                }
                            }
                        });
                    }
                    i3 = i4;
                }
                View j8Var2 = new j8(c0cVar2.getContext(), c0cVar2.J0);
                j8Var2.setTag(2131296439, 1);
                linearLayout.addView(j8Var2, nme.o(-1, 8));
                int size2 = m.size();
                while (i < size2) {
                    Object obj = m.get(i);
                    i++;
                    final u0c u0cVar2 = (u0c) obj;
                    c0cVar2.Y0(G, linearLayout, TextUtils.equals(u0cVar2.a, c0cVar2.a2), u0cVar2.b, new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            u0c u0cVar22 = u0cVar2;
                            c0c c0cVar3 = c0cVar2;
                            switch (b2) {
                                case 0:
                                    c0cVar3.Z0();
                                    String str = u0cVar22.a;
                                    c0cVar3.a2 = str;
                                    rzb.O0(str);
                                    c0cVar3.a1();
                                    return;
                                default:
                                    c0cVar3.Z0();
                                    String str2 = u0cVar22.a;
                                    c0cVar3.a2 = str2;
                                    rzb.O0(str2);
                                    c0cVar3.a1();
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
