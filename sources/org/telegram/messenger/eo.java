package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class eo implements RequestDelegate {
    public final int f15617a;
    public final f1 f15618b;
    public final Object f15619c;
    public final Object d;
    public final Object e;
    public final Object f15620f;
    public final TLObject f15621g;

    public eo(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f15617a = i10;
        this.f15618b = f1Var;
        this.f15619c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15620f = obj4;
        this.f15621g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15617a) {
            case 0:
                wp wpVar = (wp) this.f15618b;
                Context context = (Context) this.f15619c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                as asVar = (as) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f15620f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f15621g;
                wpVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        i0.g3(new gn(1, context, x1Var));
                    }
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new a(asVar, 27));
                    return;
                }
                i0.g3(new hn(wpVar, asVar, context, x1Var, tL_error, k2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final u10 u10Var = (u10) this.f15618b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f15619c;
                final String str = (String) this.d;
                final s10 s10Var = (s10) this.e;
                final bi.e eVar = (bi.e) this.f15620f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f15621g;
                u10Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        u10 u10Var2 = u10Var;
                                        u10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        u10Var2.getMessagesController().O1().f48925k.h(storyItem2.dialogId, storyItem2);
                                        u10Var2.J.remove(s10Var);
                                        eVar.run();
                                        return;
                                    default:
                                        u10 u10Var3 = u10Var;
                                        u10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        u10Var3.getMessagesController().O1().f48925k.h(storyItem3.dialogId, storyItem3);
                                        u10Var3.J.remove(s10Var);
                                        eVar.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        i0.g3(new hn(u10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), s10Var, eVar, 4));
                        return;
                    }
                }
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                u10 u10Var2 = u10Var;
                                u10Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                u10Var2.getMessagesController().O1().f48925k.h(storyItem2.dialogId, storyItem2);
                                u10Var2.J.remove(s10Var);
                                eVar.run();
                                return;
                            default:
                                u10 u10Var3 = u10Var;
                                u10Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                u10Var3.getMessagesController().O1().f48925k.h(storyItem3.dialogId, storyItem3);
                                u10Var3.J.remove(s10Var);
                                eVar.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
