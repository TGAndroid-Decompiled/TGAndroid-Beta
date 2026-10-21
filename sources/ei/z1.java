package ei;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.xc;
public final class z1 implements Runnable {
    public final int f10193a;
    public final Object f10194b;
    public final Object f10195c;
    public final Object d;

    public z1(Object obj, Object obj2, Object obj3, int i10) {
        this.f10193a = i10;
        this.f10195c = obj;
        this.f10194b = obj2;
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
        int i14 = this.f10193a;
        int[] iArr2 = null;
        boolean z11 = false;
        Object obj = this.d;
        Object obj2 = this.f10194b;
        Object obj3 = this.f10195c;
        switch (i14) {
            case 0:
                a2 a2Var = (a2) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = a2Var.v;
                b2 b2Var = a2Var.N;
                ArrayList arrayList3 = a2Var.f8681s;
                if (TextUtils.equals((String) obj2, a2Var.H)) {
                    a2Var.f8683x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    a2Var.f8684y.clear();
                    a2Var.f8679n.clear();
                    a2Var.f8683x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        a2Var.f8683x = tL_messages_stickers.stickers.size() + a2Var.f8683x;
                    }
                    a2Var.I = a2Var.H;
                    a2Var.l();
                    o1.x1(b2Var.f8769b, 0, 0);
                    b2Var.f8771f.c(false);
                    b2Var.e.n(false);
                    return;
                }
                return;
            case 1:
                m3 m3Var = (m3) obj3;
                String str = (String) obj2;
                float f7 = m3Var.K;
                if (obj != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        m3Var.c(photoEntry, options);
                        a8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = m3Var.c(photoEntry, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = n0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i15 = photoEntry.gradientTopColor;
                                if (i15 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i15, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if ((obj instanceof a8) && (file = ((a8) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        a8.C(options2, min);
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
                AndroidUtilities.runOnUIThread(new z1(m3Var, str, iArr2, 2));
                return;
            case 2:
                m3 m3Var2 = (m3) obj3;
                String str2 = (String) obj2;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr3 = (int[]) pair.second;
                ?? r22 = m3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        m3.f9449f0.put(str2, bitmap);
                        HashMap hashMap = m3.f9448e0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, m3Var2.R)) {
                        m3.d(str2);
                        return;
                    }
                    m3Var2.f9450a = bitmap;
                    if (iArr3 == null) {
                        r22.setShader(null);
                        m3Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        m3Var2.e = linearGradient;
                        r22.setShader(linearGradient);
                    }
                    m3Var2.h();
                    m3Var2.invalidate();
                    return;
                }
                return;
            case 3:
                p3 p3Var = (p3) obj3;
                TLObject tLObject2 = (TLObject) obj;
                MessagesController messagesController = (MessagesController) obj2;
                p3Var.f9585r = true;
                p3Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(p3Var.f9587w.f9621a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    p3Var.E();
                    return;
                }
                return;
            case 4:
                String[] strArr = (String[]) obj3;
                int[][] iArr4 = (int[][]) obj2;
                ai.y0 y0Var = (ai.y0) obj;
                for (int i16 = 0; i16 < strArr.length; i16++) {
                    String str3 = strArr[i16];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr4[i16], 0L);
                    }
                }
                AndroidUtilities.runOnUIThread(y0Var);
                return;
            case 5:
                AnimatedFileNative.d((String) obj2, ((int[][]) obj3)[0], 0L);
                AndroidUtilities.runOnUIThread((ai.y0) obj);
                return;
            case 6:
                k9 k9Var = (k9) obj3;
                TLObject tLObject3 = (TLObject) obj;
                MessagesController messagesController2 = (MessagesController) obj2;
                r9 r9Var = k9Var.W;
                k9Var.v.setLoading(false);
                if (tLObject3 != null) {
                    int i17 = r9.f9742d0;
                    ArrayList i18 = r9Var.i1();
                    for (int i19 = 0; i19 < i18.size(); i19++) {
                        TLRPC.User user = (TLRPC.User) i18.get(i19);
                        if (user != null && (contains = k9Var.f9327c.contains(Long.valueOf(user.f20423id))) != user.close_friend) {
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
                r9Var.g1();
                if (r9Var.Z) {
                    r9Var.h1(new p9(1, r9.G(r9Var), (ArrayList) null), new ci.e4(r9Var, 1), false);
                    return;
                }
                r9Var.g1();
                r9Var.f9744b.D(0);
                return;
            case 7:
                ((a8) obj2).O0 = (File) obj;
                ma maVar = ((vb) obj3).f9959d1;
                if (maVar != null) {
                    maVar.f9365b.W2.N(false);
                    return;
                }
                return;
            case 8:
                vb vbVar = (vb) obj3;
                Bitmap bitmap2 = (Bitmap) obj2;
                Runnable runnable = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), vbVar.B0.getMatrix(), true);
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
            case 9:
                ArrayList arrayList4 = (ArrayList) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList5 = new ArrayList();
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i20);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.f20423id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj4 = new Object();
                    obj4.f11386a = user2;
                    obj4.f11387b = z10;
                    arrayList5.add(obj4);
                }
                callback.run(arrayList5);
                return;
            case 10:
                gi.r1 r1Var = (gi.r1) obj2;
                ((boolean[]) obj3)[0] = false;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    r1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 11:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                gi.d3 d3Var = ((gi.y2) obj3).d;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    gi.v2 v2Var = d3Var.f11164x;
                    v2Var.getClass();
                    v2Var.y("emoji_status_access_requested", org.telegram.ui.web.a1.A("cancelled", "status"));
                    return;
                }
                new xc(d3Var.f11153p0, d3Var.E).Y(tL_error).k(true);
                return;
            case 12:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj2;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                xc.a0((gi.u3) obj3).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, gi.l.H0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                return;
            case 13:
                gi.u3.B0((gi.u3) obj3, (TLObject) obj, (org.telegram.ui.ActionBar.b2) obj2);
                return;
            case 14:
                ((hg.f0) obj3).b((a0.h) obj, (ArrayList) obj2);
                return;
            case 15:
                hg.t tVar = (hg.t) obj;
                int i21 = ((hg.h0) obj3).f11894s0;
                MessagesController messagesController3 = MessagesController.getInstance(i21);
                Iterator it = ((HashSet) obj2).iterator();
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
                    concurrentHashMap.put(l4, Integer.valueOf(MessagesStorage.getInstance(i21).getDialogReadMaxSync(booleanValue, longValue)));
                }
                AndroidUtilities.runOnUIThread(tVar);
                return;
            case 16:
                hg.j1 j1Var = (hg.j1) obj3;
                String str4 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj;
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
                    if (!j1Var.f11935o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        db0 db0Var = j1Var.V;
                        if (j1Var.K() > 0) {
                            z11 = true;
                        }
                        db0Var.a(z11);
                        j1Var.f11935o0 = true;
                    }
                    if (i12 != i13) {
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                hg.j1 j1Var2 = (hg.j1) obj3;
                j1Var2.f11936p0 = null;
                j1Var2.Y((a0.h) obj, (ArrayList) obj2, true);
                return;
            case 18:
                hg.a2 a2Var2 = (hg.a2) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                a2Var2.f11805q = arrayList8;
                a2Var2.f11806r = (HashMap) obj;
                a2Var2.f11807s = true;
                a2Var2.f11792a.S(arrayList8);
                return;
            case 19:
                hg.c2 c2Var = (hg.c2) obj3;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) obj2).f20388q;
                hg.e2 e2Var = c2Var.f11827a;
                String str6 = e2Var.R;
                r51 r51Var = e2Var.e;
                if (str5.equals(str6)) {
                    c2Var.a();
                    r51Var.f29848b.h.getProgressDrawable().e = false;
                    e2Var.N = 0;
                    r51Var.b(true);
                    e2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    e2Var.l();
                    return;
                }
                return;
            case 20:
                u2.g0 g0Var = (u2.g0) obj;
                j2.f fVar = ((i2.z0) obj3).f12630c;
                e9.x1 f10 = ((e9.k0) obj2).f();
                com.google.firebase.messaging.l lVar = fVar.d;
                b2.f1 f1Var = fVar.h;
                f1Var.getClass();
                lVar.getClass();
                lVar.f7646b = e9.n0.u(f10);
                if (!f10.isEmpty()) {
                    lVar.e = (u2.g0) f10.get(0);
                    g0Var.getClass();
                    lVar.f7648f = g0Var;
                }
                if (((u2.g0) lVar.d) == null) {
                    lVar.d = com.google.firebase.messaging.l.t(f1Var, (e9.n0) lVar.f7646b, (u2.g0) lVar.e, (b2.l1) lVar.f7645a);
                }
                lVar.M(f1Var.y0());
                return;
            case 21:
                Pair pair3 = (Pair) obj2;
                ((i2.f1) obj3).f12353b.h.c(((Integer) pair3.first).intValue(), (u2.g0) pair3.second, (oa.d) obj);
                return;
            case 22:
                Pair pair4 = (Pair) obj2;
                ((i2.f1) obj3).f12353b.h.b(((Integer) pair4.first).intValue(), (u2.g0) pair4.second, (Exception) obj);
                return;
            case 23:
                ig.c cVar = (ig.c) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj;
                if (tL_error2 != null) {
                    cVar.f12834a.a(0.0f);
                    xc.d0(tL_error2);
                    return;
                } else if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                    cVar.f12834a.a(0.0f);
                    mk.q(R.string.UnknownError, xc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 24:
                ig.m mVar = (ig.m) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                if (tL_error3 != null) {
                    mVar.e.a(0.0f);
                    xc.d0(tL_error3);
                    return;
                } else if (tLObject6 instanceof TLRPC.TL_boolFalse) {
                    mVar.e.a(0.0f);
                    mk.q(R.string.UnknownError, xc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.E != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 25:
                ig.y yVar = (ig.y) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                ArrayList arrayList9 = yVar.f13089b;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList9.contains(tL_businessChatLink)) {
                        arrayList9.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.f13088a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 26:
                ig.y yVar2 = (ig.y) obj3;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) obj2;
                ConnectionsManager.getInstance(yVar2.f13088a).sendRequest(deletebusinesschatlink, new ai.g(20, yVar2, (TL_account.TL_businessChatLink) obj));
                return;
            case 27:
                ig.k0.Q((ig.k0) obj3, (TL_account.TL_connectedBot) obj2, (TL_account.TL_businessBotRecipients) obj);
                return;
            case 28:
                ig.v0 v0Var = (ig.v0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj;
                if (tL_error4 != null) {
                    v0Var.f13055a.a(0.0f);
                    xc.d0(tL_error4);
                    return;
                } else if (tLObject7 instanceof TLRPC.TL_boolFalse) {
                    v0Var.f13055a.a(0.0f);
                    mk.q(R.string.UnknownError, xc.a0(v0Var), null);
                    return;
                } else {
                    v0Var.finishFragment();
                    return;
                }
            default:
                ig.f1.U((ig.f1) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
        }
    }

    public z1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f10193a = i10;
        this.f10195c = obj;
        this.d = obj2;
        this.f10194b = obj3;
    }

    public z1(String str, int[][] iArr, ai.y0 y0Var) {
        this.f10193a = 5;
        this.f10194b = str;
        this.f10195c = iArr;
        this.d = y0Var;
    }
}
