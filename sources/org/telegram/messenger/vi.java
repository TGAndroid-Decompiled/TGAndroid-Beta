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
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class vi extends f1 {
    public static final Pattern R1 = Pattern.compile("\\*\\*(.+?)\\*\\*");
    public static final Pattern S1 = Pattern.compile("__(.+?)__");
    public static final Pattern T1 = Pattern.compile("\\|\\|(.+?)\\|\\|");
    public static final Pattern U1 = Pattern.compile("~~(.+?)~~");
    public static final String V1 = "org.telegram.messenger.SHORTCUT_SHARE";
    public static volatile vi[] W1 = new vi[4];
    public static final Object[] X1 = new Object[4];
    public static Paint Y1;
    public static Paint Z1;
    public static RectF a2;
    public static Path f18629b2;
    public static final int f18630c2;
    public static final a4.d f18631d2;
    public static final Pattern f18632e2;
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
    public sg.o0 Q0;
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
    public long f18633a;
    public final HashMap f18634a0;
    public ArrayList f18635a1;
    public TLRPC.TL_attachMenuBots f18636b;
    public final int[] f18637b0;
    public final SparseArray[] f18638b1;
    public boolean f18639c;
    public a0.h f18640c0;
    public final ArrayList f18641c1;
    public boolean d;
    public HashMap f18642d0;
    public String f18643d1;
    public int e;
    public HashMap f18644e0;
    public int f18645e1;
    public int f18646f;
    public final ArrayList[] f18647f0;
    public boolean f18648f1;
    public final boolean[] f18649g0;
    public boolean f18650g1;
    public final ArrayList h;
    public final boolean[] f18651h0;
    public boolean f18652h1;
    public ArrayList f18653i0;
    public ArrayList f18654i1;
    public boolean f18655j0;
    public ArrayList f18656j1;
    public boolean f18657k0;
    public ArrayList f18658k1;
    public boolean f18659l0;
    public ArrayList l1;
    public boolean m0;
    public boolean f18660m1;
    public final ArrayList f18661n;
    public boolean f18662n0;
    public boolean f18663n1;
    public boolean f18664o0;
    public final HashMap f18665o1;
    public final long[] f18666p0;
    public final a0.h f18667p1;
    public final int[] f18668q0;
    public final a0.h f18669q1;
    public final HashMap f18670r;
    public boolean f18671r0;
    public final a0.h f18672r1;
    public String f18673s;
    public final ArrayList[] f18674s0;
    public final a0.h f18675s1;
    public final a0.h[] f18676t0;
    public final SharedPreferences f18677t1;
    public final ArrayList[] f18678u0;
    public boolean f18679u1;
    public final ArrayList[] f18680v0;
    public final HashMap f18681v1;
    public boolean f18682w;
    public final boolean[] f18683w0;
    public final a0.h f18684w1;
    public int f18685x;
    public final boolean[] f18686x0;
    public final HashMap f18687x1;
    public boolean f18688y;
    public TLRPC.Document f18689y0;
    public final a0.h f18690y1;
    public final of.c f18691z0;
    public final HashMap f18692z1;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            X1[i10] = new Object();
        }
        f18630c2 = 1;
        f18631d2 = new a4.d(22);
        f18632e2 = Pattern.compile("(?<![A-Za-z0-9_+/=:-])(?:-?[0-9]{1,10}:[0-9a-fA-F]{64}|[A-Za-z0-9_+/-]{48})(?![A-Za-z0-9_+/=:-])");
    }

    public vi(int i10) {
        super(i10);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z10;
        int i11;
        long j10;
        this.f18636b = new TLRPC.TL_attachMenuBots();
        this.h = new ArrayList();
        this.f18661n = new ArrayList();
        this.f18670r = new HashMap();
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
        this.f18634a0 = new HashMap();
        this.f18637b0 = new int[7];
        this.f18640c0 = new a0.h();
        this.f18642d0 = new HashMap();
        this.f18644e0 = new HashMap();
        this.f18647f0 = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        this.f18649g0 = new boolean[9];
        this.f18651h0 = new boolean[9];
        this.f18653i0 = new ArrayList();
        this.f18666p0 = new long[2];
        this.f18668q0 = new int[2];
        this.f18674s0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f18676t0 = new a0.h[]{new a0.h(), new a0.h()};
        this.f18678u0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f18680v0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f18683w0 = new boolean[2];
        this.f18686x0 = new boolean[2];
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
        this.f18635a1 = new ArrayList();
        this.f18638b1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f18641c1 = new ArrayList();
        this.f18654i1 = new ArrayList();
        this.f18656j1 = new ArrayList();
        this.f18658k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f18665o1 = new HashMap();
        this.f18667p1 = new a0.h();
        this.f18669q1 = new a0.h();
        this.f18672r1 = new a0.h();
        this.f18675s1 = new a0.h();
        this.f18681v1 = new HashMap();
        this.f18684w1 = new a0.h();
        this.f18687x1 = new HashMap();
        this.f18690y1 = new a0.h();
        this.f18692z1 = new HashMap();
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
            this.f18677t1 = w0.f18945b.getSharedPreferences("drafts", 0);
        } else {
            this.f18677t1 = w0.f18945b.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f18677t1.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.A(key).longValue();
                serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (!key.startsWith("r_")) {
                z10 = key.startsWith("rt_");
                if (!z10) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        a0.h hVar = (a0.h) this.f18672r1.f(longValue);
                        if (hVar == null) {
                            hVar = new a0.h();
                            this.f18672r1.k(hVar, longValue);
                        }
                        if (key.startsWith("t_")) {
                            j10 = Utilities.A(key.substring(key.lastIndexOf(95) + 1)).longValue();
                        } else {
                            j10 = 0;
                        }
                        hVar.k(TLdeserialize, j10);
                    }
                    serializedData.cleanup();
                }
            } else {
                z10 = false;
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().f15524n);
                a0.h hVar2 = (a0.h) this.f18675s1.f(longValue);
                if (hVar2 == null) {
                    hVar2 = new a0.h();
                    this.f18675s1.k(hVar2, longValue);
                }
                if (z10) {
                    i11 = Utilities.z(key.substring(key.lastIndexOf(95) + 1)).intValue();
                } else {
                    i11 = 0;
                }
                hVar2.k(TLdeserialize2, i11);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        if (!arrayList.isEmpty()) {
            getMessagesStorage().f16331a.c(new ih(this, arrayList, 1));
        }
        c1("tg_placeholders_android", false, true);
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i12 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.y3.b(this.currentAccount)));
        for (int i13 = 0; i13 < i12; i13++) {
            SerializedData serializedData2 = new SerializedData(Utilities.v(sharedPreferences.getString("theme_" + i13, "")));
            try {
                org.telegram.ui.ActionBar.y3 c10 = org.telegram.ui.ActionBar.y3.c(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true));
                if (c10.f21562f.size() >= 4) {
                    arrayList2.add(new org.telegram.ui.Components.cp(c10));
                }
                g4.f15853s.c(new j9.u(this, arrayList2, false, 24));
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        U0(false);
        F0(false);
        F0(true);
        this.f18691z0 = new of.c(this.currentAccount);
        this.e = getMessagesController().f7.getInt("menuBotsUpdateDate", 0);
    }

    public static CharacterStyle J(CharacterStyle characterStyle, zz0 zz0Var, zz0 zz0Var2, boolean z10) {
        zz0 zz0Var3 = new zz0(zz0Var);
        if (zz0Var2 != null) {
            if (z10) {
                zz0Var3.b(zz0Var2);
            } else {
                zz0Var3.f33282a = zz0Var2.f33282a;
                zz0Var3.d = zz0Var2.d;
            }
        }
        if (characterStyle instanceof a01) {
            return new a01(zz0Var3, 0);
        }
        if (characterStyle instanceof h51) {
            return new h51(((h51) characterStyle).getURL(), zz0Var3);
        }
        return null;
    }

    public static boolean K(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
            TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList2.get(i10);
            if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language) || (((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) || (((messageEntity instanceof TLRPC.TL_messageEntityMentionName) && ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) || ((messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id != ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id)))) {
                return false;
            }
        }
        return true;
    }

    public static void K1(ArrayList arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public static void S1(SharedPreferences sharedPreferences, long j10, ArrayList arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", arrayList.size());
        edit.putLong("hash", j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i10, Utilities.f(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static ArrayList T0(SharedPreferences sharedPreferences) {
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i10);
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("object_" + i11, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
        return arrayList;
    }

    public static TLRPC.TL_inputStickerSetID Z(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.f19814id = stickerSet.f19821id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            return tL_inputStickerSetID;
        }
        return null;
    }

    public static void a(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        org.telegram.ui.Components.o5[] o5VarArr;
        org.telegram.ui.Components.o5 o5Var;
        if (arrayList != null) {
            Spannable spannable = (Spannable) charSequence;
            for (org.telegram.ui.Components.o5 o5Var2 : (org.telegram.ui.Components.o5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.o5.class)) {
                if (o5Var2 != null) {
                    spannable.removeSpan(o5Var2);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i11 = messageEntity.offset;
                    int i12 = messageEntity.length + i11;
                    if (i11 < i12 && i12 <= spannable.length()) {
                        if (tL_messageEntityCustomEmoji.document != null) {
                            o5Var = new org.telegram.ui.Components.o5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                        } else {
                            o5Var = new org.telegram.ui.Components.o5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                        }
                        spannable.setSpan(o5Var, i11, i12, 33);
                    }
                }
            }
        }
    }

    public static TLRPC.TL_inputStickerSetItem a0(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.f19806id = document.f19800id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static vi b0(int i10) {
        vi viVar;
        vi viVar2 = W1[i10];
        if (viVar2 == null) {
            synchronized (X1) {
                try {
                    viVar = W1[i10];
                    if (viVar == null) {
                        vi[] viVarArr = W1;
                        vi viVar3 = new vi(i10);
                        viVarArr[i10] = viVar3;
                        viVar = viVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return viVar;
        }
        return viVar2;
    }

    public static CharSequence d2(int i10, int i11, CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i10, i11);
        }
        if (charSequence instanceof SpannedString) {
            return ((SpannedString) charSequence).subSequence(i10, i11);
        }
        return TextUtils.substring(charSequence, i10, i11);
    }

    public static void e(int i10, int i11, int i12, ArrayList arrayList) {
        if ((i10 & 256) != 0) {
            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
            tL_messageEntitySpoiler.offset = i11;
            tL_messageEntitySpoiler.length = i12 - i11;
            arrayList.add(tL_messageEntitySpoiler);
        }
        if ((i10 & 1) != 0) {
            TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
            tL_messageEntityBold.offset = i11;
            tL_messageEntityBold.length = i12 - i11;
            arrayList.add(tL_messageEntityBold);
        }
        if ((i10 & 2) != 0) {
            TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
            tL_messageEntityItalic.offset = i11;
            tL_messageEntityItalic.length = i12 - i11;
            arrayList.add(tL_messageEntityItalic);
        }
        if ((i10 & 4) != 0) {
            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode.offset = i11;
            tL_messageEntityCode.length = i12 - i11;
            arrayList.add(tL_messageEntityCode);
        }
        if ((i10 & 8) != 0) {
            TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
            tL_messageEntityStrike.offset = i11;
            tL_messageEntityStrike.length = i12 - i11;
            arrayList.add(tL_messageEntityStrike);
        }
        if ((i10 & 16) != 0) {
            TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
            tL_messageEntityUnderline.offset = i11;
            tL_messageEntityUnderline.length = i12 - i11;
            arrayList.add(tL_messageEntityUnderline);
        }
    }

    public static void f(org.telegram.ui.Components.a01 r16, int r17, int r18, android.text.Spannable r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.f(org.telegram.ui.Components.a01, int, int, android.text.Spannable, boolean):void");
    }

    public static int f0(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia o12 = kj.o1(message);
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
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    z10 = documentAttribute.round_message;
                    z12 = !z10;
                    z11 = z10;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z13 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    z10 = documentAttribute.voice;
                    z15 = !z10;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    z14 = true;
                }
            }
            if (!z10 && !z11) {
                if (z12 && !z13 && !z14) {
                    return 0;
                }
                if (z14) {
                    return -1;
                }
                if (z13) {
                    return 5;
                }
                if (!z15) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }
        if (!message.entities.isEmpty()) {
            for (int i11 = 0; i11 < message.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i11);
                if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static void g(ArrayList arrayList, CharSequence charSequence, Spannable spannable, int i10) {
        int i11;
        ArrayList arrayList2;
        ArrayList t02;
        int i12;
        int i13;
        int i14;
        for (a01 a01Var : (a01[]) spannable.getSpans(0, spannable.length(), a01.class)) {
            spannable.removeSpan(a01Var);
        }
        int i15 = 1;
        int i16 = 100;
        if (arrayList != null && arrayList.size() > 100) {
            t02 = t0(arrayList, charSequence, i10);
            i11 = 1;
        } else {
            if (arrayList == null || arrayList.isEmpty() || charSequence == null || charSequence.length() == 0 || arrayList.size() > 1000) {
                i11 = 1;
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i17);
                    if (messageEntity != null) {
                        arrayList3.add(messageEntity);
                    }
                }
                Collections.sort(arrayList3, new a4.d(26));
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i18 = 0;
                int i19 = 0;
                loop3: while (true) {
                    if (i18 < size2) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i18);
                        if (messageEntity2.length <= 0 || (i14 = messageEntity2.offset) < 0 || i14 >= charSequence.length() || (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            i11 = i15;
                            i13 = i16;
                        } else {
                            ?? obj = new Object();
                            int i20 = messageEntity2.offset;
                            obj.f33283b = i20;
                            obj.f33284c = Math.min(messageEntity2.length, charSequence.length() - obj.f33283b) + i20;
                            if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                                obj.f33282a = 256;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                                obj.f33282a = 8;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                                obj.f33282a = 16;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                                obj.f33282a = i15;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                                obj.f33282a = 2;
                            } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                                if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                    obj.f33282a = 64;
                                    obj.d = messageEntity2;
                                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    obj.f33282a = 64;
                                    obj.d = messageEntity2;
                                } else {
                                    obj.f33282a = 128;
                                    obj.d = messageEntity2;
                                }
                            } else {
                                obj.f33282a = 4;
                            }
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                obj.f33282a |= 1024;
                            }
                            obj.f33282a &= i10;
                            int size3 = arrayList4.size();
                            int i21 = 0;
                            while (true) {
                                if (i21 < size3) {
                                    i19++;
                                    if (i19 > 10000) {
                                        i11 = i15;
                                        break loop3;
                                    }
                                    zz0 zz0Var = (zz0) arrayList4.get(i21);
                                    int i22 = obj.f33283b;
                                    i11 = i15;
                                    int i23 = zz0Var.f33283b;
                                    if (i22 > i23) {
                                        int i24 = zz0Var.f33284c;
                                        if (i22 >= i24) {
                                            continue;
                                        } else if (obj.f33284c < i24) {
                                            if (arrayList4.size() > 98) {
                                                break loop3;
                                            }
                                            zz0 zz0Var2 = new zz0(obj);
                                            zz0Var2.b(zz0Var);
                                            arrayList4.add(i21 + 1, zz0Var2);
                                            zz0 zz0Var3 = new zz0(zz0Var);
                                            zz0Var3.f33283b = obj.f33284c;
                                            i21 += 2;
                                            arrayList4.add(i21, zz0Var3);
                                            size3 += 2;
                                            int i25 = obj.f33283b;
                                            obj.f33283b = zz0Var.f33284c;
                                            zz0Var.f33284c = i25;
                                        } else if (arrayList4.size() >= i16) {
                                            break loop3;
                                        } else {
                                            zz0 zz0Var4 = new zz0(obj);
                                            zz0Var4.b(zz0Var);
                                            zz0Var4.f33284c = zz0Var.f33284c;
                                            i21++;
                                            arrayList4.add(i21, zz0Var4);
                                            size3++;
                                            int i252 = obj.f33283b;
                                            obj.f33283b = zz0Var.f33284c;
                                            zz0Var.f33284c = i252;
                                        }
                                        i21++;
                                        i15 = i11;
                                        i16 = 100;
                                    } else {
                                        int i26 = obj.f33284c;
                                        if (i23 < i26) {
                                            int i27 = zz0Var.f33284c;
                                            if (i26 == i27) {
                                                zz0Var.b(obj);
                                            } else if (i26 < i27) {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                zz0 zz0Var5 = new zz0(zz0Var);
                                                zz0Var5.b(obj);
                                                zz0Var5.f33284c = obj.f33284c;
                                                i21++;
                                                arrayList4.add(i21, zz0Var5);
                                                size3++;
                                                zz0Var.f33283b = obj.f33284c;
                                            } else if (arrayList4.size() >= 100) {
                                                break loop3;
                                            } else {
                                                zz0 zz0Var6 = new zz0(obj);
                                                zz0Var6.f33283b = zz0Var.f33284c;
                                                i21++;
                                                arrayList4.add(i21, zz0Var6);
                                                size3++;
                                                zz0Var.b(obj);
                                            }
                                            obj.f33284c = i23;
                                        } else {
                                            continue;
                                        }
                                        i21++;
                                        i15 = i11;
                                        i16 = 100;
                                    }
                                } else {
                                    i11 = i15;
                                    if (obj.f33283b < obj.f33284c) {
                                        i13 = 100;
                                        if (arrayList4.size() >= 100) {
                                            break;
                                        }
                                        arrayList4.add(obj);
                                    } else {
                                        i13 = 100;
                                    }
                                }
                            }
                        }
                        i18++;
                        i16 = i13;
                        i15 = i11;
                    } else {
                        i11 = i15;
                        int size4 = arrayList4.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            zz0 zz0Var7 = (zz0) arrayList4.get(i28);
                            int i29 = zz0Var7.f33283b;
                            if (i29 >= 0 && i29 < (i12 = zz0Var7.f33284c) && i12 <= charSequence.length()) {
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
                t02 = t0(arrayList, charSequence, i10);
            }
        }
        for (int i30 = 0; i30 < Math.min(1000, t02.size()); i30++) {
            zz0 zz0Var8 = (zz0) t02.get(i30);
            f(new a01(zz0Var8, 0), zz0Var8.f33283b, zz0Var8.f33284c, spannable, i11);
        }
    }

    public static void h(kj kjVar, Spannable spannable) {
        g(kjVar.f16690k.entities, kjVar.v, spannable, -1);
    }

    public static void i(TLRPC.DraftMessage draftMessage, SpannableString spannableString) {
        g(draftMessage.entities, draftMessage.message, spannableString, 264);
    }

    public static CharSequence j1(CharSequence charSequence, Pattern pattern, ArrayList arrayList, m9 m9Var) {
        boolean z10;
        TLRPC.MessageEntity messageEntity;
        URLSpan[] uRLSpanArr;
        String str = charSequence;
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        int i11 = 0;
        while (i10 <= matcher.regionEnd() && matcher.find(i10)) {
            String group = matcher.group(1);
            if ((str instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) str).getSpans(matcher.start() - i11, matcher.end() - i11, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                messageEntity = null;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i12);
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode)) {
                        if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress)) {
                            int i13 = messageEntity2.offset + messageEntity2.length;
                            if (!i0.B1(matcher.start() - i11, matcher.start(1) - i11, messageEntity2.offset, i13)) {
                                if (!i0.B1(matcher.end(1) - i11, matcher.end() - i11, messageEntity2.offset, i13)) {
                                    continue;
                                } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && i13 == matcher.end() - i11 && matcher.end(1) - i11 > messageEntity2.offset) {
                                    messageEntity = messageEntity2;
                                }
                            }
                            z10 = false;
                            break;
                        }
                    } else {
                        int i14 = messageEntity2.offset;
                        if (i0.B1(matcher.start() - i11, matcher.end() - i11, i14, messageEntity2.length + i14)) {
                            z10 = false;
                            break;
                        }
                    }
                }
            } else {
                messageEntity = null;
            }
            if (z10) {
                str = ((Object) str.subSequence(0, matcher.start() - i11)) + group + ((Object) str.subSequence(matcher.end() - i11, str.length()));
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) m9Var.l(null);
                messageEntity3.offset = matcher.start() - i11;
                int length = group.length();
                messageEntity3.length = length;
                int i15 = messageEntity3.offset;
                int i16 = length + i15;
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i17);
                    int i18 = messageEntity4.offset;
                    if (i18 > i16) {
                        messageEntity4.offset = i18 - 4;
                    } else if (i18 > i15) {
                        messageEntity4.offset = i18 - 2;
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
                i11 += (matcher.end() - matcher.start()) - group.length();
                i10 = matcher.end();
            } else {
                i10 = matcher.start() + 1;
            }
        }
        return str;
    }

    public static TLRPC.TL_attachMenuBotIcon k0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("default_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static void m1(ImageReceiver imageReceiver, jc jcVar, String str) {
        if (!tc.e(8200)) {
            return;
        }
        imageReceiver.f14414v1 = "preload";
        imageReceiver.h0(0);
        imageReceiver.q0(jcVar, str, null, null, 0, 11);
    }

    public static long n(int i10, ArrayList arrayList) {
        long j10 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i10, arrayList.size());
        for (int i11 = 0; i11 < min; i11++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i11);
            if (document != null) {
                j10 = p(j10, document.f19800id);
            }
        }
        return j10;
    }

    public static long p(long j10, long j11) {
        long j12 = j10 ^ (j10 >>> 21);
        long j13 = j12 ^ (j12 << 35);
        return (j13 ^ (j13 >>> 4)) + j11;
    }

    public static long q(ArrayList arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set;
                if (!stickerSet.archived) {
                    j10 = p(j10, stickerSet.hash);
                }
            }
        }
        return j10;
    }

    public static long q0(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetID)) {
                    return -1L;
                }
                return inputStickerSet.f19814id;
            }
        }
        return -1L;
    }

    public static boolean r(TLRPC.Message message) {
        boolean z10 = message instanceof TLRPC.TL_message_secret;
        if (z10 && (((kj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) || kj.L4(message) || kj.t3(message)) && kj.o1(message).ttl_seconds != 0 && kj.o1(message).ttl_seconds <= 60)) {
            return false;
        }
        if ((!z10 && (message instanceof TLRPC.TL_message) && (((kj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (kj.o1(message) instanceof TLRPC.TL_messageMediaDocument)) && kj.o1(message).ttl_seconds != 0)) || f0(message) == -1) {
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || user == null || !user.bot || user.f19943id != tL_attachMenuBot.bot_id) {
                if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) || user == null || !user.bot || user.f19943id == tL_attachMenuBot.bot_id) {
                    if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || user == null || user.bot) {
                        if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || chat == null || w3.V(chat)) {
                            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && w3.V(chat)) {
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

    public static ArrayList t0(ArrayList arrayList, CharSequence charSequence, int i10) {
        int i11;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty() && charSequence != null && charSequence.length() != 0 && arrayList.size() <= 1000) {
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i13);
                if (messageEntity != null) {
                    arrayList3.add(messageEntity);
                }
            }
            Collections.sort(arrayList3, new a4.d(25));
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int[] iArr = new int[arrayList3.size() * 2];
            int size2 = arrayList3.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i15);
                if (messageEntity2.length > 0 && (i11 = messageEntity2.offset) >= 0 && i11 < charSequence.length()) {
                    int i16 = messageEntity2.offset;
                    int min = Math.min(messageEntity2.length, charSequence.length() - i16) + i16;
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        ?? obj = new Object();
                        obj.f33283b = i16;
                        obj.f33284c = min;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                            obj.f33282a = 256;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                            obj.f33282a = 8;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                            obj.f33282a = 16;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                            obj.f33282a = 1;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                            obj.f33282a = 2;
                        } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                obj.f33282a = 64;
                                obj.d = messageEntity2;
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                obj.f33282a = 64;
                                obj.d = messageEntity2;
                            } else {
                                obj.f33282a = 128;
                                obj.d = messageEntity2;
                            }
                        } else {
                            obj.f33282a = 4;
                        }
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            obj.f33282a |= 1024;
                        }
                        obj.f33282a &= i10;
                        arrayList4.add(obj);
                        int i17 = i14 + 1;
                        iArr[i14] = i16;
                        i14 += 2;
                        iArr[i17] = min;
                    }
                }
            }
            if (i14 != 0) {
                Arrays.sort(iArr, 0, i14);
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = iArr[i18];
                    while (i18 < i14 && iArr[i18] == i19) {
                        i18++;
                    }
                    if (i18 >= i14) {
                        break;
                    }
                    int i20 = iArr[i18];
                    int size3 = arrayList4.size();
                    zz0 zz0Var = null;
                    int i21 = Integer.MIN_VALUE;
                    int i22 = i12;
                    while (i22 < size3) {
                        zz0 zz0Var2 = (zz0) arrayList4.get(i22);
                        if (zz0Var2.f33283b <= i19) {
                            zz0Var = zz0Var;
                            if (zz0Var2.f33284c >= i20) {
                                if (zz0Var == null) {
                                    ?? obj2 = new Object();
                                    obj2.f33283b = i19;
                                    obj2.f33284c = i20;
                                    zz0Var = obj2;
                                }
                                zz0Var.f33282a = zz0Var2.f33282a | zz0Var.f33282a;
                                TLRPC.MessageEntity messageEntity3 = zz0Var2.d;
                                if (messageEntity3 != null && (zz0Var.d == null || zz0Var2.f33283b > i21)) {
                                    zz0Var.d = messageEntity3;
                                    i21 = zz0Var2.f33283b;
                                }
                            }
                        }
                        i22++;
                        zz0Var = zz0Var;
                    }
                    if (zz0Var != null) {
                        if (!arrayList2.isEmpty()) {
                            zz0 zz0Var3 = (zz0) i0.a.g(1, arrayList2);
                            if (zz0Var3.f33284c == zz0Var.f33283b && zz0Var3.f33282a == zz0Var.f33282a && zz0Var3.d == zz0Var.d) {
                                zz0Var3.f33284c = zz0Var.f33284c;
                            }
                        }
                        if (arrayList2.size() >= 1000) {
                            arrayList2.clear();
                            return arrayList2;
                        }
                        arrayList2.add(zz0Var);
                    }
                    i12 = 0;
                }
            }
        }
        return arrayList2;
    }

    public static String x0(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.f19814id + "access_hash" + inputStickerSet.access_hash;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.y(int, java.util.ArrayList, boolean):boolean");
    }

    public static boolean z0(int i10, long j10) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i10 == 0) {
                str = "sdid_";
            } else {
                str = "bdid_";
            }
            String str2 = str + j10;
            List k10 = g0.f.k(w0.f18945b);
            for (int i11 = 0; i11 < k10.size(); i11++) {
                if (((g0.c) k10.get(i11)).f7264b.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A() {
        if (!this.f18682w && Math.abs((System.currentTimeMillis() / 1000) - this.f18685x) >= 3600) {
            S0(true, null);
        }
    }

    public final boolean A0(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.f18647f0;
            if (i10 >= arrayListArr[2].size()) {
                return false;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayListArr[2].get(i10);
            if (document2.f19800id == document.f19800id && document2.dc_id == document.dc_id) {
                return true;
            }
            i10++;
        }
    }

    public final void A1(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, int i10, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        org.telegram.ui.ActionBar.k2 k2Var2;
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.J.l(tL_messages_stickerSetInstallResultArchive.sets.get(i11).set.f19821id);
        }
        C0(i10, false);
        getNotificationCenter().k(at.Y0, tL_messages_stickerSetInstallResultArchive.sets);
        if (k2Var != null && k2Var.getParentActivity() != null) {
            Activity parentActivity = k2Var.getParentActivity();
            if (z10) {
                k2Var2 = k2Var;
            } else {
                k2Var2 = null;
            }
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
            ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
            boolean z11 = stickerSetCovered.set.masks;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            if (z11) {
                alertDialog$Builder.d = 1;
                x1Var.R = dd.L0(2131754131, null);
            } else {
                alertDialog$Builder.d = 0;
                x1Var.R = dd.L0(2131754126, null);
            }
            alertDialog$Builder.f26230c = new ArrayList(arrayList);
            alertDialog$Builder.e = k2Var2;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
            textView.setGravity(w7.b6.y());
            textView.setTextSize(1, 16.0f);
            textView.setPadding(i0.L(23.0f), i0.L(10.0f), i0.L(23.0f), 0);
            if (stickerSetCovered.set.masks) {
                textView.setText(dd.L0(2131754132, null));
            } else {
                textView.setText(dd.L0(2131754127, null));
            }
            linearLayout.addView(textView, w7.b6.o(-2, -2));
            uk0 uk0Var = new uk0(parentActivity, null);
            x1Var.getContext();
            uk0Var.setLayoutManager(new s4.a0(1, false));
            uk0Var.setAdapter(new ex0(alertDialog$Builder, parentActivity));
            uk0Var.setVerticalScrollBarEnabled(false);
            uk0Var.setPadding(i0.L(10.0f), 0, i0.L(10.0f), 0);
            uk0Var.setGlowColor(-657673);
            linearLayout.addView(uk0Var, w7.b6.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(dd.L0(2131752041, null), new org.telegram.ui.Components.au(28));
            if (k2Var2 != null) {
                alertDialog$Builder.k(dd.L0(2131745512, null), new org.telegram.ui.Components.px(alertDialog$Builder, 22));
            }
            k2Var.showDialog(x1Var);
        }
    }

    public final void B(int i10) {
        if (!this.V[i10]) {
            if (!this.W[i10] || Math.abs((System.currentTimeMillis() / 1000) - this.Y[i10]) >= 3600) {
                a1(i10, true, false);
            }
        }
    }

    public final boolean B0(long j10, boolean z10) {
        if (this.J.h(j10) >= 0 || (z10 && this.K.contains(Long.valueOf(j10)))) {
            if (z10 && this.L.contains(Long.valueOf(j10))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void B1(long j10, long j11, qi qiVar) {
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long hash = Objects.hash(Long.valueOf(j10), Long.valueOf(j11));
        String str = hash + "";
        if (qiVar == null) {
            sharedPreferences.edit().remove(str).apply();
            this.O1.l(hash);
            return;
        }
        sharedPreferences.edit().putString(str, qiVar.toString()).apply();
        this.O1.k(qiVar, hash);
    }

    public final void C() {
        if (getUserConfig().f15513c0 != null) {
            String str = getUserConfig().f15513c0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.m0 && System.currentTimeMillis() - getUserConfig().f15518g0 >= 86400000) {
            this.m0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new hh(this, 7));
        }
    }

    public final void C0(int i10, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            int i11 = wp.r1(this.currentAccount).e7.getInt("archivedStickersCount" + i10, -1);
            if (i11 == -1) {
                C0(i10, false);
                return;
            }
            this.f18637b0[i10] = i11;
            getNotificationCenter().k(at.Z0, Integer.valueOf(i10));
            return;
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.limit = 0;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_messages_getArchivedStickers.masks = z11;
        if (i10 == 5) {
            z12 = true;
        }
        tL_messages_getArchivedStickers.emojis = z12;
        getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new ph(this, i10, 1));
    }

    public final void C1(TLRPC.TL_emojiStatus tL_emojiStatus) {
        ArrayList<TLRPC.EmojiStatus>[] arrayListArr = this.E0;
        if (arrayListArr[0] != null) {
            long j10 = tL_emojiStatus.document_id;
            int i10 = 0;
            while (i10 < arrayListArr[0].size()) {
                if ((arrayListArr[0].get(i10) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) arrayListArr[0].get(i10)).document_id == j10) {
                    arrayListArr[0].remove(i10);
                    i10--;
                }
                i10++;
            }
            arrayListArr[0].add(0, tL_emojiStatus);
            while (arrayListArr[0].size() > 50) {
                a1.g.x(1, arrayListArr[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.D0[0];
            tL_emojiStatuses.statuses = arrayListArr[0];
            getMessagesStorage().f16331a.c(new o7(this, 0, tL_emojiStatuses, 8));
        }
    }

    public final void D(long j10, long j11, boolean z10) {
        TLRPC.DraftMessage draftMessage;
        a0.h hVar = this.f18672r1;
        a0.h hVar2 = (a0.h) hVar.f(j10);
        if (hVar2 != null) {
            draftMessage = (TLRPC.DraftMessage) hVar2.f(j11);
        } else {
            draftMessage = null;
        }
        if (draftMessage != null) {
            if (!z10) {
                a0.h hVar3 = (a0.h) hVar.f(j10);
                if (hVar3 != null) {
                    hVar3.l(j11);
                    if (hVar3.m() == 0) {
                        hVar.l(j10);
                    }
                }
                a0.h hVar4 = this.f18675s1;
                a0.h hVar5 = (a0.h) hVar4.f(j10);
                if (hVar5 != null) {
                    hVar5.l(j11);
                    if (hVar5.m() == 0) {
                        hVar4.l(j10);
                    }
                }
                int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                SharedPreferences sharedPreferences = this.f18677t1;
                if (i10 == 0) {
                    sharedPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
                    getMessagesController().Q4(null);
                    getNotificationCenter().k(at.f14779s, new Object[0]);
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                StringBuilder s10 = a1.g.s(j10, "t_", "_");
                s10.append(j11);
                SharedPreferences.Editor remove = edit.remove(s10.toString());
                StringBuilder s11 = a1.g.s(j10, "rt_", "_");
                s11.append(j11);
                remove.remove(s11.toString()).commit();
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
            Q1(j10, j11, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true, null);
        }
    }

    public final void D0() {
        E0(false, true, null);
    }

    public final void D1(long j10, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.f18681v1.put(botInfo.user_id + "_" + j10, botInfo);
        getMessagesStorage().f16331a.c(new d4(this, botInfo, j10, 12));
    }

    public final void E(boolean z10) {
        this.f18672r1.b();
        this.f18675s1.b();
        this.f18669q1.b();
        this.f18677t1.edit().clear().commit();
        if (z10) {
            getMessagesController().Q4(null);
            getNotificationCenter().k(at.f14779s, new Object[0]);
        }
    }

    public final void E0(boolean z10, boolean z11, ag.e3 e3Var) {
        long j10;
        this.f18639c = true;
        if (z10) {
            getMessagesStorage().f16331a.c(new fg(this, 15));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        if (z11) {
            j10 = 0;
        } else {
            j10 = this.f18633a;
        }
        tL_messages_getAttachMenuBots.hash = j10;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new v4(5, this, e3Var));
    }

    public final void E1(hs hsVar, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        if (hsVar != null) {
            try {
                int i10 = 0;
                if (hsVar.f16110b != 0) {
                    SQLiteDatabase sQLiteDatabase = getMessagesStorage().f16333b;
                    Locale locale = Locale.US;
                    long j10 = hsVar.f16109a;
                    long j11 = hsVar.f16110b;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + j10 + " AND tid = " + j11, new Object[0]);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().f16333b;
                    Locale locale2 = Locale.US;
                    long j12 = hsVar.f16109a;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + j12, new Object[0]);
                }
                if (queryFinalized.next()) {
                    i10 = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
                if (i10 >= message.f19815id && !kj.f3(i10) && !kj.f3(message.f19815id)) {
                    return;
                }
                if (hsVar.f16110b != 0) {
                    executeFast = getMessagesStorage().f16333b.executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = getMessagesStorage().f16333b.executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                }
                executeFast.requery();
                kj.q5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (hsVar.f16110b != 0) {
                    executeFast.bindLong(1, hsVar.f16109a);
                    executeFast.bindLong(2, hsVar.f16110b);
                    executeFast.bindInteger(3, message.f19815id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, hsVar.f16109a);
                    executeFast.bindInteger(2, message.f19815id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                i0.g3(new qg(this, hsVar, message));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void F() {
        this.f18654i1.clear();
        this.f18656j1.clear();
        this.f18658k1.clear();
        this.l1.clear();
        getNotificationCenter().k(at.S0, new Object[0]);
        getNotificationCenter().k(at.T0, new Object[0]);
        getNotificationCenter().k(at.U0, new Object[0]);
        getNotificationCenter().k(at.V0, new Object[0]);
        getMessagesStorage().f16331a.c(new fg(this, 16));
        m();
    }

    public final void F0(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.F0(boolean):void");
    }

    public final void F1(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().f16331a.c(new dg(this, tL_messages_stickerSet, str, i10, 8));
    }

    public final boolean G(long j10) {
        for (int i10 = 0; i10 < this.f18654i1.size(); i10++) {
            if (o5.o(((TLRPC.TL_topPeer) this.f18654i1.get(i10)).peer) == j10) {
                return true;
            }
        }
        return false;
    }

    public final void G0(long j10, long j11, boolean z10, int i10, uk ukVar) {
        if (z10) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.f18681v1.get(j10 + "_" + j11);
            if (botInfo != null) {
                getNotificationCenter().k(at.D0, botInfo, Integer.valueOf(i10));
                return;
            }
        }
        getMessagesStorage().f16331a.c(new wh(this, j10, j11, ukVar, i10, 0));
    }

    public final void G1(final boolean z10, ArrayList arrayList, final ArrayList arrayList2, final int i10, final long j10, final boolean z11) {
        ArrayList arrayList3;
        if (arrayList != null) {
            arrayList3 = new ArrayList(arrayList);
        } else {
            arrayList3 = null;
        }
        final ArrayList arrayList4 = arrayList3;
        getMessagesStorage().f16331a.c(new Runnable() {
            @Override
            public final void run() {
                int i11;
                int i12;
                ArrayList arrayList5 = arrayList2;
                long j11 = j10;
                boolean z12 = z11;
                vi viVar = vi.this;
                ArrayList arrayList6 = arrayList4;
                boolean z13 = z10;
                int i13 = i10;
                try {
                    if (arrayList6 != null) {
                        SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        int i14 = 4;
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            i14 += ((TLRPC.StickerSetCovered) arrayList6.get(i15)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i14);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList5.size() * 8) + 4);
                        nativeByteBuffer.writeInt32(arrayList6.size());
                        for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                            ((TLRPC.StickerSetCovered) arrayList6.get(i16)).serializeToStream(nativeByteBuffer);
                        }
                        nativeByteBuffer2.writeInt32(arrayList5.size());
                        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                            nativeByteBuffer2.writeInt64(((Long) arrayList5.get(i17)).longValue());
                        }
                        if (z13) {
                            i12 = 2;
                        } else {
                            i12 = 1;
                        }
                        executeFast.bindInteger(1, i12);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer2);
                        executeFast.bindInteger(4, i13);
                        executeFast.bindLong(5, j11);
                        executeFast.bindInteger(6, z12 ? 1 : 0);
                        executeFast.bindInteger(7, z13 ? 1 : 0);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = viVar.getMessagesStorage().f16333b.executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                    executeFast2.requery();
                    executeFast2.bindInteger(1, i13);
                    if (z13) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    executeFast2.bindInteger(2, i11);
                    executeFast2.bindInteger(3, z13 ? 1 : 0);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        });
    }

    public final Intent H(long j10) {
        if (j10 != 0) {
            Intent intent = new Intent(w0.f18945b, OpenAttachedMenuBotReceiver.class);
            if (o5.E(j10)) {
                intent.putExtra("botId", j10);
                intent.putExtra("currentAccount", this.currentAccount);
                StringBuilder sb2 = new StringBuilder("com.tmessages.openshortcutbot");
                int i10 = OpenAttachedMenuBotReceiver.f14516a;
                sb2.append(j10);
                intent.setAction(sb2.toString());
                intent.addFlags(67108864);
                return intent;
            }
            return null;
        }
        return null;
    }

    public final TL_bots.BotInfo H0(long j10, long j11) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase sQLiteDatabase = getMessagesStorage().f16333b;
        Locale locale = Locale.US;
        StringBuilder s10 = a1.g.s(j10, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        s10.append(j11);
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(s10.toString(), new Object[0]);
        if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        } else {
            botInfo = null;
        }
        queryFinalized.dispose();
        return botInfo;
    }

    public final void H1(long j10, long j11, int i10, int i11) {
        getMessagesStorage().f16331a.c(new mg(this, j11, j10, i10, i11, 1));
    }

    public final Intent I(long j10) {
        Intent intent = new Intent(w0.f18945b, OpenChatReceiver.class);
        if (o5.C(j10)) {
            int i10 = (int) (4294967295L & j10);
            intent.putExtra("encId", i10);
            if (getMessagesController().Z0(Integer.valueOf(i10)) == null) {
                return null;
            }
        } else if (o5.E(j10)) {
            intent.putExtra("userId", j10);
        } else if (!o5.z(j10)) {
            return null;
        } else {
            intent.putExtra("chatId", -j10);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j10);
        intent.addFlags(67108864);
        return intent;
    }

    public final void I0(hs hsVar, boolean z10) {
        TLRPC.Message message = (TLRPC.Message) this.f18687x1.get(hsVar);
        if (message != null) {
            getNotificationCenter().k(at.G0, message, hsVar);
        } else {
            getMessagesStorage().f16331a.c(new xf(this, hsVar, z10, 7));
        }
    }

    public final void I1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        TLRPC.StickerSet stickerSet;
        int i10;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.I.k(tL_messages_stickerSet, stickerSet.f19821id);
            if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
                this.N.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            }
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.G;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList = arrayListArr[i11];
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.f19821id == tL_messages_stickerSet.set.f19821id) {
                            arrayList.set(i12, tL_messages_stickerSet);
                        }
                    }
                }
                i11++;
            }
            long j10 = tL_messages_stickerSet.set.f19821id;
            a0.h hVar = this.M;
            if (hVar.d(j10)) {
                hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f19821id);
            }
            U1(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
            if (stickerSet3.masks) {
                i10 = 1;
            } else if (stickerSet3.emojis) {
                i10 = 5;
            } else {
                i10 = 0;
            }
            if (z10) {
                getNotificationCenter().k(at.f14814x0, Integer.valueOf(i10), Boolean.TRUE);
            }
        }
    }

    public final void J0() {
        if (!getUserConfig().f15532w && !this.f18679u1) {
            this.f18679u1 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new hh(this, 0));
        }
    }

    public final void J1(int i10, int i11, long j10, ArrayList arrayList) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        getMessagesStorage().f16331a.c(new e1(this, arrayList2, i10, i11, j10));
    }

    public final void K0(boolean z10, boolean z11) {
        long j10;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.f18683w0;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().f16331a.c(new qh(this, z10, 1));
            return;
        }
        long[] jArr = this.f18666p0;
        if (z10) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j10 = jArr[1];
            tL_messages_getFeaturedEmojiStickers.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j10 = jArr[0];
            tL_messages_getFeaturedStickers2.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new rf(this, z10, j10, 0));
    }

    public final void L(int i10, boolean z10) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.H0;
        if (zArr[i10]) {
            return;
        }
        zArr[i10] = true;
        if (z10) {
            getMessagesStorage().f16331a.c(new og(this, i10, 1));
            return;
        }
        long[] jArr = this.D0;
        if (i10 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = jArr[i10];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i10 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = jArr[i10];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = jArr[i10];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new ph(this, i10, 0));
    }

    public final void L0(TLRPC.StickerSet stickerSet, boolean z10) {
        if (z10) {
            getMessagesStorage().f16331a.c(new t6(27, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.f19814id = stickerSet.f19821id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new hh(this, 6));
    }

    public final void L1(long j10) {
        ArrayList arrayList = this.f18656j1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((TLRPC.TL_topPeer) arrayList.get(i10)).peer.user_id == j10) {
                arrayList.remove(i10);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().i1(j10);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ag.c3(6));
                getMessagesStorage().f16331a.c(new ed(this, j10, 1, 2));
                getNotificationCenter().k(at.T0, new Object[0]);
                return;
            }
        }
    }

    public final void M(String[] strArr, boolean z10) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = this.f18692z1;
                    if (hashMap.get(str) == null) {
                        if (!z10 || !this.A1.contains(str)) {
                            hashMap.put(str, Boolean.TRUE);
                            getMessagesStorage().f16331a.c(new kh(this, str, 5));
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

    public final void M0(boolean z10) {
        if (!this.f18663n1 && getUserConfig().V) {
            if (z10) {
                if (!this.f18660m1) {
                    this.f18663n1 = true;
                    getMessagesStorage().f16331a.c(new fg(this, 13));
                    this.f18660m1 = true;
                    return;
                }
                return;
            }
            this.f18663n1 = true;
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
            getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new a3.b(1), new d(this, 3));
        }
    }

    public final void M1(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.Y0;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i10 == ((kj) arrayList.get(i12)).f1()) {
                this.f18641c1.add((kj) arrayList.remove(i12));
                i12--;
            }
            i12++;
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.Z0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            if (i10 == ((kj) arrayList2.get(i13)).f1()) {
                arrayList2.remove(i13);
                i13--;
            }
            i13++;
        }
        while (i11 < this.f18635a1.size()) {
            if (i10 == ((kj) this.f18635a1.get(i11)).f1()) {
                this.f18635a1.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void N(TLRPC.InputStickerSet inputStickerSet, k20 k20Var) {
        String x02 = x0(inputStickerSet);
        HashMap hashMap = this.K0;
        ArrayList arrayList = (ArrayList) hashMap.get(x02);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(k20Var);
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(x02, arrayList);
        }
        arrayList.add(k20Var);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new yh(this, x02, 0));
    }

    public final void N0(final long r17, final int r19, final int r20, final int r21, final int r22, final long r23, int r25, final int r26, final int r27, sg.o0 r28, java.lang.String r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.N0(long, int, int, int, int, long, int, int, int, sg.o0, java.lang.String):void");
    }

    public final void N1(long j10) {
        for (int i10 = 0; i10 < this.f18654i1.size(); i10++) {
            if (((TLRPC.TL_topPeer) this.f18654i1.get(i10)).peer.user_id == j10) {
                this.f18654i1.remove(i10);
                getNotificationCenter().k(at.S0, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().i1(j10);
                getMessagesStorage().f16331a.c(new ed(this, j10, 0, 2));
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ag.c3(6));
                return;
            }
        }
    }

    public final void O(ArrayList arrayList, Integer num, boolean z10, boolean z11, Runnable runnable) {
        if (arrayList.isEmpty()) {
            runnable.run();
            return;
        }
        ArrayList[] arrayListArr = {s0(5)};
        lh lhVar = new lh(this, num, arrayList, z11, z10, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 == null || arrayList2.isEmpty()) && !this.B1) {
            this.B1 = true;
            boolean[] zArr = new boolean[1];
            i0.g3(new vl(this, zArr, arrayListArr, lhVar, 15));
            i0.h3(new t6(26, zArr, lhVar), 900L);
            return;
        }
        lhVar.run();
    }

    public final void O0() {
        if (!this.f18648f1 && this.L0 == 0) {
            boolean[] zArr = this.X0;
            if (!zArr[0] || this.N0 != 0 || !zArr[1]) {
                int i10 = this.f18645e1;
                this.f18645e1 = this.Y0.size();
                this.f18648f1 = true;
                X1(null, this.P0, this.N0, this.S0, 1, this.O0, false, this.T0, this.U0, false, this.Q0);
                this.f18645e1 = i10;
            }
        }
    }

    public final void O1(int i10, ArrayList arrayList) {
        ArrayList[] arrayListArr = this.G;
        Collections.sort(arrayListArr[i10], new fh(0, arrayList));
        this.X[i10] = q(arrayListArr[i10]);
        getNotificationCenter().k(at.f14814x0, Integer.valueOf(i10), Boolean.FALSE);
    }

    public final java.util.ArrayList P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.P():java.util.ArrayList");
    }

    public final ArrayList P0(long j10, long j11, ArrayList arrayList, boolean z10) {
        ?? join;
        CharSequence charSequence;
        ArrayList arrayList2;
        ArrayList arrayList3;
        char c10;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Integer num = (Integer) arrayList.get(i11);
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
            int i12 = 1;
            long j12 = getUserConfig().f15524n;
            Object obj = join;
            char c11 = 2;
            ?? r10 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().f16333b.queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", obj, Long.valueOf(j10)), new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r10);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j12);
                        TLdeserialize.f19815id = queryFinalized.intValue(i12);
                        c10 = 2;
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j10;
                        is.e(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.f19815id));
                    } else {
                        c10 = c11;
                    }
                    byteBufferValue.reuse();
                } else {
                    c10 = c11;
                }
                c11 = c10;
                r10 = 0;
                i12 = 1;
            }
            queryFinalized.dispose();
            if (arrayList4.isEmpty()) {
                charSequence = ",";
            } else {
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().f16333b;
                Locale locale = Locale.US;
                charSequence = ",";
                ?? r11 = 0;
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN (" + TextUtils.join(charSequence, arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(r11);
                    if (byteBufferValue2 != null) {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r11), r11);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j12);
                            TLdeserialize2.dialog_id = j10;
                            is.e(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.f19815id));
                        }
                        byteBufferValue2.reuse();
                    }
                    r11 = 0;
                }
                queryFinalized2.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (i10 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().g1(j11);
                    tL_channels_getMessages.f19832id = arrayList4;
                    arrayList2 = arrayList9;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new zf(this, j11, j10, tL_channels_getMessages));
                } else {
                    arrayList2 = arrayList9;
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f19890id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new rj(this, j10, tL_messages_getMessages, 1));
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
                    if (z10) {
                        return k(arrayList5, arrayList6, arrayList3, true, true);
                    }
                    k(arrayList5, arrayList6, arrayList3, true, false);
                    return null;
                } catch (Exception e) {
                    e = e;
                    f8.g(e, true);
                    return null;
                }
            }
            return null;
        } catch (Exception e7) {
            e = e7;
        }
    }

    public final void P1(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.P1(org.telegram.tgnet.TLRPC$TL_messages_stickerSet):void");
    }

    public final String Q() {
        String str = this.f18673s;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        String string = wp.r1(this.currentAccount).f19138g7.getString("reaction_on_double_tap", null);
        if (string != null && (this.f18670r.get(string) != null || string.startsWith("animated_"))) {
            this.f18673s = string;
            return string;
        }
        return ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
    }

    public final void Q0(final int i10, final int i11, final long j10) {
        a0.h hVar = this.f18667p1;
        if (hVar.h(j10) >= 0) {
            return;
        }
        hVar.k(Boolean.TRUE, j10);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().i1(j10);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i10;
        tL_messages_search.f19905q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i12;
                boolean z10;
                a0.h hVar2;
                vi viVar = vi.this;
                viVar.getClass();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                boolean z11 = tLObject instanceof TLRPC.messages_Messages;
                int i13 = i11;
                int i14 = 1;
                if (z11) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    for (int i15 = 0; i15 < messages_messages.users.size(); i15++) {
                        TLRPC.User user = messages_messages.users.get(i15);
                        hVar3.k(user, user.f19943id);
                    }
                    a0.h hVar4 = new a0.h();
                    for (int i16 = 0; i16 < messages_messages.chats.size(); i16++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i16);
                        hVar4.k(chat, chat.f19794id);
                    }
                    viVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    viVar.getMessagesController().V3(messages_messages.users, false);
                    viVar.getMessagesController().P3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.Message message = messages_messages.messages.get(i17);
                        if ((message instanceof TLRPC.TL_messageService) || (message instanceof TLRPC.TL_messageEmpty)) {
                            hVar2 = hVar4;
                        } else {
                            arrayList.add(Integer.valueOf(message.f19815id));
                            hVar2 = hVar4;
                            hashMap.put(Integer.valueOf(message.f19815id), new kj(viVar.currentAccount, message, hVar3, hVar2, false, false));
                        }
                        i17++;
                        hVar4 = hVar2;
                    }
                    if (i13 != 0 && arrayList.isEmpty()) {
                        arrayList.add(Integer.valueOf(i13));
                    }
                    if (messages_messages.messages.size() >= tL_messages_search.limit) {
                        i14 = 0;
                    }
                    i12 = Math.max(messages_messages.count, messages_messages.messages.size());
                    z10 = i14;
                } else {
                    if (i13 != 0) {
                        arrayList.add(Integer.valueOf(i13));
                    } else {
                        i14 = 0;
                    }
                    i12 = i14;
                    z10 = false;
                }
                is messagesStorage = viVar.getMessagesStorage();
                long j11 = j10;
                messagesStorage.c2(j11, arrayList, true, i12, i10, z10, hashMap);
                i0.g3(new yg(viVar, j11, 1));
            }
        });
    }

    public final void Q1(long r23, long r25, java.lang.CharSequence r27, java.util.ArrayList r28, org.telegram.tgnet.TLRPC.Message r29, org.telegram.ui.kn r30, org.telegram.tgnet.TLRPC.SuggestedPost r31, long r32, boolean r34, boolean r35, org.telegram.tgnet.tl.TL_iv.RichMessage r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.Q1(long, long, java.lang.CharSequence, java.util.ArrayList, org.telegram.tgnet.TLRPC$Message, org.telegram.ui.kn, org.telegram.tgnet.TLRPC$SuggestedPost, long, boolean, boolean, org.telegram.tgnet.tl.TL_iv$RichMessage):void");
    }

    public final TLRPC.DraftMessage R(long j10, long j11) {
        a0.h hVar = (a0.h) this.f18672r1.f(j10);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) hVar.f(j11);
    }

    public final void R0(boolean z10) {
        this.E = true;
        if (z10) {
            getMessagesStorage().f16331a.c(new fg(this, 17));
            return;
        }
        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new hh(this, 9));
    }

    public final void R1(final long j10, final long j11, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z10) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        final long j12;
        TLRPC.Chat L0;
        final long j13;
        StringBuilder sb2;
        if (getMessagesController().s2(j10) && j11 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences sharedPreferences = this.f18677t1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        wp messagesController = getMessagesController();
        a0.h hVar = this.f18672r1;
        a0.h hVar2 = this.f18675s1;
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar3 = (a0.h) hVar.f(j10);
            if (hVar3 == null) {
                hVar3 = new a0.h();
                hVar.k(hVar3, j10);
            }
            hVar3.k(draftMessage, j11);
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 == 0) {
                messagesController.Q3(j10, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (i10 == 0) {
                    sb2 = new StringBuilder("");
                    sb2.append(j10);
                } else {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j10);
                    sb2.append("_");
                    sb2.append(j11);
                }
                edit.putString(sb2.toString(), Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                f8.g(e, true);
            }
        } else {
            a0.h hVar4 = (a0.h) hVar.f(j10);
            if (hVar4 != null) {
                hVar4.l(j11);
                if (hVar4.m() == 0) {
                    hVar.l(j10);
                }
            }
            a0.h hVar5 = (a0.h) hVar2.f(j10);
            if (hVar5 != null) {
                hVar5.l(j11);
                if (hVar5.m() == 0) {
                    hVar2.l(j10);
                }
            }
            if (j11 == 0) {
                sharedPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                StringBuilder s10 = a1.g.s(j10, "t_", "_");
                s10.append(j11);
                SharedPreferences.Editor remove = edit2.remove(s10.toString());
                StringBuilder s11 = a1.g.s(j10, "rt_", "_");
                s11.append(j11);
                remove.remove(s11.toString()).commit();
            }
            a0.h hVar6 = messagesController.Q;
            TLRPC.Dialog dialog = (TLRPC.Dialog) hVar6.f(j10);
            if (dialog != null && dialog.top_message == 0) {
                hVar6.l(dialog.f19798id);
                messagesController.f19293y.remove(dialog);
            }
        }
        a0.h hVar7 = (a0.h) hVar2.f(j10);
        TLRPC.User user = null;
        if (message == null && draftMessage != null && draftMessage.reply_to != null) {
            if (hVar7 != null) {
                message2 = (TLRPC.Message) hVar7.f(j11);
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
                hVar7.l(j11);
                if (hVar7.m() == 0) {
                    hVar2.l(j10);
                }
            }
            if (j11 == 0) {
                edit.remove("r_" + j10);
            } else {
                StringBuilder s12 = a1.g.s(j10, "rt_", "_");
                s12.append(j11);
                edit.remove(s12.toString());
            }
        } else {
            if (hVar7 == null) {
                hVar7 = new a0.h();
                hVar2.k(hVar7, j10);
            }
            hVar7.k(message2, j11);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j11 == 0) {
                    str = "r_" + j10;
                } else {
                    str = "rt_" + j10 + "_" + j11;
                }
                edit.putString(str, Utilities.f(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        edit.commit();
        if (z10) {
            if (j11 == 0 || getMessagesController().s2(j10)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == 0 || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    if ((inputReplyTo.flags & 2) != 0) {
                        j12 = o5.n(inputReplyTo.reply_to_peer_id);
                    } else {
                        j12 = j10;
                    }
                    if (o5.E(j12)) {
                        user = getMessagesController().Z1(Long.valueOf(j12));
                        L0 = null;
                    } else {
                        L0 = getMessagesController().L0(Long.valueOf(-j12));
                    }
                    if (user != null || L0 != null) {
                        if (w3.T(L0)) {
                            j13 = L0.f19794id;
                        } else {
                            j13 = 0;
                        }
                        final int i11 = draftMessage.reply_to.reply_to_msg_id;
                        getMessagesStorage().f16331a.c(new Runnable() {
                            @Override
                            public final void run() {
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                NativeByteBuffer byteBufferValue;
                                final vi viVar = vi.this;
                                int i12 = i11;
                                long j14 = j12;
                                try {
                                    SQLiteDatabase sQLiteDatabase = viVar.getMessagesStorage().f16333b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i12 + " and uid = " + j14, new Object[0]);
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            message4 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            message4.readAttachPath(byteBufferValue2, viVar.getUserConfig().f15524n);
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
                                                        TLdeserialize.readAttachPath(byteBufferValue, viVar.getUserConfig().f15524n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message5 = message4.replyMessage;
                                                        if (message5 != null) {
                                                            is.e(message5, arrayList, arrayList2, null);
                                                        }
                                                    }
                                                    if (message4.replyMessage == null) {
                                                        is.d(message4, hVar8, hVar9);
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                viVar.getMessagesStorage().o(e10, true);
                                            }
                                            viVar.getMessagesStorage().K0(hVar8, hVar9, arrayList, arrayList2, 0);
                                        }
                                        message3 = message4;
                                    } else {
                                        message3 = null;
                                    }
                                    queryFinalized.dispose();
                                    final long j15 = j10;
                                    final long j16 = j11;
                                    if (message3 == null) {
                                        long j17 = j13;
                                        if (j17 != 0) {
                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                            tL_channels_getMessages.channel = viVar.getMessagesController().g1(j17);
                                            tL_channels_getMessages.f19832id.add(Integer.valueOf(i12));
                                            viVar.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Message message6;
                                                    TLRPC.Message message7;
                                                    switch (r6) {
                                                        case 0:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                    i0.g3(new y8(viVar, j15, j16, message6, 1));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                    i0.g3(new y8(viVar, j15, j16, message7, 1));
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
                                        tL_messages_getMessages.f19890id.add(Integer.valueOf(i12));
                                        viVar.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                TLRPC.Message message6;
                                                TLRPC.Message message7;
                                                switch (r6) {
                                                    case 0:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                i0.g3(new y8(viVar, j15, j16, message6, 1));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                i0.g3(new y8(viVar, j15, j16, message7, 1));
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
                                    i0.g3(new y8(viVar, j15, j16, message3, 1));
                                } catch (Exception e11) {
                                    f8.g(e11, true);
                                }
                            }
                        });
                    }
                }
                getNotificationCenter().k(at.W0, Long.valueOf(j10));
            }
        }
    }

    public final qi S(long j10, long j11) {
        boolean z10;
        boolean z11;
        if (!this.N1) {
            Set<Map.Entry<String, ?>> entrySet = w0.f18945b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
            this.O1.b();
            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                qi qiVar = null;
                if (str != null) {
                    try {
                        if (str.startsWith("@")) {
                            String[] split = str.substring(1).split("\n");
                            if (split.length >= 6) {
                                qi qiVar2 = new qi();
                                qiVar2.f17776a = split[0];
                                qiVar2.f17777b = Long.parseLong(split[1]);
                                qiVar2.f17778c = Integer.parseInt(split[2]);
                                qiVar2.d = Long.parseLong(split[3]);
                                if (split[4].contains(";")) {
                                    String[] split2 = split[4].split(";");
                                    if (Integer.parseInt(split2[0]) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    qiVar2.f17780g = z11;
                                    qiVar2.h = Float.parseFloat(split2[1]);
                                    qiVar2.f17781i = Float.parseFloat(split2[2]);
                                } else {
                                    if (Integer.parseInt(split[4]) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    qiVar2.f17780g = z10;
                                    qiVar2.h = 0.0f;
                                    qiVar2.f17781i = 1.0f;
                                }
                                int length = split.length - 5;
                                String[] strArr = new String[length];
                                for (int i10 = 0; i10 < length; i10++) {
                                    strArr[i10] = split[i10 + 5];
                                }
                                String join = TextUtils.join("\n", strArr);
                                qiVar2.f17779f = new short[join.length()];
                                int i11 = 0;
                                while (true) {
                                    short[] sArr = qiVar2.f17779f;
                                    if (i11 >= sArr.length) {
                                        break;
                                    }
                                    sArr[i11] = (short) join.charAt(i11);
                                    i11++;
                                }
                                qiVar = qiVar2;
                            }
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                if (qiVar != null) {
                    this.O1.k(qiVar, Long.parseLong(key));
                }
            }
            this.N1 = true;
        }
        return (qi) this.O1.f(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)));
    }

    public final void S0(boolean z10, Integer num) {
        int i10;
        this.f18682w = true;
        if (z10) {
            getMessagesStorage().f16331a.c(new fg(this, 14));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = this.f18646f;
        }
        tL_messages_getAvailableReactions.hash = i10;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new hh(this, 3));
    }

    public final TLRPC.Document T(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList s02 = s0(4);
        int size = s02.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i10);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) this.H[4].f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public final void T1(a0.h hVar, ArrayList arrayList, boolean z10) {
        getMessagesStorage().f16331a.c(new bi.n4(this, z10, arrayList, hVar, 13));
    }

    public final void U(String[] strArr, String str, boolean z10, si siVar, boolean z11) {
        V(strArr, str, z10, siVar, z11, false, false, false, null);
    }

    public final void U0(boolean z10) {
        if (!this.F1) {
            if (!this.G1 || z10) {
                Context context = w0.f18945b;
                final SharedPreferences sharedPreferences = context.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
                Context context2 = w0.f18945b;
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
                    public final vi f17441b;

                    {
                        this.f17441b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final vi viVar = this.f17441b;
                                final SharedPreferences sharedPreferences3 = sharedPreferences;
                                final boolean[] zArr2 = zArr;
                                i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                vi viVar2 = viVar;
                                                ArrayList arrayList = viVar2.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        vi.S1(sharedPreferences3, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr3 = zArr2;
                                                zArr3[1] = true;
                                                if (zArr3[0]) {
                                                    viVar2.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                vi viVar3 = viVar;
                                                ArrayList arrayList2 = viVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        vi.S1(sharedPreferences3, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr2;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    viVar3.F1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final vi viVar2 = this.f17441b;
                                final SharedPreferences sharedPreferences4 = sharedPreferences;
                                final boolean[] zArr3 = zArr;
                                i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                vi viVar22 = viVar2;
                                                ArrayList arrayList = viVar22.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        vi.S1(sharedPreferences4, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr3;
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    viVar22.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                vi viVar3 = viVar2;
                                                ArrayList arrayList2 = viVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        vi.S1(sharedPreferences4, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr3;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    viVar3.F1 = false;
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
                    public final vi f17441b;

                    {
                        this.f17441b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final vi viVar = this.f17441b;
                                final SharedPreferences sharedPreferences3 = sharedPreferences2;
                                final boolean[] zArr2 = zArr;
                                i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                vi viVar22 = viVar;
                                                ArrayList arrayList = viVar22.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        vi.S1(sharedPreferences3, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr2;
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    viVar22.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                vi viVar3 = viVar;
                                                ArrayList arrayList2 = viVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        vi.S1(sharedPreferences3, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr2;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    viVar3.F1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final vi viVar2 = this.f17441b;
                                final SharedPreferences sharedPreferences4 = sharedPreferences2;
                                final boolean[] zArr3 = zArr;
                                i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                vi viVar22 = viVar2;
                                                ArrayList arrayList = viVar22.D1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        vi.S1(sharedPreferences4, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr3;
                                                zArr32[1] = true;
                                                if (zArr32[0]) {
                                                    viVar22.F1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                vi viVar3 = viVar2;
                                                ArrayList arrayList2 = viVar3.C1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        vi.S1(sharedPreferences4, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr3;
                                                zArr4[0] = true;
                                                if (zArr4[1]) {
                                                    viVar3.F1 = false;
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
            getMessagesStorage().f16331a.c(new bg(this, tL_messages_stickerSet, 4));
            if (!this.J0) {
                this.J0 = true;
                getMessagesStorage().f16331a.c(new fg(this, 4));
            }
        }
    }

    public final void V(final String[] strArr, final String str, final boolean z10, final si siVar, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final Integer num) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(k6.f16569i);
            getMessagesStorage().f16331a.c(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dh.run():void");
                }
            });
            return;
        }
        siVar.c(null, new ArrayList());
    }

    public final void V0(int r8, boolean r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.V0(int, boolean, boolean, boolean):void");
    }

    public final boolean V1(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        if (this.f18691z0.c(document.f19800id) != null) {
            return true;
        }
        int i10 = (document.size > wp.r1(this.currentAccount).f19186m4 ? 1 : (document.size == wp.r1(this.currentAccount).f19186m4 ? 0 : -1));
        int i11 = at.P4;
        if (i10 > 0) {
            at.e().k(i11, 4, dd.a0("TooLargeError", null, 2131744067, new Object[0]), dd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(wp.r1(e20.f15506s0).f19186m4 / 1024)));
            return false;
        }
        for (int i12 = 0; i12 < document.attributes.size(); i12++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > wp.r1(this.currentAccount).l4) {
                at.e().k(i11, 4, dd.a0("TooLongError", null, 2131744066, new Object[0]), dd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(wp.r1(e20.f15506s0).l4)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.f20005id = tL_inputDocument;
        tL_inputDocument.f19806id = document.f19800id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new v4(4, this, document));
        return true;
    }

    public final ArrayList W(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int min;
        String str;
        int i11;
        int i12;
        char c10;
        int i13;
        String str2;
        char c11;
        int i14;
        int i15;
        ArrayList arrayList = null;
        if (charSequenceArr[0] == null) {
            return null;
        }
        int i16 = -1;
        int i17 = -1;
        boolean z13 = false;
        int i18 = 0;
        while (true) {
            int i19 = 1;
            if (!z11) {
                break;
            }
            CharSequence charSequence = charSequenceArr[0];
            if (!z13) {
                str = "`";
            } else {
                str = "```";
            }
            int indexOf = TextUtils.indexOf(charSequence, str, i18);
            if (indexOf == i16) {
                break;
            } else if (i17 == i16) {
                if (charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`') {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    i19 = 3;
                }
                i17 = indexOf;
                i18 = indexOf + i19;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (z13) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
                for (int i20 = i11 + indexOf; i20 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i20) == '`'; i20++) {
                    indexOf++;
                }
                if (z13) {
                    i12 = 3;
                } else {
                    i12 = 1;
                }
                int i21 = i12 + indexOf;
                if (z13) {
                    if (i17 > 0) {
                        c10 = charSequenceArr[0].charAt(i17 - 1);
                    } else {
                        c10 = 0;
                    }
                    if (c10 != ' ' && c10 != '\n') {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    int i22 = i17 + 3;
                    int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i22);
                    String str3 = "";
                    if (indexOf2 < 0 || indexOf2 - i22 <= 0) {
                        str2 = "";
                    } else {
                        str2 = charSequenceArr[0].toString().substring(i22, indexOf2);
                    }
                    CharSequence d22 = d2(0, i17 - i13, charSequenceArr[0]);
                    int length = str2.length() + i22 + (!str2.isEmpty());
                    if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                        CharSequence d23 = d2(length, indexOf, charSequenceArr[0]);
                        int i23 = indexOf + 3;
                        if (i23 < charSequenceArr[0].length()) {
                            c11 = charSequenceArr[0].charAt(i23);
                        } else {
                            c11 = 0;
                        }
                        CharSequence charSequence2 = charSequenceArr[0];
                        if (c11 != ' ' && c11 != '\n') {
                            i14 = 0;
                        } else {
                            i14 = 1;
                        }
                        CharSequence d24 = d2(i23 + i14, charSequence2.length(), charSequence2);
                        if (d22.length() != 0) {
                            d22 = i0.C(d22, "\n");
                        } else {
                            i13 = 1;
                        }
                        if (d24.length() > 0 && d24.charAt(0) != '\n') {
                            d24 = i0.C("\n", d24);
                        }
                        if (d23.length() > 0 && d23.charAt(d23.length() - 1) == '\n') {
                            d23 = d2(0, d23.length() - 1, d23);
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        if (!TextUtils.isEmpty(d23)) {
                            if (d23.length() > 1 && d23.charAt(0) == '\n') {
                                d23 = d23.subSequence(1, d23.length());
                                indexOf--;
                            }
                            charSequenceArr[0] = i0.C(d22, d23, d24);
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            int i24 = i13 ^ 1;
                            tL_messageEntityPre.offset = i17 + i24;
                            tL_messageEntityPre.length = ((((indexOf - i17) - 3) - (str2.length() + (!str2.isEmpty()))) + i24) - i15;
                            if (!TextUtils.isEmpty(str2) && str2.trim().length() != 0) {
                                str3 = str2;
                            }
                            tL_messageEntityPre.language = str3;
                            arrayList.add(tL_messageEntityPre);
                            i21 -= 6;
                        }
                        i18 = i21;
                        z13 = false;
                        i16 = -1;
                        i17 = -1;
                    }
                    i18 = i21;
                    i16 = -1;
                } else {
                    int i25 = i17 + 1;
                    if (i25 != indexOf) {
                        CharSequence charSequence3 = charSequenceArr[0];
                        if ((charSequence3 instanceof Spanned) && ((di.i[]) ((Spanned) charSequence3).getSpans(Utilities.j(i17, charSequence3.length(), 0), Utilities.j(i25, charSequenceArr[0].length(), 0), di.i.class)).length > 0) {
                            i18 = i21;
                            i16 = -1;
                        } else {
                            CharSequence d25 = d2(0, i17, charSequenceArr[0]);
                            CharSequence d26 = d2(i25, indexOf, charSequenceArr[0]);
                            CharSequence charSequence4 = charSequenceArr[0];
                            charSequenceArr[0] = i0.C(d25, d26, d2(indexOf + 1, charSequence4.length(), charSequence4));
                            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                            tL_messageEntityCode.offset = i17;
                            tL_messageEntityCode.length = (indexOf - i17) - 1;
                            arrayList.add(tL_messageEntityCode);
                            i21 -= 2;
                        }
                    }
                    i18 = i21;
                    z13 = false;
                    i16 = -1;
                    i17 = -1;
                }
            }
        }
        if (i17 != i16 && z13) {
            CharSequence d27 = d2(0, i17, charSequenceArr[0]);
            CharSequence charSequence5 = charSequenceArr[0];
            charSequenceArr[0] = i0.C(d27, d2(i17 + 2, charSequence5.length(), charSequence5));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            TLRPC.TL_messageEntityCode tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode2.offset = i17;
            tL_messageEntityCode2.length = 1;
            arrayList.add(tL_messageEntityCode2);
        }
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence6;
            a01[] a01VarArr = (a01[]) spanned.getSpans(0, charSequence6.length(), a01.class);
            if (a01VarArr != null && a01VarArr.length > 0) {
                for (a01 a01Var : a01VarArr) {
                    int spanStart = spanned.getSpanStart(a01Var);
                    int spanEnd = spanned.getSpanEnd(a01Var);
                    if (!y(spanStart, arrayList, false) && !y(spanEnd, arrayList, true)) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i26 = 0; i26 < size; i26++) {
                                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i26);
                                int i27 = messageEntity.offset;
                                if (i27 <= spanStart || i27 + messageEntity.length > spanEnd) {
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        e(a01Var.f24261b.f33282a, spanStart, spanEnd, arrayList);
                    }
                }
            }
            i51[] i51VarArr = (i51[]) spanned.getSpans(0, charSequenceArr[0].length(), i51.class);
            if (i51VarArr != null && i51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i28 = 0; i28 < i51VarArr.length; i28++) {
                    TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                    wp messagesController = getMessagesController();
                    tL_inputMessageEntityMentionName.user_id = messagesController.p1(messagesController.Z1(Utilities.A(i51VarArr[i28].getURL())));
                    tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(i51VarArr[i28]);
                    tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(i51VarArr[i28]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                    if (charSequenceArr[0].charAt((i10 + min) - 1) == ' ') {
                        tL_inputMessageEntityMentionName.length--;
                    }
                    arrayList.add(tL_inputMessageEntityMentionName);
                }
            }
            h51[] h51VarArr = (h51[]) spanned.getSpans(0, charSequenceArr[0].length(), h51.class);
            if (h51VarArr != null && h51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i29 = 0; i29 < h51VarArr.length; i29++) {
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = spanned.getSpanStart(h51VarArr[i29]);
                    tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(h51VarArr[i29]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                    tL_messageEntityTextUrl.url = h51VarArr[i29].getURL();
                    arrayList.add(tL_messageEntityTextUrl);
                    zz0 zz0Var = h51VarArr[i29].f26682a;
                    if (zz0Var != null) {
                        int i30 = zz0Var.f33282a;
                        int i31 = tL_messageEntityTextUrl.offset;
                        e(i30, i31, tL_messageEntityTextUrl.length + i31, arrayList);
                    }
                }
            }
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.o5.class);
            if (o5VarArr != null && o5VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                    if (o5Var != null) {
                        try {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(o5Var);
                            tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(o5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                            tL_messageEntityCustomEmoji.document_id = o5Var.getDocumentId();
                            tL_messageEntityCustomEmoji.document = o5Var.document;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                }
            }
            di.i[] iVarArr = (di.i[]) spanned.getSpans(0, charSequenceArr[0].length(), di.i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (di.i iVar : iVarArr) {
                    if (iVar != null) {
                        try {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre2.offset = spanned.getSpanStart(iVar);
                            tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(iVar), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                            tL_messageEntityPre2.language = iVar.f5965a;
                            arrayList.add(tL_messageEntityPre2);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                    }
                }
            }
            xh0[] xh0VarArr = (xh0[]) spanned.getSpans(0, charSequenceArr[0].length(), xh0.class);
            if (xh0VarArr != null && xh0VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (xh0 xh0Var : xh0VarArr) {
                    if (xh0Var != null) {
                        try {
                            TLRPC.TL_messageEntityBlockquote tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                            tL_messageEntityBlockquote.offset = spanned.getSpanStart(xh0Var);
                            tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(xh0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                            tL_messageEntityBlockquote.collapsed = xh0Var.e;
                            arrayList.add(tL_messageEntityBlockquote);
                        } catch (Exception e10) {
                            f8.g(e10, true);
                        }
                    }
                }
            }
            org.telegram.ui.Components.n00[] n00VarArr = (org.telegram.ui.Components.n00[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.n00.class);
            if (n00VarArr != null && n00VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.n00 n00Var : n00VarArr) {
                    if (n00Var != null) {
                        try {
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.offset = spanned.getSpanStart(n00Var);
                            tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(n00Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = n00Var.f28627b;
                            tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                            tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                            tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                            tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                            tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                            tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                            tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                            arrayList.add(tL_messageEntityFormattedDate);
                        } catch (Exception e11) {
                            f8.g(e11, true);
                        }
                    }
                }
            }
            if (spanned instanceof Spannable) {
                Spannable spannable = (Spannable) spanned;
                i0.c(spannable, 1, false, false);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i32 = 0; i32 < uRLSpanArr.length; i32++) {
                        URLSpan uRLSpan = uRLSpanArr[i32];
                        if (!(uRLSpan instanceof h51) && !(uRLSpan instanceof i51) && !(uRLSpan instanceof org.telegram.ui.Components.n00)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i32]);
                            tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i32]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                            tL_messageEntityUrl.url = uRLSpanArr[i32].getURL();
                            arrayList.add(tL_messageEntityUrl);
                            spannable.removeSpan(uRLSpanArr[i32]);
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
            Matcher matcher = f18632e2.matcher(charSequence7);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                int i33 = 0;
                while (true) {
                    if (i33 < arrayList.size()) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i33);
                        int i34 = messageEntity2.offset;
                        if (!i0.B1(start, end, i34, messageEntity2.length + i34) || (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl))) {
                            i33++;
                        }
                    } else {
                        try {
                            z12 = WalletEngine2.isValidAddress(matcher.group());
                        } catch (Throwable th2) {
                            f8.g(th2, true);
                            z12 = false;
                        }
                        if (z12) {
                            TLRPC.TL_messageEntityTonAddress tL_messageEntityTonAddress = new TLRPC.TL_messageEntityTonAddress();
                            tL_messageEntityTonAddress.offset = start;
                            tL_messageEntityTonAddress.length = end - start;
                            arrayList.add(tL_messageEntityTonAddress);
                        }
                    }
                }
            }
        }
        if (z11) {
            charSequence7 = j1(j1(j1(charSequence7, R1, arrayList, new e9(12)), S1, arrayList, new e9(13)), T1, arrayList, new e9(14));
            if (z10) {
                charSequence7 = j1(charSequence7, U1, arrayList, new e9(15));
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(0) == '\n' || charSequence7.charAt(0) == ' ')) {
            int i35 = 1;
            charSequence7 = charSequence7.subSequence(1, charSequence7.length());
            int i36 = 0;
            while (i36 < arrayList.size()) {
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(i36);
                int i37 = messageEntity3.offset;
                if (i37 == 0) {
                    messageEntity3.length -= i35;
                }
                messageEntity3.offset = Math.max(0, i37 - 1);
                i36++;
                i35 = 1;
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(charSequence7.length() - 1) == '\n' || charSequence7.charAt(charSequence7.length() - 1) == ' ')) {
            charSequence7 = charSequence7.subSequence(0, charSequence7.length() - 1);
            for (int i38 = 0; i38 < arrayList.size(); i38++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i38);
                if (messageEntity4.offset + messageEntity4.length > charSequence7.length()) {
                    messageEntity4.length--;
                }
            }
        }
        charSequenceArr[0] = charSequence7;
        return arrayList;
    }

    public final void W0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.W0():void");
    }

    public final boolean W1() {
        boolean[] zArr = this.X0;
        if ((!zArr[0] || this.N0 != 0 || !zArr[1]) && !this.f18650g1 && !this.f18652h1) {
            return false;
        }
        return true;
    }

    public final long X() {
        long j10 = 0;
        int i10 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.f18674s0;
            if (i10 < arrayListArr[0].size()) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayListArr[0].get(i10)).set;
                if (!stickerSet.archived) {
                    j10 = p(j10, stickerSet.f19821id);
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    public final void X0(java.util.ArrayList r21, long r22, int r24, long r25, java.lang.Runnable r27, int r28, org.telegram.messenger.m00 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.X0(java.util.ArrayList, long, int, long, java.lang.Runnable, int, org.telegram.messenger.m00):void");
    }

    public final void X1(java.lang.String r37, final long r38, final long r40, final int r42, final int r43, final long r44, boolean r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final boolean r49, final sg.o0 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.X1(java.lang.String, long, long, int, int, long, boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, sg.o0):void");
    }

    public final TLRPC.TL_messages_stickerSet Y(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.I.f(stickerSet.f19821id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.M.f(stickerSet.f19821id);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.Y0():void");
    }

    public final void Y1(boolean z10, String str, r20 r20Var) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z10) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.f19906q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.f19908q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new a3.b(1), new t9(r20Var, 1));
    }

    public final void Z0(boolean z10) {
        if (!this.H1) {
            if (!this.I1 || z10) {
                Context context = w0.f18945b;
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

    public final ti Z1(boolean z10, String str, String str2, r20 r20Var, boolean z11) {
        ti tiVar = new ti(str, str2, z10);
        ui uiVar = (ui) this.Q1.get(tiVar);
        if (uiVar == null || (uiVar.f18434b != null && z11)) {
            HashMap hashMap = this.P1;
            if (!hashMap.containsKey(tiVar)) {
                hashMap.put(tiVar, 0);
                b0(this.currentAccount).U(new String[]{str}, str2, true, new mh(this, tiVar, uiVar, r20Var), false);
                return tiVar;
            }
        }
        if (uiVar != null) {
            r20Var.a(uiVar.f18433a);
            return tiVar;
        }
        r20Var.a(new ArrayList());
        return tiVar;
    }

    public final void a1(int i10, boolean z10, boolean z11) {
        b1(i10, z10, z11, false, null);
    }

    public final void a2(String str) {
        wp.r1(this.currentAccount).f19138g7.edit().putString("reaction_on_double_tap", str).apply();
        this.f18673s = str;
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        long j10 = tL_messages_stickerSet.set.f19821id;
        a0.h hVar = this.I;
        if (hVar.h(j10) < 0) {
            String str = tL_messages_stickerSet.set.short_name;
            ConcurrentHashMap concurrentHashMap = this.N;
            if (!concurrentHashMap.containsKey(str)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet.masks) {
                    i10 = 1;
                } else if (stickerSet.emojis) {
                    i10 = 5;
                } else {
                    i10 = 0;
                }
                ArrayList[] arrayListArr = this.G;
                arrayListArr[i10].add(0, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f19821id);
                this.J.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f19821id);
                concurrentHashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                a0.h hVar2 = new a0.h();
                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                    hVar2.k(document, document.f19800id);
                }
                for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
                    TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i12);
                    String replace = tL_stickerPack.emoticon.replace("️", "");
                    tL_stickerPack.emoticon = replace;
                    ArrayList arrayList = (ArrayList) this.f18642d0.get(replace);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f18642d0.put(tL_stickerPack.emoticon, arrayList);
                    }
                    for (int i13 = 0; i13 < tL_stickerPack.documents.size(); i13++) {
                        Long l4 = tL_stickerPack.documents.get(i13);
                        if (this.f18640c0.h(l4.longValue()) < 0) {
                            this.f18640c0.k(tL_stickerPack.emoticon, l4.longValue());
                        }
                        TLRPC.Document document2 = (TLRPC.Document) hVar2.f(l4.longValue());
                        if (document2 != null) {
                            arrayList.add(document2);
                        }
                    }
                }
                this.X[i10] = q(arrayListArr[i10]);
                getNotificationCenter().k(at.f14814x0, Integer.valueOf(i10), Boolean.TRUE);
                a1(i10, false, true);
            }
        }
    }

    public final void b1(int i10, boolean z10, boolean z11, boolean z12, r20 r20Var) {
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        boolean[] zArr = this.V;
        if (zArr[i10]) {
            if (z12) {
                this.U[i10] = new ob(this, i10, z11, r20Var);
                return;
            } else if (r20Var != null) {
                r20Var.a(null);
                return;
            } else {
                return;
            }
        }
        char c10 = 1;
        ArrayList[] arrayListArr = this.f18674s0;
        if (i10 == 3) {
            if (arrayListArr[0].isEmpty() || !getMessagesController().f19305z3) {
                if (r20Var != null) {
                    r20Var.a(null);
                    return;
                }
                return;
            }
        } else if (i10 == 6) {
            if (arrayListArr[1].isEmpty() || !getMessagesController().f19305z3) {
                if (r20Var != null) {
                    r20Var.a(null);
                    return;
                }
                return;
            }
        } else if (i10 != 4) {
            C0(i10, z10);
        }
        zArr[i10] = true;
        if (z10) {
            getMessagesStorage().f16331a.c(new o7(this, i10, r20Var, 6));
        } else if (i10 != 3 && i10 != 6) {
            if (i10 == 4) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new go(this, i10, r20Var, 3));
                return;
            }
            long[] jArr = this.X;
            long j10 = 0;
            if (i10 == 0) {
                TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
                if (!z11) {
                    j10 = jArr[i10];
                }
                tL_messages_getAllStickers.hash = j10;
                tL_messages_getMaskStickers = tL_messages_getAllStickers;
            } else if (i10 == 5) {
                TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
                if (!z11) {
                    j10 = jArr[i10];
                }
                tL_messages_getEmojiStickers.hash = j10;
                tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
            } else {
                TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
                if (!z11) {
                    j10 = jArr[i10];
                }
                tL_messages_getMaskStickers2.hash = j10;
                tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
            }
            getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new k3(i10, 1, j10, this, r20Var));
        } else {
            if (i10 != 6) {
                c10 = 0;
            }
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.f18666p0[c10];
            int size = arrayListArr[c10].size();
            for (int i11 = 0; i11 < size; i11++) {
                tL_messages_allStickers.sets.add(((TLRPC.StickerSetCovered) arrayListArr[c10].get(i11)).set);
            }
            r1(i10, tL_messages_allStickers, new qf(r20Var, 3));
        }
    }

    public final void b2(long j10, long j11, float f7, float f10) {
        qi S = S(j10, j11);
        if (S != null) {
            if (Math.abs(S.h - f7) >= 0.001f || Math.abs(S.f17781i - f10) >= 0.001f) {
                S.h = f7;
                S.f17781i = f10;
                Context context = w0.f18945b;
                SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
                edit.putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", S.toString()).apply();
            }
        }
    }

    public final void c(TLRPC.Document document, int i10, boolean z10) {
        if (document == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 < this.f18653i0.size()) {
                TLRPC.Document document2 = (TLRPC.Document) this.f18653i0.get(i11);
                if (document2.f19800id == document.f19800id) {
                    this.f18653i0.remove(i11);
                    this.f18653i0.add(0, document2);
                    break;
                }
                i11++;
            } else {
                this.f18653i0.add(0, document);
                break;
            }
        }
        if ((this.f18653i0.size() > getMessagesController().G4 && !e20.i(this.currentAccount).q()) || this.f18653i0.size() > getMessagesController().H4) {
            getMessagesStorage().f16331a.c(new mf(this, (TLRPC.Document) i0.a.v(1, this.f18653i0), 0));
            if (z10) {
                i0.g3(new a(document, 20));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
        y1(0, arrayList, true, i10, false);
    }

    public final int c0() {
        int i10 = 1;
        if (this.f18645e1 >= this.Y0.size() - 1) {
            boolean[] zArr = this.X0;
            if (zArr[0] && zArr[1]) {
                i10 = 0;
            }
        }
        if (this.f18645e1 > 0) {
            return i10 | 2;
        }
        return i10;
    }

    public final void c1(String str, boolean z10, boolean z11) {
        HashSet hashSet = this.S;
        if (!hashSet.contains(str)) {
            if (!z10 || this.Q.get(str) == null) {
                hashSet.add(str);
                if (z11) {
                    getMessagesStorage().f16331a.c(new kg(this, str, z10, 1));
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                if (Objects.equals(getUserConfig().f15511b0, str)) {
                    tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
                } else if (z10) {
                    TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                    tL_inputStickerSetDice.emoticon = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
                } else {
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                }
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new q3(this, str, z10, 1));
            }
        }
    }

    public final void c2(org.telegram.ui.Components.g9 g9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        b0(this.currentAccount).l0(tL_inputStickerSetShortName, 0, false, false, new g3(str2, g9Var, str3, 3));
    }

    public final void d(int i10, Object obj, TLRPC.Document document, int i11, boolean z10) {
        ArrayList[] arrayListArr;
        int i12;
        TLRPC.Document document2;
        boolean z11;
        int i13;
        if (i10 != 3) {
            if (kj.u4(document) || kj.K2(document, true)) {
                int i14 = 0;
                while (true) {
                    arrayListArr = this.f18647f0;
                    if (i14 < arrayListArr[i10].size()) {
                        TLRPC.Document document3 = (TLRPC.Document) arrayListArr[i10].get(i14);
                        if (document3.f19800id == document.f19800id) {
                            arrayListArr[i10].remove(i14);
                            if (!z10) {
                                arrayListArr[i10].add(0, document3);
                            }
                        } else {
                            i14++;
                        }
                    } else if (!z10) {
                        arrayListArr[i10].add(0, document);
                    }
                }
                int i15 = at.P4;
                if (i10 == 2) {
                    if (z10) {
                        at.e().k(i15, 0, document, 4);
                    } else {
                        if (arrayListArr[i10].size() > getMessagesController().f19117e3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        at e = at.e();
                        if (z11) {
                            i13 = 6;
                        } else {
                            i13 = 5;
                        }
                        e.k(i15, 0, document, Integer.valueOf(i13));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.f19880id = tL_inputDocument;
                    tL_inputDocument.f19806id = document.f19800id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z10;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new di(this, obj, tL_messages_faveSticker, 0));
                    i12 = getMessagesController().f19117e3;
                } else {
                    if (i10 == 0 && z10) {
                        at.e().k(i15, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.f19904id = tL_inputDocument2;
                        tL_inputDocument2.f19806id = document.f19800id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new di(this, obj, tL_messages_saveRecentSticker, 1));
                    }
                    i12 = getMessagesController().f19108d3;
                }
                if (arrayListArr[i10].size() > i12 || z10) {
                    if (z10) {
                        document2 = document;
                    } else {
                        document2 = (TLRPC.Document) i0.a.v(1, arrayListArr[i10]);
                    }
                    getMessagesStorage().f16331a.c(new o7(this, i10, document2, 10));
                }
                if (!z10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(document);
                    y1(i10, arrayList, false, i11, false);
                }
                if (i10 == 2 || (i10 == 0 && z10)) {
                    getNotificationCenter().k(at.X0, Boolean.FALSE, Integer.valueOf(i10));
                }
            }
        }
    }

    public final void d0(final int i10, final int i11, final long j10, final long j11, boolean z10) {
        if (!z10 && !o5.C(j10)) {
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            if (i10 == 0) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
            } else if (i10 == 1) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
            } else if (i10 == 2) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
            } else if (i10 == 3) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
            } else if (i10 == 4) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
            } else if (i10 == 5) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
            } else if (i10 == 8) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
            }
            if (j11 != 0) {
                if (j10 == getUserConfig().e()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().i1(j11);
                    tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j11;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            tL_messages_getSearchCounters.peer = getMessagesController().i1(j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    if (tLObject instanceof Vector) {
                        Vector vector = (Vector) tLObject;
                        if (!vector.objects.isEmpty()) {
                            i0.g3(new ni(vi.this, j10, false, ((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, i10, 0, j11, i11));
                        }
                    }
                }
            }), i11);
            return;
        }
        getMessagesStorage().f16331a.c(new mg(this, j11, j10, i10, i11, 0));
    }

    public final void d1(boolean z10, boolean z11) {
        int i10;
        ArrayList[] arrayListArr = this.f18678u0;
        if (!arrayListArr[z10 ? 1 : 0].isEmpty()) {
            arrayListArr[z10 ? 1 : 0].clear();
            ArrayList[] arrayListArr2 = this.f18674s0;
            long o10 = o(arrayListArr2[z10 ? 1 : 0], z10);
            long[] jArr = this.f18666p0;
            jArr[z10 ? 1 : 0] = o10;
            at notificationCenter = getNotificationCenter();
            if (z10) {
                i10 = at.A0;
            } else {
                i10 = at.f14827z0;
            }
            notificationCenter.k(i10, new Object[0]);
            G1(z10, arrayListArr2[z10 ? 1 : 0], arrayListArr[z10 ? 1 : 0], this.f18668q0[z10 ? 1 : 0], jArr[z10 ? 1 : 0], this.f18671r0);
            if (z11) {
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new ag.c3(6));
            }
        }
    }

    public final void e0(long j10, int i10, long j11) {
        getMessagesStorage().f16331a.c(new mb(this, j11, j10, i10, 1));
    }

    public final void e1(long j10) {
        if (this.f18678u0[0].contains(Long.valueOf(j10))) {
            ArrayList[] arrayListArr = this.f18680v0;
            if (!arrayListArr[0].contains(Long.valueOf(j10))) {
                arrayListArr[0].add(Long.valueOf(j10));
                TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
                tL_messages_readFeaturedStickers.f19898id.add(Long.valueOf(j10));
                getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new ag.c3(6));
                i0.h3(new yg(this, j10, 3), 1000L);
            }
        }
    }

    public final void e2(long j10, long j11, boolean z10) {
        qi S = S(j10, j11);
        if (S != null && S.f17780g != z10) {
            S.f17780g = z10;
            Context context = w0.f18945b;
            SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
            edit.putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", S.toString()).apply();
        }
    }

    public final void f1(long j10, boolean z10) {
        this.L.remove(Long.valueOf(j10));
        ArrayList arrayList = this.K;
        if (z10 && !arrayList.contains(Long.valueOf(j10))) {
            arrayList.add(Long.valueOf(j10));
        }
        if (!z10) {
            arrayList.remove(Long.valueOf(j10));
        }
    }

    public final void f2(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11) {
        g2(context, tLObject, null, i10, k2Var, null, z10, z11, null, true);
    }

    public final Integer g0(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        int i10;
        double d;
        int i11;
        double d10;
        c5.m mVar;
        c5.l lVar;
        c5.l lVar2;
        double d11;
        int i12;
        c5.m mVar2;
        c5.l lVar3;
        if ((z10 && (!u1.i().k() || u1.i().e == null)) || (tL_help_premiumPromo = this.D) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i13 = 0;
        double d12 = 0.0d;
        boolean z11 = false;
        int i14 = 0;
        while (i14 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i14);
            i14++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (z10) {
                if (tL_premiumSubscriptionOption2.current) {
                    lVar2 = null;
                    if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), u1.i().e)) {
                        if (v2.b() && (mVar2 = u1.f18338l) != null) {
                            ArrayList arrayList3 = mVar2.h;
                            int size2 = arrayList3.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj = arrayList3.get(i15);
                                    i15++;
                                    lVar3 = (c5.l) obj;
                                    String str = ((c5.j) lVar3.f3798b.f3796a.get(0)).d;
                                    int i16 = tL_premiumSubscriptionOption2.months;
                                    if (i16 == 12) {
                                        if (str.equals("P1Y")) {
                                            break;
                                        }
                                    } else {
                                        Locale locale = Locale.ROOT;
                                        if (str.equals("P" + i16 + "M")) {
                                            break;
                                        }
                                    }
                                } else {
                                    lVar3 = lVar2;
                                    break;
                                }
                            }
                            if (lVar3 == null) {
                                d11 = tL_premiumSubscriptionOption2.amount;
                                i12 = tL_premiumSubscriptionOption2.months;
                            } else {
                                d11 = ((c5.j) lVar3.f3798b.f3796a.get(0)).f3794b;
                                i12 = tL_premiumSubscriptionOption2.months;
                            }
                        } else {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i12 = tL_premiumSubscriptionOption2.months;
                        }
                        d12 = d11 / i12;
                        z11 = true;
                    }
                }
            } else {
                lVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (v2.b()) {
                    }
                    d11 = tL_premiumSubscriptionOption2.amount;
                    i12 = tL_premiumSubscriptionOption2.months;
                    d12 = d11 / i12;
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.D.period_options;
        int size3 = arrayList4.size();
        int i17 = 0;
        int i18 = 0;
        while (i18 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i18);
            i18++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (!v2.b() && (mVar = u1.f18338l) != null) {
                    ArrayList arrayList5 = mVar.h;
                    int size4 = arrayList5.size();
                    int i19 = i13;
                    while (true) {
                        if (i19 < size4) {
                            Object obj2 = arrayList5.get(i19);
                            i19++;
                            lVar = (c5.l) obj2;
                            String str2 = ((c5.j) lVar.f3798b.f3796a.get(i13)).d;
                            int i20 = tL_premiumSubscriptionOption4.months;
                            arrayList = arrayList4;
                            if (i20 == 12) {
                                if (str2.equals("P1Y")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                                i13 = 0;
                            } else {
                                Locale locale2 = Locale.ROOT;
                                if (str2.equals("P" + i20 + "M")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                                i13 = 0;
                            }
                        } else {
                            arrayList = arrayList4;
                            lVar = null;
                            break;
                        }
                    }
                    if (lVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i10 = 0;
                        i17 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                    } else {
                        i10 = 0;
                        d = ((c5.j) lVar.f3798b.f3796a.get(0)).f3794b;
                        i11 = tL_premiumSubscriptionOption4.months;
                    }
                } else {
                    arrayList = arrayList4;
                    i10 = i13;
                    d = tL_premiumSubscriptionOption4.amount;
                    i11 = tL_premiumSubscriptionOption4.months;
                }
                d10 = d / i11;
                i17 = (int) ((1.0d - (d10 / d12)) * 100.0d);
            } else {
                arrayList = arrayList4;
                i10 = i13;
            }
            i13 = i10;
            arrayList4 = arrayList;
        }
        if (!z11 || i17 <= 0) {
            return null;
        }
        return Integer.valueOf(i17);
    }

    public final void g1(long j10, boolean z10) {
        this.K.remove(Long.valueOf(j10));
        ArrayList arrayList = this.L;
        if (z10 && !arrayList.contains(Long.valueOf(j10))) {
            arrayList.add(Long.valueOf(j10));
        }
        if (!z10) {
            arrayList.remove(Long.valueOf(j10));
        }
    }

    public final void g2(final android.content.Context r22, final org.telegram.tgnet.TLObject r23, final org.telegram.tgnet.TLRPC.Document r24, final int r25, final org.telegram.ui.ActionBar.k2 r26, final android.widget.FrameLayout r27, final boolean r28, boolean r29, java.lang.Runnable r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.g2(android.content.Context, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document, int, org.telegram.ui.ActionBar.k2, android.widget.FrameLayout, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    public final TLRPC.TL_help_premiumPromo h0() {
        return this.D;
    }

    public final void h1(long j10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            i10 = 5;
        } else if (z11) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList s02 = s0(i10);
        if (s02 != null) {
            for (int i11 = 0; i11 < s02.size(); i11++) {
                if (((TLRPC.TL_messages_stickerSet) s02.get(i11)).set.f19821id == j10) {
                    s02.remove(i11);
                    s02.add(0, (TLRPC.TL_messages_stickerSet) s02.get(i11));
                    getNotificationCenter().k(at.f14814x0, Integer.valueOf(i10), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final void h2(final Context context, int i10, final org.telegram.ui.ActionBar.k2 k2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i11, final boolean z11) {
        boolean z12;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j10 = stickerSet.f19821id;
        tL_inputStickerSetID.f19814id = j10;
        if (i10 != 0) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            if (i10 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            tL_messages_installStickerSet.archived = z12;
            f1(stickerSet.f19821id, true);
            getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final vi viVar = vi.this;
                    final TLRPC.StickerSet stickerSet2 = stickerSet;
                    final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    final boolean z13 = z10;
                    final int i12 = i11;
                    final boolean z14 = z11;
                    final FrameLayout frameLayout2 = frameLayout;
                    final Context context2 = context;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.Document document2 = document;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            vi viVar2 = vi.this;
                            a0.h hVar = viVar2.T;
                            TLRPC.StickerSet stickerSet3 = stickerSet2;
                            hVar.l(stickerSet3.f19821id);
                            TLObject tLObject4 = tLObject2;
                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive;
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                            int i13 = i12;
                            if (z15) {
                                viVar2.A1(k2Var3, z13, i13, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                            }
                            viVar2.b1(i13, false, false, true, new gh(viVar2, stickerSet3, 0));
                            if (tL_error == null && z14) {
                                FrameLayout frameLayout3 = frameLayout2;
                                Context context3 = context2;
                                TLObject tLObject5 = tLObject3;
                                TLRPC.Document document3 = document2;
                                if (frameLayout3 != null) {
                                    org.telegram.ui.Components.wb.f(frameLayout3, new gw0(context3, tLObject5, 1, 2, document3, k2Var3.getResourceProvider()), 1500).j();
                                } else if (k2Var3 != null) {
                                    org.telegram.ui.Components.wb.g(k2Var3, new gw0(context3, tLObject5, 1, 2, document3, k2Var3.getResourceProvider()), 1500).j();
                                }
                            }
                        }
                    });
                }
            });
            return;
        }
        g1(j10, true);
        TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
        tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
        getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new go(this, stickerSet, i11));
    }

    public final ArrayList i0(int i10, boolean z10) {
        ArrayList[] arrayListArr = this.f18647f0;
        ArrayList arrayList = arrayListArr[i10];
        if (i10 == 7) {
            return new ArrayList(arrayListArr[i10]);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z10 && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public final void i1(String str, TLRPC.Document document, boolean z10) {
        this.Z.remove(str);
        of.c cVar = this.f18691z0;
        ArrayList arrayList = cVar.e;
        boolean z11 = true;
        if (z10) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((of.b) arrayList.get(i10)).d && str.equals(((of.b) arrayList.get(i10)).f14155b)) {
                        arrayList.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    z11 = false;
                    break;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((of.b) arrayList.get(i11)).d && str.equals(((of.b) arrayList.get(i11)).f14155b)) {
                        ((of.b) arrayList.get(i11)).d = false;
                        ((of.b) arrayList.get(i11)).f14154a = document;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                cVar.h();
            }
        }
        if (z11) {
            at.f(cVar.f14161c).k(at.f14703e5, new Object[0]);
        }
    }

    public final void i2(int r8, long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.i2(int, long):void");
    }

    public final boolean j(long j10) {
        for (int i10 = 0; i10 < this.f18636b.bots.size(); i10++) {
            if (this.f18636b.bots.get(i10).bot_id == j10) {
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

    public final void j2(long j10, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.f18681v1.get(tL_updateBotCommands.bot_id + "_" + j10);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().k(at.D0, botInfo, 0);
        }
        getMessagesStorage().f16331a.c(new d4(this, tL_updateBotCommands, j10, 13));
    }

    public final ArrayList k(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z10, boolean z11) {
        boolean z12;
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
            hVar.k(user, user.f19943id);
        }
        a0.h hVar2 = new a0.h();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i11);
            hVar2.k(chat, chat.f19794id);
        }
        ArrayList arrayList4 = new ArrayList();
        if (z11) {
            i0.g3(new bi.n4(this, arrayList2, z10, arrayList3, 12));
            int size = arrayList.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i13);
                if ((kj.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (kj.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                    i12++;
                }
                a0.h hVar3 = hVar2;
                int i14 = i12;
                int i15 = this.currentAccount;
                if (i14 < 30) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                arrayList4.add(new kj(i15, message, hVar, hVar3, false, z12));
                i13++;
                hVar2 = hVar3;
                i12 = i14;
            }
            return arrayList4;
        }
        i0.g3(new zg(this, arrayList2, z10, arrayList3, arrayList, arrayList4, hVar, hVar2));
        return null;
    }

    public final void k1() {
        ArrayList arrayList = this.h;
        if (arrayList != null && !this.f18688y && tc.e(8200) && this.currentAccount == e20.f15506s0) {
            this.f18688y = true;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int min = Math.min(arrayList2.size(), 10);
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList2.get(i10);
                l1(jc.b(tL_availableReaction.activate_animation), 0);
                l1(jc.b(tL_availableReaction.appear_animation), 0);
            }
            for (int i11 = 0; i11 < min; i11++) {
                l1(jc.b(((TLRPC.TL_availableReaction) arrayList2.get(i11)).effect_animation), 0);
            }
        }
    }

    public final void k2() {
        kj kjVar;
        ArrayList arrayList = this.Y0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.Z0;
            kj kjVar2 = null;
            if (i10 >= arrayList3.size()) {
                break;
            }
            kj kjVar3 = (kj) arrayList3.get(i10);
            if ((!kjVar3.z2() || kjVar3.N2) && !hashSet.contains(Integer.valueOf(kjVar3.f1()))) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else if (((kj) arrayList2.get(i11)).f1() == kjVar3.f1()) {
                        kjVar2 = (kj) arrayList2.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (kjVar2 != null) {
                    kjVar3.N(kjVar2);
                    kjVar3.f16740x0 = kjVar2.f16740x0;
                    kjVar3.f16736w0 = kjVar2.f16736w0;
                }
                kjVar3.f16699m2 = true;
                arrayList.add(kjVar3);
                hashSet.add(Integer.valueOf(kjVar3.f1()));
            }
            i10++;
        }
        for (int i12 = 0; i12 < this.f18635a1.size(); i12++) {
            kj kjVar4 = (kj) this.f18635a1.get(i12);
            if (!hashSet.contains(Integer.valueOf(kjVar4.f1()))) {
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList2.size()) {
                        if (((kj) arrayList2.get(i13)).f1() == kjVar4.f1()) {
                            kjVar = (kj) arrayList2.get(i13);
                            break;
                        }
                        i13++;
                    } else {
                        kjVar = null;
                        break;
                    }
                }
                if (kjVar != null) {
                    kjVar4.N(kjVar);
                    kjVar4.f16740x0 = kjVar.f16740x0;
                    kjVar4.f16736w0 = kjVar.f16736w0;
                }
                kjVar4.f16699m2 = true;
                arrayList.add(kjVar4);
                hashSet.add(Integer.valueOf(kjVar4.f1()));
            }
        }
    }

    public final void l(ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3, long j10, boolean z10) {
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
            hVar2.k(user, user.f19943id);
        }
        a0.h hVar3 = new a0.h();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i11);
            hVar3.k(chat, chat.f19794id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList4.add(new kj(this.currentAccount, (TLRPC.Message) arrayList.get(i12), hVar2, hVar3, false, false));
        }
        i0.g3(new ch(this, arrayList2, z10, arrayList3, arrayList4, hVar, j10));
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_stickerSet l0(final org.telegram.tgnet.TLRPC.InputStickerSet r11, final java.lang.Integer r12, final boolean r13, boolean r14, final org.telegram.messenger.r20 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.l0(org.telegram.tgnet.TLRPC$InputStickerSet, java.lang.Integer, boolean, boolean, org.telegram.messenger.r20):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    public final void l1(jc jcVar, int i10) {
        getFileLoader().W(jcVar, null, null, i10, 11);
    }

    public final void l2(String str) {
        HashMap hashMap = this.Z;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new of.d(str, this.currentAccount));
        of.c cVar = this.f18691z0;
        cVar.getClass();
        ?? obj = new Object();
        obj.f14155b = str;
        int i10 = cVar.d;
        cVar.d = i10 + 1;
        obj.f14156c = i10;
        obj.d = true;
        cVar.e.add(obj);
    }

    public final void m() {
        int g10 = g0.f.g(w0.f18945b) - 2;
        if (g10 <= 0) {
            g10 = 5;
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        if (uz.f18549s.length() <= 0) {
            for (int i10 = 0; i10 < this.f18654i1.size(); i10++) {
                arrayList.add((TLRPC.TL_topPeer) this.f18654i1.get(i10));
                if (arrayList.size() == g10 - 2) {
                    break;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        }
        Utilities.e.c(new xf(this, z10, arrayList, 0));
    }

    public final TLRPC.TL_messages_stickerSet m0(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        return l0(inputStickerSet, null, z10, false, null);
    }

    public final void m2(TLRPC.Message message) {
        n2(message, false);
    }

    public final TLRPC.TL_messages_stickerSet n0(String str) {
        return (TLRPC.TL_messages_stickerSet) this.Q.get(str);
    }

    public final void n1() {
        ArrayList[] arrayListArr = this.f18647f0;
        if (arrayListArr[3].isEmpty()) {
            return;
        }
        ArrayList arrayList = arrayListArr[3];
        this.f18689y0 = (TLRPC.Document) arrayList.get(Utilities.f14520b.nextInt(arrayList.size()));
        getFileLoader().W(jc.b(this.f18689y0), this.f18689y0, null, 0, 1);
    }

    public final void n2(TLRPC.Message message, boolean z10) {
        if (message != null) {
            TLRPC.Document G0 = kj.G0(message);
            String str = null;
            if (G0 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= G0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = G0.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                        if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            str = inputStickerSet.short_name;
                        }
                    } else {
                        i10++;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.N.get(str);
                if (tL_messages_stickerSet != null) {
                    int size = tL_messages_stickerSet.documents.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document.f19800id == G0.f19800id && document.dc_id == G0.dc_id) {
                            message.stickerVerified = 1;
                            return;
                        }
                    }
                } else if (z10) {
                    i0.g3(new lg((f1) this, (TLObject) message, str, 4));
                } else {
                    o2(message, str);
                }
            }
        }
    }

    public final long o(ArrayList arrayList, boolean z10) {
        long j10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayList.get(i10)).set;
                if (!stickerSet.archived) {
                    j10 = p(j10, stickerSet.f19821id);
                    if (this.f18678u0[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.f19821id))) {
                        j10 = p(j10, 1L);
                    }
                }
            }
        }
        return j10;
    }

    public final TLRPC.TL_messages_stickerSet o0(long j10) {
        return (TLRPC.TL_messages_stickerSet) this.I.f(j10);
    }

    public final void o1() {
        int i10;
        boolean z10 = this.C0;
        ArrayList arrayList = this.B0;
        if (!z10 && arrayList.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = k6.c("⭐") + k6.c("⭐");
            tL_messages_getStickers.hash = 0L;
            this.C0 = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new hh(this, 2));
            return;
        }
        for (int i11 = 0; i11 < Math.min(arrayList.size(), 3); i11++) {
            if (i11 == 2) {
                i10 = arrayList.size() - 1;
            } else {
                i10 = i11;
            }
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (kj.X3(document)) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.f14425z1 = false;
                imageReceiver.q0(jc.b(document), null, null, "webp", null, 1);
                ic.D().M(imageReceiver, null);
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.f14425z1 = false;
                imageReceiver2.t0(jc.d(kj.G1(document), document), null, null, null, "tgs", null, 1);
                ic.D().M(imageReceiver2, null);
            }
        }
    }

    public final void o2(TLRPC.Message message, String str) {
        HashMap hashMap = this.f18634a0;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = kj.k1(message);
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
        TLRPC.PhotoSize w9;
        String str;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && (w9 = b8.w(stickerSet.thumbs, 90, false, null, false)) != null) {
            TLRPC.Document document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                } else {
                    return;
                }
            }
            jc k10 = jc.k(w9, document, stickerSetCovered.set.thumb_version);
            if (k10 != null) {
                if (k10.f16444p == 1) {
                    str = "tgs";
                } else {
                    str = "webp";
                }
                getFileLoader().W(k10, stickerSetCovered, str, 3, 1);
            }
        }
    }

    public final void q1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w9;
        ArrayList<TLRPC.Document> arrayList;
        jc k10;
        String str;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && (w9 = b8.w(stickerSet.thumbs, 90, false, null, false)) != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty() && (k10 = jc.k(w9, arrayList.get(0), tL_messages_stickerSet.set.thumb_version)) != null) {
            if (k10.f16444p == 1) {
                str = "tgs";
            } else {
                str = "webp";
            }
            getFileLoader().W(k10, tL_messages_stickerSet, str, 3, 1);
        }
    }

    public final String r0(long j10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.I.f(j10);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        a0.h[] hVarArr = this.f18676t0;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) hVarArr[0].f(j10);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) hVarArr[1].f(j10);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public final void r1(final int i10, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2 = tL_messages_allStickers;
        final ArrayList arrayList = new ArrayList();
        if (tL_messages_allStickers2.sets.isEmpty()) {
            z1(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, runnable);
            return;
        }
        final a0.h hVar = new a0.h();
        final int i11 = 0;
        while (i11 < tL_messages_allStickers2.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers2.sets.get(i11);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.I.f(stickerSet.f19821id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar.k(tL_messages_stickerSet, stickerSet2.f19821id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar.m() == tL_messages_allStickers2.sets.size()) {
                        z1(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, null);
                    }
                    i11++;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.f19814id = stickerSet.f19821id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    i0.g3(new cg(vi.this, tLObject, arrayList, i11, hVar, stickerSet, tL_messages_allStickers2, i10));
                }
            });
            i11++;
            tL_messages_allStickers2 = tL_messages_allStickers;
        }
        runnable.run();
    }

    public final boolean s() {
        if (this.W[0] && this.G[0].size() < 5 && this.f18647f0[2].isEmpty()) {
            return false;
        }
        return true;
    }

    public final ArrayList s0(int i10) {
        ArrayList[] arrayListArr = this.G;
        if (i10 == 3) {
            return arrayListArr[2];
        }
        return arrayListArr[i10];
    }

    public final void s1(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i10) {
        i0.g3(new kh(this, str, 4));
        Utilities.d.c(new sh(this, z11, tL_messages_stickerSet, i10, str, z10));
    }

    public final void t1(final boolean z10, final ArrayList arrayList, final ArrayList arrayList2, final boolean z11, final boolean z12, final int i10, final long j10) {
        i0.g3(new qh(this, z10, 0));
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rh.run():void");
            }
        });
    }

    public final void u(boolean z10) {
        if (z10) {
            this.f18685x = 0;
            int[] iArr = this.f18668q0;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        V0(2, false, true, false);
        V0(3, false, true, false);
        V0(7, false, false, true);
        x();
        w();
        A();
        if (!this.f18639c && (!this.d || Math.abs((System.currentTimeMillis() / 1000) - this.e) >= 3600)) {
            E0(true, false, null);
        }
        if (!this.E && (this.D == null || Math.abs((System.currentTimeMillis() / 1000) - this.F) >= 3600)) {
            R0(true);
        }
        z();
        C();
        if (getUserConfig().f15514d0 != null) {
            String str = getUserConfig().f15514d0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.f18662n0 && System.currentTimeMillis() - getUserConfig().f15519h0 >= 86400000) {
            this.f18662n0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new hh(this, 8));
        }
        getMessagesController().E0();
    }

    public final void u0(long j10) {
        v0(j10, true);
    }

    public final void u1(final TLRPC.messages_Messages messages_messages, final long j10, int i10, int i11, final int i12, final int i13, long j11, final int i14, final int i15, final boolean z10, final int i16) {
        long j12;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        ArrayList<TLRPC.Message> arrayList;
        int i21;
        ArrayList<TLRPC.Message> arrayList2;
        if (v2.f18578a) {
            if (messages_messages != null && (arrayList2 = messages_messages.messages) != null) {
                i21 = arrayList2.size();
            } else {
                i21 = 0;
            }
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(i21);
            sb2.append(" did ");
            j12 = j10;
            sb2.append(j12);
            sb2.append(" topicId ");
            sb2.append(j11);
            sb2.append(" count = ");
            i17 = i10;
            i18 = i11;
            i0.a.t(sb2, i17, " max_id=", i18, " min_id=");
            i19 = i13;
            i0.a.t(sb2, i12, " type = ", i19, " cache = ");
            i20 = i15;
            i0.a.t(sb2, i14, " classGuid = ", i20, " topReached=");
            z11 = z10;
            sb2.append(z11);
            f8.b(sb2.toString());
        } else {
            j12 = j10;
            i17 = i10;
            i18 = i11;
            i19 = i13;
            i20 = i15;
            z11 = z10;
        }
        if (i14 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i12 == 0) || (messages_messages.messages.size() <= 1 && i12 != 0)) && !o5.C(j12))) {
            if (i14 == 2) {
                return;
            }
            N0(j10, i17, i18, i12, i19, j11, 0, i20, i16, null, null);
            return;
        }
        if (i14 == 0) {
            ic.X(messages_messages.messages);
            getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
            getMessagesStorage().f16331a.c(new tg(this, i12, messages_messages.messages, z11, j10, i11, i13, j11));
        }
        Utilities.f14523g.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.messages_Messages messages_messages2;
                vi viVar;
                a0.h hVar = new a0.h();
                int i22 = 0;
                while (true) {
                    messages_messages2 = messages_messages;
                    if (i22 >= messages_messages2.users.size()) {
                        break;
                    }
                    TLRPC.User user = messages_messages2.users.get(i22);
                    hVar.k(user, user.f19943id);
                    i22++;
                }
                ArrayList arrayList3 = new ArrayList();
                int i23 = 0;
                while (true) {
                    int size = messages_messages2.messages.size();
                    viVar = vi.this;
                    if (i23 >= size) {
                        break;
                    }
                    kj kjVar = new kj(viVar.currentAccount, messages_messages2.messages.get(i23), hVar, (a0.h) null, true, false);
                    kjVar.Q();
                    arrayList3.add(kjVar);
                    i23++;
                }
                viVar.getFileLoader().l(arrayList3);
                int i24 = i14;
                long j13 = j10;
                of ofVar = new of(viVar, messages_messages2, i24, j13, arrayList3, i15, i13, z10, i12, i16, 0);
                if (viVar.getMessagesController().f19253t7.v(j13)) {
                    viVar.getMessagesStorage().f16331a.c(new ng(viVar, arrayList3, ofVar, 29));
                } else {
                    ofVar.run();
                }
            }
        });
    }

    public final void v() {
        if (getUserConfig().f15515e0 != null) {
            String str = getUserConfig().f15515e0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.f18664o0 && System.currentTimeMillis() - getUserConfig().f15520i0 >= 86400000) {
            this.f18664o0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new hh(this, 5));
        }
    }

    public final void v0(long j10, boolean z10) {
        int i10;
        int i11;
        ArrayList arrayList;
        TLRPC.TL_topPeer tL_topPeer;
        int i12;
        if (!getUserConfig().V) {
            return;
        }
        e20 userConfig = getUserConfig();
        if (z10) {
            i10 = userConfig.F;
        } else {
            i10 = userConfig.E;
        }
        int i13 = 1;
        if (i10 != 0) {
            i11 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i10);
        } else {
            i11 = 60;
        }
        if (z10) {
            arrayList = this.f18658k1;
        } else {
            arrayList = this.f18656j1;
        }
        int i14 = 0;
        while (true) {
            if (i14 < arrayList.size()) {
                tL_topPeer = (TLRPC.TL_topPeer) arrayList.get(i14);
                if (tL_topPeer.peer.user_id == j10) {
                    break;
                }
                i14++;
            } else {
                tL_topPeer = null;
                break;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j10;
            arrayList.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(i11 / getMessagesController().Z2) + tL_topPeer.rating;
        Collections.sort(arrayList, new a4.d(21));
        if (arrayList.size() > 20) {
            a1.g.x(1, arrayList);
        }
        if (z10) {
            i13 = 3;
        }
        getMessagesStorage().f16331a.c(new ah(this, j10, i13, tL_topPeer.rating));
        at notificationCenter = getNotificationCenter();
        if (z10) {
            i12 = at.U0;
        } else {
            i12 = at.T0;
        }
        notificationCenter.k(i12, new Object[0]);
    }

    public final void v1(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i10, boolean z10) {
        boolean z11;
        if (tL_attachMenuBots != null && i10 != 0) {
            this.f18636b = tL_attachMenuBots;
            this.f18633a = j10;
        }
        SharedPreferences.Editor edit = getMessagesController().f7.edit();
        this.e = i10;
        edit.putInt("menuBotsUpdateDate", i10).commit();
        this.d = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().m1(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().V3(tL_attachMenuBots.users, z10);
            i0.g3(new fg(this, 0));
            z11 = false;
            for (int i11 = 0; i11 < tL_attachMenuBots.bots.size(); i11++) {
                if (tL_attachMenuBots.bots.get(i11) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i11).show_in_attach_menu = true;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        if (!z10) {
            getMessagesStorage().f16331a.c(new sk(i10, 2, j10, this, tL_attachMenuBots));
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600) {
            E0(false, true, null);
        }
    }

    public final void w() {
        if (!this.f18683w0[1]) {
            if (!this.f18686x0[1] || Math.abs((System.currentTimeMillis() / 1000) - this.f18668q0[1]) >= 3600) {
                K0(true, true);
            }
        }
    }

    public final void w0(long j10) {
        TLRPC.User Z12;
        if (getUserConfig().V && o5.E(j10) && (Z12 = getMessagesController().Z1(Long.valueOf(j10))) != null && !Z12.bot && !Z12.self) {
            getMessagesStorage().f16331a.c(new yg(this, j10, 2));
        }
    }

    public final void w1(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.D = tL_help_premiumPromo;
            this.F = i10;
            getMessagesController().V3(tL_help_premiumPromo.users, z10);
            i0.g3(new fg(this, 3));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().f16331a.c(new o7(this, tL_help_premiumPromo, i10, 7));
            }
            this.E = false;
        } else if (tL_help_premiumPromo != null && Math.abs((System.currentTimeMillis() / 1000) - i10) < 86400) {
            this.E = false;
        } else {
            R0(false);
        }
    }

    public final void x() {
        if (!this.f18683w0[0]) {
            if (!this.f18686x0[0] || Math.abs((System.currentTimeMillis() / 1000) - this.f18668q0[0]) >= 3600) {
                K0(false, true);
            }
        }
    }

    public final void x1(List list, int i10, int i11, boolean z10) {
        ArrayList arrayList;
        if (list != null && i11 != 0) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            HashMap hashMap = this.f18670r;
            hashMap.clear();
            ArrayList arrayList3 = this.f18661n;
            arrayList3.clear();
            arrayList2.addAll(list);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ((TLRPC.TL_availableReaction) arrayList2.get(i12)).positionInList = i12;
                hashMap.put(((TLRPC.TL_availableReaction) arrayList2.get(i12)).reaction, (TLRPC.TL_availableReaction) arrayList2.get(i12));
                if (!((TLRPC.TL_availableReaction) arrayList2.get(i12)).inactive) {
                    arrayList3.add((TLRPC.TL_availableReaction) arrayList2.get(i12));
                }
            }
            this.f18646f = i10;
        }
        this.f18685x = i11;
        if (list != null) {
            i0.g3(new fg(this, 7));
        }
        this.f18682w = false;
        if (!z10) {
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            getMessagesStorage().f16331a.c(new i2.a0(this, arrayList, i10, i11, 3));
            return;
        }
        Math.abs((System.currentTimeMillis() / 1000) - i11);
        S0(false, Integer.valueOf(i10));
    }

    public final void y0(long r20, int r22, org.telegram.ui.web.p r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vi.y0(long, int, org.telegram.ui.web.p):void");
    }

    public final void y1(int i10, ArrayList arrayList, boolean z10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList2;
        boolean z12;
        int i13;
        if (arrayList != null) {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
            getMessagesStorage().f16331a.c(new uf(this, z12, i12, arrayList2, z11, i13));
        } else {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
        }
        if (i13 == 0) {
            i0.g3(new vf(this, z12, i12, arrayList2));
        }
    }

    public final void z() {
        if (getUserConfig().f15511b0 != null) {
            String str = getUserConfig().f15511b0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.f18659l0 && System.currentTimeMillis() - getUserConfig().f15517f0 >= 86400000) {
            this.f18659l0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new hh(this, 4));
        }
    }

    public final void z1(int i10, ArrayList arrayList, boolean z10, int i11, long j10, Runnable runnable) {
        i0.g3(new og(this, i10, 0));
        Utilities.d.c(new pg(this, z10, arrayList, i11, j10, i10, runnable));
    }
}
