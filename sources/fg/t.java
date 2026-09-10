package fg;

import di.o3;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d9;
import org.telegram.ui.ea;
import org.telegram.ui.py0;
public final class t implements RequestDelegate {
    public final int f8211a;
    public final int f8212b;
    public final Object f8213c;
    public final Object d;

    public t(int i10, HashSet hashSet, p2 p2Var) {
        this.f8211a = 4;
        this.f8212b = i10;
        this.d = hashSet;
        this.f8213c = p2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8211a) {
            case 0:
                h0 h0Var = (h0) this.d;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new di.q(h0Var, this.f8212b, tLObject, (String) this.f8213c, 3));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f8212b, (String) this.f8213c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f8212b, (Runnable) this.f8213c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new di.q((d9) this.d, tLObject, this.f8212b, (TLRPC.User) this.f8213c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new o3(tLObject, this.f8212b, (HashSet) this.d, tL_error, (p2) this.f8213c, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new di.q((p2) this.d, tLObject, this.f8212b, (Utilities.Callback) this.f8213c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new di.q((o40) this.d, this.f8212b, tLObject, (String) this.f8213c, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new di.q((xq0) this.d, this.f8212b, tLObject, (String) this.f8213c, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new py0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f8213c, 0), this.f8212b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f8213c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            ?? obj = new Object();
                            obj.f4256b = "inapp";
                            obj.f4255a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f8212b;
                    if (!isEmpty && sg.s.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ea(arrayList, chat, i11, callback, 9));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new sg.n(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public t(Object obj, int i10, Object obj2, int i11) {
        this.f8211a = i11;
        this.d = obj;
        this.f8212b = i10;
        this.f8213c = obj2;
    }

    public t(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f8211a = 8;
        this.d = profileActivity;
        this.f8213c = tL_channels_getParticipants;
        this.f8212b = i10;
    }
}
