package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hr0;
import org.telegram.ui.my;
import org.telegram.ui.rx;
import org.telegram.ui.sy;
import org.telegram.ui.uo;
public final class l implements Utilities.Callback {
    public final int f1311a;
    public final long f1312b;
    public final Object f1313c;
    public final Object d;
    public final Object f1314e;

    public l(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f1311a = i10;
        this.f1313c = obj;
        this.f1312b = j3;
        this.d = obj2;
        this.f1314e = obj3;
    }

    @Override
    public final void run(Object obj) {
        j jVar;
        int i10 = this.f1311a;
        long j3 = this.f1312b;
        Object obj2 = this.f1314e;
        Object obj3 = this.d;
        Object obj4 = this.f1313c;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj4;
                a0 a0Var = (a0) obj2;
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc D = ci.lc.D(b0Var.f668e0.getParentActivity(), b0Var.f669f);
                    D.N = j3;
                    ci.bc bcVar = D.f5466c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(j3);
                    }
                    D.M = false;
                    D.Q(ci.gc.c(a0Var));
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j10 = this.f1312b;
                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new l(m9Var, callback, j10, tL_premium_boostsStatus, 2));
                callback.run(Boolean.FALSE);
                return;
            case 2:
                m9 m9Var2 = (m9) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    callback2.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (m9Var2.j(j3)) {
                    jVar = new j(m9Var2, j3, 3);
                } else {
                    jVar = null;
                }
                int i11 = rg.j0.V0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    rg.j0 j0Var = new rg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    j0Var.H1(canApplyBoost);
                    j0Var.G1(tL_premium_boostsStatus2, true);
                    j0Var.I1(j3);
                    j0Var.Q0 = jVar;
                    j0Var.show();
                }
                callback2.run(Boolean.FALSE);
                return;
            case 3:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.f1312b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                return;
            case 4:
                ((MessagesController) obj4).lambda$checkSensitive$451(this.f1312b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                return;
            case 5:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.f1312b, (TLRPC.TL_textWithEntities) obj);
                return;
            case 6:
                uo.Y((uo) obj4, (org.telegram.ui.ActionBar.a2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f1312b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 7:
                rx rxVar = (rx) obj4;
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj2;
                Runnable runnable = (Runnable) obj;
                rxVar.getClass();
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                sy syVar = rxVar.f41524b;
                syVar.getMessagesController().loadChannelParticipants(Long.valueOf(j3));
                my myVar = syVar.C2;
                syVar.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                } else {
                    m2VarArr[0].finishFragment();
                }
                if (myVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
                    myVar.w(syVar, arrayList, null, false, syVar.J2, syVar.K2, syVar.L2, null);
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new hr0(photoViewer, 16));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(photoViewer, photoEntry, this.f1312b, str, createBitmap, 6));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    AndroidUtilities.runOnUIThread(new hr0(photoViewer, 17));
                    return;
                }
            case 9:
                xh.d1 d1Var = (xh.d1) obj3;
                of.e eVar = (of.e) obj;
                eVar.d();
                d1Var.w1(j3, new f4((xh.r1) obj4, eVar, (Utilities.Callback) obj2, d1Var, 19));
                return;
            default:
                yh.s3.t0((yh.s3) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f1312b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public l(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f1311a = i10;
        this.f1313c = obj;
        this.d = obj2;
        this.f1312b = j3;
        this.f1314e = obj3;
    }

    public l(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f1311a = i10;
        this.f1313c = obj;
        this.d = obj2;
        this.f1314e = obj3;
        this.f1312b = j3;
    }
}
