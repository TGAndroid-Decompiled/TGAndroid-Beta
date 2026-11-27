package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.SurfaceView;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
public final class oy6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public oy6(sp7 sp7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 13;
        this.b = sp7Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = arrayList3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy6.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy6.b():void");
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        no6 no6Var = (no6) this.c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (no6Var.g != null) {
            try {
                new File(no6Var.g).delete();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        no6Var.d = -1L;
        no6Var.g = str;
        no6Var.e = null;
        no6Var.f = null;
        photoViewer.p5.b.setLoading(false);
        ed8 ed8Var = photoViewer.d;
        if (ed8Var != null) {
            ed8Var.X(photoViewer.O4);
        }
        nb8 nb8Var = photoViewer.h1;
        if (nb8Var != null) {
            nb8Var.setImage(bitmap);
        }
        photoViewer.o2(0);
        CheckBox checkBox = photoViewer.O0;
        if (!checkBox.y) {
            checkBox.callOnClick();
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        no6 no6Var = (no6) this.d;
        String str = (String) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        Bitmap decodeFile = BitmapFactory.decodeFile(((no6) this.c).I);
        if (decodeFile == null) {
            hl.c3(new y98(photoViewer, (byte) 4));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(no6Var.I, iArr, 0L);
        int max = Math.max(iArr[1], no6Var.F);
        int max2 = Math.max(iArr[2], no6Var.G);
        if ((iArr[8] / 90) % 2 == 1) {
            max2 = max;
            max = max2;
        }
        float f = max;
        float f2 = max2;
        float max3 = Math.max(decodeFile.getWidth() / f, decodeFile.getHeight() / f2);
        int i = (int) (f2 * max3);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f * max3), i, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(hl.L(26.0f), hl.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            hl.c3(new oy6(photoViewer, no6Var, str, createBitmap2, (byte) 19));
        } catch (Exception e) {
            cc4.g(e, true);
            hl.c3(new y98(photoViewer, (byte) 5));
        }
    }

    private final void e() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        boolean[] zArr = (boolean[]) this.d;
        ra8 ra8Var = (ra8) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        ImageView imageView = photoViewer.x3;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            photoViewer.x3.setVisibility(0);
            SurfaceView surfaceView = photoViewer.D2;
            if (surfaceView != null) {
                surfaceView.setVisibility(4);
            }
            if (!zArr[0]) {
                zArr[0] = true;
                ra8Var.run();
            }
        }
    }

    private final void f() {
        TLObject tLObject = (TLObject) this.c;
        yac yacVar = (yac) this.d;
        TLRPC.Photo photo = (TLRPC.Photo) this.e;
        PhotoViewer photoViewer = ((gb8) this.b).b;
        if (tLObject instanceof TLRPC.TL_photos_photo) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            int i = photoViewer.U;
            ArrayList arrayList = photoViewer.e7;
            uc7.s1(i).j4(tL_photos_photo.users, false);
            TLRPC.User X1 = uc7.s1(photoViewer.U).X1(Long.valueOf(yacVar.n));
            if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_photos_photo.photo);
                }
                if (X1 != null) {
                    X1.photo.photo_id = tL_photos_photo.photo.id;
                    yacVar.v(X1);
                    yacVar.u(true);
                }
            }
        }
    }

    private final void g() {
        ((ij8) this.b).b0((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
    }

    private final void h() {
        mm8 mm8Var = (mm8) this.b;
        Bitmap[] bitmapArr = (Bitmap[]) this.c;
        c8b c8bVar = (c8b) this.d;
        boolean[] zArr = (boolean[]) this.e;
        tl0 tl0Var = mm8Var.H;
        Bitmap bitmap = mm8Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            mm8Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        mm8Var.a = bitmap2;
        if (c8bVar != null && !c8bVar.c && c8bVar.K && bitmap2 != null) {
            c8bVar.k0 = bitmap2.getWidth();
            c8bVar.l0 = mm8Var.a.getHeight();
            c8bVar.z();
        }
        if (zArr[0] && c8bVar != null && tl0Var != null && mm8Var.a != null) {
            tl0Var.e();
            tl0Var.f(c8bVar.b(0.2f, mm8Var.a), false);
            bab babVar = mm8Var.w;
            if (babVar != null) {
                babVar.run();
            }
        }
        mm8Var.r();
        mm8Var.invalidate();
    }

    private final void i() {
        ((PrivacyControlActivity) this.b).D0((TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
    }

    private final void j() {
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
        id idVar = (id) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
        privacySettingsActivity.getClass();
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            privacySettingsActivity.R = true;
            privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
            privacySettingsActivity.a.f();
        }
    }

    private final void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        RectF rectF = ProfileActivity.Z6;
        if (!hl.C1(profileActivity.getParentActivity())) {
            return;
        }
        r3c.R0(profileActivity.getParentActivity(), profileActivity, strArr[0], str, str2, new p12(profileActivity, (byte) 6), null);
    }

    private final void l() {
        TLObject M0;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        RectF rectF = ProfileActivity.Z6;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            if (profileActivity.e1 != 0) {
                M0 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
            } else {
                M0 = profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1));
            }
            br4.a(profileActivity.getParentActivity(), 0, tL_username.username, M0, (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.A0);
            return;
        }
        d31.e0(tL_error);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy6.run():void");
    }

    public oy6(uc7 uc7Var, ArrayList arrayList, TLRPC.updates_Difference updates_difference, zh6 zh6Var) {
        this.a = (byte) 6;
        this.b = uc7Var;
        this.d = arrayList;
        this.c = updates_difference;
        this.e = zh6Var;
    }

    public oy6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
