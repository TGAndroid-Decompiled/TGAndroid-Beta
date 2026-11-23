package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import hi.db;
import hi.ib;
import hi.nb;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bw;
import org.telegram.ui.bx;
import org.telegram.ui.kn0;
import org.telegram.ui.rn;
import org.telegram.ui.vw;
public final class k2 implements w10 {
    public final int f3748a;
    public final long f3749b;
    public final Object f3750c;
    public final Object d;
    public final Object f3751e;

    public k2(fi.p6 p6Var, w10 w10Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f3748a = 4;
        this.f3750c = p6Var;
        this.f3751e = w10Var;
        this.f3749b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3748a;
        e4 e4Var = null;
        long j3 = this.f3749b;
        Object obj2 = this.f3751e;
        Object obj3 = this.d;
        Object obj4 = this.f3750c;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                b3Var.w1(j3, new o2((p3) obj4, bVar, (w10) obj2, b3Var, 0));
                return;
            case 1:
                di.f6 f6Var = (di.f6) obj4;
                f6Var.f8767g2.setLoading(false);
                e9 e9Var = new e9(f6Var, 1);
                ug.k0 k0Var = new ug.k0(26, f6Var.f30223a, f6Var.getContext(), e9Var, f6Var.J0);
                k0Var.B1((org.telegram.messenger.g3) obj);
                k0Var.A1((TL_stories.TL_premium_boostsStatus) obj3, true);
                k0Var.C1(j3);
                TLRPC.Chat O0 = ((mp) obj2).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    k0Var.M2 = new di.u2(f6Var, O0);
                }
                k0Var.show();
                return;
            case 2:
                fi.q qVar = (fi.q) obj4;
                fi.p pVar = (fi.p) obj2;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    nb D = nb.D(qVar.f12424f0.getParentActivity(), qVar.f12423f);
                    D.O = j3;
                    db dbVar = D.f15067d1;
                    if (dbVar != null) {
                        dbVar.setDialogId(j3);
                    }
                    D.N = false;
                    D.Q(ib.c(pVar));
                    return;
                }
                return;
            case 3:
                fi.p6 p6Var = (fi.p6) obj4;
                w10 w10Var = (w10) obj2;
                mp mpVar = (mp) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    w10Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.messenger.h3 I0 = mpVar.I0();
                long j10 = this.f3749b;
                I0.b(j10, tL_premium_boostsStatus, new k2(p6Var, w10Var, j10, tL_premium_boostsStatus));
                w10Var.a(Boolean.FALSE);
                return;
            case 4:
                fi.p6 p6Var2 = (fi.p6) obj4;
                w10 w10Var2 = (w10) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                if (g3Var == null) {
                    w10Var2.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (p6Var2.j(j3)) {
                    e4Var = new e4(p6Var2, j3, 6);
                }
                int i10 = ug.k0.S2;
                if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                    ug.k0 k0Var2 = new ug.k0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                    k0Var2.B1(g3Var);
                    k0Var2.A1(tL_premium_boostsStatus2, true);
                    k0Var2.C1(j3);
                    k0Var2.M2 = e4Var;
                    k0Var2.show();
                }
                w10Var2.a(Boolean.FALSE);
                return;
            case 5:
                rn.d0((rn) obj4, (org.telegram.ui.ActionBar.t1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f3749b, (org.telegram.messenger.g3) obj);
                return;
            case 6:
                org.telegram.ui.ActionBar.g2[] g2VarArr = (org.telegram.ui.ActionBar.g2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bx bxVar = ((bw) obj4).f46517b;
                bxVar.getMessagesController().Z2(Long.valueOf(j3), null, 32);
                vw vwVar = bxVar.E2;
                bxVar.removeSelfFromStack();
                if (g2VarArr[1] != null) {
                    g2VarArr[0].removeSelfFromStack();
                    g2VarArr[1].finishFragment();
                } else {
                    g2VarArr[0].finishFragment();
                }
                if (vwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sr.a(-j3, 0L));
                    vwVar.z(bxVar, arrayList, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                ef efVar = (ef) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                if (bitmap == null) {
                    org.telegram.messenger.g0.g3(new kn0(photoViewer, 14));
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                    float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.g3(new q2(photoViewer, efVar, this.f3749b, str, createBitmap, 14));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new kn0(photoViewer, 15));
                    return;
                }
        }
    }

    public k2(fi.p6 p6Var, w10 w10Var, mp mpVar, long j3) {
        this.f3748a = 3;
        this.f3750c = p6Var;
        this.f3751e = w10Var;
        this.d = mpVar;
        this.f3749b = j3;
    }

    public k2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3748a = i7;
        this.f3750c = obj;
        this.d = obj2;
        this.f3749b = j3;
        this.f3751e = obj3;
    }

    public k2(fs fsVar, Object obj, Object obj2, long j3, int i7) {
        this.f3748a = i7;
        this.f3750c = fsVar;
        this.d = obj;
        this.f3751e = obj2;
        this.f3749b = j3;
    }
}
