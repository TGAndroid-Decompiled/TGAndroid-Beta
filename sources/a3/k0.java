package a3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.IOnDoneCallback;
import bi.ce;
import bi.j4;
import bi.kb;
import bi.o4;
import bi.oc;
import bi.p2;
import bi.pb;
import bi.q2;
import bi.r0;
import bi.r9;
import bi.ra;
import bi.rb;
import bi.w1;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.e3;
import di.h4;
import di.i3;
import di.n3;
import di.y1;
import fg.f2;
import fg.h2;
import fg.l1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m4.r1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.web.c1;
import v7.o8;
public final class k0 implements Runnable {
    public final int f137a;
    public final Object f138b;
    public final Object f139c;
    public final Object d;

    public k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f137a = i10;
        this.f138b = obj;
        this.f139c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int[] iArr;
        File file;
        int i10;
        boolean contains;
        int i11;
        boolean z10;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        int i12;
        int i13;
        ArrayList arrayList;
        int[] iArr2 = null;
        boolean z11 = true;
        boolean z12 = false;
        switch (this.f137a) {
            case 0:
                b2.s sVar = (b2.s) this.f139c;
                String str = e2.d0.f7188a;
                i2.e0 e0Var = ((i2.b0) ((l0) ((of.b) this.f138b).f14295c)).f10108a;
                e0Var.Q = sVar;
                j2.e eVar = e0Var.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1017, new j2.d(p5, sVar, (i2.h) this.d, 9));
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f138b;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.f139c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).f1300c.compareTo(androidx.lifecycle.n.f1281c) < 0) {
                            z11 = false;
                        }
                        if (z11) {
                            cVar.a();
                            return;
                        }
                    } catch (w.g e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + cVar);
                return;
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f138b;
                String str3 = (String) this.f139c;
                try {
                    androidx.car.app.utils.i.d(str3.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.c) this.d).a(), str3, 0));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.g e10) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 3:
                androidx.biometric.s sVar2 = (androidx.biometric.s) this.f138b;
                v7.w wVar = (v7.w) this.f139c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.v.a(sVar2.f754a);
                    if (a2 != null) {
                        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.f1023b);
                        synchronized (qVar.d) {
                            qVar.f1048f = threadPoolExecutor;
                        }
                        ((androidx.emoji2.text.k) a2.f1023b).a(new androidx.emoji2.text.m(wVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    wVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                p2 p2Var = (p2) this.f138b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = p2Var.v;
                q2 q2Var = p2Var.N;
                ArrayList arrayList3 = p2Var.f3361s;
                if (TextUtils.equals((String) this.f139c, p2Var.H)) {
                    p2Var.f3363x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    p2Var.f3364y.clear();
                    p2Var.f3359n.clear();
                    p2Var.f3363x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        p2Var.f3363x = tL_messages_stickers.stickers.size() + p2Var.f3363x;
                    }
                    p2Var.I = p2Var.H;
                    p2Var.l();
                    w1.v1(q2Var.f3442b, 0, 0);
                    q2Var.f3444f.c(false);
                    q2Var.e.n(false);
                    return;
                }
                return;
            case 5:
                j4 j4Var = (j4) this.f138b;
                Object obj = this.f139c;
                String str4 = (String) this.d;
                float f7 = j4Var.K;
                if (obj != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        j4Var.c(photoEntry, options);
                        r9.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = j4Var.c(photoEntry, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = r0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i14 = photoEntry.gradientTopColor;
                                if (i14 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i14, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if ((obj instanceof r9) && (file = ((r9) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        r9.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new k0(j4Var, str4, iArr2, 6));
                return;
            case 6:
                j4 j4Var2 = (j4) this.f138b;
                String str5 = (String) this.f139c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr3 = (int[]) pair.second;
                ?? r32 = j4Var2.d;
                if (bitmap != null) {
                    if (str5 != null) {
                        j4.f2944f0.put(str5, bitmap);
                        HashMap hashMap = j4.f2943e0;
                        Integer num = (Integer) hashMap.get(str5);
                        if (num != null) {
                            hashMap.put(str5, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str5, 1);
                        }
                    }
                    if (!TextUtils.equals(str5, j4Var2.R)) {
                        j4.d(str5);
                        return;
                    }
                    j4Var2.f2945a = bitmap;
                    if (iArr3 == null) {
                        r32.setShader(null);
                        j4Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        j4Var2.e = linearGradient;
                        r32.setShader(linearGradient);
                    }
                    j4Var2.h();
                    j4Var2.invalidate();
                    return;
                }
                return;
            case 7:
                o4 o4Var = (o4) this.f138b;
                TLObject tLObject2 = (TLObject) this.f139c;
                MessagesController messagesController = (MessagesController) this.d;
                o4Var.f3307r = true;
                o4Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(o4Var.f3309w.f3368a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    o4Var.E();
                    return;
                }
                return;
            case 8:
                String[] strArr = (String[]) this.f138b;
                int[][] iArr4 = (int[][]) this.f139c;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.d;
                for (int i15 = 0; i15 < strArr.length; i15++) {
                    String str6 = strArr[i15];
                    if (str6 != null) {
                        AnimatedFileNative.d(str6, iArr4[i15], 0L);
                    }
                }
                AndroidUtilities.runOnUIThread(bVar);
                return;
            case 9:
                AnimatedFileNative.d((String) this.f138b, ((int[][]) this.f139c)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.b) this.d);
                return;
            case 10:
                kb kbVar = (kb) this.f138b;
                TLObject tLObject3 = (TLObject) this.f139c;
                MessagesController messagesController2 = (MessagesController) this.d;
                rb rbVar = kbVar.W;
                kbVar.v.setLoading(false);
                if (tLObject3 != null) {
                    int i16 = rb.f3613d0;
                    ArrayList h12 = rbVar.h1();
                    for (int i17 = 0; i17 < h12.size(); i17++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i17);
                        if (user != null && (contains = kbVar.f3008c.contains(Long.valueOf(user.f17342id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i11 = user.flags2 | 4;
                            } else {
                                i11 = user.flags2 & (-5);
                            }
                            user.flags2 = i11;
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                rbVar.f1();
                if (rbVar.Z) {
                    rbVar.g1(new pb(1, rb.F(rbVar), (ArrayList) null), new ra(rbVar, 0), false);
                    return;
                }
                rbVar.f1();
                rbVar.f3615b.D(0);
                return;
            case 11:
                ((r9) this.f139c).O0 = (File) this.d;
                oc ocVar = ((ce) this.f138b).f2442d1;
                if (ocVar != null) {
                    ocVar.f3388b.Y2.N(false);
                    return;
                }
                return;
            case 12:
                ce ceVar = (ce) this.f138b;
                Bitmap bitmap2 = (Bitmap) this.f139c;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), ceVar.B0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 13:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f138b;
                Intent intent = (Intent) this.f139c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 14:
                ArrayList arrayList4 = (ArrayList) this.f138b;
                HashMap hashMap2 = (HashMap) this.f139c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i18);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f17342id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj2 = new Object();
                    obj2.f6902a = user2;
                    obj2.f6903b = z10;
                    arrayList5.add(obj2);
                }
                callback.run(arrayList5);
                return;
            case 15:
                y1 y1Var = (y1) this.d;
                ((boolean[]) this.f138b)[0] = false;
                if (((TLObject) this.f139c) instanceof TLRPC.TL_boolTrue) {
                    y1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 16:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                n3 n3Var = ((i3) this.f138b).d;
                if (((TLObject) this.f139c) instanceof TLRPC.TL_boolTrue) {
                    e3 e3Var = n3Var.f6812x;
                    e3Var.getClass();
                    e3Var.y("emoji_status_access_requested", c1.B("cancelled", "status"));
                    return;
                }
                new wc(n3Var.f6801p0, n3Var.E).Y(tL_error).k(true);
                return;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f139c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                wc.a0((h4) this.f138b).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, di.m.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.d))), R.raw.copy).j();
                return;
            case 18:
                h4.A0((h4) this.f138b, (TLObject) this.f139c, (d2) this.d);
                return;
            case 19:
                i9.w wVar2 = (i9.w) this.f138b;
                i9.c0 c0Var = (i9.c0) this.f139c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(o8.a(wVar2)));
                        return;
                    } catch (Throwable th3) {
                        c0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    c0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
                    c0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    c0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c0Var.n(e);
                    return;
                }
            case 20:
                i9.c0 c0Var2 = (i9.c0) this.f138b;
                m4.w wVar3 = (m4.w) this.f139c;
                r1 r1Var = (r1) this.d;
                try {
                    if (!(c0Var2.f10530a instanceof i9.a)) {
                        wVar3.run();
                        c0Var2.m(r1Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    c0Var2.n(th4);
                    return;
                }
            case 21:
                fg.s sVar3 = (fg.s) this.d;
                int i19 = ((fg.h0) this.f138b).f8050s0;
                MessagesController messagesController3 = MessagesController.getInstance(i19);
                Iterator it = ((HashSet) this.f139c).iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l4 = (Long) pair2.second;
                    long longValue = l4.longValue();
                    if (booleanValue) {
                        concurrentHashMap = messagesController3.dialogs_read_outbox_max;
                    } else {
                        concurrentHashMap = messagesController3.dialogs_read_inbox_max;
                    }
                    concurrentHashMap.put(l4, Integer.valueOf(MessagesStorage.getInstance(i19).getDialogReadMaxSync(booleanValue, longValue)));
                }
                AndroidUtilities.runOnUIThread(sVar3);
                return;
            case 22:
                ((fg.f0) this.f138b).a((a0.i) this.d, (ArrayList) this.f139c);
                return;
            case 23:
                l1 l1Var = (l1) this.f138b;
                String str7 = (String) this.f139c;
                TLObject tLObject4 = (TLObject) this.d;
                l1Var.E0 = 0;
                if (str7.equals(l1Var.D0) && (tLObject4 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject4;
                    ArrayList arrayList6 = l1Var.A0;
                    if (arrayList6 != null) {
                        i12 = arrayList6.size();
                    } else {
                        i12 = 0;
                    }
                    l1Var.F("sticker_search_".concat(str7), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = l1Var.A0;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    } else {
                        i13 = 0;
                    }
                    if (!l1Var.f8118o0 && (arrayList = l1Var.A0) != null && !arrayList.isEmpty()) {
                        l1Var.H();
                        sa0 sa0Var = l1Var.V;
                        if (l1Var.K() > 0) {
                            z12 = true;
                        }
                        sa0Var.a(z12);
                        l1Var.f8118o0 = true;
                    }
                    if (i12 != i13) {
                        l1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                l1 l1Var2 = (l1) this.f138b;
                a0.i iVar = (a0.i) this.d;
                l1Var2.f8119p0 = null;
                l1Var2.Y(iVar, (ArrayList) this.f139c, true);
                return;
            case 25:
                fg.d2 d2Var = (fg.d2) this.f138b;
                ArrayList arrayList8 = (ArrayList) this.f139c;
                d2Var.f7992q = arrayList8;
                d2Var.f7993r = (HashMap) this.d;
                d2Var.f7994s = true;
                d2Var.f7979a.k0(arrayList8);
                return;
            case 26:
                f2 f2Var = (f2) this.f138b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str8 = ((TLRPC.TL_messages_searchStickerSets) this.f139c).f17307q;
                h2 h2Var = f2Var.f8017a;
                String str9 = h2Var.R;
                f51 f51Var = h2Var.e;
                if (str8.equals(str9)) {
                    f2Var.a();
                    f51Var.f22865b.h.getProgressDrawable().e = false;
                    h2Var.N = 0;
                    f51Var.b(true);
                    h2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    h2Var.l();
                    return;
                }
                return;
            case 27:
                gg.c cVar2 = (gg.c) this.f138b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f139c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar2.f8822a.a(0.0f);
                    wc.b0(tL_error2);
                    return;
                } else if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                    cVar2.f8822a.a(0.0f);
                    a2.p(R.string.UnknownError, wc.a0(cVar2), null);
                    return;
                } else {
                    cVar2.finishFragment();
                    return;
                }
            case 28:
                gg.n nVar = (gg.n) this.f138b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f139c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error3 != null) {
                    nVar.e.a(0.0f);
                    wc.b0(tL_error3);
                    return;
                } else if (tLObject6 instanceof TLRPC.TL_boolFalse) {
                    nVar.e.a(0.0f);
                    a2.p(R.string.UnknownError, wc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            default:
                gg.b0 b0Var = (gg.b0) this.f138b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList9 = b0Var.f8817b;
                if (((TLObject) this.f139c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList9.contains(tL_businessChatLink)) {
                        arrayList9.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(b0Var.f8816a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    b0Var.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
        }
    }
}
