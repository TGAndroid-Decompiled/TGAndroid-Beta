package bi;

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
import org.telegram.ui.cy;
import org.telegram.ui.mo;
import org.telegram.ui.ux;
import org.telegram.ui.xq0;
import org.telegram.ui.yw;
public final class t2 implements Utilities.Callback {
    public final int f5439a;
    public final long f5440b;
    public final Object f5441c;
    public final Object d;
    public final Object e;

    public t2(di.h7 h7Var, Utilities.Callback callback, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f5439a = 3;
        this.f5441c = h7Var;
        this.e = callback;
        this.f5440b = j10;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void run(Object obj) {
        r3 r3Var;
        int i10 = this.f5439a;
        long j10 = this.f5440b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f5441c;
        switch (i10) {
            case 0:
                h7.x0((h7) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f5440b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                di.r rVar = (di.r) obj4;
                di.q qVar = (di.q) obj2;
                ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.sb D = fi.sb.D(rVar.f9078e0.getParentActivity(), rVar.f9079f);
                    D.N = j10;
                    fi.ib ibVar = D.f11614c1;
                    if (ibVar != null) {
                        ibVar.setDialogId(j10);
                    }
                    D.M = false;
                    D.Q(fi.nb.c(qVar));
                    return;
                }
                return;
            case 2:
                di.h7 h7Var = (di.h7) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f5440b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new t2(h7Var, callback, j11, tL_premium_boostsStatus));
                callback.run(Boolean.FALSE);
                return;
            case 3:
                di.h7 h7Var2 = (di.h7) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    callback2.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (h7Var2.j(j10)) {
                    r3Var = new r3(h7Var2, j10, 5);
                } else {
                    r3Var = null;
                }
                int i11 = tg.j0.W0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    tg.j0 j0Var = new tg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    j0Var.K1(canApplyBoost);
                    j0Var.J1(tL_premium_boostsStatus2, true);
                    j0Var.L1(j10);
                    j0Var.Q0 = r3Var;
                    j0Var.show();
                }
                callback2.run(Boolean.FALSE);
                return;
            case 4:
                mo.Z((mo) obj4, (org.telegram.ui.ActionBar.e2) obj2, (TL_stories.TL_premium_boostsStatus) obj3, this.f5440b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 5:
                yw ywVar = (yw) obj4;
                org.telegram.ui.ActionBar.r2[] r2VarArr = (org.telegram.ui.ActionBar.r2[]) obj2;
                Runnable runnable = (Runnable) obj;
                ywVar.getClass();
                ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                cy cyVar = ywVar.f46121b;
                cyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                ux uxVar = cyVar.C2;
                cyVar.removeSelfFromStack();
                if (r2VarArr[1] != null) {
                    r2VarArr[0].removeSelfFromStack();
                    r2VarArr[1].finishFragment();
                } else {
                    r2VarArr[0].finishFragment();
                }
                if (uxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    uxVar.v(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
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
                    AndroidUtilities.runOnUIThread(new xq0(photoViewer, 16));
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
                    AndroidUtilities.runOnUIThread(new a0(photoViewer, photoEntry, this.f5440b, str, createBitmap, 14));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new xq0(photoViewer, 17));
                    return;
                }
            default:
                zh.a1 a1Var = (zh.a1) obj3;
                qf.c cVar = (qf.c) obj;
                cVar.d();
                a1Var.P1(j10, new di.y2((zh.p1) obj4, cVar, (Utilities.Callback) obj2, a1Var, 19));
                return;
        }
    }

    public t2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f5439a = i10;
        this.f5441c = obj;
        this.d = obj2;
        this.f5440b = j10;
        this.e = obj3;
    }

    public t2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f5439a = i10;
        this.f5441c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5440b = j10;
    }

    public t2(mo moVar, org.telegram.ui.ActionBar.e2 e2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f5439a = 4;
        this.f5441c = moVar;
        this.e = e2Var;
        this.d = tL_premium_boostsStatus;
        this.f5440b = j10;
    }
}
