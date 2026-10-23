package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dx;
import org.telegram.ui.ey;
import org.telegram.ui.ko;
import org.telegram.ui.tq0;
import org.telegram.ui.xx;
public final class x2 implements Utilities.Callback {
    public final int f2427a;
    public final long f2428b;
    public final Object f2429c;
    public final Object d;
    public final Object e;

    public x2(ci.h7 h7Var, Utilities.Callback callback, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f2427a = 3;
        this.f2429c = h7Var;
        this.e = callback;
        this.f2428b = j10;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void run(Object obj) {
        v3 v3Var;
        int i10 = this.f2427a;
        long j10 = this.f2428b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2429c;
        switch (i10) {
            case 0:
                l7.x0((l7) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f2428b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                ci.r rVar = (ci.r) obj4;
                ci.q qVar = (ci.q) obj2;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ei.vb D = ei.vb.D(rVar.f5818e0.getParentActivity(), rVar.f5819f);
                    D.N = j10;
                    ei.lb lbVar = D.f9973c1;
                    if (lbVar != null) {
                        lbVar.setDialogId(j10);
                    }
                    D.M = false;
                    D.Q(ei.qb.c(qVar));
                    return;
                }
                return;
            case 2:
                ci.h7 h7Var = (ci.h7) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f2428b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new x2(h7Var, callback, j11, tL_premium_boostsStatus));
                callback.run(Boolean.FALSE);
                return;
            case 3:
                ci.h7 h7Var2 = (ci.h7) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    callback2.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (h7Var2.j(j10)) {
                    v3Var = new v3(h7Var2, j10, 5);
                } else {
                    v3Var = null;
                }
                int i11 = sg.j0.W0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    sg.j0 j0Var = new sg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    j0Var.K1(canApplyBoost);
                    j0Var.J1(tL_premium_boostsStatus2, true);
                    j0Var.L1(j10);
                    j0Var.Q0 = v3Var;
                    j0Var.show();
                }
                callback2.run(Boolean.FALSE);
                return;
            case 4:
                ko.Y((ko) obj4, (org.telegram.ui.ActionBar.c2) obj2, (TL_stories.TL_premium_boostsStatus) obj3, this.f2428b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 5:
                dx dxVar = (dx) obj4;
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj2;
                Runnable runnable = (Runnable) obj;
                dxVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                ey eyVar = dxVar.f36747b;
                eyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                xx xxVar = eyVar.C2;
                eyVar.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                } else {
                    o2VarArr[0].finishFragment();
                }
                if (xxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    xxVar.w(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new tq0(photoViewer, 16));
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                    float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                    AndroidUtilities.runOnUIThread(new z(photoViewer, photoEntry, this.f2428b, str, createBitmap, 14));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new tq0(photoViewer, 17));
                    return;
                }
            default:
                yh.a1 a1Var = (yh.a1) obj3;
                pf.c cVar = (pf.c) obj;
                cVar.d();
                a1Var.P1(j10, new ci.y2((yh.o1) obj4, cVar, (Utilities.Callback) obj2, a1Var, 19));
                return;
        }
    }

    public x2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f2427a = i10;
        this.f2429c = obj;
        this.d = obj2;
        this.f2428b = j10;
        this.e = obj3;
    }

    public x2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f2427a = i10;
        this.f2429c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2428b = j10;
    }

    public x2(ko koVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f2427a = 4;
        this.f2429c = koVar;
        this.e = c2Var;
        this.d = tL_premium_boostsStatus;
        this.f2428b = j10;
    }
}
