package org.telegram.messenger;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ir0;
import org.telegram.ui.qy;
import org.telegram.ui.vx;
import org.telegram.ui.wy;
public final class j2 implements Utilities.Callback {
    public final int f15494a;
    public final long f15495b;
    public final Object f15496c;
    public final Object d;
    public final Object e;

    public j2(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f15494a = i10;
        this.f15496c = obj;
        this.f15495b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f15494a;
        long j3 = this.f15495b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15496c;
        switch (i10) {
            case 0:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.f15495b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) obj4).lambda$checkSensitive$448(this.f15495b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                return;
            case 2:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.f15495b, (TLRPC.TL_textWithEntities) obj);
                return;
            case 3:
                vx vxVar = (vx) obj4;
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj2;
                Runnable runnable = (Runnable) obj;
                vxVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                wy wyVar = vxVar.f37644b;
                wyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j3));
                qy qyVar = wyVar.C2;
                wyVar.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                } else {
                    p2VarArr[0].finishFragment();
                }
                if (qyVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
                    qyVar.v(wyVar, arrayList, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new ir0(photoViewer, 16));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g(photoViewer, photoEntry, this.f15495b, str, createBitmap, 6));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new ir0(photoViewer, 17));
                    return;
                }
            default:
                wh.b1 b1Var = (wh.b1) obj3;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                b1Var.v1(j3, new gg.u1((wh.p1) obj4, eVar, (Utilities.Callback) obj2, b1Var, 15));
                return;
        }
    }

    public j2(Object obj, Dialog dialog, long j3, Object obj2, int i10) {
        this.f15494a = i10;
        this.f15496c = obj;
        this.d = dialog;
        this.f15495b = j3;
        this.e = obj2;
    }

    public j2(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f15494a = i10;
        this.f15496c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15495b = j3;
    }
}
