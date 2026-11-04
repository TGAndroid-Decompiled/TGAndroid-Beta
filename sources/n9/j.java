package n9;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import b8.yd;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.List;
import o4.d0;
import o4.e0;
import o4.e1;
import o4.f1;
import o4.l1;
import o4.n1;
import o4.q;
import o4.r1;
import o4.u;
import o4.v;
public final class j implements bb.d, d0, f1, g2.k, e1 {
    public final int f20308a;

    public j(int i3) {
        this.f20308a = i3;
    }

    @Override
    public String a(Context context) {
        switch (this.f20308a) {
            case 0:
                int i3 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                if (i3 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    return "embedded";
                }
                return "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return FirebaseCommonRegistrar.b(installerPackageName);
                }
                return "";
        }
    }

    @Override
    public void accept(Object obj) {
        l1 l1Var = (l1) obj;
        switch (this.f20308a) {
            case 7:
                l1Var.C0();
                return;
            case 8:
                l1Var.e();
                return;
            case 9:
                l1Var.d0();
                return;
            case 10:
            case 15:
            case 18:
            case 20:
            case 21:
            case 22:
            case 26:
            default:
                l1Var.v();
                return;
            case 11:
                l1Var.D0();
                return;
            case 12:
                l1Var.K0();
                return;
            case 13:
                l1Var.S();
                return;
            case 14:
                l1Var.D();
                return;
            case 16:
                l1Var.J0();
                return;
            case 17:
                l1Var.I0();
                return;
            case 19:
                l1Var.J();
                return;
            case 23:
                l1Var.stop();
                return;
            case 24:
                l1Var.a0();
                return;
            case 25:
                l1Var.F();
                return;
            case 27:
                l1Var.a();
                return;
        }
    }

    @Override
    public void c(l1 l1Var, v vVar, List list) {
        switch (this.f20308a) {
            case 20:
                l1Var.w0(list);
                return;
            default:
                l1Var.w0(list);
                return;
        }
    }

    @Override
    public void d(u uVar, int i3) {
        switch (this.f20308a) {
            case 2:
                uVar.getClass();
                return;
            case 3:
                uVar.b(i3);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public Object i(e0 e0Var, v vVar, int i3) {
        switch (this.f20308a) {
            case 5:
                e0Var.getClass();
                throw new ClassCastException();
            case 6:
                e0Var.getClass();
                throw new ClassCastException();
            case 10:
                return e0Var.n(vVar);
            case 15:
                e0Var.getClass();
                throw new ClassCastException();
            case 18:
                kb.a aVar = e0Var.f20622e;
                e0Var.s(vVar);
                aVar.getClass();
                return yd.b(new r1(-6));
            case 22:
                e0Var.getClass();
                throw new ClassCastException();
            case 26:
                e0Var.getClass();
                throw new ClassCastException();
            default:
                e0Var.getClass();
                throw new ClassCastException();
        }
    }

    public j(Object obj, int i3) {
        this.f20308a = i3;
    }

    public j(String str, int i3, int i10, q qVar, int i11) {
        this.f20308a = i11;
    }

    public j(String str, int i3, Object obj) {
        this.f20308a = i3;
    }

    public j(boolean z10, n1 n1Var, Bundle bundle) {
        this.f20308a = 10;
    }
}
