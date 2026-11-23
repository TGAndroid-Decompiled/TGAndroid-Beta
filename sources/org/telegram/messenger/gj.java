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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
public class gj {
    public static Pattern f24159m3;
    public static Pattern f24160n3;
    public static Pattern f24161o3;
    public static final String[] f24162p3 = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    public static Pattern f24163q3;
    public static CharSequence[] f24164r3;
    public static SpannableStringBuilder f24165s3;
    public static SpannableStringBuilder f24166t3;
    public CharSequence A;
    public ff A0;
    public boolean A1;
    public boolean A2;
    public SpannableString B;
    public boolean B0;
    public ArrayList B1;
    public ArrayList B2;
    public gj C;
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
    public final mz H1;
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
    public cj N1;
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
    public int S;
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
    public int f24167a;
    public boolean f24168a0;
    public TLRPC.MessageMedia f24169a1;
    public ArrayList f24170a2;
    public Integer f24171a3;
    public final String f24172b;
    public float f24173b0;
    public boolean f24174b1;
    public boolean f24175b2;
    public TLRPC.TL_webPage f24176b3;
    public String f24177c;
    public float f24178c0;
    public boolean f24179c1;
    public CharSequence f24180c2;
    public boolean f24181c3;
    public long d;
    public int f24182d0;
    public boolean f24183d1;
    public int d2;
    public Boolean f24184d3;
    public long f24185e;
    public long f24186e0;
    public int f24187e1;
    public gc f24188e2;
    public ArrayList f24189e3;
    public final boolean f24190f;
    public long f24191f0;
    public long f24192f1;
    public Object f24193f2;
    public TLRPC.Document f24194f3;
    public final boolean f24195g;
    public float f24196g0;
    public TLRPC.TL_peerColorCollectible f24197g1;
    public boolean f24198g2;
    public h61 f24199g3;
    public Boolean h;
    public float f24200h0;
    public boolean f24201h1;
    public TLRPC.Peer f24202h2;
    public h61 f24203h3;
    public final boolean f24204i;
    public int f24205i0;
    public boolean f24206i1;
    public final Drawable[] f24207i2;
    public h61 f24208i3;
    public fi.a6 f24209j;
    public int f24210j0;
    public TLRPC.TL_forumTopic f24211j1;
    public final boolean f24212j2;
    public boolean j3;
    public TLRPC.Message f24213k;
    public double f24214k0;
    public boolean f24215k1;
    public final boolean f24216k2;
    public Integer f24217k3;
    public final TL_stories.StoryItem f24218l;
    public boolean f24219l0;
    public boolean l1;
    public boolean f24220l2;
    public Float f24221l3;
    public fi.o6 f24222m;
    public boolean m0;
    public int f24223m1;
    public Drawable f24224m2;
    public TLRPC.Document f24225n;
    public TLObject f24226n0;
    public boolean n1;
    public boolean f24227n2;
    public Long f24228o;
    public TLRPC.Photo f24229o0;
    public boolean f24230o1;
    public boolean f24231o2;
    public boolean f24232p;
    public ArrayList f24233p0;
    public boolean f24234p1;
    public final int f24235p2;
    public boolean f24236q;
    public ArrayList f24237q0;
    public boolean f24238q1;
    public b3.j f24239q2;
    public boolean f24240r;
    public f20 f24241r0;
    public boolean f24242r1;
    public byte[] f24243r2;
    public TLRPC.VideoSize f24244s;
    public ArrayList f24245s0;
    public boolean f24246s1;
    public boolean f24247s2;
    public boolean f24248t;
    public boolean f24249t0;
    public boolean f24250t1;
    public Boolean f24251t2;
    public String f24252u;
    public boolean f24253u0;
    public boolean f24254u1;
    public int f24255u2;
    public CharSequence v;
    public boolean f24256v0;
    public boolean f24257v1;
    public int f24258v2;
    public CharSequence f24259w;
    public long f24260w0;
    public boolean f24261w1;
    public boolean f24262w2;
    public SpannableStringBuilder f24263x;
    public int f24264x0;
    public ArrayList f24265x1;
    public float f24266x2;
    public CharSequence f24267y;
    public boolean f24268y0;
    public CharSequence f24269y1;
    public fv f24270y2;
    public CharSequence f24271z;
    public boolean f24272z0;
    public ArrayList f24273z1;
    public TL_iv.RichMessage f24274z2;

    public gj(int i7, TL_stories.StoryItem storyItem) {
        this.D = 1000;
        this.f24178c0 = -1.0f;
        this.J0 = -1L;
        this.f24187e1 = -1;
        this.f24192f1 = -1L;
        this.f24175b2 = true;
        this.f24207i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.K1 = i7;
        this.f24218l = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.f24213k = tL_message;
            tL_message.f28455id = storyItem.messageId;
            tL_message.realId = storyItem.f28673id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.f24233p0 = new ArrayList();
        this.f24237q0 = new ArrayList();
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

    public static long B0(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message.dialog_id == 0 && (peer = message.peer_id) != null) {
            long j3 = peer.chat_id;
            if (j3 != 0) {
                message.dialog_id = -j3;
            } else {
                long j10 = peer.channel_id;
                if (j10 != 0) {
                    message.dialog_id = -j10;
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

    public static long B1(TLRPC.Peer peer) {
        long j3;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j3 = peer.chat_id;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            j3 = peer.channel_id;
        } else {
            return peer.user_id;
        }
        return -j3;
    }

    public static boolean B4(gj gjVar) {
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f24213k;
            if ((message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Spannable B5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return C5(charSequence, arrayList, fontMetricsInt, z10, 1.2f, 0);
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

    public static boolean C4(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        i1(document);
        int size = document.attributes.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.f28454id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static Spannable C5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f10, int i7) {
        Spannable spannableString;
        int i10;
        g6 g6Var;
        org.telegram.ui.Components.y5 y5Var;
        g6 g6Var2;
        g6 g6Var3 = null;
        if (charSequence == null) {
            return null;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (arrayList != null) {
            if (cz.o() >= 2) {
                i10 = 100;
            } else {
                i10 = 50;
            }
            int i11 = i10 - i7;
            g6[] g6VarArr = (g6[]) spannableString.getSpans(0, spannableString.length(), g6.class);
            int i12 = 0;
            while (i12 < arrayList.size() && i11 > 0) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i12);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i13 = 0;
                    while (i13 < g6VarArr.length) {
                        g6 g6Var4 = g6VarArr[i13];
                        if (g6Var4 != null) {
                            int spanStart = spannableString.getSpanStart(g6Var4);
                            int spanEnd = spannableString.getSpanEnd(g6Var4);
                            int i14 = tL_messageEntityCustomEmoji.offset;
                            g6Var2 = g6Var3;
                            if (g0.B1(i14, tL_messageEntityCustomEmoji.length + i14, spanStart, spanEnd)) {
                                spannableString.removeSpan(g6Var4);
                                g6VarArr[i13] = g6Var2;
                            }
                        } else {
                            g6Var2 = g6Var3;
                        }
                        i13++;
                        g6Var3 = g6Var2;
                    }
                    g6Var = g6Var3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i15 = messageEntity.offset;
                        org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannableString.getSpans(i15, messageEntity.length + i15, org.telegram.ui.Components.y5.class);
                        if (y5VarArr != null && y5VarArr.length > 0) {
                            for (org.telegram.ui.Components.y5 y5Var2 : y5VarArr) {
                                spannableString.removeSpan(y5Var2);
                            }
                        }
                        if (tL_messageEntityCustomEmoji.document != null) {
                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document, f10, fontMetricsInt);
                        } else {
                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document_id, f10, fontMetricsInt);
                        }
                        y5Var.top = z10;
                        int i16 = messageEntity.offset;
                        spannableString.setSpan(y5Var, i16, messageEntity.length + i16, 33);
                        i11--;
                        i12++;
                        g6Var3 = g6Var;
                    }
                } else {
                    g6Var = g6Var3;
                }
                i12++;
                g6Var3 = g6Var;
            }
        }
        return spannableString;
    }

    public static boolean D(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_messageMediaPoll.results.results.get(i7).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswerVoters E1(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i7);
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
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean E4(gj gjVar) {
        TLRPC.Message message;
        if (gjVar == null || (message = gjVar.f24213k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionTopicCreate) && !(messageAction instanceof TLRPC.TL_messageActionTopicEdit)) {
            return false;
        }
        return true;
    }

    public static CharSequence E5(CharSequence charSequence, String str, TLObject tLObject) {
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
                charSequence2 = p10.q((TLRPC.User) tLObject).replace('\n', ' ');
                str2 = "" + user.f28583id;
            } else if (tLObject instanceof TLRPC.Chat) {
                charSequence2 = ((TLRPC.Chat) tLObject).title.replace('\n', ' ');
                str2 = "" + (-chat.f28434id);
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
                    charSequence2 = qg.c.k((TLRPC.ForumTopic) tLObject, null, null);
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
            t41 t41Var = new t41(p5.c.k("", str2));
            t41Var.f39484c = tLObject2;
            spannableStringBuilder.setSpan(t41Var, indexOf, charSequence2.length() + indexOf, 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static CharSequence F() {
        if (f24166t3 == null) {
            f24166t3 = new SpannableStringBuilder("c");
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131232161, 0);
            nqVar.I = 0.7f;
            nqVar.J = 0.7f;
            f24166t3.setSpan(nqVar, 0, 1, 33);
        }
        return f24166t3;
    }

    public static TLRPC.VideoSize F1(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i7 = 0; i7 < document.video_thumbs.size(); i7++) {
                if ("f".equals(document.video_thumbs.get(i7).type)) {
                    return document.video_thumbs.get(i7);
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

    public static boolean G3(TLRPC.Message message, boolean z10) {
        if (message != null && n1(message) != null && !(n1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            if (!z10 || !(n1(message) instanceof TLRPC.TL_messageMediaWebPage)) {
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
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int H1(int i7, TLRPC.Message message) {
        kg.u1 d;
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
        if (J1 == null || (d = kg.v1.f(i7).d(J1)) == null) {
            return 0;
        }
        return d.f18533a;
    }

    public static boolean H2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
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
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                if (document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeAudio) {
                    return !documentAttribute.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && w7.B(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Document K0(TLRPC.WebPage webPage, long j3) {
        if (webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.f28440id == j3) {
                return document;
            }
            for (int i7 = 0; i7 < webPage.cached_page.documents.size(); i7++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i7);
                if (document2.f28440id == j3) {
                    return document2;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean K2(TLRPC.Document document, boolean z10) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z10) {
                return true;
            }
            int size = document.attributes.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return J3(n1(message).webpage.document);
        }
        if (n1(message) != null && J3(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean K4(TLRPC.Document document) {
        int lastIndexOf;
        if (document != null) {
            String str = null;
            int i7 = 0;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i7 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        if (documentAttribute.round_message) {
                            break;
                        }
                        i10 = documentAttribute.f28441w;
                        i11 = documentAttribute.h;
                        z11 = true;
                    } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                        z10 = true;
                    } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                        str = documentAttribute.file_name;
                    }
                    i7++;
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
                    if (z10 && (i10 > 1280 || i11 > 1280)) {
                        z10 = false;
                    }
                    if (cz.D0 && !z11 && "video/x-matroska".equals(document.mime_type)) {
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
        int i7;
        if (z10) {
            str = "✅";
        } else {
            str = "☑️";
        }
        if (z10) {
            i7 = 2131231551;
        } else {
            i7 = 2131231550;
        }
        return T5(i7, str);
    }

    public static boolean L2(TLRPC.Message message) {
        boolean z10;
        boolean C = n5.C(message.dialog_id);
        if ((!C || message.stickerVerified == 1) && n1(message) != null) {
            TLRPC.Document document = n1(message).document;
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
        if (n1(message) == null || !N4(n1(message).document)) {
            if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                return K4(n1(message).webpage.document);
            }
            if (n1(message) != null && K4(n1(message).document)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean M(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i7 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            char c10 = 0;
            while (i7 < length) {
                char charAt = charSequence.charAt(i7);
                if (charAt >= '0' && charAt <= '9') {
                    i10++;
                    if (i10 >= 6) {
                        return true;
                    }
                    i11 = 0;
                    i12 = 0;
                } else if (charAt == ' ' || i10 <= 0) {
                    i10 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i7 != 0) {
                    if (i7 != 0) {
                        int i13 = i7 - 1;
                        if (charSequence.charAt(i13) != ' ') {
                            if (charSequence.charAt(i13) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i11 == 0) {
                            i11 = 1;
                        }
                        i11 = 0;
                    } else if (charAt == '/') {
                        if (i11 == 2) {
                            return true;
                        }
                        if (i11 == 1) {
                            i11++;
                        }
                        i11 = 0;
                    } else {
                        if (charAt == '.') {
                            if (i12 == 0 && c10 != ' ') {
                                i12++;
                            }
                        } else if (charAt != ' ' && c10 == '.' && i12 == 1) {
                            return true;
                        }
                        i12 = 0;
                    }
                    i7++;
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
            int i7 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z10 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i7 = documentAttribute.f28441w;
                    i10 = documentAttribute.h;
                }
            }
            if (z10 && i7 <= 1280 && i10 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static void M5(int i7, TLRPC.Message message) {
        boolean z10;
        boolean z11 = false;
        if ((i7 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        message.unread = z10;
        if ((i7 & 2) == 0) {
            z11 = true;
        }
        message.media_unread = z11;
    }

    public static boolean N2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static long Q1(long j3, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j10 = peer2.chat_id;
            if (j10 != 0) {
                return -j10;
            }
            long j11 = peer2.channel_id;
            if (j11 != 0) {
                return -j11;
            }
            return peer2.user_id;
        } else if (message.from_id.user_id != j3) {
            return 0L;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                return n5.o(peer);
            }
            if ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) {
                return 2666000L;
            }
            return j3;
        }
    }

    public static boolean Q2(int i7, gj gjVar) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia m12 = m1(gjVar);
        if ((m12 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) m12).todo) != null && todoList.list != null) {
            for (int i10 = 0; i10 < tL_messageMediaToDo.completions.size(); i10++) {
                if (tL_messageMediaToDo.completions.get(i10).f28580id == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Q4(TLRPC.Document document) {
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static void R(Spanned spanned, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        Object[] objArr = (ih0[]) spanned.getSpans(0, spanned.length(), ih0.class);
        int i14 = 0;
        while (true) {
            int i15 = 1;
            if (i14 >= objArr.length) {
                break;
            }
            ih0 ih0Var = objArr[i14];
            ih0Var.f36256a.f36502b = false;
            int spanStart = spanned.getSpanStart(ih0Var);
            int spanEnd = spanned.getSpanEnd(objArr[i14]);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i12 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i12 = 0;
            }
            if (objArr[i14].f36256a.f36504e) {
                i15 = 16;
            }
            hashMap.put(valueOf, Integer.valueOf(i12 | i15));
            treeSet.add(Integer.valueOf(spanEnd));
            Integer valueOf2 = Integer.valueOf(spanEnd);
            if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                i13 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
            } else {
                i13 = 0;
            }
            hashMap.put(valueOf2, Integer.valueOf(i13 | 2));
            i14++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i11) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        Object[] objArr2 = (qi.g[]) spanned.getSpans(0, spanned.length(), qi.g.class);
        for (int i16 = 0; i16 < objArr2.length; i16++) {
            int spanStart2 = spanned.getSpanStart(objArr2[i16]);
            int spanEnd2 = spanned.getSpanEnd(objArr2[i16]);
            treeSet.add(Integer.valueOf(spanStart2));
            Integer valueOf3 = Integer.valueOf(spanStart2);
            if (hashMap.containsKey(Integer.valueOf(spanStart2))) {
                i7 = ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue();
            } else {
                i7 = 0;
            }
            hashMap.put(valueOf3, Integer.valueOf(i7 | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            Integer valueOf4 = Integer.valueOf(spanEnd2);
            if (hashMap.containsKey(Integer.valueOf(spanEnd2))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue();
            } else {
                i10 = 0;
            }
            hashMap.put(valueOf4, Integer.valueOf(i10 | 8));
        }
        Iterator it2 = treeSet.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z14 = false;
        int i20 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i19 != intValue3) {
                int i21 = intValue3 - 1;
                if (i21 >= 0 && i21 < spanned.length() && spanned.charAt(i21) == '\n') {
                    intValue3--;
                }
                int i22 = intValue3;
                if ((intValue4 & 8) != 0 && i18 < objArr2.length) {
                    str = objArr2[i18].f56224a;
                    i18++;
                } else {
                    str = null;
                }
                int i23 = i18;
                String str2 = str;
                if (i17 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i20 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                arrayList.add(new fj(i19, i22, z12, z13, z14, str2));
                i19 = i22 + 1;
                if (i19 >= spanned.length() || spanned.charAt(i22) != '\n') {
                    i19 = i22;
                }
                i18 = i23;
            }
            if ((intValue4 & 2) != 0) {
                i17--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i17++;
                if ((intValue4 & 16) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if ((intValue4 & 8) != 0) {
                i20--;
            }
            if ((intValue4 & 4) != 0) {
                i20++;
            }
        }
        if (i19 < spanned.length()) {
            int length = spanned.length();
            if (i17 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i20 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new fj(i19, length, z10, z11, z14, null));
        }
    }

    public static boolean R4(TLRPC.Message message) {
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return Q4(n1(message).webpage.document);
        }
        if (n1(message) != null && Q4(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean R5(TLRPC.Message message) {
        int i7;
        if ((message == null || message.media == null || ((!Q4(G0(message)) && !j4(message)) || message.media.ttl_seconds != Integer.MAX_VALUE)) && !(n1(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            if (message instanceof TLRPC.TL_message_secret) {
                if (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || L4(message)) && (i7 = message.ttl) > 0 && i7 <= 60) {
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

    public static int S(int i7) {
        if (f3(i7)) {
            return i7 & (-1879048193);
        }
        return i7;
    }

    public static boolean S3(TLRPC.Message message) {
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

    public static String T0(TLRPC.Message message) {
        TLRPC.PhotoSize w10;
        if (n1(message) instanceof TLRPC.TL_messageMediaDocument) {
            return w7.r(null, G0(message));
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = n1(message).photo.sizes;
            if (arrayList.size() > 0 && (w10 = w7.w(arrayList, g0.Z0(false), false, null, false)) != null) {
                return w7.r(null, w10);
            }
            return "";
        } else if ((n1(message) instanceof TLRPC.TL_messageMediaWebPage) && n1(message).webpage != null) {
            return w7.r(null, n1(message).webpage.document);
        } else {
            return "";
        }
    }

    public static SpannableStringBuilder T5(int i7, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(i7, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String U(TLRPC.Document document) {
        return V(document, "😀", null);
    }

    public static String U0(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize w10;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return w7.r(null, messageMedia.document);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
            if (arrayList.size() > 0 && (w10 = w7.w(arrayList, g0.Z0(false), false, null, false)) != null) {
                return w7.r(null, w10);
            }
            return "";
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            return w7.r(null, webPage.document);
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
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!m3(arrayList.get(i7))) {
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
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_messageMediaPoll.results.results.get(i7).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String V(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet o02 = si.d0(num.intValue()).o0(documentAttribute.stickerset, true);
                        StringBuilder sb2 = new StringBuilder("");
                        if (o02 != null && o02.packs != null) {
                            for (int i10 = 0; i10 < o02.packs.size(); i10++) {
                                TLRPC.TL_stickerPack tL_stickerPack = o02.packs.get(i10);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.f28440id))) {
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
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                if (document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean V3(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i7 = 0; i7 < tL_messages_stickerSet.documents.size(); i7++) {
                if (!m3(tL_messages_stickerSet.documents.get(i7))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo W(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    long j3 = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
                    Typeface typeface = g0.f24018a;
                    if (arrayList2 != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            TLRPC.Photo photo = arrayList2.get(i10);
                            if (photo != null && photo.f28458id == j3) {
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
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i7);
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
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_messageMediaPoll.results.results.get(i7).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswer X(gj gjVar, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia m12 = m1(gjVar);
        if ((m12 instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12).poll) != null && poll.answers != null) {
            for (int i7 = 0; i7 < tL_messageMediaPoll.poll.answers.size(); i7++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i7);
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
            return hd.N0(2131754288, null);
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < tL_chatReactionsSome.reactions.size(); i7++) {
                if (i7 != 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i7);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                    str = spannableStringBuilder2;
                } else {
                    str = "";
                }
                spannableStringBuilder.append(j6.m(str, null, false, null, 0));
            }
            return spannableStringBuilder;
        }
        return hd.N0(2131747982, null);
    }

    public static boolean X3(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i7 = 0; i7 < document.video_thumbs.size(); i7++) {
                if ("f".equals(document.video_thumbs.get(i7).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int Y(int i7, String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i7 == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i7 < str.length() && str.startsWith(str2, i7)) {
            return i7;
        }
        int indexOf = str.indexOf(str2, i7);
        int lastIndexOf = str.lastIndexOf(str2, i7);
        if (indexOf != -1 && (lastIndexOf == -1 || indexOf - i7 < i7 - lastIndexOf)) {
            return indexOf;
        }
        return lastIndexOf;
    }

    public static TLRPC.TodoItem Z(int i7, gj gjVar) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia m12 = m1(gjVar);
        if ((m12 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) m12).todo) != null && todoList.list != null) {
            for (int i10 = 0; i10 < tL_messageMediaToDo.todo.list.size(); i10++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                if (todoItem.f28581id == i7) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static long Z1(int i7, TLRPC.Message message, int i10) {
        long b22 = b2(i7, message, c8.dd.a(i10, 1), c8.dd.a(i10, 4));
        if (b22 == 0 && c8.dd.a(i10, 8)) {
            return -1L;
        }
        return b22;
    }

    public static void Z5(int i7, long j3, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i10, boolean z10, int i11) {
        int i12 = 0;
        while (i12 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i12).f28580id == i10) {
                tL_messageMediaToDo.completions.remove(i12);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i12--;
            }
            i12++;
        }
        if (z10) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.f28580id = i10;
            tL_todoCompletion.completed_by = np.u1(i7).B1(j3);
            tL_todoCompletion.date = i11;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    public static void a(Spannable spannable, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        b(spannable, arrayList, z10, false, z11, z12, 0);
    }

    public static TLRPC.Document a0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return g0.Z(((TL_iv.pageBlockVideo) pageBlock).video_id, richMessage.documents);
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

    public static long a2(int i7, TLRPC.Message message, boolean z10) {
        return b2(i7, message, z10, false);
    }

    public static boolean b(java.lang.CharSequence r21, java.util.ArrayList r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.b(java.lang.CharSequence, java.util.ArrayList, boolean, boolean, boolean, boolean, int):boolean");
    }

    public static void b0(ArrayList arrayList, long j3) {
        if (arrayList != null && !arrayList.isEmpty() && j3 != 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
                if (message instanceof TLRPC.TL_messageEmpty) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    message.peer_id = tL_peerChannel;
                    tL_peerChannel.channel_id = j3;
                }
            }
        }
    }

    public static long b2(int i7, TLRPC.Message message, boolean z10, boolean z11) {
        int i10;
        long e10 = k10.i(i7).e();
        if (z11) {
            return u1(message);
        }
        if ((message.flags & 1073741824) != 0 && n5.o(message.peer_id) == e10) {
            i10 = message.quick_reply_shortcut_id;
        } else if (!z10 && i7 >= 0 && n5.o(message.peer_id) == e10) {
            return Q1(e10, message);
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i10 = message.f28455id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null && messageReplyHeader.forum_topic) {
                    if ((message instanceof TLRPC.TL_messageService) && !(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                        int i11 = messageReplyHeader.reply_to_msg_id;
                        if (i11 == 0) {
                            i11 = messageReplyHeader.reply_to_top_id;
                        }
                        return i11;
                    }
                    int i12 = messageReplyHeader.reply_to_top_id;
                    if (i12 == 0) {
                        i12 = messageReplyHeader.reply_to_msg_id;
                    }
                    return i12;
                } else if (z10) {
                    return 1L;
                } else {
                    return 0L;
                }
            }
        }
        return i10;
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

    public static void c0(TL_iv.PageBlock pageBlock, int i7, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            int i10 = 0;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockKicker)) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    while (i10 < pageblockblockquoteblocks.blocks.size()) {
                        if (i10 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(pageblockblockquoteblocks.blocks.get(i10), i7, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i7) {
                            spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                        i10++;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    f0(((TL_iv.pageBlockDetails) pageBlock).title, i7, spannableStringBuilder, 0);
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                    f0(((TL_iv.pageBlockAuthorDate) pageBlock).author, i7, spannableStringBuilder, 0);
                    return;
                } else {
                    TLRPC.Document document = null;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        spannableStringBuilder.append((CharSequence) T5(2131231556, "fx")).append(" ").append((CharSequence) hd.N0(2131754863, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                        spannableStringBuilder.append((CharSequence) hd.N0(2131748497, null));
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageCaption != null && !(pageCaption.text instanceof TL_iv.textEmpty)) {
                            spannableStringBuilder.append("  ");
                            f0(pageBlock.caption.text, i7, spannableStringBuilder, 0);
                            return;
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        f0(pageBlock.text, i7, spannableStringBuilder, 4);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                        for (int i11 = 0; i11 < pageblocklist.items.size(); i11++) {
                            if (i11 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i11);
                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                if (tL_pageListItemText.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListItemText.checked)).append(" ");
                                } else {
                                    spannableStringBuilder.append("• ");
                                }
                                f0(tL_pageListItemText.text, i7, spannableStringBuilder, 0);
                            } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                                if (tL_pageListItemBlocks.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListItemBlocks.checked)).append(" ");
                                } else {
                                    spannableStringBuilder.append("• ");
                                }
                                for (int i12 = 0; i12 < tL_pageListItemBlocks.blocks.size(); i12++) {
                                    if (i12 > 0) {
                                        spannableStringBuilder.append("  ");
                                    }
                                    c0(tL_pageListItemBlocks.blocks.get(i12), i7, spannableStringBuilder, richMessage);
                                    if (spannableStringBuilder.length() >= i7) {
                                        spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                                        spannableStringBuilder.append("…");
                                        return;
                                    }
                                }
                            }
                            if (spannableStringBuilder.length() >= i7) {
                                spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                                spannableStringBuilder.append("…");
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                        for (int i13 = 0; i13 < pageblockorderedlist.items.size(); i13++) {
                            if (i13 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i13);
                            if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                                spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemText.num);
                                spannableStringBuilder.append(". ");
                                if (tL_pageListOrderedItemText.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemText.checked)).append(" ");
                                }
                                f0(tL_pageListOrderedItemText.text, i7, spannableStringBuilder, 0);
                            } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                                spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                                spannableStringBuilder.append(". ");
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemBlocks.checked)).append(" ");
                                }
                                for (int i14 = 0; i14 < tL_pageListOrderedItemBlocks.blocks.size(); i14++) {
                                    if (i14 > 0) {
                                        spannableStringBuilder.append("  ");
                                    }
                                    c0(tL_pageListOrderedItemBlocks.blocks.get(i14), i7, spannableStringBuilder, richMessage);
                                    if (spannableStringBuilder.length() >= i7) {
                                        spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                                        spannableStringBuilder.append("…");
                                        return;
                                    }
                                }
                            }
                            if (spannableStringBuilder.length() >= i7) {
                                spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                                spannableStringBuilder.append("…");
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        spannableStringBuilder.append((CharSequence) T5(2131231578, "⊞")).append(" ");
                        TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            f0(richText, i7, spannableStringBuilder, 0);
                            return;
                        } else {
                            spannableStringBuilder.append((CharSequence) hd.N0(2131754854, null));
                            return;
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                        TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                        while (true) {
                            if (i10 >= richMessage.documents.size()) {
                                break;
                            } else if (richMessage.documents.get(i10).f28440id == pageblockaudio.audio_id) {
                                document = richMessage.documents.get(i10);
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes);
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) g0.V(TLRPC.TL_documentAttributeFilename.class, document.attributes);
                            if (tL_documentAttributeAudio != null) {
                                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                                    spannableStringBuilder.append((CharSequence) T5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                                    return;
                                } else if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                                    spannableStringBuilder.append((CharSequence) T5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                                    return;
                                } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                    spannableStringBuilder.append((CharSequence) T5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                spannableStringBuilder.append((CharSequence) T5(2131231548, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                        TLRPC.Document Z = g0.Z(((TL_iv.pageBlockDocument) pageBlock).document_id, richMessage.documents);
                        if (Z != null) {
                            String B = w7.B(Z);
                            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) T5(2131232137, "📎")).append(" ");
                            if (TextUtils.isEmpty(B)) {
                                B = hd.N0(2131753972, null);
                            }
                            append.append((CharSequence) B);
                            return;
                        }
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                        c0(((TL_iv.pageBlockCover) pageBlock).cover, i7, spannableStringBuilder, richMessage);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        spannableStringBuilder.append((CharSequence) hd.N0(2131753945, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                        spannableStringBuilder.append((CharSequence) hd.N0(2131753930, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        spannableStringBuilder.append((CharSequence) hd.N0(2131754895, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        spannableStringBuilder.append((CharSequence) hd.N0(2131754855, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                        spannableStringBuilder.append((CharSequence) hd.N0(2131743588, null));
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        for (int i15 = 0; i15 < pageblockbuttonrow.buttons.size(); i15++) {
                            if (i15 > 0) {
                                spannableStringBuilder.append("  ");
                            }
                            f0(pageblockbuttonrow.buttons.get(i15).text, i7, spannableStringBuilder, 0);
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            f0(pageBlock.text, i7, spannableStringBuilder, 0);
            return;
        }
        f0(pageBlock.text, i7, spannableStringBuilder, 1);
    }

    public static int c2(TLRPC.Message message) {
        int i7 = !message.unread ? 1 : 0;
        if (!message.media_unread) {
            return i7 | 2;
        }
        return i7;
    }

    public static boolean c3(TLRPC.Message message) {
        if (message != null) {
            if (f3(message.f28455id) || message.ephemeralReceiverBotId != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void c6(ArrayList arrayList, List list) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i7);
            if (photoSize != null) {
                int size2 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) list.get(i10);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    public static void d(CharSequence charSequence, boolean z10) {
        e(z10, charSequence, true, false, false);
    }

    public static SpannableStringBuilder d0(TL_iv.RichMessage richMessage) {
        return e0(richMessage, 1024);
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

    public static void d6(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
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
                    for (int i7 = 0; i7 < size; i7++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i7);
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
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i10);
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                } else if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i11))) {
                                    pollAnswerVoters2.chosen = true;
                                    arrayList2.remove(i11);
                                    break;
                                } else {
                                    i11++;
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
                pollResults4.flags = c8.dd.b(pollResults4.flags, 2, false);
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

    public static void e(boolean z10, CharSequence charSequence, boolean z11, boolean z12, boolean z13) {
        if ((charSequence instanceof Spannable) && M(charSequence)) {
            try {
                g0.c((Spannable) charSequence, 1, z13, false);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            h(z10, charSequence, z11, 0, 0, z12);
        }
    }

    public static SpannableStringBuilder e0(TL_iv.RichMessage richMessage, int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i10);
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                c0(pageBlock, i7, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i7) {
                    spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static String e2(TLObject tLObject, ArrayList arrayList, int i7) {
        String str;
        String K;
        long j3;
        String str2;
        long j10;
        String str3 = null;
        if (tLObject == null) {
            str2 = "";
            j10 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (user.deleted) {
                    str = hd.N0(2131749135, null);
                } else {
                    str = i5.m(0, user.first_name, user.last_name);
                }
                K = p10.o(user);
                j3 = user.f28583id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                K = v3.K(chat, false);
                j3 = -chat.f28434id;
            }
            str2 = str;
            str3 = K;
            j10 = j3;
        }
        if (i7 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j10;
            tL_messageEntityMentionName.offset = i7;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (i7 >= 0) {
                TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
                tL_messageEntityMentionName2.user_id = j10;
                tL_messageEntityMentionName2.offset = str2.length() + i7 + 2;
                tL_messageEntityMentionName2.length = str3.length() + 1;
                arrayList.add(tL_messageEntityMentionName2);
            }
            return String.format("%1$s (@%2$s)", str2, str3);
        }
        return str2;
    }

    public static boolean e3(TLRPC.Message message) {
        if (c3(message) && !d5(message)) {
            return true;
        }
        return false;
    }

    public static void f0(TL_iv.RichText richText, int i7, SpannableStringBuilder spannableStringBuilder, int i10) {
        if (richText != null) {
            int length = spannableStringBuilder.length();
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
            } else if (richText instanceof TL_iv.textButton) {
                f0(richText.text, i7, spannableStringBuilder, i10);
            } else if (richText instanceof TL_iv.textBold) {
                f0(richText.text, i7, spannableStringBuilder, i10 | 1);
            } else if (richText instanceof TL_iv.textItalic) {
                f0(richText.text, i7, spannableStringBuilder, i10 | 2);
            } else if (richText instanceof TL_iv.textUnderline) {
                f0(richText.text, i7, spannableStringBuilder, i10 | 16);
            } else if (richText instanceof TL_iv.textStrike) {
                f0(richText.text, i7, spannableStringBuilder, i10 | 8);
            } else if (richText instanceof TL_iv.textFixed) {
                f0(richText.text, i7, spannableStringBuilder, i10 | 4);
            } else if (richText instanceof TL_iv.textSpoiler) {
                f0(richText.text, i7, spannableStringBuilder, i10 | 256);
            } else if (richText instanceof TL_iv.textUrl) {
                f0(richText.text, i7, spannableStringBuilder, i10);
                if (spannableStringBuilder.length() > length) {
                    ?? obj = new Object();
                    obj.f35337a = i10;
                    spannableStringBuilder.setSpan(new q41(richText.url, obj), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textEmail) {
                f0(richText.text, i7, spannableStringBuilder, i10);
                if (spannableStringBuilder.length() > length) {
                    ?? obj2 = new Object();
                    obj2.f35337a = i10;
                    spannableStringBuilder.setSpan(new u41("mailto:" + richText.email, obj2), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textMath) {
                spannableStringBuilder.append((CharSequence) T5(2131231556, "fx")).append(" ").append((CharSequence) hd.N0(2131754863, null));
            } else if (richText instanceof TL_iv.textPhone) {
                f0(richText.text, i7, spannableStringBuilder, i10);
                if (spannableStringBuilder.length() > length) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = pf.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = p5.c.k("+", d);
                    }
                    ?? obj3 = new Object();
                    obj3.f35337a = i10;
                    spannableStringBuilder.setSpan(new s41(p5.c.k("tel:", d), (fz0) obj3), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i11);
                    i11++;
                    f0(richText2, i7, spannableStringBuilder, i10);
                    if (spannableStringBuilder.length() >= i7) {
                        spannableStringBuilder.delete(i7, spannableStringBuilder.length());
                        spannableStringBuilder.append("…");
                        return;
                    }
                }
            }
            if (spannableStringBuilder.length() > length && i10 != 0) {
                ?? obj4 = new Object();
                obj4.f35337a = i10;
                spannableStringBuilder.setSpan(new gz0(obj4, 0), length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static int f1(TLRPC.BotInlineResult botInlineResult) {
        int j22 = (int) j2(botInlineResult.content);
        if (j22 == 0) {
            return (int) j2(botInlineResult.thumb);
        }
        return j22;
    }

    public static String f2(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                sb2.append("@");
                sb2.append((String) arrayList.get(i7));
                if (i7 < arrayList.size() - 1) {
                    sb2.append(", ");
                }
            }
            return sb2.toString();
        }
        return hd.N0(2131743416, null).toLowerCase();
    }

    public static boolean f3(int i7) {
        if ((i7 & 1879048192) == 1610612736) {
            return true;
        }
        return false;
    }

    public static void f6(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message != null && tL_messageReactions != null) {
            TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
            if (tL_messageReactions2 != null) {
                int size = tL_messageReactions2.results.size();
                boolean z10 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ReactionCount reactionCount = message.reactions.results.get(i7);
                    int size2 = tL_messageReactions.results.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i10);
                        if (ch.q0.g(reactionCount.reaction, reactionCount2.reaction)) {
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

    public static void g(int i7, TLRPC.MessageReactions messageReactions, int i10, long j3, boolean z10) {
        TLRPC.MessageReactor messageReactor = null;
        boolean z11 = false;
        TLRPC.ReactionCount reactionCount = null;
        for (int i11 = 0; i11 < messageReactions.results.size(); i11++) {
            if (messageReactions.results.get(i11).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i11);
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= messageReactions.top_reactors.size()) {
                break;
            } else if (messageReactions.top_reactors.get(i12).my) {
                messageReactor = messageReactions.top_reactors.get(i12);
                break;
            } else {
                i12++;
            }
        }
        if (reactionCount == null && i10 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z10;
            int max = Math.max(0, reactionCount.count + i10);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i10 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i10);
            int i13 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
            if (i13 == 0) {
                z11 = true;
            }
            messageReactor.anonymous = z11;
            if (j3 != 0 && i13 != 0) {
                messageReactor.peer_id = np.u1(i7).B1(j3);
            } else {
                messageReactor.peer_id = np.u1(i7).B1(k10.i(i7).e());
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static int[] g1(TLRPC.BotInlineResult botInlineResult) {
        int[] k22 = k2(botInlineResult.content);
        if (k22 == null) {
            int[] k23 = k2(botInlineResult.thumb);
            return k23 == null ? new int[]{0, 0} : k23;
        }
        return k22;
    }

    public static StaticLayout g5(CharSequence charSequence, TextPaint textPaint, int i7, float f10, float f11, boolean z10, Layout.Alignment alignment) {
        int i10;
        if (i7 <= 0) {
            i10 = 1;
        } else {
            i10 = i7;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setLineSpacing(f11, f10).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
            if (z10) {
                alignment2.setIncludePad(false);
            }
            if (i11 >= 28) {
                alignment2.setUseLineSpacingFromFallbacks(false);
            }
            StaticLayout build = alignment2.build();
            for (int i12 = 0; i12 < build.getLineCount(); i12++) {
                if (build.getLineRight(i12) > i10) {
                    StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setLineSpacing(f11, f10).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
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
        return new StaticLayout(charSequence, textPaint, i10, alignment, f10, f11, false);
    }

    public static void h(boolean r18, java.lang.CharSequence r19, boolean r20, int r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.h(boolean, java.lang.CharSequence, boolean, int, int, boolean):void");
    }

    public static CharSequence h0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        org.telegram.ui.ActionBar.m6.P();
        TextPaint textPaint = org.telegram.ui.ActionBar.m6.f29656s2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(g0.o());
            textPaint.setTextSize(g0.L(Math.max(16, cz.W0) - 2));
        }
        return j0(tL_textWithEntities, z10, false, textPaint);
    }

    public static int h2(TLRPC.TL_document tL_document) {
        if (tL_document != null) {
            int size = tL_document.attributes.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.f28441w;
                }
            }
        }
        return 0;
    }

    public static CharSequence h6() {
        if (f24164r3 == null) {
            f24164r3 = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f24164r3;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131231971, 0);
            nqVar.H = 0.9f;
            nqVar.f37950r = 0.0f;
            nqVar.f37951s = g0.L(1.0f);
            ((SpannableStringBuilder) f24164r3[0]).setSpan(nqVar, 0, 1, 33);
        }
        return f24164r3[0];
    }

    public static CharSequence i0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, TextPaint textPaint) {
        return j0(tL_textWithEntities, z10, false, textPaint);
    }

    public static TLRPC.InputStickerSet i1(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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

    public static boolean i4(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i7 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i7 = documentAttribute.f28441w;
                    i10 = documentAttribute.h;
                    z10 = documentAttribute.round_message;
                }
            }
            if (z10 && i7 <= 1280 && i10 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence j0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, boolean z11, TextPaint textPaint) {
        if (tL_textWithEntities != null && tL_textWithEntities.text != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            b(spannableStringBuilder, tL_textWithEntities.entities, z10, false, z11, false, 0);
            return B5(j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
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
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static boolean j4(TLRPC.Message message) {
        if ((n1(message) instanceof TLRPC.TL_messageMediaWebPage) && n1(message).webpage != null) {
            return i4(n1(message).webpage.document);
        }
        if (n1(message) != null && i4(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static int[] k2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.f28441w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.f28441w, documentAttribute.h};
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

    public static TLRPC.MessageMedia m1(gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f24213k) != null) {
            TLRPC.MessageMedia messageMedia = gjVar.f24169a1;
            if (messageMedia != null) {
                return messageMedia;
            }
            return n1(message);
        }
        return null;
    }

    public static CharSequence m2() {
        if (f24165s3 == null) {
            f24165s3 = new SpannableStringBuilder("g");
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131232162, 0);
            nqVar.I = 0.7f;
            nqVar.J = 0.7f;
            f24165s3.setSpan(nqVar, 0, 1, 33);
        }
        return f24165s3;
    }

    public static boolean m3(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static boolean m4(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || j4(message) || L4(message)) && n1(message).ttl_seconds != 0) {
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

    public static TLRPC.MessageMedia n1(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
        }
        return message.media;
    }

    public static boolean p(TLRPC.Document document) {
        if ((K2(document, true) || O4(document)) && qc.e(1)) {
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

    public static boolean r(int i7, boolean z10, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (message != null) {
            if (!v3.V(chat) || !(message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
                if (message.f28455id >= 0) {
                    if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
                        chat = np.u1(i7).O0(Long.valueOf(message.peer_id.channel_id));
                    }
                    if (v3.T(chat)) {
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
                                if (message.f28455id == 1 || !v3.y(13, chat)) {
                                    return false;
                                }
                            } else if (!z10) {
                                if (message.f28455id != 1) {
                                    if (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || (!tL_chatAdminRights.delete_messages && (!z11 || (!chat.megagroup && !tL_chatAdminRights.post_messages)))) && (!chat.megagroup || !z11))) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                        }
                    } else if (!z10 && !message.out && v3.T(chat)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean r3(i20 i20Var) {
        if (i20Var != null) {
            if (!i20Var.f24581e.equals("image/gif")) {
                if ("video/mp4".equals(i20Var.f24581e)) {
                    int i7 = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i20Var.f24580c.size(); i11++) {
                        TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) i20Var.f24580c.get(i11);
                        if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            i7 = documentAttribute.f28441w;
                            i10 = documentAttribute.h;
                        }
                    }
                    if (i7 <= 1280 && i10 <= 1280) {
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

    public static CharSequence s5(int i7, long j3) {
        CharSequence m22;
        if (j3 >= 0) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(j3));
            if (c22 != null) {
                return g0.D2(p10.q(c22));
            }
            return "";
        }
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
        if (O0 != null) {
            if (v3.V(O0)) {
                m22 = F();
            } else {
                m22 = m2();
            }
            return new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) g0.D2(O0.title));
        }
        return "";
    }

    public static String t0(TLRPC.Document document, boolean z10) {
        String str;
        if (document != null && !"audio/ogg".equals(document.mime_type)) {
            int size = document.attributes.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (!documentAttribute.voice) {
                        String str2 = documentAttribute.performer;
                        String str3 = documentAttribute.title;
                        if (!TextUtils.isEmpty(str2)) {
                            for (int i10 = 0; i10 < 14; i10++) {
                                str2 = str2.replace(f24162p3[i10], " ");
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
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return s3(n1(message).webpage.document, false);
        }
        if (n1(message) != null) {
            TLRPC.Document document = n1(message).document;
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

    public static CharSequence t5(int i7, TLRPC.Peer peer, boolean z10) {
        TLRPC.Chat O0;
        CharSequence m22;
        CharSequence m23;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(peer.user_id));
            if (c22 != null) {
                if (z10) {
                    return new SpannableStringBuilder(h6()).append((CharSequence) " ").append((CharSequence) p10.q(c22));
                }
                return p10.q(c22);
            }
            return "";
        } else if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat O02 = np.u1(i7).O0(Long.valueOf(peer.chat_id));
            if (O02 != null) {
                if (z10) {
                    if (v3.V(O02)) {
                        m23 = F();
                    } else {
                        m23 = m2();
                    }
                    return new SpannableStringBuilder(m23).append((CharSequence) " ").append((CharSequence) O02.title);
                }
                return O02.title;
            }
            return "";
        } else if ((peer instanceof TLRPC.TL_peerChannel) && (O0 = np.u1(i7).O0(Long.valueOf(peer.channel_id))) != null) {
            if (z10) {
                if (v3.V(O0)) {
                    m22 = F();
                } else {
                    m22 = m2();
                }
                return new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) O0.title);
            }
            return O0.title;
        } else {
            return "";
        }
    }

    public static long u1(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j3 = peer.chat_id;
        if (j3 != 0) {
            return -j3;
        }
        long j10 = peer.channel_id;
        if (j10 != 0) {
            return -j10;
        }
        return peer.user_id;
    }

    public static boolean u4(TLRPC.Document document) {
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                if (document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker) {
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

    public static String v1(TLRPC.Document document) {
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    if (TextUtils.isEmpty(str)) {
                        return hd.N0(2131753897, null);
                    }
                    return str;
                }
            }
        }
        return hd.N0(2131753897, null);
    }

    public static boolean v4(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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

    public static boolean w4(TLRPC.Message message) {
        if (n1(message) != null && u4(n1(message).document)) {
            return true;
        }
        return false;
    }

    public static String x1(TLRPC.Document document) {
        if (document == null) {
            return hd.N0(2131753896, null);
        }
        for (int i7 = 0; i7 < document.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String B = w7.B(document);
                if (TextUtils.isEmpty(B)) {
                    return hd.N0(2131753896, null);
                }
                return B;
            }
        }
        String B2 = w7.B(document);
        if (!TextUtils.isEmpty(B2)) {
            return B2;
        }
        return hd.N0(2131753896, null);
    }

    public static TLRPC.TL_textWithEntities x5(TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (tL_textWithEntities == null) {
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i7 = 0; i7 < tL_textWithEntities.entities.size(); i7++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i7);
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
                for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        if (tL_documentAttributeImageSize.f28441w >= 6000 || tL_documentAttributeImageSize.h >= 6000) {
                            return false;
                        }
                        return true;
                    }
                }
            } else {
                boolean z10 = s2.f26730a;
            }
        }
        return false;
    }

    public static void y5(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                if (!(uRLSpan instanceof org.telegram.ui.Components.m00)) {
                    spannable.removeSpan(uRLSpan);
                }
            }
        }
    }

    public static int z0(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        if (todoList == null || todoList.list == null) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < tL_messageMediaToDo.completions.size(); i10++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                } else if (tL_messageMediaToDo.todo.list.get(i11).f28581id == todoCompletion.f28580id) {
                    i7++;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i7;
    }

    public static Spannable z5(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        return B5(charSequence, arrayList, fontMetricsInt, false);
    }

    public final long A0() {
        return B0(this.f24213k);
    }

    public final int A1() {
        int i7;
        int L;
        int i10;
        if (this.f24250t1 && (i10 = this.d2) > 0) {
            return i10;
        }
        if (g0.Q1()) {
            if (this.D == 36) {
                Point point = g0.f24046q;
                i7 = point.x;
                if (!g0.E) {
                    if (!g0.P1() || i7 > point.y) {
                        L = g0.l1(i7, 0, 0);
                    } else {
                        return i7;
                    }
                } else {
                    return i7;
                }
            } else {
                return g0.Q0();
            }
        } else {
            Point point2 = g0.f24046q;
            i7 = point2.x;
            if (i7 > point2.y) {
                L = g0.L(50.0f);
            } else {
                return i7;
            }
        }
        return i7 - L;
    }

    public final boolean A2() {
        int i7;
        if (c1() != 0) {
            ArrayList arrayList = this.f24233p0;
            if ((arrayList != null && !arrayList.isEmpty()) || (i7 = this.D) == 3 || i7 == 1 || i7 == 14 || i7 == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A3() {
        TLRPC.WebPage webPage;
        String str = null;
        if (!this.G0 && !this.N2 && (n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) && (n1(this.f24213k).webpage instanceof TLRPC.TL_webPage)) {
            webPage = n1(this.f24213k).webpage;
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

    public final boolean A4() {
        if (this.f24195g) {
            return true;
        }
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.f24213k.peer_id;
        if (peer != null) {
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat w02 = w0(null, null, j3);
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

    public final Spannable A5(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return B5(charSequence, O0(), fontMetricsInt, false);
    }

    public final boolean B() {
        if (D2(true)) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (F0 != null && !(F0 instanceof TLRPC.TL_documentEncrypted)) {
            if (cz.C0) {
                return true;
            }
            for (int i7 = 0; i7 < F0.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (cz.D0 && "video/x-matroska".equals(F0.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B2() {
        gj gjVar;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.f24213k;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (gjVar = this.C) != null) {
            TLRPC.Message message2 = gjVar.f24213k;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B3(long j3) {
        TLRPC.MessageReplies messageReplies = this.f24213k.replies;
        if (messageReplies != null) {
            if (j3 == 0 || messageReplies.channel_id == j3) {
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
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return D((TLRPC.TL_messageMediaPoll) n1);
    }

    public final String C0() {
        if (!T2()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) n1(this.f24213k);
        if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
            return "🎲";
        }
        return tL_messageMediaDice.emoticon.replace("️", "");
    }

    public final boolean C2() {
        return D2(true);
    }

    public final boolean C3() {
        return n1(this.f24213k) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public final int D0() {
        if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) n1(this.f24213k)).value;
        }
        return -1;
    }

    public final long D1() {
        if (this.D != 17) {
            return 0L;
        }
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return 0L;
        }
        return ((TLRPC.TL_messageMediaPoll) n1).poll.f28460id;
    }

    public final boolean D2(boolean z10) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        ArrayList X;
        if (this.f24184d3 == null) {
            try {
                TLRPC.Message message = this.f24213k;
                boolean z11 = false;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i7 = this.K1;
                    TLRPC.Message message2 = this.f24213k;
                    if (message2 != null) {
                        messageMedia2 = message2.media;
                    } else {
                        messageMedia2 = null;
                    }
                    int i10 = i61.f36152k0;
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                        X = new ArrayList();
                    } else {
                        X = i61.X(i7, messageMedia2.document, messageMedia2.alt_documents, 0, z10);
                    }
                    this.f24189e3 = X;
                    if (X.size() > 1) {
                        z11 = true;
                    }
                    this.f24184d3 = Boolean.valueOf(z11);
                    this.f24199g3 = i61.a0(this.f24189e3);
                    this.f24203h3 = i61.b0(this.f24189e3);
                    this.f24208i3 = i61.N(this.f24189e3);
                }
                this.f24184d3 = Boolean.FALSE;
                return false;
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f24184d3 = Boolean.FALSE;
            }
        }
        return this.f24184d3.booleanValue();
    }

    public final boolean D3() {
        TLRPC.MessageMedia m12 = m1(this);
        if (m12 != null && m12.live_photo) {
            return true;
        }
        return false;
    }

    public final boolean D4() {
        if (this.D == 17 && (n1(this.f24213k) instanceof TLRPC.TL_messageMediaToDo)) {
            return true;
        }
        return false;
    }

    public final void D5(Spannable spannable, int[] iArr) {
        int length;
        boolean z10;
        CharSequence charSequence;
        if (com.google.android.gms.internal.vision.e2.s(spannable)) {
            Object[] objArr = (g6[]) spannable.getSpans(0, spannable.length(), g6.class);
            org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.y5.class);
            if (objArr != null) {
                int length2 = iArr[0] - objArr.length;
                if (y5VarArr == null) {
                    length = 0;
                } else {
                    length = y5VarArr.length;
                }
                if (length2 - length <= 0) {
                    for (int i7 = 0; i7 < objArr.length; i7++) {
                        String str = objArr[i7].d;
                        if (j6.b(str)) {
                            z10 = true;
                            charSequence = str.subSequence(0, str.length() - 2);
                        } else {
                            z10 = false;
                            charSequence = str;
                        }
                        TLRPC.Document V = si.d0(this.K1).V(charSequence);
                        if (V != null) {
                            int spanStart = spannable.getSpanStart(objArr[i7]);
                            int spanEnd = spannable.getSpanEnd(objArr[i7]);
                            spannable.removeSpan(objArr[i7]);
                            org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(V, objArr[i7].f24094a);
                            y5Var.standard = true;
                            y5Var.invert = z10;
                            spannable.setSpan(y5Var, spanStart, spanEnd, 33);
                        }
                    }
                }
            }
        }
    }

    public final boolean E() {
        int i7;
        if (this.f24213k.action == null) {
            if (!x2()) {
                gj gjVar = this.C;
                if (gjVar == null || gjVar.f24213k.replies == null) {
                    TLRPC.MessageReplyHeader messageReplyHeader = this.f24213k.reply_to;
                    if (messageReplyHeader != null) {
                        i7 = messageReplyHeader.reply_to_top_id;
                    } else {
                        i7 = 0;
                    }
                    if (i7 != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.E0():org.telegram.tgnet.tl.TL_iv$RichMessage");
    }

    public final boolean E2() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return U4((TLRPC.TL_messageMediaPoll) n1);
    }

    public final TLRPC.Document F0() {
        h61 h61Var;
        TLRPC.Document document = this.f24225n;
        if (document != null) {
            return document;
        }
        if (D2(true) && (h61Var = this.f24199g3) != null) {
            return h61Var.f35804g;
        }
        return G0(this.f24213k);
    }

    public final boolean F2() {
        if (G2() && H2(F0())) {
            return true;
        }
        return false;
    }

    public final boolean F3() {
        return G3(this.f24213k, true);
    }

    public final boolean F4() {
        TLRPC.Message message = this.f24213k;
        if (message != null && message.unread) {
            return true;
        }
        return false;
    }

    public final CharSequence F5(String str, ArrayList arrayList, AbstractMap abstractMap, a0.h hVar) {
        TLRPC.User user;
        int i7;
        if (TextUtils.indexOf(str, "un2") < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (abstractMap != null) {
                user = (TLRPC.User) abstractMap.get(arrayList.get(i10));
            } else if (hVar != null) {
                user = (TLRPC.User) hVar.f(((Long) arrayList.get(i10)).longValue());
            } else {
                user = null;
            }
            if (user == null) {
                user = np.u1(this.K1).c2((Long) arrayList.get(i10));
            }
            if (user != null) {
                String q10 = p10.q(user);
                int length = spannableStringBuilder.length();
                if (spannableStringBuilder.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) q10);
                StringBuilder sb2 = new StringBuilder("");
                i7 = i10;
                sb2.append(user.f28583id);
                spannableStringBuilder.setSpan(new t41(sb2.toString()), length, q10.length() + length, 33);
            } else {
                i7 = i10;
            }
            i10 = i7 + 1;
        }
        return TextUtils.replace(str, new String[]{"un2"}, new CharSequence[]{spannableStringBuilder});
    }

    public final void G() {
        org.telegram.ui.Components.y5[] y5VarArr;
        int i7;
        this.f24225n = null;
        this.f24228o = null;
        if (this.P1 == 1 && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaInvoice) && ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaEmpty) || n1(this.f24213k) == null)) {
            TLRPC.Message message = this.f24213k;
            if (message.grouped_id == 0) {
                boolean isEmpty = message.entities.isEmpty();
                int i10 = this.K1;
                if (isEmpty) {
                    String str = this.v;
                    int indexOf = TextUtils.indexOf(str, "🏻");
                    if (indexOf >= 0) {
                        this.f24252u = "_c1";
                        str = str.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(str, "🏼");
                        if (indexOf >= 0) {
                            this.f24252u = "_c2";
                            str = str.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(str, "🏽");
                            if (indexOf >= 0) {
                                this.f24252u = "_c3";
                                str = str.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(str, "🏾");
                                if (indexOf >= 0) {
                                    this.f24252u = "_c4";
                                    str = str.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(str, "🏿");
                                    if (indexOf >= 0) {
                                        this.f24252u = "_c5";
                                        str = str.subSequence(0, indexOf);
                                    } else {
                                        this.f24252u = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.f24252u) && (i7 = indexOf + 2) < this.v.length()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str.toString());
                        CharSequence charSequence = this.v;
                        sb2.append(charSequence.subSequence(i7, charSequence.length()).toString());
                        str = sb2.toString();
                    }
                    if (TextUtils.isEmpty(this.f24252u) || k6.f25026l.contains(str.toString())) {
                        this.f24225n = si.d0(i10).V(str);
                    }
                } else if (this.f24213k.entities.size() == 1 && (this.f24213k.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.f24213k.entities.get(0)).document_id);
                        this.f24228o = valueOf;
                        TLRPC.Document e10 = org.telegram.ui.Components.p5.e(i10, valueOf.longValue());
                        this.f24225n = e10;
                        if (e10 == null) {
                            CharSequence charSequence2 = this.v;
                            if ((charSequence2 instanceof Spanned) && (y5VarArr = (org.telegram.ui.Components.y5[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), org.telegram.ui.Components.y5.class)) != null && y5VarArr.length == 1) {
                                this.f24225n = y5VarArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.f24225n == null && this.f24228o == null) {
            n0(null);
        } else if (t4()) {
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
        if (this.f24225n == null && this.f24228o == null) {
            return false;
        }
        return true;
    }

    public final boolean G4() {
        return n1(this.f24213k) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public final void G5() {
        this.f24173b0 = 0.0f;
        this.f24205i0 = 0;
        this.f24196g0 = 0.0f;
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
        int i7 = -1;
        if (valueOf != null && valueOf.intValue() >= 1 && this.f24213k != null && !u2()) {
            CharSequence charSequence = this.v;
            g6[] g6VarArr = (g6[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), g6.class);
            CharSequence charSequence2 = this.v;
            org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), org.telegram.ui.Components.y5.class);
            int intValue = valueOf.intValue();
            if (g6VarArr == null) {
                length = 0;
            } else {
                length = g6VarArr.length;
            }
            if (y5VarArr == null) {
                length2 = 0;
            } else {
                length2 = y5VarArr.length;
            }
            this.P1 = Math.max(intValue, length + length2);
            if (y5VarArr == null) {
                length3 = 0;
            } else {
                length3 = y5VarArr.length;
            }
            this.R1 = length3;
            this.Q1 = 0;
            if (y5VarArr != null) {
                for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                    if (!y5Var.standard) {
                        this.Q1++;
                    }
                }
            }
            int i10 = this.P1;
            if (g6VarArr == null) {
                length4 = 0;
            } else {
                length4 = g6VarArr.length;
            }
            int i11 = i10 - length4;
            if (y5VarArr == null) {
                length5 = 0;
            } else {
                length5 = y5VarArr.length;
            }
            if (i11 - length5 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.O1 = z10;
            if (i10 != 0 && !z10) {
                int i12 = this.Q1;
                if (i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i13 = 2;
                switch (Math.max(i10, i12)) {
                    case 0:
                    case 1:
                    case 2:
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.m6.f29769y2;
                        if (z11) {
                            textPaint = textPaintArr[0];
                        } else {
                            textPaint = textPaintArr[2];
                        }
                        i13 = 1;
                        break;
                    case 3:
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.m6.f29769y2;
                        if (z11) {
                            textPaint = textPaintArr2[1];
                        } else {
                            textPaint = textPaintArr2[3];
                        }
                        i13 = 1;
                        break;
                    case 4:
                        TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.m6.f29769y2;
                        if (z11) {
                            textPaint = textPaintArr3[2];
                        } else {
                            textPaint = textPaintArr3[4];
                        }
                        i13 = 1;
                        break;
                    case 5:
                        TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.m6.f29769y2;
                        if (z11) {
                            textPaint = textPaintArr4[3];
                            break;
                        } else {
                            textPaint = textPaintArr4[5];
                            break;
                        }
                    case 6:
                        TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.m6.f29769y2;
                        if (z11) {
                            textPaint = textPaintArr5[4];
                            break;
                        } else {
                            textPaint = textPaintArr5[5];
                            break;
                        }
                    default:
                        if (this.P1 > 9) {
                            i7 = 0;
                        }
                        textPaint = org.telegram.ui.ActionBar.m6.f29769y2[5];
                        i13 = i7;
                        break;
                }
                int textSize = (int) (textPaint.getTextSize() + g0.L(4.0f));
                if (g6VarArr != null && g6VarArr.length > 0) {
                    for (g6 g6Var : g6VarArr) {
                        g6Var.f24094a = textPaint.getFontMetricsInt();
                        g6Var.f24096c = textSize;
                    }
                }
                if (y5VarArr != null && y5VarArr.length > 0) {
                    for (int i14 = 0; i14 < y5VarArr.length; i14++) {
                        y5VarArr[i14].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i13);
                        y5VarArr[i14].full = true;
                    }
                    return;
                }
                return;
            } else if (y5VarArr != null && y5VarArr.length > 0) {
                for (int i15 = 0; i15 < y5VarArr.length; i15++) {
                    y5VarArr[i15].replaceFontMetrics(org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.m6.f29578o2.getTextSize() + g0.L(4.0f)), -1);
                    y5VarArr[i15].full = false;
                }
                return;
            } else {
                return;
            }
        }
        CharSequence charSequence3 = this.v;
        org.telegram.ui.Components.y5[] y5VarArr2 = (org.telegram.ui.Components.y5[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.y5.class);
        if (y5VarArr2 != null && y5VarArr2.length > 0) {
            this.R1 = y5VarArr2.length;
            for (int i16 = 0; i16 < y5VarArr2.length; i16++) {
                y5VarArr2[i16].replaceFontMetrics(org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.m6.f29578o2.getTextSize() + g0.L(4.0f)), -1);
                y5VarArr2[i16].full = false;
            }
            return;
        }
        this.R1 = 0;
    }

    public final boolean H3() {
        TLRPC.Message message = this.f24213k;
        if (message != null && n1(message) != null && !(n1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return false;
        }
        return true;
    }

    public final boolean H4() {
        return L4(this.f24213k);
    }

    public final boolean H5(ch.p0 p0Var, boolean z10) {
        int i7;
        TLRPC.Peer tL_peerUser;
        TLRPC.Peer tL_peerUser2;
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        boolean z12;
        TLRPC.Message message = this.f24213k;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i11 = this.K1;
        if (tL_messageReactions2 == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.f24213k;
            TLRPC.TL_messageReactions tL_messageReactions3 = message2.reactions;
            if (B0(message2) == k10.i(i11).e()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messageReactions3.reactions_as_tags = z11;
            TLRPC.TL_messageReactions tL_messageReactions4 = this.f24213k.reactions;
            if (!o3() && !p3()) {
                z12 = false;
            } else {
                z12 = true;
            }
            tL_messageReactions4.can_see_list = z12;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f24213k.reactions.results.size(); i13++) {
            TLRPC.ReactionCount reactionCount2 = this.f24213k.reactions.results.get(i13);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i14 = reactionCount2.chosen_order;
                if (i14 > i12) {
                    i12 = i14;
                }
            }
            TLRPC.Reaction reaction = this.f24213k.reactions.results.get(i13).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = p0Var.f5507f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.f24213k.reactions.results.get(i13);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = p0Var.f5508g;
                if (j3 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j3) {
                    reactionCount = this.f24213k.reactions.results.get(i13);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z10) {
            return true;
        }
        np u12 = np.u1(i11);
        if (u12.getUserConfig().q()) {
            i7 = u12.f25826d5;
        } else {
            i7 = u12.f25818c5;
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i15 = reactionCount.count - 1;
                reactionCount.count = i15;
                if (i15 <= 0) {
                    this.f24213k.reactions.results.remove(reactionCount);
                }
            }
            if (this.f24213k.reactions.can_see_list) {
                int i16 = 0;
                while (i16 < this.f24213k.reactions.recent_reactions.size()) {
                    if (B1(this.f24213k.reactions.recent_reactions.get(i16).peer_id) == k10.i(i11).e() && ch.s0.c(this.f24213k.reactions.recent_reactions.get(i16).reaction, p0Var)) {
                        this.f24213k.reactions.recent_reactions.remove(i16);
                        i16--;
                    }
                    i16++;
                }
            }
            this.H = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= i7) {
            int i17 = 0;
            for (int i18 = 1; i18 < arrayList.size(); i18++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i18)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i18)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i17)).chosen_order) {
                    i17 = i18;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i17);
            reactionCount3.chosen = false;
            int i19 = reactionCount3.count - 1;
            reactionCount3.count = i19;
            if (i19 <= 0) {
                this.f24213k.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.f24213k.reactions.can_see_list) {
                int i20 = 0;
                while (i20 < this.f24213k.reactions.recent_reactions.size()) {
                    if (B1(this.f24213k.reactions.recent_reactions.get(i20).peer_id) == k10.i(i11).e() && ch.s0.c(this.f24213k.reactions.recent_reactions.get(i20).reaction, p0Var)) {
                        this.f24213k.reactions.recent_reactions.remove(i20);
                        i20--;
                    }
                    i20++;
                }
            }
        }
        if (reactionCount == null) {
            int Q0 = np.u1(i11).Q0(B0(this.f24213k));
            TLRPC.Message message3 = this.f24213k;
            if (message3 != null && (tL_messageReactions = message3.reactions) != null) {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i10 = 0;
                int i21 = 0;
                while (i21 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i21);
                    i21++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 + 1 > Q0) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = p0Var.g();
            this.f24213k.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i12 + 1;
        TLRPC.Message message4 = this.f24213k;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && i7 > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.f24213k;
            if (message5.isThreadMessage && message5.fwd_from != null) {
                np u13 = np.u1(i11);
                TLRPC.ChatFull P0 = u13.P0(-Z0());
                if (P0 == null || (tL_peerUser2 = P0.default_send_as) == null) {
                    tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_peerUser2.user_id = k10.i(u13.getAccountInstance().f23202a).f24987n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser2;
            } else {
                np u14 = np.u1(i11);
                TLRPC.ChatFull P02 = u14.P0(-B0(this.f24213k));
                if (P02 == null || (tL_peerUser = P02.default_send_as) == null) {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = k10.i(u14.getAccountInstance().f23202a).f24987n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser;
            }
            this.f24213k.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (p0Var.f5507f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = p0Var.f5507f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = p0Var.f5508g;
            }
        }
        this.H = true;
        return true;
    }

    public final boolean I() {
        CharSequence charSequence;
        TLRPC.User user;
        TextPaint textPaint;
        int[] iArr;
        int A1;
        float f10;
        int L;
        int i7 = this.D;
        if ((i7 == 0 || i7 == 19 || i7 == 36) && this.f24213k.peer_id != null && (charSequence = this.v) != null && (charSequence.length() != 0 || this.Y1)) {
            if (this.S1) {
                if (g0.Q1() && this.T != 0) {
                    A1 = g0.L(530.0f);
                } else {
                    A1 = A1();
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.f29578o2;
                if (textPaint2 != null) {
                    f10 = textPaint2.getTextSize();
                } else {
                    f10 = 0.0f;
                }
                if (this.D == 36) {
                    L = 0;
                } else {
                    L = g0.L(52.0f);
                }
                if (Math.abs(this.T1 - A1) > L || this.U1 != g0.f24045p || this.W1 != f10 || this.V1 != P2()) {
                    this.S1 = false;
                }
            }
            if (!this.S1) {
                this.S1 = true;
                if (p3()) {
                    user = np.u1(this.K1).c2(Long.valueOf(this.f24213k.from_id.user_id));
                } else {
                    user = null;
                }
                if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame) {
                    textPaint = org.telegram.ui.ActionBar.m6.f29750x2;
                } else {
                    textPaint = org.telegram.ui.ActionBar.m6.f29578o2;
                }
                if (i()) {
                    iArr = new int[1];
                } else {
                    iArr = null;
                }
                CharSequence m10 = j6.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
                this.v = m10;
                Spannable A5 = A5(m10, textPaint.getFontMetricsInt());
                this.v = A5;
                if (iArr != null && iArr[0] > 1) {
                    D5(A5, iArr);
                }
                H(iArr);
                G();
                L5();
                n0(user);
                if (this.f24271z != null) {
                    this.f24271z = null;
                    k0();
                }
                return true;
            }
        }
        return false;
    }

    public final String I0() {
        return w7.B(F0());
    }

    public final boolean I2() {
        if (this.D == 19) {
            return true;
        }
        return false;
    }

    public final boolean I3() {
        if (K3(this.f24213k) && !L4(this.f24213k) && !h4()) {
            return true;
        }
        return false;
    }

    public final boolean I4() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.f24213k.action;
        if (messageAction != null && (photo = messageAction.photo) != null && !photo.video_sizes.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void I5() {
        this.f24213k.unread = false;
    }

    public final void J() {
        K(true);
    }

    public final boolean J2() {
        int i7 = this.D;
        boolean z10 = false;
        if (i7 != 1000) {
            if (i7 != 15) {
                return false;
            }
            return true;
        }
        boolean C = n5.C(B0(this.f24213k));
        if (C && this.f24213k.stickerVerified != 1) {
            return false;
        }
        if (this.f24228o != null && this.f24225n == null) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (this.f24225n != null || !C || N3()) {
            z10 = true;
        }
        return K2(F0, z10);
    }

    public final boolean J4() {
        TLRPC.MessageAction messageAction = this.f24213k.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionPhoneCall) || !messageAction.video) {
            if ((messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void J5(long j3) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z10;
        TLRPC.Message message = this.f24213k;
        if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.MessageReactor messageReactor = arrayList.get(i7);
                i7++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (j3 == 2666000) {
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
                        messageReactor2.peer_id = np.u1(this.K1).B1(j3);
                    }
                }
            }
        }
    }

    public final void K(boolean z10) {
        int i7;
        File M;
        boolean z11;
        this.f24268y0 = false;
        this.f24272z0 = false;
        int i10 = this.D;
        int i11 = this.K1;
        if (i10 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.f24213k.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                w7.G(i11);
                File J = w7.J(tL_messageExtendedMediaPreview.thumb, null, z10, true);
                if (!this.f24272z0) {
                    if (!J.exists() && !(tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    this.f24272z0 = z11;
                }
            }
        } else if (i10 == 1 && w7.w(this.f24233p0, g0.Z0(true), false, null, false) != null) {
            w7.G(i11);
            File M2 = w7.M(this.f24213k, false, z10);
            if (m5()) {
                this.f24272z0 = new File(M2.getAbsolutePath() + ".enc").exists();
            }
            if (!this.f24272z0) {
                this.f24272z0 = M2.exists();
            }
        }
        if ((!this.f24272z0 && this.D == 8) || (i7 = this.D) == 3 || i7 == 9 || i7 == 2 || i7 == 14 || i7 == 5) {
            String str = this.f24213k.attachPath;
            if (str != null && str.length() > 0) {
                this.f24268y0 = new File(this.f24213k.attachPath).exists();
            }
            if (!this.f24268y0) {
                if (this.D == 3 && m5() && D3() && F0() != null) {
                    w7.G(i11);
                    M = w7.J(F0(), null, true, z10);
                } else {
                    w7.G(i11);
                    M = w7.M(this.f24213k, false, z10);
                }
                if ((this.D == 3 && m5()) || S4() || g4()) {
                    this.f24272z0 = new File(M.getAbsolutePath() + ".enc").exists();
                }
                if (!this.f24272z0) {
                    this.f24272z0 = M.exists();
                }
            }
        }
        if (!this.f24272z0) {
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                if ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.f24213k).webpage != null && "telegram_background".equals(n1(this.f24213k).webpage.type)) {
                    w7.G(i11);
                    this.f24272z0 = w7.J(F0, null, true, z10).exists();
                } else {
                    w7.G(i11);
                    this.f24272z0 = w7.J(F0, null, false, z10).exists();
                }
            } else {
                int i12 = this.D;
                if (i12 == 0) {
                    TLRPC.PhotoSize w10 = w7.w(this.f24233p0, g0.Z0(false), false, null, false);
                    if (w10 != null) {
                        w7.G(i11);
                        this.f24272z0 = w7.J(w10, null, true, z10).exists();
                    } else {
                        return;
                    }
                } else if (i12 == 11) {
                    TLRPC.Photo photo = this.f24213k.action.photo;
                    if (photo != null && !photo.video_sizes.isEmpty()) {
                        w7.G(i11);
                        this.f24272z0 = w7.J(photo.video_sizes.get(0), null, true, z10).exists();
                    } else {
                        return;
                    }
                }
            }
        }
        e6(z10);
    }

    public final TLRPC.MessagePeerReaction K1() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.f24213k.reactions;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.recent_reactions) != null && !arrayList.isEmpty()) {
            return this.f24213k.reactions.recent_reactions.get(0);
        }
        return null;
    }

    public final void K5(String str, boolean z10) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.f24170a2 = null;
            this.f24180c2 = null;
            this.f24175b2 = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.f24213k.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.f24213k.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                n2(arrayList, split, true, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.f24213k.message)) {
            String lowerCase3 = this.f24213k.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                n2(arrayList, split, false, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (F0() != null) {
            String lowerCase4 = w7.B(F0()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) && (n1(this.f24213k).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = n1(this.f24213k).webpage;
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
        String w12 = w1(true);
        if (w12 != null) {
            String lowerCase6 = w12.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (!arrayList.contains(arrayList2.get(i7)) && (indexOf = (str2 = (String) arrayList2.get(i7)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i10 = 0;
                        for (int i11 = 0; i11 < min && str2.charAt(i11) == str4.charAt(i11); i11++) {
                            i10++;
                        }
                        if (i10 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i7));
                        }
                    }
                }
            }
        }
        n2(arrayList, split, false, z10);
    }

    public final double L0() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.f24214k0;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document F0 = F0();
        if (F0 == null && this.D == 23 && (storyItem = n1(this.f24213k).storyItem) != null && (messageMedia = storyItem.media) != null) {
            F0 = messageMedia.document;
        }
        if (F0 == null) {
            return 0.0d;
        }
        int i7 = this.f24210j0;
        if (i7 > 0) {
            return i7;
        }
        for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d2 = documentAttribute.duration;
                this.f24214k0 = d2;
                return d2;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d10 = documentAttribute.duration;
                this.f24214k0 = d10;
                return d10;
            }
        }
        return this.f24210j0;
    }

    public final int L1() {
        TLRPC.Message message = this.f24213k;
        int i7 = message.realId;
        if (i7 != 0) {
            return i7;
        }
        return message.f28455id;
    }

    public final boolean L3() {
        if (n1(this.f24213k) != null && M3(F0())) {
            return true;
        }
        return false;
    }

    public final void L5() {
        int i7;
        int i10;
        int i11 = this.D;
        this.D = 1000;
        this.S = 0;
        boolean r42 = r4();
        int i12 = this.K1;
        if (r42) {
            this.D = 0;
        } else {
            int i13 = 1;
            if (this.f24201h1) {
                this.U = 0;
                this.D = 27;
                this.f24206i1 = np.u1(i12).h7.getBoolean("c" + B0(this.f24213k) + "_rec", true);
            } else {
                TLRPC.Message message = this.f24213k;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.L1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.U = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.f28588id == 0 && wallPaper.settings == null) {
                                this.D = 10;
                            } else {
                                this.D = 22;
                                ArrayList arrayList = new ArrayList();
                                this.f24233p0 = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.f24226n0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
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
                                this.f24233p0 = arrayList2;
                                TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                if (document2 != null) {
                                    arrayList2.addAll(document2.thumbs);
                                    this.f24226n0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                this.U = 1;
                                this.D = 21;
                                ArrayList arrayList3 = new ArrayList();
                                this.f24233p0 = arrayList3;
                                arrayList3.addAll(this.f24213k.action.photo.sizes);
                                this.f24226n0 = this.f24213k.action.photo;
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
                                                } else if (bi.i4.o(message)) {
                                                    this.D = 10;
                                                    this.U = 1;
                                                } else {
                                                    TLRPC.MessageAction messageAction2 = this.f24213k.action;
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
                    TLRPC.Message message2 = this.f24213k;
                    if (message2.rich_message == null && !(n1(message2) instanceof TLRPC.TL_messageMediaWidget)) {
                        if (this.f24225n == null && this.f24228o == null) {
                            TLRPC.Message message3 = this.f24213k;
                            if (message3.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                                this.D = 29;
                            } else if (G3(message3, false) && !T2() && !r4() && this.P1 >= 1 && !this.O1 && this.f24213k != null && !u2()) {
                                this.D = 19;
                            } else if (F3()) {
                                this.D = 0;
                                if (TextUtils.isEmpty(this.v) && this.T == 0) {
                                    this.v = "";
                                }
                            } else if (q2()) {
                                this.D = 20;
                            } else if (n1(this.f24213k).ttl_seconds != 0 && ((n1(this.f24213k).photo instanceof TLRPC.TL_photoEmpty) || (F0() instanceof TLRPC.TL_documentEmpty) || (((n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument) && F0() == null) || this.I0))) {
                                this.U = 1;
                                this.D = 10;
                            } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGiveaway) {
                                this.D = 26;
                            } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                this.D = 28;
                            } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDice) {
                                this.D = 15;
                                if (n1(this.f24213k).document == null) {
                                    n1(this.f24213k).document = new TLRPC.TL_document();
                                    n1(this.f24213k).document.file_reference = new byte[0];
                                    n1(this.f24213k).document.mime_type = "application/x-tgsdice";
                                    n1(this.f24213k).document.dc_id = Integer.MIN_VALUE;
                                    n1(this.f24213k).document.f28440id = -2147483648L;
                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                    tL_documentAttributeImageSize.f28441w = 512;
                                    tL_documentAttributeImageSize.h = 512;
                                    n1(this.f24213k).document.attributes.add(tL_documentAttributeImageSize);
                                }
                            } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) {
                                if (L4(this.f24213k)) {
                                    i13 = 3;
                                }
                                this.D = i13;
                            } else if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaGeo) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaVenue) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                                if (h4()) {
                                    this.D = 5;
                                } else if (L4(this.f24213k)) {
                                    this.D = 3;
                                } else if (R4(this.f24213k)) {
                                    this.D = 2;
                                } else if (I3()) {
                                    this.D = 14;
                                } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaContact) {
                                    this.D = 12;
                                } else if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaPoll) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaToDo)) {
                                    if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaUnsupported) {
                                        this.D = 0;
                                    } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument) {
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
                                    } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame) {
                                        this.D = 0;
                                    } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaInvoice) {
                                        this.D = 0;
                                    } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaStory) {
                                        if (n1(this.f24213k).via_mention) {
                                            i7 = 24;
                                        } else {
                                            i7 = 23;
                                        }
                                        this.D = i7;
                                        if (i7 == 24) {
                                            this.U = 1;
                                        }
                                    }
                                } else {
                                    this.D = 17;
                                    this.f24265x1 = new ArrayList();
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
        if (i11 != 1000 && i11 != (i10 = this.D) && i10 != 19) {
            b6(np.u1(i12).d, np.u1(i12).f25802b, null, null);
            r0(false);
        }
    }

    public final TLRPC.TL_availableEffect M0() {
        TLRPC.Message message = this.f24213k;
        if (message != null && (message.flags2 & 4) != 0) {
            return np.u1(this.K1).b1(this.f24213k.effect);
        }
        return null;
    }

    public final int M1() {
        TLRPC.MessageReplies messageReplies = this.f24213k.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public final boolean M2() {
        int i7 = this.D;
        if (i7 != 13 && i7 != 15 && i7 != 19) {
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

    public final void N(gj gjVar) {
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.f24223m1 = gjVar.f24223m1;
        TLRPC.Message message = this.f24213k;
        message.premiumEffectWasPlayed = gjVar.f24213k.premiumEffectWasPlayed;
        this.R = gjVar.R;
        this.X1 = gjVar.X1;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i7 = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = gjVar.f24213k.reactions) != null && tL_messageReactions.results != null) {
            for (int i10 = 0; i10 < this.f24213k.reactions.results.size(); i10++) {
                TLRPC.ReactionCount reactionCount = this.f24213k.reactions.results.get(i10);
                for (int i11 = 0; i11 < gjVar.f24213k.reactions.results.size(); i11++) {
                    TLRPC.ReactionCount reactionCount2 = gjVar.f24213k.reactions.results.get(i11);
                    if (ch.q0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z10 = gjVar.N0;
        this.N0 = z10;
        TLRPC.Message message2 = this.f24213k;
        TLRPC.Message message3 = gjVar.f24213k;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (z10 && (arrayList = this.B2) != null) {
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((dj) obj).f23568y.clear();
            }
        }
    }

    public final long N0() {
        TLRPC.Message message = this.f24213k;
        if (message != null && (message.flags2 & 4) != 0) {
            return message.effect;
        }
        return 0L;
    }

    public final int N1() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.f24213k.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public boolean N3() {
        return this.f24213k.out;
    }

    public final boolean N5() {
        if (this.X1) {
            if (this.D != 5 && !R4(this.f24213k)) {
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

    public final void O(int i7, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, boolean z10) {
        String str = this.W;
        if (((ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new ArrayList());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = hd.u(tL_channelAdminLogEvent.date, false);
            tL_message.f28455id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            gj gjVar = new gj(i7, tL_message, false, false);
            gjVar.D = 10;
            gjVar.U = 1;
            gjVar.f24219l0 = true;
            if (z10) {
                arrayList.add(0, gjVar);
            } else {
                arrayList.add(gjVar);
            }
        }
    }

    public final ArrayList O0() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.f24213k;
        if (message != null) {
            if (this.M2) {
                if (this.L2 && (tL_textWithEntities = message.translatedSummaryText) != null) {
                    return tL_textWithEntities.entities;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
                if (tL_textWithEntities2 != null) {
                    return tL_textWithEntities2.entities;
                }
                return null;
            } else if (this.L2) {
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
        boolean z10;
        CharSequence t52;
        TLRPC.Message message = this.f24213k;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i7 = this.K1;
        if (messageReplyHeader == null) {
            if (n5.z(B0(message))) {
                t52 = s5(i7, B0(this.f24213k));
                charSequence2 = t52;
                charSequence = null;
            } else {
                charSequence = s5(i7, B0(this.f24213k));
                charSequence2 = null;
            }
        } else {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                if (peer != null && n5.o(peer) == B0(this.f24213k)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = this.f24213k.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 != null) {
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                        charSequence = t5(i7, peer2, z10);
                        charSequence2 = null;
                    } else {
                        t52 = t5(i7, peer2, z10);
                        charSequence2 = t52;
                        charSequence = null;
                    }
                } else {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            charSequence = t5(i7, peer3, z10);
                        } else {
                            t52 = t5(i7, peer3, z10);
                            charSequence2 = t52;
                            charSequence = null;
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        if (z10) {
                            charSequence = new SpannableStringBuilder(h6()).append((CharSequence) " ").append((CharSequence) this.f24213k.reply_to.reply_from.from_name);
                        } else {
                            charSequence = new SpannableStringBuilder(this.f24213k.reply_to.reply_from.from_name);
                        }
                    }
                    charSequence2 = null;
                }
            }
            charSequence = null;
            charSequence2 = null;
        }
        TLRPC.Peer peer4 = this.f24213k.reply_to.reply_to_peer_id;
        if (peer4 != null && n5.o(peer4) != B0(this.f24213k)) {
            TLRPC.Peer peer5 = this.f24213k.reply_to.reply_to_peer_id;
            boolean z11 = peer5 instanceof TLRPC.TL_peerUser;
            if (z11) {
                charSequence = t5(i7, peer5, true);
            } else {
                charSequence2 = t5(i7, peer5, !z11);
            }
        }
        gj gjVar = this.C;
        if (gjVar != null) {
            if (n5.z(gjVar.R1())) {
                if (charSequence2 == null) {
                    charSequence2 = s5(i7, this.C.R1());
                }
            } else if (charSequence == null) {
                charSequence = s5(i7, this.C.R1());
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
        return hd.N0(2131748586, null);
    }

    public final boolean O5() {
        if (this.f24212j2) {
            return false;
        }
        return true;
    }

    public final void P(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.P(boolean):void");
    }

    public final int P0() {
        if (c3(this.f24213k)) {
            return S(this.f24213k.f28455id);
        }
        return 0;
    }

    public final long P1() {
        return Q1(k10.i(this.K1).e(), this.f24213k);
    }

    public final boolean P2() {
        TLRPC.Message message;
        long B0;
        int i7;
        byte b10;
        if (!cz.H0) {
            if (this.X2 == 0 && (message = this.f24213k) != null && (B0(message)) != 0) {
                if (!cz.H0 && (i7 <= 0 || !((m0) np.u1(this.K1).A7.f26247t0.f15708b).f25501b.contains(Long.valueOf(B0)))) {
                    b10 = 1;
                } else {
                    b10 = 2;
                }
                this.X2 = b10;
            }
            if (this.X2 != 2) {
                return false;
            }
        }
        return true;
    }

    public boolean P3() {
        boolean z10 = true;
        if (this.f24254u1) {
            return true;
        }
        Boolean bool = this.W2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (d5(this.f24213k) && !b5()) {
            this.W2 = Boolean.FALSE;
            return false;
        }
        long e10 = k10.i(this.K1).e();
        if (!this.f24227n2 && B0(this.f24213k) != e10) {
            TLRPC.Peer peer = this.f24213k.peer_id;
            TLRPC.Chat chat = null;
            if (peer != null) {
                long j3 = peer.channel_id;
                if (j3 != 0) {
                    chat = w0(null, null, j3);
                }
            }
            TLRPC.Message message = this.f24213k;
            if (message.out) {
                TLRPC.Peer peer2 = message.from_id;
                if ((peer2 instanceof TLRPC.TL_peerUser) || ((peer2 instanceof TLRPC.TL_peerChannel) && !v3.V(chat))) {
                    TLRPC.Message message2 = this.f24213k;
                    if (!message2.post) {
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null) {
                            this.W2 = Boolean.TRUE;
                            return true;
                        }
                        TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                        if (peer3 != null && peer3.user_id != e10) {
                            z10 = false;
                        }
                        this.W2 = Boolean.valueOf(z10);
                        return z10;
                    }
                }
            }
            this.W2 = Boolean.FALSE;
            return false;
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = this.f24213k.fwd_from;
        if (messageFwdHeader2 != null) {
            TLRPC.Peer peer4 = messageFwdHeader2.from_id;
            if ((peer4 == null || peer4.user_id != e10) && !messageFwdHeader2.saved_out) {
                z10 = false;
            }
            this.W2 = Boolean.valueOf(z10);
            return z10;
        }
        this.W2 = Boolean.TRUE;
        return true;
    }

    public final boolean P4() {
        return R4(this.f24213k);
    }

    public final boolean P5() {
        if (!r4()) {
            int i7 = this.D;
            if (i7 == 13 || i7 == 15 || i7 == 5 || i7 == 19 || g3()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Q() {
        if (this.f24233p0 != null) {
            if ((cz.o() == 2 || q2()) && this.I1 == null) {
                try {
                    String str = "b";
                    if (h4()) {
                        str = "br";
                    }
                    int size = this.f24233p0.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.f24233p0.get(i7);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.I1 = new BitmapDrawable(t0.f26931b.getResources(), fc.F(str, photoSize.bytes));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
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
        TLRPC.Message message = this.f24213k;
        if (message != null) {
            if (message.paid_suggested_post_stars || message.paid_suggested_post_ton) {
                int i7 = this.K1;
                int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                if (currentTime - this.f24213k.date < np.u1(i7).A7.f26225i.n2(TimeUnit.SECONDS)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean Q5() {
        return R5(this.f24213k);
    }

    public final TLRPC.TL_factCheck R0() {
        TLRPC.TL_factCheck tL_factCheck;
        x6 b10 = x6.b(this.K1);
        LongSparseArray longSparseArray = b10.f27854c;
        LongSparseArray longSparseArray2 = b10.f27853b;
        TLRPC.Message message = this.f24213k;
        if (message != null && (tL_factCheck = message.factcheck) != null) {
            if (!tL_factCheck.need_check) {
                if (longSparseArray2.get(tL_factCheck.hash) == null) {
                    TLRPC.TL_factCheck tL_factCheck2 = this.f24213k.factcheck;
                    longSparseArray2.put(tL_factCheck2.hash, tL_factCheck2);
                    TLRPC.TL_factCheck tL_factCheck3 = this.f24213k.factcheck;
                    int i7 = b10.f27852a;
                    if (tL_factCheck3 != null) {
                        ur a02 = ur.a0(i7);
                        a02.f27250a.c(new z4(4, a02, tL_factCheck3));
                        if (!b10.f27856f) {
                            b10.f27856f = true;
                            ur a03 = ur.a0(i7);
                            a03.f27250a.c(new qq(a03, 6));
                        }
                    }
                }
                return this.f24213k.factcheck;
            }
            long B0 = B0(message);
            int e12 = e1();
            long j3 = this.f24213k.factcheck.hash;
            w6 w6Var = new w6(B0, e12, j3);
            if (e12 < 0) {
                return null;
            }
            TLRPC.TL_factCheck tL_factCheck4 = (TLRPC.TL_factCheck) longSparseArray2.get(j3);
            if (tL_factCheck4 != null) {
                this.f24213k.factcheck = tL_factCheck4;
                return tL_factCheck4;
            } else if (b10.d.contains(w6Var)) {
                return this.f24213k.factcheck;
            } else {
                HashMap hashMap = (HashMap) longSparseArray.get(B0);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    longSparseArray.put(B0, hashMap);
                }
                if (!hashMap.containsKey(w6Var)) {
                    hashMap.put(w6Var, new e3(b10, w6Var, this, 1));
                    a aVar = b10.f27855e;
                    g0.r(aVar);
                    g0.h3(aVar, 80L);
                }
                return this.f24213k.factcheck;
            }
        }
        return null;
    }

    public final long R1() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.f24213k;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long j3 = peer.user_id;
            if (j3 != 0) {
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 instanceof TLRPC.TL_peerUser) {
                    return peer2.user_id;
                }
                return j3;
            } else if (peer.channel_id != 0) {
                if (k4()) {
                    TLRPC.Peer peer3 = this.f24213k.fwd_from.from_id;
                    if (peer3 instanceof TLRPC.TL_peerUser) {
                        return peer3.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.f24213k.fwd_from;
                TLRPC.Peer peer4 = messageFwdHeader2.from_id;
                if (peer4 instanceof TLRPC.TL_peerChannel) {
                    return -peer4.channel_id;
                }
                if (peer4 instanceof TLRPC.TL_peerChat) {
                    return -peer4.chat_id;
                }
                return -messageFwdHeader2.saved_from_peer.channel_id;
            } else {
                long j10 = peer.chat_id;
                if (j10 != 0) {
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
                    return -j10;
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
        return this.f24213k.media_unread;
    }

    public final boolean R3() {
        return S3(this.f24213k);
    }

    public final String S0() {
        if (F0() != null) {
            return w7.r(null, F0());
        }
        return T0(this.f24213k);
    }

    public final long S1() {
        h61 h61Var = this.f24199g3;
        if (h61Var != null) {
            return h61Var.f35804g.size;
        }
        h61 h61Var2 = this.f24203h3;
        if (h61Var2 != null) {
            return h61Var2.f35804g.size;
        }
        h61 h61Var3 = this.f24208i3;
        if (h61Var3 != null) {
            return h61Var3.f35804g.size;
        }
        return p1(n1(this.f24213k));
    }

    public final boolean S2() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull d2;
        TLRPC.WallPaper wallPaper;
        if (!X4() || (message = this.f24213k) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (d2 = np.u1(this.K1).d2(B0(this.f24213k))) == null || (wallPaper = d2.wallpaper) == null || !d2.wallpaper_overridden || this.f24213k.action.wallpaper.f28588id != wallPaper.f28588id) {
            return false;
        }
        return true;
    }

    public final boolean S4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (R4(this.f24213k) && (message = this.f24213k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean S5() {
        TLRPC.Message message = this.f24213k;
        if (message != null && message.peer_id != null && !N3() && !r4() && np.u1(this.K1).O2(B0(this.f24213k))) {
            return true;
        }
        return false;
    }

    public final boolean T(gj gjVar) {
        if (gjVar == null || e1() != gjVar.e1() || B0(this.f24213k) != B0(gjVar.f24213k)) {
            return false;
        }
        return true;
    }

    public final long T1() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome) == null) {
            return 0L;
        }
        long j3 = tL_messages_emojiGameOutcome.ton_amount;
        if (j3 > 0) {
            return j3;
        }
        return -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public final boolean T2() {
        return n1(this.f24213k) instanceof TLRPC.TL_messageMediaDice;
    }

    public final boolean T3() {
        if (this.D == 17 && (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPoll)) {
            return true;
        }
        return false;
    }

    public final boolean T4() {
        TLRPC.Message message = this.f24213k;
        if (message != null) {
            if (R4(message) || (h4() && j21.m(this))) {
                TLRPC.Message message2 = this.f24213k;
                if (message2.voiceTranscriptionOpen && message2.voiceTranscription != null) {
                    if (message2.voiceTranscriptionFinal || j21.l(this)) {
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

    public final String U1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i7);
                i7++;
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
        if (F0() != null && !L4(this.f24213k) && !I3() && !R4(this.f24213k) && !M2()) {
            return true;
        }
        return false;
    }

    public final void U5() {
        TLRPC.Message message;
        if (!this.K2 && this.v != null && (message = this.f24213k) != null && message.entities != null) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j3 = peer.user_id;
                if (j3 == 777000 || j3 == 489000) {
                    if (f24163q3 == null) {
                        f24163q3 = Pattern.compile("[\\d\\-]{5,8}");
                    }
                    try {
                        Matcher matcher = f24163q3.matcher(this.v);
                        if (matcher.find()) {
                            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                            tL_messageEntitySpoiler.offset = matcher.start();
                            tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                            this.f24213k.entities.add(tL_messageEntitySpoiler);
                        }
                    } catch (Exception e10) {
                        a8.g(e10, false);
                    }
                    this.K2 = true;
                }
            }
        }
    }

    public final String V0() {
        TLRPC.Document document = this.f24225n;
        if (document == null) {
            document = G0(this.f24213k);
        }
        if (document != null) {
            TLRPC.Document document2 = this.f24225n;
            if (document2 == null) {
                document2 = G0(this.f24213k);
            }
            return w7.r(null, document2);
        }
        return T0(this.f24213k);
    }

    public final String V1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        for (int i7 = 0; i7 < F0.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i7);
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

    public final boolean V4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return W4((TLRPC.TL_messageMediaPoll) n1);
    }

    public final int V5() {
        int i7;
        fv fvVar = this.f24270y2;
        if (fvVar != null) {
            return fvVar.t();
        }
        if (this.B2 == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.B2.size(); i11++) {
            int i12 = ((dj) this.B2.get(i11)).f23562f;
            dj djVar = (dj) this.B2.get(i11);
            if (djVar.K && djVar.f()) {
                i7 = djVar.G;
            } else {
                i7 = djVar.f23566w;
            }
            i10 += i7 + i12 + ((dj) this.B2.get(i11)).h;
        }
        return i10;
    }

    public final Long W0() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.f24213k;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(n5.o(peer));
    }

    public final TLRPC.WebPage W1() {
        if (!z4()) {
            return null;
        }
        TLRPC.TL_webPage tL_webPage = this.f24176b3;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
        tL_webPage2.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.f28579id = this.f24213k.media.f28456id;
        tL_webPageAttributeStory.peer = np.u1(this.K1).B1(this.f24213k.media.user_id);
        TL_stories.StoryItem storyItem = this.f24213k.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage2.attributes.add(tL_webPageAttributeStory);
        this.f24176b3 = tL_webPage2;
        return tL_webPage2;
    }

    public final boolean W3() {
        if (n1(this.f24213k) != null && n1(this.f24213k).nopremium) {
            return false;
        }
        return X3(F0());
    }

    public final int W5(org.telegram.ui.Cells.y1 y1Var) {
        if (this.B2 == null) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < this.B2.size(); i10++) {
            i7 += ((dj) this.B2.get(i10)).j(y1Var) + ((dj) this.B2.get(i10)).f23562f + ((dj) this.B2.get(i10)).h;
        }
        return i7;
    }

    public final TLObject X0() {
        Long W0 = W0();
        if (W0 == null) {
            return null;
        }
        return np.u1(this.K1).g2(W0.longValue());
    }

    public final boolean X2() {
        TLRPC.Message message = this.f24213k;
        if (message != null && (message.flags & 32768) != 0 && message.edit_date != 0 && !message.edit_hide) {
            return true;
        }
        return false;
    }

    public final boolean X4() {
        if (this.D != 22) {
            TLRPC.Message message = this.f24213k;
            if (message == null || !(message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int X5() {
        int i7;
        fv fvVar = this.f24270y2;
        if (fvVar != null) {
            return fvVar.t();
        }
        Integer num = this.V2;
        if (num != null) {
            return num.intValue();
        }
        if (this.B2 == null) {
            this.V2 = 0;
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.B2.size(); i11++) {
            int i12 = ((dj) this.B2.get(i11)).f23562f;
            dj djVar = (dj) this.B2.get(i11);
            if (djVar.K) {
                i7 = djVar.G;
            } else {
                i7 = djVar.f23566w;
            }
            i10 += i12 + i7 + ((dj) this.B2.get(i11)).h;
        }
        this.V2 = Integer.valueOf(i10);
        return i10;
    }

    public final String Y0() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.f24213k.fwd_from;
        if (messageFwdHeader != null) {
            TLRPC.Peer peer = messageFwdHeader.from_id;
            boolean z10 = peer instanceof TLRPC.TL_peerChannel;
            int i7 = this.K1;
            if (z10) {
                TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(this.f24213k.fwd_from.from_id.channel_id));
                if (O0 != null) {
                    return O0.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                TLRPC.Chat O02 = np.u1(i7).O0(Long.valueOf(this.f24213k.fwd_from.from_id.chat_id));
                if (O02 != null) {
                    return O02.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerUser) {
                TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(this.f24213k.fwd_from.from_id.user_id));
                if (c22 != null) {
                    return p10.q(c22);
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
        int i7 = this.K1;
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-B0(this.f24213k)));
        return Z1(i7, this.f24213k, c8.dd.b(c8.dd.b(c8.dd.b(0, 1, v3.c0(O0)), 4, v3.p0(O0)), 8, p10.v(np.u1(i7).c2(Long.valueOf(B0(this.f24213k))))));
    }

    public final boolean Y2() {
        TLRPC.Message message = this.f24213k;
        if (message.send_state == 3 && message.f28455id > 0) {
            return true;
        }
        return false;
    }

    public final boolean Y3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.f24213k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name)) {
            return true;
        }
        return false;
    }

    public final boolean Y4() {
        TLRPC.Message message;
        if (X4() && (message = this.f24213k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Y5() {
        boolean z10 = !this.f24206i1;
        this.f24206i1 = z10;
        np.u1(this.K1).h7.edit().putBoolean("c" + B0(this.f24213k) + "_rec", z10).apply();
    }

    public final long Z0() {
        return B1(this.f24213k.from_id);
    }

    public final boolean Z2() {
        if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) {
            if (n1(this.f24213k).photo.f28458id == 0) {
                return true;
            }
            return false;
        } else if ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument) && n1(this.f24213k).document.dc_id == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean Z3() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) n1).poll.public_voters;
    }

    public final boolean Z4() {
        return n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public final boolean a3() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.T2;
        boolean z10 = false;
        if (bool != null) {
            TLRPC.Message message = this.f24213k;
            if (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        TLRPC.Message message2 = this.f24213k;
        if (message2 != null && (messageMedia = message2.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(z71.e(webPage.url))) {
            z10 = true;
        }
        this.T2 = Boolean.valueOf(z10);
        return z10;
    }

    public final boolean a4() {
        return b4(this.f24213k);
    }

    public final boolean a5() {
        if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) || n1(this.f24213k).webpage.document == null || s3(n1(this.f24213k).webpage.document, false)) {
            return false;
        }
        return true;
    }

    public final void a6() {
        int i7 = this.K1;
        b6(np.u1(i7).d, np.u1(i7).f25802b, null, null);
    }

    public final TLObject b1() {
        TLRPC.Message message = this.f24213k;
        if (message != null) {
            TLRPC.Peer peer = message.from_id;
            boolean z10 = peer instanceof TLRPC.TL_peerChannel_layer131;
            int i7 = this.K1;
            if (!z10 && !(peer instanceof TLRPC.TL_peerChannel)) {
                if (!(peer instanceof TLRPC.TL_peerUser_layer131) && !(peer instanceof TLRPC.TL_peerUser)) {
                    if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
                        return np.u1(i7).O0(Long.valueOf(this.f24213k.from_id.chat_id));
                    }
                    return null;
                }
                return np.u1(i7).c2(Long.valueOf(this.f24213k.from_id.user_id));
            }
            return np.u1(i7).O0(Long.valueOf(this.f24213k.from_id.channel_id));
        }
        return null;
    }

    public final boolean b3() {
        return c3(this.f24213k);
    }

    public final boolean b5() {
        TLRPC.Message message = this.f24213k;
        if (c3(message) && message.ephemeralAnchorMsgId != 0) {
            return true;
        }
        return false;
    }

    public final void b6(java.util.AbstractMap r35, java.util.AbstractMap r36, a0.h r37, a0.h r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.b6(java.util.AbstractMap, java.util.AbstractMap, a0.h, a0.h):void");
    }

    public final boolean c(CharSequence charSequence, boolean z10, boolean z11) {
        if (charSequence == null) {
            return false;
        }
        if (!this.G0 && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return b(charSequence, O0(), P3(), true, z10, z11, 0);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return b(charSequence, arrayList, P3(), true, z10, z11, 0);
    }

    public final long c1() {
        long j3 = this.d;
        if (j3 != 0) {
            return j3;
        }
        return d1();
    }

    public final boolean c4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) n1).poll.quiz;
    }

    public final boolean c5() {
        return d5(this.f24213k);
    }

    public final long d1() {
        long j3 = this.f24185e;
        if (j3 != 0) {
            return j3;
        }
        return this.f24213k.grouped_id;
    }

    public final TLRPC.User d2(AbstractMap abstractMap, a0.h hVar, long j3) {
        TLRPC.User user;
        if (abstractMap != null) {
            user = (TLRPC.User) abstractMap.get(Long.valueOf(j3));
        } else if (hVar != null) {
            user = (TLRPC.User) hVar.f(j3);
        } else {
            user = null;
        }
        if (user == null) {
            return np.u1(this.K1).c2(Long.valueOf(j3));
        }
        return user;
    }

    public final boolean d3() {
        return e3(this.f24213k);
    }

    public final boolean d4() {
        if (!Y2() && !r4() && q4() && !c3(this.f24213k) && !g3() && z()) {
            return true;
        }
        return false;
    }

    public final int e1() {
        TLRPC.Message message = this.f24213k;
        int i7 = message.ephemeralAnchorMsgId;
        if (i7 != 0) {
            return i7;
        }
        return message.f28455id;
    }

    public final boolean e4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        gj gjVar = this.C;
        if ((gjVar == null || !(gjVar.f24213k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.f24213k).reply_to) != null) {
            if ((messageReplyHeader.reply_to_msg_id != 0 || messageReplyHeader.reply_to_random_id != 0) && (message.flags & 8) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e5() {
        if ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.f24213k).webpage != null && !TextUtils.isEmpty(n1(this.f24213k).webpage.embed_url) && "YouTube".equals(n1(this.f24213k).webpage.site_name)) {
            return true;
        }
        return false;
    }

    public final void e6(boolean z10) {
        ArrayList arrayList = this.f24189e3;
        if (arrayList == null) {
            this.f24208i3 = null;
            D2(z10);
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((h61) obj2).e(z10);
            }
        }
        this.f24199g3 = i61.a0(this.f24189e3);
        this.f24203h3 = i61.b0(this.f24189e3);
        this.f24208i3 = i61.N(this.f24189e3);
    }

    public final void f(int i7, long j3, boolean z10) {
        boolean z11;
        TLRPC.Message message = this.f24213k;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.f24213k;
            TLRPC.TL_messageReactions tL_messageReactions = message2.reactions;
            boolean z12 = false;
            if (B0(message2) == k10.i(this.K1).e()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messageReactions.reactions_as_tags = z11;
            TLRPC.TL_messageReactions tL_messageReactions2 = this.f24213k.reactions;
            if (o3() || p3()) {
                z12 = true;
            }
            tL_messageReactions2.can_see_list = z12;
        }
        g(this.K1, this.f24213k.reactions, i7, j3, z10);
    }

    public final boolean f4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        gj gjVar = this.C;
        if ((gjVar == null || !(gjVar.f24213k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.f24213k).reply_to) != null && messageReplyHeader.story_id != 0 && (message.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public final void f5() {
        if (this.f24225n == null && this.f24228o != null && !this.f24248t) {
            this.f24248t = true;
            org.telegram.ui.Components.p5.g(this.K1).b(this.f24228o.longValue(), new org.telegram.ui.Components.m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    g0.g3(new gi(4, gj.this, document));
                }
            });
        }
    }

    public final Spannable g0(TLRPC.TodoItem todoItem) {
        CharSequence h02 = h0(todoItem.title, P3());
        if (!(h02 instanceof Spannable)) {
            h02 = new SpannableStringBuilder(h02);
        }
        Spannable spannable = (Spannable) h02;
        spannable.setSpan(new s41("task?" + todoItem.f28581id, 0), 0, h02.length(), 33);
        return spannable;
    }

    public final int g2() {
        String str;
        Integer num = this.f24217k3;
        if (num != null) {
            return num.intValue();
        }
        if (!L4(this.f24213k)) {
            this.f24217k3 = -1;
            return -1;
        }
        TLRPC.MessageMedia m12 = m1(this);
        int i7 = m12.video_timestamp;
        if (i7 != 0) {
            return i7;
        }
        TLRPC.WebPage webPage = m12.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int V = LaunchActivity.V(Uri.parse(str));
                this.f24217k3 = Integer.valueOf(V);
                return V;
            } catch (Exception unused) {
            }
        }
        this.f24217k3 = -1;
        return -1;
    }

    public final boolean g3() {
        int i7 = this.D;
        if ((i7 == 23 || i7 == 24) && (this.f24213k.media.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return true;
        }
        return false;
    }

    public final boolean g4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (h4() && (message = this.f24213k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean g6(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.g6(boolean):boolean");
    }

    public final TLRPC.InputStickerSet h1() {
        return j1(this.f24213k);
    }

    public final boolean h3() {
        if (e1() >= 0 && !r4()) {
            int i7 = this.D;
            if (i7 == 0 || i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8 || i7 == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h4() {
        int i7;
        if (this.S == 0) {
            if (this.D != 5 && !j4(this.f24213k)) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            this.S = i7;
        }
        if (this.S == 1) {
            return true;
        }
        return false;
    }

    public final void h5() {
        TLRPC.TL_messageReactions tL_messageReactions = this.f24213k.reactions;
        if (tL_messageReactions != null && tL_messageReactions.recent_reactions != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < this.f24213k.reactions.recent_reactions.size(); i7++) {
                if (this.f24213k.reactions.recent_reactions.get(i7).unread) {
                    this.f24213k.reactions.recent_reactions.get(i7).unread = false;
                    z10 = true;
                }
            }
            if (z10) {
                int i10 = this.K1;
                ur a02 = ur.a0(i10);
                TLRPC.Message message = this.f24213k;
                a02.I(new vq(a02, message.dialog_id, b2(i10, message, false, false), this.f24213k.f28455id, 6));
            }
        }
    }

    public final boolean i() {
        TLRPC.Peer peer;
        if (!cz.T0) {
            return false;
        }
        TLRPC.Message message = this.f24213k;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            np u12 = np.u1(this.K1);
            TLRPC.Peer peer2 = this.f24213k.peer_id;
            long j3 = peer2.channel_id;
            if (j3 == 0) {
                j3 = peer2.chat_id;
            }
            TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
            if ((O0 == null || !O0.gigagroup) && O0 != null && ((v3.C(O0.banned_rights, 8) || v3.C(O0.default_banned_rights, 8)) && !v3.N(O0))) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence i2() {
        String str;
        String str2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.f24213k;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(hd.N0(2131747935, null));
            spannableString.setSpan(new hi.q9(1), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (this.L2 && (tL_textWithEntities = this.f24213k.translatedVoiceTranscription) != null) {
            str2 = tL_textWithEntities.text;
        } else {
            str2 = this.f24213k.voiceTranscription;
        }
        if (!TextUtils.isEmpty(str2)) {
            return j6.m(str2, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false, null, 0);
        }
        return str2;
    }

    public final boolean i3() {
        if (this.f24167a != 0) {
            return true;
        }
        return false;
    }

    public final void i5() {
        boolean z10;
        int i7;
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence m10;
        boolean z11;
        boolean z12;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message;
        if (!this.G0) {
            this.f24264x0 = 0;
            this.f24239q2 = null;
            ArrayList arrayList = new ArrayList();
            boolean S5 = S5();
            this.N2 = S5;
            if (!S5 && (message = this.f24213k) != null) {
                TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                    if (tL_replyInlineMarkup.rows != null) {
                        for (int i10 = 0; i10 < tL_replyInlineMarkup.rows.size(); i10++) {
                            ArrayList<TL_keyboard.KeyboardInlineButton> arrayList2 = tL_replyInlineMarkup.rows.get(i10).buttons;
                            o2[] o2VarArr = new o2[arrayList2.size()];
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                o2VarArr[i11] = new o2(arrayList2.get(i11));
                            }
                            arrayList.add(o2VarArr);
                        }
                    }
                }
            }
            TLRPC.Message message2 = this.f24213k;
            if (message2 != null && (suggestedPost = message2.suggested_post) != null && !suggestedPost.rejected && !suggestedPost.accepted && !n4() && !o4()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long e10 = k10.i(this.K1).e();
                long o4 = n5.o(this.f24213k.saved_peer_id);
                long o10 = n5.o(this.f24213k.from_id);
                if (e10 == o4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (o4 == o10) {
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
                    i7 = 1 << (arrayList.size() - 1);
                } else {
                    i7 = 0;
                }
                arrayList.add(new n2[]{new p2(1, 2131746894, 2131231085), new p2(2, 2131746895, 2131231084)});
                arrayList.add(new n2[]{new p2(3, 2131746893, 2131231086)});
            } else {
                i7 = 0;
            }
            if (!arrayList.isEmpty()) {
                this.f24239q2 = new b3.j((n2[][]) arrayList.toArray(new n2[arrayList.size()]), i7, 7);
            }
            b3.j jVar = this.f24239q2;
            if ((jVar != null && !p2()) || ((tL_messageReactions = this.f24213k.reactions) != null && !tL_messageReactions.results.isEmpty())) {
                org.telegram.ui.ActionBar.m6.Q();
                StringBuilder sb2 = this.F0;
                if (sb2 == null) {
                    this.F0 = new StringBuilder();
                } else {
                    sb2.setLength(0);
                }
            }
            if (jVar != null) {
                n2[][] n2VarArr = (n2[][]) jVar.f2922c;
                if (!p2()) {
                    for (int i12 = 0; i12 < n2VarArr.length; i12++) {
                        int length = n2VarArr[i12].length;
                        int i13 = 0;
                        for (int i14 = 0; i14 < length; i14++) {
                            n2 n2Var = n2VarArr[i12][i14];
                            StringBuilder sb3 = this.F0;
                            sb3.append(i12);
                            sb3.append(i14);
                            if ((n2Var instanceof o2) && cg.c.c(((o2) n2Var).f26082a, TL_keyboard.TL_inlineButtonTypeBuy.class) && (n1(this.f24213k).flags & 4) != 0) {
                                m10 = hd.N0(2131747188, null);
                            } else {
                                String d = n2Var.d();
                                if (d == null) {
                                    d = "";
                                }
                                m10 = j6.m(d, org.telegram.ui.ActionBar.m6.f29731w2.getFontMetricsInt(), false, null, 0);
                            }
                            StaticLayout staticLayout = new StaticLayout(m10, org.telegram.ui.ActionBar.m6.f29731w2, g0.L(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            if (staticLayout.getLineCount() > 0) {
                                float lineWidth = staticLayout.getLineWidth(0);
                                float lineLeft = staticLayout.getLineLeft(0);
                                if (lineLeft < lineWidth) {
                                    lineWidth -= lineLeft;
                                }
                                if (n2Var.c() != 0) {
                                    lineWidth += g0.L(36.0f);
                                }
                                if (n2Var.b() != 0) {
                                    lineWidth += g0.L(36.0f);
                                }
                                i13 = f3.b(4.0f, (int) Math.ceil(lineWidth), i13);
                            }
                        }
                        this.f24264x0 = Math.max(this.f24264x0, ((length - 1) * g0.L(5.0f)) + ((g0.L(12.0f) + i13) * length));
                    }
                }
            }
        }
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.j():void");
    }

    public final boolean j3() {
        return l3(this.f24213k);
    }

    public final boolean j5() {
        h61 h61Var;
        if (D2(true) && (h61Var = this.f24199g3) != null) {
            return h61Var.b();
        }
        return this.f24272z0;
    }

    public final void k(CharSequence charSequence) {
        TLRPC.User user;
        TextPaint textPaint;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int[] iArr = null;
        if (p3()) {
            user = np.u1(this.K1).c2(Long.valueOf(this.f24213k.from_id.user_id));
        } else {
            user = null;
        }
        this.v = charSequence;
        ArrayList O0 = O0();
        if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame) {
            textPaint = org.telegram.ui.ActionBar.m6.f29750x2;
        } else {
            textPaint = org.telegram.ui.ActionBar.m6.f29578o2;
        }
        if (i()) {
            iArr = new int[1];
        }
        CharSequence m10 = j6.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
        this.v = m10;
        Spannable B5 = B5(m10, O0, textPaint.getFontMetricsInt(), false);
        this.v = B5;
        if (iArr != null && iArr[0] > 1) {
            D5(B5, iArr);
        }
        H(iArr);
        n0(user);
        L5();
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
            boolean S5 = S5();
            if (this.f24271z != null) {
                if (this.L2) {
                    TLRPC.Message message = this.f24213k;
                    if (message.translatedText != null || (this.M2 && message.translatedSummaryText != null)) {
                        z13 = true;
                        if (z13 == this.P2 && this.M2 == this.R2 && S5 == this.Q2) {
                            return;
                        }
                    }
                }
                z13 = false;
                if (z13 == this.P2) {
                    return;
                }
            }
            this.Q2 = S5;
            TLRPC.Message message2 = this.f24213k;
            String str = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            if (this.D == 23) {
                TLRPC.MessageMedia messageMedia = message2.media;
                if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                    str = storyItem.caption;
                    arrayList = storyItem.entities;
                    z10 = true;
                    TLRPC.Message message3 = this.f24213k;
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
                    if (F3() && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame) && !TextUtils.isEmpty(str)) {
                        CharSequence m10 = j6.m(str, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false, null, 0);
                        this.f24271z = m10;
                        this.f24271z = B5(m10, arrayList, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false);
                        if (this.f24213k.send_state != 0) {
                            z11 = false;
                        } else {
                            z11 = !arrayList.isEmpty();
                        }
                        if (!z10 && (z11 || (this.T == 0 && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto_old) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto_layer68) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto_layer74) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument_old) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument_layer68) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument_layer74) && ((!N3() || this.f24213k.send_state == 0) && this.f24213k.f28455id >= 0)))) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            if (M(this.f24271z)) {
                                try {
                                    g0.c((Spannable) this.f24271z, 5, false, true);
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                            }
                            h(P3(), this.f24271z, true, 0, 0, true);
                        }
                        c(this.f24271z, false, z12);
                        this.f24271z = org.telegram.ui.Components.m00.a(this.f24271z, true);
                        if (L4(this.f24213k)) {
                            h(P3(), this.f24271z, true, 3, (int) L0(), false);
                        } else if (I3() || R4(this.f24213k)) {
                            h(P3(), this.f24271z, true, 4, (int) L0(), false);
                        }
                        n(this.f24271z);
                        if (this.Q2) {
                            y5(this.f24271z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                arrayList = new ArrayList<>();
                str = "";
            } else if (p2()) {
                TLRPC.Message message4 = this.f24213k;
                str = message4.media.description;
                message4.message = str;
            }
            z10 = false;
            TLRPC.Message message32 = this.f24213k;
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
        fv fvVar = this.f24270y2;
        if (fvVar != null) {
            ArrayList arrayList = fvVar.h;
            ArrayList arrayList2 = fvVar.f23981g;
            if (!arrayList2.isEmpty() && !fvVar.d && !fvVar.I()) {
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (((wt) obj).f27800b >= arrayList2.size() - 1) {
                            return fvVar.C;
                        }
                    }
                }
                au auVar = (au) i5.c.h(1, arrayList2);
                if (auVar.v()) {
                    return fvVar.C;
                }
                return auVar.J();
            }
            return fvVar.C;
        }
        return this.f24255u2;
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.f24213k;
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
        TLRPC.MessageFwdHeader messageFwdHeader = this.f24213k.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null && peer.channel_id != 0) {
            return v3.n0(np.u1(this.K1).O0(Long.valueOf(this.f24213k.fwd_from.saved_from_peer.channel_id)));
        }
        return false;
    }

    public boolean k5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.k5():boolean");
    }

    public final void l(int i7, String str) {
        TLRPC.Message message = this.f24213k;
        if (message == null) {
            return;
        }
        if (i7 != 0) {
            message.flags |= 1073741824;
            message.quick_reply_shortcut_id = i7;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i7;
            this.f24213k.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
        } else if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.f24213k.quick_reply_shortcut = tL_inputQuickReplyShortcut;
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
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if ((n1 instanceof TLRPC.TL_messageMediaPoll) && (pollResults = ((TLRPC.TL_messageMediaPoll) n1).results) != null) {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        } else {
            str = null;
            arrayList = null;
        }
        if (str != null) {
            CharSequence m10 = j6.m(str, org.telegram.ui.ActionBar.m6.f29341b3.getFontMetricsInt(), false, null, 0);
            this.A = m10;
            Spannable B5 = B5(m10, arrayList, org.telegram.ui.ActionBar.m6.f29341b3.getFontMetricsInt(), false);
            this.A = B5;
            b(B5, arrayList, P3(), true, false, false, 0);
            return;
        }
        this.A = null;
    }

    public final int l1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.l1():int");
    }

    public final ArrayList l2() {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        ArrayList arrayList = new ArrayList();
        if (n1(this.f24213k) != null && n1(this.f24213k).webpage != null && (page = (webPage = n1(this.f24213k).webpage).cached_page) != null) {
            ArrayList<TL_iv.PageBlock> arrayList2 = page.blocks;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i7);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
                        arrayList.add(r1(webPage, pageblockslideshow.items.get(i10)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i11 = 0; i11 < pageblockcollage.items.size(); i11++) {
                        arrayList.add(r1(webPage, pageblockcollage.items.get(i11)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean l4() {
        int i7;
        TLRPC.Message message = this.f24213k;
        if (message instanceof TLRPC.TL_message_secret) {
            if ((((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || t3(this.f24213k)) && (i7 = this.f24213k.ttl) > 0 && i7 <= 60) || R4(this.f24213k) || h4() || L4(this.f24213k)) {
                return true;
            }
            return false;
        } else if ((message instanceof TLRPC.TL_message) && n1(message) != null && n1(this.f24213k).ttl_seconds != 0 && ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) || (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean l5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.l5():boolean");
    }

    public final void m() {
        n(this.v);
    }

    public final void m0(TLRPC.User user) {
        TLRPC.TL_game tL_game;
        int i7 = this.K1;
        if (user == null && p3()) {
            user = np.u1(i7).c2(Long.valueOf(this.f24213k.from_id.user_id));
        }
        gj gjVar = this.C;
        if (gjVar != null && m1(gjVar) != null && m1(this.C).game != null) {
            tL_game = m1(this.C).game;
        } else {
            tL_game = null;
        }
        if (tL_game == null) {
            if (user != null && user.f28583id == k10.i(i7).e()) {
                this.v = hd.a0("ActionYouScored", null, 2131754489, hd.G(this.f24213k.action.score, "Points", new Object[0]));
                return;
            } else {
                this.v = E5(hd.a0("ActionUserScored", null, 2131754503, hd.G(this.f24213k.action.score, "Points", new Object[0])), "un1", user);
                return;
            }
        }
        if (user != null && user.f28583id == k10.i(i7).e()) {
            this.v = hd.a0("ActionYouScoredInGame", null, 2131754488, hd.G(this.f24213k.action.score, "Points", new Object[0]));
        } else {
            this.v = E5(hd.a0("ActionUserScoredInGame", null, 2131754502, hd.G(this.f24213k.action.score, "Points", new Object[0])), "un1", user);
        }
        this.v = E5(this.v, "un2", tL_game);
    }

    public final boolean m5() {
        if (!this.f24212j2) {
            if (!q2()) {
                TLRPC.Message message = this.f24213k;
                if (message instanceof TLRPC.TL_message_secret) {
                    int max = Math.max(message.ttl, n1(message).ttl_seconds);
                    if (max > 0) {
                        if ((((n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) || L4(this.f24213k) || t3(this.f24213k)) && max <= 60) || h4()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } else if ((message instanceof TLRPC.TL_message) && n1(message) != null && n1(this.f24213k).ttl_seconds != 0) {
                    if ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) || (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument)) {
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
        gj gjVar = this.C;
        if (gjVar != null) {
            if (gjVar.e5()) {
                h(P3(), charSequence, false, 3, Integer.MAX_VALUE, false);
            } else if (L4(gjVar.f24213k)) {
                h(P3(), charSequence, false, 3, (int) gjVar.L0(), false);
            } else {
                if (gjVar.I3() || R4(gjVar.f24213k)) {
                    h(P3(), charSequence, false, 4, (int) gjVar.L0(), false);
                }
                if (charSequence == this.v && (message = this.f24213k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                        a6();
                    }
                }
            }
        }
    }

    public void n0(org.telegram.tgnet.TLRPC.User r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.n0(org.telegram.tgnet.TLRPC$User):void");
    }

    public final void n2(ArrayList arrayList, String[] strArr, boolean z10, boolean z11) {
        CharSequence charSequence;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z12;
        if (!arrayList.isEmpty()) {
            boolean z13 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                int i10 = 0;
                while (true) {
                    if (i10 >= strArr.length) {
                        break;
                    } else if (((String) arrayList.get(i7)).contains(strArr[i10])) {
                        z13 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z13) {
                    break;
                }
            }
            if (z13) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < strArr.length) {
                            if (((String) arrayList.get(i11)).contains(strArr[i12])) {
                                z12 = true;
                                break;
                            }
                            i12++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                if (arrayList.size() > 0) {
                    Collections.sort(arrayList, new jg.w(25));
                    arrayList.clear();
                    arrayList.add((String) arrayList.get(0));
                }
            }
            this.f24170a2 = arrayList;
            if (this.f24213k.message != null) {
                j();
                if (!TextUtils.isEmpty(this.f24271z)) {
                    charSequence = this.f24271z;
                } else {
                    charSequence = this.v;
                }
                CharSequence M2 = g0.M2(charSequence, " ", "\n");
                if (z10 && (message = this.f24213k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24213k.reply_to.quote_text);
                    b(spannableStringBuilder, this.f24213k.reply_to.quote_entities, P3(), false, false, false, 0);
                    SpannableString spannableString = new SpannableString("q ");
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131231967, 0);
                    nqVar.f37954y = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29621q6, false);
                    spannableString.setSpan(nqVar, 0, 1, 33);
                    M2 = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(M2);
                }
                String charSequence2 = M2.toString();
                int length = charSequence2.length();
                int indexOf = charSequence2.toLowerCase().indexOf((String) arrayList.get(0));
                if (indexOf < 0) {
                    indexOf = 0;
                }
                if (length > 120 && z11) {
                    float f10 = 120;
                    int max = Math.max(0, indexOf - ((int) (0.1f * f10)));
                    M2 = M2.subSequence(max, Math.min(length, (indexOf - max) + indexOf + ((int) (f10 * 0.9f))));
                }
                this.f24180c2 = M2;
                this.f24175b2 = z11;
            }
        }
    }

    public final boolean n3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.n3():boolean");
    }

    public final boolean n4() {
        int i7;
        TLRPC.Message message = this.f24213k;
        if (message.send_state != 2 || message.f28455id >= 0) {
            if (this.f24242r1 && message.f28455id > 0) {
                int i10 = message.date;
                int currentTime = ConnectionsManager.getInstance(this.K1).getCurrentTime();
                if (this.f24213k.video_processing_pending) {
                    i7 = 300;
                } else {
                    i7 = 60;
                }
                if (i10 < currentTime - i7) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean n5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.n5():boolean");
    }

    public final boolean o() {
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaToDo) || l3(this.f24213k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n1;
        if (tL_messageMediaToDo.todo.list.size() >= np.u1(this.K1).U6) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.o0():void");
    }

    public final int o1() {
        boolean z10 = this.f24268y0;
        if (this.f24272z0) {
            return (z10 ? 1 : 0) | 2;
        }
        return z10 ? 1 : 0;
    }

    public final boolean o2() {
        if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) {
            if (n1(this.f24213k).photo == null || !n1(this.f24213k).photo.has_stickers) {
                return false;
            }
            return true;
        } else if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument)) {
            return false;
        } else {
            return V2(n1(this.f24213k).document);
        }
    }

    public final boolean o3() {
        TLRPC.Message message = this.f24213k;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j3 = peer.channel_id;
            if (j3 != 0) {
                chat = w0(null, null, j3);
            }
        }
        if (!(this.f24213k.from_id instanceof TLRPC.TL_peerChannel) || !v3.T(chat) || !chat.megagroup) {
            return false;
        }
        return true;
    }

    public final boolean o4() {
        TLRPC.Message message = this.f24213k;
        if (message.send_state == 1 && message.f28455id < 0) {
            return true;
        }
        return false;
    }

    public boolean o5() {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!this.f24212j2 && !this.U2 && B0(this.f24213k) != 489000) {
            boolean z10 = this.f24227n2;
            int i7 = this.K1;
            if (z10) {
                long j3 = k10.i(i7).f24987n;
                long Q1 = Q1(j3, this.f24213k);
                if (Q1 != j3 && Q1 != 2666000 && (message = this.f24213k) != null && (messageFwdHeader = message.fwd_from) != null) {
                    if (messageFwdHeader.from_id != null || messageFwdHeader.saved_from_id != null) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (this.D != 27 && !r4() && !this.C2 && !this.f24250t1 && !this.f24242r1 && this.T == 0) {
                if (this.f24235p2 != 2) {
                    TLRPC.Message message2 = this.f24213k;
                    if (!message2.noforwards) {
                        if (message2.fwd_from != null && !P3()) {
                            TLRPC.Message message3 = this.f24213k;
                            if (message3.fwd_from.saved_from_peer != null && B0(message3) == k10.i(i7).e()) {
                                return true;
                            }
                        }
                        int i10 = this.D;
                        if (i10 != 13 && i10 != 15 && i10 != 19) {
                            TLRPC.MessageFwdHeader messageFwdHeader2 = this.f24213k.fwd_from;
                            if (messageFwdHeader2 == null || !(messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) || P3()) {
                                if (p3()) {
                                    TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(this.f24213k.from_id.user_id));
                                    if (c22 == null || !c22.bot || (!"reviews_bot".equals(p10.o(c22)) && !"ReviewInsightsBot".equals(p10.o(c22)))) {
                                        if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaEmpty) && n1(this.f24213k) != null) {
                                            if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) || (n1(this.f24213k).webpage instanceof TLRPC.TL_webPage)) {
                                                if (c22 == null || !c22.bot || p2()) {
                                                    if (!N3()) {
                                                        if (!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame)) {
                                                            if ((!(n1(this.f24213k) instanceof TLRPC.TL_messageMediaInvoice) || p2()) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                                TLRPC.Peer peer = this.f24213k.peer_id;
                                                                TLRPC.Chat chat = null;
                                                                if (peer != null) {
                                                                    long j10 = peer.channel_id;
                                                                    if (j10 != 0) {
                                                                        chat = w0(null, null, j10);
                                                                    }
                                                                }
                                                                if (v3.T(chat) && chat.megagroup && v3.t0(chat) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaContact) && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaGeo)) {
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
                                TLRPC.Message message4 = this.f24213k;
                                if ((message4.from_id instanceof TLRPC.TL_peerChannel) || message4.post) {
                                    if (!(n1(message4) instanceof TLRPC.TL_messageMediaWebPage) || P3()) {
                                        if (!A4()) {
                                            TLRPC.Message message5 = this.f24213k;
                                            if (message5.peer_id.channel_id != 0) {
                                                if (message5.via_bot_id != 0 || message5.reply_to != null) {
                                                    int i11 = this.D;
                                                    if (i11 != 13 && i11 != 15) {
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
            user = np.u1(this.K1).c2(Long.valueOf(B0(this.f24213k)));
        }
        if (user != null) {
            str = p10.k(user, true);
        } else {
            str = "";
        }
        try {
            if ("XTR".equals(this.f24213k.action.currency)) {
                str2 = "XTR " + this.f24213k.action.total_amount;
            } else {
                hd E0 = hd.E0();
                TLRPC.MessageAction messageAction = this.f24213k.action;
                str2 = E0.p(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            str2 = "<error>";
        }
        gj gjVar = this.C;
        if (gjVar != null && (m1(gjVar) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.f24213k.action;
            if (messageAction2.subscription_until_date != 0) {
                if (z10) {
                    this.v = hd.a0(null, null, 2131747170, str, str2, m1(this.C).title, hd.x(this.f24213k.action.subscription_until_date, false));
                } else {
                    this.v = hd.a0(null, null, 2131747166, str2, str, m1(this.C).title, hd.x(this.f24213k.action.subscription_until_date, false));
                }
            } else if (messageAction2.recurring_init && !z10) {
                this.v = hd.a0(null, null, 2131747167, str2, str, m1(this.C).title);
            } else {
                this.v = hd.a0(null, null, 2131747172, str2, str, m1(this.C).title);
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.f24213k.action;
            int i7 = messageAction3.subscription_until_date;
            if (i7 != 0) {
                if (z10) {
                    this.v = hd.a0(null, null, 2131747171, str, str2, hd.x(i7, false));
                } else {
                    this.v = hd.a0(null, null, 2131747165, str2, str, hd.x(i7, false));
                }
            } else if (messageAction3.recurring_init && !z10) {
                this.v = hd.a0(null, null, 2131747168, str2, str);
            } else {
                this.v = hd.a0(null, null, 2131747169, str2, str);
            }
        }
        this.v = di.pb.T0(this.v);
    }

    public final boolean p2() {
        TLRPC.MessageMedia messageMedia = this.f24213k.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean p3() {
        TLRPC.Message message = this.f24213k;
        if ((message.from_id instanceof TLRPC.TL_peerUser) && !message.post) {
            return true;
        }
        return false;
    }

    public final boolean p4() {
        int i7;
        TLRPC.Chat O0;
        Boolean bool = this.f24251t2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f24213k != null && (((i7 = this.D) == 1 || i7 == 3 || i7 == 9 || i7 == 8 || i7 == 5) && !this.B0 && !this.f24212j2 && !P3())) {
            TLRPC.Message message = this.f24213k;
            if (message.send_state == 0) {
                if (!message.restriction_reason.isEmpty()) {
                    for (int i10 = 0; i10 < this.f24213k.restriction_reason.size(); i10++) {
                        TLRPC.RestrictionReason restrictionReason = this.f24213k.restriction_reason.get(i10);
                        if ("sensitive".equals(restrictionReason.reason)) {
                            if (!"all".equals(restrictionReason.platform)) {
                                if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                                    t0.u();
                                    if (!s2.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason.platform)) {
                                }
                            }
                            this.f24251t2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                if (B0(this.f24213k) < 0 && (O0 = np.u1(this.K1).O0(Long.valueOf(-B0(this.f24213k)))) != null && O0.restriction_reason != null) {
                    for (int i11 = 0; i11 < O0.restriction_reason.size(); i11++) {
                        TLRPC.RestrictionReason restrictionReason2 = O0.restriction_reason.get(i11);
                        if ("sensitive".equals(restrictionReason2.reason)) {
                            if (!"all".equals(restrictionReason2.platform)) {
                                if ("android".equals(restrictionReason2.platform) || "android-ios".equals(restrictionReason2.platform) || "ios-android".equals(restrictionReason2.platform)) {
                                    t0.u();
                                    if (!s2.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason2.platform)) {
                                }
                            }
                            this.f24251t2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                this.f24251t2 = Boolean.FALSE;
            }
        }
        return false;
    }

    public final boolean p5() {
        long B0 = B0(this.f24213k);
        int i7 = this.K1;
        if (v3.o0(i7, B0) && Z0() != k10.i(i7).e() && !P3()) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        TLRPC.MessageMedia n1 = n1(this.f24213k);
        if (!(n1 instanceof TLRPC.TL_messageMediaToDo) || l3(this.f24213k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n1;
        if (!P3() && !tL_messageMediaToDo.todo.others_can_complete) {
            return false;
        }
        return true;
    }

    public final void q0(TLRPC.Chat chat, TLRPC.User user) {
        boolean z10;
        String q10;
        if (user == null && chat == null) {
            boolean p32 = p3();
            int i7 = this.K1;
            if (p32) {
                user = np.u1(i7).c2(Long.valueOf(this.f24213k.from_id.user_id));
            }
            if (user == null) {
                TLRPC.Peer peer = this.f24213k.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = np.u1(i7).O0(Long.valueOf(this.f24213k.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = np.u1(i7).O0(Long.valueOf(this.f24213k.peer_id.chat_id));
                }
            }
        }
        gj gjVar = this.C;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f24213k;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (gjVar.I3()) {
                    String N0 = hd.N0(2131754591, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N0, "un1", chat);
                    return;
                } else if (L4(this.C.f24213k)) {
                    String N02 = hd.N0(2131754583, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N02, "un1", chat);
                    return;
                } else if (t3(this.C.f24213k)) {
                    String N03 = hd.N0(2131754592, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N03, "un1", chat);
                    return;
                } else if (R4(this.C.f24213k)) {
                    String N04 = hd.N0(2131754582, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N04, "un1", chat);
                    return;
                } else if (this.C.h4()) {
                    String N05 = hd.N0(2131754586, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N05, "un1", chat);
                    return;
                } else if ((this.C.t4() || this.C.J2()) && !this.C.G2()) {
                    String N06 = hd.N0(2131754585, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N06, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaDocument) {
                    String N07 = hd.N0(2131754596, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N07, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaGeo) {
                    String N08 = hd.N0(2131754594, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N08, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String N09 = hd.N0(2131754593, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N09, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaContact) {
                    String N010 = hd.N0(2131754597, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N010, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaPoll) {
                    if (((TLRPC.TL_messageMediaPoll) m1(this.C)).poll.quiz) {
                        String N011 = hd.N0(2131754587, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = E5(N011, "un1", chat);
                        return;
                    }
                    String N012 = hd.N0(2131754588, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N012, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaPhoto) {
                    String N013 = hd.N0(2131754589, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N013, "un1", chat);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaPaidMedia) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) m1(this.C);
                    if (chat != null) {
                        q10 = chat.title;
                    } else {
                        q10 = p10.q(user);
                    }
                    this.v = hd.G((int) tL_messageMediaPaidMedia.stars_amount, "NotificationPinnedPaidMedia", q10);
                    return;
                } else if (m1(this.C) instanceof TLRPC.TL_messageMediaGame) {
                    String a02 = hd.a0("ActionPinnedGame", null, 2131754595, "🎮 " + m1(this.C).game.title);
                    if (user != 0) {
                        chat = user;
                    }
                    CharSequence E5 = E5(a02, "un1", chat);
                    this.v = E5;
                    this.v = j6.m(E5, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false, null, 0);
                    return;
                } else {
                    CharSequence charSequence = this.C.v;
                    if (charSequence != null && charSequence.length() > 0) {
                        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(this.C.v);
                        if (cloneSpans.length() > 20) {
                            cloneSpans = cloneSpans.subSequence(0, 20);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        SpannableStringBuilder m10 = j6.m(cloneSpans, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), true, null, 0);
                        gj gjVar2 = this.C;
                        if (gjVar2 != null && gjVar2.f24213k != null) {
                            m10 = gjVar2.A5(m10, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt());
                        }
                        si.h(this.C, (Spannable) m10);
                        if (z10) {
                            if (m10 instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) m10).append((CharSequence) "...");
                            } else if (m10 != null) {
                                m10 = new SpannableStringBuilder(m10).append((CharSequence) "...");
                            }
                        }
                        SpannableStringBuilder m0 = g0.m0(hd.N0(2131754584, null), m10);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = E5(m0, "un1", chat);
                        return;
                    }
                    String N014 = hd.N0(2131754590, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = E5(N014, "un1", chat);
                    return;
                }
            }
        }
        String N015 = hd.N0(2131754590, null);
        if (user != null) {
            chat = user;
        }
        this.v = E5(N015, "un1", chat);
    }

    public final java.lang.CharSequence q1(org.telegram.tgnet.TLRPC.MessageMedia r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.q1(org.telegram.tgnet.TLRPC$MessageMedia):java.lang.CharSequence");
    }

    public final boolean q2() {
        TLRPC.MessageMedia messageMedia = this.f24213k.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.f24213k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return false;
        }
        return true;
    }

    public final boolean q3() {
        return t3(this.f24213k);
    }

    public final boolean q4() {
        TLRPC.Message message = this.f24213k;
        if (message.send_state != 0 && message.f28455id <= 0) {
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
        if (q2()) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.f24213k.media.extended_media.get(0);
            if (!z10) {
                this.f24233p0 = new ArrayList(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                c6(this.f24233p0, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.f24226n0 = this.f24213k;
            if (this.I1 == null) {
                Q();
                return;
            }
            return;
        }
        TLRPC.Message message = this.f24213k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (!z10) {
                    this.f24233p0 = new ArrayList(photo.sizes);
                } else {
                    ArrayList arrayList12 = this.f24233p0;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i7 = 0; i7 < this.f24233p0.size(); i7++) {
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.f24233p0.get(i7);
                            int i10 = 0;
                            while (true) {
                                if (i10 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i10);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
                if (photo.dc_id != 0 && (arrayList11 = this.f24233p0) != null) {
                    int size = arrayList11.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) this.f24233p0.get(i11)).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.f24226n0 = this.f24213k.action.photo;
            }
        } else if (this.f24225n == null && this.f24228o == null) {
            TLRPC.Photo photo2 = null;
            if (n1(message) != null && !(n1(this.f24213k) instanceof TLRPC.TL_messageMediaEmpty)) {
                if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo3 = n1(this.f24213k).photo;
                    if (z10 && ((arrayList10 = this.f24233p0) == null || arrayList10.size() == photo3.sizes.size())) {
                        ArrayList arrayList13 = this.f24233p0;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            for (int i12 = 0; i12 < this.f24233p0.size(); i12++) {
                                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f24233p0.get(i12);
                                if (photoSize3 != null) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= photo3.sizes.size()) {
                                            break;
                                        }
                                        TLRPC.PhotoSize photoSize4 = photo3.sizes.get(i13);
                                        if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                            if (photoSize4.type.equals(photoSize3.type)) {
                                                photoSize3.location = photoSize4.location;
                                                break;
                                            } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                                this.f24233p0.set(i12, photoSize4);
                                                break;
                                            }
                                        }
                                        i13++;
                                    }
                                }
                            }
                        }
                    } else {
                        this.f24233p0 = new ArrayList(photo3.sizes);
                    }
                    this.f24226n0 = n1(this.f24213k).photo;
                    return;
                } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Photo photo4 = ((TLRPC.TL_messageMediaDocument) n1(this.f24213k)).video_cover;
                    if (photo4 != null) {
                        if (z10 && ((arrayList9 = this.f24233p0) == null || arrayList9.size() == photo4.sizes.size())) {
                            ArrayList arrayList14 = this.f24233p0;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                for (int i14 = 0; i14 < this.f24233p0.size(); i14++) {
                                    TLRPC.PhotoSize photoSize5 = (TLRPC.PhotoSize) this.f24233p0.get(i14);
                                    if (photoSize5 != null) {
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= photo4.sizes.size()) {
                                                break;
                                            }
                                            TLRPC.PhotoSize photoSize6 = photo4.sizes.get(i15);
                                            if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                                if (photoSize6.type.equals(photoSize5.type)) {
                                                    photoSize5.location = photoSize6.location;
                                                    break;
                                                } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                                    this.f24233p0.set(i14, photoSize6);
                                                    break;
                                                }
                                            }
                                            i15++;
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f24233p0 = new ArrayList(photo4.sizes);
                        }
                        this.f24226n0 = photo4;
                        return;
                    }
                    TLRPC.Document F0 = F0();
                    if (W2(F0)) {
                        if (z10 && (arrayList8 = this.f24233p0) != null) {
                            if (!arrayList8.isEmpty()) {
                                c6(this.f24233p0, F0.thumbs);
                            }
                        } else {
                            ArrayList arrayList15 = new ArrayList();
                            this.f24233p0 = arrayList15;
                            arrayList15.addAll(F0.thumbs);
                        }
                        this.f24226n0 = F0;
                        return;
                    }
                    return;
                } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame) {
                    TLRPC.Document document = n1(this.f24213k).game.document;
                    if (document != null && W2(document)) {
                        if (!z10) {
                            ArrayList arrayList16 = new ArrayList();
                            this.f24233p0 = arrayList16;
                            arrayList16.addAll(document.thumbs);
                        } else {
                            ArrayList arrayList17 = this.f24233p0;
                            if (arrayList17 != null && !arrayList17.isEmpty()) {
                                c6(this.f24233p0, document.thumbs);
                            }
                        }
                        this.f24226n0 = document;
                    }
                    TLRPC.Photo photo5 = n1(this.f24213k).game.photo;
                    if (photo5 != null) {
                        if (z10 && (arrayList7 = this.f24237q0) != null) {
                            if (!arrayList7.isEmpty()) {
                                c6(this.f24237q0, photo5.sizes);
                            }
                        } else {
                            this.f24237q0 = new ArrayList(photo5.sizes);
                        }
                        this.f24229o0 = photo5;
                    }
                    if (this.f24233p0 == null && (arrayList6 = this.f24237q0) != null) {
                        this.f24233p0 = arrayList6;
                        this.f24237q0 = null;
                        this.f24226n0 = this.f24229o0;
                        this.f24229o0 = null;
                        return;
                    }
                    return;
                } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) {
                    TLRPC.Photo photo6 = n1(this.f24213k).webpage.photo;
                    TLRPC.Document document2 = n1(this.f24213k).webpage.document;
                    if (photo6 != null) {
                        if (z10 && (arrayList5 = this.f24233p0) != null) {
                            if (!arrayList5.isEmpty()) {
                                c6(this.f24233p0, photo6.sizes);
                            }
                        } else {
                            this.f24233p0 = new ArrayList(photo6.sizes);
                        }
                        this.f24226n0 = photo6;
                        return;
                    } else if (document2 != null && W2(document2)) {
                        if (!z10) {
                            ArrayList arrayList18 = new ArrayList();
                            this.f24233p0 = arrayList18;
                            arrayList18.addAll(document2.thumbs);
                        } else {
                            ArrayList arrayList19 = this.f24233p0;
                            if (arrayList19 != null && !arrayList19.isEmpty()) {
                                c6(this.f24233p0, document2.thumbs);
                            }
                        }
                        this.f24226n0 = document2;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            TLRPC.Message message2 = this.f24213k;
            if (message2 != null && (richMessage = message2.rich_message) != null) {
                TLRPC.Document a02 = a0(richMessage.blocks, richMessage);
                TL_iv.RichMessage richMessage2 = this.f24213k.rich_message;
                if (richMessage2 != null) {
                    photo2 = W(richMessage2.blocks, richMessage2);
                }
                if (a02 != null) {
                    if (W2(a02)) {
                        if (!z10) {
                            ArrayList arrayList20 = new ArrayList();
                            this.f24233p0 = arrayList20;
                            arrayList20.addAll(a02.thumbs);
                        } else {
                            ArrayList arrayList21 = this.f24233p0;
                            if (arrayList21 != null && !arrayList21.isEmpty()) {
                                c6(this.f24233p0, a02.thumbs);
                            }
                        }
                        this.f24226n0 = a02;
                        return;
                    }
                    return;
                } else if (photo2 != null) {
                    if (z10 && (arrayList4 = this.f24233p0) != null) {
                        if (!arrayList4.isEmpty()) {
                            c6(this.f24233p0, photo2.sizes);
                        }
                    } else {
                        this.f24233p0 = new ArrayList(photo2.sizes);
                    }
                    this.f24226n0 = photo2;
                    if (this.I1 == null) {
                        Q();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            TLRPC.MessageMedia messageMedia = this.f24169a1;
            if (messageMedia != null) {
                TLRPC.Photo photo7 = messageMedia.photo;
                TLRPC.Document document3 = messageMedia.document;
                if (photo7 != null) {
                    if (z10 && (arrayList3 = this.f24233p0) != null) {
                        if (!arrayList3.isEmpty()) {
                            c6(this.f24233p0, photo7.sizes);
                        }
                    } else {
                        this.f24233p0 = new ArrayList(photo7.sizes);
                    }
                    this.f24226n0 = photo7;
                } else if (document3 != null && W2(document3)) {
                    if (!z10) {
                        ArrayList arrayList22 = new ArrayList();
                        this.f24233p0 = arrayList22;
                        arrayList22.addAll(document3.thumbs);
                    } else {
                        ArrayList arrayList23 = this.f24233p0;
                        if (arrayList23 != null && !arrayList23.isEmpty()) {
                            c6(this.f24233p0, document3.thumbs);
                        }
                    }
                    this.f24226n0 = document3;
                }
            } else if (this.V0 != null) {
                if (z10 && (arrayList2 = this.f24233p0) != null) {
                    if (!arrayList2.isEmpty()) {
                        c6(this.f24233p0, this.V0.sizes);
                    }
                } else {
                    this.f24233p0 = new ArrayList(this.V0.sizes);
                }
                this.f24226n0 = this.V0;
                if (this.I1 == null) {
                    Q();
                }
            }
        } else if (TextUtils.isEmpty(this.f24252u) && W2(this.f24225n)) {
            if (z10 && (arrayList = this.f24233p0) != null) {
                if (!arrayList.isEmpty()) {
                    c6(this.f24233p0, this.f24225n.thumbs);
                }
            } else {
                ArrayList arrayList24 = new ArrayList();
                this.f24233p0 = arrayList24;
                arrayList24.addAll(this.f24225n.thumbs);
            }
            this.f24226n0 = this.f24225n;
        }
    }

    public final gj r1(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message = null;
        r2 = null;
        TLRPC.Photo photo = null;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            long j3 = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
            if (webPage.cached_page != null) {
                TLRPC.Photo photo2 = webPage.photo;
                if (photo2 != null && photo2.f28458id == j3) {
                    photo = photo2;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= webPage.cached_page.photos.size()) {
                            break;
                        }
                        TLRPC.Photo photo3 = webPage.cached_page.photos.get(i7);
                        if (photo3.f28458id == j3) {
                            photo = photo3;
                            break;
                        }
                        i7++;
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
                tL_message.f28455id = Utilities.f22808b.nextInt();
                TLRPC.Message message = this.f24213k;
                tL_message.date = message.date;
                tL_message.peer_id = message.peer_id;
                tL_message.out = message.out;
                tL_message.from_id = message.from_id;
                return new gj(this.K1, tL_message, false, true);
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
        tL_message.f28455id = Utilities.f22808b.nextInt();
        TLRPC.Message message2 = this.f24213k;
        tL_message.date = message2.date;
        tL_message.peer_id = message2.peer_id;
        tL_message.out = message2.out;
        tL_message.from_id = message2.from_id;
        return new gj(this.K1, tL_message, false, true);
    }

    public final boolean r2() {
        ArrayList arrayList = this.f24170a2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean r4() {
        if (this.R0 != null) {
            return true;
        }
        return false;
    }

    public final lj r5() {
        TLRPC.Message message;
        gj gjVar = this.C;
        if (gjVar != null && (message = gjVar.f24213k) != null) {
            TLRPC.SuggestedPost suggestedPost = message.suggested_post;
            if (suggestedPost != null) {
                return lj.b(suggestedPost);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                return new lj(cg.a.m(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
            }
        }
        return null;
    }

    public boolean s(TLRPC.Chat chat, boolean z10) {
        TLRPC.Message message;
        boolean x42 = x4();
        int i7 = this.K1;
        if (!x42 || (message = this.f24213k) == null || message.dialog_id != k10.i(i7).e()) {
            if ((this.T == 0 && this.R0 == null && r(i7, z10, this.f24213k, chat)) || c3(this.f24213k)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final android.text.SpannableStringBuilder s0(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.s0(java.lang.String, java.lang.String):android.text.SpannableStringBuilder");
    }

    public final CharSequence s1(bj bjVar, int[] iArr) {
        String str;
        if (this.L2 || this.G0) {
            return null;
        }
        if (this.M2) {
            return this.v;
        }
        int i7 = this.D;
        if (i7 == 19 || i7 == 15 || i7 == 13) {
            return null;
        }
        CharSequence X8 = org.telegram.ui.bn.X8(this, bjVar, iArr);
        if (X8 == null && T3()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.f24213k.media).poll;
                StringBuilder sb2 = new StringBuilder(poll.question.text);
                sb2.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i10);
                    i10++;
                    sb2.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    if (tL_textWithEntities == null) {
                        str = "";
                    } else {
                        str = tL_textWithEntities.text;
                    }
                    sb2.append(str);
                }
                X8 = sb2.toString();
            } catch (Exception unused) {
            }
        }
        if (X8 == null && G3(this.f24213k, true)) {
            X8 = org.telegram.ui.bn.Z8(0L, this, false);
        }
        if (X8 != null && j6.d(X8)) {
            return null;
        }
        return X8;
    }

    public final boolean s2() {
        TLRPC.Message message;
        if (!this.G0 && !this.f24212j2 && (message = this.f24213k) != null) {
            if (!this.N2) {
                TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
                if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                    return true;
                }
            }
            if (this.f24239q2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean s4() {
        TLRPC.Message message = this.f24213k;
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
        if (!l4() && !e3(this.f24213k)) {
            if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaDocument) {
                if (R4(this.f24213k) || t4() || J2() || h4()) {
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
        if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaInvoice) {
            TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) n1(this.f24213k)).webPhoto;
            if (webDocument != null) {
                return webDocument.mime_type;
            }
            return "";
        } else if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaPhoto) {
            return "image/jpeg";
        } else {
            if ((n1(this.f24213k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.f24213k).webpage.photo != null) {
                return "image/jpeg";
            }
            return "";
        }
    }

    public final boolean t2() {
        TLRPC.MessageMedia messageMedia;
        if ((!this.f24212j2 && (((messageMedia = this.f24213k.media) != null && messageMedia.spoiler) || m5())) || x3()) {
            return true;
        }
        return false;
    }

    public final boolean t4() {
        int i7 = this.D;
        if (i7 != 1000) {
            if (i7 != 13) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.u(org.telegram.tgnet.TLRPC$Chat):boolean");
    }

    public final String u0(boolean z10) {
        return t0(F0(), z10);
    }

    public final boolean u2() {
        TLRPC.Message message = this.f24213k;
        if (message != null && message.entities != null) {
            for (int i7 = 0; i7 < this.f24213k.entities.size(); i7++) {
                if (!(this.f24213k.entities.get(i7) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
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
        TLRPC.Message message = this.f24213k;
        if (!message.video_processing_pending) {
            if (chat != null || message.peer_id.channel_id == 0 || (chat = np.u1(this.K1).O0(Long.valueOf(message.peer_id.channel_id))) != null) {
                if (v3.T(chat) && !chat.megagroup && !chat.creator) {
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

    public final boolean v2(ch.p0 p0Var) {
        if (w2() && p0Var != null) {
            for (int i7 = 0; i7 < this.f24213k.reactions.results.size(); i7++) {
                if (p0Var.f(this.f24213k.reactions.results.get(i7).reaction)) {
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
        int i7;
        if (b4(this.f24213k) || (i7 = this.D) == 30 || i7 == 31 || i7 == 32 || i7 == 33 || i7 == 35 || i7 == 37 || (this.f24213k instanceof TLRPC.TL_message_secret) || m5() || C3() || this.D == 16 || r4() || this.f24213k.noforwards) {
            return false;
        }
        return true;
    }

    public final TLRPC.Chat w0(AbstractMap abstractMap, a0.h hVar, long j3) {
        TLRPC.Chat chat;
        if (abstractMap != null) {
            chat = (TLRPC.Chat) abstractMap.get(Long.valueOf(j3));
        } else if (hVar != null) {
            chat = (TLRPC.Chat) hVar.f(j3);
        } else {
            chat = null;
        }
        if (chat == null) {
            return np.u1(this.K1).O0(Long.valueOf(j3));
        }
        return chat;
    }

    public final java.lang.String w1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.w1(boolean):java.lang.String");
    }

    public final boolean w2() {
        TLRPC.TL_messageReactions tL_messageReactions = this.f24213k.reactions;
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
        if (!S4() && F0() != null && yf.c.f61234i.contains(F0().mime_type) && F0().size < np.u1(this.K1).o4 * 2) {
            for (int i7 = 0; i7 < F0().attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = F0().attributes.get(i7);
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
        TLRPC.Peer peer = this.f24213k.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public final boolean x2() {
        TLRPC.MessageReplies messageReplies = this.f24213k.replies;
        if (messageReplies != null && messageReplies.replies > 0) {
            return true;
        }
        return false;
    }

    public final boolean x3() {
        if (p4() && !np.u1(this.K1).e5()) {
            return true;
        }
        return false;
    }

    public final boolean x4() {
        if (this.f24218l != null) {
            return true;
        }
        return false;
    }

    public final ArrayList y0() {
        ArrayList arrayList = new ArrayList();
        if (this.f24213k.reactions != null) {
            for (int i7 = 0; i7 < this.f24213k.reactions.results.size(); i7++) {
                if (this.f24213k.reactions.results.get(i7).chosen) {
                    arrayList.add(ch.p0.d(this.f24213k.reactions.results.get(i7).reaction));
                }
            }
        }
        return arrayList;
    }

    public final String y1(boolean z10) {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            for (int i7 = 0; i7 < F0.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (!z10) {
                            return null;
                        }
                        return hd.s(this.f24213k.date, true);
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String B = w7.B(F0);
                    if (TextUtils.isEmpty(B) && z10) {
                        return hd.N0(2131753896, null);
                    }
                    return B;
                } else if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    if (b4(this.f24213k)) {
                        StringBuilder sb2 = new StringBuilder("/");
                        String J1 = J1(this.f24213k);
                        if (J1 == null) {
                            kg.u1 c10 = kg.v1.f(this.K1).c(I1(this.f24213k));
                            if (c10 != null) {
                                J1 = c10.f18534b;
                            } else {
                                J1 = "";
                            }
                        }
                        sb2.append(J1);
                        return hd.a0(null, null, 2131752714, sb2.toString());
                    }
                    return hd.s(this.f24213k.date, true);
                }
            }
            String B2 = w7.B(F0);
            if (!TextUtils.isEmpty(B2)) {
                return B2;
            }
        }
        return hd.N0(2131753896, null);
    }

    public final boolean y2() {
        TLRPC.MessageMedia messageMedia = this.f24213k.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.f24213k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return false;
        }
        return true;
    }

    public final boolean y3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.f24213k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.imported) {
            return true;
        }
        return false;
    }

    public final boolean y4() {
        TLRPC.Message message = this.f24213k;
        if (message != null && (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if (c3(this.f24213k)) {
            return false;
        }
        TLRPC.Message message = this.f24213k;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public final Long z1() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.f24213k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i7);
            i7++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(n5.o(peer));
                }
            }
        }
        return null;
    }

    public final boolean z2() {
        int i7;
        if (c1() != 0) {
            ArrayList arrayList = this.f24233p0;
            if ((arrayList != null && !arrayList.isEmpty()) || (i7 = this.D) == 3 || i7 == 1 || I3() || U2()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean z3() {
        return n1(this.f24213k) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public final boolean z4() {
        if (this.D == 24 && !g3()) {
            return true;
        }
        return false;
    }

    public gj(int i7, TLRPC.Message message, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.D = 1000;
        this.f24178c0 = -1.0f;
        this.J0 = -1L;
        this.f24187e1 = -1;
        this.f24192f1 = -1L;
        this.f24175b2 = true;
        this.f24207i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.f24167a = z10 ? 2 : 1;
        this.K1 = i7;
        this.f24172b = str2;
        this.f24177c = str3;
        this.v = str;
        this.f24213k = message;
        this.f24190f = z11;
        this.f24195g = z12;
        this.f24204i = z13;
    }

    public gj(int i7, TLRPC.Message message, boolean z10, boolean z11) {
        this(i7, message, null, null, null, null, null, z10, z11, 0L);
    }

    public gj(int i7, TLRPC.Message message, gj gjVar, boolean z10, boolean z11) {
        this(i7, message, gjVar, null, null, null, null, z10, z11, 0L);
    }

    public gj(int i7, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z10, boolean z11) {
        this(i7, message, abstractMap, abstractMap2, z10, z11, 0L);
    }

    public gj(int i7, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z10, boolean z11, long j3) {
        this(i7, message, null, abstractMap, abstractMap2, null, null, z10, z11, j3);
    }

    public gj(int i7, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z10, boolean z11) {
        this(i7, message, null, null, null, hVar, hVar2, z10, z11, 0L, false, false, false, 0);
    }

    public gj(int i7, TLRPC.Message message, gj gjVar, AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j3) {
        this(i7, message, gjVar, abstractMap, abstractMap2, hVar, hVar2, z10, z11, j3, false, false, false, 0);
    }

    public gj(int i7, TLRPC.Message message, gj gjVar, AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j3, boolean z12, boolean z13, boolean z14, int i10) {
        AbstractMap abstractMap3;
        a0.h hVar3;
        ?? r15;
        TextPaint textPaint;
        this.D = 1000;
        this.f24178c0 = -1.0f;
        this.J0 = -1L;
        this.f24187e1 = -1;
        this.f24192f1 = -1L;
        this.f24175b2 = true;
        this.f24207i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        org.telegram.ui.ActionBar.m6.Q();
        this.f24212j2 = z12;
        this.f24216k2 = z13;
        this.f24227n2 = z14 || B0(message) == k10.i(i7).e();
        this.f24235p2 = i10;
        this.K1 = i7;
        this.f24213k = message;
        this.C = gjVar;
        this.T = j3;
        this.n1 = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            hVar3 = hVar;
            r15 = 0;
            abstractMap3 = abstractMap;
            this.C = new gj(i7, message2, null, abstractMap3, abstractMap2, hVar3, hVar2, false, z11, j3);
        } else {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            d2(abstractMap3, hVar3, peer.user_id);
        }
        b6(abstractMap3, abstractMap2, hVar3, hVar2);
        L5();
        if (z10) {
            g6(r15);
        }
        i5();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f24213k.date * 1000);
        int i11 = gregorianCalendar.get(6);
        int i12 = gregorianCalendar.get(1);
        int i13 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i12);
        Integer valueOf2 = Integer.valueOf(i13);
        Integer valueOf3 = Integer.valueOf(i11);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.W = String.format("%d_%02d_%02d", objArr);
        this.X = (i11 * 1000000) + (i13 * 10000) + i12;
        Integer valueOf4 = Integer.valueOf(i12);
        Integer valueOf5 = Integer.valueOf(i13);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.Y = String.format("%d_%02d", objArr2);
        P(r15);
        k0();
        if (z10) {
            if (n1(this.f24213k) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = org.telegram.ui.ActionBar.m6.f29750x2;
            } else {
                textPaint = org.telegram.ui.ActionBar.m6.f29578o2;
            }
            int[] iArr = i() ? new int[1] : null;
            CharSequence m10 = j6.m(this.v, textPaint.getFontMetricsInt(), r15, iArr, r15);
            this.v = m10;
            Spannable A5 = A5(m10, textPaint.getFontMetricsInt());
            this.v = A5;
            if (iArr != null && iArr[r15] > 1) {
                D5(A5, iArr);
            }
            H(iArr);
            G();
            L5();
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                this.H1 = u5.f(F0, org.telegram.ui.ActionBar.m6.f29370cd, 1.0f, null);
            }
        }
        this.S1 = z10;
        r0(r15);
        if (z11) {
            K(true);
        }
    }

    public gj(int r37, org.telegram.tgnet.TLRPC.TL_channelAdminLogEvent r38, java.util.ArrayList r39, java.util.HashMap r40, org.telegram.tgnet.TLRPC.Chat r41, int[] r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.<init>(int, org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent, java.util.ArrayList, java.util.HashMap, org.telegram.tgnet.TLRPC$Chat, int[], boolean):void");
    }
}
