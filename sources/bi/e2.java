package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import hi.ja;
import hi.oa;
import hi.ta;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;
import org.telegram.ui.cx;
import org.telegram.ui.hn0;
import org.telegram.ui.rn;
import org.telegram.ui.ww;
public final class e2 implements x10 {
    public final int f3570a;
    public final long f3571b;
    public final Object f3572c;
    public final Object d;
    public final Object f3573e;

    public e2(fi.p6 p6Var, x10 x10Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f3570a = 4;
        this.f3572c = p6Var;
        this.f3573e = x10Var;
        this.f3571b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3570a;
        y3 y3Var = null;
        long j3 = this.f3571b;
        Object obj2 = this.f3573e;
        Object obj3 = this.d;
        Object obj4 = this.f3572c;
        switch (i7) {
            case 0:
                v2 v2Var = (v2) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                v2Var.w1(j3, new i2((j3) obj4, bVar, (x10) obj2, v2Var, 0));
                return;
            case 1:
                di.f6 f6Var = (di.f6) obj4;
                f6Var.f8782g2.setLoading(false);
                z8 z8Var = new z8(f6Var, 1);
                ug.l0 l0Var = new ug.l0(26, f6Var.f30189a, f6Var.getContext(), z8Var, f6Var.J0);
                l0Var.B1((org.telegram.messenger.g3) obj);
                l0Var.A1((TL_stories.TL_premium_boostsStatus) obj3, true);
                l0Var.C1(j3);
                TLRPC.Chat O0 = ((mp) obj2).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    l0Var.M2 = new di.t2(f6Var, O0);
                }
                l0Var.show();
                return;
            case 2:
                fi.q qVar = (fi.q) obj4;
                fi.p pVar = (fi.p) obj2;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ta D = ta.D(qVar.f12422f0.getParentActivity(), qVar.f12421f);
                    D.O = j3;
                    ja jaVar = D.f15436d1;
                    if (jaVar != null) {
                        jaVar.setDialogId(j3);
                    }
                    D.N = false;
                    D.Q(oa.c(pVar));
                    return;
                }
                return;
            case 3:
                fi.p6 p6Var = (fi.p6) obj4;
                x10 x10Var = (x10) obj2;
                mp mpVar = (mp) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    x10Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.messenger.h3 I0 = mpVar.I0();
                long j10 = this.f3571b;
                I0.b(j10, tL_premium_boostsStatus, new e2(p6Var, x10Var, j10, tL_premium_boostsStatus));
                x10Var.a(Boolean.FALSE);
                return;
            case 4:
                fi.p6 p6Var2 = (fi.p6) obj4;
                x10 x10Var2 = (x10) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                if (g3Var == null) {
                    x10Var2.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (p6Var2.j(j3)) {
                    y3Var = new y3(p6Var2, j3, 6);
                }
                int i10 = ug.l0.S2;
                if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                    ug.l0 l0Var2 = new ug.l0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                    l0Var2.B1(g3Var);
                    l0Var2.A1(tL_premium_boostsStatus2, true);
                    l0Var2.C1(j3);
                    l0Var2.M2 = y3Var;
                    l0Var2.show();
                }
                x10Var2.a(Boolean.FALSE);
                return;
            case 5:
                rn.d0((rn) obj4, (org.telegram.ui.ActionBar.u1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f3571b, (org.telegram.messenger.g3) obj);
                return;
            case 6:
                org.telegram.ui.ActionBar.h2[] h2VarArr = (org.telegram.ui.ActionBar.h2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                cx cxVar = ((cw) obj4).f46651b;
                cxVar.getMessagesController().Z2(Long.valueOf(j3), null, 32);
                ww wwVar = cxVar.E2;
                cxVar.removeSelfFromStack();
                if (h2VarArr[1] != null) {
                    h2VarArr[0].removeSelfFromStack();
                    h2VarArr[1].finishFragment();
                } else {
                    h2VarArr[0].finishFragment();
                }
                if (wwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sr.a(-j3, 0L));
                    wwVar.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                ef efVar = (ef) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (bitmap == null) {
                    org.telegram.messenger.g0.g3(new hn0(photoViewer, 18));
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
                    org.telegram.messenger.g0.g3(new k2(photoViewer, efVar, this.f3571b, str, createBitmap, 14));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new hn0(photoViewer, 19));
                    return;
                }
        }
    }

    public e2(fi.p6 p6Var, x10 x10Var, mp mpVar, long j3) {
        this.f3570a = 3;
        this.f3572c = p6Var;
        this.f3573e = x10Var;
        this.d = mpVar;
        this.f3571b = j3;
    }

    public e2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3570a = i7;
        this.f3572c = obj;
        this.d = obj2;
        this.f3571b = j3;
        this.f3573e = obj3;
    }

    public e2(fs fsVar, Object obj, Object obj2, long j3, int i7) {
        this.f3570a = i7;
        this.f3572c = fsVar;
        this.d = obj;
        this.f3573e = obj2;
        this.f3571b = j3;
    }
}
