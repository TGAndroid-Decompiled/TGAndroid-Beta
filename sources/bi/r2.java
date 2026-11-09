package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.en0;
import org.telegram.ui.rn;
import org.telegram.ui.sw;
import org.telegram.ui.yw;
import org.telegram.ui.zv;
public final class r2 implements c20 {
    public final int f4607a;
    public final long f4608b;
    public final Object f4609c;
    public final Object d;
    public final Object f4610e;

    public r2(di.z6 z6Var, c20 c20Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f4607a = 3;
        this.f4609c = z6Var;
        this.f4610e = c20Var;
        this.f4608b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f4607a;
        r3 r3Var = null;
        long j3 = this.f4608b;
        Object obj2 = this.f4610e;
        Object obj3 = this.d;
        Object obj4 = this.f4609c;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj4;
                k7Var.f4168c2.setLoading(false);
                w4 w4Var = new w4(k7Var, 0);
                ug.i0 i0Var = new ug.i0(26, k7Var.f28621a, k7Var.getContext(), w4Var, k7Var.I0);
                i0Var.A1((org.telegram.messenger.e3) obj);
                i0Var.z1((TL_stories.TL_premium_boostsStatus) obj3, true);
                i0Var.B1(j3);
                TLRPC.Chat M0 = ((qp) obj2).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    i0Var.I2 = new j3(k7Var, M0);
                }
                i0Var.show();
                return;
            case 1:
                di.q qVar = (di.q) obj4;
                di.p pVar = (di.p) obj2;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.va D = fi.va.D(qVar.f9534e0.getParentActivity(), qVar.f9535f);
                    D.N = j3;
                    fi.la laVar = D.f12944c1;
                    if (laVar != null) {
                        laVar.setDialogId(j3);
                    }
                    D.M = false;
                    D.Q(fi.qa.c(pVar));
                    return;
                }
                return;
            case 2:
                di.z6 z6Var = (di.z6) obj4;
                c20 c20Var = (c20) obj3;
                qp qpVar = (qp) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    c20Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.messenger.f3 G0 = qpVar.G0();
                long j10 = this.f4608b;
                G0.b(j10, tL_premium_boostsStatus, new r2(z6Var, c20Var, j10, tL_premium_boostsStatus));
                c20Var.a(Boolean.FALSE);
                return;
            case 3:
                di.z6 z6Var2 = (di.z6) obj4;
                c20 c20Var2 = (c20) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                if (e3Var == null) {
                    c20Var2.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (z6Var2.j(j3)) {
                    r3Var = new r3(z6Var2, j3, 5);
                }
                int i10 = ug.i0.O2;
                if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                    ug.i0 i0Var2 = new ug.i0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                    i0Var2.A1(e3Var);
                    i0Var2.z1(tL_premium_boostsStatus2, true);
                    i0Var2.B1(j3);
                    i0Var2.I2 = r3Var;
                    i0Var2.show();
                }
                c20Var2.a(Boolean.FALSE);
                return;
            case 4:
                rn.d0((rn) obj4, (org.telegram.ui.ActionBar.u1) obj2, (TL_stories.TL_premium_boostsStatus) obj3, this.f4608b, (org.telegram.messenger.e3) obj);
                return;
            case 5:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                yw ywVar = ((zv) obj4).f52678b;
                ywVar.getMessagesController().T2(Long.valueOf(j3), null, 32);
                sw swVar = ywVar.D2;
                ywVar.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                } else {
                    f2VarArr[0].finishFragment();
                }
                if (swVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xr.a(-j3, 0L));
                    swVar.y(ywVar, arrayList, null, false, ywVar.K2, ywVar.L2, ywVar.M2, null);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                gf gfVar = (gf) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (bitmap == null) {
                    org.telegram.messenger.g0.h3(new en0(photoViewer, 18));
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
                    org.telegram.messenger.g0.h3(new i0(photoViewer, gfVar, this.f4608b, str, createBitmap, 14));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new en0(photoViewer, 19));
                    return;
                }
            default:
                i5 i5Var = (i5) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                i5Var.r1(j3, new di.s2((zh.g1) obj4, bVar, (c20) obj2, i5Var, 19));
                return;
        }
    }

    public r2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f4607a = i7;
        this.f4609c = obj;
        this.d = obj2;
        this.f4608b = j3;
        this.f4610e = obj3;
    }

    public r2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f4607a = i7;
        this.f4609c = obj;
        this.d = obj2;
        this.f4610e = obj3;
        this.f4608b = j3;
    }

    public r2(rn rnVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3) {
        this.f4607a = 4;
        this.f4609c = rnVar;
        this.f4610e = u1Var;
        this.d = tL_premium_boostsStatus;
        this.f4608b = j3;
    }
}
