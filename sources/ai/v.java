package ai;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
public final class v implements Runnable {
    public final int f1556a = 0;
    public final int f1557b;
    public final boolean f1558c;
    public final Object d;
    public final Object f1559e;
    public final Object f1560f;
    public final Object h;
    public final Object f1561n;

    public v(w wVar, int[] iArr, String str, String str2, boolean z10, int i7, Runnable runnable) {
        this.f1559e = wVar;
        this.f1560f = iArr;
        this.d = str;
        this.h = str2;
        this.f1558c = z10;
        this.f1557b = i7;
        this.f1561n = runnable;
    }

    @Override
    public final void run() {
        int length;
        v4.f1 K;
        String str = null;
        int i7 = 0;
        switch (this.f1556a) {
            case 0:
                w wVar = (w) this.f1559e;
                int[] iArr = (int[]) this.f1560f;
                String str2 = (String) this.d;
                String str3 = (String) this.h;
                boolean z10 = this.f1558c;
                int i10 = this.f1557b;
                Runnable runnable = (Runnable) this.f1561n;
                if (!wVar.f1579l) {
                    wVar.f1575g = iArr;
                    r1 r1Var = wVar.d;
                    c2 c2Var = (c2) r1Var.f1488c;
                    int i11 = r1Var.f1487b;
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) r1Var.d;
                    if (!c2Var.f1153j && i11 == c2Var.C) {
                        String o4 = DictationAsr.o(str2, str3, z10);
                        c2Var.B = o4;
                        if (!o4.trim().isEmpty()) {
                            w wVar2 = c2Var.A;
                            if (wVar2 != null) {
                                str = wVar2.f1581n;
                            }
                            if (str == null) {
                                str = a0Var.i();
                            }
                            c2Var.r(str);
                        }
                        if (i10 <= 0) {
                            length = str2.length();
                        } else {
                            length = DictationAsr.o(str2, str3.substring(0, i10), z10).length();
                        }
                        if (!c2Var.f1151i) {
                            c2Var.d.l(length, c2Var.B);
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
                g4 g4Var = (g4) this.f1559e;
                TLObject tLObject = (TLObject) this.f1560f;
                int i12 = this.f1557b;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                fj fjVar = (fj) this.f1561n;
                boolean z11 = this.f1558c;
                String str4 = (String) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    mp.u1(i12).f4(tL_messages_webPage.users, false);
                    mp.u1(i12).Z3(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!g4Var.f47883e0.isEmpty() && g4Var.f47883e0.get(0) == webPage) {
                            if (fjVar != null) {
                                fjVar.f23965k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(fjVar.f23965k);
                                tr.a0(i12).h1(-2, 0, fjVar.f23994r1 ? 1 : 0, fj.B0(fjVar.f23965k), 0L, tL_messages_messages, false);
                            }
                            if (z11) {
                                g4Var.f47883e0.add(tL_webPage);
                            } else {
                                g4Var.f47883e0.set(0, tL_webPage);
                            }
                            if (g4Var.f47883e0.size() == 1) {
                                org.telegram.messenger.t0.f26913b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f28558id).commit();
                                g4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str4 != null) {
                                    g4Var.T(str4, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f28558id);
                        tr a02 = tr.a0(i12);
                        if (!tr.s0(hVar)) {
                            a02.f27052a.c(new wp(a02, hVar, 0));
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
                                k3[] k3VarArr = g4Var.f47899v0;
                                if (i7 < k3VarArr.length) {
                                    e4 e4Var = k3VarArr[i7].f49136c;
                                    if (e4Var.F == webPage && (K = g4Var.f47899v0[i7].f49135b.K(e4Var.b() - 1)) != null) {
                                        g4Var.f47899v0[i7].f49136c.y(K);
                                    }
                                    i7++;
                                } else if (fjVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(fjVar.f23965k);
                                    tr.a0(i12).h1(-2, 0, fjVar.f23994r1 ? 1 : 0, fj.B0(fjVar.f23965k), 0L, tL_messages_messages2, false);
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
                vf.b bVar = (vf.b) this.f1559e;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.f1560f;
                TLObject tLObject2 = (TLObject) this.d;
                int i15 = this.f1557b;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f1561n;
                boolean z13 = this.f1558c;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        u1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    u1VarArr[0] = null;
                }
                if (tLObject2 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject2;
                    mp.u1(i15).f4(webpagepreview.users, false);
                    mp.u1(i15).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            ks.f(i15).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                vf.c.q(context, uri, z13, false);
                return;
        }
    }

    public v(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, fj fjVar, boolean z10, String str) {
        this.f1559e = g4Var;
        this.f1560f = tLObject;
        this.f1557b = i7;
        this.h = webPage;
        this.f1561n = fjVar;
        this.f1558c = z10;
        this.d = str;
    }

    public v(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z10) {
        this.f1559e = bVar;
        this.f1560f = u1VarArr;
        this.d = tLObject;
        this.f1557b = i7;
        this.h = uri;
        this.f1561n = context;
        this.f1558c = z10;
    }
}
