package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class on implements RequestDelegate {
    public final int f24574a;
    public final c1 f24575b;
    public final Object f24576c;
    public final Object d;
    public final Object f24577e;
    public final Object f24578f;
    public final TLObject f24579g;

    public on(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i3) {
        this.f24574a = i3;
        this.f24575b = c1Var;
        this.f24576c = obj;
        this.d = obj2;
        this.f24577e = obj3;
        this.f24578f = obj4;
        this.f24579g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24574a) {
            case 0:
                hp hpVar = (hp) this.f24575b;
                Context context = (Context) this.f24576c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                ir irVar = (ir) this.f24577e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24578f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f24579g;
                hpVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        g0.h3(new vm(1, context, s1Var));
                    }
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new a(irVar, 26));
                    return;
                }
                g0.h3(new wm(hpVar, irVar, context, s1Var, tL_error, d2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final x00 x00Var = (x00) this.f24575b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f24576c;
                final String str = (String) this.d;
                final v00 v00Var = (v00) this.f24577e;
                final ci.e3 e3Var = (ci.e3) this.f24578f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f24579g;
                x00Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        x00 x00Var2 = x00Var;
                                        x00Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        x00Var2.getMessagesController().P1().f11282k.h(storyItem2.dialogId, storyItem2);
                                        x00Var2.K.remove(v00Var);
                                        e3Var.run();
                                        return;
                                    default:
                                        x00 x00Var3 = x00Var;
                                        x00Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        x00Var3.getMessagesController().P1().f11282k.h(storyItem3.dialogId, storyItem3);
                                        x00Var3.K.remove(v00Var);
                                        e3Var.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.h3(new wm(x00Var, storyItem, str, tL_textWithEntities, arrayList.get(0), v00Var, e3Var, 4));
                        return;
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                x00 x00Var2 = x00Var;
                                x00Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                x00Var2.getMessagesController().P1().f11282k.h(storyItem2.dialogId, storyItem2);
                                x00Var2.K.remove(v00Var);
                                e3Var.run();
                                return;
                            default:
                                x00 x00Var3 = x00Var;
                                x00Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                x00Var3.getMessagesController().P1().f11282k.h(storyItem3.dialogId, storyItem3);
                                x00Var3.K.remove(v00Var);
                                e3Var.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
