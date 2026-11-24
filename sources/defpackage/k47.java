package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import java.io.File;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
public class k47 {
    public static Pattern m3;
    public static Pattern n3;
    public static Pattern o3;
    public static final String[] p3 = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    public static Pattern q3;
    public static CharSequence[] r3;
    public static SpannableStringBuilder s3;
    public static SpannableStringBuilder t3;
    public CharSequence A;
    public jo6 A0;
    public boolean A1;
    public boolean A2;
    public SpannableString B;
    public boolean B0;
    public ArrayList B1;
    public ArrayList B2;
    public k47 C;
    public boolean C0;
    public String C1;
    public boolean C2;
    public int D;
    public String D0;
    public TLRPC.MessageMedia D1;
    public boolean D2;
    public long E;
    public boolean E0;
    public TLRPC.TL_document E1;
    public boolean E2;
    public long F;
    public StringBuilder F0;
    public ArrayList F1;
    public boolean F2;
    public String G;
    public boolean G0;
    public String G1;
    public boolean G2;
    public boolean H;
    public long H0;
    public final meb H1;
    public boolean H2;
    public boolean I;
    public boolean I0;
    public BitmapDrawable I1;
    public boolean I2;
    public boolean J;
    public long J0;
    public Bitmap J1;
    public boolean J2;
    public boolean K;
    public HashSet K0;
    public final int K1;
    public boolean K2;
    public boolean L;
    public boolean L0;
    public final TLRPC.TL_channelAdminLogEvent L1;
    public boolean L2;
    public boolean M;
    public boolean M0;
    public boolean M1;
    public boolean M2;
    public boolean N;
    public boolean N0;
    public g47 N1;
    public boolean N2;
    public boolean O;
    public boolean O0;
    public boolean O1;
    public boolean O2;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public boolean R;
    public byte[] R0;
    public int R1;
    public boolean R2;
    public byte S;
    public String S0;
    public boolean S1;
    public boolean S2;
    public long T;
    public String T0;
    public int T1;
    public Boolean T2;
    public int U;
    public boolean U0;
    public float U1;
    public boolean U2;
    public final int V;
    public TLRPC.Photo V0;
    public boolean V1;
    public Integer V2;
    public final String W;
    public String W0;
    public float W1;
    public Boolean W2;
    public final int X;
    public String X0;
    public boolean X1;
    public byte X2;
    public final String Y;
    public String Y0;
    public boolean Y1;
    public SpannableString Y2;
    public boolean Z;
    public TLRPC.PeerColor Z0;
    public StringBuilder Z1;
    public SpannableString Z2;
    public byte a;
    public boolean a0;
    public TLRPC.MessageMedia a1;
    public ArrayList a2;
    public Integer a3;
    public final String b;
    public float b0;
    public boolean b1;
    public boolean b2;
    public TLRPC.TL_webPage b3;
    public String c;
    public float c0;
    public boolean c1;
    public CharSequence c2;
    public boolean c3;
    public long d;
    public int d0;
    public boolean d1;
    public int d2;
    public Boolean d3;
    public long e;
    public long e0;
    public int e1;
    public gn5 e2;
    public ArrayList e3;
    public final boolean f;
    public long f0;
    public long f1;
    public gn5 f2;
    public TLRPC.Document f3;
    public final boolean g;
    public float g0;
    public TLRPC.TL_peerColorCollectible g1;
    public boolean g2;
    public mdc g3;
    public Boolean h;
    public float h0;
    public boolean h1;
    public TLRPC.Peer h2;
    public mdc h3;
    public final boolean i;
    public int i0;
    public boolean i1;
    public final Drawable[] i2;
    public mdc i3;
    public t3b j;
    public int j0;
    public TLRPC.TL_forumTopic j1;
    public final boolean j2;
    public boolean j3;
    public TLRPC.Message k;
    public double k0;
    public boolean k1;
    public final boolean k2;
    public Integer k3;
    public final TL_stories.StoryItem l;
    public boolean l0;
    public boolean l1;
    public boolean l2;
    public Float l3;
    public g4b m;
    public boolean m0;
    public int m1;
    public Drawable m2;
    public TLRPC.Document n;
    public TLObject n0;
    public boolean n1;
    public boolean n2;
    public Long o;
    public TLRPC.Photo o0;
    public boolean o1;
    public boolean o2;
    public boolean p;
    public ArrayList p0;
    public boolean p1;
    public final int p2;
    public boolean q;
    public ArrayList q0;
    public boolean q1;
    public de q2;
    public boolean r;
    public rcc r0;
    public boolean r1;
    public byte[] r2;
    public TLRPC.VideoSize s;
    public ArrayList s0;
    public boolean s1;
    public boolean s2;
    public boolean t;
    public boolean t0;
    public boolean t1;
    public Boolean t2;
    public String u;
    public boolean u0;
    public boolean u1;
    public int u2;
    public CharSequence v;
    public boolean v0;
    public boolean v1;
    public int v2;
    public CharSequence w;
    public long w0;
    public boolean w1;
    public boolean w2;
    public SpannableStringBuilder x;
    public int x0;
    public ArrayList x1;
    public float x2;
    public CharSequence y;
    public boolean y0;
    public CharSequence y1;
    public uj9 y2;
    public CharSequence z;
    public boolean z0;
    public ArrayList z1;
    public TL_iv.RichMessage z2;

    public k47(int r37, org.telegram.tgnet.TLRPC.TL_channelAdminLogEvent r38, java.util.ArrayList r39, java.util.HashMap r40, org.telegram.tgnet.TLRPC.Chat r41, int[] r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.<init>(int, org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent, java.util.ArrayList, java.util.HashMap, org.telegram.tgnet.TLRPC$Chat, int[], boolean):void");
    }

    public static boolean A(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty()) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            if (poll.public_voters) {
                if (!poll.closed && !poll.creator) {
                    if (V4(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A4(k47 k47Var) {
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            if ((message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Spannable A5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return B5(charSequence, arrayList, fontMetricsInt, z, 1.2f, 0);
    }

    public static long B0(TLRPC.Message message) {
        TLRPC.Peer peer;
        long j = message.dialog_id;
        if (j == 0 && (peer = message.peer_id) != null) {
            long j2 = peer.chat_id;
            if (j2 != 0) {
                long j3 = -j2;
                message.dialog_id = j3;
                return j3;
            }
            long j4 = peer.channel_id;
            if (j4 != 0) {
                long j5 = -j4;
                message.dialog_id = j5;
                return j5;
            }
            TLRPC.Peer peer2 = message.from_id;
            if (peer2 != null && !message.out && message.guestchat_via_from == null) {
                long j6 = peer2.user_id;
                message.dialog_id = j6;
                return j6;
            }
            long j7 = peer.user_id;
            message.dialog_id = j7;
            return j7;
        }
        return j;
    }

    public static long B1(TLRPC.Peer peer) {
        long j;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j = peer.chat_id;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            j = peer.channel_id;
        } else {
            return peer.user_id;
        }
        return -j;
    }

    public static boolean B4(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        i1(document);
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static Spannable B5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z, float f, int i) {
        Spannable spannableString;
        int i2;
        dw3 dw3Var;
        gn gnVar;
        dw3 dw3Var2;
        dw3 dw3Var3 = null;
        if (charSequence == null) {
            return null;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (arrayList != null) {
            if (gda.o() >= 2) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            int i3 = i2 - i;
            dw3[] dw3VarArr = (dw3[]) spannableString.getSpans(0, spannableString.length(), dw3.class);
            int i4 = 0;
            while (i4 < arrayList.size() && i3 > 0) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i4);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i5 = 0;
                    while (i5 < dw3VarArr.length) {
                        dw3 dw3Var4 = dw3VarArr[i5];
                        if (dw3Var4 != null) {
                            int spanStart = spannableString.getSpanStart(dw3Var4);
                            int spanEnd = spannableString.getSpanEnd(dw3Var4);
                            int i6 = tL_messageEntityCustomEmoji.offset;
                            dw3Var2 = dw3Var3;
                            if (gm.z1(i6, tL_messageEntityCustomEmoji.length + i6, spanStart, spanEnd)) {
                                spannableString.removeSpan(dw3Var4);
                                dw3VarArr[i5] = dw3Var2;
                            }
                        } else {
                            dw3Var2 = dw3Var3;
                        }
                        i5++;
                        dw3Var3 = dw3Var2;
                    }
                    dw3Var = dw3Var3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i7 = messageEntity.offset;
                        gn[] gnVarArr = (gn[]) spannableString.getSpans(i7, messageEntity.length + i7, gn.class);
                        if (gnVarArr != null && gnVarArr.length > 0) {
                            for (gn gnVar2 : gnVarArr) {
                                spannableString.removeSpan(gnVar2);
                            }
                        }
                        if (tL_messageEntityCustomEmoji.document != null) {
                            gnVar = new gn(tL_messageEntityCustomEmoji.document, f, fontMetricsInt);
                        } else {
                            gnVar = new gn(tL_messageEntityCustomEmoji.document_id, f, fontMetricsInt);
                        }
                        gnVar.top = z;
                        int i8 = messageEntity.offset;
                        spannableString.setSpan(gnVar, i8, messageEntity.length + i8, 33);
                        i3--;
                    }
                } else {
                    dw3Var = dw3Var3;
                }
                i4++;
                dw3Var3 = dw3Var;
            }
        }
        return spannableString;
    }

    public static TLRPC.Photo C1(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return W(richMessage.blocks, richMessage);
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return n1(message).webpage.photo;
        }
        if (n1(message) != null) {
            return n1(message).photo;
        }
        return null;
    }

    public static boolean D(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean D4(k47 k47Var) {
        TLRPC.Message message;
        if (k47Var == null || (message = k47Var.k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionTopicCreate) && !(messageAction instanceof TLRPC.TL_messageActionTopicEdit)) {
            return false;
        }
        return true;
    }

    public static CharSequence D5(CharSequence charSequence, String str, TLObject tLObject) {
        CharSequence charSequence2;
        String str2;
        String str3;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            TLObject tLObject2 = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                charSequence2 = m9c.r(user).replace('\n', ' ');
                str2 = String.valueOf(user.id);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                charSequence2 = chat.title.replace('\n', ' ');
                str2 = String.valueOf(-chat.id);
            } else if (tLObject instanceof TLRPC.TL_game) {
                charSequence2 = ((TLRPC.TL_game) tLObject).title.replace('\n', ' ');
                str2 = "game";
            } else {
                if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                    charSequence2 = tL_chatInviteExported2.link.replace('\n', ' ');
                    str3 = "invite";
                    tL_chatInviteExported = tL_chatInviteExported2;
                } else if (tLObject instanceof TLRPC.ForumTopic) {
                    charSequence2 = no4.k((TLRPC.ForumTopic) tLObject, null, null);
                    str3 = "topic";
                    tL_chatInviteExported = tLObject;
                } else {
                    charSequence2 = "";
                    str2 = "0";
                }
                String str4 = str3;
                tLObject2 = tL_chatInviteExported;
                str2 = str4;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
            h6c h6cVar = new h6c(str2);
            h6cVar.c = tLObject2;
            spannableStringBuilder.setSpan(h6cVar, indexOf, charSequence2.length() + indexOf, 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static TLRPC.PollAnswerVoters E1(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i);
                if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                    return pollAnswerVoters;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean E3(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence F() {
        if (t3 == null) {
            t3 = new SpannableStringBuilder("c");
            pn2 pn2Var = new pn2(2131232165, 0);
            pn2Var.I = 0.7f;
            pn2Var.J = 0.7f;
            t3.setSpan(pn2Var, 0, 1, 33);
        }
        return t3;
    }

    public static TLRPC.VideoSize F1(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i = 0; i < document.video_thumbs.size(); i++) {
                if ("f".equals(document.video_thumbs.get(i).type)) {
                    return document.video_thumbs.get(i);
                }
            }
        }
        return null;
    }

    public static TLRPC.Document G0(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return a0(richMessage.blocks, richMessage);
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return n1(message).webpage.document;
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaGame) {
            return n1(message).game.document;
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaStory) {
            TL_stories.StoryItem storyItem = ((TLRPC.TL_messageMediaStory) n1(message)).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                return document;
            }
        } else if (n1(message) instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) n1(message);
            if (tL_messageMediaPaidMedia.extended_media.size() == 1 && (tL_messageMediaPaidMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
                return ((TLRPC.TL_messageExtendedMedia) tL_messageMediaPaidMedia.extended_media.get(0)).media.document;
            }
        }
        if (n1(message) != null) {
            return n1(message).document;
        }
        return null;
    }

    public static boolean G3(TLRPC.Message message, boolean z) {
        if (message != null && n1(message) != null && !(n1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            if (!z || !(n1(message) instanceof TLRPC.TL_messageMediaWebPage)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static double H0(TLRPC.Document document) {
        if (document == null) {
            return 0.0d;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int H1(int i, TLRPC.Message message) {
        oz8 d;
        if (message == null) {
            return 0;
        }
        if ((message.flags & 1073741824) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        String J1 = J1(message);
        if (J1 == null || (d = pz8.f(i).d(J1)) == null) {
            return 0;
        }
        return d.a;
    }

    public static boolean H2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static int I1(TLRPC.Message message) {
        if (message == null) {
            return 0;
        }
        if ((message.flags & 1073741824) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (!(inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId)) {
            return 0;
        }
        return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
    }

    public static TLRPC.VideoSize J0(TLRPC.Document document) {
        if (document != null && !document.video_thumbs.isEmpty()) {
            return document.video_thumbs.get(0);
        }
        return null;
    }

    public static String J1(TLRPC.Message message) {
        if (message == null) {
            return null;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (!(inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut)) {
            return null;
        }
        return ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
    }

    public static boolean J3(TLRPC.Document document) {
        TLRPC.DocumentAttribute documentAttribute;
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
                    return !documentAttribute.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && bc4.B(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean J4(TLRPC.Document document) {
        int lastIndexOf;
        if (document != null) {
            String str = null;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                if (i < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        if (documentAttribute.round_message) {
                            break;
                        }
                        i2 = documentAttribute.w;
                        i3 = documentAttribute.h;
                        z2 = true;
                    } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                        z = true;
                    } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                        str = documentAttribute.file_name;
                    }
                    i++;
                } else {
                    if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
                        switch (str.substring(lastIndexOf + 1).toLowerCase().hashCode()) {
                            case -1535907675:
                            case -1422950858:
                            case -1253501876:
                            case -907685685:
                            case -788047292:
                            case -338481545:
                            case 3106:
                            case 3184:
                            case 3215:
                            case 3401:
                            case 3479:
                            case 3494:
                            case 3580:
                            case 3581:
                            case 3593:
                            case 3632:
                            case 3669:
                            case 3756:
                            case 3804:
                            case 96400:
                            case 96586:
                            case 96796:
                            case 96801:
                            case 96894:
                            case 97013:
                            case 97300:
                            case 97301:
                            case 97543:
                            case 98437:
                            case 98472:
                            case 98618:
                            case 98689:
                            case 98719:
                            case 98789:
                            case 98808:
                            case 98819:
                            case 99338:
                            case 99351:
                            case 99548:
                            case 99556:
                            case 99582:
                            case 99640:
                            case 99752:
                            case 100208:
                            case 100511:
                            case 100542:
                            case 100730:
                            case 100882:
                            case 100958:
                            case 101460:
                            case 101671:
                            case 101854:
                            case 102556:
                            case 102572:
                            case 103404:
                            case 103438:
                            case 103637:
                            case 103649:
                            case 104074:
                            case 104269:
                            case 104417:
                            case 104430:
                            case 104435:
                            case 104474:
                            case 104479:
                            case 104582:
                            case 104587:
                            case 104987:
                            case 105532:
                            case 105543:
                            case 105551:
                            case 106202:
                            case 106496:
                            case 107141:
                            case 107305:
                            case 107932:
                            case 107988:
                            case 107989:
                            case 108341:
                            case 108382:
                            case 108413:
                            case 108419:
                            case 108426:
                            case 108430:
                            case 108570:
                            case 109824:
                            case 109860:
                            case 110754:
                            case 110801:
                            case 110834:
                            case 110883:
                            case 110968:
                            case 110989:
                            case 111052:
                            case 111220:
                            case 111265:
                            case 111269:
                            case 111390:
                            case 111420:
                            case 111482:
                            case 111494:
                            case 112185:
                            case 112712:
                            case 112788:
                            case 112862:
                            case 113115:
                            case 113132:
                            case 113291:
                            case 113698:
                            case 113700:
                            case 113837:
                            case 113854:
                            case 114101:
                            case 114130:
                            case 114276:
                            case 114381:
                            case 114809:
                            case 114922:
                            case 114970:
                            case 115161:
                            case 115312:
                            case 115639:
                            case 116079:
                            case 116537:
                            case 116551:
                            case 116609:
                            case 117218:
                            case 117537:
                            case 117840:
                            case 117938:
                            case 118023:
                            case 118026:
                            case 118028:
                            case 118439:
                            case 118783:
                            case 118807:
                            case 118939:
                            case 120703:
                            case 3003834:
                            case 3016404:
                            case 3088960:
                            case 3213227:
                            case 3271912:
                            case 3358271:
                            case 3444044:
                            case 3446979:
                            case 3447940:
                            case 3524225:
                            case 3524692:
                            case 3526257:
                            case 3682393:
                            case 35379135:
                            case 114035747:
                                break;
                        }
                    }
                    if (z && (i2 > 1280 || i3 > 1280)) {
                        z = false;
                    }
                    if (gda.z0 && !z2 && "video/x-matroska".equals(document.mime_type)) {
                        z2 = true;
                    }
                    if (!z2 || z) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Document K0(TLRPC.WebPage webPage, long j) {
        if (webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.id == j) {
                return document;
            }
            for (int i = 0; i < webPage.cached_page.documents.size(); i++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i);
                if (document2.id == j) {
                    return document2;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean K2(TLRPC.Document document, boolean z) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (!z) {
                int size = document.attributes.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        return documentAttribute.stickerset instanceof TLRPC.TL_inputStickerSetShortName;
                    }
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean K3(TLRPC.Message message) {
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return J3(n1(message).webpage.document);
        }
        if (n1(message) != null && J3(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean K4(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return J4(a0(richMessage.blocks, richMessage));
        }
        if (n1(message) == null || !M4(n1(message).document)) {
            if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                return J4(n1(message).webpage.document);
            }
            if (n1(message) != null && J4(n1(message).document)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static SpannableStringBuilder L(boolean z) {
        String str;
        int i;
        if (z) {
            str = "✅";
            i = 2131231555;
        } else {
            str = "☑️";
            i = 2131231554;
        }
        return S5(i, str);
    }

    public static boolean L2(TLRPC.Message message) {
        boolean z;
        boolean B = pg3.B(message.dialog_id);
        if ((!B || message.stickerVerified == 1) && n1(message) != null) {
            TLRPC.Document document = n1(message).document;
            if (B && !message.out) {
                z = false;
            } else {
                z = true;
            }
            if (K2(document, z)) {
                return true;
            }
        }
        return false;
    }

    public static void L5(int i, TLRPC.Message message) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        message.unread = z;
        if ((i & 2) == 0) {
            z2 = true;
        }
        message.media_unread = z2;
    }

    public static boolean M(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            char c = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    i2++;
                    if (i2 >= 6) {
                        return true;
                    }
                    i3 = 0;
                    i4 = 0;
                } else if (charAt == ' ' || i2 <= 0) {
                    i2 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i != 0) {
                    if (i != 0) {
                        int i5 = i - 1;
                        if (charSequence.charAt(i5) != ' ') {
                            if (charSequence.charAt(i5) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        i3 = 0;
                    } else if (charAt == '/') {
                        if (i3 == 2) {
                            return true;
                        }
                        if (i3 == 1) {
                            i3++;
                        }
                        i3 = 0;
                    } else {
                        if (charAt == '.') {
                            if (i4 == 0 && c != ' ') {
                                i4++;
                            }
                        } else if (charAt != ' ' && c == '.' && i4 == 1) {
                            return true;
                        }
                        i4 = 0;
                    }
                    i++;
                    c = charAt;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean M3(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean M4(TLRPC.Document document) {
        if (document != null && N4(document)) {
            return true;
        }
        return false;
    }

    public static boolean N2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean N4(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean O2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean P4(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static long Q1(long j, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j2 = peer2.chat_id;
            if (j2 == 0) {
                j2 = peer2.channel_id;
                if (j2 == 0) {
                    return peer2.user_id;
                }
            }
            return -j2;
        } else if (message.from_id.user_id != j) {
            return 0L;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                return pg3.n(peer);
            }
            if ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) {
                return 2666000L;
            }
            return j;
        }
    }

    public static boolean Q2(int i, k47 k47Var) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia m1 = m1(k47Var);
        if ((m1 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) m1).todo) != null && todoList.list != null) {
            for (int i2 = 0; i2 < tL_messageMediaToDo.completions.size(); i2++) {
                if (tL_messageMediaToDo.completions.get(i2).id == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Q4(TLRPC.Message message) {
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return P4(n1(message).webpage.document);
        }
        if (n1(message) != null && P4(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean Q5(TLRPC.Message message) {
        int i;
        if ((message == null || message.media == null || ((!P4(G0(message)) && !i4(message)) || message.media.ttl_seconds != Integer.MAX_VALUE)) && !(n1(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            if (message instanceof TLRPC.TL_message_secret) {
                if (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || K4(message)) && (i = message.ttl) > 0 && i <= 60) {
                    return true;
                }
                return false;
            } else if (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (n1(message) instanceof TLRPC.TL_messageMediaDocument)) && n1(message).ttl_seconds != 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void R(Spanned spanned, ArrayList arrayList) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        Object[] objArr = (e09[]) spanned.getSpans(0, spanned.length(), e09.class);
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i6 >= objArr.length) {
                break;
            }
            e09 e09Var = objArr[i6];
            e09Var.a.b = false;
            int spanStart = spanned.getSpanStart(e09Var);
            int spanEnd = spanned.getSpanEnd(objArr[i6]);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i4 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i4 = 0;
            }
            if (objArr[i6].a.e) {
                i7 = 16;
            }
            hashMap.put(valueOf, Integer.valueOf(i4 | i7));
            treeSet.add(Integer.valueOf(spanEnd));
            Integer valueOf2 = Integer.valueOf(spanEnd);
            if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                i5 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
            } else {
                i5 = 0;
            }
            hashMap.put(valueOf2, Integer.valueOf(i5 | 2));
            i6++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i3) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        Object[] objArr2 = (bl2[]) spanned.getSpans(0, spanned.length(), bl2.class);
        for (int i8 = 0; i8 < objArr2.length; i8++) {
            int spanStart2 = spanned.getSpanStart(objArr2[i8]);
            int spanEnd2 = spanned.getSpanEnd(objArr2[i8]);
            treeSet.add(Integer.valueOf(spanStart2));
            Integer valueOf3 = Integer.valueOf(spanStart2);
            if (hashMap.containsKey(Integer.valueOf(spanStart2))) {
                i = ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue();
            } else {
                i = 0;
            }
            hashMap.put(valueOf3, Integer.valueOf(i | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            Integer valueOf4 = Integer.valueOf(spanEnd2);
            if (hashMap.containsKey(Integer.valueOf(spanEnd2))) {
                i2 = ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue();
            } else {
                i2 = 0;
            }
            hashMap.put(valueOf4, Integer.valueOf(i2 | 8));
        }
        Iterator it2 = treeSet.iterator();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        int i12 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i11 != intValue3) {
                int i13 = intValue3 - 1;
                if (i13 >= 0 && i13 < spanned.length() && spanned.charAt(i13) == '\n') {
                    intValue3--;
                }
                int i14 = intValue3;
                if ((intValue4 & 8) != 0 && i10 < objArr2.length) {
                    str = objArr2[i10].a;
                    i10++;
                } else {
                    str = null;
                }
                int i15 = i10;
                String str2 = str;
                if (i9 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i12 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(new j47(i11, i14, z3, z4, z5, str2));
                i11 = i14 + 1;
                if (i11 >= spanned.length() || spanned.charAt(i14) != '\n') {
                    i11 = i14;
                }
                i10 = i15;
            }
            if ((intValue4 & 2) != 0) {
                i9--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i9++;
                if ((intValue4 & 16) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if ((intValue4 & 8) != 0) {
                i12--;
            }
            if ((intValue4 & 4) != 0) {
                i12++;
            }
        }
        if (i11 < spanned.length()) {
            int length = spanned.length();
            if (i9 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (i12 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new j47(i11, length, z, z2, z5, null));
        }
    }

    public static boolean R3(TLRPC.Message message) {
        TLRPC.Photo photo;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            if (W(richMessage.blocks, richMessage) != null) {
                return true;
            }
            return false;
        } else if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            if ((n1(message).webpage.photo instanceof TLRPC.TL_photo) && !(n1(message).webpage.document instanceof TLRPC.TL_document)) {
                return true;
            }
            return false;
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction != null && (photo = messageAction.photo) != null) {
                return photo instanceof TLRPC.TL_photo;
            }
            return n1(message) instanceof TLRPC.TL_messageMediaPhoto;
        }
    }

    public static int S(int i) {
        if (f3(i)) {
            return i & (-1879048193);
        }
        return i;
    }

    public static SpannableStringBuilder S5(int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new pn2(i, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String T0(TLRPC.Message message) {
        TLRPC.PhotoSize w;
        if (n1(message) instanceof TLRPC.TL_messageMediaDocument) {
            return bc4.r(null, G0(message));
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = n1(message).photo.sizes;
            if (arrayList.size() > 0 && (w = bc4.w(arrayList, gm.Y0(false), false, null, false)) != null) {
                return bc4.r(null, w);
            }
            return "";
        } else if ((n1(message) instanceof TLRPC.TL_messageMediaWebPage) && n1(message).webpage != null) {
            return bc4.r(null, n1(message).webpage.document);
        } else {
            return "";
        }
    }

    public static boolean T3(TLRPC.StickerSetCovered stickerSetCovered) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && !stickerSet.emojis) {
            return false;
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else {
            arrayList = stickerSetCovered.covers;
        }
        if (stickerSetCovered != null && arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!m3(arrayList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean T4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String U(TLRPC.Document document) {
        return V(document, "😀", null);
    }

    public static String U0(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize w;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return bc4.r(null, messageMedia.document);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
            if (arrayList.size() > 0 && (w = bc4.w(arrayList, gm.Y0(false), false, null, false)) != null) {
                return bc4.r(null, w);
            }
            return "";
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            return bc4.r(null, webPage.document);
        } else {
            return "";
        }
    }

    public static boolean U3(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                if (!m3(tL_messages_stickerSet.documents.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String V(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet n0 = hs6.d0(num.intValue()).n0(documentAttribute.stickerset, true);
                        StringBuilder sb = new StringBuilder("");
                        if (n0 != null && n0.packs != null) {
                            for (int i2 = 0; i2 < n0.packs.size(); i2++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i2);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.id))) {
                                    sb.append(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb)) {
                            return sb.toString();
                        }
                    }
                    return documentAttribute.alt;
                }
            }
        }
        return str;
    }

    public static boolean V2(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean V4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo W(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    long j = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
                    Typeface typeface = gm.a;
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            TLRPC.Photo photo = arrayList2.get(i2);
                            if (photo != null && photo.id == j) {
                                return photo;
                            }
                        }
                    }
                    return null;
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    return W(((TL_iv.pageBlockCollage) pageBlock).items, richMessage);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        return W(((TL_iv.pageBlockSlideshow) pageBlock).items, richMessage);
                    }
                }
            }
        }
        return null;
    }

    public static boolean W2(TLRPC.Document document) {
        if (document != null && !document.thumbs.isEmpty()) {
            int size = document.thumbs.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean W3(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i = 0; i < document.video_thumbs.size(); i++) {
                if ("f".equals(document.video_thumbs.get(i).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswer X(k47 k47Var, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia m1 = m1(k47Var);
        if ((m1 instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1).poll) != null && poll.answers != null) {
            for (int i = 0; i < tL_messageMediaPoll.poll.answers.size(); i++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    public static CharSequence X1(TLRPC.ChatReactions chatReactions) {
        String str;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return jb6.M0(2131754256, null);
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < tL_chatReactionsSome.reactions.size(); i++) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                    spannableStringBuilder2.setSpan(new gn(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                    str = spannableStringBuilder2;
                } else {
                    str = "";
                }
                spannableStringBuilder.append(gw3.m(str, null, false, null, 0));
            }
            return spannableStringBuilder;
        }
        return jb6.M0(2131747909, null);
    }

    public static int Y(int i, String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i < str.length() && str.startsWith(str2, i)) {
            return i;
        }
        int indexOf = str.indexOf(str2, i);
        int lastIndexOf = str.lastIndexOf(str2, i);
        if (indexOf != -1 && (lastIndexOf == -1 || indexOf - i < i - lastIndexOf)) {
            return indexOf;
        }
        return lastIndexOf;
    }

    public static void Y5(int i, long j, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i2, boolean z, int i3) {
        int i4 = 0;
        while (i4 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i4).id == i2) {
                tL_messageMediaToDo.completions.remove(i4);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i4--;
            }
            i4++;
        }
        if (z) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.id = i2;
            tL_todoCompletion.completed_by = oc7.r1(i).x1(j);
            tL_todoCompletion.date = i3;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    public static TLRPC.TodoItem Z(int i, k47 k47Var) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia m1 = m1(k47Var);
        if ((m1 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) m1).todo) != null && todoList.list != null) {
            for (int i2 = 0; i2 < tL_messageMediaToDo.todo.list.size(); i2++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i2);
                if (todoItem.id == i) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static long Z1(int i, TLRPC.Message message, int i2) {
        long b2 = b2(i, message, iqd.a(i2, 1), iqd.a(i2, 4));
        if (b2 == 0 && iqd.a(i2, 8)) {
            return -1L;
        }
        return b2;
    }

    public static void a(Spannable spannable, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        b(spannable, arrayList, z, false, z2, z3, 0);
    }

    public static TLRPC.Document a0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return gm.Z(((TL_iv.pageBlockVideo) pageBlock).video_id, richMessage.documents);
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    return a0(((TL_iv.pageBlockCollage) pageBlock).items, richMessage);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        return a0(((TL_iv.pageBlockSlideshow) pageBlock).items, richMessage);
                    }
                }
            }
        }
        return null;
    }

    public static long a1(TLRPC.Message message) {
        return B1(message.from_id);
    }

    public static long a2(int i, TLRPC.Message message, boolean z) {
        return b2(i, message, z, false);
    }

    public static boolean a4(TLRPC.Message message) {
        if (message != null) {
            if ((message.flags & 1073741824) != 0 || message.quick_reply_shortcut != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(java.lang.CharSequence r21, java.util.ArrayList r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.b(java.lang.CharSequence, java.util.ArrayList, boolean, boolean, boolean, boolean, int):boolean");
    }

    public static void b0(ArrayList arrayList, long j) {
        if (arrayList != null && !arrayList.isEmpty() && j != 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                if (message instanceof TLRPC.TL_messageEmpty) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    message.peer_id = tL_peerChannel;
                    tL_peerChannel.channel_id = j;
                }
            }
        }
    }

    public static long b2(int i, TLRPC.Message message, boolean z, boolean z2) {
        int i2;
        long e = z8c.h(i).e();
        if (z2) {
            return u1(message);
        }
        if ((message.flags & 1073741824) != 0 && pg3.n(message.peer_id) == e) {
            i2 = message.quick_reply_shortcut_id;
        } else if (!z && i >= 0 && pg3.n(message.peer_id) == e) {
            return Q1(e, message);
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i2 = message.id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null && messageReplyHeader.forum_topic) {
                    if ((message instanceof TLRPC.TL_messageService) && !(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                        i2 = messageReplyHeader.reply_to_msg_id;
                        if (i2 == 0) {
                            i2 = messageReplyHeader.reply_to_top_id;
                        }
                    } else {
                        i2 = messageReplyHeader.reply_to_top_id;
                        if (i2 == 0) {
                            i2 = messageReplyHeader.reply_to_msg_id;
                        }
                    }
                } else if (z) {
                    return 1L;
                } else {
                    return 0L;
                }
            }
        }
        return i2;
    }

    public static void b6(ArrayList arrayList, List list) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
            if (photoSize != null) {
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) list.get(i2);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public static void c0(TL_iv.PageBlock pageBlock, int i, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            int i2 = 0;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockKicker)) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    while (i2 < pageblockblockquoteblocks.blocks.size()) {
                        if (i2 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(pageblockblockquoteblocks.blocks.get(i2), i, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i) {
                            spannableStringBuilder.delete(i, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                        i2++;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    f0(((TL_iv.pageBlockDetails) pageBlock).title, i, spannableStringBuilder, 0);
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                    f0(((TL_iv.pageBlockAuthorDate) pageBlock).author, i, spannableStringBuilder, 0);
                    return;
                } else {
                    TLRPC.Document document = null;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        spannableStringBuilder.append((CharSequence) S5(2131231560, "fx")).append(" ").append((CharSequence) jb6.M0(2131754863, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131748447, null));
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageCaption != null && !(pageCaption.text instanceof TL_iv.textEmpty)) {
                            spannableStringBuilder.append("  ");
                            f0(pageBlock.caption.text, i, spannableStringBuilder, 0);
                            return;
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        f0(pageBlock.text, i, spannableStringBuilder, 4);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                        for (int i3 = 0; i3 < pageblocklist.items.size(); i3++) {
                            if (i3 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i3);
                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                if (tL_pageListItemText.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListItemText.checked)).append(" ");
                                } else {
                                    spannableStringBuilder.append("• ");
                                }
                                f0(tL_pageListItemText.text, i, spannableStringBuilder, 0);
                            } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                                if (tL_pageListItemBlocks.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListItemBlocks.checked)).append(" ");
                                } else {
                                    spannableStringBuilder.append("• ");
                                }
                                for (int i4 = 0; i4 < tL_pageListItemBlocks.blocks.size(); i4++) {
                                    if (i4 > 0) {
                                        spannableStringBuilder.append("  ");
                                    }
                                    c0(tL_pageListItemBlocks.blocks.get(i4), i, spannableStringBuilder, richMessage);
                                    if (spannableStringBuilder.length() >= i) {
                                        spannableStringBuilder.delete(i, spannableStringBuilder.length());
                                        spannableStringBuilder.append("…");
                                        return;
                                    }
                                }
                            }
                            if (spannableStringBuilder.length() >= i) {
                                spannableStringBuilder.delete(i, spannableStringBuilder.length());
                                spannableStringBuilder.append("…");
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                        for (int i5 = 0; i5 < pageblockorderedlist.items.size(); i5++) {
                            if (i5 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i5);
                            if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                                spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemText.num);
                                spannableStringBuilder.append(". ");
                                if (tL_pageListOrderedItemText.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemText.checked)).append(" ");
                                }
                                f0(tL_pageListOrderedItemText.text, i, spannableStringBuilder, 0);
                            } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                                spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                                spannableStringBuilder.append(". ");
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemBlocks.checked)).append(" ");
                                }
                                for (int i6 = 0; i6 < tL_pageListOrderedItemBlocks.blocks.size(); i6++) {
                                    if (i6 > 0) {
                                        spannableStringBuilder.append("  ");
                                    }
                                    c0(tL_pageListOrderedItemBlocks.blocks.get(i6), i, spannableStringBuilder, richMessage);
                                    if (spannableStringBuilder.length() >= i) {
                                        spannableStringBuilder.delete(i, spannableStringBuilder.length());
                                        spannableStringBuilder.append("…");
                                        return;
                                    }
                                }
                            }
                            if (spannableStringBuilder.length() >= i) {
                                spannableStringBuilder.delete(i, spannableStringBuilder.length());
                                spannableStringBuilder.append("…");
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        spannableStringBuilder.append((CharSequence) S5(2131231582, "⊞")).append(" ");
                        TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            f0(richText, i, spannableStringBuilder, 0);
                            return;
                        } else {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131754854, null));
                            return;
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                        TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                        while (true) {
                            if (i2 >= richMessage.documents.size()) {
                                break;
                            } else if (richMessage.documents.get(i2).id == pageblockaudio.audio_id) {
                                document = richMessage.documents.get(i2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) gm.V(TLRPC.TL_documentAttributeAudio.class, document.attributes);
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) gm.V(TLRPC.TL_documentAttributeFilename.class, document.attributes);
                            if (tL_documentAttributeAudio != null) {
                                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                                    spannableStringBuilder.append((CharSequence) S5(2131231552, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                                    return;
                                } else if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                                    spannableStringBuilder.append((CharSequence) S5(2131231552, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                                    return;
                                } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                    spannableStringBuilder.append((CharSequence) S5(2131231552, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                spannableStringBuilder.append((CharSequence) S5(2131231552, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                        TLRPC.Document Z = gm.Z(((TL_iv.pageBlockDocument) pageBlock).document_id, richMessage.documents);
                        if (Z != null) {
                            String B = bc4.B(Z);
                            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) S5(2131232141, "📎")).append(" ");
                            if (TextUtils.isEmpty(B)) {
                                B = jb6.M0(2131753940, null);
                            }
                            append.append((CharSequence) B);
                            return;
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                        c0(((TL_iv.pageBlockCover) pageBlock).cover, i, spannableStringBuilder, richMessage);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131753913, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131753898, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131754895, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131754855, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131743520, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        for (int i7 = 0; i7 < pageblockbuttonrow.buttons.size(); i7++) {
                            if (i7 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            f0(pageblockbuttonrow.buttons.get(i7).text, i, spannableStringBuilder, 0);
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            f0(pageBlock.text, i, spannableStringBuilder, 0);
            return;
        }
        f0(pageBlock.text, i, spannableStringBuilder, 1);
    }

    public static int c2(TLRPC.Message message) {
        int i = !message.unread ? 1 : 0;
        if (!message.media_unread) {
            return i | 2;
        }
        return i;
    }

    public static boolean c3(TLRPC.Message message) {
        if (message != null) {
            if (f3(message.id) || message.ephemeralReceiverBotId != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean c5(TLRPC.Message message) {
        if (c3(message)) {
            if (message.ephemeralReceiverBotId == -1 || message.ephemeralAnchorMsgId != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void c6(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
        TLRPC.Poll poll;
        ArrayList<TLRPC.PollAnswerVoters> arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        if (tL_messageMediaPoll != null && pollResults != null) {
            int i = pollResults.flags & 2;
            boolean z = pollResults.min;
            if (i != 0) {
                if (z && (arrayList3 = tL_messageMediaPoll.results.results) != null) {
                    int size = arrayList3.size();
                    arrayList2 = null;
                    bArr = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i2);
                        if (pollAnswerVoters.chosen) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(pollAnswerVoters.option);
                        }
                        if (pollAnswerVoters.correct) {
                            bArr = pollAnswerVoters.option;
                        }
                    }
                } else {
                    arrayList2 = null;
                    bArr = null;
                }
                TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                ArrayList<TLRPC.PollAnswerVoters> arrayList4 = pollResults.results;
                pollResults2.results = arrayList4;
                if (arrayList2 != null || bArr != null) {
                    int size2 = arrayList4.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i3);
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size3) {
                                    break;
                                } else if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i4))) {
                                    pollAnswerVoters2.chosen = true;
                                    arrayList2.remove(i4);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                arrayList2 = null;
                            }
                        }
                        if (bArr != null && Arrays.equals(pollAnswerVoters2.option, bArr)) {
                            pollAnswerVoters2.correct = true;
                            bArr = null;
                        }
                        if (arrayList2 == null && bArr == null) {
                            break;
                        }
                    }
                }
                tL_messageMediaPoll.results.flags |= 2;
            } else if (!z && (poll = tL_messageMediaPoll.poll) != null && poll.hide_results_until_close && ((arrayList = pollResults.results) == null || arrayList.isEmpty())) {
                tL_messageMediaPoll.results.results = new ArrayList<>();
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
                pollResults3.flags = iqd.b(pollResults3.flags, 2, false);
            }
            if ((pollResults.flags & 4) != 0) {
                TLRPC.PollResults pollResults4 = tL_messageMediaPoll.results;
                pollResults4.total_voters = pollResults.total_voters;
                pollResults4.flags |= 4;
            }
            if ((pollResults.flags & 8) != 0) {
                TLRPC.PollResults pollResults5 = tL_messageMediaPoll.results;
                pollResults5.recent_voters = pollResults.recent_voters;
                pollResults5.flags |= 8;
            }
            if ((pollResults.flags & 16) != 0) {
                TLRPC.PollResults pollResults6 = tL_messageMediaPoll.results;
                pollResults6.solution = pollResults.solution;
                pollResults6.solution_entities = pollResults.solution_entities;
                pollResults6.flags |= 16;
            }
            if (!pollResults.min) {
                TLRPC.PollResults pollResults7 = tL_messageMediaPoll.results;
                pollResults7.has_unread_votes = pollResults.has_unread_votes;
                pollResults7.can_view_stats = pollResults.can_view_stats;
            }
        }
    }

    public static void d(CharSequence charSequence, boolean z) {
        e(z, charSequence, true, false, false);
    }

    public static SpannableStringBuilder d0(TL_iv.RichMessage richMessage) {
        return e0(richMessage, 1024);
    }

    public static void e(boolean z, CharSequence charSequence, boolean z2, boolean z3, boolean z4) {
        if ((charSequence instanceof Spannable) && M(charSequence)) {
            try {
                gm.c((Spannable) charSequence, 1, z4, false);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            h(z, charSequence, z2, 0, 0, z3);
        }
    }

    public static SpannableStringBuilder e0(TL_iv.RichMessage richMessage, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            for (int i2 = 0; i2 < richMessage.blocks.size(); i2++) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i2);
                if (i2 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                c0(pageBlock, i, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i) {
                    spannableStringBuilder.delete(i, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static String e2(TLObject tLObject, ArrayList arrayList, int i) {
        String str;
        String K;
        long j;
        String str2;
        long j2;
        String str3 = null;
        if (tLObject == null) {
            str2 = "";
            j2 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (user.deleted) {
                    str = jb6.M0(2131749085, null);
                } else {
                    str = bw2.m(0, user.first_name, user.last_name);
                }
                K = m9c.p(user);
                j = user.id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                K = sd2.K(chat, false);
                j = -chat.id;
            }
            str2 = str;
            str3 = K;
            j2 = j;
        }
        if (i >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j2;
            tL_messageEntityMentionName.offset = i;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (i >= 0) {
                TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
                tL_messageEntityMentionName2.user_id = j2;
                tL_messageEntityMentionName2.offset = str2.length() + i + 2;
                tL_messageEntityMentionName2.length = str3.length() + 1;
                arrayList.add(tL_messageEntityMentionName2);
            }
            return String.format("%1$s (@%2$s)", str2, str3);
        }
        return str2;
    }

    public static boolean e3(TLRPC.Message message) {
        if (c3(message) && !c5(message)) {
            return true;
        }
        return false;
    }

    public static void e6(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message != null && tL_messageReactions != null) {
            TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
            if (tL_messageReactions2 != null) {
                int size = tL_messageReactions2.results.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    TLRPC.ReactionCount reactionCount = message.reactions.results.get(i);
                    int size2 = tL_messageReactions.results.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i2);
                        if (l39.g(reactionCount.reaction, reactionCount2.reaction)) {
                            if (!z && tL_messageReactions.min && reactionCount.chosen) {
                                reactionCount2.chosen = true;
                                z = true;
                            }
                            reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                        }
                    }
                    if (reactionCount.chosen) {
                        z = true;
                    }
                }
            }
            message.reactions = tL_messageReactions;
            message.flags |= 1048576;
        }
    }

    public static void f0(TL_iv.RichText richText, int i, SpannableStringBuilder spannableStringBuilder, int i2) {
        if (richText != null) {
            int length = spannableStringBuilder.length();
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
            } else if (richText instanceof TL_iv.textButton) {
                f0(richText.text, i, spannableStringBuilder, i2);
            } else if (richText instanceof TL_iv.textBold) {
                f0(richText.text, i, spannableStringBuilder, i2 | 1);
            } else if (richText instanceof TL_iv.textItalic) {
                f0(richText.text, i, spannableStringBuilder, i2 | 2);
            } else if (richText instanceof TL_iv.textUnderline) {
                f0(richText.text, i, spannableStringBuilder, i2 | 16);
            } else if (richText instanceof TL_iv.textStrike) {
                f0(richText.text, i, spannableStringBuilder, i2 | 8);
            } else if (richText instanceof TL_iv.textFixed) {
                f0(richText.text, i, spannableStringBuilder, i2 | 4);
            } else if (richText instanceof TL_iv.textSpoiler) {
                f0(richText.text, i, spannableStringBuilder, i2 | 256);
            } else if (richText instanceof TL_iv.textUrl) {
                f0(richText.text, i, spannableStringBuilder, i2);
                if (spannableStringBuilder.length() > length) {
                    ?? obj = new Object();
                    obj.a = i2;
                    spannableStringBuilder.setSpan(new e6c(richText.url, obj), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textEmail) {
                f0(richText.text, i, spannableStringBuilder, i2);
                if (spannableStringBuilder.length() > length) {
                    ?? obj2 = new Object();
                    obj2.a = i2;
                    spannableStringBuilder.setSpan(new i6c("mailto:" + richText.email, obj2), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textMath) {
                spannableStringBuilder.append((CharSequence) S5(2131231560, "fx")).append(" ").append((CharSequence) jb6.M0(2131754863, null));
            } else if (richText instanceof TL_iv.textPhone) {
                f0(richText.text, i, spannableStringBuilder, i2);
                if (spannableStringBuilder.length() > length) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String h = r58.h(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        h = b10.h("+", h);
                    }
                    ?? obj3 = new Object();
                    obj3.a = i2;
                    spannableStringBuilder.setSpan(new g6c(b10.h("tel:", h), (wkb) obj3), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i3);
                    i3++;
                    f0(richText2, i, spannableStringBuilder, i2);
                    if (spannableStringBuilder.length() >= i) {
                        spannableStringBuilder.delete(i, spannableStringBuilder.length());
                        spannableStringBuilder.append("…");
                        return;
                    }
                }
            }
            if (spannableStringBuilder.length() > length && i2 != 0) {
                ?? obj4 = new Object();
                obj4.a = i2;
                spannableStringBuilder.setSpan(new xkb(obj4, 0), length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static int f1(TLRPC.BotInlineResult botInlineResult) {
        int j2 = (int) j2(botInlineResult.content);
        if (j2 == 0) {
            return (int) j2(botInlineResult.thumb);
        }
        return j2;
    }

    public static String f2(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append("@");
                sb.append((String) arrayList.get(i));
                if (i < arrayList.size() - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }
        return jb6.M0(2131743348, null).toLowerCase();
    }

    public static boolean f3(int i) {
        if ((i & 1879048192) == 1610612736) {
            return true;
        }
        return false;
    }

    public static StaticLayout f5(float f, float f2, int i, Layout.Alignment alignment, TextPaint textPaint, CharSequence charSequence, boolean z) {
        int i2;
        if (i <= 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setLineSpacing(f2, f).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
            if (z) {
                alignment2.setIncludePad(false);
            }
            if (i3 >= 28) {
                alignment2.setUseLineSpacingFromFallbacks(false);
            }
            StaticLayout build = alignment2.build();
            for (int i4 = 0; i4 < build.getLineCount(); i4++) {
                if (build.getLineRight(i4) > i2) {
                    StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setLineSpacing(f2, f).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
                    if (z) {
                        alignment3.setIncludePad(false);
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        alignment3.setUseLineSpacingFromFallbacks(false);
                    }
                    return alignment3.build();
                }
            }
            return build;
        }
        return new StaticLayout(charSequence, textPaint, i2, alignment, f, f2, false);
    }

    public static void g(int i, TLRPC.MessageReactions messageReactions, int i2, long j, boolean z) {
        TLRPC.MessageReactor messageReactor = null;
        boolean z2 = false;
        TLRPC.ReactionCount reactionCount = null;
        for (int i3 = 0; i3 < messageReactions.results.size(); i3++) {
            if (messageReactions.results.get(i3).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i3);
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= messageReactions.top_reactors.size()) {
                break;
            } else if (messageReactions.top_reactors.get(i4).my) {
                messageReactor = messageReactions.top_reactors.get(i4);
                break;
            } else {
                i4++;
            }
        }
        if (reactionCount == null && i2 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z;
            int max = Math.max(0, reactionCount.count + i2);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i2 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i2);
            int i5 = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
            if (i5 == 0) {
                z2 = true;
            }
            messageReactor.anonymous = z2;
            if (j != 0 && i5 != 0) {
                messageReactor.peer_id = oc7.r1(i).x1(j);
            } else {
                messageReactor.peer_id = oc7.r1(i).x1(z8c.h(i).e());
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static int[] g1(TLRPC.BotInlineResult botInlineResult) {
        int[] k2 = k2(botInlineResult.content);
        if (k2 == null) {
            int[] k22 = k2(botInlineResult.thumb);
            return k22 == null ? new int[]{0, 0} : k22;
        }
        return k2;
    }

    public static CharSequence g6() {
        CharSequence[] charSequenceArr = r3;
        if (charSequenceArr == null) {
            charSequenceArr = new CharSequence[2];
            r3 = charSequenceArr;
        }
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            pn2 pn2Var = new pn2(2131231975, 0);
            pn2Var.H = 0.9f;
            pn2Var.r = 0.0f;
            pn2Var.s = gm.L(1.0f);
            ((SpannableStringBuilder) r3[0]).setSpan(pn2Var, 0, 1, 33);
        }
        return r3[0];
    }

    public static void h(boolean r18, java.lang.CharSequence r19, boolean r20, int r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.h(boolean, java.lang.CharSequence, boolean, int, int, boolean):void");
    }

    public static CharSequence h0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        cmb.O();
        TextPaint textPaint = cmb.r2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(gm.o());
            textPaint.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        }
        return j0(tL_textWithEntities, z, false, textPaint);
    }

    public static int h2(TLRPC.TL_document tL_document) {
        if (tL_document != null) {
            int size = tL_document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.w;
                }
            }
        }
        return 0;
    }

    public static boolean h4(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                    z = documentAttribute.round_message;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence i0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, TextPaint textPaint) {
        return j0(tL_textWithEntities, z, false, textPaint);
    }

    public static TLRPC.InputStickerSet i1(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public static boolean i4(TLRPC.Message message) {
        if ((n1(message) instanceof TLRPC.TL_messageMediaWebPage) && n1(message).webpage != null) {
            return h4(n1(message).webpage.document);
        }
        if (n1(message) != null && h4(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static CharSequence j0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, boolean z2, TextPaint textPaint) {
        if (tL_textWithEntities != null && tL_textWithEntities.text != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            b(spannableStringBuilder, tL_textWithEntities.entities, z, false, z2, false, 0);
            return A5(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        return "";
    }

    public static TLRPC.InputStickerSet j1(TLRPC.Message message) {
        TLRPC.Document G0 = G0(message);
        if (G0 != null) {
            return i1(G0);
        }
        return null;
    }

    public static double j2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] k2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
        }
        return null;
    }

    public static boolean l3(TLRPC.Message message) {
        if ((message.flags & 4) != 0 && message.fwd_from != null) {
            return true;
        }
        return false;
    }

    public static boolean l4(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || i4(message) || K4(message)) && n1(message).ttl_seconds != 0) {
                return true;
            }
            return false;
        } else if (message instanceof TLRPC.TL_message) {
            if (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (n1(message) instanceof TLRPC.TL_messageMediaDocument)) && n1(message).ttl_seconds != 0) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public static TLRPC.MessageMedia m1(k47 k47Var) {
        TLRPC.Message message;
        if (k47Var != null && (message = k47Var.k) != null) {
            TLRPC.MessageMedia messageMedia = k47Var.a1;
            if (messageMedia != null) {
                return messageMedia;
            }
            return n1(message);
        }
        return null;
    }

    public static CharSequence m2() {
        if (s3 == null) {
            s3 = new SpannableStringBuilder("g");
            pn2 pn2Var = new pn2(2131232166, 0);
            pn2Var.I = 0.7f;
            pn2Var.J = 0.7f;
            s3.setSpan(pn2Var, 0, 1, 33);
        }
        return s3;
    }

    public static boolean m3(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static TLRPC.MessageMedia n1(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
        }
        return message.media;
    }

    public static boolean p(TLRPC.Document document) {
        if ((K2(document, true) || N4(document)) && e86.e(1)) {
            return true;
        }
        return false;
    }

    public static long p1(TLRPC.MessageMedia messageMedia) {
        TLRPC.Document document;
        TLRPC.WebPage webPage;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            document = webPage.document;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            document = messageMedia.game.document;
        } else if (messageMedia != null) {
            document = messageMedia.document;
        } else {
            document = null;
        }
        if (document != null) {
            return document.size;
        }
        return 0L;
    }

    public static void p5(TLRPC.Message message) {
        TLRPC.Peer peer = message.from_id;
        if (peer == null) {
            message.flags &= -257;
        }
        if (peer == null) {
            message.flags &= -5;
        }
        if (message.reply_to == null) {
            message.flags &= -9;
        }
        if (message.media == null) {
            message.flags &= -513;
        }
        if (message.reply_markup == null) {
            message.flags &= -65;
        }
        if (message.replies == null) {
            message.flags &= -8388609;
        }
        if (message.reactions == null) {
            message.flags &= -1048577;
        }
    }

    public static boolean r(int i, boolean z, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (message != null) {
            if (!sd2.V(chat) || !(message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
                if (message.id >= 0) {
                    if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
                        chat = oc7.r1(i).L0(Long.valueOf(message.peer_id.channel_id));
                    }
                    if (sd2.T(chat)) {
                        if (z && !chat.megagroup) {
                            if (!chat.creator) {
                                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat.admin_rights;
                                if (tL_chatAdminRights2 != null) {
                                    if (!tL_chatAdminRights2.delete_messages && !message.out) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                        } else {
                            boolean z2 = message.out;
                            if (z2 && (message instanceof TLRPC.TL_messageService)) {
                                if (message.id == 1 || !sd2.y(13, chat)) {
                                    return false;
                                }
                            } else if (!z) {
                                if (message.id != 1) {
                                    if (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || (!tL_chatAdminRights.delete_messages && (!z2 || (!chat.megagroup && !tL_chatAdminRights.post_messages)))) && (!chat.megagroup || !z2))) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                        }
                    } else if (!z && !message.out && sd2.T(chat)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean r3(vuc vucVar) {
        if (vucVar != null) {
            if (!vucVar.e.equals("image/gif")) {
                if ("video/mp4".equals(vucVar.e)) {
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < vucVar.c.size(); i3++) {
                        TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) vucVar.c.get(i3);
                        if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            i = documentAttribute.w;
                            i2 = documentAttribute.h;
                        }
                    }
                    if (i <= 1280 && i2 <= 1280) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static CharSequence r5(int i, long j) {
        CharSequence m2;
        if (j >= 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            if (W1 != null) {
                return gm.A2(m9c.r(W1));
            }
            return "";
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        if (L0 != null) {
            if (sd2.V(L0)) {
                m2 = F();
            } else {
                m2 = m2();
            }
            return new SpannableStringBuilder(m2).append((CharSequence) " ").append((CharSequence) gm.A2(L0.title));
        }
        return "";
    }

    public static boolean s3(TLRPC.Document document, boolean z) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((str.equals("image/gif") && !z) || M3(document)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static CharSequence s5(int i, TLRPC.Peer peer, boolean z) {
        TLRPC.Chat L0;
        CharSequence m2;
        CharSequence m22;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(peer.user_id));
            if (W1 != null) {
                if (z) {
                    return new SpannableStringBuilder(g6()).append((CharSequence) " ").append((CharSequence) m9c.r(W1));
                }
                return m9c.r(W1);
            }
            return "";
        } else if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(peer.chat_id));
            if (L02 != null) {
                if (z) {
                    if (sd2.V(L02)) {
                        m22 = F();
                    } else {
                        m22 = m2();
                    }
                    return new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) L02.title);
                }
                return L02.title;
            }
            return "";
        } else if ((peer instanceof TLRPC.TL_peerChannel) && (L0 = oc7.r1(i).L0(Long.valueOf(peer.channel_id))) != null) {
            if (z) {
                if (sd2.V(L0)) {
                    m2 = F();
                } else {
                    m2 = m2();
                }
                return new SpannableStringBuilder(m2).append((CharSequence) " ").append((CharSequence) L0.title);
            }
            return L0.title;
        } else {
            return "";
        }
    }

    public static String t0(TLRPC.Document document, boolean z) {
        String str;
        if (document != null && !"audio/ogg".equals(document.mime_type)) {
            int size = document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (!documentAttribute.voice) {
                        String str2 = documentAttribute.performer;
                        String str3 = documentAttribute.title;
                        if (!TextUtils.isEmpty(str2)) {
                            for (int i2 = 0; i2 < 14; i2++) {
                                str2 = str2.replace(p3[i2], " ");
                            }
                        }
                        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("athumb://itunes.apple.com/search?term=");
                                sb.append(URLEncoder.encode(str2 + " - " + str3, "UTF-8"));
                                sb.append("&entity=song&limit=4");
                                if (z) {
                                    str = "&s=1";
                                } else {
                                    str = "";
                                }
                                sb.append(str);
                                return sb.toString();
                            } catch (Exception unused) {
                                continue;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean t3(TLRPC.Message message) {
        boolean z;
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return s3(n1(message).webpage.document, false);
        }
        if (n1(message) != null) {
            TLRPC.Document document = n1(message).document;
            if (message.grouped_id != 0) {
                z = true;
            } else {
                z = false;
            }
            if (s3(document, z)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t4(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker) {
                    if (!"image/webp".equals(document.mime_type) && !"video/webm".equals(document.mime_type)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean t5(TLRPC.InputPeer inputPeer, TLRPC.InputPeer inputPeer2) {
        if (inputPeer == null) {
            if (inputPeer2 == null) {
                return true;
            }
        } else if (inputPeer2 != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (inputPeer2 instanceof TLRPC.TL_inputPeerChat)) {
                if (inputPeer.chat_id != inputPeer2.chat_id) {
                    return false;
                }
                return true;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (inputPeer2 instanceof TLRPC.TL_inputPeerChannel)) {
                if (inputPeer.channel_id != inputPeer2.channel_id) {
                    return false;
                }
                return true;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (inputPeer2 instanceof TLRPC.TL_inputPeerUser)) {
                if (inputPeer.user_id != inputPeer2.user_id) {
                    return false;
                }
                return true;
            } else if (!(inputPeer instanceof TLRPC.TL_inputPeerSelf) || !(inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static long u1(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j = peer.chat_id;
        if (j == 0) {
            j = peer.channel_id;
            if (j == 0) {
                return peer.user_id;
            }
        }
        return -j;
    }

    public static boolean u4(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u5(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null) {
            if (peer2 == null) {
                return true;
            }
        } else if (peer2 != null) {
            if ((peer instanceof TLRPC.TL_peerChat) && (peer2 instanceof TLRPC.TL_peerChat)) {
                if (peer.chat_id == peer2.chat_id) {
                    return true;
                }
                return false;
            } else if ((peer instanceof TLRPC.TL_peerChannel) && (peer2 instanceof TLRPC.TL_peerChannel)) {
                if (peer.channel_id == peer2.channel_id) {
                    return true;
                }
                return false;
            } else if ((peer instanceof TLRPC.TL_peerUser) && (peer2 instanceof TLRPC.TL_peerUser) && peer.user_id == peer2.user_id) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static long v0(TLRPC.Message message) {
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static String v1(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    if (TextUtils.isEmpty(str)) {
                        return jb6.M0(2131753865, null);
                    }
                    return str;
                }
            }
        }
        return jb6.M0(2131753865, null);
    }

    public static boolean v4(TLRPC.Message message) {
        if (n1(message) != null && t4(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_textWithEntities w5(TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (tL_textWithEntities == null) {
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i = 0; i < tL_textWithEntities.entities.size(); i++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    public static String x1(TLRPC.Document document) {
        if (document == null) {
            return jb6.M0(2131753864, null);
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String B = bc4.B(document);
                if (TextUtils.isEmpty(B)) {
                    return jb6.M0(2131753864, null);
                }
                return B;
            }
        }
        String B2 = bc4.B(document);
        if (!TextUtils.isEmpty(B2)) {
            return B2;
        }
        return jb6.M0(2131753864, null);
    }

    public static void x5(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                if (!(uRLSpan instanceof jo4)) {
                    spannable.removeSpan(uRLSpan);
                }
            }
        }
    }

    public static boolean y(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((W2(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) || (Build.VERSION.SDK_INT >= 26 && str.equalsIgnoreCase("image/heic"))) {
                for (int i = 0; i < document.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        if (tL_documentAttributeImageSize.w >= 6000 || tL_documentAttributeImageSize.h >= 6000) {
                            return false;
                        }
                        return true;
                    }
                }
            } else {
                boolean z = e21.a;
            }
        }
        return false;
    }

    public static Spannable y5(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        return A5(charSequence, arrayList, fontMetricsInt, false);
    }

    public static int z0(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        if (todoList == null || todoList.list == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < tL_messageMediaToDo.completions.size(); i2++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                } else if (tL_messageMediaToDo.todo.list.get(i3).id == todoCompletion.id) {
                    i++;
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i;
    }

    public final long A0() {
        return B0(this.k);
    }

    public final int A1() {
        int i;
        int L;
        int i2;
        if (this.t1 && (i2 = this.d2) > 0) {
            return i2;
        }
        if (gm.O1()) {
            if (this.D == 36) {
                Point point = gm.q;
                i = point.x;
                if (!gm.E) {
                    if (!gm.N1() || i > point.y) {
                        L = gm.k1(i, 0, 0);
                    } else {
                        return i;
                    }
                } else {
                    return i;
                }
            } else {
                return gm.P0();
            }
        } else {
            Point point2 = gm.q;
            i = point2.x;
            if (i > point2.y) {
                L = gm.L(50.0f);
            } else {
                return i;
            }
        }
        return i - L;
    }

    public final boolean A2() {
        int i;
        if (c1() != 0) {
            ArrayList arrayList = this.p0;
            if ((arrayList != null && !arrayList.isEmpty()) || (i = this.D) == 3 || i == 1 || i == 14 || i == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A3() {
        TLRPC.WebPage webPage;
        String str = null;
        if (!this.G0 && !this.N2 && (n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && (n1(this.k).webpage instanceof TLRPC.TL_webPage)) {
            webPage = n1(this.k).webpage;
        } else {
            webPage = null;
        }
        if (webPage != null) {
            str = webPage.type;
        }
        if (webPage == null || !TextUtils.isEmpty(webPage.description) || !TextUtils.isEmpty(webPage.title)) {
            if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_botinvite".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean B() {
        if (D2(true)) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (F0 != null && !(F0 instanceof TLRPC.TL_documentEncrypted)) {
            if (gda.y0) {
                return true;
            }
            for (int i = 0; i < F0.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (gda.z0 && "video/x-matroska".equals(F0.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B2() {
        k47 k47Var;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.k;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (k47Var = this.C) != null) {
            TLRPC.Message message2 = k47Var.k;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B3(long j) {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null) {
            if (j == 0 || messageReplies.channel_id == j) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean C() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return D((TLRPC.TL_messageMediaPoll) n1);
    }

    public final String C0() {
        if (!T2()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) n1(this.k);
        if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
            return "🎲";
        }
        return tL_messageMediaDice.emoticon.replace("️", "");
    }

    public final boolean C2() {
        return D2(true);
    }

    public final boolean C3() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public final boolean C4() {
        if (this.D == 17 && (n1(this.k) instanceof TLRPC.TL_messageMediaToDo)) {
            return true;
        }
        return false;
    }

    public final void C5(Spannable spannable, int[] iArr) {
        int length;
        boolean z;
        CharSequence charSequence;
        if (wi8.A(spannable)) {
            Object[] objArr = (dw3[]) spannable.getSpans(0, spannable.length(), dw3.class);
            gn[] gnVarArr = (gn[]) spannable.getSpans(0, spannable.length(), gn.class);
            if (objArr != null) {
                int length2 = iArr[0] - objArr.length;
                if (gnVarArr == null) {
                    length = 0;
                } else {
                    length = gnVarArr.length;
                }
                if (length2 - length <= 0) {
                    for (int i = 0; i < objArr.length; i++) {
                        String str = objArr[i].d;
                        if (gw3.b(str)) {
                            z = true;
                            charSequence = str.subSequence(0, str.length() - 2);
                        } else {
                            z = false;
                            charSequence = str;
                        }
                        TLRPC.Document V = hs6.d0(this.K1).V(charSequence);
                        if (V != null) {
                            int spanStart = spannable.getSpanStart(objArr[i]);
                            int spanEnd = spannable.getSpanEnd(objArr[i]);
                            spannable.removeSpan(objArr[i]);
                            gn gnVar = new gn(V, objArr[i].a);
                            gnVar.standard = true;
                            gnVar.invert = z;
                            spannable.setSpan(gnVar, spanStart, spanEnd, 33);
                        }
                    }
                }
            }
        }
    }

    public final int D0() {
        if (n1(this.k) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) n1(this.k)).value;
        }
        return -1;
    }

    public final long D1() {
        if (this.D != 17) {
            return 0L;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return 0L;
        }
        return ((TLRPC.TL_messageMediaPoll) n1).poll.id;
    }

    public final boolean D2(boolean z) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        ArrayList X;
        if (this.d3 == null) {
            try {
                TLRPC.Message message = this.k;
                boolean z2 = false;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i = this.K1;
                    TLRPC.Message message2 = this.k;
                    if (message2 != null) {
                        messageMedia2 = message2.media;
                    } else {
                        messageMedia2 = null;
                    }
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                        int i2 = ndc.k0;
                        X = new ArrayList();
                    } else {
                        X = ndc.X(i, messageMedia2.document, messageMedia2.alt_documents, 0, z);
                    }
                    this.e3 = X;
                    if (X.size() > 1) {
                        z2 = true;
                    }
                    this.d3 = Boolean.valueOf(z2);
                    this.g3 = ndc.a0(this.e3);
                    this.h3 = ndc.b0(this.e3);
                    this.i3 = ndc.O(this.e3);
                } else {
                    this.d3 = Boolean.FALSE;
                    return false;
                }
            } catch (Exception e) {
                fc4.g(e, true);
                this.d3 = Boolean.FALSE;
            }
        }
        return this.d3.booleanValue();
    }

    public final boolean D3() {
        TLRPC.MessageMedia m1 = m1(this);
        if (m1 != null && m1.live_photo) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        int i;
        if (this.k.action == null) {
            if (!x2()) {
                k47 k47Var = this.C;
                if (k47Var == null || k47Var.k.replies == null) {
                    TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
                    if (messageReplyHeader != null) {
                        i = messageReplyHeader.reply_to_top_id;
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
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

    public org.telegram.tgnet.tl.TL_iv.RichMessage E0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.E0():org.telegram.tgnet.tl.TL_iv$RichMessage");
    }

    public final boolean E2() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return T4((TLRPC.TL_messageMediaPoll) n1);
    }

    public final boolean E4() {
        TLRPC.Message message = this.k;
        if (message != null && message.unread) {
            return true;
        }
        return false;
    }

    public final CharSequence E5(String str, ArrayList arrayList, AbstractMap abstractMap, vh6 vh6Var) {
        TLRPC.User user;
        if (TextUtils.indexOf(str, "un2") >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            for (int i = 0; i < arrayList.size(); i++) {
                if (abstractMap != null) {
                    user = (TLRPC.User) abstractMap.get(arrayList.get(i));
                } else if (vh6Var != null) {
                    user = (TLRPC.User) vh6Var.f(((Long) arrayList.get(i)).longValue());
                } else {
                    user = null;
                }
                if (user == null) {
                    user = oc7.r1(this.K1).W1((Long) arrayList.get(i));
                }
                if (user != null) {
                    String r = m9c.r(user);
                    int length = spannableStringBuilder.length();
                    if (spannableStringBuilder.length() != 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                    spannableStringBuilder.append((CharSequence) r);
                    spannableStringBuilder.setSpan(new h6c(String.valueOf(user.id)), length, r.length() + length, 33);
                }
            }
            return TextUtils.replace(str, new String[]{"un2"}, new CharSequence[]{spannableStringBuilder});
        }
        return str;
    }

    public final TLRPC.Document F0() {
        mdc mdcVar;
        TLRPC.Document document = this.n;
        if (document != null) {
            return document;
        }
        if (D2(true) && (mdcVar = this.g3) != null) {
            return mdcVar.g;
        }
        return G0(this.k);
    }

    public final boolean F2() {
        if (G2() && H2(F0())) {
            return true;
        }
        return false;
    }

    public final boolean F3() {
        return G3(this.k, true);
    }

    public final boolean F4() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public final void F5() {
        this.b0 = 0.0f;
        this.i0 = 0;
        this.g0 = 0.0f;
    }

    public final void G() {
        gn[] gnVarArr;
        int i;
        this.n = null;
        this.o = null;
        if (this.P1 == 1 && !(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && !(n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && ((n1(this.k) instanceof TLRPC.TL_messageMediaEmpty) || n1(this.k) == null)) {
            TLRPC.Message message = this.k;
            if (message.grouped_id == 0) {
                boolean isEmpty = message.entities.isEmpty();
                int i2 = this.K1;
                if (isEmpty) {
                    String str = this.v;
                    int indexOf = TextUtils.indexOf(str, "🏻");
                    if (indexOf >= 0) {
                        this.u = "_c1";
                        str = str.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(str, "🏼");
                        if (indexOf >= 0) {
                            this.u = "_c2";
                            str = str.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(str, "🏽");
                            if (indexOf >= 0) {
                                this.u = "_c3";
                                str = str.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(str, "🏾");
                                if (indexOf >= 0) {
                                    this.u = "_c4";
                                    str = str.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(str, "🏿");
                                    if (indexOf >= 0) {
                                        this.u = "_c5";
                                        str = str.subSequence(0, indexOf);
                                    } else {
                                        this.u = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.u) && (i = indexOf + 2) < this.v.length()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.toString());
                        CharSequence charSequence = this.v;
                        sb.append(charSequence.subSequence(i, charSequence.length()).toString());
                        str = sb.toString();
                    }
                    if (TextUtils.isEmpty(this.u) || zx3.l.contains(str.toString())) {
                        this.n = hs6.d0(i2).V(str);
                    }
                } else if (this.k.entities.size() == 1 && (this.k.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.k.entities.get(0)).document_id);
                        this.o = valueOf;
                        TLRPC.Document e = vm.e(i2, valueOf.longValue());
                        this.n = e;
                        if (e == null) {
                            CharSequence charSequence2 = this.v;
                            if ((charSequence2 instanceof Spanned) && (gnVarArr = (gn[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), gn.class)) != null && gnVarArr.length == 1) {
                                this.n = gnVarArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.n == null && this.o == null) {
            n0(null);
        } else if (s4()) {
            this.D = 13;
        } else if (J2()) {
            this.D = 15;
        } else {
            this.D = 1000;
        }
    }

    public float G1() {
        return 0.0f;
    }

    public final boolean G2() {
        if (this.n == null && this.o == null) {
            return false;
        }
        return true;
    }

    public final boolean G4() {
        return K4(this.k);
    }

    public final boolean G5(k39 k39Var, boolean z) {
        vs2 vs2Var;
        TLRPC.Peer tL_peerUser;
        TLRPC.Peer tL_peerUser2;
        int i;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z2;
        boolean z3;
        TLRPC.Message message = this.k;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i2 = this.K1;
        if (tL_messageReactions2 == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.k;
            TLRPC.TL_messageReactions tL_messageReactions3 = message2.reactions;
            if (B0(message2) == z8c.h(i2).e()) {
                z2 = true;
            } else {
                z2 = false;
            }
            tL_messageReactions3.reactions_as_tags = z2;
            TLRPC.TL_messageReactions tL_messageReactions4 = this.k.reactions;
            if (!o3() && !p3()) {
                z3 = false;
            } else {
                z3 = true;
            }
            tL_messageReactions4.can_see_list = z3;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k.reactions.results.size(); i4++) {
            TLRPC.ReactionCount reactionCount2 = this.k.reactions.results.get(i4);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i5 = reactionCount2.chosen_order;
                if (i5 > i3) {
                    i3 = i5;
                }
            }
            TLRPC.Reaction reaction = this.k.reactions.results.get(i4).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = k39Var.f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.k.reactions.results.get(i4);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j = k39Var.g;
                if (j != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j) {
                    reactionCount = this.k.reactions.results.get(i4);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z) {
            return true;
        }
        oc7 r1 = oc7.r1(i2);
        boolean p = r1.getUserConfig().p();
        gs gsVar = r1.l4;
        if (p) {
            vs2Var = gsVar.n1;
        } else {
            vs2Var = gsVar.m1;
        }
        int f = vs2Var.f();
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i6 = reactionCount.count - 1;
                reactionCount.count = i6;
                if (i6 <= 0) {
                    this.k.reactions.results.remove(reactionCount);
                }
            }
            if (this.k.reactions.can_see_list) {
                int i7 = 0;
                while (i7 < this.k.reactions.recent_reactions.size()) {
                    if (B1(this.k.reactions.recent_reactions.get(i7).peer_id) == z8c.h(i2).e() && n39.c(this.k.reactions.recent_reactions.get(i7).reaction, k39Var)) {
                        this.k.reactions.recent_reactions.remove(i7);
                        i7--;
                    }
                    i7++;
                }
            }
            this.H = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= f) {
            int i8 = 0;
            for (int i9 = 1; i9 < arrayList.size(); i9++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i9)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i9)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i8)).chosen_order) {
                    i8 = i9;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i8);
            reactionCount3.chosen = false;
            int i10 = reactionCount3.count - 1;
            reactionCount3.count = i10;
            if (i10 <= 0) {
                this.k.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.k.reactions.can_see_list) {
                int i11 = 0;
                while (i11 < this.k.reactions.recent_reactions.size()) {
                    if (B1(this.k.reactions.recent_reactions.get(i11).peer_id) == z8c.h(i2).e() && n39.c(this.k.reactions.recent_reactions.get(i11).reaction, k39Var)) {
                        this.k.reactions.recent_reactions.remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        if (reactionCount == null) {
            int N0 = oc7.r1(i2).N0(B0(this.k));
            TLRPC.Message message3 = this.k;
            if (message3 != null && (tL_messageReactions = message3.reactions) != null) {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i = 0;
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i12);
                    i12++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (i + 1 > N0) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = k39Var.g();
            this.k.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i3 + 1;
        TLRPC.Message message4 = this.k;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && f > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.k;
            if (message5.isThreadMessage && message5.fwd_from != null) {
                oc7 r12 = oc7.r1(i2);
                TLRPC.ChatFull M0 = r12.M0(-Z0());
                if (M0 == null || (tL_peerUser2 = M0.default_send_as) == null) {
                    tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_peerUser2.user_id = z8c.h(r12.getAccountInstance().a).n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser2;
            } else {
                oc7 r13 = oc7.r1(i2);
                TLRPC.ChatFull M02 = r13.M0(-B0(this.k));
                if (M02 == null || (tL_peerUser = M02.default_send_as) == null) {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = z8c.h(r13.getAccountInstance().a).n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser;
            }
            this.k.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (k39Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = k39Var.f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = k39Var.g;
            }
        }
        this.H = true;
        return true;
    }

    public final void H(int[] iArr) {
        Integer valueOf;
        int length;
        int length2;
        int length3;
        int length4;
        int length5;
        boolean z;
        boolean z2;
        TextPaint textPaint;
        if (iArr == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(iArr[0]);
        }
        int i = -1;
        if (valueOf != null && valueOf.intValue() >= 1 && this.k != null && !u2()) {
            CharSequence charSequence = this.v;
            dw3[] dw3VarArr = (dw3[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), dw3.class);
            CharSequence charSequence2 = this.v;
            gn[] gnVarArr = (gn[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), gn.class);
            int intValue = valueOf.intValue();
            if (dw3VarArr == null) {
                length = 0;
            } else {
                length = dw3VarArr.length;
            }
            if (gnVarArr == null) {
                length2 = 0;
            } else {
                length2 = gnVarArr.length;
            }
            this.P1 = Math.max(intValue, length + length2);
            if (gnVarArr == null) {
                length3 = 0;
            } else {
                length3 = gnVarArr.length;
            }
            this.R1 = length3;
            this.Q1 = 0;
            if (gnVarArr != null) {
                for (gn gnVar : gnVarArr) {
                    if (!gnVar.standard) {
                        this.Q1++;
                    }
                }
            }
            int i2 = this.P1;
            if (dw3VarArr == null) {
                length4 = 0;
            } else {
                length4 = dw3VarArr.length;
            }
            int i3 = i2 - length4;
            if (gnVarArr == null) {
                length5 = 0;
            } else {
                length5 = gnVarArr.length;
            }
            if (i3 - length5 > 0) {
                z = true;
            } else {
                z = false;
            }
            this.O1 = z;
            if (i2 != 0 && !z) {
                int i4 = this.Q1;
                if (i2 == i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i5 = 2;
                switch (Math.max(i2, i4)) {
                    case 0:
                    case 1:
                    case 2:
                        TextPaint[] textPaintArr = cmb.x2;
                        if (z2) {
                            textPaint = textPaintArr[0];
                        } else {
                            textPaint = textPaintArr[2];
                        }
                        i5 = 1;
                        break;
                    case 3:
                        TextPaint[] textPaintArr2 = cmb.x2;
                        if (z2) {
                            textPaint = textPaintArr2[1];
                        } else {
                            textPaint = textPaintArr2[3];
                        }
                        i5 = 1;
                        break;
                    case 4:
                        TextPaint[] textPaintArr3 = cmb.x2;
                        if (z2) {
                            textPaint = textPaintArr3[2];
                        } else {
                            textPaint = textPaintArr3[4];
                        }
                        i5 = 1;
                        break;
                    case 5:
                        TextPaint[] textPaintArr4 = cmb.x2;
                        if (z2) {
                            textPaint = textPaintArr4[3];
                            break;
                        } else {
                            textPaint = textPaintArr4[5];
                            break;
                        }
                    case 6:
                        TextPaint[] textPaintArr5 = cmb.x2;
                        if (z2) {
                            textPaint = textPaintArr5[4];
                            break;
                        } else {
                            textPaint = textPaintArr5[5];
                            break;
                        }
                    default:
                        if (this.P1 > 9) {
                            i = 0;
                        }
                        textPaint = cmb.x2[5];
                        i5 = i;
                        break;
                }
                int textSize = (int) (textPaint.getTextSize() + gm.L(4.0f));
                if (dw3VarArr != null && dw3VarArr.length > 0) {
                    for (dw3 dw3Var : dw3VarArr) {
                        dw3Var.a = textPaint.getFontMetricsInt();
                        dw3Var.c = textSize;
                    }
                }
                if (gnVarArr != null && gnVarArr.length > 0) {
                    for (int i6 = 0; i6 < gnVarArr.length; i6++) {
                        gnVarArr[i6].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i5);
                        gnVarArr[i6].full = true;
                    }
                    return;
                }
                return;
            } else if (gnVarArr != null && gnVarArr.length > 0) {
                for (int i7 = 0; i7 < gnVarArr.length; i7++) {
                    gnVarArr[i7].replaceFontMetrics(cmb.n2.getFontMetricsInt(), (int) (cmb.n2.getTextSize() + gm.L(4.0f)), -1);
                    gnVarArr[i7].full = false;
                }
                return;
            } else {
                return;
            }
        }
        CharSequence charSequence3 = this.v;
        gn[] gnVarArr2 = (gn[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), gn.class);
        if (gnVarArr2 != null && gnVarArr2.length > 0) {
            this.R1 = gnVarArr2.length;
            for (int i8 = 0; i8 < gnVarArr2.length; i8++) {
                gnVarArr2[i8].replaceFontMetrics(cmb.n2.getFontMetricsInt(), (int) (cmb.n2.getTextSize() + gm.L(4.0f)), -1);
                gnVarArr2[i8].full = false;
            }
            return;
        }
        this.R1 = 0;
    }

    public final boolean H3() {
        TLRPC.Message message = this.k;
        if (message != null && n1(message) != null && !(n1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return false;
        }
        return true;
    }

    public final boolean H4() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.k.action;
        if (messageAction != null && (photo = messageAction.photo) != null && !photo.video_sizes.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void H5() {
        this.k.unread = false;
    }

    public final boolean I() {
        CharSequence charSequence;
        TLRPC.User user;
        TextPaint textPaint;
        int[] iArr;
        int A1;
        float f;
        int L;
        int i = this.D;
        if ((i == 0 || i == 19 || i == 36) && this.k.peer_id != null && (charSequence = this.v) != null && (charSequence.length() != 0 || this.Y1)) {
            if (this.S1) {
                if (gm.O1() && this.T != 0) {
                    A1 = gm.L(530.0f);
                } else {
                    A1 = A1();
                }
                TextPaint textPaint2 = cmb.n2;
                if (textPaint2 != null) {
                    f = textPaint2.getTextSize();
                } else {
                    f = 0.0f;
                }
                if (this.D == 36) {
                    L = 0;
                } else {
                    L = gm.L(52.0f);
                }
                if (Math.abs(this.T1 - A1) > L || this.U1 != gm.p || this.W1 != f || this.V1 != P2()) {
                    this.S1 = false;
                }
            }
            if (!this.S1) {
                this.S1 = true;
                if (p3()) {
                    user = oc7.r1(this.K1).W1(Long.valueOf(this.k.from_id.user_id));
                } else {
                    user = null;
                }
                if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                    textPaint = cmb.w2;
                } else {
                    textPaint = cmb.n2;
                }
                if (i()) {
                    iArr = new int[1];
                } else {
                    iArr = null;
                }
                CharSequence m = gw3.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
                this.v = m;
                Spannable z5 = z5(m, textPaint.getFontMetricsInt());
                this.v = z5;
                if (iArr != null && iArr[0] > 1) {
                    C5(z5, iArr);
                }
                H(iArr);
                G();
                K5();
                n0(user);
                if (this.z != null) {
                    this.z = null;
                    k0();
                }
                return true;
            }
        }
        return false;
    }

    public final String I0() {
        return bc4.B(F0());
    }

    public final boolean I2() {
        if (this.D == 19) {
            return true;
        }
        return false;
    }

    public final boolean I3() {
        if (K3(this.k) && !K4(this.k) && !g4()) {
            return true;
        }
        return false;
    }

    public final boolean I4() {
        TLRPC.MessageAction messageAction = this.k.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionPhoneCall) || !messageAction.video) {
            if ((messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void I5(long j) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z;
        TLRPC.Message message = this.k;
        if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.MessageReactor messageReactor = arrayList.get(i);
                i++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (j == 2666000) {
                        z = true;
                    } else {
                        z = false;
                    }
                    messageReactor2.anonymous = z;
                    int i2 = messageReactor2.flags;
                    if (z) {
                        messageReactor2.flags = i2 & (-9);
                        messageReactor2.peer_id = null;
                    } else {
                        messageReactor2.flags = i2 | 8;
                        messageReactor2.peer_id = oc7.r1(this.K1).x1(j);
                    }
                }
            }
        }
    }

    public final void J() {
        K(true);
    }

    public final boolean J2() {
        int i = this.D;
        boolean z = false;
        if (i != 1000) {
            if (i != 15) {
                return false;
            }
            return true;
        }
        boolean B = pg3.B(B0(this.k));
        if (B && this.k.stickerVerified != 1) {
            return false;
        }
        if (this.o != null && this.n == null) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (this.n != null || !B || N3()) {
            z = true;
        }
        return K2(F0, z);
    }

    public final void J5(String str, boolean z) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.a2 = null;
            this.c2 = null;
            this.b2 = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.k.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                n2(arrayList, split, true, z);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.k.message)) {
            String lowerCase3 = this.k.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                n2(arrayList, split, false, z);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (F0() != null) {
            String lowerCase4 = bc4.B(F0()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && (n1(this.k).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = n1(this.k).webpage;
            String str3 = webPage.title;
            if (str3 == null) {
                str3 = webPage.site_name;
            }
            if (str3 != null) {
                String lowerCase5 = str3.toLowerCase();
                if (lowerCase5.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                    arrayList.add(lowerCase);
                }
                arrayList2.addAll(Arrays.asList(lowerCase5.split("[^\\p{L}#$]+")));
            }
        }
        String w1 = w1(true);
        if (w1 != null) {
            String lowerCase6 = w1.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (!arrayList.contains(arrayList2.get(i)) && (indexOf = (str2 = (String) arrayList2.get(i)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i2 = 0;
                        for (int i3 = 0; i3 < min && str2.charAt(i3) == str4.charAt(i3); i3++) {
                            i2++;
                        }
                        if (i2 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i));
                        }
                    }
                }
            }
        }
        n2(arrayList, split, false, z);
    }

    public final void K(boolean z) {
        int i;
        File M;
        boolean z2;
        this.y0 = false;
        this.z0 = false;
        int i2 = this.D;
        int i3 = this.K1;
        if (i2 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.k.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                bc4.G(i3);
                File J = bc4.J(tL_messageExtendedMediaPreview.thumb, null, z, true);
                if (!this.z0) {
                    if (!J.exists() && !(tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.z0 = z2;
                }
            }
        } else if (i2 == 1 && bc4.w(this.p0, gm.Y0(true), false, null, false) != null) {
            bc4.G(i3);
            File M2 = bc4.M(this.k, false, z);
            if (l5()) {
                this.z0 = new File(M2.getAbsolutePath() + ".enc").exists();
            }
            if (!this.z0) {
                this.z0 = M2.exists();
            }
        }
        if ((!this.z0 && this.D == 8) || (i = this.D) == 3 || i == 9 || i == 2 || i == 14 || i == 5) {
            String str = this.k.attachPath;
            if (str != null && str.length() > 0) {
                this.y0 = new File(this.k.attachPath).exists();
            }
            if (!this.y0) {
                if (this.D == 3 && l5() && D3() && F0() != null) {
                    bc4.G(i3);
                    M = bc4.J(F0(), null, true, z);
                } else {
                    bc4.G(i3);
                    M = bc4.M(this.k, false, z);
                }
                if ((this.D == 3 && l5()) || R4() || f4()) {
                    this.z0 = new File(M.getAbsolutePath() + ".enc").exists();
                }
                if (!this.z0) {
                    this.z0 = M.exists();
                }
            }
        }
        if (!this.z0) {
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.k).webpage != null && "telegram_background".equals(n1(this.k).webpage.type)) {
                    bc4.G(i3);
                    this.z0 = bc4.J(F0, null, true, z).exists();
                } else {
                    bc4.G(i3);
                    this.z0 = bc4.J(F0, null, false, z).exists();
                }
            } else {
                int i4 = this.D;
                if (i4 == 0) {
                    TLRPC.PhotoSize w = bc4.w(this.p0, gm.Y0(false), false, null, false);
                    if (w != null) {
                        bc4.G(i3);
                        this.z0 = bc4.J(w, null, true, z).exists();
                    } else {
                        return;
                    }
                } else if (i4 == 11) {
                    TLRPC.Photo photo = this.k.action.photo;
                    if (photo != null && !photo.video_sizes.isEmpty()) {
                        bc4.G(i3);
                        this.z0 = bc4.J(photo.video_sizes.get(0), null, true, z).exists();
                    } else {
                        return;
                    }
                }
            }
        }
        d6(z);
    }

    public final TLRPC.MessagePeerReaction K1() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.recent_reactions) != null && !arrayList.isEmpty()) {
            return this.k.reactions.recent_reactions.get(0);
        }
        return null;
    }

    public final void K5() {
        int i;
        int i2;
        int i3 = this.D;
        this.D = 1000;
        this.S = (byte) 0;
        boolean q4 = q4();
        int i4 = this.K1;
        if (q4) {
            this.D = 0;
        } else {
            int i5 = 1;
            if (this.h1) {
                this.U = 0;
                this.D = 27;
                this.i1 = oc7.r1(i4).X3.getBoolean("c" + B0(this.k) + "_rec", true);
            } else {
                TLRPC.Message message = this.k;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.L1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.U = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                this.D = 10;
                            } else {
                                this.D = 22;
                                ArrayList arrayList = new ArrayList();
                                this.p0 = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.n0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                }
                            }
                        }
                    }
                    if (message instanceof TLRPC.TL_messageService) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (!(messageAction instanceof TLRPC.TL_messageActionChangeCreator) && !(messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) && !(messageAction instanceof TLRPC.TL_messageActionManagedBotCreated)) {
                            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                                this.U = 1;
                                this.D = 10;
                            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                this.U = 1;
                                this.D = 22;
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                ArrayList arrayList2 = new ArrayList();
                                this.p0 = arrayList2;
                                TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                if (document2 != null) {
                                    arrayList2.addAll(document2.thumbs);
                                    this.n0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                this.U = 1;
                                this.D = 21;
                                ArrayList arrayList3 = new ArrayList();
                                this.p0 = arrayList3;
                                arrayList3.addAll(this.k.action.photo.sizes);
                                this.n0 = this.k.action.photo;
                            } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                this.D = 0;
                            } else {
                                boolean z = messageAction instanceof TLRPC.TL_messageActionGiftCode;
                                if (z && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                                    this.U = 1;
                                    this.D = 25;
                                } else if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium) && !z) {
                                    if (!(messageAction instanceof TLRPC.TL_messageActionGiftStars) && !(messageAction instanceof TLRPC.TL_messageActionStarGift) && !(messageAction instanceof TLRPC.TL_messageActionPrizeStars) && ((!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) || !((TLRPC.TL_messageActionStarGiftUnique) messageAction).refunded) && !(messageAction instanceof TLRPC.TL_messageActionGiftTon))) {
                                        if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) && !(messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                            if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                                                TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                                                if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                                                    this.U = -1;
                                                    this.D = -1;
                                                } else {
                                                    this.U = 1;
                                                    this.D = 10;
                                                }
                                            } else if (messageAction instanceof TLRPC.TL_messageActionHistoryClear) {
                                                this.U = -1;
                                                this.D = -1;
                                            } else if (!(messageAction instanceof TLRPC.TL_messageActionPhoneCall) && !(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
                                                if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && (((TLRPC.TL_messageActionSetChatTheme) messageAction).theme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                                    this.D = 31;
                                                    this.U = 1;
                                                } else if (yr7.o(message)) {
                                                    this.D = 10;
                                                    this.U = 1;
                                                } else {
                                                    TLRPC.MessageAction messageAction2 = this.k.action;
                                                    if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) && !(messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer)) {
                                                        if ((messageAction2 instanceof TLRPC.TL_messageActionChangeCommunity) && ((TLRPC.TL_messageActionChangeCommunity) messageAction2).community_id != 0) {
                                                            this.D = 37;
                                                            this.U = 1;
                                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                            this.D = 34;
                                                            this.U = 1;
                                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                                            this.D = 32;
                                                            this.U = 1;
                                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                            this.D = 35;
                                                            this.U = 1;
                                                        } else {
                                                            this.U = 1;
                                                            this.D = 10;
                                                        }
                                                    } else {
                                                        this.D = 33;
                                                        this.U = 1;
                                                    }
                                                }
                                            } else {
                                                this.D = 16;
                                            }
                                        } else {
                                            this.U = 1;
                                            this.D = 11;
                                        }
                                    } else {
                                        this.U = 1;
                                        this.D = 30;
                                    }
                                } else {
                                    this.U = 1;
                                    this.D = 18;
                                }
                            }
                        } else {
                            this.U = 1;
                            this.D = 10;
                        }
                    }
                } else if (n1(message) instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.U = 10;
                    this.D = 38;
                } else if (this.G0) {
                    this.D = 0;
                } else {
                    TLRPC.Message message2 = this.k;
                    if (message2.rich_message == null && !(n1(message2) instanceof TLRPC.TL_messageMediaWidget)) {
                        if (this.n == null && this.o == null) {
                            TLRPC.Message message3 = this.k;
                            if (message3.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                                this.D = 29;
                            } else if (G3(message3, false) && !T2() && !q4() && this.P1 >= 1 && !this.O1 && this.k != null && !u2()) {
                                this.D = 19;
                            } else if (F3()) {
                                this.D = 0;
                                if (TextUtils.isEmpty(this.v) && this.T == 0) {
                                    this.v = "";
                                }
                            } else if (q2()) {
                                this.D = 20;
                            } else if (n1(this.k).ttl_seconds != 0 && ((n1(this.k).photo instanceof TLRPC.TL_photoEmpty) || (F0() instanceof TLRPC.TL_documentEmpty) || (((n1(this.k) instanceof TLRPC.TL_messageMediaDocument) && F0() == null) || this.I0))) {
                                this.U = 1;
                                this.D = 10;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGiveaway) {
                                this.D = 26;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                this.D = 28;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaDice) {
                                this.D = 15;
                                if (n1(this.k).document == null) {
                                    n1(this.k).document = new TLRPC.TL_document();
                                    n1(this.k).document.file_reference = new byte[0];
                                    n1(this.k).document.mime_type = "application/x-tgsdice";
                                    n1(this.k).document.dc_id = Integer.MIN_VALUE;
                                    n1(this.k).document.id = -2147483648L;
                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                    tL_documentAttributeImageSize.w = 512;
                                    tL_documentAttributeImageSize.h = 512;
                                    n1(this.k).document.attributes.add(tL_documentAttributeImageSize);
                                }
                            } else {
                                boolean z2 = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
                                TLRPC.Message message4 = this.k;
                                if (z2) {
                                    if (K4(message4)) {
                                        i5 = 3;
                                    }
                                    this.D = i5;
                                } else if (!(n1(message4) instanceof TLRPC.TL_messageMediaGeo) && !(n1(this.k) instanceof TLRPC.TL_messageMediaVenue) && !(n1(this.k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                                    if (g4()) {
                                        this.D = 5;
                                    } else if (K4(this.k)) {
                                        this.D = 3;
                                    } else if (Q4(this.k)) {
                                        this.D = 2;
                                    } else if (I3()) {
                                        this.D = 14;
                                    } else if (n1(this.k) instanceof TLRPC.TL_messageMediaContact) {
                                        this.D = 12;
                                    } else if (!(n1(this.k) instanceof TLRPC.TL_messageMediaPoll) && !(n1(this.k) instanceof TLRPC.TL_messageMediaToDo)) {
                                        if (n1(this.k) instanceof TLRPC.TL_messageMediaUnsupported) {
                                            this.D = 0;
                                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                                            TLRPC.Document F0 = F0();
                                            if (F0 != null && F0.mime_type != null) {
                                                if (s3(F0, z2())) {
                                                    this.D = 8;
                                                } else if (s4()) {
                                                    this.D = 13;
                                                } else if (J2()) {
                                                    this.D = 15;
                                                } else {
                                                    this.D = 9;
                                                }
                                            } else {
                                                this.D = 9;
                                            }
                                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                                            this.D = 0;
                                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                            this.D = 0;
                                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaStory) {
                                            if (n1(this.k).via_mention) {
                                                i = 24;
                                            } else {
                                                i = 23;
                                            }
                                            this.D = i;
                                            if (i == 24) {
                                                this.U = 1;
                                            }
                                        }
                                    } else {
                                        this.D = 17;
                                        this.x1 = new ArrayList();
                                    }
                                } else {
                                    this.D = 4;
                                }
                            }
                        } else if (s4()) {
                            this.D = 13;
                        } else {
                            this.D = 15;
                        }
                    } else {
                        this.D = 36;
                    }
                }
            }
        }
        if (i3 != 1000 && i3 != (i2 = this.D) && i2 != 19) {
            a6(oc7.r1(i4).d, oc7.r1(i4).b, null, null);
            r0(false);
        }
    }

    public final double L0() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.k0;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document F0 = F0();
        if (F0 == null && this.D == 23 && (storyItem = n1(this.k).storyItem) != null && (messageMedia = storyItem.media) != null) {
            F0 = messageMedia.document;
        }
        if (F0 == null) {
            return 0.0d;
        }
        int i = this.j0;
        if (i > 0) {
            return i;
        }
        for (int i2 = 0; i2 < F0.attributes.size(); i2++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d2 = documentAttribute.duration;
                this.k0 = d2;
                return d2;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d3 = documentAttribute.duration;
                this.k0 = d3;
                return d3;
            }
        }
        return this.j0;
    }

    public final int L1() {
        TLRPC.Message message = this.k;
        int i = message.realId;
        if (i != 0) {
            return i;
        }
        return message.id;
    }

    public final boolean L3() {
        if (n1(this.k) != null && M3(F0())) {
            return true;
        }
        return false;
    }

    public final boolean L4() {
        if (F0() != null && N4(F0())) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_availableEffect M0() {
        TLRPC.Message message = this.k;
        if (message != null && (message.flags2 & 4) != 0) {
            return oc7.r1(this.K1).Y0(this.k.effect);
        }
        return null;
    }

    public final int M1() {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public final boolean M2() {
        int i = this.D;
        if (i != 13 && i != 15 && i != 19) {
            return false;
        }
        return true;
    }

    public final boolean M5() {
        if (this.X1) {
            if (this.D != 5 && !Q4(this.k)) {
                if (!M2() || this.N1 == null) {
                    if (this.v != null && this.N1 != null) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void N(k47 k47Var) {
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.m1 = k47Var.m1;
        TLRPC.Message message = this.k;
        message.premiumEffectWasPlayed = k47Var.k.premiumEffectWasPlayed;
        this.R = k47Var.R;
        this.X1 = k47Var.X1;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = k47Var.k.reactions) != null && tL_messageReactions.results != null) {
            for (int i2 = 0; i2 < this.k.reactions.results.size(); i2++) {
                TLRPC.ReactionCount reactionCount = this.k.reactions.results.get(i2);
                for (int i3 = 0; i3 < k47Var.k.reactions.results.size(); i3++) {
                    TLRPC.ReactionCount reactionCount2 = k47Var.k.reactions.results.get(i3);
                    if (l39.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z = k47Var.N0;
        this.N0 = z;
        TLRPC.Message message2 = this.k;
        TLRPC.Message message3 = k47Var.k;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (z && (arrayList = this.B2) != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((h47) obj).y.clear();
            }
        }
    }

    public final long N0() {
        TLRPC.Message message = this.k;
        if (message != null && (message.flags2 & 4) != 0) {
            return message.effect;
        }
        return 0L;
    }

    public final int N1() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public boolean N3() {
        return this.k.out;
    }

    public final boolean N5() {
        if (this.j2) {
            return false;
        }
        return true;
    }

    public final void O(int i, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, boolean z) {
        String str = this.W;
        if (((ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new ArrayList());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = jb6.u(tL_channelAdminLogEvent.date, false);
            tL_message.id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            k47 k47Var = new k47(i, tL_message, false, false);
            k47Var.D = 10;
            k47Var.U = 1;
            k47Var.l0 = true;
            if (z) {
                arrayList.add(0, k47Var);
            } else {
                arrayList.add(k47Var);
            }
        }
    }

    public final ArrayList O0() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.k;
        if (message != null) {
            boolean z = this.M2;
            boolean z2 = this.L2;
            if (z) {
                if (z2 && (tL_textWithEntities = message.translatedSummaryText) != null) {
                    return tL_textWithEntities.entities;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
                if (tL_textWithEntities2 != null) {
                    return tL_textWithEntities2.entities;
                }
                return null;
            } else if (z2) {
                if (message.voiceTranscriptionOpen) {
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = message.translatedVoiceTranscription;
                    if (tL_textWithEntities3 != null) {
                        return tL_textWithEntities3.entities;
                    }
                    return null;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities4 = message.translatedText;
                if (tL_textWithEntities4 != null) {
                    return tL_textWithEntities4.entities;
                }
                return null;
            } else {
                return message.entities;
            }
        }
        return null;
    }

    public final CharSequence O1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        CharSequence s5;
        TLRPC.Message message = this.k;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i = this.K1;
        if (messageReplyHeader == null) {
            boolean y = pg3.y(B0(message));
            TLRPC.Message message2 = this.k;
            if (y) {
                s5 = r5(i, B0(message2));
                charSequence2 = s5;
                charSequence = null;
            } else {
                charSequence = r5(i, B0(message2));
                charSequence2 = null;
            }
        } else {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                if (peer != null && pg3.n(peer) == B0(this.k)) {
                    z = false;
                } else {
                    z = true;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = this.k.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 != null) {
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                        charSequence = s5(i, peer2, z);
                        charSequence2 = null;
                    } else {
                        s5 = s5(i, peer2, z);
                        charSequence2 = s5;
                        charSequence = null;
                    }
                } else {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            charSequence = s5(i, peer3, z);
                        } else {
                            s5 = s5(i, peer3, z);
                            charSequence2 = s5;
                            charSequence = null;
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        if (z) {
                            charSequence = new SpannableStringBuilder(g6()).append((CharSequence) " ").append((CharSequence) this.k.reply_to.reply_from.from_name);
                        } else {
                            charSequence = new SpannableStringBuilder(this.k.reply_to.reply_from.from_name);
                        }
                    }
                    charSequence2 = null;
                }
            }
            charSequence = null;
            charSequence2 = null;
        }
        TLRPC.Peer peer4 = this.k.reply_to.reply_to_peer_id;
        if (peer4 != null && pg3.n(peer4) != B0(this.k)) {
            TLRPC.Peer peer5 = this.k.reply_to.reply_to_peer_id;
            boolean z2 = peer5 instanceof TLRPC.TL_peerUser;
            if (z2) {
                charSequence = s5(i, peer5, true);
            } else {
                charSequence2 = s5(i, peer5, !z2);
            }
        }
        k47 k47Var = this.C;
        if (k47Var != null) {
            if (pg3.y(k47Var.R1())) {
                if (charSequence2 == null) {
                    charSequence2 = r5(i, this.C.R1());
                }
            } else if (charSequence == null) {
                charSequence = r5(i, this.C.R1());
            }
        }
        if (charSequence2 != null) {
            if (charSequence != null) {
                return new SpannableStringBuilder(charSequence).append((CharSequence) " ").append(charSequence2);
            }
            return charSequence2;
        } else if (charSequence != null) {
            return charSequence;
        } else {
            return jb6.M0(2131748536, null);
        }
    }

    public boolean O3() {
        boolean z = true;
        if (this.u1) {
            return true;
        }
        Boolean bool = this.W2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (c5(this.k) && !a5()) {
            this.W2 = Boolean.FALSE;
            return false;
        }
        long e = z8c.h(this.K1).e();
        if (!this.n2 && B0(this.k) != e) {
            TLRPC.Peer peer = this.k.peer_id;
            TLRPC.Chat chat = null;
            if (peer != null) {
                long j = peer.channel_id;
                if (j != 0) {
                    chat = w0(null, null, j);
                }
            }
            TLRPC.Message message = this.k;
            if (message.out) {
                TLRPC.Peer peer2 = message.from_id;
                if ((peer2 instanceof TLRPC.TL_peerUser) || ((peer2 instanceof TLRPC.TL_peerChannel) && !sd2.V(chat))) {
                    TLRPC.Message message2 = this.k;
                    if (!message2.post) {
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null) {
                            this.W2 = Boolean.TRUE;
                            return true;
                        }
                        TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                        if (peer3 != null && peer3.user_id != e) {
                            z = false;
                        }
                        this.W2 = Boolean.valueOf(z);
                        return z;
                    }
                }
            }
            this.W2 = Boolean.FALSE;
            return false;
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
        if (messageFwdHeader2 != null) {
            TLRPC.Peer peer4 = messageFwdHeader2.from_id;
            if ((peer4 == null || peer4.user_id != e) && !messageFwdHeader2.saved_out) {
                z = false;
            }
            this.W2 = Boolean.valueOf(z);
            return z;
        }
        this.W2 = Boolean.TRUE;
        return true;
    }

    public final boolean O4() {
        return Q4(this.k);
    }

    public final boolean O5() {
        if (!q4()) {
            int i = this.D;
            if (i == 13 || i == 15 || i == 5 || i == 19 || g3()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void P(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.P(boolean):void");
    }

    public final int P0() {
        if (c3(this.k)) {
            return S(this.k.id);
        }
        return 0;
    }

    public final long P1() {
        return Q1(z8c.h(this.K1).e(), this.k);
    }

    public final boolean P2() {
        TLRPC.Message message;
        long B0;
        int i;
        byte b;
        if (!gda.D0) {
            if (this.X2 == 0 && (message = this.k) != null && (B0(message)) != 0) {
                if (!gda.D0 && (i <= 0 || !mc.c(this.K1).f(B0))) {
                    b = 1;
                } else {
                    b = 2;
                }
                this.X2 = b;
            }
            if (this.X2 != 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean P3() {
        TLRPC.Message message = this.k;
        if (message != null) {
            if (message.paid_suggested_post_stars || message.paid_suggested_post_ton) {
                int i = this.K1;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                if (currentTime - this.k.date < oc7.r1(i).l4.h.g(TimeUnit.SECONDS)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean P5() {
        return Q5(this.k);
    }

    public final void Q() {
        if (this.p0 != null) {
            if ((gda.o() == 2 || q2()) && this.I1 == null) {
                try {
                    String str = "b";
                    if (g4()) {
                        str = "br";
                    }
                    int size = this.p0.size();
                    for (int i = 0; i < size; i++) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.p0.get(i);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.I1 = new BitmapDrawable(a.b.getResources(), fn5.B(str, photoSize.bytes));
                            return;
                        }
                    }
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
        }
    }

    public final String Q0() {
        String str;
        String S0 = S0();
        int lastIndexOf = S0.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = S0.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = F0().mime_type;
        }
        if (str == null) {
            str = "";
        }
        return str.toUpperCase();
    }

    public final boolean Q3() {
        return R3(this.k);
    }

    public final TLRPC.TL_factCheck R0() {
        TLRPC.TL_factCheck tL_factCheck;
        e94 b = e94.b(this.K1);
        LongSparseArray longSparseArray = b.c;
        LongSparseArray longSparseArray2 = b.b;
        TLRPC.Message message = this.k;
        if (message != null && (tL_factCheck = message.factcheck) != null) {
            if (!tL_factCheck.need_check) {
                if (longSparseArray2.get(tL_factCheck.hash) == null) {
                    TLRPC.TL_factCheck tL_factCheck2 = this.k.factcheck;
                    longSparseArray2.put(tL_factCheck2.hash, tL_factCheck2);
                    TLRPC.TL_factCheck tL_factCheck3 = this.k.factcheck;
                    int i = b.a;
                    if (tL_factCheck3 != null) {
                        cf7 Y = cf7.Y(i);
                        Y.a.c(new pv3(Y, tL_factCheck3, (byte) 17));
                        if (!b.f) {
                            b.f = true;
                            cf7 Y2 = cf7.Y(i);
                            Y2.a.c(new xd7(Y2, (byte) 6));
                        }
                    }
                }
                return this.k.factcheck;
            }
            long B0 = B0(message);
            int e1 = e1();
            long j = this.k.factcheck.hash;
            d94 d94Var = new d94(B0, e1, j);
            if (e1 < 0) {
                return null;
            }
            TLRPC.TL_factCheck tL_factCheck4 = (TLRPC.TL_factCheck) longSparseArray2.get(j);
            if (tL_factCheck4 != null) {
                this.k.factcheck = tL_factCheck4;
                return tL_factCheck4;
            } else if (b.d.contains(d94Var)) {
                return this.k.factcheck;
            } else {
                HashMap hashMap = (HashMap) longSparseArray.get(B0);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    longSparseArray.put(B0, hashMap);
                }
                if (!hashMap.containsKey(d94Var)) {
                    hashMap.put(d94Var, new iu(b, d94Var, this, (byte) 16));
                    a14 a14Var = b.e;
                    gm.r(a14Var);
                    gm.d3(a14Var, 80L);
                }
                return this.k.factcheck;
            }
        }
        return null;
    }

    public final long R1() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.k;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long j = peer.user_id;
            if (j != 0) {
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 instanceof TLRPC.TL_peerUser) {
                    return peer2.user_id;
                }
                return j;
            } else if (peer.channel_id != 0) {
                if (j4()) {
                    TLRPC.Peer peer3 = this.k.fwd_from.from_id;
                    if (peer3 instanceof TLRPC.TL_peerUser) {
                        return peer3.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
                TLRPC.Peer peer4 = messageFwdHeader2.from_id;
                if (peer4 instanceof TLRPC.TL_peerChannel) {
                    return -peer4.channel_id;
                }
                if (peer4 instanceof TLRPC.TL_peerChat) {
                    return -peer4.chat_id;
                }
                return -messageFwdHeader2.saved_from_peer.channel_id;
            } else {
                long j2 = peer.chat_id;
                if (j2 != 0) {
                    TLRPC.Peer peer5 = messageFwdHeader.from_id;
                    if (peer5 instanceof TLRPC.TL_peerUser) {
                        return peer5.user_id;
                    }
                    if (peer5 instanceof TLRPC.TL_peerChannel) {
                        return -peer5.channel_id;
                    }
                    if (peer5 instanceof TLRPC.TL_peerChat) {
                        return -peer5.chat_id;
                    }
                    return -j2;
                }
            }
        } else {
            TLRPC.Peer peer6 = message.from_id;
            if (peer6 instanceof TLRPC.TL_peerUser) {
                return peer6.user_id;
            }
            if (peer6 instanceof TLRPC.TL_peerChannel) {
                return -peer6.channel_id;
            }
            if (peer6 instanceof TLRPC.TL_peerChat) {
                return -peer6.chat_id;
            }
            if (message.post) {
                return message.peer_id.channel_id;
            }
        }
        return 0L;
    }

    public final boolean R2() {
        return this.k.media_unread;
    }

    public final boolean R4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (Q4(this.k) && (message = this.k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean R5() {
        TLRPC.Message message = this.k;
        if (message != null && message.peer_id != null && !N3() && !q4() && oc7.r1(this.K1).K2(B0(this.k))) {
            return true;
        }
        return false;
    }

    public final String S0() {
        if (F0() != null) {
            return bc4.r(null, F0());
        }
        return T0(this.k);
    }

    public final long S1() {
        mdc mdcVar = this.g3;
        if (mdcVar != null) {
            return mdcVar.g.size;
        }
        mdc mdcVar2 = this.h3;
        if (mdcVar2 != null) {
            return mdcVar2.g.size;
        }
        mdc mdcVar3 = this.i3;
        if (mdcVar3 != null) {
            return mdcVar3.g.size;
        }
        return p1(n1(this.k));
    }

    public final boolean S2() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull X1;
        TLRPC.WallPaper wallPaper;
        if (!W4() || (message = this.k) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (X1 = oc7.r1(this.K1).X1(B0(this.k))) == null || (wallPaper = X1.wallpaper) == null || !X1.wallpaper_overridden || this.k.action.wallpaper.id != wallPaper.id) {
            return false;
        }
        return true;
    }

    public final boolean S3() {
        if (this.D == 17 && (n1(this.k) instanceof TLRPC.TL_messageMediaPoll)) {
            return true;
        }
        return false;
    }

    public final boolean S4() {
        TLRPC.Message message = this.k;
        if (message != null) {
            if (Q4(message) || (g4() && v0c.m(this))) {
                TLRPC.Message message2 = this.k;
                if (message2.voiceTranscriptionOpen && message2.voiceTranscription != null) {
                    if (message2.voiceTranscriptionFinal || v0c.l(this)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean T(k47 k47Var) {
        if (k47Var == null || e1() != k47Var.e1() || B0(this.k) != B0(k47Var.k)) {
            return false;
        }
        return true;
    }

    public final long T1() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome) == null) {
            return 0L;
        }
        long j = tL_messages_emojiGameOutcome.ton_amount;
        if (j > 0) {
            return j;
        }
        return -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public final boolean T2() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaDice;
    }

    public final void T5() {
        TLRPC.Message message;
        if (!this.K2 && this.v != null && (message = this.k) != null && message.entities != null) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j = peer.user_id;
                if (j == 777000 || j == 489000) {
                    Pattern pattern = q3;
                    if (pattern == null) {
                        pattern = Pattern.compile("[\\d\\-]{5,8}");
                        q3 = pattern;
                    }
                    try {
                        Matcher matcher = pattern.matcher(this.v);
                        if (matcher.find()) {
                            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                            tL_messageEntitySpoiler.offset = matcher.start();
                            tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                            this.k.entities.add(tL_messageEntitySpoiler);
                        }
                    } catch (Exception e) {
                        fc4.g(e, false);
                    }
                    this.K2 = true;
                }
            }
        }
    }

    public final String U1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                i++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute2.alt;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean U2() {
        if (F0() != null && !K4(this.k) && !I3() && !Q4(this.k) && !M2()) {
            return true;
        }
        return false;
    }

    public final boolean U4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return V4((TLRPC.TL_messageMediaPoll) n1);
    }

    public final int U5() {
        int i;
        uj9 uj9Var = this.y2;
        if (uj9Var != null) {
            return uj9Var.t();
        }
        if (this.B2 == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.B2.size(); i3++) {
            int i4 = ((h47) this.B2.get(i3)).f;
            h47 h47Var = (h47) this.B2.get(i3);
            if (h47Var.K && h47Var.f()) {
                i = h47Var.G;
            } else {
                i = h47Var.w;
            }
            i2 += i + i4 + ((h47) this.B2.get(i3)).h;
        }
        return i2;
    }

    public final String V0() {
        TLRPC.Document document = this.n;
        if (document == null) {
            document = G0(this.k);
        }
        if (document != null) {
            TLRPC.Document document2 = this.n;
            if (document2 == null) {
                document2 = G0(this.k);
            }
            return bc4.r(null, document2);
        }
        return T0(this.k);
    }

    public final String V1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        for (int i = 0; i < F0.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    return documentAttribute.alt;
                }
                return null;
            }
        }
        return null;
    }

    public final boolean V3() {
        if (n1(this.k) != null && n1(this.k).nopremium) {
            return false;
        }
        return W3(F0());
    }

    public final int V5(yc2 yc2Var) {
        if (this.B2 == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.B2.size(); i2++) {
            i += ((h47) this.B2.get(i2)).j(yc2Var) + ((h47) this.B2.get(i2)).f + ((h47) this.B2.get(i2)).h;
        }
        return i;
    }

    public final Long W0() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.k;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(pg3.n(peer));
    }

    public final TLRPC.WebPage W1() {
        if (!y4()) {
            return null;
        }
        TLRPC.TL_webPage tL_webPage = this.b3;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
        tL_webPage2.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.id = this.k.media.id;
        tL_webPageAttributeStory.peer = oc7.r1(this.K1).x1(this.k.media.user_id);
        TL_stories.StoryItem storyItem = this.k.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage2.attributes.add(tL_webPageAttributeStory);
        this.b3 = tL_webPage2;
        return tL_webPage2;
    }

    public final boolean W4() {
        if (this.D != 22) {
            TLRPC.Message message = this.k;
            if (message == null || !(message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int W5() {
        int i;
        uj9 uj9Var = this.y2;
        if (uj9Var != null) {
            return uj9Var.t();
        }
        Integer num = this.V2;
        if (num != null) {
            return num.intValue();
        }
        if (this.B2 == null) {
            this.V2 = 0;
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.B2.size(); i3++) {
            int i4 = ((h47) this.B2.get(i3)).f;
            h47 h47Var = (h47) this.B2.get(i3);
            if (h47Var.K) {
                i = h47Var.G;
            } else {
                i = h47Var.w;
            }
            i2 += i4 + i + ((h47) this.B2.get(i3)).h;
        }
        this.V2 = Integer.valueOf(i2);
        return i2;
    }

    public final TLObject X0() {
        Long W0 = W0();
        if (W0 == null) {
            return null;
        }
        return oc7.r1(this.K1).a2(W0.longValue());
    }

    public final boolean X2() {
        TLRPC.Message message = this.k;
        if (message != null && (message.flags & 32768) != 0 && message.edit_date != 0 && !message.edit_hide) {
            return true;
        }
        return false;
    }

    public final boolean X3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name)) {
            return true;
        }
        return false;
    }

    public final boolean X4() {
        TLRPC.Message message;
        if (W4() && (message = this.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X5() {
        boolean z = !this.i1;
        this.i1 = z;
        oc7.r1(this.K1).X3.edit().putBoolean("c" + B0(this.k) + "_rec", z).apply();
    }

    public final String Y0() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader != null) {
            TLRPC.Peer peer = messageFwdHeader.from_id;
            boolean z = peer instanceof TLRPC.TL_peerChannel;
            int i = this.K1;
            if (z) {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(this.k.fwd_from.from_id.channel_id));
                if (L0 != null) {
                    return L0.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(this.k.fwd_from.from_id.chat_id));
                if (L02 != null) {
                    return L02.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerUser) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(this.k.fwd_from.from_id.user_id));
                if (W1 != null) {
                    return m9c.r(W1);
                }
                return null;
            } else {
                String str = messageFwdHeader.from_name;
                if (str != null) {
                    return str;
                }
                return null;
            }
        }
        return null;
    }

    public final long Y1() {
        int i = this.K1;
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B0(this.k)));
        return Z1(i, this.k, iqd.b(iqd.b(iqd.b(0, 1, sd2.c0(L0)), 4, sd2.p0(L0)), 8, m9c.w(oc7.r1(i).W1(Long.valueOf(B0(this.k))))));
    }

    public final boolean Y2() {
        TLRPC.Message message = this.k;
        if (message.send_state == 3 && message.id > 0) {
            return true;
        }
        return false;
    }

    public final boolean Y3() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) n1).poll.public_voters;
    }

    public final boolean Y4() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public final long Z0() {
        return B1(this.k.from_id);
    }

    public final boolean Z2() {
        boolean z = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
        TLRPC.Message message = this.k;
        if (z) {
            if (n1(message).photo.id == 0) {
                return true;
            }
            return false;
        } else if ((n1(message) instanceof TLRPC.TL_messageMediaDocument) && n1(this.k).document.dc_id == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean Z3() {
        return a4(this.k);
    }

    public final boolean Z4() {
        if (!(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || n1(this.k).webpage.document == null || s3(n1(this.k).webpage.document, false)) {
            return false;
        }
        return true;
    }

    public final void Z5() {
        int i = this.K1;
        a6(oc7.r1(i).d, oc7.r1(i).b, null, null);
    }

    public final boolean a3() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.T2;
        TLRPC.Message message = this.k;
        boolean z = false;
        if (bool != null) {
            if (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        if (message != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(tvc.e(webPage.url))) {
            z = true;
        }
        this.T2 = Boolean.valueOf(z);
        return z;
    }

    public final boolean a5() {
        TLRPC.Message message = this.k;
        if (c3(message) && message.ephemeralAnchorMsgId != 0) {
            return true;
        }
        return false;
    }

    public final void a6(java.util.AbstractMap r38, java.util.AbstractMap r39, defpackage.vh6 r40, defpackage.vh6 r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.a6(java.util.AbstractMap, java.util.AbstractMap, vh6, vh6):void");
    }

    public final TLObject b1() {
        TLRPC.Message message = this.k;
        if (message != null) {
            TLRPC.Peer peer = message.from_id;
            boolean z = peer instanceof TLRPC.TL_peerChannel_layer131;
            int i = this.K1;
            if (!z && !(peer instanceof TLRPC.TL_peerChannel)) {
                if (!(peer instanceof TLRPC.TL_peerUser_layer131) && !(peer instanceof TLRPC.TL_peerUser)) {
                    if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
                        return oc7.r1(i).L0(Long.valueOf(this.k.from_id.chat_id));
                    }
                    return null;
                }
                return oc7.r1(i).W1(Long.valueOf(this.k.from_id.user_id));
            }
            return oc7.r1(i).L0(Long.valueOf(this.k.from_id.channel_id));
        }
        return null;
    }

    public final boolean b3() {
        return c3(this.k);
    }

    public final boolean b4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) n1).poll.quiz;
    }

    public final boolean b5() {
        return c5(this.k);
    }

    public final boolean c(CharSequence charSequence, boolean z, boolean z2) {
        if (charSequence == null) {
            return false;
        }
        if (!this.G0 && !(n1(this.k) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return b(charSequence, O0(), O3(), true, z, z2, 0);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return b(charSequence, arrayList, O3(), true, z, z2, 0);
    }

    public final long c1() {
        long j = this.d;
        if (j != 0) {
            return j;
        }
        return d1();
    }

    public final boolean c4() {
        if (!Y2() && !q4() && p4() && !c3(this.k) && !g3() && z()) {
            return true;
        }
        return false;
    }

    public final long d1() {
        long j = this.e;
        if (j != 0) {
            return j;
        }
        return this.k.grouped_id;
    }

    public final TLRPC.User d2(AbstractMap abstractMap, vh6 vh6Var, long j) {
        TLRPC.User user;
        if (abstractMap != null) {
            user = (TLRPC.User) abstractMap.get(Long.valueOf(j));
        } else if (vh6Var != null) {
            user = (TLRPC.User) vh6Var.f(j);
        } else {
            user = null;
        }
        if (user == null) {
            return oc7.r1(this.K1).W1(Long.valueOf(j));
        }
        return user;
    }

    public final boolean d3() {
        return e3(this.k);
    }

    public final boolean d4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        k47 k47Var = this.C;
        if ((k47Var == null || !(k47Var.k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.k).reply_to) != null) {
            if ((messageReplyHeader.reply_to_msg_id != 0 || messageReplyHeader.reply_to_random_id != 0) && (message.flags & 8) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d5() {
        if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.k).webpage != null && !TextUtils.isEmpty(n1(this.k).webpage.embed_url) && "YouTube".equals(n1(this.k).webpage.site_name)) {
            return true;
        }
        return false;
    }

    public final void d6(boolean z) {
        ArrayList arrayList = this.e3;
        if (arrayList == null) {
            this.i3 = null;
            D2(z);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                ((mdc) obj2).e(z);
            }
        }
        this.g3 = ndc.a0(this.e3);
        this.h3 = ndc.b0(this.e3);
        this.i3 = ndc.O(this.e3);
    }

    public final int e1() {
        TLRPC.Message message = this.k;
        int i = message.ephemeralAnchorMsgId;
        if (i != 0) {
            return i;
        }
        return message.id;
    }

    public final boolean e4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        k47 k47Var = this.C;
        if ((k47Var == null || !(k47Var.k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.k).reply_to) != null && messageReplyHeader.story_id != 0 && (message.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public final void e5() {
        if (this.n == null && this.o != null && !this.t) {
            this.t = true;
            vm.g(this.K1).b(this.o.longValue(), new a47(this, (byte) 0));
        }
    }

    public final void f(int i, long j, boolean z) {
        boolean z2;
        TLRPC.Message message = this.k;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.k;
            TLRPC.TL_messageReactions tL_messageReactions = message2.reactions;
            boolean z3 = false;
            if (B0(message2) == z8c.h(this.K1).e()) {
                z2 = true;
            } else {
                z2 = false;
            }
            tL_messageReactions.reactions_as_tags = z2;
            TLRPC.TL_messageReactions tL_messageReactions2 = this.k.reactions;
            if (o3() || p3()) {
                z3 = true;
            }
            tL_messageReactions2.can_see_list = z3;
        }
        g(this.K1, this.k.reactions, i, j, z);
    }

    public final boolean f4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (g4() && (message = this.k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean f6(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.f6(boolean):boolean");
    }

    public final Spannable g0(TLRPC.TodoItem todoItem) {
        CharSequence h0 = h0(todoItem.title, O3());
        if (!(h0 instanceof Spannable)) {
            h0 = new SpannableStringBuilder(h0);
        }
        Spannable spannable = (Spannable) h0;
        spannable.setSpan(new g6c("task?" + todoItem.id, 0), 0, h0.length(), 33);
        return spannable;
    }

    public final int g2() {
        String str;
        Integer num = this.k3;
        if (num != null) {
            return num.intValue();
        }
        if (!K4(this.k)) {
            this.k3 = -1;
            return -1;
        }
        TLRPC.MessageMedia m1 = m1(this);
        int i = m1.video_timestamp;
        if (i != 0) {
            return i;
        }
        TLRPC.WebPage webPage = m1.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int U = LaunchActivity.U(Uri.parse(str));
                this.k3 = Integer.valueOf(U);
                return U;
            } catch (Exception unused) {
            }
        }
        this.k3 = -1;
        return -1;
    }

    public final boolean g3() {
        int i = this.D;
        if ((i == 23 || i == 24) && (this.k.media.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return true;
        }
        return false;
    }

    public final boolean g4() {
        byte b = this.S;
        if (b == 0) {
            if (this.D != 5 && !i4(this.k)) {
                b = 2;
            } else {
                b = 1;
            }
            this.S = b;
        }
        if (b == 1) {
            return true;
        }
        return false;
    }

    public final void g5() {
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions != null && tL_messageReactions.recent_reactions != null) {
            boolean z = false;
            for (int i = 0; i < this.k.reactions.recent_reactions.size(); i++) {
                if (this.k.reactions.recent_reactions.get(i).unread) {
                    this.k.reactions.recent_reactions.get(i).unread = false;
                    z = true;
                }
            }
            if (z) {
                int i2 = this.K1;
                cf7 Y = cf7.Y(i2);
                TLRPC.Message message = this.k;
                Y.H(new ae7(Y, message.dialog_id, b2(i2, message, false, false), this.k.id, (byte) 6));
            }
        }
    }

    public final TLRPC.InputStickerSet h1() {
        return j1(this.k);
    }

    public final boolean h3() {
        if (e1() >= 0 && !q4()) {
            int i = this.D;
            if (i == 0 || i == 2 || i == 1 || i == 3 || i == 8 || i == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h5() {
        boolean z;
        int i;
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence m;
        boolean z2;
        boolean z3;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message;
        if (!this.G0) {
            this.x0 = 0;
            this.q2 = null;
            ArrayList arrayList = new ArrayList();
            boolean R5 = R5();
            this.N2 = R5;
            if (!R5 && (message = this.k) != null) {
                TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                    if (tL_replyInlineMarkup.rows != null) {
                        for (int i2 = 0; i2 < tL_replyInlineMarkup.rows.size(); i2++) {
                            ArrayList<TL_keyboard.KeyboardInlineButton> arrayList2 = tL_replyInlineMarkup.rows.get(i2).buttons;
                            hr0[] hr0VarArr = new hr0[arrayList2.size()];
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                hr0VarArr[i3] = new hr0(arrayList2.get(i3));
                            }
                            arrayList.add(hr0VarArr);
                        }
                    }
                }
            }
            TLRPC.Message message2 = this.k;
            if (message2 != null && (suggestedPost = message2.suggested_post) != null && !suggestedPost.rejected && !suggestedPost.accepted && !m4() && !n4()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long e = z8c.h(this.K1).e();
                long n = pg3.n(this.k.saved_peer_id);
                long n2 = pg3.n(this.k.from_id);
                if (e == n) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (n == n2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z2 ? !z3 : z3) {
                    z = false;
                }
            }
            if (z) {
                if (!arrayList.isEmpty()) {
                    i = 1 << (arrayList.size() - 1);
                } else {
                    i = 0;
                }
                arrayList.add(new gr0[]{new ir0(1, 2131746821, 2131231088), new ir0(2, 2131746822, 2131231087)});
                arrayList.add(new gr0[]{new ir0(3, 2131746820, 2131231089)});
            } else {
                i = 0;
            }
            if (!arrayList.isEmpty()) {
                this.q2 = new de((gr0[][]) arrayList.toArray(new gr0[arrayList.size()]), i, (byte) 2);
            }
            de deVar = this.q2;
            if ((deVar != null && !p2()) || ((tL_messageReactions = this.k.reactions) != null && !tL_messageReactions.results.isEmpty())) {
                cmb.P();
                StringBuilder sb = this.F0;
                if (sb == null) {
                    this.F0 = new StringBuilder();
                } else {
                    sb.setLength(0);
                }
            }
            if (deVar != null) {
                gr0[][] gr0VarArr = (gr0[][]) deVar.c;
                if (!p2()) {
                    for (int i4 = 0; i4 < gr0VarArr.length; i4++) {
                        int length = gr0VarArr[i4].length;
                        int i5 = 0;
                        for (int i6 = 0; i6 < length; i6++) {
                            gr0 gr0Var = gr0VarArr[i4][i6];
                            StringBuilder sb2 = this.F0;
                            sb2.append(i4);
                            sb2.append(i6);
                            if ((gr0Var instanceof hr0) && kfb.c(((hr0) gr0Var).a, TL_keyboard.TL_inlineButtonTypeBuy.class) && (n1(this.k).flags & 4) != 0) {
                                m = jb6.M0(2131747115, null);
                            } else {
                                String d = gr0Var.d();
                                if (d == null) {
                                    d = "";
                                }
                                m = gw3.m(d, cmb.v2.getFontMetricsInt(), false, null, 0);
                            }
                            StaticLayout staticLayout = new StaticLayout(m, cmb.v2, gm.L(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            if (staticLayout.getLineCount() > 0) {
                                float lineWidth = staticLayout.getLineWidth(0);
                                float lineLeft = staticLayout.getLineLeft(0);
                                if (lineLeft < lineWidth) {
                                    lineWidth -= lineLeft;
                                }
                                if (gr0Var.c() != 0) {
                                    lineWidth += gm.L(36.0f);
                                }
                                if (gr0Var.b() != 0) {
                                    lineWidth += gm.L(36.0f);
                                }
                                i5 = kt6.e(4.0f, (int) Math.ceil(lineWidth), i5);
                            }
                        }
                        this.x0 = Math.max(this.x0, ((length - 1) * gm.L(5.0f)) + ((gm.L(12.0f) + i5) * length));
                    }
                }
            }
        }
    }

    public final boolean i() {
        TLRPC.Peer peer;
        if (!gda.P0) {
            return false;
        }
        TLRPC.Message message = this.k;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            oc7 r1 = oc7.r1(this.K1);
            TLRPC.Peer peer2 = this.k.peer_id;
            long j = peer2.channel_id;
            if (j == 0) {
                j = peer2.chat_id;
            }
            TLRPC.Chat L0 = r1.L0(Long.valueOf(j));
            if ((L0 == null || !L0.gigagroup) && L0 != null && ((sd2.C(L0.banned_rights, 8) || sd2.C(L0.default_banned_rights, 8)) && !sd2.N(L0))) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence i2() {
        String str;
        String str2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.k;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(jb6.M0(2131747862, null));
            spannableString.setSpan(new i37((byte) 1), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (this.L2 && (tL_textWithEntities = this.k.translatedVoiceTranscription) != null) {
            str2 = tL_textWithEntities.text;
        } else {
            str2 = this.k.voiceTranscription;
        }
        if (!TextUtils.isEmpty(str2)) {
            return gw3.m(str2, cmb.n2.getFontMetricsInt(), false, null, 0);
        }
        return str2;
    }

    public final boolean i3() {
        if (this.a != 0) {
            return true;
        }
        return false;
    }

    public final boolean i5() {
        mdc mdcVar;
        if (D2(true) && (mdcVar = this.g3) != null) {
            return mdcVar.b();
        }
        return this.z0;
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.j():void");
    }

    public final boolean j3() {
        return l3(this.k);
    }

    public final boolean j4() {
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null && peer.channel_id != 0) {
            return sd2.n0(oc7.r1(this.K1).L0(Long.valueOf(this.k.fwd_from.saved_from_peer.channel_id)));
        }
        return false;
    }

    public boolean j5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.j5():boolean");
    }

    public final void k(CharSequence charSequence) {
        TLRPC.User user;
        TextPaint textPaint;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int[] iArr = null;
        if (p3()) {
            user = oc7.r1(this.K1).W1(Long.valueOf(this.k.from_id.user_id));
        } else {
            user = null;
        }
        this.v = charSequence;
        ArrayList O0 = O0();
        if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
            textPaint = cmb.w2;
        } else {
            textPaint = cmb.n2;
        }
        if (i()) {
            iArr = new int[1];
        }
        CharSequence m = gw3.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
        this.v = m;
        Spannable A5 = A5(m, O0, textPaint.getFontMetricsInt(), false);
        this.v = A5;
        if (iArr != null && iArr[0] > 1) {
            C5(A5, iArr);
        }
        H(iArr);
        n0(user);
        K5();
    }

    public final void k0() {
        boolean z;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z2;
        boolean z3;
        TL_stories.StoryItem storyItem;
        boolean z4;
        if (!g4()) {
            boolean R5 = R5();
            if (this.z != null) {
                if (this.L2) {
                    TLRPC.Message message = this.k;
                    if (message.translatedText != null || (this.M2 && message.translatedSummaryText != null)) {
                        z4 = true;
                        if (z4 == this.P2 && this.M2 == this.R2 && R5 == this.Q2) {
                            return;
                        }
                    }
                }
                z4 = false;
                if (z4 == this.P2) {
                    return;
                }
            }
            this.Q2 = R5;
            TLRPC.Message message2 = this.k;
            String str = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            if (this.D == 23) {
                TLRPC.MessageMedia messageMedia = message2.media;
                if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                    str = storyItem.caption;
                    arrayList = storyItem.entities;
                    z = true;
                    TLRPC.Message message3 = this.k;
                    tL_textWithEntities = message3.translatedSummaryText;
                    if (tL_textWithEntities == null && this.M2 && this.L2) {
                        this.R2 = true;
                        this.P2 = true;
                        str = tL_textWithEntities.text;
                        arrayList = tL_textWithEntities.entities;
                    } else {
                        tL_textWithEntities2 = message3.summaryText;
                        if (tL_textWithEntities2 == null && this.M2) {
                            this.R2 = true;
                            this.P2 = false;
                            str = tL_textWithEntities2.text;
                            arrayList = tL_textWithEntities2.entities;
                        } else {
                            tL_textWithEntities3 = message3.translatedText;
                            if (tL_textWithEntities3 == null && this.L2) {
                                this.R2 = false;
                                this.P2 = true;
                                str = tL_textWithEntities3.text;
                                arrayList = tL_textWithEntities3.entities;
                            } else {
                                this.R2 = false;
                                this.P2 = false;
                            }
                        }
                    }
                    if (F3() && !(n1(this.k) instanceof TLRPC.TL_messageMediaGame) && !TextUtils.isEmpty(str)) {
                        CharSequence m = gw3.m(str, cmb.n2.getFontMetricsInt(), false, null, 0);
                        this.z = m;
                        this.z = A5(m, arrayList, cmb.n2.getFontMetricsInt(), false);
                        if (this.k.send_state != 0) {
                            z2 = false;
                        } else {
                            z2 = !arrayList.isEmpty();
                        }
                        if (!z && (z2 || (this.T == 0 && !(n1(this.k) instanceof TLRPC.TL_messageMediaPhoto_old) && !(n1(this.k) instanceof TLRPC.TL_messageMediaPhoto_layer68) && !(n1(this.k) instanceof TLRPC.TL_messageMediaPhoto_layer74) && !(n1(this.k) instanceof TLRPC.TL_messageMediaDocument_old) && !(n1(this.k) instanceof TLRPC.TL_messageMediaDocument_layer68) && !(n1(this.k) instanceof TLRPC.TL_messageMediaDocument_layer74) && ((!N3() || this.k.send_state == 0) && this.k.id >= 0)))) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            if (M(this.z)) {
                                try {
                                    gm.c((Spannable) this.z, 5, false, true);
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                            }
                            h(O3(), this.z, true, 0, 0, true);
                        }
                        c(this.z, false, z3);
                        this.z = jo4.a(this.z, true);
                        if (K4(this.k)) {
                            h(O3(), this.z, true, 3, (int) L0(), false);
                        } else if (I3() || Q4(this.k)) {
                            h(O3(), this.z, true, 4, (int) L0(), false);
                        }
                        n(this.z);
                        if (this.Q2) {
                            x5(this.z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                arrayList = new ArrayList<>();
                str = "";
            } else if (p2()) {
                TLRPC.Message message4 = this.k;
                str = message4.media.description;
                message4.message = str;
            }
            z = false;
            TLRPC.Message message32 = this.k;
            tL_textWithEntities = message32.translatedSummaryText;
            if (tL_textWithEntities == null) {
            }
            tL_textWithEntities2 = message32.summaryText;
            if (tL_textWithEntities2 == null) {
            }
            tL_textWithEntities3 = message32.translatedText;
            if (tL_textWithEntities3 == null) {
            }
            this.R2 = false;
            this.P2 = false;
            if (F3()) {
            }
        }
    }

    public final int k1() {
        uj9 uj9Var = this.y2;
        if (uj9Var != null) {
            ArrayList arrayList = uj9Var.h;
            ArrayList arrayList2 = uj9Var.g;
            if (!arrayList2.isEmpty() && !uj9Var.d && !uj9Var.H()) {
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (((ni9) obj).b >= arrayList2.size() - 1) {
                            return uj9Var.C;
                        }
                    }
                }
                qi9 qi9Var = (qi9) b10.f(1, arrayList2);
                if (qi9Var.u()) {
                    return uj9Var.C;
                }
                return qi9Var.I();
            }
            return uj9Var.C;
        }
        return this.u2;
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.k;
        TLRPC.Peer peer = message.from_id;
        if ((peer instanceof TLRPC.TL_peerChannel) && (messageFwdHeader = message.fwd_from) != null && messageFwdHeader.channel_post != 0) {
            TLRPC.Peer peer2 = messageFwdHeader.saved_from_peer;
            if ((peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k4() {
        int i;
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_message_secret) {
            if ((((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || t3(this.k)) && (i = this.k.ttl) > 0 && i <= 60) || Q4(this.k) || g4() || K4(this.k)) {
                return true;
            }
            return false;
        } else if ((message instanceof TLRPC.TL_message) && n1(message) != null && n1(this.k).ttl_seconds != 0 && ((n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean k5() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.k5():boolean");
    }

    public final void l(int i, String str) {
        TLRPC.Message message = this.k;
        if (message == null) {
            return;
        }
        if (i != 0) {
            message.flags |= 1073741824;
            message.quick_reply_shortcut_id = i;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i;
            this.k.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
        } else if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.k.quick_reply_shortcut = tL_inputQuickReplyShortcut;
        } else {
            message.flags &= -1073741825;
            message.quick_reply_shortcut_id = 0;
            message.quick_reply_shortcut = null;
        }
    }

    public final void l0() {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.PollResults pollResults;
        if (this.D != 17) {
            return;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if ((n1 instanceof TLRPC.TL_messageMediaPoll) && (pollResults = ((TLRPC.TL_messageMediaPoll) n1).results) != null) {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        } else {
            str = null;
            arrayList = null;
        }
        if (str != null) {
            CharSequence m = gw3.m(str, cmb.a3.getFontMetricsInt(), false, null, 0);
            this.A = m;
            Spannable A5 = A5(m, arrayList, cmb.a3.getFontMetricsInt(), false);
            this.A = A5;
            b(A5, arrayList, O3(), true, false, false, 0);
            return;
        }
        this.A = null;
    }

    public final int l1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.l1():int");
    }

    public final ArrayList l2() {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        ArrayList arrayList = new ArrayList();
        if (n1(this.k) != null && n1(this.k).webpage != null && (page = (webPage = n1(this.k).webpage).cached_page) != null) {
            ArrayList<TL_iv.PageBlock> arrayList2 = page.blocks;
            for (int i = 0; i < arrayList2.size(); i++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i2 = 0; i2 < pageblockslideshow.items.size(); i2++) {
                        arrayList.add(r1(webPage, pageblockslideshow.items.get(i2)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i3 = 0; i3 < pageblockcollage.items.size(); i3++) {
                        arrayList.add(r1(webPage, pageblockcollage.items.get(i3)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean l5() {
        if (!this.j2) {
            if (!q2()) {
                TLRPC.Message message = this.k;
                if (message instanceof TLRPC.TL_message_secret) {
                    int max = Math.max(message.ttl, n1(message).ttl_seconds);
                    if (max > 0) {
                        if ((((n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || K4(this.k) || t3(this.k)) && max <= 60) || g4()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } else if ((message instanceof TLRPC.TL_message) && n1(message) != null && n1(this.k).ttl_seconds != 0) {
                    if ((n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument)) {
                        return true;
                    }
                    return false;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void m() {
        n(this.v);
    }

    public final void m0(TLRPC.User user) {
        TLRPC.TL_game tL_game;
        int i = this.K1;
        if (user == null && p3()) {
            user = oc7.r1(i).W1(Long.valueOf(this.k.from_id.user_id));
        }
        k47 k47Var = this.C;
        if (k47Var != null && m1(k47Var) != null && m1(this.C).game != null) {
            tL_game = m1(this.C).game;
        } else {
            tL_game = null;
        }
        if (tL_game == null) {
            if (user != null && user.id == z8c.h(i).e()) {
                this.v = jb6.a0("ActionYouScored", null, 2131754489, jb6.G(this.k.action.score, "Points", new Object[0]));
                return;
            } else {
                this.v = D5(jb6.a0("ActionUserScored", null, 2131754503, jb6.G(this.k.action.score, "Points", new Object[0])), "un1", user);
                return;
            }
        }
        if (user != null && user.id == z8c.h(i).e()) {
            this.v = jb6.a0("ActionYouScoredInGame", null, 2131754488, jb6.G(this.k.action.score, "Points", new Object[0]));
        } else {
            this.v = D5(jb6.a0("ActionUserScoredInGame", null, 2131754502, jb6.G(this.k.action.score, "Points", new Object[0])), "un1", user);
        }
        this.v = D5(this.v, "un2", tL_game);
    }

    public final boolean m4() {
        int i;
        TLRPC.Message message = this.k;
        if (message.send_state != 2 || message.id >= 0) {
            if (this.r1 && message.id > 0) {
                int i2 = message.date;
                int currentTime = ConnectionsManager.getInstance(this.K1).getCurrentTime();
                if (this.k.video_processing_pending) {
                    i = 300;
                } else {
                    i = 60;
                }
                if (i2 < currentTime - i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean m5() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.D != 23 || g3()) {
            if (B0(this.k) != 489000) {
                boolean z = this.n2;
                TLRPC.Message message = this.k;
                int i = this.K1;
                if (z) {
                    if (message != null && message.fwd_from != null) {
                        long e = z8c.h(i).e();
                        long Q1 = Q1(e, this.k);
                        long n = pg3.n(this.k.fwd_from.saved_from_peer);
                        if (n >= 0) {
                            n = pg3.n(this.k.fwd_from.from_id);
                        }
                        if (n == 0) {
                            if (Q1 >= 0 && Q1 != 2666000) {
                                return true;
                            }
                            return false;
                        } else if (Q1 != n && n != e) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                } else if (((message.flags & 4) != 0 || (m1(this) instanceof TLRPC.TL_messageMediaPaidMedia)) && (messageFwdHeader = this.k.fwd_from) != null && !messageFwdHeader.imported) {
                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                    if (peer != null) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if ((peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id) {
                            return false;
                        }
                    }
                    if (z8c.h(i).e() != B0(this.k)) {
                        return true;
                    }
                    return false;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void n(CharSequence charSequence) {
        TLRPC.Message message;
        k47 k47Var = this.C;
        if (k47Var != null) {
            if (k47Var.d5()) {
                h(O3(), charSequence, false, 3, Integer.MAX_VALUE, false);
            } else if (K4(k47Var.k)) {
                h(O3(), charSequence, false, 3, (int) k47Var.L0(), false);
            } else {
                if (k47Var.I3() || Q4(k47Var.k)) {
                    h(O3(), charSequence, false, 4, (int) k47Var.L0(), false);
                }
                if (charSequence == this.v && (message = this.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                        Z5();
                    }
                }
            }
        }
    }

    public void n0(org.telegram.tgnet.TLRPC.User r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.n0(org.telegram.tgnet.TLRPC$User):void");
    }

    public final void n2(ArrayList arrayList, String[] strArr, boolean z, boolean z2) {
        CharSequence charSequence;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!arrayList.isEmpty()) {
            boolean z3 = false;
            for (int i = 0; i < arrayList.size(); i++) {
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    } else if (((String) arrayList.get(i)).contains(strArr[i2])) {
                        z3 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z3) {
                    break;
                }
            }
            if (z3) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < strArr.length) {
                            if (!((String) arrayList.get(i3)).contains(strArr[i4])) {
                                i4++;
                            }
                        } else {
                            arrayList.remove(i3);
                            i3--;
                            break;
                        }
                    }
                    i3++;
                }
                if (arrayList.size() > 0) {
                    Collections.sort(arrayList, new tk6((byte) 11));
                    arrayList.clear();
                    arrayList.add((String) arrayList.get(0));
                }
            }
            this.a2 = arrayList;
            if (this.k.message != null) {
                j();
                if (!TextUtils.isEmpty(this.z)) {
                    charSequence = this.z;
                } else {
                    charSequence = this.v;
                }
                CharSequence I2 = gm.I2(charSequence, " ", "\n");
                if (z && (message = this.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.k.reply_to.quote_text);
                    b(spannableStringBuilder, this.k.reply_to.quote_entities, O3(), false, false, false, 0);
                    SpannableString spannableString = new SpannableString("q ");
                    pn2 pn2Var = new pn2(2131231971, 0);
                    pn2Var.y = cmb.w0(null, cmb.p6, false);
                    spannableString.setSpan(pn2Var, 0, 1, 33);
                    I2 = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(I2);
                }
                String charSequence2 = I2.toString();
                int length = charSequence2.length();
                int indexOf = charSequence2.toLowerCase().indexOf((String) arrayList.get(0));
                if (indexOf < 0) {
                    indexOf = 0;
                }
                if (length > 120 && z2) {
                    int max = Math.max(0, indexOf - 12);
                    I2 = I2.subSequence(max, Math.min(length, (indexOf - max) + indexOf + 108));
                }
                this.c2 = I2;
                this.b2 = z2;
            }
        }
    }

    public final boolean n3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.n3():boolean");
    }

    public final boolean n4() {
        TLRPC.Message message = this.k;
        if (message.send_state == 1 && message.id < 0) {
            return true;
        }
        return false;
    }

    public boolean n5() {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!this.j2 && !this.U2 && B0(this.k) != 489000) {
            boolean z = this.n2;
            int i = this.K1;
            if (z) {
                long j = z8c.h(i).n;
                long Q1 = Q1(j, this.k);
                if (Q1 != j && Q1 != 2666000 && (message = this.k) != null && (messageFwdHeader = message.fwd_from) != null) {
                    if (messageFwdHeader.from_id != null || messageFwdHeader.saved_from_id != null) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (this.D != 27 && !q4() && !this.C2 && !this.t1 && !this.r1 && this.T == 0) {
                if (this.p2 != 2) {
                    TLRPC.Message message2 = this.k;
                    if (!message2.noforwards) {
                        if (message2.fwd_from != null && !O3()) {
                            TLRPC.Message message3 = this.k;
                            if (message3.fwd_from.saved_from_peer != null && B0(message3) == z8c.h(i).e()) {
                                return true;
                            }
                        }
                        int i2 = this.D;
                        if (i2 != 13 && i2 != 15 && i2 != 19) {
                            TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
                            if (messageFwdHeader2 == null || !(messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) || O3()) {
                                if (p3()) {
                                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(this.k.from_id.user_id));
                                    if (W1 == null || !W1.bot || (!"reviews_bot".equals(m9c.p(W1)) && !"ReviewInsightsBot".equals(m9c.p(W1)))) {
                                        if (!(n1(this.k) instanceof TLRPC.TL_messageMediaEmpty) && n1(this.k) != null) {
                                            if (!(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || (n1(this.k).webpage instanceof TLRPC.TL_webPage)) {
                                                if (W1 == null || !W1.bot || p2()) {
                                                    if (!N3()) {
                                                        if (!(n1(this.k) instanceof TLRPC.TL_messageMediaGame)) {
                                                            if ((!(n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) || p2()) && !(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                                TLRPC.Peer peer = this.k.peer_id;
                                                                TLRPC.Chat chat = null;
                                                                if (peer != null) {
                                                                    long j2 = peer.channel_id;
                                                                    if (j2 != 0) {
                                                                        chat = w0(null, null, j2);
                                                                    }
                                                                }
                                                                if (sd2.T(chat) && chat.megagroup && sd2.t0(chat) && !(n1(this.k) instanceof TLRPC.TL_messageMediaContact) && !(n1(this.k) instanceof TLRPC.TL_messageMediaGeo)) {
                                                                    return true;
                                                                }
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                        return true;
                                                    }
                                                    return false;
                                                }
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return true;
                                }
                                TLRPC.Message message4 = this.k;
                                if ((message4.from_id instanceof TLRPC.TL_peerChannel) || message4.post) {
                                    if (!(n1(message4) instanceof TLRPC.TL_messageMediaWebPage) || O3()) {
                                        if (!z4()) {
                                            TLRPC.Message message5 = this.k;
                                            if (message5.peer_id.channel_id != 0) {
                                                if (message5.via_bot_id != 0 || message5.reply_to != null) {
                                                    int i3 = this.D;
                                                    if (i3 != 13 && i3 != 15) {
                                                        return true;
                                                    }
                                                    return false;
                                                }
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean o() {
        TLRPC.MessageMedia n1 = n1(this.k);
        if ((n1 instanceof TLRPC.TL_messageMediaToDo) && !l3(this.k)) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n1;
            if (tL_messageMediaToDo.todo.list.size() < oc7.r1(this.K1).l4.x3.f()) {
                if (!O3()) {
                    TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
                    if (!todoList.others_can_complete || !todoList.others_can_append) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.o0():void");
    }

    public final int o1() {
        boolean z = this.y0;
        if (this.z0) {
            return (z ? 1 : 0) | 2;
        }
        return z ? 1 : 0;
    }

    public final boolean o2() {
        boolean z = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
        TLRPC.Message message = this.k;
        if (z) {
            if (n1(message).photo == null || !n1(this.k).photo.has_stickers) {
                return false;
            }
            return true;
        } else if (!(n1(message) instanceof TLRPC.TL_messageMediaDocument)) {
            return false;
        } else {
            return V2(n1(this.k).document);
        }
    }

    public final boolean o3() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j = peer.channel_id;
            if (j != 0) {
                chat = w0(null, null, j);
            }
        }
        if (!(this.k.from_id instanceof TLRPC.TL_peerChannel) || !sd2.T(chat) || !chat.megagroup) {
            return false;
        }
        return true;
    }

    public final boolean o4() {
        int i;
        TLRPC.Chat L0;
        Boolean bool = this.t2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.k != null && (((i = this.D) == 1 || i == 3 || i == 9 || i == 8 || i == 5) && !this.B0 && !this.j2 && !O3())) {
            TLRPC.Message message = this.k;
            if (message.send_state == 0) {
                if (!message.restriction_reason.isEmpty()) {
                    for (int i2 = 0; i2 < this.k.restriction_reason.size(); i2++) {
                        TLRPC.RestrictionReason restrictionReason = this.k.restriction_reason.get(i2);
                        if ("sensitive".equals(restrictionReason.reason)) {
                            if (!"all".equals(restrictionReason.platform)) {
                                if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                                    a.t();
                                    if (!e21.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason.platform)) {
                                }
                            }
                            this.t2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                if (B0(this.k) < 0 && (L0 = oc7.r1(this.K1).L0(Long.valueOf(-B0(this.k)))) != null && L0.restriction_reason != null) {
                    for (int i3 = 0; i3 < L0.restriction_reason.size(); i3++) {
                        TLRPC.RestrictionReason restrictionReason2 = L0.restriction_reason.get(i3);
                        if ("sensitive".equals(restrictionReason2.reason)) {
                            if (!"all".equals(restrictionReason2.platform)) {
                                if ("android".equals(restrictionReason2.platform) || "android-ios".equals(restrictionReason2.platform) || "ios-android".equals(restrictionReason2.platform)) {
                                    a.t();
                                    if (!e21.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason2.platform)) {
                                }
                            }
                            this.t2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                this.t2 = Boolean.FALSE;
            }
        }
        return false;
    }

    public final boolean o5() {
        long B0 = B0(this.k);
        int i = this.K1;
        if (sd2.o0(i, B0) && Z0() != z8c.h(i).e() && !O3()) {
            return true;
        }
        return false;
    }

    public final void p0(TLRPC.User user, boolean z) {
        String str;
        String str2;
        String a0;
        if (user == null) {
            user = oc7.r1(this.K1).W1(Long.valueOf(B0(this.k)));
        }
        if (user != null) {
            str = m9c.k(user, true);
        } else {
            str = "";
        }
        try {
            if ("XTR".equals(this.k.action.currency)) {
                str2 = "XTR " + this.k.action.total_amount;
            } else {
                jb6 D0 = jb6.D0();
                TLRPC.MessageAction messageAction = this.k.action;
                str2 = D0.p(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e) {
            fc4.g(e, true);
            str2 = "<error>";
        }
        k47 k47Var = this.C;
        if (k47Var != null && (m1(k47Var) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.k.action;
            if (messageAction2.subscription_until_date != 0) {
                k47 k47Var2 = this.C;
                if (z) {
                    a0 = jb6.a0(null, null, 2131747097, str, str2, m1(k47Var2).title, jb6.x(this.k.action.subscription_until_date, false));
                    this.v = a0;
                } else {
                    a0 = jb6.a0(null, null, 2131747093, str2, str, m1(k47Var2).title, jb6.x(this.k.action.subscription_until_date, false));
                    this.v = a0;
                }
            } else if (messageAction2.recurring_init && !z) {
                a0 = jb6.a0(null, null, 2131747094, str2, str, m1(this.C).title);
                this.v = a0;
            } else {
                a0 = jb6.a0(null, null, 2131747099, str2, str, m1(this.C).title);
                this.v = a0;
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.k.action;
            int i = messageAction3.subscription_until_date;
            if (i != 0) {
                long j = i;
                if (z) {
                    a0 = jb6.a0(null, null, 2131747098, str, str2, jb6.x(j, false));
                    this.v = a0;
                } else {
                    a0 = jb6.a0(null, null, 2131747092, str2, str, jb6.x(j, false));
                    this.v = a0;
                }
            } else if (messageAction3.recurring_init && !z) {
                a0 = jb6.a0(null, null, 2131747095, str2, str);
                this.v = a0;
            } else {
                a0 = jb6.a0(null, null, 2131747096, str2, str);
                this.v = a0;
            }
        }
        this.v = nxa.T0(a0);
    }

    public final boolean p2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean p3() {
        TLRPC.Message message = this.k;
        if ((message.from_id instanceof TLRPC.TL_peerUser) && !message.post) {
            return true;
        }
        return false;
    }

    public final boolean p4() {
        TLRPC.Message message = this.k;
        if (message.send_state != 0 && message.id <= 0) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaToDo) || l3(this.k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n1;
        if (!O3() && !tL_messageMediaToDo.todo.others_can_complete) {
            return false;
        }
        return true;
    }

    public final void q0(TLRPC.Chat chat, TLRPC.User user) {
        boolean z;
        String r;
        if (user == null && chat == null) {
            boolean p32 = p3();
            int i = this.K1;
            if (p32) {
                user = oc7.r1(i).W1(Long.valueOf(this.k.from_id.user_id));
            }
            if (user == null) {
                TLRPC.Peer peer = this.k.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = oc7.r1(i).L0(Long.valueOf(this.k.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = oc7.r1(i).L0(Long.valueOf(this.k.peer_id.chat_id));
                }
            }
        }
        k47 k47Var = this.C;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (k47Var.I3()) {
                    String M0 = jb6.M0(2131754591, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M0, "un1", chat);
                    return;
                } else if (K4(this.C.k)) {
                    String M02 = jb6.M0(2131754583, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M02, "un1", chat);
                    return;
                } else if (t3(this.C.k)) {
                    String M03 = jb6.M0(2131754592, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M03, "un1", chat);
                    return;
                } else if (Q4(this.C.k)) {
                    String M04 = jb6.M0(2131754582, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M04, "un1", chat);
                    return;
                } else if (this.C.g4()) {
                    String M05 = jb6.M0(2131754586, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M05, "un1", chat);
                    return;
                } else if ((this.C.s4() || this.C.J2()) && !this.C.G2()) {
                    String M06 = jb6.M0(2131754585, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M06, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaDocument) {
                    String M07 = jb6.M0(2131754596, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M07, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaGeo) {
                    String M08 = jb6.M0(2131754594, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M08, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String M09 = jb6.M0(2131754593, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M09, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaContact) {
                    String M010 = jb6.M0(2131754597, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M010, "un1", chat);
                    return;
                } else {
                    boolean z2 = m1(this.C) instanceof TLRPC.TL_messageMediaPoll;
                    k47 k47Var2 = this.C;
                    if (z2) {
                        if (((TLRPC.TL_messageMediaPoll) m1(k47Var2)).poll.quiz) {
                            String M011 = jb6.M0(2131754587, null);
                            if (user != 0) {
                                chat = user;
                            }
                            this.v = D5(M011, "un1", chat);
                            return;
                        }
                        String M012 = jb6.M0(2131754588, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = D5(M012, "un1", chat);
                        return;
                    } else if (m1(k47Var2) instanceof TLRPC.TL_messageMediaPhoto) {
                        String M013 = jb6.M0(2131754589, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = D5(M013, "un1", chat);
                        return;
                    } else {
                        boolean z3 = m1(this.C) instanceof TLRPC.TL_messageMediaPaidMedia;
                        k47 k47Var3 = this.C;
                        if (z3) {
                            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) m1(k47Var3);
                            if (chat != null) {
                                r = chat.title;
                            } else {
                                r = m9c.r(user);
                            }
                            this.v = jb6.G((int) tL_messageMediaPaidMedia.stars_amount, "NotificationPinnedPaidMedia", r);
                            return;
                        }
                        boolean z4 = m1(k47Var3) instanceof TLRPC.TL_messageMediaGame;
                        k47 k47Var4 = this.C;
                        if (z4) {
                            String a0 = jb6.a0("ActionPinnedGame", null, 2131754595, "🎮 " + m1(k47Var4).game.title);
                            if (user != 0) {
                                chat = user;
                            }
                            CharSequence D5 = D5(a0, "un1", chat);
                            this.v = D5;
                            this.v = gw3.m(D5, cmb.n2.getFontMetricsInt(), false, null, 0);
                            return;
                        }
                        CharSequence charSequence = k47Var4.v;
                        if (charSequence != null && charSequence.length() > 0) {
                            CharSequence cloneSpans = gn.cloneSpans(this.C.v);
                            if (cloneSpans.length() > 20) {
                                cloneSpans = cloneSpans.subSequence(0, 20);
                                z = true;
                            } else {
                                z = false;
                            }
                            SpannableStringBuilder m = gw3.m(cloneSpans, cmb.n2.getFontMetricsInt(), true, null, 0);
                            k47 k47Var5 = this.C;
                            if (k47Var5 != null && k47Var5.k != null) {
                                m = k47Var5.z5(m, cmb.n2.getFontMetricsInt());
                            }
                            hs6.g(this.C, (Spannable) m);
                            if (z) {
                                if (m instanceof SpannableStringBuilder) {
                                    ((SpannableStringBuilder) m).append((CharSequence) "...");
                                } else if (m != null) {
                                    m = new SpannableStringBuilder(m).append((CharSequence) "...");
                                }
                            }
                            SpannableStringBuilder m0 = gm.m0(jb6.M0(2131754584, null), m);
                            if (user != 0) {
                                chat = user;
                            }
                            this.v = D5(m0, "un1", chat);
                            return;
                        }
                        String M014 = jb6.M0(2131754590, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = D5(M014, "un1", chat);
                        return;
                    }
                }
            }
        }
        String M015 = jb6.M0(2131754590, null);
        if (user != null) {
            chat = user;
        }
        this.v = D5(M015, "un1", chat);
    }

    public final java.lang.CharSequence q1(org.telegram.tgnet.TLRPC.MessageMedia r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.q1(org.telegram.tgnet.TLRPC$MessageMedia):java.lang.CharSequence");
    }

    public final boolean q2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return false;
        }
        return true;
    }

    public final boolean q3() {
        return t3(this.k);
    }

    public final boolean q4() {
        if (this.R0 != null) {
            return true;
        }
        return false;
    }

    public final v67 q5() {
        TLRPC.Message message;
        k47 k47Var = this.C;
        if (k47Var != null && (message = k47Var.k) != null) {
            TLRPC.SuggestedPost suggestedPost = message.suggested_post;
            if (suggestedPost != null) {
                return v67.b(suggestedPost);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                return new v67(nk.m(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
            }
        }
        return null;
    }

    public final void r0(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TL_iv.RichMessage richMessage;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        boolean q2 = q2();
        TLRPC.Message message = this.k;
        if (q2) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0);
            if (!z) {
                this.p0 = new ArrayList(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                b6(this.p0, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.n0 = this.k;
            if (this.I1 == null) {
                Q();
            }
        } else if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (!z) {
                    this.p0 = new ArrayList(photo.sizes);
                } else {
                    ArrayList arrayList12 = this.p0;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i = 0; i < this.p0.size(); i++) {
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.p0.get(i);
                            int i2 = 0;
                            while (true) {
                                if (i2 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i2);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (photo.dc_id != 0 && (arrayList11 = this.p0) != null) {
                    int size = arrayList11.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) this.p0.get(i3)).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.n0 = this.k.action.photo;
            }
        } else if (this.n == null && this.o == null) {
            TLRPC.MessageMedia n1 = n1(message);
            TLRPC.Photo photo2 = null;
            if (n1 != null && !(n1(this.k) instanceof TLRPC.TL_messageMediaEmpty)) {
                boolean z2 = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
                TLRPC.Message message2 = this.k;
                if (z2) {
                    TLRPC.Photo photo3 = n1(message2).photo;
                    if (z && ((arrayList10 = this.p0) == null || arrayList10.size() == photo3.sizes.size())) {
                        ArrayList arrayList13 = this.p0;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            for (int i4 = 0; i4 < this.p0.size(); i4++) {
                                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.p0.get(i4);
                                if (photoSize3 != null) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= photo3.sizes.size()) {
                                            break;
                                        }
                                        TLRPC.PhotoSize photoSize4 = photo3.sizes.get(i5);
                                        if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                            if (photoSize4.type.equals(photoSize3.type)) {
                                                photoSize3.location = photoSize4.location;
                                                break;
                                            } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                                this.p0.set(i4, photoSize4);
                                                break;
                                            }
                                        }
                                        i5++;
                                    }
                                }
                            }
                        }
                    } else {
                        this.p0 = new ArrayList(photo3.sizes);
                    }
                    this.n0 = n1(this.k).photo;
                    return;
                }
                boolean z3 = n1(message2) instanceof TLRPC.TL_messageMediaDocument;
                TLRPC.Message message3 = this.k;
                if (z3) {
                    TLRPC.Photo photo4 = ((TLRPC.TL_messageMediaDocument) n1(message3)).video_cover;
                    if (photo4 != null) {
                        if (z && ((arrayList9 = this.p0) == null || arrayList9.size() == photo4.sizes.size())) {
                            ArrayList arrayList14 = this.p0;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                for (int i6 = 0; i6 < this.p0.size(); i6++) {
                                    TLRPC.PhotoSize photoSize5 = (TLRPC.PhotoSize) this.p0.get(i6);
                                    if (photoSize5 != null) {
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= photo4.sizes.size()) {
                                                break;
                                            }
                                            TLRPC.PhotoSize photoSize6 = photo4.sizes.get(i7);
                                            if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                                if (photoSize6.type.equals(photoSize5.type)) {
                                                    photoSize5.location = photoSize6.location;
                                                    break;
                                                } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                                    this.p0.set(i6, photoSize6);
                                                    break;
                                                }
                                            }
                                            i7++;
                                        }
                                    }
                                }
                            }
                        } else {
                            this.p0 = new ArrayList(photo4.sizes);
                        }
                        this.n0 = photo4;
                        return;
                    }
                    TLRPC.Document F0 = F0();
                    if (W2(F0)) {
                        if (z && (arrayList8 = this.p0) != null) {
                            if (!arrayList8.isEmpty()) {
                                b6(this.p0, F0.thumbs);
                            }
                        } else {
                            ArrayList arrayList15 = new ArrayList();
                            this.p0 = arrayList15;
                            arrayList15.addAll(F0.thumbs);
                        }
                        this.n0 = F0;
                        return;
                    }
                    return;
                }
                boolean z4 = n1(message3) instanceof TLRPC.TL_messageMediaGame;
                TLRPC.Message message4 = this.k;
                if (z4) {
                    TLRPC.Document document = n1(message4).game.document;
                    if (document != null && W2(document)) {
                        if (!z) {
                            ArrayList arrayList16 = new ArrayList();
                            this.p0 = arrayList16;
                            arrayList16.addAll(document.thumbs);
                        } else {
                            ArrayList arrayList17 = this.p0;
                            if (arrayList17 != null && !arrayList17.isEmpty()) {
                                b6(this.p0, document.thumbs);
                            }
                        }
                        this.n0 = document;
                    }
                    TLRPC.Photo photo5 = n1(this.k).game.photo;
                    if (photo5 != null) {
                        if (z && (arrayList7 = this.q0) != null) {
                            if (!arrayList7.isEmpty()) {
                                b6(this.q0, photo5.sizes);
                            }
                        } else {
                            this.q0 = new ArrayList(photo5.sizes);
                        }
                        this.o0 = photo5;
                    }
                    if (this.p0 == null && (arrayList6 = this.q0) != null) {
                        this.p0 = arrayList6;
                        this.q0 = null;
                        this.n0 = this.o0;
                        this.o0 = null;
                        return;
                    }
                    return;
                } else if (n1(message4) instanceof TLRPC.TL_messageMediaWebPage) {
                    TLRPC.Photo photo6 = n1(this.k).webpage.photo;
                    TLRPC.Document document2 = n1(this.k).webpage.document;
                    if (photo6 != null) {
                        if (z && (arrayList5 = this.p0) != null) {
                            if (!arrayList5.isEmpty()) {
                                b6(this.p0, photo6.sizes);
                            }
                        } else {
                            this.p0 = new ArrayList(photo6.sizes);
                        }
                        this.n0 = photo6;
                        return;
                    } else if (document2 != null && W2(document2)) {
                        if (!z) {
                            ArrayList arrayList18 = new ArrayList();
                            this.p0 = arrayList18;
                            arrayList18.addAll(document2.thumbs);
                        } else {
                            ArrayList arrayList19 = this.p0;
                            if (arrayList19 != null && !arrayList19.isEmpty()) {
                                b6(this.p0, document2.thumbs);
                            }
                        }
                        this.n0 = document2;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            TLRPC.Message message5 = this.k;
            if (message5 != null && (richMessage = message5.rich_message) != null) {
                TLRPC.Document a0 = a0(richMessage.blocks, richMessage);
                TL_iv.RichMessage richMessage2 = this.k.rich_message;
                if (richMessage2 != null) {
                    photo2 = W(richMessage2.blocks, richMessage2);
                }
                if (a0 != null) {
                    if (W2(a0)) {
                        if (!z) {
                            ArrayList arrayList20 = new ArrayList();
                            this.p0 = arrayList20;
                            arrayList20.addAll(a0.thumbs);
                        } else {
                            ArrayList arrayList21 = this.p0;
                            if (arrayList21 != null && !arrayList21.isEmpty()) {
                                b6(this.p0, a0.thumbs);
                            }
                        }
                        this.n0 = a0;
                        return;
                    }
                    return;
                } else if (photo2 != null) {
                    if (z && (arrayList4 = this.p0) != null) {
                        if (!arrayList4.isEmpty()) {
                            b6(this.p0, photo2.sizes);
                        }
                    } else {
                        this.p0 = new ArrayList(photo2.sizes);
                    }
                    this.n0 = photo2;
                    if (this.I1 == null) {
                        Q();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            TLRPC.MessageMedia messageMedia = this.a1;
            if (messageMedia != null) {
                TLRPC.Photo photo7 = messageMedia.photo;
                TLRPC.Document document3 = messageMedia.document;
                if (photo7 != null) {
                    if (z && (arrayList3 = this.p0) != null) {
                        if (!arrayList3.isEmpty()) {
                            b6(this.p0, photo7.sizes);
                        }
                    } else {
                        this.p0 = new ArrayList(photo7.sizes);
                    }
                    this.n0 = photo7;
                } else if (document3 != null && W2(document3)) {
                    if (!z) {
                        ArrayList arrayList22 = new ArrayList();
                        this.p0 = arrayList22;
                        arrayList22.addAll(document3.thumbs);
                    } else {
                        ArrayList arrayList23 = this.p0;
                        if (arrayList23 != null && !arrayList23.isEmpty()) {
                            b6(this.p0, document3.thumbs);
                        }
                    }
                    this.n0 = document3;
                }
            } else if (this.V0 != null) {
                if (z && (arrayList2 = this.p0) != null) {
                    if (!arrayList2.isEmpty()) {
                        b6(this.p0, this.V0.sizes);
                    }
                } else {
                    this.p0 = new ArrayList(this.V0.sizes);
                }
                this.n0 = this.V0;
                if (this.I1 == null) {
                    Q();
                }
            }
        } else if (TextUtils.isEmpty(this.u) && W2(this.n)) {
            if (z && (arrayList = this.p0) != null) {
                if (!arrayList.isEmpty()) {
                    b6(this.p0, this.n.thumbs);
                }
            } else {
                ArrayList arrayList24 = new ArrayList();
                this.p0 = arrayList24;
                arrayList24.addAll(this.n.thumbs);
            }
            this.n0 = this.n;
        }
    }

    public final k47 r1(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message = null;
        r2 = null;
        TLRPC.Photo photo = null;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            long j = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
            if (webPage.cached_page != null) {
                TLRPC.Photo photo2 = webPage.photo;
                if (photo2 != null && photo2.id == j) {
                    photo = photo2;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= webPage.cached_page.photos.size()) {
                            break;
                        }
                        TLRPC.Photo photo3 = webPage.cached_page.photos.get(i);
                        if (photo3.id == j) {
                            photo = photo3;
                            break;
                        }
                        i++;
                    }
                }
            }
            if (photo != webPage.photo) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                tL_message2.media = tL_messageMediaPhoto;
                tL_messageMediaPhoto.photo = photo;
                tL_message = tL_message2;
                tL_message.message = "";
                tL_message.realId = e1();
                tL_message.id = Utilities.b.nextInt();
                TLRPC.Message message = this.k;
                tL_message.date = message.date;
                tL_message.peer_id = message.peer_id;
                tL_message.out = message.out;
                tL_message.from_id = message.from_id;
                return new k47(this.K1, tL_message, false, true);
            }
            return this;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            if (K0(webPage, pageblockvideo.video_id) != webPage.document) {
                tL_message = new TLRPC.TL_message();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.document = K0(webPage, pageblockvideo.video_id);
            }
            return this;
        }
        tL_message.message = "";
        tL_message.realId = e1();
        tL_message.id = Utilities.b.nextInt();
        TLRPC.Message message2 = this.k;
        tL_message.date = message2.date;
        tL_message.peer_id = message2.peer_id;
        tL_message.out = message2.out;
        tL_message.from_id = message2.from_id;
        return new k47(this.K1, tL_message, false, true);
    }

    public final boolean r2() {
        ArrayList arrayList = this.a2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean r4() {
        TLRPC.Message message = this.k;
        if (message != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean s(TLRPC.Chat chat, boolean z) {
        TLRPC.Message message;
        boolean w4 = w4();
        int i = this.K1;
        if (!w4 || (message = this.k) == null || message.dialog_id != z8c.h(i).e()) {
            if ((this.T == 0 && this.R0 == null && r(i, z, this.k, chat)) || c3(this.k)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final android.text.SpannableStringBuilder s0(java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.s0(java.lang.String, java.lang.String):android.text.SpannableStringBuilder");
    }

    public final CharSequence s1(f47 f47Var, int[] iArr) {
        String str;
        if (this.L2 || this.G0) {
            return null;
        }
        if (this.M2) {
            return this.v;
        }
        int i = this.D;
        if (i == 19 || i == 15 || i == 13) {
            return null;
        }
        CharSequence W6 = yv1.W6(this, f47Var, iArr);
        if (W6 == null && S3()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.k.media).poll;
                StringBuilder sb = new StringBuilder(poll.question.text);
                sb.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i2);
                    i2++;
                    sb.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    if (tL_textWithEntities == null) {
                        str = "";
                    } else {
                        str = tL_textWithEntities.text;
                    }
                    sb.append(str);
                }
                W6 = sb.toString();
            } catch (Exception unused) {
            }
        }
        if (W6 == null && G3(this.k, true)) {
            W6 = yv1.Y6(0L, this, false);
        }
        if (W6 != null && gw3.d(W6)) {
            return null;
        }
        return W6;
    }

    public final boolean s2() {
        TLRPC.Message message;
        if (!this.G0 && !this.j2 && (message = this.k) != null) {
            if (!this.N2) {
                TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
                if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                    return true;
                }
            }
            if (this.q2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean s4() {
        int i = this.D;
        if (i != 1000) {
            if (i != 13) {
                return false;
            }
            return true;
        } else if (!t4(F0()) && !M4(F0())) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean t() {
        if (!k4() && !e3(this.k)) {
            if (n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (n1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                if (Q4(this.k) || s4() || J2() || g4()) {
                    return false;
                }
                return true;
            } else if (F3()) {
                return true;
            }
        }
        return false;
    }

    public final String t1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            return F0.mime_type;
        }
        boolean z = n1(this.k) instanceof TLRPC.TL_messageMediaInvoice;
        TLRPC.Message message = this.k;
        if (z) {
            TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) n1(message)).webPhoto;
            if (webDocument != null) {
                return webDocument.mime_type;
            }
            return "";
        } else if (n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            return "image/jpeg";
        } else {
            if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.k).webpage.photo != null) {
                return "image/jpeg";
            }
            return "";
        }
    }

    public final boolean t2() {
        TLRPC.MessageMedia messageMedia;
        if ((!this.j2 && (((messageMedia = this.k.media) != null && messageMedia.spoiler) || l5())) || x3()) {
            return true;
        }
        return false;
    }

    public final boolean u(org.telegram.tgnet.TLRPC.Chat r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.u(org.telegram.tgnet.TLRPC$Chat):boolean");
    }

    public final String u0(boolean z) {
        return t0(F0(), z);
    }

    public final boolean u2() {
        TLRPC.Message message = this.k;
        if (message != null && message.entities != null) {
            for (int i = 0; i < this.k.entities.size(); i++) {
                if (!(this.k.entities.get(i) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u3() {
        if (this.D == 26) {
            return true;
        }
        return false;
    }

    public final boolean v(TLRPC.Chat chat) {
        TLRPC.Message message = this.k;
        if (!message.video_processing_pending) {
            if (chat != null || message.peer_id.channel_id == 0 || (chat = oc7.r1(this.K1).L0(Long.valueOf(message.peer_id.channel_id))) != null) {
                if (sd2.T(chat) && !chat.megagroup && !chat.creator) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                    if (tL_chatAdminRights != null) {
                        if (!tL_chatAdminRights.edit_messages && !message.out) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v2(k39 k39Var) {
        if (w2() && k39Var != null) {
            for (int i = 0; i < this.k.reactions.results.size(); i++) {
                if (k39Var.f(this.k.reactions.results.get(i).reaction)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v3() {
        if (!u3() && !w3()) {
            return false;
        }
        return true;
    }

    public final boolean v5() {
        if (!R4() && F0() != null && kl9.i.contains(F0().mime_type) && F0().size < (oc7.r1(this.K1).l4.R0.f() << 1)) {
            for (int i = 0; i < F0().attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0().attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        int i;
        if (a4(this.k) || (i = this.D) == 30 || i == 31 || i == 32 || i == 33 || i == 35 || i == 37 || (this.k instanceof TLRPC.TL_message_secret) || l5() || C3() || this.D == 16 || q4() || this.k.noforwards) {
            return false;
        }
        return true;
    }

    public final TLRPC.Chat w0(AbstractMap abstractMap, vh6 vh6Var, long j) {
        TLRPC.Chat chat;
        if (abstractMap != null) {
            chat = (TLRPC.Chat) abstractMap.get(Long.valueOf(j));
        } else if (vh6Var != null) {
            chat = (TLRPC.Chat) vh6Var.f(j);
        } else {
            chat = null;
        }
        if (chat == null) {
            return oc7.r1(this.K1).L0(Long.valueOf(j));
        }
        return chat;
    }

    public final java.lang.String w1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.w1(boolean):java.lang.String");
    }

    public final boolean w2() {
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions != null && !tL_messageReactions.results.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean w3() {
        if (this.D == 28) {
            return true;
        }
        return false;
    }

    public final boolean w4() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        return y(F0());
    }

    public final long x0() {
        TLRPC.Peer peer = this.k.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public final boolean x2() {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null && messageReplies.replies > 0) {
            return true;
        }
        return false;
    }

    public final boolean x3() {
        if (o4() && !oc7.r1(this.K1).a5()) {
            return true;
        }
        return false;
    }

    public final boolean x4() {
        TLRPC.Message message = this.k;
        if (message != null && (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return true;
        }
        return false;
    }

    public final ArrayList y0() {
        ArrayList arrayList = new ArrayList();
        if (this.k.reactions != null) {
            for (int i = 0; i < this.k.reactions.results.size(); i++) {
                if (this.k.reactions.results.get(i).chosen) {
                    arrayList.add(k39.d(this.k.reactions.results.get(i).reaction));
                }
            }
        }
        return arrayList;
    }

    public final String y1(boolean z) {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            for (int i = 0; i < F0.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (!z) {
                            return null;
                        }
                        return jb6.s(this.k.date, true);
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String B = bc4.B(F0);
                    if (TextUtils.isEmpty(B) && z) {
                        return jb6.M0(2131753864, null);
                    }
                    return B;
                } else if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    boolean a4 = a4(this.k);
                    TLRPC.Message message = this.k;
                    if (a4) {
                        StringBuilder sb = new StringBuilder("/");
                        String J1 = J1(message);
                        if (J1 == null) {
                            oz8 c = pz8.f(this.K1).c(I1(this.k));
                            if (c != null) {
                                J1 = c.b;
                            } else {
                                J1 = "";
                            }
                        }
                        sb.append(J1);
                        return jb6.a0(null, null, 2131752679, sb.toString());
                    }
                    return jb6.s(message.date, true);
                }
            }
            String B2 = bc4.B(F0);
            if (!TextUtils.isEmpty(B2)) {
                return B2;
            }
        }
        return jb6.M0(2131753864, null);
    }

    public final boolean y2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return false;
        }
        return true;
    }

    public final boolean y3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.imported) {
            return true;
        }
        return false;
    }

    public final boolean y4() {
        if (this.D == 24 && !g3()) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if (c3(this.k)) {
            return false;
        }
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public final Long z1() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i);
            i++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(pg3.n(peer));
                }
            }
        }
        return null;
    }

    public final boolean z2() {
        int i;
        if (c1() != 0) {
            ArrayList arrayList = this.p0;
            if ((arrayList != null && !arrayList.isEmpty()) || (i = this.D) == 3 || i == 1 || I3() || U2()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean z3() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public final boolean z4() {
        if (this.g) {
            return true;
        }
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.k.peer_id;
        if (peer != null) {
            long j = peer.channel_id;
            if (j != 0) {
                TLRPC.Chat w0 = w0(null, null, j);
                if (w0 == null) {
                    return false;
                }
                boolean z = w0.megagroup;
                this.h = Boolean.valueOf(z);
                return z;
            }
        }
        this.h = Boolean.FALSE;
        return false;
    }

    public final Spannable z5(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return A5(charSequence, O0(), fontMetricsInt, false);
    }

    public k47(int i, TLRPC.Message message, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.a = z ? (byte) 2 : (byte) 1;
        this.K1 = i;
        this.b = str2;
        this.c = str3;
        this.v = str;
        this.k = message;
        this.f = z2;
        this.g = z3;
        this.i = z4;
    }

    public k47(int i, TLRPC.Message message, boolean z, boolean z2) {
        this(i, message, null, null, null, null, null, z, z2, 0L);
    }

    public k47(int i, TLRPC.Message message, k47 k47Var, boolean z, boolean z2) {
        this(i, message, k47Var, null, null, null, null, z, z2, 0L);
    }

    public k47(int i, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z, boolean z2) {
        this(i, message, abstractMap, abstractMap2, z, z2, 0L);
    }

    public k47(int i, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z, boolean z2, long j) {
        this(i, message, null, abstractMap, abstractMap2, null, null, z, z2, j);
    }

    public k47(int i, TLRPC.Message message, vh6 vh6Var, vh6 vh6Var2, boolean z, boolean z2) {
        this(i, message, null, null, null, vh6Var, vh6Var2, z, z2, 0L, false, false, false, 0);
    }

    public k47(int i, TLRPC.Message message, k47 k47Var, AbstractMap abstractMap, AbstractMap abstractMap2, vh6 vh6Var, vh6 vh6Var2, boolean z, boolean z2, long j) {
        this(i, message, k47Var, abstractMap, abstractMap2, vh6Var, vh6Var2, z, z2, j, false, false, false, 0);
    }

    public k47(int i, TLRPC.Message message, k47 k47Var, AbstractMap abstractMap, AbstractMap abstractMap2, vh6 vh6Var, vh6 vh6Var2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, int i2) {
        AbstractMap abstractMap3;
        vh6 vh6Var3;
        ?? r15;
        TextPaint textPaint;
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        cmb.P();
        this.j2 = z3;
        this.k2 = z4;
        this.n2 = z5 || B0(message) == z8c.h(i).e();
        this.p2 = i2;
        this.K1 = i;
        this.k = message;
        this.C = k47Var;
        this.T = j;
        this.n1 = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            vh6Var3 = vh6Var;
            r15 = 0;
            abstractMap3 = abstractMap;
            this.C = new k47(i, message2, null, abstractMap3, abstractMap2, vh6Var3, vh6Var2, false, z2, j);
        } else {
            abstractMap3 = abstractMap;
            vh6Var3 = vh6Var;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            d2(abstractMap3, vh6Var3, peer.user_id);
        }
        a6(abstractMap3, abstractMap2, vh6Var3, vh6Var2);
        K5();
        if (z) {
            f6(r15);
        }
        h5();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.k.date * 1000);
        int i3 = gregorianCalendar.get(6);
        int i4 = gregorianCalendar.get(1);
        int i5 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i4);
        Integer valueOf2 = Integer.valueOf(i5);
        Integer valueOf3 = Integer.valueOf(i3);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.W = String.format("%d_%02d_%02d", objArr);
        this.X = (i3 * 1000000) + (i5 * 10000) + i4;
        Integer valueOf4 = Integer.valueOf(i4);
        Integer valueOf5 = Integer.valueOf(i5);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.Y = String.format("%d_%02d", objArr2);
        P(r15);
        k0();
        if (z) {
            if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = cmb.w2;
            } else {
                textPaint = cmb.n2;
            }
            int[] iArr = i() ? new int[1] : null;
            CharSequence m = gw3.m(this.v, textPaint.getFontMetricsInt(), r15, iArr, r15);
            this.v = m;
            Spannable z52 = z5(m, textPaint.getFontMetricsInt());
            this.v = z52;
            if (iArr != null && iArr[r15] > 1) {
                C5(z52, iArr);
            }
            H(iArr);
            G();
            K5();
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                this.H1 = eq3.f(F0, cmb.bd, 1.0f, null);
            }
        }
        this.S1 = z;
        r0(r15);
        if (z2) {
            K(true);
        }
    }

    public k47(int i, TL_stories.StoryItem storyItem) {
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.K1 = i;
        this.l = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.k = tL_message;
            tL_message.id = storyItem.messageId;
            tL_message.realId = storyItem.id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
    }
}
