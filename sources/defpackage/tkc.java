package defpackage;

import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class tkc implements p8c {
    public final byte a;
    public final hmc b;

    public tkc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = 0;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                hmcVar.E0.setClickable(!bool.booleanValue());
                hmcVar.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    hmcVar.f0 = 1;
                    hmcVar.s0.setPosition(1);
                    hmcVar.s0.post(new qkc(hmcVar, (byte) 3));
                    return;
                }
                return;
            case 1:
                hmcVar.l0 = ((String) obj).trim().toLowerCase(Locale.ROOT);
                q5c[] q5cVarArr = hmcVar.u0;
                q5c q5cVar = q5cVarArr[1];
                if (q5cVar != null) {
                    hmc.c1(q5cVar, true);
                    q5cVarArr[1].w0(0);
                    q5cVarArr[1].post(new qkc(hmcVar, (byte) 3));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                if (hmcVar.D0 != floatValue) {
                    hmcVar.D0 = floatValue;
                    float x = oo1.x(floatValue, 0.6f, 1.0f, 0.0f);
                    int i2 = 0;
                    while (true) {
                        int childCount = hmcVar.C0.getChildCount();
                        pkb pkbVar = hmcVar.C0;
                        if (i2 < childCount) {
                            View childAt = pkbVar.getChildAt(i2);
                            childAt.setAlpha(x);
                            childAt.setPivotY(0.0f);
                            childAt.setScaleY(1.0f - floatValue);
                            i2++;
                        } else {
                            if (floatValue != 0.0f) {
                                i = 4;
                            }
                            pkbVar.setImportantForAccessibility(i);
                            hmcVar.C0.requestLayout();
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 3:
                hmcVar.E0((String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!hmcVar.isFinished) {
                    if (user == null) {
                        gl.d3(new qkc(hmcVar, (byte) 9));
                        return;
                    } else {
                        hmcVar.presentFragment(new qpc(user));
                        return;
                    }
                }
                return;
        }
    }
}
