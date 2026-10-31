package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class co implements RequestDelegate {
    public final int f15054a;
    public final f1 f15055b;
    public final Object f15056c;
    public final Object d;
    public final Object e;
    public final Object f15057f;
    public final TLObject f15058g;

    public co(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f15054a = i10;
        this.f15055b = f1Var;
        this.f15056c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15057f = obj4;
        this.f15058g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15054a) {
            case 0:
                vp vpVar = (vp) this.f15055b;
                Context context = (Context) this.f15056c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                zr zrVar = (zr) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f15057f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f15058g;
                vpVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        i0.g3(new fn(1, context, x1Var));
                    }
                    vpVar.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new a(zrVar, 27));
                    return;
                }
                i0.g3(new gn(vpVar, zrVar, context, x1Var, tL_error, k2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final t10 t10Var = (t10) this.f15055b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f15056c;
                final String str = (String) this.d;
                final r10 r10Var = (r10) this.e;
                final bi.e eVar = (bi.e) this.f15057f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f15058g;
                t10Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        t10 t10Var2 = t10Var;
                                        t10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        t10Var2.getMessagesController().O1().f48911k.h(storyItem2.dialogId, storyItem2);
                                        t10Var2.J.remove(r10Var);
                                        eVar.run();
                                        return;
                                    default:
                                        t10 t10Var3 = t10Var;
                                        t10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        t10Var3.getMessagesController().O1().f48911k.h(storyItem3.dialogId, storyItem3);
                                        t10Var3.J.remove(r10Var);
                                        eVar.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        i0.g3(new gn(t10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), r10Var, eVar, 4));
                        return;
                    }
                }
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                t10 t10Var2 = t10Var;
                                t10Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                t10Var2.getMessagesController().O1().f48911k.h(storyItem2.dialogId, storyItem2);
                                t10Var2.J.remove(r10Var);
                                eVar.run();
                                return;
                            default:
                                t10 t10Var3 = t10Var;
                                t10Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                t10Var3.getMessagesController().O1().f48911k.h(storyItem3.dialogId, storyItem3);
                                t10Var3.J.remove(r10Var);
                                eVar.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
