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
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ta0;
public final class jj {
    public hj f24974a;
    public hj f24975b;
    public hj f24976c;
    public org.telegram.ui.rm d;
    public int f24977e;
    public int f24978f;
    public boolean f24979g;
    public boolean h;
    public boolean f24980i;
    public boolean f24981j;
    public boolean f24982k;
    public boolean f24983l;
    public boolean f24984m;
    public boolean f24985n;
    public boolean f24986o;
    public boolean f24987p;
    public boolean f24988q;
    public boolean f24989r;
    public final boolean f24990s;
    public final boolean f24991t;
    public boolean f24992u;
    public TLRPC.WebPage v;
    public URLSpan f24993w;
    public ta0 f24994x;

    public jj(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f24980i = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f24990s = z13;
        this.f24991t = z12;
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
        this.f24993w = null;
        if (fjVar != null) {
            CharSequence charSequence = fjVar.v;
            if ((charSequence instanceof Spanned) && (webPage = this.v) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                    if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                        this.f24993w = uRLSpanArr[i7];
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
        hj hjVar = this.f24975b;
        if (hjVar == null || (arrayList3 = hjVar.f24554e) == null || arrayList3.isEmpty()) {
            hj hjVar2 = this.f24974a;
            if (hjVar2 == null || (arrayList2 = hjVar2.f24554e) == null || arrayList2.isEmpty()) {
                hj hjVar3 = this.f24976c;
                if (hjVar3 != null && (arrayList = hjVar3.f24554e) != null && !arrayList.isEmpty()) {
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
        this.f24979g = false;
        this.h = false;
        this.f24980i = n5.C(j3);
        this.f24981j = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                fj fjVar = (fj) arrayList.get(i7);
                if (!TextUtils.isEmpty(fjVar.f24131z)) {
                    this.f24979g = true;
                }
                if (!this.f24980i && (messageFwdHeader = fjVar.f24073k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            hj hjVar = this.f24975b;
            if (hjVar != null) {
                sparseBooleanArray = hjVar.f24556g;
            } else {
                sparseBooleanArray = null;
            }
            hj hjVar2 = new hj(this, bool, 0, arrayList, j3, sparseBooleanArray);
            this.f24975b = hjVar2;
            if (hjVar2.f24554e.isEmpty()) {
                this.f24975b = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                fj fjVar2 = (fj) arrayList.get(i10);
                if (fjVar2.p3()) {
                    j11 = fjVar2.f24073k.from_id.user_id;
                } else {
                    TLRPC.Chat O0 = mp.u1(fjVar2.K1).O0(Long.valueOf(fjVar2.f24073k.peer_id.channel_id));
                    if (v3.T(O0) && O0.megagroup && fjVar2.k3()) {
                        j10 = fjVar2.f24073k.fwd_from.from_id.channel_id;
                    } else {
                        j10 = fjVar2.f24073k.peer_id.channel_id;
                    }
                    j11 = -j10;
                }
                if (!arrayList3.contains(Long.valueOf(j11))) {
                    arrayList3.add(Long.valueOf(j11));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.f24981j = true;
                return;
            }
            return;
        }
        this.f24975b = null;
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
        this.f24986o = false;
        this.f24987p = false;
        this.f24985n = true;
        if (this.v != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = webPage;
        String str = null;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.f24976c = null;
        } else {
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence;
            }
            hj hjVar = this.f24976c;
            if (hjVar != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (hjVar == null && fjVar2 != null && (message2 = fjVar2.f24073k) != null) {
                this.f24989r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.f24988q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = i10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = i10.i(i7).e();
            tL_message.entities = ri.d0(i7).Y(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.f24989r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z18 = this.f24988q;
                tL_messageMediaWebPage.force_large_media = !z18;
                tL_messageMediaWebPage.force_small_media = z18;
                if (webPage.photo != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f24986o = z17;
                this.f24987p = fj.K4(webPage.document);
            } else {
                this.f24986o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (fjVar != null) {
                tL_message.replyMessage = fjVar.f24073k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (rmVar != null) {
                    tL_messageReplyHeader.quote_text = rmVar.f51752i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = rmVar.f51753j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            fj fjVar3 = new fj(i7, tL_message, true, false);
            hj hjVar2 = new hj(this, bool, 2, f3.i(fjVar3), fj.B0(fjVar3.f24073k), null);
            this.f24976c = hjVar2;
            if (hjVar2.f24554e.isEmpty()) {
                this.f24976c = null;
            } else {
                fj fjVar4 = (fj) this.f24976c.f24554e.get(0);
                CharSequence charSequence3 = fjVar4.v;
                if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = fjVar4.v;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    this.f24985n = z16;
                } else {
                    CharSequence charSequence5 = fjVar4.f24131z;
                    if ((charSequence5 instanceof Spanned) && !TextUtils.isEmpty(charSequence5)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) fjVar4.v).getSpans(0, fjVar4.f24131z.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f24985n = z12;
                    }
                }
                if (!fjVar4.G0 && !fjVar4.N2 && (fj.n1(fjVar4.f24073k) instanceof TLRPC.TL_messageMediaWebPage) && (fj.n1(fjVar4.f24073k).webpage instanceof TLRPC.TL_webPage)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    webPage2 = fj.n1(fjVar4.f24073k).webpage;
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
                this.f24986o = z14;
                if (z11 && fjVar2 != null && (message = fjVar2.f24073k) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!fjVar4.A3() || fjVar2.f24073k.media.force_large_media)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    this.f24988q = z15;
                } else if (z11) {
                    this.f24988q = fjVar4.A3();
                }
                TLRPC.Message message3 = fjVar4.f24073k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z19 = this.f24988q;
                    messageMedia.force_large_media = !z19;
                    messageMedia.force_small_media = z19;
                }
            }
        }
        ta0 ta0Var = this.f24994x;
        if (ta0Var != null) {
            jj jjVar = ta0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = ta0Var.f39885f.f36665e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        na0 na0Var = (na0) view;
                        FrameLayout frameLayout = na0Var.G;
                        if (na0Var.f37736a == 2) {
                            sa0 sa0Var = na0Var.I;
                            sa0 sa0Var2 = na0Var.H;
                            if (jjVar.f24985n && !jjVar.f24986o) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (jjVar.f24987p) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            sa0Var2.setVisibility(i11);
                            if (jjVar.f24987p) {
                                i14 = 0;
                            }
                            sa0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (jjVar.f24986o) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            sa0Var2.a(jjVar.f24988q, true);
                            sa0Var.a(jjVar.f24988q, true);
                            na0Var.F.a(!jjVar.f24989r, true);
                            na0Var.i();
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
        if (!this.f24980i && fjVar != null && (i7 = fjVar.D) != 10 && i7 != 11 && i7 != 22 && i7 != 21 && i7 != 18 && i7 != 25 && i7 != 16) {
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
        this.f24992u = z10;
        if (fjVar2 == null && rmVar2 == null) {
            this.f24974a = null;
            this.d = null;
            return;
        }
        if (ajVar != null) {
            this.f24974a = new hj(this, null, 1, ajVar.d, j3, null);
        } else {
            fj fjVar3 = fjVar2;
            if (fjVar3 == null) {
                fjVar3 = rmVar2.f51746a;
            }
            this.f24974a = new hj(this, null, 1, f3.i(fjVar3), j3, null);
        }
        if (!this.f24974a.f24554e.isEmpty()) {
            this.d = rmVar2;
            if (rmVar2 != null) {
                this.f24977e = rmVar2.f51747b;
                this.f24978f = rmVar2.f51748c;
                return;
            }
            return;
        }
        this.f24974a = null;
    }
}
