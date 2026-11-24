package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wv1 implements m8c {
    public final byte a;
    public final ChatActivityEnterView b;
    public final long c;
    public final wjb d;

    public wv1(ChatActivityEnterView chatActivityEnterView, long j, wjb wjbVar, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = j;
        this.d = wjbVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        wjb wjbVar = this.d;
        long j = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i = ChatActivityEnterView.r7;
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.s1((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    ij.J(chatActivityEnterView.E3, j, new iw1(chatActivityEnterView, (byte) 0), wjbVar);
                    return;
                } else {
                    chatActivityEnterView.v1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                int i2 = ChatActivityEnterView.r7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.P2 != null) {
                    chatActivityEnterView2.t0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    ij.J(chatActivityEnterView2.E3, j, new jw1(chatActivityEnterView2), wjbVar);
                    return;
                } else {
                    chatActivityEnterView2.v1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
