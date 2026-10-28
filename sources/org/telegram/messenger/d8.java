package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;
public final class d8 implements Runnable {
    public final int f19885a = 0;
    public final boolean f19886b;
    public final int f19887c;
    public final int d;
    public final Object e;
    public final Object f19888f;
    public final Object h;

    public d8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.f19887c = i10;
        this.f19888f = tLObject;
        this.h = r2Var;
        this.f19886b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc qcVar;
        int i10;
        int i11;
        int i12;
        Canvas canvas;
        int i13 = this.f19885a;
        int i14 = this.d;
        int i15 = this.f19887c;
        Object obj = this.h;
        Object obj2 = this.f19888f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f19887c, (TLObject) obj2, (org.telegram.ui.ActionBar.r2) obj, this.f19886b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$102(this.f19886b, (TLRPC.Message) obj2, this.f19887c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                wn wnVar = ((org.telegram.ui.jl) obj3).f40558b;
                if (this.f19886b) {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + wnVar.f45168j6).commit();
                    wnVar.Pc(0, true);
                    qcVar = null;
                } else {
                    qcVar = null;
                    wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.f45168j6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(wnVar.f45106e5));
                }
                if (i14 == wnVar.O3) {
                    wnVar.M3 = qcVar;
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = qaVar.f31824c;
                int i16 = qaVar.d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i15 != 90 && i15 != 270) {
                        i12 = round2;
                        i11 = round;
                    } else {
                        i11 = round2;
                        i12 = round;
                    }
                    int i17 = i16 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i17 + i11, i17 + i12, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i18 = i16 + round;
                    int i19 = i16 + round2;
                    Rect rect2 = new Rect(i16, i16, i18, i19);
                    float f7 = i16;
                    canvas2.translate((i11 / 2.0f) + f7, (i12 / 2.0f) + f7);
                    if (i14 == 1) {
                        canvas2.scale(-1.0f, 1.0f);
                        canvas = canvas2;
                    } else {
                        canvas = canvas2;
                        if (i14 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i15);
                    float f10 = -i16;
                    canvas.translate(f10 - (round / 2.0f), f10 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i16 > 0) {
                        float f11 = i18;
                        Canvas canvas3 = canvas;
                        canvas3.drawRect(0.0f, 0.0f, f11, f7, paint);
                        float f12 = i19;
                        canvas3.drawRect(0.0f, f7, f7, f12, paint);
                        float f13 = i18 + i16;
                        canvas3.drawRect(f11, f7, f13, f12, paint);
                        canvas3.drawRect(0.0f, f12, f13, i19 + i16, paint);
                    }
                    AndroidUtilities.runOnUIThread(new fi.r1(qaVar, str, createBitmap, this.f19886b, bitmap));
                    return;
                }
                return;
        }
    }

    public d8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f19886b = z10;
        this.f19888f = message;
        this.f19887c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public d8(org.telegram.ui.jl jlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = jlVar;
        this.f19886b = z10;
        this.f19888f = arrayList;
        this.h = arrayList2;
        this.f19887c = i10;
        this.d = i11;
    }

    public d8(org.telegram.ui.Components.qa qaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = qaVar;
        this.f19888f = bitmap;
        this.f19887c = i10;
        this.d = i11;
        this.h = str;
        this.f19886b = z10;
    }
}
