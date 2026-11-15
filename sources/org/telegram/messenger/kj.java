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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ja0;
public final class kj {
    public ij f24703a;
    public ij f24704b;
    public ij f24705c;
    public org.telegram.ui.qm d;
    public int f24706e;
    public int f24707f;
    public boolean f24708g;
    public boolean h;
    public boolean f24709i;
    public boolean f24710j;
    public boolean f24711k;
    public boolean f24712l;
    public boolean f24713m;
    public boolean f24714n;
    public boolean f24715o;
    public boolean f24716p;
    public boolean f24717q;
    public boolean f24718r;
    public final boolean f24719s;
    public final boolean f24720t;
    public boolean f24721u;
    public TLRPC.WebPage v;
    public URLSpan f24722w;
    public ja0 f24723x;

    public kj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f24709i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f24719s = z13;
        this.f24720t = z12;
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
        this.f24722w = null;
        if (gjVar != null) {
            CharSequence charSequence = gjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                    if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                        this.f24722w = uRLSpanArr[i7];
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
        ij ijVar = this.f24704b;
        if (ijVar == null || (arrayList3 = ijVar.f24403e) == null || arrayList3.isEmpty()) {
            ij ijVar2 = this.f24703a;
            if (ijVar2 == null || (arrayList2 = ijVar2.f24403e) == null || arrayList2.isEmpty()) {
                ij ijVar3 = this.f24705c;
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
        this.f24708g = false;
        this.h = false;
        this.f24709i = m5.C(j3);
        this.f24710j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                gj gjVar = (gj) arrayList.get(i7);
                if (!TextUtils.isEmpty(gjVar.f23875z)) {
                    this.f24708g = true;
                }
                if (!this.f24709i && (messageFwdHeader = gjVar.f23817k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            ij ijVar = this.f24704b;
            if (ijVar != null) {
                sparseBooleanArray = ijVar.f24405g;
            } else {
                sparseBooleanArray = null;
            }
            ij ijVar2 = new ij(this, bool, 0, arrayList, j3, sparseBooleanArray);
            this.f24704b = ijVar2;
            if (ijVar2.f24403e.isEmpty()) {
                this.f24704b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                gj gjVar2 = (gj) arrayList.get(i10);
                if (gjVar2.p3()) {
                    j11 = gjVar2.f23817k.from_id.user_id;
                } else {
                    TLRPC.Chat M0 = np.s1(gjVar2.K1).M0(Long.valueOf(gjVar2.f23817k.peer_id.channel_id));
                    if (t3.T(M0) && M0.megagroup && gjVar2.k3()) {
                        j10 = gjVar2.f23817k.fwd_from.from_id.channel_id;
                    } else {
                        j10 = gjVar2.f23817k.peer_id.channel_id;
                    }
                    j11 = -j10;
                }
                if (!arrayList3.contains(Long.valueOf(j11))) {
                    arrayList3.add(Long.valueOf(j11));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f24710j = true;
                return;
            }
            return;
        }
        this.f24704b = null;
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
        this.f24715o = false;
        this.f24716p = false;
        this.f24714n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f24705c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            ij ijVar = this.f24705c;
            if (ijVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (ijVar == null && gjVar2 != null && (message2 = gjVar2.f23817k) != null) {
                this.f24718r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f24717q = true;
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
            tL_message.invert_media = this.f24718r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f24717q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f24715o = z17;
                this.f24716p = gj.K4(webPage.document);
            } else {
                this.f24715o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (gjVar != null) {
                tL_message.replyMessage = gjVar.f23817k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (qmVar != null) {
                    tL_messageReplyHeader.quote_text = qmVar.f50649i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = qmVar.f50650j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            gj gjVar3 = new gj(i7, tL_message, true, false);
            ij ijVar2 = new ij(this, bool, 2, k5.j(gjVar3), gj.B0(gjVar3.f23817k), null);
            this.f24705c = ijVar2;
            if (ijVar2.f24403e.isEmpty()) {
                this.f24705c = null;
            } else {
                gj gjVar4 = (gj) this.f24705c.f24403e.get(0);
                CharSequence charSequence3 = gjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = gjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f24714n = z16;
                } else {
                    CharSequence charSequence5 = gjVar4.f23875z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) gjVar4.v).getSpans(0, gjVar4.f23875z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f24714n = z12;
                    }
                }
                if (!gjVar4.G0 && !gjVar4.N2 && (gj.n1(gjVar4.f23817k) instanceof TLRPC.TL_messageMediaWebPage) && (gj.n1(gjVar4.f23817k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = gj.n1(gjVar4.f23817k).webpage;
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
                this.f24715o = z14;
                if (z11 && gjVar2 != null && (message = gjVar2.f23817k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!gjVar4.A3() || gjVar2.f23817k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f24717q = z15;
                } else if (z11) {
                    this.f24717q = gjVar4.A3();
                }
                TLRPC.Message message3 = gjVar4.f23817k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f24717q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        ja0 ja0Var = this.f24723x;
        if (ja0Var != null) {
            kj kjVar = ja0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = ja0Var.f35952f.f41297e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        da0 da0Var = (da0) view;
                        FrameLayout frameLayout = da0Var.G;
                        if (da0Var.f33894a == 2) {
                            ia0 ia0Var = da0Var.I;
                            ia0 ia0Var2 = da0Var.H;
                            if (kjVar.f24714n && !kjVar.f24715o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (kjVar.f24716p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            ia0Var2.setVisibility(i11);
                            if (kjVar.f24716p) {
                                i14 = 0;
                            }
                            ia0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (kjVar.f24715o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            ia0Var2.a(kjVar.f24717q, true);
                            ia0Var.a(kjVar.f24717q, true);
                            da0Var.F.a(!kjVar.f24718r, true);
                            da0Var.i();
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
        if (!this.f24709i && gjVar != null && (i7 = gjVar.D) != 10 && i7 != 11 && i7 != 22 && i7 != 21 && i7 != 18 && i7 != 25 && i7 != 16) {
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
        this.f24721u = z10;
        if (gjVar2 == null && qmVar2 == null) {
            this.f24703a = null;
            this.d = null;
            return;
        }
        if (bjVar != null) {
            this.f24703a = new ij(this, null, 1, bjVar.d, j3, null);
        } else {
            gj gjVar3 = gjVar2;
            if (gjVar3 == null) {
                gjVar3 = qmVar2.f50643a;
            }
            this.f24703a = new ij(this, null, 1, k5.j(gjVar3), j3, null);
        }
        if (!this.f24703a.f24403e.isEmpty()) {
            this.d = qmVar2;
            if (qmVar2 != null) {
                this.f24706e = qmVar2.f50644b;
                this.f24707f = qmVar2.f50645c;
                return;
            }
            return;
        }
        this.f24703a = null;
    }
}
