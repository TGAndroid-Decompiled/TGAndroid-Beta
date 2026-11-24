package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gg implements View.OnClickListener {
    public final byte a;
    public final KeyEvent.Callback b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public gg(Calendar calendar, lp7 lp7Var, wn0 wn0Var, xn0 xn0Var, so0 so0Var, k6d k6dVar) {
        this.a = (byte) 3;
        this.c = calendar;
        this.b = lp7Var;
        this.e = wn0Var;
        this.f = xn0Var;
        this.h = so0Var;
        this.d = k6dVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                lp7 lp7Var = (lp7) callback;
                nj njVar = (nj) obj5;
                oj ojVar = (oj) obj4;
                Calendar calendar = (Calendar) obj3;
                xr8 xr8Var = (xr8) obj2;
                k6d k6dVar = (k6d) obj;
                boolean g = ik.g(null, null, 0L, 0L, 0, lp7Var, njVar, ojVar);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, lp7Var.getValue());
                calendar.set(11, njVar.getValue());
                calendar.set(12, ojVar.getValue());
                if (g) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                ((boolean[]) xr8Var.c)[0] = true;
                ((ly9) xr8Var.b).c(Integer.valueOf((int) (calendar.getTimeInMillis() / 1000)));
                ((my0) k6dVar.b).y0.run();
                return;
            case 1:
                lp7 lp7Var2 = (lp7) callback;
                ej ejVar = (ej) obj5;
                gj gjVar = (gj) obj4;
                Calendar calendar2 = (Calendar) obj3;
                gk gkVar = (gk) obj2;
                k6d k6dVar2 = (k6d) obj;
                boolean g2 = ik.g(null, null, 0L, 0L, 0, lp7Var2, ejVar, gjVar);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, lp7Var2.getValue());
                calendar2.set(11, ejVar.getValue());
                calendar2.set(12, gjVar.getValue());
                if (g2) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                gkVar.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((my0) k6dVar2.b).y0.run();
                return;
            case 2:
                lp7 lp7Var3 = (lp7) callback;
                lp7 lp7Var4 = (lp7) obj5;
                lp7 lp7Var5 = (lp7) obj4;
                Calendar calendar3 = (Calendar) obj3;
                ik.b(lp7Var3, lp7Var4, lp7Var5);
                calendar3.set(1, lp7Var5.getValue());
                calendar3.set(2, lp7Var4.getValue());
                calendar3.set(5, lp7Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((we7) obj2).a((int) (calendar3.getTimeInMillis() / 1000));
                ((my0) ((k6d) obj).b).y0.run();
                return;
            case 3:
                Calendar calendar4 = (Calendar) obj3;
                calendar4.setTimeInMillis((((lp7) callback).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wn0) obj5).getValue());
                calendar4.set(12, ((xn0) obj4).getValue() * 5);
                ((so0) obj2).y((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((my0) ((k6d) obj).b).y0.run();
                return;
            case 4:
                x2b x2bVar = (x2b) callback;
                int[] iArr = (int[]) obj5;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                int i = iArr[0];
                if (i != 1) {
                    if (i == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj6 = editTextBoldCursor.getText().toString();
                        x2bVar.l2 = obj6;
                        tL_stickers_suggestShortName.title = obj6;
                        ConnectionsManager.getInstance(x2bVar.a).sendRequest(tL_stickers_suggestShortName, new fo0(x2bVar, editTextBoldCursor, textView, textView2, iArr, (byte) 18));
                        return;
                    } else if (i == 2) {
                        iArr[0] = 3;
                        if (!x2bVar.k2) {
                            gm.z3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        gm.t1(editTextBoldCursor);
                        a6a B = a6a.B(x2bVar.a);
                        String str = x2bVar.l2;
                        String str2 = x2bVar.i2;
                        String str3 = x2bVar.U1;
                        ArrayList arrayList = x2bVar.S1;
                        h2b h2bVar = new h2b(x2bVar);
                        if (B.G.get(str2) != null) {
                            h2bVar.a(null);
                        } else {
                            new Thread(new e77((Object) B, str, (Object) str2, (Object) str3, (Object) arrayList, (Object) h2bVar, (byte) 27)).start();
                        }
                        alertDialog$Builder.a.M0.run();
                        x2bVar.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                my0 my0Var = (my0) callback;
                ArrayList arrayList2 = (ArrayList) obj4;
                int[] iArr2 = (int[]) obj3;
                pc0 pc0Var = (pc0) obj2;
                bf0 bf0Var = (bf0) obj;
                bu5 G = bu5.G(my0Var.c, my0Var.J0, (FrameLayout) obj5);
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj7 = arrayList2.get(i2);
                    i2++;
                    int intValue = ((Integer) obj7).intValue();
                    TLRPC.User f = z8c.h(intValue).f();
                    if (f != null) {
                        if (iArr2[0] == intValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                        G.d(intValue, z, new xtc(iArr2, intValue, pc0Var, f, bf0Var));
                    }
                }
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.i = (byte) 3;
                G.b0(-gm.L(8.0f), -gm.L(8.0f));
                G.a0();
                return;
        }
    }

    public gg(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = callback;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.h = obj4;
        this.d = obj5;
    }
}
