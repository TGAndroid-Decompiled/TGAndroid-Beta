package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vn implements RequestDelegate {
    public final int f27082a;
    public final c1 f27083b;
    public final Object f27084c;
    public final Object d;
    public final Object f27085e;
    public final Object f27086f;
    public final TLObject f27087g;

    public vn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.f27082a = i7;
        this.f27083b = c1Var;
        this.f27084c = obj;
        this.d = obj2;
        this.f27085e = obj3;
        this.f27086f = obj4;
        this.f27087g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27082a) {
            case 0:
                np npVar = (np) this.f27083b;
                Context context = (Context) this.f27084c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                nr nrVar = (nr) this.f27085e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f27086f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f27087g;
                npVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        g0.h3(new cn(1, context, t1Var));
                    }
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new a(nrVar, 27));
                    return;
                }
                g0.h3(new dn(npVar, nrVar, context, t1Var, tL_error, e2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final c10 c10Var = (c10) this.f27083b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f27084c;
                final String str = (String) this.d;
                final a10 a10Var = (a10) this.f27085e;
                final di.x2 x2Var = (di.x2) this.f27086f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f27087g;
                c10Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        c10 c10Var2 = c10Var;
                                        c10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        c10Var2.getMessagesController().P1().f12327k.h(storyItem2.dialogId, storyItem2);
                                        c10Var2.K.remove(a10Var);
                                        x2Var.run();
                                        return;
                                    default:
                                        c10 c10Var3 = c10Var;
                                        c10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        c10Var3.getMessagesController().P1().f12327k.h(storyItem3.dialogId, storyItem3);
                                        c10Var3.K.remove(a10Var);
                                        x2Var.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.h3(new dn(c10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), a10Var, x2Var, 4));
                        return;
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                c10 c10Var2 = c10Var;
                                c10Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                c10Var2.getMessagesController().P1().f12327k.h(storyItem2.dialogId, storyItem2);
                                c10Var2.K.remove(a10Var);
                                x2Var.run();
                                return;
                            default:
                                c10 c10Var3 = c10Var;
                                c10Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                c10Var3.getMessagesController().P1().f12327k.h(storyItem3.dialogId, storyItem3);
                                c10Var3.K.remove(a10Var);
                                x2Var.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
