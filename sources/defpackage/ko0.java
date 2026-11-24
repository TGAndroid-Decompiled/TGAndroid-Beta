package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UserInfoActivity;
public final class ko0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ko0(ln8 ln8Var, fj0 fj0Var, jac jacVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, byte b) {
        this.a = b;
        this.e = ln8Var;
        this.c = fj0Var;
        this.f = jacVar;
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
                gm.c3(new lo0(tL_error, (to0) obj6, tLObject, (List) obj5, (fj0) obj4, (to0) obj3, (d) obj2, (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj, (byte) 0));
                return;
            case 1:
                gm.c3(new lo0(tL_error, (qac) obj6, tLObject, (List) obj5, (fj0) obj4, (qac) obj3, (d) obj2, (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj, (byte) 1));
                return;
            case 2:
                oc7 oc7Var = (oc7) obj6;
                Activity activity = (Activity) obj5;
                he heVar = (he) obj4;
                ue7 ue7Var = (ue7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                oc7Var.getClass();
                if (tL_error == null) {
                    if (activity != null) {
                        gm.c3(new ya7(activity, heVar, (byte) 0));
                    }
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new kg(ue7Var, (byte) 2));
                    return;
                }
                gm.c3(new ja7(oc7Var, ue7Var, activity, heVar, tL_error, dVar, tL_channels_convertToGigagroup, (byte) 1));
                return;
            case 3:
                gm.c3(new lo0(tLObject, (ln8) obj6, (fj0) obj4, (jac) ((lf2) obj3), (Activity) obj2, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) obj), (List) obj5, tL_error, (byte) 8));
                return;
            case 4:
                gm.c3(new lo0(tLObject, (ln8) obj6, (fj0) obj4, (jac) ((fv4) obj3), (Activity) obj2, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) obj), (List) obj5, tL_error, (byte) 9));
                return;
            case 5:
                final b3c b3cVar = (b3c) obj6;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                final String str = (String) obj4;
                final z2c z2cVar = (z2c) obj3;
                final fu fuVar = (fu) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b3cVar.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r6;
                                fu fuVar2 = fuVar;
                                z2c z2cVar2 = z2cVar;
                                String str2 = str;
                                TL_stories.StoryItem storyItem2 = storyItem;
                                b3c b3cVar2 = b3cVar;
                                b3cVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                        b3cVar2.K.remove(z2cVar2);
                                        fuVar2.run();
                                        return;
                                    default:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                        b3cVar2.K.remove(z2cVar2);
                                        fuVar2.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        gm.c3(new ja7(b3cVar, storyItem, str, tL_textWithEntities, arrayList.get(0), z2cVar, fuVar, (byte) 22));
                        return;
                    }
                }
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r6;
                        fu fuVar2 = fuVar;
                        z2c z2cVar2 = z2cVar;
                        String str2 = str;
                        TL_stories.StoryItem storyItem2 = storyItem;
                        b3c b3cVar2 = b3cVar;
                        b3cVar2.getClass();
                        switch (b2) {
                            case 0:
                                storyItem2.translatedLng = str2;
                                storyItem2.translatedText = null;
                                b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                b3cVar2.K.remove(z2cVar2);
                                fuVar2.run();
                                return;
                            default:
                                storyItem2.translatedLng = str2;
                                storyItem2.translatedText = null;
                                b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                b3cVar2.K.remove(z2cVar2);
                                fuVar2.run();
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new lo0((UserInfoActivity) obj6, tL_error, (TLObject) obj5, (TL_account.TL_birthday) obj4, (TLRPC.UserFull) obj3, tLObject, (int[]) obj2, (ArrayList) obj));
                return;
        }
    }

    public ko0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
