package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LruCache;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.OpenAttachedMenuBotReceiver;
import org.telegram.messenger.OpenChatReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.WalletEngine2;
public final class hq6 extends pf0 {
    public static final Pattern U1 = Pattern.compile("\\*\\*(.+?)\\*\\*");
    public static final Pattern V1 = Pattern.compile("__(.+?)__");
    public static final Pattern W1 = Pattern.compile("\\|\\|(.+?)\\|\\|");
    public static final Pattern X1 = Pattern.compile("~~(.+?)~~");
    public static final String Y1 = "org.telegram.messenger.SHORTCUT_SHARE";
    public static volatile hq6[] Z1 = new hq6[4];
    public static final Object[] a2 = new Object[4];
    public static Paint b2;
    public static Paint c2;
    public static RectF d2;
    public static Path e2;
    public static final boolean f2;
    public static final el6 g2;
    public static final Pattern h2;
    public final ij9 A0;
    public final HashMap A1;
    public final ArrayList B0;
    public final vf6 B1;
    public final ArrayList C0;
    public final HashMap C1;
    public boolean D0;
    public final HashSet D1;
    public TLRPC.TL_help_premiumPromo E;
    public final long[] E0;
    public boolean E1;
    public boolean F;
    public final ArrayList[] F0;
    public final ArrayList F1;
    public int G;
    public final Long[] G0;
    public final ArrayList G1;
    public final ArrayList[] H;
    public final boolean[] H0;
    public final ArrayList H1;
    public final vf6[] I;
    public final boolean[] I0;
    public boolean I1;
    public final vf6 J;
    public final HashSet J0;
    public boolean J1;
    public final vf6 K;
    public boolean K0;
    public boolean K1;
    public final ArrayList L;
    public final HashMap L0;
    public boolean L1;
    public final ArrayList M;
    public int M0;
    public TLRPC.TL_emojiList M1;
    public final vf6 N;
    public int N0;
    public TLRPC.TL_emojiList N1;
    public final ConcurrentHashMap O;
    public long O0;
    public TLRPC.TL_emojiList O1;
    public TLRPC.TL_messages_stickerSet P;
    public long P0;
    public TLRPC.TL_emojiList P1;
    public TLRPC.TL_messages_stickerSet Q;
    public long Q0;
    public boolean Q1;
    public final HashMap R;
    public h19 R0;
    public final vf6 R1;
    public final vf6 S;
    public int S0;
    public final HashMap S1;
    public final HashSet T;
    public int T0;
    public final LruCache T1;
    public final vf6 U;
    public TLRPC.User U0;
    public final Runnable[] V;
    public TLRPC.Chat V0;
    public final boolean[] W;
    public int W0;
    public final boolean[] X;
    public final int[] X0;
    public final long[] Y;
    public final boolean[] Y0;
    public final int[] Z;
    public final ArrayList Z0;
    public long a;
    public final HashMap a0;
    public final ArrayList a1;
    public TLRPC.TL_attachMenuBots b;
    public final HashMap b0;
    public ArrayList b1;
    public boolean c;
    public final int[] c0;
    public final SparseArray[] c1;
    public boolean d;
    public vf6 d0;
    public final ArrayList d1;
    public int e;
    public HashMap e0;
    public String e1;
    public int f;
    public HashMap f0;
    public int f1;
    public final ArrayList[] g0;
    public boolean g1;
    public final ArrayList h;
    public final boolean[] h0;
    public boolean h1;
    public final boolean[] i0;
    public boolean i1;
    public ArrayList j0;
    public ArrayList j1;
    public boolean k0;
    public ArrayList k1;
    public boolean l0;
    public ArrayList l1;
    public boolean m0;
    public ArrayList m1;
    public final ArrayList n;
    public boolean n0;
    public boolean n1;
    public boolean o0;
    public boolean o1;
    public boolean p0;
    public final HashMap p1;
    public final long[] q0;
    public final vf6 q1;
    public final HashMap r;
    public final int[] r0;
    public final vf6 r1;
    public String s;
    public boolean s0;
    public SharedPreferences s1;
    public final ArrayList[] t0;
    public final vf6 t1;
    public final vf6[] u0;
    public final vf6 u1;
    public final ArrayList[] v0;
    public final vf6 v1;
    public boolean w;
    public final ArrayList[] w0;
    public final SharedPreferences w1;
    public int x;
    public final boolean[] x0;
    public boolean x1;
    public boolean y;
    public final boolean[] y0;
    public final HashMap y1;
    public TLRPC.Document z0;
    public final vf6 z1;

    static {
        for (int i = 0; i < 4; i++) {
            a2[i] = new Object();
        }
        f2 = true;
        g2 = new el6((byte) 3);
        h2 = Pattern.compile("(?<![A-Za-z0-9_+/=:-])(?:-?[0-9]{1,10}:[0-9a-fA-F]{64}|[A-Za-z0-9_+/-]{48})(?![A-Za-z0-9_+/=:-])");
    }

    public hq6(int i) {
        super(i);
        SharedPreferences k;
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z;
        int i2;
        long j;
        this.b = new TLRPC.TL_attachMenuBots();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.H = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(0), new ArrayList(), new ArrayList(), new ArrayList()};
        this.I = new vf6[]{new vf6(), new vf6(), new vf6(), new vf6(), new vf6(), new vf6()};
        this.J = new vf6();
        this.K = new vf6();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new vf6();
        this.O = new ConcurrentHashMap(100, 1.0f, 1);
        this.P = null;
        this.Q = null;
        this.R = new HashMap();
        this.S = new vf6();
        this.T = new HashSet();
        this.U = new vf6();
        this.V = new Runnable[7];
        this.W = new boolean[7];
        this.X = new boolean[7];
        this.Y = new long[7];
        this.Z = new int[7];
        this.a0 = new HashMap();
        this.b0 = new HashMap();
        this.c0 = new int[7];
        this.d0 = new vf6();
        this.e0 = new HashMap();
        this.f0 = new HashMap();
        this.g0 = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        this.h0 = new boolean[9];
        this.i0 = new boolean[9];
        this.j0 = new ArrayList();
        this.q0 = new long[2];
        this.r0 = new int[2];
        this.t0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.u0 = new vf6[]{new vf6(), new vf6()};
        this.v0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.w0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.x0 = new boolean[2];
        this.y0 = new boolean[2];
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.E0 = new long[4];
        this.F0 = new ArrayList[4];
        this.G0 = new Long[4];
        this.H0 = new boolean[4];
        this.I0 = new boolean[4];
        this.J0 = new HashSet();
        this.L0 = new HashMap();
        this.X0 = new int[]{0, 0};
        this.Y0 = new boolean[]{false, false};
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.d1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.p1 = new HashMap();
        this.q1 = new vf6();
        this.r1 = new vf6();
        this.t1 = new vf6();
        this.u1 = new vf6();
        this.v1 = new vf6();
        this.y1 = new HashMap();
        this.z1 = new vf6();
        this.A1 = new HashMap();
        this.B1 = new vf6();
        this.C1 = new HashMap();
        this.D1 = new HashSet();
        this.E1 = false;
        this.F1 = new ArrayList();
        this.G1 = new ArrayList();
        this.H1 = new ArrayList();
        this.Q1 = false;
        this.R1 = new vf6();
        this.S1 = new HashMap();
        this.T1 = new LruCache(25);
        if (this.currentAccount == 0) {
            k = a.b.getSharedPreferences("drafts", 0);
            this.w1 = k;
        } else {
            k = oo1.k(new StringBuilder("drafts"), this.currentAccount, a.b, 0);
            this.w1 = k;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : k.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.A(key).longValue();
                serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (!key.startsWith("r_")) {
                z = key.startsWith("rt_");
                if (!z) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        vf6 vf6Var = (vf6) this.u1.f(longValue);
                        if (vf6Var == null) {
                            vf6Var = new vf6();
                            this.u1.k(vf6Var, longValue);
                        }
                        if (key.startsWith("t_")) {
                            j = Utilities.A(key.substring(key.lastIndexOf(95) + 1)).longValue();
                        } else {
                            j = 0;
                        }
                        vf6Var.k(TLdeserialize, j);
                    }
                    serializedData.cleanup();
                }
            } else {
                z = false;
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().n);
                vf6 vf6Var2 = (vf6) this.v1.f(longValue);
                if (vf6Var2 == null) {
                    vf6Var2 = new vf6();
                    this.v1.k(vf6Var2, longValue);
                }
                if (z) {
                    i2 = Utilities.z(key.substring(key.lastIndexOf(95) + 1)).intValue();
                } else {
                    i2 = 0;
                }
                vf6Var2.k(TLdeserialize2, i2);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        if (!arrayList.isEmpty()) {
            getMessagesStorage().a.c(new yo6(this, arrayList, (byte) 1));
        }
        d1("tg_placeholders_android", false, true);
        SharedPreferences k2 = oo1.k(new StringBuilder("emojithemes_config_"), this.currentAccount, a.b, 0);
        int i3 = k2.getInt("count", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new wd2(jy3.b(this.currentAccount)));
        for (int i4 = 0; i4 < i3; i4++) {
            SerializedData serializedData2 = new SerializedData(Utilities.v(k2.getString("theme_" + i4, "")));
            try {
                jy3 c = jy3.c(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true));
                if (c.f.size() >= 4) {
                    arrayList2.add(new wd2(c));
                }
                je2.s.c(new tq4(this, arrayList2, false, (byte) 9));
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        W0(false);
        H0(false);
        H0(true);
        this.A0 = new ij9(this.currentAccount);
        this.e = getMessagesController().X3.getInt("menuBotsUpdateDate", 0);
    }

    public static boolean A(int r5, java.util.ArrayList r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.A(int, java.util.ArrayList, boolean):boolean");
    }

    public static boolean A0(TL_aicompose.inputAiComposeStyle inputaicomposestyle) {
        if (inputaicomposestyle != null) {
            if (inputaicomposestyle.tone != null || !TextUtils.isEmpty(inputaicomposestyle.to_lang) || inputaicomposestyle.emojify) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean B0(int i, long j) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i == 0) {
                str = "sdid_";
            } else {
                str = "bdid_";
            }
            String n = ls6.n(j, str);
            List k = tga.k(a.b);
            for (int i2 = 0; i2 < k.size(); i2++) {
                if (((oga) k.get(i2)).b.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharacterStyle L(CharacterStyle characterStyle, vib vibVar, vib vibVar2, boolean z) {
        vib vibVar3 = new vib(vibVar);
        if (vibVar2 != null) {
            if (z) {
                vibVar3.b(vibVar2);
            } else {
                vibVar3.a = vibVar2.a;
                vibVar3.d = vibVar2.d;
            }
        }
        if (characterStyle instanceof wib) {
            return new wib(vibVar3, 0);
        }
        if (characterStyle instanceof i4c) {
            return new i4c(((i4c) characterStyle).getURL(), vibVar3);
        }
        return null;
    }

    public static boolean M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
            TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList2.get(i);
            if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language) || (((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) || (((messageEntity instanceof TLRPC.TL_messageEntityMentionName) && ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) || ((messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id != ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id)))) {
                return false;
            }
        }
        return true;
    }

    public static void N1(ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public static ArrayList V0(SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i);
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("object_" + i2, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
        }
        return arrayList;
    }

    public static void V1(SharedPreferences sharedPreferences, long j, ArrayList arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", arrayList.size());
        edit.putLong("hash", j);
        for (int i = 0; i < arrayList.size(); i++) {
            TLObject tLObject = (TLObject) arrayList.get(i);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i, Utilities.f(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static void a(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        gm[] gmVarArr;
        gm gmVar;
        if (arrayList != null) {
            Spannable spannable = (Spannable) charSequence;
            for (gm gmVar2 : (gm[]) spannable.getSpans(0, spannable.length(), gm.class)) {
                if (gmVar2 != null) {
                    spannable.removeSpan(gmVar2);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i2 = messageEntity.offset;
                    int i3 = messageEntity.length + i2;
                    if (i2 < i3 && i3 <= spannable.length()) {
                        if (tL_messageEntityCustomEmoji.document != null) {
                            gmVar = new gm(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                        } else {
                            gmVar = new gm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                        }
                        spannable.setSpan(gmVar, i2, i3, 33);
                    }
                }
            }
        }
    }

    public static TLRPC.TL_inputStickerSetID b0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            return tL_inputStickerSetID;
        }
        return null;
    }

    public static TLRPC.TL_inputStickerSetItem c0(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static hq6 d0(int i) {
        hq6 hq6Var;
        hq6 hq6Var2 = Z1[i];
        if (hq6Var2 == null) {
            synchronized (a2) {
                hq6Var = Z1[i];
                if (hq6Var == null) {
                    hq6[] hq6VarArr = Z1;
                    hq6 hq6Var3 = new hq6(i);
                    hq6VarArr[i] = hq6Var3;
                    hq6Var = hq6Var3;
                }
            }
            return hq6Var;
        }
        return hq6Var2;
    }

    public static void e(int i, int i2, int i3, ArrayList arrayList) {
        if ((i & 256) != 0) {
            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
            tL_messageEntitySpoiler.offset = i2;
            tL_messageEntitySpoiler.length = i3 - i2;
            arrayList.add(tL_messageEntitySpoiler);
        }
        if ((i & 1) != 0) {
            TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
            tL_messageEntityBold.offset = i2;
            tL_messageEntityBold.length = i3 - i2;
            arrayList.add(tL_messageEntityBold);
        }
        if ((i & 2) != 0) {
            TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
            tL_messageEntityItalic.offset = i2;
            tL_messageEntityItalic.length = i3 - i2;
            arrayList.add(tL_messageEntityItalic);
        }
        if ((i & 4) != 0) {
            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode.offset = i2;
            tL_messageEntityCode.length = i3 - i2;
            arrayList.add(tL_messageEntityCode);
        }
        if ((i & 8) != 0) {
            TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
            tL_messageEntityStrike.offset = i2;
            tL_messageEntityStrike.length = i3 - i2;
            arrayList.add(tL_messageEntityStrike);
        }
        if ((i & 16) != 0) {
            TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
            tL_messageEntityUnderline.offset = i2;
            tL_messageEntityUnderline.length = i3 - i2;
            arrayList.add(tL_messageEntityUnderline);
        }
    }

    public static void f(defpackage.wib r16, int r17, int r18, android.text.Spannable r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.f(wib, int, int, android.text.Spannable, boolean):void");
    }

    public static CharSequence f2(int i, int i2, CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i, i2);
        }
        if (charSequence instanceof SpannedString) {
            return ((SpannedString) charSequence).subSequence(i, i2);
        }
        return TextUtils.substring(charSequence, i, i2);
    }

    public static void g(k27 k27Var, Spannable spannable) {
        h(k27Var.k.entities, k27Var.v, spannable, -1);
    }

    public static void h(ArrayList arrayList, CharSequence charSequence, Spannable spannable, int i) {
        int i2;
        ArrayList arrayList2;
        ArrayList u0;
        int i3;
        int i4;
        int i5;
        int i6;
        for (wib wibVar : (wib[]) spannable.getSpans(0, spannable.length(), wib.class)) {
            spannable.removeSpan(wibVar);
        }
        int i7 = 1;
        int i8 = 100;
        if (arrayList != null && arrayList.size() > 100) {
            u0 = u0(arrayList, charSequence, i);
            i2 = 1;
        } else {
            if (arrayList != null && !arrayList.isEmpty() && charSequence != null && charSequence.length() != 0 && arrayList.size() <= 1000) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i9);
                    if (messageEntity != null) {
                        arrayList3.add(messageEntity);
                    }
                }
                Collections.sort(arrayList3, new el6((byte) 7));
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i10 = 0;
                int i11 = 0;
                loop3: while (true) {
                    if (i10 < size2) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i10);
                        if (messageEntity2.length > 0 && (i5 = messageEntity2.offset) >= 0 && i5 < charSequence.length() && !(messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            ?? obj = new Object();
                            int i12 = messageEntity2.offset;
                            obj.b = i12;
                            obj.c = Math.min(messageEntity2.length, charSequence.length() - obj.b) + i12;
                            if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                                i6 = 256;
                                obj.a = 256;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                                i6 = 8;
                                obj.a = 8;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                                i6 = 16;
                                obj.a = 16;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                                obj.a = i7;
                                i6 = i7;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                                i6 = 2;
                                obj.a = 2;
                            } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                                if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                    obj.a = 64;
                                    obj.d = messageEntity2;
                                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    obj.a = 64;
                                    obj.d = messageEntity2;
                                } else {
                                    i6 = 128;
                                    obj.a = 128;
                                    obj.d = messageEntity2;
                                }
                                i6 = 64;
                            } else {
                                i6 = 4;
                                obj.a = 4;
                            }
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                i6 |= 1024;
                                obj.a = i6;
                            }
                            obj.a = i6 & i;
                            int size3 = arrayList4.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size3) {
                                    i11++;
                                    if (i11 > 10000) {
                                        i2 = i7;
                                        break loop3;
                                    }
                                    vib vibVar = (vib) arrayList4.get(i13);
                                    int i14 = obj.b;
                                    i2 = i7;
                                    int i15 = vibVar.b;
                                    if (i14 > i15) {
                                        int i16 = vibVar.c;
                                        if (i14 >= i16) {
                                            continue;
                                        } else if (obj.c < i16) {
                                            if (arrayList4.size() > 98) {
                                                break loop3;
                                            }
                                            vib vibVar2 = new vib(obj);
                                            vibVar2.b(vibVar);
                                            arrayList4.add(i13 + 1, vibVar2);
                                            vib vibVar3 = new vib(vibVar);
                                            vibVar3.b = obj.c;
                                            i13 += 2;
                                            arrayList4.add(i13, vibVar3);
                                            size3 += 2;
                                            int i17 = obj.b;
                                            obj.b = vibVar.c;
                                            vibVar.c = i17;
                                        } else if (arrayList4.size() >= i8) {
                                            break loop3;
                                        } else {
                                            vib vibVar4 = new vib(obj);
                                            vibVar4.b(vibVar);
                                            vibVar4.c = vibVar.c;
                                            i13++;
                                            arrayList4.add(i13, vibVar4);
                                            size3++;
                                            int i172 = obj.b;
                                            obj.b = vibVar.c;
                                            vibVar.c = i172;
                                        }
                                        i13++;
                                        i7 = i2;
                                        i8 = 100;
                                    } else {
                                        int i18 = obj.c;
                                        if (i15 >= i18) {
                                            continue;
                                        } else {
                                            int i19 = vibVar.c;
                                            if (i18 == i19) {
                                                vibVar.b(obj);
                                            } else if (i18 < i19) {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                vib vibVar5 = new vib(vibVar);
                                                vibVar5.b(obj);
                                                vibVar5.c = obj.c;
                                                i13++;
                                                arrayList4.add(i13, vibVar5);
                                                size3++;
                                                vibVar.b = obj.c;
                                            } else if (arrayList4.size() >= 100) {
                                                break loop3;
                                            } else {
                                                vib vibVar6 = new vib(obj);
                                                vibVar6.b = vibVar.c;
                                                i13++;
                                                arrayList4.add(i13, vibVar6);
                                                size3++;
                                                vibVar.b(obj);
                                            }
                                            obj.c = i15;
                                        }
                                        i13++;
                                        i7 = i2;
                                        i8 = 100;
                                    }
                                } else {
                                    i2 = i7;
                                    if (obj.b < obj.c) {
                                        i4 = 100;
                                        if (arrayList4.size() >= 100) {
                                            break;
                                        }
                                        arrayList4.add(obj);
                                    } else {
                                        i4 = 100;
                                    }
                                }
                            }
                        } else {
                            i2 = i7;
                            i4 = i8;
                        }
                        i10++;
                        i8 = i4;
                        i7 = i2;
                    } else {
                        i2 = i7;
                        int size4 = arrayList4.size();
                        for (int i20 = 0; i20 < size4; i20++) {
                            vib vibVar7 = (vib) arrayList4.get(i20);
                            int i21 = vibVar7.b;
                            if (i21 >= 0 && i21 < (i3 = vibVar7.c) && i3 <= charSequence.length()) {
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                }
            } else {
                i2 = 1;
                arrayList2 = new ArrayList();
            }
            if (arrayList2 != null) {
                u0 = arrayList2;
            } else {
                u0 = u0(arrayList, charSequence, i);
            }
        }
        for (int i22 = 0; i22 < Math.min(1000, u0.size()); i22++) {
            vib vibVar8 = (vib) u0.get(i22);
            f(new wib(vibVar8, 0), vibVar8.b, vibVar8.c, spannable, i2);
        }
    }

    public static int h0(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia n1 = k27.n1(message);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return 8;
        }
        if (n1 instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        if (n1 instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = n1.document;
            if (document == null) {
                return -1;
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    z = documentAttribute.round_message;
                    z3 = !z;
                    z2 = z;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z4 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    z = documentAttribute.voice;
                    z6 = !z;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    z5 = true;
                }
            }
            if (!z && !z2) {
                if (z3 && !z4 && !z5) {
                    return 0;
                }
                if (z5) {
                    return -1;
                }
                if (z4) {
                    return 5;
                }
                if (!z6) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }
        if (!message.entities.isEmpty()) {
            for (int i2 = 0; i2 < message.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i2);
                if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static void i(TLRPC.DraftMessage draftMessage, SpannableString spannableString) {
        h(draftMessage.entities, draftMessage.message, spannableString, 264);
    }

    public static boolean j(TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        if (!A0(inputaicomposestyle) && !A0(inputaicomposestyle2)) {
            if (inputaicomposestyle.emojify != inputaicomposestyle2.emojify || !TextUtils.equals(inputaicomposestyle.to_lang, inputaicomposestyle2.to_lang) || !TL_aicompose.InputAiComposeTone.equals(inputaicomposestyle.tone, inputaicomposestyle2.tone)) {
                return false;
            }
            return true;
        } else if (A0(inputaicomposestyle) != A0(inputaicomposestyle2)) {
            return false;
        } else {
            return true;
        }
    }

    public static CharSequence k1(CharSequence charSequence, Pattern pattern, ArrayList arrayList, js4 js4Var) {
        boolean z;
        TLRPC.MessageEntity messageEntity;
        URLSpan[] uRLSpanArr;
        String str = charSequence;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        int i2 = 0;
        while (i <= matcher.regionEnd() && matcher.find(i)) {
            String group = matcher.group(1);
            if ((str instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) str).getSpans(matcher.start() - i2, matcher.end() - i2, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                messageEntity = null;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i3);
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode)) {
                        if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress)) {
                            int i4 = messageEntity2.offset + messageEntity2.length;
                            if (!gl.z1(matcher.start() - i2, matcher.start(1) - i2, messageEntity2.offset, i4)) {
                                if (!gl.z1(matcher.end(1) - i2, matcher.end() - i2, messageEntity2.offset, i4)) {
                                    continue;
                                } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && i4 == matcher.end() - i2 && matcher.end(1) - i2 > messageEntity2.offset) {
                                    messageEntity = messageEntity2;
                                }
                            }
                            z = false;
                            break;
                        }
                    } else {
                        int i5 = messageEntity2.offset;
                        if (gl.z1(matcher.start() - i2, matcher.end() - i2, i5, messageEntity2.length + i5)) {
                            z = false;
                            break;
                        }
                    }
                }
            } else {
                messageEntity = null;
            }
            if (z) {
                str = ((Object) str.subSequence(0, matcher.start() - i2)) + group + ((Object) str.subSequence(matcher.end() - i2, str.length()));
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) js4Var.m(null);
                messageEntity3.offset = matcher.start() - i2;
                int length = group.length();
                messageEntity3.length = length;
                int i6 = messageEntity3.offset;
                int i7 = length + i6;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i8);
                    int i9 = messageEntity4.offset;
                    if (i9 > i7) {
                        messageEntity4.offset = i9 - 4;
                    } else if (i9 > i6) {
                        messageEntity4.offset = i9 - 2;
                    }
                }
                if (messageEntity != null) {
                    messageEntity.length -= matcher.end() - matcher.end(1);
                    String substring = matcher.group().substring(matcher.end(1) - matcher.start());
                    String str2 = messageEntity.url;
                    if (str2 != null && str2.endsWith(substring)) {
                        String str3 = messageEntity.url;
                        messageEntity.url = str3.substring(0, str3.length() - substring.length());
                    }
                }
                arrayList.add(messageEntity3);
                i2 += (matcher.end() - matcher.start()) - group.length();
                i = matcher.end();
            } else {
                i = matcher.start() + 1;
            }
        }
        return str;
    }

    public static TLRPC.TL_attachMenuBotIcon l0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("default_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static void n1(ImageReceiver imageReceiver, gl5 gl5Var, String str) {
        if (!e66.e(8200)) {
            return;
        }
        imageReceiver.w1 = "preload";
        imageReceiver.T(0);
        imageReceiver.d0(gl5Var, str, null, null, 0, 11);
    }

    public static long p(int i, ArrayList arrayList) {
        long j = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i, arrayList.size());
        for (int i2 = 0; i2 < min; i2++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i2);
            if (document != null) {
                j = r(j, document.id);
            }
        }
        return j;
    }

    public static long r(long j, long j2) {
        long j3 = j ^ (j >>> 21);
        long j4 = j3 ^ (j3 << 35);
        return (j4 ^ (j4 >>> 4)) + j2;
    }

    public static long r0(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetID)) {
                    return -1L;
                }
                return inputStickerSet.id;
            }
        }
        return -1L;
    }

    public static long s(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set;
                if (!stickerSet.archived) {
                    j = r(j, stickerSet.hash);
                }
            }
        }
        return j;
    }

    public static boolean t(TLRPC.Message message) {
        boolean z = message instanceof TLRPC.TL_message_secret;
        if (z && (((k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || k27.K4(message) || k27.t3(message)) && k27.n1(message).ttl_seconds != 0 && k27.n1(message).ttl_seconds <= 60)) {
            return false;
        }
        if ((!z && (message instanceof TLRPC.TL_message) && (((k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (k27.n1(message) instanceof TLRPC.TL_messageMediaDocument)) && k27.n1(message).ttl_seconds != 0)) || h0(message) == -1) {
            return false;
        }
        return true;
    }

    public static ArrayList u0(ArrayList arrayList, CharSequence charSequence, int i) {
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty() && charSequence != null && charSequence.length() != 0 && arrayList.size() <= 1000) {
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i5);
                if (messageEntity != null) {
                    arrayList3.add(messageEntity);
                }
            }
            Collections.sort(arrayList3, new el6((byte) 6));
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int[] iArr = new int[arrayList3.size() << 1];
            int size2 = arrayList3.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i7);
                if (messageEntity2.length > 0 && (i2 = messageEntity2.offset) >= 0 && i2 < charSequence.length()) {
                    int i8 = messageEntity2.offset;
                    int min = Math.min(messageEntity2.length, charSequence.length() - i8) + i8;
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        ?? obj = new Object();
                        obj.b = i8;
                        obj.c = min;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                            i3 = 256;
                            obj.a = 256;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                            i3 = 8;
                            obj.a = 8;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                            i3 = 16;
                            obj.a = 16;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                            obj.a = 1;
                            i3 = 1;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                            i3 = 2;
                            obj.a = 2;
                        } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                obj.a = 64;
                                obj.d = messageEntity2;
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                obj.a = 64;
                                obj.d = messageEntity2;
                            } else {
                                i3 = 128;
                                obj.a = 128;
                                obj.d = messageEntity2;
                            }
                            i3 = 64;
                        } else {
                            i3 = 4;
                            obj.a = 4;
                        }
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            i3 |= 1024;
                            obj.a = i3;
                        }
                        obj.a = i3 & i;
                        arrayList4.add(obj);
                        int i9 = i6 + 1;
                        iArr[i6] = i8;
                        i6 += 2;
                        iArr[i9] = min;
                    }
                }
            }
            if (i6 != 0) {
                Arrays.sort(iArr, 0, i6);
                int i10 = 0;
                loop2: while (i10 < i6) {
                    int i11 = iArr[i10];
                    while (i10 < i6) {
                        int i12 = iArr[i10];
                        if (i12 == i11) {
                            i10++;
                        } else {
                            int size3 = arrayList4.size();
                            vib vibVar = null;
                            int i13 = Integer.MIN_VALUE;
                            int i14 = i4;
                            while (i14 < size3) {
                                vib vibVar2 = (vib) arrayList4.get(i14);
                                if (vibVar2.b <= i11) {
                                    vibVar = vibVar;
                                    if (vibVar2.c >= i12) {
                                        if (vibVar == null) {
                                            ?? obj2 = new Object();
                                            obj2.b = i11;
                                            obj2.c = i12;
                                            vibVar = obj2;
                                        }
                                        vibVar.a |= vibVar2.a;
                                        TLRPC.MessageEntity messageEntity3 = vibVar2.d;
                                        if (messageEntity3 != null && (vibVar.d == null || vibVar2.b > i13)) {
                                            vibVar.d = messageEntity3;
                                            i13 = vibVar2.b;
                                        }
                                    }
                                }
                                i14++;
                                vibVar = vibVar;
                            }
                            if (vibVar != null) {
                                if (!arrayList2.isEmpty()) {
                                    vib vibVar3 = (vib) b00.f(1, arrayList2);
                                    if (vibVar3.c == vibVar.b && vibVar3.a == vibVar.a && vibVar3.d == vibVar.d) {
                                        vibVar3.c = vibVar.c;
                                    }
                                }
                                if (arrayList2.size() >= 1000) {
                                    arrayList2.clear();
                                    return arrayList2;
                                }
                                arrayList2.add(vibVar);
                            }
                            i4 = 0;
                        }
                    }
                    break loop2;
                }
            }
        }
        return arrayList2;
    }

    public static boolean v(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat = null;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
        } else {
            user = null;
        }
        if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
        }
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i);
            i++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || user == null || !user.bot || user.id != tL_attachMenuBot.bot_id) {
                if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) || user == null || !user.bot || user.id == tL_attachMenuBot.bot_id) {
                    if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || user == null || user.bot) {
                        if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || chat == null || hc2.V(chat)) {
                            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && hc2.V(chat)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static String y0(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.id + "access_hash" + inputStickerSet.access_hash;
        } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
            return "short" + inputStickerSet.short_name;
        } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
            return "empty";
        } else {
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetAnimatedEmoji) {
                return "animatedEmoji";
            }
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiGenericAnimations) {
                return "emojiGenericAnimations";
            }
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) {
                return "emojiChannelDefaultStatuses";
            }
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetDice) {
                return "dice" + ((TLRPC.TL_inputStickerSetDice) inputStickerSet).emoticon;
            } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetPremiumGifts) {
                return "premiumGifts";
            } else {
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons) {
                    return "defaultTopicIcons";
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
                    return "emojiDefaultStatuses";
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetTonGifts) {
                    return "tonGifts";
                }
                return "null";
            }
        }
    }

    public final void A1(int i, ArrayList arrayList, boolean z, int i2, long j, Runnable runnable) {
        gl.d3(new sm3(this, i, (byte) 21));
        Utilities.d.c(new ao6(this, z, arrayList, i2, j, i, runnable));
    }

    public final void B() {
        if (getUserConfig().c0 != null) {
            String str = getUserConfig().c0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (!this.m0 && System.currentTimeMillis() - getUserConfig().g0 >= 86400000) {
            this.m0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xo6(this, (byte) 4));
        }
    }

    public final void B1(long j, long j2, TLRPC.DraftMessage draftMessage) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (draftMessage != null && (inputaicomposestyle = draftMessage.ai_style) != null) {
            F1(j, inputaicomposestyle);
        } else if (j2 == 0) {
            F1(j, null);
        }
    }

    public final void C() {
        if (!this.w && Math.abs((System.currentTimeMillis() / 1000) - this.x) >= 3600) {
            U0(true, null);
        }
    }

    public final boolean C0(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = this.g0;
            if (i >= arrayListArr[2].size()) {
                return false;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayListArr[2].get(i);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                return true;
            }
            i++;
        }
    }

    public final void C1(d dVar, boolean z, int i, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        d dVar2;
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.l(tL_messages_stickerSetInstallResultArchive.sets.get(i2).set.id);
        }
        E0(i, false);
        getNotificationCenter().k(kk7.X0, tL_messages_stickerSetInstallResultArchive.sets);
        if (dVar != null && dVar.getParentActivity() != null) {
            Activity parentActivity = dVar.getParentActivity();
            if (z) {
                dVar2 = dVar;
            } else {
                dVar2 = null;
            }
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
            ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
            boolean z2 = stickerSetCovered.set.masks;
            hd hdVar = alertDialog$Builder.a;
            if (z2) {
                alertDialog$Builder.d = true;
                hdVar.S = k96.M0(2131754128, null);
            } else {
                alertDialog$Builder.d = false;
                hdVar.S = k96.M0(2131754123, null);
            }
            alertDialog$Builder.c = new ArrayList(arrayList);
            alertDialog$Builder.e = dVar2;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(parentActivity);
            zkb.X(textView, bkb.F6, null);
            textView.setGravity(nme.y());
            textView.setTextSize(1, 16.0f);
            textView.setPadding(gl.L(23.0f), gl.L(10.0f), gl.L(23.0f), 0);
            if (stickerSetCovered.set.masks) {
                textView.setText(k96.M0(2131754129, null));
            } else {
                textView.setText(k96.M0(2131754124, null));
            }
            linearLayout.addView(textView, nme.o(-2, -2));
            o39 o39Var = new o39(parentActivity, null);
            hdVar.getContext();
            o39Var.setLayoutManager(new t26(1, false));
            o39Var.setAdapter(new w0b(alertDialog$Builder, parentActivity));
            o39Var.setVerticalScrollBarEnabled(false);
            o39Var.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
            o39Var.setGlowColor(-657673);
            linearLayout.addView(o39Var, nme.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.g(k96.M0(2131752029, null), new v0b((byte) 0));
            if (dVar2 != null) {
                alertDialog$Builder.j(k96.M0(2131745303, null), new hza(alertDialog$Builder, (byte) 2));
            }
            dVar.showDialog(hdVar);
        }
    }

    public final void D(int i) {
        if (!this.W[i]) {
            if (!this.X[i] || Math.abs((System.currentTimeMillis() / 1000) - this.Z[i]) >= 3600) {
                b1(i, true, false);
            }
        }
    }

    public final boolean D0(long j, boolean z) {
        if (this.K.h(j) >= 0 || (z && this.L.contains(Long.valueOf(j)))) {
            if (z && this.M.contains(Long.valueOf(j))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void D1(long j, long j2, cq6 cq6Var) {
        SharedPreferences k = oo1.k(new StringBuilder("2voicedrafts_"), this.currentAccount, a.b, 0);
        long hash = Objects.hash(Long.valueOf(j), Long.valueOf(j2));
        String str = hash + "";
        if (cq6Var == null) {
            k.edit().remove(str).apply();
            this.R1.l(hash);
            return;
        }
        k.edit().putString(str, cq6Var.toString()).apply();
        this.R1.k(cq6Var, hash);
    }

    public final void E() {
        if (getUserConfig().d0 != null) {
            String str = getUserConfig().d0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (!this.n0 && System.currentTimeMillis() - getUserConfig().h0 >= 86400000) {
            this.n0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xo6(this, (byte) 7));
        }
    }

    public final void E0(int i, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z) {
            int i2 = na7.q1(this.currentAccount).W3.getInt("archivedStickersCount" + i, -1);
            if (i2 == -1) {
                E0(i, false);
                return;
            }
            this.c0[i] = i2;
            getNotificationCenter().k(kk7.Y0, Integer.valueOf(i));
            return;
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.limit = 0;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        tL_messages_getArchivedStickers.masks = z2;
        if (i != 5) {
            z3 = false;
        }
        tL_messages_getArchivedStickers.emojis = z3;
        getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l12(this, i, (byte) 2));
    }

    public final void E1(TLRPC.TL_emojiStatus tL_emojiStatus) {
        ArrayList<TLRPC.EmojiStatus>[] arrayListArr = this.F0;
        if (arrayListArr[0] != null) {
            long j = tL_emojiStatus.document_id;
            int i = 0;
            while (i < arrayListArr[0].size()) {
                if ((arrayListArr[0].get(i) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) arrayListArr[0].get(i)).document_id == j) {
                    arrayListArr[0].remove(i);
                    i--;
                }
                i++;
            }
            arrayListArr[0].add(0, tL_emojiStatus);
            while (arrayListArr[0].size() > 50) {
                tb4.v(1, arrayListArr[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.E0[0];
            tL_emojiStatuses.statuses = arrayListArr[0];
            getMessagesStorage().a.c(new o94(this, 0, tL_emojiStatuses, (byte) 6));
        }
    }

    public final void F(long j, long j2, boolean z) {
        TLRPC.DraftMessage draftMessage;
        vf6 vf6Var = this.u1;
        vf6 vf6Var2 = (vf6) vf6Var.f(j);
        if (vf6Var2 != null) {
            draftMessage = (TLRPC.DraftMessage) vf6Var2.f(j2);
        } else {
            draftMessage = null;
        }
        if (draftMessage != null) {
            if (!z) {
                vf6 vf6Var3 = (vf6) vf6Var.f(j);
                if (vf6Var3 != null) {
                    vf6Var3.l(j2);
                    if (vf6Var3.m() == 0) {
                        vf6Var.l(j);
                    }
                }
                vf6 vf6Var4 = this.v1;
                vf6 vf6Var5 = (vf6) vf6Var4.f(j);
                if (vf6Var5 != null) {
                    vf6Var5.l(j2);
                    if (vf6Var5.m() == 0) {
                        vf6Var4.l(j);
                    }
                }
                int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                SharedPreferences sharedPreferences = this.w1;
                if (i == 0) {
                    sharedPreferences.edit().remove(String.valueOf(j)).remove("r_" + j).commit();
                    getMessagesController().Y4(null);
                    getNotificationCenter().k(kk7.r, new Object[0]);
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                StringBuilder o = ug8.o(j, "t_", "_");
                o.append(j2);
                SharedPreferences.Editor remove = edit.remove(o.toString());
                StringBuilder o2 = ug8.o(j, "rt_", "_");
                o2.append(j2);
                remove.remove(o2.toString()).commit();
                return;
            }
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo.reply_to_msg_id != 0) {
                    inputReplyTo.reply_to_msg_id = 0;
                } else {
                    return;
                }
            }
            draftMessage.flags &= -2;
            T1(j, j2, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true, null);
        }
    }

    public final void F0() {
        G0(false, true, null);
    }

    public final void F1(long j, TL_aicompose.inputAiComposeStyle inputaicomposestyle) {
        k();
        if (A0(inputaicomposestyle)) {
            inputaicomposestyle = null;
        }
        vf6 vf6Var = this.r1;
        if (j((TL_aicompose.inputAiComposeStyle) vf6Var.f(j), inputaicomposestyle)) {
            return;
        }
        SharedPreferences.Editor edit = k().edit();
        if (inputaicomposestyle == null) {
            vf6Var.l(j);
            edit.remove(String.valueOf(j));
        } else {
            vf6Var.k(inputaicomposestyle, j);
            try {
                SerializedData serializedData = new SerializedData(inputaicomposestyle.getObjectSize());
                inputaicomposestyle.serializeToStream(serializedData);
                edit.putString(String.valueOf(j), Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        edit.apply();
        getNotificationCenter().k(kk7.W5, Long.valueOf(j));
    }

    public final void G(boolean z) {
        this.u1.b();
        this.v1.b();
        this.t1.b();
        this.w1.edit().clear().commit();
        if (z) {
            getMessagesController().Y4(null);
            getNotificationCenter().k(kk7.r, new Object[0]);
        }
    }

    public final void G0(boolean z, boolean z2, vz4 vz4Var) {
        long j;
        this.c = true;
        if (z) {
            getMessagesStorage().a.c(new un6(this, (byte) 16));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        if (z2) {
            j = 0;
        } else {
            j = this.a;
        }
        tL_messages_getAttachMenuBots.hash = j;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new rv3(this, vz4Var, (byte) 26));
    }

    public final void G1(long j, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.y1.put(botInfo.user_id + "_" + j, botInfo);
        getMessagesStorage().a.c(new de2(this, botInfo, j, (byte) 29));
    }

    public final void H() {
        this.j1.clear();
        this.k1.clear();
        this.l1.clear();
        this.m1.clear();
        getNotificationCenter().k(kk7.R0, new Object[0]);
        getNotificationCenter().k(kk7.S0, new Object[0]);
        getNotificationCenter().k(kk7.T0, new Object[0]);
        getNotificationCenter().k(kk7.U0, new Object[0]);
        getMessagesStorage().a.c(new un6(this, (byte) 17));
        o();
    }

    public final void H0(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.H0(boolean):void");
    }

    public final void H1(zc7 zc7Var, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        if (zc7Var != null) {
            try {
                int i = 0;
                if (zc7Var.b != 0) {
                    SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                    Locale locale = Locale.US;
                    long j = zc7Var.a;
                    long j2 = zc7Var.b;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + j + " AND tid = " + j2, new Object[0]);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().b;
                    Locale locale2 = Locale.US;
                    long j3 = zc7Var.a;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + j3, new Object[0]);
                }
                if (queryFinalized.next()) {
                    i = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
                if (i >= message.id && !k27.f3(i) && !k27.f3(message.id)) {
                    return;
                }
                if (zc7Var.b != 0) {
                    executeFast = getMessagesStorage().b.executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = getMessagesStorage().b.executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                }
                executeFast.requery();
                k27.p5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                int i2 = (zc7Var.b > 0L ? 1 : (zc7Var.b == 0L ? 0 : -1));
                long j4 = zc7Var.a;
                if (i2 != 0) {
                    executeFast.bindLong(1, j4);
                    executeFast.bindLong(2, zc7Var.b);
                    executeFast.bindInteger(3, message.id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, j4);
                    executeFast.bindInteger(2, message.id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                gl.d3(new co6(this, zc7Var, message));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final boolean I(long j) {
        for (int i = 0; i < this.j1.size(); i++) {
            if (cf3.n(((TLRPC.TL_topPeer) this.j1.get(i)).peer) == j) {
                return true;
            }
        }
        return false;
    }

    public final void I0(long j, long j2, boolean z, int i, e77 e77Var) {
        if (z) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.y1.get(j + "_" + j2);
            if (botInfo != null) {
                getNotificationCenter().k(kk7.C0, botInfo, Integer.valueOf(i));
                return;
            }
        }
        getMessagesStorage().a.c(new tb2(this, j, j2, e77Var, i, (byte) 1));
    }

    public final void I1(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().a.c(new q76(this, tL_messages_stickerSet, str, i, (byte) 2));
    }

    public final Intent J(long j) {
        if (j != 0) {
            Intent intent = new Intent(a.b, OpenAttachedMenuBotReceiver.class);
            if (cf3.D(j)) {
                intent.putExtra("botId", j);
                intent.putExtra("currentAccount", this.currentAccount);
                StringBuilder sb = new StringBuilder("com.tmessages.openshortcutbot");
                int i = OpenAttachedMenuBotReceiver.a;
                sb.append(j);
                intent.setAction(sb.toString());
                intent.addFlags(67108864);
                return intent;
            }
            return null;
        }
        return null;
    }

    public final TL_bots.BotInfo J0(long j, long j2) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
        Locale locale = Locale.US;
        StringBuilder o = ug8.o(j, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        o.append(j2);
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(o.toString(), new Object[0]);
        if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        } else {
            botInfo = null;
        }
        queryFinalized.dispose();
        return botInfo;
    }

    public final void J1(final boolean z, ArrayList arrayList, final ArrayList arrayList2, final int i, final long j, final boolean z2) {
        ArrayList arrayList3;
        if (arrayList != null) {
            arrayList3 = new ArrayList(arrayList);
        } else {
            arrayList3 = null;
        }
        final ArrayList arrayList4 = arrayList3;
        getMessagesStorage().a.c(new Runnable() {
            @Override
            public final void run() {
                int i2;
                int i3;
                ArrayList arrayList5 = arrayList2;
                long j2 = j;
                boolean z3 = z2;
                hq6 hq6Var = hq6.this;
                ArrayList arrayList6 = arrayList4;
                boolean z4 = z;
                int i4 = i;
                try {
                    if (arrayList6 != null) {
                        SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        int i5 = 4;
                        for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                            i5 += ((TLRPC.StickerSetCovered) arrayList6.get(i6)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i5);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList5.size() << 3) + 4);
                        nativeByteBuffer.writeInt32(arrayList6.size());
                        for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                            ((TLRPC.StickerSetCovered) arrayList6.get(i7)).serializeToStream(nativeByteBuffer);
                        }
                        nativeByteBuffer2.writeInt32(arrayList5.size());
                        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                            nativeByteBuffer2.writeInt64(((Long) arrayList5.get(i8)).longValue());
                        }
                        if (z4) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                        executeFast.bindInteger(1, i3);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer2);
                        executeFast.bindInteger(4, i4);
                        executeFast.bindLong(5, j2);
                        executeFast.bindInteger(6, z3 ? 1 : 0);
                        executeFast.bindInteger(7, z4 ? 1 : 0);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = hq6Var.getMessagesStorage().b.executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                    executeFast2.requery();
                    executeFast2.bindInteger(1, i4);
                    if (z4) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    executeFast2.bindInteger(2, i2);
                    executeFast2.bindInteger(3, z4 ? 1 : 0);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        });
    }

    public final Intent K(long j) {
        Intent intent = new Intent(a.b, OpenChatReceiver.class);
        if (cf3.B(j)) {
            int i = (int) (4294967295L & j);
            intent.putExtra("encId", i);
            if (getMessagesController().Y0(Integer.valueOf(i)) == null) {
                return null;
            }
        } else if (cf3.D(j)) {
            intent.putExtra("userId", j);
        } else if (!cf3.y(j)) {
            return null;
        } else {
            intent.putExtra("chatId", -j);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j);
        intent.addFlags(67108864);
        return intent;
    }

    public final void K0(zc7 zc7Var, boolean z) {
        TLRPC.Message message = (TLRPC.Message) this.A1.get(zc7Var);
        if (message != null) {
            getNotificationCenter().k(kk7.F0, message, zc7Var);
        } else {
            getMessagesStorage().a.c(new vj6(this, zc7Var, z, (byte) 2));
        }
    }

    public final void K1(int i, int i2, long j, long j2) {
        getMessagesStorage().a.c(new sz4(this, j2, j, i, i2, (byte) 1));
    }

    public final void L0() {
        if (!getUserConfig().w && !this.x1) {
            this.x1 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new xo6(this, (byte) 0));
        }
    }

    public final void L1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        TLRPC.StickerSet stickerSet;
        int i;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.J.k(tL_messages_stickerSet, stickerSet.id);
            if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
                this.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            }
            int i2 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.H;
                if (i2 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList = arrayListArr[i2];
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                            arrayList.set(i3, tL_messages_stickerSet);
                        }
                    }
                }
                i2++;
            }
            long j = tL_messages_stickerSet.set.id;
            vf6 vf6Var = this.N;
            if (vf6Var.d(j)) {
                vf6Var.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
            }
            X1(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
            if (stickerSet3.masks) {
                i = 1;
            } else if (stickerSet3.emojis) {
                i = 5;
            } else {
                i = 0;
            }
            if (z) {
                getNotificationCenter().k(kk7.w0, Integer.valueOf(i), Boolean.TRUE);
            }
        }
    }

    public final void M0(boolean z, boolean z2) {
        long j;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.x0;
        if (zArr[z ? 1 : 0]) {
            return;
        }
        zArr[z ? 1 : 0] = true;
        if (z2) {
            getMessagesStorage().a.c(new dp6(this, z, (byte) 1));
            return;
        }
        long[] jArr = this.q0;
        if (z) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j = jArr[1];
            tL_messages_getFeaturedEmojiStickers.hash = j;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j = jArr[0];
            tL_messages_getFeaturedStickers2.hash = j;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new hn6(this, z, j, (byte) 0));
    }

    public final void M1(int i, int i2, long j, ArrayList arrayList) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        getMessagesStorage().a.c(new a70(this, arrayList2, i, i2, j));
    }

    public final void N(int i, boolean z) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.I0;
        if (zArr[i]) {
            return;
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().a.c(new sv1(this, i, (byte) 5));
            return;
        }
        long[] jArr = this.E0;
        if (i == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = jArr[i];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = jArr[i];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = jArr[i];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new cp6(this, i, (byte) 0));
    }

    public final void N0(TLRPC.StickerSet stickerSet, boolean z) {
        if (z) {
            getMessagesStorage().a.c(new oh6(this, stickerSet, (byte) 10));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xo6(this, (byte) 6));
    }

    public final void O(String[] strArr, boolean z) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = this.C1;
                    if (hashMap.get(str) == null) {
                        if (!z || !this.D1.contains(str)) {
                            hashMap.put(str, Boolean.TRUE);
                            getMessagesStorage().a.c(new wo6(this, str, (byte) 5));
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void O0(boolean z) {
        if (!this.o1 && getUserConfig().W) {
            if (z) {
                if (!this.n1) {
                    this.o1 = true;
                    getMessagesStorage().a.c(new un6(this, (byte) 14));
                    this.n1 = true;
                    return;
                }
                return;
            }
            this.o1 = true;
            TLRPC.TL_contacts_getTopPeers tL_contacts_getTopPeers = new TLRPC.TL_contacts_getTopPeers();
            tL_contacts_getTopPeers.hash = 0L;
            tL_contacts_getTopPeers.bots_pm = false;
            tL_contacts_getTopPeers.correspondents = true;
            tL_contacts_getTopPeers.groups = false;
            tL_contacts_getTopPeers.channels = false;
            tL_contacts_getTopPeers.bots_inline = true;
            tL_contacts_getTopPeers.bots_guestchat = true;
            tL_contacts_getTopPeers.bots_app = true;
            tL_contacts_getTopPeers.offset = 0;
            tL_contacts_getTopPeers.limit = 20;
            getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new hc((byte) 0), new ur4(this, (byte) 16));
        }
    }

    public final void O1(long j) {
        ArrayList arrayList = this.k1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((TLRPC.TL_topPeer) arrayList.get(i)).peer.user_id == j) {
                arrayList.remove(i);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().h1(j);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ce2((byte) 0));
                getMessagesStorage().a.c(new to6(this, j, 1));
                getNotificationCenter().k(kk7.S0, new Object[0]);
                return;
            }
        }
    }

    public final void P(TLRPC.InputStickerSet inputStickerSet, i8c i8cVar) {
        String y0 = y0(inputStickerSet);
        HashMap hashMap = this.L0;
        ArrayList arrayList = (ArrayList) hashMap.get(y0);
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                arrayList.add(i8cVar);
                return;
            }
        } else {
            arrayList = new ArrayList();
            hashMap.put(y0, arrayList);
        }
        arrayList.add(i8cVar);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new kp6(this, y0, (byte) 0));
    }

    public final void P0(final long r17, final int r19, final int r20, final int r21, final int r22, final long r23, int r25, final int r26, final int r27, defpackage.h19 r28, java.lang.String r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.P0(long, int, int, int, int, long, int, int, int, h19, java.lang.String):void");
    }

    public final void P1(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Z0;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i == ((k27) arrayList.get(i3)).e1()) {
                this.d1.add((k27) arrayList.remove(i3));
                i3--;
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.a1;
            if (i4 >= arrayList2.size()) {
                break;
            }
            if (i == ((k27) arrayList2.get(i4)).e1()) {
                arrayList2.remove(i4);
                i4--;
            }
            i4++;
        }
        while (i2 < this.b1.size()) {
            if (i == ((k27) this.b1.get(i2)).e1()) {
                this.b1.remove(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void Q(ArrayList arrayList, Integer num, boolean z, boolean z2, Runnable runnable) {
        if (arrayList.isEmpty()) {
            runnable.run();
            return;
        }
        ArrayList[] arrayListArr = {t0(5)};
        zo6 zo6Var = new zo6(this, num, arrayList, z2, z, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 == null || arrayList2.isEmpty()) && !this.E1) {
            this.E1 = true;
            boolean[] zArr = new boolean[1];
            gl.d3(new e45(this, zArr, arrayListArr, zo6Var, (byte) 26));
            gl.e3(new oh6(zArr, zo6Var, (byte) 9), 900L);
            return;
        }
        zo6Var.run();
    }

    public final void Q0() {
        if (!this.g1 && this.M0 == 0) {
            boolean[] zArr = this.Y0;
            if (!zArr[0] || this.O0 != 0 || !zArr[1]) {
                int i = this.f1;
                this.f1 = this.Z0.size();
                this.g1 = true;
                Z1(null, this.Q0, this.O0, this.T0, 1, this.P0, false, this.U0, this.V0, false, this.R0);
                this.f1 = i;
            }
        }
    }

    public final void Q1(long j) {
        for (int i = 0; i < this.j1.size(); i++) {
            if (((TLRPC.TL_topPeer) this.j1.get(i)).peer.user_id == j) {
                this.j1.remove(i);
                getNotificationCenter().k(kk7.R0, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().h1(j);
                getMessagesStorage().a.c(new to6(this, j, 0));
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ce2((byte) 0));
                return;
            }
        }
    }

    public final java.util.ArrayList R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.R():java.util.ArrayList");
    }

    public final ArrayList R0(long j, long j2, ArrayList arrayList, boolean z) {
        ?? join;
        CharSequence charSequence;
        ArrayList arrayList2;
        ArrayList arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Integer num = (Integer) arrayList.get(i2);
                    if (join.length() != 0) {
                        join.append(",");
                    }
                    join.append(num);
                }
            } else {
                join = TextUtils.join(",", arrayList);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            int i3 = 1;
            long j3 = getUserConfig().n;
            ?? r10 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().b.queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j)), new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r10);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j3);
                        TLdeserialize.id = queryFinalized.intValue(i3);
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j;
                        ad7.d(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.id));
                    }
                    byteBufferValue.reuse();
                }
                r10 = 0;
                i3 = 1;
            }
            queryFinalized.dispose();
            if (arrayList4.isEmpty()) {
                charSequence = ",";
            } else {
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                Locale locale = Locale.US;
                charSequence = ",";
                ?? r11 = 0;
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j + " AND mid IN (" + TextUtils.join(charSequence, arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(r11);
                    if (byteBufferValue2 != null) {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r11), r11);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j3);
                            TLdeserialize2.dialog_id = j;
                            ad7.d(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.id));
                        }
                        byteBufferValue2.reuse();
                    }
                    r11 = 0;
                }
                queryFinalized2.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (i != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().f1(j2);
                    tL_channels_getMessages.id = arrayList4;
                    arrayList2 = arrayList9;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new pn6(this, j2, j, tL_channels_getMessages));
                } else {
                    arrayList2 = arrayList9;
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new w47(this, j, tL_messages_getMessages, (byte) 4));
                }
            } else {
                arrayList2 = arrayList9;
            }
            if (!arrayList5.isEmpty()) {
                if (!arrayList8.isEmpty()) {
                    getMessagesStorage().k0(arrayList8, arrayList6, false);
                }
                if (!arrayList2.isEmpty()) {
                    arrayList3 = arrayList7;
                    getMessagesStorage().P(TextUtils.join(charSequence, arrayList2), arrayList3);
                } else {
                    arrayList3 = arrayList7;
                }
                if (z) {
                    return m(arrayList5, arrayList6, arrayList3, true, true);
                }
                m(arrayList5, arrayList6, arrayList3, true, false);
                return null;
            }
            return null;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public final void R1(int i, ArrayList arrayList) {
        ArrayList[] arrayListArr = this.H;
        Collections.sort(arrayListArr[i], new m42(arrayList, (byte) 2));
        this.Y[i] = s(arrayListArr[i]);
        getNotificationCenter().k(kk7.w0, Integer.valueOf(i), Boolean.FALSE);
    }

    public final String S() {
        String str = this.s;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        String string = na7.q1(this.currentAccount).Y3.getString("reaction_on_double_tap", null);
        if (string != null && (this.r.get(string) != null || string.startsWith("animated_"))) {
            this.s = string;
            return string;
        }
        return ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
    }

    public final void S0(final int i, final int i2, final long j) {
        vf6 vf6Var = this.q1;
        if (vf6Var.h(j) >= 0) {
            return;
        }
        vf6Var.k(Boolean.TRUE, j);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().h1(j);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i3;
                vf6 vf6Var2;
                vf6 vf6Var3;
                hq6 hq6Var = hq6.this;
                hq6Var.getClass();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                boolean z = tLObject instanceof TLRPC.messages_Messages;
                int i4 = i2;
                boolean z2 = false;
                if (z) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    vf6 vf6Var4 = new vf6();
                    for (int i5 = 0; i5 < messages_messages.users.size(); i5++) {
                        TLRPC.User user = messages_messages.users.get(i5);
                        vf6Var4.k(user, user.id);
                    }
                    vf6 vf6Var5 = new vf6();
                    for (int i6 = 0; i6 < messages_messages.chats.size(); i6++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i6);
                        vf6Var5.k(chat, chat.id);
                    }
                    hq6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                    hq6Var.getMessagesController().a4(messages_messages.users, false);
                    hq6Var.getMessagesController().U3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                            arrayList.add(Integer.valueOf(message.id));
                            vf6Var2 = vf6Var4;
                            vf6Var3 = vf6Var5;
                            hashMap.put(Integer.valueOf(message.id), new k27(hq6Var.currentAccount, message, vf6Var2, vf6Var3, false, false));
                        } else {
                            vf6Var2 = vf6Var4;
                            vf6Var3 = vf6Var5;
                        }
                        i7++;
                        vf6Var4 = vf6Var2;
                        vf6Var5 = vf6Var3;
                    }
                    if (i4 != 0 && arrayList.isEmpty()) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                    if (messages_messages.messages.size() < tL_messages_search.limit) {
                        z2 = true;
                    }
                    i3 = Math.max(messages_messages.count, messages_messages.messages.size());
                } else if (i4 != 0) {
                    arrayList.add(Integer.valueOf(i4));
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i8 = i3;
                boolean z3 = z2;
                ad7 messagesStorage = hq6Var.getMessagesStorage();
                long j2 = j;
                messagesStorage.Z1(j2, arrayList, true, i8, i, z3, hashMap);
                gl.d3(new ko6(hq6Var, j2, (byte) 1));
            }
        });
    }

    public final void S1(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.S1(org.telegram.tgnet.TLRPC$TL_messages_stickerSet):void");
    }

    public final TLRPC.DraftMessage T(long j, long j2) {
        vf6 vf6Var = (vf6) this.u1.f(j);
        if (vf6Var == null) {
            return null;
        }
        return (TLRPC.DraftMessage) vf6Var.f(j2);
    }

    public final void T0(boolean z) {
        this.F = true;
        if (z) {
            getMessagesStorage().a.c(new un6(this, (byte) 18));
            return;
        }
        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new xo6(this, (byte) 9));
    }

    public final void T1(long r23, long r25, java.lang.CharSequence r27, java.util.ArrayList r28, org.telegram.tgnet.TLRPC.Message r29, defpackage.bu1 r30, org.telegram.tgnet.TLRPC.SuggestedPost r31, long r32, boolean r34, boolean r35, org.telegram.tgnet.tl.TL_iv.RichMessage r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.T1(long, long, java.lang.CharSequence, java.util.ArrayList, org.telegram.tgnet.TLRPC$Message, bu1, org.telegram.tgnet.TLRPC$SuggestedPost, long, boolean, boolean, org.telegram.tgnet.tl.TL_iv$RichMessage):void");
    }

    public final cq6 U(long j, long j2) {
        boolean z;
        boolean z2;
        if (!this.Q1) {
            Set<Map.Entry<String, ?>> entrySet = a.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
            this.R1.b();
            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                cq6 cq6Var = null;
                if (str != null) {
                    try {
                        if (str.startsWith("@")) {
                            String[] split = str.substring(1).split("\n");
                            if (split.length >= 6) {
                                cq6 cq6Var2 = new cq6();
                                cq6Var2.a = split[0];
                                cq6Var2.b = Long.parseLong(split[1]);
                                cq6Var2.c = Integer.parseInt(split[2]);
                                cq6Var2.d = Long.parseLong(split[3]);
                                if (split[4].contains(";")) {
                                    String[] split2 = split[4].split(";");
                                    if (Integer.parseInt(split2[0]) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    cq6Var2.g = z2;
                                    cq6Var2.h = Float.parseFloat(split2[1]);
                                    cq6Var2.i = Float.parseFloat(split2[2]);
                                } else {
                                    if (Integer.parseInt(split[4]) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    cq6Var2.g = z;
                                    cq6Var2.h = 0.0f;
                                    cq6Var2.i = 1.0f;
                                }
                                int length = split.length - 5;
                                String[] strArr = new String[length];
                                for (int i = 0; i < length; i++) {
                                    strArr[i] = split[i + 5];
                                }
                                String join = TextUtils.join("\n", strArr);
                                cq6Var2.f = new short[join.length()];
                                int i2 = 0;
                                while (true) {
                                    short[] sArr = cq6Var2.f;
                                    if (i2 >= sArr.length) {
                                        break;
                                    }
                                    sArr[i2] = (short) join.charAt(i2);
                                    i2++;
                                }
                                cq6Var = cq6Var2;
                            }
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                if (cq6Var != null) {
                    this.R1.k(cq6Var, Long.parseLong(key));
                }
            }
            this.Q1 = true;
        }
        return (cq6) this.R1.f(Objects.hash(Long.valueOf(j), Long.valueOf(j2)));
    }

    public final void U0(boolean z, Integer num) {
        int i;
        this.w = true;
        if (z) {
            getMessagesStorage().a.c(new un6(this, (byte) 15));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.f;
        }
        tL_messages_getAvailableReactions.hash = i;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new xo6(this, (byte) 3));
    }

    public final void U1(final long j, final long j2, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        final long j3;
        TLRPC.Chat K0;
        final long j4;
        String str2;
        if (getMessagesController().r2(j) && j2 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences sharedPreferences = this.w1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        na7 messagesController = getMessagesController();
        vf6 vf6Var = this.u1;
        vf6 vf6Var2 = this.v1;
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            vf6 vf6Var3 = (vf6) vf6Var.f(j);
            if (vf6Var3 == null) {
                vf6Var3 = new vf6();
                vf6Var.k(vf6Var3, j);
            }
            vf6Var3.k(draftMessage, j2);
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i == 0) {
                messagesController.V3(j, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (i == 0) {
                    str2 = String.valueOf(j);
                } else {
                    str2 = "t_" + j + "_" + j2;
                }
                edit.putString(str2, Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else {
            vf6 vf6Var4 = (vf6) vf6Var.f(j);
            if (vf6Var4 != null) {
                vf6Var4.l(j2);
                if (vf6Var4.m() == 0) {
                    vf6Var.l(j);
                }
            }
            vf6 vf6Var5 = (vf6) vf6Var2.f(j);
            if (vf6Var5 != null) {
                vf6Var5.l(j2);
                if (vf6Var5.m() == 0) {
                    vf6Var2.l(j);
                }
            }
            if (j2 == 0) {
                sharedPreferences.edit().remove(String.valueOf(j)).remove("r_" + j).commit();
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                StringBuilder o = ug8.o(j, "t_", "_");
                o.append(j2);
                SharedPreferences.Editor remove = edit2.remove(o.toString());
                StringBuilder o2 = ug8.o(j, "rt_", "_");
                o2.append(j2);
                remove.remove(o2.toString()).commit();
            }
            vf6 vf6Var6 = messagesController.R;
            TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var6.f(j);
            if (dialog != null && dialog.top_message == 0) {
                vf6Var6.l(dialog.id);
                messagesController.y.remove(dialog);
            }
        }
        vf6 vf6Var7 = (vf6) vf6Var2.f(j);
        TLRPC.User user = null;
        if (message == null && draftMessage != null && draftMessage.reply_to != null) {
            if (vf6Var7 != null) {
                message2 = (TLRPC.Message) vf6Var7.f(j2);
            }
            message2 = message;
        } else {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        }
        if (message2 == null) {
            if (vf6Var7 != null) {
                vf6Var7.l(j2);
                if (vf6Var7.m() == 0) {
                    vf6Var2.l(j);
                }
            }
            if (j2 == 0) {
                edit.remove("r_" + j);
            } else {
                StringBuilder o3 = ug8.o(j, "rt_", "_");
                o3.append(j2);
                edit.remove(o3.toString());
            }
        } else {
            if (vf6Var7 == null) {
                vf6Var7 = new vf6();
                vf6Var2.k(vf6Var7, j);
            }
            vf6Var7.k(message2, j2);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j2 == 0) {
                    str = "r_" + j;
                } else {
                    str = "rt_" + j + "_" + j2;
                }
                edit.putString(str, Utilities.f(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        edit.commit();
        if (z) {
            if (j2 == 0 || getMessagesController().r2(j)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == 0 || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    if ((inputReplyTo.flags & 2) != 0) {
                        j3 = cf3.m(inputReplyTo.reply_to_peer_id);
                    } else {
                        j3 = j;
                    }
                    if (cf3.D(j3)) {
                        user = getMessagesController().V1(Long.valueOf(j3));
                        K0 = null;
                    } else {
                        K0 = getMessagesController().K0(Long.valueOf(-j3));
                    }
                    if (user != null || K0 != null) {
                        if (hc2.T(K0)) {
                            j4 = K0.id;
                        } else {
                            j4 = 0;
                        }
                        final int i2 = draftMessage.reply_to.reply_to_msg_id;
                        getMessagesStorage().a.c(new Runnable() {
                            @Override
                            public final void run() {
                                TLRPC.Message message3;
                                NativeByteBuffer byteBufferValue;
                                final hq6 hq6Var = hq6.this;
                                int i3 = i2;
                                long j5 = j3;
                                try {
                                    SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i3 + " and uid = " + j5, new Object[0]);
                                    TLRPC.Message message4 = null;
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            message3 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            message3.readAttachPath(byteBufferValue2, hq6Var.getUserConfig().n);
                                            byteBufferValue2.reuse();
                                        } else {
                                            message3 = null;
                                        }
                                        if (message3 != null) {
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            vf6 vf6Var8 = new vf6();
                                            vf6 vf6Var9 = new vf6();
                                            try {
                                                TLRPC.MessageReplyHeader messageReplyHeader = message3.reply_to;
                                                if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                                                    if (!queryFinalized.isNull(1) && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        message3.replyMessage = TLdeserialize;
                                                        TLdeserialize.readAttachPath(byteBufferValue, hq6Var.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message5 = message3.replyMessage;
                                                        if (message5 != null) {
                                                            ad7.d(message5, arrayList, arrayList2, null);
                                                        }
                                                    }
                                                    if (message3.replyMessage == null) {
                                                        ad7.c(message3, vf6Var8, vf6Var9);
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                hq6Var.getMessagesStorage().n(e4, true);
                                            }
                                            hq6Var.getMessagesStorage().H0(vf6Var8, vf6Var9, arrayList, arrayList2, 0);
                                        }
                                        message4 = message3;
                                    }
                                    queryFinalized.dispose();
                                    final long j6 = j;
                                    final long j7 = j2;
                                    if (message4 == null) {
                                        long j8 = j4;
                                        if (j8 != 0) {
                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                            tL_channels_getMessages.channel = hq6Var.getMessagesController().f1(j8);
                                            tL_channels_getMessages.id.add(Integer.valueOf(i3));
                                            hq6Var.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Message message6;
                                                    TLRPC.Message message7;
                                                    switch (r6) {
                                                        case 0:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                    gl.d3(new n30(hq6Var, j6, j7, message6, (byte) 7));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                    gl.d3(new n30(hq6Var, j6, j7, message7, (byte) 7));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                        tL_messages_getMessages.id.add(Integer.valueOf(i3));
                                        hq6Var.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                TLRPC.Message message6;
                                                TLRPC.Message message7;
                                                switch (r6) {
                                                    case 0:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                gl.d3(new n30(hq6Var, j6, j7, message6, (byte) 7));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                gl.d3(new n30(hq6Var, j6, j7, message7, (byte) 7));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    gl.d3(new n30(hq6Var, j6, j7, message4, (byte) 7));
                                } catch (Exception e5) {
                                    fa4.g(e5, true);
                                }
                            }
                        });
                    }
                }
                getNotificationCenter().k(kk7.V0, Long.valueOf(j));
            }
        }
    }

    public final TLRPC.Document V(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList t0 = t0(4);
        int size = t0.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i2);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) this.I[4].f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public final void W(String[] strArr, String str, boolean z, eq6 eq6Var, boolean z2) {
        X(strArr, str, z, eq6Var, z2, false, false, false, null);
    }

    public final void W0(boolean z) {
        if (!this.I1) {
            if (!this.J1 || z) {
                final SharedPreferences k = oo1.k(new StringBuilder("recent_reactions_"), this.currentAccount, a.b, 0);
                final SharedPreferences k2 = oo1.k(new StringBuilder("top_reactions_"), this.currentAccount, a.b, 0);
                this.F1.clear();
                this.G1.clear();
                this.F1.addAll(V0(k));
                this.G1.addAll(V0(k2));
                this.I1 = true;
                this.J1 = true;
                final boolean[] zArr = new boolean[2];
                TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
                tL_messages_getRecentReactions.hash = k.getLong("hash", 0L);
                tL_messages_getRecentReactions.limit = 50;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) {
                    public final hq6 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final hq6 hq6Var = this.b;
                                final SharedPreferences sharedPreferences = k;
                                final boolean[] zArr2 = zArr;
                                gl.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        boolean[] zArr3 = zArr2;
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hq6 hq6Var2 = hq6Var;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = hq6Var2.F1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    hq6.V1(sharedPreferences2, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                                zArr3[0] = true;
                                                if (zArr3[1]) {
                                                    hq6Var2.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList2 = hq6Var2.G1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    hq6.V1(sharedPreferences2, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                                zArr3[1] = true;
                                                if (zArr3[0]) {
                                                    hq6Var2.I1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final hq6 hq6Var2 = this.b;
                                final SharedPreferences sharedPreferences2 = k;
                                final boolean[] zArr3 = zArr;
                                gl.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        boolean[] zArr32 = zArr3;
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hq6 hq6Var22 = hq6Var2;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = hq6Var22.F1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    hq6.V1(sharedPreferences22, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                                zArr32[0] = true;
                                                if (zArr32[1]) {
                                                    hq6Var22.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList2 = hq6Var22.G1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    hq6.V1(sharedPreferences22, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    hq6Var22.I1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
                TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
                tL_messages_getTopReactions.hash = k2.getLong("hash", 0L);
                tL_messages_getTopReactions.limit = 100;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) {
                    public final hq6 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final hq6 hq6Var = this.b;
                                final SharedPreferences sharedPreferences = k2;
                                final boolean[] zArr2 = zArr;
                                gl.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        boolean[] zArr32 = zArr2;
                                        SharedPreferences sharedPreferences22 = sharedPreferences;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hq6 hq6Var22 = hq6Var;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = hq6Var22.F1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    hq6.V1(sharedPreferences22, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                                zArr32[0] = true;
                                                if (zArr32[1]) {
                                                    hq6Var22.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList2 = hq6Var22.G1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    hq6.V1(sharedPreferences22, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    hq6Var22.I1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final hq6 hq6Var2 = this.b;
                                final SharedPreferences sharedPreferences2 = k2;
                                final boolean[] zArr3 = zArr;
                                gl.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        boolean[] zArr32 = zArr3;
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        hq6 hq6Var22 = hq6Var2;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = hq6Var22.F1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    hq6.V1(sharedPreferences22, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                                zArr32[0] = true;
                                                if (zArr32[1]) {
                                                    hq6Var22.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList2 = hq6Var22.G1;
                                                if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    hq6.V1(sharedPreferences22, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    hq6Var22.I1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void W1(vf6 vf6Var, ArrayList arrayList, boolean z) {
        getMessagesStorage().a.c(new qg(this, z, arrayList, vf6Var, (byte) 26));
    }

    public final void X(final String[] strArr, final String str, final boolean z, final eq6 eq6Var, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Integer num) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(vu3.i);
            getMessagesStorage().a.c(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uo6.run():void");
                }
            });
            return;
        }
        eq6Var.f(null, new ArrayList());
    }

    public final void X0(boolean r8, boolean r9, boolean r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.X0(boolean, boolean, boolean, int):void");
    }

    public final void X1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
            getMessagesStorage().a.c(new sn6(this, tL_messages_stickerSet, (byte) 4));
            if (!this.K0) {
                this.K0 = true;
                getMessagesStorage().a.c(new un6(this, (byte) 5));
            }
        }
    }

    public final ArrayList Y(CharSequence[] charSequenceArr, boolean z, boolean z2) {
        boolean z3;
        int i;
        int min;
        String str;
        int i2;
        int i3;
        char c;
        int i4;
        String str2;
        char c3;
        int i5;
        int i6;
        ArrayList arrayList = null;
        if (charSequenceArr[0] == null) {
            return null;
        }
        int i7 = -1;
        int i8 = -1;
        boolean z4 = false;
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (!z2) {
                break;
            }
            CharSequence charSequence = charSequenceArr[0];
            if (!z4) {
                str = "`";
            } else {
                str = "```";
            }
            int indexOf = TextUtils.indexOf(charSequence, str, i9);
            if (indexOf == i7) {
                break;
            } else if (i8 == i7) {
                if (charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`') {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i10 = 3;
                }
                i8 = indexOf;
                i9 = indexOf + i10;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (z4) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                for (int i11 = i2 + indexOf; i11 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i11) == '`'; i11++) {
                    indexOf++;
                }
                if (z4) {
                    i3 = 3;
                } else {
                    i3 = 1;
                }
                int i12 = i3 + indexOf;
                if (z4) {
                    if (i8 > 0) {
                        c = charSequenceArr[0].charAt(i8 - 1);
                    } else {
                        c = 0;
                    }
                    if (c != ' ' && c != '\n') {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    int i13 = i8 + 3;
                    int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i13);
                    String str3 = "";
                    if (indexOf2 < 0 || indexOf2 - i13 <= 0) {
                        str2 = "";
                    } else {
                        str2 = charSequenceArr[0].toString().substring(i13, indexOf2);
                    }
                    CharSequence f22 = f2(0, i8 - i4, charSequenceArr[0]);
                    int length = str2.length() + i13 + (!str2.isEmpty());
                    if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                        CharSequence f23 = f2(length, indexOf, charSequenceArr[0]);
                        int i14 = indexOf + 3;
                        if (i14 < charSequenceArr[0].length()) {
                            c3 = charSequenceArr[0].charAt(i14);
                        } else {
                            c3 = 0;
                        }
                        CharSequence charSequence2 = charSequenceArr[0];
                        if (c3 != ' ' && c3 != '\n') {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        CharSequence f24 = f2(i14 + i5, charSequence2.length(), charSequence2);
                        if (f22.length() != 0) {
                            f22 = gl.C(f22, "\n");
                        } else {
                            i4 = 1;
                        }
                        if (f24.length() > 0 && f24.charAt(0) != '\n') {
                            f24 = gl.C("\n", f24);
                        }
                        if (f23.length() > 0 && f23.charAt(f23.length() - 1) == '\n') {
                            f23 = f2(0, f23.length() - 1, f23);
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        if (!TextUtils.isEmpty(f23)) {
                            if (f23.length() > 1 && f23.charAt(0) == '\n') {
                                f23 = f23.subSequence(1, f23.length());
                                indexOf--;
                            }
                            charSequenceArr[0] = gl.C(f22, f23, f24);
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            int i15 = i4 ^ 1;
                            tL_messageEntityPre.offset = i8 + i15;
                            tL_messageEntityPre.length = ((((indexOf - i8) - 3) - (str2.length() + (!str2.isEmpty()))) + i15) - i6;
                            if (!TextUtils.isEmpty(str2) && str2.trim().length() != 0) {
                                str3 = str2;
                            }
                            tL_messageEntityPre.language = str3;
                            arrayList.add(tL_messageEntityPre);
                            i12 -= 6;
                        }
                        i9 = i12;
                        z4 = false;
                        i7 = -1;
                        i8 = -1;
                    }
                    i9 = i12;
                    i7 = -1;
                } else {
                    int i16 = i8 + 1;
                    if (i16 != indexOf) {
                        CharSequence charSequence3 = charSequenceArr[0];
                        if ((charSequence3 instanceof Spanned) && ((nj2[]) ((Spanned) charSequence3).getSpans(Utilities.j(i8, charSequence3.length(), 0), Utilities.j(i16, charSequenceArr[0].length(), 0), nj2.class)).length > 0) {
                            i9 = i12;
                            i7 = -1;
                        } else {
                            CharSequence f25 = f2(0, i8, charSequenceArr[0]);
                            CharSequence f26 = f2(i16, indexOf, charSequenceArr[0]);
                            CharSequence charSequence4 = charSequenceArr[0];
                            charSequenceArr[0] = gl.C(f25, f26, f2(indexOf + 1, charSequence4.length(), charSequence4));
                            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                            tL_messageEntityCode.offset = i8;
                            tL_messageEntityCode.length = (indexOf - i8) - 1;
                            arrayList.add(tL_messageEntityCode);
                            i12 -= 2;
                        }
                    }
                    i9 = i12;
                    z4 = false;
                    i7 = -1;
                    i8 = -1;
                }
            }
        }
        if (i8 != i7 && z4) {
            CharSequence f27 = f2(0, i8, charSequenceArr[0]);
            CharSequence charSequence5 = charSequenceArr[0];
            charSequenceArr[0] = gl.C(f27, f2(i8 + 2, charSequence5.length(), charSequence5));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            TLRPC.TL_messageEntityCode tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode2.offset = i8;
            tL_messageEntityCode2.length = 1;
            arrayList.add(tL_messageEntityCode2);
        }
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence6;
            wib[] wibVarArr = (wib[]) spanned.getSpans(0, charSequence6.length(), wib.class);
            if (wibVarArr != null && wibVarArr.length > 0) {
                for (wib wibVar : wibVarArr) {
                    int spanStart = spanned.getSpanStart(wibVar);
                    int spanEnd = spanned.getSpanEnd(wibVar);
                    if (!A(spanStart, arrayList, false) && !A(spanEnd, arrayList, true)) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i17);
                                int i18 = messageEntity.offset;
                                if (i18 <= spanStart || i18 + messageEntity.length > spanEnd) {
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        e(wibVar.b.a, spanStart, spanEnd, arrayList);
                    }
                }
            }
            j4c[] j4cVarArr = (j4c[]) spanned.getSpans(0, charSequenceArr[0].length(), j4c.class);
            if (j4cVarArr != null && j4cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i19 = 0; i19 < j4cVarArr.length; i19++) {
                    TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                    na7 messagesController = getMessagesController();
                    tL_inputMessageEntityMentionName.user_id = messagesController.o1(messagesController.V1(Utilities.A(j4cVarArr[i19].getURL())));
                    tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(j4cVarArr[i19]);
                    tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(j4cVarArr[i19]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                    if (charSequenceArr[0].charAt((i + min) - 1) == ' ') {
                        tL_inputMessageEntityMentionName.length--;
                    }
                    arrayList.add(tL_inputMessageEntityMentionName);
                }
            }
            i4c[] i4cVarArr = (i4c[]) spanned.getSpans(0, charSequenceArr[0].length(), i4c.class);
            if (i4cVarArr != null && i4cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i20 = 0; i20 < i4cVarArr.length; i20++) {
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = spanned.getSpanStart(i4cVarArr[i20]);
                    tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(i4cVarArr[i20]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                    tL_messageEntityTextUrl.url = i4cVarArr[i20].getURL();
                    arrayList.add(tL_messageEntityTextUrl);
                    vib vibVar = i4cVarArr[i20].a;
                    if (vibVar != null) {
                        int i21 = vibVar.a;
                        int i22 = tL_messageEntityTextUrl.offset;
                        e(i21, i22, tL_messageEntityTextUrl.length + i22, arrayList);
                    }
                }
            }
            gm[] gmVarArr = (gm[]) spanned.getSpans(0, charSequenceArr[0].length(), gm.class);
            if (gmVarArr != null && gmVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (gm gmVar : gmVarArr) {
                    if (gmVar != null) {
                        try {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(gmVar);
                            tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(gmVar), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                            tL_messageEntityCustomEmoji.document_id = gmVar.getDocumentId();
                            tL_messageEntityCustomEmoji.document = gmVar.document;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                }
            }
            nj2[] nj2VarArr = (nj2[]) spanned.getSpans(0, charSequenceArr[0].length(), nj2.class);
            if (nj2VarArr != null && nj2VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (nj2 nj2Var : nj2VarArr) {
                    if (nj2Var != null) {
                        try {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre2.offset = spanned.getSpanStart(nj2Var);
                            tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(nj2Var), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                            tL_messageEntityPre2.language = nj2Var.a;
                            arrayList.add(tL_messageEntityPre2);
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                    }
                }
            }
            ey8[] ey8VarArr = (ey8[]) spanned.getSpans(0, charSequenceArr[0].length(), ey8.class);
            if (ey8VarArr != null && ey8VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (ey8 ey8Var : ey8VarArr) {
                    if (ey8Var != null) {
                        try {
                            TLRPC.TL_messageEntityBlockquote tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                            tL_messageEntityBlockquote.offset = spanned.getSpanStart(ey8Var);
                            tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(ey8Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                            tL_messageEntityBlockquote.collapsed = ey8Var.e;
                            arrayList.add(tL_messageEntityBlockquote);
                        } catch (Exception e4) {
                            fa4.g(e4, true);
                        }
                    }
                }
            }
            im4[] im4VarArr = (im4[]) spanned.getSpans(0, charSequenceArr[0].length(), im4.class);
            if (im4VarArr != null && im4VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (im4 im4Var : im4VarArr) {
                    if (im4Var != null) {
                        try {
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.offset = spanned.getSpanStart(im4Var);
                            tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(im4Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = im4Var.b;
                            tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                            tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                            tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                            tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                            tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                            tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                            tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                            arrayList.add(tL_messageEntityFormattedDate);
                        } catch (Exception e5) {
                            fa4.g(e5, true);
                        }
                    }
                }
            }
            if (spanned instanceof Spannable) {
                Spannable spannable = (Spannable) spanned;
                gl.c(spannable, 1, false, false);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i23 = 0; i23 < uRLSpanArr.length; i23++) {
                        URLSpan uRLSpan = uRLSpanArr[i23];
                        if (!(uRLSpan instanceof i4c) && !(uRLSpan instanceof j4c) && !(uRLSpan instanceof im4)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i23]);
                            tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i23]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                            tL_messageEntityUrl.url = uRLSpanArr[i23].getURL();
                            arrayList.add(tL_messageEntityUrl);
                            spannable.removeSpan(uRLSpanArr[i23]);
                        }
                    }
                }
            }
        }
        CharSequence charSequence7 = charSequenceArr[0];
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (charSequence7 != null && charSequence7.length() >= 48) {
            Matcher matcher = h2.matcher(charSequence7);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                int i24 = 0;
                while (true) {
                    if (i24 < arrayList.size()) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i24);
                        int i25 = messageEntity2.offset;
                        if (!gl.z1(start, end, i25, messageEntity2.length + i25) || (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl))) {
                            i24++;
                        }
                    } else {
                        try {
                            z3 = WalletEngine2.isValidAddress(matcher.group());
                        } catch (Throwable th) {
                            fa4.g(th, true);
                            z3 = false;
                        }
                        if (z3) {
                            TLRPC.TL_messageEntityTonAddress tL_messageEntityTonAddress = new TLRPC.TL_messageEntityTonAddress();
                            tL_messageEntityTonAddress.offset = start;
                            tL_messageEntityTonAddress.length = end - start;
                            arrayList.add(tL_messageEntityTonAddress);
                        }
                    }
                }
            }
        }
        if (z2) {
            charSequence7 = k1(k1(k1(charSequence7, U1, arrayList, new w26((byte) 16)), V1, arrayList, new w26((byte) 17)), W1, arrayList, new w26((byte) 18));
            if (z) {
                charSequence7 = k1(charSequence7, X1, arrayList, new w26((byte) 19));
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(0) == '\n' || charSequence7.charAt(0) == ' ')) {
            int i26 = 1;
            charSequence7 = charSequence7.subSequence(1, charSequence7.length());
            int i27 = 0;
            while (i27 < arrayList.size()) {
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(i27);
                int i28 = messageEntity3.offset;
                if (i28 == 0) {
                    messageEntity3.length -= i26;
                }
                messageEntity3.offset = Math.max(0, i28 - 1);
                i27++;
                i26 = 1;
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(charSequence7.length() - 1) == '\n' || charSequence7.charAt(charSequence7.length() - 1) == ' ')) {
            charSequence7 = charSequence7.subSequence(0, charSequence7.length() - 1);
            for (int i29 = 0; i29 < arrayList.size(); i29++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i29);
                if (messageEntity4.offset + messageEntity4.length > charSequence7.length()) {
                    messageEntity4.length--;
                }
            }
        }
        charSequenceArr[0] = charSequence7;
        return arrayList;
    }

    public final void Y0(java.util.ArrayList r21, long r22, int r24, long r25, java.lang.Runnable r27, int r28, defpackage.qob r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.Y0(java.util.ArrayList, long, int, long, java.lang.Runnable, int, qob):void");
    }

    public final boolean Y1() {
        boolean[] zArr = this.Y0;
        if ((!zArr[0] || this.O0 != 0 || !zArr[1]) && !this.h1 && !this.i1) {
            return false;
        }
        return true;
    }

    public final long Z() {
        long j = 0;
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = this.t0;
            if (i < arrayListArr[0].size()) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayListArr[0].get(i)).set;
                if (!stickerSet.archived) {
                    j = r(j, stickerSet.id);
                }
                i++;
            } else {
                return j;
            }
        }
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.Z0():void");
    }

    public final void Z1(java.lang.String r37, final long r38, final long r40, final int r42, final int r43, final long r44, boolean r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final boolean r49, final defpackage.h19 r50) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.Z1(java.lang.String, long, long, int, int, long, boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, h19):void");
    }

    public final TLRPC.TL_messages_stickerSet a0(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(stickerSet.id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.N.f(stickerSet.id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    N0(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            N0(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    public final void a1(boolean z) {
        if (!this.K1) {
            if (!this.L1 || z) {
                SharedPreferences k = oo1.k(new StringBuilder("saved_reactions_"), this.currentAccount, a.b, 0);
                this.H1.clear();
                this.H1.addAll(V0(k));
                this.K1 = true;
                this.L1 = true;
                TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
                tL_messages_getDefaultTagReactions.hash = k.getLong("hash", 0L);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new bn6(this, k, (byte) 1));
            }
        }
    }

    public final void a2(boolean z, String str, p8c p8cVar) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new hc((byte) 0), new ft4(p8cVar, (byte) 1));
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i;
        long j = tL_messages_stickerSet.set.id;
        vf6 vf6Var = this.J;
        if (vf6Var.h(j) < 0) {
            String str = tL_messages_stickerSet.set.short_name;
            ConcurrentHashMap concurrentHashMap = this.O;
            if (!concurrentHashMap.containsKey(str)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet.masks) {
                    i = 1;
                } else if (stickerSet.emojis) {
                    i = 5;
                } else {
                    i = 0;
                }
                ArrayList[] arrayListArr = this.H;
                arrayListArr[i].add(0, tL_messages_stickerSet);
                vf6Var.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                this.K.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                concurrentHashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                vf6 vf6Var2 = new vf6();
                for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                    vf6Var2.k(document, document.id);
                }
                for (int i3 = 0; i3 < tL_messages_stickerSet.packs.size(); i3++) {
                    TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i3);
                    String replace = tL_stickerPack.emoticon.replace("️", "");
                    tL_stickerPack.emoticon = replace;
                    ArrayList arrayList = (ArrayList) this.e0.get(replace);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.e0.put(tL_stickerPack.emoticon, arrayList);
                    }
                    for (int i4 = 0; i4 < tL_stickerPack.documents.size(); i4++) {
                        Long l = tL_stickerPack.documents.get(i4);
                        if (this.d0.h(l.longValue()) < 0) {
                            this.d0.k(tL_stickerPack.emoticon, l.longValue());
                        }
                        TLRPC.Document document2 = (TLRPC.Document) vf6Var2.f(l.longValue());
                        if (document2 != null) {
                            arrayList.add(document2);
                        }
                    }
                }
                this.Y[i] = s(arrayListArr[i]);
                getNotificationCenter().k(kk7.w0, Integer.valueOf(i), Boolean.TRUE);
                b1(i, false, true);
            }
        }
    }

    public final void b1(int i, boolean z, boolean z2) {
        c1(i, z, z2, false, null);
    }

    public final fq6 b2(boolean z, String str, String str2, p8c p8cVar, boolean z2) {
        fq6 fq6Var = new fq6(str, str2, z);
        gq6 gq6Var = (gq6) this.T1.get(fq6Var);
        if (gq6Var == null || (gq6Var.b != null && z2)) {
            HashMap hashMap = this.S1;
            if (!hashMap.containsKey(fq6Var)) {
                hashMap.put(fq6Var, 0);
                d0(this.currentAccount).W(new String[]{str}, str2, true, new lt(this, fq6Var, gq6Var, p8cVar, (byte) 15), false);
                return fq6Var;
            }
        }
        if (gq6Var != null) {
            p8cVar.a(gq6Var.a);
            return fq6Var;
        }
        p8cVar.a(new ArrayList());
        return fq6Var;
    }

    public final void c(TLRPC.Document document, int i, boolean z) {
        if (document == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int size = this.j0.size();
            ArrayList arrayList = this.j0;
            if (i2 < size) {
                TLRPC.Document document2 = (TLRPC.Document) arrayList.get(i2);
                if (document2.id == document.id) {
                    this.j0.remove(i2);
                    this.j0.add(0, document2);
                    break;
                }
                i2++;
            } else {
                arrayList.add(0, document);
                break;
            }
        }
        if ((this.j0.size() > getMessagesController().k4.T0.f() && !y6c.h(this.currentAccount).p()) || this.j0.size() > getMessagesController().k4.U0.f()) {
            getMessagesStorage().a.c(new cn6(this, (TLRPC.Document) tb4.l(1, this.j0), (byte) 0));
            if (z) {
                gl.d3(new vl6(document, (byte) 4));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(document);
        z1(0, arrayList2, true, i, false);
    }

    public final void c1(int i, boolean z, boolean z2, boolean z3, p8c p8cVar) {
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        boolean[] zArr = this.W;
        if (zArr[i]) {
            if (z3) {
                this.V[i] = new bs1(this, i, z2, p8cVar);
                return;
            } else if (p8cVar != null) {
                p8cVar.a(null);
                return;
            } else {
                return;
            }
        }
        char c = 1;
        ArrayList[] arrayListArr = this.t0;
        if (i == 3) {
            if (arrayListArr[0].isEmpty() || !getMessagesController().m3) {
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            }
        } else if (i == 6) {
            if (arrayListArr[1].isEmpty() || !getMessagesController().m3) {
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            }
        } else if (i != 4) {
            E0(i, z);
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().a.c(new j45(this, i, p8cVar, (byte) 6));
        } else if (i != 3 && i != 6) {
            if (i == 4) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new b97(this, i, p8cVar, (byte) 8));
                return;
            }
            long[] jArr = this.Y;
            long j = 0;
            if (i == 0) {
                TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
                if (!z2) {
                    j = jArr[i];
                }
                tL_messages_getAllStickers.hash = j;
                tL_messages_getMaskStickers = tL_messages_getAllStickers;
            } else if (i == 5) {
                TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
                if (!z2) {
                    j = jArr[i];
                }
                tL_messages_getEmojiStickers.hash = j;
                tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
            } else {
                TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
                if (!z2) {
                    j = jArr[i];
                }
                tL_messages_getMaskStickers2.hash = j;
                tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
            }
            getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new tg(this, i, p8cVar, j, (byte) 3));
        } else {
            if (i != 6) {
                c = 0;
            }
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.q0[c];
            int size = arrayListArr[c].size();
            for (int i2 = 0; i2 < size; i2++) {
                tL_messages_allStickers.sets.add(((TLRPC.StickerSetCovered) arrayListArr[c].get(i2)).set);
            }
            s1(i, tL_messages_allStickers, new mn0(p8cVar, (byte) 6));
        }
    }

    public final void c2(String str) {
        na7.q1(this.currentAccount).Y3.edit().putString("reaction_on_double_tap", str).apply();
        this.s = str;
    }

    public final void d(int i, Object obj, TLRPC.Document document, int i2, boolean z) {
        ArrayList[] arrayListArr;
        int i3;
        TLRPC.Document document2;
        boolean z2;
        int i4;
        if (i != 3) {
            if (k27.t4(document) || k27.K2(document, true)) {
                int i5 = 0;
                while (true) {
                    arrayListArr = this.g0;
                    if (i5 < arrayListArr[i].size()) {
                        TLRPC.Document document3 = (TLRPC.Document) arrayListArr[i].get(i5);
                        if (document3.id == document.id) {
                            arrayListArr[i].remove(i5);
                            if (!z) {
                                arrayListArr[i].add(0, document3);
                            }
                        } else {
                            i5++;
                        }
                    } else if (!z) {
                        arrayListArr[i].add(0, document);
                    }
                }
                int i6 = kk7.R4;
                if (i == 2) {
                    if (z) {
                        kk7.e().k(i6, 0, document, 4);
                    } else {
                        if (arrayListArr[i].size() > getMessagesController().X2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        kk7 e = kk7.e();
                        if (z2) {
                            i4 = 6;
                        } else {
                            i4 = 5;
                        }
                        e.k(i6, 0, document, Integer.valueOf(i4));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new k45(this, obj, tL_messages_faveSticker, (byte) 11));
                    i3 = getMessagesController().X2;
                } else {
                    if (i == 0 && z) {
                        kk7.e().k(i6, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.id = tL_inputDocument2;
                        tL_inputDocument2.id = document.id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new k45(this, obj, tL_messages_saveRecentSticker, (byte) 12));
                    }
                    i3 = getMessagesController().W2;
                }
                if (arrayListArr[i].size() > i3 || z) {
                    if (z) {
                        document2 = document;
                    } else {
                        document2 = (TLRPC.Document) tb4.l(1, arrayListArr[i]);
                    }
                    getMessagesStorage().a.c(new o94(this, i, document2, (byte) 8));
                }
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(document);
                    z1(i, arrayList, false, i2, false);
                }
                if (i == 2 || (i == 0 && z)) {
                    getNotificationCenter().k(kk7.W0, Boolean.FALSE, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d1(String str, boolean z, boolean z2) {
        HashSet hashSet = this.T;
        if (!hashSet.contains(str)) {
            if (!z || this.R.get(str) == null) {
                hashSet.add(str);
                if (z2) {
                    getMessagesStorage().a.c(new yn6(this, str, z, (byte) 1));
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                if (Objects.equals(getUserConfig().c0, str)) {
                    tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
                } else if (z) {
                    TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                    tL_inputStickerSetDice.emoticon = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
                } else {
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                }
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new mi1(this, str, z, (byte) 6));
            }
        }
    }

    public final void d2(long j, long j2, float f, float f3) {
        cq6 U = U(j, j2);
        if (U != null) {
            if (Math.abs(U.h - f) >= 0.001f || Math.abs(U.i - f3) >= 0.001f) {
                U.h = f;
                U.i = f3;
                Context context = a.b;
                SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
                edit.putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", U.toString()).apply();
            }
        }
    }

    public final int e0() {
        int i = 1;
        if (this.f1 >= this.Z0.size() - 1) {
            boolean[] zArr = this.Y0;
            if (zArr[0] && zArr[1]) {
                i = 0;
            }
        }
        if (this.f1 > 0) {
            return i | 2;
        }
        return i;
    }

    public final void e1(boolean z, boolean z2) {
        int i;
        ArrayList[] arrayListArr = this.v0;
        if (!arrayListArr[z ? 1 : 0].isEmpty()) {
            arrayListArr[z ? 1 : 0].clear();
            ArrayList[] arrayListArr2 = this.t0;
            long q = q(arrayListArr2[z ? 1 : 0], z);
            long[] jArr = this.q0;
            jArr[z ? 1 : 0] = q;
            kk7 notificationCenter = getNotificationCenter();
            if (z) {
                i = kk7.z0;
            } else {
                i = kk7.y0;
            }
            notificationCenter.k(i, new Object[0]);
            J1(z, arrayListArr2[z ? 1 : 0], arrayListArr[z ? 1 : 0], this.r0[z ? 1 : 0], jArr[z ? 1 : 0], this.s0);
            if (z2) {
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new ce2((byte) 0));
            }
        }
    }

    public final void e2(be0 be0Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        d0(this.currentAccount).m0(tL_inputStickerSetShortName, 0, false, false, new ht(str2, be0Var, str3, (byte) 26));
    }

    public final void f0(final int i, final int i2, final long j, final long j2, boolean z) {
        if (!z && !cf3.B(j)) {
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            if (i == 0) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
            } else if (i == 1) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
            } else if (i == 2) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
            } else if (i == 3) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
            } else if (i == 4) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
            } else if (i == 5) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
            } else if (i == 8) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
            }
            if (j2 != 0) {
                if (j == getUserConfig().e()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().h1(j2);
                    tL_messages_getSearchCounters.flags |= 4;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j2;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            tL_messages_getSearchCounters.peer = getMessagesController().h1(j);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    if (tLObject instanceof Vector) {
                        Vector vector = (Vector) tLObject;
                        if (!vector.objects.isEmpty()) {
                            gl.d3(new aq6(hq6.this, j, false, ((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, i, 0, j2, i2));
                        }
                    }
                }
            }), i2);
            return;
        }
        getMessagesStorage().a.c(new Runnable() {
            @Override
            public final void run() {
                boolean z2;
                SQLiteCursor queryFinalized;
                int i3;
                int i4;
                long j3;
                hq6 hq6Var;
                int i5 = i2;
                long j4 = j2;
                int i6 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                hq6 hq6Var2 = hq6.this;
                long j5 = j;
                byte b = i;
                try {
                    if (i6 != 0) {
                        SQLiteDatabase sQLiteDatabase = hq6Var2.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j5 + " AND topic_id = " + j4 + " AND type = " + ((int) b) + " LIMIT 1", new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = hq6Var2.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j5 + " AND type = " + ((int) b) + " LIMIT 1", new Object[0]);
                    }
                    if (queryFinalized.next()) {
                        i3 = queryFinalized.intValue(0);
                        i4 = queryFinalized.intValue(1);
                    } else {
                        i3 = -1;
                        i4 = 0;
                    }
                    queryFinalized.dispose();
                    if (i3 == -1 && cf3.B(j5)) {
                        SQLiteCursor queryFinalized2 = hq6Var2.getMessagesStorage().b.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j5 + " AND type = " + ((int) b) + " LIMIT 1", new Object[0]);
                        if (queryFinalized2.next()) {
                            i3 = queryFinalized2.intValue(0);
                        }
                        int i7 = i3;
                        queryFinalized2.dispose();
                        if (i7 != -1) {
                            j3 = j4;
                            hq6Var2.K1(b, i7, j5, j3);
                            hq6Var = hq6Var2;
                        } else {
                            j3 = j4;
                            hq6Var = hq6Var2;
                        }
                        i3 = i7;
                    } else {
                        j3 = j4;
                        hq6Var = hq6Var2;
                    }
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    z2 = true;
                }
                try {
                    gl.d3(new aq6(hq6Var, j5, true, i3, b, i4, j3, i5));
                } catch (Exception e3) {
                    e = e3;
                    fa4.g(e, z2);
                }
            }
        });
    }

    public final void f1(long j) {
        if (this.v0[0].contains(Long.valueOf(j))) {
            ArrayList[] arrayListArr = this.w0;
            if (!arrayListArr[0].contains(Long.valueOf(j))) {
                arrayListArr[0].add(Long.valueOf(j));
                TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
                tL_messages_readFeaturedStickers.id.add(Long.valueOf(j));
                getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new ce2((byte) 0));
                gl.e3(new ko6(this, j, (byte) 3), 1000L);
            }
        }
    }

    public final void g0(long j, int i, long j2) {
        getMessagesStorage().a.c(new l30(this, j2, j, i, (byte) 3));
    }

    public final void g1(long j, boolean z) {
        this.M.remove(Long.valueOf(j));
        ArrayList arrayList = this.L;
        if (z && !arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
        if (!z) {
            arrayList.remove(Long.valueOf(j));
        }
    }

    public final void g2(long j, long j2, boolean z) {
        cq6 U = U(j, j2);
        if (U != null && U.g != z) {
            U.g = z;
            Context context = a.b;
            SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
            edit.putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", U.toString()).apply();
        }
    }

    public final void h1(long j, boolean z) {
        this.L.remove(Long.valueOf(j));
        ArrayList arrayList = this.M;
        if (z && !arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
        if (!z) {
            arrayList.remove(Long.valueOf(j));
        }
    }

    public final void h2(Context context, TLObject tLObject, int i, d dVar, boolean z, boolean z2) {
        i2(context, tLObject, null, i, dVar, null, z, z2, null, true);
    }

    public final Integer i0(boolean z) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        int i;
        double d3;
        kl8 kl8Var;
        jl8 jl8Var;
        jl8 jl8Var2;
        double d4;
        int i2;
        kl8 kl8Var2;
        jl8 jl8Var3;
        if ((z && (!ci0.h().j() || ci0.h().e == null)) || (tL_help_premiumPromo = this.E) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i3 = 0;
        double d5 = 0.0d;
        boolean z2 = false;
        int i4 = 0;
        while (i4 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i4);
            i4++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (z) {
                if (tL_premiumSubscriptionOption2.current) {
                    jl8Var2 = null;
                    if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), ci0.h().e)) {
                        if (w01.b() && (kl8Var2 = ci0.l) != null) {
                            ArrayList arrayList3 = kl8Var2.h;
                            int size2 = arrayList3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 < size2) {
                                    Object obj = arrayList3.get(i5);
                                    i5++;
                                    jl8Var3 = (jl8) obj;
                                    String str = ((hl8) jl8Var3.b.a.get(0)).d;
                                    int i6 = tL_premiumSubscriptionOption2.months;
                                    if (i6 == 12) {
                                        if (str.equals("P1Y")) {
                                            break;
                                        }
                                    } else {
                                        Locale locale = Locale.ROOT;
                                        if (str.equals("P" + i6 + "M")) {
                                            break;
                                        }
                                    }
                                } else {
                                    jl8Var3 = jl8Var2;
                                    break;
                                }
                            }
                            if (jl8Var3 == null) {
                                d4 = tL_premiumSubscriptionOption2.amount;
                                i2 = tL_premiumSubscriptionOption2.months;
                            } else {
                                d4 = ((hl8) jl8Var3.b.a.get(0)).b;
                                i2 = tL_premiumSubscriptionOption2.months;
                            }
                        } else {
                            d4 = tL_premiumSubscriptionOption2.amount;
                            i2 = tL_premiumSubscriptionOption2.months;
                        }
                        d5 = d4 / i2;
                        z2 = true;
                    }
                }
            } else {
                jl8Var2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (w01.b()) {
                    }
                    d4 = tL_premiumSubscriptionOption2.amount;
                    i2 = tL_premiumSubscriptionOption2.months;
                    d5 = d4 / i2;
                    z2 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.E.period_options;
        int size3 = arrayList4.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i8);
            i8++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z2 && tL_premiumSubscriptionOption4.months == 12) {
                if (!w01.b() && (kl8Var = ci0.l) != null) {
                    ArrayList arrayList5 = kl8Var.h;
                    int size4 = arrayList5.size();
                    int i9 = i3;
                    while (true) {
                        if (i9 < size4) {
                            Object obj2 = arrayList5.get(i9);
                            i9++;
                            jl8Var = (jl8) obj2;
                            String str2 = ((hl8) jl8Var.b.a.get(i3)).d;
                            int i10 = tL_premiumSubscriptionOption4.months;
                            arrayList = arrayList4;
                            if (i10 == 12) {
                                if (str2.equals("P1Y")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                                i3 = 0;
                            } else {
                                Locale locale2 = Locale.ROOT;
                                if (str2.equals("P" + i10 + "M")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                                i3 = 0;
                            }
                        } else {
                            arrayList = arrayList4;
                            jl8Var = null;
                            break;
                        }
                    }
                    if (jl8Var == null) {
                        d3 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i3 = 0;
                        i7 = (int) ((1.0d - (d3 / d5)) * 100.0d);
                    } else {
                        i3 = 0;
                        d = ((hl8) jl8Var.b.a.get(0)).b;
                        i = tL_premiumSubscriptionOption4.months;
                    }
                } else {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount;
                    i = tL_premiumSubscriptionOption4.months;
                }
                d3 = d / i;
                i7 = (int) ((1.0d - (d3 / d5)) * 100.0d);
            } else {
                arrayList = arrayList4;
            }
            arrayList4 = arrayList;
        }
        if (!z2 || i7 <= 0) {
            return null;
        }
        return Integer.valueOf(i7);
    }

    public final void i1(long j, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 5;
        } else if (z2) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList t0 = t0(i);
        if (t0 != null) {
            for (int i2 = 0; i2 < t0.size(); i2++) {
                if (((TLRPC.TL_messages_stickerSet) t0.get(i2)).set.id == j) {
                    t0.remove(i2);
                    t0.add(0, (TLRPC.TL_messages_stickerSet) t0.get(i2));
                    getNotificationCenter().k(kk7.w0, Integer.valueOf(i), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final void i2(final android.content.Context r22, final org.telegram.tgnet.TLObject r23, final org.telegram.tgnet.TLRPC.Document r24, final int r25, final org.telegram.ui.ActionBar.d r26, final android.widget.FrameLayout r27, final boolean r28, boolean r29, final java.lang.Runnable r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.i2(android.content.Context, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document, int, org.telegram.ui.ActionBar.d, android.widget.FrameLayout, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    public final ArrayList j0(int i, boolean z) {
        ArrayList[] arrayListArr = this.g0;
        ArrayList arrayList = arrayListArr[i];
        if (i == 7) {
            return new ArrayList(arrayListArr[i]);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public final void j1(String str, TLRPC.Document document, boolean z) {
        this.a0.remove(str);
        ij9 ij9Var = this.A0;
        ArrayList arrayList = ij9Var.e;
        boolean z2 = true;
        if (z) {
            int i = 0;
            while (true) {
                if (i < arrayList.size()) {
                    if (((hj9) arrayList.get(i)).d && str.equals(((hj9) arrayList.get(i)).b)) {
                        arrayList.remove(i);
                        break;
                    }
                    i++;
                } else {
                    z2 = false;
                    break;
                }
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (((hj9) arrayList.get(i2)).d && str.equals(((hj9) arrayList.get(i2)).b)) {
                        ((hj9) arrayList.get(i2)).d = false;
                        ((hj9) arrayList.get(i2)).a = document;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                ij9Var.h();
            }
        }
        if (z2) {
            kk7.f(ij9Var.c).k(kk7.g5, new Object[0]);
        }
    }

    public final void j2(final Context context, int i, final d dVar, final FrameLayout frameLayout, final boolean z, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i2, final boolean z2) {
        boolean z3;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j = stickerSet.id;
        tL_inputStickerSetID.id = j;
        if (i != 0) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            if (i == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            tL_messages_installStickerSet.archived = z3;
            g1(stickerSet.id, true);
            getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final hq6 hq6Var = hq6.this;
                    final TLRPC.StickerSet stickerSet2 = stickerSet;
                    final d dVar2 = dVar;
                    final boolean z4 = z;
                    final byte b = i2;
                    final boolean z5 = z2;
                    final FrameLayout frameLayout2 = frameLayout;
                    final Context context2 = context;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.Document document2 = document;
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            hq6 hq6Var2 = hq6.this;
                            vf6 vf6Var = hq6Var2.U;
                            TLRPC.StickerSet stickerSet3 = stickerSet2;
                            vf6Var.l(stickerSet3.id);
                            TLObject tLObject4 = tLObject2;
                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive;
                            d dVar3 = dVar2;
                            byte b3 = b;
                            if (z6) {
                                hq6Var2.C1(dVar3, z4, b3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                            }
                            hq6Var2.c1(b3, false, false, true, new vo6(hq6Var2, stickerSet3, (byte) 0));
                            if (tL_error == null && z5) {
                                FrameLayout frameLayout3 = frameLayout2;
                                Context context3 = context2;
                                TLObject tLObject5 = tLObject3;
                                TLRPC.Document document3 = document2;
                                if (frameLayout3 != null) {
                                    m21.f(frameLayout3, new nza(context3, tLObject5, 1, 2, document3, dVar3.getResourceProvider()), 1500).j();
                                } else if (dVar3 != null) {
                                    m21.g(dVar3, new nza(context3, tLObject5, 1, 2, document3, dVar3.getResourceProvider()), 1500).j();
                                }
                            }
                        }
                    });
                }
            });
            return;
        }
        h1(j, true);
        TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
        tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
        getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                gl.d3(new o94(hq6.this, stickerSet, i2, (byte) 7));
            }
        });
    }

    public final SharedPreferences k() {
        if (this.s1 == null) {
            SharedPreferences k = oo1.k(new StringBuilder("ai_chat_styles"), this.currentAccount, a.b, 0);
            this.s1 = k;
            for (Map.Entry<String, ?> entry : k.getAll().entrySet()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
                    TL_aicompose.inputAiComposeStyle TLdeserialize = TL_aicompose.inputAiComposeStyle.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                    if (TLdeserialize != null) {
                        this.r1.k(TLdeserialize, Utilities.A(entry.getKey()).longValue());
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        return this.s1;
    }

    public final int k0() {
        ArrayList arrayList = this.a1;
        boolean isEmpty = arrayList.isEmpty();
        int[] iArr = this.X0;
        if (isEmpty) {
            return Math.max(Math.max(iArr[0] + iArr[1], this.W0), arrayList.size());
        }
        return Math.max(iArr[0] + iArr[1], arrayList.size());
    }

    public final void k2(int r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.k2(int, long):void");
    }

    public final boolean l(long j) {
        for (int i = 0; i < this.b.bots.size(); i++) {
            if (this.b.bots.get(i).bot_id == j) {
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        ArrayList arrayList = this.h;
        if (arrayList != null && !this.y && e66.e(8200) && this.currentAccount == y6c.t0) {
            this.y = true;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int min = Math.min(arrayList2.size(), 10);
            for (int i = 0; i < min; i++) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList2.get(i);
                m1(gl5.b(tL_availableReaction.activate_animation), 0);
                m1(gl5.b(tL_availableReaction.appear_animation), 0);
            }
            for (int i2 = 0; i2 < min; i2++) {
                m1(gl5.b(((TLRPC.TL_availableReaction) arrayList2.get(i2)).effect_animation), 0);
            }
        }
    }

    public final void l2(long j, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.y1.get(tL_updateBotCommands.bot_id + "_" + j);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().k(kk7.C0, botInfo, 0);
        }
        getMessagesStorage().a.c(new go6(this, tL_updateBotCommands, j, (byte) 0));
    }

    public final ArrayList m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, boolean z2) {
        boolean z3;
        if (arrayList.isEmpty()) {
            return null;
        }
        vf6 vf6Var = new vf6();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            vf6Var.k(user, user.id);
        }
        vf6 vf6Var2 = new vf6();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i2);
            vf6Var2.k(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        if (z2) {
            gl.d3(new qg(this, arrayList2, z, arrayList3, (byte) 25));
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i4);
                if ((k27.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                    i3++;
                }
                vf6 vf6Var3 = vf6Var2;
                int i5 = i3;
                int i6 = this.currentAccount;
                if (i5 < 30) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList4.add(new k27(i6, message, vf6Var, vf6Var3, false, z3));
                i4++;
                vf6Var2 = vf6Var3;
                i3 = i5;
            }
            return arrayList4;
        }
        gl.d3(new oo6(this, arrayList2, z, arrayList3, arrayList, arrayList4, vf6Var, vf6Var2, (byte) 0));
        return null;
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_stickerSet m0(final org.telegram.tgnet.TLRPC.InputStickerSet r11, final java.lang.Integer r12, final boolean r13, boolean r14, final defpackage.p8c r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.m0(org.telegram.tgnet.TLRPC$InputStickerSet, java.lang.Integer, boolean, boolean, p8c):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    public final void m1(gl5 gl5Var, int i) {
        getFileLoader().V(gl5Var, null, null, i, 11);
    }

    public final void m2() {
        k27 k27Var;
        ArrayList arrayList = this.Z0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = this.a1;
            k27 k27Var2 = null;
            if (i >= arrayList3.size()) {
                break;
            }
            k27 k27Var3 = (k27) arrayList3.get(i);
            if ((!k27Var3.z2() || k27Var3.S2) && !hashSet.contains(Integer.valueOf(k27Var3.e1()))) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    } else if (((k27) arrayList2.get(i2)).e1() == k27Var3.e1()) {
                        k27Var2 = (k27) arrayList2.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (k27Var2 != null) {
                    k27Var3.N(k27Var2);
                    k27Var3.z0 = k27Var2.z0;
                    k27Var3.y0 = k27Var2.y0;
                }
                k27Var3.o2 = true;
                arrayList.add(k27Var3);
                hashSet.add(Integer.valueOf(k27Var3.e1()));
            }
            i++;
        }
        for (int i3 = 0; i3 < this.b1.size(); i3++) {
            k27 k27Var4 = (k27) this.b1.get(i3);
            if (!hashSet.contains(Integer.valueOf(k27Var4.e1()))) {
                int i4 = 0;
                while (true) {
                    if (i4 < arrayList2.size()) {
                        if (((k27) arrayList2.get(i4)).e1() == k27Var4.e1()) {
                            k27Var = (k27) arrayList2.get(i4);
                            break;
                        }
                        i4++;
                    } else {
                        k27Var = null;
                        break;
                    }
                }
                if (k27Var != null) {
                    k27Var4.N(k27Var);
                    k27Var4.z0 = k27Var.z0;
                    k27Var4.y0 = k27Var.y0;
                }
                k27Var4.o2 = true;
                arrayList.add(k27Var4);
                hashSet.add(Integer.valueOf(k27Var4.e1()));
            }
        }
    }

    public final void n(ArrayList arrayList, vf6 vf6Var, ArrayList arrayList2, ArrayList arrayList3, long j, boolean z) {
        vf6 vf6Var2 = new vf6();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            vf6Var2.k(user, user.id);
        }
        vf6 vf6Var3 = new vf6();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i2);
            vf6Var3.k(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList4.add(new k27(this.currentAccount, (TLRPC.Message) arrayList.get(i3), vf6Var2, vf6Var3, false, false));
        }
        gl.d3(new ks0(this, arrayList2, z, arrayList3, arrayList4, vf6Var, j));
    }

    public final TLRPC.TL_messages_stickerSet n0(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        return m0(inputStickerSet, null, z, false, null);
    }

    public final void n2(String str) {
        HashMap hashMap = this.a0;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new jj9(str, this.currentAccount));
        ij9 ij9Var = this.A0;
        ij9Var.getClass();
        ?? obj = new Object();
        obj.b = str;
        int i = ij9Var.d;
        ij9Var.d = i + 1;
        obj.c = i;
        obj.d = true;
        ij9Var.e.add(obj);
    }

    public final void o() {
        int g = tga.g(a.b) - 2;
        if (g <= 0) {
            g = 5;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (gba.r.length() <= 0) {
            for (int i = 0; i < this.j1.size(); i++) {
                arrayList.add((TLRPC.TL_topPeer) this.j1.get(i));
                if (arrayList.size() == g - 2) {
                    break;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        Utilities.e.c(new mn6(this, z, arrayList, (byte) 0));
    }

    public final TLRPC.TL_messages_stickerSet o0(String str) {
        return (TLRPC.TL_messages_stickerSet) this.R.get(str);
    }

    public final void o1() {
        ArrayList[] arrayListArr = this.g0;
        if (arrayListArr[3].isEmpty()) {
            return;
        }
        ArrayList arrayList = arrayListArr[3];
        this.z0 = (TLRPC.Document) arrayList.get(Utilities.b.nextInt(arrayList.size()));
        getFileLoader().V(gl5.b(this.z0), this.z0, null, 0, 1);
    }

    public final void o2(TLRPC.Message message) {
        p2(message, false);
    }

    public final TLRPC.TL_messages_stickerSet p0(long j) {
        return (TLRPC.TL_messages_stickerSet) this.J.f(j);
    }

    public final void p1() {
        int i;
        boolean z = this.D0;
        ArrayList arrayList = this.C0;
        if (!z && arrayList.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = vu3.c("⭐").concat(vu3.c("⭐"));
            tL_messages_getStickers.hash = 0L;
            this.D0 = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new xo6(this, (byte) 2));
            return;
        }
        for (int i2 = 0; i2 < Math.min(arrayList.size(), 3); i2++) {
            if (i2 == 2) {
                i = arrayList.size() - 1;
            } else {
                i = i2;
            }
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            if (k27.W3(document)) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.d0(gl5.b(document), null, null, "webp", null, 1);
                fl5.z().I(imageReceiver, null);
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.A1 = false;
                imageReceiver2.b0(gl5.d(k27.F1(document), document), null, null, null, "tgs", null, 1);
                fl5.z().I(imageReceiver2, null);
            }
        }
    }

    public final void p2(TLRPC.Message message, boolean z) {
        if (message != null) {
            TLRPC.Document G0 = k27.G0(message);
            String str = null;
            if (G0 != null) {
                int i = 0;
                while (true) {
                    if (i >= G0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = G0.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                        if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            str = inputStickerSet.short_name;
                        }
                    } else {
                        i++;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.O.get(str);
                if (tL_messages_stickerSet != null) {
                    int size = tL_messages_stickerSet.documents.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                        if (document.id == G0.id && document.dc_id == G0.dc_id) {
                            message.stickerVerified = 1;
                            return;
                        }
                    }
                } else if (z) {
                    gl.d3(new lo6(this, message, str, (byte) 3));
                } else {
                    q2(message, str);
                }
            }
        }
    }

    public final long q(ArrayList arrayList, boolean z) {
        long j = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayList.get(i)).set;
                if (!stickerSet.archived) {
                    j = r(j, stickerSet.id);
                    if (this.v0[z ? 1 : 0].contains(Long.valueOf(stickerSet.id))) {
                        j = r(j, 1L);
                    }
                }
            }
        }
        return j;
    }

    public final TLRPC.TL_messages_stickerSet q0(String str) {
        if (str == null) {
            return null;
        }
        return (TLRPC.TL_messages_stickerSet) this.O.get(str.toLowerCase());
    }

    public final void q1(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w;
        String str;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && (w = ba4.w(stickerSet.thumbs, 90, false, null, false)) != null) {
            TLRPC.Document document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                } else {
                    return;
                }
            }
            gl5 k = gl5.k(w, document, stickerSetCovered.set.thumb_version);
            if (k != null) {
                if (k.p == 1) {
                    str = "tgs";
                } else {
                    str = "webp";
                }
                getFileLoader().V(k, stickerSetCovered, str, 3, 1);
            }
        }
    }

    public final void q2(TLRPC.Message message, String str) {
        HashMap hashMap = this.b0;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = k27.j1(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new kp6(this, str, (byte) 1));
    }

    public final void r1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w;
        ArrayList<TLRPC.Document> arrayList;
        gl5 k;
        String str;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && (w = ba4.w(stickerSet.thumbs, 90, false, null, false)) != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty() && (k = gl5.k(w, arrayList.get(0), tL_messages_stickerSet.set.thumb_version)) != null) {
            if (k.p == 1) {
                str = "tgs";
            } else {
                str = "webp";
            }
            getFileLoader().V(k, tL_messages_stickerSet, str, 3, 1);
        }
    }

    public final String s0(long j) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(j);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        vf6[] vf6VarArr = this.u0;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vf6VarArr[0].f(j);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) vf6VarArr[1].f(j);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public final void s1(int i, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final vf6 vf6Var;
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2;
        final int i2;
        final ArrayList arrayList = new ArrayList();
        if (tL_messages_allStickers.sets.isEmpty()) {
            A1(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, runnable);
            return;
        }
        hq6 hq6Var = this;
        int i3 = i;
        vf6 vf6Var2 = new vf6();
        int i4 = 0;
        while (i4 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i4);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) hq6Var.J.f(stickerSet.id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    vf6Var2.k(tL_messages_stickerSet, stickerSet2.id);
                    arrayList.add(tL_messages_stickerSet);
                    if (vf6Var2.m() == tL_messages_allStickers.sets.size()) {
                        hq6Var.A1(i3, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    }
                    vf6Var = vf6Var2;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    i2 = i4;
                    i4 = i2 + 1;
                    vf6Var2 = vf6Var;
                    tL_messages_allStickers = tL_messages_allStickers2;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            ConnectionsManager connectionsManager = hq6Var.getConnectionsManager();
            final int i5 = i3;
            final hq6 hq6Var2 = hq6Var;
            vf6Var = vf6Var2;
            tL_messages_allStickers2 = tL_messages_allStickers;
            i2 = i4;
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    gl.d3(new sk3(hq6.this, tLObject, arrayList, i2, vf6Var, stickerSet, tL_messages_allStickers2, i5));
                }
            };
            hq6Var = hq6Var2;
            i3 = i5;
            connectionsManager.sendRequest(tL_messages_getStickerSet, requestDelegate);
            i4 = i2 + 1;
            vf6Var2 = vf6Var;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        runnable.run();
    }

    public final ArrayList t0(int i) {
        ArrayList[] arrayListArr = this.H;
        if (i == 3) {
            return arrayListArr[2];
        }
        return arrayListArr[i];
    }

    public final void t1(String str, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z2, int i) {
        gl.d3(new wo6(this, str, (byte) 4));
        Utilities.d.c(new fp6(this, z2, tL_messages_stickerSet, i, str, z));
    }

    public final boolean u() {
        if (this.X[0] && this.H[0].size() < 5 && this.g0[2].isEmpty()) {
            return false;
        }
        return true;
    }

    public final void u1(final boolean z, final ArrayList arrayList, final ArrayList arrayList2, final boolean z2, final boolean z3, final int i, final long j) {
        gl.d3(new dp6(this, z, (byte) 0));
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ep6.run():void");
            }
        });
    }

    public final void v0(long j) {
        w0(j, true);
    }

    public final void v1(final TLRPC.messages_Messages messages_messages, final long j, int i, int i2, final int i3, final int i4, long j2, final int i5, final int i6, final boolean z, final int i7) {
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        ArrayList<TLRPC.Message> arrayList;
        int i12;
        if (w01.a) {
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            if (arrayList2 != null) {
                i12 = arrayList2.size();
            } else {
                i12 = 0;
            }
            StringBuilder sb = new StringBuilder("process load media messagesCount ");
            sb.append(i12);
            sb.append(" did ");
            j3 = j;
            sb.append(j3);
            sb.append(" topicId ");
            sb.append(j2);
            sb.append(" count = ");
            i8 = i;
            i9 = i2;
            ir2.w(sb, i8, " max_id=", i9, " min_id=");
            i10 = i4;
            ir2.w(sb, i3, " type = ", i10, " cache = ");
            i11 = i6;
            ir2.w(sb, i5, " classGuid = ", i11, " topReached=");
            z2 = z;
            sb.append(z2);
            fa4.b(sb.toString());
        } else {
            j3 = j;
            i8 = i;
            i9 = i2;
            i10 = i4;
            i11 = i6;
            z2 = z;
        }
        if (i5 != 0 && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i3 == 0) || (messages_messages.messages.size() <= 1 && i3 != 0)) && !cf3.B(j3))) {
            if (i5 == 2) {
                return;
            }
            P0(j, i8, i9, i3, i10, j2, 0, i11, i7, null, null);
            return;
        }
        if (i5 == 0) {
            fl5.S(messages_messages.messages);
            getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
            getMessagesStorage().a.c(new eo6(this, i3, messages_messages.messages, z2, j, i2, i4, j2));
        }
        Utilities.g.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.messages_Messages messages_messages2;
                hq6 hq6Var;
                vf6 vf6Var = new vf6();
                int i13 = 0;
                while (true) {
                    messages_messages2 = messages_messages;
                    if (i13 >= messages_messages2.users.size()) {
                        break;
                    }
                    TLRPC.User user = messages_messages2.users.get(i13);
                    vf6Var.k(user, user.id);
                    i13++;
                }
                ArrayList arrayList3 = new ArrayList();
                int i14 = 0;
                while (true) {
                    int size = messages_messages2.messages.size();
                    hq6Var = hq6.this;
                    if (i14 >= size) {
                        break;
                    }
                    k27 k27Var = new k27(hq6Var.currentAccount, messages_messages2.messages.get(i14), vf6Var, (vf6) null, true, false);
                    k27Var.Q();
                    arrayList3.add(k27Var);
                    i14++;
                }
                hq6Var.getFileLoader().l(arrayList3);
                boolean z3 = i5;
                long j4 = j;
                en6 en6Var = new en6(hq6Var, messages_messages2, z3 ? 1 : 0, j4, arrayList3, i6, i4, z, i3, i7, (byte) 0);
                if (hq6Var.getMessagesController().i4.u(j4)) {
                    hq6Var.getMessagesStorage().a.c(new sx5(hq6Var, arrayList3, en6Var, (byte) 28));
                } else {
                    en6Var.run();
                }
            }
        });
    }

    public final void w(boolean z) {
        if (z) {
            this.x = 0;
            int[] iArr = this.r0;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        X0(false, true, false, 2);
        X0(false, true, false, 3);
        X0(false, false, true, 7);
        z();
        y();
        C();
        if (!this.c && (!this.d || Math.abs((System.currentTimeMillis() / 1000) - this.e) >= 3600)) {
            G0(true, false, null);
        }
        if (!this.F && (this.E == null || Math.abs((System.currentTimeMillis() / 1000) - this.G) >= 3600)) {
            T0(true);
        }
        B();
        E();
        if (getUserConfig().e0 != null) {
            String str = getUserConfig().e0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (!this.o0 && System.currentTimeMillis() - getUserConfig().i0 >= 86400000) {
            this.o0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xo6(this, (byte) 8));
        }
        getMessagesController().C0();
    }

    public final void w0(long j, boolean z) {
        int i;
        int i2;
        ArrayList arrayList;
        TLRPC.TL_topPeer tL_topPeer;
        int i3;
        if (!getUserConfig().W) {
            return;
        }
        y6c userConfig = getUserConfig();
        if (z) {
            i = userConfig.G;
        } else {
            i = userConfig.F;
        }
        int i4 = 1;
        if (i != 0) {
            i2 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i);
        } else {
            i2 = 60;
        }
        if (z) {
            arrayList = this.l1;
        } else {
            arrayList = this.k1;
        }
        int i5 = 0;
        while (true) {
            if (i5 < arrayList.size()) {
                tL_topPeer = (TLRPC.TL_topPeer) arrayList.get(i5);
                if (tL_topPeer.peer.user_id == j) {
                    break;
                }
                i5++;
            } else {
                tL_topPeer = null;
                break;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j;
            arrayList.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(i2 / getMessagesController().S2) + tL_topPeer.rating;
        Collections.sort(arrayList, new el6((byte) 2));
        if (arrayList.size() > 20) {
            tb4.v(1, arrayList);
        }
        if (z) {
            i4 = 3;
        }
        getMessagesStorage().a.c(new po6(this, j, i4, tL_topPeer.rating));
        kk7 notificationCenter = getNotificationCenter();
        if (z) {
            i3 = kk7.T0;
        } else {
            i3 = kk7.S0;
        }
        notificationCenter.k(i3, new Object[0]);
    }

    public final void w1(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j, int i, boolean z) {
        boolean z2;
        if (tL_attachMenuBots != null && i != 0) {
            this.b = tL_attachMenuBots;
            this.a = j;
        }
        SharedPreferences.Editor edit = getMessagesController().X3.edit();
        this.e = i;
        edit.putInt("menuBotsUpdateDate", i).commit();
        this.d = true;
        if (tL_attachMenuBots != null) {
            if (!z) {
                getMessagesStorage().j1(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().a4(tL_attachMenuBots.users, z);
            gl.d3(new un6(this, (byte) 0));
            z2 = false;
            for (int i2 = 0; i2 < tL_attachMenuBots.bots.size(); i2++) {
                if (tL_attachMenuBots.bots.get(i2) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i2).show_in_attach_menu = true;
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (!z) {
            getMessagesStorage().a.c(new o57(this, tL_attachMenuBots, j, i, (byte) 7));
        } else if (z2 || Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600) {
            G0(false, true, null);
        }
    }

    public final void x() {
        if (getUserConfig().f0 != null) {
            String str = getUserConfig().f0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (!this.p0 && System.currentTimeMillis() - getUserConfig().j0 >= 86400000) {
            this.p0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xo6(this, (byte) 5));
        }
    }

    public final void x0(long j) {
        TLRPC.User V12;
        if (getUserConfig().W && cf3.D(j) && (V12 = getMessagesController().V1(Long.valueOf(j))) != null && !V12.bot && !V12.self) {
            getMessagesStorage().a.c(new ko6(this, j, (byte) 2));
        }
    }

    public final void x1(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i, boolean z) {
        if (tL_help_premiumPromo != null) {
            this.E = tL_help_premiumPromo;
            this.G = i;
            getMessagesController().a4(tL_help_premiumPromo.users, z);
            gl.d3(new un6(this, (byte) 4));
        }
        if (!z) {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().a.c(new j45(this, tL_help_premiumPromo, i, (byte) 7));
            }
            this.F = false;
        } else if (tL_help_premiumPromo != null && Math.abs((System.currentTimeMillis() / 1000) - i) < 86400) {
            this.F = false;
        } else {
            T0(false);
        }
    }

    public final void y() {
        if (!this.x0[1]) {
            if (!this.y0[1] || Math.abs((System.currentTimeMillis() / 1000) - this.r0[1]) >= 3600) {
                M0(true, true);
            }
        }
    }

    public final void y1(int i, int i2, ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        if (arrayList != null && i2 != 0) {
            ArrayList arrayList3 = this.h;
            arrayList3.clear();
            HashMap hashMap = this.r;
            hashMap.clear();
            ArrayList arrayList4 = this.n;
            arrayList4.clear();
            arrayList3.addAll(arrayList);
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                ((TLRPC.TL_availableReaction) arrayList3.get(i3)).positionInList = i3;
                hashMap.put(((TLRPC.TL_availableReaction) arrayList3.get(i3)).reaction, (TLRPC.TL_availableReaction) arrayList3.get(i3));
                if (!((TLRPC.TL_availableReaction) arrayList3.get(i3)).inactive) {
                    arrayList4.add((TLRPC.TL_availableReaction) arrayList3.get(i3));
                }
            }
            this.f = i;
        }
        this.x = i2;
        if (arrayList != null) {
            gl.d3(new un6(this, (byte) 8));
        }
        this.w = false;
        if (!z) {
            if (arrayList != null) {
                arrayList2 = new ArrayList(arrayList);
            } else {
                arrayList2 = null;
            }
            getMessagesStorage().a.c(new bo6(this, arrayList2, i, i2, (byte) 1));
            return;
        }
        System.currentTimeMillis();
        U0(false, Integer.valueOf(i));
    }

    public final void z() {
        if (!this.x0[0]) {
            if (!this.y0[0] || Math.abs((System.currentTimeMillis() / 1000) - this.r0[0]) >= 3600) {
                M0(false, true);
            }
        }
    }

    public final void z0(long r20, int r22, defpackage.qt0 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.z0(long, int, qt0):void");
    }

    public final void z1(int i, ArrayList arrayList, boolean z, int i2, final boolean z2) {
        final hq6 hq6Var;
        final int i3;
        final ArrayList arrayList2;
        final boolean z3;
        final int i4;
        if (arrayList != null) {
            hq6Var = this;
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
            getMessagesStorage().a.c(new Runnable() {
                @Override
                public final void run() {
                    int i5;
                    int i6;
                    hq6 hq6Var2 = hq6.this;
                    ArrayList arrayList3 = arrayList2;
                    try {
                        SQLiteDatabase sQLiteDatabase = hq6Var2.getMessagesStorage().b;
                        boolean z4 = z3;
                        byte b = i3;
                        if (z4) {
                            i5 = hq6Var2.getMessagesController().Y2;
                        } else if (b != 3 && b != 7) {
                            if (b == 2) {
                                i5 = hq6Var2.getMessagesController().X2;
                            } else {
                                i5 = hq6Var2.getMessagesController().W2;
                            }
                        } else {
                            i5 = 200;
                        }
                        sQLiteDatabase.beginTransaction();
                        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        int size = arrayList3.size();
                        if (z4) {
                            i6 = 2;
                        } else if (b == 0) {
                            i6 = 3;
                        } else if (b == 1) {
                            i6 = 4;
                        } else if (b == 3) {
                            i6 = 6;
                        } else if (b == 5) {
                            i6 = 7;
                        } else if (b == 7) {
                            i6 = 8;
                        } else {
                            i6 = 5;
                        }
                        boolean z5 = z2;
                        if (z5) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i6).stepThis().dispose();
                        }
                        int i7 = 0;
                        while (i7 < size && i7 != i5) {
                            TLRPC.Document document = (TLRPC.Document) arrayList3.get(i7);
                            executeFast.requery();
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            int i8 = i7;
                            sb.append(document.id);
                            executeFast.bindString(1, sb.toString());
                            executeFast.bindInteger(2, i6);
                            executeFast.bindString(3, "");
                            executeFast.bindString(4, "");
                            executeFast.bindString(5, "");
                            executeFast.bindInteger(6, 0);
                            executeFast.bindInteger(7, 0);
                            executeFast.bindInteger(8, 0);
                            int i9 = i4;
                            if (i9 == 0) {
                                i9 = size - i8;
                            }
                            executeFast.bindInteger(9, i9);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                            document.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(10, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            i7 = i8 + 1;
                        }
                        executeFast.dispose();
                        sQLiteDatabase.commitTransaction();
                        if (!z5 && arrayList3.size() >= i5) {
                            sQLiteDatabase.beginTransaction();
                            while (i5 < arrayList3.size()) {
                                sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList3.get(i5)).id + "' AND type = " + i6).stepThis().dispose();
                                i5++;
                            }
                            sQLiteDatabase.commitTransaction();
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
            });
        } else {
            hq6Var = this;
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
        }
        if (i4 == 0) {
            gl.d3(new kn6(hq6Var, z3, i3, arrayList2));
        }
    }
}
