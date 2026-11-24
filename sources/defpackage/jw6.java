package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
public final class jw6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public jw6(sm7 sm7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 13;
        this.b = sm7Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = arrayList3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw6.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw6.b():void");
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jm6 jm6Var = (jm6) this.d;
        String str = (String) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        Bitmap decodeFile = BitmapFactory.decodeFile(((jm6) this.c).I);
        if (decodeFile == null) {
            gl.c3(new l68(photoViewer, (byte) 5));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(jm6Var.I, iArr, 0L);
        int max = Math.max(iArr[1], jm6Var.F);
        int max2 = Math.max(iArr[2], jm6Var.G);
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
            Bitmap createBitmap2 = Bitmap.createBitmap(gl.L(26.0f), gl.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            gl.c3(new jw6(photoViewer, jm6Var, str, createBitmap2, (byte) 20));
        } catch (Exception e) {
            fa4.g(e, true);
            gl.c3(new l68(photoViewer, (byte) 6));
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jm6 jm6Var = (jm6) this.c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (jm6Var.g != null) {
            try {
                new File(jm6Var.g).delete();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        jm6Var.d = -1L;
        jm6Var.g = str;
        jm6Var.e = null;
        jm6Var.f = null;
        photoViewer.p5.b.setLoading(false);
        o98 o98Var = photoViewer.d;
        if (o98Var != null) {
            o98Var.X(photoViewer.O4);
        }
        v78 v78Var = photoViewer.h1;
        if (v78Var != null) {
            v78Var.setImage(bitmap);
        }
        photoViewer.o2(0);
        CheckBox checkBox = photoViewer.O0;
        if (!checkBox.y) {
            checkBox.callOnClick();
        }
    }

    private final void e() {
        TLObject tLObject = (TLObject) this.c;
        y6c y6cVar = (y6c) this.d;
        TLRPC.Photo photo = (TLRPC.Photo) this.e;
        PhotoViewer photoViewer = ((o78) this.b).b;
        if (tLObject instanceof TLRPC.TL_photos_photo) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            int i = photoViewer.U;
            ArrayList arrayList = photoViewer.e7;
            na7.q1(i).b4(tL_photos_photo.users, false);
            TLRPC.User V1 = na7.q1(photoViewer.U).V1(Long.valueOf(y6cVar.n));
            if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_photos_photo.photo);
                }
                if (V1 != null) {
                    V1.photo.photo_id = tL_photos_photo.photo.id;
                    y6cVar.v(V1);
                    y6cVar.u(true);
                }
            }
        }
    }

    private final void f() {
        ((uf8) this.b).b0((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
    }

    private final void g() {
        zi8 zi8Var = (zi8) this.b;
        Bitmap[] bitmapArr = (Bitmap[]) this.c;
        f4b f4bVar = (f4b) this.d;
        boolean[] zArr = (boolean[]) this.e;
        sl0 sl0Var = zi8Var.H;
        Bitmap bitmap = zi8Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            zi8Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        zi8Var.a = bitmap2;
        if (f4bVar != null && !f4bVar.c && f4bVar.K && bitmap2 != null) {
            f4bVar.k0 = bitmap2.getWidth();
            f4bVar.l0 = zi8Var.a.getHeight();
            f4bVar.z();
        }
        if (zArr[0] && f4bVar != null && sl0Var != null && zi8Var.a != null) {
            sl0Var.e();
            sl0Var.f(f4bVar.b(0.2f, zi8Var.a), false);
            d6b d6bVar = zi8Var.w;
            if (d6bVar != null) {
                d6bVar.run();
            }
        }
        zi8Var.r();
        zi8Var.invalidate();
    }

    private final void h() {
        ((PrivacyControlActivity) this.b).C0((TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
    }

    private final void i() {
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
        hd hdVar = (hd) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
        privacySettingsActivity.getClass();
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            privacySettingsActivity.R = true;
            privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
            privacySettingsActivity.a.f();
        }
    }

    private final void j() {
        Uri fromFile;
        hd hdVar = (hd) this.b;
        boolean[] zArr = (boolean[]) this.c;
        Activity activity = (Activity) this.d;
        File file = (File) this.e;
        RectF rectF = ProfileActivity.Z6;
        try {
            hdVar.dismiss();
        } catch (Exception unused) {
        }
        if (zArr[0]) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                a.d();
                fromFile = FileProvider.c(activity, "org.telegram.messenger.beta.provider", file);
            } else {
                fromFile = Uri.fromFile(file);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (i >= 24) {
                intent.addFlags(1);
            }
            intent.setType("message/rfc822");
            intent.putExtra("android.intent.extra.EMAIL", "");
            intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + k96.D0().y0().format(System.currentTimeMillis()));
            intent.putExtra("android.intent.extra.STREAM", fromFile);
            if (activity != null) {
                try {
                    activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } else if (activity != null) {
            Toast.makeText(activity, k96.M0(2131751093, null), 0).show();
        }
    }

    private final void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.e;
        RectF rectF = ProfileActivity.Z6;
        if (!(((TLObject) this.c) instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            u21.b0(profileActivity).g0(tL_error, false);
        }
        if (profileActivity.r4 == iArr[0]) {
            profileActivity.r4 = 0;
        }
    }

    private final void l() {
        RectF rectF = ProfileActivity.Z6;
        ((ProfileActivity) this.b).A2((TLRPC.TL_error) this.c, (TLObject) this.d, (String) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw6.run():void");
    }

    public jw6(na7 na7Var, ArrayList arrayList, TLRPC.updates_Difference updates_difference, vf6 vf6Var) {
        this.a = (byte) 7;
        this.b = na7Var;
        this.d = arrayList;
        this.c = updates_difference;
        this.e = vf6Var;
    }

    public jw6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
