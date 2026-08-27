package gh;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gx;
import org.telegram.ui.gy;
import org.telegram.ui.hq0;
import org.telegram.ui.zx;

public final class b1 implements Utilities.Callback {

    public final int f7146a;

    public final long f7147b;

    public final Object f7148c;
    public final Object d;

    public final Object f7149e;

    public b1(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f7146a = i10;
        this.f7148c = obj;
        this.f7147b = j10;
        this.d = obj2;
        this.f7149e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f7146a;
        long j10 = this.f7147b;
        Object obj2 = this.f7149e;
        Object obj3 = this.d;
        Object obj4 = this.f7148c;
        switch (i10) {
            case 0:
                v1 v1Var = (v1) obj3;
                we.d dVar = (we.d) obj;
                dVar.d();
                v1Var.v1(j10, new cg.e1((k2) obj4, dVar, (Utilities.Callback) obj2, v1Var));
                break;
            case 1:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.f7147b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                break;
            case 2:
                ((MessagesController) obj4).lambda$checkSensitive$448(this.f7147b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                break;
            case 3:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.f7147b, (TLRPC.TL_textWithEntities) obj);
                break;
            case 4:
                gx gxVar = (gx) obj4;
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj2;
                gxVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                gy gyVar = gxVar.f38491b;
                gyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                zx zxVar = gyVar.f38621y2;
                gyVar.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                } else {
                    n2VarArr[0].finishFragment();
                }
                if (zxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    zxVar.w(gyVar, arrayList, null, false, gyVar.F2, gyVar.G2, gyVar.H2, null);
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new hq0(photoViewer, 16));
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmap.getWidth(), bitmapCreateBitmap.getHeight() / bitmap.getHeight());
                        canvas.scale(fMax, fMax);
                        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new k1(photoViewer, photoEntry, this.f7147b, str, bitmapCreateBitmap, 14));
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        AndroidUtilities.runOnUIThread(new hq0(photoViewer, 17));
                    }
                }
                break;
        }
    }

    public b1(Object obj, Dialog dialog, long j10, Object obj2, int i10) {
        this.f7146a = i10;
        this.f7148c = obj;
        this.d = dialog;
        this.f7147b = j10;
        this.f7149e = obj2;
    }

    public b1(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f7146a = i10;
        this.f7148c = obj;
        this.d = obj2;
        this.f7149e = obj3;
        this.f7147b = j10;
    }
}
