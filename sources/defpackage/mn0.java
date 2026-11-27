package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UserInfoActivity;
public final class mn0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public mn0(wo8 wo8Var, gi0 gi0Var, icc iccVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, byte b) {
        this.a = b;
        this.e = wo8Var;
        this.c = gi0Var;
        this.f = iccVar;
        this.d = activity;
        this.g = inputStorePaymentPurpose;
        this.b = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                hl.c3(new nn0(tL_error, (tn0) obj6, tLObject, (List) obj5, (gi0) obj4, (tn0) obj3, (e) obj2, (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj, (byte) 0));
                return;
            case 1:
                hl.c3(new nn0(tL_error, (pcc) obj6, tLObject, (List) obj5, (gi0) obj4, (pcc) obj3, (e) obj2, (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj, (byte) 1));
                return;
            case 2:
                uc7 uc7Var = (uc7) obj6;
                Activity activity = (Activity) obj5;
                id idVar = (id) obj4;
                bf7 bf7Var = (bf7) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                uc7Var.getClass();
                if (tL_error == null) {
                    if (activity != null) {
                        hl.c3(new gb7(activity, idVar, (byte) 0));
                    }
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new ue(bf7Var, (byte) 2));
                    return;
                }
                hl.c3(new ra7(uc7Var, bf7Var, activity, idVar, tL_error, eVar, tL_channels_convertToGigagroup, (byte) 1));
                return;
            case 3:
                hl.c3(new nn0(tLObject, (wo8) obj6, (gi0) obj4, (icc) ((iv4) obj3), (Activity) obj2, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) obj), (List) obj5, tL_error, (byte) 8));
                return;
            case 4:
                hl.c3(new nn0(tLObject, (wo8) obj6, (gi0) obj4, (icc) ((qe2) obj3), (Activity) obj2, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) obj), (List) obj5, tL_error, (byte) 9));
                return;
            case 5:
                final a5c a5cVar = (a5c) obj6;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                final String str = (String) obj4;
                final y4c y4cVar = (y4c) obj3;
                final kt ktVar = (kt) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                a5cVar.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r6;
                                kt ktVar2 = ktVar;
                                y4c y4cVar2 = y4cVar;
                                String str2 = str;
                                TL_stories.StoryItem storyItem2 = storyItem;
                                a5c a5cVar2 = a5cVar;
                                a5cVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                        a5cVar2.K.remove(y4cVar2);
                                        ktVar2.run();
                                        return;
                                    default:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                        a5cVar2.K.remove(y4cVar2);
                                        ktVar2.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        hl.c3(new ra7(a5cVar, storyItem, str, tL_textWithEntities, arrayList.get(0), y4cVar, ktVar, (byte) 22));
                        return;
                    }
                }
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r6;
                        kt ktVar2 = ktVar;
                        y4c y4cVar2 = y4cVar;
                        String str2 = str;
                        TL_stories.StoryItem storyItem2 = storyItem;
                        a5c a5cVar2 = a5cVar;
                        a5cVar2.getClass();
                        switch (b2) {
                            case 0:
                                storyItem2.translatedLng = str2;
                                storyItem2.translatedText = null;
                                a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                a5cVar2.K.remove(y4cVar2);
                                ktVar2.run();
                                return;
                            default:
                                storyItem2.translatedLng = str2;
                                storyItem2.translatedText = null;
                                a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                a5cVar2.K.remove(y4cVar2);
                                ktVar2.run();
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new nn0((UserInfoActivity) obj6, tL_error, (TLObject) obj5, (TL_account.TL_birthday) obj4, (TLRPC.UserFull) obj3, tLObject, (int[]) obj2, (ArrayList) obj));
                return;
        }
    }

    public mn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
