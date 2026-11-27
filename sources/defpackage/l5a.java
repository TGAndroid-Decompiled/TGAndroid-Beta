package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class l5a implements Runnable {
    public final byte a = 1;
    public final int b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Serializable h;

    public l5a(fi0 fi0Var, Bitmap bitmap, int i, int i2, String str, boolean z) {
        this.e = fi0Var;
        this.f = bitmap;
        this.b = i;
        this.c = i2;
        this.h = str;
        this.d = z;
    }

    @Override
    public final void run() {
        r7a r7aVar;
        int i;
        int i2;
        int i3;
        byte b = this.a;
        int i4 = 5;
        int i5 = this.c;
        int i6 = this.b;
        Object obj = this.f;
        Serializable serializable = this.h;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                r7a r7aVar2 = (r7a) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                ArrayList arrayList = (ArrayList) serializable;
                boolean c5 = r47.c5(message);
                boolean z = this.d;
                if (c5) {
                    i4 = 9;
                } else if (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) {
                    i4 = z ? 1 : 0;
                }
                kf7 messagesStorage = r7aVar2.getMessagesStorage();
                long j = message.random_id;
                long B1 = r47.B1(message.peer_id);
                int i7 = this.b;
                messagesStorage.c2(j, B1, Integer.valueOf(i7), message.id, 0, z ? 1 : 0, message.quick_reply_shortcut_id);
                int i8 = i4;
                r7aVar2.getMessagesStorage().k1(arrayList, true, false, false, 0, false, i8, message.quick_reply_shortcut_id);
                if (r47.e3(message)) {
                    long B12 = r47.B1(message.peer_id);
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(Integer.valueOf(message.id));
                    r7aVar2.getMessagesStorage().P0(B12, arrayList2, false, false, i8, (int) r47.Z1(r7aVar2.currentAccount, message, 0));
                    r7aVar2.getMessagesStorage().T1(B12, -B12, arrayList2, null);
                    r7aVar = r7aVar2;
                    hl.c3(new p5a(r7aVar, B12, arrayList2, (byte) 0));
                } else {
                    r7aVar = r7aVar2;
                }
                hl.c3(new e21(r7aVar, message, i7, this.c, z));
                return;
            case 1:
                fi0 fi0Var = (fi0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) serializable;
                Paint paint = (Paint) fi0Var.d;
                ?? r1 = fi0Var.b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i6 != 90 && i6 != 270) {
                        i2 = round2;
                        i = round;
                    } else {
                        i = round2;
                        i2 = round;
                    }
                    int i9 = (r1 == true ? 1 : 0) << 1;
                    Bitmap createBitmap = Bitmap.createBitmap(i9 + i, i9 + i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i10 = (r1 == true ? 1 : 0) + round;
                    int i11 = (r1 == true ? 1 : 0) + round2;
                    Rect rect2 = new Rect(r1 == true ? 1 : 0, r1 == true ? 1 : 0, i10, i11);
                    float f = r1 == true ? 1.0f : 0.0f;
                    canvas.translate((i / 2.0f) + f, (i2 / 2.0f) + f);
                    if (i5 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i5 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i6);
                    float f2 = -(r1 == true ? 1 : 0);
                    uh9.n(round2, 2.0f, f2, f2 - (round / 2.0f), canvas);
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (r1 > 0) {
                        float f3 = i10;
                        canvas.drawRect(0.0f, 0.0f, f3, f, paint);
                        float f4 = i11;
                        canvas.drawRect(0.0f, f, f, f4, paint);
                        float f5 = i10 + (r1 == true ? 1 : 0);
                        canvas.drawRect(f3, f, f5, f4, paint);
                        canvas.drawRect(0.0f, f4, f5, i11 + (r1 == true ? 1 : 0), paint);
                    }
                    hl.c3(new va7(fi0Var, str, createBitmap, this.d, bitmap, (byte) 2));
                    return;
                }
                return;
            default:
                ArrayList arrayList3 = (ArrayList) serializable;
                ArrayList arrayList4 = (ArrayList) obj;
                zu1 zu1Var = ((qs1) obj2).b;
                if (this.d) {
                    i3 = ((e) zu1Var).currentAccount;
                    uc7.s1(i3).X3.edit().remove("pin_" + zu1Var.l6).commit();
                    zu1Var.gd(0, true);
                } else {
                    zu1Var.getNotificationCenter().k(57, Long.valueOf(zu1Var.l6), arrayList3, Boolean.TRUE, arrayList4, null, 0, Integer.valueOf(i6), Boolean.valueOf(zu1Var.g5));
                }
                if (i5 == zu1Var.R3) {
                    zu1Var.P3 = null;
                    return;
                }
                return;
        }
    }

    public l5a(qs1 qs1Var, boolean z, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.e = qs1Var;
        this.d = z;
        this.h = arrayList;
        this.f = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public l5a(r7a r7aVar, boolean z, TLRPC.Message message, int i, ArrayList arrayList, int i2) {
        this.e = r7aVar;
        this.d = z;
        this.f = message;
        this.b = i;
        this.h = arrayList;
        this.c = i2;
    }
}
