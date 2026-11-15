package fi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import hi.sa;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.l31;
import org.telegram.ui.LaunchActivity;
public final class s5 implements Runnable {
    public final int f12316a;
    public final Object f12317b;
    public final Object f12318c;
    public final Object d;

    public s5(Object obj, Object obj2, Object obj3, int i7) {
        this.f12316a = i7;
        this.f12317b = obj;
        this.f12318c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        gj gjVar;
        int e12;
        int[] iArr;
        File file;
        int i7;
        boolean contains;
        int i10;
        ConcurrentHashMap concurrentHashMap;
        SQLiteCursor sQLiteCursor;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        boolean z10 = false;
        switch (this.f12316a) {
            case 0:
                s6 s6Var = (s6) this.f12317b;
                TLObject tLObject = (TLObject) this.f12318c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i14 = s6Var.f12319a;
                s6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    s6Var.S = null;
                    ns.f(i14).k(197, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    s6Var.S = new m6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    ns.f(i14).k(197, new Object[0]);
                    return;
                } else {
                    s6Var.n(tL_error);
                    return;
                }
            case 1:
                b6 b6Var = (b6) this.f12318c;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) this.d;
                ArrayList arrayList2 = ((c6) this.f12317b).f11944i;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    gj gjVar2 = (gj) arrayList2.get(i15);
                    if (gjVar2 != null && (storyItem = gjVar2.f23822l) != null && (messageMedia = storyItem.media) != null) {
                        TLRPC.MessageMedia messageMedia2 = b6Var.media;
                        TLRPC.Document document = messageMedia2.document;
                        if (document != null) {
                            TLRPC.Document document2 = messageMedia.document;
                            if (document2 == null) {
                                continue;
                            } else if (document2.f28057id == document.f28057id) {
                                d3Var.a((b6) storyItem);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia2.photo;
                        if (photo2 != null && (photo = messageMedia.photo) != null && photo.f28075id == photo2.f28075id) {
                            d3Var.a((b6) storyItem);
                            return;
                        }
                    }
                }
                d3Var.a(null);
                return;
            case 2:
                c6 c6Var = (c6) this.f12317b;
                TLObject tLObject2 = (TLObject) this.f12318c;
                Runnable runnable = (Runnable) this.d;
                h6 h6Var = c6Var.f11952q;
                ArrayList arrayList3 = c6Var.G;
                ArrayList arrayList4 = c6Var.f11944i;
                ArrayList arrayList5 = c6Var.H;
                c6Var.F = 0;
                c6Var.C = false;
                c6Var.D = true;
                c6Var.f11953r = true;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject2).objects;
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList7.get(i16);
                        i16++;
                        arrayList6.add((TL_bots.botPreviewMedia) obj);
                    }
                } else if (tLObject2 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList3.clear();
                    arrayList3.addAll(previewinfo.lang_codes);
                    arrayList6.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList8 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList5.clear();
                int size2 = arrayList6.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj2 = arrayList6.get(i17);
                    i17++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList9 = arrayList6;
                    gj gjVar3 = new gj(c6Var.f11940c, new b6(c6Var, c6Var.d, botpreviewmedia));
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList8.size()) {
                            if (np.t0(((gj) arrayList8.get(i18)).f23822l.media, botpreviewmedia.media)) {
                                gjVar = (gj) arrayList8.get(i18);
                            } else {
                                i18++;
                            }
                        } else {
                            gjVar = null;
                        }
                    }
                    TL_stories.StoryItem storyItem2 = gjVar3.f23822l;
                    TLRPC.Message message = gjVar3.f23817k;
                    if (gjVar == null) {
                        e12 = c6Var.I;
                        c6Var.I = e12 + 1;
                    } else {
                        e12 = gjVar.e1();
                    }
                    message.f28072id = e12;
                    storyItem2.f28290id = e12;
                    gjVar3.f23813j = c6Var;
                    gjVar3.r0(false);
                    if (arrayList5.isEmpty()) {
                        arrayList5.add(new ArrayList());
                    }
                    ((ArrayList) arrayList5.get(0)).add(Integer.valueOf(gjVar3.e1()));
                    arrayList4.add(gjVar3);
                    arrayList6 = arrayList9;
                }
                org.telegram.messenger.g0.r(h6Var);
                org.telegram.messenger.g0.h3(h6Var);
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
            case 3:
                i9 i9Var = ((z8) this.f12317b).d;
                i9Var.f11861o0.D(i9Var.h, ((k6) this.f12318c).d, (ArrayList) this.d);
                return;
            case 4:
                r9 r9Var = (r9) this.f12317b;
                TLObject tLObject3 = (TLObject) this.f12318c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                c1 c1Var = r9Var.f12295f;
                int i19 = r9Var.f12292b;
                r9.f12290g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    np.s1(i19).Y3(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.f28298id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.f12294e = false;
                        return;
                    }
                    ns.f(i19).k(324, new Object[0]);
                }
                r9Var.d = 0;
                if (r9Var.f12294e) {
                    org.telegram.messenger.g0.r(c1Var);
                    org.telegram.messenger.g0.i3(c1Var, 10000L);
                    return;
                }
                return;
            case 5:
                m9.y yVar = (m9.y) this.f12317b;
                m9.e0 e0Var = (m9.e0) this.f12318c;
                try {
                    try {
                        e0Var.o(((m9.q) this.d).apply(c8.r9.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 6:
                m9.e0 e0Var2 = (m9.e0) this.f12317b;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.f12318c;
                p4.m1 m1Var = (p4.m1) this.d;
                try {
                    if (!(e0Var2.f20586a instanceof m9.a)) {
                        e1Var.run();
                        e0Var2.m(m1Var);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 7:
                hi.x1 x1Var = (hi.x1) this.f12317b;
                TLObject tLObject4 = (TLObject) this.f12318c;
                ArrayList arrayList10 = x1Var.f15321w;
                hi.y1 y1Var = x1Var.O;
                ArrayList arrayList11 = x1Var.f15320s;
                if (TextUtils.equals((String) this.d, x1Var.I)) {
                    x1Var.f15323y = 0;
                    arrayList11.clear();
                    arrayList10.clear();
                    x1Var.E.clear();
                    x1Var.f15318n.clear();
                    x1Var.f15323y++;
                    arrayList11.add(null);
                    arrayList10.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList11.addAll(tL_messages_stickers.stickers);
                        x1Var.f15323y = tL_messages_stickers.stickers.size() + x1Var.f15323y;
                    }
                    x1Var.J = x1Var.I;
                    x1Var.f();
                    hi.o1.z1(y1Var.f15408b, 0, 0);
                    y1Var.f15411f.c(false);
                    y1Var.f15410e.n(false);
                    return;
                }
                return;
            case 8:
                hi.z2 z2Var = (hi.z2) this.f12317b;
                Object obj3 = this.f12318c;
                String str = (String) this.d;
                float f10 = z2Var.L;
                if (obj3 != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.f23609q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj3 instanceof ff) {
                        ff ffVar = (ff) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        z2Var.c(ffVar, options);
                        hi.d7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = z2Var.c(ffVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (ffVar.T == 0 && ffVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = c8.h0.b(c10, true);
                                ffVar.T = iArr2[0];
                                ffVar.U = iArr2[1];
                            } else {
                                int i20 = ffVar.T;
                                if (i20 != 0 && (i7 = ffVar.U) != 0) {
                                    iArr2 = new int[]{i20, i7};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if ((obj3 instanceof hi.d7) && (file = ((hi.d7) obj3).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        hi.d7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.h3(new s5(z2Var, str, pair, 9));
                return;
            case 9:
                hi.z2 z2Var2 = (hi.z2) this.f12317b;
                String str2 = (String) this.f12318c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                Paint paint = z2Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        hi.z2.f15482g0.put(str2, bitmap);
                        HashMap hashMap = hi.z2.f15481f0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, z2Var2.S)) {
                        hi.z2.d(str2);
                        return;
                    }
                    z2Var2.f15483a = bitmap;
                    if (iArr3 == null) {
                        paint.setShader(null);
                        z2Var2.f15489e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        z2Var2.f15489e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    z2Var2.h();
                    z2Var2.invalidate();
                    return;
                }
                return;
            case 10:
                hi.c3 c3Var = (hi.c3) this.f12317b;
                TLObject tLObject5 = (TLObject) this.f12318c;
                np npVar = (np) this.d;
                c3Var.f13974r = true;
                c3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    npVar.Y3(tL_contacts_resolvedPeer.users, false);
                    npVar.S3(tL_contacts_resolvedPeer.chats, false);
                    vr.a0(c3Var.f13977x.f14099a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    c3Var.E();
                    return;
                }
                return;
            case 11:
                String[] strArr = (String[]) this.f12317b;
                int[][] iArr4 = (int[][]) this.f12318c;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.d;
                for (int i21 = 0; i21 < strArr.length; i21++) {
                    String str3 = strArr[i21];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr4[i21], 0L);
                    }
                }
                org.telegram.messenger.g0.h3(aVar);
                return;
            case 12:
                AnimatedFileNative.d((String) this.f12317b, ((int[][]) this.f12318c)[0], 0L);
                org.telegram.messenger.g0.h3((androidx.car.app.utils.a) this.d);
                return;
            case 13:
                hi.l8 l8Var = (hi.l8) this.f12317b;
                TLObject tLObject6 = (TLObject) this.f12318c;
                np npVar2 = (np) this.d;
                hi.q8 q8Var = l8Var.f14600a0;
                l8Var.f14608w.setLoading(false);
                if (tLObject6 != null) {
                    int i22 = hi.q8.Y1;
                    ArrayList O0 = q8Var.O0();
                    for (int i23 = 0; i23 < O0.size(); i23++) {
                        TLRPC.User user = (TLRPC.User) O0.get(i23);
                        if (user != null && (contains = l8Var.f14602c.contains(Long.valueOf(user.f28200id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i10 = user.flags2 | 4;
                            } else {
                                i10 = user.flags2 & (-5);
                            }
                            user.flags2 = i10;
                            npVar2.X3(user, false, false);
                        }
                    }
                }
                q8Var.M0();
                if (q8Var.U1) {
                    q8Var.N0(new hi.o8(1, q8Var.f29679a, (ArrayList) null), new q3(q8Var, 1), false);
                    return;
                }
                q8Var.M0();
                q8Var.f14918m1.C(0);
                return;
            case 14:
                ((hi.d7) this.f12318c).O0 = (File) this.d;
                hi.l9 l9Var = ((sa) this.f12317b).f15051e1;
                if (l9Var != null) {
                    l9Var.f15326b.f39895g3.O(false);
                    return;
                }
                return;
            case 15:
                sa saVar = (sa) this.f12317b;
                Bitmap bitmap2 = (Bitmap) this.f12318c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), saVar.C0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                org.telegram.messenger.g0.h3(runnable2);
                return;
            case 16:
                jg.t tVar = (jg.t) this.d;
                int i24 = ((jg.h0) this.f12317b).f17107t0;
                np s12 = np.s1(i24);
                Iterator it = ((HashSet) this.f12318c).iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l10 = (Long) pair3.second;
                    long longValue = l10.longValue();
                    if (booleanValue) {
                        concurrentHashMap = s12.Q;
                    } else {
                        concurrentHashMap = s12.P;
                    }
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    vr a02 = vr.a0(i24);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.f27222b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        i11 = sQLiteCursor.intValue(0);
                                        sQLiteCursor.dispose();
                                    }
                                    i11 = 0;
                                    sQLiteCursor.dispose();
                                } catch (Exception e14) {
                                    e = e14;
                                    a02.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i11 = 0;
                                    concurrentHashMap2.put(l10, Integer.valueOf(i11));
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = null;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        sQLiteCursor = a02.f27222b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                        if (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(0);
                            int intValue2 = sQLiteCursor.intValue(1);
                            if (intValue2 <= intValue) {
                                i11 = intValue2;
                                sQLiteCursor.dispose();
                            }
                        }
                        i11 = 0;
                        sQLiteCursor.dispose();
                    }
                    concurrentHashMap2.put(l10, Integer.valueOf(i11));
                }
                org.telegram.messenger.g0.h3(tVar);
                return;
            case 17:
                ((jg.f0) this.f12317b).a((a0.h) this.d, (ArrayList) this.f12318c);
                return;
            case 18:
                jg.h1 h1Var = (jg.h1) this.f12317b;
                String str4 = (String) this.d;
                TLObject tLObject7 = (TLObject) this.f12318c;
                h1Var.F0 = 0;
                if (str4.equals(h1Var.E0) && (tLObject7 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject7;
                    ArrayList arrayList12 = h1Var.B0;
                    if (arrayList12 != null) {
                        i12 = arrayList12.size();
                    } else {
                        i12 = 0;
                    }
                    h1Var.F("sticker_search_".concat(str4), tL_messages_stickers2.stickers);
                    ArrayList arrayList13 = h1Var.B0;
                    if (arrayList13 != null) {
                        i13 = arrayList13.size();
                    } else {
                        i13 = 0;
                    }
                    if (!h1Var.f17135p0 && (arrayList = h1Var.B0) != null && !arrayList.isEmpty()) {
                        h1Var.H();
                        d90 d90Var = h1Var.W;
                        if (h1Var.K() > 0) {
                            z10 = true;
                        }
                        d90Var.a(z10);
                        h1Var.f17135p0 = true;
                    }
                    if (i12 != i13) {
                        h1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                jg.h1 h1Var2 = (jg.h1) this.f12317b;
                a0.h hVar = (a0.h) this.d;
                h1Var2.f17136q0 = null;
                h1Var2.Y(hVar, (ArrayList) this.f12318c, true);
                return;
            case 20:
                jg.z1 z1Var = (jg.z1) this.f12317b;
                ArrayList arrayList14 = (ArrayList) this.f12318c;
                z1Var.f17358q = arrayList14;
                z1Var.f17359r = (HashMap) this.d;
                z1Var.f17360s = true;
                z1Var.f17344a.l0(arrayList14);
                return;
            case 21:
                jg.a2 a2Var = (jg.a2) this.f12317b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) this.f12318c).f28165q;
                jg.c2 c2Var = a2Var.f17019a;
                String str6 = c2Var.S;
                l31 l31Var = c2Var.f17037e;
                if (str5.equals(str6)) {
                    a2Var.a();
                    l31Var.f36721b.h.getProgressDrawable().f41417e = false;
                    c2Var.O = 0;
                    l31Var.b(true);
                    c2Var.F.addAll(tL_messages_foundStickerSets.sets);
                    c2Var.f();
                    return;
                }
                return;
            case 22:
                kg.c cVar = (kg.c) this.f12317b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.f12318c;
                if (tL_error2 != null) {
                    cVar.f17877a.b(false);
                    cc.d0(tL_error2);
                    return;
                } else if (tLObject8 instanceof TLRPC.TL_boolFalse) {
                    cVar.f17877a.b(false);
                    org.telegram.messenger.k5.o(null, 2131743879, cc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 23:
                kg.n nVar = (kg.n) this.f12317b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.f12318c;
                if (tL_error3 != null) {
                    nVar.f17998f.b(false);
                    cc.d0(tL_error3);
                    return;
                } else if (tLObject9 instanceof TLRPC.TL_boolFalse) {
                    nVar.f17998f.b(false);
                    org.telegram.messenger.k5.o(null, 2131743879, cc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.F != null) {
                        nVar.getMessagesController().W2(nVar.getUserConfig().f(), 0, true, null);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 24:
                kg.y yVar2 = (kg.y) this.f12317b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList15 = yVar2.f18144b;
                if (((TLObject) this.f12318c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList15.contains(tL_businessChatLink)) {
                        arrayList15.remove(tL_businessChatLink);
                        ns.f(yVar2.f18143a).k(125, new Object[0]);
                    }
                    yVar2.f();
                    return;
                }
                org.telegram.messenger.a8.g(new RuntimeException("Unexpected response from server!"), true);
                return;
            case 25:
                kg.y yVar3 = (kg.y) this.f12317b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f12318c;
                ConnectionsManager.getInstance(yVar3.f18143a).sendRequest(deletebusinesschatlink, new bi.v2(19, yVar3, (TL_account.TL_businessChatLink) this.d));
                return;
            case 26:
                kg.i0 i0Var = (kg.i0) this.f12317b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                kg.f.a(i0Var.f29679a).b();
                i0Var.dismiss();
                ((TL_account.TL_connectedBot) this.f12318c).recipients = tL_businessBotRecipients;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).Q(2131623990, 36, hd.a0(null, null, 2131752784, q10.p(i0Var.U1))).j();
                    return;
                }
                return;
            case 27:
                kg.s0 s0Var = (kg.s0) this.f12317b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject10 = (TLObject) this.f12318c;
                if (tL_error4 != null) {
                    s0Var.f18086a.b(false);
                    cc.d0(tL_error4);
                    return;
                } else if (tLObject10 instanceof TLRPC.TL_boolFalse) {
                    s0Var.f18086a.b(false);
                    org.telegram.messenger.k5.o(null, 2131743879, cc.a0(s0Var), null);
                    return;
                } else {
                    s0Var.finishFragment();
                    return;
                }
            case 28:
                kg.c1.Z((kg.c1) this.f12317b, (TLRPC.TL_error) this.d, (TLObject) this.f12318c);
                return;
            default:
                kg.z1 z1Var2 = (kg.z1) this.f12317b;
                TLObject tLObject11 = (TLObject) this.f12318c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList16 = z1Var2.d;
                if (tLObject11 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList16.clear();
                    arrayList16.addAll(((TLRPC.TL_help_timezonesList) tLObject11).timezones);
                    SerializedData serializedData = new SerializedData(tLObject11.getObjectSize());
                    tLObject11.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ns.f(z1Var2.f18157a).k(214, new Object[0]);
                }
                z1Var2.f18159c = true;
                z1Var2.f18158b = false;
                return;
        }
    }

    public s5(Object obj, Object obj2, TLObject tLObject, int i7) {
        this.f12316a = i7;
        this.f12317b = obj;
        this.d = obj2;
        this.f12318c = tLObject;
    }
}
