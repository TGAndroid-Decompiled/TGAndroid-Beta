package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import hi.ia;
import hi.na;
import hi.sa;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.tr;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;
import org.telegram.ui.cx;
import org.telegram.ui.hn0;
import org.telegram.ui.rn;
import org.telegram.ui.ww;
public final class i2 implements y10 {
    public final int f3720a;
    public final long f3721b;
    public final Object f3722c;
    public final Object d;
    public final Object f3723e;

    public i2(fi.p6 p6Var, y10 y10Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f3720a = 4;
        this.f3722c = p6Var;
        this.f3723e = y10Var;
        this.f3721b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3720a;
        c4 c4Var = null;
        long j3 = this.f3721b;
        Object obj2 = this.f3723e;
        Object obj3 = this.d;
        Object obj4 = this.f3722c;
        switch (i7) {
            case 0:
                z2 z2Var = (z2) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                z2Var.w1(j3, new m2((n3) obj4, bVar, (y10) obj2, z2Var, 0));
                return;
            case 1:
                di.f6 f6Var = (di.f6) obj4;
                f6Var.f8806g2.setLoading(false);
                b9 b9Var = new b9(f6Var, 1);
                ug.k0 k0Var = new ug.k0(26, f6Var.f30173a, f6Var.getContext(), b9Var, f6Var.J0);
                k0Var.B1((org.telegram.messenger.g3) obj);
                k0Var.A1((TL_stories.TL_premium_boostsStatus) obj3, true);
                k0Var.C1(j3);
                TLRPC.Chat O0 = ((np) obj2).O0(Long.valueOf(-j3));
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
                    sa D = sa.D(qVar.f12462f0.getParentActivity(), qVar.f12461f);
                    D.O = j3;
                    ia iaVar = D.f15397d1;
                    if (iaVar != null) {
                        iaVar.setDialogId(j3);
                    }
                    D.N = false;
                    D.Q(na.c(pVar));
                    return;
                }
                return;
            case 3:
                fi.p6 p6Var = (fi.p6) obj4;
                y10 y10Var = (y10) obj2;
                np npVar = (np) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    y10Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.messenger.h3 I0 = npVar.I0();
                long j10 = this.f3721b;
                I0.b(j10, tL_premium_boostsStatus, new i2(p6Var, y10Var, j10, tL_premium_boostsStatus));
                y10Var.a(Boolean.FALSE);
                return;
            case 4:
                fi.p6 p6Var2 = (fi.p6) obj4;
                y10 y10Var2 = (y10) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                if (g3Var == null) {
                    y10Var2.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (p6Var2.j(j3)) {
                    c4Var = new c4(p6Var2, j3, 6);
                }
                int i10 = ug.k0.S2;
                if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                    ug.k0 k0Var2 = new ug.k0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                    k0Var2.B1(g3Var);
                    k0Var2.A1(tL_premium_boostsStatus2, true);
                    k0Var2.C1(j3);
                    k0Var2.M2 = c4Var;
                    k0Var2.show();
                }
                y10Var2.a(Boolean.FALSE);
                return;
            case 5:
                rn.d0((rn) obj4, (org.telegram.ui.ActionBar.t1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f3721b, (org.telegram.messenger.g3) obj);
                return;
            case 6:
                org.telegram.ui.ActionBar.g2[] g2VarArr = (org.telegram.ui.ActionBar.g2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                cx cxVar = ((cw) obj4).f46690b;
                cxVar.getMessagesController().Z2(Long.valueOf(j3), null, 32);
                ww wwVar = cxVar.E2;
                cxVar.removeSelfFromStack();
                if (g2VarArr[1] != null) {
                    g2VarArr[0].removeSelfFromStack();
                    g2VarArr[1].finishFragment();
                } else {
                    g2VarArr[0].finishFragment();
                }
                if (wwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(tr.a(-j3, 0L));
                    wwVar.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                ff ffVar = (ff) obj2;
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
                    org.telegram.messenger.g0.g3(new o2(photoViewer, ffVar, this.f3721b, str, createBitmap, 14));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new hn0(photoViewer, 19));
                    return;
                }
        }
    }

    public i2(fi.p6 p6Var, y10 y10Var, np npVar, long j3) {
        this.f3720a = 3;
        this.f3722c = p6Var;
        this.f3723e = y10Var;
        this.d = npVar;
        this.f3721b = j3;
    }

    public i2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3720a = i7;
        this.f3722c = obj;
        this.d = obj2;
        this.f3721b = j3;
        this.f3723e = obj3;
    }

    public i2(gs gsVar, Object obj, Object obj2, long j3, int i7) {
        this.f3720a = i7;
        this.f3722c = gsVar;
        this.d = obj;
        this.f3723e = obj2;
        this.f3721b = j3;
    }
}
