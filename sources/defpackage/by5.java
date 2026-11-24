package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class by5 implements RequestDelegate {
    public final byte a;
    public final LaunchActivity b;
    public final int c;
    public final kz5 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public by5(LaunchActivity launchActivity, kz5 kz5Var, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = (byte) 0;
        this.b = launchActivity;
        this.d = kz5Var;
        this.c = i;
        this.i = authorizationform;
        this.e = getauthorizationform;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                gl.c3(new nx1(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, (byte) 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.b;
                kz5 kz5Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getpassword, new by5(launchActivity, kz5Var, i, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                gl.c3(new sx5(launchActivity, kz5Var, tL_error, (byte) 1));
                return;
            default:
                String str6 = LaunchActivity.C1;
                gl.c3(new nx1(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, (byte) 1));
                return;
        }
    }

    public by5(LaunchActivity launchActivity, int[] iArr, int i, kz5 kz5Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i;
        this.d = kz5Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
