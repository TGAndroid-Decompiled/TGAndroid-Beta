package k3;

import android.media.AudioDeviceInfo;
import android.os.Bundle;
import android.view.WindowManager;
import j3.t0;
import java.util.ArrayList;
import l4.j1;
import l4.k1;
import l4.p;
import lh.i1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zu0;
import q8.l0;
import q8.x;
import q8.z;
public final class d implements f5.j, j3.f, NativeInstance.AudioLevelsCallback, yu0, zu0, b2 {
    public final int f13409a;

    public d(int i10) {
        this.f13409a = i10;
    }

    public static AudioDeviceInfo a(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    @Override
    public void b(Object obj, float f9) {
        i1 i1Var = (i1) obj;
        switch (this.f13409a) {
            case 22:
                WindowManager.LayoutParams layoutParams = i1Var.f15700c;
                i1Var.J = f9;
                layoutParams.x = (int) f9;
                AndroidUtilities.updateViewLayout(i1Var.f15699b, i1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = i1Var.f15700c;
                i1Var.K = f9;
                layoutParams2.y = (int) f9;
                AndroidUtilities.updateViewLayout(i1Var.f15699b, i1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public j3.g c(Bundle bundle) {
        l0 s10;
        m4.b[] bVarArr;
        switch (this.f13409a) {
            case 18:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(j1.f14345f);
                if (parcelableArrayList == null) {
                    x xVar = z.f46511b;
                    s10 = l0.f46462e;
                } else {
                    s10 = f5.a.s(t0.F0, parcelableArrayList);
                }
                return new j1(bundle.getString(j1.h, ""), (t0[]) s10.toArray(new t0[0]));
            case 19:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(k1.f14356e);
                if (parcelableArrayList2 == null) {
                    return new k1(new j1[0]);
                }
                return new k1((j1[]) f5.a.s(j1.f14346n, parcelableArrayList2).toArray(new j1[0]));
            default:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(m4.c.f16849n);
                if (parcelableArrayList3 == null) {
                    bVarArr = new m4.b[0];
                } else {
                    m4.b[] bVarArr2 = new m4.b[parcelableArrayList3.size()];
                    for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                        bVarArr2[i10] = (m4.b) m4.b.C.c((Bundle) parcelableArrayList3.get(i10));
                    }
                    bVarArr = bVarArr2;
                }
                return new m4.c(bVarArr, bundle.getLong(m4.c.f16850r, 0L), bundle.getLong(m4.c.f16851s, -9223372036854775807L), bundle.getInt(m4.c.v, 0));
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f13409a) {
            case 25:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        i1 i1Var = (i1) obj;
        switch (this.f13409a) {
            case 21:
                return i1Var.J;
            default:
                return i1Var.K;
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f13409a) {
            case 0:
                bVar.getClass();
                return;
            case 1:
                bVar.getClass();
                return;
            case 2:
                bVar.getClass();
                return;
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            case 5:
                bVar.getClass();
                return;
            case 6:
                bVar.getClass();
                return;
            case 7:
                bVar.getClass();
                return;
            case 8:
                bVar.getClass();
                return;
            case 9:
                bVar.getClass();
                return;
            case 10:
                bVar.getClass();
                return;
            case 11:
                bVar.getClass();
                return;
            case 12:
                bVar.getClass();
                return;
            case 13:
                bVar.getClass();
                return;
            case 14:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public d(a aVar) {
        this.f13409a = 10;
    }

    public d(a aVar, float f9) {
        this.f13409a = 4;
    }

    public d(a aVar, int i10) {
        this.f13409a = 3;
    }

    public d(a aVar, int i10, boolean z10) {
        this.f13409a = 7;
    }

    public d(a aVar, Object obj, int i10) {
        this.f13409a = i10;
    }

    public d(a aVar, p pVar, l4.x xVar) {
        this.f13409a = 11;
    }

    public d(a aVar, boolean z10, int i10) {
        this.f13409a = i10;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
