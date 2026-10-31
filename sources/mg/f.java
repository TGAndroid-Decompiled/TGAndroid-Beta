package mg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.bs;
import org.telegram.messenger.d20;
import org.telegram.messenger.ek;
import org.telegram.messenger.qz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.z3;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ep0;
import org.telegram.ui.y11;
public final class f implements View.OnClickListener {
    public final int f13110a;
    public final Object f13111b;
    public final Object f13112c;
    public final Object d;
    public final Object e;
    public final Object f13113f;
    public final Object h;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f13110a = i10;
        this.f13112c = obj;
        this.f13111b = obj2;
        this.e = obj3;
        this.f13113f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f13110a) {
            case 0:
                Calendar calendar = (Calendar) this.f13112c;
                calendar.setTimeInMillis((((ac0) this.f13111b).getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, ((m) this.e).getValue());
                calendar.set(12, ((n) this.f13113f).getValue() * 5);
                ((m0) this.h).K((int) (calendar.getTimeInMillis() / 1000), 0, true);
                ((z2) ((l2.f) this.d).f11587b).f21621x0.run();
                return;
            case 1:
                ac0 ac0Var = (ac0) this.f13111b;
                z3 z3Var = (z3) this.e;
                a4 a4Var = (a4) this.f13113f;
                Calendar calendar2 = (Calendar) this.f13112c;
                ep0 ep0Var = (ep0) this.h;
                l2.f fVar = (l2.f) this.d;
                boolean g10 = s4.g(null, null, 0L, 0L, 0, ac0Var, z3Var, a4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ac0Var.getValue());
                calendar2.set(11, z3Var.getValue());
                calendar2.set(12, a4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) ep0Var.f37097c)[0] = true;
                ((y11) ep0Var.f37096b).e(Integer.valueOf(timeInMillis));
                ((z2) fVar.f11587b).f21621x0.run();
                return;
            case 2:
                ac0 ac0Var2 = (ac0) this.f13111b;
                s3 s3Var = (s3) this.e;
                t3 t3Var = (t3) this.f13113f;
                Calendar calendar3 = (Calendar) this.f13112c;
                q4 q4Var = (q4) this.h;
                l2.f fVar2 = (l2.f) this.d;
                boolean g11 = s4.g(null, null, 0L, 0L, 0, ac0Var2, s3Var, t3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, ac0Var2.getValue());
                calendar3.set(11, s3Var.getValue());
                calendar3.set(12, t3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                q4Var.K((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                ((z2) fVar2.f11587b).f21621x0.run();
                return;
            case 3:
                ac0 ac0Var3 = (ac0) this.f13111b;
                ac0 ac0Var4 = (ac0) this.e;
                ac0 ac0Var5 = (ac0) this.f13113f;
                Calendar calendar4 = (Calendar) this.f13112c;
                s4.b(ac0Var3, ac0Var4, ac0Var5);
                calendar4.set(1, ac0Var5.getValue());
                calendar4.set(2, ac0Var4.getValue());
                calendar4.set(5, ac0Var3.getValue());
                calendar4.set(12, 0);
                calendar4.set(11, 0);
                calendar4.set(13, 0);
                ((bs) this.h).a((int) (calendar4.getTimeInMillis() / 1000));
                ((z2) ((l2.f) this.d).f11587b).f21621x0.run();
                return;
            case 4:
                cx0 cx0Var = (cx0) this.f13112c;
                int[] iArr = (int[]) this.f13111b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f13113f;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i10 = iArr[0];
                if (i10 != 1) {
                    if (i10 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        cx0Var.f25205i2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(cx0Var.f21583a).sendRequest(tL_stickers_suggestShortName, new z(cx0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i10 == 2) {
                        iArr[0] = 3;
                        if (!cx0Var.f25203h2) {
                            org.telegram.messenger.i0.E3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.i0.v1(editTextBoldCursor);
                        qz C = qz.C(cx0Var.f21583a);
                        String str = cx0Var.f25205i2;
                        String str2 = cx0Var.f25201f2;
                        String str3 = cx0Var.R1;
                        ArrayList arrayList = cx0Var.P1;
                        lw0 lw0Var = new lw0(cx0Var);
                        if (C.F.get(str2) != null) {
                            lw0Var.a(null);
                        } else {
                            new Thread(new ek((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) lw0Var, 9)).start();
                        }
                        alertDialog$Builder.f20134a.N0.run();
                        cx0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                z2 z2Var = (z2) this.f13112c;
                ArrayList arrayList2 = (ArrayList) this.e;
                int[] iArr2 = (int[]) this.f13113f;
                r8 r8Var = (r8) this.h;
                g9 g9Var = (g9) this.d;
                z60 F = z60.F(z2Var.f21589c, z2Var.I0, (FrameLayout) this.f13111b);
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    int intValue = ((Integer) arrayList2.get(i11)).intValue();
                    TLRPC.User f7 = d20.i(intValue).f();
                    if (f7 != null) {
                        if (iArr2[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        F.e(intValue, z10, new i2.g1(iArr2, intValue, r8Var, f7, g9Var, 19));
                    }
                    i11 = i12;
                }
                F.f32942t = false;
                F.Y = true;
                F.f32941s = 0;
                F.f32923i = 3;
                F.a0(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                F.Z();
                return;
        }
    }

    public f(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, Calendar calendar, Object obj, l2.f fVar, int i10) {
        this.f13110a = i10;
        this.f13111b = ac0Var;
        this.e = ac0Var2;
        this.f13113f = ac0Var3;
        this.f13112c = calendar;
        this.h = obj;
        this.d = fVar;
    }
}
