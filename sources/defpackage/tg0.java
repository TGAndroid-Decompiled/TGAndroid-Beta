package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class tg0 extends en4 {
    public int P = -1;

    public final boolean w(int i, String[] strArr, int[] iArr) {
        boolean z;
        String M0;
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 104) {
            if (z) {
                h75 h75Var = h75.s5;
                if (h75Var != null) {
                    h75Var.r1.callOnClick();
                    return true;
                }
            } else {
                y(2131624117, k96.M0(2131743043, null));
                return true;
            }
        } else if (i != 4 && i != 151) {
            if (i == 5) {
                if (!z) {
                    y(2131624118, k96.M0(2131747113, null));
                    return false;
                }
                qu2.r(this.P).l();
                return true;
            } else if (i != 3 && i != 150) {
                if (i != 18 && i != 19 && i != 20 && i != 22) {
                    int i2 = kk7.y4;
                    int i3 = kk7.x4;
                    if (i == 2) {
                        kk7 e = kk7.e();
                        if (z) {
                            i2 = i3;
                        }
                        e.k(i2, new Object[0]);
                        return true;
                    } else if (i == 211) {
                        kk7 e2 = kk7.e();
                        if (z) {
                            i2 = i3;
                        }
                        e2.k(i2, 1);
                        return true;
                    }
                } else if (!z) {
                    y(2131624117, k96.M0(2131747115, null));
                }
            } else {
                int min = Math.min(strArr.length, iArr.length);
                boolean z2 = true;
                boolean z3 = true;
                for (int i4 = 0; i4 < min; i4++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i4])) {
                        if (iArr[i4] == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else if ("android.permission.CAMERA".equals(strArr[i4])) {
                        if (iArr[i4] == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                }
                if (i == 150 && (!z2 || !z3)) {
                    y(2131624117, k96.M0(2131747116, null));
                    return true;
                } else if (!z2) {
                    y(2131624121, k96.M0(2131747118, null));
                    return true;
                } else if (!z3) {
                    y(2131624117, k96.M0(2131747115, null));
                    return true;
                } else {
                    if (gba.v0) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z) {
            if (i == 151) {
                M0 = k96.M0(2131747108, null);
            } else {
                M0 = k96.M0(2131747106, null);
            }
            y(2131624119, M0);
            return true;
        } else {
            fl5.z().e(null);
            return true;
        }
        return true;
    }

    public final hd x(int i, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i2 = bkb.K5;
        alertDialog$Builder.l(i, 72, bkb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        SpannableStringBuilder S2 = gl.S2(str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = S2;
        alertDialog$Builder.j(k96.M0(2131747107, null), new sg0(this, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        return hdVar;
    }

    public final void y(int i, String str) {
        x(i, str).show();
    }
}
