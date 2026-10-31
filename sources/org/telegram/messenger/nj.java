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
public final class nj {
    public lj f17114a;
    public lj f17115b;
    public lj f17116c;
    public org.telegram.ui.kn d;
    public int e;
    public int f17117f;
    public boolean f17118g;
    public boolean h;
    public boolean f17119i;
    public boolean f17120j;
    public boolean f17121k;
    public boolean f17122l;
    public boolean f17123m;
    public boolean f17124n;
    public boolean f17125o;
    public boolean f17126p;
    public boolean f17127q;
    public boolean f17128r;
    public final boolean f17129s;
    public final boolean f17130t;
    public boolean f17131u;
    public TLRPC.WebPage v;
    public URLSpan f17132w;
    public ab0 f17133x;

    public nj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f17119i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f17129s = z13;
        this.f17130t = z12;
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

    public final void b(jj jjVar) {
        TLRPC.WebPage webPage;
        this.f17132w = null;
        if (jjVar != null) {
            CharSequence charSequence = jjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                    if (a(uRLSpanArr[i10].getURL(), this.v.url)) {
                        this.f17132w = uRLSpanArr[i10];
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
        lj ljVar = this.f17115b;
        if (ljVar == null || (arrayList3 = ljVar.e) == null || arrayList3.isEmpty()) {
            lj ljVar2 = this.f17114a;
            if (ljVar2 == null || (arrayList2 = ljVar2.e) == null || arrayList2.isEmpty()) {
                lj ljVar3 = this.f17116c;
                if (ljVar3 != null && (arrayList = ljVar3.e) != null && !arrayList.isEmpty()) {
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
        this.f17118g = false;
        this.h = false;
        this.f17119i = o5.C(j10);
        this.f17120j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jj jjVar = (jj) arrayList.get(i10);
                if (!TextUtils.isEmpty(jjVar.f16394z)) {
                    this.f17118g = true;
                }
                if (!this.f17119i && (messageFwdHeader = jjVar.f16337k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            lj ljVar = this.f17115b;
            if (ljVar != null) {
                sparseBooleanArray = ljVar.f16750g;
            } else {
                sparseBooleanArray = null;
            }
            lj ljVar2 = new lj(this, bool, 0, arrayList, j10, sparseBooleanArray);
            this.f17115b = ljVar2;
            if (ljVar2.e.isEmpty()) {
                this.f17115b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                jj jjVar2 = (jj) arrayList.get(i11);
                if (jjVar2.p3()) {
                    j12 = jjVar2.f16337k.from_id.user_id;
                } else {
                    TLRPC.Chat L0 = vp.r1(jjVar2.I1).L0(Long.valueOf(jjVar2.f16337k.peer_id.channel_id));
                    if (w3.T(L0) && L0.megagroup && jjVar2.k3()) {
                        j11 = jjVar2.f16337k.fwd_from.from_id.channel_id;
                    } else {
                        j11 = jjVar2.f16337k.peer_id.channel_id;
                    }
                    j12 = -j11;
                }
                if (!arrayList3.contains(Long.valueOf(j12))) {
                    arrayList3.add(Long.valueOf(j12));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f17120j = true;
                return;
            }
            return;
        }
        this.f17115b = null;
    }

    public final void e(int i10, TLRPC.WebPage webPage, CharSequence charSequence, jj jjVar, org.telegram.ui.kn knVar, jj jjVar2) {
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
        this.f17125o = false;
        this.f17126p = false;
        this.f17124n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f17116c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            lj ljVar = this.f17116c;
            if (ljVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (ljVar == null && jjVar2 != null && (message2 = jjVar2.f16337k) != null) {
                this.f17128r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f17127q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(i0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = d20.i(i10).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = d20.i(i10).e();
            tL_message.entities = ui.b0(i10).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f17128r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f17127q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f17125o = z17;
                this.f17126p = jj.K4(webPage.document);
            } else {
                this.f17125o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (jjVar != null) {
                tL_message.replyMessage = jjVar.f16337k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (knVar != null) {
                    tL_messageReplyHeader.quote_text = knVar.f38910i;
                    int i13 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i13 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = knVar.f38911j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i13 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            jj jjVar3 = new jj(i10, tL_message, true, false);
            lj ljVar2 = new lj(this, bool, 2, m5.j(jjVar3), jj.B0(jjVar3.f16337k), null);
            this.f17116c = ljVar2;
            if (ljVar2.e.isEmpty()) {
                this.f17116c = null;
            } else {
                jj jjVar4 = (jj) this.f17116c.e.get(0);
                CharSequence charSequence3 = jjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = jjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f17124n = z16;
                } else {
                    CharSequence charSequence5 = jjVar4.f16394z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) jjVar4.v).getSpans(0, jjVar4.f16394z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f17124n = z12;
                    }
                }
                if (!jjVar4.E0 && (jj.o1(jjVar4.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && (jj.o1(jjVar4.f16337k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = jj.o1(jjVar4.f16337k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z13 && !jjVar4.v3() && webPage2 != null && ((webPage2.photo != null || jj.K4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !jjVar4.r4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f17125o = z14;
                if (z11 && jjVar2 != null && (message = jjVar2.f16337k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!jjVar4.A3() || jjVar2.f16337k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f17127q = z15;
                } else if (z11) {
                    this.f17127q = jjVar4.A3();
                }
                TLRPC.Message message3 = jjVar4.f16337k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f17127q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        ab0 ab0Var = this.f17133x;
        if (ab0Var != null) {
            nj njVar = ab0Var.d;
            int i14 = 0;
            while (true) {
                View[] viewArr = ab0Var.f24355f.e;
                if (i14 < viewArr.length) {
                    View view = viewArr[i14];
                    if (view != null) {
                        ua0 ua0Var = (ua0) view;
                        FrameLayout frameLayout = ua0Var.F;
                        if (ua0Var.f30876a == 2) {
                            za0 za0Var = ua0Var.H;
                            za0 za0Var2 = ua0Var.G;
                            if (njVar.f17124n && !njVar.f17125o) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            frameLayout.setVisibility(i11);
                            int i15 = 4;
                            if (njVar.f17126p) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            za0Var2.setVisibility(i12);
                            if (njVar.f17126p) {
                                i15 = 0;
                            }
                            za0Var.setVisibility(i15);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (njVar.f17125o) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            animate.alpha(f7).start();
                            za0Var2.a(njVar.f17127q, true);
                            za0Var.a(njVar.f17127q, true);
                            ua0Var.E.a(!njVar.f17128r, true);
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

    public final void f(jj jjVar, ej ejVar, long j10, org.telegram.ui.kn knVar) {
        jj jjVar2;
        org.telegram.ui.kn knVar2;
        boolean z10;
        int i10;
        if (!this.f17119i && jjVar != null && (i10 = jjVar.D) != 10 && i10 != 11 && i10 != 22 && i10 != 21 && i10 != 18 && i10 != 25 && i10 != 16) {
            jjVar2 = jjVar;
            knVar2 = knVar;
        } else {
            jjVar2 = null;
            knVar2 = null;
        }
        if (jjVar2 != null && (jjVar2.S4() || jjVar2.g4() || jjVar2.D == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17131u = z10;
        if (jjVar2 == null && knVar2 == null) {
            this.f17114a = null;
            this.d = null;
            return;
        }
        if (ejVar != null) {
            this.f17114a = new lj(this, null, 1, ejVar.d, j10, null);
        } else {
            jj jjVar3 = jjVar2;
            if (jjVar3 == null) {
                jjVar3 = knVar2.f38905a;
            }
            this.f17114a = new lj(this, null, 1, m5.j(jjVar3), j10, null);
        }
        if (!this.f17114a.e.isEmpty()) {
            this.d = knVar2;
            if (knVar2 != null) {
                this.e = knVar2.f38906b;
                this.f17117f = knVar2.f38907c;
                return;
            }
            return;
        }
        this.f17114a = null;
    }
}
