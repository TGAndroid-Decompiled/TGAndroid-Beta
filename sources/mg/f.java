package mg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.fk;
import org.telegram.messenger.rz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.z3;
import org.telegram.ui.Components.z60;
import org.telegram.ui.cp0;
import org.telegram.ui.w11;
public final class f implements View.OnClickListener {
    public final int f13111a;
    public final Object f13112b;
    public final Object f13113c;
    public final Object d;
    public final Object e;
    public final Object f13114f;
    public final Object h;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f13111a = i10;
        this.f13113c = obj;
        this.f13112b = obj2;
        this.e = obj3;
        this.f13114f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f13111a) {
            case 0:
                Calendar calendar = (Calendar) this.f13113c;
                calendar.setTimeInMillis((((ac0) this.f13112b).getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, ((m) this.e).getValue());
                calendar.set(12, ((n) this.f13114f).getValue() * 5);
                ((m0) this.h).K((int) (calendar.getTimeInMillis() / 1000), 0, true);
                ((z2) ((l2.f) this.d).f11588b).f21622x0.run();
                return;
            case 1:
                ac0 ac0Var = (ac0) this.f13112b;
                z3 z3Var = (z3) this.e;
                a4 a4Var = (a4) this.f13114f;
                Calendar calendar2 = (Calendar) this.f13113c;
                cp0 cp0Var = (cp0) this.h;
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
                ((boolean[]) cp0Var.f36387c)[0] = true;
                ((w11) cp0Var.f36386b).e(Integer.valueOf(timeInMillis));
                ((z2) fVar.f11588b).f21622x0.run();
                return;
            case 2:
                ac0 ac0Var2 = (ac0) this.f13112b;
                s3 s3Var = (s3) this.e;
                t3 t3Var = (t3) this.f13114f;
                Calendar calendar3 = (Calendar) this.f13113c;
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
                ((z2) fVar2.f11588b).f21622x0.run();
                return;
            case 3:
                ac0 ac0Var3 = (ac0) this.f13112b;
                ac0 ac0Var4 = (ac0) this.e;
                ac0 ac0Var5 = (ac0) this.f13114f;
                Calendar calendar4 = (Calendar) this.f13113c;
                s4.b(ac0Var3, ac0Var4, ac0Var5);
                calendar4.set(1, ac0Var5.getValue());
                calendar4.set(2, ac0Var4.getValue());
                calendar4.set(5, ac0Var3.getValue());
                calendar4.set(12, 0);
                calendar4.set(11, 0);
                calendar4.set(13, 0);
                ((cs) this.h).a((int) (calendar4.getTimeInMillis() / 1000));
                ((z2) ((l2.f) this.d).f11588b).f21622x0.run();
                return;
            case 4:
                dx0 dx0Var = (dx0) this.f13113c;
                int[] iArr = (int[]) this.f13112b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f13114f;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i10 = iArr[0];
                if (i10 != 1) {
                    if (i10 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        dx0Var.f25618i2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(dx0Var.f21584a).sendRequest(tL_stickers_suggestShortName, new z(dx0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i10 == 2) {
                        iArr[0] = 3;
                        if (!dx0Var.f25616h2) {
                            org.telegram.messenger.i0.E3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.i0.v1(editTextBoldCursor);
                        rz C = rz.C(dx0Var.f21584a);
                        String str = dx0Var.f25618i2;
                        String str2 = dx0Var.f25614f2;
                        String str3 = dx0Var.R1;
                        ArrayList arrayList = dx0Var.P1;
                        mw0 mw0Var = new mw0(dx0Var);
                        if (C.F.get(str2) != null) {
                            mw0Var.a(null);
                        } else {
                            new Thread(new fk((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) mw0Var, 9)).start();
                        }
                        alertDialog$Builder.f20135a.N0.run();
                        dx0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                z2 z2Var = (z2) this.f13113c;
                ArrayList arrayList2 = (ArrayList) this.e;
                int[] iArr2 = (int[]) this.f13114f;
                r8 r8Var = (r8) this.h;
                g9 g9Var = (g9) this.d;
                z60 F = z60.F(z2Var.f21590c, z2Var.I0, (FrameLayout) this.f13112b);
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    int intValue = ((Integer) arrayList2.get(i11)).intValue();
                    TLRPC.User f7 = e20.i(intValue).f();
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
                F.f33045t = false;
                F.Y = true;
                F.f33044s = 0;
                F.f33026i = 3;
                F.a0(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                F.Z();
                return;
        }
    }

    public f(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, Calendar calendar, Object obj, l2.f fVar, int i10) {
        this.f13111a = i10;
        this.f13112b = ac0Var;
        this.e = ac0Var2;
        this.f13114f = ac0Var3;
        this.f13113c = calendar;
        this.h = obj;
        this.d = fVar;
    }
}
