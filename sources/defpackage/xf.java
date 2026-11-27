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
public final class xf implements View.OnClickListener {
    public final byte a;
    public final KeyEvent.Callback b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public xf(Calendar calendar, hq7 hq7Var, wm0 wm0Var, xm0 xm0Var, sn0 sn0Var, z8d z8dVar) {
        this.a = (byte) 3;
        this.c = calendar;
        this.b = hq7Var;
        this.e = wm0Var;
        this.f = xm0Var;
        this.h = sn0Var;
        this.d = z8dVar;
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
                hq7 hq7Var = (hq7) callback;
                fi fiVar = (fi) obj5;
                hi hiVar = (hi) obj4;
                Calendar calendar = (Calendar) obj3;
                hj hjVar = (hj) obj2;
                z8d z8dVar = (z8d) obj;
                boolean g = jj.g(null, null, 0L, 0L, 0, hq7Var, fiVar, hiVar);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, hq7Var.getValue());
                calendar.set(11, fiVar.getValue());
                calendar.set(12, hiVar.getValue());
                if (g) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                hjVar.y((int) (calendar.getTimeInMillis() / 1000), 0, true);
                ((nx0) z8dVar.b).y0.run();
                return;
            case 1:
                hq7 hq7Var2 = (hq7) callback;
                oi oiVar = (oi) obj5;
                pi piVar = (pi) obj4;
                Calendar calendar2 = (Calendar) obj3;
                yw9 yw9Var = (yw9) obj2;
                z8d z8dVar2 = (z8d) obj;
                boolean g2 = jj.g(null, null, 0L, 0L, 0, hq7Var2, oiVar, piVar);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, hq7Var2.getValue());
                calendar2.set(11, oiVar.getValue());
                calendar2.set(12, piVar.getValue());
                if (g2) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                ((boolean[]) yw9Var.c)[0] = true;
                ((c0a) yw9Var.b).c(Integer.valueOf((int) (calendar2.getTimeInMillis() / 1000)));
                ((nx0) z8dVar2.b).y0.run();
                return;
            case 2:
                hq7 hq7Var3 = (hq7) callback;
                hq7 hq7Var4 = (hq7) obj5;
                hq7 hq7Var5 = (hq7) obj4;
                Calendar calendar3 = (Calendar) obj3;
                jj.b(hq7Var3, hq7Var4, hq7Var5);
                calendar3.set(1, hq7Var5.getValue());
                calendar3.set(2, hq7Var4.getValue());
                calendar3.set(5, hq7Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((ef7) obj2).a((int) (calendar3.getTimeInMillis() / 1000));
                ((nx0) ((z8d) obj).b).y0.run();
                return;
            case 3:
                Calendar calendar4 = (Calendar) obj3;
                calendar4.setTimeInMillis((((hq7) callback).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wm0) obj5).getValue());
                calendar4.set(12, ((xm0) obj4).getValue() * 5);
                ((sn0) obj2).y((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((nx0) ((z8d) obj).b).y0.run();
                return;
            case 4:
                s4b s4bVar = (s4b) callback;
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
                        s4bVar.l2 = obj6;
                        tL_stickers_suggestShortName.title = obj6;
                        ConnectionsManager.getInstance(s4bVar.a).sendRequest(tL_stickers_suggestShortName, new in0(s4bVar, editTextBoldCursor, textView, textView2, iArr, (byte) 18));
                        return;
                    } else if (i == 2) {
                        iArr[0] = 3;
                        if (!s4bVar.k2) {
                            hl.z3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        hl.t1(editTextBoldCursor);
                        r7a B = r7a.B(s4bVar.a);
                        String str = s4bVar.l2;
                        String str2 = s4bVar.i2;
                        String str3 = s4bVar.U1;
                        ArrayList arrayList = s4bVar.S1;
                        e4b e4bVar = new e4b(s4bVar);
                        if (B.G.get(str2) != null) {
                            e4bVar.a(null);
                        } else {
                            new Thread(new z87((Object) B, str, (Object) str2, (Object) str3, (Object) arrayList, (Object) e4bVar, (byte) 27)).start();
                        }
                        alertDialog$Builder.a.M0.run();
                        s4bVar.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                nx0 nx0Var = (nx0) callback;
                ArrayList arrayList2 = (ArrayList) obj4;
                int[] iArr2 = (int[]) obj3;
                rb0 rb0Var = (rb0) obj2;
                de0 de0Var = (de0) obj;
                fu5 G = fu5.G(nx0Var.c, nx0Var.J0, (FrameLayout) obj5);
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj7 = arrayList2.get(i2);
                    i2++;
                    int intValue = ((Integer) obj7).intValue();
                    TLRPC.User f = yac.h(intValue).f();
                    if (f != null) {
                        if (iArr2[0] == intValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                        G.d(intValue, z, new kwc(iArr2, intValue, rb0Var, f, de0Var));
                    }
                }
                G.t = false;
                G.e0 = true;
                G.s = (short) 0;
                G.i = (byte) 3;
                G.b0(-hl.L(8.0f), -hl.L(8.0f));
                G.a0();
                return;
        }
    }

    public xf(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = callback;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.h = obj4;
        this.d = obj5;
    }
}
