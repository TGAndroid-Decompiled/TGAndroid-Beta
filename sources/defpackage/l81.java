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
public final class l81 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public l81(int i, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, l46 l46Var, fx0 fx0Var, wjb wjbVar) {
        this.a = (byte) 0;
        this.b = i;
        this.c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f = l46Var;
        this.g = fx0Var;
        this.h = wjbVar;
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
                l46 l46Var = (l46) obj3;
                fx0 fx0Var = (fx0) obj2;
                wjb wjbVar = (wjb) obj;
                boolean z = tLObject instanceof TLRPC.Updates;
                int i = this.b;
                if (z) {
                    na7.q1(i).R3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new fn0(strArr, frameLayout, l46Var, fx0Var, wjbVar, (byte) 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                hd hdVar = (hd) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i2 = this.b;
                    iArr[0] = ConnectionsManager.getInstance(i2).sendRequest(getpassword, new l81(externalActionActivity, hdVar, i2, authorizationform, getauthorizationform, str, str2, (byte) 2));
                    return;
                }
                gl.c3(new mg3(externalActionActivity, hdVar, tL_error, (byte) 19));
                return;
            case 2:
                String str3 = (String) obj2;
                String str4 = (String) obj;
                ArrayList arrayList2 = ExternalActionActivity.y;
                gl.c3(new ox1((ExternalActionActivity) obj6, (hd) obj5, tLObject, this.b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, str3, str4));
                return;
            default:
                gl.c3(new nx1((ve6) obj6, tLObject, tL_error, (gl8) obj5, this.b, (kl8) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public l81(KeyEvent.Callback callback, Object obj, int i, Object obj2, TLObject tLObject, String str, Object obj3, byte b) {
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
