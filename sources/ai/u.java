package ai;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.messenger.yp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
public final class u implements Runnable {
    public final int f1555a = 0;
    public final int f1556b;
    public final boolean f1557c;
    public final Object d;
    public final Object f1558e;
    public final Object f1559f;
    public final Object h;
    public final Object f1560n;

    public u(v vVar, int[] iArr, String str, String str2, boolean z10, int i7, Runnable runnable) {
        this.f1558e = vVar;
        this.f1559f = iArr;
        this.d = str;
        this.h = str2;
        this.f1557c = z10;
        this.f1556b = i7;
        this.f1560n = runnable;
    }

    @Override
    public final void run() {
        int length;
        v4.e1 K;
        String str = null;
        int i7 = 0;
        switch (this.f1555a) {
            case 0:
                v vVar = (v) this.f1558e;
                int[] iArr = (int[]) this.f1559f;
                String str2 = (String) this.d;
                String str3 = (String) this.h;
                boolean z10 = this.f1557c;
                int i10 = this.f1556b;
                Runnable runnable = (Runnable) this.f1560n;
                if (!vVar.f1586l) {
                    vVar.f1582g = iArr;
                    q1 q1Var = vVar.d;
                    b2 b2Var = (b2) q1Var.f1489c;
                    int i11 = q1Var.f1488b;
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) q1Var.d;
                    if (!b2Var.f1146j && i11 == b2Var.C) {
                        String p10 = DictationAsr.p(str2, str3, z10);
                        b2Var.B = p10;
                        if (!p10.trim().isEmpty()) {
                            v vVar2 = b2Var.A;
                            if (vVar2 != null) {
                                str = vVar2.f1588n;
                            }
                            if (str == null) {
                                str = a0Var.i();
                            }
                            b2Var.r(str);
                        }
                        if (i10 <= 0) {
                            length = str2.length();
                        } else {
                            length = DictationAsr.p(str2, str3.substring(0, i10), z10).length();
                        }
                        if (!b2Var.f1144i) {
                            b2Var.d.M(length, b2Var.B);
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
                g4 g4Var = (g4) this.f1558e;
                TLObject tLObject = (TLObject) this.f1559f;
                int i12 = this.f1556b;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                gj gjVar = (gj) this.f1560n;
                boolean z11 = this.f1557c;
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
                        if (!g4Var.f47320e0.isEmpty() && g4Var.f47320e0.get(0) == webPage) {
                            if (gjVar != null) {
                                gjVar.f23817k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(gjVar.f23817k);
                                vr.a0(i12).h1(-2, 0, gjVar.f23846r1 ? 1 : 0, gj.B0(gjVar.f23817k), 0L, tL_messages_messages, false);
                            }
                            if (z11) {
                                g4Var.f47320e0.add(tL_webPage);
                            } else {
                                g4Var.f47320e0.set(0, tL_webPage);
                            }
                            if (g4Var.f47320e0.size() == 1) {
                                org.telegram.messenger.t0.f26600b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f28206id).commit();
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
                            a02.f27220a.c(new yp(a02, hVar, 0));
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
                                k3[] k3VarArr = g4Var.f47336v0;
                                if (i7 < k3VarArr.length) {
                                    e4 e4Var = k3VarArr[i7].f48550c;
                                    if (e4Var.F == webPage && (K = g4Var.f47336v0[i7].f48549b.K(e4Var.b() - 1)) != null) {
                                        g4Var.f47336v0[i7].f48550c.y(K);
                                    }
                                    i7++;
                                } else if (gjVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(gjVar.f23817k);
                                    vr.a0(i12).h1(-2, 0, gjVar.f23846r1 ? 1 : 0, gj.B0(gjVar.f23817k), 0L, tL_messages_messages2, false);
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
                vf.b bVar = (vf.b) this.f1558e;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.f1559f;
                TLObject tLObject2 = (TLObject) this.d;
                int i15 = this.f1556b;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f1560n;
                boolean z13 = this.f1557c;
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

    public u(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, gj gjVar, boolean z10, String str) {
        this.f1558e = g4Var;
        this.f1559f = tLObject;
        this.f1556b = i7;
        this.h = webPage;
        this.f1560n = gjVar;
        this.f1557c = z10;
        this.d = str;
    }

    public u(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z10) {
        this.f1558e = bVar;
        this.f1559f = t1VarArr;
        this.d = tLObject;
        this.f1556b = i7;
        this.h = uri;
        this.f1560n = context;
        this.f1557c = z10;
    }
}
