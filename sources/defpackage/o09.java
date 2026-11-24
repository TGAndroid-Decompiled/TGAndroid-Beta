package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieNative;
public class o09 extends p09 {
    public volatile RLottieNative V0;
    public boolean W0;
    public boolean X0;
    public volatile boolean Y0;
    public boolean Z0;
    public final int a1;
    public int b1;

    public o09(String str, int i, int i2) {
        super(i, i2);
        String str2;
        this.a1 = -1;
        this.K = (byte) 1;
        if ("🎲".equals(str)) {
            str2 = gm.v2(null, 2131623999);
            this.a1 = 60;
        } else if ("🎯".equals(str)) {
            str2 = gm.v2(null, 2131623996);
        } else {
            str2 = null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.n0 = RLottieNative.b(str2, this.e, null, null);
    }

    @Override
    public void d() {
        byte b = this.K;
        if (b == 1) {
            int i = this.b0 + 1;
            int i2 = this.a1;
            if (i2 == -1) {
                i2 = this.e[0];
            }
            if (i < i2) {
                this.b0 = i;
                return;
            }
            this.b0 = 0;
            this.O = false;
            if (this.V0 != null) {
                this.K = (byte) 2;
            }
            if (this.E) {
                this.y = null;
                this.E = false;
            }
        } else if (b == 2) {
            int i3 = this.b0 + 1;
            if (i3 < this.b1) {
                this.b0 = i3;
                return;
            }
            this.O = true;
            this.N++;
        }
    }

    @Override
    public int e() {
        if (this.m0) {
            return 3;
        }
        if (this.n0 == null || (this.K == 2 && this.V0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public void k() {
        if (this.W) {
            i();
            if (this.Q == null && this.n0 != null) {
                y(true);
            }
        }
        if (this.n0 == null && this.V0 == null && this.C0 == null) {
            z();
            return;
        }
        this.U = true;
        if (!q()) {
            stop();
        }
        if (this.l0) {
            D();
        }
    }

    @Override
    public final boolean r() {
        return this.Z0;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public int w(Bitmap bitmap, boolean z) {
        RLottieNative rLottieNative;
        byte b = this.K;
        if (b == 1) {
            rLottieNative = this.n0;
        } else if (b == 2) {
            rLottieNative = this.V0;
            if (this.Y0) {
                this.b0 = this.b1 - 1;
            }
        } else {
            rLottieNative = this.n0;
        }
        if (rLottieNative.c(this.b0, bitmap, z) < 0) {
            return 2;
        }
        return 1;
    }

    @Override
    public void x(boolean z) {
        this.l0 = false;
        this.m0 = true;
        i();
        g();
        if (!this.Z0 && !this.W0) {
            if (this.Q == null && !this.y0) {
                y(z);
                dl0 dl0Var = this.C0;
                if (dl0Var != null) {
                    RandomAccessFile randomAccessFile = dl0Var.s;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        dl0Var.s = null;
                    }
                    dl0Var.r = true;
                    this.C0 = null;
                }
                z();
                return;
            }
            this.W = true;
            return;
        }
        this.X0 = true;
    }

    @Override
    public final void y(boolean z) {
        RLottieNative rLottieNative = this.n0;
        RLottieNative rLottieNative2 = this.V0;
        this.n0 = null;
        this.V0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        ey8 ey8Var = new ey8(rLottieNative, rLottieNative2, (byte) 8);
        if (z) {
            op3.a(ey8Var);
        } else {
            Utilities.e.c(ey8Var);
        }
    }
}
