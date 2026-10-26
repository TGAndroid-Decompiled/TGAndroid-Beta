package e2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import b2.g1;
import b2.m1;
import di.e4;
import f9.s1;
import fi.g9;
import fi.ia;
import fi.k3;
import fi.l9;
import fi.n1;
import fi.n3;
import fi.n9;
import fi.sb;
import fi.w7;
import fi.y1;
import fi.z1;
import hi.d4;
import hi.e3;
import hi.h3;
import hi.m3;
import ig.a2;
import ig.b2;
import ig.d2;
import ig.j1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jg.v0;
import m4.t1;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.web.a1;
public final class m0 implements Runnable {
    public final int f9687a;
    public final Object f9688b;
    public final Object f9689c;
    public final Object d;

    public m0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9687a = i10;
        this.f9688b = obj;
        this.f9689c = obj2;
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
        boolean z11 = false;
        switch (this.f9687a) {
            case 0:
                k9.e0 e0Var = (k9.e0) this.f9688b;
                k2.e0 e0Var2 = (k2.e0) this.f9689c;
                t1 t1Var = (t1) this.d;
                try {
                    if (!(e0Var.f16486a instanceof k9.a)) {
                        e0Var2.run();
                        e0Var.m(t1Var);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    e0Var.n(th2);
                    return;
                }
            case 1:
                y1 y1Var = (y1) this.f9688b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = y1Var.v;
                z1 z1Var = y1Var.N;
                ArrayList arrayList3 = y1Var.f11988s;
                if (TextUtils.equals((String) this.f9689c, y1Var.H)) {
                    y1Var.f11990x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    y1Var.f11991y.clear();
                    y1Var.f11986n.clear();
                    y1Var.f11990x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        y1Var.f11990x = tL_messages_stickers.stickers.size() + y1Var.f11990x;
                    }
                    y1Var.I = y1Var.H;
                    y1Var.l();
                    n1.C1(z1Var.f12050b, 0, 0);
                    z1Var.f12052f.c(false);
                    z1Var.e.n(false);
                    return;
                }
                return;
            case 2:
                k3 k3Var = (k3) this.f9688b;
                Object obj = this.f9689c;
                String str = (String) this.d;
                float f7 = k3Var.K;
                if (obj != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        k3Var.c(photoEntry, options);
                        w7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = k3Var.c(photoEntry, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = fi.n0.b(c10, true);
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
                    } else if ((obj instanceof w7) && (file = ((w7) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        w7.C(options2, min);
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
                AndroidUtilities.runOnUIThread(new m0(k3Var, str, iArr2, 3));
                return;
            case 3:
                k3 k3Var2 = (k3) this.f9688b;
                String str2 = (String) this.f9689c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr3 = (int[]) pair.second;
                ?? r32 = k3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        k3.f11093f0.put(str2, bitmap);
                        HashMap hashMap = k3.f11092e0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, k3Var2.R)) {
                        k3.d(str2);
                        return;
                    }
                    k3Var2.f11094a = bitmap;
                    if (iArr3 == null) {
                        r32.setShader(null);
                        k3Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        k3Var2.e = linearGradient;
                        r32.setShader(linearGradient);
                    }
                    k3Var2.h();
                    k3Var2.invalidate();
                    return;
                }
                return;
            case 4:
                n3 n3Var = (n3) this.f9688b;
                TLObject tLObject2 = (TLObject) this.f9689c;
                MessagesController messagesController = (MessagesController) this.d;
                n3Var.f11296r = true;
                n3Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(n3Var.f11298w.f11336a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    n3Var.E();
                    return;
                }
                return;
            case 5:
                String[] strArr = (String[]) this.f9688b;
                int[][] iArr4 = (int[][]) this.f9689c;
                ai.e0 e0Var3 = (ai.e0) this.d;
                for (int i15 = 0; i15 < strArr.length; i15++) {
                    String str3 = strArr[i15];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr4[i15], 0L);
                    }
                }
                AndroidUtilities.runOnUIThread(e0Var3);
                return;
            case 6:
                AnimatedFileNative.d((String) this.f9688b, ((int[][]) this.f9689c)[0], 0L);
                AndroidUtilities.runOnUIThread((ai.e0) this.d);
                return;
            case 7:
                g9 g9Var = (g9) this.f9688b;
                TLObject tLObject3 = (TLObject) this.f9689c;
                MessagesController messagesController2 = (MessagesController) this.d;
                n9 n9Var = g9Var.W;
                g9Var.v.setLoading(false);
                if (tLObject3 != null) {
                    int i16 = n9.f11309d0;
                    ArrayList i17 = n9Var.i1();
                    for (int i18 = 0; i18 < i17.size(); i18++) {
                        TLRPC.User user = (TLRPC.User) i17.get(i18);
                        if (user != null && (contains = g9Var.f10922c.contains(Long.valueOf(user.f22176id))) != user.close_friend) {
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
                n9Var.g1();
                if (n9Var.Z) {
                    n9Var.h1(new l9(1, n9.G(n9Var), (ArrayList) null), new e4(n9Var, 1), false);
                    return;
                }
                n9Var.g1();
                n9Var.f11311b.E(0);
                return;
            case 8:
                ((w7) this.f9689c).O0 = (File) this.d;
                ia iaVar = ((sb) this.f9688b).f11617d1;
                if (iaVar != null) {
                    iaVar.f11107b.f32152g3.O(false);
                    return;
                }
                return;
            case 9:
                sb sbVar = (sb) this.f9688b;
                Bitmap bitmap2 = (Bitmap) this.f9689c;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), sbVar.B0.getMatrix(), true);
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
            case 10:
                ArrayList arrayList4 = (ArrayList) this.f9688b;
                HashMap hashMap2 = (HashMap) this.f9689c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i19);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f22176id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj2 = new Object();
                    obj2.f13351a = user2;
                    obj2.f13352b = z10;
                    arrayList5.add(obj2);
                }
                callback.run(arrayList5);
                return;
            case 11:
                hi.y1 y1Var2 = (hi.y1) this.d;
                ((boolean[]) this.f9688b)[0] = false;
                if (((TLObject) this.f9689c) instanceof TLRPC.TL_boolTrue) {
                    y1Var2.run(Boolean.TRUE);
                    return;
                }
                return;
            case 12:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                m3 m3Var = ((h3) this.f9688b).d;
                if (((TLObject) this.f9689c) instanceof TLRPC.TL_boolTrue) {
                    e3 e3Var = m3Var.f13133y;
                    e3Var.getClass();
                    e3Var.y("emoji_status_access_requested", a1.A("cancelled", "status"));
                    return;
                }
                new wc(m3Var.f13121q0, m3Var.F).Z(tL_error).k(true);
                return;
            case 13:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f9689c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                wc.b0((d4) this.f9688b).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, hi.k.F0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) this.d))), R.raw.copy).j();
                return;
            case 14:
                d4.z0((d4) this.f9688b, (TLObject) this.f9689c, (e2) this.d);
                return;
            case 15:
                u2.g0 g0Var = (u2.g0) this.d;
                j2.e eVar = ((i2.a1) this.f9688b).f13478c;
                s1 f10 = ((f9.f0) this.f9689c).f();
                aa.m0 m0Var = eVar.d;
                g1 g1Var = eVar.h;
                g1Var.getClass();
                m0Var.getClass();
                m0Var.f1151b = f9.i0.u(f10);
                if (!f10.isEmpty()) {
                    m0Var.e = (u2.g0) f10.get(0);
                    g0Var.getClass();
                    m0Var.f1153f = g0Var;
                }
                if (((u2.g0) m0Var.d) == null) {
                    m0Var.d = aa.m0.n(g1Var, (f9.i0) m0Var.f1151b, (u2.g0) m0Var.e, (m1) m0Var.f1150a);
                }
                m0Var.D(g1Var.y0());
                return;
            case 16:
                Pair pair2 = (Pair) this.f9689c;
                ((i2.g1) this.f9688b).f13549b.h.k(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, (pa.d) this.d);
                return;
            case 17:
                Pair pair3 = (Pair) this.f9689c;
                ((i2.g1) this.f9688b).f13549b.h.b(((Integer) pair3.first).intValue(), (u2.g0) pair3.second, (Exception) this.d);
                return;
            case 18:
                ((ig.g0) this.f9688b).a((a0.h) this.d, (ArrayList) this.f9689c);
                return;
            case 19:
                ig.t tVar = (ig.t) this.d;
                int i20 = ((ig.i0) this.f9688b).f14094s0;
                MessagesController messagesController3 = MessagesController.getInstance(i20);
                Iterator it = ((HashSet) this.f9689c).iterator();
                while (it.hasNext()) {
                    Pair pair4 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair4.first).booleanValue();
                    Long l4 = (Long) pair4.second;
                    long longValue = l4.longValue();
                    if (booleanValue) {
                        concurrentHashMap = messagesController3.dialogs_read_outbox_max;
                    } else {
                        concurrentHashMap = messagesController3.dialogs_read_inbox_max;
                    }
                    concurrentHashMap.put(l4, Integer.valueOf(MessagesStorage.getInstance(i20).getDialogReadMaxSync(booleanValue, longValue)));
                }
                AndroidUtilities.runOnUIThread(tVar);
                return;
            case 20:
                j1 j1Var = (j1) this.f9688b;
                String str4 = (String) this.f9689c;
                TLObject tLObject4 = (TLObject) this.d;
                j1Var.E0 = 0;
                if (str4.equals(j1Var.D0) && (tLObject4 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject4;
                    ArrayList arrayList6 = j1Var.A0;
                    if (arrayList6 != null) {
                        i12 = arrayList6.size();
                    } else {
                        i12 = 0;
                    }
                    j1Var.F("sticker_search_".concat(str4), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = j1Var.A0;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    } else {
                        i13 = 0;
                    }
                    if (!j1Var.f14126o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        bb0 bb0Var = j1Var.V;
                        if (j1Var.K() > 0) {
                            z11 = true;
                        }
                        bb0Var.a(z11);
                        j1Var.f14126o0 = true;
                    }
                    if (i12 != i13) {
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                j1 j1Var2 = (j1) this.f9688b;
                a0.h hVar = (a0.h) this.d;
                j1Var2.f14127p0 = null;
                j1Var2.Y(hVar, (ArrayList) this.f9689c, true);
                return;
            case 22:
                a2 a2Var = (a2) this.f9688b;
                ArrayList arrayList8 = (ArrayList) this.f9689c;
                a2Var.f14001q = arrayList8;
                a2Var.f14002r = (HashMap) this.d;
                a2Var.f14003s = true;
                a2Var.f13988a.p0(arrayList8);
                return;
            case 23:
                b2 b2Var = (b2) this.f9688b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) this.f9689c).f22141q;
                d2 d2Var = b2Var.f14008a;
                String str6 = d2Var.R;
                d61 d61Var = d2Var.e;
                if (str5.equals(str6)) {
                    b2Var.a();
                    d61Var.f27413b.h.getProgressDrawable().e = false;
                    d2Var.N = 0;
                    d61Var.b(true);
                    d2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    d2Var.l();
                    return;
                }
                return;
            case 24:
                jg.c cVar = (jg.c) this.f9688b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9689c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.f15645a.b(false);
                    wc.e0(tL_error2);
                    return;
                } else if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                    cVar.f15645a.b(false);
                    vh.n(R.string.UnknownError, wc.b0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 25:
                jg.n nVar = (jg.n) this.f9688b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f9689c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error3 != null) {
                    nVar.f15780f.b(false);
                    wc.e0(tL_error3);
                    return;
                } else if (tLObject6 instanceof TLRPC.TL_boolFalse) {
                    nVar.f15780f.b(false);
                    vh.n(R.string.UnknownError, wc.b0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 26:
                jg.z zVar = (jg.z) this.f9688b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList9 = zVar.f15909b;
                if (((TLObject) this.f9689c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList9.contains(tL_businessChatLink)) {
                        arrayList9.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(zVar.f15908a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    zVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 27:
                jg.z zVar2 = (jg.z) this.f9688b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f9689c;
                ConnectionsManager.getInstance(zVar2.f15908a).sendRequest(deletebusinesschatlink, new bi.j(21, zVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 28:
                jg.k0.P((jg.k0) this.f9688b, (TL_account.TL_connectedBot) this.f9689c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            default:
                v0 v0Var = (v0) this.f9688b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f9689c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error4 != null) {
                    v0Var.f15866a.b(false);
                    wc.e0(tL_error4);
                    return;
                } else if (tLObject7 instanceof TLRPC.TL_boolFalse) {
                    v0Var.f15866a.b(false);
                    vh.n(R.string.UnknownError, wc.b0(v0Var), null);
                    return;
                } else {
                    v0Var.finishFragment();
                    return;
                }
        }
    }
}
