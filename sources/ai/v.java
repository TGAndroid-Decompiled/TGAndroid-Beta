package ai;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.messenger.xp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
public final class v implements Runnable {
    public final int f1564a = 0;
    public final int f1565b;
    public final boolean f1566c;
    public final Object d;
    public final Object f1567e;
    public final Object f1568f;
    public final Object h;
    public final Object f1569n;

    public v(w wVar, int[] iArr, String str, String str2, boolean z10, int i7, Runnable runnable) {
        this.f1567e = wVar;
        this.f1568f = iArr;
        this.d = str;
        this.h = str2;
        this.f1566c = z10;
        this.f1565b = i7;
        this.f1569n = runnable;
    }

    @Override
    public final void run() {
        int length;
        v4.e1 K;
        String str = null;
        int i7 = 0;
        switch (this.f1564a) {
            case 0:
                w wVar = (w) this.f1567e;
                int[] iArr = (int[]) this.f1568f;
                String str2 = (String) this.d;
                String str3 = (String) this.h;
                boolean z10 = this.f1566c;
                int i10 = this.f1565b;
                Runnable runnable = (Runnable) this.f1569n;
                if (!wVar.f1587l) {
                    wVar.f1583g = iArr;
                    r1 r1Var = wVar.d;
                    c2 c2Var = (c2) r1Var.f1498c;
                    int i11 = r1Var.f1497b;
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) r1Var.d;
                    if (!c2Var.f1153j && i11 == c2Var.C) {
                        String p10 = DictationAsr.p(str2, str3, z10);
                        c2Var.B = p10;
                        if (!p10.trim().isEmpty()) {
                            w wVar2 = c2Var.A;
                            if (wVar2 != null) {
                                str = wVar2.f1589n;
                            }
                            if (str == null) {
                                str = a0Var.i();
                            }
                            c2Var.r(str);
                        }
                        if (i10 <= 0) {
                            length = str2.length();
                        } else {
                            length = DictationAsr.p(str2, str3.substring(0, i10), z10).length();
                        }
                        if (!c2Var.f1151i) {
                            c2Var.d.M(length, c2Var.B);
                        }
                    }
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g4 g4Var = (g4) this.f1567e;
                TLObject tLObject = (TLObject) this.f1568f;
                int i12 = this.f1565b;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                gj gjVar = (gj) this.f1569n;
                boolean z11 = this.f1566c;
                String str4 = (String) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    np.s1(i12).Y3(tL_messages_webPage.users, false);
                    np.s1(i12).S3(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!g4Var.f47310e0.isEmpty() && g4Var.f47310e0.get(0) == webPage) {
                            if (gjVar != null) {
                                gjVar.f23819k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(gjVar.f23819k);
                                vr.a0(i12).h1(-2, 0, gjVar.f23848r1 ? 1 : 0, gj.B0(gjVar.f23819k), 0L, tL_messages_messages, false);
                            }
                            if (z11) {
                                g4Var.f47310e0.add(tL_webPage);
                            } else {
                                g4Var.f47310e0.set(0, tL_webPage);
                            }
                            if (g4Var.f47310e0.size() == 1) {
                                org.telegram.messenger.t0.f26609b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f28206id).commit();
                                g4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str4 != null) {
                                    g4Var.T(str4, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f28206id);
                        vr a02 = vr.a0(i12);
                        if (!vr.s0(hVar)) {
                            a02.f27219a.c(new xp(a02, hVar, 0));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (webPage2 instanceof TLRPC.TL_webPageNotModified) {
                    TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) webPage2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int i13 = page.views;
                        int i14 = tL_webPageNotModified.cached_page_views;
                        if (i13 != i14) {
                            page.views = i14;
                            page.flags |= 8;
                            while (true) {
                                k3[] k3VarArr = g4Var.f47326v0;
                                if (i7 < k3VarArr.length) {
                                    e4 e4Var = k3VarArr[i7].f48504c;
                                    if (e4Var.F == webPage && (K = g4Var.f47326v0[i7].f48503b.K(e4Var.b() - 1)) != null) {
                                        g4Var.f47326v0[i7].f48504c.y(K);
                                    }
                                    i7++;
                                } else if (gjVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(gjVar.f23819k);
                                    vr.a0(i12).h1(-2, 0, gjVar.f23848r1 ? 1 : 0, gj.B0(gjVar.f23819k), 0L, tL_messages_messages2, false);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                vf.b bVar = (vf.b) this.f1567e;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.f1568f;
                TLObject tLObject2 = (TLObject) this.d;
                int i15 = this.f1565b;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f1569n;
                boolean z13 = this.f1566c;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        t1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    t1VarArr[0] = null;
                }
                if (tLObject2 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject2;
                    np.s1(i15).Y3(webpagepreview.users, false);
                    np.s1(i15).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            ns.f(i15).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                vf.c.q(context, uri, z13, false);
                return;
        }
    }

    public v(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, gj gjVar, boolean z10, String str) {
        this.f1567e = g4Var;
        this.f1568f = tLObject;
        this.f1565b = i7;
        this.h = webPage;
        this.f1569n = gjVar;
        this.f1566c = z10;
        this.d = str;
    }

    public v(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z10) {
        this.f1567e = bVar;
        this.f1568f = t1VarArr;
        this.d = tLObject;
        this.f1565b = i7;
        this.h = uri;
        this.f1569n = context;
        this.f1566c = z10;
    }
}
