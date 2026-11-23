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
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.wa0;
public final class kj {
    public ij f25043a;
    public ij f25044b;
    public ij f25045c;
    public org.telegram.ui.rm d;
    public int f25046e;
    public int f25047f;
    public boolean f25048g;
    public boolean h;
    public boolean f25049i;
    public boolean f25050j;
    public boolean f25051k;
    public boolean f25052l;
    public boolean f25053m;
    public boolean f25054n;
    public boolean f25055o;
    public boolean f25056p;
    public boolean f25057q;
    public boolean f25058r;
    public final boolean f25059s;
    public final boolean f25060t;
    public boolean f25061u;
    public TLRPC.WebPage v;
    public URLSpan f25062w;
    public wa0 f25063x;

    public kj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f25049i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f25059s = z13;
        this.f25060t = z12;
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
        this.f25062w = null;
        if (gjVar != null) {
            CharSequence charSequence = gjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                    if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                        this.f25062w = uRLSpanArr[i7];
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
        ij ijVar = this.f25044b;
        if (ijVar == null || (arrayList3 = ijVar.f24700e) == null || arrayList3.isEmpty()) {
            ij ijVar2 = this.f25043a;
            if (ijVar2 == null || (arrayList2 = ijVar2.f24700e) == null || arrayList2.isEmpty()) {
                ij ijVar3 = this.f25045c;
                if (ijVar3 != null && (arrayList = ijVar3.f24700e) != null && !arrayList.isEmpty()) {
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
        this.f25048g = false;
        this.h = false;
        this.f25049i = n5.C(j3);
        this.f25050j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                gj gjVar = (gj) arrayList.get(i7);
                if (!TextUtils.isEmpty(gjVar.f24235z)) {
                    this.f25048g = true;
                }
                if (!this.f25049i && (messageFwdHeader = gjVar.f24177k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            ij ijVar = this.f25044b;
            if (ijVar != null) {
                sparseBooleanArray = ijVar.f24702g;
            } else {
                sparseBooleanArray = null;
            }
            ij ijVar2 = new ij(this, bool, 0, arrayList, j3, sparseBooleanArray);
            this.f25044b = ijVar2;
            if (ijVar2.f24700e.isEmpty()) {
                this.f25044b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                gj gjVar2 = (gj) arrayList.get(i10);
                if (gjVar2.p3()) {
                    j11 = gjVar2.f24177k.from_id.user_id;
                } else {
                    TLRPC.Chat O0 = np.u1(gjVar2.K1).O0(Long.valueOf(gjVar2.f24177k.peer_id.channel_id));
                    if (v3.T(O0) && O0.megagroup && gjVar2.k3()) {
                        j10 = gjVar2.f24177k.fwd_from.from_id.channel_id;
                    } else {
                        j10 = gjVar2.f24177k.peer_id.channel_id;
                    }
                    j11 = -j10;
                }
                if (!arrayList3.contains(Long.valueOf(j11))) {
                    arrayList3.add(Long.valueOf(j11));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f25050j = true;
                return;
            }
            return;
        }
        this.f25044b = null;
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, gj gjVar, org.telegram.ui.rm rmVar, gj gjVar2) {
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
        this.f25055o = false;
        this.f25056p = false;
        this.f25054n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f25045c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            ij ijVar = this.f25045c;
            if (ijVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (ijVar == null && gjVar2 != null && (message2 = gjVar2.f24177k) != null) {
                this.f25058r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f25057q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = k10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = k10.i(i7).e();
            tL_message.entities = si.d0(i7).Y(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f25058r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f25057q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f25055o = z17;
                this.f25056p = gj.K4(webPage.document);
            } else {
                this.f25055o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (gjVar != null) {
                tL_message.replyMessage = gjVar.f24177k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (rmVar != null) {
                    tL_messageReplyHeader.quote_text = rmVar.f51657i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = rmVar.f51658j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            gj gjVar3 = new gj(i7, tL_message, true, false);
            ij ijVar2 = new ij(this, bool, 2, f3.i(gjVar3), gj.B0(gjVar3.f24177k), null);
            this.f25045c = ijVar2;
            if (ijVar2.f24700e.isEmpty()) {
                this.f25045c = null;
            } else {
                gj gjVar4 = (gj) this.f25045c.f24700e.get(0);
                CharSequence charSequence3 = gjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = gjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f25054n = z16;
                } else {
                    CharSequence charSequence5 = gjVar4.f24235z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) gjVar4.v).getSpans(0, gjVar4.f24235z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f25054n = z12;
                    }
                }
                if (!gjVar4.G0 && !gjVar4.N2 && (gj.n1(gjVar4.f24177k) instanceof TLRPC.TL_messageMediaWebPage) && (gj.n1(gjVar4.f24177k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = gj.n1(gjVar4.f24177k).webpage;
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
                this.f25055o = z14;
                if (z11 && gjVar2 != null && (message = gjVar2.f24177k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!gjVar4.A3() || gjVar2.f24177k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f25057q = z15;
                } else if (z11) {
                    this.f25057q = gjVar4.A3();
                }
                TLRPC.Message message3 = gjVar4.f24177k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f25057q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        wa0 wa0Var = this.f25063x;
        if (wa0Var != null) {
            kj kjVar = wa0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = wa0Var.f41714f.f36393e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        qa0 qa0Var = (qa0) view;
                        FrameLayout frameLayout = qa0Var.G;
                        if (qa0Var.f38805a == 2) {
                            va0 va0Var = qa0Var.I;
                            va0 va0Var2 = qa0Var.H;
                            if (kjVar.f25054n && !kjVar.f25055o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (kjVar.f25056p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            va0Var2.setVisibility(i11);
                            if (kjVar.f25056p) {
                                i14 = 0;
                            }
                            va0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (kjVar.f25055o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            va0Var2.a(kjVar.f25057q, true);
                            va0Var.a(kjVar.f25057q, true);
                            qa0Var.F.a(!kjVar.f25058r, true);
                            qa0Var.i();
                        }
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(gj gjVar, bj bjVar, long j3, org.telegram.ui.rm rmVar) {
        gj gjVar2;
        org.telegram.ui.rm rmVar2;
        boolean z10;
        int i7;
        if (!this.f25049i && gjVar != null && (i7 = gjVar.D) != 10 && i7 != 11 && i7 != 22 && i7 != 21 && i7 != 18 && i7 != 25 && i7 != 16) {
            gjVar2 = gjVar;
            rmVar2 = rmVar;
        } else {
            gjVar2 = null;
            rmVar2 = null;
        }
        if (gjVar2 != null && (gjVar2.S4() || gjVar2.g4() || gjVar2.D == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25061u = z10;
        if (gjVar2 == null && rmVar2 == null) {
            this.f25043a = null;
            this.d = null;
            return;
        }
        if (bjVar != null) {
            this.f25043a = new ij(this, null, 1, bjVar.d, j3, null);
        } else {
            gj gjVar3 = gjVar2;
            if (gjVar3 == null) {
                gjVar3 = rmVar2.f51651a;
            }
            this.f25043a = new ij(this, null, 1, f3.i(gjVar3), j3, null);
        }
        if (!this.f25043a.f24700e.isEmpty()) {
            this.d = rmVar2;
            if (rmVar2 != null) {
                this.f25046e = rmVar2.f51652b;
                this.f25047f = rmVar2.f51653c;
                return;
            }
            return;
        }
        this.f25043a = null;
    }
}
