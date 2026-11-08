package org.telegram.messenger;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class ui extends c1 {
    public static final Pattern R1 = Pattern.compile("\\*\\*(.+?)\\*\\*");
    public static final Pattern S1 = Pattern.compile("__(.+?)__");
    public static final Pattern T1 = Pattern.compile("\\|\\|(.+?)\\|\\|");
    public static final Pattern U1 = Pattern.compile("~~(.+?)~~");
    public static final String V1 = "org.telegram.messenger.SHORTCUT_SHARE";
    public static volatile ui[] W1 = new ui[4];
    public static final Object[] X1 = new Object[4];
    public static Paint Y1;
    public static Paint Z1;
    public static RectF f25795a2;
    public static Path f25796b2;
    public static final int f25797c2;
    public static final jg.x d2;
    public static final Pattern f25798e2;
    public final ArrayList A0;
    public final HashSet A1;
    public final ArrayList B0;
    public boolean B1;
    public boolean C0;
    public final ArrayList C1;
    public TLRPC.TL_help_premiumPromo D;
    public final long[] D0;
    public final ArrayList D1;
    public boolean E;
    public final ArrayList[] E0;
    public final ArrayList E1;
    public int F;
    public final Long[] F0;
    public boolean F1;
    public final ArrayList[] G;
    public final boolean[] G0;
    public boolean G1;
    public final a0.h[] H;
    public final boolean[] H0;
    public boolean H1;
    public final a0.h I;
    public final HashSet I0;
    public boolean I1;
    public final a0.h J;
    public boolean J0;
    public TLRPC.TL_emojiList J1;
    public final ArrayList K;
    public final HashMap K0;
    public TLRPC.TL_emojiList K1;
    public final ArrayList L;
    public int L0;
    public TLRPC.TL_emojiList L1;
    public final a0.h M;
    public int M0;
    public TLRPC.TL_emojiList M1;
    public final ConcurrentHashMap N;
    public long N0;
    public boolean N1;
    public TLRPC.TL_messages_stickerSet O;
    public long O0;
    public final a0.h O1;
    public TLRPC.TL_messages_stickerSet P;
    public long P0;
    public final HashMap P1;
    public final HashMap Q;
    public ch.o0 Q0;
    public final LruCache Q1;
    public final a0.h R;
    public int R0;
    public final HashSet S;
    public int S0;
    public final a0.h T;
    public TLRPC.User T0;
    public final Runnable[] U;
    public TLRPC.Chat U0;
    public final boolean[] V;
    public int V0;
    public final boolean[] W;
    public final int[] W0;
    public final long[] X;
    public final boolean[] X0;
    public final int[] Y;
    public final ArrayList Y0;
    public final HashMap Z;
    public final ArrayList Z0;
    public long f25799a;
    public final HashMap f25800a0;
    public ArrayList f25801a1;
    public TLRPC.TL_attachMenuBots f25802b;
    public final int[] f25803b0;
    public final SparseArray[] f25804b1;
    public boolean f25805c;
    public a0.h f25806c0;
    public final ArrayList f25807c1;
    public boolean d;
    public HashMap f25808d0;
    public String f25809d1;
    public int f25810e;
    public HashMap f25811e0;
    public int f25812e1;
    public int f25813f;
    public final ArrayList[] f25814f0;
    public boolean f25815f1;
    public final boolean[] f25816g0;
    public boolean f25817g1;
    public final ArrayList h;
    public final boolean[] f25818h0;
    public boolean f25819h1;
    public ArrayList f25820i0;
    public ArrayList f25821i1;
    public boolean f25822j0;
    public ArrayList f25823j1;
    public boolean f25824k0;
    public ArrayList f25825k1;
    public boolean f25826l0;
    public ArrayList l1;
    public boolean m0;
    public boolean f25827m1;
    public final ArrayList f25828n;
    public boolean f25829n0;
    public boolean n1;
    public boolean f25830o0;
    public final HashMap f25831o1;
    public final long[] f25832p0;
    public final a0.h f25833p1;
    public final int[] f25834q0;
    public final a0.h f25835q1;
    public final HashMap f25836r;
    public boolean f25837r0;
    public final a0.h f25838r1;
    public String f25839s;
    public final ArrayList[] f25840s0;
    public final a0.h f25841s1;
    public final a0.h[] f25842t0;
    public final SharedPreferences f25843t1;
    public final ArrayList[] f25844u0;
    public boolean f25845u1;
    public final ArrayList[] f25846v0;
    public final HashMap f25847v1;
    public boolean f25848w;
    public final boolean[] f25849w0;
    public final a0.h f25850w1;
    public int f25851x;
    public final boolean[] f25852x0;
    public final HashMap f25853x1;
    public boolean f25854y;
    public TLRPC.Document f25855y0;
    public final a0.h f25856y1;
    public final yf.d f25857z0;
    public final HashMap f25858z1;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            X1[i7] = new Object();
        }
        f25797c2 = 1;
        d2 = new jg.x(20);
        f25798e2 = Pattern.compile("(?<![A-Za-z0-9_+/=:-])(?:-?[0-9]{1,10}:[0-9a-fA-F]{64}|[A-Za-z0-9_+/-]{48})(?![A-Za-z0-9_+/=:-])");
    }

    public ui(int i7) {
        super(i7);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z9;
        int i10;
        long j3;
        this.f25802b = new TLRPC.TL_attachMenuBots();
        this.h = new ArrayList();
        this.f25828n = new ArrayList();
        this.f25836r = new HashMap();
        this.G = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(0), new ArrayList(), new ArrayList(), new ArrayList()};
        this.H = new a0.h[]{new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h()};
        this.I = new a0.h();
        this.J = new a0.h();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new a0.h();
        this.N = new ConcurrentHashMap(100, 1.0f, 1);
        this.O = null;
        this.P = null;
        this.Q = new HashMap();
        this.R = new a0.h();
        this.S = new HashSet();
        this.T = new a0.h();
        this.U = new Runnable[7];
        this.V = new boolean[7];
        this.W = new boolean[7];
        this.X = new long[7];
        this.Y = new int[7];
        this.Z = new HashMap();
        this.f25800a0 = new HashMap();
        this.f25803b0 = new int[7];
        this.f25806c0 = new a0.h();
        this.f25808d0 = new HashMap();
        this.f25811e0 = new HashMap();
        this.f25814f0 = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        this.f25816g0 = new boolean[9];
        this.f25818h0 = new boolean[9];
        this.f25820i0 = new ArrayList();
        this.f25832p0 = new long[2];
        this.f25834q0 = new int[2];
        this.f25840s0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f25842t0 = new a0.h[]{new a0.h(), new a0.h()};
        this.f25844u0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f25846v0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f25849w0 = new boolean[2];
        this.f25852x0 = new boolean[2];
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.D0 = new long[4];
        this.E0 = new ArrayList[4];
        this.F0 = new Long[4];
        this.G0 = new boolean[4];
        this.H0 = new boolean[4];
        this.I0 = new HashSet();
        this.K0 = new HashMap();
        this.W0 = new int[]{0, 0};
        this.X0 = new boolean[]{false, false};
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f25801a1 = new ArrayList();
        this.f25804b1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f25807c1 = new ArrayList();
        this.f25821i1 = new ArrayList();
        this.f25823j1 = new ArrayList();
        this.f25825k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f25831o1 = new HashMap();
        this.f25833p1 = new a0.h();
        this.f25835q1 = new a0.h();
        this.f25838r1 = new a0.h();
        this.f25841s1 = new a0.h();
        this.f25847v1 = new HashMap();
        this.f25850w1 = new a0.h();
        this.f25853x1 = new HashMap();
        this.f25856y1 = new a0.h();
        this.f25858z1 = new HashMap();
        this.A1 = new HashSet();
        this.B1 = false;
        this.C1 = new ArrayList();
        this.D1 = new ArrayList();
        this.E1 = new ArrayList();
        this.N1 = false;
        this.O1 = new a0.h();
        this.P1 = new HashMap();
        this.Q1 = new LruCache(25);
        if (this.currentAccount == 0) {
            this.f25843t1 = t0.f25566b.getSharedPreferences("drafts", 0);
        } else {
            this.f25843t1 = t0.f25566b.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f25843t1.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.A(key).longValue();
                serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (!key.startsWith("r_")) {
                z9 = key.startsWith("rt_");
                if (!z9) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        a0.h hVar = (a0.h) this.f25838r1.f(longValue);
                        if (hVar == null) {
                            hVar = new a0.h();
                            this.f25838r1.k(hVar, longValue);
                        }
                        if (key.startsWith("t_")) {
                            j3 = Utilities.A(key.substring(key.lastIndexOf(95) + 1)).longValue();
                        } else {
                            j3 = 0;
                        }
                        hVar.k(TLdeserialize, j3);
                    }
                    serializedData.cleanup();
                }
            } else {
                z9 = false;
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().f24489n);
                a0.h hVar2 = (a0.h) this.f25841s1.f(longValue);
                if (hVar2 == null) {
                    hVar2 = new a0.h();
                    this.f25841s1.k(hVar2, longValue);
                }
                if (z9) {
                    i10 = Utilities.z(key.substring(key.lastIndexOf(95) + 1)).intValue();
                } else {
                    i10 = 0;
                }
                hVar2.k(TLdeserialize2, i10);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        if (!arrayList.isEmpty()) {
            getMessagesStorage().f26719a.c(new jh(this, arrayList, 1));
        }
        c1("tg_placeholders_android", false, true);
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i11 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.r3.b(this.currentAccount)));
        for (int i12 = 0; i12 < i11; i12++) {
            SerializedData serializedData2 = new SerializedData(Utilities.v(sharedPreferences.getString("theme_" + i12, "")));
            try {
                org.telegram.ui.ActionBar.r3 c10 = org.telegram.ui.ActionBar.r3.c(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true));
                if (c10.f28463f.size() >= 4) {
                    arrayList2.add(new org.telegram.ui.Components.uo(c10));
                }
                d4.f21977s.c(new m9.u(this, arrayList2, false, 27));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        U0(false);
        F0(false);
        F0(true);
        this.f25857z0 = new yf.d(this.currentAccount);
        this.f25810e = getMessagesController().f24774e7.getInt("menuBotsUpdateDate", 0);
    }

    public static CharacterStyle J(CharacterStyle characterStyle, uy0 uy0Var, uy0 uy0Var2, boolean z9) {
        uy0 uy0Var3 = new uy0(uy0Var);
        if (uy0Var2 != null) {
            if (z9) {
                uy0Var3.b(uy0Var2);
            } else {
                uy0Var3.f38779a = uy0Var2.f38779a;
                uy0Var3.d = uy0Var2.d;
            }
        }
        if (characterStyle instanceof vy0) {
            return new vy0(uy0Var3, 0);
        }
        if (characterStyle instanceof d41) {
            return new d41(((d41) characterStyle).getURL(), uy0Var3);
        }
        return null;
    }

    public static boolean K(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i7);
            TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList2.get(i7);
            if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language) || (((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) || (((messageEntity instanceof TLRPC.TL_messageEntityMentionName) && ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) || ((messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id != ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id)))) {
                return false;
            }
        }
        return true;
    }

    public static void K1(ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public static void S1(SharedPreferences sharedPreferences, long j3, ArrayList arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", arrayList.size());
        edit.putLong("hash", j3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLObject tLObject = (TLObject) arrayList.get(i7);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i7, Utilities.f(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static ArrayList T0(SharedPreferences sharedPreferences) {
        int i7 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i7);
        if (i7 > 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("object_" + i10, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
        return arrayList;
    }

    public static TLRPC.TL_inputStickerSetID Z(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.f26976id = stickerSet.f26983id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            return tL_inputStickerSetID;
        }
        return null;
    }

    public static void a(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        org.telegram.ui.Components.r5[] r5VarArr;
        org.telegram.ui.Components.r5 r5Var;
        if (arrayList != null) {
            Spannable spannable = (Spannable) charSequence;
            for (org.telegram.ui.Components.r5 r5Var2 : (org.telegram.ui.Components.r5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.r5.class)) {
                if (r5Var2 != null) {
                    spannable.removeSpan(r5Var2);
                }
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i7);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i10 = messageEntity.offset;
                    int i11 = messageEntity.length + i10;
                    if (i10 < i11 && i11 <= spannable.length()) {
                        if (tL_messageEntityCustomEmoji.document != null) {
                            r5Var = new org.telegram.ui.Components.r5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                        } else {
                            r5Var = new org.telegram.ui.Components.r5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                        }
                        spannable.setSpan(r5Var, i10, i11, 33);
                    }
                }
            }
        }
    }

    public static TLRPC.TL_inputStickerSetItem a0(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.f26968id = document.f26962id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static ui b0(int i7) {
        ui uiVar;
        ui uiVar2 = W1[i7];
        if (uiVar2 == null) {
            synchronized (X1) {
                try {
                    uiVar = W1[i7];
                    if (uiVar == null) {
                        ui[] uiVarArr = W1;
                        ui uiVar3 = new ui(i7);
                        uiVarArr[i7] = uiVar3;
                        uiVar = uiVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return uiVar;
        }
        return uiVar2;
    }

    public static CharSequence d2(int i7, int i10, CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i7, i10);
        }
        if (charSequence instanceof SpannedString) {
            return ((SpannedString) charSequence).subSequence(i7, i10);
        }
        return TextUtils.substring(charSequence, i7, i10);
    }

    public static void e(int i7, int i10, int i11, ArrayList arrayList) {
        if ((i7 & 256) != 0) {
            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
            tL_messageEntitySpoiler.offset = i10;
            tL_messageEntitySpoiler.length = i11 - i10;
            arrayList.add(tL_messageEntitySpoiler);
        }
        if ((i7 & 1) != 0) {
            TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
            tL_messageEntityBold.offset = i10;
            tL_messageEntityBold.length = i11 - i10;
            arrayList.add(tL_messageEntityBold);
        }
        if ((i7 & 2) != 0) {
            TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
            tL_messageEntityItalic.offset = i10;
            tL_messageEntityItalic.length = i11 - i10;
            arrayList.add(tL_messageEntityItalic);
        }
        if ((i7 & 4) != 0) {
            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode.offset = i10;
            tL_messageEntityCode.length = i11 - i10;
            arrayList.add(tL_messageEntityCode);
        }
        if ((i7 & 8) != 0) {
            TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
            tL_messageEntityStrike.offset = i10;
            tL_messageEntityStrike.length = i11 - i10;
            arrayList.add(tL_messageEntityStrike);
        }
        if ((i7 & 16) != 0) {
            TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
            tL_messageEntityUnderline.offset = i10;
            tL_messageEntityUnderline.length = i11 - i10;
            arrayList.add(tL_messageEntityUnderline);
        }
    }

    public static void f(org.telegram.ui.Components.vy0 r16, int r17, int r18, android.text.Spannable r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.f(org.telegram.ui.Components.vy0, int, int, android.text.Spannable, boolean):void");
    }

    public static int f0(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia o12 = ij.o1(message);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return 8;
        }
        if (o12 instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        if (o12 instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = o12.document;
            if (document == null) {
                return -1;
            }
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    z9 = documentAttribute.round_message;
                    z11 = !z9;
                    z10 = z9;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z12 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    z9 = documentAttribute.voice;
                    z14 = !z9;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    z13 = true;
                }
            }
            if (!z9 && !z10) {
                if (z11 && !z12 && !z13) {
                    return 0;
                }
                if (z13) {
                    return -1;
                }
                if (z12) {
                    return 5;
                }
                if (!z14) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }
        if (!message.entities.isEmpty()) {
            for (int i10 = 0; i10 < message.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i10);
                if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static void g(ArrayList arrayList, CharSequence charSequence, Spannable spannable, int i7) {
        int i10;
        ArrayList arrayList2;
        ArrayList t02;
        int i11;
        int i12;
        int i13;
        for (vy0 vy0Var : (vy0[]) spannable.getSpans(0, spannable.length(), vy0.class)) {
            spannable.removeSpan(vy0Var);
        }
        int i14 = 1;
        int i15 = 100;
        if (arrayList != null && arrayList.size() > 100) {
            t02 = t0(arrayList, charSequence, i7);
            i10 = 1;
        } else {
            if (arrayList == null || arrayList.isEmpty() || charSequence == null || charSequence.length() == 0 || arrayList.size() > 1000) {
                i10 = 1;
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i16);
                    if (messageEntity != null) {
                        arrayList3.add(messageEntity);
                    }
                }
                Collections.sort(arrayList3, new jg.x(24));
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i17 = 0;
                int i18 = 0;
                loop3: while (true) {
                    if (i17 < size2) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i17);
                        if (messageEntity2.length <= 0 || (i13 = messageEntity2.offset) < 0 || i13 >= charSequence.length() || (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            i10 = i14;
                            i12 = i15;
                        } else {
                            ?? obj = new Object();
                            int i19 = messageEntity2.offset;
                            obj.f38780b = i19;
                            obj.f38781c = Math.min(messageEntity2.length, charSequence.length() - obj.f38780b) + i19;
                            if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                                obj.f38779a = 256;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                                obj.f38779a = 8;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                                obj.f38779a = 16;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                                obj.f38779a = i14;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                                obj.f38779a = 2;
                            } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                                if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                    obj.f38779a = 64;
                                    obj.d = messageEntity2;
                                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    obj.f38779a = 64;
                                    obj.d = messageEntity2;
                                } else {
                                    obj.f38779a = 128;
                                    obj.d = messageEntity2;
                                }
                            } else {
                                obj.f38779a = 4;
                            }
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                obj.f38779a |= 1024;
                            }
                            obj.f38779a &= i7;
                            int size3 = arrayList4.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 < size3) {
                                    i18++;
                                    if (i18 > 10000) {
                                        i10 = i14;
                                        break loop3;
                                    }
                                    uy0 uy0Var = (uy0) arrayList4.get(i20);
                                    int i21 = obj.f38780b;
                                    i10 = i14;
                                    int i22 = uy0Var.f38780b;
                                    if (i21 > i22) {
                                        int i23 = uy0Var.f38781c;
                                        if (i21 >= i23) {
                                            continue;
                                        } else if (obj.f38781c < i23) {
                                            if (arrayList4.size() > 98) {
                                                break loop3;
                                            }
                                            uy0 uy0Var2 = new uy0(obj);
                                            uy0Var2.b(uy0Var);
                                            arrayList4.add(i20 + 1, uy0Var2);
                                            uy0 uy0Var3 = new uy0(uy0Var);
                                            uy0Var3.f38780b = obj.f38781c;
                                            i20 += 2;
                                            arrayList4.add(i20, uy0Var3);
                                            size3 += 2;
                                            int i24 = obj.f38780b;
                                            obj.f38780b = uy0Var.f38781c;
                                            uy0Var.f38781c = i24;
                                        } else if (arrayList4.size() >= i15) {
                                            break loop3;
                                        } else {
                                            uy0 uy0Var4 = new uy0(obj);
                                            uy0Var4.b(uy0Var);
                                            uy0Var4.f38781c = uy0Var.f38781c;
                                            i20++;
                                            arrayList4.add(i20, uy0Var4);
                                            size3++;
                                            int i242 = obj.f38780b;
                                            obj.f38780b = uy0Var.f38781c;
                                            uy0Var.f38781c = i242;
                                        }
                                        i20++;
                                        i14 = i10;
                                        i15 = 100;
                                    } else {
                                        int i25 = obj.f38781c;
                                        if (i22 < i25) {
                                            int i26 = uy0Var.f38781c;
                                            if (i25 == i26) {
                                                uy0Var.b(obj);
                                            } else if (i25 < i26) {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                uy0 uy0Var5 = new uy0(uy0Var);
                                                uy0Var5.b(obj);
                                                uy0Var5.f38781c = obj.f38781c;
                                                i20++;
                                                arrayList4.add(i20, uy0Var5);
                                                size3++;
                                                uy0Var.f38780b = obj.f38781c;
                                            } else if (arrayList4.size() >= 100) {
                                                break loop3;
                                            } else {
                                                uy0 uy0Var6 = new uy0(obj);
                                                uy0Var6.f38780b = uy0Var.f38781c;
                                                i20++;
                                                arrayList4.add(i20, uy0Var6);
                                                size3++;
                                                uy0Var.b(obj);
                                            }
                                            obj.f38781c = i22;
                                        } else {
                                            continue;
                                        }
                                        i20++;
                                        i14 = i10;
                                        i15 = 100;
                                    }
                                } else {
                                    i10 = i14;
                                    if (obj.f38780b < obj.f38781c) {
                                        i12 = 100;
                                        if (arrayList4.size() >= 100) {
                                            break;
                                        }
                                        arrayList4.add(obj);
                                    } else {
                                        i12 = 100;
                                    }
                                }
                            }
                        }
                        i17++;
                        i15 = i12;
                        i14 = i10;
                    } else {
                        i10 = i14;
                        int size4 = arrayList4.size();
                        for (int i27 = 0; i27 < size4; i27++) {
                            uy0 uy0Var7 = (uy0) arrayList4.get(i27);
                            int i28 = uy0Var7.f38780b;
                            if (i28 >= 0 && i28 < (i11 = uy0Var7.f38781c) && i11 <= charSequence.length()) {
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                }
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                t02 = arrayList2;
            } else {
                t02 = t0(arrayList, charSequence, i7);
            }
        }
        for (int i29 = 0; i29 < Math.min(1000, t02.size()); i29++) {
            uy0 uy0Var8 = (uy0) t02.get(i29);
            f(new vy0(uy0Var8, 0), uy0Var8.f38780b, uy0Var8.f38781c, spannable, i10);
        }
    }

    public static void h(ij ijVar, Spannable spannable) {
        g(ijVar.f23262k.entities, ijVar.v, spannable, -1);
    }

    public static void i(TLRPC.DraftMessage draftMessage, SpannableString spannableString) {
        g(draftMessage.entities, draftMessage.message, spannableString, 264);
    }

    public static CharSequence j1(CharSequence charSequence, Pattern pattern, ArrayList arrayList, k9 k9Var) {
        boolean z9;
        TLRPC.MessageEntity messageEntity;
        URLSpan[] uRLSpanArr;
        String str = charSequence;
        Matcher matcher = pattern.matcher(str);
        int i7 = 0;
        int i10 = 0;
        while (i7 <= matcher.regionEnd() && matcher.find(i7)) {
            String group = matcher.group(1);
            if ((str instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) str).getSpans(matcher.start() - i10, matcher.end() - i10, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                messageEntity = null;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i11);
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode)) {
                        if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress)) {
                            int i12 = messageEntity2.offset + messageEntity2.length;
                            if (!g0.B1(matcher.start() - i10, matcher.start(1) - i10, messageEntity2.offset, i12)) {
                                if (!g0.B1(matcher.end(1) - i10, matcher.end() - i10, messageEntity2.offset, i12)) {
                                    continue;
                                } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && i12 == matcher.end() - i10 && matcher.end(1) - i10 > messageEntity2.offset) {
                                    messageEntity = messageEntity2;
                                }
                            }
                            z9 = false;
                            break;
                        }
                    } else {
                        int i13 = messageEntity2.offset;
                        if (g0.B1(matcher.start() - i10, matcher.end() - i10, i13, messageEntity2.length + i13)) {
                            z9 = false;
                            break;
                        }
                    }
                }
            } else {
                messageEntity = null;
            }
            if (z9) {
                str = ((Object) str.subSequence(0, matcher.start() - i10)) + group + ((Object) str.subSequence(matcher.end() - i10, str.length()));
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) k9Var.j(null);
                messageEntity3.offset = matcher.start() - i10;
                int length = group.length();
                messageEntity3.length = length;
                int i14 = messageEntity3.offset;
                int i15 = length + i14;
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i16);
                    int i17 = messageEntity4.offset;
                    if (i17 > i15) {
                        messageEntity4.offset = i17 - 4;
                    } else if (i17 > i14) {
                        messageEntity4.offset = i17 - 2;
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
                i10 += (matcher.end() - matcher.start()) - group.length();
                i7 = matcher.end();
            } else {
                i7 = matcher.start() + 1;
            }
        }
        return str;
    }

    public static TLRPC.TL_attachMenuBotIcon k0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i7);
            i7++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("default_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static void m1(ImageReceiver imageReceiver, hc hcVar, String str) {
        if (!sc.e(8200)) {
            return;
        }
        imageReceiver.f21225v1 = "preload";
        imageReceiver.h0(0);
        imageReceiver.q0(hcVar, str, null, null, 0, 11);
    }

    public static long n(int i7, ArrayList arrayList) {
        long j3 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i7, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document != null) {
                j3 = p(j3, document.f26962id);
            }
        }
        return j3;
    }

    public static long p(long j3, long j10) {
        long j11 = j3 ^ (j3 >>> 21);
        long j12 = j11 ^ (j11 << 35);
        return (j12 ^ (j12 >>> 4)) + j10;
    }

    public static long q(ArrayList arrayList) {
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null) {
                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set;
                if (!stickerSet.archived) {
                    j3 = p(j3, stickerSet.hash);
                }
            }
        }
        return j3;
    }

    public static long q0(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i7 = 0; i7 < document.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetID)) {
                    return -1L;
                }
                return inputStickerSet.f26976id;
            }
        }
        return -1L;
    }

    public static boolean r(TLRPC.Message message) {
        boolean z9 = message instanceof TLRPC.TL_message_secret;
        if (z9 && (((ij.o1(message) instanceof TLRPC.TL_messageMediaPhoto) || ij.M4(message) || ij.u3(message)) && ij.o1(message).ttl_seconds != 0 && ij.o1(message).ttl_seconds <= 60)) {
            return false;
        }
        if ((!z9 && (message instanceof TLRPC.TL_message) && (((ij.o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (ij.o1(message) instanceof TLRPC.TL_messageMediaDocument)) && ij.o1(message).ttl_seconds != 0)) || f0(message) == -1) {
            return false;
        }
        return true;
    }

    public static boolean t(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
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
        int i7 = 0;
        while (i7 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i7);
            i7++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || user == null || !user.bot || user.f27105id != tL_attachMenuBot.bot_id) {
                if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) || user == null || !user.bot || user.f27105id == tL_attachMenuBot.bot_id) {
                    if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || user == null || user.bot) {
                        if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || chat == null || t3.V(chat)) {
                            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && t3.V(chat)) {
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

    public static ArrayList t0(ArrayList arrayList, CharSequence charSequence, int i7) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty() && charSequence != null && charSequence.length() != 0 && arrayList.size() <= 1000) {
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i12);
                if (messageEntity != null) {
                    arrayList3.add(messageEntity);
                }
            }
            Collections.sort(arrayList3, new jg.x(23));
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int[] iArr = new int[arrayList3.size() * 2];
            int size2 = arrayList3.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i14);
                if (messageEntity2.length > 0 && (i10 = messageEntity2.offset) >= 0 && i10 < charSequence.length()) {
                    int i15 = messageEntity2.offset;
                    int min = Math.min(messageEntity2.length, charSequence.length() - i15) + i15;
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        ?? obj = new Object();
                        obj.f38780b = i15;
                        obj.f38781c = min;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                            obj.f38779a = 256;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                            obj.f38779a = 8;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                            obj.f38779a = 16;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                            obj.f38779a = 1;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                            obj.f38779a = 2;
                        } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                obj.f38779a = 64;
                                obj.d = messageEntity2;
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                obj.f38779a = 64;
                                obj.d = messageEntity2;
                            } else {
                                obj.f38779a = 128;
                                obj.d = messageEntity2;
                            }
                        } else {
                            obj.f38779a = 4;
                        }
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            obj.f38779a |= 1024;
                        }
                        obj.f38779a &= i7;
                        arrayList4.add(obj);
                        int i16 = i13 + 1;
                        iArr[i13] = i15;
                        i13 += 2;
                        iArr[i16] = min;
                    }
                }
            }
            if (i13 != 0) {
                Arrays.sort(iArr, 0, i13);
                int i17 = 0;
                while (i17 < i13) {
                    int i18 = iArr[i17];
                    while (i17 < i13 && iArr[i17] == i18) {
                        i17++;
                    }
                    if (i17 >= i13) {
                        break;
                    }
                    int i19 = iArr[i17];
                    int size3 = arrayList4.size();
                    uy0 uy0Var = null;
                    int i20 = Integer.MIN_VALUE;
                    int i21 = i11;
                    while (i21 < size3) {
                        uy0 uy0Var2 = (uy0) arrayList4.get(i21);
                        if (uy0Var2.f38780b <= i18) {
                            uy0Var = uy0Var;
                            if (uy0Var2.f38781c >= i19) {
                                if (uy0Var == null) {
                                    ?? obj2 = new Object();
                                    obj2.f38780b = i18;
                                    obj2.f38781c = i19;
                                    uy0Var = obj2;
                                }
                                uy0Var.f38779a = uy0Var2.f38779a | uy0Var.f38779a;
                                TLRPC.MessageEntity messageEntity3 = uy0Var2.d;
                                if (messageEntity3 != null && (uy0Var.d == null || uy0Var2.f38780b > i20)) {
                                    uy0Var.d = messageEntity3;
                                    i20 = uy0Var2.f38780b;
                                }
                            }
                        }
                        i21++;
                        uy0Var = uy0Var;
                    }
                    if (uy0Var != null) {
                        if (!arrayList2.isEmpty()) {
                            uy0 uy0Var3 = (uy0) jg.g.i(1, arrayList2);
                            if (uy0Var3.f38781c == uy0Var.f38780b && uy0Var3.f38779a == uy0Var.f38779a && uy0Var3.d == uy0Var.d) {
                                uy0Var3.f38781c = uy0Var.f38781c;
                            }
                        }
                        if (arrayList2.size() >= 1000) {
                            arrayList2.clear();
                            return arrayList2;
                        }
                        arrayList2.add(uy0Var);
                    }
                    i11 = 0;
                }
            }
        }
        return arrayList2;
    }

    public static String x0(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.f26976id + "access_hash" + inputStickerSet.access_hash;
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

    public static boolean y(int r5, java.util.ArrayList r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.y(int, java.util.ArrayList, boolean):boolean");
    }

    public static boolean z0(int i7, long j3) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i7 == 0) {
                str = "sdid_";
            } else {
                str = "bdid_";
            }
            String str2 = str + j3;
            List k10 = g0.f.k(t0.f25566b);
            for (int i10 = 0; i10 < k10.size(); i10++) {
                if (((g0.c) k10.get(i10)).f13397b.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A() {
        if (!this.f25848w && Math.abs((System.currentTimeMillis() / 1000) - this.f25851x) >= 3600) {
            S0(true, null);
        }
    }

    public final boolean A0(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.f25814f0;
            if (i7 >= arrayListArr[2].size()) {
                return false;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayListArr[2].get(i7);
            if (document2.f26962id == document.f26962id && document2.dc_id == document.dc_id) {
                return true;
            }
            i7++;
        }
    }

    public final void A1(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, int i7, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        org.telegram.ui.ActionBar.f2 f2Var2;
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.l(tL_messages_stickerSetInstallResultArchive.sets.get(i10).set.f26983id);
        }
        C0(i7, false);
        getNotificationCenter().k(qs.Y0, tL_messages_stickerSetInstallResultArchive.sets);
        if (f2Var != null && f2Var.getParentActivity() != null) {
            Activity parentActivity = f2Var.getParentActivity();
            if (z9) {
                f2Var2 = f2Var;
            } else {
                f2Var2 = null;
            }
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
            ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
            boolean z10 = stickerSetCovered.set.masks;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            if (z10) {
                alertDialog$Builder.d = 1;
                u1Var.R = id.M0(2131754131, null);
            } else {
                alertDialog$Builder.d = 0;
                u1Var.R = id.M0(2131754126, null);
            }
            alertDialog$Builder.f31935c = new ArrayList(arrayList);
            alertDialog$Builder.f31936e = f2Var2;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
            textView.setGravity(c8.ha.y());
            textView.setTextSize(1, 16.0f);
            textView.setPadding(g0.L(23.0f), g0.L(10.0f), g0.L(23.0f), 0);
            if (stickerSetCovered.set.masks) {
                textView.setText(id.M0(2131754132, null));
            } else {
                textView.setText(id.M0(2131754127, null));
            }
            linearLayout.addView(textView, c8.ha.o(-2, -2));
            pj0 pj0Var = new pj0(parentActivity, null);
            u1Var.getContext();
            pj0Var.setLayoutManager(new v4.b0(1, false));
            pj0Var.setAdapter(new zv0(alertDialog$Builder, parentActivity));
            pj0Var.setVerticalScrollBarEnabled(false);
            pj0Var.setPadding(g0.L(10.0f), 0, g0.L(10.0f), 0);
            pj0Var.setGlowColor(-657673);
            linearLayout.addView(pj0Var, c8.ha.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(id.M0(2131752041, null), new il0(11));
            if (f2Var2 != null) {
                alertDialog$Builder.k(id.M0(2131745498, null), new org.telegram.ui.Components.bx(alertDialog$Builder, 22));
            }
            f2Var.showDialog(u1Var);
        }
    }

    public final void B(int i7) {
        if (!this.V[i7]) {
            if (!this.W[i7] || Math.abs((System.currentTimeMillis() / 1000) - this.Y[i7]) >= 3600) {
                a1(i7, true, false);
            }
        }
    }

    public final boolean B0(long j3, boolean z9) {
        if (this.J.h(j3) >= 0 || (z9 && this.K.contains(Long.valueOf(j3)))) {
            if (z9 && this.L.contains(Long.valueOf(j3))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void B1(long j3, long j10, pi piVar) {
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long hash = Objects.hash(Long.valueOf(j3), Long.valueOf(j10));
        String str = hash + "";
        if (piVar == null) {
            sharedPreferences.edit().remove(str).apply();
            this.O1.l(hash);
            return;
        }
        sharedPreferences.edit().putString(str, piVar.toString()).apply();
        this.O1.k(piVar, hash);
    }

    public final void C() {
        if (getUserConfig().f24477c0 != null) {
            String str = getUserConfig().f24477c0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.m0 && System.currentTimeMillis() - getUserConfig().f24483g0 >= 86400000) {
            this.m0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ih(this, 7));
        }
    }

    public final void C0(int i7, boolean z9) {
        boolean z10;
        boolean z11 = false;
        if (z9) {
            int i10 = qp.s1(this.currentAccount).f24764d7.getInt("archivedStickersCount" + i7, -1);
            if (i10 == -1) {
                C0(i7, false);
                return;
            }
            this.f25803b0[i7] = i10;
            getNotificationCenter().k(qs.Z0, Integer.valueOf(i7));
            return;
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.limit = 0;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_messages_getArchivedStickers.masks = z10;
        if (i7 == 5) {
            z11 = true;
        }
        tL_messages_getArchivedStickers.emojis = z11;
        getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new ph(this, i7, 1));
    }

    public final void C1(TLRPC.TL_emojiStatus tL_emojiStatus) {
        ArrayList<TLRPC.EmojiStatus>[] arrayListArr = this.E0;
        if (arrayListArr[0] != null) {
            long j3 = tL_emojiStatus.document_id;
            int i7 = 0;
            while (i7 < arrayListArr[0].size()) {
                if ((arrayListArr[0].get(i7) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) arrayListArr[0].get(i7)).document_id == j3) {
                    arrayListArr[0].remove(i7);
                    i7--;
                }
                i7++;
            }
            arrayListArr[0].add(0, tL_emojiStatus);
            while (arrayListArr[0].size() > 50) {
                a8.p0.z(1, arrayListArr[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.D0[0];
            tL_emojiStatuses.statuses = arrayListArr[0];
            getMessagesStorage().f26719a.c(new l7(this, 0, tL_emojiStatuses, 8));
        }
    }

    public final void D(long j3, long j10, boolean z9) {
        TLRPC.DraftMessage draftMessage;
        a0.h hVar = this.f25838r1;
        a0.h hVar2 = (a0.h) hVar.f(j3);
        if (hVar2 != null) {
            draftMessage = (TLRPC.DraftMessage) hVar2.f(j10);
        } else {
            draftMessage = null;
        }
        if (draftMessage != null) {
            if (!z9) {
                a0.h hVar3 = (a0.h) hVar.f(j3);
                if (hVar3 != null) {
                    hVar3.l(j10);
                    if (hVar3.m() == 0) {
                        hVar.l(j3);
                    }
                }
                a0.h hVar4 = this.f25841s1;
                a0.h hVar5 = (a0.h) hVar4.f(j3);
                if (hVar5 != null) {
                    hVar5.l(j10);
                    if (hVar5.m() == 0) {
                        hVar4.l(j3);
                    }
                }
                int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                SharedPreferences sharedPreferences = this.f25843t1;
                if (i7 == 0) {
                    sharedPreferences.edit().remove("" + j3).remove("r_" + j3).commit();
                    getMessagesController().T4(null);
                    getNotificationCenter().k(qs.f25070s, new Object[0]);
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                StringBuilder t6 = a8.p0.t(j3, "t_", "_");
                t6.append(j10);
                SharedPreferences.Editor remove = edit.remove(t6.toString());
                StringBuilder t10 = a8.p0.t(j3, "rt_", "_");
                t10.append(j10);
                remove.remove(t10.toString()).commit();
                return;
            }
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo != null && inputReplyTo.reply_to_msg_id == 0) {
                return;
            }
            if (inputReplyTo != null) {
                inputReplyTo.reply_to_msg_id = 0;
            }
            draftMessage.flags &= -2;
            Q1(j3, j10, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true, null);
        }
    }

    public final void D0() {
        E0(false, true, null);
    }

    public final void D1(long j3, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.f25847v1.put(botInfo.user_id + "_" + j3, botInfo);
        getMessagesStorage().f26719a.c(new a4(this, botInfo, j3, 12));
    }

    public final void E(boolean z9) {
        this.f25838r1.b();
        this.f25841s1.b();
        this.f25835q1.b();
        this.f25843t1.edit().clear().commit();
        if (z9) {
            getMessagesController().T4(null);
            getNotificationCenter().k(qs.f25070s, new Object[0]);
        }
    }

    public final void E0(boolean z9, boolean z10, jv0 jv0Var) {
        long j3;
        this.f25805c = true;
        if (z9) {
            getMessagesStorage().f26719a.c(new fg(this, 15));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        if (z10) {
            j3 = 0;
        } else {
            j3 = this.f25799a;
        }
        tL_messages_getAttachMenuBots.hash = j3;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new r4(5, this, jv0Var));
    }

    public final void E1(xr xrVar, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        if (xrVar != null) {
            try {
                int i7 = 0;
                if (xrVar.f26521b != 0) {
                    SQLiteDatabase sQLiteDatabase = getMessagesStorage().f26721b;
                    Locale locale = Locale.US;
                    long j3 = xrVar.f26520a;
                    long j10 = xrVar.f26521b;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + j3 + " AND tid = " + j10, new Object[0]);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().f26721b;
                    Locale locale2 = Locale.US;
                    long j11 = xrVar.f26520a;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + j11, new Object[0]);
                }
                if (queryFinalized.next()) {
                    i7 = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
                if (i7 >= message.f26977id && !ij.g3(i7) && !ij.g3(message.f26977id)) {
                    return;
                }
                if (xrVar.f26521b != 0) {
                    executeFast = getMessagesStorage().f26721b.executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = getMessagesStorage().f26721b.executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                }
                executeFast.requery();
                ij.r5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (xrVar.f26521b != 0) {
                    executeFast.bindLong(1, xrVar.f26520a);
                    executeFast.bindLong(2, xrVar.f26521b);
                    executeFast.bindInteger(3, message.f26977id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, xrVar.f26520a);
                    executeFast.bindInteger(2, message.f26977id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                g0.h3(new qg(this, xrVar, message));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void F() {
        this.f25821i1.clear();
        this.f25823j1.clear();
        this.f25825k1.clear();
        this.l1.clear();
        getNotificationCenter().k(qs.S0, new Object[0]);
        getNotificationCenter().k(qs.T0, new Object[0]);
        getNotificationCenter().k(qs.U0, new Object[0]);
        getNotificationCenter().k(qs.V0, new Object[0]);
        getMessagesStorage().f26719a.c(new fg(this, 16));
        m();
    }

    public final void F0(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.F0(boolean):void");
    }

    public final void F1(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().f26719a.c(new dg(this, tL_messages_stickerSet, str, i7, 8));
    }

    public final boolean G(long j3) {
        for (int i7 = 0; i7 < this.f25821i1.size(); i7++) {
            if (m5.o(((TLRPC.TL_topPeer) this.f25821i1.get(i7)).peer) == j3) {
                return true;
            }
        }
        return false;
    }

    public final void G0(long j3, long j10, boolean z9, int i7, jk jkVar) {
        if (z9) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.f25847v1.get(j3 + "_" + j10);
            if (botInfo != null) {
                getNotificationCenter().k(qs.D0, botInfo, Integer.valueOf(i7));
                return;
            }
        }
        getMessagesStorage().f26719a.c(new wh(this, j3, j10, jkVar, i7, 0));
    }

    public final void G1(final boolean z9, ArrayList arrayList, final ArrayList arrayList2, final int i7, final long j3, final boolean z10) {
        ArrayList arrayList3;
        if (arrayList != null) {
            arrayList3 = new ArrayList(arrayList);
        } else {
            arrayList3 = null;
        }
        final ArrayList arrayList4 = arrayList3;
        getMessagesStorage().f26719a.c(new Runnable() {
            @Override
            public final void run() {
                int i10;
                int i11;
                ArrayList arrayList5 = arrayList2;
                long j10 = j3;
                boolean z11 = z10;
                ui uiVar = ui.this;
                ArrayList arrayList6 = arrayList4;
                boolean z12 = z9;
                int i12 = i7;
                try {
                    if (arrayList6 != null) {
                        SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f26721b.executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        int i13 = 4;
                        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                            i13 += ((TLRPC.StickerSetCovered) arrayList6.get(i14)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i13);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList5.size() * 8) + 4);
                        nativeByteBuffer.writeInt32(arrayList6.size());
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            ((TLRPC.StickerSetCovered) arrayList6.get(i15)).serializeToStream(nativeByteBuffer);
                        }
                        nativeByteBuffer2.writeInt32(arrayList5.size());
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            nativeByteBuffer2.writeInt64(((Long) arrayList5.get(i16)).longValue());
                        }
                        if (z12) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        executeFast.bindInteger(1, i11);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer2);
                        executeFast.bindInteger(4, i12);
                        executeFast.bindLong(5, j10);
                        executeFast.bindInteger(6, z11 ? 1 : 0);
                        executeFast.bindInteger(7, z12 ? 1 : 0);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().f26721b.executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                    executeFast2.requery();
                    executeFast2.bindInteger(1, i12);
                    if (z12) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    executeFast2.bindInteger(2, i10);
                    executeFast2.bindInteger(3, z12 ? 1 : 0);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        });
    }

    public final Intent H(long j3) {
        if (j3 != 0) {
            Intent intent = new Intent(t0.f25566b, OpenAttachedMenuBotReceiver.class);
            if (m5.E(j3)) {
                intent.putExtra("botId", j3);
                intent.putExtra("currentAccount", this.currentAccount);
                StringBuilder sb2 = new StringBuilder("com.tmessages.openshortcutbot");
                int i7 = OpenAttachedMenuBotReceiver.f21330a;
                sb2.append(j3);
                intent.setAction(sb2.toString());
                intent.addFlags(67108864);
                return intent;
            }
            return null;
        }
        return null;
    }

    public final TL_bots.BotInfo H0(long j3, long j10) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase sQLiteDatabase = getMessagesStorage().f26721b;
        Locale locale = Locale.US;
        StringBuilder t6 = a8.p0.t(j3, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        t6.append(j10);
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(t6.toString(), new Object[0]);
        if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        } else {
            botInfo = null;
        }
        queryFinalized.dispose();
        return botInfo;
    }

    public final void H1(long j3, long j10, int i7, int i10) {
        getMessagesStorage().f26719a.c(new mg(this, j10, j3, i7, i10, 1));
    }

    public final Intent I(long j3) {
        Intent intent = new Intent(t0.f25566b, OpenChatReceiver.class);
        if (m5.C(j3)) {
            int i7 = (int) (4294967295L & j3);
            intent.putExtra("encId", i7);
            if (getMessagesController().a1(Integer.valueOf(i7)) == null) {
                return null;
            }
        } else if (m5.E(j3)) {
            intent.putExtra("userId", j3);
        } else if (!m5.z(j3)) {
            return null;
        } else {
            intent.putExtra("chatId", -j3);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j3);
        intent.addFlags(67108864);
        return intent;
    }

    public final void I0(xr xrVar, boolean z9) {
        TLRPC.Message message = (TLRPC.Message) this.f25853x1.get(xrVar);
        if (message != null) {
            getNotificationCenter().k(qs.G0, message, xrVar);
        } else {
            getMessagesStorage().f26719a.c(new yf(this, xrVar, z9, 7));
        }
    }

    public final void I1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9) {
        TLRPC.StickerSet stickerSet;
        int i7;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.I.k(tL_messages_stickerSet, stickerSet.f26983id);
            if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
                this.N.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            }
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.G;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList = arrayListArr[i10];
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i11);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.f26983id == tL_messages_stickerSet.set.f26983id) {
                            arrayList.set(i11, tL_messages_stickerSet);
                        }
                    }
                }
                i10++;
            }
            long j3 = tL_messages_stickerSet.set.f26983id;
            a0.h hVar = this.M;
            if (hVar.d(j3)) {
                hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f26983id);
            }
            U1(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
            if (stickerSet3.masks) {
                i7 = 1;
            } else if (stickerSet3.emojis) {
                i7 = 5;
            } else {
                i7 = 0;
            }
            if (z9) {
                getNotificationCenter().k(qs.f25104x0, Integer.valueOf(i7), Boolean.TRUE);
            }
        }
    }

    public final void J0() {
        if (!getUserConfig().f24497w && !this.f25845u1) {
            this.f25845u1 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new ih(this, 0));
        }
    }

    public final void J1(int i7, int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        getMessagesStorage().f26719a.c(new b1(this, arrayList2, i7, i10, j3));
    }

    public final void K0(boolean z9, boolean z10) {
        long j3;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.f25849w0;
        if (zArr[z9 ? 1 : 0]) {
            return;
        }
        zArr[z9 ? 1 : 0] = true;
        if (z10) {
            getMessagesStorage().f26719a.c(new qh(this, z9, 1));
            return;
        }
        long[] jArr = this.f25832p0;
        if (z9) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j3 = jArr[1];
            tL_messages_getFeaturedEmojiStickers.hash = j3;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j3 = jArr[0];
            tL_messages_getFeaturedStickers2.hash = j3;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new sf(this, z9, j3, 0));
    }

    public final void L(int i7, boolean z9) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.H0;
        if (zArr[i7]) {
            return;
        }
        zArr[i7] = true;
        if (z9) {
            getMessagesStorage().f26719a.c(new og(this, i7, 1));
            return;
        }
        long[] jArr = this.D0;
        if (i7 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = jArr[i7];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i7 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = jArr[i7];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = jArr[i7];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new ph(this, i7, 0));
    }

    public final void L0(TLRPC.StickerSet stickerSet, boolean z9) {
        if (z9) {
            getMessagesStorage().f26719a.c(new x4(29, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.f26976id = stickerSet.f26983id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ih(this, 6));
    }

    public final void L1(long j3) {
        ArrayList arrayList = this.f25823j1;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((TLRPC.TL_topPeer) arrayList.get(i7)).peer.user_id == j3) {
                arrayList.remove(i7);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().j1(j3);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new di.u5(11));
                getMessagesStorage().f26719a.c(new bi.ia(this, j3, 1, 4));
                getNotificationCenter().k(qs.T0, new Object[0]);
                return;
            }
        }
    }

    public final void M(String[] strArr, boolean z9) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = this.f25858z1;
                    if (hashMap.get(str) == null) {
                        if (!z9 || !this.A1.contains(str)) {
                            hashMap.put(str, Boolean.TRUE);
                            getMessagesStorage().f26719a.c(new lh(this, str, 5));
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

    public final void M0(boolean z9) {
        if (!this.n1 && getUserConfig().V) {
            if (z9) {
                if (!this.f25827m1) {
                    this.n1 = true;
                    getMessagesStorage().f26719a.c(new fg(this, 13));
                    this.f25827m1 = true;
                    return;
                }
                return;
            }
            this.n1 = true;
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
            getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new d3.b(1), new d(this, 3));
        }
    }

    public final void M1(int i7) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.Y0;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i7 == ((ij) arrayList.get(i11)).f1()) {
                this.f25807c1.add((ij) arrayList.remove(i11));
                i11--;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.Z0;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (i7 == ((ij) arrayList2.get(i12)).f1()) {
                arrayList2.remove(i12);
                i12--;
            }
            i12++;
        }
        while (i10 < this.f25801a1.size()) {
            if (i7 == ((ij) this.f25801a1.get(i10)).f1()) {
                this.f25801a1.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void N(TLRPC.InputStickerSet inputStickerSet, v10 v10Var) {
        String x02 = x0(inputStickerSet);
        HashMap hashMap = this.K0;
        ArrayList arrayList = (ArrayList) hashMap.get(x02);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(v10Var);
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(x02, arrayList);
        }
        arrayList.add(v10Var);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new yh(this, x02, 0));
    }

    public final void N0(final long r17, final int r19, final int r20, final int r21, final int r22, final long r23, int r25, final int r26, final int r27, ch.o0 r28, java.lang.String r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.N0(long, int, int, int, int, long, int, int, int, ch.o0, java.lang.String):void");
    }

    public final void N1(long j3) {
        for (int i7 = 0; i7 < this.f25821i1.size(); i7++) {
            if (((TLRPC.TL_topPeer) this.f25821i1.get(i7)).peer.user_id == j3) {
                this.f25821i1.remove(i7);
                getNotificationCenter().k(qs.S0, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().j1(j3);
                getMessagesStorage().f26719a.c(new bi.ia(this, j3, 0, 4));
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new di.u5(11));
                return;
            }
        }
    }

    public final void O(ArrayList arrayList, Integer num, boolean z9, boolean z10, Runnable runnable) {
        if (arrayList.isEmpty()) {
            runnable.run();
            return;
        }
        ArrayList[] arrayListArr = {s0(5)};
        mh mhVar = new mh(this, num, arrayList, z10, z9, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 == null || arrayList2.isEmpty()) && !this.B1) {
            this.B1 = true;
            boolean[] zArr = new boolean[1];
            g0.h3(new em(this, zArr, arrayListArr, mhVar, 15));
            g0.i3(new x4(28, zArr, mhVar), 900L);
            return;
        }
        mhVar.run();
    }

    public final void O0() {
        if (!this.f25815f1 && this.L0 == 0) {
            boolean[] zArr = this.X0;
            if (!zArr[0] || this.N0 != 0 || !zArr[1]) {
                int i7 = this.f25812e1;
                this.f25812e1 = this.Y0.size();
                this.f25815f1 = true;
                X1(null, this.P0, this.N0, this.S0, 1, this.O0, false, this.T0, this.U0, false, this.Q0);
                this.f25812e1 = i7;
            }
        }
    }

    public final void O1(int i7, ArrayList arrayList) {
        ArrayList[] arrayListArr = this.G;
        Collections.sort(arrayListArr[i7], new gh(0, arrayList));
        this.X[i7] = q(arrayListArr[i7]);
        getNotificationCenter().k(qs.f25104x0, Integer.valueOf(i7), Boolean.FALSE);
    }

    public final java.util.ArrayList P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.P():java.util.ArrayList");
    }

    public final ArrayList P0(long j3, long j10, ArrayList arrayList, boolean z9) {
        ?? join;
        CharSequence charSequence;
        ArrayList arrayList2;
        ArrayList arrayList3;
        char c10;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = (Integer) arrayList.get(i10);
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
            int i11 = 1;
            long j11 = getUserConfig().f24489n;
            Object obj = join;
            char c11 = 2;
            ?? r10 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().f26721b.queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", obj, Long.valueOf(j3)), new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r10);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j11);
                        TLdeserialize.f26977id = queryFinalized.intValue(i11);
                        c10 = 2;
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j3;
                        yr.e(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.f26977id));
                    } else {
                        c10 = c11;
                    }
                    byteBufferValue.reuse();
                } else {
                    c10 = c11;
                }
                c11 = c10;
                r10 = 0;
                i11 = 1;
            }
            queryFinalized.dispose();
            if (arrayList4.isEmpty()) {
                charSequence = ",";
            } else {
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().f26721b;
                Locale locale = Locale.US;
                charSequence = ",";
                ?? r11 = 0;
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j3 + " AND mid IN (" + TextUtils.join(charSequence, arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(r11);
                    if (byteBufferValue2 != null) {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r11), r11);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j11);
                            TLdeserialize2.dialog_id = j3;
                            yr.e(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.f26977id));
                        }
                        byteBufferValue2.reuse();
                    }
                    r11 = 0;
                }
                queryFinalized2.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (i7 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().h1(j10);
                    tL_channels_getMessages.f26994id = arrayList4;
                    arrayList2 = arrayList9;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new ag(this, j10, j3, tL_channels_getMessages));
                } else {
                    arrayList2 = arrayList9;
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f27052id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new oj(this, j3, tL_messages_getMessages, 1));
                }
            } else {
                arrayList2 = arrayList9;
            }
            if (!arrayList5.isEmpty()) {
                try {
                    if (!arrayList8.isEmpty()) {
                        getMessagesStorage().n0(arrayList8, arrayList6, false);
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList3 = arrayList7;
                        getMessagesStorage().Q(TextUtils.join(charSequence, arrayList2), arrayList3);
                    } else {
                        arrayList3 = arrayList7;
                    }
                    if (z9) {
                        return k(arrayList5, arrayList6, arrayList3, true, true);
                    }
                    k(arrayList5, arrayList6, arrayList3, true, false);
                    return null;
                } catch (Exception e10) {
                    e = e10;
                    a8.g(e, true);
                    return null;
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void P1(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.P1(org.telegram.tgnet.TLRPC$TL_messages_stickerSet):void");
    }

    public final String Q() {
        String str = this.f25839s;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        String string = qp.s1(this.currentAccount).f24784f7.getString("reaction_on_double_tap", null);
        if (string != null && (this.f25836r.get(string) != null || string.startsWith("animated_"))) {
            this.f25839s = string;
            return string;
        }
        return ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
    }

    public final void Q0(final int i7, final int i10, final long j3) {
        a0.h hVar = this.f25833p1;
        if (hVar.h(j3) >= 0) {
            return;
        }
        hVar.k(Boolean.TRUE, j3);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().j1(j3);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i7;
        tL_messages_search.f27067q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i11;
                boolean z9;
                a0.h hVar2;
                ui uiVar = ui.this;
                uiVar.getClass();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                boolean z10 = tLObject instanceof TLRPC.messages_Messages;
                int i12 = i10;
                int i13 = 1;
                if (z10) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages.users.size(); i14++) {
                        TLRPC.User user = messages_messages.users.get(i14);
                        hVar3.k(user, user.f27105id);
                    }
                    a0.h hVar4 = new a0.h();
                    for (int i15 = 0; i15 < messages_messages.chats.size(); i15++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i15);
                        hVar4.k(chat, chat.f26956id);
                    }
                    uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    uiVar.getMessagesController().Y3(messages_messages.users, false);
                    uiVar.getMessagesController().S3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.Message message = messages_messages.messages.get(i16);
                        if ((message instanceof TLRPC.TL_messageService) || (message instanceof TLRPC.TL_messageEmpty)) {
                            hVar2 = hVar4;
                        } else {
                            arrayList.add(Integer.valueOf(message.f26977id));
                            hVar2 = hVar4;
                            hashMap.put(Integer.valueOf(message.f26977id), new ij(uiVar.currentAccount, message, hVar3, hVar2, false, false));
                        }
                        i16++;
                        hVar4 = hVar2;
                    }
                    if (i12 != 0 && arrayList.isEmpty()) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                    if (messages_messages.messages.size() >= tL_messages_search.limit) {
                        i13 = 0;
                    }
                    i11 = Math.max(messages_messages.count, messages_messages.messages.size());
                    z9 = i13;
                } else {
                    if (i12 != 0) {
                        arrayList.add(Integer.valueOf(i12));
                    } else {
                        i13 = 0;
                    }
                    i11 = i13;
                    z9 = false;
                }
                yr messagesStorage = uiVar.getMessagesStorage();
                long j10 = j3;
                messagesStorage.c2(j10, arrayList, true, i11, i7, z9, hashMap);
                g0.h3(new yg(uiVar, j10, 1));
            }
        });
    }

    public final void Q1(long r23, long r25, java.lang.CharSequence r27, java.util.ArrayList r28, org.telegram.tgnet.TLRPC.Message r29, org.telegram.ui.qm r30, org.telegram.tgnet.TLRPC.SuggestedPost r31, long r32, boolean r34, boolean r35, org.telegram.tgnet.tl.TL_iv.RichMessage r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.Q1(long, long, java.lang.CharSequence, java.util.ArrayList, org.telegram.tgnet.TLRPC$Message, org.telegram.ui.qm, org.telegram.tgnet.TLRPC$SuggestedPost, long, boolean, boolean, org.telegram.tgnet.tl.TL_iv$RichMessage):void");
    }

    public final TLRPC.DraftMessage R(long j3, long j10) {
        a0.h hVar = (a0.h) this.f25838r1.f(j3);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) hVar.f(j10);
    }

    public final void R0(boolean z9) {
        this.E = true;
        if (z9) {
            getMessagesStorage().f26719a.c(new fg(this, 17));
            return;
        }
        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new ih(this, 9));
    }

    public final void R1(final long j3, final long j10, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z9) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        final long j11;
        TLRPC.Chat M0;
        final long j12;
        StringBuilder sb2;
        if (getMessagesController().t2(j3) && j10 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences sharedPreferences = this.f25843t1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        qp messagesController = getMessagesController();
        a0.h hVar = this.f25838r1;
        a0.h hVar2 = this.f25841s1;
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar3 = (a0.h) hVar.f(j3);
            if (hVar3 == null) {
                hVar3 = new a0.h();
                hVar.k(hVar3, j3);
            }
            hVar3.k(draftMessage, j10);
            int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 == 0) {
                messagesController.T3(j3, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (i7 == 0) {
                    sb2 = new StringBuilder("");
                    sb2.append(j3);
                } else {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j3);
                    sb2.append("_");
                    sb2.append(j10);
                }
                edit.putString(sb2.toString(), Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            a0.h hVar4 = (a0.h) hVar.f(j3);
            if (hVar4 != null) {
                hVar4.l(j10);
                if (hVar4.m() == 0) {
                    hVar.l(j3);
                }
            }
            a0.h hVar5 = (a0.h) hVar2.f(j3);
            if (hVar5 != null) {
                hVar5.l(j10);
                if (hVar5.m() == 0) {
                    hVar2.l(j3);
                }
            }
            if (j10 == 0) {
                sharedPreferences.edit().remove("" + j3).remove("r_" + j3).commit();
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                StringBuilder t6 = a8.p0.t(j3, "t_", "_");
                t6.append(j10);
                SharedPreferences.Editor remove = edit2.remove(t6.toString());
                StringBuilder t10 = a8.p0.t(j3, "rt_", "_");
                t10.append(j10);
                remove.remove(t10.toString()).commit();
            }
            a0.h hVar6 = messagesController.Q;
            TLRPC.Dialog dialog = (TLRPC.Dialog) hVar6.f(j3);
            if (dialog != null && dialog.top_message == 0) {
                hVar6.l(dialog.f26960id);
                messagesController.f24944y.remove(dialog);
            }
        }
        a0.h hVar7 = (a0.h) hVar2.f(j3);
        TLRPC.User user = null;
        if (message == null && draftMessage != null && draftMessage.reply_to != null) {
            if (hVar7 != null) {
                message2 = (TLRPC.Message) hVar7.f(j10);
            }
            message2 = message;
        } else {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        }
        if (message2 == null) {
            if (hVar7 != null) {
                hVar7.l(j10);
                if (hVar7.m() == 0) {
                    hVar2.l(j3);
                }
            }
            if (j10 == 0) {
                edit.remove("r_" + j3);
            } else {
                StringBuilder t11 = a8.p0.t(j3, "rt_", "_");
                t11.append(j10);
                edit.remove(t11.toString());
            }
        } else {
            if (hVar7 == null) {
                hVar7 = new a0.h();
                hVar2.k(hVar7, j3);
            }
            hVar7.k(message2, j10);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j10 == 0) {
                    str = "r_" + j3;
                } else {
                    str = "rt_" + j3 + "_" + j10;
                }
                edit.putString(str, Utilities.f(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        edit.commit();
        if (z9) {
            if (j10 == 0 || getMessagesController().t2(j3)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == 0 || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    if ((inputReplyTo.flags & 2) != 0) {
                        j11 = m5.n(inputReplyTo.reply_to_peer_id);
                    } else {
                        j11 = j3;
                    }
                    if (m5.E(j11)) {
                        user = getMessagesController().a2(Long.valueOf(j11));
                        M0 = null;
                    } else {
                        M0 = getMessagesController().M0(Long.valueOf(-j11));
                    }
                    if (user != null || M0 != null) {
                        if (t3.T(M0)) {
                            j12 = M0.f26956id;
                        } else {
                            j12 = 0;
                        }
                        final int i10 = draftMessage.reply_to.reply_to_msg_id;
                        getMessagesStorage().f26719a.c(new Runnable() {
                            @Override
                            public final void run() {
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                NativeByteBuffer byteBufferValue;
                                final ui uiVar = ui.this;
                                int i11 = i10;
                                long j13 = j11;
                                try {
                                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26721b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i11 + " and uid = " + j13, new Object[0]);
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            message4 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            message4.readAttachPath(byteBufferValue2, uiVar.getUserConfig().f24489n);
                                            byteBufferValue2.reuse();
                                        } else {
                                            message4 = null;
                                        }
                                        if (message4 != null) {
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            a0.h hVar8 = new a0.h();
                                            a0.h hVar9 = new a0.h();
                                            try {
                                                TLRPC.MessageReplyHeader messageReplyHeader = message4.reply_to;
                                                if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                                                    if (!queryFinalized.isNull(1) && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        message4.replyMessage = TLdeserialize;
                                                        TLdeserialize.readAttachPath(byteBufferValue, uiVar.getUserConfig().f24489n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message5 = message4.replyMessage;
                                                        if (message5 != null) {
                                                            yr.e(message5, arrayList, arrayList2, null);
                                                        }
                                                    }
                                                    if (message4.replyMessage == null) {
                                                        yr.d(message4, hVar8, hVar9);
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                uiVar.getMessagesStorage().o(e12, true);
                                            }
                                            uiVar.getMessagesStorage().K0(hVar8, hVar9, arrayList, arrayList2, 0);
                                        }
                                        message3 = message4;
                                    } else {
                                        message3 = null;
                                    }
                                    queryFinalized.dispose();
                                    final long j14 = j3;
                                    final long j15 = j10;
                                    if (message3 == null) {
                                        long j16 = j12;
                                        if (j16 != 0) {
                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                            tL_channels_getMessages.channel = uiVar.getMessagesController().h1(j16);
                                            tL_channels_getMessages.f26994id.add(Integer.valueOf(i11));
                                            uiVar.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Message message6;
                                                    TLRPC.Message message7;
                                                    switch (r6) {
                                                        case 0:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                    g0.h3(new t8(uiVar, j14, j15, message6, 1));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                    g0.h3(new t8(uiVar, j14, j15, message7, 1));
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
                                        tL_messages_getMessages.f27052id.add(Integer.valueOf(i11));
                                        uiVar.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                TLRPC.Message message6;
                                                TLRPC.Message message7;
                                                switch (r6) {
                                                    case 0:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                g0.h3(new t8(uiVar, j14, j15, message6, 1));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                g0.h3(new t8(uiVar, j14, j15, message7, 1));
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
                                    g0.h3(new t8(uiVar, j14, j15, message3, 1));
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                        });
                    }
                }
                getNotificationCenter().k(qs.W0, Long.valueOf(j3));
            }
        }
    }

    public final pi S(long j3, long j10) {
        boolean z9;
        boolean z10;
        if (!this.N1) {
            Set<Map.Entry<String, ?>> entrySet = t0.f25566b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
            this.O1.b();
            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                pi piVar = null;
                if (str != null) {
                    try {
                        if (str.startsWith("@")) {
                            String[] split = str.substring(1).split("\n");
                            if (split.length >= 6) {
                                pi piVar2 = new pi();
                                piVar2.f24567a = split[0];
                                piVar2.f24568b = Long.parseLong(split[1]);
                                piVar2.f24569c = Integer.parseInt(split[2]);
                                piVar2.d = Long.parseLong(split[3]);
                                if (split[4].contains(";")) {
                                    String[] split2 = split[4].split(";");
                                    if (Integer.parseInt(split2[0]) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    piVar2.f24572g = z10;
                                    piVar2.h = Float.parseFloat(split2[1]);
                                    piVar2.f24573i = Float.parseFloat(split2[2]);
                                } else {
                                    if (Integer.parseInt(split[4]) != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    piVar2.f24572g = z9;
                                    piVar2.h = 0.0f;
                                    piVar2.f24573i = 1.0f;
                                }
                                int length = split.length - 5;
                                String[] strArr = new String[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    strArr[i7] = split[i7 + 5];
                                }
                                String join = TextUtils.join("\n", strArr);
                                piVar2.f24571f = new short[join.length()];
                                int i10 = 0;
                                while (true) {
                                    short[] sArr = piVar2.f24571f;
                                    if (i10 >= sArr.length) {
                                        break;
                                    }
                                    sArr[i10] = (short) join.charAt(i10);
                                    i10++;
                                }
                                piVar = piVar2;
                            }
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (piVar != null) {
                    this.O1.k(piVar, Long.parseLong(key));
                }
            }
            this.N1 = true;
        }
        return (pi) this.O1.f(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)));
    }

    public final void S0(boolean z9, Integer num) {
        int i7;
        this.f25848w = true;
        if (z9) {
            getMessagesStorage().f26719a.c(new fg(this, 14));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = this.f25813f;
        }
        tL_messages_getAvailableReactions.hash = i7;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new ih(this, 3));
    }

    public final TLRPC.Document T(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList s02 = s0(4);
        int size = s02.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i7);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) this.H[4].f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public final void T1(a0.h hVar, ArrayList arrayList, boolean z9) {
        getMessagesStorage().f26719a.c(new aa.d0(this, z9, arrayList, hVar, 15));
    }

    public final void U(String[] strArr, String str, boolean z9, ri riVar, boolean z10) {
        V(strArr, str, z9, riVar, z10, false, false, false, null);
    }

    public final void U0(boolean z9) {
        if (!this.F1) {
            if (!this.G1 || z9) {
                Context context = t0.f25566b;
                final SharedPreferences sharedPreferences = context.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
                Context context2 = t0.f25566b;
                final SharedPreferences sharedPreferences2 = context2.getSharedPreferences("top_reactions_" + this.currentAccount, 0);
                this.C1.clear();
                this.D1.clear();
                this.C1.addAll(T0(sharedPreferences));
                this.D1.addAll(T0(sharedPreferences2));
                this.F1 = true;
                this.G1 = true;
                final boolean[] zArr = new boolean[2];
                TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
                tL_messages_getRecentReactions.hash = sharedPreferences.getLong("hash", 0L);
                tL_messages_getRecentReactions.limit = 50;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) {
                    public final ui f22029b;

                    {
                        this.f22029b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final ui uiVar = this.f22029b;
                                final SharedPreferences sharedPreferences3 = sharedPreferences;
                                final boolean[] zArr2 = zArr;
                                g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                ui uiVar2 = uiVar;
                                                ArrayList arrayList = uiVar2.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        ui.S1(sharedPreferences3, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr3 = zArr2;
                                                zArr3[1] = true;
                                                if (zArr3[0]) {
                                                    uiVar2.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ui uiVar3 = uiVar;
                                                ArrayList arrayList2 = uiVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        ui.S1(sharedPreferences3, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr2;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    uiVar3.F1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ui uiVar2 = this.f22029b;
                                final SharedPreferences sharedPreferences4 = sharedPreferences;
                                final boolean[] zArr3 = zArr;
                                g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                ui uiVar22 = uiVar2;
                                                ArrayList arrayList = uiVar22.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        ui.S1(sharedPreferences4, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr3;
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    uiVar22.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ui uiVar3 = uiVar2;
                                                ArrayList arrayList2 = uiVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        ui.S1(sharedPreferences4, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr3;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    uiVar3.F1 = false;
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
                tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
                tL_messages_getTopReactions.limit = 100;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) {
                    public final ui f22029b;

                    {
                        this.f22029b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final ui uiVar = this.f22029b;
                                final SharedPreferences sharedPreferences3 = sharedPreferences2;
                                final boolean[] zArr2 = zArr;
                                g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                ui uiVar22 = uiVar;
                                                ArrayList arrayList = uiVar22.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        ui.S1(sharedPreferences3, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr2;
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    uiVar22.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ui uiVar3 = uiVar;
                                                ArrayList arrayList2 = uiVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        ui.S1(sharedPreferences3, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr2;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    uiVar3.F1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ui uiVar2 = this.f22029b;
                                final SharedPreferences sharedPreferences4 = sharedPreferences2;
                                final boolean[] zArr3 = zArr;
                                g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                ui uiVar22 = uiVar2;
                                                ArrayList arrayList = uiVar22.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        ui.S1(sharedPreferences4, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr3;
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    uiVar22.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                ui uiVar3 = uiVar2;
                                                ArrayList arrayList2 = uiVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        ui.S1(sharedPreferences4, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr3;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    uiVar3.F1 = false;
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

    public final void U1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
            getMessagesStorage().f26719a.c(new cg(this, tL_messages_stickerSet, 4));
            if (!this.J0) {
                this.J0 = true;
                getMessagesStorage().f26719a.c(new fg(this, 4));
            }
        }
    }

    public final void V(final String[] strArr, final String str, final boolean z9, final ri riVar, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final Integer num) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(i6.f23058i);
            getMessagesStorage().f26719a.c(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.eh.run():void");
                }
            });
            return;
        }
        riVar.e(null, new ArrayList());
    }

    public final void V0(int r8, boolean r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.V0(int, boolean, boolean, boolean):void");
    }

    public final boolean V1(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        if (this.f25857z0.c(document.f26962id) != null) {
            return true;
        }
        int i7 = (document.size > qp.s1(this.currentAccount).f24831l4 ? 1 : (document.size == qp.s1(this.currentAccount).f24831l4 ? 0 : -1));
        int i10 = qs.P4;
        if (i7 > 0) {
            qs.e().k(i10, 4, id.a0("TooLargeError", null, 2131744045, new Object[0]), id.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(qp.s1(p10.f24470s0).f24831l4 / 1024)));
            return false;
        }
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > qp.s1(this.currentAccount).f24823k4) {
                qs.e().k(i10, 4, id.a0("TooLongError", null, 2131744044, new Object[0]), id.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(qp.s1(p10.f24470s0).f24823k4)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.f27168id = tL_inputDocument;
        tL_inputDocument.f26968id = document.f26962id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new r4(4, this, document));
        return true;
    }

    public final ArrayList W(CharSequence[] charSequenceArr, boolean z9, boolean z10) {
        boolean z11;
        int i7;
        int min;
        String str;
        int i10;
        int i11;
        char c10;
        int i12;
        String str2;
        char c11;
        int i13;
        int i14;
        ArrayList arrayList = null;
        if (charSequenceArr[0] == null) {
            return null;
        }
        int i15 = -1;
        int i16 = -1;
        boolean z12 = false;
        int i17 = 0;
        while (true) {
            int i18 = 1;
            if (!z10) {
                break;
            }
            CharSequence charSequence = charSequenceArr[0];
            if (!z12) {
                str = "`";
            } else {
                str = "```";
            }
            int indexOf = TextUtils.indexOf(charSequence, str, i17);
            if (indexOf == i15) {
                break;
            } else if (i16 == i15) {
                if (charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i18 = 3;
                }
                i16 = indexOf;
                i17 = indexOf + i18;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (z12) {
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                for (int i19 = i10 + indexOf; i19 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i19) == '`'; i19++) {
                    indexOf++;
                }
                if (z12) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
                int i20 = i11 + indexOf;
                if (z12) {
                    if (i16 > 0) {
                        c10 = charSequenceArr[0].charAt(i16 - 1);
                    } else {
                        c10 = 0;
                    }
                    if (c10 != ' ' && c10 != '\n') {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    int i21 = i16 + 3;
                    int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i21);
                    String str3 = "";
                    if (indexOf2 < 0 || indexOf2 - i21 <= 0) {
                        str2 = "";
                    } else {
                        str2 = charSequenceArr[0].toString().substring(i21, indexOf2);
                    }
                    CharSequence d22 = d2(0, i16 - i12, charSequenceArr[0]);
                    int length = str2.length() + i21 + (!str2.isEmpty());
                    if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                        CharSequence d23 = d2(length, indexOf, charSequenceArr[0]);
                        int i22 = indexOf + 3;
                        if (i22 < charSequenceArr[0].length()) {
                            c11 = charSequenceArr[0].charAt(i22);
                        } else {
                            c11 = 0;
                        }
                        CharSequence charSequence2 = charSequenceArr[0];
                        if (c11 != ' ' && c11 != '\n') {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                        CharSequence d24 = d2(i22 + i13, charSequence2.length(), charSequence2);
                        if (d22.length() != 0) {
                            d22 = g0.C(d22, "\n");
                        } else {
                            i12 = 1;
                        }
                        if (d24.length() > 0 && d24.charAt(0) != '\n') {
                            d24 = g0.C("\n", d24);
                        }
                        if (d23.length() > 0 && d23.charAt(d23.length() - 1) == '\n') {
                            d23 = d2(0, d23.length() - 1, d23);
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        if (!TextUtils.isEmpty(d23)) {
                            if (d23.length() > 1 && d23.charAt(0) == '\n') {
                                d23 = d23.subSequence(1, d23.length());
                                indexOf--;
                            }
                            charSequenceArr[0] = g0.C(d22, d23, d24);
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            int i23 = i12 ^ 1;
                            tL_messageEntityPre.offset = i16 + i23;
                            tL_messageEntityPre.length = ((((indexOf - i16) - 3) - (str2.length() + (!str2.isEmpty()))) + i23) - i14;
                            if (!TextUtils.isEmpty(str2) && str2.trim().length() != 0) {
                                str3 = str2;
                            }
                            tL_messageEntityPre.language = str3;
                            arrayList.add(tL_messageEntityPre);
                            i20 -= 6;
                        }
                        i17 = i20;
                        z12 = false;
                        i15 = -1;
                        i16 = -1;
                    }
                    i17 = i20;
                    i15 = -1;
                } else {
                    int i24 = i16 + 1;
                    if (i24 != indexOf) {
                        CharSequence charSequence3 = charSequenceArr[0];
                        if ((charSequence3 instanceof Spanned) && ((ni.j[]) ((Spanned) charSequence3).getSpans(Utilities.j(i16, charSequence3.length(), 0), Utilities.j(i24, charSequenceArr[0].length(), 0), ni.j.class)).length > 0) {
                            i17 = i20;
                            i15 = -1;
                        } else {
                            CharSequence d25 = d2(0, i16, charSequenceArr[0]);
                            CharSequence d26 = d2(i24, indexOf, charSequenceArr[0]);
                            CharSequence charSequence4 = charSequenceArr[0];
                            charSequenceArr[0] = g0.C(d25, d26, d2(indexOf + 1, charSequence4.length(), charSequence4));
                            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                            tL_messageEntityCode.offset = i16;
                            tL_messageEntityCode.length = (indexOf - i16) - 1;
                            arrayList.add(tL_messageEntityCode);
                            i20 -= 2;
                        }
                    }
                    i17 = i20;
                    z12 = false;
                    i15 = -1;
                    i16 = -1;
                }
            }
        }
        if (i16 != i15 && z12) {
            CharSequence d27 = d2(0, i16, charSequenceArr[0]);
            CharSequence charSequence5 = charSequenceArr[0];
            charSequenceArr[0] = g0.C(d27, d2(i16 + 2, charSequence5.length(), charSequence5));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            TLRPC.TL_messageEntityCode tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode2.offset = i16;
            tL_messageEntityCode2.length = 1;
            arrayList.add(tL_messageEntityCode2);
        }
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence6;
            vy0[] vy0VarArr = (vy0[]) spanned.getSpans(0, charSequence6.length(), vy0.class);
            if (vy0VarArr != null && vy0VarArr.length > 0) {
                for (vy0 vy0Var : vy0VarArr) {
                    int spanStart = spanned.getSpanStart(vy0Var);
                    int spanEnd = spanned.getSpanEnd(vy0Var);
                    if (!y(spanStart, arrayList, false) && !y(spanEnd, arrayList, true)) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i25 = 0; i25 < size; i25++) {
                                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i25);
                                int i26 = messageEntity.offset;
                                if (i26 <= spanStart || i26 + messageEntity.length > spanEnd) {
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        e(vy0Var.f39749b.f38779a, spanStart, spanEnd, arrayList);
                    }
                }
            }
            e41[] e41VarArr = (e41[]) spanned.getSpans(0, charSequenceArr[0].length(), e41.class);
            if (e41VarArr != null && e41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i27 = 0; i27 < e41VarArr.length; i27++) {
                    TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                    qp messagesController = getMessagesController();
                    tL_inputMessageEntityMentionName.user_id = messagesController.q1(messagesController.a2(Utilities.A(e41VarArr[i27].getURL())));
                    tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(e41VarArr[i27]);
                    tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(e41VarArr[i27]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                    if (charSequenceArr[0].charAt((i7 + min) - 1) == ' ') {
                        tL_inputMessageEntityMentionName.length--;
                    }
                    arrayList.add(tL_inputMessageEntityMentionName);
                }
            }
            d41[] d41VarArr = (d41[]) spanned.getSpans(0, charSequenceArr[0].length(), d41.class);
            if (d41VarArr != null && d41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i28 = 0; i28 < d41VarArr.length; i28++) {
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = spanned.getSpanStart(d41VarArr[i28]);
                    tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(d41VarArr[i28]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                    tL_messageEntityTextUrl.url = d41VarArr[i28].getURL();
                    arrayList.add(tL_messageEntityTextUrl);
                    uy0 uy0Var = d41VarArr[i28].f32786a;
                    if (uy0Var != null) {
                        int i29 = uy0Var.f38779a;
                        int i30 = tL_messageEntityTextUrl.offset;
                        e(i29, i30, tL_messageEntityTextUrl.length + i30, arrayList);
                    }
                }
            }
            org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.r5.class);
            if (r5VarArr != null && r5VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
                    if (r5Var != null) {
                        try {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(r5Var);
                            tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(r5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                            tL_messageEntityCustomEmoji.document_id = r5Var.getDocumentId();
                            tL_messageEntityCustomEmoji.document = r5Var.document;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                }
            }
            ni.j[] jVarArr = (ni.j[]) spanned.getSpans(0, charSequenceArr[0].length(), ni.j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (ni.j jVar : jVarArr) {
                    if (jVar != null) {
                        try {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre2.offset = spanned.getSpanStart(jVar);
                            tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(jVar), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                            tL_messageEntityPre2.language = jVar.f20627a;
                            arrayList.add(tL_messageEntityPre2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                }
            }
            ug0[] ug0VarArr = (ug0[]) spanned.getSpans(0, charSequenceArr[0].length(), ug0.class);
            if (ug0VarArr != null && ug0VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (ug0 ug0Var : ug0VarArr) {
                    if (ug0Var != null) {
                        try {
                            TLRPC.TL_messageEntityBlockquote tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                            tL_messageEntityBlockquote.offset = spanned.getSpanStart(ug0Var);
                            tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(ug0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                            tL_messageEntityBlockquote.collapsed = ug0Var.f38638e;
                            arrayList.add(tL_messageEntityBlockquote);
                        } catch (Exception e12) {
                            a8.g(e12, true);
                        }
                    }
                }
            }
            org.telegram.ui.Components.a00[] a00VarArr = (org.telegram.ui.Components.a00[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.a00.class);
            if (a00VarArr != null && a00VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.a00 a00Var : a00VarArr) {
                    if (a00Var != null) {
                        try {
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.offset = spanned.getSpanStart(a00Var);
                            tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(a00Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = a00Var.f31627b;
                            tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                            tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                            tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                            tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                            tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                            tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                            tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                            arrayList.add(tL_messageEntityFormattedDate);
                        } catch (Exception e13) {
                            a8.g(e13, true);
                        }
                    }
                }
            }
            if (spanned instanceof Spannable) {
                Spannable spannable = (Spannable) spanned;
                g0.c(spannable, 1, false, false);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i31 = 0; i31 < uRLSpanArr.length; i31++) {
                        URLSpan uRLSpan = uRLSpanArr[i31];
                        if (!(uRLSpan instanceof d41) && !(uRLSpan instanceof e41) && !(uRLSpan instanceof org.telegram.ui.Components.a00)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i31]);
                            tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i31]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                            tL_messageEntityUrl.url = uRLSpanArr[i31].getURL();
                            arrayList.add(tL_messageEntityUrl);
                            spannable.removeSpan(uRLSpanArr[i31]);
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
            Matcher matcher = f25798e2.matcher(charSequence7);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                int i32 = 0;
                while (true) {
                    if (i32 < arrayList.size()) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i32);
                        int i33 = messageEntity2.offset;
                        if (!g0.B1(start, end, i33, messageEntity2.length + i33) || (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl))) {
                            i32++;
                        }
                    } else {
                        try {
                            z11 = WalletEngine2.isValidAddress(matcher.group());
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                            z11 = false;
                        }
                        if (z11) {
                            TLRPC.TL_messageEntityTonAddress tL_messageEntityTonAddress = new TLRPC.TL_messageEntityTonAddress();
                            tL_messageEntityTonAddress.offset = start;
                            tL_messageEntityTonAddress.length = end - start;
                            arrayList.add(tL_messageEntityTonAddress);
                        }
                    }
                }
            }
        }
        if (z10) {
            charSequence7 = j1(j1(j1(charSequence7, R1, arrayList, new ni.a(28)), S1, arrayList, new ni.a(29)), T1, arrayList, new ch(0));
            if (z9) {
                charSequence7 = j1(charSequence7, U1, arrayList, new ch(1));
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(0) == '\n' || charSequence7.charAt(0) == ' ')) {
            int i34 = 1;
            charSequence7 = charSequence7.subSequence(1, charSequence7.length());
            int i35 = 0;
            while (i35 < arrayList.size()) {
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(i35);
                int i36 = messageEntity3.offset;
                if (i36 == 0) {
                    messageEntity3.length -= i34;
                }
                messageEntity3.offset = Math.max(0, i36 - 1);
                i35++;
                i34 = 1;
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(charSequence7.length() - 1) == '\n' || charSequence7.charAt(charSequence7.length() - 1) == ' ')) {
            charSequence7 = charSequence7.subSequence(0, charSequence7.length() - 1);
            for (int i37 = 0; i37 < arrayList.size(); i37++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i37);
                if (messageEntity4.offset + messageEntity4.length > charSequence7.length()) {
                    messageEntity4.length--;
                }
            }
        }
        charSequenceArr[0] = charSequence7;
        return arrayList;
    }

    public final void W0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.W0():void");
    }

    public final boolean W1() {
        boolean[] zArr = this.X0;
        if ((!zArr[0] || this.N0 != 0 || !zArr[1]) && !this.f25817g1 && !this.f25819h1) {
            return false;
        }
        return true;
    }

    public final long X() {
        long j3 = 0;
        int i7 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.f25840s0;
            if (i7 < arrayListArr[0].size()) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayListArr[0].get(i7)).set;
                if (!stickerSet.archived) {
                    j3 = p(j3, stickerSet.f26983id);
                }
                i7++;
            } else {
                return j3;
            }
        }
    }

    public final void X0(java.util.ArrayList r21, long r22, int r24, long r25, java.lang.Runnable r27, int r28, org.telegram.messenger.a00 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.X0(java.util.ArrayList, long, int, long, java.lang.Runnable, int, org.telegram.messenger.a00):void");
    }

    public final void X1(java.lang.String r37, final long r38, final long r40, final int r42, final int r43, final long r44, boolean r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final boolean r49, final ch.o0 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.X1(java.lang.String, long, long, int, int, long, boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, ch.o0):void");
    }

    public final TLRPC.TL_messages_stickerSet Y(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.I.f(stickerSet.f26983id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.M.f(stickerSet.f26983id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    L0(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            L0(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    public final void Y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.Y0():void");
    }

    public final void Y1(boolean z9, String str, c20 c20Var) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z9) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.f27068q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.f27070q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new d3.b(1), new r9(c20Var, 1));
    }

    public final void Z0(boolean z9) {
        if (!this.H1) {
            if (!this.I1 || z9) {
                Context context = t0.f25566b;
                SharedPreferences sharedPreferences = context.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
                this.E1.clear();
                this.E1.addAll(T0(sharedPreferences));
                this.H1 = true;
                this.I1 = true;
                TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
                tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new eg(this, sharedPreferences, 0));
            }
        }
    }

    public final si Z1(boolean z9, String str, String str2, c20 c20Var, boolean z10) {
        si siVar = new si(str, str2, z9);
        ti tiVar = (ti) this.Q1.get(siVar);
        if (tiVar == null || (tiVar.f25630b != null && z10)) {
            HashMap hashMap = this.P1;
            if (!hashMap.containsKey(siVar)) {
                hashMap.put(siVar, 0);
                b0(this.currentAccount).U(new String[]{str}, str2, true, new nh(this, siVar, tiVar, c20Var), false);
                return siVar;
            }
        }
        if (tiVar != null) {
            c20Var.a(tiVar.f25629a);
            return siVar;
        }
        c20Var.a(new ArrayList());
        return siVar;
    }

    public final void a1(int i7, boolean z9, boolean z10) {
        b1(i7, z9, z10, false, null);
    }

    public final void a2(String str) {
        qp.s1(this.currentAccount).f24784f7.edit().putString("reaction_on_double_tap", str).apply();
        this.f25839s = str;
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7;
        long j3 = tL_messages_stickerSet.set.f26983id;
        a0.h hVar = this.I;
        if (hVar.h(j3) < 0) {
            String str = tL_messages_stickerSet.set.short_name;
            ConcurrentHashMap concurrentHashMap = this.N;
            if (!concurrentHashMap.containsKey(str)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet.masks) {
                    i7 = 1;
                } else if (stickerSet.emojis) {
                    i7 = 5;
                } else {
                    i7 = 0;
                }
                ArrayList[] arrayListArr = this.G;
                arrayListArr[i7].add(0, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f26983id);
                this.J.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f26983id);
                concurrentHashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                a0.h hVar2 = new a0.h();
                for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    hVar2.k(document, document.f26962id);
                }
                for (int i11 = 0; i11 < tL_messages_stickerSet.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                    String replace = tL_stickerPack.emoticon.replace("️", "");
                    tL_stickerPack.emoticon = replace;
                    ArrayList arrayList = (ArrayList) this.f25808d0.get(replace);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f25808d0.put(tL_stickerPack.emoticon, arrayList);
                    }
                    for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                        Long l10 = tL_stickerPack.documents.get(i12);
                        if (this.f25806c0.h(l10.longValue()) < 0) {
                            this.f25806c0.k(tL_stickerPack.emoticon, l10.longValue());
                        }
                        TLRPC.Document document2 = (TLRPC.Document) hVar2.f(l10.longValue());
                        if (document2 != null) {
                            arrayList.add(document2);
                        }
                    }
                }
                this.X[i7] = q(arrayListArr[i7]);
                getNotificationCenter().k(qs.f25104x0, Integer.valueOf(i7), Boolean.TRUE);
                a1(i7, false, true);
            }
        }
    }

    public final void b1(int i7, boolean z9, boolean z10, boolean z11, c20 c20Var) {
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        boolean[] zArr = this.V;
        if (zArr[i7]) {
            if (z11) {
                this.U[i7] = new nb(this, i7, z10, c20Var);
                return;
            } else if (c20Var != null) {
                c20Var.a(null);
                return;
            } else {
                return;
            }
        }
        char c10 = 1;
        ArrayList[] arrayListArr = this.f25840s0;
        if (i7 == 3) {
            if (arrayListArr[0].isEmpty() || !getMessagesController().f24957z3) {
                if (c20Var != null) {
                    c20Var.a(null);
                    return;
                }
                return;
            }
        } else if (i7 == 6) {
            if (arrayListArr[1].isEmpty() || !getMessagesController().f24957z3) {
                if (c20Var != null) {
                    c20Var.a(null);
                    return;
                }
                return;
            }
        } else if (i7 != 4) {
            C0(i7, z9);
        }
        zArr[i7] = true;
        if (z9) {
            getMessagesStorage().f26719a.c(new l7(this, i7, c20Var, 6));
        } else if (i7 != 3 && i7 != 6) {
            if (i7 == 4) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new bo(this, i7, c20Var, 3));
                return;
            }
            long[] jArr = this.X;
            long j3 = 0;
            if (i7 == 0) {
                TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
                if (!z10) {
                    j3 = jArr[i7];
                }
                tL_messages_getAllStickers.hash = j3;
                tL_messages_getMaskStickers = tL_messages_getAllStickers;
            } else if (i7 == 5) {
                TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
                if (!z10) {
                    j3 = jArr[i7];
                }
                tL_messages_getEmojiStickers.hash = j3;
                tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
            } else {
                TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
                if (!z10) {
                    j3 = jArr[i7];
                }
                tL_messages_getMaskStickers2.hash = j3;
                tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
            }
            getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new h3(i7, 1, j3, this, c20Var));
        } else {
            if (i7 != 6) {
                c10 = 0;
            }
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.f25832p0[c10];
            int size = arrayListArr[c10].size();
            for (int i10 = 0; i10 < size; i10++) {
                tL_messages_allStickers.sets.add(((TLRPC.StickerSetCovered) arrayListArr[c10].get(i10)).set);
            }
            r1(i7, tL_messages_allStickers, new rf(c20Var, 3));
        }
    }

    public final void b2(long j3, long j10, float f10, float f11) {
        pi S = S(j3, j10);
        if (S != null) {
            if (Math.abs(S.h - f10) >= 0.001f || Math.abs(S.f24573i - f11) >= 0.001f) {
                S.h = f10;
                S.f24573i = f11;
                Context context = t0.f25566b;
                SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
                edit.putString(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)) + "", S.toString()).apply();
            }
        }
    }

    public final void c(TLRPC.Document document, int i7, boolean z9) {
        if (document == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.f25820i0.size()) {
                TLRPC.Document document2 = (TLRPC.Document) this.f25820i0.get(i10);
                if (document2.f26962id == document.f26962id) {
                    this.f25820i0.remove(i10);
                    this.f25820i0.add(0, document2);
                    break;
                }
                i10++;
            } else {
                this.f25820i0.add(0, document);
                break;
            }
        }
        if ((this.f25820i0.size() > getMessagesController().F4 && !p10.i(this.currentAccount).q()) || this.f25820i0.size() > getMessagesController().G4) {
            getMessagesStorage().f26719a.c(new nf(this, (TLRPC.Document) org.telegram.ui.Cells.f1.k(1, this.f25820i0), 0));
            if (z9) {
                g0.h3(new a(document, 21));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
        y1(0, arrayList, true, i7, false);
    }

    public final int c0() {
        int i7 = 1;
        if (this.f25812e1 >= this.Y0.size() - 1) {
            boolean[] zArr = this.X0;
            if (zArr[0] && zArr[1]) {
                i7 = 0;
            }
        }
        if (this.f25812e1 > 0) {
            return i7 | 2;
        }
        return i7;
    }

    public final void c1(String str, boolean z9, boolean z10) {
        HashSet hashSet = this.S;
        if (!hashSet.contains(str)) {
            if (!z9 || this.Q.get(str) == null) {
                hashSet.add(str);
                if (z10) {
                    getMessagesStorage().f26719a.c(new kg(this, str, z9, 1));
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                if (Objects.equals(getUserConfig().f24475b0, str)) {
                    tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
                } else if (z9) {
                    TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                    tL_inputStickerSetDice.emoticon = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
                } else {
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                }
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n3(this, str, z9, 1));
            }
        }
    }

    public final void c2(org.telegram.ui.Components.l9 l9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        b0(this.currentAccount).l0(tL_inputStickerSetShortName, 0, false, false, new d3(str2, l9Var, str3, 3));
    }

    public final void d(int i7, Object obj, TLRPC.Document document, int i10, boolean z9) {
        ArrayList[] arrayListArr;
        int i11;
        TLRPC.Document document2;
        boolean z10;
        int i12;
        if (i7 != 3) {
            if (ij.v4(document) || ij.L2(document, true)) {
                int i13 = 0;
                while (true) {
                    arrayListArr = this.f25814f0;
                    if (i13 < arrayListArr[i7].size()) {
                        TLRPC.Document document3 = (TLRPC.Document) arrayListArr[i7].get(i13);
                        if (document3.f26962id == document.f26962id) {
                            arrayListArr[i7].remove(i13);
                            if (!z9) {
                                arrayListArr[i7].add(0, document3);
                            }
                        } else {
                            i13++;
                        }
                    } else if (!z9) {
                        arrayListArr[i7].add(0, document);
                    }
                }
                int i14 = qs.P4;
                if (i7 == 2) {
                    if (z9) {
                        qs.e().k(i14, 0, document, 4);
                    } else {
                        if (arrayListArr[i7].size() > getMessagesController().f24770e3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        qs e10 = qs.e();
                        if (z10) {
                            i12 = 6;
                        } else {
                            i12 = 5;
                        }
                        e10.k(i14, 0, document, Integer.valueOf(i12));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.f27042id = tL_inputDocument;
                    tL_inputDocument.f26968id = document.f26962id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z9;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new di(this, obj, tL_messages_faveSticker, 0));
                    i11 = getMessagesController().f24770e3;
                } else {
                    if (i7 == 0 && z9) {
                        qs.e().k(i14, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.f27066id = tL_inputDocument2;
                        tL_inputDocument2.f26968id = document.f26962id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new di(this, obj, tL_messages_saveRecentSticker, 1));
                    }
                    i11 = getMessagesController().f24760d3;
                }
                if (arrayListArr[i7].size() > i11 || z9) {
                    if (z9) {
                        document2 = document;
                    } else {
                        document2 = (TLRPC.Document) org.telegram.ui.Cells.f1.k(1, arrayListArr[i7]);
                    }
                    getMessagesStorage().f26719a.c(new l7(this, i7, document2, 10));
                }
                if (!z9) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(document);
                    y1(i7, arrayList, false, i10, false);
                }
                if (i7 == 2 || (i7 == 0 && z9)) {
                    getNotificationCenter().k(qs.X0, Boolean.FALSE, Integer.valueOf(i7));
                }
            }
        }
    }

    public final void d0(final int i7, final int i10, final long j3, final long j10, boolean z9) {
        if (!z9 && !m5.C(j3)) {
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            if (i7 == 0) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
            } else if (i7 == 1) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
            } else if (i7 == 2) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
            } else if (i7 == 3) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
            } else if (i7 == 4) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
            } else if (i7 == 5) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
            } else if (i7 == 8) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
            }
            if (j10 != 0) {
                if (j3 == getUserConfig().e()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().j1(j10);
                    tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j10;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            tL_messages_getSearchCounters.peer = getMessagesController().j1(j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    if (tLObject instanceof Vector) {
                        Vector vector = (Vector) tLObject;
                        if (!vector.objects.isEmpty()) {
                            g0.h3(new ni(ui.this, j3, false, ((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, i7, 0, j10, i10));
                        }
                    }
                }
            }), i10);
            return;
        }
        getMessagesStorage().f26719a.c(new mg(this, j10, j3, i7, i10, 0));
    }

    public final void d1(boolean z9, boolean z10) {
        int i7;
        ArrayList[] arrayListArr = this.f25844u0;
        if (!arrayListArr[z9 ? 1 : 0].isEmpty()) {
            arrayListArr[z9 ? 1 : 0].clear();
            ArrayList[] arrayListArr2 = this.f25840s0;
            long o4 = o(arrayListArr2[z9 ? 1 : 0], z9);
            long[] jArr = this.f25832p0;
            jArr[z9 ? 1 : 0] = o4;
            qs notificationCenter = getNotificationCenter();
            if (z9) {
                i7 = qs.A0;
            } else {
                i7 = qs.f25118z0;
            }
            notificationCenter.k(i7, new Object[0]);
            G1(z9, arrayListArr2[z9 ? 1 : 0], arrayListArr[z9 ? 1 : 0], this.f25834q0[z9 ? 1 : 0], jArr[z9 ? 1 : 0], this.f25837r0);
            if (z10) {
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new di.u5(11));
            }
        }
    }

    public final void e0(long j3, int i7, long j10) {
        getMessagesStorage().f26719a.c(new lb(this, j10, j3, i7, 1));
    }

    public final void e1(long j3) {
        if (this.f25844u0[0].contains(Long.valueOf(j3))) {
            ArrayList[] arrayListArr = this.f25846v0;
            if (!arrayListArr[0].contains(Long.valueOf(j3))) {
                arrayListArr[0].add(Long.valueOf(j3));
                TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
                tL_messages_readFeaturedStickers.f27060id.add(Long.valueOf(j3));
                getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new di.u5(11));
                g0.i3(new yg(this, j3, 3), 1000L);
            }
        }
    }

    public final void e2(long j3, long j10, boolean z9) {
        pi S = S(j3, j10);
        if (S != null && S.f24572g != z9) {
            S.f24572g = z9;
            Context context = t0.f25566b;
            SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
            edit.putString(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)) + "", S.toString()).apply();
        }
    }

    public final void f1(long j3, boolean z9) {
        this.L.remove(Long.valueOf(j3));
        ArrayList arrayList = this.K;
        if (z9 && !arrayList.contains(Long.valueOf(j3))) {
            arrayList.add(Long.valueOf(j3));
        }
        if (!z9) {
            arrayList.remove(Long.valueOf(j3));
        }
    }

    public final void f2(Context context, TLObject tLObject, int i7, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10) {
        g2(context, tLObject, null, i7, f2Var, null, z9, z10, null, true);
    }

    public final Integer g0(boolean z9) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        int i7;
        double d;
        int i10;
        double d10;
        f5.l lVar;
        f5.k kVar;
        f5.k kVar2;
        double d11;
        int i11;
        f5.l lVar2;
        f5.k kVar3;
        if ((z9 && (!r1.i().k() || r1.i().f25205e == null)) || (tL_help_premiumPromo = this.D) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i12 = 0;
        double d12 = 0.0d;
        boolean z10 = false;
        int i13 = 0;
        while (i13 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i13);
            i13++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (z9) {
                if (tL_premiumSubscriptionOption2.current) {
                    kVar2 = null;
                    if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), r1.i().f25205e)) {
                        if (r2.b() && (lVar2 = r1.f25198l) != null) {
                            ArrayList arrayList3 = lVar2.h;
                            int size2 = arrayList3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size2) {
                                    Object obj = arrayList3.get(i14);
                                    i14++;
                                    kVar3 = (f5.k) obj;
                                    String str = ((f5.i) kVar3.f11165b.f11163a.get(0)).d;
                                    int i15 = tL_premiumSubscriptionOption2.months;
                                    if (i15 == 12) {
                                        if (str.equals("P1Y")) {
                                            break;
                                        }
                                    } else {
                                        Locale locale = Locale.ROOT;
                                        if (str.equals("P" + i15 + "M")) {
                                            break;
                                        }
                                    }
                                } else {
                                    kVar3 = kVar2;
                                    break;
                                }
                            }
                            if (kVar3 == null) {
                                d11 = tL_premiumSubscriptionOption2.amount;
                                i11 = tL_premiumSubscriptionOption2.months;
                            } else {
                                d11 = ((f5.i) kVar3.f11165b.f11163a.get(0)).f11161b;
                                i11 = tL_premiumSubscriptionOption2.months;
                            }
                        } else {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i11 = tL_premiumSubscriptionOption2.months;
                        }
                        d12 = d11 / i11;
                        z10 = true;
                    }
                }
            } else {
                kVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (r2.b()) {
                    }
                    d11 = tL_premiumSubscriptionOption2.amount;
                    i11 = tL_premiumSubscriptionOption2.months;
                    d12 = d11 / i11;
                    z10 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.D.period_options;
        int size3 = arrayList4.size();
        int i16 = 0;
        int i17 = 0;
        while (i17 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i17);
            i17++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z10 && tL_premiumSubscriptionOption4.months == 12) {
                if (!r2.b() && (lVar = r1.f25198l) != null) {
                    ArrayList arrayList5 = lVar.h;
                    int size4 = arrayList5.size();
                    int i18 = i12;
                    while (true) {
                        if (i18 < size4) {
                            Object obj2 = arrayList5.get(i18);
                            i18++;
                            kVar = (f5.k) obj2;
                            String str2 = ((f5.i) kVar.f11165b.f11163a.get(i12)).d;
                            int i19 = tL_premiumSubscriptionOption4.months;
                            arrayList = arrayList4;
                            if (i19 == 12) {
                                if (str2.equals("P1Y")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                                i12 = 0;
                            } else {
                                Locale locale2 = Locale.ROOT;
                                if (str2.equals("P" + i19 + "M")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                                i12 = 0;
                            }
                        } else {
                            arrayList = arrayList4;
                            kVar = null;
                            break;
                        }
                    }
                    if (kVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i7 = 0;
                        i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                    } else {
                        i7 = 0;
                        d = ((f5.i) kVar.f11165b.f11163a.get(0)).f11161b;
                        i10 = tL_premiumSubscriptionOption4.months;
                    }
                } else {
                    arrayList = arrayList4;
                    i7 = i12;
                    d = tL_premiumSubscriptionOption4.amount;
                    i10 = tL_premiumSubscriptionOption4.months;
                }
                d10 = d / i10;
                i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
            } else {
                arrayList = arrayList4;
                i7 = i12;
            }
            i12 = i7;
            arrayList4 = arrayList;
        }
        if (!z10 || i16 <= 0) {
            return null;
        }
        return Integer.valueOf(i16);
    }

    public final void g1(long j3, boolean z9) {
        this.K.remove(Long.valueOf(j3));
        ArrayList arrayList = this.L;
        if (z9 && !arrayList.contains(Long.valueOf(j3))) {
            arrayList.add(Long.valueOf(j3));
        }
        if (!z9) {
            arrayList.remove(Long.valueOf(j3));
        }
    }

    public final void g2(final android.content.Context r22, final org.telegram.tgnet.TLObject r23, final org.telegram.tgnet.TLRPC.Document r24, final int r25, final org.telegram.ui.ActionBar.f2 r26, final android.widget.FrameLayout r27, final boolean r28, boolean r29, java.lang.Runnable r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.g2(android.content.Context, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document, int, org.telegram.ui.ActionBar.f2, android.widget.FrameLayout, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    public final TLRPC.TL_help_premiumPromo h0() {
        return this.D;
    }

    public final void h1(long j3, boolean z9, boolean z10) {
        int i7;
        if (z9) {
            i7 = 5;
        } else if (z10) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ArrayList s02 = s0(i7);
        if (s02 != null) {
            for (int i10 = 0; i10 < s02.size(); i10++) {
                if (((TLRPC.TL_messages_stickerSet) s02.get(i10)).set.f26983id == j3) {
                    s02.remove(i10);
                    s02.add(0, (TLRPC.TL_messages_stickerSet) s02.get(i10));
                    getNotificationCenter().k(qs.f25104x0, Integer.valueOf(i7), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final void h2(final Context context, int i7, final org.telegram.ui.ActionBar.f2 f2Var, final FrameLayout frameLayout, final boolean z9, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i10, final boolean z10) {
        boolean z11;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j3 = stickerSet.f26983id;
        tL_inputStickerSetID.f26976id = j3;
        if (i7 != 0) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            if (i7 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messages_installStickerSet.archived = z11;
            f1(stickerSet.f26983id, true);
            getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final ui uiVar = ui.this;
                    final TLRPC.StickerSet stickerSet2 = stickerSet;
                    final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    final boolean z12 = z9;
                    final int i11 = i10;
                    final boolean z13 = z10;
                    final FrameLayout frameLayout2 = frameLayout;
                    final Context context2 = context;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.Document document2 = document;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            ui uiVar2 = ui.this;
                            a0.h hVar = uiVar2.T;
                            TLRPC.StickerSet stickerSet3 = stickerSet2;
                            hVar.l(stickerSet3.f26983id);
                            TLObject tLObject4 = tLObject2;
                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive;
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                            int i12 = i11;
                            if (z14) {
                                uiVar2.A1(f2Var3, z12, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                            }
                            uiVar2.b1(i12, false, false, true, new hh(uiVar2, stickerSet3, 0));
                            if (tL_error == null && z13) {
                                FrameLayout frameLayout3 = frameLayout2;
                                Context context3 = context2;
                                TLObject tLObject5 = tLObject3;
                                TLRPC.Document document3 = document2;
                                if (frameLayout3 != null) {
                                    org.telegram.ui.Components.cc.f(frameLayout3, new cv0(context3, tLObject5, 1, 2, document3, f2Var3.getResourceProvider()), 1500).j();
                                } else if (f2Var3 != null) {
                                    org.telegram.ui.Components.cc.g(f2Var3, new cv0(context3, tLObject5, 1, 2, document3, f2Var3.getResourceProvider()), 1500).j();
                                }
                            }
                        }
                    });
                }
            });
            return;
        }
        g1(j3, true);
        TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
        tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
        getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new bo(this, stickerSet, i10));
    }

    public final ArrayList i0(int i7, boolean z9) {
        ArrayList[] arrayListArr = this.f25814f0;
        ArrayList arrayList = arrayListArr[i7];
        if (i7 == 7) {
            return new ArrayList(arrayListArr[i7]);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z9 && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public final void i1(String str, TLRPC.Document document, boolean z9) {
        this.Z.remove(str);
        yf.d dVar = this.f25857z0;
        ArrayList arrayList = dVar.f59415e;
        boolean z10 = true;
        if (z9) {
            int i7 = 0;
            while (true) {
                if (i7 < arrayList.size()) {
                    if (((yf.c) arrayList.get(i7)).d && str.equals(((yf.c) arrayList.get(i7)).f59408b)) {
                        arrayList.remove(i7);
                        break;
                    }
                    i7++;
                } else {
                    z10 = false;
                    break;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((yf.c) arrayList.get(i10)).d && str.equals(((yf.c) arrayList.get(i10)).f59408b)) {
                        ((yf.c) arrayList.get(i10)).d = false;
                        ((yf.c) arrayList.get(i10)).f59407a = document;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                dVar.h();
            }
        }
        if (z10) {
            qs.f(dVar.f59414c).k(qs.f24995e5, new Object[0]);
        }
    }

    public final void i2(int r8, long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.i2(int, long):void");
    }

    public final boolean j(long j3) {
        for (int i7 = 0; i7 < this.f25802b.bots.size(); i7++) {
            if (this.f25802b.bots.get(i7).bot_id == j3) {
                return true;
            }
        }
        return false;
    }

    public final int j0() {
        ArrayList arrayList = this.Z0;
        boolean isEmpty = arrayList.isEmpty();
        int[] iArr = this.W0;
        if (isEmpty) {
            return Math.max(Math.max(iArr[0] + iArr[1], this.V0), arrayList.size());
        }
        return Math.max(iArr[0] + iArr[1], arrayList.size());
    }

    public final void j2(long j3, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.f25847v1.get(tL_updateBotCommands.bot_id + "_" + j3);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().k(qs.D0, botInfo, 0);
        }
        getMessagesStorage().f26719a.c(new a4(this, tL_updateBotCommands, j3, 13));
    }

    public final ArrayList k(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z9, boolean z10) {
        boolean z11;
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
            hVar.k(user, user.f27105id);
        }
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
            hVar2.k(chat, chat.f26956id);
        }
        ArrayList arrayList4 = new ArrayList();
        if (z10) {
            g0.h3(new aa.d0(this, arrayList2, z9, arrayList3, 14));
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                if ((ij.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (ij.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                    i11++;
                }
                a0.h hVar3 = hVar2;
                int i13 = i11;
                int i14 = this.currentAccount;
                if (i13 < 30) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList4.add(new ij(i14, message, hVar, hVar3, false, z11));
                i12++;
                hVar2 = hVar3;
                i11 = i13;
            }
            return arrayList4;
        }
        g0.h3(new zg(this, arrayList2, z9, arrayList3, arrayList, arrayList4, hVar, hVar2));
        return null;
    }

    public final void k1() {
        ArrayList arrayList = this.h;
        if (arrayList != null && !this.f25854y && sc.e(8200) && this.currentAccount == p10.f24470s0) {
            this.f25854y = true;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int min = Math.min(arrayList2.size(), 10);
            for (int i7 = 0; i7 < min; i7++) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList2.get(i7);
                l1(hc.b(tL_availableReaction.activate_animation), 0);
                l1(hc.b(tL_availableReaction.appear_animation), 0);
            }
            for (int i10 = 0; i10 < min; i10++) {
                l1(hc.b(((TLRPC.TL_availableReaction) arrayList2.get(i10)).effect_animation), 0);
            }
        }
    }

    public final void k2() {
        ij ijVar;
        ArrayList arrayList = this.Y0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.Z0;
            ij ijVar2 = null;
            if (i7 >= arrayList3.size()) {
                break;
            }
            ij ijVar3 = (ij) arrayList3.get(i7);
            if ((!ijVar3.A2() || ijVar3.Q2) && !hashSet.contains(Integer.valueOf(ijVar3.f1()))) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else if (((ij) arrayList2.get(i10)).f1() == ijVar3.f1()) {
                        ijVar2 = (ij) arrayList2.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (ijVar2 != null) {
                    ijVar3.N(ijVar2);
                    ijVar3.f23311x0 = ijVar2.f23311x0;
                    ijVar3.f23307w0 = ijVar2.f23307w0;
                }
                ijVar3.f23271m2 = true;
                arrayList.add(ijVar3);
                hashSet.add(Integer.valueOf(ijVar3.f1()));
            }
            i7++;
        }
        for (int i11 = 0; i11 < this.f25801a1.size(); i11++) {
            ij ijVar4 = (ij) this.f25801a1.get(i11);
            if (!hashSet.contains(Integer.valueOf(ijVar4.f1()))) {
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        if (((ij) arrayList2.get(i12)).f1() == ijVar4.f1()) {
                            ijVar = (ij) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    } else {
                        ijVar = null;
                        break;
                    }
                }
                if (ijVar != null) {
                    ijVar4.N(ijVar);
                    ijVar4.f23311x0 = ijVar.f23311x0;
                    ijVar4.f23307w0 = ijVar.f23307w0;
                }
                ijVar4.f23271m2 = true;
                arrayList.add(ijVar4);
                hashSet.add(Integer.valueOf(ijVar4.f1()));
            }
        }
    }

    public final void l(ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3, long j3, boolean z9) {
        a0.h hVar2 = new a0.h();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
            hVar2.k(user, user.f27105id);
        }
        a0.h hVar3 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
            hVar3.k(chat, chat.f26956id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList4.add(new ij(this.currentAccount, (TLRPC.Message) arrayList.get(i11), hVar2, hVar3, false, false));
        }
        g0.h3(new bi.l(this, arrayList2, z9, arrayList3, arrayList4, hVar, j3));
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_stickerSet l0(final org.telegram.tgnet.TLRPC.InputStickerSet r11, final java.lang.Integer r12, final boolean r13, boolean r14, final org.telegram.messenger.c20 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.l0(org.telegram.tgnet.TLRPC$InputStickerSet, java.lang.Integer, boolean, boolean, org.telegram.messenger.c20):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    public final void l1(hc hcVar, int i7) {
        getFileLoader().V(hcVar, null, null, i7, 11);
    }

    public final void l2(String str) {
        HashMap hashMap = this.Z;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new yf.e(str, this.currentAccount));
        yf.d dVar = this.f25857z0;
        dVar.getClass();
        ?? obj = new Object();
        obj.f59408b = str;
        int i7 = dVar.d;
        dVar.d = i7 + 1;
        obj.f59409c = i7;
        obj.d = true;
        dVar.f59415e.add(obj);
    }

    public final void m() {
        int g10 = g0.f.g(t0.f25566b) - 2;
        if (g10 <= 0) {
            g10 = 5;
        }
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        if (iz.f23434s.length() <= 0) {
            for (int i7 = 0; i7 < this.f25821i1.size(); i7++) {
                arrayList.add((TLRPC.TL_topPeer) this.f25821i1.get(i7));
                if (arrayList.size() == g10 - 2) {
                    break;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            z9 = true;
        }
        Utilities.f21336e.c(new yf(this, z9, arrayList, 0));
    }

    public final TLRPC.TL_messages_stickerSet m0(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        return l0(inputStickerSet, null, z9, false, null);
    }

    public final void m2(TLRPC.Message message) {
        n2(message, false);
    }

    public final TLRPC.TL_messages_stickerSet n0(String str) {
        return (TLRPC.TL_messages_stickerSet) this.Q.get(str);
    }

    public final void n1() {
        ArrayList[] arrayListArr = this.f25814f0;
        if (arrayListArr[3].isEmpty()) {
            return;
        }
        ArrayList arrayList = arrayListArr[3];
        this.f25855y0 = (TLRPC.Document) arrayList.get(Utilities.f21334b.nextInt(arrayList.size()));
        getFileLoader().V(hc.b(this.f25855y0), this.f25855y0, null, 0, 1);
    }

    public final void n2(TLRPC.Message message, boolean z9) {
        if (message != null) {
            TLRPC.Document G0 = ij.G0(message);
            String str = null;
            if (G0 != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= G0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = G0.attributes.get(i7);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                        if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            str = inputStickerSet.short_name;
                        }
                    } else {
                        i7++;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.N.get(str);
                if (tL_messages_stickerSet != null) {
                    int size = tL_messages_stickerSet.documents.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                        if (document.f26962id == G0.f26962id && document.dc_id == G0.dc_id) {
                            message.stickerVerified = 1;
                            return;
                        }
                    }
                } else if (z9) {
                    g0.h3(new lg((Object) this, (Object) message, str, 4));
                } else {
                    o2(message, str);
                }
            }
        }
    }

    public final long o(ArrayList arrayList, boolean z9) {
        long j3 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayList.get(i7)).set;
                if (!stickerSet.archived) {
                    j3 = p(j3, stickerSet.f26983id);
                    if (this.f25844u0[z9 ? 1 : 0].contains(Long.valueOf(stickerSet.f26983id))) {
                        j3 = p(j3, 1L);
                    }
                }
            }
        }
        return j3;
    }

    public final TLRPC.TL_messages_stickerSet o0(long j3) {
        return (TLRPC.TL_messages_stickerSet) this.I.f(j3);
    }

    public final void o1() {
        int i7;
        boolean z9 = this.C0;
        ArrayList arrayList = this.B0;
        if (!z9 && arrayList.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = i6.c("⭐") + i6.c("⭐");
            tL_messages_getStickers.hash = 0L;
            this.C0 = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new ih(this, 2));
            return;
        }
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 3); i10++) {
            if (i10 == 2) {
                i7 = arrayList.size() - 1;
            } else {
                i7 = i10;
            }
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (ij.Y3(document)) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.f21236z1 = false;
                imageReceiver.q0(hc.b(document), null, null, "webp", null, 1);
                gc.D().M(imageReceiver, null);
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.f21236z1 = false;
                imageReceiver2.t0(hc.d(ij.G1(document), document), null, null, null, "tgs", null, 1);
                gc.D().M(imageReceiver2, null);
            }
        }
    }

    public final void o2(TLRPC.Message message, String str) {
        HashMap hashMap = this.f25800a0;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = ij.k1(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new yh(this, str, 1));
    }

    public final TLRPC.TL_messages_stickerSet p0(String str) {
        if (str == null) {
            return null;
        }
        return (TLRPC.TL_messages_stickerSet) this.N.get(str.toLowerCase());
    }

    public final void p1(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w10;
        String str;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && (w10 = w7.w(stickerSet.thumbs, 90, false, null, false)) != null) {
            TLRPC.Document document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                } else {
                    return;
                }
            }
            hc k10 = hc.k(w10, document, stickerSetCovered.set.thumb_version);
            if (k10 != null) {
                if (k10.f22878p == 1) {
                    str = "tgs";
                } else {
                    str = "webp";
                }
                getFileLoader().V(k10, stickerSetCovered, str, 3, 1);
            }
        }
    }

    public final void q1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w10;
        ArrayList<TLRPC.Document> arrayList;
        hc k10;
        String str;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && (w10 = w7.w(stickerSet.thumbs, 90, false, null, false)) != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty() && (k10 = hc.k(w10, arrayList.get(0), tL_messages_stickerSet.set.thumb_version)) != null) {
            if (k10.f22878p == 1) {
                str = "tgs";
            } else {
                str = "webp";
            }
            getFileLoader().V(k10, tL_messages_stickerSet, str, 3, 1);
        }
    }

    public final String r0(long j3) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.I.f(j3);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        a0.h[] hVarArr = this.f25842t0;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) hVarArr[0].f(j3);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) hVarArr[1].f(j3);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public final void r1(final int i7, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2 = tL_messages_allStickers;
        final ArrayList arrayList = new ArrayList();
        if (tL_messages_allStickers2.sets.isEmpty()) {
            z1(i7, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, runnable);
            return;
        }
        final a0.h hVar = new a0.h();
        final int i10 = 0;
        while (i10 < tL_messages_allStickers2.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers2.sets.get(i10);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.I.f(stickerSet.f26983id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar.k(tL_messages_stickerSet, stickerSet2.f26983id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar.m() == tL_messages_allStickers2.sets.size()) {
                        z1(i7, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, null);
                    }
                    i10++;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.f26976id = stickerSet.f26983id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    g0.h3(new jg.u(ui.this, tLObject, arrayList, i10, hVar, stickerSet, tL_messages_allStickers2, i7));
                }
            });
            i10++;
            tL_messages_allStickers2 = tL_messages_allStickers;
        }
        runnable.run();
    }

    public final boolean s() {
        if (this.W[0] && this.G[0].size() < 5 && this.f25814f0[2].isEmpty()) {
            return false;
        }
        return true;
    }

    public final ArrayList s0(int i7) {
        ArrayList[] arrayListArr = this.G;
        if (i7 == 3) {
            return arrayListArr[2];
        }
        return arrayListArr[i7];
    }

    public final void s1(String str, boolean z9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, int i7) {
        g0.h3(new lh(this, str, 4));
        Utilities.d.c(new jg.t0(this, z10, tL_messages_stickerSet, i7, str, z9));
    }

    public final void t1(final boolean z9, final ArrayList arrayList, final ArrayList arrayList2, final boolean z10, final boolean z11, final int i7, final long j3) {
        g0.h3(new qh(this, z9, 0));
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rh.run():void");
            }
        });
    }

    public final void u(boolean z9) {
        if (z9) {
            this.f25851x = 0;
            int[] iArr = this.f25834q0;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        V0(2, false, true, false);
        V0(3, false, true, false);
        V0(7, false, false, true);
        x();
        w();
        A();
        if (!this.f25805c && (!this.d || Math.abs((System.currentTimeMillis() / 1000) - this.f25810e) >= 3600)) {
            E0(true, false, null);
        }
        if (!this.E && (this.D == null || Math.abs((System.currentTimeMillis() / 1000) - this.F) >= 3600)) {
            R0(true);
        }
        z();
        C();
        if (getUserConfig().f24478d0 != null) {
            String str = getUserConfig().f24478d0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.f25829n0 && System.currentTimeMillis() - getUserConfig().f24484h0 >= 86400000) {
            this.f25829n0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ih(this, 8));
        }
        getMessagesController().E0();
    }

    public final void u0(long j3) {
        v0(j3, true);
    }

    public final void u1(final TLRPC.messages_Messages messages_messages, final long j3, int i7, int i10, final int i11, final int i12, long j10, final int i13, final int i14, final boolean z9, final int i15) {
        long j11;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        ArrayList<TLRPC.Message> arrayList;
        int i20;
        ArrayList<TLRPC.Message> arrayList2;
        if (r2.f25212a) {
            if (messages_messages != null && (arrayList2 = messages_messages.messages) != null) {
                i20 = arrayList2.size();
            } else {
                i20 = 0;
            }
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(i20);
            sb2.append(" did ");
            j11 = j3;
            sb2.append(j11);
            sb2.append(" topicId ");
            sb2.append(j10);
            sb2.append(" count = ");
            i16 = i7;
            i17 = i10;
            jg.g.x(sb2, i16, " max_id=", i17, " min_id=");
            i18 = i12;
            jg.g.x(sb2, i11, " type = ", i18, " cache = ");
            i19 = i14;
            jg.g.x(sb2, i13, " classGuid = ", i19, " topReached=");
            z10 = z9;
            sb2.append(z10);
            a8.b(sb2.toString());
        } else {
            j11 = j3;
            i16 = i7;
            i17 = i10;
            i18 = i12;
            i19 = i14;
            z10 = z9;
        }
        if (i13 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i11 == 0) || (messages_messages.messages.size() <= 1 && i11 != 0)) && !m5.C(j11))) {
            if (i13 == 2) {
                return;
            }
            N0(j3, i16, i17, i11, i18, j10, 0, i19, i15, null, null);
            return;
        }
        if (i13 == 0) {
            gc.X(messages_messages.messages);
            getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
            getMessagesStorage().f26719a.c(new tg(this, i11, messages_messages.messages, z10, j3, i10, i12, j10));
        }
        Utilities.f21338g.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.messages_Messages messages_messages2;
                ui uiVar;
                a0.h hVar = new a0.h();
                int i21 = 0;
                while (true) {
                    messages_messages2 = messages_messages;
                    if (i21 >= messages_messages2.users.size()) {
                        break;
                    }
                    TLRPC.User user = messages_messages2.users.get(i21);
                    hVar.k(user, user.f27105id);
                    i21++;
                }
                ArrayList arrayList3 = new ArrayList();
                int i22 = 0;
                while (true) {
                    int size = messages_messages2.messages.size();
                    uiVar = ui.this;
                    if (i22 >= size) {
                        break;
                    }
                    ij ijVar = new ij(uiVar.currentAccount, messages_messages2.messages.get(i22), hVar, (a0.h) null, true, false);
                    ijVar.Q();
                    arrayList3.add(ijVar);
                    i22++;
                }
                uiVar.getFileLoader().l(arrayList3);
                int i23 = i13;
                long j12 = j3;
                pf pfVar = new pf(uiVar, messages_messages2, i23, j12, arrayList3, i14, i12, z9, i11, i15, 0);
                if (uiVar.getMessagesController().f24896s7.v(j12)) {
                    uiVar.getMessagesStorage().f26719a.c(new ng(uiVar, arrayList3, pfVar, 29));
                } else {
                    pfVar.run();
                }
            }
        });
    }

    public final void v() {
        if (getUserConfig().f24480e0 != null) {
            String str = getUserConfig().f24480e0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.f25830o0 && System.currentTimeMillis() - getUserConfig().f24485i0 >= 86400000) {
            this.f25830o0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ih(this, 5));
        }
    }

    public final void v0(long j3, boolean z9) {
        int i7;
        int i10;
        ArrayList arrayList;
        TLRPC.TL_topPeer tL_topPeer;
        int i11;
        if (!getUserConfig().V) {
            return;
        }
        p10 userConfig = getUserConfig();
        if (z9) {
            i7 = userConfig.F;
        } else {
            i7 = userConfig.E;
        }
        int i12 = 1;
        if (i7 != 0) {
            i10 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i7);
        } else {
            i10 = 60;
        }
        if (z9) {
            arrayList = this.f25825k1;
        } else {
            arrayList = this.f25823j1;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                tL_topPeer = (TLRPC.TL_topPeer) arrayList.get(i13);
                if (tL_topPeer.peer.user_id == j3) {
                    break;
                }
                i13++;
            } else {
                tL_topPeer = null;
                break;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j3;
            arrayList.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(i10 / getMessagesController().Z2) + tL_topPeer.rating;
        Collections.sort(arrayList, new jg.x(19));
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        if (z9) {
            i12 = 3;
        }
        getMessagesStorage().f26719a.c(new ah(this, j3, i12, tL_topPeer.rating));
        qs notificationCenter = getNotificationCenter();
        if (z9) {
            i11 = qs.U0;
        } else {
            i11 = qs.T0;
        }
        notificationCenter.k(i11, new Object[0]);
    }

    public final void v1(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j3, int i7, boolean z9) {
        boolean z10;
        if (tL_attachMenuBots != null && i7 != 0) {
            this.f25802b = tL_attachMenuBots;
            this.f25799a = j3;
        }
        SharedPreferences.Editor edit = getMessagesController().f24774e7.edit();
        this.f25810e = i7;
        edit.putInt("menuBotsUpdateDate", i7).commit();
        this.d = true;
        if (tL_attachMenuBots != null) {
            if (!z9) {
                getMessagesStorage().m1(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().Y3(tL_attachMenuBots.users, z9);
            g0.h3(new fg(this, 0));
            z10 = false;
            for (int i10 = 0; i10 < tL_attachMenuBots.bots.size(); i10++) {
                if (tL_attachMenuBots.bots.get(i10) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i10).show_in_attach_menu = true;
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        if (!z9) {
            getMessagesStorage().f26719a.c(new hk(i7, 2, j3, this, tL_attachMenuBots));
        } else if (z10 || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 3600) {
            E0(false, true, null);
        }
    }

    public final void w() {
        if (!this.f25849w0[1]) {
            if (!this.f25852x0[1] || Math.abs((System.currentTimeMillis() / 1000) - this.f25834q0[1]) >= 3600) {
                K0(true, true);
            }
        }
    }

    public final void w0(long j3) {
        TLRPC.User a22;
        if (getUserConfig().V && m5.E(j3) && (a22 = getMessagesController().a2(Long.valueOf(j3))) != null && !a22.bot && !a22.self) {
            getMessagesStorage().f26719a.c(new yg(this, j3, 2));
        }
    }

    public final void w1(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i7, boolean z9) {
        if (tL_help_premiumPromo != null) {
            this.D = tL_help_premiumPromo;
            this.F = i7;
            getMessagesController().Y3(tL_help_premiumPromo.users, z9);
            g0.h3(new fg(this, 3));
        }
        if (!z9) {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().f26719a.c(new l7(this, tL_help_premiumPromo, i7, 7));
            }
            this.E = false;
        } else if (tL_help_premiumPromo != null && Math.abs((System.currentTimeMillis() / 1000) - i7) < 86400) {
            this.E = false;
        } else {
            R0(false);
        }
    }

    public final void x() {
        if (!this.f25849w0[0]) {
            if (!this.f25852x0[0] || Math.abs((System.currentTimeMillis() / 1000) - this.f25834q0[0]) >= 3600) {
                K0(false, true);
            }
        }
    }

    public final void x1(List list, int i7, int i10, boolean z9) {
        ArrayList arrayList;
        if (list != null && i10 != 0) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            HashMap hashMap = this.f25836r;
            hashMap.clear();
            ArrayList arrayList3 = this.f25828n;
            arrayList3.clear();
            arrayList2.addAll(list);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((TLRPC.TL_availableReaction) arrayList2.get(i11)).positionInList = i11;
                hashMap.put(((TLRPC.TL_availableReaction) arrayList2.get(i11)).reaction, (TLRPC.TL_availableReaction) arrayList2.get(i11));
                if (!((TLRPC.TL_availableReaction) arrayList2.get(i11)).inactive) {
                    arrayList3.add((TLRPC.TL_availableReaction) arrayList2.get(i11));
                }
            }
            this.f25813f = i7;
        }
        this.f25851x = i10;
        if (list != null) {
            g0.h3(new fg(this, 7));
        }
        this.f25848w = false;
        if (!z9) {
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            getMessagesStorage().f26719a.c(new l2.a0(this, arrayList, i7, i10, 3));
            return;
        }
        Math.abs((System.currentTimeMillis() / 1000) - i10);
        S0(false, Integer.valueOf(i7));
    }

    public final void y0(long r20, int r22, org.telegram.ui.web.o r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ui.y0(long, int, org.telegram.ui.web.o):void");
    }

    public final void y1(int i7, ArrayList arrayList, boolean z9, int i10, boolean z10) {
        int i11;
        ArrayList arrayList2;
        boolean z11;
        int i12;
        if (arrayList != null) {
            i11 = i7;
            arrayList2 = arrayList;
            z11 = z9;
            i12 = i10;
            getMessagesStorage().f26719a.c(new vf(this, z11, i11, arrayList2, z10, i12));
        } else {
            i11 = i7;
            arrayList2 = arrayList;
            z11 = z9;
            i12 = i10;
        }
        if (i12 == 0) {
            g0.h3(new wf(this, z11, i11, arrayList2));
        }
    }

    public final void z() {
        if (getUserConfig().f24475b0 != null) {
            String str = getUserConfig().f24475b0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.f25826l0 && System.currentTimeMillis() - getUserConfig().f24482f0 >= 86400000) {
            this.f25826l0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ih(this, 4));
        }
    }

    public final void z1(int i7, ArrayList arrayList, boolean z9, int i10, long j3, Runnable runnable) {
        g0.h3(new og(this, i7, 0));
        Utilities.d.c(new pg(this, z9, arrayList, i10, j3, i7, runnable));
    }
}
