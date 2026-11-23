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
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class si extends c1 {
    public static final Pattern U1 = Pattern.compile("\\*\\*(.+?)\\*\\*");
    public static final Pattern V1 = Pattern.compile("__(.+?)__");
    public static final Pattern W1 = Pattern.compile("\\|\\|(.+?)\\|\\|");
    public static final Pattern X1 = Pattern.compile("~~(.+?)~~");
    public static final String Y1 = "org.telegram.messenger.SHORTCUT_SHARE";
    public static volatile si[] Z1 = new si[4];
    public static final Object[] f26767a2 = new Object[4];
    public static Paint f26768b2;
    public static Paint f26769c2;
    public static RectF d2;
    public static Path f26770e2;
    public static final int f26771f2;
    public static final jg.w f26772g2;
    public static final Pattern f26773h2;
    public final yf.c A0;
    public final HashMap A1;
    public final ArrayList B0;
    public final a0.h B1;
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
    public final a0.h[] I;
    public final boolean[] I0;
    public boolean I1;
    public final a0.h J;
    public final HashSet J0;
    public boolean J1;
    public final a0.h K;
    public boolean K0;
    public boolean K1;
    public final ArrayList L;
    public final HashMap L0;
    public boolean L1;
    public final ArrayList M;
    public int M0;
    public TLRPC.TL_emojiList M1;
    public final a0.h N;
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
    public ch.p0 R0;
    public final a0.h R1;
    public final a0.h S;
    public int S0;
    public final HashMap S1;
    public final HashSet T;
    public int T0;
    public final LruCache T1;
    public final a0.h U;
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
    public long f26774a;
    public final HashMap f26775a0;
    public final ArrayList f26776a1;
    public TLRPC.TL_attachMenuBots f26777b;
    public final HashMap f26778b0;
    public ArrayList f26779b1;
    public boolean f26780c;
    public final int[] f26781c0;
    public final SparseArray[] f26782c1;
    public boolean d;
    public a0.h f26783d0;
    public final ArrayList f26784d1;
    public int f26785e;
    public HashMap f26786e0;
    public String f26787e1;
    public int f26788f;
    public HashMap f26789f0;
    public int f26790f1;
    public final ArrayList[] f26791g0;
    public boolean f26792g1;
    public final ArrayList h;
    public final boolean[] f26793h0;
    public boolean f26794h1;
    public final boolean[] f26795i0;
    public boolean f26796i1;
    public ArrayList f26797j0;
    public ArrayList f26798j1;
    public boolean f26799k0;
    public ArrayList f26800k1;
    public boolean f26801l0;
    public ArrayList l1;
    public boolean m0;
    public ArrayList f26802m1;
    public final ArrayList f26803n;
    public boolean f26804n0;
    public boolean n1;
    public boolean f26805o0;
    public boolean f26806o1;
    public boolean f26807p0;
    public final HashMap f26808p1;
    public final long[] f26809q0;
    public final a0.h f26810q1;
    public final HashMap f26811r;
    public final int[] f26812r0;
    public final a0.h f26813r1;
    public String f26814s;
    public boolean f26815s0;
    public SharedPreferences f26816s1;
    public final ArrayList[] f26817t0;
    public final a0.h f26818t1;
    public final a0.h[] f26819u0;
    public final a0.h f26820u1;
    public final ArrayList[] f26821v0;
    public final a0.h f26822v1;
    public boolean f26823w;
    public final ArrayList[] f26824w0;
    public final SharedPreferences f26825w1;
    public int f26826x;
    public final boolean[] f26827x0;
    public boolean f26828x1;
    public boolean f26829y;
    public final boolean[] f26830y0;
    public final HashMap f26831y1;
    public TLRPC.Document f26832z0;
    public final a0.h f26833z1;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f26767a2[i7] = new Object();
        }
        f26771f2 = 1;
        f26772g2 = new jg.w(19);
        f26773h2 = Pattern.compile("(?<![A-Za-z0-9_+/=:-])(?:-?[0-9]{1,10}:[0-9a-fA-F]{64}|[A-Za-z0-9_+/-]{48})(?![A-Za-z0-9_+/=:-])");
    }

    public si(int i7) {
        super(i7);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z10;
        int i10;
        long j3;
        this.f26777b = new TLRPC.TL_attachMenuBots();
        this.h = new ArrayList();
        this.f26803n = new ArrayList();
        this.f26811r = new HashMap();
        this.H = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(0), new ArrayList(), new ArrayList(), new ArrayList()};
        this.I = new a0.h[]{new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h()};
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new a0.h();
        this.O = new ConcurrentHashMap(100, 1.0f, 1);
        this.P = null;
        this.Q = null;
        this.R = new HashMap();
        this.S = new a0.h();
        this.T = new HashSet();
        this.U = new a0.h();
        this.V = new Runnable[7];
        this.W = new boolean[7];
        this.X = new boolean[7];
        this.Y = new long[7];
        this.Z = new int[7];
        this.f26775a0 = new HashMap();
        this.f26778b0 = new HashMap();
        this.f26781c0 = new int[7];
        this.f26783d0 = new a0.h();
        this.f26786e0 = new HashMap();
        this.f26789f0 = new HashMap();
        this.f26791g0 = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        this.f26793h0 = new boolean[9];
        this.f26795i0 = new boolean[9];
        this.f26797j0 = new ArrayList();
        this.f26809q0 = new long[2];
        this.f26812r0 = new int[2];
        this.f26817t0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f26819u0 = new a0.h[]{new a0.h(), new a0.h()};
        this.f26821v0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f26824w0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.f26827x0 = new boolean[2];
        this.f26830y0 = new boolean[2];
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
        this.f26776a1 = new ArrayList();
        this.f26779b1 = new ArrayList();
        this.f26782c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f26784d1 = new ArrayList();
        this.f26798j1 = new ArrayList();
        this.f26800k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f26802m1 = new ArrayList();
        this.f26808p1 = new HashMap();
        this.f26810q1 = new a0.h();
        this.f26813r1 = new a0.h();
        this.f26818t1 = new a0.h();
        this.f26820u1 = new a0.h();
        this.f26822v1 = new a0.h();
        this.f26831y1 = new HashMap();
        this.f26833z1 = new a0.h();
        this.A1 = new HashMap();
        this.B1 = new a0.h();
        this.C1 = new HashMap();
        this.D1 = new HashSet();
        this.E1 = false;
        this.F1 = new ArrayList();
        this.G1 = new ArrayList();
        this.H1 = new ArrayList();
        this.Q1 = false;
        this.R1 = new a0.h();
        this.S1 = new HashMap();
        this.T1 = new LruCache(25);
        if (this.currentAccount == 0) {
            this.f26825w1 = t0.f26895b.getSharedPreferences("drafts", 0);
        } else {
            this.f26825w1 = f3.e(new StringBuilder("drafts"), this.currentAccount, t0.f26895b, 0);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f26825w1.getAll().entrySet()) {
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
                        a0.h hVar = (a0.h) this.f26820u1.f(longValue);
                        if (hVar == null) {
                            hVar = new a0.h();
                            this.f26820u1.k(hVar, longValue);
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
                z10 = false;
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().f24951n);
                a0.h hVar2 = (a0.h) this.f26822v1.f(longValue);
                if (hVar2 == null) {
                    hVar2 = new a0.h();
                    this.f26822v1.k(hVar2, longValue);
                }
                if (z10) {
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
            getMessagesStorage().f27214a.c(new kh(this, arrayList, 1));
        }
        f1("tg_placeholders_android", false, true);
        SharedPreferences e10 = f3.e(new StringBuilder("emojithemes_config_"), this.currentAccount, t0.f26895b, 0);
        int i11 = e10.getInt("count", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new org.telegram.ui.Components.mp(org.telegram.ui.ActionBar.s3.b(this.currentAccount)));
        for (int i12 = 0; i12 < i11; i12++) {
            SerializedData serializedData2 = new SerializedData(Utilities.v(e10.getString("theme_" + i12, "")));
            try {
                org.telegram.ui.ActionBar.s3 c10 = org.telegram.ui.ActionBar.s3.c(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true));
                if (c10.f29953f.size() >= 4) {
                    arrayList2.add(new org.telegram.ui.Components.mp(c10));
                }
                f4.f23815s.c(new m9.u(this, arrayList2, false, 26));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        X0(false);
        I0(false);
        I0(true);
        this.A0 = new yf.c(this.currentAccount);
        this.f26785e = getMessagesController().h7.getInt("menuBotsUpdateDate", 0);
    }

    public static boolean A(int r5, java.util.ArrayList r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.A(int, java.util.ArrayList, boolean):boolean");
    }

    public static boolean B0(TL_aicompose.inputAiComposeStyle inputaicomposestyle) {
        if (inputaicomposestyle != null) {
            if (inputaicomposestyle.tone != null || !TextUtils.isEmpty(inputaicomposestyle.to_lang) || inputaicomposestyle.emojify) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean C0(int i7, long j3) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i7 == 0) {
                str = "sdid_";
            } else {
                str = "bdid_";
            }
            String str2 = str + j3;
            List k10 = g0.g.k(t0.f26895b);
            for (int i10 = 0; i10 < k10.size(); i10++) {
                if (((g0.c) k10.get(i10)).f13057b.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharacterStyle L(CharacterStyle characterStyle, fz0 fz0Var, fz0 fz0Var2, boolean z10) {
        fz0 fz0Var3 = new fz0(fz0Var);
        if (fz0Var2 != null) {
            if (z10) {
                fz0Var3.b(fz0Var2);
            } else {
                fz0Var3.f35299a = fz0Var2.f35299a;
                fz0Var3.d = fz0Var2.d;
            }
        }
        if (characterStyle instanceof gz0) {
            return new gz0(fz0Var3, 0);
        }
        if (characterStyle instanceof u41) {
            return new u41(((u41) characterStyle).getURL(), fz0Var3);
        }
        return null;
    }

    public static boolean M(ArrayList arrayList, ArrayList arrayList2) {
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

    public static void P1(ArrayList arrayList) {
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

    public static ArrayList W0(SharedPreferences sharedPreferences) {
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

    public static void X1(SharedPreferences sharedPreferences, long j3, ArrayList arrayList) {
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

    public static void a(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        org.telegram.ui.Components.y5[] y5VarArr;
        org.telegram.ui.Components.y5 y5Var;
        if (arrayList != null) {
            Spannable spannable = (Spannable) charSequence;
            for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.y5.class)) {
                if (y5Var2 != null) {
                    spannable.removeSpan(y5Var2);
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
                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                        } else {
                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                        }
                        spannable.setSpan(y5Var, i10, i11, 33);
                    }
                }
            }
        }
    }

    public static TLRPC.TL_inputStickerSetID b0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.f28418id = stickerSet.f28425id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            return tL_inputStickerSetID;
        }
        return null;
    }

    public static TLRPC.TL_inputStickerSetItem c0(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.f28410id = document.f28404id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static si d0(int i7) {
        si siVar;
        si siVar2 = Z1[i7];
        if (siVar2 == null) {
            synchronized (f26767a2) {
                try {
                    siVar = Z1[i7];
                    if (siVar == null) {
                        si[] siVarArr = Z1;
                        si siVar3 = new si(i7);
                        siVarArr[i7] = siVar3;
                        siVar = siVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return siVar;
        }
        return siVar2;
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

    public static void f(org.telegram.ui.Components.gz0 r16, int r17, int r18, android.text.Spannable r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.f(org.telegram.ui.Components.gz0, int, int, android.text.Spannable, boolean):void");
    }

    public static void g(ArrayList arrayList, CharSequence charSequence, Spannable spannable, int i7) {
        int i10;
        ArrayList arrayList2;
        ArrayList v02;
        int i11;
        int i12;
        int i13;
        for (gz0 gz0Var : (gz0[]) spannable.getSpans(0, spannable.length(), gz0.class)) {
            spannable.removeSpan(gz0Var);
        }
        int i14 = 1;
        int i15 = 100;
        if (arrayList != null && arrayList.size() > 100) {
            v02 = v0(arrayList, charSequence, i7);
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
                Collections.sort(arrayList3, new jg.w(23));
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
                            obj.f35300b = i19;
                            obj.f35301c = Math.min(messageEntity2.length, charSequence.length() - obj.f35300b) + i19;
                            if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                                obj.f35299a = 256;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                                obj.f35299a = 8;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                                obj.f35299a = 16;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                                obj.f35299a = i14;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                                obj.f35299a = 2;
                            } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                                if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                    obj.f35299a = 64;
                                    obj.d = messageEntity2;
                                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    obj.f35299a = 64;
                                    obj.d = messageEntity2;
                                } else {
                                    obj.f35299a = 128;
                                    obj.d = messageEntity2;
                                }
                            } else {
                                obj.f35299a = 4;
                            }
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                obj.f35299a |= 1024;
                            }
                            obj.f35299a &= i7;
                            int size3 = arrayList4.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 < size3) {
                                    i18++;
                                    if (i18 > 10000) {
                                        i10 = i14;
                                        break loop3;
                                    }
                                    fz0 fz0Var = (fz0) arrayList4.get(i20);
                                    int i21 = obj.f35300b;
                                    i10 = i14;
                                    int i22 = fz0Var.f35300b;
                                    if (i21 > i22) {
                                        int i23 = fz0Var.f35301c;
                                        if (i21 >= i23) {
                                            continue;
                                        } else if (obj.f35301c < i23) {
                                            if (arrayList4.size() > 98) {
                                                break loop3;
                                            }
                                            fz0 fz0Var2 = new fz0(obj);
                                            fz0Var2.b(fz0Var);
                                            arrayList4.add(i20 + 1, fz0Var2);
                                            fz0 fz0Var3 = new fz0(fz0Var);
                                            fz0Var3.f35300b = obj.f35301c;
                                            i20 += 2;
                                            arrayList4.add(i20, fz0Var3);
                                            size3 += 2;
                                            int i24 = obj.f35300b;
                                            obj.f35300b = fz0Var.f35301c;
                                            fz0Var.f35301c = i24;
                                        } else if (arrayList4.size() >= i15) {
                                            break loop3;
                                        } else {
                                            fz0 fz0Var4 = new fz0(obj);
                                            fz0Var4.b(fz0Var);
                                            fz0Var4.f35301c = fz0Var.f35301c;
                                            i20++;
                                            arrayList4.add(i20, fz0Var4);
                                            size3++;
                                            int i242 = obj.f35300b;
                                            obj.f35300b = fz0Var.f35301c;
                                            fz0Var.f35301c = i242;
                                        }
                                        i20++;
                                        i14 = i10;
                                        i15 = 100;
                                    } else {
                                        int i25 = obj.f35301c;
                                        if (i22 < i25) {
                                            int i26 = fz0Var.f35301c;
                                            if (i25 == i26) {
                                                fz0Var.b(obj);
                                            } else if (i25 < i26) {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                fz0 fz0Var5 = new fz0(fz0Var);
                                                fz0Var5.b(obj);
                                                fz0Var5.f35301c = obj.f35301c;
                                                i20++;
                                                arrayList4.add(i20, fz0Var5);
                                                size3++;
                                                fz0Var.f35300b = obj.f35301c;
                                            } else if (arrayList4.size() >= 100) {
                                                break loop3;
                                            } else {
                                                fz0 fz0Var6 = new fz0(obj);
                                                fz0Var6.f35300b = fz0Var.f35301c;
                                                i20++;
                                                arrayList4.add(i20, fz0Var6);
                                                size3++;
                                                fz0Var.b(obj);
                                            }
                                            obj.f35301c = i22;
                                        } else {
                                            continue;
                                        }
                                        i20++;
                                        i14 = i10;
                                        i15 = 100;
                                    }
                                } else {
                                    i10 = i14;
                                    if (obj.f35300b < obj.f35301c) {
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
                            fz0 fz0Var7 = (fz0) arrayList4.get(i27);
                            int i28 = fz0Var7.f35300b;
                            if (i28 >= 0 && i28 < (i11 = fz0Var7.f35301c) && i11 <= charSequence.length()) {
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                }
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                v02 = arrayList2;
            } else {
                v02 = v0(arrayList, charSequence, i7);
            }
        }
        for (int i29 = 0; i29 < Math.min(1000, v02.size()); i29++) {
            fz0 fz0Var8 = (fz0) v02.get(i29);
            f(new gz0(fz0Var8, 0), fz0Var8.f35300b, fz0Var8.f35301c, spannable, i10);
        }
    }

    public static void h(gj gjVar, Spannable spannable) {
        g(gjVar.f24177k.entities, gjVar.v, spannable, -1);
    }

    public static int h0(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia n1 = gj.n1(message);
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
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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
            for (int i10 = 0; i10 < message.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i10);
                if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static void i(TLRPC.DraftMessage draftMessage, SpannableString spannableString) {
        g(draftMessage.entities, draftMessage.message, spannableString, 264);
    }

    public static CharSequence i2(int i7, int i10, CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i7, i10);
        }
        if (charSequence instanceof SpannedString) {
            return ((SpannedString) charSequence).subSequence(i7, i10);
        }
        return TextUtils.substring(charSequence, i7, i10);
    }

    public static boolean j(TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        if (!B0(inputaicomposestyle) && !B0(inputaicomposestyle2)) {
            if (inputaicomposestyle.emojify != inputaicomposestyle2.emojify || !TextUtils.equals(inputaicomposestyle.to_lang, inputaicomposestyle2.to_lang) || !TL_aicompose.InputAiComposeTone.equals(inputaicomposestyle.tone, inputaicomposestyle2.tone)) {
                return false;
            }
            return true;
        } else if (B0(inputaicomposestyle) != B0(inputaicomposestyle2)) {
            return false;
        } else {
            return true;
        }
    }

    public static TLRPC.TL_attachMenuBotIcon m0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
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

    public static CharSequence m1(CharSequence charSequence, Pattern pattern, ArrayList arrayList, j9 j9Var) {
        boolean z10;
        TLRPC.MessageEntity messageEntity;
        URLSpan[] uRLSpanArr;
        String str = charSequence;
        Matcher matcher = pattern.matcher(str);
        int i7 = 0;
        int i10 = 0;
        while (i7 <= matcher.regionEnd() && matcher.find(i7)) {
            String group = matcher.group(1);
            if ((str instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) str).getSpans(matcher.start() - i10, matcher.end() - i10, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
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
                            z10 = false;
                            break;
                        }
                    } else {
                        int i13 = messageEntity2.offset;
                        if (g0.B1(matcher.start() - i10, matcher.end() - i10, i13, messageEntity2.length + i13)) {
                            z10 = false;
                            break;
                        }
                    }
                }
            } else {
                messageEntity = null;
            }
            if (z10) {
                str = ((Object) str.subSequence(0, matcher.start() - i10)) + group + ((Object) str.subSequence(matcher.end() - i10, str.length()));
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) j9Var.m(null);
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

    public static long p(int i7, ArrayList arrayList) {
        long j3 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i7, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document != null) {
                j3 = r(j3, document.f28404id);
            }
        }
        return j3;
    }

    public static void p1(ImageReceiver imageReceiver, gc gcVar, String str) {
        if (!qc.e(8200)) {
            return;
        }
        imageReceiver.f22665w1 = "preload";
        imageReceiver.h0(0);
        imageReceiver.q0(gcVar, str, null, null, 0, 11);
    }

    public static long r(long j3, long j10) {
        long j11 = j3 ^ (j3 >>> 21);
        long j12 = j11 ^ (j11 << 35);
        return (j12 ^ (j12 >>> 4)) + j10;
    }

    public static long s(ArrayList arrayList) {
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null) {
                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set;
                if (!stickerSet.archived) {
                    j3 = r(j3, stickerSet.hash);
                }
            }
        }
        return j3;
    }

    public static long s0(TLRPC.Document document) {
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
                return inputStickerSet.f28418id;
            }
        }
        return -1L;
    }

    public static boolean t(TLRPC.Message message) {
        boolean z10 = message instanceof TLRPC.TL_message_secret;
        if (z10 && (((gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || gj.L4(message) || gj.t3(message)) && gj.n1(message).ttl_seconds != 0 && gj.n1(message).ttl_seconds <= 60)) {
            return false;
        }
        if ((!z10 && (message instanceof TLRPC.TL_message) && (((gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (gj.n1(message) instanceof TLRPC.TL_messageMediaDocument)) && gj.n1(message).ttl_seconds != 0)) || h0(message) == -1) {
            return false;
        }
        return true;
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
        int i7 = 0;
        while (i7 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i7);
            i7++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || user == null || !user.bot || user.f28547id != tL_attachMenuBot.bot_id) {
                if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) || user == null || !user.bot || user.f28547id == tL_attachMenuBot.bot_id) {
                    if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || user == null || user.bot) {
                        if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || chat == null || v3.V(chat)) {
                            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && v3.V(chat)) {
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

    public static ArrayList v0(ArrayList arrayList, CharSequence charSequence, int i7) {
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
            Collections.sort(arrayList3, new jg.w(22));
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
                        obj.f35300b = i15;
                        obj.f35301c = min;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                            obj.f35299a = 256;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                            obj.f35299a = 8;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                            obj.f35299a = 16;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                            obj.f35299a = 1;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                            obj.f35299a = 2;
                        } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                obj.f35299a = 64;
                                obj.d = messageEntity2;
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                obj.f35299a = 64;
                                obj.d = messageEntity2;
                            } else {
                                obj.f35299a = 128;
                                obj.d = messageEntity2;
                            }
                        } else {
                            obj.f35299a = 4;
                        }
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            obj.f35299a |= 1024;
                        }
                        obj.f35299a &= i7;
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
                    fz0 fz0Var = null;
                    int i20 = Integer.MIN_VALUE;
                    int i21 = i11;
                    while (i21 < size3) {
                        fz0 fz0Var2 = (fz0) arrayList4.get(i21);
                        if (fz0Var2.f35300b <= i18) {
                            fz0Var = fz0Var;
                            if (fz0Var2.f35301c >= i19) {
                                if (fz0Var == null) {
                                    ?? obj2 = new Object();
                                    obj2.f35300b = i18;
                                    obj2.f35301c = i19;
                                    fz0Var = obj2;
                                }
                                fz0Var.f35299a = fz0Var2.f35299a | fz0Var.f35299a;
                                TLRPC.MessageEntity messageEntity3 = fz0Var2.d;
                                if (messageEntity3 != null && (fz0Var.d == null || fz0Var2.f35300b > i20)) {
                                    fz0Var.d = messageEntity3;
                                    i20 = fz0Var2.f35300b;
                                }
                            }
                        }
                        i21++;
                        fz0Var = fz0Var;
                    }
                    if (fz0Var != null) {
                        if (!arrayList2.isEmpty()) {
                            fz0 fz0Var3 = (fz0) i5.c.h(1, arrayList2);
                            if (fz0Var3.f35301c == fz0Var.f35300b && fz0Var3.f35299a == fz0Var.f35299a && fz0Var3.d == fz0Var.d) {
                                fz0Var3.f35301c = fz0Var.f35301c;
                            }
                        }
                        if (arrayList2.size() >= 1000) {
                            arrayList2.clear();
                            return arrayList2;
                        }
                        arrayList2.add(fz0Var);
                    }
                    i11 = 0;
                }
            }
        }
        return arrayList2;
    }

    public static String z0(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.f28418id + "access_hash" + inputStickerSet.access_hash;
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

    public final void A0(long r20, int r22, org.telegram.ui.web.p r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.A0(long, int, org.telegram.ui.web.p):void");
    }

    public final void A1(List list, int i7, int i10, boolean z10) {
        ArrayList arrayList;
        if (list != null && i10 != 0) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            HashMap hashMap = this.f26811r;
            hashMap.clear();
            ArrayList arrayList3 = this.f26803n;
            arrayList3.clear();
            arrayList2.addAll(list);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((TLRPC.TL_availableReaction) arrayList2.get(i11)).positionInList = i11;
                hashMap.put(((TLRPC.TL_availableReaction) arrayList2.get(i11)).reaction, (TLRPC.TL_availableReaction) arrayList2.get(i11));
                if (!((TLRPC.TL_availableReaction) arrayList2.get(i11)).inactive) {
                    arrayList3.add((TLRPC.TL_availableReaction) arrayList2.get(i11));
                }
            }
            this.f26788f = i7;
        }
        this.f26826x = i10;
        if (list != null) {
            g0.g3(new fg(this, 8));
        }
        this.f26823w = false;
        if (!z10) {
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            getMessagesStorage().f27214a.c(new l2.x(this, arrayList, i7, i10, 3));
            return;
        }
        Math.abs((System.currentTimeMillis() / 1000) - i10);
        V0(false, Integer.valueOf(i7));
    }

    public final void B() {
        if (getUserConfig().f24939c0 != null) {
            String str = getUserConfig().f24939c0;
            TLRPC.TL_messages_stickerSet r02 = r0(str);
            if (r02 == null) {
                r02 = p0(str);
            }
            if (r02 == null) {
                d0(this.currentAccount).f1(str, false, true);
            }
        }
        if (!this.m0 && System.currentTimeMillis() - getUserConfig().f24945g0 >= 86400000) {
            this.m0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new jh(this, 4));
        }
    }

    public final void B1(int i7, ArrayList arrayList, boolean z10, int i10, boolean z11) {
        int i11;
        ArrayList arrayList2;
        boolean z12;
        int i12;
        if (arrayList != null) {
            i11 = i7;
            arrayList2 = arrayList;
            z12 = z10;
            i12 = i10;
            getMessagesStorage().f27214a.c(new vf(this, z12, i11, arrayList2, z11, i12));
        } else {
            i11 = i7;
            arrayList2 = arrayList;
            z12 = z10;
            i12 = i10;
        }
        if (i12 == 0) {
            g0.g3(new wf(this, z12, i11, arrayList2));
        }
    }

    public final void C() {
        if (!this.f26823w && Math.abs((System.currentTimeMillis() / 1000) - this.f26826x) >= 3600) {
            V0(true, null);
        }
    }

    public final void C1(int i7, ArrayList arrayList, boolean z10, int i10, long j3, Runnable runnable) {
        g0.g3(new ng(this, i7, 0));
        Utilities.d.c(new og(this, z10, arrayList, i10, j3, i7, runnable));
    }

    public final void D(int i7) {
        if (!this.W[i7]) {
            if (!this.X[i7] || Math.abs((System.currentTimeMillis() / 1000) - this.Z[i7]) >= 3600) {
                d1(i7, true, false);
            }
        }
    }

    public final boolean D0(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.f26791g0;
            if (i7 >= arrayListArr[2].size()) {
                return false;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayListArr[2].get(i7);
            if (document2.f28404id == document.f28404id && document2.dc_id == document.dc_id) {
                return true;
            }
            i7++;
        }
    }

    public final void D1(long j3, long j10, TLRPC.DraftMessage draftMessage) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (draftMessage != null && (inputaicomposestyle = draftMessage.ai_style) != null) {
            H1(j3, inputaicomposestyle);
        } else if (j10 == 0) {
            H1(j3, null);
        }
    }

    public final void E() {
        if (getUserConfig().f24940d0 != null) {
            String str = getUserConfig().f24940d0;
            TLRPC.TL_messages_stickerSet r02 = r0(str);
            if (r02 == null) {
                r02 = p0(str);
            }
            if (r02 == null) {
                d0(this.currentAccount).f1(str, false, true);
            }
        }
        if (!this.f26804n0 && System.currentTimeMillis() - getUserConfig().f24946h0 >= 86400000) {
            this.f26804n0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new jh(this, 7));
        }
    }

    public final boolean E0(long j3, boolean z10) {
        if (this.K.h(j3) >= 0 || (z10 && this.L.contains(Long.valueOf(j3)))) {
            if (z10 && this.M.contains(Long.valueOf(j3))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void E1(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, int i7, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        org.telegram.ui.ActionBar.g2 g2Var2;
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.l(tL_messages_stickerSetInstallResultArchive.sets.get(i10).set.f28425id);
        }
        F0(i7, false);
        getNotificationCenter().k(ls.Y0, tL_messages_stickerSetInstallResultArchive.sets);
        if (g2Var != null && g2Var.getParentActivity() != null) {
            Activity parentActivity = g2Var.getParentActivity();
            if (z10) {
                g2Var2 = g2Var;
            } else {
                g2Var2 = null;
            }
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
            ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
            boolean z11 = stickerSetCovered.set.masks;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            if (z11) {
                alertDialog$Builder.d = 1;
                t1Var.S = hd.N0(2131754128, null);
            } else {
                alertDialog$Builder.d = 0;
                t1Var.S = hd.N0(2131754123, null);
            }
            alertDialog$Builder.f37608c = new ArrayList(arrayList);
            alertDialog$Builder.f37609e = g2Var2;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
            textView.setGravity(c8.na.y());
            textView.setTextSize(1, 16.0f);
            textView.setPadding(g0.L(23.0f), g0.L(10.0f), g0.L(23.0f), 0);
            if (stickerSetCovered.set.masks) {
                textView.setText(hd.N0(2131754129, null));
            } else {
                textView.setText(hd.N0(2131754124, null));
            }
            linearLayout.addView(textView, c8.na.o(-2, -2));
            ek0 ek0Var = new ek0(parentActivity, null);
            t1Var.getContext();
            ek0Var.setLayoutManager(new v4.b0(1, false));
            ek0Var.setAdapter(new lw0(alertDialog$Builder, parentActivity));
            ek0Var.setVerticalScrollBarEnabled(false);
            ek0Var.setPadding(g0.L(10.0f), 0, g0.L(10.0f), 0);
            ek0Var.setGlowColor(-657673);
            linearLayout.addView(ek0Var, c8.na.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(hd.N0(2131752029, null), new xb0(18));
            if (g2Var2 != null) {
                alertDialog$Builder.k(hd.N0(2131745299, null), new org.telegram.ui.Components.ky(alertDialog$Builder, 21));
            }
            g2Var.showDialog(t1Var);
        }
    }

    public final void F(long j3, long j10, boolean z10) {
        TLRPC.DraftMessage draftMessage;
        a0.h hVar = this.f26820u1;
        a0.h hVar2 = (a0.h) hVar.f(j3);
        if (hVar2 != null) {
            draftMessage = (TLRPC.DraftMessage) hVar2.f(j10);
        } else {
            draftMessage = null;
        }
        if (draftMessage != null) {
            if (!z10) {
                a0.h hVar3 = (a0.h) hVar.f(j3);
                if (hVar3 != null) {
                    hVar3.l(j10);
                    if (hVar3.m() == 0) {
                        hVar.l(j3);
                    }
                }
                a0.h hVar4 = this.f26822v1;
                a0.h hVar5 = (a0.h) hVar4.f(j3);
                if (hVar5 != null) {
                    hVar5.l(j10);
                    if (hVar5.m() == 0) {
                        hVar4.l(j3);
                    }
                }
                int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                SharedPreferences sharedPreferences = this.f26825w1;
                if (i7 == 0) {
                    sharedPreferences.edit().remove("" + j3).remove("r_" + j3).commit();
                    getMessagesController().f5(null);
                    getNotificationCenter().k(ls.f25342s, new Object[0]);
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
            V1(j3, j10, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true, null);
        }
    }

    public final void F0(int i7, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            int i10 = np.u1(this.currentAccount).f25821g7.getInt("archivedStickersCount" + i7, -1);
            if (i10 == -1) {
                F0(i7, false);
                return;
            }
            this.f26781c0[i7] = i10;
            getNotificationCenter().k(ls.Z0, Integer.valueOf(i7));
            return;
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.limit = 0;
        if (i7 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_messages_getArchivedStickers.masks = z11;
        if (i7 == 5) {
            z12 = true;
        }
        tL_messages_getArchivedStickers.emojis = z12;
        getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new ph(this, i7, 1));
    }

    public final void F1(long j3, long j10, ni niVar) {
        SharedPreferences e10 = f3.e(new StringBuilder("2voicedrafts_"), this.currentAccount, t0.f26895b, 0);
        long hash = Objects.hash(Long.valueOf(j3), Long.valueOf(j10));
        String str = hash + "";
        if (niVar == null) {
            e10.edit().remove(str).apply();
            this.R1.l(hash);
            return;
        }
        e10.edit().putString(str, niVar.toString()).apply();
        this.R1.k(niVar, hash);
    }

    public final void G(boolean z10) {
        this.f26820u1.b();
        this.f26822v1.b();
        this.f26818t1.b();
        this.f26825w1.edit().clear().commit();
        if (z10) {
            getMessagesController().f5(null);
            getNotificationCenter().k(ls.f25342s, new Object[0]);
        }
    }

    public final void G0() {
        H0(false, true, null);
    }

    public final void G1(TLRPC.TL_emojiStatus tL_emojiStatus) {
        ArrayList<TLRPC.EmojiStatus>[] arrayListArr = this.F0;
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
            tL_emojiStatuses.hash = this.E0[0];
            tL_emojiStatuses.statuses = arrayListArr[0];
            getMessagesStorage().f27214a.c(new l7(this, 0, tL_emojiStatuses, 8));
        }
    }

    public final void H() {
        this.f26798j1.clear();
        this.f26800k1.clear();
        this.l1.clear();
        this.f26802m1.clear();
        getNotificationCenter().k(ls.S0, new Object[0]);
        getNotificationCenter().k(ls.T0, new Object[0]);
        getNotificationCenter().k(ls.U0, new Object[0]);
        getNotificationCenter().k(ls.V0, new Object[0]);
        getMessagesStorage().f27214a.c(new fg(this, 17));
        o();
    }

    public final void H0(boolean z10, boolean z11, org.telegram.ui.ip ipVar) {
        long j3;
        this.f26780c = true;
        if (z10) {
            getMessagesStorage().f27214a.c(new fg(this, 16));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        if (z11) {
            j3 = 0;
        } else {
            j3 = this.f26774a;
        }
        tL_messages_getAttachMenuBots.hash = j3;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new t4(5, this, ipVar));
    }

    public final void H1(long j3, TL_aicompose.inputAiComposeStyle inputaicomposestyle) {
        k();
        if (B0(inputaicomposestyle)) {
            inputaicomposestyle = null;
        }
        a0.h hVar = this.f26813r1;
        if (j((TL_aicompose.inputAiComposeStyle) hVar.f(j3), inputaicomposestyle)) {
            return;
        }
        SharedPreferences.Editor edit = k().edit();
        if (inputaicomposestyle == null) {
            hVar.l(j3);
            edit.remove("" + j3);
        } else {
            hVar.k(inputaicomposestyle, j3);
            try {
                SerializedData serializedData = new SerializedData(inputaicomposestyle.getObjectSize());
                inputaicomposestyle.serializeToStream(serializedData);
                edit.putString("" + j3, Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        edit.apply();
        getNotificationCenter().k(ls.X5, Long.valueOf(j3));
    }

    public final boolean I(long j3) {
        for (int i7 = 0; i7 < this.f26798j1.size(); i7++) {
            if (n5.o(((TLRPC.TL_topPeer) this.f26798j1.get(i7)).peer) == j3) {
                return true;
            }
        }
        return false;
    }

    public final void I0(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.I0(boolean):void");
    }

    public final void I1(long j3, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.f26831y1.put(botInfo.user_id + "_" + j3, botInfo);
        getMessagesStorage().f27214a.c(new d4(this, botInfo, j3, 12));
    }

    public final Intent J(long j3) {
        if (j3 != 0) {
            Intent intent = new Intent(t0.f26895b, OpenAttachedMenuBotReceiver.class);
            if (n5.E(j3)) {
                intent.putExtra("botId", j3);
                intent.putExtra("currentAccount", this.currentAccount);
                StringBuilder sb2 = new StringBuilder("com.tmessages.openshortcutbot");
                int i7 = OpenAttachedMenuBotReceiver.f22768a;
                sb2.append(j3);
                intent.setAction(sb2.toString());
                intent.addFlags(67108864);
                return intent;
            }
            return null;
        }
        return null;
    }

    public final void J0(long j3, long j10, boolean z10, int i7, hk hkVar) {
        if (z10) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.f26831y1.get(j3 + "_" + j10);
            if (botInfo != null) {
                getNotificationCenter().k(ls.D0, botInfo, Integer.valueOf(i7));
                return;
            }
        }
        getMessagesStorage().f27214a.c(new vh(this, j3, j10, hkVar, i7, 0));
    }

    public final void J1(tr trVar, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        if (trVar != null) {
            try {
                int i7 = 0;
                if (trVar.f27038b != 0) {
                    SQLiteDatabase sQLiteDatabase = getMessagesStorage().f27216b;
                    Locale locale = Locale.US;
                    long j3 = trVar.f27037a;
                    long j10 = trVar.f27038b;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + j3 + " AND tid = " + j10, new Object[0]);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().f27216b;
                    Locale locale2 = Locale.US;
                    long j11 = trVar.f27037a;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + j11, new Object[0]);
                }
                if (queryFinalized.next()) {
                    i7 = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
                if (i7 >= message.f28419id && !gj.f3(i7) && !gj.f3(message.f28419id)) {
                    return;
                }
                if (trVar.f27038b != 0) {
                    executeFast = getMessagesStorage().f27216b.executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = getMessagesStorage().f27216b.executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                }
                executeFast.requery();
                gj.q5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (trVar.f27038b != 0) {
                    executeFast.bindLong(1, trVar.f27037a);
                    executeFast.bindLong(2, trVar.f27038b);
                    executeFast.bindInteger(3, message.f28419id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, trVar.f27037a);
                    executeFast.bindInteger(2, message.f28419id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                g0.g3(new pg(this, trVar, message));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final Intent K(long j3) {
        Intent intent = new Intent(t0.f26895b, OpenChatReceiver.class);
        if (n5.C(j3)) {
            int i7 = (int) (4294967295L & j3);
            intent.putExtra("encId", i7);
            if (getMessagesController().c1(Integer.valueOf(i7)) == null) {
                return null;
            }
        } else if (n5.E(j3)) {
            intent.putExtra("userId", j3);
        } else if (!n5.z(j3)) {
            return null;
        } else {
            intent.putExtra("chatId", -j3);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j3);
        intent.addFlags(67108864);
        return intent;
    }

    public final TL_bots.BotInfo K0(long j3, long j10) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase sQLiteDatabase = getMessagesStorage().f27216b;
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

    public final void K1(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().f27214a.c(new eg(this, tL_messages_stickerSet, str, i7, 7));
    }

    public final void L0(tr trVar, boolean z10) {
        TLRPC.Message message = (TLRPC.Message) this.A1.get(trVar);
        if (message != null) {
            getNotificationCenter().k(ls.G0, message, trVar);
        } else {
            getMessagesStorage().f27214a.c(new yf(this, trVar, z10, 7));
        }
    }

    public final void L1(final boolean z10, ArrayList arrayList, final ArrayList arrayList2, final int i7, final long j3, final boolean z11) {
        ArrayList arrayList3;
        if (arrayList != null) {
            arrayList3 = new ArrayList(arrayList);
        } else {
            arrayList3 = null;
        }
        final ArrayList arrayList4 = arrayList3;
        getMessagesStorage().f27214a.c(new Runnable() {
            @Override
            public final void run() {
                int i10;
                int i11;
                ArrayList arrayList5 = arrayList2;
                long j10 = j3;
                boolean z12 = z11;
                si siVar = si.this;
                ArrayList arrayList6 = arrayList4;
                boolean z13 = z10;
                int i12 = i7;
                try {
                    if (arrayList6 != null) {
                        SQLitePreparedStatement executeFast = siVar.getMessagesStorage().f27216b.executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                        if (z13) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        executeFast.bindInteger(1, i11);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer2);
                        executeFast.bindInteger(4, i12);
                        executeFast.bindLong(5, j10);
                        executeFast.bindInteger(6, z12 ? 1 : 0);
                        executeFast.bindInteger(7, z13 ? 1 : 0);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = siVar.getMessagesStorage().f27216b.executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                    executeFast2.requery();
                    executeFast2.bindInteger(1, i12);
                    if (z13) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    executeFast2.bindInteger(2, i10);
                    executeFast2.bindInteger(3, z13 ? 1 : 0);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        });
    }

    public final void M0() {
        if (!getUserConfig().f24960w && !this.f26828x1) {
            this.f26828x1 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new jh(this, 0));
        }
    }

    public final void M1(long j3, long j10, int i7, int i10) {
        getMessagesStorage().f27214a.c(new mg(this, j10, j3, i7, i10, 1));
    }

    public final void N(int i7, boolean z10) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.I0;
        if (zArr[i7]) {
            return;
        }
        zArr[i7] = true;
        if (z10) {
            getMessagesStorage().f27214a.c(new ng(this, i7, 1));
            return;
        }
        long[] jArr = this.E0;
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

    public final void N0(boolean z10, boolean z11) {
        long j3;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.f26827x0;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().f27214a.c(new qh(this, z10, 1));
            return;
        }
        long[] jArr = this.f26809q0;
        if (z10) {
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
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new sf(this, z10, j3, 0));
    }

    public final void N1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        TLRPC.StickerSet stickerSet;
        int i7;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.J.k(tL_messages_stickerSet, stickerSet.f28425id);
            if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
                this.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            }
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.H;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList = arrayListArr[i10];
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i11);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.f28425id == tL_messages_stickerSet.set.f28425id) {
                            arrayList.set(i11, tL_messages_stickerSet);
                        }
                    }
                }
                i10++;
            }
            long j3 = tL_messages_stickerSet.set.f28425id;
            a0.h hVar = this.N;
            if (hVar.d(j3)) {
                hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f28425id);
            }
            Z1(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
            if (stickerSet3.masks) {
                i7 = 1;
            } else if (stickerSet3.emojis) {
                i7 = 5;
            } else {
                i7 = 0;
            }
            if (z10) {
                getNotificationCenter().k(ls.f25376x0, Integer.valueOf(i7), Boolean.TRUE);
            }
        }
    }

    public final void O(String[] strArr, boolean z10) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = this.C1;
                    if (hashMap.get(str) == null) {
                        if (!z10 || !this.D1.contains(str)) {
                            hashMap.put(str, Boolean.TRUE);
                            getMessagesStorage().f27214a.c(new ih(this, str, 5));
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

    public final void O0(TLRPC.StickerSet stickerSet, boolean z10) {
        if (z10) {
            getMessagesStorage().f27214a.c(new z4(29, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.f28418id = stickerSet.f28425id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new jh(this, 6));
    }

    public final void O1(int i7, int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        getMessagesStorage().f27214a.c(new b1(this, arrayList2, i7, i10, j3));
    }

    public final void P(TLRPC.InputStickerSet inputStickerSet, r10 r10Var) {
        String z02 = z0(inputStickerSet);
        HashMap hashMap = this.L0;
        ArrayList arrayList = (ArrayList) hashMap.get(z02);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(r10Var);
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(z02, arrayList);
        }
        arrayList.add(r10Var);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xh(this, z02, 0));
    }

    public final void P0(boolean z10) {
        if (!this.f26806o1 && getUserConfig().W) {
            if (z10) {
                if (!this.n1) {
                    this.f26806o1 = true;
                    getMessagesStorage().f27214a.c(new fg(this, 14));
                    this.n1 = true;
                    return;
                }
                return;
            }
            this.f26806o1 = true;
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

    public final void Q(ArrayList arrayList, Integer num, boolean z10, boolean z11, Runnable runnable) {
        if (arrayList.isEmpty()) {
            runnable.run();
            return;
        }
        ArrayList[] arrayListArr = {u0(5)};
        lh lhVar = new lh(this, num, arrayList, z11, z10, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 == null || arrayList2.isEmpty()) && !this.E1) {
            this.E1 = true;
            boolean[] zArr = new boolean[1];
            g0.g3(new ul(this, zArr, arrayListArr, lhVar, 14));
            g0.h3(new z4(28, zArr, lhVar), 900L);
            return;
        }
        lhVar.run();
    }

    public final void Q0(final long r17, final int r19, final int r20, final int r21, final int r22, final long r23, int r25, final int r26, final int r27, ch.p0 r28, java.lang.String r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.Q0(long, int, int, int, int, long, int, int, int, ch.p0, java.lang.String):void");
    }

    public final void Q1(long j3) {
        ArrayList arrayList = this.f26800k1;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((TLRPC.TL_topPeer) arrayList.get(i7)).peer.user_id == j3) {
                arrayList.remove(i7);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().l1(j3);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.k5(11));
                getMessagesStorage().f27214a.c(new di.c9(this, j3, 1, 4));
                getNotificationCenter().k(ls.T0, new Object[0]);
                return;
            }
        }
    }

    public final java.util.ArrayList R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.R():java.util.ArrayList");
    }

    public final void R0() {
        if (!this.f26792g1 && this.M0 == 0) {
            boolean[] zArr = this.Y0;
            if (!zArr[0] || this.O0 != 0 || !zArr[1]) {
                int i7 = this.f26790f1;
                this.f26790f1 = this.Z0.size();
                this.f26792g1 = true;
                c2(null, this.Q0, this.O0, this.T0, 1, this.P0, false, this.U0, this.V0, false, this.R0);
                this.f26790f1 = i7;
            }
        }
    }

    public final void R1(int i7) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.Z0;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i7 == ((gj) arrayList.get(i11)).e1()) {
                this.f26784d1.add((gj) arrayList.remove(i11));
                i11--;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26776a1;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (i7 == ((gj) arrayList2.get(i12)).e1()) {
                arrayList2.remove(i12);
                i12--;
            }
            i12++;
        }
        while (i10 < this.f26779b1.size()) {
            if (i7 == ((gj) this.f26779b1.get(i10)).e1()) {
                this.f26779b1.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final String S() {
        String str = this.f26814s;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        String string = np.u1(this.currentAccount).i7.getString("reaction_on_double_tap", null);
        if (string != null && (this.f26811r.get(string) != null || string.startsWith("animated_"))) {
            this.f26814s = string;
            return string;
        }
        return ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
    }

    public final ArrayList S0(long j3, long j10, ArrayList arrayList, boolean z10) {
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
            long j11 = getUserConfig().f24951n;
            Object obj = join;
            char c11 = 2;
            ?? r10 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().f27216b.queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", obj, Long.valueOf(j3)), new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r10);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j11);
                        TLdeserialize.f28419id = queryFinalized.intValue(i11);
                        c10 = 2;
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j3;
                        ur.e(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.f28419id));
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
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().f27216b;
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
                            ur.e(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.f28419id));
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
                    tL_channels_getMessages.channel = getMessagesController().j1(j10);
                    tL_channels_getMessages.f28436id = arrayList4;
                    arrayList2 = arrayList9;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new bg(this, j10, j3, tL_channels_getMessages));
                } else {
                    arrayList2 = arrayList9;
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f28494id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new ho(this, j3, tL_messages_getMessages, 1));
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
                        return m(arrayList5, arrayList6, arrayList3, true, true);
                    }
                    m(arrayList5, arrayList6, arrayList3, true, false);
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

    public final void S1(long j3) {
        for (int i7 = 0; i7 < this.f26798j1.size(); i7++) {
            if (((TLRPC.TL_topPeer) this.f26798j1.get(i7)).peer.user_id == j3) {
                this.f26798j1.remove(i7);
                getNotificationCenter().k(ls.S0, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().l1(j3);
                getMessagesStorage().f27214a.c(new di.c9(this, j3, 0, 4));
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.k5(11));
                return;
            }
        }
    }

    public final TLRPC.DraftMessage T(long j3, long j10) {
        a0.h hVar = (a0.h) this.f26820u1.f(j3);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) hVar.f(j10);
    }

    public final void T0(final int i7, final int i10, final long j3) {
        a0.h hVar = this.f26810q1;
        if (hVar.h(j3) >= 0) {
            return;
        }
        hVar.k(Boolean.TRUE, j3);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().l1(j3);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i7;
        tL_messages_search.f28509q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i11;
                boolean z10;
                a0.h hVar2;
                si siVar = si.this;
                siVar.getClass();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                boolean z11 = tLObject instanceof TLRPC.messages_Messages;
                int i12 = i10;
                int i13 = 1;
                if (z11) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages.users.size(); i14++) {
                        TLRPC.User user = messages_messages.users.get(i14);
                        hVar3.k(user, user.f28547id);
                    }
                    a0.h hVar4 = new a0.h();
                    for (int i15 = 0; i15 < messages_messages.chats.size(); i15++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i15);
                        hVar4.k(chat, chat.f28398id);
                    }
                    siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    siVar.getMessagesController().f4(messages_messages.users, false);
                    siVar.getMessagesController().Z3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.Message message = messages_messages.messages.get(i16);
                        if ((message instanceof TLRPC.TL_messageService) || (message instanceof TLRPC.TL_messageEmpty)) {
                            hVar2 = hVar4;
                        } else {
                            arrayList.add(Integer.valueOf(message.f28419id));
                            hVar2 = hVar4;
                            hashMap.put(Integer.valueOf(message.f28419id), new gj(siVar.currentAccount, message, hVar3, hVar2, false, false));
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
                    z10 = i13;
                } else {
                    if (i12 != 0) {
                        arrayList.add(Integer.valueOf(i12));
                    } else {
                        i13 = 0;
                    }
                    i11 = i13;
                    z10 = false;
                }
                ur messagesStorage = siVar.getMessagesStorage();
                long j10 = j3;
                messagesStorage.c2(j10, arrayList, true, i11, i7, z10, hashMap);
                g0.g3(new xg(siVar, j10, 1));
            }
        });
    }

    public final void T1(int i7, ArrayList arrayList) {
        ArrayList[] arrayListArr = this.H;
        Collections.sort(arrayListArr[i7], new gh(0, arrayList));
        this.Y[i7] = s(arrayListArr[i7]);
        getNotificationCenter().k(ls.f25376x0, Integer.valueOf(i7), Boolean.FALSE);
    }

    public final ni U(long j3, long j10) {
        boolean z10;
        boolean z11;
        if (!this.Q1) {
            Set<Map.Entry<String, ?>> entrySet = t0.f26895b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
            this.R1.b();
            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                ni niVar = null;
                if (str != null) {
                    try {
                        if (str.startsWith("@")) {
                            String[] split = str.substring(1).split("\n");
                            if (split.length >= 6) {
                                ni niVar2 = new ni();
                                niVar2.f25731a = split[0];
                                niVar2.f25732b = Long.parseLong(split[1]);
                                niVar2.f25733c = Integer.parseInt(split[2]);
                                niVar2.d = Long.parseLong(split[3]);
                                if (split[4].contains(";")) {
                                    String[] split2 = split[4].split(";");
                                    if (Integer.parseInt(split2[0]) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    niVar2.f25736g = z11;
                                    niVar2.h = Float.parseFloat(split2[1]);
                                    niVar2.f25737i = Float.parseFloat(split2[2]);
                                } else {
                                    if (Integer.parseInt(split[4]) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    niVar2.f25736g = z10;
                                    niVar2.h = 0.0f;
                                    niVar2.f25737i = 1.0f;
                                }
                                int length = split.length - 5;
                                String[] strArr = new String[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    strArr[i7] = split[i7 + 5];
                                }
                                String join = TextUtils.join("\n", strArr);
                                niVar2.f25735f = new short[join.length()];
                                int i10 = 0;
                                while (true) {
                                    short[] sArr = niVar2.f25735f;
                                    if (i10 >= sArr.length) {
                                        break;
                                    }
                                    sArr[i10] = (short) join.charAt(i10);
                                    i10++;
                                }
                                niVar = niVar2;
                            }
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (niVar != null) {
                    this.R1.k(niVar, Long.parseLong(key));
                }
            }
            this.Q1 = true;
        }
        return (ni) this.R1.f(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)));
    }

    public final void U0(boolean z10) {
        this.F = true;
        if (z10) {
            getMessagesStorage().f27214a.c(new fg(this, 18));
            return;
        }
        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new jh(this, 9));
    }

    public final void U1(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.U1(org.telegram.tgnet.TLRPC$TL_messages_stickerSet):void");
    }

    public final TLRPC.Document V(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList u02 = u0(4);
        int size = u02.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u02.get(i7);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) this.I[4].f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public final void V0(boolean z10, Integer num) {
        int i7;
        this.f26823w = true;
        if (z10) {
            getMessagesStorage().f27214a.c(new fg(this, 15));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = this.f26788f;
        }
        tL_messages_getAvailableReactions.hash = i7;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new jh(this, 3));
    }

    public final void V1(long r23, long r25, java.lang.CharSequence r27, java.util.ArrayList r28, org.telegram.tgnet.TLRPC.Message r29, org.telegram.ui.rm r30, org.telegram.tgnet.TLRPC.SuggestedPost r31, long r32, boolean r34, boolean r35, org.telegram.tgnet.tl.TL_iv.RichMessage r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.V1(long, long, java.lang.CharSequence, java.util.ArrayList, org.telegram.tgnet.TLRPC$Message, org.telegram.ui.rm, org.telegram.tgnet.TLRPC$SuggestedPost, long, boolean, boolean, org.telegram.tgnet.tl.TL_iv$RichMessage):void");
    }

    public final void W(String[] strArr, String str, boolean z10, pi piVar, boolean z11) {
        X(strArr, str, z10, piVar, z11, false, false, false, null);
    }

    public final void W1(final long j3, final long j10, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z10) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        final long j11;
        TLRPC.Chat O0;
        final long j12;
        StringBuilder sb2;
        if (getMessagesController().y2(j3) && j10 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences sharedPreferences = this.f26825w1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        np messagesController = getMessagesController();
        a0.h hVar = this.f26820u1;
        a0.h hVar2 = this.f26822v1;
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar3 = (a0.h) hVar.f(j3);
            if (hVar3 == null) {
                hVar3 = new a0.h();
                hVar.k(hVar3, j3);
            }
            hVar3.k(draftMessage, j10);
            int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 == 0) {
                messagesController.a4(j3, draftMessage);
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
            a0.h hVar6 = messagesController.R;
            TLRPC.Dialog dialog = (TLRPC.Dialog) hVar6.f(j3);
            if (dialog != null && dialog.top_message == 0) {
                hVar6.l(dialog.f28402id);
                messagesController.f25972y.remove(dialog);
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
        if (z10) {
            if (j10 == 0 || getMessagesController().y2(j3)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == 0 || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    if ((inputReplyTo.flags & 2) != 0) {
                        j11 = n5.n(inputReplyTo.reply_to_peer_id);
                    } else {
                        j11 = j3;
                    }
                    if (n5.E(j11)) {
                        user = getMessagesController().c2(Long.valueOf(j11));
                        O0 = null;
                    } else {
                        O0 = getMessagesController().O0(Long.valueOf(-j11));
                    }
                    if (user != null || O0 != null) {
                        if (v3.T(O0)) {
                            j12 = O0.f28398id;
                        } else {
                            j12 = 0;
                        }
                        final int i10 = draftMessage.reply_to.reply_to_msg_id;
                        getMessagesStorage().f27214a.c(new Runnable() {
                            @Override
                            public final void run() {
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                NativeByteBuffer byteBufferValue;
                                final si siVar = si.this;
                                int i11 = i10;
                                long j13 = j11;
                                try {
                                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27216b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i11 + " and uid = " + j13, new Object[0]);
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            message4 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            message4.readAttachPath(byteBufferValue2, siVar.getUserConfig().f24951n);
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
                                                        TLdeserialize.readAttachPath(byteBufferValue, siVar.getUserConfig().f24951n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message5 = message4.replyMessage;
                                                        if (message5 != null) {
                                                            ur.e(message5, arrayList, arrayList2, null);
                                                        }
                                                    }
                                                    if (message4.replyMessage == null) {
                                                        ur.d(message4, hVar8, hVar9);
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                siVar.getMessagesStorage().o(e12, true);
                                            }
                                            siVar.getMessagesStorage().K0(hVar8, hVar9, arrayList, arrayList2, 0);
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
                                            tL_channels_getMessages.channel = siVar.getMessagesController().j1(j16);
                                            tL_channels_getMessages.f28436id.add(Integer.valueOf(i11));
                                            siVar.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    TLRPC.Message message6;
                                                    TLRPC.Message message7;
                                                    switch (r6) {
                                                        case 0:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                    g0.g3(new t8(siVar, j14, j15, message6, 1));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            if (tL_error == null) {
                                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                                if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                    g0.g3(new t8(siVar, j14, j15, message7, 1));
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
                                        tL_messages_getMessages.f28494id.add(Integer.valueOf(i11));
                                        siVar.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                TLRPC.Message message6;
                                                TLRPC.Message message7;
                                                switch (r6) {
                                                    case 0:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                g0.g3(new t8(siVar, j14, j15, message6, 1));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                g0.g3(new t8(siVar, j14, j15, message7, 1));
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
                                    g0.g3(new t8(siVar, j14, j15, message3, 1));
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                        });
                    }
                }
                getNotificationCenter().k(ls.W0, Long.valueOf(j3));
            }
        }
    }

    public final void X(final String[] strArr, final String str, final boolean z10, final pi piVar, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final Integer num) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(j6.f24800i);
            getMessagesStorage().f27214a.c(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fh.run():void");
                }
            });
            return;
        }
        piVar.e(null, new ArrayList());
    }

    public final void X0(boolean z10) {
        if (!this.I1) {
            if (!this.J1 || z10) {
                final SharedPreferences e10 = f3.e(new StringBuilder("recent_reactions_"), this.currentAccount, t0.f26895b, 0);
                final SharedPreferences e11 = f3.e(new StringBuilder("top_reactions_"), this.currentAccount, t0.f26895b, 0);
                this.F1.clear();
                this.G1.clear();
                this.F1.addAll(W0(e10));
                this.G1.addAll(W0(e11));
                this.I1 = true;
                this.J1 = true;
                final boolean[] zArr = new boolean[2];
                TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
                tL_messages_getRecentReactions.hash = e10.getLong("hash", 0L);
                tL_messages_getRecentReactions.limit = 50;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) {
                    public final si f23517b;

                    {
                        this.f23517b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final si siVar = this.f23517b;
                                final SharedPreferences sharedPreferences = e10;
                                final boolean[] zArr2 = zArr;
                                g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                si siVar2 = siVar;
                                                ArrayList arrayList = siVar2.F1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        si.X1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr3 = zArr2;
                                                zArr3[0] = true;
                                                if (zArr3[1]) {
                                                    siVar2.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                si siVar3 = siVar;
                                                ArrayList arrayList2 = siVar3.G1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        si.X1(sharedPreferences, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr2;
                                                zArr4[1] = true;
                                                if (zArr4[0]) {
                                                    siVar3.I1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final si siVar2 = this.f23517b;
                                final SharedPreferences sharedPreferences2 = e10;
                                final boolean[] zArr3 = zArr;
                                g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                si siVar22 = siVar2;
                                                ArrayList arrayList = siVar22.F1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        si.X1(sharedPreferences2, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr3;
                                                zArr32[0] = true;
                                                if (zArr32[1]) {
                                                    siVar22.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                si siVar3 = siVar2;
                                                ArrayList arrayList2 = siVar3.G1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        si.X1(sharedPreferences2, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr3;
                                                zArr4[1] = true;
                                                if (zArr4[0]) {
                                                    siVar3.I1 = false;
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
                tL_messages_getTopReactions.hash = e11.getLong("hash", 0L);
                tL_messages_getTopReactions.limit = 100;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) {
                    public final si f23517b;

                    {
                        this.f23517b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final si siVar = this.f23517b;
                                final SharedPreferences sharedPreferences = e11;
                                final boolean[] zArr2 = zArr;
                                g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                si siVar22 = siVar;
                                                ArrayList arrayList = siVar22.F1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        si.X1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr2;
                                                zArr32[0] = true;
                                                if (zArr32[1]) {
                                                    siVar22.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                si siVar3 = siVar;
                                                ArrayList arrayList2 = siVar3.G1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        si.X1(sharedPreferences, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr2;
                                                zArr4[1] = true;
                                                if (zArr4[0]) {
                                                    siVar3.I1 = false;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final si siVar2 = this.f23517b;
                                final SharedPreferences sharedPreferences2 = e11;
                                final boolean[] zArr3 = zArr;
                                g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r6) {
                                            case 0:
                                                si siVar22 = siVar2;
                                                ArrayList arrayList = siVar22.F1;
                                                if (tL_error == null) {
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                        arrayList.clear();
                                                        arrayList.addAll(tL_messages_reactions.reactions);
                                                        si.X1(sharedPreferences2, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                    }
                                                }
                                                boolean[] zArr32 = zArr3;
                                                zArr32[0] = true;
                                                if (zArr32[1]) {
                                                    siVar22.I1 = false;
                                                    return;
                                                }
                                                return;
                                            default:
                                                si siVar3 = siVar2;
                                                ArrayList arrayList2 = siVar3.G1;
                                                if (tL_error == null) {
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                        TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(tL_messages_reactions2.reactions);
                                                        si.X1(sharedPreferences2, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                    }
                                                }
                                                boolean[] zArr4 = zArr3;
                                                zArr4[1] = true;
                                                if (zArr4[0]) {
                                                    siVar3.I1 = false;
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

    public final ArrayList Y(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int min;
        String str;
        int i10;
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
        while (z11) {
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
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                i17 = indexOf;
                i18 = indexOf + i10;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (z13) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
                for (int i19 = i11 + indexOf; i19 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i19) == '`'; i19++) {
                    indexOf++;
                }
                if (z13) {
                    i12 = 3;
                } else {
                    i12 = 1;
                }
                int i20 = i12 + indexOf;
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
                    int i21 = i17 + 3;
                    int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i21);
                    String str3 = "";
                    if (indexOf2 < 0 || indexOf2 - i21 <= 0) {
                        str2 = "";
                    } else {
                        str2 = charSequenceArr[0].toString().substring(i21, indexOf2);
                    }
                    CharSequence i22 = i2(0, i17 - i13, charSequenceArr[0]);
                    int length = str2.length() + i21 + (!str2.isEmpty());
                    if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                        CharSequence i23 = i2(length, indexOf, charSequenceArr[0]);
                        int i24 = indexOf + 3;
                        if (i24 < charSequenceArr[0].length()) {
                            c11 = charSequenceArr[0].charAt(i24);
                        } else {
                            c11 = 0;
                        }
                        CharSequence charSequence2 = charSequenceArr[0];
                        if (c11 != ' ' && c11 != '\n') {
                            i14 = 0;
                        } else {
                            i14 = 1;
                        }
                        CharSequence i25 = i2(i24 + i14, charSequence2.length(), charSequence2);
                        if (i22.length() != 0) {
                            i22 = g0.C(i22, "\n");
                        } else {
                            i13 = 1;
                        }
                        if (i25.length() > 0 && i25.charAt(0) != '\n') {
                            i25 = g0.C("\n", i25);
                        }
                        if (i23.length() > 0 && i23.charAt(i23.length() - 1) == '\n') {
                            i23 = i2(0, i23.length() - 1, i23);
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        if (!TextUtils.isEmpty(i23)) {
                            if (i23.length() > 1 && i23.charAt(0) == '\n') {
                                i23 = i23.subSequence(1, i23.length());
                                indexOf--;
                            }
                            charSequenceArr[0] = g0.C(i22, i23, i25);
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            int i26 = i13 ^ 1;
                            tL_messageEntityPre.offset = i17 + i26;
                            tL_messageEntityPre.length = ((((indexOf - i17) - 3) - (str2.length() + (!str2.isEmpty()))) + i26) - i15;
                            if (!TextUtils.isEmpty(str2) && str2.trim().length() != 0) {
                                str3 = str2;
                            }
                            tL_messageEntityPre.language = str3;
                            arrayList.add(tL_messageEntityPre);
                            i20 -= 6;
                        }
                        i18 = i20;
                        z13 = false;
                        i16 = -1;
                        i17 = -1;
                    }
                    i18 = i20;
                    i16 = -1;
                } else {
                    int i27 = i17 + 1;
                    if (i27 != indexOf) {
                        CharSequence charSequence3 = charSequenceArr[0];
                        if ((charSequence3 instanceof Spanned) && ((qi.g[]) ((Spanned) charSequence3).getSpans(Utilities.j(i17, charSequence3.length(), 0), Utilities.j(i27, charSequenceArr[0].length(), 0), qi.g.class)).length > 0) {
                            i18 = i20;
                            i16 = -1;
                        } else {
                            CharSequence i28 = i2(0, i17, charSequenceArr[0]);
                            CharSequence i29 = i2(i27, indexOf, charSequenceArr[0]);
                            CharSequence charSequence4 = charSequenceArr[0];
                            charSequenceArr[0] = g0.C(i28, i29, i2(indexOf + 1, charSequence4.length(), charSequence4));
                            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                            tL_messageEntityCode.offset = i17;
                            tL_messageEntityCode.length = (indexOf - i17) - 1;
                            arrayList.add(tL_messageEntityCode);
                            i20 -= 2;
                        }
                    }
                    i18 = i20;
                    z13 = false;
                    i16 = -1;
                    i17 = -1;
                }
            }
        }
        if (i17 != i16 && z13) {
            CharSequence i210 = i2(0, i17, charSequenceArr[0]);
            CharSequence charSequence5 = charSequenceArr[0];
            charSequenceArr[0] = g0.C(i210, i2(i17 + 2, charSequence5.length(), charSequence5));
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
            gz0[] gz0VarArr = (gz0[]) spanned.getSpans(0, charSequence6.length(), gz0.class);
            if (gz0VarArr != null && gz0VarArr.length > 0) {
                for (gz0 gz0Var : gz0VarArr) {
                    int spanStart = spanned.getSpanStart(gz0Var);
                    int spanEnd = spanned.getSpanEnd(gz0Var);
                    if (!A(spanStart, arrayList, false) && !A(spanEnd, arrayList, true)) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i30 = 0; i30 < size; i30++) {
                                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i30);
                                int i31 = messageEntity.offset;
                                if (i31 <= spanStart || i31 + messageEntity.length > spanEnd) {
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        e(gz0Var.f35683b.f35299a, spanStart, spanEnd, arrayList);
                    }
                }
            }
            v41[] v41VarArr = (v41[]) spanned.getSpans(0, charSequenceArr[0].length(), v41.class);
            if (v41VarArr != null && v41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i32 = 0; i32 < v41VarArr.length; i32++) {
                    TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                    np messagesController = getMessagesController();
                    tL_inputMessageEntityMentionName.user_id = messagesController.s1(messagesController.c2(Utilities.A(v41VarArr[i32].getURL())));
                    tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(v41VarArr[i32]);
                    tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(v41VarArr[i32]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                    if (charSequenceArr[0].charAt((i7 + min) - 1) == ' ') {
                        tL_inputMessageEntityMentionName.length--;
                    }
                    arrayList.add(tL_inputMessageEntityMentionName);
                }
            }
            u41[] u41VarArr = (u41[]) spanned.getSpans(0, charSequenceArr[0].length(), u41.class);
            if (u41VarArr != null && u41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i33 = 0; i33 < u41VarArr.length; i33++) {
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = spanned.getSpanStart(u41VarArr[i33]);
                    tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(u41VarArr[i33]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                    tL_messageEntityTextUrl.url = u41VarArr[i33].getURL();
                    arrayList.add(tL_messageEntityTextUrl);
                    fz0 fz0Var = u41VarArr[i33].f40242a;
                    if (fz0Var != null) {
                        int i34 = fz0Var.f35299a;
                        int i35 = tL_messageEntityTextUrl.offset;
                        e(i34, i35, tL_messageEntityTextUrl.length + i35, arrayList);
                    }
                }
            }
            org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.y5.class);
            if (y5VarArr != null && y5VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                    if (y5Var != null) {
                        try {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(y5Var);
                            tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(y5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                            tL_messageEntityCustomEmoji.document_id = y5Var.getDocumentId();
                            tL_messageEntityCustomEmoji.document = y5Var.document;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                }
            }
            qi.g[] gVarArr = (qi.g[]) spanned.getSpans(0, charSequenceArr[0].length(), qi.g.class);
            if (gVarArr != null && gVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (qi.g gVar : gVarArr) {
                    if (gVar != null) {
                        try {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre2.offset = spanned.getSpanStart(gVar);
                            tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(gVar), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                            tL_messageEntityPre2.language = gVar.f56189a;
                            arrayList.add(tL_messageEntityPre2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                }
            }
            jh0[] jh0VarArr = (jh0[]) spanned.getSpans(0, charSequenceArr[0].length(), jh0.class);
            if (jh0VarArr != null && jh0VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (jh0 jh0Var : jh0VarArr) {
                    if (jh0Var != null) {
                        try {
                            TLRPC.TL_messageEntityBlockquote tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                            tL_messageEntityBlockquote.offset = spanned.getSpanStart(jh0Var);
                            tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(jh0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                            tL_messageEntityBlockquote.collapsed = jh0Var.f36463e;
                            arrayList.add(tL_messageEntityBlockquote);
                        } catch (Exception e12) {
                            a8.g(e12, true);
                        }
                    }
                }
            }
            org.telegram.ui.Components.m00[] m00VarArr = (org.telegram.ui.Components.m00[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.m00.class);
            if (m00VarArr != null && m00VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.m00 m00Var : m00VarArr) {
                    if (m00Var != null) {
                        try {
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.offset = spanned.getSpanStart(m00Var);
                            tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(m00Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = m00Var.f37328b;
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
                    for (int i36 = 0; i36 < uRLSpanArr.length; i36++) {
                        URLSpan uRLSpan = uRLSpanArr[i36];
                        if (!(uRLSpan instanceof u41) && !(uRLSpan instanceof v41) && !(uRLSpan instanceof org.telegram.ui.Components.m00)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i36]);
                            tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i36]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                            tL_messageEntityUrl.url = uRLSpanArr[i36].getURL();
                            arrayList.add(tL_messageEntityUrl);
                            spannable.removeSpan(uRLSpanArr[i36]);
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
            Matcher matcher = f26773h2.matcher(charSequence7);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                int i37 = 0;
                while (true) {
                    if (i37 < arrayList.size()) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i37);
                        int i38 = messageEntity2.offset;
                        if (!g0.B1(start, end, i38, messageEntity2.length + i38) || (!(messageEntity2 instanceof TLRPC.TL_messageEntityPre) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCode) && !(messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress) && !(messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl))) {
                            i37++;
                        }
                    } else {
                        try {
                            z12 = WalletEngine2.isValidAddress(matcher.group());
                        } catch (Throwable th2) {
                            a8.g(th2, true);
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
            charSequence7 = m1(m1(m1(charSequence7, U1, arrayList, new fd(3)), V1, arrayList, new fd(4)), W1, arrayList, new fd(5));
            if (z10) {
                charSequence7 = m1(charSequence7, X1, arrayList, new fd(6));
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(0) == '\n' || charSequence7.charAt(0) == ' ')) {
            int i39 = 1;
            charSequence7 = charSequence7.subSequence(1, charSequence7.length());
            int i40 = 0;
            while (i40 < arrayList.size()) {
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(i40);
                int i41 = messageEntity3.offset;
                if (i41 == 0) {
                    messageEntity3.length -= i39;
                }
                messageEntity3.offset = Math.max(0, i41 - 1);
                i40++;
                i39 = 1;
            }
        }
        while (charSequence7.length() > 0 && (charSequence7.charAt(charSequence7.length() - 1) == '\n' || charSequence7.charAt(charSequence7.length() - 1) == ' ')) {
            charSequence7 = charSequence7.subSequence(0, charSequence7.length() - 1);
            for (int i42 = 0; i42 < arrayList.size(); i42++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i42);
                if (messageEntity4.offset + messageEntity4.length > charSequence7.length()) {
                    messageEntity4.length--;
                }
            }
        }
        charSequenceArr[0] = charSequence7;
        return arrayList;
    }

    public final void Y0(int r8, boolean r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.Y0(int, boolean, boolean, boolean):void");
    }

    public final void Y1(a0.h hVar, ArrayList arrayList, boolean z10) {
        getMessagesStorage().f27214a.c(new aa.c0(this, z10, arrayList, hVar, 15));
    }

    public final long Z() {
        long j3 = 0;
        int i7 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.f26817t0;
            if (i7 < arrayListArr[0].size()) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayListArr[0].get(i7)).set;
                if (!stickerSet.archived) {
                    j3 = r(j3, stickerSet.f28425id);
                }
                i7++;
            } else {
                return j3;
            }
        }
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.Z0():void");
    }

    public final void Z1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
            getMessagesStorage().f27214a.c(new dg(this, tL_messages_stickerSet, 4));
            if (!this.K0) {
                this.K0 = true;
                getMessagesStorage().f27214a.c(new fg(this, 5));
            }
        }
    }

    public final TLRPC.TL_messages_stickerSet a0(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(stickerSet.f28425id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.N.f(stickerSet.f28425id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    O0(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            O0(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    public final void a1(java.util.ArrayList r21, long r22, int r24, long r25, java.lang.Runnable r27, int r28, org.telegram.messenger.uz r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.a1(java.util.ArrayList, long, int, long, java.lang.Runnable, int, org.telegram.messenger.uz):void");
    }

    public final boolean a2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        if (this.A0.c(document.f28404id) != null) {
            return true;
        }
        int i7 = (document.size > np.u1(this.currentAccount).o4 ? 1 : (document.size == np.u1(this.currentAccount).o4 ? 0 : -1));
        int i10 = ls.S4;
        if (i7 > 0) {
            ls.e().k(i10, 4, hd.a0("TooLargeError", null, 2131743801, new Object[0]), hd.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(np.u1(k10.f24932t0).o4 / 1024)));
            return false;
        }
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > np.u1(this.currentAccount).f25876n4) {
                ls.e().k(i10, 4, hd.a0("TooLongError", null, 2131743800, new Object[0]), hd.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(np.u1(k10.f24932t0).f25876n4)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.f28610id = tL_inputDocument;
        tL_inputDocument.f28410id = document.f28404id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new t4(4, this, document));
        return true;
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7;
        long j3 = tL_messages_stickerSet.set.f28425id;
        a0.h hVar = this.J;
        if (hVar.h(j3) < 0) {
            String str = tL_messages_stickerSet.set.short_name;
            ConcurrentHashMap concurrentHashMap = this.O;
            if (!concurrentHashMap.containsKey(str)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet.masks) {
                    i7 = 1;
                } else if (stickerSet.emojis) {
                    i7 = 5;
                } else {
                    i7 = 0;
                }
                ArrayList[] arrayListArr = this.H;
                arrayListArr[i7].add(0, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f28425id);
                this.K.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f28425id);
                concurrentHashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                a0.h hVar2 = new a0.h();
                for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    hVar2.k(document, document.f28404id);
                }
                for (int i11 = 0; i11 < tL_messages_stickerSet.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                    String replace = tL_stickerPack.emoticon.replace("️", "");
                    tL_stickerPack.emoticon = replace;
                    ArrayList arrayList = (ArrayList) this.f26786e0.get(replace);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f26786e0.put(tL_stickerPack.emoticon, arrayList);
                    }
                    for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                        Long l10 = tL_stickerPack.documents.get(i12);
                        if (this.f26783d0.h(l10.longValue()) < 0) {
                            this.f26783d0.k(tL_stickerPack.emoticon, l10.longValue());
                        }
                        TLRPC.Document document2 = (TLRPC.Document) hVar2.f(l10.longValue());
                        if (document2 != null) {
                            arrayList.add(document2);
                        }
                    }
                }
                this.Y[i7] = s(arrayListArr[i7]);
                getNotificationCenter().k(ls.f25376x0, Integer.valueOf(i7), Boolean.TRUE);
                d1(i7, false, true);
            }
        }
    }

    public final void b1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.b1():void");
    }

    public final boolean b2() {
        boolean[] zArr = this.Y0;
        if ((!zArr[0] || this.O0 != 0 || !zArr[1]) && !this.f26794h1 && !this.f26796i1) {
            return false;
        }
        return true;
    }

    public final void c(TLRPC.Document document, int i7, boolean z10) {
        if (document == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.f26797j0.size()) {
                TLRPC.Document document2 = (TLRPC.Document) this.f26797j0.get(i10);
                if (document2.f28404id == document.f28404id) {
                    this.f26797j0.remove(i10);
                    this.f26797j0.add(0, document2);
                    break;
                }
                i10++;
            } else {
                this.f26797j0.add(0, document);
                break;
            }
        }
        if ((this.f26797j0.size() > getMessagesController().I4 && !k10.i(this.currentAccount).q()) || this.f26797j0.size() > getMessagesController().J4) {
            getMessagesStorage().f27214a.c(new of(this, (TLRPC.Document) p5.c.g(1, this.f26797j0), 0));
            if (z10) {
                g0.g3(new a(document, 21));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
        B1(0, arrayList, true, i7, false);
    }

    public final void c1(boolean z10) {
        if (!this.K1) {
            if (!this.L1 || z10) {
                SharedPreferences e10 = f3.e(new StringBuilder("saved_reactions_"), this.currentAccount, t0.f26895b, 0);
                this.H1.clear();
                this.H1.addAll(W0(e10));
                this.K1 = true;
                this.L1 = true;
                TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
                tL_messages_getDefaultTagReactions.hash = e10.getLong("hash", 0L);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new nf(this, e10, 1));
            }
        }
    }

    public final void c2(java.lang.String r37, final long r38, final long r40, final int r42, final int r43, final long r44, boolean r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final boolean r49, final ch.p0 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.c2(java.lang.String, long, long, int, int, long, boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, ch.p0):void");
    }

    public final void d(int i7, Object obj, TLRPC.Document document, int i10, boolean z10) {
        ArrayList[] arrayListArr;
        int i11;
        TLRPC.Document document2;
        boolean z11;
        int i12;
        if (i7 != 3) {
            if (gj.u4(document) || gj.K2(document, true)) {
                int i13 = 0;
                while (true) {
                    arrayListArr = this.f26791g0;
                    if (i13 < arrayListArr[i7].size()) {
                        TLRPC.Document document3 = (TLRPC.Document) arrayListArr[i7].get(i13);
                        if (document3.f28404id == document.f28404id) {
                            arrayListArr[i7].remove(i13);
                            if (!z10) {
                                arrayListArr[i7].add(0, document3);
                            }
                        } else {
                            i13++;
                        }
                    } else if (!z10) {
                        arrayListArr[i7].add(0, document);
                    }
                }
                int i14 = ls.S4;
                if (i7 == 2) {
                    if (z10) {
                        ls.e().k(i14, 0, document, 4);
                    } else {
                        if (arrayListArr[i7].size() > getMessagesController().f25826h3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ls e10 = ls.e();
                        if (z11) {
                            i12 = 6;
                        } else {
                            i12 = 5;
                        }
                        e10.k(i14, 0, document, Integer.valueOf(i12));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.f28484id = tL_inputDocument;
                    tL_inputDocument.f28410id = document.f28404id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z10;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new di(this, obj, tL_messages_faveSticker, 0));
                    i11 = getMessagesController().f25826h3;
                } else {
                    if (i7 == 0 && z10) {
                        ls.e().k(i14, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.f28508id = tL_inputDocument2;
                        tL_inputDocument2.f28410id = document.f28404id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new di(this, obj, tL_messages_saveRecentSticker, 1));
                    }
                    i11 = getMessagesController().f25817g3;
                }
                if (arrayListArr[i7].size() > i11 || z10) {
                    if (z10) {
                        document2 = document;
                    } else {
                        document2 = (TLRPC.Document) p5.c.g(1, arrayListArr[i7]);
                    }
                    getMessagesStorage().f27214a.c(new l7(this, i7, document2, 10));
                }
                if (!z10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(document);
                    B1(i7, arrayList, false, i10, false);
                }
                if (i7 == 2 || (i7 == 0 && z10)) {
                    getNotificationCenter().k(ls.X0, Boolean.FALSE, Integer.valueOf(i7));
                }
            }
        }
    }

    public final void d1(int i7, boolean z10, boolean z11) {
        e1(i7, z10, z11, false, null);
    }

    public final void d2(boolean z10, String str, y10 y10Var) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z10) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.f28510q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.f28512q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new d3.b(1), new q9(y10Var, 1));
    }

    public final int e0() {
        int i7 = 1;
        if (this.f26790f1 >= this.Z0.size() - 1) {
            boolean[] zArr = this.Y0;
            if (zArr[0] && zArr[1]) {
                i7 = 0;
            }
        }
        if (this.f26790f1 > 0) {
            return i7 | 2;
        }
        return i7;
    }

    public final void e1(int i7, boolean z10, boolean z11, boolean z12, y10 y10Var) {
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        boolean[] zArr = this.W;
        if (zArr[i7]) {
            if (z12) {
                this.V[i7] = new mb(this, i7, z11, y10Var);
                return;
            } else if (y10Var != null) {
                y10Var.a(null);
                return;
            } else {
                return;
            }
        }
        char c10 = 1;
        ArrayList[] arrayListArr = this.f26817t0;
        if (i7 == 3) {
            if (arrayListArr[0].isEmpty() || !getMessagesController().C3) {
                if (y10Var != null) {
                    y10Var.a(null);
                    return;
                }
                return;
            }
        } else if (i7 == 6) {
            if (arrayListArr[1].isEmpty() || !getMessagesController().C3) {
                if (y10Var != null) {
                    y10Var.a(null);
                    return;
                }
                return;
            }
        } else if (i7 != 4) {
            F0(i7, z10);
        }
        zArr[i7] = true;
        if (z10) {
            getMessagesStorage().f27214a.c(new l7(this, i7, y10Var, 6));
        } else if (i7 != 3 && i7 != 6) {
            if (i7 == 4) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new wn(this, i7, y10Var, 3));
                return;
            }
            long[] jArr = this.Y;
            long j3 = 0;
            if (i7 == 0) {
                TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
                if (!z11) {
                    j3 = jArr[i7];
                }
                tL_messages_getAllStickers.hash = j3;
                tL_messages_getMaskStickers = tL_messages_getAllStickers;
            } else if (i7 == 5) {
                TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
                if (!z11) {
                    j3 = jArr[i7];
                }
                tL_messages_getEmojiStickers.hash = j3;
                tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
            } else {
                TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
                if (!z11) {
                    j3 = jArr[i7];
                }
                tL_messages_getMaskStickers2.hash = j3;
                tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
            }
            getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new j3(i7, 1, j3, this, y10Var));
        } else {
            if (i7 != 6) {
                c10 = 0;
            }
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.f26809q0[c10];
            int size = arrayListArr[c10].size();
            for (int i10 = 0; i10 < size; i10++) {
                tL_messages_allStickers.sets.add(((TLRPC.StickerSetCovered) arrayListArr[c10].get(i10)).set);
            }
            u1(i7, tL_messages_allStickers, new gg(y10Var, 2));
        }
    }

    public final qi e2(boolean z10, String str, String str2, y10 y10Var, boolean z11) {
        qi qiVar = new qi(str, str2, z10);
        ri riVar = (ri) this.T1.get(qiVar);
        if (riVar == null || (riVar.f26583b != null && z11)) {
            HashMap hashMap = this.S1;
            if (!hashMap.containsKey(qiVar)) {
                hashMap.put(qiVar, 0);
                d0(this.currentAccount).W(new String[]{str}, str2, true, new nh(this, qiVar, riVar, y10Var), false);
                return qiVar;
            }
        }
        if (riVar != null) {
            y10Var.a(riVar.f26582a);
            return qiVar;
        }
        y10Var.a(new ArrayList());
        return qiVar;
    }

    public final void f0(final int i7, final int i10, final long j3, final long j10, boolean z10) {
        if (!z10 && !n5.C(j3)) {
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
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().l1(j10);
                    tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j10;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            tL_messages_getSearchCounters.peer = getMessagesController().l1(j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    if (tLObject instanceof Vector) {
                        Vector vector = (Vector) tLObject;
                        if (!vector.objects.isEmpty()) {
                            g0.g3(new mf(si.this, j3, false, ((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, i7, 0, j10, i10));
                        }
                    }
                }
            }), i10);
            return;
        }
        getMessagesStorage().f27214a.c(new mg(this, j10, j3, i7, i10, 0));
    }

    public final void f1(String str, boolean z10, boolean z11) {
        HashSet hashSet = this.T;
        if (!hashSet.contains(str)) {
            if (!z10 || this.R.get(str) == null) {
                hashSet.add(str);
                if (z11) {
                    getMessagesStorage().f27214a.c(new kg(this, str, z10, 1));
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                if (Objects.equals(getUserConfig().f24939c0, str)) {
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
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new p3(this, str, z10, 1));
            }
        }
    }

    public final void f2(String str) {
        np.u1(this.currentAccount).i7.edit().putString("reaction_on_double_tap", str).apply();
        this.f26814s = str;
    }

    public final void g0(long j3, int i7, long j10) {
        getMessagesStorage().f27214a.c(new kb(this, j10, j3, i7, 1));
    }

    public final void g1(boolean z10, boolean z11) {
        int i7;
        ArrayList[] arrayListArr = this.f26821v0;
        if (!arrayListArr[z10 ? 1 : 0].isEmpty()) {
            arrayListArr[z10 ? 1 : 0].clear();
            ArrayList[] arrayListArr2 = this.f26817t0;
            long q10 = q(arrayListArr2[z10 ? 1 : 0], z10);
            long[] jArr = this.f26809q0;
            jArr[z10 ? 1 : 0] = q10;
            ls notificationCenter = getNotificationCenter();
            if (z10) {
                i7 = ls.A0;
            } else {
                i7 = ls.f25390z0;
            }
            notificationCenter.k(i7, new Object[0]);
            L1(z10, arrayListArr2[z10 ? 1 : 0], arrayListArr[z10 ? 1 : 0], this.f26812r0[z10 ? 1 : 0], jArr[z10 ? 1 : 0], this.f26815s0);
            if (z11) {
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new fi.k5(11));
            }
        }
    }

    public final void g2(long j3, long j10, float f10, float f11) {
        ni U = U(j3, j10);
        if (U != null) {
            if (Math.abs(U.h - f10) >= 0.001f || Math.abs(U.f25737i - f11) >= 0.001f) {
                U.h = f10;
                U.f25737i = f11;
                Context context = t0.f26895b;
                SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
                edit.putString(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)) + "", U.toString()).apply();
            }
        }
    }

    public final void h1(long j3) {
        if (this.f26821v0[0].contains(Long.valueOf(j3))) {
            ArrayList[] arrayListArr = this.f26824w0;
            if (!arrayListArr[0].contains(Long.valueOf(j3))) {
                arrayListArr[0].add(Long.valueOf(j3));
                TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
                tL_messages_readFeaturedStickers.f28502id.add(Long.valueOf(j3));
                getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new fi.k5(11));
                g0.h3(new xg(this, j3, 3), 1000L);
            }
        }
    }

    public final void h2(org.telegram.ui.Components.q9 q9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        d0(this.currentAccount).n0(tL_inputStickerSetShortName, 0, false, false, new e3(str2, q9Var, str3, 3));
    }

    public final Integer i0(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        int i7;
        double d;
        int i10;
        double d10;
        f5.m mVar;
        f5.l lVar;
        f5.l lVar2;
        double d11;
        int i11;
        f5.m mVar2;
        f5.l lVar3;
        if ((z10 && (!r1.i().k() || r1.i().f26517e == null)) || (tL_help_premiumPromo = this.E) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i12 = 0;
        double d12 = 0.0d;
        boolean z11 = false;
        int i13 = 0;
        while (i13 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i13);
            i13++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (z10) {
                if (tL_premiumSubscriptionOption2.current) {
                    lVar2 = null;
                    if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), r1.i().f26517e)) {
                        if (s2.b() && (mVar2 = r1.f26510l) != null) {
                            ArrayList arrayList3 = mVar2.h;
                            int size2 = arrayList3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size2) {
                                    Object obj = arrayList3.get(i14);
                                    i14++;
                                    lVar3 = (f5.l) obj;
                                    String str = ((f5.j) lVar3.f11293b.f11291a.get(0)).d;
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
                                    lVar3 = lVar2;
                                    break;
                                }
                            }
                            if (lVar3 == null) {
                                d11 = tL_premiumSubscriptionOption2.amount;
                                i11 = tL_premiumSubscriptionOption2.months;
                            } else {
                                d11 = ((f5.j) lVar3.f11293b.f11291a.get(0)).f11289b;
                                i11 = tL_premiumSubscriptionOption2.months;
                            }
                        } else {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i11 = tL_premiumSubscriptionOption2.months;
                        }
                        d12 = d11 / i11;
                        z11 = true;
                    }
                }
            } else {
                lVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (s2.b()) {
                    }
                    d11 = tL_premiumSubscriptionOption2.amount;
                    i11 = tL_premiumSubscriptionOption2.months;
                    d12 = d11 / i11;
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.E.period_options;
        int size3 = arrayList4.size();
        int i16 = 0;
        int i17 = 0;
        while (i17 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i17);
            i17++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (!s2.b() && (mVar = r1.f26510l) != null) {
                    ArrayList arrayList5 = mVar.h;
                    int size4 = arrayList5.size();
                    int i18 = i12;
                    while (true) {
                        if (i18 < size4) {
                            Object obj2 = arrayList5.get(i18);
                            i18++;
                            lVar = (f5.l) obj2;
                            String str2 = ((f5.j) lVar.f11293b.f11291a.get(i12)).d;
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
                            lVar = null;
                            break;
                        }
                    }
                    if (lVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i7 = 0;
                        i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                    } else {
                        i7 = 0;
                        d = ((f5.j) lVar.f11293b.f11291a.get(0)).f11289b;
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
        if (!z11 || i16 <= 0) {
            return null;
        }
        return Integer.valueOf(i16);
    }

    public final void i1(long j3, boolean z10) {
        this.M.remove(Long.valueOf(j3));
        ArrayList arrayList = this.L;
        if (z10 && !arrayList.contains(Long.valueOf(j3))) {
            arrayList.add(Long.valueOf(j3));
        }
        if (!z10) {
            arrayList.remove(Long.valueOf(j3));
        }
    }

    public final TLRPC.TL_help_premiumPromo j0() {
        return this.E;
    }

    public final void j1(long j3, boolean z10) {
        this.L.remove(Long.valueOf(j3));
        ArrayList arrayList = this.M;
        if (z10 && !arrayList.contains(Long.valueOf(j3))) {
            arrayList.add(Long.valueOf(j3));
        }
        if (!z10) {
            arrayList.remove(Long.valueOf(j3));
        }
    }

    public final void j2(long j3, long j10, boolean z10) {
        ni U = U(j3, j10);
        if (U != null && U.f25736g != z10) {
            U.f25736g = z10;
            Context context = t0.f26895b;
            SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
            edit.putString(Objects.hash(Long.valueOf(j3), Long.valueOf(j10)) + "", U.toString()).apply();
        }
    }

    public final SharedPreferences k() {
        if (this.f26816s1 == null) {
            SharedPreferences e10 = f3.e(new StringBuilder("ai_chat_styles"), this.currentAccount, t0.f26895b, 0);
            this.f26816s1 = e10;
            for (Map.Entry<String, ?> entry : e10.getAll().entrySet()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
                    TL_aicompose.inputAiComposeStyle TLdeserialize = TL_aicompose.inputAiComposeStyle.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                    if (TLdeserialize != null) {
                        this.f26813r1.k(TLdeserialize, Utilities.A(entry.getKey()).longValue());
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
        return this.f26816s1;
    }

    public final ArrayList k0(int i7, boolean z10) {
        ArrayList[] arrayListArr = this.f26791g0;
        ArrayList arrayList = arrayListArr[i7];
        if (i7 == 7) {
            return new ArrayList(arrayListArr[i7]);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z10 && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public final void k1(long j3, boolean z10, boolean z11) {
        int i7;
        if (z10) {
            i7 = 5;
        } else if (z11) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ArrayList u02 = u0(i7);
        if (u02 != null) {
            for (int i10 = 0; i10 < u02.size(); i10++) {
                if (((TLRPC.TL_messages_stickerSet) u02.get(i10)).set.f28425id == j3) {
                    u02.remove(i10);
                    u02.add(0, (TLRPC.TL_messages_stickerSet) u02.get(i10));
                    getNotificationCenter().k(ls.f25376x0, Integer.valueOf(i7), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final void k2(Context context, TLObject tLObject, int i7, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11) {
        l2(context, tLObject, null, i7, g2Var, null, z10, z11, null, true);
    }

    public final boolean l(long j3) {
        for (int i7 = 0; i7 < this.f26777b.bots.size(); i7++) {
            if (this.f26777b.bots.get(i7).bot_id == j3) {
                return true;
            }
        }
        return false;
    }

    public final int l0() {
        ArrayList arrayList = this.f26776a1;
        boolean isEmpty = arrayList.isEmpty();
        int[] iArr = this.X0;
        if (isEmpty) {
            return Math.max(Math.max(iArr[0] + iArr[1], this.W0), arrayList.size());
        }
        return Math.max(iArr[0] + iArr[1], arrayList.size());
    }

    public final void l1(String str, TLRPC.Document document, boolean z10) {
        this.f26775a0.remove(str);
        yf.c cVar = this.A0;
        ArrayList arrayList = cVar.f61203e;
        boolean z11 = true;
        if (z10) {
            int i7 = 0;
            while (true) {
                if (i7 < arrayList.size()) {
                    if (((yf.b) arrayList.get(i7)).d && str.equals(((yf.b) arrayList.get(i7)).f61196b)) {
                        arrayList.remove(i7);
                        break;
                    }
                    i7++;
                } else {
                    z11 = false;
                    break;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((yf.b) arrayList.get(i10)).d && str.equals(((yf.b) arrayList.get(i10)).f61196b)) {
                        ((yf.b) arrayList.get(i10)).d = false;
                        ((yf.b) arrayList.get(i10)).f61195a = document;
                        break;
                    }
                    i10++;
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
            ls.f(cVar.f61202c).k(ls.f25285h5, new Object[0]);
        }
    }

    public final void l2(final android.content.Context r22, final org.telegram.tgnet.TLObject r23, final org.telegram.tgnet.TLRPC.Document r24, final int r25, final org.telegram.ui.ActionBar.g2 r26, final android.widget.FrameLayout r27, final boolean r28, boolean r29, java.lang.Runnable r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.l2(android.content.Context, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document, int, org.telegram.ui.ActionBar.g2, android.widget.FrameLayout, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    public final ArrayList m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z10, boolean z11) {
        boolean z12;
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
            hVar.k(user, user.f28547id);
        }
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
            hVar2.k(chat, chat.f28398id);
        }
        ArrayList arrayList4 = new ArrayList();
        if (z11) {
            g0.g3(new aa.c0(this, arrayList2, z10, arrayList3, 14));
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                if ((gj.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                    i11++;
                }
                a0.h hVar3 = hVar2;
                int i13 = i11;
                int i14 = this.currentAccount;
                if (i13 < 30) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                arrayList4.add(new gj(i14, message, hVar, hVar3, false, z12));
                i12++;
                hVar2 = hVar3;
                i11 = i13;
            }
            return arrayList4;
        }
        g0.g3(new bh(this, arrayList2, z10, arrayList3, arrayList, arrayList4, hVar, hVar2));
        return null;
    }

    public final void m2(final Context context, int i7, final org.telegram.ui.ActionBar.g2 g2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i10, final boolean z11) {
        boolean z12;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j3 = stickerSet.f28425id;
        tL_inputStickerSetID.f28418id = j3;
        if (i7 != 0) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            if (i7 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            tL_messages_installStickerSet.archived = z12;
            i1(stickerSet.f28425id, true);
            getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final si siVar = si.this;
                    final TLRPC.StickerSet stickerSet2 = stickerSet;
                    final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    final boolean z13 = z10;
                    final int i11 = i10;
                    final boolean z14 = z11;
                    final FrameLayout frameLayout2 = frameLayout;
                    final Context context2 = context;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.Document document2 = document;
                    g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            si siVar2 = si.this;
                            a0.h hVar = siVar2.U;
                            TLRPC.StickerSet stickerSet3 = stickerSet2;
                            hVar.l(stickerSet3.f28425id);
                            TLObject tLObject4 = tLObject2;
                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive;
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                            int i12 = i11;
                            if (z15) {
                                siVar2.E1(g2Var3, z13, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                            }
                            siVar2.e1(i12, false, false, true, new hh(siVar2, stickerSet3, 0));
                            if (tL_error == null && z14) {
                                FrameLayout frameLayout3 = frameLayout2;
                                Context context3 = context2;
                                TLObject tLObject5 = tLObject3;
                                TLRPC.Document document3 = document2;
                                if (frameLayout3 != null) {
                                    org.telegram.ui.Components.gc.f(frameLayout3, new pv0(context3, tLObject5, 1, 2, document3, g2Var3.getResourceProvider()), 1500).j();
                                } else if (g2Var3 != null) {
                                    org.telegram.ui.Components.gc.g(g2Var3, new pv0(context3, tLObject5, 1, 2, document3, g2Var3.getResourceProvider()), 1500).j();
                                }
                            }
                        }
                    });
                }
            });
            return;
        }
        j1(j3, true);
        TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
        tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
        getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new wn(this, stickerSet, i10));
    }

    public final void n(ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3, long j3, boolean z10) {
        a0.h hVar2 = new a0.h();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
            hVar2.k(user, user.f28547id);
        }
        a0.h hVar3 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
            hVar3.k(chat, chat.f28398id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList4.add(new gj(this.currentAccount, (TLRPC.Message) arrayList.get(i11), hVar2, hVar3, false, false));
        }
        g0.g3(new di.k(this, arrayList2, z10, arrayList3, arrayList4, hVar, j3));
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_stickerSet n0(final org.telegram.tgnet.TLRPC.InputStickerSet r11, final java.lang.Integer r12, final boolean r13, boolean r14, final org.telegram.messenger.y10 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.n0(org.telegram.tgnet.TLRPC$InputStickerSet, java.lang.Integer, boolean, boolean, org.telegram.messenger.y10):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    public final void n1() {
        ArrayList arrayList = this.h;
        if (arrayList != null && !this.f26829y && qc.e(8200) && this.currentAccount == k10.f24932t0) {
            this.f26829y = true;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int min = Math.min(arrayList2.size(), 10);
            for (int i7 = 0; i7 < min; i7++) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList2.get(i7);
                o1(gc.b(tL_availableReaction.activate_animation), 0);
                o1(gc.b(tL_availableReaction.appear_animation), 0);
            }
            for (int i10 = 0; i10 < min; i10++) {
                o1(gc.b(((TLRPC.TL_availableReaction) arrayList2.get(i10)).effect_animation), 0);
            }
        }
    }

    public final void n2(int r8, long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.si.n2(int, long):void");
    }

    public final void o() {
        int g10 = g0.g.g(t0.f26895b) - 2;
        if (g10 <= 0) {
            g10 = 5;
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        if (cz.f23403s.length() <= 0) {
            for (int i7 = 0; i7 < this.f26798j1.size(); i7++) {
                arrayList.add((TLRPC.TL_topPeer) this.f26798j1.get(i7));
                if (arrayList.size() == g10 - 2) {
                    break;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        }
        Utilities.f22774e.c(new yf(this, z10, arrayList, 0));
    }

    public final TLRPC.TL_messages_stickerSet o0(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        return n0(inputStickerSet, null, z10, false, null);
    }

    public final void o1(gc gcVar, int i7) {
        getFileLoader().V(gcVar, null, null, i7, 11);
    }

    public final void o2(long j3, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.f26831y1.get(tL_updateBotCommands.bot_id + "_" + j3);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().k(ls.D0, botInfo, 0);
        }
        getMessagesStorage().f27214a.c(new d4(this, tL_updateBotCommands, j3, 13));
    }

    public final TLRPC.TL_messages_stickerSet p0(String str) {
        return (TLRPC.TL_messages_stickerSet) this.R.get(str);
    }

    public final void p2() {
        gj gjVar;
        ArrayList arrayList = this.Z0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.f26776a1;
            gj gjVar2 = null;
            if (i7 >= arrayList3.size()) {
                break;
            }
            gj gjVar3 = (gj) arrayList3.get(i7);
            if ((!gjVar3.z2() || gjVar3.S2) && !hashSet.contains(Integer.valueOf(gjVar3.e1()))) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else if (((gj) arrayList2.get(i10)).e1() == gjVar3.e1()) {
                        gjVar2 = (gj) arrayList2.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (gjVar2 != null) {
                    gjVar3.N(gjVar2);
                    gjVar3.f24236z0 = gjVar2.f24236z0;
                    gjVar3.f24232y0 = gjVar2.f24232y0;
                }
                gjVar3.f24195o2 = true;
                arrayList.add(gjVar3);
                hashSet.add(Integer.valueOf(gjVar3.e1()));
            }
            i7++;
        }
        for (int i11 = 0; i11 < this.f26779b1.size(); i11++) {
            gj gjVar4 = (gj) this.f26779b1.get(i11);
            if (!hashSet.contains(Integer.valueOf(gjVar4.e1()))) {
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        if (((gj) arrayList2.get(i12)).e1() == gjVar4.e1()) {
                            gjVar = (gj) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    } else {
                        gjVar = null;
                        break;
                    }
                }
                if (gjVar != null) {
                    gjVar4.N(gjVar);
                    gjVar4.f24236z0 = gjVar.f24236z0;
                    gjVar4.f24232y0 = gjVar.f24232y0;
                }
                gjVar4.f24195o2 = true;
                arrayList.add(gjVar4);
                hashSet.add(Integer.valueOf(gjVar4.e1()));
            }
        }
    }

    public final long q(ArrayList arrayList, boolean z10) {
        long j3 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayList.get(i7)).set;
                if (!stickerSet.archived) {
                    j3 = r(j3, stickerSet.f28425id);
                    if (this.f26821v0[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.f28425id))) {
                        j3 = r(j3, 1L);
                    }
                }
            }
        }
        return j3;
    }

    public final TLRPC.TL_messages_stickerSet q0(long j3) {
        return (TLRPC.TL_messages_stickerSet) this.J.f(j3);
    }

    public final void q1() {
        ArrayList[] arrayListArr = this.f26791g0;
        if (arrayListArr[3].isEmpty()) {
            return;
        }
        ArrayList arrayList = arrayListArr[3];
        this.f26832z0 = (TLRPC.Document) arrayList.get(Utilities.f22772b.nextInt(arrayList.size()));
        getFileLoader().V(gc.b(this.f26832z0), this.f26832z0, null, 0, 1);
    }

    public final void q2(String str) {
        HashMap hashMap = this.f26775a0;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new yf.e(str, this.currentAccount));
        yf.c cVar = this.A0;
        cVar.getClass();
        ?? obj = new Object();
        obj.f61196b = str;
        int i7 = cVar.d;
        cVar.d = i7 + 1;
        obj.f61197c = i7;
        obj.d = true;
        cVar.f61203e.add(obj);
    }

    public final TLRPC.TL_messages_stickerSet r0(String str) {
        if (str == null) {
            return null;
        }
        return (TLRPC.TL_messages_stickerSet) this.O.get(str.toLowerCase());
    }

    public final void r1() {
        int i7;
        boolean z10 = this.D0;
        ArrayList arrayList = this.C0;
        if (!z10 && arrayList.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = j6.c("⭐") + j6.c("⭐");
            tL_messages_getStickers.hash = 0L;
            this.D0 = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new jh(this, 2));
            return;
        }
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 3); i10++) {
            if (i10 == 2) {
                i7 = arrayList.size() - 1;
            } else {
                i7 = i10;
            }
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (gj.X3(document)) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.q0(gc.b(document), null, null, "webp", null, 1);
                fc.D().M(imageReceiver, null);
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.A1 = false;
                imageReceiver2.t0(gc.d(gj.F1(document), document), null, null, null, "tgs", null, 1);
                fc.D().M(imageReceiver2, null);
            }
        }
    }

    public final void r2(TLRPC.Message message) {
        s2(message, false);
    }

    public final void s1(TLRPC.StickerSetCovered stickerSetCovered) {
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
            gc k10 = gc.k(w10, document, stickerSetCovered.set.thumb_version);
            if (k10 != null) {
                if (k10.f24089p == 1) {
                    str = "tgs";
                } else {
                    str = "webp";
                }
                getFileLoader().V(k10, stickerSetCovered, str, 3, 1);
            }
        }
    }

    public final void s2(TLRPC.Message message, boolean z10) {
        if (message != null) {
            TLRPC.Document G0 = gj.G0(message);
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
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.O.get(str);
                if (tL_messages_stickerSet != null) {
                    int size = tL_messages_stickerSet.documents.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                        if (document.f28404id == G0.f28404id && document.dc_id == G0.dc_id) {
                            message.stickerVerified = 1;
                            return;
                        }
                    }
                } else if (z10) {
                    g0.g3(new lg((Object) this, (Object) message, str, 4));
                } else {
                    t2(message, str);
                }
            }
        }
    }

    public final String t0(long j3) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(j3);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        a0.h[] hVarArr = this.f26819u0;
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

    public final void t1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w10;
        ArrayList<TLRPC.Document> arrayList;
        gc k10;
        String str;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && (w10 = w7.w(stickerSet.thumbs, 90, false, null, false)) != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty() && (k10 = gc.k(w10, arrayList.get(0), tL_messages_stickerSet.set.thumb_version)) != null) {
            if (k10.f24089p == 1) {
                str = "tgs";
            } else {
                str = "webp";
            }
            getFileLoader().V(k10, tL_messages_stickerSet, str, 3, 1);
        }
    }

    public final void t2(TLRPC.Message message, String str) {
        HashMap hashMap = this.f26778b0;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = gj.j1(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xh(this, str, 1));
    }

    public final boolean u() {
        if (this.X[0] && this.H[0].size() < 5 && this.f26791g0[2].isEmpty()) {
            return false;
        }
        return true;
    }

    public final ArrayList u0(int i7) {
        ArrayList[] arrayListArr = this.H;
        if (i7 == 3) {
            return arrayListArr[2];
        }
        return arrayListArr[i7];
    }

    public final void u1(final int i7, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2 = tL_messages_allStickers;
        final ArrayList arrayList = new ArrayList();
        if (tL_messages_allStickers2.sets.isEmpty()) {
            C1(i7, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, runnable);
            return;
        }
        final a0.h hVar = new a0.h();
        final int i10 = 0;
        while (i10 < tL_messages_allStickers2.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers2.sets.get(i10);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(stickerSet.f28425id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar.k(tL_messages_stickerSet, stickerSet2.f28425id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar.m() == tL_messages_allStickers2.sets.size()) {
                        C1(i7, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, null);
                    }
                    i10++;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.f28418id = stickerSet.f28425id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    g0.g3(new jg.t(si.this, tLObject, arrayList, i10, hVar, stickerSet, tL_messages_allStickers2, i7));
                }
            });
            i10++;
            tL_messages_allStickers2 = tL_messages_allStickers;
        }
        runnable.run();
    }

    public final void v1(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i7) {
        g0.g3(new ih(this, str, 4));
        Utilities.d.c(new jg.t0(this, z11, tL_messages_stickerSet, i7, str, z10));
    }

    public final void w(boolean z10) {
        if (z10) {
            this.f26826x = 0;
            int[] iArr = this.f26812r0;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        Y0(2, false, true, false);
        Y0(3, false, true, false);
        Y0(7, false, false, true);
        z();
        y();
        C();
        if (!this.f26780c && (!this.d || Math.abs((System.currentTimeMillis() / 1000) - this.f26785e) >= 3600)) {
            H0(true, false, null);
        }
        if (!this.F && (this.E == null || Math.abs((System.currentTimeMillis() / 1000) - this.G) >= 3600)) {
            U0(true);
        }
        B();
        E();
        if (getUserConfig().f24942e0 != null) {
            String str = getUserConfig().f24942e0;
            TLRPC.TL_messages_stickerSet r02 = r0(str);
            if (r02 == null) {
                r02 = p0(str);
            }
            if (r02 == null) {
                d0(this.currentAccount).f1(str, false, true);
            }
        }
        if (!this.f26805o0 && System.currentTimeMillis() - getUserConfig().f24947i0 >= 86400000) {
            this.f26805o0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new jh(this, 8));
        }
        getMessagesController().G0();
    }

    public final void w0(long j3) {
        x0(j3, true);
    }

    public final void w1(final boolean z10, final ArrayList arrayList, final ArrayList arrayList2, final boolean z11, final boolean z12, final int i7, final long j3) {
        g0.g3(new qh(this, z10, 0));
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rh.run():void");
            }
        });
    }

    public final void x() {
        if (getUserConfig().f24944f0 != null) {
            String str = getUserConfig().f24944f0;
            TLRPC.TL_messages_stickerSet r02 = r0(str);
            if (r02 == null) {
                r02 = p0(str);
            }
            if (r02 == null) {
                d0(this.currentAccount).f1(str, false, true);
            }
        }
        if (!this.f26807p0 && System.currentTimeMillis() - getUserConfig().f24948j0 >= 86400000) {
            this.f26807p0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new jh(this, 5));
        }
    }

    public final void x0(long j3, boolean z10) {
        int i7;
        int i10;
        ArrayList arrayList;
        TLRPC.TL_topPeer tL_topPeer;
        int i11;
        if (!getUserConfig().W) {
            return;
        }
        k10 userConfig = getUserConfig();
        if (z10) {
            i7 = userConfig.G;
        } else {
            i7 = userConfig.F;
        }
        int i12 = 1;
        if (i7 != 0) {
            i10 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i7);
        } else {
            i10 = 60;
        }
        if (z10) {
            arrayList = this.l1;
        } else {
            arrayList = this.f26800k1;
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
        tL_topPeer.rating = Math.exp(i10 / getMessagesController().f25780c3) + tL_topPeer.rating;
        Collections.sort(arrayList, new jg.w(18));
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        if (z10) {
            i12 = 3;
        }
        getMessagesStorage().f27214a.c(new ch(this, j3, i12, tL_topPeer.rating));
        ls notificationCenter = getNotificationCenter();
        if (z10) {
            i11 = ls.U0;
        } else {
            i11 = ls.T0;
        }
        notificationCenter.k(i11, new Object[0]);
    }

    public final void x1(final TLRPC.messages_Messages messages_messages, final long j3, int i7, int i10, final int i11, final int i12, long j10, final int i13, final int i14, final boolean z10, final int i15) {
        long j11;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        ArrayList<TLRPC.Message> arrayList;
        int i20;
        ArrayList<TLRPC.Message> arrayList2;
        if (s2.f26694a) {
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
            i5.c.z(sb2, i16, " max_id=", i17, " min_id=");
            i18 = i12;
            i5.c.z(sb2, i11, " type = ", i18, " cache = ");
            i19 = i14;
            i5.c.z(sb2, i13, " classGuid = ", i19, " topReached=");
            z11 = z10;
            sb2.append(z11);
            a8.b(sb2.toString());
        } else {
            j11 = j3;
            i16 = i7;
            i17 = i10;
            i18 = i12;
            i19 = i14;
            z11 = z10;
        }
        if (i13 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i11 == 0) || (messages_messages.messages.size() <= 1 && i11 != 0)) && !n5.C(j11))) {
            if (i13 == 2) {
                return;
            }
            Q0(j3, i16, i17, i11, i18, j10, 0, i19, i15, null, null);
            return;
        }
        if (i13 == 0) {
            fc.X(messages_messages.messages);
            getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
            getMessagesStorage().f27214a.c(new sg(this, i11, messages_messages.messages, z11, j3, i10, i12, j10));
        }
        Utilities.f22776g.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.messages_Messages messages_messages2;
                si siVar;
                a0.h hVar = new a0.h();
                int i21 = 0;
                while (true) {
                    messages_messages2 = messages_messages;
                    if (i21 >= messages_messages2.users.size()) {
                        break;
                    }
                    TLRPC.User user = messages_messages2.users.get(i21);
                    hVar.k(user, user.f28547id);
                    i21++;
                }
                ArrayList arrayList3 = new ArrayList();
                int i22 = 0;
                while (true) {
                    int size = messages_messages2.messages.size();
                    siVar = si.this;
                    if (i22 >= size) {
                        break;
                    }
                    gj gjVar = new gj(siVar.currentAccount, messages_messages2.messages.get(i22), hVar, (a0.h) null, true, false);
                    gjVar.Q();
                    arrayList3.add(gjVar);
                    i22++;
                }
                siVar.getFileLoader().l(arrayList3);
                int i23 = i13;
                long j12 = j3;
                qf qfVar = new qf(siVar, messages_messages2, i23, j12, arrayList3, i14, i12, z10, i11, i15, 0);
                if (siVar.getMessagesController().f25950v7.v(j12)) {
                    siVar.getMessagesStorage().f27214a.c(new zf(siVar, arrayList3, qfVar, 29));
                } else {
                    qfVar.run();
                }
            }
        });
    }

    public final void y() {
        if (!this.f26827x0[1]) {
            if (!this.f26830y0[1] || Math.abs((System.currentTimeMillis() / 1000) - this.f26812r0[1]) >= 3600) {
                N0(true, true);
            }
        }
    }

    public final void y0(long j3) {
        TLRPC.User c22;
        if (getUserConfig().W && n5.E(j3) && (c22 = getMessagesController().c2(Long.valueOf(j3))) != null && !c22.bot && !c22.self) {
            getMessagesStorage().f27214a.c(new xg(this, j3, 2));
        }
    }

    public final void y1(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j3, int i7, boolean z10) {
        boolean z11;
        if (tL_attachMenuBots != null && i7 != 0) {
            this.f26777b = tL_attachMenuBots;
            this.f26774a = j3;
        }
        SharedPreferences.Editor edit = getMessagesController().h7.edit();
        this.f26785e = i7;
        edit.putInt("menuBotsUpdateDate", i7).commit();
        this.d = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().m1(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().f4(tL_attachMenuBots.users, z10);
            g0.g3(new fg(this, 0));
            z11 = false;
            for (int i10 = 0; i10 < tL_attachMenuBots.bots.size(); i10++) {
                if (tL_attachMenuBots.bots.get(i10) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i10).show_in_attach_menu = true;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        if (!z10) {
            getMessagesStorage().f27214a.c(new fk(i7, 2, j3, this, tL_attachMenuBots));
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 3600) {
            H0(false, true, null);
        }
    }

    public final void z() {
        if (!this.f26827x0[0]) {
            if (!this.f26830y0[0] || Math.abs((System.currentTimeMillis() / 1000) - this.f26812r0[0]) >= 3600) {
                N0(false, true);
            }
        }
    }

    public final void z1(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i7, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.E = tL_help_premiumPromo;
            this.G = i7;
            getMessagesController().f4(tL_help_premiumPromo.users, z10);
            g0.g3(new fg(this, 4));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().f27214a.c(new l7(this, tL_help_premiumPromo, i7, 7));
            }
            this.F = false;
        } else if (tL_help_premiumPromo != null && Math.abs((System.currentTimeMillis() / 1000) - i7) < 86400) {
            this.F = false;
        } else {
            U0(false);
        }
    }
}
