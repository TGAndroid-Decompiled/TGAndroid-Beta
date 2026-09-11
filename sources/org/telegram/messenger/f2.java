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
import org.telegram.ui.oy;
import org.telegram.ui.tx;
import org.telegram.ui.uy;
public final class f2 implements Utilities.Callback {
    public final int f17619a;
    public final long f17620b;
    public final Object f17621c;
    public final Object d;
    public final Object f17622e;

    public f2(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17619a = i10;
        this.f17621c = obj;
        this.f17620b = j3;
        this.d = obj2;
        this.f17622e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f17619a;
        long j3 = this.f17620b;
        Object obj2 = this.f17622e;
        Object obj3 = this.d;
        Object obj4 = this.f17621c;
        switch (i10) {
            case 0:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.f17620b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) obj4).lambda$checkSensitive$448(this.f17620b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                return;
            case 2:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.f17620b, (TLRPC.TL_textWithEntities) obj);
                return;
            case 3:
                tx txVar = (tx) obj4;
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj2;
                Runnable runnable = (Runnable) obj;
                txVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                uy uyVar = txVar.f40852b;
                uyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j3));
                oy oyVar = uyVar.C2;
                uyVar.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                } else {
                    n2VarArr[0].finishFragment();
                }
                if (oyVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
                    oyVar.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(photoViewer, photoEntry, this.f17620b, str, createBitmap, 6));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    AndroidUtilities.runOnUIThread(new ir0(photoViewer, 17));
                    return;
                }
            default:
                yh.b1 b1Var = (yh.b1) obj3;
                of.e eVar = (of.e) obj;
                eVar.d();
                b1Var.v1(j3, new bi.r3((yh.p1) obj4, eVar, (Utilities.Callback) obj2, b1Var, 17));
                return;
        }
    }

    public f2(Object obj, Dialog dialog, long j3, Object obj2, int i10) {
        this.f17619a = i10;
        this.f17621c = obj;
        this.d = dialog;
        this.f17620b = j3;
        this.f17622e = obj2;
    }

    public f2(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f17619a = i10;
        this.f17621c = obj;
        this.d = obj2;
        this.f17622e = obj3;
        this.f17620b = j3;
    }
}
