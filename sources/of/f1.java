package of;

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
import g7.e6;
import ih.h3;
import ih.v3;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qn;
public final class f1 extends vk0 implements NotificationCenter.NotificationCenterDelegate {
    public a1 A;
    public int A0;
    public String B;
    public r0 B0;
    public d1 C;
    public qn C0;
    public d1 D;
    public final b6 D0;
    public ArrayList E;
    public ArrayList F;
    public Object[] F0;
    public ArrayList G;
    public String H;
    public ArrayList I;
    public ArrayList J;
    public String[] K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public long O;
    public TLRPC.TL_inlineBotSwitchPM P;
    public TLRPC.TL_inlineBotWebView Q;
    public final r90 R;
    public a0.h S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public int Y;
    public ArrayList Z;
    public int f19323c0;
    public int f19326e0;
    public int f19328f0;
    public boolean f19329g0;
    public final Context h;
    public TLRPC.Chat f19330h0;
    public b1 f19332j0;
    public boolean f19333k0;
    public h3 f19334l0;
    public String m0;
    public long f19335n;
    public String f19336n0;
    public String f19337o0;
    public int f19338p0;
    public int f19339q0;
    public final long f19340r;
    public boolean f19341r0;
    public final boolean f19342s;
    public TLRPC.User f19343s0;
    public boolean f19344t0;
    public x0 f19345u0;
    public TLRPC.ChatFull v;
    public Location f19346v0;
    public final v1 f19347w;
    public ArrayList f19348w0;
    public ArrayList f19349x;
    public HashMap f19350x0;
    public a0.h f19351y;
    public String f19353z0;
    public boolean f19322c = true;
    public boolean d = true;
    public boolean f19325e = true;
    public int f19327f = UserConfig.selectedAccount;
    public boolean f19320a0 = true;
    public boolean f19321b0 = true;
    public boolean f19324d0 = true;
    public boolean f19331i0 = false;
    public final ArrayList f19352y0 = new ArrayList();
    public final w0 E0 = new w0(this, new v0(this));
    public boolean G0 = false;
    public int H0 = -1;

    public f1(Context context, long j10, long j11, r90 r90Var, b6 b6Var, boolean z10) {
        this.D0 = b6Var;
        this.h = context;
        this.R = r90Var;
        this.f19335n = j10;
        this.f19342s = z10;
        this.f19340r = j11;
        v1 v1Var = new v1(true);
        this.f19347w = v1Var;
        v1Var.f19524a = new n2.p(this, 6);
        NotificationCenter.getInstance(this.f19327f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f19327f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f19327f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f19327f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i9++;
        }
        return false;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if ((this.f19343s0 == null || this.f19324d0) && this.f19348w0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f22386id;
        HashMap hashMap = this.f19350x0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f19327f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.f19348w0 == null) {
                    this.f19348w0 = new ArrayList();
                    this.f19350x0 = new HashMap();
                }
                this.f19348w0.add(new e1(document, str));
                this.f19350x0.put(str2, document);
                b1 b1Var = this.f19332j0;
                if (b1Var != null) {
                    b1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i9 = 0;
            Object obj = str;
            while (i9 < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
                String str2 = document.dc_id + "_" + document.f22386id;
                HashMap hashMap = this.f19350x0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f19327f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                    int size2 = document.attributes.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                        i10++;
                    }
                    if (this.f19348w0 == null) {
                        this.f19348w0 = new ArrayList();
                        this.f19350x0 = new HashMap();
                    }
                    this.f19348w0.add(new e1(document, obj));
                    this.f19350x0.put(str2, document);
                }
                i9++;
                obj = obj;
            }
        }
    }

    public final void G() {
        qn qnVar = this.C0;
        if (qnVar != null && qnVar.getParentActivity() != null) {
            if (Build.VERSION.SDK_INT >= 23 && this.C0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.C0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f19343s0;
            if (user != null && user.bot_inline_geo) {
                this.E0.start();
            }
        }
    }

    public final void H() {
        if (this.f19348w0 == null) {
            return;
        }
        ArrayList arrayList = this.f19352y0;
        arrayList.clear();
        int min = Math.min(6, this.f19348w0.size());
        for (int i9 = 0; i9 < min; i9++) {
            e1 e1Var = (e1) this.f19348w0.get(i9);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e1Var.f19282a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f19327f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f19327f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, e1Var.f19282a), e1Var.f19283b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f19343s0;
        if (user != null && user.f22527id != this.O) {
            return null;
        }
        return this.P;
    }

    public final Object J(int i9) {
        String str;
        long j10;
        String str2;
        TLRPC.User user = null;
        if (this.B != null) {
            if (i9 >= 2) {
                i9 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.f19348w0;
        if (arrayList != null) {
            if (i9 >= 0 && i9 < arrayList.size()) {
                return ((e1) this.f19348w0.get(i9)).f19282a;
            }
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.Q;
                if (tL_inlineBotWebView != null) {
                    if (i9 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i9 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i9 >= 0 && i9 < arrayList2.size()) {
                        return this.N.get(i9);
                    }
                }
                i9--;
                if (i9 >= 0) {
                    return this.N.get(i9);
                }
            } else {
                ArrayList arrayList3 = this.f19349x;
                if (arrayList3 != null) {
                    if (i9 >= 0 && i9 < arrayList3.size()) {
                        return this.f19349x.get(i9);
                    }
                } else {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 != null) {
                        if (i9 >= 0 && i9 < arrayList4.size()) {
                            return this.E.get(i9);
                        }
                    } else {
                        ArrayList arrayList5 = this.J;
                        if (arrayList5 != null) {
                            if (i9 >= 0 && i9 < arrayList5.size()) {
                                return this.J.get(i9);
                            }
                        } else {
                            ArrayList arrayList6 = this.I;
                            if (arrayList6 != null || this.F != null) {
                                if (arrayList6 != null) {
                                    if (i9 >= 0 && i9 < arrayList6.size()) {
                                        return this.I.get(i9);
                                    }
                                    ArrayList arrayList7 = this.I;
                                    if (arrayList7 != null) {
                                        i9 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.F;
                                if (arrayList8 != null && i9 >= 0 && i9 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.L;
                                    if (arrayList9 != null && (this.f19323c0 != 1 || (this.v instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i9) != null) {
                                            user = (TLRPC.User) this.L.get(i9);
                                            Object obj = this.F.get(i9);
                                            if (user != null) {
                                                str2 = UserObject.getPublicUsername(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.F.get(i9));
                                        }
                                    } else {
                                        str = (String) this.F.get(i9);
                                    }
                                    ArrayList arrayList10 = this.M;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i9)).booleanValue()) {
                                        if (user != null) {
                                            j10 = user.f22527id;
                                        } else {
                                            j10 = 0;
                                        }
                                        return new c1(str, j10);
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
        int i9;
        int size;
        int i10;
        int i11 = 1;
        if (this.f19343s0 != null && !this.f19324d0) {
            return 1;
        }
        int i12 = 0;
        if (this.B != null) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        ArrayList arrayList = this.f19348w0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.P == null && this.Q == null) {
                    i11 = 0;
                }
                return size2 + i11 + i9;
            }
            ArrayList arrayList3 = this.f19349x;
            if (arrayList3 != null) {
                i10 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.E;
                if (arrayList4 != null) {
                    i10 = arrayList4.size();
                } else if (this.F == null && this.I == null) {
                    ArrayList arrayList5 = this.J;
                    if (arrayList5 != null) {
                        i10 = arrayList5.size();
                    } else {
                        return i9;
                    }
                } else {
                    ArrayList arrayList6 = this.I;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.F;
                    if (arrayList7 != null) {
                        i12 = arrayList7.size();
                    }
                    i10 = size + i12;
                }
            }
        }
        return i10 + i9;
    }

    public final Object L(int i9) {
        if (this.B != null) {
            if (i9 < 2) {
                return null;
            }
            i9 -= 2;
        }
        ArrayList arrayList = this.f19348w0;
        if (arrayList == null || i9 < 0 || i9 >= arrayList.size()) {
            return null;
        }
        return ((e1) this.f19348w0.get(i9)).f19283b;
    }

    public final int M(int i9) {
        if (this.B != null) {
            if (i9 < 2) {
                return 0;
            }
            i9 -= 2;
        }
        if (this.N != null) {
            if (this.P != null || this.Q != null) {
                return i9 - 1;
            }
            return i9;
        }
        return i9;
    }

    public final boolean N() {
        if (this.f19348w0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        w0 w0Var = this.E0;
        if (w0Var != null) {
            w0Var.stop();
        }
        x0 x0Var = this.f19345u0;
        if (x0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x0Var);
            this.f19345u0 = null;
        }
        if (this.f19338p0 != 0) {
            ConnectionsManager.getInstance(this.f19327f).cancelRequest(this.f19338p0, true);
            this.f19338p0 = 0;
        }
        if (this.f19339q0 != 0) {
            ConnectionsManager.getInstance(this.f19327f).cancelRequest(this.f19339q0, true);
            this.f19339q0 = 0;
        }
        this.f19343s0 = null;
        this.P = null;
        this.f19324d0 = true;
        this.m0 = null;
        this.f19336n0 = null;
        this.f19341r0 = false;
        NotificationCenter.getInstance(this.f19327f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f19327f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f19327f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f19327f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.f19343s0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f19346v0 = location;
            location.setLatitude(-1000.0d);
            this.f19346v0.setLongitude(-1000.0d);
            T(true, this.f19343s0, this.f19336n0, "");
        }
    }

    public final void R(TLRPC.User user) {
        qn qnVar;
        TLRPC.Chat chat;
        this.f19338p0 = 0;
        this.E0.stop();
        r90 r90Var = this.R;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f19343s0 = user;
            long j10 = user.f22527id;
            if (j10 != this.O) {
                this.P = null;
                this.O = j10;
            }
            qn qnVar2 = this.C0;
            if (qnVar2 != null && (chat = qnVar2.f41890e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.f19324d0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    r90Var.a(true);
                    return;
                }
            }
            if (this.f19343s0.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f19327f);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.f19343s0.f22527id, false) && (qnVar = this.C0) != null && qnVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f19343s0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(this, zArr, user2, 14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v3(6, this, zArr));
                    this.C0.showDialog(alertDialog$Builder.f22702a, new bg.j(4, this, zArr));
                } else {
                    G();
                }
            }
        } else {
            this.f19343s0 = null;
            this.P = null;
            this.f19324d0 = true;
        }
        if (this.f19343s0 == null) {
            this.f19341r0 = true;
            this.P = null;
            return;
        }
        if (r90Var != null) {
            r90Var.b(true);
        }
        T(true, this.f19343s0, this.f19336n0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: of.f1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.f19339q0 != 0) {
            ConnectionsManager.getInstance(this.f19327f).cancelRequest(this.f19339q0, true);
            this.f19339q0 = 0;
        }
        if (this.f19324d0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f19346v0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f19335n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f19335n);
                    sb2.append("_");
                    sb2.append(user.f22527id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f19346v0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f19346v0.getLongitude() + this.f19346v0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f19327f);
                    t0 t0Var = new t0(this, str, z10, user, str2, messagesStorage, sb3);
                    long j10 = user.f22527id;
                    if (j10 != this.O) {
                        this.P = null;
                        this.O = j10;
                    }
                    if (z10) {
                        messagesStorage.getBotCache(sb3, t0Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f19327f).getInputUser(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f19346v0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f19346v0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f19346v0.getLongitude());
                    }
                    if (DialogObject.isEncryptedDialog(this.f19335n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f19327f).getInputPeer(this.f19335n);
                    }
                    this.f19339q0 = ConnectionsManager.getInstance(this.f19327f).sendRequest(tL_messages_getInlineBotResults, t0Var, 2);
                    return;
                }
                return;
            }
            this.f19336n0 = null;
            return;
        }
        r90 r90Var = this.R;
        if (r90Var != null) {
            r90Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r28, int r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: of.f1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f19322c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        qn qnVar;
        TLRPC.Chat chat;
        this.f19327f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f19324d0 && this.f19343s0 != null && (qnVar = this.C0) != null && (chat = qnVar.f41890e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.f19324d0 = canSendStickers;
            if (canSendStickers) {
                this.f19349x = null;
                l();
                this.R.a(false);
                R(this.f19343s0);
            }
        }
        String str = this.V;
        if (str != null) {
            U(str, this.Y, this.Z, this.X, this.W);
        }
    }

    public final void X(qn qnVar) {
        this.C0 = qnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.f19349x = arrayList;
        if (!this.d || !this.f19325e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f19325e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f22527id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f19351y = hVar;
        h3 h3Var = this.f19334l0;
        if (h3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h3Var);
            this.f19334l0 = null;
        }
        this.N = null;
        this.f19348w0 = null;
        if (z10) {
            l();
            this.R.a(!this.f19349x.isEmpty());
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        r0 r0Var;
        boolean z10 = false;
        if (i9 != NotificationCenter.fileLoaded && i9 != NotificationCenter.fileLoadFailed) {
            if (i9 == NotificationCenter.recentDocumentsDidLoad) {
                r0 r0Var2 = this.B0;
                if (r0Var2 != null) {
                    AndroidUtilities.runOnUIThread(r0Var2);
                    this.B0 = null;
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (r0Var = this.B0) != null) {
                AndroidUtilities.runOnUIThread(r0Var);
                this.B0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.f19348w0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f19352y0;
            if (!arrayList2.isEmpty() && this.f19333k0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z10 = true;
                    }
                    this.R.a(z10);
                }
            }
        }
    }

    @Override
    public final int h() {
        int K = K();
        this.H0 = K;
        return K;
    }

    @Override
    public final int j(int i9) {
        if (this.B != null) {
            if (i9 < 2) {
                return 6;
            }
            i9 -= 2;
        }
        if (this.f19348w0 != null) {
            return 4;
        }
        if (this.f19343s0 != null && !this.f19324d0) {
            return 3;
        }
        if (this.N != null) {
            if (i9 == 0) {
                if (this.P != null || this.Q != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && i9 >= 0 && i9 < arrayList.size()) {
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
        int i9 = this.H0;
        r90 r90Var = this.R;
        int i10 = 0;
        if (i9 != -1 && this.F0 != null) {
            int K = K();
            this.H0 = K;
            if (i9 != K) {
                z10 = true;
            } else {
                z10 = false;
            }
            int min = Math.min(i9, K);
            Object[] objArr = new Object[K];
            for (int i11 = 0; i11 < K; i11++) {
                objArr[i11] = J(i11);
            }
            while (i10 < min) {
                if (i10 >= 0) {
                    Object[] objArr2 = this.F0;
                    if (i10 < objArr2.length && i10 < K) {
                        Object obj = objArr2[i10];
                        Object obj2 = objArr[i10];
                        if (!(obj instanceof pf.q1)) {
                            if (obj != obj2 && ((!(obj instanceof e1) || !(obj2 instanceof e1) || ((e1) obj).f19282a != ((e1) obj2).f19282a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f22527id != ((TLRPC.User) obj2).f22527id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f22380id != ((TLRPC.Chat) obj2).f22380id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                }
                m(i10);
                z10 = true;
                i10++;
            }
            t(min, i9 - min);
            s(min, K - min);
            if (z10 && r90Var != null) {
                r90Var.c();
            }
            this.F0 = objArr;
            return;
        }
        if (r90Var != null) {
            this.H0 = K();
            r90Var.c();
        }
        super.l();
        int K2 = K();
        this.H0 = K2;
        this.F0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.F0;
            if (i10 < objArr3.length) {
                objArr3[i10] = J(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        String str;
        TLRPC.User user;
        qn qnVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str3 = this.B;
        if (str3 != null) {
            i10 = i9 - 2;
        } else {
            i10 = i9;
        }
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        Boolean bool = null;
        if (i11 == 4) {
            b8 b8Var = (b8) view;
            if (i10 >= 0 && i10 < this.f19348w0.size()) {
                e1 e1Var = (e1) this.f19348w0.get(i10);
                TLRPC.Document document = e1Var.f19282a;
                Object obj = e1Var.f19283b;
                zf.b1 b1Var = b8Var.f24149n;
                o9 o9Var = b8Var.f24144a;
                b8Var.f24146c = obj;
                boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
                b8Var.f24151s = isPremiumSticker;
                if (isPremiumSticker) {
                    b1Var.setColor(f6.w0(null, f6.f23001d6, false));
                    b1Var.D = true;
                    b1Var.E = false;
                    b1Var.invalidate();
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, f6.f22947a7, 1.0f, 1.0f, b8Var.v);
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (svgThumb != null) {
                        o9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, b8Var.f24146c);
                        f10 = 1.0f;
                    } else if (closestPhotoSizeWithSize != null) {
                        f10 = 1.0f;
                        o9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, b8Var.f24146c);
                    } else {
                        f10 = 1.0f;
                        o9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, b8Var.f24146c);
                    }
                } else {
                    f10 = 1.0f;
                    if (svgThumb != null) {
                        if (closestPhotoSizeWithSize != null) {
                            o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, b8Var.f24146c);
                        } else {
                            o9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, b8Var.f24146c);
                        }
                    } else {
                        o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, b8Var.f24146c);
                    }
                }
                b8Var.f24145b = document;
                Drawable background = b8Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    background.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.Be, false), PorterDuff.Mode.MULTIPLY));
                }
                if (b8Var.f24151s) {
                    b8Var.f24150r = true;
                } else {
                    b8Var.f24150r = false;
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
                    b1Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                }
                b1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
                AndroidUtilities.updateViewVisibilityAnimated(b1Var, b8Var.f24150r, 0.9f, false);
                b8Var.invalidate();
                b8Var.setClearsInputField(true);
            }
        } else if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.C0.f41890e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                }
            }
        } else if (i11 == 5) {
            pf.m1 m1Var = (pf.m1) view;
            ArrayList arrayList = this.I;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                m1Var.a((pf.q1) this.I.get(i10), this.H, false);
            }
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
                if (tL_inlineBotSwitchPM == null && this.Q == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i11 == 2) {
                    if (z10) {
                        org.telegram.ui.Cells.i0 i0Var = (org.telegram.ui.Cells.i0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.Q.text;
                        }
                        i0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z10) {
                    i10--;
                }
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    e2 e2Var = (e2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.N.get(i10);
                    TLRPC.User user2 = this.f19343s0;
                    boolean z13 = this.f19344t0;
                    if (i10 != this.N.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && i10 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.m0));
                }
            } else if (i11 == 6) {
                d1 d1Var = (d1) view;
                int i12 = i10 + 2;
                if (i12 == 0) {
                    this.C = d1Var;
                } else {
                    this.D = d1Var;
                }
                TLRPC.Chat chat2 = this.f19330h0;
                if (chat2 == null && (qnVar = this.C0) != null) {
                    chat2 = qnVar.f41890e;
                }
                d1Var.a(i12, str3, chat2);
            } else if (i11 == 7) {
            } else {
                h5 h5Var = (h5) view;
                ArrayList arrayList3 = this.f19349x;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i10);
                    if (tLObject instanceof TLRPC.User) {
                        h5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        h5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        h5Var.setText((String) this.E.get(i10));
                    } else {
                        ArrayList arrayList5 = this.J;
                        if (arrayList5 != null && i10 >= 0 && i10 < arrayList5.size()) {
                            h5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.J.get(i10));
                        } else {
                            ArrayList arrayList6 = this.F;
                            if (arrayList6 != null && i10 >= 0 && i10 < arrayList6.size()) {
                                ArrayList arrayList7 = this.G;
                                if (arrayList7 != null && i10 >= 0 && i10 < arrayList7.size()) {
                                    str = (String) this.G.get(i10);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.L;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    user = (TLRPC.User) this.L.get(i10);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.M;
                                if (arrayList9 != null && i10 >= 0 && i10 < arrayList9.size()) {
                                    bool = (Boolean) this.M.get(i10);
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.F.get(i10);
                                bg.t tVar = h5Var.f24434b;
                                TextView textView2 = h5Var.f24435c;
                                z8 z8Var = h5Var.d;
                                o9 o9Var2 = h5Var.f24433a;
                                h5Var.a();
                                if (user != null) {
                                    o9Var2.setVisibility(0);
                                    z8Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        o9Var2.e(user, z8Var);
                                    } else {
                                        o9Var2.setImageDrawable(z8Var);
                                    }
                                } else {
                                    o9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    eq eqVar = new eq(R.drawable.mini_ephemeral_hidden_14, 0);
                                    eqVar.setColorKey(f6.A6);
                                    eqVar.setTopOffset(1);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    tVar.setText(spannableStringBuilder);
                                } else {
                                    tVar.setText(str4);
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
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        TextView textView;
        int i10;
        int v02;
        b6 b6Var = this.D0;
        Context context = this.h;
        if (i9 != 0) {
            if (i9 != 1) {
                int i11 = 5;
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 5) {
                            boolean z10 = this.f19342s;
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.v = b6Var;
                                    o9 o9Var = new o9(context);
                                    frameLayout.f24144a = o9Var;
                                    o9Var.setAspectFit(true);
                                    o9Var.setLayerNum(1);
                                    frameLayout.addView(o9Var, e6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    zf.b1 b1Var = new zf.b1(context, 1, null);
                                    frameLayout.f24149n = b1Var;
                                    b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    b1Var.setImageReceiver(o9Var.getImageReceiver());
                                    frameLayout.addView(b1Var, e6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View anVar = new an(context, 7);
                                    if (z10) {
                                        v02 = f6.l1(0.15f, -1);
                                    } else {
                                        v02 = f6.v0(f6.f22947a7, b6Var);
                                    }
                                    fq fqVar = new fq(new ColorDrawable(v02), f6.U0(context, R.drawable.greydivider, f6.v0(f6.f22966b7, b6Var)), 0, 0);
                                    fqVar.f28550w = true;
                                    anVar.setBackground(fqVar);
                                    view = anVar;
                                }
                            } else {
                                textView = new d1(context, b6Var, z10);
                            }
                        } else {
                            view = new pf.m1(context, b6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTextColor(f6.v0(f6.f23386z6, b6Var));
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f24497a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    textView3.setTextColor(f6.w0(null, f6.Ce, false));
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView3.setGravity(i10);
                    if (!LocaleController.isRTL) {
                        i11 = 3;
                    }
                    frameLayout2.addView(textView3, e6.d(-2, -2.0f, i11 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = frameLayout2;
                }
            } else {
                e2 e2Var = new e2(context);
                e2Var.setDelegate(new s0(this));
                textView = e2Var;
            }
            return new f2.q1(textView);
        }
        h5 h5Var = new h5(context, b6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        textView = view;
        return new f2.q1(textView);
    }
}
