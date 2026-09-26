package gg;

import ai.p4;
import ai.q5;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.wn;
import w7.y5;
public final class k1 extends wl0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A0;
    public HashMap B0;
    public String D0;
    public f1 E;
    public int E0;
    public String F;
    public v0 F0;
    public i1 G;
    public wn G0;
    public i1 H;
    public final d6 H0;
    public ArrayList I;
    public ArrayList J;
    public final NotificationCenter.ObserversGroup J0;
    public ArrayList K;
    public Object[] K0;
    public String L;
    public ArrayList M;
    public ArrayList N;
    public String[] O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public long S;
    public TLRPC.TL_inlineBotSwitchPM T;
    public TLRPC.TL_inlineBotWebView U;
    public final va0 V;
    public a0.i W;
    public int X;
    public int Y;
    public String Z;
    public boolean f9796a0;
    public boolean f9797b0;
    public int f9799c0;
    public ArrayList f9800d0;
    public int f9804g0;
    public final Context h;
    public int f9806i0;
    public int f9807j0;
    public boolean f9808k0;
    public TLRPC.Chat f9809l0;
    public long f9810n;
    public g1 f9811n0;
    public boolean f9812o0;
    public t f9813p0;
    public String f9814q0;
    public final long f9815r;
    public String f9816r0;
    public final boolean f9817s;
    public String f9818s0;
    public int f9819t0;
    public int f9820u0;
    public TLRPC.ChatFull v;
    public boolean f9821v0;
    public final c2 f9822w;
    public TLRPC.User f9823w0;
    public ArrayList f9824x;
    public boolean f9825x0;
    public a0.i f9826y;
    public b1 f9827y0;
    public Location f9828z0;
    public boolean f9798c = true;
    public boolean d = true;
    public boolean e = true;
    public int f9802f = UserConfig.selectedAccount;
    public boolean f9801e0 = true;
    public boolean f9803f0 = true;
    public boolean f9805h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final a1 I0 = new a1(this, new z0(this));
    public boolean L0 = false;
    public int M0 = -1;

    public k1(Context context, long j3, long j10, va0 va0Var, d6 d6Var, boolean z10) {
        this.H0 = d6Var;
        this.h = context;
        this.V = va0Var;
        this.f9810n = j3;
        this.f9817s = z10;
        this.f9815r = j10;
        c2 c2Var = new c2(true);
        this.f9822w = c2Var;
        c2Var.f9671a = new xa.c(this, 23);
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f9802f).createWeakObserversGroup(this).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.stickersDidLoad);
        this.J0 = add;
        add.add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if ((this.f9823w0 == null || this.f9805h0) && this.A0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f18341id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f9802f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new j1(document, str));
                this.B0.put(str2, document);
                g1 g1Var = this.f9811n0;
                if (g1Var != null) {
                    g1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            Object obj = str;
            while (i10 < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                String str2 = document.dc_id + "_" + document.f18341id;
                HashMap hashMap = this.B0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f9802f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                    int size2 = document.attributes.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                        i11++;
                    }
                    if (this.A0 == null) {
                        this.A0 = new ArrayList();
                        this.B0 = new HashMap();
                    }
                    this.A0.add(new j1(document, obj));
                    this.B0.put(str2, document);
                }
                i10++;
                obj = obj;
            }
        }
    }

    public final void G() {
        wn wnVar = this.G0;
        if (wnVar != null && wnVar.getParentActivity() != null) {
            if (Build.VERSION.SDK_INT >= 23 && this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f9823w0;
            if (user != null && user.bot_inline_geo) {
                this.I0.start();
            }
        }
    }

    public final void H() {
        if (this.A0 == null) {
            return;
        }
        ArrayList arrayList = this.C0;
        arrayList.clear();
        int min = Math.min(6, this.A0.size());
        for (int i10 = 0; i10 < min; i10++) {
            j1 j1Var = (j1) this.A0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(j1Var.f9782a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f9802f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f9802f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, j1Var.f9782a), j1Var.f9783b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f9823w0;
        if (user != null && user.f18482id != this.S) {
            return null;
        }
        return this.T;
    }

    public final Object J(int i10) {
        String str;
        long j3;
        String str2;
        TLRPC.User user = null;
        if (this.F != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                return ((j1) this.A0.get(i10)).f9782a;
            }
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.U;
                if (tL_inlineBotWebView != null) {
                    if (i10 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.R.get(i10);
                    }
                }
                i10--;
                if (i10 >= 0) {
                    return this.R.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.f9824x;
                if (arrayList3 != null) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f9824x.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null) {
                        if (i10 >= 0 && i10 < arrayList4.size()) {
                            return this.I.get(i10);
                        }
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null) {
                            if (i10 >= 0 && i10 < arrayList5.size()) {
                                return this.N.get(i10);
                            }
                        } else {
                            ArrayList arrayList6 = this.M;
                            if (arrayList6 != null || this.J != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.M.get(i10);
                                    }
                                    ArrayList arrayList7 = this.M;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.J;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.P;
                                    if (arrayList9 != null && (this.f9804g0 != 1 || (this.v instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i10) != null) {
                                            user = (TLRPC.User) this.P.get(i10);
                                            Object obj = this.J.get(i10);
                                            if (user != null) {
                                                str2 = UserObject.getPublicUsername(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.J.get(i10));
                                        }
                                    } else {
                                        str = (String) this.J.get(i10);
                                    }
                                    ArrayList arrayList10 = this.Q;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        if (user != null) {
                                            j3 = user.f18482id;
                                        } else {
                                            j3 = 0;
                                        }
                                        return new h1(str, j3);
                                    }
                                    return str;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int K() {
        int i10;
        int size;
        int i11;
        int i12 = 1;
        if (this.f9823w0 != null && !this.f9805h0) {
            return 1;
        }
        int i13 = 0;
        if (this.F != null) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.T == null && this.U == null) {
                    i12 = 0;
                }
                return size2 + i12 + i10;
            }
            ArrayList arrayList3 = this.f9824x;
            if (arrayList3 != null) {
                i11 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.I;
                if (arrayList4 != null) {
                    i11 = arrayList4.size();
                } else if (this.J == null && this.M == null) {
                    ArrayList arrayList5 = this.N;
                    if (arrayList5 != null) {
                        i11 = arrayList5.size();
                    } else {
                        return i10;
                    }
                } else {
                    ArrayList arrayList6 = this.M;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.J;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    }
                    i11 = size + i13;
                }
            }
        }
        return i11 + i10;
    }

    public final Object L(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((j1) this.A0.get(i10)).f9783b;
    }

    public final int M(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        if (this.R != null) {
            if (this.T != null || this.U != null) {
                return i10 - 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean N() {
        if (this.A0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        a1 a1Var = this.I0;
        if (a1Var != null) {
            a1Var.stop();
        }
        b1 b1Var = this.f9827y0;
        if (b1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b1Var);
            this.f9827y0 = null;
        }
        if (this.f9819t0 != 0) {
            ConnectionsManager.getInstance(this.f9802f).cancelRequest(this.f9819t0, true);
            this.f9819t0 = 0;
        }
        if (this.f9820u0 != 0) {
            ConnectionsManager.getInstance(this.f9802f).cancelRequest(this.f9820u0, true);
            this.f9820u0 = 0;
        }
        this.f9823w0 = null;
        this.T = null;
        this.f9805h0 = true;
        this.f9814q0 = null;
        this.f9816r0 = null;
        this.f9821v0 = false;
        this.J0.removeAllObservers();
    }

    public final void Q() {
        TLRPC.User user = this.f9823w0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f9828z0 = location;
            location.setLatitude(-1000.0d);
            this.f9828z0.setLongitude(-1000.0d);
            T(true, this.f9823w0, this.f9816r0, "");
        }
    }

    public final void R(TLRPC.User user) {
        wn wnVar;
        TLRPC.Chat chat;
        this.f9819t0 = 0;
        this.I0.stop();
        va0 va0Var = this.V;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f9823w0 = user;
            long j3 = user.f18482id;
            if (j3 != this.S) {
                this.T = null;
                this.S = j3;
            }
            wn wnVar2 = this.G0;
            if (wnVar2 != null && (chat = wnVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.f9805h0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    va0Var.a(true);
                    return;
                }
            }
            if (this.f9823w0.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f9802f);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.f9823w0.f18482id, false) && (wnVar = this.G0) != null && wnVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f9823w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q5(this, zArr, user2, 9));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ah.b(12, this, zArr));
                    this.G0.showDialog(alertDialog$Builder.f18661a, new ei.e0(this, zArr, 2));
                } else {
                    G();
                }
            }
        } else {
            this.f9823w0 = null;
            this.T = null;
            this.f9805h0 = true;
        }
        if (this.f9823w0 == null) {
            this.f9821v0 = true;
            this.T = null;
            return;
        }
        if (va0Var != null) {
            va0Var.b(true);
        }
        T(true, this.f9823w0, this.f9816r0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: gg.k1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.f9820u0 != 0) {
            ConnectionsManager.getInstance(this.f9802f).cancelRequest(this.f9820u0, true);
            this.f9820u0 = 0;
        }
        if (this.f9805h0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f9828z0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f9810n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f9810n);
                    sb2.append("_");
                    sb2.append(user.f18482id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f9828z0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f9828z0.getLongitude() + this.f9828z0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f9802f);
                    x0 x0Var = new x0(this, str, z10, user, str2, messagesStorage, sb3);
                    long j3 = user.f18482id;
                    if (j3 != this.S) {
                        this.T = null;
                        this.S = j3;
                    }
                    if (z10) {
                        messagesStorage.getBotCache(sb3, x0Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f9802f).getInputUser(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f9828z0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f9828z0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f9828z0.getLongitude());
                    }
                    if (DialogObject.isEncryptedDialog(this.f9810n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f9802f).getInputPeer(this.f9810n);
                    }
                    this.f9820u0 = ConnectionsManager.getInstance(this.f9802f).sendRequest(tL_messages_getInlineBotResults, x0Var, 2);
                    return;
                }
                return;
            }
            this.f9816r0 = null;
            return;
        }
        va0 va0Var = this.V;
        if (va0Var != null) {
            va0Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r27, int r28, java.util.ArrayList r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: gg.k1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f9798c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        wn wnVar;
        TLRPC.Chat chat;
        this.f9802f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f9805h0 && this.f9823w0 != null && (wnVar = this.G0) != null && (chat = wnVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.f9805h0 = canSendStickers;
            if (canSendStickers) {
                this.f9824x = null;
                l();
                this.V.a(false);
                R(this.f9823w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.f9799c0, this.f9800d0, this.f9797b0, this.f9796a0);
        }
    }

    public final void X(wn wnVar) {
        this.G0 = wnVar;
    }

    public final void Y(a0.i iVar, ArrayList arrayList, boolean z10) {
        this.f9824x = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f18482id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f9826y = iVar;
        t tVar = this.f9813p0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.f9813p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z10) {
            l();
            this.V.a(!this.f9824x.isEmpty());
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v0 v0Var;
        boolean z10 = false;
        if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.fileLoadFailed) {
            if (i10 == NotificationCenter.recentDocumentsDidLoad) {
                v0 v0Var2 = this.F0;
                if (v0Var2 != null) {
                    AndroidUtilities.runOnUIThread(v0Var2);
                    this.F0 = null;
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (v0Var = this.F0) != null) {
                AndroidUtilities.runOnUIThread(v0Var);
                this.F0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.C0;
            if (!arrayList2.isEmpty() && this.f9812o0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z10 = true;
                    }
                    this.V.a(z10);
                }
            }
        }
    }

    @Override
    public final int h() {
        int K = K();
        this.M0 = K;
        return K;
    }

    @Override
    public final int j(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.A0 != null) {
            return 4;
        }
        if (this.f9823w0 != null && !this.f9805h0) {
            return 3;
        }
        if (this.R != null) {
            if (i10 == 0) {
                if (this.T != null || this.U != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.M0;
        va0 va0Var = this.V;
        int i11 = 0;
        if (i10 != -1 && this.K0 != null) {
            int K = K();
            this.M0 = K;
            if (i10 != K) {
                z10 = true;
            } else {
                z10 = false;
            }
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.K0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof hg.b2)) {
                            if (obj != obj2 && ((!(obj instanceof j1) || !(obj2 instanceof j1) || ((j1) obj).f9782a != ((j1) obj2).f9782a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f18482id != ((TLRPC.User) obj2).f18482id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f18335id != ((TLRPC.Chat) obj2).f18335id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                m(i11);
                z10 = true;
                i11++;
            }
            t(min, i10 - min);
            s(min, K - min);
            if (z10 && va0Var != null) {
                va0Var.c();
            }
            this.K0 = objArr;
            return;
        }
        if (va0Var != null) {
            this.M0 = K();
            va0Var.c();
        }
        super.l();
        int K2 = K();
        this.M0 = K2;
        this.K0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.K0;
            if (i11 < objArr3.length) {
                objArr3[i11] = J(i11);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String str;
        TLRPC.User user;
        wn wnVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f7;
        String str3 = this.F;
        if (str3 != null) {
            i11 = i10 - 2;
        } else {
            i11 = i10;
        }
        int i12 = c1Var.f42962f;
        View view = c1Var.f42959a;
        Boolean bool = null;
        if (i12 == 4) {
            d8 d8Var = (d8) view;
            if (i11 >= 0 && i11 < this.A0.size()) {
                j1 j1Var = (j1) this.A0.get(i11);
                TLRPC.Document document = j1Var.f9782a;
                Object obj = j1Var.f9783b;
                rg.b1 b1Var = d8Var.f20149n;
                w9 w9Var = d8Var.f20145a;
                d8Var.f20147c = obj;
                boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
                d8Var.f20151s = isPremiumSticker;
                if (isPremiumSticker) {
                    b1Var.setColor(h6.w0(null, h6.f19059d6, false));
                    b1Var.H = true;
                    b1Var.I = false;
                    b1Var.invalidate();
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, h6.f19003a7, 1.0f, 1.0f, d8Var.v);
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (svgThumb != null) {
                        w9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, d8Var.f20147c);
                        f7 = 1.0f;
                    } else if (closestPhotoSizeWithSize != null) {
                        f7 = 1.0f;
                        w9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, d8Var.f20147c);
                    } else {
                        f7 = 1.0f;
                        w9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, d8Var.f20147c);
                    }
                } else {
                    f7 = 1.0f;
                    if (svgThumb != null) {
                        if (closestPhotoSizeWithSize != null) {
                            w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, d8Var.f20147c);
                        } else {
                            w9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, d8Var.f20147c);
                        }
                    } else {
                        w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, d8Var.f20147c);
                    }
                }
                d8Var.f20146b = document;
                Drawable background = d8Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    background.setColorFilter(new PorterDuffColorFilter(h6.w0(null, h6.Be, false), PorterDuff.Mode.MULTIPLY));
                }
                if (d8Var.f20151s) {
                    d8Var.f20150r = true;
                } else {
                    d8Var.f20150r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int dp = AndroidUtilities.dp(24.0f);
                    layoutParams.width = dp;
                    layoutParams.height = dp;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                } else {
                    int dp2 = AndroidUtilities.dp(16.0f);
                    layoutParams.width = dp2;
                    layoutParams.height = dp2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    b1Var.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                }
                b1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
                AndroidUtilities.updateViewVisibilityAnimated(b1Var, d8Var.f20150r, 0.9f, false);
                d8Var.invalidate();
                d8Var.setClearsInputField(true);
            }
        } else if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                }
            }
        } else if (i12 == 5) {
            hg.y1 y1Var = (hg.y1) view;
            ArrayList arrayList = this.M;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                y1Var.a((hg.b2) this.M.get(i11), this.L, false);
            }
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                if (tL_inlineBotSwitchPM == null && this.U == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2) {
                    if (z10) {
                        org.telegram.ui.Cells.i0 i0Var = (org.telegram.ui.Cells.i0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.U.text;
                        }
                        i0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z10) {
                    i11--;
                }
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.R.get(i11);
                    TLRPC.User user2 = this.f9823w0;
                    boolean z13 = this.f9825x0;
                    if (i11 != this.R.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && i11 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f9814q0));
                }
            } else if (i12 == 6) {
                i1 i1Var = (i1) view;
                int i13 = i11 + 2;
                if (i13 == 0) {
                    this.G = i1Var;
                } else {
                    this.H = i1Var;
                }
                TLRPC.Chat chat2 = this.f9809l0;
                if (chat2 == null && (wnVar = this.G0) != null) {
                    chat2 = wnVar.e;
                }
                i1Var.a(i13, str3, chat2);
            } else if (i12 == 7) {
            } else {
                h5 h5Var = (h5) view;
                ArrayList arrayList3 = this.f9824x;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        h5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        h5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null && i11 >= 0 && i11 < arrayList4.size()) {
                        h5Var.setText((String) this.I.get(i11));
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null && i11 >= 0 && i11 < arrayList5.size()) {
                            h5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.N.get(i11));
                        } else {
                            ArrayList arrayList6 = this.J;
                            if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                                ArrayList arrayList7 = this.K;
                                if (arrayList7 != null && i11 >= 0 && i11 < arrayList7.size()) {
                                    str = (String) this.K.get(i11);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.P;
                                if (arrayList8 != null && i11 >= 0 && i11 < arrayList8.size()) {
                                    user = (TLRPC.User) this.P.get(i11);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.Q;
                                if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                                    bool = (Boolean) this.Q.get(i11);
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.J.get(i11);
                                p4 p4Var = h5Var.f20394b;
                                TextView textView2 = h5Var.f20395c;
                                h9 h9Var = h5Var.d;
                                w9 w9Var2 = h5Var.f20393a;
                                h5Var.a();
                                if (user != null) {
                                    w9Var2.setVisibility(0);
                                    h9Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        w9Var2.e(user, h9Var);
                                    } else {
                                        w9Var2.setImageDrawable(h9Var);
                                    }
                                } else {
                                    w9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    qq qqVar = new qq(R.drawable.mini_ephemeral_hidden_14, 0);
                                    qqVar.setColorKey(h6.A6);
                                    qqVar.setTopOffset(1);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(qqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    p4Var.setText(spannableStringBuilder);
                                } else {
                                    p4Var.setText(str4);
                                }
                                textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        }
                    }
                }
                h5Var.setDivider(false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        TextView textView;
        int i11;
        int v02;
        d6 d6Var = this.H0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                int i12 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            boolean z10 = this.f9817s;
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.v = d6Var;
                                    w9 w9Var = new w9(context);
                                    frameLayout.f20145a = w9Var;
                                    w9Var.setAspectFit(true);
                                    w9Var.setLayerNum(1);
                                    frameLayout.addView(w9Var, y5.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    rg.b1 b1Var = new rg.b1(context, 1, null);
                                    frameLayout.f20149n = b1Var;
                                    b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    b1Var.setImageReceiver(w9Var.getImageReceiver());
                                    frameLayout.addView(b1Var, y5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View mnVar = new mn(context, 6);
                                    if (z10) {
                                        v02 = h6.l1(0.15f, -1);
                                    } else {
                                        v02 = h6.v0(h6.f19003a7, d6Var);
                                    }
                                    rq rqVar = new rq(new ColorDrawable(v02), h6.U0(context, R.drawable.greydivider, h6.v0(h6.f19023b7, d6Var)), 0, 0);
                                    rqVar.f28035w = true;
                                    mnVar.setBackground(rqVar);
                                    view = mnVar;
                                }
                            } else {
                                textView = new i1(context, d6Var, z10);
                            }
                        } else {
                            view = new hg.y1(context, d6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTextColor(h6.v0(h6.f19461z6, d6Var));
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f20416a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    textView3.setTextColor(h6.w0(null, h6.Ce, false));
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView3.setGravity(i11);
                    if (!LocaleController.isRTL) {
                        i12 = 3;
                    }
                    frameLayout2.addView(textView3, y5.d(-2, -2.0f, i12 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context);
                f2Var.setDelegate(new w0(this));
                textView = f2Var;
            }
            return new s4.c1(textView);
        }
        h5 h5Var = new h5(context, d6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        textView = view;
        return new s4.c1(textView);
    }
}
