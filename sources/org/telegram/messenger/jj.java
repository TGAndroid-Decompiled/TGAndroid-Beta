package org.telegram.messenger;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u21;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
public class jj {
    public static Pattern f16286h3;
    public static Pattern f16287i3;
    public static Pattern f16288j3;
    public static final String[] f16289k3 = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    public static Pattern f16290l3;
    public static CharSequence[] f16291m3;
    public static SpannableStringBuilder f16292n3;
    public static SpannableStringBuilder f16293o3;
    public CharSequence A;
    public boolean A0;
    public String A1;
    public boolean A2;
    public SpannableString B;
    public String B0;
    public TLRPC.MessageMedia B1;
    public boolean B2;
    public jj C;
    public boolean C0;
    public TLRPC.TL_document C1;
    public boolean C2;
    public int D;
    public StringBuilder D0;
    public ArrayList D1;
    public boolean D2;
    public long E;
    public boolean E0;
    public String E1;
    public boolean E2;
    public long F;
    public long F0;
    public final c00 F1;
    public boolean F2;
    public String G;
    public boolean G0;
    public BitmapDrawable G1;
    public boolean G2;
    public boolean H;
    public long H0;
    public Bitmap H1;
    public boolean H2;
    public boolean I;
    public HashSet I0;
    public final int I1;
    public boolean I2;
    public boolean J;
    public boolean J0;
    public final TLRPC.TL_channelAdminLogEvent J1;
    public boolean J2;
    public boolean K;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public boolean L;
    public boolean L0;
    public fj L1;
    public boolean L2;
    public boolean M;
    public boolean M0;
    public boolean M1;
    public boolean M2;
    public boolean N;
    public boolean N0;
    public int N1;
    public boolean N2;
    public boolean O;
    public boolean O0;
    public int O1;
    public Boolean O2;
    public boolean P;
    public byte[] P0;
    public int P1;
    public boolean P2;
    public boolean Q;
    public String Q0;
    public boolean Q1;
    public Integer Q2;
    public boolean R;
    public String R0;
    public int R1;
    public Boolean R2;
    public int S;
    public boolean S0;
    public float S1;
    public byte S2;
    public long T;
    public TLRPC.Photo T0;
    public boolean T1;
    public SpannableString T2;
    public int U;
    public String U0;
    public float U1;
    public SpannableString U2;
    public final int V;
    public String V0;
    public boolean V1;
    public Integer V2;
    public final String W;
    public String W0;
    public boolean W1;
    public TLRPC.TL_webPage W2;
    public final int X;
    public TLRPC.PeerColor X0;
    public StringBuilder X1;
    public boolean X2;
    public final String Y;
    public TLRPC.MessageMedia Y0;
    public ArrayList Y1;
    public Boolean Y2;
    public boolean Z;
    public boolean Z0;
    public boolean Z1;
    public ArrayList Z2;
    public int f16294a;
    public boolean f16295a0;
    public boolean f16296a1;
    public CharSequence a2;
    public TLRPC.Document f16297a3;
    public final String f16298b;
    public float f16299b0;
    public boolean f16300b1;
    public int f16301b2;
    public t61 f16302b3;
    public String f16303c;
    public float f16304c0;
    public int f16305c1;
    public ic f16306c2;
    public t61 f16307c3;
    public long d;
    public int f16308d0;
    public long f16309d1;
    public Object f16310d2;
    public t61 f16311d3;
    public long e;
    public float f16312e0;
    public TLRPC.TL_peerColorCollectible f16313e1;
    public boolean f16314e2;
    public boolean f16315e3;
    public final boolean f16316f;
    public float f16317f0;
    public boolean f16318f1;
    public TLRPC.Peer f16319f2;
    public Integer f16320f3;
    public final boolean f16321g;
    public int f16322g0;
    public boolean f16323g1;
    public final Drawable[] f16324g2;
    public Float f16325g3;
    public Boolean h;
    public int f16326h0;
    public TLRPC.TL_forumTopic f16327h1;
    public final boolean f16328h2;
    public final boolean f16329i;
    public double f16330i0;
    public boolean f16331i1;
    public final boolean f16332i2;
    public th.q4 f16333j;
    public boolean f16334j0;
    public boolean f16335j1;
    public boolean f16336j2;
    public TLRPC.Message f16337k;
    public boolean f16338k0;
    public int f16339k1;
    public Drawable f16340k2;
    public final TL_stories.StoryItem f16341l;
    public TLObject f16342l0;
    public boolean l1;
    public boolean f16343l2;
    public th.d5 f16344m;
    public TLRPC.Photo m0;
    public boolean f16345m1;
    public boolean f16346m2;
    public TLRPC.Document f16347n;
    public ArrayList f16348n0;
    public boolean f16349n1;
    public final int f16350n2;
    public Long f16351o;
    public ArrayList f16352o0;
    public boolean f16353o1;
    public c5.x f16354o2;
    public boolean f16355p;
    public x20 f16356p0;
    public boolean f16357p1;
    public byte[] f16358p2;
    public boolean f16359q;
    public ArrayList f16360q0;
    public boolean f16361q1;
    public boolean f16362q2;
    public boolean f16363r;
    public boolean f16364r0;
    public boolean f16365r1;
    public Boolean f16366r2;
    public TLRPC.VideoSize f16367s;
    public boolean f16368s0;
    public boolean f16369s1;
    public int f16370s2;
    public boolean f16371t;
    public boolean f16372t0;
    public boolean f16373t1;
    public int f16374t2;
    public String f16375u;
    public long f16376u0;
    public boolean f16377u1;
    public boolean f16378u2;
    public CharSequence v;
    public int f16379v0;
    public ArrayList f16380v1;
    public float f16381v2;
    public CharSequence f16382w;
    public boolean f16383w0;
    public CharSequence f16384w1;
    public vv f16385w2;
    public SpannableStringBuilder f16386x;
    public boolean f16387x0;
    public ArrayList f16388x1;
    public TL_iv.RichMessage f16389x2;
    public CharSequence f16390y;
    public ef f16391y0;
    public boolean f16392y1;
    public boolean f16393y2;
    public CharSequence f16394z;
    public boolean f16395z0;
    public ArrayList f16396z1;
    public ArrayList f16397z2;

    public jj(int i10, TL_stories.StoryItem storyItem) {
        this.D = 1000;
        this.f16304c0 = -1.0f;
        this.H0 = -1L;
        this.f16305c1 = -1;
        this.f16309d1 = -1L;
        this.Z1 = true;
        this.f16324g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        this.I1 = i10;
        this.f16341l = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.f16337k = tL_message;
            tL_message.f19814id = storyItem.messageId;
            tL_message.realId = storyItem.f20031id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.f16348n0 = new ArrayList();
        this.f16352o0 = new ArrayList();
    }

    public static boolean A(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty()) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            if (poll.public_voters) {
                if (!poll.closed && !poll.creator) {
                    if (W4(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close) {
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

    public static Spannable A5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return B5(charSequence, arrayList, fontMetricsInt, z10, 1.2f, 0);
    }

    public static long B0(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message.dialog_id == 0 && (peer = message.peer_id) != null) {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                message.dialog_id = -j10;
            } else {
                long j11 = peer.channel_id;
                if (j11 != 0) {
                    message.dialog_id = -j11;
                } else {
                    TLRPC.Peer peer2 = message.from_id;
                    if (peer2 != null && !message.out && message.guestchat_via_from == null) {
                        message.dialog_id = peer2.user_id;
                    } else {
                        message.dialog_id = peer.user_id;
                    }
                }
            }
        }
        return message.dialog_id;
    }

    public static boolean B4(jj jjVar) {
        if (jjVar != null) {
            TLRPC.Message message = jjVar.f16337k;
            if ((message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Spannable B5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f7, int i10) {
        Spannable spannableString;
        int i11;
        h6 h6Var;
        org.telegram.ui.Components.o5 o5Var;
        h6 h6Var2;
        h6 h6Var3 = null;
        if (charSequence == null) {
            return null;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (arrayList != null) {
            if (tz.o() >= 2) {
                i11 = 100;
            } else {
                i11 = 50;
            }
            int i12 = i11 - i10;
            h6[] h6VarArr = (h6[]) spannableString.getSpans(0, spannableString.length(), h6.class);
            int i13 = 0;
            while (i13 < arrayList.size() && i12 > 0) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i13);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i14 = 0;
                    while (i14 < h6VarArr.length) {
                        h6 h6Var4 = h6VarArr[i14];
                        if (h6Var4 != null) {
                            int spanStart = spannableString.getSpanStart(h6Var4);
                            int spanEnd = spannableString.getSpanEnd(h6Var4);
                            int i15 = tL_messageEntityCustomEmoji.offset;
                            h6Var2 = h6Var3;
                            if (i0.B1(i15, tL_messageEntityCustomEmoji.length + i15, spanStart, spanEnd)) {
                                spannableString.removeSpan(h6Var4);
                                h6VarArr[i14] = h6Var2;
                            }
                        } else {
                            h6Var2 = h6Var3;
                        }
                        i14++;
                        h6Var3 = h6Var2;
                    }
                    h6Var = h6Var3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i16 = messageEntity.offset;
                        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannableString.getSpans(i16, messageEntity.length + i16, org.telegram.ui.Components.o5.class);
                        if (o5VarArr != null && o5VarArr.length > 0) {
                            for (org.telegram.ui.Components.o5 o5Var2 : o5VarArr) {
                                spannableString.removeSpan(o5Var2);
                            }
                        }
                        if (tL_messageEntityCustomEmoji.document != null) {
                            o5Var = new org.telegram.ui.Components.o5(tL_messageEntityCustomEmoji.document, f7, fontMetricsInt);
                        } else {
                            o5Var = new org.telegram.ui.Components.o5(tL_messageEntityCustomEmoji.document_id, f7, fontMetricsInt);
                        }
                        o5Var.top = z10;
                        int i17 = messageEntity.offset;
                        spannableString.setSpan(o5Var, i17, messageEntity.length + i17, 33);
                        i12--;
                        i13++;
                        h6Var3 = h6Var;
                    }
                } else {
                    h6Var = h6Var3;
                }
                i13++;
                h6Var3 = h6Var;
            }
        }
        return spannableString;
    }

    public static long C1(TLRPC.Peer peer) {
        long j10;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j10 = peer.chat_id;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            j10 = peer.channel_id;
        } else {
            return peer.user_id;
        }
        return -j10;
    }

    public static boolean C4(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        j1(document);
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.f19813id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static boolean D(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo D1(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return W(richMessage.blocks, richMessage);
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return o1(message).webpage.photo;
        }
        if (o1(message) != null) {
            return o1(message).photo;
        }
        return null;
    }

    public static CharSequence D5(CharSequence charSequence, String str, TLObject tLObject) {
        String str2;
        CharSequence charSequence2;
        String str3;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.Chat chat;
        TLRPC.User user;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            TLObject tLObject2 = null;
            if (tLObject instanceof TLRPC.User) {
                charSequence2 = h20.p((TLRPC.User) tLObject).replace('\n', ' ');
                str2 = "" + user.f19942id;
            } else if (tLObject instanceof TLRPC.Chat) {
                charSequence2 = ((TLRPC.Chat) tLObject).title.replace('\n', ' ');
                str2 = "" + (-chat.f19793id);
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
                    charSequence2 = gg.e.j((TLRPC.ForumTopic) tLObject, null, null);
                    str3 = "topic";
                    tL_chatInviteExported = tLObject;
                } else {
                    str2 = "0";
                    charSequence2 = "";
                }
                String str4 = str3;
                tLObject2 = tL_chatInviteExported;
                str2 = str4;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
            f51 f51Var = new f51(sc.e.h("", str2));
            f51Var.f25691c = tLObject2;
            spannableStringBuilder.setSpan(f51Var, indexOf, charSequence2.length() + indexOf, 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static boolean E3(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean E4(jj jjVar) {
        TLRPC.Message message;
        if (jjVar == null || (message = jjVar.f16337k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionTopicCreate) && !(messageAction instanceof TLRPC.TL_messageActionTopicEdit)) {
            return false;
        }
        return true;
    }

    public static CharSequence F() {
        if (f16293o3 == null) {
            f16293o3 = new SpannableStringBuilder("c");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232158, 0);
            dqVar.H = 0.7f;
            dqVar.I = 0.7f;
            f16293o3.setSpan(dqVar, 0, 1, 33);
        }
        return f16293o3;
    }

    public static TLRPC.PollAnswerVoters F1(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i10);
                if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                    return pollAnswerVoters;
                }
            }
            return null;
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
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return o1(message).webpage.document;
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaGame) {
            return o1(message).game.document;
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaStory) {
            TL_stories.StoryItem storyItem = ((TLRPC.TL_messageMediaStory) o1(message)).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                return document;
            }
        } else if (o1(message) instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) o1(message);
            if (tL_messageMediaPaidMedia.extended_media.size() == 1 && (tL_messageMediaPaidMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
                return ((TLRPC.TL_messageExtendedMedia) tL_messageMediaPaidMedia.extended_media.get(0)).media.document;
            }
        }
        if (o1(message) != null) {
            return o1(message).document;
        }
        return null;
    }

    public static TLRPC.VideoSize G1(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i10 = 0; i10 < document.video_thumbs.size(); i10++) {
                if ("f".equals(document.video_thumbs.get(i10).type)) {
                    return document.video_thumbs.get(i10);
                }
            }
        }
        return null;
    }

    public static boolean G3(TLRPC.Message message, boolean z10) {
        if (message != null && o1(message) != null && !(o1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            if (!z10 || !(o1(message) instanceof TLRPC.TL_messageMediaWebPage)) {
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
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static boolean H2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static int I1(int i10, TLRPC.Message message) {
        ag.h3 d;
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
        String K1 = K1(message);
        if (K1 == null || (d = ag.i3.f(i10).d(K1)) == null) {
            return 0;
        }
        return d.f551a;
    }

    public static TLRPC.VideoSize J0(TLRPC.Document document) {
        if (document != null && !document.video_thumbs.isEmpty()) {
            return document.video_thumbs.get(0);
        }
        return null;
    }

    public static int J1(TLRPC.Message message) {
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

    public static boolean J3(TLRPC.Document document) {
        TLRPC.DocumentAttribute documentAttribute;
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                    return !documentAttribute.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && b8.B(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Document K0(TLRPC.WebPage webPage, long j10) {
        if (webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.f19799id == j10) {
                return document;
            }
            for (int i10 = 0; i10 < webPage.cached_page.documents.size(); i10++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i10);
                if (document2.f19799id == j10) {
                    return document2;
                }
            }
            return null;
        }
        return null;
    }

    public static String K1(TLRPC.Message message) {
        if (message == null) {
            return null;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (!(inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut)) {
            return null;
        }
        return ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
    }

    public static boolean K2(TLRPC.Document document, boolean z10) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z10) {
                return true;
            }
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute.stickerset instanceof TLRPC.TL_inputStickerSetShortName;
                }
                if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean K3(TLRPC.Message message) {
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return J3(o1(message).webpage.document);
        }
        if (o1(message) != null && J3(o1(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean K4(TLRPC.Document document) {
        int lastIndexOf;
        if (document != null) {
            String str = null;
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                if (i10 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        if (documentAttribute.round_message) {
                            break;
                        }
                        i11 = documentAttribute.f19800w;
                        i12 = documentAttribute.h;
                        z11 = true;
                    } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                        z10 = true;
                    } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                        str = documentAttribute.file_name;
                    }
                    i10++;
                } else {
                    if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
                        String substring = str.substring(lastIndexOf + 1);
                        if (substring != null) {
                            switch (substring.toLowerCase().hashCode()) {
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
                    }
                    if (z10 && (i11 > 1280 || i12 > 1280)) {
                        z10 = false;
                    }
                    if (tz.D0 && !z11 && "video/x-matroska".equals(document.mime_type)) {
                        z11 = true;
                    }
                    if (!z11 || z10) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder L(boolean z10) {
        String str;
        int i10;
        if (z10) {
            str = "✅";
        } else {
            str = "☑️";
        }
        if (z10) {
            i10 = 2131231551;
        } else {
            i10 = 2131231550;
        }
        return R5(i10, str);
    }

    public static boolean L2(TLRPC.Message message) {
        boolean z10;
        boolean C = o5.C(message.dialog_id);
        if ((!C || message.stickerVerified == 1) && o1(message) != null) {
            TLRPC.Document document = o1(message).document;
            if (C && !message.out) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (K2(document, z10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean L4(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return K4(a0(richMessage.blocks, richMessage));
        }
        if (o1(message) == null || !N4(o1(message).document)) {
            if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                return K4(o1(message).webpage.document);
            }
            if (o1(message) != null && K4(o1(message).document)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void L5(int i10, TLRPC.Message message) {
        boolean z10;
        boolean z11 = false;
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        message.unread = z10;
        if ((i10 & 2) == 0) {
            z11 = true;
        }
        message.media_unread = z11;
    }

    public static boolean M(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            char c10 = 0;
            while (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= '0' && charAt <= '9') {
                    i11++;
                    if (i11 >= 6) {
                        return true;
                    }
                    i12 = 0;
                    i13 = 0;
                } else if (charAt == ' ' || i11 <= 0) {
                    i11 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i10 != 0) {
                    if (i10 != 0) {
                        int i14 = i10 - 1;
                        if (charSequence.charAt(i14) != ' ') {
                            if (charSequence.charAt(i14) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i12 == 0) {
                            i12 = 1;
                        }
                        i12 = 0;
                    } else if (charAt == '/') {
                        if (i12 == 2) {
                            return true;
                        }
                        if (i12 == 1) {
                            i12++;
                        }
                        i12 = 0;
                    } else {
                        if (charAt == '.') {
                            if (i13 == 0 && c10 != ' ') {
                                i13++;
                            }
                        } else if (charAt != ' ' && c10 == '.' && i13 == 1) {
                            return true;
                        }
                        i13 = 0;
                    }
                    i10++;
                    c10 = charAt;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean M3(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z10 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i10 = documentAttribute.f19800w;
                    i11 = documentAttribute.h;
                }
            }
            if (z10 && i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean N2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean N4(TLRPC.Document document) {
        if (document != null && O4(document)) {
            return true;
        }
        return false;
    }

    public static boolean O2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean O3(TLRPC.Message message) {
        return message.out;
    }

    public static boolean O4(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean Q2(int i10, jj jjVar) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia n12 = n1(jjVar);
        if ((n12 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n12).todo) != null && todoList.list != null) {
            for (int i11 = 0; i11 < tL_messageMediaToDo.completions.size(); i11++) {
                if (tL_messageMediaToDo.completions.get(i11).f19939id == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Q4(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static boolean Q5(TLRPC.Message message) {
        int i10;
        if ((message == null || message.media == null || ((!Q4(G0(message)) && !j4(message)) || message.media.ttl_seconds != Integer.MAX_VALUE)) && !(o1(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            if (message instanceof TLRPC.TL_message_secret) {
                if (((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || L4(message)) && (i10 = message.ttl) > 0 && i10 <= 60) {
                    return true;
                }
                return false;
            } else if (((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (o1(message) instanceof TLRPC.TL_messageMediaDocument)) && o1(message).ttl_seconds != 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void R(Spanned spanned, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        Object[] objArr = (vh0[]) spanned.getSpans(0, spanned.length(), vh0.class);
        int i15 = 0;
        while (true) {
            int i16 = 1;
            if (i15 >= objArr.length) {
                break;
            }
            vh0 vh0Var = objArr[i15];
            vh0Var.f31258a.f32185b = false;
            int spanStart = spanned.getSpanStart(vh0Var);
            int spanEnd = spanned.getSpanEnd(objArr[i15]);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i13 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i13 = 0;
            }
            if (objArr[i15].f31258a.e) {
                i16 = 16;
            }
            hashMap.put(valueOf, Integer.valueOf(i13 | i16));
            treeSet.add(Integer.valueOf(spanEnd));
            Integer valueOf2 = Integer.valueOf(spanEnd);
            if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                i14 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
            } else {
                i14 = 0;
            }
            hashMap.put(valueOf2, Integer.valueOf(i14 | 2));
            i15++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i12) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        Object[] objArr2 = (di.i[]) spanned.getSpans(0, spanned.length(), di.i.class);
        for (int i17 = 0; i17 < objArr2.length; i17++) {
            int spanStart2 = spanned.getSpanStart(objArr2[i17]);
            int spanEnd2 = spanned.getSpanEnd(objArr2[i17]);
            treeSet.add(Integer.valueOf(spanStart2));
            Integer valueOf3 = Integer.valueOf(spanStart2);
            if (hashMap.containsKey(Integer.valueOf(spanStart2))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue();
            } else {
                i10 = 0;
            }
            hashMap.put(valueOf3, Integer.valueOf(i10 | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            Integer valueOf4 = Integer.valueOf(spanEnd2);
            if (hashMap.containsKey(Integer.valueOf(spanEnd2))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue();
            } else {
                i11 = 0;
            }
            hashMap.put(valueOf4, Integer.valueOf(i11 | 8));
        }
        Iterator it2 = treeSet.iterator();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z14 = false;
        int i21 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i20 != intValue3) {
                int i22 = intValue3 - 1;
                if (i22 >= 0 && i22 < spanned.length() && spanned.charAt(i22) == '\n') {
                    intValue3--;
                }
                int i23 = intValue3;
                if ((intValue4 & 8) != 0 && i19 < objArr2.length) {
                    str = objArr2[i19].f5965a;
                    i19++;
                } else {
                    str = null;
                }
                int i24 = i19;
                String str2 = str;
                if (i18 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i21 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                arrayList.add(new ij(i20, i23, z12, z13, z14, str2));
                i20 = i23 + 1;
                if (i20 >= spanned.length() || spanned.charAt(i23) != '\n') {
                    i20 = i23;
                }
                i19 = i24;
            }
            if ((intValue4 & 2) != 0) {
                i18--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i18++;
                if ((intValue4 & 16) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if ((intValue4 & 8) != 0) {
                i21--;
            }
            if ((intValue4 & 4) != 0) {
                i21++;
            }
        }
        if (i20 < spanned.length()) {
            int length = spanned.length();
            if (i18 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i21 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new ij(i20, length, z10, z11, z14, null));
        }
    }

    public static long R1(long j10, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j11 = peer2.chat_id;
            if (j11 != 0) {
                return -j11;
            }
            long j12 = peer2.channel_id;
            if (j12 != 0) {
                return -j12;
            }
            return peer2.user_id;
        } else if (message.from_id.user_id != j10) {
            return 0L;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                return o5.o(peer);
            }
            if ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) {
                return 2666000L;
            }
            return j10;
        }
    }

    public static boolean R4(TLRPC.Message message) {
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return Q4(o1(message).webpage.document);
        }
        if (o1(message) != null && Q4(o1(message).document)) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder R5(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(i10, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static int S(int i10) {
        if (f3(i10)) {
            return i10 & (-1879048193);
        }
        return i10;
    }

    public static boolean S3(TLRPC.Message message) {
        TLRPC.Photo photo;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            if (W(richMessage.blocks, richMessage) != null) {
                return true;
            }
            return false;
        } else if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            if ((o1(message).webpage.photo instanceof TLRPC.TL_photo) && !(o1(message).webpage.document instanceof TLRPC.TL_document)) {
                return true;
            }
            return false;
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction != null && (photo = messageAction.photo) != null) {
                return photo instanceof TLRPC.TL_photo;
            }
            return o1(message) instanceof TLRPC.TL_messageMediaPhoto;
        }
    }

    public static String T0(TLRPC.Message message) {
        TLRPC.PhotoSize w9;
        if (o1(message) instanceof TLRPC.TL_messageMediaDocument) {
            return b8.r(null, G0(message));
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = o1(message).photo.sizes;
            if (arrayList.size() > 0 && (w9 = b8.w(arrayList, i0.Z0(false), false, null, false)) != null) {
                return b8.r(null, w9);
            }
            return "";
        } else if ((o1(message) instanceof TLRPC.TL_messageMediaWebPage) && o1(message).webpage != null) {
            return b8.r(null, o1(message).webpage.document);
        } else {
            return "";
        }
    }

    public static String U(TLRPC.Document document) {
        return V(document, "😀", null);
    }

    public static String U0(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize w9;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return b8.r(null, messageMedia.document);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
            if (arrayList.size() > 0 && (w9 = b8.w(arrayList, i0.Z0(false), false, null, false)) != null) {
                return b8.r(null, w9);
            }
            return "";
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            return b8.r(null, webPage.document);
        } else {
            return "";
        }
    }

    public static boolean U3(TLRPC.StickerSetCovered stickerSetCovered) {
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!m3(arrayList.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean U4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String V(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet m0 = ui.b0(num.intValue()).m0(documentAttribute.stickerset, true);
                        StringBuilder sb2 = new StringBuilder("");
                        if (m0 != null && m0.packs != null) {
                            for (int i11 = 0; i11 < m0.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = m0.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.f19799id))) {
                                    sb2.append(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb2)) {
                            return sb2.toString();
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
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean V3(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                if (!m3(tL_messages_stickerSet.documents.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo W(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    long j10 = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
                    Typeface typeface = i0.f15999a;
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            TLRPC.Photo photo = arrayList2.get(i11);
                            if (photo != null && photo.f19817id == j10) {
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
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i10);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean W4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswer X(jj jjVar, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia n12 = n1(jjVar);
        if ((n12 instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12).poll) != null && poll.answers != null) {
            for (int i10 = 0; i10 < tL_messageMediaPoll.poll.answers.size(); i10++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i10);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    public static boolean X3(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i10 = 0; i10 < document.video_thumbs.size(); i10++) {
                if ("f".equals(document.video_thumbs.get(i10).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void X5(int i10, long j10, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i11, boolean z10, int i12) {
        int i13 = 0;
        while (i13 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i13).f19939id == i11) {
                tL_messageMediaToDo.completions.remove(i13);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i13--;
            }
            i13++;
        }
        if (z10) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.f19939id = i11;
            tL_todoCompletion.completed_by = vp.r1(i10).y1(j10);
            tL_todoCompletion.date = i12;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    public static int Y(int i10, String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i10 == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i10 < str.length() && str.startsWith(str2, i10)) {
            return i10;
        }
        int indexOf = str.indexOf(str2, i10);
        int lastIndexOf = str.lastIndexOf(str2, i10);
        if (indexOf != -1 && (lastIndexOf == -1 || indexOf - i10 < i10 - lastIndexOf)) {
            return indexOf;
        }
        return lastIndexOf;
    }

    public static CharSequence Y1(TLRPC.ChatReactions chatReactions) {
        String str;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return cd.L0(2131754291, null);
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o5(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                    str = spannableStringBuilder2;
                } else {
                    str = "";
                }
                spannableStringBuilder.append(k6.m(str, null, false, null, 0));
            }
            return spannableStringBuilder;
        }
        return cd.L0(2131748191, null);
    }

    public static TLRPC.TodoItem Z(int i10, jj jjVar) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia n12 = n1(jjVar);
        if ((n12 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n12).todo) != null && todoList.list != null) {
            for (int i11 = 0; i11 < tL_messageMediaToDo.todo.list.size(); i11++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i11);
                if (todoItem.f19940id == i10) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static void a(Spannable spannable, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        b(spannable, arrayList, z10, false, z11, z12, 0);
    }

    public static TLRPC.Document a0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return i0.Z(((TL_iv.pageBlockVideo) pageBlock).video_id, richMessage.documents);
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
        return C1(message.from_id);
    }

    public static long a2(int i10, TLRPC.Message message, int i11) {
        long c22 = c2(i10, message, v7.u7.a(i11, 1), v7.u7.a(i11, 4));
        if (c22 == 0 && v7.u7.a(i11, 8)) {
            return -1L;
        }
        return c22;
    }

    public static void a6(ArrayList arrayList, List list) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i10);
            if (photoSize != null) {
                int size2 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) list.get(i11);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    public static boolean b(java.lang.CharSequence r21, java.util.ArrayList r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.b(java.lang.CharSequence, java.util.ArrayList, boolean, boolean, boolean, boolean, int):boolean");
    }

    public static void b0(ArrayList arrayList, long j10) {
        if (arrayList != null && !arrayList.isEmpty() && j10 != 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                if (message instanceof TLRPC.TL_messageEmpty) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    message.peer_id = tL_peerChannel;
                    tL_peerChannel.channel_id = j10;
                }
            }
        }
    }

    public static long b2(int i10, TLRPC.Message message, boolean z10) {
        return c2(i10, message, z10, false);
    }

    public static boolean b4(TLRPC.Message message) {
        if (message != null) {
            if ((message.flags & 1073741824) != 0 || message.quick_reply_shortcut != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void b6(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
        TLRPC.Poll poll;
        ArrayList<TLRPC.PollAnswerVoters> arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        if (tL_messageMediaPoll != null && pollResults != null) {
            if ((pollResults.flags & 2) != 0) {
                if (pollResults.min && (arrayList3 = tL_messageMediaPoll.results.results) != null) {
                    int size = arrayList3.size();
                    arrayList2 = null;
                    bArr = null;
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i10);
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
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i11);
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    break;
                                } else if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i12))) {
                                    pollAnswerVoters2.chosen = true;
                                    arrayList2.remove(i12);
                                    break;
                                } else {
                                    i12++;
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
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
                pollResults3.flags = 2 | pollResults3.flags;
            } else if (!pollResults.min && (poll = tL_messageMediaPoll.poll) != null && poll.hide_results_until_close && ((arrayList = pollResults.results) == null || arrayList.isEmpty())) {
                tL_messageMediaPoll.results.results = new ArrayList<>();
                TLRPC.PollResults pollResults4 = tL_messageMediaPoll.results;
                pollResults4.flags = v7.u7.b(pollResults4.flags, 2, false);
            }
            if ((pollResults.flags & 4) != 0) {
                TLRPC.PollResults pollResults5 = tL_messageMediaPoll.results;
                pollResults5.total_voters = pollResults.total_voters;
                pollResults5.flags |= 4;
            }
            if ((pollResults.flags & 8) != 0) {
                TLRPC.PollResults pollResults6 = tL_messageMediaPoll.results;
                pollResults6.recent_voters = pollResults.recent_voters;
                pollResults6.flags |= 8;
            }
            if ((pollResults.flags & 16) != 0) {
                TLRPC.PollResults pollResults7 = tL_messageMediaPoll.results;
                pollResults7.solution = pollResults.solution;
                pollResults7.solution_entities = pollResults.solution_entities;
                pollResults7.flags |= 16;
            }
            if (!pollResults.min) {
                TLRPC.PollResults pollResults8 = tL_messageMediaPoll.results;
                pollResults8.has_unread_votes = pollResults.has_unread_votes;
                pollResults8.can_view_stats = pollResults.can_view_stats;
            }
        }
    }

    public static void c0(TL_iv.PageBlock pageBlock, int i10, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            int i11 = 0;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockKicker)) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    while (i11 < pageblockblockquoteblocks.blocks.size()) {
                        if (i11 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(pageblockblockquoteblocks.blocks.get(i11), i10, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i10) {
                            spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                        i11++;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    f0(((TL_iv.pageBlockDetails) pageBlock).title, i10, spannableStringBuilder, 0);
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                    f0(((TL_iv.pageBlockAuthorDate) pageBlock).author, i10, spannableStringBuilder, 0);
                    return;
                } else {
                    TLRPC.Document document = null;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        spannableStringBuilder.append((CharSequence) R5(2131231556, "fx")).append(" ").append((CharSequence) cd.L0(2131754864, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131748705, null));
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageCaption != null && !(pageCaption.text instanceof TL_iv.textEmpty)) {
                            spannableStringBuilder.append("  ");
                            f0(pageBlock.caption.text, i10, spannableStringBuilder, 0);
                            return;
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        f0(pageBlock.text, i10, spannableStringBuilder, 4);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                        for (int i12 = 0; i12 < pageblocklist.items.size(); i12++) {
                            if (i12 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i12);
                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                if (tL_pageListItemText.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListItemText.checked)).append(" ");
                                } else {
                                    spannableStringBuilder.append("• ");
                                }
                                f0(tL_pageListItemText.text, i10, spannableStringBuilder, 0);
                            } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                                if (tL_pageListItemBlocks.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListItemBlocks.checked)).append(" ");
                                } else {
                                    spannableStringBuilder.append("• ");
                                }
                                for (int i13 = 0; i13 < tL_pageListItemBlocks.blocks.size(); i13++) {
                                    if (i13 > 0) {
                                        spannableStringBuilder.append("  ");
                                    }
                                    c0(tL_pageListItemBlocks.blocks.get(i13), i10, spannableStringBuilder, richMessage);
                                    if (spannableStringBuilder.length() >= i10) {
                                        spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                                        spannableStringBuilder.append("…");
                                        return;
                                    }
                                }
                            }
                            if (spannableStringBuilder.length() >= i10) {
                                spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                                spannableStringBuilder.append("…");
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                        for (int i14 = 0; i14 < pageblockorderedlist.items.size(); i14++) {
                            if (i14 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i14);
                            if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                                spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemText.num);
                                spannableStringBuilder.append(". ");
                                if (tL_pageListOrderedItemText.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemText.checked)).append(" ");
                                }
                                f0(tL_pageListOrderedItemText.text, i10, spannableStringBuilder, 0);
                            } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                                spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                                spannableStringBuilder.append(". ");
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemBlocks.checked)).append(" ");
                                }
                                for (int i15 = 0; i15 < tL_pageListOrderedItemBlocks.blocks.size(); i15++) {
                                    if (i15 > 0) {
                                        spannableStringBuilder.append("  ");
                                    }
                                    c0(tL_pageListOrderedItemBlocks.blocks.get(i15), i10, spannableStringBuilder, richMessage);
                                    if (spannableStringBuilder.length() >= i10) {
                                        spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                                        spannableStringBuilder.append("…");
                                        return;
                                    }
                                }
                            }
                            if (spannableStringBuilder.length() >= i10) {
                                spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                                spannableStringBuilder.append("…");
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        spannableStringBuilder.append((CharSequence) R5(2131231578, "⊞")).append(" ");
                        TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            f0(richText, i10, spannableStringBuilder, 0);
                            return;
                        } else {
                            spannableStringBuilder.append((CharSequence) cd.L0(2131754855, null));
                            return;
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                        TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                        while (true) {
                            if (i11 >= richMessage.documents.size()) {
                                break;
                            } else if (richMessage.documents.get(i11).f19799id == pageblockaudio.audio_id) {
                                document = richMessage.documents.get(i11);
                                break;
                            } else {
                                i11++;
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) i0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes);
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) i0.V(TLRPC.TL_documentAttributeFilename.class, document.attributes);
                            if (tL_documentAttributeAudio != null) {
                                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                                    spannableStringBuilder.append((CharSequence) R5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                                    return;
                                } else if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                                    spannableStringBuilder.append((CharSequence) R5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                                    return;
                                } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                    spannableStringBuilder.append((CharSequence) R5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                spannableStringBuilder.append((CharSequence) R5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                        TLRPC.Document Z = i0.Z(((TL_iv.pageBlockDocument) pageBlock).document_id, richMessage.documents);
                        if (Z != null) {
                            String B = b8.B(Z);
                            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) R5(2131232134, "📎")).append(" ");
                            if (TextUtils.isEmpty(B)) {
                                B = cd.L0(2131753975, null);
                            }
                            append.append((CharSequence) B);
                            return;
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                        c0(((TL_iv.pageBlockCover) pageBlock).cover, i10, spannableStringBuilder, richMessage);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131753948, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131753933, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131754895, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131754856, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                        spannableStringBuilder.append((CharSequence) cd.L0(2131743858, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        for (int i16 = 0; i16 < pageblockbuttonrow.buttons.size(); i16++) {
                            if (i16 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            f0(pageblockbuttonrow.buttons.get(i16).text, i10, spannableStringBuilder, 0);
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            f0(pageBlock.text, i10, spannableStringBuilder, 0);
            return;
        }
        f0(pageBlock.text, i10, spannableStringBuilder, 1);
    }

    public static long c2(int i10, TLRPC.Message message, boolean z10, boolean z11) {
        int i11;
        long e = d20.i(i10).e();
        if (z11) {
            return v1(message);
        }
        if ((message.flags & 1073741824) != 0 && o5.o(message.peer_id) == e) {
            i11 = message.quick_reply_shortcut_id;
        } else if (!z10 && i10 >= 0 && o5.o(message.peer_id) == e) {
            return R1(e, message);
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i11 = message.f19814id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null && messageReplyHeader.forum_topic) {
                    if ((message instanceof TLRPC.TL_messageService) && !(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                        int i12 = messageReplyHeader.reply_to_msg_id;
                        if (i12 == 0) {
                            i12 = messageReplyHeader.reply_to_top_id;
                        }
                        return i12;
                    }
                    int i13 = messageReplyHeader.reply_to_top_id;
                    if (i13 == 0) {
                        i13 = messageReplyHeader.reply_to_msg_id;
                    }
                    return i13;
                } else if (z10) {
                    return 1L;
                } else {
                    return 0L;
                }
            }
        }
        return i11;
    }

    public static boolean c3(TLRPC.Message message) {
        if (message != null) {
            if (f3(message.f19814id) || message.ephemeralReceiverBotId != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void d(CharSequence charSequence, boolean z10) {
        e(z10, charSequence, true, false, false);
    }

    public static SpannableStringBuilder d0(TL_iv.RichMessage richMessage) {
        return e0(richMessage, 1024);
    }

    public static int d2(TLRPC.Message message) {
        int i10 = !message.unread ? 1 : 0;
        if (!message.media_unread) {
            return i10 | 2;
        }
        return i10;
    }

    public static boolean d5(TLRPC.Message message) {
        if (c3(message)) {
            if (message.ephemeralReceiverBotId == -1 || message.ephemeralAnchorMsgId != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void d6(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message != null && tL_messageReactions != null) {
            TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
            if (tL_messageReactions2 != null) {
                int size = tL_messageReactions2.results.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ReactionCount reactionCount = message.reactions.results.get(i10);
                    int size2 = tL_messageReactions.results.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i11);
                        if (sg.p0.g(reactionCount.reaction, reactionCount2.reaction)) {
                            if (!z10 && tL_messageReactions.min && reactionCount.chosen) {
                                reactionCount2.chosen = true;
                                z10 = true;
                            }
                            reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                        }
                    }
                    if (reactionCount.chosen) {
                        z10 = true;
                    }
                }
            }
            message.reactions = tL_messageReactions;
            message.flags |= 1048576;
        }
    }

    public static void e(boolean z10, CharSequence charSequence, boolean z11, boolean z12, boolean z13) {
        if ((charSequence instanceof Spannable) && M(charSequence)) {
            try {
                i0.c((Spannable) charSequence, 1, z13, false);
            } catch (Exception e) {
                f8.g(e, true);
            }
            h(z10, charSequence, z11, 0, 0, z12);
        }
    }

    public static SpannableStringBuilder e0(TL_iv.RichMessage richMessage, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            for (int i11 = 0; i11 < richMessage.blocks.size(); i11++) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i11);
                if (i11 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                c0(pageBlock, i10, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i10) {
                    spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static boolean e3(TLRPC.Message message) {
        if (c3(message) && !d5(message)) {
            return true;
        }
        return false;
    }

    public static void f0(TL_iv.RichText richText, int i10, SpannableStringBuilder spannableStringBuilder, int i11) {
        if (richText != null) {
            int length = spannableStringBuilder.length();
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
            } else if (richText instanceof TL_iv.textButton) {
                f0(richText.text, i10, spannableStringBuilder, i11);
            } else if (richText instanceof TL_iv.textBold) {
                f0(richText.text, i10, spannableStringBuilder, i11 | 1);
            } else if (richText instanceof TL_iv.textItalic) {
                f0(richText.text, i10, spannableStringBuilder, i11 | 2);
            } else if (richText instanceof TL_iv.textUnderline) {
                f0(richText.text, i10, spannableStringBuilder, i11 | 16);
            } else if (richText instanceof TL_iv.textStrike) {
                f0(richText.text, i10, spannableStringBuilder, i11 | 8);
            } else if (richText instanceof TL_iv.textFixed) {
                f0(richText.text, i10, spannableStringBuilder, i11 | 4);
            } else if (richText instanceof TL_iv.textSpoiler) {
                f0(richText.text, i10, spannableStringBuilder, i11 | 256);
            } else if (richText instanceof TL_iv.textUrl) {
                f0(richText.text, i10, spannableStringBuilder, i11);
                if (spannableStringBuilder.length() > length) {
                    ?? obj = new Object();
                    obj.f32850a = i11;
                    spannableStringBuilder.setSpan(new c51(richText.url, obj), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textEmail) {
                f0(richText.text, i10, spannableStringBuilder, i11);
                if (spannableStringBuilder.length() > length) {
                    ?? obj2 = new Object();
                    obj2.f32850a = i11;
                    spannableStringBuilder.setSpan(new g51("mailto:" + richText.email, obj2), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textMath) {
                spannableStringBuilder.append((CharSequence) R5(2131231556, "fx")).append(" ").append((CharSequence) cd.L0(2131754864, null));
            } else if (richText instanceof TL_iv.textPhone) {
                f0(richText.text, i10, spannableStringBuilder, i11);
                if (spannableStringBuilder.length() > length) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = af.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = sc.e.h("+", d);
                    }
                    ?? obj3 = new Object();
                    obj3.f32850a = i11;
                    spannableStringBuilder.setSpan(new e51(sc.e.h("tel:", d), (yz0) obj3), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i12);
                    i12++;
                    f0(richText2, i10, spannableStringBuilder, i11);
                    if (spannableStringBuilder.length() >= i10) {
                        spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                        spannableStringBuilder.append("…");
                        return;
                    }
                }
            }
            if (spannableStringBuilder.length() > length && i11 != 0) {
                ?? obj4 = new Object();
                obj4.f32850a = i11;
                spannableStringBuilder.setSpan(new zz0(obj4, 0), length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static String f2(TLObject tLObject, ArrayList arrayList, int i10) {
        String str;
        String K;
        long j10;
        String str2;
        long j11;
        String str3 = null;
        if (tLObject == null) {
            str2 = "";
            j11 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (user.deleted) {
                    str = cd.L0(2131749337, null);
                } else {
                    str = i5.m(0, user.first_name, user.last_name);
                }
                K = h20.n(user);
                j10 = user.f19942id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                K = w3.K(chat, false);
                j10 = -chat.f19793id;
            }
            str2 = str;
            str3 = K;
            j11 = j10;
        }
        if (i10 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j11;
            tL_messageEntityMentionName.offset = i10;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (i10 >= 0) {
                TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
                tL_messageEntityMentionName2.user_id = j11;
                tL_messageEntityMentionName2.offset = str2.length() + i10 + 2;
                tL_messageEntityMentionName2.length = str3.length() + 1;
                arrayList.add(tL_messageEntityMentionName2);
            }
            return String.format("%1$s (@%2$s)", str2, str3);
        }
        return str2;
    }

    public static boolean f3(int i10) {
        if ((i10 & 1879048192) == 1610612736) {
            return true;
        }
        return false;
    }

    public static CharSequence f6() {
        if (f16291m3 == null) {
            f16291m3 = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f16291m3;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231969, 0);
            dqVar.G = 0.9f;
            dqVar.f25508r = 0.0f;
            dqVar.f25509s = i0.L(1.0f);
            ((SpannableStringBuilder) f16291m3[0]).setSpan(dqVar, 0, 1, 33);
        }
        return f16291m3[0];
    }

    public static void g(int i10, TLRPC.MessageReactions messageReactions, int i11, long j10, boolean z10) {
        TLRPC.MessageReactor messageReactor = null;
        boolean z11 = false;
        TLRPC.ReactionCount reactionCount = null;
        for (int i12 = 0; i12 < messageReactions.results.size(); i12++) {
            if (messageReactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i12);
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= messageReactions.top_reactors.size()) {
                break;
            } else if (messageReactions.top_reactors.get(i13).my) {
                messageReactor = messageReactions.top_reactors.get(i13);
                break;
            } else {
                i13++;
            }
        }
        if (reactionCount == null && i11 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z10;
            int max = Math.max(0, reactionCount.count + i11);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i11 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i11);
            int i14 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
            if (i14 == 0) {
                z11 = true;
            }
            messageReactor.anonymous = z11;
            if (j10 != 0 && i14 != 0) {
                messageReactor.peer_id = vp.r1(i10).y1(j10);
            } else {
                messageReactor.peer_id = vp.r1(i10).y1(d20.i(i10).e());
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static int g1(TLRPC.BotInlineResult botInlineResult) {
        int k22 = (int) k2(botInlineResult.content);
        if (k22 == 0) {
            return (int) k2(botInlineResult.thumb);
        }
        return k22;
    }

    public static String g2(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                sb2.append("@");
                sb2.append((String) arrayList.get(i10));
                if (i10 < arrayList.size() - 1) {
                    sb2.append(", ");
                }
            }
            return sb2.toString();
        }
        return cd.L0(2131743687, null).toLowerCase();
    }

    public static StaticLayout g5(CharSequence charSequence, TextPaint textPaint, int i10, float f7, float f10, boolean z10, Layout.Alignment alignment) {
        int i11;
        if (i10 <= 0) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setLineSpacing(f10, f7).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
            if (z10) {
                alignment2.setIncludePad(false);
            }
            if (i12 >= 28) {
                alignment2.setUseLineSpacingFromFallbacks(false);
            }
            StaticLayout build = alignment2.build();
            for (int i13 = 0; i13 < build.getLineCount(); i13++) {
                if (build.getLineRight(i13) > i11) {
                    StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setLineSpacing(f10, f7).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
                    if (z10) {
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
        return new StaticLayout(charSequence, textPaint, i11, alignment, f7, f10, false);
    }

    public static void h(boolean r18, java.lang.CharSequence r19, boolean r20, int r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.h(boolean, java.lang.CharSequence, boolean, int, int, boolean):void");
    }

    public static Spannable h0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        org.telegram.ui.ActionBar.t6.P();
        TextPaint textPaint = org.telegram.ui.ActionBar.t6.f21200s2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(i0.o());
            textPaint.setTextSize(i0.L(Math.max(16, tz.W0) - 2));
        }
        return j0(tL_textWithEntities, z10, false, textPaint);
    }

    public static int[] h1(TLRPC.BotInlineResult botInlineResult) {
        int[] l22 = l2(botInlineResult.content);
        if (l22 == null) {
            int[] l23 = l2(botInlineResult.thumb);
            return l23 == null ? new int[]{0, 0} : l23;
        }
        return l22;
    }

    public static Spannable i0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, TextPaint textPaint) {
        return j0(tL_textWithEntities, z10, false, textPaint);
    }

    public static int i2(TLRPC.TL_document tL_document) {
        if (tL_document != null) {
            int size = tL_document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.f19800w;
                }
            }
        }
        return 0;
    }

    public static boolean i4(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i10 = documentAttribute.f19800w;
                    i11 = documentAttribute.h;
                    z10 = documentAttribute.round_message;
                }
            }
            if (z10 && i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static Spannable j0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, boolean z11, TextPaint textPaint) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
        b(spannableStringBuilder, tL_textWithEntities.entities, z10, false, z11, false, 0);
        return A5(k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
    }

    public static TLRPC.InputStickerSet j1(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
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

    public static boolean j4(TLRPC.Message message) {
        if ((o1(message) instanceof TLRPC.TL_messageMediaWebPage) && o1(message).webpage != null) {
            return i4(o1(message).webpage.document);
        }
        if (o1(message) != null && i4(o1(message).document)) {
            return true;
        }
        return false;
    }

    public static TLRPC.InputStickerSet k1(TLRPC.Message message) {
        TLRPC.Document G0 = G0(message);
        if (G0 != null) {
            return j1(G0);
        }
        return null;
    }

    public static double k2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] l2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.f19800w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.f19800w, documentAttribute.h};
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

    public static boolean m3(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static boolean m4(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if (((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || j4(message) || L4(message)) && o1(message).ttl_seconds != 0) {
                return true;
            }
            return false;
        } else if (message instanceof TLRPC.TL_message) {
            if (((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (o1(message) instanceof TLRPC.TL_messageMediaDocument)) && o1(message).ttl_seconds != 0) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public static TLRPC.MessageMedia n1(jj jjVar) {
        TLRPC.Message message;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            TLRPC.MessageMedia messageMedia = jjVar.Y0;
            if (messageMedia != null) {
                return messageMedia;
            }
            return o1(message);
        }
        return null;
    }

    public static CharSequence n2() {
        if (f16292n3 == null) {
            f16292n3 = new SpannableStringBuilder("g");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232159, 0);
            dqVar.H = 0.7f;
            dqVar.I = 0.7f;
            f16292n3.setSpan(dqVar, 0, 1, 33);
        }
        return f16292n3;
    }

    public static TLRPC.MessageMedia o1(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
        }
        return message.media;
    }

    public static boolean p(TLRPC.Document document) {
        if ((K2(document, true) || O4(document)) && sc.e(1)) {
            return true;
        }
        return false;
    }

    public static long q1(TLRPC.MessageMedia messageMedia) {
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

    public static void q5(TLRPC.Message message) {
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

    public static boolean r(int i10, boolean z10, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (message != null) {
            if (!w3.V(chat) || !(message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
                if (message.f19814id >= 0) {
                    if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
                        chat = vp.r1(i10).L0(Long.valueOf(message.peer_id.channel_id));
                    }
                    if (w3.T(chat)) {
                        if (z10 && !chat.megagroup) {
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
                            boolean z11 = message.out;
                            if (z11 && (message instanceof TLRPC.TL_messageService)) {
                                if (message.f19814id == 1 || !w3.y(13, chat)) {
                                    return false;
                                }
                            } else if (!z10) {
                                if (message.f19814id != 1) {
                                    if (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || (!tL_chatAdminRights.delete_messages && (!z11 || (!chat.megagroup && !tL_chatAdminRights.post_messages)))) && (!chat.megagroup || !z11))) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                        }
                    } else if (!z10 && !message.out && w3.T(chat)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean r3(b30 b30Var) {
        if (b30Var != null) {
            if (!b30Var.e.equals("image/gif")) {
                if ("video/mp4".equals(b30Var.e)) {
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < b30Var.f14717c.size(); i12++) {
                        TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) b30Var.f14717c.get(i12);
                        if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            i10 = documentAttribute.f19800w;
                            i11 = documentAttribute.h;
                        }
                    }
                    if (i10 <= 1280 && i11 <= 1280) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean s3(TLRPC.Document document, boolean z10) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((str.equals("image/gif") && !z10) || M3(document)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static CharSequence s5(int i10, long j10) {
        CharSequence n22;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                return i0.D2(h20.p(Z1));
            }
            return "";
        }
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
        if (L0 != null) {
            if (w3.V(L0)) {
                n22 = F();
            } else {
                n22 = n2();
            }
            return new SpannableStringBuilder(n22).append((CharSequence) " ").append((CharSequence) i0.D2(L0.title));
        }
        return "";
    }

    public static String t0(TLRPC.Document document, boolean z10) {
        String str;
        if (document != null && !"audio/ogg".equals(document.mime_type)) {
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (!documentAttribute.voice) {
                        String str2 = documentAttribute.performer;
                        String str3 = documentAttribute.title;
                        if (!TextUtils.isEmpty(str2)) {
                            for (int i11 = 0; i11 < 14; i11++) {
                                str2 = str2.replace(f16289k3[i11], " ");
                            }
                        }
                        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("athumb://itunes.apple.com/search?term=");
                                sb2.append(URLEncoder.encode(str2 + " - " + str3, "UTF-8"));
                                sb2.append("&entity=song&limit=4");
                                if (z10) {
                                    str = "&s=1";
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                return sb2.toString();
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
        boolean z10;
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return s3(o1(message).webpage.document, false);
        }
        if (o1(message) != null) {
            TLRPC.Document document = o1(message).document;
            if (message.grouped_id != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s3(document, z10)) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence t5(int i10, TLRPC.Peer peer, boolean z10) {
        TLRPC.Chat L0;
        CharSequence n22;
        CharSequence n23;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(peer.user_id));
            if (Z1 != null) {
                if (z10) {
                    return new SpannableStringBuilder(f6()).append((CharSequence) " ").append((CharSequence) h20.p(Z1));
                }
                return h20.p(Z1);
            }
            return "";
        } else if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat L02 = vp.r1(i10).L0(Long.valueOf(peer.chat_id));
            if (L02 != null) {
                if (z10) {
                    if (w3.V(L02)) {
                        n23 = F();
                    } else {
                        n23 = n2();
                    }
                    return new SpannableStringBuilder(n23).append((CharSequence) " ").append((CharSequence) L02.title);
                }
                return L02.title;
            }
            return "";
        } else if ((peer instanceof TLRPC.TL_peerChannel) && (L0 = vp.r1(i10).L0(Long.valueOf(peer.channel_id))) != null) {
            if (z10) {
                if (w3.V(L0)) {
                    n22 = F();
                } else {
                    n22 = n2();
                }
                return new SpannableStringBuilder(n22).append((CharSequence) " ").append((CharSequence) L0.title);
            }
            return L0.title;
        } else {
            return "";
        }
    }

    public static boolean u4(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker) {
                    if (!"image/webp".equals(document.mime_type) && !"video/webm".equals(document.mime_type)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u5(TLRPC.InputPeer inputPeer, TLRPC.InputPeer inputPeer2) {
        if (inputPeer == null && inputPeer2 == null) {
            return true;
        }
        if (inputPeer != null && inputPeer2 != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (inputPeer2 instanceof TLRPC.TL_inputPeerChat)) {
                if (inputPeer.chat_id == inputPeer2.chat_id) {
                    return true;
                }
                return false;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (inputPeer2 instanceof TLRPC.TL_inputPeerChannel)) {
                if (inputPeer.channel_id == inputPeer2.channel_id) {
                    return true;
                }
                return false;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (inputPeer2 instanceof TLRPC.TL_inputPeerUser)) {
                if (inputPeer.user_id == inputPeer2.user_id) {
                    return true;
                }
                return false;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerSelf) && (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) {
                return true;
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

    public static long v1(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j10 = peer.chat_id;
        if (j10 != 0) {
            return -j10;
        }
        long j11 = peer.channel_id;
        if (j11 != 0) {
            return -j11;
        }
        return peer.user_id;
    }

    public static boolean v4(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean v5(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null && peer2 == null) {
            return true;
        }
        if (peer != null && peer2 != null) {
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
            }
        }
        return false;
    }

    public static String w1(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    if (TextUtils.isEmpty(str)) {
                        return cd.L0(2131753900, null);
                    }
                    return str;
                }
            }
        }
        return cd.L0(2131753900, null);
    }

    public static boolean w4(TLRPC.Message message) {
        if (o1(message) != null && u4(o1(message).document)) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_textWithEntities x5(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i10 = 0; i10 < tL_textWithEntities.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i10);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    public static boolean y(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((W2(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) || (Build.VERSION.SDK_INT >= 26 && str.equalsIgnoreCase("image/heic"))) {
                for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        if (tL_documentAttributeImageSize.f19800w >= 6000 || tL_documentAttributeImageSize.h >= 6000) {
                            return false;
                        }
                        return true;
                    }
                }
            } else {
                boolean z10 = v2.f18448a;
            }
        }
        return false;
    }

    public static String y1(TLRPC.Document document) {
        if (document == null) {
            return cd.L0(2131753899, null);
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String B = b8.B(document);
                if (TextUtils.isEmpty(B)) {
                    return cd.L0(2131753899, null);
                }
                return B;
            }
        }
        String B2 = b8.B(document);
        if (!TextUtils.isEmpty(B2)) {
            return B2;
        }
        return cd.L0(2131753899, null);
    }

    public static Spannable y5(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        return A5(charSequence, arrayList, fontMetricsInt, false);
    }

    public static int z0(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        if (todoList == null || todoList.list == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < tL_messageMediaToDo.completions.size(); i11++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                } else if (tL_messageMediaToDo.todo.list.get(i12).f19940id == todoCompletion.f19939id) {
                    i10++;
                    break;
                } else {
                    i12++;
                }
            }
        }
        return i10;
    }

    public final long A0() {
        return B0(this.f16337k);
    }

    public final Long A1() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.f16337k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i10);
            i10++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(o5.o(peer));
                }
            }
        }
        return null;
    }

    public final boolean A2() {
        int i10;
        if (d1() != 0) {
            ArrayList arrayList = this.f16348n0;
            if ((arrayList != null && !arrayList.isEmpty()) || (i10 = this.D) == 3 || i10 == 1 || i10 == 14 || i10 == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A3() {
        TLRPC.WebPage webPage;
        String str = null;
        if (!this.E0 && (o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && (o1(this.f16337k).webpage instanceof TLRPC.TL_webPage)) {
            webPage = o1(this.f16337k).webpage;
        } else {
            webPage = null;
        }
        if (webPage != null) {
            str = webPage.type;
        }
        if (webPage == null || !TextUtils.isEmpty(webPage.description) || !TextUtils.isEmpty(webPage.title)) {
            if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A4() {
        if (this.f16321g) {
            return true;
        }
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.f16337k.peer_id;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat w02 = w0(null, null, j10);
                if (w02 == null) {
                    return false;
                }
                boolean z10 = w02.megagroup;
                this.h = Boolean.valueOf(z10);
                return z10;
            }
        }
        this.h = Boolean.FALSE;
        return false;
    }

    public final boolean B() {
        if (D2(true)) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (F0 != null && !(F0 instanceof TLRPC.TL_documentEncrypted)) {
            if (tz.C0) {
                return true;
            }
            for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (tz.D0 && "video/x-matroska".equals(F0.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public final int B1() {
        int i10;
        int L;
        int i11;
        if (this.f16365r1 && (i11 = this.f16301b2) > 0) {
            return i11;
        }
        if (i0.Q1()) {
            if (this.D == 36) {
                Point point = i0.f16026q;
                i10 = point.x;
                if (!i0.E) {
                    if (!i0.P1() || i10 > point.y) {
                        L = i0.l1(i10, 0, 0);
                    } else {
                        return i10;
                    }
                } else {
                    return i10;
                }
            } else {
                return i0.Q0();
            }
        } else {
            Point point2 = i0.f16026q;
            i10 = point2.x;
            if (i10 > point2.y) {
                L = i0.L(50.0f);
            } else {
                return i10;
            }
        }
        return i10 - L;
    }

    public final boolean B2() {
        jj jjVar;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.f16337k;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (jjVar = this.C) != null) {
            TLRPC.Message message2 = jjVar.f16337k;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B3(long j10) {
        TLRPC.MessageReplies messageReplies = this.f16337k.replies;
        if (messageReplies != null) {
            if (j10 == 0 || messageReplies.channel_id == j10) {
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
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return D((TLRPC.TL_messageMediaPoll) o12);
    }

    public final String C0() {
        if (!T2()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) o1(this.f16337k);
        if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
            return "🎲";
        }
        return tL_messageMediaDice.emoticon.replace("️", "");
    }

    public final boolean C2() {
        return D2(true);
    }

    public final boolean C3() {
        return o1(this.f16337k) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public final void C5(Spannable spannable, int[] iArr) {
        int length;
        boolean z10;
        CharSequence charSequence;
        if (c3.i0.t(spannable)) {
            Object[] objArr = (h6[]) spannable.getSpans(0, spannable.length(), h6.class);
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.o5.class);
            if (objArr != null) {
                int length2 = iArr[0] - objArr.length;
                if (o5VarArr == null) {
                    length = 0;
                } else {
                    length = o5VarArr.length;
                }
                if (length2 - length <= 0) {
                    for (int i10 = 0; i10 < objArr.length; i10++) {
                        String str = objArr[i10].d;
                        if (k6.b(str)) {
                            z10 = true;
                            charSequence = str.subSequence(0, str.length() - 2);
                        } else {
                            z10 = false;
                            charSequence = str;
                        }
                        TLRPC.Document T = ui.b0(this.I1).T(charSequence);
                        if (T != null) {
                            int spanStart = spannable.getSpanStart(objArr[i10]);
                            int spanEnd = spannable.getSpanEnd(objArr[i10]);
                            spannable.removeSpan(objArr[i10]);
                            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(T, objArr[i10].f15838a);
                            o5Var.standard = true;
                            o5Var.invert = z10;
                            spannable.setSpan(o5Var, spanStart, spanEnd, 33);
                        }
                    }
                }
            }
        }
    }

    public final int D0() {
        if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) o1(this.f16337k)).value;
        }
        return -1;
    }

    public final boolean D2(boolean z10) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        ArrayList X;
        if (this.Y2 == null) {
            try {
                TLRPC.Message message = this.f16337k;
                boolean z11 = false;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i10 = this.I1;
                    TLRPC.Message message2 = this.f16337k;
                    if (message2 != null) {
                        messageMedia2 = message2.media;
                    } else {
                        messageMedia2 = null;
                    }
                    int i11 = u61.f30830j0;
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                        X = new ArrayList();
                    } else {
                        X = u61.X(i10, messageMedia2.document, messageMedia2.alt_documents, 0, z10);
                    }
                    this.Z2 = X;
                    if (X.size() > 1) {
                        z11 = true;
                    }
                    this.Y2 = Boolean.valueOf(z11);
                    this.f16302b3 = u61.a0(this.Z2);
                    this.f16307c3 = u61.b0(this.Z2);
                    this.f16311d3 = u61.L(this.Z2);
                }
                this.Y2 = Boolean.FALSE;
                return false;
            } catch (Exception e) {
                f8.g(e, true);
                this.Y2 = Boolean.FALSE;
            }
        }
        return this.Y2.booleanValue();
    }

    public final boolean D3() {
        TLRPC.MessageMedia n12 = n1(this);
        if (n12 != null && n12.live_photo) {
            return true;
        }
        return false;
    }

    public final boolean D4() {
        if (this.D == 17 && (o1(this.f16337k) instanceof TLRPC.TL_messageMediaToDo)) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        int i10;
        if (this.f16337k.action == null) {
            if (!x2()) {
                jj jjVar = this.C;
                if (jjVar == null || jjVar.f16337k.replies == null) {
                    TLRPC.MessageReplyHeader messageReplyHeader = this.f16337k.reply_to;
                    if (messageReplyHeader != null) {
                        i10 = messageReplyHeader.reply_to_top_id;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
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

    public final org.telegram.tgnet.tl.TL_iv.RichMessage E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.E0():org.telegram.tgnet.tl.TL_iv$RichMessage");
    }

    public final long E1() {
        if (this.D != 17) {
            return 0L;
        }
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll)) {
            return 0L;
        }
        return ((TLRPC.TL_messageMediaPoll) o12).poll.f19819id;
    }

    public final boolean E2() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return U4((TLRPC.TL_messageMediaPoll) o12);
    }

    public final CharSequence E5(String str, ArrayList arrayList, AbstractMap abstractMap, a0.h hVar) {
        TLRPC.User user;
        int i10;
        if (TextUtils.indexOf(str, "un2") < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (abstractMap != null) {
                user = (TLRPC.User) abstractMap.get(arrayList.get(i11));
            } else if (hVar != null) {
                user = (TLRPC.User) hVar.f(((Long) arrayList.get(i11)).longValue());
            } else {
                user = null;
            }
            if (user == null) {
                user = vp.r1(this.I1).Z1((Long) arrayList.get(i11));
            }
            if (user != null) {
                String p5 = h20.p(user);
                int length = spannableStringBuilder.length();
                if (spannableStringBuilder.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) p5);
                StringBuilder sb2 = new StringBuilder("");
                i10 = i11;
                sb2.append(user.f19942id);
                spannableStringBuilder.setSpan(new f51(sb2.toString()), length, p5.length() + length, 33);
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        return TextUtils.replace(str, new String[]{"un2"}, new CharSequence[]{spannableStringBuilder});
    }

    public final TLRPC.Document F0() {
        t61 t61Var;
        TLRPC.Document document = this.f16347n;
        if (document != null) {
            return document;
        }
        if (D2(true) && (t61Var = this.f16302b3) != null) {
            return t61Var.f30460g;
        }
        return G0(this.f16337k);
    }

    public final boolean F2() {
        if (G2() && H2(F0())) {
            return true;
        }
        return false;
    }

    public final boolean F3() {
        return G3(this.f16337k, true);
    }

    public final boolean F4() {
        TLRPC.Message message = this.f16337k;
        if (message != null && message.unread) {
            return true;
        }
        return false;
    }

    public final void F5() {
        this.f16299b0 = 0.0f;
        this.f16322g0 = 0;
        this.f16312e0 = 0.0f;
    }

    public final void G() {
        org.telegram.ui.Components.o5[] o5VarArr;
        int i10;
        this.f16347n = null;
        this.f16351o = null;
        if (this.N1 == 1 && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaInvoice) && ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaEmpty) || o1(this.f16337k) == null)) {
            TLRPC.Message message = this.f16337k;
            if (message.grouped_id == 0) {
                boolean isEmpty = message.entities.isEmpty();
                int i11 = this.I1;
                if (isEmpty) {
                    String str = this.v;
                    int indexOf = TextUtils.indexOf(str, "🏻");
                    if (indexOf >= 0) {
                        this.f16375u = "_c1";
                        str = str.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(str, "🏼");
                        if (indexOf >= 0) {
                            this.f16375u = "_c2";
                            str = str.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(str, "🏽");
                            if (indexOf >= 0) {
                                this.f16375u = "_c3";
                                str = str.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(str, "🏾");
                                if (indexOf >= 0) {
                                    this.f16375u = "_c4";
                                    str = str.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(str, "🏿");
                                    if (indexOf >= 0) {
                                        this.f16375u = "_c5";
                                        str = str.subSequence(0, indexOf);
                                    } else {
                                        this.f16375u = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.f16375u) && (i10 = indexOf + 2) < this.v.length()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str.toString());
                        CharSequence charSequence = this.v;
                        sb2.append(charSequence.subSequence(i10, charSequence.length()).toString());
                        str = sb2.toString();
                    }
                    if (TextUtils.isEmpty(this.f16375u) || l6.f16702l.contains(str.toString())) {
                        this.f16347n = ui.b0(i11).T(str);
                    }
                } else if (this.f16337k.entities.size() == 1 && (this.f16337k.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.f16337k.entities.get(0)).document_id);
                        this.f16351o = valueOf;
                        TLRPC.Document e = org.telegram.ui.Components.f5.e(i11, valueOf.longValue());
                        this.f16347n = e;
                        if (e == null) {
                            CharSequence charSequence2 = this.v;
                            if ((charSequence2 instanceof Spanned) && (o5VarArr = (org.telegram.ui.Components.o5[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), org.telegram.ui.Components.o5.class)) != null && o5VarArr.length == 1) {
                                this.f16347n = o5VarArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.f16347n == null && this.f16351o == null) {
            n0(null);
        } else if (t4()) {
            this.D = 13;
        } else if (J2()) {
            this.D = 15;
        } else {
            this.D = 1000;
        }
    }

    public final boolean G2() {
        if (this.f16347n == null && this.f16351o == null) {
            return false;
        }
        return true;
    }

    public final boolean G4() {
        return o1(this.f16337k) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public final boolean G5(sg.o0 o0Var, boolean z10) {
        int i10;
        TLRPC.Peer tL_peerUser;
        TLRPC.Peer tL_peerUser2;
        int i11;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        boolean z12;
        TLRPC.Message message = this.f16337k;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i12 = this.I1;
        if (tL_messageReactions2 == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.f16337k;
            TLRPC.TL_messageReactions tL_messageReactions3 = message2.reactions;
            if (B0(message2) == d20.i(i12).e()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messageReactions3.reactions_as_tags = z11;
            TLRPC.TL_messageReactions tL_messageReactions4 = this.f16337k.reactions;
            if (!o3() && !p3()) {
                z12 = false;
            } else {
                z12 = true;
            }
            tL_messageReactions4.can_see_list = z12;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f16337k.reactions.results.size(); i14++) {
            TLRPC.ReactionCount reactionCount2 = this.f16337k.reactions.results.get(i14);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i15 = reactionCount2.chosen_order;
                if (i15 > i13) {
                    i13 = i15;
                }
            }
            TLRPC.Reaction reaction = this.f16337k.reactions.results.get(i14).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = o0Var.f48434f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.f16337k.reactions.results.get(i14);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = o0Var.f48435g;
                if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
                    reactionCount = this.f16337k.reactions.results.get(i14);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z10) {
            return true;
        }
        vp r12 = vp.r1(i12);
        if (r12.getUserConfig().q()) {
            i10 = r12.f18748b5;
        } else {
            i10 = r12.f18738a5;
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i16 = reactionCount.count - 1;
                reactionCount.count = i16;
                if (i16 <= 0) {
                    this.f16337k.reactions.results.remove(reactionCount);
                }
            }
            if (this.f16337k.reactions.can_see_list) {
                int i17 = 0;
                while (i17 < this.f16337k.reactions.recent_reactions.size()) {
                    if (C1(this.f16337k.reactions.recent_reactions.get(i17).peer_id) == d20.i(i12).e() && sg.q0.d(this.f16337k.reactions.recent_reactions.get(i17).reaction, o0Var)) {
                        this.f16337k.reactions.recent_reactions.remove(i17);
                        i17--;
                    }
                    i17++;
                }
            }
            this.H = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= i10) {
            int i18 = 0;
            for (int i19 = 1; i19 < arrayList.size(); i19++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i19)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i19)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i18)).chosen_order) {
                    i18 = i19;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i18);
            reactionCount3.chosen = false;
            int i20 = reactionCount3.count - 1;
            reactionCount3.count = i20;
            if (i20 <= 0) {
                this.f16337k.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.f16337k.reactions.can_see_list) {
                int i21 = 0;
                while (i21 < this.f16337k.reactions.recent_reactions.size()) {
                    if (C1(this.f16337k.reactions.recent_reactions.get(i21).peer_id) == d20.i(i12).e() && sg.q0.d(this.f16337k.reactions.recent_reactions.get(i21).reaction, o0Var)) {
                        this.f16337k.reactions.recent_reactions.remove(i21);
                        i21--;
                    }
                    i21++;
                }
            }
        }
        if (reactionCount == null) {
            int N0 = vp.r1(i12).N0(B0(this.f16337k));
            TLRPC.Message message3 = this.f16337k;
            if (message3 != null && (tL_messageReactions = message3.reactions) != null) {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i11 = 0;
                int i22 = 0;
                while (i22 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i22);
                    i22++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i11++;
                    }
                }
            } else {
                i11 = 0;
            }
            if (i11 + 1 > N0) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = o0Var.g();
            this.f16337k.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i13 + 1;
        TLRPC.Message message4 = this.f16337k;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && i10 > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.f16337k;
            if (message5.isThreadMessage && message5.fwd_from != null) {
                vp r13 = vp.r1(i12);
                TLRPC.ChatFull M0 = r13.M0(-Z0());
                if (M0 == null || (tL_peerUser2 = M0.default_send_as) == null) {
                    tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_peerUser2.user_id = d20.i(r13.getAccountInstance().f14863a).f15165n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser2;
            } else {
                vp r14 = vp.r1(i12);
                TLRPC.ChatFull M02 = r14.M0(-B0(this.f16337k));
                if (M02 == null || (tL_peerUser = M02.default_send_as) == null) {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = d20.i(r14.getAccountInstance().f14863a).f15165n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser;
            }
            this.f16337k.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (o0Var.f48434f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = o0Var.f48434f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = o0Var.f48435g;
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
        boolean z10;
        boolean z11;
        TextPaint textPaint;
        if (iArr == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(iArr[0]);
        }
        int i10 = -1;
        if (valueOf != null && valueOf.intValue() >= 1 && this.f16337k != null && !u2()) {
            CharSequence charSequence = this.v;
            h6[] h6VarArr = (h6[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), h6.class);
            CharSequence charSequence2 = this.v;
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), org.telegram.ui.Components.o5.class);
            int intValue = valueOf.intValue();
            if (h6VarArr == null) {
                length = 0;
            } else {
                length = h6VarArr.length;
            }
            if (o5VarArr == null) {
                length2 = 0;
            } else {
                length2 = o5VarArr.length;
            }
            this.N1 = Math.max(intValue, length + length2);
            if (o5VarArr == null) {
                length3 = 0;
            } else {
                length3 = o5VarArr.length;
            }
            this.P1 = length3;
            this.O1 = 0;
            if (o5VarArr != null) {
                for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                    if (!o5Var.standard) {
                        this.O1++;
                    }
                }
            }
            int i11 = this.N1;
            if (h6VarArr == null) {
                length4 = 0;
            } else {
                length4 = h6VarArr.length;
            }
            int i12 = i11 - length4;
            if (o5VarArr == null) {
                length5 = 0;
            } else {
                length5 = o5VarArr.length;
            }
            if (i12 - length5 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M1 = z10;
            if (i11 != 0 && !z10) {
                int i13 = this.O1;
                if (i11 == i13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = 2;
                switch (Math.max(i11, i13)) {
                    case 0:
                    case 1:
                    case 2:
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.t6.f21308y2;
                        if (z11) {
                            textPaint = textPaintArr[0];
                        } else {
                            textPaint = textPaintArr[2];
                        }
                        i14 = 1;
                        break;
                    case 3:
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.t6.f21308y2;
                        if (z11) {
                            textPaint = textPaintArr2[1];
                        } else {
                            textPaint = textPaintArr2[3];
                        }
                        i14 = 1;
                        break;
                    case 4:
                        TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.t6.f21308y2;
                        if (z11) {
                            textPaint = textPaintArr3[2];
                        } else {
                            textPaint = textPaintArr3[4];
                        }
                        i14 = 1;
                        break;
                    case 5:
                        TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.t6.f21308y2;
                        if (z11) {
                            textPaint = textPaintArr4[3];
                            break;
                        } else {
                            textPaint = textPaintArr4[5];
                            break;
                        }
                    case 6:
                        TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.t6.f21308y2;
                        if (z11) {
                            textPaint = textPaintArr5[4];
                            break;
                        } else {
                            textPaint = textPaintArr5[5];
                            break;
                        }
                    default:
                        if (this.N1 > 9) {
                            i10 = 0;
                        }
                        textPaint = org.telegram.ui.ActionBar.t6.f21308y2[5];
                        i14 = i10;
                        break;
                }
                int textSize = (int) (textPaint.getTextSize() + i0.L(4.0f));
                if (h6VarArr != null && h6VarArr.length > 0) {
                    for (h6 h6Var : h6VarArr) {
                        h6Var.f15838a = textPaint.getFontMetricsInt();
                        h6Var.f15840c = textSize;
                    }
                }
                if (o5VarArr != null && o5VarArr.length > 0) {
                    for (int i15 = 0; i15 < o5VarArr.length; i15++) {
                        o5VarArr[i15].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i14);
                        o5VarArr[i15].full = true;
                    }
                    return;
                }
                return;
            } else if (o5VarArr != null && o5VarArr.length > 0) {
                for (int i16 = 0; i16 < o5VarArr.length; i16++) {
                    o5VarArr[i16].replaceFontMetrics(org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.t6.f21130o2.getTextSize() + i0.L(4.0f)), -1);
                    o5VarArr[i16].full = false;
                }
                return;
            } else {
                return;
            }
        }
        CharSequence charSequence3 = this.v;
        org.telegram.ui.Components.o5[] o5VarArr2 = (org.telegram.ui.Components.o5[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.o5.class);
        if (o5VarArr2 != null && o5VarArr2.length > 0) {
            this.P1 = o5VarArr2.length;
            for (int i17 = 0; i17 < o5VarArr2.length; i17++) {
                o5VarArr2[i17].replaceFontMetrics(org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.t6.f21130o2.getTextSize() + i0.L(4.0f)), -1);
                o5VarArr2[i17].full = false;
            }
            return;
        }
        this.P1 = 0;
    }

    public float H1() {
        return 0.0f;
    }

    public final boolean H3() {
        TLRPC.Message message = this.f16337k;
        if (message != null && o1(message) != null && !(o1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return false;
        }
        return true;
    }

    public final boolean H4() {
        return L4(this.f16337k);
    }

    public final void H5() {
        this.f16337k.unread = false;
    }

    public final boolean I() {
        CharSequence charSequence;
        TLRPC.User user;
        TextPaint textPaint;
        int[] iArr;
        int B1;
        float f7;
        int L;
        int i10 = this.D;
        if ((i10 == 0 || i10 == 19 || i10 == 36) && this.f16337k.peer_id != null && (charSequence = this.v) != null && (charSequence.length() != 0 || this.W1)) {
            if (this.Q1) {
                if (i0.Q1() && this.T != 0) {
                    B1 = i0.L(530.0f);
                } else {
                    B1 = B1();
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.f21130o2;
                if (textPaint2 != null) {
                    f7 = textPaint2.getTextSize();
                } else {
                    f7 = 0.0f;
                }
                if (this.D == 36) {
                    L = 0;
                } else {
                    L = i0.L(52.0f);
                }
                if (Math.abs(this.R1 - B1) > L || this.S1 != i0.f16025p || this.U1 != f7 || this.T1 != P2()) {
                    this.Q1 = false;
                }
            }
            if (!this.Q1) {
                this.Q1 = true;
                if (p3()) {
                    user = vp.r1(this.I1).Z1(Long.valueOf(this.f16337k.from_id.user_id));
                } else {
                    user = null;
                }
                if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame) {
                    textPaint = org.telegram.ui.ActionBar.t6.f21291x2;
                } else {
                    textPaint = org.telegram.ui.ActionBar.t6.f21130o2;
                }
                if (i()) {
                    iArr = new int[1];
                } else {
                    iArr = null;
                }
                CharSequence m10 = k6.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
                this.v = m10;
                Spannable z52 = z5(m10, textPaint.getFontMetricsInt());
                this.v = z52;
                if (iArr != null && iArr[0] > 1) {
                    C5(z52, iArr);
                }
                H(iArr);
                G();
                K5();
                n0(user);
                if (this.f16394z != null) {
                    this.f16394z = null;
                    k0();
                }
                return true;
            }
        }
        return false;
    }

    public final String I0() {
        return b8.B(F0());
    }

    public final boolean I2() {
        if (this.D == 19) {
            return true;
        }
        return false;
    }

    public final boolean I3() {
        if (K3(this.f16337k) && !L4(this.f16337k) && !h4()) {
            return true;
        }
        return false;
    }

    public final boolean I4() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.f16337k.action;
        if (messageAction != null && (photo = messageAction.photo) != null && !photo.video_sizes.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void I5(long j10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z10;
        TLRPC.Message message = this.f16337k;
        if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.MessageReactor messageReactor = arrayList.get(i10);
                i10++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (j10 == 2666000) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageReactor2.anonymous = z10;
                    if (z10) {
                        messageReactor2.flags &= -9;
                        messageReactor2.peer_id = null;
                    } else {
                        messageReactor2.flags |= 8;
                        messageReactor2.peer_id = vp.r1(this.I1).y1(j10);
                    }
                }
            }
        }
    }

    public final void J() {
        K(true);
    }

    public final boolean J2() {
        int i10 = this.D;
        boolean z10 = false;
        if (i10 != 1000) {
            if (i10 != 15) {
                return false;
            }
            return true;
        }
        boolean C = o5.C(B0(this.f16337k));
        if (C && this.f16337k.stickerVerified != 1) {
            return false;
        }
        if (this.f16351o != null && this.f16347n == null) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (this.f16347n != null || !C || N3()) {
            z10 = true;
        }
        return K2(F0, z10);
    }

    public final boolean J4() {
        TLRPC.MessageAction messageAction = this.f16337k.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionPhoneCall) || !messageAction.video) {
            if ((messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void J5(String str, boolean z10) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.Y1 = null;
            this.a2 = null;
            this.Z1 = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.f16337k.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.f16337k.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                o2(arrayList, split, true, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.f16337k.message)) {
            String lowerCase3 = this.f16337k.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                o2(arrayList, split, false, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (F0() != null) {
            String lowerCase4 = b8.B(F0()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && (o1(this.f16337k).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = o1(this.f16337k).webpage;
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
        String x12 = x1(true);
        if (x12 != null) {
            String lowerCase6 = x12.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (!arrayList.contains(arrayList2.get(i10)) && (indexOf = (str2 = (String) arrayList2.get(i10)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i11 = 0;
                        for (int i12 = 0; i12 < min && str2.charAt(i12) == str4.charAt(i12); i12++) {
                            i11++;
                        }
                        if (i11 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i10));
                        }
                    }
                }
            }
        }
        o2(arrayList, split, false, z10);
    }

    public final void K(boolean z10) {
        int i10;
        boolean z11;
        this.f16383w0 = false;
        this.f16387x0 = false;
        int i11 = this.D;
        int i12 = this.I1;
        if (i11 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.f16337k.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                b8.G(i12);
                File K = b8.K(tL_messageExtendedMediaPreview.thumb, null, z10, true);
                if (!this.f16387x0) {
                    if (!K.exists() && !(tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    this.f16387x0 = z11;
                }
            }
        } else if (i11 == 1 && b8.w(this.f16348n0, i0.Z0(true), false, null, false) != null) {
            b8.G(i12);
            File N = b8.N(this.f16337k, false, z10);
            if (m5()) {
                this.f16387x0 = new File(N.getAbsolutePath() + ".enc").exists();
            }
            if (!this.f16387x0) {
                this.f16387x0 = N.exists();
            }
        }
        if ((!this.f16387x0 && this.D == 8) || (i10 = this.D) == 3 || i10 == 9 || i10 == 2 || i10 == 14 || i10 == 5) {
            String str = this.f16337k.attachPath;
            if (str != null && str.length() > 0) {
                this.f16383w0 = new File(this.f16337k.attachPath).exists();
            }
            if (!this.f16383w0) {
                b8.G(i12);
                File N2 = b8.N(this.f16337k, false, z10);
                if ((this.D == 3 && m5()) || S4() || g4()) {
                    this.f16387x0 = new File(N2.getAbsolutePath() + ".enc").exists();
                }
                if (!this.f16387x0) {
                    this.f16387x0 = N2.exists();
                }
            }
        }
        if (!this.f16387x0) {
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                if ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && o1(this.f16337k).webpage != null && "telegram_background".equals(o1(this.f16337k).webpage.type)) {
                    b8.G(i12);
                    this.f16387x0 = b8.K(F0, null, true, z10).exists();
                } else {
                    b8.G(i12);
                    this.f16387x0 = b8.K(F0, null, false, z10).exists();
                }
            } else {
                int i13 = this.D;
                if (i13 == 0) {
                    TLRPC.PhotoSize w9 = b8.w(this.f16348n0, i0.Z0(false), false, null, false);
                    if (w9 != null) {
                        b8.G(i12);
                        this.f16387x0 = b8.K(w9, null, true, z10).exists();
                    } else {
                        return;
                    }
                } else if (i13 == 11) {
                    TLRPC.Photo photo = this.f16337k.action.photo;
                    if (photo != null && !photo.video_sizes.isEmpty()) {
                        b8.G(i12);
                        this.f16387x0 = b8.K(photo.video_sizes.get(0), null, true, z10).exists();
                    } else {
                        return;
                    }
                }
            }
        }
        c6(z10);
    }

    public final void K5() {
        int i10;
        int i11;
        int i12 = this.D;
        this.D = 1000;
        this.S = 0;
        boolean r42 = r4();
        int i13 = this.I1;
        if (r42) {
            this.D = 0;
        } else {
            int i14 = 1;
            if (this.f16318f1) {
                this.U = 0;
                this.D = 27;
                this.f16323g1 = vp.r1(i13).f7.getBoolean("c" + B0(this.f16337k) + "_rec", true);
            } else {
                TLRPC.Message message = this.f16337k;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.J1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.U = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.f19947id == 0 && wallPaper.settings == null) {
                                this.D = 10;
                            } else {
                                this.D = 22;
                                ArrayList arrayList = new ArrayList();
                                this.f16348n0 = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.f16342l0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
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
                                this.f16348n0 = arrayList2;
                                TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                if (document2 != null) {
                                    arrayList2.addAll(document2.thumbs);
                                    this.f16342l0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                this.U = 1;
                                this.D = 21;
                                ArrayList arrayList3 = new ArrayList();
                                this.f16348n0 = arrayList3;
                                arrayList3.addAll(this.f16337k.action.photo.sizes);
                                this.f16342l0 = this.f16337k.action.photo;
                            } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                this.D = 0;
                            } else {
                                boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftCode;
                                if (z10 && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                                    this.U = 1;
                                    this.D = 25;
                                } else if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium) && !z10) {
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
                                                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                    this.D = 33;
                                                    this.U = 1;
                                                } else if ((messageAction instanceof TLRPC.TL_messageActionChangeCommunity) && ((TLRPC.TL_messageActionChangeCommunity) messageAction).community_id != 0) {
                                                    this.D = 37;
                                                    this.U = 1;
                                                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                    this.D = 34;
                                                    this.U = 1;
                                                } else if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                                    this.D = 32;
                                                    this.U = 1;
                                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                    this.D = 35;
                                                    this.U = 1;
                                                } else {
                                                    this.U = 1;
                                                    this.D = 10;
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
                } else if (o1(message) instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.U = 10;
                    this.D = 38;
                } else if (this.E0) {
                    this.D = 0;
                } else {
                    TLRPC.Message message2 = this.f16337k;
                    if (message2.rich_message == null && !(o1(message2) instanceof TLRPC.TL_messageMediaWidget)) {
                        if (this.f16347n == null && this.f16351o == null) {
                            TLRPC.Message message3 = this.f16337k;
                            if (message3.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                                this.D = 29;
                            } else if (G3(message3, false) && !T2() && !r4() && this.N1 >= 1 && !this.M1 && this.f16337k != null && !u2()) {
                                this.D = 19;
                            } else if (F3()) {
                                this.D = 0;
                                if (TextUtils.isEmpty(this.v) && this.T == 0) {
                                    this.v = "";
                                }
                            } else if (r2()) {
                                this.D = 20;
                            } else if (o1(this.f16337k).ttl_seconds != 0 && ((o1(this.f16337k).photo instanceof TLRPC.TL_photoEmpty) || (F0() instanceof TLRPC.TL_documentEmpty) || (((o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument) && F0() == null) || this.G0))) {
                                this.U = 1;
                                this.D = 10;
                            } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGiveaway) {
                                this.D = 26;
                            } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                this.D = 28;
                            } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDice) {
                                this.D = 15;
                                if (o1(this.f16337k).document == null) {
                                    o1(this.f16337k).document = new TLRPC.TL_document();
                                    o1(this.f16337k).document.file_reference = new byte[0];
                                    o1(this.f16337k).document.mime_type = "application/x-tgsdice";
                                    o1(this.f16337k).document.dc_id = Integer.MIN_VALUE;
                                    o1(this.f16337k).document.f19799id = -2147483648L;
                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                    tL_documentAttributeImageSize.f19800w = 512;
                                    tL_documentAttributeImageSize.h = 512;
                                    o1(this.f16337k).document.attributes.add(tL_documentAttributeImageSize);
                                }
                            } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) {
                                if (L4(this.f16337k)) {
                                    i14 = 3;
                                }
                                this.D = i14;
                            } else if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaGeo) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaVenue) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                                if (h4()) {
                                    this.D = 5;
                                } else if (L4(this.f16337k)) {
                                    this.D = 3;
                                } else if (R4(this.f16337k)) {
                                    this.D = 2;
                                } else if (I3()) {
                                    this.D = 14;
                                } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaContact) {
                                    this.D = 12;
                                } else if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaPoll) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaToDo)) {
                                    if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaUnsupported) {
                                        this.D = 0;
                                    } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument) {
                                        TLRPC.Document F0 = F0();
                                        if (F0 != null && F0.mime_type != null) {
                                            if (s3(F0, z2())) {
                                                this.D = 8;
                                            } else if (t4()) {
                                                this.D = 13;
                                            } else if (J2()) {
                                                this.D = 15;
                                            } else {
                                                this.D = 9;
                                            }
                                        } else {
                                            this.D = 9;
                                        }
                                    } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame) {
                                        this.D = 0;
                                    } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaInvoice) {
                                        this.D = 0;
                                    } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaStory) {
                                        if (o1(this.f16337k).via_mention) {
                                            i10 = 24;
                                        } else {
                                            i10 = 23;
                                        }
                                        this.D = i10;
                                        if (i10 == 24) {
                                            this.U = 1;
                                        }
                                    }
                                } else {
                                    this.D = 17;
                                    this.f16380v1 = new ArrayList();
                                }
                            } else {
                                this.D = 4;
                            }
                        } else if (t4()) {
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
        if (i12 != 1000 && i12 != (i11 = this.D) && i11 != 19) {
            Z5(vp.r1(i13).d, vp.r1(i13).f18742b, null, null);
            r0(false);
        }
    }

    public final double L0() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.f16330i0;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document F0 = F0();
        if (F0 == null && this.D == 23 && (storyItem = o1(this.f16337k).storyItem) != null && (messageMedia = storyItem.media) != null) {
            F0 = messageMedia.document;
        }
        if (F0 == null) {
            return 0.0d;
        }
        int i10 = this.f16326h0;
        if (i10 > 0) {
            return i10;
        }
        for (int i11 = 0; i11 < F0.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d10 = documentAttribute.duration;
                this.f16330i0 = d10;
                return d10;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d11 = documentAttribute.duration;
                this.f16330i0 = d11;
                return d11;
            }
        }
        return this.f16326h0;
    }

    public final TLRPC.MessagePeerReaction L1() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.f16337k.reactions;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.recent_reactions) != null && !arrayList.isEmpty()) {
            return this.f16337k.reactions.recent_reactions.get(0);
        }
        return null;
    }

    public final boolean L3() {
        if (o1(this.f16337k) != null && M3(F0())) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_availableEffect M0() {
        TLRPC.Message message = this.f16337k;
        if (message != null && (message.flags2 & 4) != 0) {
            return vp.r1(this.I1).Y0(this.f16337k.effect);
        }
        return null;
    }

    public final int M1() {
        TLRPC.Message message = this.f16337k;
        int i10 = message.realId;
        if (i10 != 0) {
            return i10;
        }
        return message.f19814id;
    }

    public final boolean M2() {
        int i10 = this.D;
        if (i10 != 13 && i10 != 15 && i10 != 19) {
            return false;
        }
        return true;
    }

    public final boolean M4() {
        if (F0() != null && O4(F0())) {
            return true;
        }
        return false;
    }

    public final boolean M5() {
        if (this.V1) {
            if (this.D != 5 && !R4(this.f16337k)) {
                if (!M2() || this.L1 == null) {
                    if (this.v != null && this.L1 != null) {
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

    public final void N(jj jjVar) {
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.f16339k1 = jjVar.f16339k1;
        TLRPC.Message message = this.f16337k;
        message.premiumEffectWasPlayed = jjVar.f16337k.premiumEffectWasPlayed;
        this.R = jjVar.R;
        this.V1 = jjVar.V1;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i10 = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = jjVar.f16337k.reactions) != null && tL_messageReactions.results != null) {
            for (int i11 = 0; i11 < this.f16337k.reactions.results.size(); i11++) {
                TLRPC.ReactionCount reactionCount = this.f16337k.reactions.results.get(i11);
                for (int i12 = 0; i12 < jjVar.f16337k.reactions.results.size(); i12++) {
                    TLRPC.ReactionCount reactionCount2 = jjVar.f16337k.reactions.results.get(i12);
                    if (sg.p0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z10 = jjVar.L0;
        this.L0 = z10;
        TLRPC.Message message2 = this.f16337k;
        TLRPC.Message message3 = jjVar.f16337k;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (z10 && (arrayList = this.f16397z2) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((gj) obj).f15723y.clear();
            }
        }
    }

    public final long N0() {
        TLRPC.Message message = this.f16337k;
        if (message != null && (message.flags2 & 4) != 0) {
            return message.effect;
        }
        return 0L;
    }

    public final int N1() {
        TLRPC.MessageReplies messageReplies = this.f16337k.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public boolean N3() {
        return this.f16337k.out;
    }

    public final boolean N5() {
        if (this.f16328h2) {
            return false;
        }
        return true;
    }

    public final void O(int i10, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, boolean z10) {
        String str = this.W;
        if (((ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new ArrayList());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = cd.u(tL_channelAdminLogEvent.date, false);
            tL_message.f19814id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            jj jjVar = new jj(i10, tL_message, false, false);
            jjVar.D = 10;
            jjVar.U = 1;
            jjVar.f16334j0 = true;
            if (z10) {
                arrayList.add(0, jjVar);
            } else {
                arrayList.add(jjVar);
            }
        }
    }

    public final ArrayList O0() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.f16337k;
        if (message != null) {
            if (this.K2) {
                if (this.J2 && (tL_textWithEntities = message.translatedSummaryText) != null) {
                    return tL_textWithEntities.entities;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
                if (tL_textWithEntities2 != null) {
                    return tL_textWithEntities2.entities;
                }
                return null;
            } else if (this.J2) {
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

    public final int O1() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.f16337k.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public final boolean O5() {
        if (!r4()) {
            int i10 = this.D;
            if (i10 == 13 || i10 == 15 || i10 == 5 || i10 == 19 || g3()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void P(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.P(boolean):void");
    }

    public final int P0() {
        if (c3(this.f16337k)) {
            return S(this.f16337k.f19814id);
        }
        return 0;
    }

    public final CharSequence P1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        CharSequence t52;
        TLRPC.Message message = this.f16337k;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i10 = this.I1;
        if (messageReplyHeader == null) {
            if (o5.z(B0(message))) {
                t52 = s5(i10, B0(this.f16337k));
                charSequence2 = t52;
                charSequence = null;
            } else {
                charSequence = s5(i10, B0(this.f16337k));
                charSequence2 = null;
            }
        } else {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                if (peer != null && o5.o(peer) == B0(this.f16337k)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = this.f16337k.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 != null) {
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                        charSequence = t5(i10, peer2, z10);
                        charSequence2 = null;
                    } else {
                        t52 = t5(i10, peer2, z10);
                        charSequence2 = t52;
                        charSequence = null;
                    }
                } else {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            charSequence = t5(i10, peer3, z10);
                        } else {
                            t52 = t5(i10, peer3, z10);
                            charSequence2 = t52;
                            charSequence = null;
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        if (z10) {
                            charSequence = new SpannableStringBuilder(f6()).append((CharSequence) " ").append((CharSequence) this.f16337k.reply_to.reply_from.from_name);
                        } else {
                            charSequence = new SpannableStringBuilder(this.f16337k.reply_to.reply_from.from_name);
                        }
                    }
                    charSequence2 = null;
                }
            }
            charSequence = null;
            charSequence2 = null;
        }
        TLRPC.Peer peer4 = this.f16337k.reply_to.reply_to_peer_id;
        if (peer4 != null && o5.o(peer4) != B0(this.f16337k)) {
            TLRPC.Peer peer5 = this.f16337k.reply_to.reply_to_peer_id;
            boolean z11 = peer5 instanceof TLRPC.TL_peerUser;
            if (z11) {
                charSequence = t5(i10, peer5, true);
            } else {
                charSequence2 = t5(i10, peer5, !z11);
            }
        }
        jj jjVar = this.C;
        if (jjVar != null) {
            if (o5.z(jjVar.S1())) {
                if (charSequence2 == null) {
                    charSequence2 = s5(i10, this.C.S1());
                }
            } else if (charSequence == null) {
                charSequence = s5(i10, this.C.S1());
            }
        }
        if (charSequence2 != null && charSequence != null) {
            return new SpannableStringBuilder(charSequence).append((CharSequence) " ").append(charSequence2);
        }
        if (charSequence2 != null) {
            return charSequence2;
        }
        if (charSequence != null) {
            return charSequence;
        }
        return cd.L0(2131748789, null);
    }

    public final boolean P2() {
        TLRPC.Message message;
        long B0;
        int i10;
        byte b10;
        if (!tz.H0) {
            if (this.S2 == 0 && (message = this.f16337k) != null && (B0(message)) != 0) {
                if (!tz.H0 && (i10 <= 0 || !((p0) vp.r1(this.I1).f18957y7.f17848n0.f11587b).f17392b.contains(Long.valueOf(B0)))) {
                    b10 = 1;
                } else {
                    b10 = 2;
                }
                this.S2 = b10;
            }
            if (this.S2 != 2) {
                return false;
            }
        }
        return true;
    }

    public boolean P3() {
        boolean z10 = true;
        if (this.f16369s1) {
            return true;
        }
        Boolean bool = this.R2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (d5(this.f16337k) && !b5()) {
            this.R2 = Boolean.FALSE;
            return false;
        }
        long e = d20.i(this.I1).e();
        if (!this.f16343l2 && B0(this.f16337k) != e) {
            TLRPC.Peer peer = this.f16337k.peer_id;
            TLRPC.Chat chat = null;
            if (peer != null) {
                long j10 = peer.channel_id;
                if (j10 != 0) {
                    chat = w0(null, null, j10);
                }
            }
            TLRPC.Message message = this.f16337k;
            if (message.out) {
                TLRPC.Peer peer2 = message.from_id;
                if ((peer2 instanceof TLRPC.TL_peerUser) || ((peer2 instanceof TLRPC.TL_peerChannel) && !w3.V(chat))) {
                    TLRPC.Message message2 = this.f16337k;
                    if (!message2.post) {
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null) {
                            this.R2 = Boolean.TRUE;
                            return true;
                        }
                        TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                        if (peer3 != null && peer3.user_id != e) {
                            z10 = false;
                        }
                        this.R2 = Boolean.valueOf(z10);
                        return z10;
                    }
                }
            }
            this.R2 = Boolean.FALSE;
            return false;
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = this.f16337k.fwd_from;
        if (messageFwdHeader2 != null) {
            TLRPC.Peer peer4 = messageFwdHeader2.from_id;
            if ((peer4 == null || peer4.user_id != e) && !messageFwdHeader2.saved_out) {
                z10 = false;
            }
            this.R2 = Boolean.valueOf(z10);
            return z10;
        }
        this.R2 = Boolean.TRUE;
        return true;
    }

    public final boolean P4() {
        return R4(this.f16337k);
    }

    public final boolean P5() {
        return Q5(this.f16337k);
    }

    public final void Q() {
        if (this.f16348n0 != null) {
            if ((tz.o() == 2 || r2()) && this.G1 == null) {
                try {
                    String str = "b";
                    if (h4()) {
                        str = "br";
                    }
                    int size = this.f16348n0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.f16348n0.get(i10);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.G1 = new BitmapDrawable(w0.f19025b.getResources(), hc.F(str, photoSize.bytes));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    f8.g(th2, true);
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

    public final long Q1() {
        return R1(d20.i(this.I1).e(), this.f16337k);
    }

    public final boolean Q3() {
        TLRPC.Message message = this.f16337k;
        if (message != null) {
            if (message.paid_suggested_post_stars || message.paid_suggested_post_ton) {
                int i10 = this.I1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                if (currentTime - this.f16337k.date < vp.r1(i10).f18957y7.f17838i.a(TimeUnit.SECONDS)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final TLRPC.TL_factCheck R0() {
        TLRPC.TL_factCheck tL_factCheck;
        a7 b10 = a7.b(this.I1);
        LongSparseArray longSparseArray = b10.f14587c;
        LongSparseArray longSparseArray2 = b10.f14586b;
        TLRPC.Message message = this.f16337k;
        if (message != null && (tL_factCheck = message.factcheck) != null) {
            if (!tL_factCheck.need_check) {
                if (longSparseArray2.get(tL_factCheck.hash) == null) {
                    TLRPC.TL_factCheck tL_factCheck2 = this.f16337k.factcheck;
                    longSparseArray2.put(tL_factCheck2.hash, tL_factCheck2);
                    TLRPC.TL_factCheck tL_factCheck3 = this.f16337k.factcheck;
                    int i10 = b10.f14585a;
                    if (tL_factCheck3 != null) {
                        hs a02 = hs.a0(i10);
                        a02.f15938a.c(new t6(2, a02, tL_factCheck3));
                        if (!b10.f14588f) {
                            b10.f14588f = true;
                            hs a03 = hs.a0(i10);
                            a03.f15938a.c(new br(a03, 6));
                        }
                    }
                }
                return this.f16337k.factcheck;
            }
            long B0 = B0(message);
            int f12 = f1();
            long j10 = this.f16337k.factcheck.hash;
            z6 z6Var = new z6(B0, f12, j10);
            if (f12 < 0) {
                return null;
            }
            TLRPC.TL_factCheck tL_factCheck4 = (TLRPC.TL_factCheck) longSparseArray2.get(j10);
            if (tL_factCheck4 != null) {
                this.f16337k.factcheck = tL_factCheck4;
                return tL_factCheck4;
            } else if (b10.d.contains(z6Var)) {
                return this.f16337k.factcheck;
            } else {
                HashMap hashMap = (HashMap) longSparseArray.get(B0);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    longSparseArray.put(B0, hashMap);
                }
                if (!hashMap.containsKey(z6Var)) {
                    hashMap.put(z6Var, new g3(b10, z6Var, this, 1));
                    a aVar = b10.e;
                    i0.r(aVar);
                    i0.h3(aVar, 80L);
                }
                return this.f16337k.factcheck;
            }
        }
        return null;
    }

    public final boolean R2() {
        return this.f16337k.media_unread;
    }

    public final boolean R3() {
        return S3(this.f16337k);
    }

    public final String S0() {
        if (F0() != null) {
            return b8.r(null, F0());
        }
        return T0(this.f16337k);
    }

    public final long S1() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.f16337k;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long j10 = peer.user_id;
            if (j10 != 0) {
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 instanceof TLRPC.TL_peerUser) {
                    return peer2.user_id;
                }
                return j10;
            } else if (peer.channel_id != 0) {
                if (k4()) {
                    TLRPC.Peer peer3 = this.f16337k.fwd_from.from_id;
                    if (peer3 instanceof TLRPC.TL_peerUser) {
                        return peer3.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.f16337k.fwd_from;
                TLRPC.Peer peer4 = messageFwdHeader2.from_id;
                if (peer4 instanceof TLRPC.TL_peerChannel) {
                    return -peer4.channel_id;
                }
                if (peer4 instanceof TLRPC.TL_peerChat) {
                    return -peer4.chat_id;
                }
                return -messageFwdHeader2.saved_from_peer.channel_id;
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
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
                    return -j11;
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

    public final boolean S2() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull a2;
        TLRPC.WallPaper wallPaper;
        if (!X4() || (message = this.f16337k) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (a2 = vp.r1(this.I1).a2(B0(this.f16337k))) == null || (wallPaper = a2.wallpaper) == null || !a2.wallpaper_overridden || this.f16337k.action.wallpaper.f19947id != wallPaper.f19947id) {
            return false;
        }
        return true;
    }

    public final boolean S4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (R4(this.f16337k) && (message = this.f16337k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final void S5() {
        TLRPC.Message message;
        if (!this.I2 && this.v != null && (message = this.f16337k) != null && message.entities != null) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j10 = peer.user_id;
                if (j10 == 777000 || j10 == 489000) {
                    if (f16290l3 == null) {
                        f16290l3 = Pattern.compile("[\\d\\-]{5,8}");
                    }
                    try {
                        Matcher matcher = f16290l3.matcher(this.v);
                        if (matcher.find()) {
                            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                            tL_messageEntitySpoiler.offset = matcher.start();
                            tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                            this.f16337k.entities.add(tL_messageEntitySpoiler);
                        }
                    } catch (Exception e) {
                        f8.g(e, false);
                    }
                    this.I2 = true;
                }
            }
        }
    }

    public final boolean T(jj jjVar) {
        if (jjVar == null || f1() != jjVar.f1() || B0(this.f16337k) != B0(jjVar.f16337k)) {
            return false;
        }
        return true;
    }

    public final long T1() {
        t61 t61Var = this.f16302b3;
        if (t61Var != null) {
            return t61Var.f30460g.size;
        }
        t61 t61Var2 = this.f16307c3;
        if (t61Var2 != null) {
            return t61Var2.f30460g.size;
        }
        t61 t61Var3 = this.f16311d3;
        if (t61Var3 != null) {
            return t61Var3.f30460g.size;
        }
        return q1(o1(this.f16337k));
    }

    public final boolean T2() {
        return o1(this.f16337k) instanceof TLRPC.TL_messageMediaDice;
    }

    public final boolean T3() {
        if (this.D == 17 && (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPoll)) {
            return true;
        }
        return false;
    }

    public final boolean T4() {
        TLRPC.Message message = this.f16337k;
        if (message != null) {
            if (R4(message) || (h4() && u21.k(this))) {
                TLRPC.Message message2 = this.f16337k;
                if (message2.voiceTranscriptionOpen && message2.voiceTranscription != null) {
                    if (message2.voiceTranscriptionFinal || u21.j(this)) {
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

    public final int T5() {
        int i10;
        vv vvVar = this.f16385w2;
        if (vvVar != null) {
            return vvVar.t();
        }
        if (this.f16397z2 == null) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16397z2.size(); i12++) {
            int i13 = ((gj) this.f16397z2.get(i12)).f15717f;
            gj gjVar = (gj) this.f16397z2.get(i12);
            if (gjVar.J && gjVar.f()) {
                i10 = gjVar.F;
            } else {
                i10 = gjVar.f15721w;
            }
            i11 += i10 + i13 + ((gj) this.f16397z2.get(i12)).h;
        }
        return i11;
    }

    public final long U1() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) o12).game_outcome) == null) {
            return 0L;
        }
        long j10 = tL_messages_emojiGameOutcome.ton_amount;
        if (j10 > 0) {
            return j10;
        }
        return -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public final boolean U2() {
        if (F0() != null && !L4(this.f16337k) && !I3() && !R4(this.f16337k) && !M2()) {
            return true;
        }
        return false;
    }

    public final int U5(org.telegram.ui.Cells.x1 x1Var) {
        if (this.f16397z2 == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16397z2.size(); i11++) {
            i10 += ((gj) this.f16397z2.get(i11)).j(x1Var) + ((gj) this.f16397z2.get(i11)).f15717f + ((gj) this.f16397z2.get(i11)).h;
        }
        return i10;
    }

    public final String V0() {
        TLRPC.Document document = this.f16347n;
        if (document == null) {
            document = G0(this.f16337k);
        }
        if (document != null) {
            TLRPC.Document document2 = this.f16347n;
            if (document2 == null) {
                document2 = G0(this.f16337k);
            }
            return b8.r(null, document2);
        }
        return T0(this.f16337k);
    }

    public final String V1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                i10++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute2.alt;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean V4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return W4((TLRPC.TL_messageMediaPoll) o12);
    }

    public final int V5() {
        int i10;
        vv vvVar = this.f16385w2;
        if (vvVar != null) {
            return vvVar.t();
        }
        Integer num = this.Q2;
        if (num != null) {
            return num.intValue();
        }
        if (this.f16397z2 == null) {
            this.Q2 = 0;
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16397z2.size(); i12++) {
            int i13 = ((gj) this.f16397z2.get(i12)).f15717f;
            gj gjVar = (gj) this.f16397z2.get(i12);
            if (gjVar.J) {
                i10 = gjVar.F;
            } else {
                i10 = gjVar.f15721w;
            }
            i11 += i13 + i10 + ((gj) this.f16397z2.get(i12)).h;
        }
        this.Q2 = Integer.valueOf(i11);
        return i11;
    }

    public final Long W0() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.f16337k;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(o5.o(peer));
    }

    public final String W1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
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

    public final boolean W3() {
        if (o1(this.f16337k) != null && o1(this.f16337k).nopremium) {
            return false;
        }
        return X3(F0());
    }

    public final void W5() {
        boolean z10 = !this.f16323g1;
        this.f16323g1 = z10;
        vp.r1(this.I1).f7.edit().putBoolean("c" + B0(this.f16337k) + "_rec", z10).apply();
    }

    public final TLObject X0() {
        Long W0 = W0();
        if (W0 == null) {
            return null;
        }
        return vp.r1(this.I1).d2(W0.longValue());
    }

    public final TLRPC.WebPage X1() {
        if (!z4()) {
            return null;
        }
        TLRPC.TL_webPage tL_webPage = this.W2;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
        tL_webPage2.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.f19938id = this.f16337k.media.f19815id;
        tL_webPageAttributeStory.peer = vp.r1(this.I1).y1(this.f16337k.media.user_id);
        TL_stories.StoryItem storyItem = this.f16337k.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage2.attributes.add(tL_webPageAttributeStory);
        this.W2 = tL_webPage2;
        return tL_webPage2;
    }

    public final boolean X2() {
        TLRPC.Message message = this.f16337k;
        if (message != null && (message.flags & 32768) != 0 && message.edit_date != 0 && !message.edit_hide) {
            return true;
        }
        return false;
    }

    public final boolean X4() {
        if (this.D != 22) {
            TLRPC.Message message = this.f16337k;
            if (message == null || !(message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final String Y0() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.f16337k.fwd_from;
        if (messageFwdHeader != null) {
            TLRPC.Peer peer = messageFwdHeader.from_id;
            boolean z10 = peer instanceof TLRPC.TL_peerChannel;
            int i10 = this.I1;
            if (z10) {
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(this.f16337k.fwd_from.from_id.channel_id));
                if (L0 != null) {
                    return L0.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                TLRPC.Chat L02 = vp.r1(i10).L0(Long.valueOf(this.f16337k.fwd_from.from_id.chat_id));
                if (L02 != null) {
                    return L02.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerUser) {
                TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(this.f16337k.fwd_from.from_id.user_id));
                if (Z1 != null) {
                    return h20.p(Z1);
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

    public final boolean Y2() {
        TLRPC.Message message = this.f16337k;
        if (message.send_state == 3 && message.f19814id > 0) {
            return true;
        }
        return false;
    }

    public final boolean Y3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.f16337k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name)) {
            return true;
        }
        return false;
    }

    public final boolean Y4() {
        TLRPC.Message message;
        if (X4() && (message = this.f16337k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Y5() {
        int i10 = this.I1;
        Z5(vp.r1(i10).d, vp.r1(i10).f18742b, null, null);
    }

    public final long Z0() {
        return C1(this.f16337k.from_id);
    }

    public final long Z1() {
        int i10 = this.I1;
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-B0(this.f16337k)));
        return a2(i10, this.f16337k, v7.u7.b(v7.u7.b(v7.u7.b(0, 1, w3.c0(L0)), 4, w3.p0(L0)), 8, h20.u(vp.r1(i10).Z1(Long.valueOf(B0(this.f16337k))))));
    }

    public final boolean Z2() {
        if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) {
            if (o1(this.f16337k).photo.f19817id == 0) {
                return true;
            }
            return false;
        } else if ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument) && o1(this.f16337k).document.dc_id == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean Z3() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) o12).poll.public_voters;
    }

    public final boolean Z4() {
        return o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public final void Z5(java.util.AbstractMap r35, java.util.AbstractMap r36, a0.h r37, a0.h r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.Z5(java.util.AbstractMap, java.util.AbstractMap, a0.h, a0.h):void");
    }

    public final boolean a3() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.O2;
        boolean z10 = false;
        if (bool != null) {
            TLRPC.Message message = this.f16337k;
            if (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        TLRPC.Message message2 = this.f16337k;
        if (message2 != null && (messageMedia = message2.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(m81.e(webPage.url))) {
            z10 = true;
        }
        this.O2 = Boolean.valueOf(z10);
        return z10;
    }

    public final boolean a4() {
        return b4(this.f16337k);
    }

    public final boolean a5() {
        if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) || o1(this.f16337k).webpage.document == null || s3(o1(this.f16337k).webpage.document, false)) {
            return false;
        }
        return true;
    }

    public final TLRPC.Peer b1() {
        TLRPC.Message message = this.f16337k;
        if (message != null) {
            return message.from_id;
        }
        return null;
    }

    public final boolean b3() {
        return c3(this.f16337k);
    }

    public final boolean b5() {
        TLRPC.Message message = this.f16337k;
        if (c3(message) && message.ephemeralAnchorMsgId != 0) {
            return true;
        }
        return false;
    }

    public final boolean c(CharSequence charSequence, boolean z10, boolean z11) {
        if (charSequence == null) {
            return false;
        }
        if (!this.E0 && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return b(charSequence, O0(), P3(), true, z10, z11, 0);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return b(charSequence, arrayList, P3(), true, z10, z11, 0);
    }

    public final TLObject c1() {
        TLRPC.Message message = this.f16337k;
        if (message != null) {
            TLRPC.Peer peer = message.from_id;
            boolean z10 = peer instanceof TLRPC.TL_peerChannel_layer131;
            int i10 = this.I1;
            if (!z10 && !(peer instanceof TLRPC.TL_peerChannel)) {
                if (!(peer instanceof TLRPC.TL_peerUser_layer131) && !(peer instanceof TLRPC.TL_peerUser)) {
                    if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
                        return vp.r1(i10).L0(Long.valueOf(this.f16337k.from_id.chat_id));
                    }
                    return null;
                }
                return vp.r1(i10).Z1(Long.valueOf(this.f16337k.from_id.user_id));
            }
            return vp.r1(i10).L0(Long.valueOf(this.f16337k.from_id.channel_id));
        }
        return null;
    }

    public final boolean c4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) o12).poll.quiz;
    }

    public final boolean c5() {
        return d5(this.f16337k);
    }

    public final void c6(boolean z10) {
        ArrayList arrayList = this.Z2;
        if (arrayList == null) {
            this.f16311d3 = null;
            D2(z10);
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((r61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((t61) obj2).e(z10);
            }
        }
        this.f16302b3 = u61.a0(this.Z2);
        this.f16307c3 = u61.b0(this.Z2);
        this.f16311d3 = u61.L(this.Z2);
    }

    public final long d1() {
        long j10 = this.d;
        if (j10 != 0) {
            return j10;
        }
        return e1();
    }

    public final boolean d3() {
        return e3(this.f16337k);
    }

    public final boolean d4() {
        if (!Y2() && !r4() && q4() && !c3(this.f16337k) && !g3() && z()) {
            return true;
        }
        return false;
    }

    public final long e1() {
        long j10 = this.e;
        if (j10 != 0) {
            return j10;
        }
        return this.f16337k.grouped_id;
    }

    public final TLRPC.User e2(AbstractMap abstractMap, a0.h hVar, long j10) {
        TLRPC.User user;
        if (abstractMap != null) {
            user = (TLRPC.User) abstractMap.get(Long.valueOf(j10));
        } else if (hVar != null) {
            user = (TLRPC.User) hVar.f(j10);
        } else {
            user = null;
        }
        if (user == null) {
            return vp.r1(this.I1).Z1(Long.valueOf(j10));
        }
        return user;
    }

    public final boolean e4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        jj jjVar = this.C;
        if ((jjVar == null || !(jjVar.f16337k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.f16337k).reply_to) != null) {
            if ((messageReplyHeader.reply_to_msg_id != 0 || messageReplyHeader.reply_to_random_id != 0) && (message.flags & 8) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e5() {
        if ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && o1(this.f16337k).webpage != null && !TextUtils.isEmpty(o1(this.f16337k).webpage.embed_url) && "YouTube".equals(o1(this.f16337k).webpage.site_name)) {
            return true;
        }
        return false;
    }

    public final boolean e6(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.e6(boolean):boolean");
    }

    public final void f(int i10, long j10, boolean z10) {
        boolean z11;
        TLRPC.Message message = this.f16337k;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.f16337k;
            TLRPC.TL_messageReactions tL_messageReactions = message2.reactions;
            boolean z12 = false;
            if (B0(message2) == d20.i(this.I1).e()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messageReactions.reactions_as_tags = z11;
            TLRPC.TL_messageReactions tL_messageReactions2 = this.f16337k.reactions;
            if (o3() || p3()) {
                z12 = true;
            }
            tL_messageReactions2.can_see_list = z12;
        }
        g(this.I1, this.f16337k.reactions, i10, j10, z10);
    }

    public final int f1() {
        TLRPC.Message message = this.f16337k;
        int i10 = message.ephemeralAnchorMsgId;
        if (i10 != 0) {
            return i10;
        }
        return message.f19814id;
    }

    public final boolean f4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        jj jjVar = this.C;
        if ((jjVar == null || !(jjVar.f16337k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.f16337k).reply_to) != null && messageReplyHeader.story_id != 0 && (message.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public final void f5() {
        if (this.f16347n == null && this.f16351o != null && !this.f16371t) {
            this.f16371t = true;
            org.telegram.ui.Components.f5.g(this.I1).b(this.f16351o.longValue(), new org.telegram.ui.Components.c5() {
                @Override
                public final void a(TLRPC.Document document) {
                    i0.g3(new oi(2, jj.this, document));
                }
            });
        }
    }

    public final Spannable g0(TLRPC.TodoItem todoItem) {
        Spannable h02 = h0(todoItem.title, P3());
        if (h02 == null) {
            h02 = new SpannableStringBuilder(h02);
        }
        h02.setSpan(new e51("task?" + todoItem.f19940id, 0), 0, h02.length(), 33);
        return h02;
    }

    public final boolean g3() {
        int i10 = this.D;
        if ((i10 == 23 || i10 == 24) && (this.f16337k.media.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return true;
        }
        return false;
    }

    public final boolean g4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (h4() && (message = this.f16337k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final int h2() {
        String str;
        Integer num = this.f16320f3;
        if (num != null) {
            return num.intValue();
        }
        if (!L4(this.f16337k)) {
            this.f16320f3 = -1;
            return -1;
        }
        TLRPC.MessageMedia n12 = n1(this);
        int i10 = n12.video_timestamp;
        if (i10 != 0) {
            return i10;
        }
        TLRPC.WebPage webPage = n12.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int V = LaunchActivity.V(Uri.parse(str));
                this.f16320f3 = Integer.valueOf(V);
                return V;
            } catch (Exception unused) {
            }
        }
        this.f16320f3 = -1;
        return -1;
    }

    public final boolean h3() {
        if (f1() >= 0 && !r4()) {
            int i10 = this.D;
            if (i10 == 0 || i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8 || i10 == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h4() {
        int i10;
        if (this.S == 0) {
            if (this.D != 5 && !j4(this.f16337k)) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            this.S = i10;
        }
        if (this.S == 1) {
            return true;
        }
        return false;
    }

    public final void h5() {
        TLRPC.TL_messageReactions tL_messageReactions = this.f16337k.reactions;
        if (tL_messageReactions != null && tL_messageReactions.recent_reactions != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f16337k.reactions.recent_reactions.size(); i10++) {
                if (this.f16337k.reactions.recent_reactions.get(i10).unread) {
                    this.f16337k.reactions.recent_reactions.get(i10).unread = false;
                    z10 = true;
                }
            }
            if (z10) {
                int i11 = this.I1;
                hs a02 = hs.a0(i11);
                TLRPC.Message message = this.f16337k;
                a02.I(new ir(a02, message.dialog_id, c2(i11, message, false, false), this.f16337k.f19814id, 6));
            }
        }
    }

    public final boolean i() {
        TLRPC.Peer peer;
        if (!tz.T0) {
            return false;
        }
        TLRPC.Message message = this.f16337k;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            vp r12 = vp.r1(this.I1);
            TLRPC.Peer peer2 = this.f16337k.peer_id;
            long j10 = peer2.channel_id;
            if (j10 == 0) {
                j10 = peer2.chat_id;
            }
            TLRPC.Chat L0 = r12.L0(Long.valueOf(j10));
            if ((L0 == null || !L0.gigagroup) && L0 != null && ((w3.C(L0.banned_rights, 8) || w3.C(L0.default_banned_rights, 8)) && !w3.N(L0))) {
                return false;
            }
        }
        return true;
    }

    public final TLRPC.InputStickerSet i1() {
        return k1(this.f16337k);
    }

    public final boolean i3() {
        if (this.f16294a != 0) {
            return true;
        }
        return false;
    }

    public final void i5() {
        boolean z10;
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence m10;
        boolean z11;
        boolean z12;
        TLRPC.SuggestedPost suggestedPost;
        if (!this.E0) {
            this.f16379v0 = 0;
            this.f16354o2 = null;
            ArrayList arrayList = new ArrayList();
            TLRPC.Message message = this.f16337k;
            if (message != null) {
                TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                    if (tL_replyInlineMarkup.rows != null) {
                        for (int i11 = 0; i11 < tL_replyInlineMarkup.rows.size(); i11++) {
                            ArrayList<TL_keyboard.KeyboardInlineButton> arrayList2 = tL_replyInlineMarkup.rows.get(i11).buttons;
                            r2[] r2VarArr = new r2[arrayList2.size()];
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                r2VarArr[i12] = new r2(arrayList2.get(i12));
                            }
                            arrayList.add(r2VarArr);
                        }
                    }
                }
            }
            TLRPC.Message message2 = this.f16337k;
            if (message2 != null && (suggestedPost = message2.suggested_post) != null && !suggestedPost.rejected && !suggestedPost.accepted && !n4() && !o4()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long e = d20.i(this.I1).e();
                long o10 = o5.o(this.f16337k.saved_peer_id);
                long o11 = o5.o(this.f16337k.from_id);
                if (e == o10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (o10 == o11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((z11 && z12) || (!z11 && !z12)) {
                    z10 = false;
                }
            }
            if (z10) {
                if (!arrayList.isEmpty()) {
                    i10 = 1 << (arrayList.size() - 1);
                } else {
                    i10 = 0;
                }
                arrayList.add(new q2[]{new s2(1, 2131747103, 2131231085), new s2(2, 2131747104, 2131231084)});
                arrayList.add(new q2[]{new s2(3, 2131747102, 2131231086)});
            } else {
                i10 = 0;
            }
            if (!arrayList.isEmpty()) {
                this.f16354o2 = new c5.x((q2[][]) arrayList.toArray(new q2[arrayList.size()]), i10, 12);
            }
            c5.x xVar = this.f16354o2;
            if ((xVar != null && !q2()) || ((tL_messageReactions = this.f16337k.reactions) != null && !tL_messageReactions.results.isEmpty())) {
                org.telegram.ui.ActionBar.t6.Q();
                StringBuilder sb2 = this.D0;
                if (sb2 == null) {
                    this.D0 = new StringBuilder();
                } else {
                    sb2.setLength(0);
                }
            }
            if (xVar != null) {
                q2[][] q2VarArr = (q2[][]) xVar.f3828c;
                if (!q2()) {
                    for (int i13 = 0; i13 < q2VarArr.length; i13++) {
                        int length = q2VarArr[i13].length;
                        int i14 = 0;
                        for (int i15 = 0; i15 < length; i15++) {
                            q2 q2Var = q2VarArr[i13][i15];
                            StringBuilder sb3 = this.D0;
                            sb3.append(i13);
                            sb3.append(i15);
                            if ((q2Var instanceof r2) && sf.c.c(((r2) q2Var).f17683a, TL_keyboard.TL_inlineButtonTypeBuy.class) && (o1(this.f16337k).flags & 4) != 0) {
                                m10 = cd.L0(2131747398, null);
                            } else {
                                String d = q2Var.d();
                                if (d == null) {
                                    d = "";
                                }
                                m10 = k6.m(d, org.telegram.ui.ActionBar.t6.f21273w2.getFontMetricsInt(), false, null, 0);
                            }
                            StaticLayout staticLayout = new StaticLayout(m10, org.telegram.ui.ActionBar.t6.f21273w2, i0.L(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            if (staticLayout.getLineCount() > 0) {
                                float lineWidth = staticLayout.getLineWidth(0);
                                float lineLeft = staticLayout.getLineLeft(0);
                                if (lineLeft < lineWidth) {
                                    lineWidth -= lineLeft;
                                }
                                if (q2Var.c() != 0) {
                                    lineWidth += i0.L(36.0f);
                                }
                                if (q2Var.b() != 0) {
                                    lineWidth += i0.L(36.0f);
                                }
                                i14 = m5.b(4.0f, (int) Math.ceil(lineWidth), i14);
                            }
                        }
                        this.f16379v0 = Math.max(this.f16379v0, ((length - 1) * i0.L(5.0f)) + ((i0.L(12.0f) + i14) * length));
                    }
                }
            }
        }
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.j():void");
    }

    public final CharSequence j2() {
        String str;
        String str2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.f16337k;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(cd.L0(2131748144, null));
            spannableString.setSpan(new zi(0), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (this.J2 && (tL_textWithEntities = this.f16337k.translatedVoiceTranscription) != null) {
            str2 = tL_textWithEntities.text;
        } else {
            str2 = this.f16337k.voiceTranscription;
        }
        if (!TextUtils.isEmpty(str2)) {
            return k6.m(str2, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false, null, 0);
        }
        return str2;
    }

    public final boolean j3() {
        return l3(this.f16337k);
    }

    public final boolean j5() {
        t61 t61Var;
        if (D2(true) && (t61Var = this.f16302b3) != null) {
            return t61Var.b();
        }
        return this.f16387x0;
    }

    public final void k(CharSequence charSequence) {
        TLRPC.User user;
        TextPaint textPaint;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int[] iArr = null;
        if (p3()) {
            user = vp.r1(this.I1).Z1(Long.valueOf(this.f16337k.from_id.user_id));
        } else {
            user = null;
        }
        this.v = charSequence;
        ArrayList O0 = O0();
        if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame) {
            textPaint = org.telegram.ui.ActionBar.t6.f21291x2;
        } else {
            textPaint = org.telegram.ui.ActionBar.t6.f21130o2;
        }
        if (i()) {
            iArr = new int[1];
        }
        CharSequence m10 = k6.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
        this.v = m10;
        Spannable A5 = A5(m10, O0, textPaint.getFontMetricsInt(), false);
        this.v = A5;
        if (iArr != null && iArr[0] > 1) {
            C5(A5, iArr);
        }
        H(iArr);
        n0(user);
        K5();
    }

    public final void k0() {
        boolean z10;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z11;
        boolean z12;
        TL_stories.StoryItem storyItem;
        boolean z13;
        if (!h4()) {
            if (this.f16394z != null) {
                if (this.J2) {
                    TLRPC.Message message = this.f16337k;
                    if (message.translatedText != null || (this.K2 && message.translatedSummaryText != null)) {
                        z13 = true;
                        if (z13 == this.L2 && this.K2 == this.M2) {
                            return;
                        }
                    }
                }
                z13 = false;
                if (z13 == this.L2) {
                    return;
                }
            }
            TLRPC.Message message2 = this.f16337k;
            String str = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            if (this.D == 23) {
                TLRPC.MessageMedia messageMedia = message2.media;
                if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                    str = storyItem.caption;
                    arrayList = storyItem.entities;
                    z10 = true;
                    TLRPC.Message message3 = this.f16337k;
                    tL_textWithEntities = message3.translatedSummaryText;
                    if (tL_textWithEntities == null && this.K2 && this.J2) {
                        this.M2 = true;
                        this.L2 = true;
                        str = tL_textWithEntities.text;
                        arrayList = tL_textWithEntities.entities;
                    } else {
                        tL_textWithEntities2 = message3.summaryText;
                        if (tL_textWithEntities2 == null && this.K2) {
                            this.M2 = true;
                            this.L2 = false;
                            str = tL_textWithEntities2.text;
                            arrayList = tL_textWithEntities2.entities;
                        } else {
                            tL_textWithEntities3 = message3.translatedText;
                            if (tL_textWithEntities3 == null && this.J2) {
                                this.M2 = false;
                                this.L2 = true;
                                str = tL_textWithEntities3.text;
                                arrayList = tL_textWithEntities3.entities;
                            } else {
                                this.M2 = false;
                                this.L2 = false;
                            }
                        }
                    }
                    if (F3() && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame) && !TextUtils.isEmpty(str)) {
                        CharSequence m10 = k6.m(str, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false, null, 0);
                        this.f16394z = m10;
                        this.f16394z = A5(m10, arrayList, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false);
                        if (this.f16337k.send_state != 0) {
                            z11 = false;
                        } else {
                            z11 = !arrayList.isEmpty();
                        }
                        if (!z10 && (z11 || (this.T == 0 && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto_old) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto_layer68) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto_layer74) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument_old) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument_layer68) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument_layer74) && ((!N3() || this.f16337k.send_state == 0) && this.f16337k.f19814id >= 0)))) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            if (M(this.f16394z)) {
                                try {
                                    i0.c((Spannable) this.f16394z, 5, false, true);
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                            }
                            h(P3(), this.f16394z, true, 0, 0, true);
                        }
                        c(this.f16394z, false, z12);
                        this.f16394z = org.telegram.ui.Components.n00.a(this.f16394z, true);
                        if (L4(this.f16337k)) {
                            h(P3(), this.f16394z, true, 3, (int) L0(), false);
                        } else if (I3() || R4(this.f16337k)) {
                            h(P3(), this.f16394z, true, 4, (int) L0(), false);
                        }
                        n(this.f16394z);
                        return;
                    }
                    return;
                }
                arrayList = new ArrayList<>();
                str = "";
            } else if (q2()) {
                TLRPC.Message message4 = this.f16337k;
                str = message4.media.description;
                message4.message = str;
            }
            z10 = false;
            TLRPC.Message message32 = this.f16337k;
            tL_textWithEntities = message32.translatedSummaryText;
            if (tL_textWithEntities == null) {
            }
            tL_textWithEntities2 = message32.summaryText;
            if (tL_textWithEntities2 == null) {
            }
            tL_textWithEntities3 = message32.translatedText;
            if (tL_textWithEntities3 == null) {
            }
            this.M2 = false;
            this.L2 = false;
            if (F3()) {
            }
        }
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.f16337k;
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
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.f16337k.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null && peer.channel_id != 0) {
            return w3.n0(vp.r1(this.I1).L0(Long.valueOf(this.f16337k.fwd_from.saved_from_peer.channel_id)));
        }
        return false;
    }

    public boolean k5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.k5():boolean");
    }

    public final void l(int i10, String str) {
        TLRPC.Message message = this.f16337k;
        if (message == null) {
            return;
        }
        if (i10 != 0) {
            message.flags |= 1073741824;
            message.quick_reply_shortcut_id = i10;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i10;
            this.f16337k.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
        } else if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.f16337k.quick_reply_shortcut = tL_inputQuickReplyShortcut;
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
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if ((o12 instanceof TLRPC.TL_messageMediaPoll) && (pollResults = ((TLRPC.TL_messageMediaPoll) o12).results) != null) {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        } else {
            str = null;
            arrayList = null;
        }
        if (str != null) {
            CharSequence m10 = k6.m(str, org.telegram.ui.ActionBar.t6.f20888b3.getFontMetricsInt(), false, null, 0);
            this.A = m10;
            Spannable A5 = A5(m10, arrayList, org.telegram.ui.ActionBar.t6.f20888b3.getFontMetricsInt(), false);
            this.A = A5;
            b(A5, arrayList, P3(), true, false, false, 0);
            return;
        }
        this.A = null;
    }

    public final int l1() {
        vv vvVar = this.f16385w2;
        if (vvVar != null) {
            ArrayList arrayList = vvVar.h;
            ArrayList arrayList2 = vvVar.f18990g;
            if (!arrayList2.isEmpty() && !vvVar.d && !vvVar.I()) {
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (((mu) obj).f17002b >= arrayList2.size() - 1) {
                            return vvVar.C;
                        }
                    }
                }
                qu quVar = (qu) i0.a.g(1, arrayList2);
                if (quVar.v()) {
                    return vvVar.C;
                }
                return quVar.I();
            }
            return vvVar.C;
        }
        return this.f16370s2;
    }

    public final boolean l4() {
        int i10;
        TLRPC.Message message = this.f16337k;
        if (message instanceof TLRPC.TL_message_secret) {
            if ((((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || t3(this.f16337k)) && (i10 = this.f16337k.ttl) > 0 && i10 <= 60) || R4(this.f16337k) || h4() || L4(this.f16337k)) {
                return true;
            }
            return false;
        } else if ((message instanceof TLRPC.TL_message) && o1(message) != null && o1(this.f16337k).ttl_seconds != 0 && ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) || (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean l5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.l5():boolean");
    }

    public final void m() {
        n(this.v);
    }

    public final void m0(TLRPC.User user) {
        TLRPC.TL_game tL_game;
        int i10 = this.I1;
        if (user == null && p3()) {
            user = vp.r1(i10).Z1(Long.valueOf(this.f16337k.from_id.user_id));
        }
        jj jjVar = this.C;
        if (jjVar != null && n1(jjVar) != null && n1(this.C).game != null) {
            tL_game = n1(this.C).game;
        } else {
            tL_game = null;
        }
        if (tL_game == null) {
            if (user != null && user.f19942id == d20.i(i10).e()) {
                this.v = cd.a0("ActionYouScored", null, 2131754492, cd.G(this.f16337k.action.score, "Points", new Object[0]));
                return;
            } else {
                this.v = D5(cd.a0("ActionUserScored", null, 2131754506, cd.G(this.f16337k.action.score, "Points", new Object[0])), "un1", user);
                return;
            }
        }
        if (user != null && user.f19942id == d20.i(i10).e()) {
            this.v = cd.a0("ActionYouScoredInGame", null, 2131754491, cd.G(this.f16337k.action.score, "Points", new Object[0]));
        } else {
            this.v = D5(cd.a0("ActionUserScoredInGame", null, 2131754505, cd.G(this.f16337k.action.score, "Points", new Object[0])), "un1", user);
        }
        this.v = D5(this.v, "un2", tL_game);
    }

    public final int m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.m1():int");
    }

    public final ArrayList m2() {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        ArrayList arrayList = new ArrayList();
        if (o1(this.f16337k) != null && o1(this.f16337k).webpage != null && (page = (webPage = o1(this.f16337k).webpage).cached_page) != null) {
            ArrayList<TL_iv.PageBlock> arrayList2 = page.blocks;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i10);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
                        arrayList.add(s1(webPage, pageblockslideshow.items.get(i11)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i12 = 0; i12 < pageblockcollage.items.size(); i12++) {
                        arrayList.add(s1(webPage, pageblockcollage.items.get(i12)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean m5() {
        if (!this.f16328h2) {
            if (!r2()) {
                TLRPC.Message message = this.f16337k;
                if (message instanceof TLRPC.TL_message_secret) {
                    int max = Math.max(message.ttl, o1(message).ttl_seconds);
                    if (max > 0) {
                        if ((((o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) || L4(this.f16337k) || t3(this.f16337k)) && max <= 60) || h4()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } else if ((message instanceof TLRPC.TL_message) && o1(message) != null && o1(this.f16337k).ttl_seconds != 0) {
                    if ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) || (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument)) {
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

    public final void n(CharSequence charSequence) {
        TLRPC.Message message;
        jj jjVar = this.C;
        if (jjVar != null) {
            if (jjVar.e5()) {
                h(P3(), charSequence, false, 3, Integer.MAX_VALUE, false);
            } else if (L4(jjVar.f16337k)) {
                h(P3(), charSequence, false, 3, (int) jjVar.L0(), false);
            } else {
                if (jjVar.I3() || R4(jjVar.f16337k)) {
                    h(P3(), charSequence, false, 4, (int) jjVar.L0(), false);
                }
                if (charSequence == this.v && (message = this.f16337k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                        Y5();
                    }
                }
            }
        }
    }

    public void n0(org.telegram.tgnet.TLRPC.User r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.n0(org.telegram.tgnet.TLRPC$User):void");
    }

    public final boolean n3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.n3():boolean");
    }

    public final boolean n4() {
        int i10;
        TLRPC.Message message = this.f16337k;
        if (message.send_state != 2 || message.f19814id >= 0) {
            if (this.f16357p1 && message.f19814id > 0) {
                int i11 = message.date;
                int currentTime = ConnectionsManager.getInstance(this.I1).getCurrentTime();
                if (this.f16337k.video_processing_pending) {
                    i10 = 300;
                } else {
                    i10 = 60;
                }
                if (i11 < currentTime - i10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean n5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.n5():boolean");
    }

    public final boolean o() {
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaToDo) || l3(this.f16337k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) o12;
        if (tL_messageMediaToDo.todo.list.size() >= vp.r1(this.I1).S6) {
            return false;
        }
        if (!P3()) {
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            if (!todoList.others_can_complete || !todoList.others_can_append) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void o0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.o0():void");
    }

    public final void o2(ArrayList arrayList, String[] strArr, boolean z10, boolean z11) {
        CharSequence charSequence;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z12;
        if (!arrayList.isEmpty()) {
            boolean z13 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 >= strArr.length) {
                        break;
                    } else if (((String) arrayList.get(i10)).contains(strArr[i11])) {
                        z13 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z13) {
                    break;
                }
            }
            if (z13) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < strArr.length) {
                            if (((String) arrayList.get(i12)).contains(strArr[i13])) {
                                z12 = true;
                                break;
                            }
                            i13++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (arrayList.size() > 0) {
                    Collections.sort(arrayList, new a4.d(28));
                    arrayList.clear();
                    arrayList.add((String) arrayList.get(0));
                }
            }
            this.Y1 = arrayList;
            if (this.f16337k.message != null) {
                j();
                if (!TextUtils.isEmpty(this.f16394z)) {
                    charSequence = this.f16394z;
                } else {
                    charSequence = this.v;
                }
                CharSequence L2 = i0.L2(charSequence, " ", "\n");
                if (z10 && (message = this.f16337k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16337k.reply_to.quote_text);
                    b(spannableStringBuilder, this.f16337k.reply_to.quote_entities, P3(), false, false, false, 0);
                    SpannableString spannableString = new SpannableString("q ");
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231965, 0);
                    dqVar.f25512y = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false);
                    spannableString.setSpan(dqVar, 0, 1, 33);
                    L2 = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(L2);
                }
                String charSequence2 = L2.toString();
                int length = charSequence2.length();
                int indexOf = charSequence2.toLowerCase().indexOf((String) arrayList.get(0));
                if (indexOf < 0) {
                    indexOf = 0;
                }
                if (length > 120 && z11) {
                    float f7 = 120;
                    int max = Math.max(0, indexOf - ((int) (0.1f * f7)));
                    L2 = L2.subSequence(max, Math.min(length, (indexOf - max) + indexOf + ((int) (f7 * 0.9f))));
                }
                this.a2 = L2;
                this.Z1 = z11;
            }
        }
    }

    public final boolean o3() {
        TLRPC.Message message = this.f16337k;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                chat = w0(null, null, j10);
            }
        }
        if (!(this.f16337k.from_id instanceof TLRPC.TL_peerChannel) || !w3.T(chat) || !chat.megagroup) {
            return false;
        }
        return true;
    }

    public final boolean o4() {
        TLRPC.Message message = this.f16337k;
        if (message.send_state == 1 && message.f19814id < 0) {
            return true;
        }
        return false;
    }

    public boolean o5() {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!this.f16328h2 && !this.P2 && B0(this.f16337k) != 489000) {
            boolean z10 = this.f16343l2;
            int i10 = this.I1;
            if (z10) {
                long j10 = d20.i(i10).f15165n;
                long R1 = R1(j10, this.f16337k);
                if (R1 != j10 && R1 != 2666000 && (message = this.f16337k) != null && (messageFwdHeader = message.fwd_from) != null) {
                    if (messageFwdHeader.from_id != null || messageFwdHeader.saved_from_id != null) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (this.D != 27 && !r4() && !this.A2 && !this.f16365r1 && !this.f16357p1 && this.T == 0) {
                if (this.f16350n2 != 2) {
                    TLRPC.Message message2 = this.f16337k;
                    if (!message2.noforwards) {
                        if (message2.fwd_from != null && !P3()) {
                            TLRPC.Message message3 = this.f16337k;
                            if (message3.fwd_from.saved_from_peer != null && B0(message3) == d20.i(i10).e()) {
                                return true;
                            }
                        }
                        int i11 = this.D;
                        if (i11 != 13 && i11 != 15 && i11 != 19) {
                            TLRPC.MessageFwdHeader messageFwdHeader2 = this.f16337k.fwd_from;
                            if (messageFwdHeader2 == null || !(messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) || P3()) {
                                if (p3()) {
                                    TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(this.f16337k.from_id.user_id));
                                    if (Z1 == null || !Z1.bot || (!"reviews_bot".equals(h20.n(Z1)) && !"ReviewInsightsBot".equals(h20.n(Z1)))) {
                                        if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaEmpty) && o1(this.f16337k) != null) {
                                            if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) || (o1(this.f16337k).webpage instanceof TLRPC.TL_webPage)) {
                                                if (Z1 == null || !Z1.bot || q2()) {
                                                    if (!N3()) {
                                                        if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame)) {
                                                            if ((!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaInvoice) || q2()) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                                TLRPC.Peer peer = this.f16337k.peer_id;
                                                                TLRPC.Chat chat = null;
                                                                if (peer != null) {
                                                                    long j11 = peer.channel_id;
                                                                    if (j11 != 0) {
                                                                        chat = w0(null, null, j11);
                                                                    }
                                                                }
                                                                if (w3.T(chat) && chat.megagroup && w3.t0(chat) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaContact) && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaGeo)) {
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
                                TLRPC.Message message4 = this.f16337k;
                                if ((message4.from_id instanceof TLRPC.TL_peerChannel) || message4.post) {
                                    if (!(o1(message4) instanceof TLRPC.TL_messageMediaWebPage) || P3()) {
                                        if (!A4()) {
                                            TLRPC.Message message5 = this.f16337k;
                                            if (message5.peer_id.channel_id != 0) {
                                                if (message5.via_bot_id != 0 || message5.reply_to != null) {
                                                    int i12 = this.D;
                                                    if (i12 != 13 && i12 != 15) {
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

    public final void p0(TLRPC.User user, boolean z10) {
        String str;
        String str2;
        if (user == null) {
            user = vp.r1(this.I1).Z1(Long.valueOf(B0(this.f16337k)));
        }
        if (user != null) {
            str = h20.j(user, true);
        } else {
            str = "";
        }
        try {
            if ("XTR".equals(this.f16337k.action.currency)) {
                str2 = "XTR " + this.f16337k.action.total_amount;
            } else {
                cd D0 = cd.D0();
                TLRPC.MessageAction messageAction = this.f16337k.action;
                str2 = D0.p(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e) {
            f8.g(e, true);
            str2 = "<error>";
        }
        jj jjVar = this.C;
        if (jjVar != null && (n1(jjVar) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.f16337k.action;
            if (messageAction2.subscription_until_date != 0) {
                if (z10) {
                    this.v = cd.a0(null, null, 2131747380, str, str2, n1(this.C).title, cd.x(this.f16337k.action.subscription_until_date, false));
                } else {
                    this.v = cd.a0(null, null, 2131747376, str2, str, n1(this.C).title, cd.x(this.f16337k.action.subscription_until_date, false));
                }
            } else if (messageAction2.recurring_init && !z10) {
                this.v = cd.a0(null, null, 2131747377, str2, str, n1(this.C).title);
            } else {
                this.v = cd.a0(null, null, 2131747382, str2, str, n1(this.C).title);
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.f16337k.action;
            int i10 = messageAction3.subscription_until_date;
            if (i10 != 0) {
                if (z10) {
                    this.v = cd.a0(null, null, 2131747381, str, str2, cd.x(i10, false));
                } else {
                    this.v = cd.a0(null, null, 2131747375, str2, str, cd.x(i10, false));
                }
            } else if (messageAction3.recurring_init && !z10) {
                this.v = cd.a0(null, null, 2131747378, str2, str);
            } else {
                this.v = cd.a0(null, null, 2131747379, str2, str);
            }
        }
        this.v = rh.h8.S0(this.v);
    }

    public final int p1() {
        boolean z10 = this.f16383w0;
        if (this.f16387x0) {
            return (z10 ? 1 : 0) | 2;
        }
        return z10 ? 1 : 0;
    }

    public final boolean p2() {
        if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) {
            if (o1(this.f16337k).photo == null || !o1(this.f16337k).photo.has_stickers) {
                return false;
            }
            return true;
        } else if (!(o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument)) {
            return false;
        } else {
            return V2(o1(this.f16337k).document);
        }
    }

    public final boolean p3() {
        TLRPC.Message message = this.f16337k;
        if ((message.from_id instanceof TLRPC.TL_peerUser) && !message.post) {
            return true;
        }
        return false;
    }

    public final boolean p4() {
        int i10;
        TLRPC.Chat L0;
        Boolean bool = this.f16366r2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f16337k != null && (((i10 = this.D) == 1 || i10 == 3 || i10 == 9 || i10 == 8 || i10 == 5) && !this.f16395z0 && !this.f16328h2 && !P3())) {
            TLRPC.Message message = this.f16337k;
            if (message.send_state == 0) {
                if (!message.restriction_reason.isEmpty()) {
                    for (int i11 = 0; i11 < this.f16337k.restriction_reason.size(); i11++) {
                        TLRPC.RestrictionReason restrictionReason = this.f16337k.restriction_reason.get(i11);
                        if ("sensitive".equals(restrictionReason.reason)) {
                            if (!"all".equals(restrictionReason.platform)) {
                                if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                                    w0.u();
                                    if (!v2.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason.platform)) {
                                }
                            }
                            this.f16366r2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                if (B0(this.f16337k) < 0 && (L0 = vp.r1(this.I1).L0(Long.valueOf(-B0(this.f16337k)))) != null && L0.restriction_reason != null) {
                    for (int i12 = 0; i12 < L0.restriction_reason.size(); i12++) {
                        TLRPC.RestrictionReason restrictionReason2 = L0.restriction_reason.get(i12);
                        if ("sensitive".equals(restrictionReason2.reason)) {
                            if (!"all".equals(restrictionReason2.platform)) {
                                if ("android".equals(restrictionReason2.platform) || "android-ios".equals(restrictionReason2.platform) || "ios-android".equals(restrictionReason2.platform)) {
                                    w0.u();
                                    if (!v2.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason2.platform)) {
                                }
                            }
                            this.f16366r2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                this.f16366r2 = Boolean.FALSE;
            }
        }
        return false;
    }

    public final boolean p5() {
        long B0 = B0(this.f16337k);
        int i10 = this.I1;
        if (w3.o0(i10, B0) && Z0() != d20.i(i10).e() && !P3()) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        TLRPC.MessageMedia o12 = o1(this.f16337k);
        if (!(o12 instanceof TLRPC.TL_messageMediaToDo) || l3(this.f16337k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) o12;
        if (!P3() && !tL_messageMediaToDo.todo.others_can_complete) {
            return false;
        }
        return true;
    }

    public final void q0(TLRPC.Chat chat, TLRPC.User user) {
        boolean z10;
        String p5;
        if (user == null && chat == null) {
            boolean p32 = p3();
            int i10 = this.I1;
            if (p32) {
                user = vp.r1(i10).Z1(Long.valueOf(this.f16337k.from_id.user_id));
            }
            if (user == null) {
                TLRPC.Peer peer = this.f16337k.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = vp.r1(i10).L0(Long.valueOf(this.f16337k.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = vp.r1(i10).L0(Long.valueOf(this.f16337k.peer_id.chat_id));
                }
            }
        }
        jj jjVar = this.C;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.f16337k;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (jjVar.I3()) {
                    String L0 = cd.L0(2131754594, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L0, "un1", chat);
                    return;
                } else if (L4(this.C.f16337k)) {
                    String L02 = cd.L0(2131754586, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L02, "un1", chat);
                    return;
                } else if (t3(this.C.f16337k)) {
                    String L03 = cd.L0(2131754595, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L03, "un1", chat);
                    return;
                } else if (R4(this.C.f16337k)) {
                    String L04 = cd.L0(2131754585, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L04, "un1", chat);
                    return;
                } else if (this.C.h4()) {
                    String L05 = cd.L0(2131754589, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L05, "un1", chat);
                    return;
                } else if ((this.C.t4() || this.C.J2()) && !this.C.G2()) {
                    String L06 = cd.L0(2131754588, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L06, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaDocument) {
                    String L07 = cd.L0(2131754599, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L07, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaGeo) {
                    String L08 = cd.L0(2131754597, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L08, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String L09 = cd.L0(2131754596, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L09, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaContact) {
                    String L010 = cd.L0(2131754600, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L010, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaPoll) {
                    if (((TLRPC.TL_messageMediaPoll) n1(this.C)).poll.quiz) {
                        String L011 = cd.L0(2131754590, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = D5(L011, "un1", chat);
                        return;
                    }
                    String L012 = cd.L0(2131754591, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L012, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaPhoto) {
                    String L013 = cd.L0(2131754592, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L013, "un1", chat);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaPaidMedia) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) n1(this.C);
                    if (chat != null) {
                        p5 = chat.title;
                    } else {
                        p5 = h20.p(user);
                    }
                    this.v = cd.G((int) tL_messageMediaPaidMedia.stars_amount, "NotificationPinnedPaidMedia", p5);
                    return;
                } else if (n1(this.C) instanceof TLRPC.TL_messageMediaGame) {
                    String a02 = cd.a0("ActionPinnedGame", null, 2131754598, "🎮 " + n1(this.C).game.title);
                    if (user != 0) {
                        chat = user;
                    }
                    CharSequence D5 = D5(a02, "un1", chat);
                    this.v = D5;
                    this.v = k6.m(D5, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false, null, 0);
                    return;
                } else {
                    CharSequence charSequence = this.C.v;
                    if (charSequence != null && charSequence.length() > 0) {
                        CharSequence cloneSpans = org.telegram.ui.Components.o5.cloneSpans(this.C.v);
                        if (cloneSpans.length() > 20) {
                            cloneSpans = cloneSpans.subSequence(0, 20);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        SpannableStringBuilder m10 = k6.m(cloneSpans, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), true, null, 0);
                        jj jjVar2 = this.C;
                        if (jjVar2 != null && jjVar2.f16337k != null) {
                            m10 = jjVar2.z5(m10, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt());
                        }
                        ui.h(this.C, (Spannable) m10);
                        if (z10) {
                            if (m10 instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) m10).append((CharSequence) "...");
                            } else if (m10 != null) {
                                m10 = new SpannableStringBuilder(m10).append((CharSequence) "...");
                            }
                        }
                        SpannableStringBuilder m0 = i0.m0(cd.L0(2131754587, null), m10);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = D5(m0, "un1", chat);
                        return;
                    }
                    String L014 = cd.L0(2131754593, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(L014, "un1", chat);
                    return;
                }
            }
        }
        String L015 = cd.L0(2131754593, null);
        if (user != null) {
            chat = user;
        }
        this.v = D5(L015, "un1", chat);
    }

    public final boolean q2() {
        TLRPC.MessageMedia messageMedia = this.f16337k.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean q3() {
        return t3(this.f16337k);
    }

    public final boolean q4() {
        TLRPC.Message message = this.f16337k;
        if (message.send_state != 0 && message.f19814id <= 0) {
            return false;
        }
        return true;
    }

    public final void r0(boolean z10) {
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
        if (r2()) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.f16337k.media.extended_media.get(0);
            if (!z10) {
                this.f16348n0 = new ArrayList(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                a6(this.f16348n0, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.f16342l0 = this.f16337k;
            if (this.G1 == null) {
                Q();
                return;
            }
            return;
        }
        TLRPC.Message message = this.f16337k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (!z10) {
                    this.f16348n0 = new ArrayList(photo.sizes);
                } else {
                    ArrayList arrayList12 = this.f16348n0;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i10 = 0; i10 < this.f16348n0.size(); i10++) {
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.f16348n0.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i11);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                if (photo.dc_id != 0 && (arrayList11 = this.f16348n0) != null) {
                    int size = arrayList11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) this.f16348n0.get(i12)).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.f16342l0 = this.f16337k.action.photo;
            }
        } else if (this.f16347n == null && this.f16351o == null) {
            TLRPC.Photo photo2 = null;
            if (o1(message) != null && !(o1(this.f16337k) instanceof TLRPC.TL_messageMediaEmpty)) {
                if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo3 = o1(this.f16337k).photo;
                    if (z10 && ((arrayList10 = this.f16348n0) == null || arrayList10.size() == photo3.sizes.size())) {
                        ArrayList arrayList13 = this.f16348n0;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            for (int i13 = 0; i13 < this.f16348n0.size(); i13++) {
                                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f16348n0.get(i13);
                                if (photoSize3 != null) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= photo3.sizes.size()) {
                                            break;
                                        }
                                        TLRPC.PhotoSize photoSize4 = photo3.sizes.get(i14);
                                        if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                            if (photoSize4.type.equals(photoSize3.type)) {
                                                photoSize3.location = photoSize4.location;
                                                break;
                                            } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                                this.f16348n0.set(i13, photoSize4);
                                                break;
                                            }
                                        }
                                        i14++;
                                    }
                                }
                            }
                        }
                    } else {
                        this.f16348n0 = new ArrayList(photo3.sizes);
                    }
                    this.f16342l0 = o1(this.f16337k).photo;
                    return;
                } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Photo photo4 = ((TLRPC.TL_messageMediaDocument) o1(this.f16337k)).video_cover;
                    if (photo4 != null) {
                        if (z10 && ((arrayList9 = this.f16348n0) == null || arrayList9.size() == photo4.sizes.size())) {
                            ArrayList arrayList14 = this.f16348n0;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                for (int i15 = 0; i15 < this.f16348n0.size(); i15++) {
                                    TLRPC.PhotoSize photoSize5 = (TLRPC.PhotoSize) this.f16348n0.get(i15);
                                    if (photoSize5 != null) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= photo4.sizes.size()) {
                                                break;
                                            }
                                            TLRPC.PhotoSize photoSize6 = photo4.sizes.get(i16);
                                            if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                                if (photoSize6.type.equals(photoSize5.type)) {
                                                    photoSize5.location = photoSize6.location;
                                                    break;
                                                } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                                    this.f16348n0.set(i15, photoSize6);
                                                    break;
                                                }
                                            }
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f16348n0 = new ArrayList(photo4.sizes);
                        }
                        this.f16342l0 = photo4;
                        return;
                    }
                    TLRPC.Document F0 = F0();
                    if (W2(F0)) {
                        if (z10 && (arrayList8 = this.f16348n0) != null) {
                            if (!arrayList8.isEmpty()) {
                                a6(this.f16348n0, F0.thumbs);
                            }
                        } else {
                            ArrayList arrayList15 = new ArrayList();
                            this.f16348n0 = arrayList15;
                            arrayList15.addAll(F0.thumbs);
                        }
                        this.f16342l0 = F0;
                        return;
                    }
                    return;
                } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame) {
                    TLRPC.Document document = o1(this.f16337k).game.document;
                    if (document != null && W2(document)) {
                        if (!z10) {
                            ArrayList arrayList16 = new ArrayList();
                            this.f16348n0 = arrayList16;
                            arrayList16.addAll(document.thumbs);
                        } else {
                            ArrayList arrayList17 = this.f16348n0;
                            if (arrayList17 != null && !arrayList17.isEmpty()) {
                                a6(this.f16348n0, document.thumbs);
                            }
                        }
                        this.f16342l0 = document;
                    }
                    TLRPC.Photo photo5 = o1(this.f16337k).game.photo;
                    if (photo5 != null) {
                        if (z10 && (arrayList7 = this.f16352o0) != null) {
                            if (!arrayList7.isEmpty()) {
                                a6(this.f16352o0, photo5.sizes);
                            }
                        } else {
                            this.f16352o0 = new ArrayList(photo5.sizes);
                        }
                        this.m0 = photo5;
                    }
                    if (this.f16348n0 == null && (arrayList6 = this.f16352o0) != null) {
                        this.f16348n0 = arrayList6;
                        this.f16352o0 = null;
                        this.f16342l0 = this.m0;
                        this.m0 = null;
                        return;
                    }
                    return;
                } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) {
                    TLRPC.Photo photo6 = o1(this.f16337k).webpage.photo;
                    TLRPC.Document document2 = o1(this.f16337k).webpage.document;
                    if (photo6 != null) {
                        if (z10 && (arrayList5 = this.f16348n0) != null) {
                            if (!arrayList5.isEmpty()) {
                                a6(this.f16348n0, photo6.sizes);
                            }
                        } else {
                            this.f16348n0 = new ArrayList(photo6.sizes);
                        }
                        this.f16342l0 = photo6;
                        return;
                    } else if (document2 != null && W2(document2)) {
                        if (!z10) {
                            ArrayList arrayList18 = new ArrayList();
                            this.f16348n0 = arrayList18;
                            arrayList18.addAll(document2.thumbs);
                        } else {
                            ArrayList arrayList19 = this.f16348n0;
                            if (arrayList19 != null && !arrayList19.isEmpty()) {
                                a6(this.f16348n0, document2.thumbs);
                            }
                        }
                        this.f16342l0 = document2;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            TLRPC.Message message2 = this.f16337k;
            if (message2 != null && (richMessage = message2.rich_message) != null) {
                TLRPC.Document a02 = a0(richMessage.blocks, richMessage);
                TL_iv.RichMessage richMessage2 = this.f16337k.rich_message;
                if (richMessage2 != null) {
                    photo2 = W(richMessage2.blocks, richMessage2);
                }
                if (a02 != null) {
                    if (W2(a02)) {
                        if (!z10) {
                            ArrayList arrayList20 = new ArrayList();
                            this.f16348n0 = arrayList20;
                            arrayList20.addAll(a02.thumbs);
                        } else {
                            ArrayList arrayList21 = this.f16348n0;
                            if (arrayList21 != null && !arrayList21.isEmpty()) {
                                a6(this.f16348n0, a02.thumbs);
                            }
                        }
                        this.f16342l0 = a02;
                        return;
                    }
                    return;
                } else if (photo2 != null) {
                    if (z10 && (arrayList4 = this.f16348n0) != null) {
                        if (!arrayList4.isEmpty()) {
                            a6(this.f16348n0, photo2.sizes);
                        }
                    } else {
                        this.f16348n0 = new ArrayList(photo2.sizes);
                    }
                    this.f16342l0 = photo2;
                    if (this.G1 == null) {
                        Q();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            TLRPC.MessageMedia messageMedia = this.Y0;
            if (messageMedia != null) {
                TLRPC.Photo photo7 = messageMedia.photo;
                TLRPC.Document document3 = messageMedia.document;
                if (photo7 != null) {
                    if (z10 && (arrayList3 = this.f16348n0) != null) {
                        if (!arrayList3.isEmpty()) {
                            a6(this.f16348n0, photo7.sizes);
                        }
                    } else {
                        this.f16348n0 = new ArrayList(photo7.sizes);
                    }
                    this.f16342l0 = photo7;
                } else if (document3 != null && W2(document3)) {
                    if (!z10) {
                        ArrayList arrayList22 = new ArrayList();
                        this.f16348n0 = arrayList22;
                        arrayList22.addAll(document3.thumbs);
                    } else {
                        ArrayList arrayList23 = this.f16348n0;
                        if (arrayList23 != null && !arrayList23.isEmpty()) {
                            a6(this.f16348n0, document3.thumbs);
                        }
                    }
                    this.f16342l0 = document3;
                }
            } else if (this.T0 != null) {
                if (z10 && (arrayList2 = this.f16348n0) != null) {
                    if (!arrayList2.isEmpty()) {
                        a6(this.f16348n0, this.T0.sizes);
                    }
                } else {
                    this.f16348n0 = new ArrayList(this.T0.sizes);
                }
                this.f16342l0 = this.T0;
                if (this.G1 == null) {
                    Q();
                }
            }
        } else if (TextUtils.isEmpty(this.f16375u) && W2(this.f16347n)) {
            if (z10 && (arrayList = this.f16348n0) != null) {
                if (!arrayList.isEmpty()) {
                    a6(this.f16348n0, this.f16347n.thumbs);
                }
            } else {
                ArrayList arrayList24 = new ArrayList();
                this.f16348n0 = arrayList24;
                arrayList24.addAll(this.f16347n.thumbs);
            }
            this.f16342l0 = this.f16347n;
        }
    }

    public final java.lang.CharSequence r1(org.telegram.tgnet.TLRPC.MessageMedia r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.r1(org.telegram.tgnet.TLRPC$MessageMedia):java.lang.CharSequence");
    }

    public final boolean r2() {
        TLRPC.MessageMedia messageMedia = this.f16337k.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.f16337k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return false;
        }
        return true;
    }

    public final boolean r4() {
        if (this.P0 != null) {
            return true;
        }
        return false;
    }

    public final oj r5() {
        TLRPC.Message message;
        jj jjVar = this.C;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            TLRPC.SuggestedPost suggestedPost = message.suggested_post;
            if (suggestedPost != null) {
                return oj.b(suggestedPost);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                return new oj(sf.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
            }
        }
        return null;
    }

    public boolean s(TLRPC.Chat chat, boolean z10) {
        TLRPC.Message message;
        boolean x42 = x4();
        int i10 = this.I1;
        if (!x42 || (message = this.f16337k) == null || message.dialog_id != d20.i(i10).e()) {
            if ((this.T == 0 && this.P0 == null && r(i10, z10, this.f16337k, chat)) || c3(this.f16337k)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final android.text.SpannableStringBuilder s0(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.s0(java.lang.String, java.lang.String):android.text.SpannableStringBuilder");
    }

    public final jj s1(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message = null;
        r2 = null;
        TLRPC.Photo photo = null;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            long j10 = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
            if (webPage.cached_page != null) {
                TLRPC.Photo photo2 = webPage.photo;
                if (photo2 != null && photo2.f19817id == j10) {
                    photo = photo2;
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= webPage.cached_page.photos.size()) {
                            break;
                        }
                        TLRPC.Photo photo3 = webPage.cached_page.photos.get(i10);
                        if (photo3.f19817id == j10) {
                            photo = photo3;
                            break;
                        }
                        i10++;
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
                tL_message.realId = f1();
                tL_message.f19814id = Utilities.f14519b.nextInt();
                TLRPC.Message message = this.f16337k;
                tL_message.date = message.date;
                tL_message.peer_id = message.peer_id;
                tL_message.out = message.out;
                tL_message.from_id = message.from_id;
                return new jj(this.I1, tL_message, false, true);
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
        tL_message.realId = f1();
        tL_message.f19814id = Utilities.f14519b.nextInt();
        TLRPC.Message message2 = this.f16337k;
        tL_message.date = message2.date;
        tL_message.peer_id = message2.peer_id;
        tL_message.out = message2.out;
        tL_message.from_id = message2.from_id;
        return new jj(this.I1, tL_message, false, true);
    }

    public final boolean s2() {
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean s4() {
        TLRPC.Message message = this.f16337k;
        if (message != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean t() {
        if (!l4() && !e3(this.f16337k)) {
            if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaDocument) {
                if (R4(this.f16337k) || t4() || J2() || h4()) {
                    return false;
                }
                return true;
            } else if (F3()) {
                return true;
            }
        }
        return false;
    }

    public final CharSequence t1(ej ejVar, int[] iArr) {
        String str;
        if (this.J2 || this.E0) {
            return null;
        }
        if (this.K2) {
            return this.v;
        }
        int i10 = this.D;
        if (i10 == 19 || i10 == 15 || i10 == 13) {
            return null;
        }
        CharSequence O8 = org.telegram.ui.un.O8(this, ejVar, iArr);
        if (O8 == null && T3()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.f16337k.media).poll;
                StringBuilder sb2 = new StringBuilder(poll.question.text);
                sb2.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i11);
                    i11++;
                    sb2.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    if (tL_textWithEntities == null) {
                        str = "";
                    } else {
                        str = tL_textWithEntities.text;
                    }
                    sb2.append(str);
                }
                O8 = sb2.toString();
            } catch (Exception unused) {
            }
        }
        if (O8 == null && G3(this.f16337k, true)) {
            O8 = org.telegram.ui.un.Q8(0L, this, false);
        }
        if (O8 != null && k6.d(O8)) {
            return null;
        }
        return O8;
    }

    public final boolean t2() {
        TLRPC.MessageMedia messageMedia;
        if ((!this.f16328h2 && (((messageMedia = this.f16337k.media) != null && messageMedia.spoiler) || m5())) || x3()) {
            return true;
        }
        return false;
    }

    public final boolean t4() {
        int i10 = this.D;
        if (i10 != 1000) {
            if (i10 != 13) {
                return false;
            }
            return true;
        } else if (!u4(F0()) && !N4(F0())) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean u(org.telegram.tgnet.TLRPC.Chat r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.u(org.telegram.tgnet.TLRPC$Chat):boolean");
    }

    public final String u0(boolean z10) {
        return t0(F0(), z10);
    }

    public final String u1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            return F0.mime_type;
        }
        if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaInvoice) {
            TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) o1(this.f16337k)).webPhoto;
            if (webDocument != null) {
                return webDocument.mime_type;
            }
            return "";
        } else if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaPhoto) {
            return "image/jpeg";
        } else {
            if ((o1(this.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && o1(this.f16337k).webpage.photo != null) {
                return "image/jpeg";
            }
            return "";
        }
    }

    public final boolean u2() {
        TLRPC.Message message = this.f16337k;
        if (message != null && message.entities != null) {
            for (int i10 = 0; i10 < this.f16337k.entities.size(); i10++) {
                if (!(this.f16337k.entities.get(i10) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
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
        TLRPC.Message message = this.f16337k;
        if (!message.video_processing_pending) {
            if (chat != null || message.peer_id.channel_id == 0 || (chat = vp.r1(this.I1).L0(Long.valueOf(message.peer_id.channel_id))) != null) {
                if (w3.T(chat) && !chat.megagroup && !chat.creator) {
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

    public final boolean v2(sg.o0 o0Var) {
        if (w2() && o0Var != null) {
            for (int i10 = 0; i10 < this.f16337k.reactions.results.size(); i10++) {
                if (o0Var.f(this.f16337k.reactions.results.get(i10).reaction)) {
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

    public final boolean w() {
        int i10;
        if (b4(this.f16337k) || (i10 = this.D) == 30 || i10 == 31 || i10 == 32 || i10 == 33 || i10 == 35 || i10 == 37 || (this.f16337k instanceof TLRPC.TL_message_secret) || m5() || C3() || this.D == 16 || r4() || this.f16337k.noforwards) {
            return false;
        }
        return true;
    }

    public final TLRPC.Chat w0(AbstractMap abstractMap, a0.h hVar, long j10) {
        TLRPC.Chat chat;
        if (abstractMap != null) {
            chat = (TLRPC.Chat) abstractMap.get(Long.valueOf(j10));
        } else if (hVar != null) {
            chat = (TLRPC.Chat) hVar.f(j10);
        } else {
            chat = null;
        }
        if (chat == null) {
            return vp.r1(this.I1).L0(Long.valueOf(j10));
        }
        return chat;
    }

    public final boolean w2() {
        TLRPC.TL_messageReactions tL_messageReactions = this.f16337k.reactions;
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

    public final boolean w5() {
        if (!S4() && F0() != null && of.c.f14157i.contains(F0().mime_type) && F0().size < vp.r1(this.I1).f18843m4 * 2) {
            for (int i10 = 0; i10 < F0().attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = F0().attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        return y(F0());
    }

    public final long x0() {
        TLRPC.Peer peer = this.f16337k.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public final java.lang.String x1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.x1(boolean):java.lang.String");
    }

    public final boolean x2() {
        TLRPC.MessageReplies messageReplies = this.f16337k.replies;
        if (messageReplies != null && messageReplies.replies > 0) {
            return true;
        }
        return false;
    }

    public final boolean x3() {
        if (p4() && !vp.r1(this.I1).P4()) {
            return true;
        }
        return false;
    }

    public final boolean x4() {
        if (this.f16341l != null) {
            return true;
        }
        return false;
    }

    public final ArrayList y0() {
        ArrayList arrayList = new ArrayList();
        if (this.f16337k.reactions != null) {
            for (int i10 = 0; i10 < this.f16337k.reactions.results.size(); i10++) {
                if (this.f16337k.reactions.results.get(i10).chosen) {
                    arrayList.add(sg.o0.d(this.f16337k.reactions.results.get(i10).reaction));
                }
            }
        }
        return arrayList;
    }

    public final boolean y2() {
        TLRPC.MessageMedia messageMedia = this.f16337k.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.f16337k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return false;
        }
        return true;
    }

    public final boolean y3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.f16337k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.imported) {
            return true;
        }
        return false;
    }

    public final boolean y4() {
        TLRPC.Message message = this.f16337k;
        if (message != null && (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if (c3(this.f16337k)) {
            return false;
        }
        TLRPC.Message message = this.f16337k;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public final String z1(boolean z10) {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (!z10) {
                            return null;
                        }
                        return cd.s(this.f16337k.date, true);
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String B = b8.B(F0);
                    if (TextUtils.isEmpty(B) && z10) {
                        return cd.L0(2131753899, null);
                    }
                    return B;
                } else if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    if (b4(this.f16337k)) {
                        StringBuilder sb2 = new StringBuilder("/");
                        String K1 = K1(this.f16337k);
                        if (K1 == null) {
                            ag.h3 c10 = ag.i3.f(this.I1).c(J1(this.f16337k));
                            if (c10 != null) {
                                K1 = c10.f552b;
                            } else {
                                K1 = "";
                            }
                        }
                        sb2.append(K1);
                        return cd.a0(null, null, 2131752726, sb2.toString());
                    }
                    return cd.s(this.f16337k.date, true);
                }
            }
            String B2 = b8.B(F0);
            if (!TextUtils.isEmpty(B2)) {
                return B2;
            }
        }
        return cd.L0(2131753899, null);
    }

    public final boolean z2() {
        int i10;
        if (d1() != 0) {
            ArrayList arrayList = this.f16348n0;
            if ((arrayList != null && !arrayList.isEmpty()) || (i10 = this.D) == 3 || i10 == 1 || I3() || U2()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean z3() {
        return o1(this.f16337k) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public final boolean z4() {
        if (this.D == 24 && !g3()) {
            return true;
        }
        return false;
    }

    public final Spannable z5(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return A5(charSequence, O0(), fontMetricsInt, false);
    }

    public jj(int i10, TLRPC.Message message, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.D = 1000;
        this.f16304c0 = -1.0f;
        this.H0 = -1L;
        this.f16305c1 = -1;
        this.f16309d1 = -1L;
        this.Z1 = true;
        this.f16324g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        this.f16294a = z10 ? 2 : 1;
        this.I1 = i10;
        this.f16298b = str2;
        this.f16303c = str3;
        this.v = str;
        this.f16337k = message;
        this.f16316f = z11;
        this.f16321g = z12;
        this.f16329i = z13;
    }

    public jj(int i10, TLRPC.Message message, boolean z10, boolean z11) {
        this(i10, message, null, null, null, null, null, z10, z11, 0L);
    }

    public jj(int i10, TLRPC.Message message, jj jjVar, boolean z10, boolean z11) {
        this(i10, message, jjVar, null, null, null, null, z10, z11, 0L);
    }

    public jj(int i10, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z10, boolean z11) {
        this(i10, message, abstractMap, abstractMap2, z10, z11, 0L);
    }

    public jj(int i10, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z10, boolean z11, long j10) {
        this(i10, message, null, abstractMap, abstractMap2, null, null, z10, z11, j10);
    }

    public jj(int i10, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z10, boolean z11) {
        this(i10, message, null, null, null, hVar, hVar2, z10, z11, 0L, false, false, false, 0);
    }

    public jj(int i10, TLRPC.Message message, jj jjVar, AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10) {
        this(i10, message, jjVar, abstractMap, abstractMap2, hVar, hVar2, z10, z11, j10, false, false, false, 0);
    }

    public jj(int i10, TLRPC.Message message, jj jjVar, AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14, int i11) {
        AbstractMap abstractMap3;
        a0.h hVar3;
        ?? r15;
        TextPaint textPaint;
        this.D = 1000;
        this.f16304c0 = -1.0f;
        this.H0 = -1L;
        this.f16305c1 = -1;
        this.f16309d1 = -1L;
        this.Z1 = true;
        this.f16324g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        org.telegram.ui.ActionBar.t6.Q();
        this.f16328h2 = z12;
        this.f16332i2 = z13;
        this.f16343l2 = z14 || B0(message) == d20.i(i10).e();
        this.f16350n2 = i11;
        this.I1 = i10;
        this.f16337k = message;
        this.C = jjVar;
        this.T = j10;
        this.l1 = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            hVar3 = hVar;
            r15 = 0;
            abstractMap3 = abstractMap;
            this.C = new jj(i10, message2, null, abstractMap3, abstractMap2, hVar3, hVar2, false, z11, j10);
        } else {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            e2(abstractMap3, hVar3, peer.user_id);
        }
        Z5(abstractMap3, abstractMap2, hVar3, hVar2);
        K5();
        if (z10) {
            e6(r15);
        }
        i5();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f16337k.date * 1000);
        int i12 = gregorianCalendar.get(6);
        int i13 = gregorianCalendar.get(1);
        int i14 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i13);
        Integer valueOf2 = Integer.valueOf(i14);
        Integer valueOf3 = Integer.valueOf(i12);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.W = String.format("%d_%02d_%02d", objArr);
        this.X = (i12 * 1000000) + (i14 * 10000) + i13;
        Integer valueOf4 = Integer.valueOf(i13);
        Integer valueOf5 = Integer.valueOf(i14);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.Y = String.format("%d_%02d", objArr2);
        P(r15);
        k0();
        if (z10) {
            if (o1(this.f16337k) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = org.telegram.ui.ActionBar.t6.f21291x2;
            } else {
                textPaint = org.telegram.ui.ActionBar.t6.f21130o2;
            }
            int[] iArr = i() ? new int[1] : null;
            CharSequence m10 = k6.m(this.v, textPaint.getFontMetricsInt(), r15, iArr, r15);
            this.v = m10;
            Spannable z52 = z5(m10, textPaint.getFontMetricsInt());
            this.v = z52;
            if (iArr != null && iArr[r15] > 1) {
                C5(z52, iArr);
            }
            H(iArr);
            G();
            K5();
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                this.F1 = v5.f(F0, org.telegram.ui.ActionBar.t6.Zc, 1.0f, null);
            }
        }
        this.Q1 = z10;
        r0(r15);
        if (z11) {
            K(true);
        }
    }

    public jj(int r37, org.telegram.tgnet.TLRPC.TL_channelAdminLogEvent r38, java.util.ArrayList r39, java.util.HashMap r40, org.telegram.tgnet.TLRPC.Chat r41, int[] r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jj.<init>(int, org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent, java.util.ArrayList, java.util.HashMap, org.telegram.tgnet.TLRPC$Chat, int[], boolean):void");
    }
}
