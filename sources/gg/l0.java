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
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ct;
import org.telegram.ui.e9;
import org.telegram.ui.rx0;
public final class l0 implements RequestDelegate {
    public final int f6702a;
    public final int f6703b;
    public final Object f6704c;
    public final Object d;

    public l0(int i10, HashSet hashSet, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f6702a = 4;
        this.f6703b = i10;
        this.f6704c = hashSet;
        this.d = p2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6702a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f6704c;
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
                            hVar.f1599c = "inapp";
                            hVar.f1598b = str;
                            arrayList2.add(hVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f6703b;
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
                ((VoIPService) this.f6704c).lambda$startConferenceGroupCall$34(this.f6703b, (String) this.d, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f6704c).lambda$editCallMember$90(this.f6703b, (Runnable) this.d, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.v1((e9) this.f6704c, tLObject, this.f6703b, (TLRPC.User) this.d, 10));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new f3(tLObject, this.f6703b, (HashSet) this.f6704c, tL_error, (org.telegram.ui.ActionBar.p2) this.d, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cg.v1((org.telegram.ui.ActionBar.p2) this.f6704c, tLObject, this.f6703b, (Utilities.Callback) this.d, 17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new cg.v1((g40) this.f6704c, this.f6703b, tLObject, (String) this.d, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.v1((qq0) this.f6704c, this.f6703b, tLObject, (String) this.d, 21));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new rx0((ProfileActivity) this.f6704c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.f6703b);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new f3((org.telegram.ui.web.a1) this.f6704c, tLObject, this.f6703b, (org.telegram.ui.web.w0) this.d, tL_error, 25));
                return;
            default:
                tf.z zVar = (tf.z) this.f6704c;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new ct(zVar, this.f6703b, tLObject, (String) this.d, 15));
                return;
        }
    }

    public l0(Object obj, int i10, Object obj2, int i11) {
        this.f6702a = i11;
        this.f6704c = obj;
        this.f6703b = i10;
        this.d = obj2;
    }

    public l0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f6702a = 8;
        this.f6704c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f6703b = i10;
    }
}
