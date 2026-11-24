package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class s0c implements p8c {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public s0c(PhotoViewer photoViewer, String str, jm6 jm6Var, long j) {
        this.a = (byte) 7;
        this.c = photoViewer;
        this.e = str;
        this.d = jm6Var;
        this.b = j;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        String str = null;
        sma smaVar = null;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                b1c b1cVar = (b1c) obj4;
                k27 k27Var = (k27) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = k27Var.k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                b1cVar.getMessagesStorage().U1(j, k27Var.k);
                kk7.f(b1cVar.currentAccount).k(128, k27Var, Boolean.TRUE);
                return;
            case 1:
                ((p82) obj4).f0((hd) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ng1) obj);
                return;
            case 2:
                vf3 vf3Var = (vf3) obj4;
                uf3 uf3Var = (uf3) obj2;
                ((hd) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    t7b C = t7b.C(vf3Var.f0.getParentActivity(), vf3Var.f);
                    C.O = j;
                    j7b j7bVar = C.d1;
                    if (j7bVar != null) {
                        j7bVar.setDialogId(j);
                    }
                    C.N = false;
                    C.Q(o7b.c(uf3Var));
                    return;
                }
                return;
            case 3:
                d[] dVarArr = (d[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((hd) obj3).dismiss();
                cj3 cj3Var = ((wh3) obj4).b;
                cj3Var.getMessagesController().V2(Long.valueOf(j), null, 32);
                wi3 wi3Var = cj3Var.E2;
                cj3Var.removeSelfFromStack();
                if (dVarArr[1] != null) {
                    dVarArr[0].removeSelfFromStack();
                    dVarArr[1].finishFragment();
                } else {
                    dVarArr[0].finishFragment();
                }
                if (wi3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zc7.a(-j, 0L));
                    wi3Var.r(cj3Var, arrayList, null, false, cj3Var.L2, cj3Var.M2, cj3Var.N2, null);
                    return;
                }
                return;
            case 4:
                v74 v74Var = (v74) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i = v74Var.a;
                tL_getFactCheck.peer = na7.q1(i).h1(j);
                ArrayList arrayList4 = new ArrayList();
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    u74 u74Var = (u74) arrayList2.get(i3);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList3.get(i3);
                    if (tL_factCheck == null) {
                        arrayList4.add(u74Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(u74Var.a));
                    } else {
                        v74Var.d.remove(u74Var);
                        p8c p8cVar = (p8c) hashMap.get(u74Var);
                        if (p8cVar != null) {
                            p8cVar.a(tL_factCheck);
                            i2++;
                        }
                    }
                }
                if (i2 > 0) {
                    kk7.f(i).k(226, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i).sendRequest(tL_getFactCheck, new rt0(v74Var, tL_getFactCheck, arrayList4, hashMap, (byte) 5));
                    return;
                }
                return;
            case 5:
                hv4 hv4Var = (hv4) obj3;
                c01 c01Var = (c01) obj;
                c01Var.d();
                hv4Var.k1(j, new au0((tv4) obj4, c01Var, (p8c) obj2, hv4Var, (byte) 11));
                return;
            case 6:
                na7 na7Var = (na7) obj4;
                boolean[] zArr = (boolean[]) obj3;
                my myVar = (my) obj2;
                d S = LaunchActivity.S();
                if (((Boolean) obj).booleanValue()) {
                    na7Var.J4.add(Long.valueOf(j));
                    na7Var.J4(true);
                    if (S != null) {
                        u21.b0(S).P(2131623982, gl.E2(gl.O2(k96.M0(2131745382, null), -1, 2, new kv1(S, (byte) 4), null), true)).k(true);
                    }
                    zArr[0] = true;
                    myVar.run();
                    return;
                } else if (S != null) {
                    u21.b0(S).I(2131624012, k96.M0(2131754308, null), k96.M0(2131754309, null)).j();
                    return;
                } else {
                    return;
                }
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str3 = (String) obj2;
                jm6 jm6Var = (jm6) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (bitmap == null) {
                    gl.d3(new l68(photoViewer, (byte) 14));
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap = Bitmap.createBitmap(gl.L(26.0f), gl.L(26.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                    float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                    gl.d3(new o77(photoViewer, jm6Var, this.b, str3, createBitmap, (byte) 11));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    gl.d3(new l68(photoViewer, (byte) 15));
                    return;
                }
            case 8:
                vqa vqaVar = (vqa) obj4;
                vqaVar.f2.setLoading(false);
                h26 h26Var = new h26(26, vqaVar.a, vqaVar.J0, vqaVar.getContext(), new hu0(vqaVar, (byte) 13));
                h26Var.r1((ng1) obj);
                h26Var.q1((TL_stories.TL_premium_boostsStatus) obj3, true);
                h26Var.s1(j);
                TLRPC.Chat K0 = ((na7) obj2).K0(Long.valueOf(-j));
                if (K0 != null) {
                    h26Var.L2 = new sm0(vqaVar, K0);
                }
                h26Var.show();
                return;
            case 9:
                g2b g2bVar = (g2b) obj4;
                p8c p8cVar2 = (p8c) obj3;
                na7 na7Var2 = (na7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    p8cVar2.a(Boolean.FALSE);
                    return;
                }
                og1 E0 = na7Var2.E0();
                long j2 = this.b;
                E0.b(j2, tL_premium_boostsStatus, new s0c(g2bVar, p8cVar2, j2, tL_premium_boostsStatus, (byte) 10));
                p8cVar2.a(Boolean.FALSE);
                return;
            default:
                g2b g2bVar2 = (g2b) obj4;
                p8c p8cVar3 = (p8c) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ng1 ng1Var = (ng1) obj;
                if (ng1Var == null) {
                    p8cVar3.a(Boolean.FALSE);
                    return;
                }
                d Q = LaunchActivity.Q();
                if (g2bVar2.i(j)) {
                    smaVar = new sma(g2bVar2, j, (byte) 3);
                }
                int i4 = h26.R2;
                if (Q != null && Q.getContext() != null) {
                    h26 h26Var2 = new h26(18, Q.getCurrentAccount(), Q.getResourceProvider(), Q.getContext(), Q);
                    h26Var2.r1(ng1Var);
                    h26Var2.q1(tL_premium_boostsStatus2, true);
                    h26Var2.s1(j);
                    h26Var2.L2 = smaVar;
                    h26Var2.show();
                }
                p8cVar3.a(Boolean.FALSE);
                return;
        }
    }

    public s0c(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public s0c(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }

    public s0c(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
    }
}
