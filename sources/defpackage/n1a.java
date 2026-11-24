package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n1a implements Runnable {
    public final byte a;
    public final CharSequence b;
    public final j5 c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int h;
    public final int n;

    public n1a(CharSequence charSequence, j5 j5Var, long j, long j2, boolean z, int i, int i2, byte b) {
        this.a = b;
        this.b = charSequence;
        this.c = j5Var;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.h = i;
        this.n = i2;
    }

    @Override
    public final void run() {
        k27 k27Var;
        TLRPC.TL_forumTopic f;
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                CharSequence charSequence = this.b;
                j5 j5Var = this.c;
                long j = this.d;
                long j2 = this.e;
                boolean z = this.f;
                int i = this.h;
                int i2 = this.n;
                CharSequence G = z3a.G(charSequence);
                int i3 = j5Var.a;
                int r1 = na7.q1(i3).r1();
                if (G != null && G.length() != 0) {
                    int ceil = (int) Math.ceil(G.length() / r1);
                    char c = 0;
                    int i4 = 1;
                    if (j != 0 && (f = na7.q1(i3).g4.f(-j2, j)) != null && (message = f.topicStartMessage) != null) {
                        k27Var = new k27(i3, message, false, false);
                        k27Var.p = true;
                    } else {
                        k27Var = null;
                    }
                    int i5 = 0;
                    while (i5 < ceil) {
                        int i6 = i5 + 1;
                        CharSequence[] charSequenceArr = new CharSequence[i4];
                        charSequenceArr[c] = G.subSequence(i5 * r1, Math.min(i6 * r1, G.length()));
                        ArrayList Y = hq6.d0(i3).Y(charSequenceArr, i4, i4);
                        int i7 = i;
                        char c2 = c;
                        boolean z2 = i4;
                        int i8 = ceil;
                        CharSequence charSequence2 = G;
                        int i9 = i2;
                        int i10 = r1;
                        k27 k27Var2 = k27Var;
                        x3a b = x3a.b(charSequenceArr[c].toString(), j2, k27Var2, k27Var, null, true, null, null, null, z, i7, i9, null, false);
                        b.w = Y;
                        if (i5 == 0) {
                            b.O = 0L;
                        }
                        z3a.B(i3).q0(b);
                        G = charSequence2;
                        k27Var = k27Var2;
                        i = i7;
                        i2 = i9;
                        i5 = i6;
                        r1 = i10;
                        c = c2;
                        i4 = z2;
                        ceil = i8;
                    }
                    return;
                }
                return;
            case 1:
                Utilities.d.c(new n1a(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 2));
                return;
            default:
                gl.c3(new n1a(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
                return;
        }
    }
}
