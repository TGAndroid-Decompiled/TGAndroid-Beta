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
public final class s2c implements qac {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public s2c(PhotoViewer photoViewer, String str, jo6 jo6Var, long j) {
        this.a = (byte) 7;
        this.c = photoViewer;
        this.e = str;
        this.d = jo6Var;
        this.b = j;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        String str = null;
        toa toaVar = null;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                b3c b3cVar = (b3c) obj4;
                k47 k47Var = (k47) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = k47Var.k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                b3cVar.getMessagesStorage().U1(j, k47Var.k);
                nm7.f(b3cVar.currentAccount).k(129, k47Var, Boolean.TRUE);
                return;
            case 1:
                ((ba2) obj4).g0((he) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (vh1) obj);
                return;
            case 2:
                ih3 ih3Var = (ih3) obj4;
                hh3 hh3Var = (hh3) obj2;
                ((he) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    v9b C = v9b.C(ih3Var.f0.getParentActivity(), ih3Var.f);
                    C.O = j;
                    l9b l9bVar = C.d1;
                    if (l9bVar != null) {
                        l9bVar.setDialogId(j);
                    }
                    C.N = false;
                    C.Q(q9b.c(hh3Var));
                    return;
                }
                return;
            case 3:
                d[] dVarArr = (d[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((he) obj3).dismiss();
                nk3 nk3Var = ((ij3) obj4).b;
                nk3Var.getMessagesController().Y2(Long.valueOf(j), null, 32);
                hk3 hk3Var = nk3Var.E2;
                nk3Var.removeSelfFromStack();
                if (dVarArr[1] != null) {
                    dVarArr[0].removeSelfFromStack();
                    dVarArr[1].finishFragment();
                } else {
                    dVarArr[0].finishFragment();
                }
                if (hk3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bf7.a(-j, 0L));
                    hk3Var.q(nk3Var, arrayList, null, false, nk3Var.L2, nk3Var.M2, nk3Var.N2, null);
                    return;
                }
                return;
            case 4:
                e94 e94Var = (e94) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i = e94Var.a;
                tL_getFactCheck.peer = oc7.r1(i).i1(j);
                ArrayList arrayList4 = new ArrayList();
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    d94 d94Var = (d94) arrayList2.get(i3);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList3.get(i3);
                    if (tL_factCheck == null) {
                        arrayList4.add(d94Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(d94Var.a));
                    } else {
                        e94Var.d.remove(d94Var);
                        qac qacVar = (qac) hashMap.get(d94Var);
                        if (qacVar != null) {
                            qacVar.a(tL_factCheck);
                            i2++;
                        }
                    }
                }
                if (i2 > 0) {
                    nm7.f(i).k(227, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i).sendRequest(tL_getFactCheck, new av0(e94Var, tL_getFactCheck, arrayList4, hashMap, (byte) 5));
                    return;
                }
                return;
            case 5:
                ix4 ix4Var = (ix4) obj3;
                k11 k11Var = (k11) obj;
                k11Var.d();
                ix4Var.k1(j, new jv0((ux4) obj4, k11Var, (qac) obj2, ix4Var, (byte) 11));
                return;
            case 6:
                oc7 oc7Var = (oc7) obj4;
                boolean[] zArr = (boolean[]) obj3;
                mz mzVar = (mz) obj2;
                d S = LaunchActivity.S();
                if (((Boolean) obj).booleanValue()) {
                    oc7Var.L4.add(Long.valueOf(j));
                    oc7Var.M4(true);
                    if (S != null) {
                        c41.b0(S).P(2131623982, gm.D2(gm.N2(jb6.M0(2131745308, null), -1, 2, new ww1(S, (byte) 4), null), true)).k(true);
                    }
                    zArr[0] = true;
                    mzVar.run();
                    return;
                } else if (S != null) {
                    c41.b0(S).I(2131624012, jb6.M0(2131754308, null), jb6.M0(2131754309, null)).j();
                    return;
                } else {
                    return;
                }
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str3 = (String) obj2;
                jo6 jo6Var = (jo6) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (bitmap == null) {
                    gm.c3(new n88(photoViewer, (byte) 13));
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap = Bitmap.createBitmap(gm.L(26.0f), gm.L(26.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                    float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                    gm.c3(new r97(photoViewer, jo6Var, this.b, str3, createBitmap, (byte) 11));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    gm.c3(new n88(photoViewer, (byte) 14));
                    return;
                }
            case 8:
                wsa wsaVar = (wsa) obj4;
                wsaVar.f2.setLoading(false);
                i46 i46Var = new i46(26, wsaVar.a, wsaVar.J0, wsaVar.getContext(), new qv0(wsaVar, (byte) 13));
                i46Var.r1((vh1) obj);
                i46Var.q1((TL_stories.TL_premium_boostsStatus) obj3, true);
                i46Var.s1(j);
                TLRPC.Chat L0 = ((oc7) obj2).L0(Long.valueOf(-j));
                if (L0 != null) {
                    i46Var.L2 = new sn0(wsaVar, L0);
                }
                i46Var.show();
                return;
            case 9:
                h4b h4bVar = (h4b) obj4;
                qac qacVar2 = (qac) obj3;
                oc7 oc7Var2 = (oc7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    qacVar2.a(Boolean.FALSE);
                    return;
                }
                wh1 F0 = oc7Var2.F0();
                long j2 = this.b;
                F0.b(j2, tL_premium_boostsStatus, new s2c(h4bVar, qacVar2, j2, tL_premium_boostsStatus, (byte) 10));
                qacVar2.a(Boolean.FALSE);
                return;
            default:
                h4b h4bVar2 = (h4b) obj4;
                qac qacVar3 = (qac) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                vh1 vh1Var = (vh1) obj;
                if (vh1Var == null) {
                    qacVar3.a(Boolean.FALSE);
                    return;
                }
                d Q = LaunchActivity.Q();
                if (h4bVar2.i(j)) {
                    toaVar = new toa(h4bVar2, j, (byte) 3);
                }
                toa toaVar2 = toaVar;
                int i4 = i46.R2;
                if (Q != null && Q.getContext() != null) {
                    i46 i46Var2 = new i46(18, Q.getCurrentAccount(), Q.getResourceProvider(), Q.getContext(), Q);
                    i46Var2.r1(vh1Var);
                    i46Var2.q1(tL_premium_boostsStatus2, true);
                    i46Var2.s1(j);
                    i46Var2.L2 = toaVar2;
                    i46Var2.show();
                }
                qacVar3.a(Boolean.FALSE);
                return;
        }
    }

    public s2c(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public s2c(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }

    public s2c(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
    }
}
