package gg;

import dg.f3;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.et;
import org.telegram.ui.g9;
import org.telegram.ui.yx0;
public final class l0 implements RequestDelegate {
    public final int f6689a;
    public final int f6690b;
    public final Object f6691c;
    public final Object d;

    public l0(int i10, HashSet hashSet, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f6689a = 4;
        this.f6690b = i10;
        this.f6691c = hashSet;
        this.d = p2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6689a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f6691c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            b6.h hVar = new b6.h();
                            hVar.f1610c = "inapp";
                            hVar.f1609b = str;
                            arrayList2.add(hVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f6690b;
                    if (!isEmpty && p0.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new a0(arrayList, chat, i11, callback, 0));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new z(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
            case 1:
                ((VoIPService) this.f6691c).lambda$startConferenceGroupCall$34(this.f6690b, (String) this.d, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f6691c).lambda$editCallMember$90(this.f6690b, (Runnable) this.d, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.v1((g9) this.f6691c, tLObject, this.f6690b, (TLRPC.User) this.d, 10));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new f3(tLObject, this.f6690b, (HashSet) this.f6691c, tL_error, (org.telegram.ui.ActionBar.p2) this.d, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cg.v1((org.telegram.ui.ActionBar.p2) this.f6691c, tLObject, this.f6690b, (Utilities.Callback) this.d, 17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new cg.v1((h40) this.f6691c, this.f6690b, tLObject, (String) this.d, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.v1((qq0) this.f6691c, this.f6690b, tLObject, (String) this.d, 21));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yx0((ProfileActivity) this.f6691c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.f6690b);
                return;
            default:
                tf.z zVar = (tf.z) this.f6691c;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new et(zVar, this.f6690b, tLObject, (String) this.d, 16));
                return;
        }
    }

    public l0(Object obj, int i10, Object obj2, int i11) {
        this.f6689a = i11;
        this.f6691c = obj;
        this.f6690b = i10;
        this.d = obj2;
    }

    public l0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f6689a = 8;
        this.f6691c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f6690b = i10;
    }
}
