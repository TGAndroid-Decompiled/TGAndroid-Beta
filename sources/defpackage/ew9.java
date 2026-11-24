package defpackage;

import android.view.WindowManager;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.SecretMediaViewer;
public final class ew9 implements Runnable {
    public final byte a;
    public final SecretMediaViewer b;

    public ew9(SecretMediaViewer secretMediaViewer, byte b) {
        this.a = b;
        this.b = secretMediaViewer;
    }

    @Override
    public final void run() {
        Locale locale;
        String format;
        String format2;
        byte b = this.a;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (b) {
            case 0:
                secretMediaViewer.J0 = null;
                secretMediaViewer.l0 = (byte) 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.M = null;
                secretMediaViewer.L = false;
                secretMediaViewer.j();
                gm.d3(new ew9(secretMediaViewer, (byte) 4), 50L);
                return;
            case 1:
                su suVar = secretMediaViewer.e;
                if (suVar != null) {
                    suVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.l0 = (byte) 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.M = null;
                    secretMediaViewer.L = false;
                    secretMediaViewer.j();
                    gm.d3(new ew9(secretMediaViewer, (byte) 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                la8 la8Var = secretMediaViewer.E;
                if (la8Var != null) {
                    long S = la8Var.S();
                    long U = secretMediaViewer.E.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        vdc vdcVar = secretMediaViewer.P;
                        if (!vdcVar.f) {
                            vdcVar.h(false, ((float) S) / ((float) U));
                            secretMediaViewer.Q.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.i1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.j1;
                    Arrays.fill(iArr2, 0);
                    la8 la8Var2 = secretMediaViewer.E;
                    if (la8Var2 != null) {
                        long max = Math.max(0L, la8Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.E.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i = iArr[0];
                    if (i >= 60) {
                        locale = Locale.ROOT;
                        format = String.format(locale, "%02d:%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        locale = Locale.ROOT;
                        format = String.format(locale, "%02d:%02d", Integer.valueOf(i), Integer.valueOf(iArr[1]));
                    }
                    int i2 = iArr2[0];
                    if (i2 >= 60) {
                        format2 = String.format(locale, "%02d:%02d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(iArr2[1]));
                    }
                    secretMediaViewer.R.l(format + " / " + format2, false);
                    if (secretMediaViewer.E.c0()) {
                        gm.d3(secretMediaViewer.h1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.n(false, true);
                return;
            default:
                jn5 jn5Var = secretMediaViewer.h0;
                if (jn5Var != null) {
                    jn5Var.a();
                    secretMediaViewer.h0 = null;
                }
                secretMediaViewer.h.g0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                secretMediaViewer.i0 = false;
                return;
        }
    }

    public ew9(SecretMediaViewer secretMediaViewer, qb8 qb8Var, byte b) {
        this.a = b;
        this.b = secretMediaViewer;
    }
}
