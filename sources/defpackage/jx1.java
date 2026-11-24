package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jx1 implements nac {
    public final byte a;
    public final ChatActivityEnterView b;
    public final long c;
    public final ylb d;

    public jx1(ChatActivityEnterView chatActivityEnterView, long j, ylb ylbVar, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = j;
        this.d = ylbVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ylb ylbVar = this.d;
        long j = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.u1((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    ik.J(chatActivityEnterView.E3, j, new vx1(chatActivityEnterView, (byte) 0), ylbVar);
                    return;
                } else {
                    chatActivityEnterView.x1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                int i2 = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.P2 != null) {
                    chatActivityEnterView2.t0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    ik.J(chatActivityEnterView2.E3, j, new wx1(chatActivityEnterView2), ylbVar);
                    return;
                } else {
                    chatActivityEnterView2.x1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
