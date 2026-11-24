package defpackage;

import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class smc implements qac {
    public final byte a;
    public final goc b;

    public smc(goc gocVar, byte b) {
        this.a = b;
        this.b = gocVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = 0;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                gocVar.E0.setClickable(!bool.booleanValue());
                gocVar.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    gocVar.f0 = 1;
                    gocVar.s0.setPosition(1);
                    gocVar.s0.post(new pmc(gocVar, (byte) 3));
                    return;
                }
                return;
            case 1:
                gocVar.l0 = ((String) obj).trim().toLowerCase(Locale.ROOT);
                q7c[] q7cVarArr = gocVar.u0;
                q7c q7cVar = q7cVarArr[1];
                if (q7cVar != null) {
                    goc.d1(q7cVar, true);
                    q7cVarArr[1].w0(0);
                    q7cVarArr[1].post(new pmc(gocVar, (byte) 3));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                if (gocVar.D0 != floatValue) {
                    gocVar.D0 = floatValue;
                    float x = aq1.x(floatValue, 0.6f, 1.0f, 0.0f);
                    int i2 = 0;
                    while (true) {
                        int childCount = gocVar.C0.getChildCount();
                        qmb qmbVar = gocVar.C0;
                        if (i2 < childCount) {
                            View childAt = qmbVar.getChildAt(i2);
                            childAt.setAlpha(x);
                            childAt.setPivotY(0.0f);
                            childAt.setScaleY(1.0f - floatValue);
                            i2++;
                        } else {
                            if (floatValue != 0.0f) {
                                i = 4;
                            }
                            qmbVar.setImportantForAccessibility(i);
                            gocVar.C0.requestLayout();
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 3:
                gocVar.F0((String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!gocVar.isFinished) {
                    if (user == null) {
                        gm.c3(new pmc(gocVar, (byte) 9));
                        return;
                    } else {
                        gocVar.presentFragment(new rrc(user));
                        return;
                    }
                }
                return;
        }
    }
}
