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
    public final int f1559a = 0;
    public final int f1560b;
    public final boolean f1561c;
    public final Object d;
    public final Object f1562e;
    public final Object f1563f;
    public final Object h;
    public final Object f1564n;

    public v(w wVar, int[] iArr, String str, String str2, boolean z10, int i7, Runnable runnable) {
        this.f1562e = wVar;
        this.f1563f = iArr;
        this.d = str;
        this.h = str2;
        this.f1561c = z10;
        this.f1560b = i7;
        this.f1564n = runnable;
    }

    @Override
    public final void run() {
        int length;
        v4.f1 K;
        String str = null;
        int i7 = 0;
        switch (this.f1559a) {
            case 0:
                w wVar = (w) this.f1562e;
                int[] iArr = (int[]) this.f1563f;
                String str2 = (String) this.d;
                String str3 = (String) this.h;
                boolean z10 = this.f1561c;
                int i10 = this.f1560b;
                Runnable runnable = (Runnable) this.f1564n;
                if (!wVar.f1585l) {
                    wVar.f1581g = iArr;
                    t1 t1Var = wVar.d;
                    e2 e2Var = (e2) t1Var.f1520c;
                    int i11 = t1Var.f1519b;
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) t1Var.d;
                    if (!e2Var.f1178j && i11 == e2Var.C) {
                        String q10 = DictationAsr.q(str2, str3, z10);
                        e2Var.B = q10;
                        if (!q10.trim().isEmpty()) {
                            w wVar2 = e2Var.A;
                            if (wVar2 != null) {
                                str = wVar2.f1587n;
                            }
                            if (str == null) {
                                str = a0Var.i();
                            }
                            e2Var.r(str);
                        }
                        if (i10 <= 0) {
                            length = str2.length();
                        } else {
                            length = DictationAsr.q(str2, str3.substring(0, i10), z10).length();
                        }
                        if (!e2Var.f1176i) {
                            e2Var.d.l(length, e2Var.B);
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
                g4 g4Var = (g4) this.f1562e;
                TLObject tLObject = (TLObject) this.f1563f;
                int i12 = this.f1560b;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                fj fjVar = (fj) this.f1564n;
                boolean z11 = this.f1561c;
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
                        if (!g4Var.f47953e0.isEmpty() && g4Var.f47953e0.get(0) == webPage) {
                            if (fjVar != null) {
                                fjVar.f23993k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(fjVar.f23993k);
                                tr.a0(i12).h1(-2, 0, fjVar.f24022r1 ? 1 : 0, fj.B0(fjVar.f23993k), 0L, tL_messages_messages, false);
                            }
                            if (z11) {
                                g4Var.f47953e0.add(tL_webPage);
                            } else {
                                g4Var.f47953e0.set(0, tL_webPage);
                            }
                            if (g4Var.f47953e0.size() == 1) {
                                org.telegram.messenger.t0.f26941b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f28586id).commit();
                                g4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str4 != null) {
                                    g4Var.T(str4, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f28586id);
                        tr a02 = tr.a0(i12);
                        if (!tr.s0(hVar)) {
                            a02.f27080a.c(new wp(a02, hVar, 0));
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
                                k3[] k3VarArr = g4Var.f47969v0;
                                if (i7 < k3VarArr.length) {
                                    e4 e4Var = k3VarArr[i7].f49179c;
                                    if (e4Var.F == webPage && (K = g4Var.f47969v0[i7].f49178b.K(e4Var.b() - 1)) != null) {
                                        g4Var.f47969v0[i7].f49179c.y(K);
                                    }
                                    i7++;
                                } else if (fjVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(fjVar.f23993k);
                                    tr.a0(i12).h1(-2, 0, fjVar.f24022r1 ? 1 : 0, fj.B0(fjVar.f23993k), 0L, tL_messages_messages2, false);
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
                vf.b bVar = (vf.b) this.f1562e;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.f1563f;
                TLObject tLObject2 = (TLObject) this.d;
                int i15 = this.f1560b;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f1564n;
                boolean z13 = this.f1561c;
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
        this.f1562e = g4Var;
        this.f1563f = tLObject;
        this.f1560b = i7;
        this.h = webPage;
        this.f1564n = fjVar;
        this.f1561c = z10;
        this.d = str;
    }

    public v(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z10) {
        this.f1562e = bVar;
        this.f1563f = t1VarArr;
        this.d = tLObject;
        this.f1560b = i7;
        this.h = uri;
        this.f1564n = context;
        this.f1561c = z10;
    }
}
