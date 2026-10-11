package of;

import a0.i;
import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.f4;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import s4.d1;
public final class c implements Runnable {
    public final int f17197a = 0;
    public final TLObject f17198b;
    public final int f17199c;
    public final boolean d;
    public final Object f17200e;
    public final Object f17201f;
    public final Object h;
    public final Object f17202n;

    public c(e eVar, a2[] a2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.f17200e = eVar;
        this.f17201f = a2VarArr;
        this.f17198b = tLObject;
        this.f17199c = i10;
        this.h = uri;
        this.f17202n = context;
        this.d = z10;
    }

    @Override
    public final void run() {
        d1 K;
        int i10 = 0;
        switch (this.f17197a) {
            case 0:
                e eVar = (e) this.f17200e;
                a2[] a2VarArr = (a2[]) this.f17201f;
                TLObject tLObject = this.f17198b;
                int i11 = this.f17199c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f17202n;
                boolean z10 = this.d;
                if (eVar != null) {
                    eVar.b();
                } else {
                    try {
                        a2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    a2VarArr[0] = null;
                }
                if (tLObject instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                    MessagesController.getInstance(i11).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i11).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                            return;
                        }
                    }
                }
                f.p(context, uri, z10, false);
                return;
            default:
                h4 h4Var = (h4) this.f17200e;
                TLObject tLObject2 = this.f17198b;
                int i12 = this.f17199c;
                TLRPC.WebPage webPage2 = (TLRPC.WebPage) this.f17201f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z11 = this.d;
                String str = (String) this.f17202n;
                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_webPage;
                TLRPC.WebPage webPage3 = tLObject2;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i12).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i12).putChats(tL_messages_webPage.chats, false);
                    webPage3 = tL_messages_webPage.webpage;
                }
                if (webPage3 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) webPage3;
                    if (tL_webPage.cached_page != null) {
                        if (!h4Var.f38303d0.isEmpty() && h4Var.f38303d0.get(0) == webPage2) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z11) {
                                h4Var.f38303d0.add(tL_webPage);
                            } else {
                                h4Var.f38303d0.set(0, tL_webPage);
                            }
                            if (h4Var.f38303d0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f20221id).commit();
                                h4Var.e0(z11 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    h4Var.V(str, false);
                                }
                            }
                        }
                        i iVar = new i(1);
                        iVar.k(tL_webPage, tL_webPage.f20221id);
                        MessagesStorage.getInstance(i12).putWebPages(iVar);
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
                                l3[] l3VarArr = h4Var.f38319u0;
                                if (i10 < l3VarArr.length) {
                                    f4 f4Var = l3VarArr[i10].f39531c;
                                    if (f4Var.E == webPage2 && (K = h4Var.f38319u0[i10].f39530b.K(f4Var.h() - 1)) != null) {
                                        h4Var.f38319u0[i10].f39531c.y(K);
                                    }
                                    i10++;
                                } else if (messageObject != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(messageObject.messageOwner);
                                    MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
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

    public c(h4 h4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.f17200e = h4Var;
        this.f17198b = tLObject;
        this.f17199c = i10;
        this.f17201f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.f17202n = str;
    }
}
