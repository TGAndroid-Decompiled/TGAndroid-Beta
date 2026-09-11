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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.g4;
import org.telegram.ui.i4;
import org.telegram.ui.m3;
import s4.c1;
public final class c implements Runnable {
    public final int f16997a = 0;
    public final TLObject f16998b;
    public final int f16999c;
    public final boolean d;
    public final Object f17000e;
    public final Object f17001f;
    public final Object h;
    public final Object f17002n;

    public c(e eVar, b2[] b2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.f17000e = eVar;
        this.f17001f = b2VarArr;
        this.f16998b = tLObject;
        this.f16999c = i10;
        this.h = uri;
        this.f17002n = context;
        this.d = z10;
    }

    @Override
    public final void run() {
        c1 K;
        int i10 = 0;
        switch (this.f16997a) {
            case 0:
                e eVar = (e) this.f17000e;
                b2[] b2VarArr = (b2[]) this.f17001f;
                TLObject tLObject = this.f16998b;
                int i11 = this.f16999c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.f17002n;
                boolean z10 = this.d;
                if (eVar != null) {
                    eVar.b();
                } else {
                    try {
                        b2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    b2VarArr[0] = null;
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
                i4 i4Var = (i4) this.f17000e;
                TLObject tLObject2 = this.f16998b;
                int i12 = this.f16999c;
                TLRPC.WebPage webPage2 = (TLRPC.WebPage) this.f17001f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z11 = this.d;
                String str = (String) this.f17002n;
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
                        if (!i4Var.f37216d0.isEmpty() && i4Var.f37216d0.get(0) == webPage2) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z11) {
                                i4Var.f37216d0.add(tL_webPage);
                            } else {
                                i4Var.f37216d0.set(0, tL_webPage);
                            }
                            if (i4Var.f37216d0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.f20022id).commit();
                                i4Var.e0(z11 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    i4Var.V(str, false);
                                }
                            }
                        }
                        i iVar = new i(1);
                        iVar.k(tL_webPage, tL_webPage.f20022id);
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
                                m3[] m3VarArr = i4Var.f37232u0;
                                if (i10 < m3VarArr.length) {
                                    g4 g4Var = m3VarArr[i10].f38552c;
                                    if (g4Var.E == webPage2 && (K = i4Var.f37232u0[i10].f38551b.K(g4Var.h() - 1)) != null) {
                                        i4Var.f37232u0[i10].f38552c.y(K);
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

    public c(i4 i4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.f17000e = i4Var;
        this.f16998b = tLObject;
        this.f16999c = i10;
        this.f17001f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.f17002n = str;
    }
}
