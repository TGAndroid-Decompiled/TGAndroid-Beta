package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v1c implements jac {
    public final byte a;
    public final c2c b;

    public v1c(c2c c2cVar, byte b) {
        this.a = b;
        this.b = c2cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        byte b = this.a;
        c2c c2cVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                String[] strArr = c2cVar.d2;
                arrayList.add(c6c.C(null));
                l7cVar.G = true;
                l7cVar.V();
                String str2 = c2cVar.Z1;
                if (str2 != null) {
                    M0 = s1c.E0(s1c.J0(str2, null, null));
                } else {
                    M0 = jb6.M0(2131754986, null);
                }
                arrayList.add(w1c.i(3, "", M0, null, null));
                arrayList.add(a2c.i(4, c2cVar.V1, c2cVar.f2, new fyb(c2cVar, l7cVar, (byte) 1), new sj8(c2cVar, (byte) 1), null));
                StringBuilder sb = new StringBuilder();
                sb.append(s1c.J0(c2cVar.a2, null, null));
                if (c2cVar.b2 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = b10.j(new StringBuilder(" ("), strArr[c2cVar.b2], ")");
                }
                sb.append(str);
                arrayList.add(w1c.i(5, "", s1c.E0(sb.toString()), null, new u1c(c2cVar, (byte) 4)));
                arrayList.add(a2c.i(6, c2cVar.X1, false, null, new sj8(c2cVar, (byte) 1), null));
                l7cVar.U();
                arrayList.add(c6c.C(null));
                l7cVar.V();
                arrayList.add(c6c.c(1, 2131232109, jb6.M0(2131743645, null)));
                l7cVar.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2cVar.g2 = -1;
                b61 b61Var = c2cVar.U1;
                b61Var.setLoading(false);
                if (tL_error != null) {
                    wi8.u(c2cVar.F, c2cVar.J0, tL_error, false);
                    b61Var.setText(jb6.M0(2131747564, null));
                    b61Var.setOnClickListener(new u1c(c2cVar, (byte) 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    c2cVar.X1 = k47.h0(tL_messages_translateResult.result.get(0), false);
                    c2cVar.W1 = false;
                    c2cVar.e2.O(true);
                    return;
                } else {
                    b61Var.setText(jb6.M0(2131747564, null));
                    b61Var.setOnClickListener(new u1c(c2cVar, (byte) 1));
                    return;
                }
        }
    }
}
