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
import org.telegram.ui.bx;
import org.telegram.ui.cy;
import org.telegram.ui.io;
import org.telegram.ui.qq0;
import org.telegram.ui.vx;
public final class x2 implements Utilities.Callback {
    public final int f2424a;
    public final long f2425b;
    public final Object f2426c;
    public final Object d;
    public final Object e;

    public x2(ci.i7 i7Var, Utilities.Callback callback, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f2424a = 3;
        this.f2426c = i7Var;
        this.e = callback;
        this.f2425b = j10;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void run(Object obj) {
        v3 v3Var;
        int i10 = this.f2424a;
        long j10 = this.f2425b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2426c;
        switch (i10) {
            case 0:
                l7.y0((l7) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f2425b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                ci.r rVar = (ci.r) obj4;
                ci.q qVar = (ci.q) obj2;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ei.vb D = ei.vb.D(rVar.f5873e0.getParentActivity(), rVar.f5874f);
                    D.N = j10;
                    ei.lb lbVar = D.f9956c1;
                    if (lbVar != null) {
                        lbVar.setDialogId(j10);
                    }
                    D.M = false;
                    D.Q(ei.qb.c(qVar));
                    return;
                }
                return;
            case 2:
                ci.i7 i7Var = (ci.i7) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f2425b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new x2(i7Var, callback, j11, tL_premium_boostsStatus));
                callback.run(Boolean.FALSE);
                return;
            case 3:
                ci.i7 i7Var2 = (ci.i7) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    callback2.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (i7Var2.j(j10)) {
                    v3Var = new v3(i7Var2, j10, 5);
                } else {
                    v3Var = null;
                }
                int i11 = sg.k0.V0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    sg.k0 k0Var = new sg.k0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    k0Var.H1(canApplyBoost);
                    k0Var.G1(tL_premium_boostsStatus2, true);
                    k0Var.I1(j10);
                    k0Var.Q0 = v3Var;
                    k0Var.show();
                }
                callback2.run(Boolean.FALSE);
                return;
            case 4:
                io.Y((io) obj4, (org.telegram.ui.ActionBar.b2) obj2, (TL_stories.TL_premium_boostsStatus) obj3, this.f2425b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 5:
                bx bxVar = (bx) obj4;
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj2;
                Runnable runnable = (Runnable) obj;
                bxVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                cy cyVar = bxVar.f35755b;
                cyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                vx vxVar = cyVar.C2;
                cyVar.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                } else {
                    n2VarArr[0].finishFragment();
                }
                if (vxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    vxVar.w(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
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
                    AndroidUtilities.runOnUIThread(new qq0(photoViewer, 16));
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
                    AndroidUtilities.runOnUIThread(new z(photoViewer, photoEntry, this.f2425b, str, createBitmap, 14));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new qq0(photoViewer, 17));
                    return;
                }
            default:
                yh.a1 a1Var = (yh.a1) obj3;
                pf.c cVar = (pf.c) obj;
                cVar.d();
                a1Var.Q1(j10, new ci.z2((yh.o1) obj4, cVar, (Utilities.Callback) obj2, a1Var, 19));
                return;
        }
    }

    public x2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f2424a = i10;
        this.f2426c = obj;
        this.d = obj2;
        this.f2425b = j10;
        this.e = obj3;
    }

    public x2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f2424a = i10;
        this.f2426c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2425b = j10;
    }

    public x2(io ioVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f2424a = 4;
        this.f2426c = ioVar;
        this.e = b2Var;
        this.d = tL_premium_boostsStatus;
        this.f2425b = j10;
    }
}
