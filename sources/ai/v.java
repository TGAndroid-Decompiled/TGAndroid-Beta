package ai;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
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
    public final int f1561a = 0;
    public final int f1562b;
    public final boolean f1563c;
    public final Object d;
    public final Object f1564e;
    public final Object f1565f;
    public final Object h;
    public final Object f1566n;

    public v(w wVar, int[] iArr, String str, String str2, boolean z10, int i7, Runnable runnable) {
        this.f1564e = wVar;
        this.f1565f = iArr;
        this.d = str;
        this.h = str2;
        this.f1563c = z10;
        this.f1562b = i7;
        this.f1566n = runnable;
    }

    @Override
    public final void run() {
        int length;
        v4.f1 K;
        String str = null;
        int i7 = 0;
        switch (this.f1561a) {
            case 0:
                w wVar = (w) this.f1564e;
                int[] iArr = (int[]) this.f1565f;
                String str2 = (String) this.d;
                String str3 = (String) this.h;
                boolean z10 = this.f1563c;
                int i10 = this.f1562b;
                Runnable runnable = (Runnable) this.f1566n;
                if (!wVar.f1596l) {
                    wVar.f1592g = iArr;
                    u1 u1Var = wVar.d;
                    f2 f2Var = (f2) u1Var.f1559c;
                    int i11 = u1Var.f1558b;
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) u1Var.d;
                    if (!f2Var.f1193j && i11 == f2Var.C) {
                        String q10 = DictationAsr.q(str2, str3, z10);
                        f2Var.B = q10;
                        if (!q10.trim().isEmpty()) {
                            w wVar2 = f2Var.A;
                            if (wVar2 != null) {
                                str = wVar2.f1598n;
                            }
                            if (str == null) {
                                str = a0Var.i();
                            }
                            f2Var.s(str);
                        }
                        if (i10 <= 0) {
                            length = str2.length();
                        } else {
                            length = DictationAsr.q(str2, str3.substring(0, i10), z10).length();
                        }
                        if (!f2Var.f1191i) {
                            f2Var.d.l(length, f2Var.B);
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
                g4 g4Var = (g4) this.f1564e;
                TLObject tLObject = (TLObject) this.f1565f;
                int i12 = this.f1562b;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                gj gjVar = (gj) this.f1566n;
                boolean z11 = this.f1563c;
                String str4 = (String) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage2 = tLObject;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    np.u1(i12).f4(tL_messages_webPage.users, false);
                    np.u1(i12).Z3(tL_messages_webPage.chats, false);
                    webPage2 = tL_messages_webPage.webpage;
                }
                if (webPage2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage2;
                    if (tL_webPage.cached_page != null) {
                        if (!g4Var.f47957e0.isEmpty() && g4Var.f47957e0.get(0) == webPage) {
                            if (gjVar != null) {
                                gjVar.f24213k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(gjVar.f24213k);
                                ur.a0(i12).h1(-2, 0, gjVar.f24242r1 ? 1 : 0, gj.B0(gjVar.f24213k), 0L, tL_messages_messages, false);
                            }
                            if (z11) {
                                g4Var.f47957e0.add(tL_webPage);
                            } else {
                                g4Var.f47957e0.set(0, tL_webPage);
                            }
                            if (g4Var.f47957e0.size() == 1) {
                                org.telegram.messenger.t0.f26931b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f28589id).commit();
                                g4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str4 != null) {
                                    g4Var.T(str4, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.f28589id);
                        ur a02 = ur.a0(i12);
                        if (!ur.s0(hVar)) {
                            a02.f27250a.c(new xp(a02, hVar, 0));
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
                                k3[] k3VarArr = g4Var.f47973v0;
                                if (i7 < k3VarArr.length) {
                                    e4 e4Var = k3VarArr[i7].f49183c;
                                    if (e4Var.F == webPage && (K = g4Var.f47973v0[i7].f49182b.K(e4Var.b() - 1)) != null) {
                                        g4Var.f47973v0[i7].f49183c.y(K);
                                    }
                                    i7++;
                                } else if (gjVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(gjVar.f24213k);
                                    ur.a0(i12).h1(-2, 0, gjVar.f24242r1 ? 1 : 0, gj.B0(gjVar.f24213k), 0L, tL_messages_messages2, false);
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
                vf.b bVar = (vf.b) this.f1564e;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.f1565f;
                TLObject tLObject2 = (TLObject) this.d;
                int i15 = this.f1562b;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f1566n;
                boolean z13 = this.f1563c;
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
                    np.u1(i15).f4(webpagepreview.users, false);
                    np.u1(i15).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage3 = tL_messageMediaWebPage.webpage;
                        if ((webPage3 instanceof TLRPC.TL_webPage) && webPage3.cached_page != null) {
                            ls.f(i15).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                vf.c.q(context, uri, z13, false);
                return;
        }
    }

    public v(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, gj gjVar, boolean z10, String str) {
        this.f1564e = g4Var;
        this.f1565f = tLObject;
        this.f1562b = i7;
        this.h = webPage;
        this.f1566n = gjVar;
        this.f1563c = z10;
        this.d = str;
    }

    public v(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z10) {
        this.f1564e = bVar;
        this.f1565f = t1VarArr;
        this.d = tLObject;
        this.f1562b = i7;
        this.h = uri;
        this.f1566n = context;
        this.f1563c = z10;
    }
}
