package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sn implements RequestDelegate {
    public final int f26831a;
    public final c1 f26832b;
    public final Object f26833c;
    public final Object d;
    public final Object f26834e;
    public final Object f26835f;
    public final TLObject f26836g;

    public sn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.f26831a = i7;
        this.f26832b = c1Var;
        this.f26833c = obj;
        this.d = obj2;
        this.f26834e = obj3;
        this.f26835f = obj4;
        this.f26836g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26831a) {
            case 0:
                mp mpVar = (mp) this.f26832b;
                Context context = (Context) this.f26833c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                lr lrVar = (lr) this.f26834e;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f26835f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f26836g;
                mpVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        g0.g3(new vm(1, context, u1Var));
                    }
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new a(lrVar, 27));
                    return;
                }
                g0.g3(new wm(mpVar, lrVar, context, u1Var, tL_error, h2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final z00 z00Var = (z00) this.f26832b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f26833c;
                final String str = (String) this.d;
                final x00 x00Var = (x00) this.f26834e;
                final bi.y3 y3Var = (bi.y3) this.f26835f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f26836g;
                z00Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        z00 z00Var2 = z00Var;
                                        z00Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        z00Var2.getMessagesController().R1().f12393k.h(storyItem2.dialogId, storyItem2);
                                        z00Var2.K.remove(x00Var);
                                        y3Var.run();
                                        return;
                                    default:
                                        z00 z00Var3 = z00Var;
                                        z00Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        z00Var3.getMessagesController().R1().f12393k.h(storyItem3.dialogId, storyItem3);
                                        z00Var3.K.remove(x00Var);
                                        y3Var.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.g3(new wm(z00Var, storyItem, str, tL_textWithEntities, arrayList.get(0), x00Var, y3Var, 4));
                        return;
                    }
                }
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                z00 z00Var2 = z00Var;
                                z00Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                z00Var2.getMessagesController().R1().f12393k.h(storyItem2.dialogId, storyItem2);
                                z00Var2.K.remove(x00Var);
                                y3Var.run();
                                return;
                            default:
                                z00 z00Var3 = z00Var;
                                z00Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                z00Var3.getMessagesController().R1().f12393k.h(storyItem3.dialogId, storyItem3);
                                z00Var3.K.remove(x00Var);
                                y3Var.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
