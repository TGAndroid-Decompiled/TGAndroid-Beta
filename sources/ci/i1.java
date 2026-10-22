package ci;

import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dw0;
public final class i1 implements cw0, dw0, org.telegram.ui.ActionBar.a2, Continuation, r9.d, i5.e, d9.k, GenericProvider, Utilities.Callback2Return, eh.d {
    public final int f5480a;

    public i1(int i10) {
        this.f5480a = i10;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f5480a) {
            case 11:
                xa.e eVar = (xa.e) obj;
                eVar.getClass();
                m.g3 g3Var = com.google.firebase.messaging.o.f7655a;
                g3Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g3Var.z(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 12:
                return Integer.valueOf(((d2.b) obj).f7767r);
            default:
                da.a.f7906b.getClass();
                return aa.b.f361a.M((z9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public void b(Object obj, float f7) {
        p1 p1Var = (p1) obj;
        switch (this.f5480a) {
            case 1:
                WindowManager.LayoutParams layoutParams = p1Var.f5713c;
                p1Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(p1Var.f5712b, p1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = p1Var.f5713c;
                p1Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(p1Var.f5712b, p1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        switch (this.f5480a) {
            case 17:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return fh.c.m(f7, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, d6Var));
            case 18:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                }
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return org.telegram.ui.ActionBar.h6.m1(f10, x02);
            case 19:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return fh.c.m(f11, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Zk, d6Var));
            case 20:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return org.telegram.ui.ActionBar.h6.m1(f12, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, d6Var));
            case 21:
                return 855638016;
            case 22:
                return 1073741824;
            case 23:
                return org.telegram.ui.ActionBar.h6.m1(0.075f, -16777216);
            case 24:
                return org.telegram.ui.ActionBar.h6.m1(0.88f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
            case 25:
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return org.telegram.ui.ActionBar.h6.m1(f13, x03);
            case 26:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return fh.c.m(f14, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yk, d6Var));
            case 27:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return org.telegram.ui.ActionBar.h6.m1(f15, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
            case 28:
                return org.telegram.ui.ActionBar.h6.m1(0.78f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, d6Var));
            default:
                return org.telegram.ui.ActionBar.h6.m1(0.7f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5480a) {
            case 4:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        p1 p1Var = (p1) obj;
        switch (this.f5480a) {
            case 0:
                return p1Var.N;
            default:
                return p1Var.O;
        }
    }

    @Override
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        return FirebaseMessagingRegistrar.a(z5Var);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = ei.q3.f9620j0;
        return 0;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            if (num.intValue() == 0) {
                return LocaleController.getString(R.string.LiveStoryPricePerCommentFree);
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f5480a) {
            case 7:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }
}
