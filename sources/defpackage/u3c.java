package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u3c implements icc {
    public final byte a;
    public final b4c b;

    public u3c(b4c b4cVar, byte b) {
        this.a = b;
        this.b = b4cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        String str;
        byte b = this.a;
        b4c b4cVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                String[] strArr = b4cVar.d2;
                arrayList.add(b8c.C(null));
                l9cVar.G = true;
                l9cVar.V();
                String str2 = b4cVar.Z1;
                if (str2 != null) {
                    M0 = r3c.F0(r3c.K0(str2, null, null));
                } else {
                    M0 = ob6.M0(2131754983, null);
                }
                arrayList.add(v3c.i(3, "", M0, null, null));
                arrayList.add(z3c.i(4, b4cVar.V1, b4cVar.f2, new jjb(b4cVar, l9cVar, (byte) 3), new r94(b4cVar, (byte) 2), null));
                StringBuilder sb = new StringBuilder();
                sb.append(r3c.K0(b4cVar.a2, null, null));
                if (b4cVar.b2 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = c00.k(new StringBuilder(" ("), strArr[b4cVar.b2], ")");
                }
                sb.append(str);
                arrayList.add(v3c.i(5, "", r3c.F0(sb.toString()), null, new t3c(b4cVar, (byte) 4)));
                arrayList.add(z3c.i(6, b4cVar.X1, false, null, new r94(b4cVar, (byte) 2), null));
                l9cVar.U();
                arrayList.add(b8c.C(null));
                l9cVar.V();
                arrayList.add(b8c.c(1, 2131232108, ob6.M0(2131743613, null)));
                l9cVar.U();
                return;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b4cVar.g2 = -1;
                c51 c51Var = b4cVar.U1;
                c51Var.setLoading(false);
                if (tL_error != null) {
                    ik8.u(b4cVar.F, b4cVar.J0, tL_error, false);
                    c51Var.setText(ob6.M0(2131747558, null));
                    c51Var.setOnClickListener(new t3c(b4cVar, (byte) 0));
                    return;
                } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                    b4cVar.X1 = r47.h0(tL_messages_translateResult.result.get(0), false);
                    b4cVar.W1 = false;
                    b4cVar.e2.O(true);
                    return;
                } else {
                    c51Var.setText(ob6.M0(2131747558, null));
                    c51Var.setOnClickListener(new t3c(b4cVar, (byte) 1));
                    return;
                }
        }
    }
}
