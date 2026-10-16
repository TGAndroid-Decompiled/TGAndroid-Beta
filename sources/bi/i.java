package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import di.fc;
import di.kc;
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
import org.telegram.ui.mr0;
import org.telegram.ui.sy;
import org.telegram.ui.xx;
import org.telegram.ui.yy;
import org.telegram.ui.zo;
public final class i implements Utilities.Callback {
    public final int f3157a;
    public final long f3158b;
    public final Object f3159c;
    public final Object d;
    public final Object e;

    public i(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f3157a = i10;
        this.f3159c = obj;
        this.d = obj2;
        this.f3158b = j10;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        g gVar;
        int i10 = this.f3157a;
        long j10 = this.f3158b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f3159c;
        switch (i10) {
            case 0:
                v vVar = (v) obj4;
                u uVar = (u) obj2;
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    kc D = kc.D(vVar.f3822e0.getParentActivity(), vVar.f3823f);
                    D.N = j10;
                    di.ac acVar = D.f7246c1;
                    if (acVar != null) {
                        acVar.setDialogId(j10);
                    }
                    D.M = false;
                    D.Q(fc.c(uVar));
                    return;
                }
                return;
            case 1:
                x8 x8Var = (x8) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f3158b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new i(x8Var, callback, j11, tL_premium_boostsStatus, 2));
                callback.run(Boolean.FALSE);
                return;
            case 2:
                x8 x8Var2 = (x8) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    callback2.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (x8Var2.j(j10)) {
                    gVar = new g(x8Var2, j10, 3);
                } else {
                    gVar = null;
                }
                int i11 = sg.j0.V0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    sg.j0 j0Var = new sg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    j0Var.H1(canApplyBoost);
                    j0Var.G1(tL_premium_boostsStatus2, true);
                    j0Var.I1(j10);
                    j0Var.Q0 = gVar;
                    j0Var.show();
                }
                callback2.run(Boolean.FALSE);
                return;
            case 3:
                zo.Y((zo) obj4, (org.telegram.ui.ActionBar.a2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f3158b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 4:
                xx xxVar = (xx) obj4;
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj2;
                Runnable runnable = (Runnable) obj;
                xxVar.getClass();
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                yy yyVar = xxVar.f41675b;
                yyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                sy syVar = yyVar.C2;
                yyVar.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                } else {
                    m2VarArr[0].finishFragment();
                }
                if (syVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    syVar.w(yyVar, arrayList, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new mr0(photoViewer, 16));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(photoViewer, photoEntry, this.f3158b, str, createBitmap, 6));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new mr0(photoViewer, 17));
                    return;
                }
            case 6:
                yh.b1 b1Var = (yh.b1) obj3;
                pf.c cVar = (pf.c) obj;
                cVar.d();
                b1Var.w1(j10, new u3((yh.p1) obj4, cVar, (Utilities.Callback) obj2, b1Var, 19));
                return;
            default:
                zh.r3.t0((zh.r3) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f3158b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public i(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f3157a = i10;
        this.f3159c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3158b = j10;
    }
}
