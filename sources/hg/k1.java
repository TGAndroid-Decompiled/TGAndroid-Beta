package hg;

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
import bi.c4;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.x9;
import org.telegram.ui.co;
import w7.x5;
public final class k1 extends kl0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A0;
    public HashMap B0;
    public String D0;
    public f1 E;
    public int E0;
    public String F;
    public v0 F0;
    public i1 G;
    public co G0;
    public i1 H;
    public final f6 H0;
    public ArrayList I;
    public ArrayList J;
    public Object[] J0;
    public ArrayList K;
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
    public final ja0 V;
    public a0.i W;
    public int X;
    public int Y;
    public String Z;
    public boolean f11128a0;
    public boolean f11129b0;
    public int f11131c0;
    public ArrayList f11132d0;
    public int f11137g0;
    public final Context h;
    public int f11139i0;
    public int f11140j0;
    public boolean f11141k0;
    public TLRPC.Chat f11142l0;
    public long f11143n;
    public g1 f11144n0;
    public boolean f11145o0;
    public t f11146p0;
    public String f11147q0;
    public final long f11148r;
    public String f11149r0;
    public final boolean f11150s;
    public String f11151s0;
    public int f11152t0;
    public int f11153u0;
    public TLRPC.ChatFull v;
    public boolean f11154v0;
    public final b2 f11155w;
    public TLRPC.User f11156w0;
    public ArrayList f11157x;
    public boolean f11158x0;
    public a0.i f11159y;
    public b1 f11160y0;
    public Location f11161z0;
    public boolean f11130c = true;
    public boolean d = true;
    public boolean f11133e = true;
    public int f11135f = UserConfig.selectedAccount;
    public boolean f11134e0 = true;
    public boolean f11136f0 = true;
    public boolean f11138h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final a1 I0 = new a1(this, new z0(this));
    public boolean K0 = false;
    public int L0 = -1;

    public k1(Context context, long j3, long j10, ja0 ja0Var, f6 f6Var, boolean z10) {
        this.H0 = f6Var;
        this.h = context;
        this.V = ja0Var;
        this.f11143n = j3;
        this.f11150s = z10;
        this.f11148r = j10;
        b2 b2Var = new b2(true);
        this.f11155w = b2Var;
        b2Var.f10979a = new a6.m(this, 22);
        NotificationCenter.getInstance(this.f11135f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f11135f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f11135f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f11135f).addObserver(this, NotificationCenter.stickersDidLoad);
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
        if ((this.f11156w0 == null || this.f11138h0) && this.A0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f19875id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f11135f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new j1(document, str));
                this.B0.put(str2, document);
                g1 g1Var = this.f11144n0;
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
                String str2 = document.dc_id + "_" + document.f19875id;
                HashMap hashMap = this.B0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f11135f).isPremium() || !MessageObject.isPremiumSticker(document))) {
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
        co coVar = this.G0;
        if (coVar != null && coVar.getParentActivity() != null) {
            if (Build.VERSION.SDK_INT >= 23 && this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f11156w0;
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
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(j1Var.f11112a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f11135f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f11135f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, j1Var.f11112a), j1Var.f11113b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f11156w0;
        if (user != null && user.f20016id != this.S) {
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
                return ((j1) this.A0.get(i10)).f11112a;
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
                ArrayList arrayList3 = this.f11157x;
                if (arrayList3 != null) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f11157x.get(i10);
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
                                    if (arrayList9 != null && (this.f11137g0 != 1 || (this.v instanceof TLRPC.TL_channelFull))) {
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
                                            j3 = user.f20016id;
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
        if (this.f11156w0 != null && !this.f11138h0) {
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
            ArrayList arrayList3 = this.f11157x;
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
        return ((j1) this.A0.get(i10)).f11113b;
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
        b1 b1Var = this.f11160y0;
        if (b1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b1Var);
            this.f11160y0 = null;
        }
        if (this.f11152t0 != 0) {
            ConnectionsManager.getInstance(this.f11135f).cancelRequest(this.f11152t0, true);
            this.f11152t0 = 0;
        }
        if (this.f11153u0 != 0) {
            ConnectionsManager.getInstance(this.f11135f).cancelRequest(this.f11153u0, true);
            this.f11153u0 = 0;
        }
        this.f11156w0 = null;
        this.T = null;
        this.f11138h0 = true;
        this.f11147q0 = null;
        this.f11149r0 = null;
        this.f11154v0 = false;
        NotificationCenter.getInstance(this.f11135f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f11135f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f11135f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f11135f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.f11156w0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f11161z0 = location;
            location.setLatitude(-1000.0d);
            this.f11161z0.setLongitude(-1000.0d);
            T(true, this.f11156w0, this.f11149r0, "");
        }
    }

    public final void R(TLRPC.User user) {
        co coVar;
        TLRPC.Chat chat;
        this.f11152t0 = 0;
        this.I0.stop();
        ja0 ja0Var = this.V;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f11156w0 = user;
            long j3 = user.f20016id;
            if (j3 != this.S) {
                this.T = null;
                this.S = j3;
            }
            co coVar2 = this.G0;
            if (coVar2 != null && (chat = coVar2.f35237e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.f11138h0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    ja0Var.a(true);
                    return;
                }
            }
            if (this.f11156w0.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f11135f);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.f11156w0.f20016id, false) && (coVar = this.G0) != null && coVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f11156w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(this, zArr, user2, 9));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ah.i0(13, this, zArr));
                    this.G0.showDialog(alertDialog$Builder.f20198a, new fi.e0(this, zArr, 2));
                } else {
                    G();
                }
            }
        } else {
            this.f11156w0 = null;
            this.T = null;
            this.f11138h0 = true;
        }
        if (this.f11156w0 == null) {
            this.f11154v0 = true;
            this.T = null;
            return;
        }
        if (ja0Var != null) {
            ja0Var.b(true);
        }
        T(true, this.f11156w0, this.f11149r0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: hg.k1.S(java.lang.String, java.lang.String):void");
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.f11153u0 != 0) {
            ConnectionsManager.getInstance(this.f11135f).cancelRequest(this.f11153u0, true);
            this.f11153u0 = 0;
        }
        if (this.f11138h0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f11161z0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f11143n);
                    sb2.append("_");
                    sb2.append(str);
                    sb2.append("_");
                    sb2.append(str2);
                    sb2.append("_");
                    sb2.append(this.f11143n);
                    sb2.append("_");
                    sb2.append(user.f20016id);
                    sb2.append("_");
                    if (user.bot_inline_geo && this.f11161z0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f11161z0.getLongitude() + this.f11161z0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f11135f);
                    x0 x0Var = new x0(this, str, z10, user, str2, messagesStorage, sb3);
                    long j3 = user.f20016id;
                    if (j3 != this.S) {
                        this.T = null;
                        this.S = j3;
                    }
                    if (z10) {
                        messagesStorage.getBotCache(sb3, x0Var);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f11135f).getInputUser(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f11161z0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f11161z0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f11161z0.getLongitude());
                    }
                    if (DialogObject.isEncryptedDialog(this.f11143n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f11135f).getInputPeer(this.f11143n);
                    }
                    this.f11153u0 = ConnectionsManager.getInstance(this.f11135f).sendRequest(tL_messages_getInlineBotResults, x0Var, 2);
                    return;
                }
                return;
            }
            this.f11149r0 = null;
            return;
        }
        ja0 ja0Var = this.V;
        if (ja0Var != null) {
            ja0Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r27, int r28, java.util.ArrayList r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: hg.k1.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z10) {
        this.f11130c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        co coVar;
        TLRPC.Chat chat;
        this.f11135f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f11138h0 && this.f11156w0 != null && (coVar = this.G0) != null && (chat = coVar.f35237e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.f11138h0 = canSendStickers;
            if (canSendStickers) {
                this.f11157x = null;
                l();
                this.V.a(false);
                R(this.f11156w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.f11131c0, this.f11132d0, this.f11129b0, this.f11128a0);
        }
    }

    public final void X(co coVar) {
        this.G0 = coVar;
    }

    public final void Y(a0.i iVar, ArrayList arrayList, boolean z10) {
        this.f11157x = arrayList;
        if (!this.d || !this.f11133e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.f11133e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f20016id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f11159y = iVar;
        t tVar = this.f11146p0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.f11146p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z10) {
            l();
            this.V.a(!this.f11157x.isEmpty());
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
            if (!arrayList2.isEmpty() && this.f11145o0) {
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
        this.L0 = K;
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
        if (this.f11156w0 != null && !this.f11138h0) {
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
        int i10 = this.L0;
        ja0 ja0Var = this.V;
        int i11 = 0;
        if (i10 != -1 && this.J0 != null) {
            int K = K();
            this.L0 = K;
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
                    Object[] objArr2 = this.J0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof ig.a2)) {
                            if (obj != obj2 && ((!(obj instanceof j1) || !(obj2 instanceof j1) || ((j1) obj).f11112a != ((j1) obj2).f11112a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f20016id != ((TLRPC.User) obj2).f20016id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f19869id != ((TLRPC.Chat) obj2).f19869id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
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
            if (z10 && ja0Var != null) {
                ja0Var.c();
            }
            this.J0 = objArr;
            return;
        }
        if (ja0Var != null) {
            this.L0 = K();
            ja0Var.c();
        }
        super.l();
        int K2 = K();
        this.L0 = K2;
        this.J0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.J0;
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
        co coVar;
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
        int i12 = c1Var.f45742f;
        View view = c1Var.f45738a;
        Boolean bool = null;
        if (i12 == 4) {
            d8 d8Var = (d8) view;
            if (i11 >= 0 && i11 < this.A0.size()) {
                j1 j1Var = (j1) this.A0.get(i11);
                TLRPC.Document document = j1Var.f11112a;
                Object obj = j1Var.f11113b;
                sg.e1 e1Var = d8Var.f21755n;
                x9 x9Var = d8Var.f21750a;
                d8Var.f21752c = obj;
                boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
                d8Var.f21757s = isPremiumSticker;
                if (isPremiumSticker) {
                    e1Var.setColor(j6.w0(null, j6.f20663d6, false));
                    e1Var.H = true;
                    e1Var.I = false;
                    e1Var.invalidate();
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.f20607a7, 1.0f, 1.0f, d8Var.v);
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (svgThumb != null) {
                        x9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, d8Var.f21752c);
                        f7 = 1.0f;
                    } else if (closestPhotoSizeWithSize != null) {
                        f7 = 1.0f;
                        x9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, d8Var.f21752c);
                    } else {
                        f7 = 1.0f;
                        x9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, d8Var.f21752c);
                    }
                } else {
                    f7 = 1.0f;
                    if (svgThumb != null) {
                        if (closestPhotoSizeWithSize != null) {
                            x9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, d8Var.f21752c);
                        } else {
                            x9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, d8Var.f21752c);
                        }
                    } else {
                        x9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, d8Var.f21752c);
                    }
                }
                d8Var.f21751b = document;
                Drawable background = d8Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    background.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Be, false), PorterDuff.Mode.MULTIPLY));
                }
                if (d8Var.f21757s) {
                    d8Var.f21756r = true;
                } else {
                    d8Var.f21756r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int dp = AndroidUtilities.dp(24.0f);
                    layoutParams.width = dp;
                    layoutParams.height = dp;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                } else {
                    int dp2 = AndroidUtilities.dp(16.0f);
                    layoutParams.width = dp2;
                    layoutParams.height = dp2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    e1Var.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                }
                e1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
                AndroidUtilities.updateViewVisibilityAnimated(e1Var, d8Var.f21756r, 0.9f, false);
                d8Var.invalidate();
                d8Var.setClearsInputField(true);
            }
        } else if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.f35237e;
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
            ig.x1 x1Var = (ig.x1) view;
            ArrayList arrayList = this.M;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                x1Var.a((ig.a2) this.M.get(i11), this.L, false);
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
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.R.get(i11);
                    TLRPC.User user2 = this.f11156w0;
                    boolean z13 = this.f11158x0;
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
                    e2Var.e(botInlineResult, user2, z13, z11, z12, "gif".equals(this.f11147q0));
                }
            } else if (i12 == 6) {
                i1 i1Var = (i1) view;
                int i13 = i11 + 2;
                if (i13 == 0) {
                    this.G = i1Var;
                } else {
                    this.H = i1Var;
                }
                TLRPC.Chat chat2 = this.f11142l0;
                if (chat2 == null && (coVar = this.G0) != null) {
                    chat2 = coVar.f35237e;
                }
                i1Var.a(i13, str3, chat2);
            } else if (i12 == 7) {
            } else {
                g5 g5Var = (g5) view;
                ArrayList arrayList3 = this.f11157x;
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
                                c4 c4Var = g5Var.f21973b;
                                TextView textView2 = g5Var.f21974c;
                                i9 i9Var = g5Var.d;
                                x9 x9Var2 = g5Var.f21972a;
                                g5Var.a();
                                if (user != null) {
                                    x9Var2.setVisibility(0);
                                    i9Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        x9Var2.e(user, i9Var);
                                    } else {
                                        x9Var2.setImageDrawable(i9Var);
                                    }
                                } else {
                                    x9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    nq nqVar = new nq(R.drawable.mini_ephemeral_hidden_14, 0);
                                    nqVar.setColorKey(j6.A6);
                                    nqVar.setTopOffset(1);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    c4Var.setText(spannableStringBuilder);
                                } else {
                                    c4Var.setText(str4);
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        TextView textView;
        int i11;
        int v02;
        f6 f6Var = this.H0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                int i12 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            boolean z10 = this.f11150s;
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.v = f6Var;
                                    x9 x9Var = new x9(context);
                                    frameLayout.f21750a = x9Var;
                                    x9Var.setAspectFit(true);
                                    x9Var.setLayerNum(1);
                                    frameLayout.addView(x9Var, x5.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    sg.e1 e1Var = new sg.e1(context, 1, null);
                                    frameLayout.f21755n = e1Var;
                                    e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    e1Var.setImageReceiver(x9Var.getImageReceiver());
                                    frameLayout.addView(e1Var, x5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View jnVar = new jn(context, 6);
                                    if (z10) {
                                        v02 = j6.l1(0.15f, -1);
                                    } else {
                                        v02 = j6.v0(j6.f20607a7, f6Var);
                                    }
                                    oq oqVar = new oq(new ColorDrawable(v02), j6.U0(context, R.drawable.greydivider, j6.v0(j6.f20627b7, f6Var)), 0, 0);
                                    oqVar.f29167w = true;
                                    jnVar.setBackground(oqVar);
                                    view = jnVar;
                                }
                            } else {
                                textView = new i1(context, f6Var, z10);
                            }
                        } else {
                            view = new ig.x1(context, f6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTextColor(j6.v0(j6.f21061z6, f6Var));
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f22070a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    textView3.setTextColor(j6.w0(null, j6.Ce, false));
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
                    frameLayout2.addView(textView3, x5.d(-2, -2.0f, i12 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context);
                e2Var.setDelegate(new w0(this));
                textView = e2Var;
            }
            return new s4.c1(textView);
        }
        g5 g5Var = new g5(context, f6Var);
        g5Var.setIsDarkTheme(false);
        view = g5Var;
        textView = view;
        return new s4.c1(textView);
    }
}
