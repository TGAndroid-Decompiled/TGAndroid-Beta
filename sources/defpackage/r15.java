package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.Wallet.c;
public final class r15 implements Runnable {
    public final byte a;
    public final Object b;
    public final Serializable c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public r15(mr1 mr1Var, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, b1c b1cVar, m8 m8Var, ArrayList arrayList2) {
        this.a = (byte) 4;
        this.b = mr1Var;
        this.h = zArr;
        this.c = str;
        this.e = linearLayout;
        this.d = arrayList;
        this.n = str2;
        this.r = b1cVar;
        this.s = m8Var;
        this.f = arrayList2;
    }

    @Override
    public final void run() {
        String str;
        boolean z;
        boolean z2;
        String E0;
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.n;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Serializable serializable = this.c;
        Object obj7 = this.h;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                w25 w25Var = (w25) obj8;
                y05 y05Var = (y05) obj7;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj6;
                String str2 = (String) serializable;
                byte[] bArr = (byte[]) obj5;
                JSONArray jSONArray = (JSONArray) obj4;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj3;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj2;
                ae2 ae2Var = (ae2) obj;
                w25Var.getClass();
                try {
                    gl.c3(new e57((Object) w25Var, str2, (Object) bArr, (Object) w25.s(y05Var, tonconnectsession, str2, bArr, jSONArray, tL_urlAuthResultRequest.domain, null, tonconnectchallenge, w25Var.f.getCurrentTime()), (Object) ae2Var, (Object) tonconnectsession, (byte) 11));
                    return;
                } catch (Exception e) {
                    ae2Var.a(null, w25.h("prepare OAuth connect", e));
                    return;
                }
            case 1:
                final w25 w25Var2 = (w25) obj8;
                final String str3 = (String) serializable;
                final byte[] bArr2 = (byte[]) obj5;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj6;
                String str4 = ((t25) obj2).a;
                final ae2 ae2Var2 = (ae2) obj;
                final y05 y05Var2 = (y05) obj7;
                final JSONArray jSONArray2 = (JSONArray) obj4;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) obj3;
                c cVar = w25Var2.b;
                if (TextUtils.equals(str3, cVar.x()) && Arrays.equals(bArr2, cVar.D()) && ((str = tonconnectsession2.client_id) == null || str4.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str4;
                    w25Var2.f.sendRequestTyped(tonconnectregisterkey, new hc((byte) 0), new i8c() {
                        @Override
                        public final void a(Object obj9, Object obj10) {
                            w25 w25Var3 = w25.this;
                            ae2 ae2Var3 = ae2Var2;
                            y05 y05Var3 = y05Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str5 = str3;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj9;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj10;
                            w25Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.e.c(new r15(w25Var3, y05Var3, tonconnectsession3, str5, bArr3, jSONArray3, tL_urlAuthResultRequest3, tonconnectchallenge2, ae2Var3, (byte) 0));
                            } else {
                                ae2Var3.a(null, w25.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                ae2Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
            case 2:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj8;
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                notificationsCustomSettingsActivity.getMessagesController().b4((ArrayList) obj7, true);
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) obj6, true);
                notificationsCustomSettingsActivity.getMessagesController().Y3((ArrayList) serializable);
                int i = notificationsCustomSettingsActivity.s;
                if (i == 1) {
                    notificationsCustomSettingsActivity.x = arrayList;
                } else if (i == 0) {
                    notificationsCustomSettingsActivity.x = arrayList2;
                } else if (i == 3) {
                    notificationsCustomSettingsActivity.x = arrayList3;
                    notificationsCustomSettingsActivity.w = arrayList4;
                } else {
                    notificationsCustomSettingsActivity.x = arrayList5;
                }
                notificationsCustomSettingsActivity.p0(true);
                return;
            case 3:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) obj3;
                fx0 fx0Var = (fx0) obj8;
                fx0[] fx0VarArr = (fx0[]) obj7;
                Context context = (Context) obj6;
                int[] iArr = (int[]) serializable;
                wjb wjbVar = (wjb) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj2;
                jf jfVar = (jf) obj;
                if (!tL_urlAuthResultRequest3.request_wallet) {
                    un7.a = fx0Var;
                    fx0Var.show();
                    return;
                }
                cj7 D = w25.D(context, iArr[0], null, tL_urlAuthResultRequest3, wjbVar, new f25(fx0VarArr, zArr, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest3, fx0Var, jfVar, (byte) 4), new bj7(fx0VarArr, zArr, (byte) 11));
                fx0VarArr[0] = D;
                un7.a = D;
                return;
            default:
                final mr1 mr1Var = (mr1) obj8;
                boolean[] zArr2 = (boolean[]) obj7;
                String str5 = (String) serializable;
                LinearLayout linearLayout = (LinearLayout) obj6;
                ArrayList arrayList6 = (ArrayList) obj5;
                String str6 = (String) obj4;
                final b1c b1cVar = (b1c) obj3;
                final m8 m8Var = (m8) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!zArr2[0]) {
                    if (str5 != null && (E0 = rzb.E0(rzb.J0(str5, null, null))) != null) {
                        a8 a8Var = new a8(2, mr1Var.d, mr1Var.getContext(), false, false);
                        a8Var.setChecked(true);
                        a8Var.setText(E0);
                        linearLayout.addView(a8Var);
                    }
                    int size = arrayList6.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj9 = arrayList6.get(i2);
                        i2++;
                        u0c u0cVar = (u0c) obj9;
                        final String str7 = u0cVar.a;
                        if (!TextUtils.equals(str7, str6)) {
                            a8 a8Var2 = new a8(2, mr1Var.d, mr1Var.getContext(), false, false);
                            if (str5 != null && str5.equals(str7)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            a8Var2.setChecked(z2);
                            a8Var2.setText(u0cVar.b);
                            if (!z2) {
                                a8Var2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        byte b2 = r5;
                                        m8 m8Var2 = m8Var;
                                        String str8 = str7;
                                        b1c b1cVar2 = b1cVar;
                                        mr1 mr1Var2 = mr1Var;
                                        switch (b2) {
                                            case 0:
                                                b1cVar2.I(mr1Var2.b, str8);
                                                m8Var2.d(true);
                                                mr1Var2.b();
                                                return;
                                            default:
                                                b1cVar2.I(mr1Var2.b, str8);
                                                m8Var2.d(true);
                                                mr1Var2.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(a8Var2);
                        }
                    }
                    linearLayout.addView(new j8(mr1Var.getContext(), mr1Var.d), nme.o(-1, 8));
                    int size2 = arrayList7.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj10 = arrayList7.get(i3);
                        i3++;
                        u0c u0cVar2 = (u0c) obj10;
                        final String str8 = u0cVar2.a;
                        if (!TextUtils.equals(str8, str6)) {
                            if (str5 != null && str5.equals(str8)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a8 a8Var3 = new a8(2, mr1Var.d, mr1Var.getContext(), false, false);
                            a8Var3.setChecked(z);
                            a8Var3.setText(u0cVar2.b);
                            if (!z) {
                                a8Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        byte b2 = r5;
                                        m8 m8Var2 = m8Var;
                                        String str82 = str8;
                                        b1c b1cVar2 = b1cVar;
                                        mr1 mr1Var2 = mr1Var;
                                        switch (b2) {
                                            case 0:
                                                b1cVar2.I(mr1Var2.b, str82);
                                                m8Var2.d(true);
                                                mr1Var2.b();
                                                return;
                                            default:
                                                b1cVar2.I(mr1Var2.b, str82);
                                                m8Var2.d(true);
                                                mr1Var2.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(a8Var3);
                        }
                    }
                    zArr2[0] = true;
                    return;
                }
                return;
        }
    }

    public r15(w25 w25Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, t25 t25Var, ae2 ae2Var, y05 y05Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.a = (byte) 1;
        this.b = w25Var;
        this.c = str;
        this.d = bArr;
        this.e = tonconnectsession;
        this.s = t25Var;
        this.f = ae2Var;
        this.h = y05Var;
        this.n = jSONArray;
        this.r = tL_urlAuthResultRequest;
    }

    public r15(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.h = obj2;
        this.e = obj3;
        this.c = serializable;
        this.d = obj4;
        this.n = obj5;
        this.r = obj6;
        this.s = obj7;
        this.f = obj8;
    }

    public r15(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, fx0 fx0Var, fx0[] fx0VarArr, Context context, int[] iArr, wjb wjbVar, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, jf jfVar) {
        this.a = (byte) 3;
        this.r = tL_urlAuthResultRequest;
        this.b = fx0Var;
        this.h = fx0VarArr;
        this.e = context;
        this.c = iArr;
        this.d = wjbVar;
        this.n = zArr;
        this.s = inputtonconnectoauthsessionArr;
        this.f = jfVar;
    }
}
