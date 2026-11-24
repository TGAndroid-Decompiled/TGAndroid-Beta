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
public final class c9c implements a04 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public boolean a;
    public int b;
    public final Object c;

    public c9c(MessageDigest messageDigest, int i) {
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
        l14 l14Var;
        ex1 ex1Var;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.n4) {
            if ((chatActivityEnterView.p4 || (ex1Var = chatActivityEnterView.F0) == null || ex1Var.length() <= 0) && (l14Var = chatActivityEnterView.V0.z0) != null && l14Var.b() > 0 && !chatActivityEnterView.a4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        int i;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        cja cjaVar = chatActivityEnterView.c2;
        if (a()) {
            AnimatorSet animatorSet = chatActivityEnterView.r4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.u4 = true;
            this.a = chatActivityEnterView.p4;
            chatActivityEnterView.p4 = true;
            kk7.e().k(kk7.i1, 1);
            int height = ((((cjaVar.getHeight() - gl.m) - gl.n) - gl.L(6.0f)) - a.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.t4 = height;
            if (chatActivityEnterView.H2 == 2) {
                int L = gl.L(175.0f);
                Point point = gl.q;
                if (point.x > point.y) {
                    i = chatActivityEnterView.o3;
                } else {
                    i = chatActivityEnterView.n3;
                }
                chatActivityEnterView.t4 = Math.min(height, L + i);
            }
            if (chatActivityEnterView.d7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.t4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            cjaVar.requestLayout();
            if (chatActivityEnterView.X5) {
                cjaVar.setForeground(new qa1(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            hy1 hy1Var = chatActivityEnterView.P3;
            if (hy1Var != null) {
                hy1Var.L0();
            }
        }
    }

    public final long d(ja3 ja3Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (!this.a) {
            if (!ja3Var.c(bArr, 0, 1, z)) {
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
                sc8.j("No valid varint length mask found");
                return 0L;
            }
        }
        int i5 = this.b;
        if (i5 > i) {
            this.a = false;
            return -2L;
        }
        if (i5 != 1) {
            ja3Var.c(bArr, 1, i5 - 1, false);
        }
        this.a = false;
        return b(this.b, z2, bArr);
    }

    public c9c(FrameLayout frameLayout) {
        this.c = frameLayout;
    }

    public c9c(Window window) {
        this.c = new dkc(new WeakReference(window), (byte) 10);
    }

    public c9c() {
        this.c = new byte[8];
    }
}
