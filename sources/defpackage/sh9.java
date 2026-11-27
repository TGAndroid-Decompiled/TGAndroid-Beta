package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class sh9 implements pcc {
    public final byte a;
    public final Object b;

    public sh9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        float f;
        float f2;
        String K;
        String concat;
        String str;
        byte b;
        CharSequence V;
        l9c l9cVar;
        byte b2 = this.a;
        float f3 = -0.07f;
        float f4 = 0.25f;
        TLRPC.User user = null;
        TL_account.TL_birthday tL_birthday = null;
        boolean z = false;
        int i = 0;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                pi9 pi9Var = (pi9) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    pi9Var.O1(pageblockmath);
                    return;
                }
                return;
            case 1:
                dq9 dq9Var = (dq9) obj2;
                if (((Boolean) obj).booleanValue() && !dq9Var.w) {
                    dq9Var.n = true;
                    dq9Var.R = true;
                    dq9Var.E(false);
                    w96.N = dq9Var;
                    dq9Var.S = NativeInstance.createVideoCapturer(dq9Var.Q, dq9Var.R ? 1 : 0);
                    dq9Var.M();
                    dq9Var.I();
                    dq9Var.n();
                    jn7.f(dq9Var.e).k(177, Long.valueOf(dq9Var.f.id));
                    return;
                }
                return;
            case 2:
                icc iccVar = (icc) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (aob.I.o()) {
                    f4 = 0.04f;
                }
                hl.i(colorMatrix, f4);
                if (aob.I.o()) {
                    f = -0.04f;
                } else {
                    f = -0.07f;
                }
                hl.h(colorMatrix, f);
                Bitmap l = hl.l(bitmap, colorMatrix);
                l.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (aob.I.o()) {
                    f2 = 2.0f;
                } else {
                    f2 = 3.0f;
                }
                colorMatrix2.setSaturation(f2);
                if (!aob.I.o()) {
                    if (aob.I.o()) {
                        f3 = -0.2f;
                    }
                    hl.h(colorMatrix2, f3);
                }
                Bitmap l2 = hl.l(bitmap, colorMatrix2);
                l2.setHasAlpha(false);
                bitmap.recycle();
                iccVar.a(l, l2);
                return;
            case 3:
                r1a r1aVar = (r1a) obj2;
                Long l3 = (Long) obj;
                r1aVar.y2 = false;
                if (l3 != null) {
                    user = uc7.s1(r1aVar.a).X1(l3);
                }
                r1aVar.x2 = user;
                if (user == null) {
                    z = true;
                }
                r1aVar.z2 = z;
                if (user != null) {
                    r1aVar.c1();
                    return;
                }
                return;
            case 4:
                HashMap hashMap = ((n2a) obj2).r;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 5:
                z3a z3aVar = (z3a) obj;
                g4a g4aVar = ((d4a) obj2).e;
                while (true) {
                    ArrayList arrayList = g4aVar.H;
                    if (i < arrayList.size()) {
                        if (z3aVar != arrayList.get(i)) {
                            ((z3a) arrayList.get(i)).getClass();
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            case 6:
                ym0.j(((a5a) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 7:
                gra graVar = (gra) obj2;
                Integer num = (Integer) obj;
                graVar.d2.g();
                graVar.f2.O(true);
                return;
            case 8:
                hta htaVar = (hta) obj2;
                htaVar.s = new Matrix();
                htaVar.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                htaVar.r = bitmapShader;
                Paint paint = htaVar.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                hl.i(colorMatrix3, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 9:
                eva evaVar = (eva) obj2;
                Boolean bool = (Boolean) obj;
                boolean e = i86.e(131072);
                if (evaVar.e != e) {
                    evaVar.e = e;
                    evaVar.invalidate();
                    return;
                }
                return;
            case 10:
                ((jxa) obj2).T((TL_stars.StarGifts) obj);
                return;
            case 11:
                ((nx0) obj2).a(((Boolean) obj).booleanValue());
                return;
            case 12:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    boolean z2 = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i2 = starGift.availability_remains;
                    if (z2) {
                        if (i2 <= 0) {
                            concat = ob6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            concat = ob6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", starGift.availability_total));
                        }
                        textView.setText(concat);
                        return;
                    }
                    int i3 = starGift.availability_total;
                    if (i2 <= 0) {
                        K = ob6.H(',', "Gift2Availability2ValueNone", i3);
                    } else {
                        K = ob6.K("Gift2Availability4Value", i2, ',', ob6.E(i3, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 13:
                ((StickersActivity) obj2).p0((View) obj);
                return;
            case 14:
                b7b b7bVar = (b7b) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                b7bVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    b7bVar.m = true;
                    b7bVar.l = str;
                    b7bVar.f = TextUtils.isEmpty(str);
                    View view = b7bVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = b7bVar.s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                k8b k8bVar = (k8b) obj2;
                k8bVar.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                k8bVar.s = paint2;
                Bitmap bitmap2 = k8bVar.n;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
                k8bVar.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (aob.I.o()) {
                    f4 = 0.08f;
                }
                hl.i(colorMatrix4, f4);
                if (aob.I.o()) {
                    f3 = -0.02f;
                }
                hl.h(colorMatrix4, f3);
                k8bVar.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                k8bVar.w = new Matrix();
                return;
            case 16:
                r8b r8bVar = (r8b) obj2;
                g66 g66Var = (g66) obj;
                if (g66Var == null) {
                    r8bVar.a1();
                    return;
                }
                r8bVar.j2 = g66Var.e;
                r8bVar.i2 = g66Var.f;
                return;
            case 17:
                ((n9b) obj2).n.a0.B1 = ((Integer) obj).intValue();
                return;
            case 18:
                ((rab) obj2).h((pcc) obj);
                return;
            case 19:
                ueb uebVar = (ueb) obj2;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i4 = uebVar.a;
                TLRPC.UserFull Y1 = uc7.s1(i4).Y1(yac.h(i4).e());
                if (Y1 != null) {
                    tL_birthday = Y1.birthday;
                    Y1.flags2 |= 32;
                    Y1.birthday = tL_birthday2;
                    jf7.Y(i4).g2(Y1, false);
                }
                ConnectionsManager.getInstance(i4).sendRequest(updatebirthday, new qn8(uebVar, Y1, tL_birthday, (byte) 23), 1024);
                uc7.s1(i4).j2();
                uc7.s1(i4).v4(0L, "BIRTHDAY_SETUP");
                jn7.f(i4).k(108, new Object[0]);
                return;
            case 20:
                ((ThemeActivity) obj2).B0((TL_account.contentSettings) obj);
                return;
            case 21:
                ((ir1) obj2).F(((Integer) obj).intValue());
                return;
            case 22:
                ((tzb) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            case 23:
                q9c q9cVar = (q9c) obj2;
                q9cVar.g3.R(q9cVar.U((View) obj), q9cVar.k3);
                return;
            case 24:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((mkc) obj2).v(true);
                return;
            case 25:
                ((VoIPService) obj2).lambda$onStartCommand$1((Boolean) obj);
                return;
            case 26:
                ((snc) ((lyc) obj2).e).m(obj);
                return;
            case 27:
                hl.c3(new vlc((wsc) obj2, (TLRPC.UserFull) obj, (byte) 19));
                return;
            case 28:
                atc atcVar = (atc) obj2;
                if (((Integer) obj).intValue() == 0) {
                    b = 12;
                } else {
                    b = 24;
                }
                if (atcVar.a != b) {
                    atcVar.a = b;
                    atcVar.Y(atcVar.getParentActivity());
                    atcVar.c0();
                    p66 p66Var = atcVar.h;
                    if (atcVar.s != null) {
                        V = ob6.V(null, null, 2131742743, Integer.valueOf(b));
                    } else {
                        V = ob6.V(null, null, 2131742741, Integer.valueOf(b));
                    }
                    p66Var.setText(V);
                    return;
                }
                return;
            default:
                ixc ixcVar = (ixc) obj2;
                ixcVar.r = ((ArrayList) obj).size();
                wa waVar = ixcVar.a;
                if (waVar != null && (l9cVar = waVar.g3) != null && waVar.H) {
                    l9cVar.O(true);
                    return;
                }
                return;
        }
    }
}
