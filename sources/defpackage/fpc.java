package defpackage;

import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class fpc implements pcc {
    public final byte a;
    public final uqc b;

    public fpc(uqc uqcVar, byte b) {
        this.a = b;
        this.b = uqcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = 0;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                uqcVar.E0.setClickable(!bool.booleanValue());
                uqcVar.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    uqcVar.f0 = 1;
                    uqcVar.s0.setPosition(1);
                    uqcVar.s0.post(new cpc(uqcVar, (byte) 3));
                    return;
                }
                return;
            case 1:
                uqcVar.l0 = ((String) obj).trim().toLowerCase(Locale.ROOT);
                q9c[] q9cVarArr = uqcVar.u0;
                q9c q9cVar = q9cVarArr[1];
                if (q9cVar != null) {
                    uqc.c1(q9cVar, true);
                    q9cVarArr[1].x0(0);
                    q9cVarArr[1].post(new cpc(uqcVar, (byte) 3));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                if (uqcVar.D0 != floatValue) {
                    uqcVar.D0 = floatValue;
                    float x = bp1.x(floatValue, 0.6f, 1.0f, 0.0f);
                    int i2 = 0;
                    while (true) {
                        int childCount = uqcVar.C0.getChildCount();
                        oob oobVar = uqcVar.C0;
                        if (i2 < childCount) {
                            View childAt = oobVar.getChildAt(i2);
                            childAt.setAlpha(x);
                            childAt.setPivotY(0.0f);
                            childAt.setScaleY(1.0f - floatValue);
                            i2++;
                        } else {
                            if (floatValue != 0.0f) {
                                i = 4;
                            }
                            oobVar.setImportantForAccessibility(i);
                            uqcVar.C0.requestLayout();
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 3:
                uqcVar.F0((String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!uqcVar.isFinished) {
                    if (user == null) {
                        hl.c3(new cpc(uqcVar, (byte) 9));
                        return;
                    } else {
                        uqcVar.presentFragment(new euc(user));
                        return;
                    }
                }
                return;
        }
    }
}
