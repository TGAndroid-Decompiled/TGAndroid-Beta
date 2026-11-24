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
public final class kn0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public kn0(kl8 kl8Var, fi0 fi0Var, i8c i8cVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, byte b) {
        this.a = b;
        this.e = kl8Var;
        this.c = fi0Var;
        this.f = i8cVar;
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
                gl.c3(new ln0(tL_error, (tn0) obj6, tLObject, (List) obj5, (fi0) obj4, (tn0) obj3, (d) obj2, (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj, (byte) 0));
                return;
            case 1:
                gl.c3(new ln0(tL_error, (p8c) obj6, tLObject, (List) obj5, (fi0) obj4, (p8c) obj3, (d) obj2, (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj, (byte) 1));
                return;
            case 2:
                na7 na7Var = (na7) obj6;
                Activity activity = (Activity) obj5;
                hd hdVar = (hd) obj4;
                sc7 sc7Var = (sc7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                na7Var.getClass();
                if (tL_error == null) {
                    if (activity != null) {
                        gl.c3(new x87(activity, hdVar, (byte) 0));
                    }
                    na7Var.R3((TLRPC.Updates) tLObject, false);
                    gl.c3(new kf(sc7Var, (byte) 2));
                    return;
                }
                gl.c3(new i87(na7Var, sc7Var, activity, hdVar, tL_error, dVar, tL_channels_convertToGigagroup, (byte) 1));
                return;
            case 3:
                gl.c3(new ln0(tLObject, (kl8) obj6, (fi0) obj4, (i8c) ((ae2) obj3), (Activity) obj2, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) obj), (List) obj5, tL_error, (byte) 8));
                return;
            case 4:
                gl.c3(new ln0(tLObject, (kl8) obj6, (fi0) obj4, (i8c) ((et4) obj3), (Activity) obj2, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) obj), (List) obj5, tL_error, (byte) 9));
                return;
            case 5:
                final b1c b1cVar = (b1c) obj6;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                final String str = (String) obj4;
                final z0c z0cVar = (z0c) obj3;
                final et etVar = (et) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b1cVar.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r6;
                                et etVar2 = etVar;
                                z0c z0cVar2 = z0cVar;
                                String str2 = str;
                                TL_stories.StoryItem storyItem2 = storyItem;
                                b1c b1cVar2 = b1cVar;
                                b1cVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                        b1cVar2.K.remove(z0cVar2);
                                        etVar2.run();
                                        return;
                                    default:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                        b1cVar2.K.remove(z0cVar2);
                                        etVar2.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        gl.c3(new i87(b1cVar, storyItem, str, tL_textWithEntities, arrayList.get(0), z0cVar, etVar, (byte) 22));
                        return;
                    }
                }
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r6;
                        et etVar2 = etVar;
                        z0c z0cVar2 = z0cVar;
                        String str2 = str;
                        TL_stories.StoryItem storyItem2 = storyItem;
                        b1c b1cVar2 = b1cVar;
                        b1cVar2.getClass();
                        switch (b2) {
                            case 0:
                                storyItem2.translatedLng = str2;
                                storyItem2.translatedText = null;
                                b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                b1cVar2.K.remove(z0cVar2);
                                etVar2.run();
                                return;
                            default:
                                storyItem2.translatedLng = str2;
                                storyItem2.translatedText = null;
                                b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                b1cVar2.K.remove(z0cVar2);
                                etVar2.run();
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new ln0((UserInfoActivity) obj6, tL_error, (TLObject) obj5, (TL_account.TL_birthday) obj4, (TLRPC.UserFull) obj3, tLObject, (int[]) obj2, (ArrayList) obj));
                return;
        }
    }

    public kn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
