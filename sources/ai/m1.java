package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import gi.la;
import gi.qa;
import gi.va;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ln;
import org.telegram.ui.nw;
import org.telegram.ui.uv;
import org.telegram.ui.uw;
import org.telegram.ui.xm0;
public final class m1 implements u10 {
    public final int f794a;
    public final long f795b;
    public final Object f796c;
    public final Object d;
    public final Object f797e;

    public m1(ei.z6 z6Var, u10 u10Var, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f794a = 4;
        this.f796c = z6Var;
        this.f797e = u10Var;
        this.f795b = j10;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f794a;
        ci.e3 e3Var = null;
        long j10 = this.f795b;
        Object obj2 = this.f797e;
        Object obj3 = this.d;
        Object obj4 = this.f796c;
        switch (i3) {
            case 0:
                j2 j2Var = (j2) obj3;
                sf.b bVar = (sf.b) obj;
                bVar.d();
                j2Var.s1(j10, new v1((b3) obj4, bVar, (u10) obj2, j2Var, 0));
                return;
            case 1:
                ci.l6 l6Var = (ci.l6) obj4;
                l6Var.f5451d2.setLoading(false);
                c7 c7Var = new c7(l6Var, 1);
                vg.i0 i0Var = new vg.i0(26, l6Var.f28583a, l6Var.getContext(), c7Var, l6Var.J0);
                i0Var.A1((org.telegram.messenger.e3) obj);
                i0Var.z1((TL_stories.TL_premium_boostsStatus) obj3, true);
                i0Var.B1(j10);
                TLRPC.Chat M0 = ((hp) obj2).M0(Long.valueOf(-j10));
                if (M0 != null) {
                    i0Var.J2 = new ci.w2(l6Var, M0);
                }
                i0Var.show();
                return;
            case 2:
                ei.r rVar = (ei.r) obj4;
                ei.q qVar = (ei.q) obj2;
                ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    va D = va.D(rVar.f10832f0.getParentActivity(), rVar.f10831f);
                    D.O = j10;
                    la laVar = D.f13710d1;
                    if (laVar != null) {
                        laVar.setDialogId(j10);
                    }
                    D.N = false;
                    D.Q(qa.c(qVar));
                    return;
                }
                return;
            case 3:
                ei.z6 z6Var = (ei.z6) obj4;
                u10 u10Var = (u10) obj2;
                hp hpVar = (hp) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    u10Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.messenger.f3 G0 = hpVar.G0();
                long j11 = this.f795b;
                G0.b(j11, tL_premium_boostsStatus, new m1(z6Var, u10Var, j11, tL_premium_boostsStatus));
                u10Var.a(Boolean.FALSE);
                return;
            case 4:
                ei.z6 z6Var2 = (ei.z6) obj4;
                u10 u10Var2 = (u10) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.e3 e3Var2 = (org.telegram.messenger.e3) obj;
                if (e3Var2 == null) {
                    u10Var2.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (z6Var2.j(j10)) {
                    e3Var = new ci.e3(z6Var2, j10, 5);
                }
                int i10 = vg.i0.P2;
                if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                    vg.i0 i0Var2 = new vg.i0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                    i0Var2.A1(e3Var2);
                    i0Var2.z1(tL_premium_boostsStatus2, true);
                    i0Var2.B1(j10);
                    i0Var2.J2 = e3Var;
                    i0Var2.show();
                }
                u10Var2.a(Boolean.FALSE);
                return;
            case 5:
                ln.d0((ln) obj4, (org.telegram.ui.ActionBar.s1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f795b, (org.telegram.messenger.e3) obj);
                return;
            case 6:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                uw uwVar = ((uv) obj4).f50195b;
                uwVar.getMessagesController().T2(Long.valueOf(j10), null, 32);
                nw nwVar = uwVar.D2;
                uwVar.removeSelfFromStack();
                if (d2VarArr[1] != null) {
                    d2VarArr[0].removeSelfFromStack();
                    d2VarArr[1].finishFragment();
                } else {
                    d2VarArr[0].finishFragment();
                }
                if (nwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pr.a(-j10, 0L));
                    nwVar.y(uwVar, arrayList, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                ye yeVar = (ye) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (bitmap == null) {
                    org.telegram.messenger.g0.h3(new xm0(photoViewer, 16));
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
                    org.telegram.messenger.g0.h3(new z1(photoViewer, yeVar, this.f795b, str, createBitmap, 15));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new xm0(photoViewer, 17));
                    return;
                }
        }
    }

    public m1(ei.z6 z6Var, u10 u10Var, hp hpVar, long j10) {
        this.f794a = 3;
        this.f796c = z6Var;
        this.f797e = u10Var;
        this.d = hpVar;
        this.f795b = j10;
    }

    public m1(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.f794a = i3;
        this.f796c = obj;
        this.d = obj2;
        this.f795b = j10;
        this.f797e = obj3;
    }

    public m1(cs csVar, Object obj, Object obj2, long j10, int i3) {
        this.f794a = i3;
        this.f796c = csVar;
        this.d = obj;
        this.f797e = obj2;
        this.f795b = j10;
    }
}
