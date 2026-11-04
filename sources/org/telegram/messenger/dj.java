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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.x90;
public final class dj {
    public bj f22197a;
    public bj f22198b;
    public bj f22199c;
    public org.telegram.ui.mm d;
    public int f22200e;
    public int f22201f;
    public boolean f22202g;
    public boolean h;
    public boolean f22203i;
    public boolean f22204j;
    public boolean f22205k;
    public boolean f22206l;
    public boolean f22207m;
    public boolean f22208n;
    public boolean f22209o;
    public boolean f22210p;
    public boolean f22211q;
    public boolean f22212r;
    public final boolean f22213s;
    public final boolean f22214t;
    public boolean f22215u;
    public TLRPC.WebPage v;
    public URLSpan f22216w;
    public da0 f22217x;

    public dj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f22203i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f22213s = z13;
        this.f22214t = z12;
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

    public final void b(zi ziVar) {
        TLRPC.WebPage webPage;
        this.f22216w = null;
        if (ziVar != null) {
            CharSequence charSequence = ziVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i3 = 0; i3 < uRLSpanArr.length; i3++) {
                    if (a(uRLSpanArr[i3].getURL(), this.v.url)) {
                        this.f22216w = uRLSpanArr[i3];
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
        bj bjVar = this.f22198b;
        if (bjVar == null || (arrayList3 = bjVar.f21841e) == null || arrayList3.isEmpty()) {
            bj bjVar2 = this.f22197a;
            if (bjVar2 == null || (arrayList2 = bjVar2.f21841e) == null || arrayList2.isEmpty()) {
                bj bjVar3 = this.f22199c;
                if (bjVar3 != null && (arrayList = bjVar3.f21841e) != null && !arrayList.isEmpty()) {
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
        this.f22202g = false;
        this.h = false;
        this.f22203i = m5.C(j10);
        this.f22204j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                zi ziVar = (zi) arrayList.get(i3);
                if (!TextUtils.isEmpty(ziVar.f26924z)) {
                    this.f22202g = true;
                }
                if (!this.f22203i && (messageFwdHeader = ziVar.f26868k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            bj bjVar = this.f22198b;
            if (bjVar != null) {
                sparseBooleanArray = bjVar.f21843g;
            } else {
                sparseBooleanArray = null;
            }
            bj bjVar2 = new bj(this, bool, 0, arrayList, j10, sparseBooleanArray);
            this.f22198b = bjVar2;
            if (bjVar2.f21841e.isEmpty()) {
                this.f22198b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                zi ziVar2 = (zi) arrayList.get(i10);
                if (ziVar2.q3()) {
                    j12 = ziVar2.f26868k.from_id.user_id;
                } else {
                    TLRPC.Chat M0 = hp.s1(ziVar2.I1).M0(Long.valueOf(ziVar2.f26868k.peer_id.channel_id));
                    if (t3.T(M0) && M0.megagroup && ziVar2.l3()) {
                        j11 = ziVar2.f26868k.fwd_from.from_id.channel_id;
                    } else {
                        j11 = ziVar2.f26868k.peer_id.channel_id;
                    }
                    j12 = -j11;
                }
                if (!arrayList3.contains(Long.valueOf(j12))) {
                    arrayList3.add(Long.valueOf(j12));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f22204j = true;
                return;
            }
            return;
        }
        this.f22198b = null;
    }

    public final void e(int i3, TLRPC.WebPage webPage, CharSequence charSequence, zi ziVar, org.telegram.ui.mm mmVar, zi ziVar2) {
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
        this.f22209o = false;
        this.f22210p = false;
        this.f22208n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f22199c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            bj bjVar = this.f22199c;
            if (bjVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (bjVar == null && ziVar2 != null && (message2 = ziVar2.f26868k) != null) {
                this.f22212r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f22211q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = h10.i(i3).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = h10.i(i3).e();
            tL_message.entities = li.b0(i3).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f22212r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f22211q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f22209o = z17;
                this.f22210p = zi.L4(webPage.document);
            } else {
                this.f22209o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (ziVar != null) {
                tL_message.replyMessage = ziVar.f26868k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (mmVar != null) {
                    tL_messageReplyHeader.quote_text = mmVar.f47706i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = mmVar.f47707j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            zi ziVar3 = new zi(i3, tL_message, true, false);
            bj bjVar2 = new bj(this, bool, 2, k5.k(ziVar3), zi.B0(ziVar3.f26868k), null);
            this.f22199c = bjVar2;
            if (bjVar2.f21841e.isEmpty()) {
                this.f22199c = null;
            } else {
                zi ziVar4 = (zi) this.f22199c.f21841e.get(0);
                CharSequence charSequence3 = ziVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = ziVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f22208n = z16;
                } else {
                    CharSequence charSequence5 = ziVar4.f26924z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) ziVar4.v).getSpans(0, ziVar4.f26924z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f22208n = z12;
                    }
                }
                if (!ziVar4.E0 && !ziVar4.L2 && (zi.o1(ziVar4.f26868k) instanceof TLRPC.TL_messageMediaWebPage) && (zi.o1(ziVar4.f26868k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = zi.o1(ziVar4.f26868k).webpage;
                } else {
                    webPage2 = null;
                }
                if (webPage2 != null) {
                    str = webPage2.type;
                }
                if (z13 && !ziVar4.w3() && webPage2 != null && ((webPage2.photo != null || zi.L4(webPage2.document)) && ((!TextUtils.isEmpty(webPage2.description) || !TextUtils.isEmpty(webPage2.title)) && !ziVar4.s4() && !"telegram_megagroup".equals(str) && !"telegram_background".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_user".equals(str) && !"telegram_story".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f22209o = z14;
                if (z11 && ziVar2 != null && (message = ziVar2.f26868k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!ziVar4.B3() || ziVar2.f26868k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f22211q = z15;
                } else if (z11) {
                    this.f22211q = ziVar4.B3();
                }
                TLRPC.Message message3 = ziVar4.f26868k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f22211q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        da0 da0Var = this.f22217x;
        if (da0Var != null) {
            dj djVar = da0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = da0Var.f33037f.f36386e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        x90 x90Var = (x90) view;
                        FrameLayout frameLayout = x90Var.G;
                        if (x90Var.f40285a == 2) {
                            ca0 ca0Var = x90Var.I;
                            ca0 ca0Var2 = x90Var.H;
                            if (djVar.f22208n && !djVar.f22209o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (djVar.f22210p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            ca0Var2.setVisibility(i11);
                            if (djVar.f22210p) {
                                i14 = 0;
                            }
                            ca0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (djVar.f22209o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            ca0Var2.a(djVar.f22211q, true);
                            ca0Var.a(djVar.f22211q, true);
                            x90Var.F.a(!djVar.f22212r, true);
                            x90Var.i();
                        }
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(zi ziVar, ui uiVar, long j10, org.telegram.ui.mm mmVar) {
        zi ziVar2;
        org.telegram.ui.mm mmVar2;
        boolean z10;
        int i3;
        if (!this.f22203i && ziVar != null && (i3 = ziVar.D) != 10 && i3 != 11 && i3 != 22 && i3 != 21 && i3 != 18 && i3 != 25 && i3 != 16) {
            ziVar2 = ziVar;
            mmVar2 = mmVar;
        } else {
            ziVar2 = null;
            mmVar2 = null;
        }
        if (ziVar2 != null && (ziVar2.T4() || ziVar2.h4() || ziVar2.D == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22215u = z10;
        if (ziVar2 == null && mmVar2 == null) {
            this.f22197a = null;
            this.d = null;
            return;
        }
        if (uiVar != null) {
            this.f22197a = new bj(this, null, 1, uiVar.d, j10, null);
        } else {
            zi ziVar3 = ziVar2;
            if (ziVar3 == null) {
                ziVar3 = mmVar2.f47700a;
            }
            this.f22197a = new bj(this, null, 1, k5.k(ziVar3), j10, null);
        }
        if (!this.f22197a.f21841e.isEmpty()) {
            this.d = mmVar2;
            if (mmVar2 != null) {
                this.f22200e = mmVar2.f47701b;
                this.f22201f = mmVar2.f47702c;
                return;
            }
            return;
        }
        this.f22197a = null;
    }
}
