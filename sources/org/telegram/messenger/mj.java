package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.ia0;
public final class mj {
    public kj f24025a;
    public kj f24026b;
    public kj f24027c;
    public org.telegram.ui.qm d;
    public int f24028e;
    public int f24029f;
    public boolean f24030g;
    public boolean h;
    public boolean f24031i;
    public boolean f24032j;
    public boolean f24033k;
    public boolean f24034l;
    public boolean f24035m;
    public boolean f24036n;
    public boolean f24037o;
    public boolean f24038p;
    public boolean f24039q;
    public boolean f24040r;
    public final boolean f24041s;
    public final boolean f24042t;
    public boolean f24043u;
    public TLRPC.WebPage v;
    public URLSpan f24044w;
    public ia0 f24045x;

    public mj(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        this.f24031i = z9;
        if (!z9 && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f24041s = z12;
        this.f24042t = z11;
    }

    public static boolean a(String str, String str2) {
        if (str != null && str2 != null) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse != parse2) {
                if (parse != null && parse2 != null && parse.getHost() != null && parse.getHost().equalsIgnoreCase(parse2.getHost()) && parse.getPort() == parse2.getPort()) {
                    String path = parse.getPath();
                    String str3 = "";
                    if (path == null) {
                        path = "";
                    } else if (!path.endsWith("/")) {
                        path = path.concat("/");
                    }
                    String path2 = parse2.getPath();
                    if (path2 != null) {
                        if (path2.endsWith("/")) {
                            str3 = path2;
                        } else {
                            str3 = path2.concat("/");
                        }
                    }
                    if (path.equals(str3)) {
                        if (parse.getQuery() == null) {
                            if (parse2.getQuery() == null) {
                                return true;
                            }
                        } else if (parse.getQuery().equals(parse2.getQuery())) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        } else if (str != null) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(ij ijVar) {
        TLRPC.WebPage webPage;
        this.f24044w = null;
        if (ijVar != null) {
            CharSequence charSequence = ijVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                    if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                        this.f24044w = uRLSpanArr[i7];
                        return;
                    }
                }
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        kj kjVar = this.f24026b;
        if (kjVar == null || (arrayList3 = kjVar.f23696e) == null || arrayList3.isEmpty()) {
            kj kjVar2 = this.f24025a;
            if (kjVar2 == null || (arrayList2 = kjVar2.f23696e) == null || arrayList2.isEmpty()) {
                kj kjVar3 = this.f24027c;
                if (kjVar3 != null && (arrayList = kjVar3.f23696e) != null && !arrayList.isEmpty()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(ArrayList arrayList, long j3) {
        SparseBooleanArray sparseBooleanArray;
        long j10;
        long j11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.f24030g = false;
        this.h = false;
        this.f24031i = m5.C(j3);
        this.f24032j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ij ijVar = (ij) arrayList.get(i7);
                if (!TextUtils.isEmpty(ijVar.f23300z)) {
                    this.f24030g = true;
                }
                if (!this.f24031i && (messageFwdHeader = ijVar.f23244k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            kj kjVar = this.f24026b;
            if (kjVar != null) {
                sparseBooleanArray = kjVar.f23698g;
            } else {
                sparseBooleanArray = null;
            }
            kj kjVar2 = new kj(this, bool, 0, arrayList, j3, sparseBooleanArray);
            this.f24026b = kjVar2;
            if (kjVar2.f23696e.isEmpty()) {
                this.f24026b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ij ijVar2 = (ij) arrayList.get(i10);
                if (ijVar2.q3()) {
                    j11 = ijVar2.f23244k.from_id.user_id;
                } else {
                    TLRPC.Chat M0 = qp.s1(ijVar2.I1).M0(Long.valueOf(ijVar2.f23244k.peer_id.channel_id));
                    if (t3.T(M0) && M0.megagroup && ijVar2.l3()) {
                        j10 = ijVar2.f23244k.fwd_from.from_id.channel_id;
                    } else {
                        j10 = ijVar2.f23244k.peer_id.channel_id;
                    }
                    j11 = -j10;
                }
                if (!arrayList3.contains(Long.valueOf(j11))) {
                    arrayList3.add(Long.valueOf(j11));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f24032j = true;
                return;
            }
            return;
        }
        this.f24026b = null;
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, ij ijVar, org.telegram.ui.qm qmVar, ij ijVar2) {
        boolean z9;
        CharSequence charSequence2;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.WebPage webPage2;
        boolean z13;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.Message message2;
        int i10;
        int i11;
        float f10;
        this.f24037o = false;
        this.f24038p = false;
        this.f24036n = true;
        if (this.v != webPage) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f24027c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            kj kjVar = this.f24027c;
            if (kjVar != null && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (kjVar == null && ijVar2 != null && (message2 = ijVar2.f23244k) != null) {
                this.f24040r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f24039q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = p10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = p10.i(i7).e();
            tL_message.entities = ui.b0(i7).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f24040r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z17 = this.f24039q;
                tL_messageMediaWebPage.force_large_media = !z17;
                tL_messageMediaWebPage.force_small_media = z17;
                if (webPage.photo != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                this.f24037o = z16;
                this.f24038p = ij.L4(webPage.document);
            } else {
                this.f24037o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (ijVar != null) {
                tL_message.replyMessage = ijVar.f23244k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (qmVar != null) {
                    tL_messageReplyHeader.quote_text = qmVar.f49268i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = qmVar.f49269j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            ij ijVar3 = new ij(i7, tL_message, true, false);
            kj kjVar2 = new kj(this, bool, 2, k5.k(ijVar3), ij.B0(ijVar3.f23244k), null);
            this.f24027c = kjVar2;
            if (kjVar2.f23696e.isEmpty()) {
                this.f24027c = null;
            } else {
                ij ijVar4 = (ij) this.f24027c.f23696e.get(0);
                CharSequence charSequence3 = ijVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = ijVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f24036n = z15;
                } else {
                    CharSequence charSequence5 = ijVar4.f23300z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) ijVar4.v).getSpans(0, ijVar4.f23300z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        this.f24036n = z11;
                    }
                }
                if (!ijVar4.E0 && !ijVar4.L2 && (ij.o1(ijVar4.f23244k) instanceof TLRPC.TL_messageMediaWebPage) && (ij.o1(ijVar4.f23244k).webpage instanceof TLRPC.TL_webPage)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    webPage2 = ij.o1(ijVar4.f23244k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z12 && !ijVar4.w3() && webPage2 != null && ((webPage2.photo != null || ij.L4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !ijVar4.s4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f24037o = z13;
                if (z10 && ijVar2 != null && (message = ijVar2.f23244k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!ijVar4.B3() || ijVar2.f23244k.media.force_large_media)) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.f24039q = z14;
                } else if (z10) {
                    this.f24039q = ijVar4.B3();
                }
                TLRPC.Message message3 = ijVar4.f23244k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z18 = this.f24039q;
                    messageMedia.force_large_media = !z18;
                    messageMedia.force_small_media = z18;
                }
            }
        }
        ia0 ia0Var = this.f24045x;
        if (ia0Var != null) {
            mj mjVar = ia0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = ia0Var.f34572f.f38890e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        ca0 ca0Var = (ca0) view;
                        FrameLayout frameLayout = ca0Var.F;
                        if (ca0Var.f32489a == 2) {
                            ha0 ha0Var = ca0Var.H;
                            ha0 ha0Var2 = ca0Var.G;
                            if (mjVar.f24036n && !mjVar.f24037o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (mjVar.f24038p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            ha0Var2.setVisibility(i11);
                            if (mjVar.f24038p) {
                                i14 = 0;
                            }
                            ha0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (mjVar.f24037o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            ha0Var2.a(mjVar.f24039q, true);
                            ha0Var.a(mjVar.f24039q, true);
                            ca0Var.E.a(!mjVar.f24040r, true);
                            ca0Var.i();
                        }
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(ij ijVar, dj djVar, long j3, org.telegram.ui.qm qmVar) {
        ij ijVar2;
        org.telegram.ui.qm qmVar2;
        boolean z9;
        int i7;
        if (!this.f24031i && ijVar != null && (i7 = ijVar.D) != 10 && i7 != 11 && i7 != 22 && i7 != 21 && i7 != 18 && i7 != 25 && i7 != 16) {
            ijVar2 = ijVar;
            qmVar2 = qmVar;
        } else {
            ijVar2 = null;
            qmVar2 = null;
        }
        if (ijVar2 != null && (ijVar2.T4() || ijVar2.h4() || ijVar2.D == 30)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f24043u = z9;
        if (ijVar2 == null && qmVar2 == null) {
            this.f24025a = null;
            this.d = null;
            return;
        }
        if (djVar != null) {
            this.f24025a = new kj(this, null, 1, djVar.d, j3, null);
        } else {
            ij ijVar3 = ijVar2;
            if (ijVar3 == null) {
                ijVar3 = qmVar2.f49262a;
            }
            this.f24025a = new kj(this, null, 1, k5.k(ijVar3), j3, null);
        }
        if (!this.f24025a.f23696e.isEmpty()) {
            this.d = qmVar2;
            if (qmVar2 != null) {
                this.f24028e = qmVar2.f49263b;
                this.f24029f = qmVar2.f49264c;
                return;
            }
            return;
        }
        this.f24025a = null;
    }
}
