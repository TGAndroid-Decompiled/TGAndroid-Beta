package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sn implements RequestDelegate {
    public final int f26930a;
    public final c1 f26931b;
    public final Object f26932c;
    public final Object d;
    public final Object f26933e;
    public final Object f26934f;
    public final TLObject f26935g;

    public sn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.f26930a = i7;
        this.f26931b = c1Var;
        this.f26932c = obj;
        this.d = obj2;
        this.f26933e = obj3;
        this.f26934f = obj4;
        this.f26935g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26930a) {
            case 0:
                mp mpVar = (mp) this.f26931b;
                Context context = (Context) this.f26932c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                lr lrVar = (lr) this.f26933e;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26934f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f26935g;
                mpVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        g0.g3(new vm(1, context, t1Var));
                    }
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new a(lrVar, 27));
                    return;
                }
                g0.g3(new wm(mpVar, lrVar, context, t1Var, tL_error, g2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final y00 y00Var = (y00) this.f26931b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f26932c;
                final String str = (String) this.d;
                final w00 w00Var = (w00) this.f26933e;
                final bi.e4 e4Var = (bi.e4) this.f26934f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f26935g;
                y00Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        y00 y00Var2 = y00Var;
                                        y00Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        y00Var2.getMessagesController().R1().f12395k.h(storyItem2.dialogId, storyItem2);
                                        y00Var2.K.remove(w00Var);
                                        e4Var.run();
                                        return;
                                    default:
                                        y00 y00Var3 = y00Var;
                                        y00Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        y00Var3.getMessagesController().R1().f12395k.h(storyItem3.dialogId, storyItem3);
                                        y00Var3.K.remove(w00Var);
                                        e4Var.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.g3(new wm(y00Var, storyItem, str, tL_textWithEntities, arrayList.get(0), w00Var, e4Var, 4));
                        return;
                    }
                }
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                y00 y00Var2 = y00Var;
                                y00Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                y00Var2.getMessagesController().R1().f12395k.h(storyItem2.dialogId, storyItem2);
                                y00Var2.K.remove(w00Var);
                                e4Var.run();
                                return;
                            default:
                                y00 y00Var3 = y00Var;
                                y00Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                y00Var3.getMessagesController().R1().f12395k.h(storyItem3.dialogId, storyItem3);
                                y00Var3.K.remove(w00Var);
                                e4Var.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
