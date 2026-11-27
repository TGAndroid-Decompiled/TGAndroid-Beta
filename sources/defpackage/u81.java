package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ExternalActionActivity;
public final class u81 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public u81(int i, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, p66 p66Var, nx0 nx0Var, vnb vnbVar) {
        this.a = (byte) 0;
        this.b = i;
        this.c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f = p66Var;
        this.g = nx0Var;
        this.h = vnbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                p66 p66Var = (p66) obj3;
                nx0 nx0Var = (nx0) obj2;
                vnb vnbVar = (vnb) obj;
                boolean z = tLObject instanceof TLRPC.Updates;
                int i = this.b;
                if (z) {
                    uc7.s1(i).Y3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new in0(strArr, frameLayout, p66Var, nx0Var, vnbVar, (byte) 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                id idVar = (id) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i2 = this.b;
                    iArr[0] = ConnectionsManager.getInstance(i2).sendRequest(getpassword, new u81(externalActionActivity, idVar, i2, authorizationform, getauthorizationform, str, str2, (byte) 2));
                    return;
                }
                hl.c3(new cv2(externalActionActivity, idVar, tL_error, (byte) 23));
                return;
            case 2:
                String str3 = (String) obj2;
                String str4 = (String) obj;
                ArrayList arrayList2 = ExternalActionActivity.y;
                hl.c3(new a84((ExternalActionActivity) obj6, (id) obj5, tLObject, this.b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, str3, str4));
                return;
            default:
                hl.c3(new zx1((zg6) obj6, tLObject, tL_error, (to8) obj5, this.b, (wo8) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public u81(KeyEvent.Callback callback, Object obj, int i, Object obj2, TLObject tLObject, String str, Object obj3, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = tLObject;
        this.g = str;
        this.h = obj3;
    }
}
