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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class r4c implements pcc {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public r4c(PhotoViewer photoViewer, String str, no6 no6Var, long j) {
        this.a = (byte) 7;
        this.c = photoViewer;
        this.e = str;
        this.d = no6Var;
        this.b = j;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        String str = null;
        pqa pqaVar = null;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                a5c a5cVar = (a5c) obj4;
                r47 r47Var = (r47) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = r47Var.k;
                if (tL_textWithEntities != null) {
                    str = str2;
                }
                message.translatedSummaryLanguage = str;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                a5cVar.getMessagesStorage().Z1(j, r47Var.k);
                jn7.f(a5cVar.currentAccount).k(129, r47Var, Boolean.TRUE);
                return;
            case 1:
                ((g92) obj4).f0((id) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (wg1) obj);
                return;
            case 2:
                pg3 pg3Var = (pg3) obj4;
                og3 og3Var = (og3) obj2;
                ((id) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sbb C = sbb.C(pg3Var.f0.getParentActivity(), pg3Var.f);
                    C.O = j;
                    ibb ibbVar = C.d1;
                    if (ibbVar != null) {
                        ibbVar.setDialogId(j);
                    }
                    C.N = false;
                    C.Q(nbb.c(og3Var));
                    return;
                }
                return;
            case 3:
                e[] eVarArr = (e[]) obj2;
                Runnable runnable = (Runnable) obj;
                ((id) obj3).dismiss();
                uj3 uj3Var = ((qi3) obj4).b;
                uj3Var.getMessagesController().c3(Long.valueOf(j), null, 32);
                oj3 oj3Var = uj3Var.E2;
                uj3Var.removeSelfFromStack();
                if (eVarArr[1] != null) {
                    eVarArr[0].removeSelfFromStack();
                    eVarArr[1].finishFragment();
                } else {
                    eVarArr[0].finishFragment();
                }
                if (oj3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(jf7.a(-j, 0L));
                    oj3Var.q(uj3Var, arrayList, null, false, uj3Var.L2, uj3Var.M2, uj3Var.N2, null);
                    return;
                }
                return;
            case 4:
                q84 q84Var = (q84) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i = q84Var.a;
                tL_getFactCheck.peer = uc7.s1(i).j1(j);
                ArrayList arrayList4 = new ArrayList();
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    p84 p84Var = (p84) arrayList2.get(i3);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList3.get(i3);
                    if (tL_factCheck == null) {
                        arrayList4.add(p84Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(p84Var.a));
                    } else {
                        q84Var.d.remove(p84Var);
                        pcc pccVar = (pcc) hashMap.get(p84Var);
                        if (pccVar != null) {
                            pccVar.a(tL_factCheck);
                            i2++;
                        }
                    }
                }
                if (i2 > 0) {
                    jn7.f(i).k(227, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i).sendRequest(tL_getFactCheck, new au0(q84Var, tL_getFactCheck, arrayList4, hashMap, (byte) 5));
                    return;
                }
                return;
            case 5:
                mx4 mx4Var = (mx4) obj3;
                l01 l01Var = (l01) obj;
                l01Var.d();
                mx4Var.l1(j, new ku0((yx4) obj4, l01Var, (pcc) obj2, mx4Var, (byte) 11));
                return;
            case 6:
                uc7 uc7Var = (uc7) obj4;
                boolean[] zArr = (boolean[]) obj3;
                ny nyVar = (ny) obj2;
                e S = LaunchActivity.S();
                if (((Boolean) obj).booleanValue()) {
                    uc7Var.L4.add(Long.valueOf(j));
                    uc7Var.S4(true);
                    if (S != null) {
                        d31.b0(S).P(2131623982, hl.D2(hl.N2(ob6.M0(2131745302, null), -1, 2, new yv1(S, (byte) 4), null), true)).k(true);
                    }
                    zArr[0] = true;
                    nyVar.run();
                    return;
                } else if (S != null) {
                    d31.b0(S).I(2131624012, ob6.M0(2131754304, null), ob6.M0(2131754305, null)).j();
                    return;
                } else {
                    return;
                }
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str3 = (String) obj2;
                no6 no6Var = (no6) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (bitmap == null) {
                    hl.c3(new y98(photoViewer, (byte) 15));
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap = Bitmap.createBitmap(hl.L(26.0f), hl.L(26.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                    float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                    hl.c3(new da7(photoViewer, no6Var, this.b, str3, createBitmap, (byte) 12));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    hl.c3(new y98(photoViewer, (byte) 16));
                    return;
                }
            case 8:
                wua wuaVar = (wua) obj4;
                wuaVar.f2.setLoading(false);
                l46 l46Var = new l46(26, wuaVar.a, wuaVar.J0, wuaVar.getContext(), new qu0(wuaVar, (byte) 13));
                l46Var.s1((wg1) obj);
                l46Var.r1((TL_stories.TL_premium_boostsStatus) obj3, true);
                l46Var.t1(j);
                TLRPC.Chat M0 = ((uc7) obj2).M0(Long.valueOf(-j));
                if (M0 != null) {
                    l46Var.L2 = new sm0(wuaVar, M0);
                }
                l46Var.show();
                return;
            case 9:
                c6b c6bVar = (c6b) obj4;
                pcc pccVar2 = (pcc) obj3;
                uc7 uc7Var2 = (uc7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    pccVar2.a(Boolean.FALSE);
                    return;
                }
                xg1 G0 = uc7Var2.G0();
                long j2 = this.b;
                G0.b(j2, tL_premium_boostsStatus, new r4c(c6bVar, pccVar2, j2, tL_premium_boostsStatus, (byte) 10));
                pccVar2.a(Boolean.FALSE);
                return;
            default:
                c6b c6bVar2 = (c6b) obj4;
                pcc pccVar3 = (pcc) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                wg1 wg1Var = (wg1) obj;
                if (wg1Var == null) {
                    pccVar3.a(Boolean.FALSE);
                    return;
                }
                e Q = LaunchActivity.Q();
                if (c6bVar2.i(j)) {
                    pqaVar = new pqa(c6bVar2, j, (byte) 3);
                }
                int i4 = l46.R2;
                if (Q != null && Q.getContext() != null) {
                    l46 l46Var2 = new l46(18, Q.getCurrentAccount(), Q.getResourceProvider(), Q.getContext(), Q);
                    l46Var2.s1(wg1Var);
                    l46Var2.r1(tL_premium_boostsStatus2, true);
                    l46Var2.t1(j);
                    l46Var2.L2 = pqaVar;
                    l46Var2.show();
                }
                pccVar3.a(Boolean.FALSE);
                return;
        }
    }

    public r4c(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public r4c(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }

    public r4c(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
    }
}
