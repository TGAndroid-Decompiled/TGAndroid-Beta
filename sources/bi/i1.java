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
import org.telegram.messenger.a8;
import org.telegram.messenger.ff;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.en0;
import org.telegram.ui.qn;
import org.telegram.ui.sw;
import org.telegram.ui.yw;
import org.telegram.ui.zv;
public final class i1 implements z10 {
    public final int f3573a;
    public final long f3574b;
    public final Object f3575c;
    public final Object d;
    public final Object f3576e;

    public i1(fi.s6 s6Var, z10 z10Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f3573a = 4;
        this.f3575c = s6Var;
        this.f3576e = z10Var;
        this.f3574b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3573a;
        di.x2 x2Var = null;
        long j3 = this.f3574b;
        Object obj2 = this.f3576e;
        Object obj3 = this.d;
        Object obj4 = this.f3575c;
        switch (i7) {
            case 0:
                b2 b2Var = (b2) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                b2Var.s1(j3, new o1((s2) obj4, bVar, (z10) obj2, b2Var, 0));
                return;
            case 1:
                di.c6 c6Var = (di.c6) obj4;
                c6Var.f8319g2.setLoading(false);
                t6 t6Var = new t6(c6Var, 1);
                ug.j0 j0Var = new ug.j0(26, c6Var.f29679a, c6Var.getContext(), t6Var, c6Var.J0);
                j0Var.A1((org.telegram.messenger.e3) obj);
                j0Var.z1((TL_stories.TL_premium_boostsStatus) obj3, true);
                j0Var.B1(j3);
                TLRPC.Chat M0 = ((np) obj2).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    j0Var.M2 = new di.q2(c6Var, M0);
                }
                j0Var.show();
                return;
            case 2:
                fi.q qVar = (fi.q) obj4;
                fi.p pVar = (fi.p) obj2;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sa D = sa.D(qVar.f12194f0.getParentActivity(), qVar.f12193f);
                    D.O = j3;
                    ia iaVar = D.f15048d1;
                    if (iaVar != null) {
                        iaVar.setDialogId(j3);
                    }
                    D.N = false;
                    D.Q(na.c(pVar));
                    return;
                }
                return;
            case 3:
                fi.s6 s6Var = (fi.s6) obj4;
                z10 z10Var = (z10) obj2;
                np npVar = (np) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    z10Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.messenger.f3 G0 = npVar.G0();
                long j10 = this.f3574b;
                G0.b(j10, tL_premium_boostsStatus, new i1(s6Var, z10Var, j10, tL_premium_boostsStatus));
                z10Var.a(Boolean.FALSE);
                return;
            case 4:
                fi.s6 s6Var2 = (fi.s6) obj4;
                z10 z10Var2 = (z10) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                if (e3Var == null) {
                    z10Var2.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (s6Var2.j(j3)) {
                    x2Var = new di.x2(s6Var2, j3, 5);
                }
                int i10 = ug.j0.S2;
                if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                    ug.j0 j0Var2 = new ug.j0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                    j0Var2.A1(e3Var);
                    j0Var2.z1(tL_premium_boostsStatus2, true);
                    j0Var2.B1(j3);
                    j0Var2.M2 = x2Var;
                    j0Var2.show();
                }
                z10Var2.a(Boolean.FALSE);
                return;
            case 5:
                qn.d0((qn) obj4, (org.telegram.ui.ActionBar.t1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f3574b, (org.telegram.messenger.e3) obj);
                return;
            case 6:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                yw ywVar = ((zv) obj4).f54031b;
                ywVar.getMessagesController().T2(Long.valueOf(j3), null, 32);
                sw swVar = ywVar.E2;
                ywVar.removeSelfFromStack();
                if (e2VarArr[1] != null) {
                    e2VarArr[0].removeSelfFromStack();
                    e2VarArr[1].finishFragment();
                } else {
                    e2VarArr[0].finishFragment();
                }
                if (swVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ur.a(-j3, 0L));
                    swVar.y(ywVar, arrayList, null, false, ywVar.L2, ywVar.M2, ywVar.N2, null);
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
                    org.telegram.messenger.g0.h3(new r1(photoViewer, ffVar, this.f3574b, str, createBitmap, 15));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new en0(photoViewer, 19));
                    return;
                }
        }
    }

    public i1(fi.s6 s6Var, z10 z10Var, np npVar, long j3) {
        this.f3573a = 3;
        this.f3575c = s6Var;
        this.f3576e = z10Var;
        this.d = npVar;
        this.f3574b = j3;
    }

    public i1(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3573a = i7;
        this.f3575c = obj;
        this.d = obj2;
        this.f3574b = j3;
        this.f3576e = obj3;
    }

    public i1(is isVar, Object obj, Object obj2, long j3, int i7) {
        this.f3573a = i7;
        this.f3575c = isVar;
        this.d = obj;
        this.f3576e = obj2;
        this.f3574b = j3;
    }
}
