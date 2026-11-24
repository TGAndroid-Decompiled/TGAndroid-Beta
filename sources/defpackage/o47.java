package defpackage;

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
public final class o47 {
    public m47 a;
    public m47 b;
    public m47 c;
    public nv1 d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;
    public final boolean t;
    public boolean u;
    public TLRPC.WebPage v;
    public URLSpan w;
    public jt1 x;

    public o47(boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.i = z;
        if (!z && !z2) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.s = z4;
        this.t = z3;
    }

    public static boolean a(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
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
                                if (parse2.getQuery() != null) {
                                    return false;
                                }
                                return true;
                            } else if (!parse.getQuery().equals(parse2.getQuery())) {
                                return false;
                            } else {
                                return true;
                            }
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

    public final void b(k47 k47Var) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (k47Var != null) {
            CharSequence charSequence = k47Var.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i = 0; i < uRLSpanArr.length; i++) {
                    if (a(uRLSpanArr[i].getURL(), this.v.url)) {
                        this.w = uRLSpanArr[i];
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
        m47 m47Var = this.b;
        if (m47Var == null || (arrayList3 = m47Var.e) == null || arrayList3.isEmpty()) {
            m47 m47Var2 = this.a;
            if (m47Var2 == null || (arrayList2 = m47Var2.e) == null || arrayList2.isEmpty()) {
                m47 m47Var3 = this.c;
                if (m47Var3 != null && (arrayList = m47Var3.e) != null && !arrayList.isEmpty()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(ArrayList arrayList, long j) {
        SparseBooleanArray sparseBooleanArray;
        long j2;
        long j3;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = pg3.B(j);
        this.j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                k47 k47Var = (k47) arrayList.get(i);
                if (!TextUtils.isEmpty(k47Var.z)) {
                    this.g = true;
                }
                if (!this.i && (messageFwdHeader = k47Var.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            m47 m47Var = this.b;
            if (m47Var != null) {
                sparseBooleanArray = m47Var.g;
            } else {
                sparseBooleanArray = null;
            }
            m47 m47Var2 = new m47(this, bool, 0, arrayList, j, sparseBooleanArray);
            this.b = m47Var2;
            if (m47Var2.e.isEmpty()) {
                this.b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                k47 k47Var2 = (k47) arrayList.get(i2);
                if (k47Var2.p3()) {
                    j3 = k47Var2.k.from_id.user_id;
                } else {
                    TLRPC.Chat L0 = oc7.r1(k47Var2.K1).L0(Long.valueOf(k47Var2.k.peer_id.channel_id));
                    if (sd2.T(L0) && L0.megagroup && k47Var2.k3()) {
                        j2 = k47Var2.k.fwd_from.from_id.channel_id;
                    } else {
                        j2 = k47Var2.k.peer_id.channel_id;
                    }
                    j3 = -j2;
                }
                if (!arrayList3.contains(Long.valueOf(j3))) {
                    arrayList3.add(Long.valueOf(j3));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.j = true;
                return;
            }
            return;
        }
        this.b = null;
    }

    public final void e(int i, TLRPC.WebPage webPage, CharSequence charSequence, k47 k47Var, nv1 nv1Var, k47 k47Var2) {
        boolean z;
        CharSequence charSequence2;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.WebPage webPage2;
        boolean z5;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        boolean z6;
        boolean z7;
        boolean z8;
        TLRPC.Message message2;
        int i2;
        int i3;
        float f;
        this.o = false;
        this.p = false;
        this.n = true;
        if (this.v != webPage) {
            z = true;
        } else {
            z = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            m47 m47Var = this.c;
            if (m47Var != null && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (m47Var == null && k47Var2 != null && (message2 = k47Var2.k) != null) {
                this.r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(gm.m1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = z8c.h(i).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = z8c.h(i).e();
            tL_message.entities = hs6.d0(i).Y(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z9 = this.q;
                tL_messageMediaWebPage.force_large_media = !z9;
                tL_messageMediaWebPage.force_small_media = z9;
                if (webPage.photo != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.o = z8;
                this.p = k47.J4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (k47Var != null) {
                tL_message.replyMessage = k47Var.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (nv1Var != null) {
                    tL_messageReplyHeader.quote_text = nv1Var.i;
                    int i4 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i4 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = nv1Var.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i4 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            k47 k47Var3 = new k47(i, tL_message, true, false);
            m47 m47Var2 = new m47(this, bool, 2, td4.u(k47Var3), k47.B0(k47Var3.k), null);
            this.c = m47Var2;
            if (m47Var2.e.isEmpty()) {
                this.c = null;
            } else {
                k47 k47Var4 = (k47) this.c.e.get(0);
                CharSequence charSequence3 = k47Var4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = k47Var4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    this.n = z7;
                } else {
                    CharSequence charSequence5 = k47Var4.z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) k47Var4.v).getSpans(0, k47Var4.z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        this.n = z3;
                    }
                }
                if (!k47Var4.G0 && !k47Var4.N2 && (k47.n1(k47Var4.k) instanceof TLRPC.TL_messageMediaWebPage) && (k47.n1(k47Var4.k).webpage instanceof TLRPC.TL_webPage)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    webPage2 = k47.n1(k47Var4.k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z4 && !k47Var4.v3() && webPage2 != null && ((webPage2.photo != null || k47.J4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !k47Var4.q4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.o = z5;
                if (z2 && k47Var2 != null && (message = k47Var2.k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!k47Var4.A3() || k47Var2.k.media.force_large_media)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    this.q = z6;
                } else if (z2) {
                    this.q = k47Var4.A3();
                }
                TLRPC.Message message3 = k47Var4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z10 = this.q;
                    messageMedia.force_large_media = !z10;
                    messageMedia.force_small_media = z10;
                }
            }
        }
        jt1 jt1Var = this.x;
        if (jt1Var != null) {
            o47 o47Var = jt1Var.d;
            int i5 = 0;
            while (true) {
                View[] viewArr = jt1Var.f.e;
                if (i5 < viewArr.length) {
                    View view = viewArr[i5];
                    if (view != null) {
                        f57 f57Var = (f57) view;
                        FrameLayout frameLayout = f57Var.G;
                        if (f57Var.a == 2) {
                            k57 k57Var = f57Var.I;
                            k57 k57Var2 = f57Var.H;
                            if (o47Var.n && !o47Var.o) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            frameLayout.setVisibility(i2);
                            int i6 = 4;
                            if (o47Var.p) {
                                i3 = 4;
                            } else {
                                i3 = 0;
                            }
                            k57Var2.setVisibility(i3);
                            if (o47Var.p) {
                                i6 = 0;
                            }
                            k57Var.setVisibility(i6);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (o47Var.o) {
                                f = 1.0f;
                            } else {
                                f = 0.5f;
                            }
                            animate.alpha(f).start();
                            k57Var2.a(o47Var.q, true);
                            k57Var.a(o47Var.q, true);
                            f57Var.F.a(!o47Var.r, true);
                            f57Var.i();
                        }
                    }
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(k47 k47Var, f47 f47Var, long j, nv1 nv1Var) {
        k47 k47Var2;
        nv1 nv1Var2;
        boolean z;
        m47 m47Var;
        int i;
        if (!this.i && k47Var != null && (i = k47Var.D) != 10 && i != 11 && i != 22 && i != 21 && i != 18 && i != 25 && i != 16) {
            k47Var2 = k47Var;
            nv1Var2 = nv1Var;
        } else {
            k47Var2 = null;
            nv1Var2 = null;
        }
        if (k47Var2 != null && (k47Var2.R4() || k47Var2.f4() || k47Var2.D == 30)) {
            z = true;
        } else {
            z = false;
        }
        this.u = z;
        if (k47Var2 == null && nv1Var2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (f47Var != null) {
            m47Var = new m47(this, null, 1, f47Var.d, j, null);
            this.a = m47Var;
        } else {
            k47 k47Var3 = k47Var2;
            if (k47Var3 == null) {
                k47Var3 = nv1Var2.a;
            }
            m47Var = new m47(this, null, 1, td4.u(k47Var3), j, null);
            this.a = m47Var;
        }
        if (!m47Var.e.isEmpty()) {
            this.d = nv1Var2;
            if (nv1Var2 != null) {
                this.e = nv1Var2.b;
                this.f = nv1Var2.c;
                return;
            }
            return;
        }
        this.a = null;
    }
}
