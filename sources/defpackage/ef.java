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
public final class ef implements View.OnClickListener {
    public final byte a;
    public final KeyEvent.Callback b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ef(Calendar calendar, hn7 hn7Var, wm0 wm0Var, xm0 xm0Var, sn0 sn0Var, i4d i4dVar) {
        this.a = (byte) 3;
        this.c = calendar;
        this.b = hn7Var;
        this.e = wm0Var;
        this.f = xm0Var;
        this.h = sn0Var;
        this.d = i4dVar;
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
                hn7 hn7Var = (hn7) callback;
                ni niVar = (ni) obj5;
                oi oiVar = (oi) obj4;
                Calendar calendar = (Calendar) obj3;
                kq8 kq8Var = (kq8) obj2;
                i4d i4dVar = (i4d) obj;
                boolean g = ij.g(null, null, 0L, 0L, 0, hn7Var, niVar, oiVar);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, hn7Var.getValue());
                calendar.set(11, niVar.getValue());
                calendar.set(12, oiVar.getValue());
                if (g) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                ((boolean[]) kq8Var.c)[0] = true;
                ((jw9) kq8Var.b).c(Integer.valueOf((int) (calendar.getTimeInMillis() / 1000)));
                ((fx0) i4dVar.a).y0.run();
                return;
            case 1:
                hn7 hn7Var2 = (hn7) callback;
                ei eiVar = (ei) obj5;
                gi giVar = (gi) obj4;
                Calendar calendar2 = (Calendar) obj3;
                gj gjVar = (gj) obj2;
                i4d i4dVar2 = (i4d) obj;
                boolean g2 = ij.g(null, null, 0L, 0L, 0, hn7Var2, eiVar, giVar);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, hn7Var2.getValue());
                calendar2.set(11, eiVar.getValue());
                calendar2.set(12, giVar.getValue());
                if (g2) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                gjVar.s((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((fx0) i4dVar2.a).y0.run();
                return;
            case 2:
                hn7 hn7Var3 = (hn7) callback;
                hn7 hn7Var4 = (hn7) obj5;
                hn7 hn7Var5 = (hn7) obj4;
                Calendar calendar3 = (Calendar) obj3;
                ij.b(hn7Var3, hn7Var4, hn7Var5);
                calendar3.set(1, hn7Var5.getValue());
                calendar3.set(2, hn7Var4.getValue());
                calendar3.set(5, hn7Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((uc7) obj2).a((int) (calendar3.getTimeInMillis() / 1000));
                ((fx0) ((i4d) obj).a).y0.run();
                return;
            case 3:
                Calendar calendar4 = (Calendar) obj3;
                calendar4.setTimeInMillis((((hn7) callback).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wm0) obj5).getValue());
                calendar4.set(12, ((xm0) obj4).getValue() * 5);
                ((sn0) obj2).s((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((fx0) ((i4d) obj).a).y0.run();
                return;
            case 4:
                u0b u0bVar = (u0b) callback;
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
                        u0bVar.l2 = obj6;
                        tL_stickers_suggestShortName.title = obj6;
                        ConnectionsManager.getInstance(u0bVar.a).sendRequest(tL_stickers_suggestShortName, new fn0(u0bVar, editTextBoldCursor, textView, textView2, iArr, (byte) 18));
                        return;
                    } else if (i == 2) {
                        iArr[0] = 3;
                        if (!u0bVar.k2) {
                            gl.A3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        gl.t1(editTextBoldCursor);
                        z3a B = z3a.B(u0bVar.a);
                        String str = u0bVar.l2;
                        String str2 = u0bVar.i2;
                        String str3 = u0bVar.U1;
                        ArrayList arrayList = u0bVar.S1;
                        g0b g0bVar = new g0b(u0bVar);
                        if (B.G.get(str2) != null) {
                            g0bVar.a(null);
                        } else {
                            new Thread(new e57((Object) B, str, (Object) str2, (Object) str3, (Object) arrayList, (Object) g0bVar, (byte) 27)).start();
                        }
                        alertDialog$Builder.a.M0.run();
                        u0bVar.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                fx0 fx0Var = (fx0) callback;
                ArrayList arrayList2 = (ArrayList) obj4;
                int[] iArr2 = (int[]) obj3;
                pb0 pb0Var = (pb0) obj2;
                be0 be0Var = (be0) obj;
                cs5 G = cs5.G(fx0Var.c, fx0Var.J0, (FrameLayout) obj5);
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj7 = arrayList2.get(i2);
                    i2++;
                    int intValue = ((Integer) obj7).intValue();
                    TLRPC.User f = y6c.h(intValue).f();
                    if (f != null) {
                        if (iArr2[0] == intValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                        G.d(intValue, z, new i57(iArr2, intValue, pb0Var, f, be0Var, (byte) 29));
                    }
                }
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.i = (byte) 3;
                G.b0(-gl.L(8.0f), -gl.L(8.0f));
                G.a0();
                return;
        }
    }

    public ef(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = callback;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.h = obj4;
        this.d = obj5;
    }
}
