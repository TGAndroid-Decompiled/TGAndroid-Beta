package fh;

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
import org.telegram.ui.dx;
import org.telegram.ui.dy;
import org.telegram.ui.gq0;
import org.telegram.ui.wx;
public final class d1 implements Utilities.Callback {
    public final int f6407a;
    public final long f6408b;
    public final Object f6409c;
    public final Object d;
    public final Object f6410e;

    public d1(Object obj, long j10, Object obj2, Object obj3, int i9) {
        this.f6407a = i9;
        this.f6409c = obj;
        this.f6408b = j10;
        this.d = obj2;
        this.f6410e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f6407a;
        long j10 = this.f6408b;
        Object obj2 = this.f6410e;
        Object obj3 = this.d;
        Object obj4 = this.f6409c;
        switch (i9) {
            case 0:
                y1 y1Var = (y1) obj3;
                ve.d dVar = (ve.d) obj;
                dVar.d();
                y1Var.v1(j10, new bg.j1((p2) obj4, dVar, (Utilities.Callback) obj2, y1Var));
                return;
            case 1:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.f6408b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                return;
            case 2:
                ((MessagesController) obj4).lambda$checkSensitive$448(this.f6408b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                return;
            case 3:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.f6408b, (TLRPC.TL_textWithEntities) obj);
                return;
            case 4:
                dx dxVar = (dx) obj4;
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj2;
                Runnable runnable = (Runnable) obj;
                dxVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                dy dyVar = dxVar.f37621b;
                dyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                wx wxVar = dyVar.f37752y2;
                dyVar.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                } else {
                    o2VarArr[0].finishFragment();
                }
                if (wxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    wxVar.v(dyVar, arrayList, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new gq0(photoViewer, 16));
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
                    AndroidUtilities.runOnUIThread(new m1(photoViewer, photoEntry, this.f6408b, str, createBitmap, 14));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    AndroidUtilities.runOnUIThread(new gq0(photoViewer, 17));
                    return;
                }
        }
    }

    public d1(Object obj, Dialog dialog, long j10, Object obj2, int i9) {
        this.f6407a = i9;
        this.f6409c = obj;
        this.d = dialog;
        this.f6408b = j10;
        this.f6410e = obj2;
    }

    public d1(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.f6407a = i9;
        this.f6409c = obj;
        this.d = obj2;
        this.f6410e = obj3;
        this.f6408b = j10;
    }
}
