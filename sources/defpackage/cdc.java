package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.view.Window;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cdc implements v04 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public boolean a;
    public int b;
    public final Object c;

    public cdc(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i;
    }

    public static long b(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final boolean a() {
        g24 g24Var;
        tx1 tx1Var;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.m4) {
            if ((chatActivityEnterView.o4 || (tx1Var = chatActivityEnterView.F0) == null || tx1Var.length() <= 0) && (g24Var = chatActivityEnterView.V0.z0) != null && g24Var.b() > 0 && !chatActivityEnterView.Z3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        int i;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        wma wmaVar = chatActivityEnterView.b2;
        if (a()) {
            AnimatorSet animatorSet = chatActivityEnterView.q4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.t4 = true;
            this.a = chatActivityEnterView.o4;
            chatActivityEnterView.o4 = true;
            jn7.e().k(jn7.j1, 1);
            int height = ((((wmaVar.getHeight() - hl.m) - hl.n) - hl.L(6.0f)) - a.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.s4 = height;
            if (chatActivityEnterView.G2 == 2) {
                int L = hl.L(175.0f);
                Point point = hl.q;
                if (point.x > point.y) {
                    i = chatActivityEnterView.n3;
                } else {
                    i = chatActivityEnterView.m3;
                }
                chatActivityEnterView.s4 = Math.min(height, L + i);
            }
            if (chatActivityEnterView.I7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.s4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            wmaVar.requestLayout();
            if (chatActivityEnterView.i6) {
                wmaVar.setForeground(new ya1(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            xy1 xy1Var = chatActivityEnterView.O3;
            if (xy1Var != null) {
                xy1Var.Z0();
            }
        }
    }

    public final long d(cb3 cb3Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (!this.a) {
            if (!cb3Var.c(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 < 8) {
                    if ((d[i4] & i3) != 0) {
                        i2 = i4 + 1;
                        break;
                    }
                    i4++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.b = i2;
            if (i2 != -1) {
                this.a = true;
            } else {
                grb.i("No valid varint length mask found");
                return 0L;
            }
        }
        int i5 = this.b;
        if (i5 > i) {
            this.a = false;
            return -2L;
        }
        if (i5 != 1) {
            cb3Var.c(bArr, 1, i5 - 1, false);
        }
        this.a = false;
        return b(this.b, z2, bArr);
    }

    public cdc(FrameLayout frameLayout) {
        this.c = frameLayout;
    }

    public cdc(Window window) {
        this.c = new ftb(new WeakReference(window), (byte) 24);
    }

    public cdc() {
        this.c = new byte[8];
    }
}
