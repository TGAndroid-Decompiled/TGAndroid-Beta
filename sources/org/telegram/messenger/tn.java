package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class tn implements RequestDelegate {
    public final int f27021a;
    public final c1 f27022b;
    public final Object f27023c;
    public final Object d;
    public final Object f27024e;
    public final Object f27025f;
    public final TLObject f27026g;

    public tn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.f27021a = i7;
        this.f27022b = c1Var;
        this.f27023c = obj;
        this.d = obj2;
        this.f27024e = obj3;
        this.f27025f = obj4;
        this.f27026g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27021a) {
            case 0:
                np npVar = (np) this.f27022b;
                Context context = (Context) this.f27023c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                mr mrVar = (mr) this.f27024e;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f27025f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f27026g;
                npVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        g0.g3(new wm(1, context, t1Var));
                    }
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new a(mrVar, 27));
                    return;
                }
                g0.g3(new xm(npVar, mrVar, context, t1Var, tL_error, g2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final a10 a10Var = (a10) this.f27022b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f27023c;
                final String str = (String) this.d;
                final y00 y00Var = (y00) this.f27024e;
                final bi.e4 e4Var = (bi.e4) this.f27025f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f27026g;
                a10Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        a10 a10Var2 = a10Var;
                                        a10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        a10Var2.getMessagesController().R1().f12385k.h(storyItem2.dialogId, storyItem2);
                                        a10Var2.K.remove(y00Var);
                                        e4Var.run();
                                        return;
                                    default:
                                        a10 a10Var3 = a10Var;
                                        a10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        a10Var3.getMessagesController().R1().f12385k.h(storyItem3.dialogId, storyItem3);
                                        a10Var3.K.remove(y00Var);
                                        e4Var.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.g3(new xm(a10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), y00Var, e4Var, 4));
                        return;
                    }
                }
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                a10 a10Var2 = a10Var;
                                a10Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                a10Var2.getMessagesController().R1().f12385k.h(storyItem2.dialogId, storyItem2);
                                a10Var2.K.remove(y00Var);
                                e4Var.run();
                                return;
                            default:
                                a10 a10Var3 = a10Var;
                                a10Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                a10Var3.getMessagesController().R1().f12385k.h(storyItem3.dialogId, storyItem3);
                                a10Var3.K.remove(y00Var);
                                e4Var.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
