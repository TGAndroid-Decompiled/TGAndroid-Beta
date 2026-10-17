package hg;

import ai.s2;
import ai.ud;
import ai.v3;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
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
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zq;
import org.telegram.ui.sn;
import w7.z5;
public final class j1 extends hm0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A0;
    public HashMap B0;
    public String D0;
    public e1 E;
    public int E0;
    public String F;
    public u0 F0;
    public h1 G;
    public sn G0;
    public h1 H;
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
    public final db0 V;
    public a0.h W;
    public int X;
    public int Y;
    public String Z;
    public boolean f11920a0;
    public boolean f11921b0;
    public int f11923c0;
    public ArrayList f11924d0;
    public int f11928g0;
    public final Context h;
    public int f11930i0;
    public int f11931j0;
    public boolean f11932k0;
    public TLRPC.Chat f11933l0;
    public long f11934n;
    public f1 f11935n0;
    public boolean f11936o0;
    public ei.z1 f11937p0;
    public String f11938q0;
    public final long f11939r;
    public String f11940r0;
    public final boolean f11941s;
    public String f11942s0;
    public int f11943t0;
    public int f11944u0;
    public TLRPC.ChatFull v;
    public boolean f11945v0;
    public final a2 f11946w;
    public TLRPC.User f11947w0;
    public ArrayList f11948x;
    public boolean f11949x0;
    public a0.h f11950y;
    public a1 f11951y0;
    public Location f11952z0;
    public boolean f11922c = true;
    public boolean d = true;
    public boolean e = true;
    public int f11926f = UserConfig.selectedAccount;
    public boolean f11925e0 = true;
    public boolean f11927f0 = true;
    public boolean f11929h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final z0 I0 = new z0(this, new y0(this));
    public boolean L0 = false;
    public int M0 = -1;

    public j1(Context context, long j10, long j11, db0 db0Var, d6 d6Var, boolean z10) {
        this.H0 = d6Var;
        this.h = context;
        this.V = db0Var;
        this.f11934n = j10;
        this.f11941s = z10;
        this.f11939r = j11;
        a2 a2Var = new a2(true);
        this.f11946w = a2Var;
        a2Var.f11793a = new a6.m(this, 26);
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f11926f).createWeakObserversGroup(this).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.stickersDidLoad);
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
    public final boolean D(s4.b1 b1Var) {
        if ((this.f11947w0 == null || this.f11929h0) && this.A0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f20278id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f11926f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new i1(document, str));
                this.B0.put(str2, document);
                f1 f1Var = this.f11935n0;
                if (f1Var != null) {
                    f1Var.a();
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
                String str2 = document.dc_id + "_" + document.f20278id;
                HashMap hashMap = this.B0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f11926f).isPremium() || !MessageObject.isPremiumSticker(document))) {
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
                    this.A0.add(new i1(document, obj));
                    this.B0.put(str2, document);
                }
                i10++;
                obj = obj;
            }
        }
    }

    public final void G() {
        sn snVar = this.G0;
        if (snVar != null && snVar.getParentActivity() != null) {
            if (this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f11947w0;
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
            i1 i1Var = (i1) this.A0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(i1Var.f11912a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f11926f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f11926f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, i1Var.f11912a), i1Var.f11913b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f11947w0;
        if (user != null && user.f20419id != this.S) {
            return null;
        }
        return this.T;
    }

    public final Object J(int i10) {
        String str;
        long j10;
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
                return ((i1) this.A0.get(i10)).f11912a;
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
                ArrayList arrayList3 = this.f11948x;
                if (arrayList3 != null) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f11948x.get(i10);
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
                                    if (arrayList9 != null && (this.f11928g0 != 1 || (this.v instanceof TLRPC.TL_channelFull))) {
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
                                            j10 = user.f20419id;
                                        } else {
                                            j10 = 0;
                                        }
                                        return new g1(str, j10);
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
        if (this.f11947w0 != null && !this.f11929h0) {
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
            ArrayList arrayList3 = this.f11948x;
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
        return ((i1) this.A0.get(i10)).f11913b;
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
        z0 z0Var = this.I0;
        if (z0Var != null) {
            z0Var.stop();
        }
        a1 a1Var = this.f11951y0;
        if (a1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            this.f11951y0 = null;
        }
        if (this.f11943t0 != 0) {
            ConnectionsManager.getInstance(this.f11926f).cancelRequest(this.f11943t0, true);
            this.f11943t0 = 0;
        }
        if (this.f11944u0 != 0) {
            ConnectionsManager.getInstance(this.f11926f).cancelRequest(this.f11944u0, true);
            this.f11944u0 = 0;
        }
        this.f11947w0 = null;
        this.T = null;
        this.f11929h0 = true;
        this.f11938q0 = null;
        this.f11940r0 = null;
        this.f11945v0 = false;
        this.J0.removeAllObservers();
    }

    public final void Q() {
        TLRPC.User user = this.f11947w0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f11952z0 = location;
            location.setLatitude(-1000.0d);
            this.f11952z0.setLongitude(-1000.0d);
            T(true, this.f11947w0, this.f11940r0, "");
        }
    }

    public final void R(TLRPC.User user) {
        sn snVar;
        TLRPC.Chat chat;
        this.f11943t0 = 0;
        this.I0.stop();
        db0 db0Var = this.V;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f11947w0 = user;
            long j10 = user.f20419id;
            if (j10 != this.S) {
                this.T = null;
                this.S = j10;
            }
            sn snVar2 = this.G0;
            if (snVar2 != null && (chat = snVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.f11929h0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    db0Var.a(true);
                    return;
                }
            }
            if (this.f11947w0.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f11926f);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.f11947w0.f20419id, false) && (snVar = this.G0) != null && snVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f11947w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s2(this, zArr, user2, 10));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ah.h0(14, this, zArr));
                    this.G0.showDialog(alertDialog$Builder.f20601a, new v3(this, zArr, 4));
                } else {
                    G();
                }
            }
        } else {
            this.f11947w0 = null;
            this.T = null;
            this.f11929h0 = true;
        }
        if (this.f11947w0 == null) {
            this.f11945v0 = true;
            this.T = null;
            return;
        }
        if (db0Var != null) {
            db0Var.b(true);
        }
        T(true, this.f11947w0, this.f11940r0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: hg.j1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.f11944u0 != 0) {
            ConnectionsManager.getInstance(this.f11926f).cancelRequest(this.f11944u0, true);
            this.f11944u0 = 0;
        }
        if (this.f11929h0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f11952z0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f11934n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f11934n);
                    sb2.append("_");
                    sb2.append(user.f20419id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f11952z0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f11952z0.getLongitude() + this.f11952z0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f11926f);
                    w0 w0Var = new w0(this, str, z10, user, str2, messagesStorage, sb3);
                    long j10 = user.f20419id;
                    if (j10 != this.S) {
                        this.T = null;
                        this.S = j10;
                    }
                    if (z10) {
                        messagesStorage.getBotCache(sb3, w0Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f11926f).getInputUser(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f11952z0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f11952z0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f11952z0.getLongitude());
                    }
                    if (DialogObject.isEncryptedDialog(this.f11934n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f11926f).getInputPeer(this.f11934n);
                    }
                    this.f11944u0 = ConnectionsManager.getInstance(this.f11926f).sendRequest(tL_messages_getInlineBotResults, w0Var, 2);
                    return;
                }
                return;
            }
            this.f11940r0 = null;
            return;
        }
        db0 db0Var = this.V;
        if (db0Var != null) {
            db0Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: hg.j1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f11922c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        sn snVar;
        TLRPC.Chat chat;
        this.f11926f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f11929h0 && this.f11947w0 != null && (snVar = this.G0) != null && (chat = snVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.f11929h0 = canSendStickers;
            if (canSendStickers) {
                this.f11948x = null;
                l();
                this.V.a(false);
                R(this.f11947w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.f11923c0, this.f11924d0, this.f11921b0, this.f11920a0);
        }
    }

    public final void X(sn snVar) {
        this.G0 = snVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f11948x = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f20419id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f11950y = hVar;
        ei.z1 z1Var = this.f11937p0;
        if (z1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z1Var);
            this.f11937p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z10) {
            l();
            this.V.a(!this.f11948x.isEmpty());
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u0 u0Var;
        boolean z10 = false;
        if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.fileLoadFailed) {
            if (i10 == NotificationCenter.recentDocumentsDidLoad) {
                u0 u0Var2 = this.F0;
                if (u0Var2 != null) {
                    AndroidUtilities.runOnUIThread(u0Var2);
                    this.F0 = null;
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (u0Var = this.F0) != null) {
                AndroidUtilities.runOnUIThread(u0Var);
                this.F0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.C0;
            if (!arrayList2.isEmpty() && this.f11936o0) {
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
        if (this.f11947w0 != null && !this.f11929h0) {
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
        db0 db0Var = this.V;
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
                        if (!(obj instanceof ig.x1)) {
                            if (obj != obj2 && ((!(obj instanceof i1) || !(obj2 instanceof i1) || ((i1) obj).f11912a != ((i1) obj2).f11912a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f20419id != ((TLRPC.User) obj2).f20419id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f20272id != ((TLRPC.Chat) obj2).f20272id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
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
            if (z10 && db0Var != null) {
                db0Var.c();
            }
            this.K0 = objArr;
            return;
        }
        if (db0Var != null) {
            this.M0 = K();
            db0Var.c();
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String str;
        TLRPC.User user;
        sn snVar;
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
        int i12 = b1Var.f45941f;
        View view = b1Var.f45938a;
        Boolean bool = null;
        if (i12 == 4) {
            c8 c8Var = (c8) view;
            if (i11 >= 0 && i11 < this.A0.size()) {
                i1 i1Var = (i1) this.A0.get(i11);
                TLRPC.Document document = i1Var.f11912a;
                Object obj = i1Var.f11913b;
                sg.b1 b1Var2 = c8Var.f22104n;
                w9 w9Var = c8Var.f22100a;
                c8Var.f22102c = obj;
                boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
                c8Var.f22106s = isPremiumSticker;
                if (isPremiumSticker) {
                    b1Var2.setColor(h6.x0(null, h6.f20986d6, false));
                    b1Var2.H = true;
                    b1Var2.I = false;
                    b1Var2.invalidate();
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, h6.f20928a7, 1.0f, 1.0f, c8Var.v);
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (svgThumb != null) {
                        w9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, c8Var.f22102c);
                        f7 = 1.0f;
                    } else if (closestPhotoSizeWithSize != null) {
                        f7 = 1.0f;
                        w9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, c8Var.f22102c);
                    } else {
                        f7 = 1.0f;
                        w9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, c8Var.f22102c);
                    }
                } else {
                    f7 = 1.0f;
                    if (svgThumb != null) {
                        if (closestPhotoSizeWithSize != null) {
                            w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, c8Var.f22102c);
                        } else {
                            w9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, c8Var.f22102c);
                        }
                    } else {
                        w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, c8Var.f22102c);
                    }
                }
                c8Var.f22101b = document;
                Drawable background = c8Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    background.setColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.Be, false), PorterDuff.Mode.MULTIPLY));
                }
                if (c8Var.f22106s) {
                    c8Var.f22105r = true;
                } else {
                    c8Var.f22105r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var2.getLayoutParams();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int dp = AndroidUtilities.dp(24.0f);
                    layoutParams.width = dp;
                    layoutParams.height = dp;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    b1Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                } else {
                    int dp2 = AndroidUtilities.dp(16.0f);
                    layoutParams.width = dp2;
                    layoutParams.height = dp2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    b1Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                }
                b1Var2.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
                AndroidUtilities.updateViewVisibilityAnimated(b1Var2, c8Var.f22105r, 0.9f, false);
                c8Var.invalidate();
                c8Var.setClearsInputField(true);
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
            ig.u1 u1Var = (ig.u1) view;
            ArrayList arrayList = this.M;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                u1Var.a((ig.x1) this.M.get(i11), this.L, false);
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
                    f2 f2Var = (f2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.R.get(i11);
                    TLRPC.User user2 = this.f11947w0;
                    boolean z13 = this.f11949x0;
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
                    f2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f11938q0));
                }
            } else if (i12 == 6) {
                h1 h1Var = (h1) view;
                int i13 = i11 + 2;
                if (i13 == 0) {
                    this.G = h1Var;
                } else {
                    this.H = h1Var;
                }
                TLRPC.Chat chat2 = this.f11933l0;
                if (chat2 == null && (snVar = this.G0) != null) {
                    chat2 = snVar.e;
                }
                h1Var.a(i13, str3, chat2);
            } else if (i12 == 7) {
            } else {
                g5 g5Var = (g5) view;
                ArrayList arrayList3 = this.f11948x;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        g5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        g5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 != null && i11 >= 0 && i11 < arrayList4.size()) {
                        g5Var.setText((String) this.I.get(i11));
                    } else {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 != null && i11 >= 0 && i11 < arrayList5.size()) {
                            g5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.N.get(i11));
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
                                ud udVar = g5Var.f22291b;
                                TextView textView2 = g5Var.f22292c;
                                h9 h9Var = g5Var.d;
                                w9 w9Var2 = g5Var.f22290a;
                                g5Var.a();
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
                                    yq yqVar = new yq(R.drawable.mini_ephemeral_hidden_14, 0);
                                    yqVar.setColorKey(h6.A6);
                                    yqVar.setTopOffset(1);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    udVar.setText(spannableStringBuilder);
                                } else {
                                    udVar.setText(str4);
                                }
                                textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        }
                    }
                }
                g5Var.setDivider(false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        TextView textView;
        int i11;
        int w02;
        d6 d6Var = this.H0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                int i12 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            boolean z10 = this.f11941s;
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.v = d6Var;
                                    w9 w9Var = new w9(context);
                                    frameLayout.f22100a = w9Var;
                                    w9Var.setAspectFit(true);
                                    w9Var.setLayerNum(1);
                                    frameLayout.addView(w9Var, z5.a(66.0f, 0.0f, 5.0f, 0.0f, 0.0f, 66, 1));
                                    frameLayout.setFocusable(true);
                                    sg.b1 b1Var = new sg.b1(context, 1, null);
                                    frameLayout.f22104n = b1Var;
                                    b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    b1Var.setImageReceiver(w9Var.getImageReceiver());
                                    frameLayout.addView(b1Var, z5.a(24.0f, 0.0f, 0.0f, 0.0f, 0.0f, 24, 81));
                                    textView = frameLayout;
                                } else {
                                    View unVar = new un(context, 6);
                                    if (z10) {
                                        w02 = h6.m1(0.15f, -1);
                                    } else {
                                        w02 = h6.w0(h6.f20928a7, d6Var);
                                    }
                                    zq zqVar = new zq(new ColorDrawable(w02), h6.V0(context, R.drawable.greydivider, h6.w0(h6.f20948b7, d6Var)), 0, 0);
                                    zqVar.f32999w = true;
                                    unVar.setBackground(zqVar);
                                    view = unVar;
                                }
                            } else {
                                textView = new h1(context, d6Var, z10);
                            }
                        } else {
                            view = new ig.u1(context, d6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTextColor(h6.w0(h6.f21391z6, d6Var));
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f22396a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    textView3.setTextColor(h6.x0(null, h6.Ce, false));
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
                    frameLayout2.addView(textView3, z5.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -2, i12 | 16));
                    view = frameLayout2;
                }
            } else {
                f2 f2Var = new f2(context);
                f2Var.setDelegate(new v0(this));
                textView = f2Var;
            }
            return new s4.b1(textView);
        }
        g5 g5Var = new g5(context, d6Var);
        g5Var.setIsDarkTheme(false);
        view = g5Var;
        textView = view;
        return new s4.b1(textView);
    }
}
