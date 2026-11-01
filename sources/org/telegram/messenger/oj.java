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
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.za0;
public final class oj {
    public mj f17451a;
    public mj f17452b;
    public mj f17453c;
    public org.telegram.ui.kn d;
    public int e;
    public int f17454f;
    public boolean f17455g;
    public boolean h;
    public boolean f17456i;
    public boolean f17457j;
    public boolean f17458k;
    public boolean f17459l;
    public boolean f17460m;
    public boolean f17461n;
    public boolean f17462o;
    public boolean f17463p;
    public boolean f17464q;
    public boolean f17465r;
    public final boolean f17466s;
    public final boolean f17467t;
    public boolean f17468u;
    public TLRPC.WebPage v;
    public URLSpan f17469w;
    public ab0 f17470x;

    public oj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f17456i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f17466s = z13;
        this.f17467t = z12;
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

    public final void b(kj kjVar) {
        TLRPC.WebPage webPage;
        this.f17469w = null;
        if (kjVar != null) {
            CharSequence charSequence = kjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                    if (a(uRLSpanArr[i10].getURL(), this.v.url)) {
                        this.f17469w = uRLSpanArr[i10];
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
        mj mjVar = this.f17452b;
        if (mjVar == null || (arrayList3 = mjVar.e) == null || arrayList3.isEmpty()) {
            mj mjVar2 = this.f17451a;
            if (mjVar2 == null || (arrayList2 = mjVar2.e) == null || arrayList2.isEmpty()) {
                mj mjVar3 = this.f17453c;
                if (mjVar3 != null && (arrayList = mjVar3.e) != null && !arrayList.isEmpty()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(ArrayList arrayList, long j10) {
        SparseBooleanArray sparseBooleanArray;
        long j11;
        long j12;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.f17455g = false;
        this.h = false;
        this.f17456i = o5.C(j10);
        this.f17457j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                kj kjVar = (kj) arrayList.get(i10);
                if (!TextUtils.isEmpty(kjVar.f16747z)) {
                    this.f17455g = true;
                }
                if (!this.f17456i && (messageFwdHeader = kjVar.f16690k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            mj mjVar = this.f17452b;
            if (mjVar != null) {
                sparseBooleanArray = mjVar.f17134g;
            } else {
                sparseBooleanArray = null;
            }
            mj mjVar2 = new mj(this, bool, 0, arrayList, j10, sparseBooleanArray);
            this.f17452b = mjVar2;
            if (mjVar2.e.isEmpty()) {
                this.f17452b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                kj kjVar2 = (kj) arrayList.get(i11);
                if (kjVar2.p3()) {
                    j12 = kjVar2.f16690k.from_id.user_id;
                } else {
                    TLRPC.Chat L0 = wp.r1(kjVar2.I1).L0(Long.valueOf(kjVar2.f16690k.peer_id.channel_id));
                    if (w3.T(L0) && L0.megagroup && kjVar2.k3()) {
                        j11 = kjVar2.f16690k.fwd_from.from_id.channel_id;
                    } else {
                        j11 = kjVar2.f16690k.peer_id.channel_id;
                    }
                    j12 = -j11;
                }
                if (!arrayList3.contains(Long.valueOf(j12))) {
                    arrayList3.add(Long.valueOf(j12));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f17457j = true;
                return;
            }
            return;
        }
        this.f17452b = null;
    }

    public final void e(int i10, TLRPC.WebPage webPage, CharSequence charSequence, kj kjVar, org.telegram.ui.kn knVar, kj kjVar2) {
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
        int i11;
        int i12;
        float f7;
        this.f17462o = false;
        this.f17463p = false;
        this.f17461n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f17453c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            mj mjVar = this.f17453c;
            if (mjVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (mjVar == null && kjVar2 != null && (message2 = kjVar2.f16690k) != null) {
                this.f17465r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f17464q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(i0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = e20.i(i10).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = e20.i(i10).e();
            tL_message.entities = vi.b0(i10).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f17465r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f17464q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f17462o = z17;
                this.f17463p = kj.K4(webPage.document);
            } else {
                this.f17462o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (kjVar != null) {
                tL_message.replyMessage = kjVar.f16690k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (knVar != null) {
                    tL_messageReplyHeader.quote_text = knVar.f38936i;
                    int i13 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i13 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = knVar.f38937j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i13 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            kj kjVar3 = new kj(i10, tL_message, true, false);
            mj mjVar2 = new mj(this, bool, 2, m5.j(kjVar3), kj.B0(kjVar3.f16690k), null);
            this.f17453c = mjVar2;
            if (mjVar2.e.isEmpty()) {
                this.f17453c = null;
            } else {
                kj kjVar4 = (kj) this.f17453c.e.get(0);
                CharSequence charSequence3 = kjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = kjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f17461n = z16;
                } else {
                    CharSequence charSequence5 = kjVar4.f16747z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) kjVar4.v).getSpans(0, kjVar4.f16747z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f17461n = z12;
                    }
                }
                if (!kjVar4.E0 && (kj.o1(kjVar4.f16690k) instanceof TLRPC.TL_messageMediaWebPage) && (kj.o1(kjVar4.f16690k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = kj.o1(kjVar4.f16690k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z13 && !kjVar4.v3() && webPage2 != null && ((webPage2.photo != null || kj.K4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !kjVar4.r4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f17462o = z14;
                if (z11 && kjVar2 != null && (message = kjVar2.f16690k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!kjVar4.A3() || kjVar2.f16690k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f17464q = z15;
                } else if (z11) {
                    this.f17464q = kjVar4.A3();
                }
                TLRPC.Message message3 = kjVar4.f16690k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f17464q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        ab0 ab0Var = this.f17470x;
        if (ab0Var != null) {
            oj ojVar = ab0Var.d;
            int i14 = 0;
            while (true) {
                View[] viewArr = ab0Var.f24339f.e;
                if (i14 < viewArr.length) {
                    View view = viewArr[i14];
                    if (view != null) {
                        ua0 ua0Var = (ua0) view;
                        FrameLayout frameLayout = ua0Var.F;
                        if (ua0Var.f30910a == 2) {
                            za0 za0Var = ua0Var.H;
                            za0 za0Var2 = ua0Var.G;
                            if (ojVar.f17461n && !ojVar.f17462o) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            frameLayout.setVisibility(i11);
                            int i15 = 4;
                            if (ojVar.f17463p) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            za0Var2.setVisibility(i12);
                            if (ojVar.f17463p) {
                                i15 = 0;
                            }
                            za0Var.setVisibility(i15);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (ojVar.f17462o) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            animate.alpha(f7).start();
                            za0Var2.a(ojVar.f17464q, true);
                            za0Var.a(ojVar.f17464q, true);
                            ua0Var.E.a(!ojVar.f17465r, true);
                            ua0Var.i();
                        }
                    }
                    i14++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(kj kjVar, fj fjVar, long j10, org.telegram.ui.kn knVar) {
        kj kjVar2;
        org.telegram.ui.kn knVar2;
        boolean z10;
        int i10;
        if (!this.f17456i && kjVar != null && (i10 = kjVar.D) != 10 && i10 != 11 && i10 != 22 && i10 != 21 && i10 != 18 && i10 != 25 && i10 != 16) {
            kjVar2 = kjVar;
            knVar2 = knVar;
        } else {
            kjVar2 = null;
            knVar2 = null;
        }
        if (kjVar2 != null && (kjVar2.S4() || kjVar2.g4() || kjVar2.D == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17468u = z10;
        if (kjVar2 == null && knVar2 == null) {
            this.f17451a = null;
            this.d = null;
            return;
        }
        if (fjVar != null) {
            this.f17451a = new mj(this, null, 1, fjVar.d, j10, null);
        } else {
            kj kjVar3 = kjVar2;
            if (kjVar3 == null) {
                kjVar3 = knVar2.f38931a;
            }
            this.f17451a = new mj(this, null, 1, m5.j(kjVar3), j10, null);
        }
        if (!this.f17451a.e.isEmpty()) {
            this.d = knVar2;
            if (knVar2 != null) {
                this.e = knVar2.f38932b;
                this.f17454f = knVar2.f38933c;
                return;
            }
            return;
        }
        this.f17451a = null;
    }
}
