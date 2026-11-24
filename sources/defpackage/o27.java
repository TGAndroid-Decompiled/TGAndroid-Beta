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
public final class o27 {
    public m27 a;
    public m27 b;
    public m27 c;
    public bu1 d;
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
    public wr1 x;

    public o27(boolean z, boolean z2, boolean z3) {
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

    public final void b(k27 k27Var) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (k27Var != null) {
            CharSequence charSequence = k27Var.v;
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
        m27 m27Var = this.b;
        if (m27Var == null || (arrayList3 = m27Var.e) == null || arrayList3.isEmpty()) {
            m27 m27Var2 = this.a;
            if (m27Var2 == null || (arrayList2 = m27Var2.e) == null || arrayList2.isEmpty()) {
                m27 m27Var3 = this.c;
                if (m27Var3 != null && (arrayList = m27Var3.e) != null && !arrayList.isEmpty()) {
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
        this.i = cf3.B(j);
        this.j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                k27 k27Var = (k27) arrayList.get(i);
                if (!TextUtils.isEmpty(k27Var.z)) {
                    this.g = true;
                }
                if (!this.i && (messageFwdHeader = k27Var.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            m27 m27Var = this.b;
            if (m27Var != null) {
                sparseBooleanArray = m27Var.g;
            } else {
                sparseBooleanArray = null;
            }
            m27 m27Var2 = new m27(this, bool, 0, arrayList, j, sparseBooleanArray);
            this.b = m27Var2;
            if (m27Var2.e.isEmpty()) {
                this.b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                k27 k27Var2 = (k27) arrayList.get(i2);
                if (k27Var2.p3()) {
                    j3 = k27Var2.k.from_id.user_id;
                } else {
                    TLRPC.Chat K0 = na7.q1(k27Var2.K1).K0(Long.valueOf(k27Var2.k.peer_id.channel_id));
                    if (hc2.T(K0) && K0.megagroup && k27Var2.k3()) {
                        j2 = k27Var2.k.fwd_from.from_id.channel_id;
                    } else {
                        j2 = k27Var2.k.peer_id.channel_id;
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

    public final void e(int i, TLRPC.WebPage webPage, CharSequence charSequence, k27 k27Var, bu1 bu1Var, k27 k27Var2) {
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
            m27 m27Var = this.c;
            if (m27Var != null && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (m27Var == null && k27Var2 != null && (message2 = k27Var2.k) != null) {
                this.r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(gl.m1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = y6c.h(i).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = y6c.h(i).e();
            tL_message.entities = hq6.d0(i).Y(charSequenceArr, true, true);
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
                this.p = k27.J4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (k27Var != null) {
                tL_message.replyMessage = k27Var.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (bu1Var != null) {
                    tL_messageReplyHeader.quote_text = bu1Var.i;
                    int i4 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i4 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = bu1Var.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i4 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            k27 k27Var3 = new k27(i, tL_message, true, false);
            m27 m27Var2 = new m27(this, bool, 2, tb4.t(k27Var3), k27.B0(k27Var3.k), null);
            this.c = m27Var2;
            if (m27Var2.e.isEmpty()) {
                this.c = null;
            } else {
                k27 k27Var4 = (k27) this.c.e.get(0);
                CharSequence charSequence3 = k27Var4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = k27Var4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    this.n = z7;
                } else {
                    CharSequence charSequence5 = k27Var4.z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) k27Var4.v).getSpans(0, k27Var4.z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        this.n = z3;
                    }
                }
                if (!k27Var4.G0 && !k27Var4.N2 && (k27.n1(k27Var4.k) instanceof TLRPC.TL_messageMediaWebPage) && (k27.n1(k27Var4.k).webpage instanceof TLRPC.TL_webPage)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    webPage2 = k27.n1(k27Var4.k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z4 && !k27Var4.v3() && webPage2 != null && ((webPage2.photo != null || k27.J4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !k27Var4.q4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.o = z5;
                if (z2 && k27Var2 != null && (message = k27Var2.k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!k27Var4.A3() || k27Var2.k.media.force_large_media)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    this.q = z6;
                } else if (z2) {
                    this.q = k27Var4.A3();
                }
                TLRPC.Message message3 = k27Var4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z10 = this.q;
                    messageMedia.force_large_media = !z10;
                    messageMedia.force_small_media = z10;
                }
            }
        }
        wr1 wr1Var = this.x;
        if (wr1Var != null) {
            o27 o27Var = wr1Var.d;
            int i5 = 0;
            while (true) {
                View[] viewArr = wr1Var.f.e;
                if (i5 < viewArr.length) {
                    View view = viewArr[i5];
                    if (view != null) {
                        f37 f37Var = (f37) view;
                        FrameLayout frameLayout = f37Var.G;
                        if (f37Var.a == 2) {
                            k37 k37Var = f37Var.I;
                            k37 k37Var2 = f37Var.H;
                            if (o27Var.n && !o27Var.o) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            frameLayout.setVisibility(i2);
                            int i6 = 4;
                            if (o27Var.p) {
                                i3 = 4;
                            } else {
                                i3 = 0;
                            }
                            k37Var2.setVisibility(i3);
                            if (o27Var.p) {
                                i6 = 0;
                            }
                            k37Var.setVisibility(i6);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (o27Var.o) {
                                f = 1.0f;
                            } else {
                                f = 0.5f;
                            }
                            animate.alpha(f).start();
                            k37Var2.a(o27Var.q, true);
                            k37Var.a(o27Var.q, true);
                            f37Var.F.a(!o27Var.r, true);
                            f37Var.i();
                        }
                    }
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(k27 k27Var, f27 f27Var, long j, bu1 bu1Var) {
        k27 k27Var2;
        bu1 bu1Var2;
        boolean z;
        m27 m27Var;
        int i;
        if (!this.i && k27Var != null && (i = k27Var.D) != 10 && i != 11 && i != 22 && i != 21 && i != 18 && i != 25 && i != 16) {
            k27Var2 = k27Var;
            bu1Var2 = bu1Var;
        } else {
            k27Var2 = null;
            bu1Var2 = null;
        }
        if (k27Var2 != null && (k27Var2.R4() || k27Var2.f4() || k27Var2.D == 30)) {
            z = true;
        } else {
            z = false;
        }
        this.u = z;
        if (k27Var2 == null && bu1Var2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (f27Var != null) {
            m27Var = new m27(this, null, 1, f27Var.d, j, null);
            this.a = m27Var;
        } else {
            k27 k27Var3 = k27Var2;
            if (k27Var3 == null) {
                k27Var3 = bu1Var2.a;
            }
            m27Var = new m27(this, null, 1, tb4.t(k27Var3), j, null);
            this.a = m27Var;
        }
        if (!m27Var.e.isEmpty()) {
            this.d = bu1Var2;
            if (bu1Var2 != null) {
                this.e = bu1Var2.b;
                this.f = bu1Var2.c;
                return;
            }
            return;
        }
        this.a = null;
    }
}
