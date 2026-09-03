package m;

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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.ds;
public final class j0 implements NativeInstance.AudioLevelsCallback, gv0, hv0, org.telegram.ui.ActionBar.c2, o3.o, j3.f, v2.e, tv0, Utilities.Callback2Return, ug.g, gl0 {
    public final int f13522a;

    public j0(int i10) {
        this.f13522a = i10;
    }

    public static ActionMode.Callback2 f(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public Object apply(Object obj) {
        o9.a.f16484b.getClass();
        return l9.a.f11839a.l((k9.e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f13522a) {
            case 4:
                nh.j1 j1Var = (nh.j1) obj;
                WindowManager.LayoutParams layoutParams = j1Var.f15484c;
                j1Var.K = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(j1Var.f15483b, j1Var.d, layoutParams);
                return;
            case 6:
                nh.j1 j1Var2 = (nh.j1) obj;
                WindowManager.LayoutParams layoutParams2 = j1Var2.f15484c;
                j1Var2.L = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(j1Var2.f15483b, j1Var2.d, layoutParams2);
                return;
            case 26:
                ds dsVar = (ds) obj;
                dsVar.f33518b = f10;
                if (dsVar.getParent() != null) {
                    ((View) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                ds dsVar2 = (ds) obj;
                dsVar2.f33519c = f10;
                if (dsVar2.getParent() != null) {
                    ((View) dsVar2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public j3.g c(Bundle bundle) {
        s8.i0 s6;
        switch (this.f13522a) {
            case 11:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(o4.s0.f16398f);
                if (parcelableArrayList == null) {
                    s8.t tVar = s8.v.f44222b;
                    s6 = s8.i0.e;
                } else {
                    s6 = h5.a.s(j3.n0.G0, parcelableArrayList);
                }
                return new o4.s0(bundle.getString(o4.s0.h, ""), (j3.n0[]) s6.toArray(new j3.n0[0]));
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o4.t0.e);
                if (parcelableArrayList2 == null) {
                    return new o4.t0(new o4.s0[0]);
                }
                return new o4.t0((o4.s0[]) h5.a.s(o4.s0.f16399n, parcelableArrayList2).toArray(new o4.s0[0]));
        }
    }

    @Override
    public void e(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void g(int i10) {
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
    public float get(Object obj) {
        switch (this.f13522a) {
            case 3:
                return ((nh.j1) obj).K;
            case 5:
                return ((nh.j1) obj).L;
            case 25:
                return ((ds) obj).f33518b;
            case 27:
                return ((ds) obj).f33519c;
            default:
                return ((ds) obj).d;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f13522a) {
            case 7:
                d2Var.dismiss();
                return;
            case 8:
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
        switch (this.f13522a) {
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
    public void j() {
    }

    @Override
    public void release() {
    }
}
