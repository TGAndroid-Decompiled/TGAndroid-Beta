package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class jy6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public jy6(wo7 wo7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 13;
        this.b = wo7Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = arrayList3;
    }

    private final void a() {
        oc7 oc7Var = (oc7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
        vh6 vh6Var = (vh6) this.e;
        if (!arrayList.isEmpty()) {
            gm.c3(new fp6(oc7Var, arrayList, updates_difference, (byte) 24));
        }
        oc7Var.getMessagesStorage().g1(updates_difference.new_messages, true, false, false, oc7Var.getDownloadController().l(), false, 0, 0L);
        for (int i = 0; i < vh6Var.m(); i++) {
            long j = vh6Var.j(i);
            ArrayList arrayList2 = (ArrayList) vh6Var.n(i);
            oc7Var.getMediaDataController().Y0(arrayList2, j, 0, 0L, new m77(oc7Var, j, arrayList2, (byte) 4), 0, null);
        }
    }

    private final void b() {
        ArrayList arrayList;
        hs6 hs6Var;
        ArrayList arrayList2;
        oc7 oc7Var = (oc7) this.b;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
        vh6 vh6Var = (vh6) this.d;
        vh6 vh6Var2 = (vh6) this.e;
        SparseBooleanArray sparseBooleanArray = oc7Var.V1;
        SparseBooleanArray sparseBooleanArray2 = oc7Var.U1;
        vh6 vh6Var3 = oc7Var.T;
        SparseArray sparseArray = oc7Var.V;
        vh6 vh6Var4 = oc7Var.S;
        vh6 vh6Var5 = oc7Var.R;
        ArrayList arrayList3 = oc7Var.y;
        oc7Var.e2 = false;
        oc7Var.n(messages_dialogs.dialogs);
        hs6 mediaDataController = oc7Var.getMediaDataController();
        mediaDataController.G(false);
        mediaDataController.L0();
        oc7Var.d4(messages_dialogs.users, false);
        oc7Var.X3(messages_dialogs.chats, false);
        int i = 0;
        while (i < arrayList3.size()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList3.get(i);
            if (!pg3.B(dialog.id)) {
                vh6Var5.l(dialog.id);
                ArrayList arrayList4 = (ArrayList) vh6Var4.f(dialog.id);
                vh6Var4.l(dialog.id);
                if (arrayList4 != null) {
                    int i2 = 0;
                    while (i2 < arrayList4.size()) {
                        k47 k47Var = (k47) arrayList4.get(i2);
                        if (k47Var != null) {
                            hs6Var = mediaDataController;
                            arrayList2 = arrayList4;
                            if (k47Var.k.peer_id.channel_id == 0) {
                                sparseArray.remove(k47Var.e1());
                            }
                            long j = k47Var.k.random_id;
                            if (j != 0) {
                                vh6Var3.l(j);
                            }
                        } else {
                            hs6Var = mediaDataController;
                            arrayList2 = arrayList4;
                        }
                        i2++;
                        mediaDataController = hs6Var;
                        arrayList4 = arrayList2;
                    }
                }
            }
            i++;
            mediaDataController = mediaDataController;
        }
        int i3 = 0;
        while (true) {
            hs6 hs6Var2 = mediaDataController;
            if (i3 >= vh6Var.m()) {
                break;
            }
            long j2 = vh6Var.j(i3);
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var.n(i3);
            long j3 = dialog2.id;
            int i4 = i3;
            TLRPC.DraftMessage draftMessage = dialog2.draft;
            mediaDataController = hs6Var2;
            mediaDataController.B1(j3, 0L, draftMessage);
            TLRPC.DraftMessage draftMessage2 = dialog2.draft;
            if (draftMessage2 instanceof TLRPC.TL_draftMessage) {
                mediaDataController.U1(dialog2.id, 0L, draftMessage2, null, false);
            }
            vh6Var5.k(dialog2, j2);
            ArrayList arrayList5 = (ArrayList) vh6Var2.f(dialog2.id);
            vh6Var4.k(arrayList5, j2);
            if (arrayList5 != null) {
                int i5 = 0;
                while (i5 < arrayList5.size()) {
                    k47 k47Var2 = (k47) arrayList5.get(i5);
                    vh6 vh6Var6 = vh6Var2;
                    if (k47Var2 != null) {
                        arrayList = arrayList5;
                        if (k47Var2.k.peer_id.channel_id == 0) {
                            sparseArray.put(k47Var2.e1(), k47Var2);
                            oc7Var.O = Math.min(oc7Var.O, k47Var2.k.date);
                            long j4 = k47Var2.k.random_id;
                            if (j4 != 0) {
                                vh6Var3.k(k47Var2, j4);
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    i5++;
                    vh6Var2 = vh6Var6;
                    arrayList5 = arrayList;
                }
            }
            oc7Var.i4.c(j2);
            i3 = i4 + 1;
            vh6Var2 = vh6Var2;
        }
        arrayList3.clear();
        int m = vh6Var5.m();
        for (int i6 = 0; i6 < m; i6++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var5.n(i6);
            if (oc7Var.u0.h(dialog3.id) < 0) {
                arrayList3.add(dialog3);
            }
        }
        oc7Var.b5(null);
        sparseBooleanArray2.put(0, true);
        sparseBooleanArray.put(0, false);
        sparseBooleanArray2.put(1, true);
        sparseBooleanArray.put(1, false);
        int m2 = oc7Var.getUserConfig().m(0);
        long[] g = oc7Var.getUserConfig().g(0);
        if (m2 < 400) {
            long j5 = g[0];
            if (j5 != -1 && j5 != 2147483647L) {
                oc7Var.Z2(0, 0, 100, false, null);
            }
        }
        oc7Var.getNotificationCenter().k(nm7.r, new Object[0]);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy6.c():void");
    }

    private final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy6.d():void");
    }

    private final void e() {
        SQLitePreparedStatement executeFast;
        cf7 cf7Var = (cf7) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                if (document != null) {
                    executeFast = sQLiteDatabase.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindString(2, str);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    executeFast = sQLiteDatabase.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    executeFast.requery();
                    executeFast.bindString(1, str2);
                    executeFast.bindString(2, str);
                    executeFast.step();
                    executeFast.dispose();
                }
                executeFast.dispose();
            } catch (Exception e) {
                cf7Var.n(e, true);
                if (0 != 0) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private final void f() {
        ((NativeInstance) this.b).lambda$onAudioLevelsUpdated$1((int[]) this.c, (float[]) this.d, (boolean[]) this.e);
    }

    private final void g() {
        wo7 wo7Var = (wo7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.c;
        bu9 bu9Var = wo7Var.h;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = wo7Var.n;
        if (!notificationsCustomSettingsActivity.f) {
            return;
        }
        wo7Var.f = null;
        wo7Var.d = arrayList;
        wo7Var.e = arrayList2;
        bu9Var.f(arrayList3, null);
        if (notificationsCustomSettingsActivity.f && !bu9Var.e()) {
            notificationsCustomSettingsActivity.c.c();
        }
        wo7Var.f();
    }

    private final void h() {
        boolean z;
        boolean z2;
        String str;
        TLRPC.Chat L0;
        int i;
        int i2;
        String M0;
        boolean z3;
        String a0;
        u31 Q;
        String str2;
        w18 w18Var;
        w18 w18Var2;
        p pVar = (p) this.b;
        TLRPC.Message message = (TLRPC.Message) this.e;
        pVar.b1 = true;
        pVar.g1 = 1;
        pVar.B0((tk5) this.c, (Activity) this.d);
        TLRPC.InputInvoice inputInvoice = pVar.c1;
        boolean z4 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        if (z4 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
            z = true;
        } else {
            z = false;
        }
        if (z4 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z4 && (w18Var2 = pVar.a1) != null) {
            w18Var2.c(pVar.g1);
        }
        pVar.i0();
        if (z4 && (w18Var = pVar.a1) != null) {
            w18Var.c(pVar.g1);
        }
        long f0 = pVar.f0();
        int i3 = (f0 > 0L ? 1 : (f0 == 0L ? 0 : -1));
        if (i3 > 0) {
            str = m9c.l(pVar.getMessagesController().W1(Long.valueOf(f0)));
        } else {
            str = "";
            if (i3 < 0 && (L0 = pVar.getMessagesController().L0(Long.valueOf(-f0))) != null) {
                str = L0.title;
            }
        }
        long e0 = pVar.e0();
        if (z4) {
            if (!z && !z2) {
                i = 2131624221;
            } else {
                i = 2131624220;
            }
        } else {
            i = 2131624115;
        }
        int i4 = i;
        if (!z4) {
            M0 = null;
        } else {
            if (z2) {
                i2 = 2131744781;
            } else if (z) {
                i2 = 2131744789;
            } else {
                i2 = 2131744848;
            }
            M0 = jb6.M0(i2, null);
        }
        if (z4) {
            if (z2) {
                a0 = jb6.H(',', "StarsGiveawaySentPopupInfo", (int) e0);
                z3 = false;
            } else {
                if (z) {
                    str2 = "StarsGiftSentPopupInfo";
                } else {
                    str2 = "StarsAcquiredInfo";
                }
                z3 = false;
                a0 = jb6.K(str2, (int) e0, ',', str);
            }
        } else {
            z3 = false;
            a0 = jb6.a0(null, null, 2131747134, pVar.S0[0], pVar.r0);
        }
        SpannableStringBuilder S2 = gm.S2(a0);
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        c41 b0 = c41.b0(S);
        if (i3 != 0 && M0 != null && !z2) {
            Q = b0.L(i4, M0, S2, jb6.M0(2131743236, null), new pz6((byte) 2, f0));
        } else {
            String str3 = M0;
            if (str3 != null) {
                Q = b0.I(i4, str3, S2);
            } else {
                Q = b0.Q(i4, 36, S2);
            }
        }
        u31 u31Var = Q;
        u31Var.s = z3;
        u31Var.j = 5000;
        if (message != null) {
            x73 x73Var = new x73(pVar, u31Var, z, message, (byte) 3);
            y21 y21Var = u31Var.e;
            if (y21Var != null) {
                y21Var.setOnClickListener(x73Var);
            }
        }
        u31Var.k(z2);
    }

    private final void i() {
        ((p) this.b).l0((TLObject) this.c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.e);
    }

    private final void j() {
        TLObject tLObject = (TLObject) this.c;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        qac qacVar = (qac) this.e;
        a58 a58Var = ((v48) this.b).x;
        if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            oc7.r1(a58Var.s2).d4(tL_stories_stories.users, false);
            oc7.r1(a58Var.s2).X3(tL_stories_stories.chats, false);
            for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                if (tL_stories_stories.stories.get(i).id == storyItem.id) {
                    qacVar.a(tL_stories_stories.stories.get(i).media.document);
                    return;
                }
            }
        }
        qacVar.a(null);
    }

    private final void k() {
        long j;
        g6b g6bVar;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        nab nabVar;
        v48 v48Var = (v48) this.b;
        oab oabVar = (oab) this.d;
        y48 y48Var = (y48) this.e;
        v9b C = v9b.C((Activity) this.c, v48Var.x.s2);
        c40 c40Var = v48Var.x.C2;
        if (c40Var != null && (nabVar = (nab) c40Var.c) != null) {
            j = nabVar.currentPosition;
        } else {
            j = 0;
        }
        tr3 tr3Var = oc7.r1(v48Var.x.s2).N1().w;
        TL_stories.StoryItem storyItem2 = v48Var.x.E1.a;
        long j2 = storyItem2.dialogId;
        ArrayList arrayList2 = tr3Var.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            g6bVar = (g6b) obj;
            if (g6bVar.g && storyItem2.id == g6bVar.f && j2 == g6bVar.e) {
                TLRPC.MessageMedia messageMedia = storyItem2.media;
                TLRPC.Document document = messageMedia.document;
                arrayList = arrayList2;
                storyItem = storyItem2;
                if ((document == null || document.id == g6bVar.H) && ((photo = messageMedia.photo) == null || photo.id == g6bVar.I)) {
                    g6bVar.h = true;
                    break;
                }
            } else {
                arrayList = arrayList2;
                storyItem = storyItem2;
            }
            storyItem2 = storyItem;
            arrayList2 = arrayList;
        }
        g6bVar = null;
        if (g6bVar == null || g6bVar.u || (file = g6bVar.L) == null || !file.exists()) {
            g6bVar = g6b.n(v48Var.x.E1.f(), v48Var.x.E1.a);
            g6bVar.e = v48Var.x.r1;
        }
        g6b g = g6bVar.g();
        if (v48Var.x.A0()) {
            a58 a58Var = v48Var.x;
            g.J0 = a58Var.r1;
            g.L0 = oc7.h5(a58Var.E1.a.media);
            z3b z3bVar = oabVar.O0;
            if (z3bVar instanceof t3b) {
                g.K0 = ((t3b) z3bVar).E;
            }
        }
        C.R(q9b.d(oabVar), g, j);
        C.R = new p48(v48Var, (byte) 3);
        C.S = new r48(v48Var, y48Var, (byte) 1);
    }

    private final void l() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jo6 jo6Var = (jo6) this.d;
        String str = (String) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        Bitmap decodeFile = BitmapFactory.decodeFile(((jo6) this.c).I);
        if (decodeFile == null) {
            gm.c3(new n88(photoViewer, (byte) 5));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(jo6Var.I, iArr, 0L);
        int max = Math.max(iArr[1], jo6Var.F);
        int max2 = Math.max(iArr[2], jo6Var.G);
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
            Bitmap createBitmap2 = Bitmap.createBitmap(gm.L(26.0f), gm.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            gm.c3(new jy6(photoViewer, jo6Var, str, createBitmap2, (byte) 20));
        } catch (Exception e) {
            fc4.g(e, true);
            gm.c3(new n88(photoViewer, (byte) 6));
        }
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        boolean[] zArr = (boolean[]) this.d;
        j88 j88Var = (j88) this.e;
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
                j88Var.run();
            }
        }
    }

    private final void n() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jo6 jo6Var = (jo6) this.c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (jo6Var.g != null) {
            try {
                new File(jo6Var.g).delete();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        jo6Var.d = -1L;
        jo6Var.g = str;
        jo6Var.e = null;
        jo6Var.f = null;
        photoViewer.p5.b.setLoading(false);
        pb8 pb8Var = photoViewer.d;
        if (pb8Var != null) {
            pb8Var.Y(photoViewer.O4);
        }
        y98 y98Var = photoViewer.h1;
        if (y98Var != null) {
            y98Var.setImage(bitmap);
        }
        photoViewer.o2(0);
        CheckBox checkBox = photoViewer.O0;
        if (!checkBox.y) {
            checkBox.callOnClick();
        }
    }

    private final void o() {
        TLObject tLObject = (TLObject) this.c;
        z8c z8cVar = (z8c) this.d;
        TLRPC.Photo photo = (TLRPC.Photo) this.e;
        PhotoViewer photoViewer = ((r98) this.b).b;
        if (tLObject instanceof TLRPC.TL_photos_photo) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            int i = photoViewer.U;
            ArrayList arrayList = photoViewer.e7;
            oc7.r1(i).d4(tL_photos_photo.users, false);
            TLRPC.User W1 = oc7.r1(photoViewer.U).W1(Long.valueOf(z8cVar.n));
            if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_photos_photo.photo);
                }
                if (W1 != null) {
                    W1.photo.photo_id = tL_photos_photo.photo.id;
                    z8cVar.v(W1);
                    z8cVar.u(true);
                }
            }
        }
    }

    private final void p() {
        ((wh8) this.b).c0((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
    }

    private final void q() {
        cl8 cl8Var = (cl8) this.b;
        Bitmap[] bitmapArr = (Bitmap[]) this.c;
        g6b g6bVar = (g6b) this.d;
        boolean[] zArr = (boolean[]) this.e;
        sm0 sm0Var = cl8Var.H;
        Bitmap bitmap = cl8Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            cl8Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        cl8Var.a = bitmap2;
        if (g6bVar != null && !g6bVar.c && g6bVar.K && bitmap2 != null) {
            g6bVar.k0 = bitmap2.getWidth();
            g6bVar.l0 = cl8Var.a.getHeight();
            g6bVar.z();
        }
        if (zArr[0] && g6bVar != null && sm0Var != null && cl8Var.a != null) {
            sm0Var.e();
            sm0Var.f(g6bVar.b(0.2f, cl8Var.a), false);
            f8b f8bVar = cl8Var.w;
            if (f8bVar != null) {
                f8bVar.run();
            }
        }
        cl8Var.r();
        cl8Var.invalidate();
    }

    private final void r() {
        ((PrivacyControlActivity) this.b).D0((TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
    }

    private final void s() {
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
        he heVar = (he) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
        privacySettingsActivity.getClass();
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            privacySettingsActivity.R = true;
            privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
            privacySettingsActivity.a.f();
        }
    }

    private final void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.e;
        RectF rectF = ProfileActivity.e7;
        if (!(((TLObject) this.c) instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            c41.b0(profileActivity).g0(tL_error, false);
        }
        if (profileActivity.w4 == iArr[0]) {
            profileActivity.w4 = 0;
        }
    }

    private final void u() {
        TLObject L0;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        RectF rectF = ProfileActivity.e7;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            if (profileActivity.e1 != 0) {
                L0 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
            } else {
                L0 = profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f1));
            }
            yq4.a(profileActivity.getParentActivity(), 0, tL_username.username, L0, (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.A0);
            return;
        }
        c41.e0(tL_error);
    }

    private final void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        RectF rectF = ProfileActivity.e7;
        if (!gm.C1(profileActivity.getParentActivity())) {
            return;
        }
        s1c.Q0(profileActivity.getParentActivity(), profileActivity, strArr[0], str, str2, new k22(profileActivity, (byte) 6), null);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy6.run():void");
    }

    public jy6(oc7 oc7Var, ArrayList arrayList, TLRPC.updates_Difference updates_difference, vh6 vh6Var) {
        this.a = (byte) 7;
        this.b = oc7Var;
        this.d = arrayList;
        this.c = updates_difference;
        this.e = vh6Var;
    }

    public jy6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
