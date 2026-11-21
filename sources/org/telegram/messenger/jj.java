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
public final class jj {
    public hj f24892a;
    public hj f24893b;
    public hj f24894c;
    public org.telegram.ui.rm d;
    public int f24895e;
    public int f24896f;
    public boolean f24897g;
    public boolean h;
    public boolean f24898i;
    public boolean f24899j;
    public boolean f24900k;
    public boolean f24901l;
    public boolean f24902m;
    public boolean f24903n;
    public boolean f24904o;
    public boolean f24905p;
    public boolean f24906q;
    public boolean f24907r;
    public final boolean f24908s;
    public final boolean f24909t;
    public boolean f24910u;
    public TLRPC.WebPage v;
    public URLSpan f24911w;
    public wa0 f24912x;

    public jj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f24898i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f24908s = z13;
        this.f24909t = z12;
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

    public final void b(fj fjVar) {
        TLRPC.WebPage webPage;
        this.f24911w = null;
        if (fjVar != null) {
            CharSequence charSequence = fjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                    if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                        this.f24911w = uRLSpanArr[i7];
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
        hj hjVar = this.f24893b;
        if (hjVar == null || (arrayList3 = hjVar.f24483e) == null || arrayList3.isEmpty()) {
            hj hjVar2 = this.f24892a;
            if (hjVar2 == null || (arrayList2 = hjVar2.f24483e) == null || arrayList2.isEmpty()) {
                hj hjVar3 = this.f24894c;
                if (hjVar3 != null && (arrayList = hjVar3.f24483e) != null && !arrayList.isEmpty()) {
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
        this.f24897g = false;
        this.h = false;
        this.f24898i = n5.C(j3);
        this.f24899j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                fj fjVar = (fj) arrayList.get(i7);
                if (!TextUtils.isEmpty(fjVar.f24051z)) {
                    this.f24897g = true;
                }
                if (!this.f24898i && (messageFwdHeader = fjVar.f23993k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            hj hjVar = this.f24893b;
            if (hjVar != null) {
                sparseBooleanArray = hjVar.f24485g;
            } else {
                sparseBooleanArray = null;
            }
            hj hjVar2 = new hj(this, bool, 0, arrayList, j3, sparseBooleanArray);
            this.f24893b = hjVar2;
            if (hjVar2.f24483e.isEmpty()) {
                this.f24893b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                fj fjVar2 = (fj) arrayList.get(i10);
                if (fjVar2.p3()) {
                    j11 = fjVar2.f23993k.from_id.user_id;
                } else {
                    TLRPC.Chat O0 = mp.u1(fjVar2.K1).O0(Long.valueOf(fjVar2.f23993k.peer_id.channel_id));
                    if (v3.T(O0) && O0.megagroup && fjVar2.k3()) {
                        j10 = fjVar2.f23993k.fwd_from.from_id.channel_id;
                    } else {
                        j10 = fjVar2.f23993k.peer_id.channel_id;
                    }
                    j11 = -j10;
                }
                if (!arrayList3.contains(Long.valueOf(j11))) {
                    arrayList3.add(Long.valueOf(j11));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f24899j = true;
                return;
            }
            return;
        }
        this.f24893b = null;
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, fj fjVar, org.telegram.ui.rm rmVar, fj fjVar2) {
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
        this.f24904o = false;
        this.f24905p = false;
        this.f24903n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f24894c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            hj hjVar = this.f24894c;
            if (hjVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (hjVar == null && fjVar2 != null && (message2 = fjVar2.f23993k) != null) {
                this.f24907r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f24906q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = j10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = j10.i(i7).e();
            tL_message.entities = ri.d0(i7).Y(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f24907r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f24906q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f24904o = z17;
                this.f24905p = fj.K4(webPage.document);
            } else {
                this.f24904o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (fjVar != null) {
                tL_message.replyMessage = fjVar.f23993k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (rmVar != null) {
                    tL_messageReplyHeader.quote_text = rmVar.f51621i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = rmVar.f51622j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            fj fjVar3 = new fj(i7, tL_message, true, false);
            hj hjVar2 = new hj(this, bool, 2, f3.i(fjVar3), fj.B0(fjVar3.f23993k), null);
            this.f24894c = hjVar2;
            if (hjVar2.f24483e.isEmpty()) {
                this.f24894c = null;
            } else {
                fj fjVar4 = (fj) this.f24894c.f24483e.get(0);
                CharSequence charSequence3 = fjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = fjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f24903n = z16;
                } else {
                    CharSequence charSequence5 = fjVar4.f24051z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) fjVar4.v).getSpans(0, fjVar4.f24051z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f24903n = z12;
                    }
                }
                if (!fjVar4.G0 && !fjVar4.N2 && (fj.n1(fjVar4.f23993k) instanceof TLRPC.TL_messageMediaWebPage) && (fj.n1(fjVar4.f23993k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = fj.n1(fjVar4.f23993k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z13 && !fjVar4.v3() && webPage2 != null && ((webPage2.photo != null || fj.K4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !fjVar4.r4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f24904o = z14;
                if (z11 && fjVar2 != null && (message = fjVar2.f23993k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!fjVar4.A3() || fjVar2.f23993k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f24906q = z15;
                } else if (z11) {
                    this.f24906q = fjVar4.A3();
                }
                TLRPC.Message message3 = fjVar4.f23993k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f24906q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        wa0 wa0Var = this.f24912x;
        if (wa0Var != null) {
            jj jjVar = wa0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = wa0Var.f41747f.f36440e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        qa0 qa0Var = (qa0) view;
                        FrameLayout frameLayout = qa0Var.G;
                        if (qa0Var.f38858a == 2) {
                            va0 va0Var = qa0Var.I;
                            va0 va0Var2 = qa0Var.H;
                            if (jjVar.f24903n && !jjVar.f24904o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (jjVar.f24905p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            va0Var2.setVisibility(i11);
                            if (jjVar.f24905p) {
                                i14 = 0;
                            }
                            va0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (jjVar.f24904o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            va0Var2.a(jjVar.f24906q, true);
                            va0Var.a(jjVar.f24906q, true);
                            qa0Var.F.a(!jjVar.f24907r, true);
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

    public final void f(fj fjVar, aj ajVar, long j3, org.telegram.ui.rm rmVar) {
        fj fjVar2;
        org.telegram.ui.rm rmVar2;
        boolean z10;
        int i7;
        if (!this.f24898i && fjVar != null && (i7 = fjVar.D) != 10 && i7 != 11 && i7 != 22 && i7 != 21 && i7 != 18 && i7 != 25 && i7 != 16) {
            fjVar2 = fjVar;
            rmVar2 = rmVar;
        } else {
            fjVar2 = null;
            rmVar2 = null;
        }
        if (fjVar2 != null && (fjVar2.S4() || fjVar2.g4() || fjVar2.D == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24910u = z10;
        if (fjVar2 == null && rmVar2 == null) {
            this.f24892a = null;
            this.d = null;
            return;
        }
        if (ajVar != null) {
            this.f24892a = new hj(this, null, 1, ajVar.d, j3, null);
        } else {
            fj fjVar3 = fjVar2;
            if (fjVar3 == null) {
                fjVar3 = rmVar2.f51615a;
            }
            this.f24892a = new hj(this, null, 1, f3.i(fjVar3), j3, null);
        }
        if (!this.f24892a.f24483e.isEmpty()) {
            this.d = rmVar2;
            if (rmVar2 != null) {
                this.f24895e = rmVar2.f51616b;
                this.f24896f = rmVar2.f51617c;
                return;
            }
            return;
        }
        this.f24892a = null;
    }
}
