package mh;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.cs;
public final class c3 implements org.telegram.ui.ActionBar.c2, o3.n, j3.f, v2.e, NativeInstance.AudioLevelsCallback, hv0, iv0, uv0, Utilities.Callback2Return, vg.g, il0 {
    public final int f13791a;

    public c3(int i10) {
        this.f13791a = i10;
    }

    public static ActionMode.Callback2 f(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public Object apply(Object obj) {
        o9.a.f16663b.getClass();
        return l9.a.f12136a.d((k9.e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f13791a) {
            case 9:
                oh.j1 j1Var = (oh.j1) obj;
                WindowManager.LayoutParams layoutParams = j1Var.f17313c;
                j1Var.K = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(j1Var.f17312b, j1Var.d, layoutParams);
                return;
            case 11:
                oh.j1 j1Var2 = (oh.j1) obj;
                WindowManager.LayoutParams layoutParams2 = j1Var2.f17313c;
                j1Var2.L = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(j1Var2.f17312b, j1Var2.d, layoutParams2);
                return;
            case 26:
                cs csVar = (cs) obj;
                csVar.f35895b = f10;
                if (csVar.getParent() != null) {
                    ((View) csVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                cs csVar2 = (cs) obj;
                csVar2.f35896c = f10;
                if (csVar2.getParent() != null) {
                    ((View) csVar2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public j3.g c(Bundle bundle) {
        s8.i0 s6;
        switch (this.f13791a) {
            case 4:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(o4.s0.f16569f);
                if (parcelableArrayList == null) {
                    s8.t tVar = s8.v.f47143b;
                    s6 = s8.i0.f47108e;
                } else {
                    s6 = h5.a.s(j3.n0.G0, parcelableArrayList);
                }
                return new o4.s0(bundle.getString(o4.s0.h, ""), (j3.n0[]) s6.toArray(new j3.n0[0]));
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o4.t0.f16575e);
                if (parcelableArrayList2 == null) {
                    return new o4.t0(new o4.s0[0]);
                }
                return new o4.t0((o4.s0[]) h5.a.s(o4.s0.f16570n, parcelableArrayList2).toArray(new o4.s0[0]));
        }
    }

    @Override
    public void d(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public float get(Object obj) {
        switch (this.f13791a) {
            case 8:
                return ((oh.j1) obj).K;
            case 10:
                return ((oh.j1) obj).L;
            case 25:
                return ((cs) obj).f35895b;
            case 27:
                return ((cs) obj).f35896c;
            default:
                return ((cs) obj).d;
        }
    }

    @Override
    public void i(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f13791a) {
            case 0:
                int i11 = g5.f14082n1;
                return;
            case 12:
                d2Var.dismiss();
                return;
            case 13:
                d2Var.dismiss();
                return;
            case 15:
                d2Var.dismiss();
                return;
            case 20:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f13791a) {
            case 18:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void m() {
    }

    @Override
    public void release() {
    }
}
