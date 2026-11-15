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
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ka0;
public final class kj {
    public ij f24706a;
    public ij f24707b;
    public ij f24708c;
    public org.telegram.ui.qm d;
    public int f24709e;
    public int f24710f;
    public boolean f24711g;
    public boolean h;
    public boolean f24712i;
    public boolean f24713j;
    public boolean f24714k;
    public boolean f24715l;
    public boolean f24716m;
    public boolean f24717n;
    public boolean f24718o;
    public boolean f24719p;
    public boolean f24720q;
    public boolean f24721r;
    public final boolean f24722s;
    public final boolean f24723t;
    public boolean f24724u;
    public TLRPC.WebPage v;
    public URLSpan f24725w;
    public ka0 f24726x;

    public kj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f24712i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f24722s = z13;
        this.f24723t = z12;
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

    public final void b(gj gjVar) {
        TLRPC.WebPage webPage;
        this.f24725w = null;
        if (gjVar != null) {
            CharSequence charSequence = gjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                    if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                        this.f24725w = uRLSpanArr[i7];
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
        ij ijVar = this.f24707b;
        if (ijVar == null || (arrayList3 = ijVar.f24403e) == null || arrayList3.isEmpty()) {
            ij ijVar2 = this.f24706a;
            if (ijVar2 == null || (arrayList2 = ijVar2.f24403e) == null || arrayList2.isEmpty()) {
                ij ijVar3 = this.f24708c;
                if (ijVar3 != null && (arrayList = ijVar3.f24403e) != null && !arrayList.isEmpty()) {
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
        this.f24711g = false;
        this.h = false;
        this.f24712i = m5.C(j3);
        this.f24713j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                gj gjVar = (gj) arrayList.get(i7);
                if (!TextUtils.isEmpty(gjVar.f23877z)) {
                    this.f24711g = true;
                }
                if (!this.f24712i && (messageFwdHeader = gjVar.f23819k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            ij ijVar = this.f24707b;
            if (ijVar != null) {
                sparseBooleanArray = ijVar.f24405g;
            } else {
                sparseBooleanArray = null;
            }
            ij ijVar2 = new ij(this, bool, 0, arrayList, j3, sparseBooleanArray);
            this.f24707b = ijVar2;
            if (ijVar2.f24403e.isEmpty()) {
                this.f24707b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                gj gjVar2 = (gj) arrayList.get(i10);
                if (gjVar2.p3()) {
                    j11 = gjVar2.f23819k.from_id.user_id;
                } else {
                    TLRPC.Chat M0 = np.s1(gjVar2.K1).M0(Long.valueOf(gjVar2.f23819k.peer_id.channel_id));
                    if (t3.T(M0) && M0.megagroup && gjVar2.k3()) {
                        j10 = gjVar2.f23819k.fwd_from.from_id.channel_id;
                    } else {
                        j10 = gjVar2.f23819k.peer_id.channel_id;
                    }
                    j11 = -j10;
                }
                if (!arrayList3.contains(Long.valueOf(j11))) {
                    arrayList3.add(Long.valueOf(j11));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f24713j = true;
                return;
            }
            return;
        }
        this.f24707b = null;
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, gj gjVar, org.telegram.ui.qm qmVar, gj gjVar2) {
        boolean z10;
        CharSequence charSequence2;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.WebPage webPage2;
        boolean z14;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.Message message2;
        int i10;
        int i11;
        float f10;
        this.f24718o = false;
        this.f24719p = false;
        this.f24717n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f24708c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            ij ijVar = this.f24708c;
            if (ijVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (ijVar == null && gjVar2 != null && (message2 = gjVar2.f23819k) != null) {
                this.f24721r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f24720q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = m10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = m10.i(i7).e();
            tL_message.entities = si.b0(i7).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f24721r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f24720q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f24718o = z17;
                this.f24719p = gj.K4(webPage.document);
            } else {
                this.f24718o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (gjVar != null) {
                tL_message.replyMessage = gjVar.f23819k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (qmVar != null) {
                    tL_messageReplyHeader.quote_text = qmVar.f50653i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = qmVar.f50654j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            gj gjVar3 = new gj(i7, tL_message, true, false);
            ij ijVar2 = new ij(this, bool, 2, k5.j(gjVar3), gj.B0(gjVar3.f23819k), null);
            this.f24708c = ijVar2;
            if (ijVar2.f24403e.isEmpty()) {
                this.f24708c = null;
            } else {
                gj gjVar4 = (gj) this.f24708c.f24403e.get(0);
                CharSequence charSequence3 = gjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = gjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f24717n = z16;
                } else {
                    CharSequence charSequence5 = gjVar4.f23877z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) gjVar4.v).getSpans(0, gjVar4.f23877z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f24717n = z12;
                    }
                }
                if (!gjVar4.G0 && !gjVar4.N2 && (gj.n1(gjVar4.f23819k) instanceof TLRPC.TL_messageMediaWebPage) && (gj.n1(gjVar4.f23819k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = gj.n1(gjVar4.f23819k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z13 && !gjVar4.v3() && webPage2 != null && ((webPage2.photo != null || gj.K4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !gjVar4.r4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f24718o = z14;
                if (z11 && gjVar2 != null && (message = gjVar2.f23819k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!gjVar4.A3() || gjVar2.f23819k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f24720q = z15;
                } else if (z11) {
                    this.f24720q = gjVar4.A3();
                }
                TLRPC.Message message3 = gjVar4.f23819k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f24720q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        ka0 ka0Var = this.f24726x;
        if (ka0Var != null) {
            kj kjVar = ka0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = ka0Var.f36339f.f41300e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        ea0 ea0Var = (ea0) view;
                        FrameLayout frameLayout = ea0Var.G;
                        if (ea0Var.f34254a == 2) {
                            ja0 ja0Var = ea0Var.I;
                            ja0 ja0Var2 = ea0Var.H;
                            if (kjVar.f24717n && !kjVar.f24718o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (kjVar.f24719p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            ja0Var2.setVisibility(i11);
                            if (kjVar.f24719p) {
                                i14 = 0;
                            }
                            ja0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (kjVar.f24718o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            ja0Var2.a(kjVar.f24720q, true);
                            ja0Var.a(kjVar.f24720q, true);
                            ea0Var.F.a(!kjVar.f24721r, true);
                            ea0Var.i();
                        }
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(gj gjVar, bj bjVar, long j3, org.telegram.ui.qm qmVar) {
        gj gjVar2;
        org.telegram.ui.qm qmVar2;
        boolean z10;
        int i7;
        if (!this.f24712i && gjVar != null && (i7 = gjVar.D) != 10 && i7 != 11 && i7 != 22 && i7 != 21 && i7 != 18 && i7 != 25 && i7 != 16) {
            gjVar2 = gjVar;
            qmVar2 = qmVar;
        } else {
            gjVar2 = null;
            qmVar2 = null;
        }
        if (gjVar2 != null && (gjVar2.S4() || gjVar2.g4() || gjVar2.D == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24724u = z10;
        if (gjVar2 == null && qmVar2 == null) {
            this.f24706a = null;
            this.d = null;
            return;
        }
        if (bjVar != null) {
            this.f24706a = new ij(this, null, 1, bjVar.d, j3, null);
        } else {
            gj gjVar3 = gjVar2;
            if (gjVar3 == null) {
                gjVar3 = qmVar2.f50647a;
            }
            this.f24706a = new ij(this, null, 1, k5.j(gjVar3), j3, null);
        }
        if (!this.f24706a.f24403e.isEmpty()) {
            this.d = qmVar2;
            if (qmVar2 != null) {
                this.f24709e = qmVar2.f50648b;
                this.f24710f = qmVar2.f50649c;
                return;
            }
            return;
        }
        this.f24706a = null;
    }
}
