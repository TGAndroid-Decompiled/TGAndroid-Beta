package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Dictation.DictationAsr;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class r1b implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public r1b(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        k27 k27Var;
        int e1;
        boolean contains;
        int i;
        TLRPC.Message message;
        int i2;
        bu1 bu1Var = null;
        bu1Var = null;
        bu1Var = null;
        r7 = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                q1b q1bVar = (q1b) this.c;
                ht htVar = (ht) this.d;
                ArrayList arrayList = ((s1b) this.b).i;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    k27 k27Var2 = (k27) arrayList.get(i3);
                    if (k27Var2 != null && (storyItem = k27Var2.l) != null && (messageMedia = storyItem.media) != null) {
                        TLRPC.MessageMedia messageMedia2 = q1bVar.media;
                        TLRPC.Document document = messageMedia2.document;
                        if (document != null) {
                            TLRPC.Document document2 = messageMedia.document;
                            if (document2 == null) {
                                continue;
                            } else if (document2.id == document.id) {
                                htVar.a((q1b) storyItem);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia2.photo;
                        if (photo2 != null && (photo = messageMedia.photo) != null && photo.id == photo2.id) {
                            htVar.a((q1b) storyItem);
                            return;
                        }
                    }
                }
                htVar.a(null);
                return;
            case 1:
                s1b s1bVar = (s1b) this.b;
                TLObject tLObject = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                v1b v1bVar = s1bVar.q;
                ArrayList arrayList2 = s1bVar.G;
                ArrayList arrayList3 = s1bVar.i;
                ArrayList arrayList4 = s1bVar.H;
                s1bVar.F = 0;
                s1bVar.C = false;
                s1bVar.D = true;
                s1bVar.r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size = arrayList6.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList6.get(i4);
                        i4++;
                        arrayList5.add((TL_bots.botPreviewMedia) obj);
                    }
                } else if (tLObject instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject;
                    arrayList2.clear();
                    arrayList2.addAll(previewinfo.lang_codes);
                    arrayList5.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList7 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList4.clear();
                int size2 = arrayList5.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList5.get(i5);
                    i5++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList8 = arrayList5;
                    k27 k27Var3 = new k27(s1bVar.c, new q1b(s1bVar, s1bVar.d, botpreviewmedia));
                    int i6 = 0;
                    while (true) {
                        if (i6 < arrayList7.size()) {
                            if (na7.q0(((k27) arrayList7.get(i6)).l.media, botpreviewmedia.media)) {
                                k27Var = (k27) arrayList7.get(i6);
                            } else {
                                i6++;
                            }
                        } else {
                            k27Var = null;
                        }
                    }
                    TL_stories.StoryItem storyItem2 = k27Var3.l;
                    TLRPC.Message message2 = k27Var3.k;
                    if (k27Var == null) {
                        e1 = s1bVar.I;
                        s1bVar.I = e1 + 1;
                    } else {
                        e1 = k27Var.e1();
                    }
                    message2.id = e1;
                    storyItem2.id = e1;
                    k27Var3.j = s1bVar;
                    k27Var3.r0(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(k27Var3.e1()));
                    arrayList3.add(k27Var3);
                    arrayList5 = arrayList8;
                }
                gl.r(v1bVar);
                gl.d3(v1bVar);
                if (runnable != null) {
                    gl.d3(runnable);
                    return;
                }
                return;
            case 2:
                u3b u3bVar = (u3b) this.b;
                vl3 vl3Var = (vl3) this.c;
                long[] jArr = (long[]) this.d;
                if (u3bVar.t != null && u3bVar.x != null) {
                    vl3[] vl3VarArr = DictationAsr.a;
                    if (vl3Var != null && vl3Var.j) {
                        DictationAsr.J(jArr);
                        u3bVar.t.d(jArr[0], jArr[1], true);
                        return;
                    } else if (DictationAsr.y(vl3Var)) {
                        u3bVar.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                String[] strArr = (String[]) this.b;
                int[][] iArr = (int[][]) this.c;
                exa exaVar = (exa) this.d;
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    String str = strArr[i7];
                    if (str != null) {
                        AnimatedFileNative.d(str, iArr[i7], 0L);
                    }
                }
                gl.d3(exaVar);
                return;
            case 4:
                AnimatedFileNative.d((String) this.b, ((int[][]) this.c)[0], 0L);
                gl.d3((exa) this.d);
                return;
            case 5:
                t5b t5bVar = (t5b) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                na7 na7Var = (na7) this.d;
                y5b y5bVar = t5bVar.a0;
                t5bVar.w.setLoading(false);
                if (tLObject2 != null) {
                    int i8 = y5b.X1;
                    ArrayList I0 = y5bVar.I0();
                    for (int i9 = 0; i9 < I0.size(); i9++) {
                        TLRPC.User user = (TLRPC.User) I0.get(i9);
                        if (user != null && (contains = t5bVar.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            int i10 = user.flags2;
                            if (contains) {
                                i = i10 | 4;
                            } else {
                                i = i10 & (-5);
                            }
                            user.flags2 = i;
                            na7Var.Z3(user, false, false);
                        }
                    }
                }
                y5bVar.F0();
                if (y5bVar.T1) {
                    y5bVar.G0(new w5b(1, y5bVar.a, (ArrayList) null), new p28(y5bVar, (byte) 1), false);
                    return;
                }
                y5bVar.F0();
                y5bVar.l1.E(0);
                return;
            case 6:
                ((f4b) this.c).O0 = (File) this.d;
                p6b p6bVar = ((t7b) this.b).e1;
                if (p6bVar != null) {
                    p6bVar.b.g3.O(false);
                    return;
                }
                return;
            case 7:
                t7b t7bVar = (t7b) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), t7bVar.C0.getMatrix(), true);
                        bitmap.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(a.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                gl.d3(runnable2);
                return;
            case 8:
                m8b m8bVar = ((d8b) this.b).d;
                m8bVar.o0.D(m8bVar.h, ((y1b) this.c).d, (ArrayList) this.d);
                return;
            case 9:
                ((MediaBrowserService.Result) ((im6) this.c).b).sendResult(((hgb) this.b).d((String) this.d));
                return;
            case 10:
                ((ggb) this.b).q((String) this.c, (Bundle) this.d);
                return;
            case 11:
                akb akbVar = (akb) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                akb akbVar2 = (akb) this.d;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    akbVar.h0 = ba4.r(null, tL_wallPaper.document);
                    kk7.f(akbVar.F).a(akbVar, 142);
                    kk7.f(akbVar.F).a(akbVar, 143);
                    ba4.G(akbVar2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                akbVar.r();
                return;
            case 12:
                ((ymb) this.b).b0((TLRPC.TL_error) this.c, (TL_account.updateTheme) this.d);
                return;
            case 13:
                ymb ymbVar = (ymb) this.b;
                String str2 = (String) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ymbVar.y = 0;
                String str3 = ymbVar.E;
                if (str3 != null && str3.equals(str2)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ymbVar.e0(bkb.o7, k96.M0(2131745314, null));
                        return;
                    } else {
                        ymbVar.e0(bkb.v6, k96.a0("SetUrlAvailable", null, 2131745316, str2));
                        return;
                    }
                }
                return;
            case 14:
                akb akbVar3 = (akb) this.c;
                akbVar3.f = !akbVar3.b((File) this.d, akbVar3.c);
                gl.d3(new a5b((f) this.b, akbVar3, (byte) 12));
                return;
            case 15:
                wob wobVar = (wob) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList9 = wobVar.d;
                if (tLObject4 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList9.clear();
                    arrayList9.addAll(((TLRPC.TL_help_timezonesList) tLObject4).timezones);
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    kk7.f(wobVar.a).k(216, new Object[0]);
                }
                wobVar.c = true;
                wobVar.b = false;
                return;
            case 16:
                jpb jpbVar = (jpb) this.b;
                mu1 mu1Var = (mu1) this.c;
                k27 k27Var4 = jpbVar.H;
                int i11 = ((TLRPC.TodoItem) this.d).id;
                if (k27Var4 != null && (message = k27Var4.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    k27.B0(message);
                    ?? obj3 = new Object();
                    obj3.a = k27Var4;
                    obj3.b = -1;
                    obj3.c = -1;
                    obj3.g = true;
                    obj3.d = i11;
                    obj3.f();
                    bu1Var = obj3;
                }
                mu1Var.Qb(k27Var4, bu1Var);
                jpbVar.b(false);
                return;
            case 17:
                zsb zsbVar = (zsb) this.b;
                ArrayList arrayList10 = zsbVar.h;
                arrayList10.clear();
                ArrayList arrayList11 = zsbVar.f;
                arrayList11.clear();
                arrayList10.addAll((ArrayList) this.c);
                arrayList11.addAll(((TLRPC.TL_messages_inactiveChats) this.d).chats);
                zsbVar.d.f();
                if (zsbVar.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zsbVar.E = ofFloat;
                    ofFloat.addUpdateListener(new gja(zsbVar, (byte) 25));
                    zsbVar.E.setDuration(100L);
                    zsbVar.E.start();
                } else {
                    zsbVar.F = 1.0f;
                }
                gl.r(zsbVar.J);
                if (zsbVar.G.getVisibility() == 0) {
                    zsbVar.G.animate().alpha(0.0f).setListener(new vsb(zsbVar, (byte) 2)).start();
                    return;
                }
                return;
            case 18:
                qvb qvbVar = (qvb) this.b;
                qvbVar.s.d((ArrayList) this.c, qvbVar.a);
                ((Runnable) this.d).run();
                return;
            case 19:
                mvb mvbVar = (mvb) this.b;
                String str4 = (String) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                ArrayList arrayList12 = mvbVar.g0;
                if (str4.equals(mvbVar.e0)) {
                    int i12 = mvbVar.n0;
                    mvbVar.s0 = false;
                    mvbVar.o0 = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject5;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            k27 k27Var5 = new k27(qvb.v0(mvbVar.w0), messages_messages.messages.get(i13), false, false);
                            k27Var5.J5(str4, true);
                            arrayList12.add(k27Var5);
                        }
                        mvbVar.N();
                        if (arrayList12.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z = true;
                        }
                        mvbVar.p0 = z;
                    } else {
                        mvbVar.p0 = false;
                    }
                    if (mvbVar.n0 == 0) {
                        mvbVar.q0.e(mvbVar.o0, true);
                    }
                    mvbVar.r0.b(i12);
                    return;
                }
                return;
            case 20:
                b1c b1cVar = (b1c) this.b;
                TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) this.c;
                storyItem3.detectedLng = "und";
                b1cVar.getMessagesController().M1().k.h(storyItem3.dialogId, storyItem3);
                b1cVar.J.remove((z0c) this.d);
                return;
            case 21:
                c2c c2cVar = (c2c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                SparseArray sparseArray = c2cVar.f;
                ArrayList arrayList13 = c2cVar.e;
                ArrayList arrayList14 = c2cVar.n;
                SparseArray sparseArray2 = c2cVar.d;
                c2cVar.r = false;
                if (tL_error2 == null && (tLObject6 instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList15 = ((TLRPC.TL_messages_featuredStickers) tLObject6).sets;
                    if (arrayList15.size() < 40) {
                        c2cVar.s = true;
                    }
                    if (!arrayList15.isEmpty()) {
                        if (arrayList14.isEmpty()) {
                            int i14 = c2cVar.x;
                            c2cVar.x = i14 + 1;
                            sparseArray2.put(i14, -1);
                        }
                        arrayList14.addAll(arrayList15);
                        int size3 = arrayList13.size();
                        for (int i15 = 0; i15 < arrayList15.size(); i15++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList15.get(i15);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList13.add(stickerSetCovered);
                                sparseArray.put(c2cVar.x, stickerSetCovered);
                                int i16 = c2cVar.x;
                                c2cVar.x = i16 + 1;
                                int i17 = size3 + 1;
                                sparseArray2.put(i16, Integer.valueOf(size3));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i2 = (int) Math.ceil(stickerSetCovered.covers.size() / c2cVar.w);
                                    for (int i18 = 0; i18 < stickerSetCovered.covers.size(); i18++) {
                                        sparseArray2.put(c2cVar.x + i18, stickerSetCovered.covers.get(i18));
                                    }
                                } else {
                                    sparseArray2.put(c2cVar.x, stickerSetCovered.cover);
                                    i2 = 1;
                                }
                                int i19 = 0;
                                while (true) {
                                    int i20 = c2cVar.w * i2;
                                    int i21 = c2cVar.x;
                                    if (i19 < i20) {
                                        sparseArray.put(i21 + i19, stickerSetCovered);
                                        i19++;
                                    } else {
                                        c2cVar.x = i20 + i21;
                                        size3 = i17;
                                    }
                                }
                            }
                        }
                        c2cVar.f();
                        return;
                    }
                    return;
                }
                c2cVar.s = true;
                return;
            case 22:
                b8c b8cVar = (b8c) this.b;
                ArrayList arrayList16 = (ArrayList) this.c;
                ArrayList arrayList17 = (ArrayList) this.d;
                zr9 zr9Var = b8cVar.f;
                if (b8cVar.n) {
                    b8cVar.h = null;
                    b8cVar.d = arrayList16;
                    b8cVar.e = arrayList17;
                    zr9Var.f(arrayList16, null);
                    if (b8cVar.n && !zr9Var.e()) {
                        b8cVar.w.f.e(false, true);
                    }
                    b8cVar.f();
                    return;
                }
                return;
            case 23:
                t56 t56Var = (t56) this.b;
                p7a p7aVar = (p7a) this.c;
                try {
                    try {
                        p7aVar.n(((mx) this.d).mo15apply(jie.a(t56Var)));
                        return;
                    } catch (Throwable th) {
                        p7aVar.m(th);
                        return;
                    }
                } catch (Error e) {
                    e = e;
                    p7aVar.m(e);
                    return;
                } catch (CancellationException unused2) {
                    p7aVar.cancel(false);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    p7aVar.m(e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    p7aVar.m(e);
                    return;
                }
            case 24:
                p7a p7aVar2 = (p7a) this.b;
                oh6 oh6Var = (oh6) this.c;
                o6a o6aVar = (o6a) this.d;
                try {
                    if (!(p7aVar2.a instanceof h2)) {
                        oh6Var.run();
                        p7aVar2.l(o6aVar);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    p7aVar2.m(th2);
                    return;
                }
            case 25:
                int[] iArr2 = (int[]) this.b;
                Runnable runnable3 = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i22 = iArr2[0] + 1;
                iArr2[0] = i22;
                if (i22 == ((p8c[]) this.c).length) {
                    runnable3.run();
                    return;
                }
                return;
            case 26:
                ((VideoAds) this.b).lambda$show$3((m21) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 27:
                ((VideoAds) this.b).lambda$show$5((m21) this.c, (boolean[]) this.d);
                return;
            case 28:
                VideoFileRenderer.a((VideoFileRenderer) this.b, (VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            default:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
        }
    }
}
