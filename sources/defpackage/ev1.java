package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Wallet.c;
public final class ev1 implements k8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ev1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj7;
                boolean[] zArr = (boolean[]) obj6;
                bjc bjcVar = (bjc) obj5;
                String str = (String) obj4;
                Boolean bool = (Boolean) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                int i = ChatActivityEnterView.r7;
                uv1 uv1Var = chatActivityEnterView.e6;
                boolean z = false;
                if (!zArr[0]) {
                    zArr[0] = true;
                    chatActivityEnterView.N0 = System.currentTimeMillis();
                    bjcVar.run();
                    long z2 = chatActivityEnterView.z2(str, new hn1(chatActivityEnterView, bool, num, num2, (byte) 3));
                    if (num.intValue() == 0) {
                        z = true;
                    }
                    chatActivityEnterView.d6 = z;
                    gl.r(uv1Var);
                    gl.d3(uv1Var, z2 + 500);
                    return;
                }
                return;
            case 1:
                c cVar = (c) obj7;
                p8c p8cVar = (p8c) obj6;
                byte[] bArr = (byte[]) obj5;
                y05 y05Var = (y05) obj4;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                int i2 = cVar.a;
                if (tL_error != null) {
                    if (!"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        String str2 = tL_error.text;
                        if (str2 == null) {
                            str2 = "NULL_ERROR";
                        }
                        p8cVar.a(str2);
                        return;
                    }
                    return;
                }
                cVar.w0(walletState);
                new g15(i2, c.B(), cVar.x()).q(y6c.h(i2).e(), bArr, y05Var, p8cVar);
                cVar.Y();
                return;
            default:
                ypc ypcVar = (ypc) obj7;
                c cVar2 = (c) obj6;
                TLRPC.User user = (TLRPC.User) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                p8c p8cVar2 = (p8c) obj3;
                if (!c.b(ypcVar.f, cVar2.x())) {
                    p8cVar2.a("WALLET_CHANGED");
                    return;
                } else {
                    cVar2.l0(user, str3, 0L, str4, null, ypcVar.e, null, new nu9(ypcVar, p8cVar2, (byte) 23), null);
                    return;
                }
        }
    }
}
