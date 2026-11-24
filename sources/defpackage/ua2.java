package defpackage;

import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ua2 {
    public final gb2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String d;

    public ua2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        float f;
        int L;
        gb2 gb2Var = this.a;
        ArrayList arrayList = gb2Var.I5;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int P1 = (int) gb2Var.P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = gb2Var.getWidthForButtons();
                if (gb2Var.Q5.O3()) {
                    L = (gb2Var.getMeasuredWidth() - widthForButtons) - gl.L(10.0f);
                } else if (gb2Var.v2()) {
                    L = gb2Var.getCompactLeft();
                } else {
                    int i2 = gb2Var.N6;
                    if (gb2Var.C6) {
                        f = 1.0f;
                    } else {
                        f = 7.0f;
                    }
                    L = i2 + gl.L(f);
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    wo0 wo0Var = (wo0) arrayList.get(i3);
                    int L2 = (wo0Var.d + gb2Var.e7) - gl.L(2.0f);
                    float f2 = x;
                    float f3 = widthForButtons;
                    float f4 = (wo0Var.c * f3) + L;
                    if (f2 >= f4 && f2 <= (wo0Var.e * f3) + f4 && P1 >= L2 && P1 <= wo0Var.f + L2) {
                        gb2Var.N5 = i3;
                        gb2Var.r2();
                        if (wo0Var.s == null) {
                            ff0 Y = bkb.Y(bkb.v0(bkb.dd, gb2Var.cc), 6, 6);
                            wo0Var.s = Y;
                            Y.setCallback(gb2Var);
                            ff0 ff0Var = wo0Var.s;
                            int i4 = ((int) (wo0Var.c * f3)) + L;
                            ff0Var.setBounds(i4, L2, ((int) (wo0Var.e * f3)) + i4, wo0Var.f + L2);
                        }
                        wo0Var.s.setHotspot(f2, P1);
                        wo0Var.s.setState(gb2Var.N2);
                        wo0Var.b(!wo0Var.m);
                        gb2Var.postDelayed(new eg(this, gb2Var.N5, (byte) 26), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (gb2Var.N5 != -1) {
                    gb2Var.playSoundEffect(0);
                    wo0 wo0Var2 = (wo0) arrayList.get(gb2Var.N5);
                    ff0 ff0Var2 = wo0Var2.s;
                    if (ff0Var2 != null) {
                        ff0Var2.setState(StateSet.NOTHING);
                    }
                    wo0Var2.b(false);
                    if (gb2Var.Q5.r1) {
                        Toast.makeText(gb2Var.getContext(), k96.M0(2131748338, null), 1).show();
                    } else {
                        bb2 bb2Var = gb2Var.eb;
                        if (bb2Var != null && !wo0Var2.m) {
                            iq0 iq0Var = wo0Var2.j;
                            if (iq0Var != null) {
                                bb2Var.O1(gb2Var, iq0Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var2.i;
                                if (keyboardInlineButton != null) {
                                    bb2Var.V0(gb2Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    gb2Var.N5 = -1;
                    gb2Var.r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i = gb2Var.N5) != -1) {
                wo0 wo0Var3 = (wo0) arrayList.get(i);
                ff0 ff0Var3 = wo0Var3.s;
                if (ff0Var3 != null) {
                    ff0Var3.setState(StateSet.NOTHING);
                }
                wo0Var3.b(false);
                gb2Var.N5 = -1;
                gb2Var.r2();
            }
        }
        return false;
    }

    public final void b(android.graphics.Canvas r28, java.util.ArrayList r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua2.b(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final void c(defpackage.k27 r32, defpackage.dd r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua2.c(k27, dd, int, boolean):void");
    }
}
