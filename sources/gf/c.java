package gf;

import a0.h;
import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.hq;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.f4;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import s4.c1;
public final class c implements Runnable {
    public final int f7479a = 0;
    public final TLObject f7480b;
    public final int f7481c;
    public final boolean d;
    public final Object e;
    public final Object f7482f;
    public final Object h;
    public final Object f7483n;

    public c(e eVar, x1[] x1VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.e = eVar;
        this.f7482f = x1VarArr;
        this.f7480b = tLObject;
        this.f7481c = i10;
        this.h = uri;
        this.f7483n = context;
        this.d = z10;
    }

    @Override
    public final void run() {
        c1 K;
        int i10 = 0;
        switch (this.f7479a) {
            case 0:
                e eVar = (e) this.e;
                x1[] x1VarArr = (x1[]) this.f7482f;
                TLObject tLObject = this.f7480b;
                int i11 = this.f7481c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f7483n;
                boolean z10 = this.d;
                if (eVar != null) {
                    eVar.b();
                } else {
                    try {
                        x1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    x1VarArr[0] = null;
                }
                if (tLObject instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                    vp.r1(i11).V3(webpagepreview.users, false);
                    vp.r1(i11).P3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                            zs.f(i11).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                f.q(context, uri, z10, false, false, null, null, false, true, false);
                return;
            default:
                h4 h4Var = (h4) this.e;
                TLObject tLObject2 = this.f7480b;
                int i12 = this.f7481c;
                TLRPC.WebPage webPage2 = (TLRPC.WebPage) this.f7482f;
                jj jjVar = (jj) this.h;
                boolean z11 = this.d;
                String str = (String) this.f7483n;
                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage3 = tLObject2;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    vp.r1(i12).V3(tL_messages_webPage.users, false);
                    vp.r1(i12).P3(tL_messages_webPage.chats, false);
                    webPage3 = tL_messages_webPage.webpage;
                }
                if (webPage3 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage3;
                    if (tL_webPage.cached_page != null) {
                        if (!h4Var.f37730d0.isEmpty() && h4Var.f37730d0.get(0) == webPage2) {
                            if (jjVar != null) {
                                jjVar.f16337k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(jjVar.f16337k);
                                hs.a0(i12).h1(-2, 0, jjVar.f16357p1 ? 1 : 0, jj.B0(jjVar.f16337k), 0L, tL_messages_messages, false);
                            }
                            if (z11) {
                                h4Var.f37730d0.add(tL_webPage);
                            } else {
                                h4Var.f37730d0.set(0, tL_webPage);
                            }
                            if (h4Var.f37730d0.size() == 1) {
                                w0.f19025b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f19948id).commit();
                                h4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    h4Var.T(str, false);
                                }
                            }
                        }
                        h hVar = new h(1);
                        hVar.k(tL_webPage, tL_webPage.f19948id);
                        hs a02 = hs.a0(i12);
                        if (!hs.s0(hVar)) {
                            a02.f15938a.c(new hq(a02, hVar, 0));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (webPage3 instanceof TLRPC.TL_webPageNotModified) {
                    TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) webPage3;
                    TL_iv.Page page = webPage2.cached_page;
                    if (page != null) {
                        int i13 = page.views;
                        int i14 = tL_webPageNotModified.cached_page_views;
                        if (i13 != i14) {
                            page.views = i14;
                            page.flags |= 8;
                            while (true) {
                                l3[] l3VarArr = h4Var.f37746u0;
                                if (i10 < l3VarArr.length) {
                                    f4 f4Var = l3VarArr[i10].f39039c;
                                    if (f4Var.E == webPage2 && (K = h4Var.f37746u0[i10].f39038b.K(f4Var.b() - 1)) != null) {
                                        h4Var.f37746u0[i10].f39039c.y(K);
                                    }
                                    i10++;
                                } else if (jjVar != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(jjVar.f16337k);
                                    hs.a0(i12).h1(-2, 0, jjVar.f16357p1 ? 1 : 0, jj.B0(jjVar.f16337k), 0L, tL_messages_messages2, false);
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
        }
    }

    public c(h4 h4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, jj jjVar, boolean z10, String str) {
        this.e = h4Var;
        this.f7480b = tLObject;
        this.f7481c = i10;
        this.f7482f = webPage;
        this.h = jjVar;
        this.d = z10;
        this.f7483n = str;
    }
}
