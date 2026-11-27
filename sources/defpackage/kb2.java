package defpackage;

import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_keyboard;
public final class kb2 {
    public final wb2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String d;

    public kb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        float f;
        int L;
        wb2 wb2Var = this.a;
        ArrayList arrayList = wb2Var.I5;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int P1 = (int) wb2Var.P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = wb2Var.getWidthForButtons();
                if (wb2Var.Q5.O3()) {
                    L = (wb2Var.getMeasuredWidth() - widthForButtons) - hl.L(10.0f);
                } else if (wb2Var.v2()) {
                    L = wb2Var.getCompactLeft();
                } else {
                    int i2 = wb2Var.N6;
                    if (wb2Var.C6) {
                        f = 1.0f;
                    } else {
                        f = 7.0f;
                    }
                    L = i2 + hl.L(f);
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    wo0 wo0Var = (wo0) arrayList.get(i3);
                    int L2 = (wo0Var.d + wb2Var.e7) - hl.L(2.0f);
                    float f2 = x;
                    float f3 = widthForButtons;
                    float f4 = (wo0Var.c * f3) + L;
                    if (f2 >= f4 && f2 <= (wo0Var.e * f3) + f4 && P1 >= L2 && P1 <= wo0Var.f + L2) {
                        wb2Var.N5 = i3;
                        wb2Var.r2();
                        if (wo0Var.s == null) {
                            hf0 Y = aob.Y(aob.v0(aob.ed, wb2Var.cc), 6, 6);
                            wo0Var.s = Y;
                            Y.setCallback(wb2Var);
                            hf0 hf0Var = wo0Var.s;
                            int i4 = ((int) (wo0Var.c * f3)) + L;
                            hf0Var.setBounds(i4, L2, ((int) (wo0Var.e * f3)) + i4, wo0Var.f + L2);
                        }
                        wo0Var.s.setHotspot(f2, P1);
                        wo0Var.s.setState(wb2Var.N2);
                        wo0Var.b(!wo0Var.m);
                        wb2Var.postDelayed(new zd(this, wb2Var.N5, (byte) 27), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (wb2Var.N5 != -1) {
                    wb2Var.playSoundEffect(0);
                    wo0 wo0Var2 = (wo0) arrayList.get(wb2Var.N5);
                    hf0 hf0Var2 = wo0Var2.s;
                    if (hf0Var2 != null) {
                        hf0Var2.setState(StateSet.NOTHING);
                    }
                    wo0Var2.b(false);
                    if (wb2Var.Q5.r1) {
                        Toast.makeText(wb2Var.getContext(), ob6.M0(2131748284, null), 1).show();
                    } else {
                        rb2 rb2Var = wb2Var.eb;
                        if (rb2Var != null && !wo0Var2.m) {
                            iq0 iq0Var = wo0Var2.j;
                            if (iq0Var != null) {
                                rb2Var.y1(wb2Var, iq0Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var2.i;
                                if (keyboardInlineButton != null) {
                                    rb2Var.I0(wb2Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    wb2Var.N5 = -1;
                    wb2Var.r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i = wb2Var.N5) != -1) {
                wo0 wo0Var3 = (wo0) arrayList.get(i);
                hf0 hf0Var3 = wo0Var3.s;
                if (hf0Var3 != null) {
                    hf0Var3.setState(StateSet.NOTHING);
                }
                wo0Var3.b(false);
                wb2Var.N5 = -1;
                wb2Var.r2();
            }
        }
        return false;
    }

    public final void b(android.graphics.Canvas r28, java.util.ArrayList r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.b(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final void c(defpackage.r47 r32, defpackage.ed r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.c(r47, ed, int, boolean):void");
    }
}
