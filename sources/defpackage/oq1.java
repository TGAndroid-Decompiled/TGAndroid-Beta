package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class oq1 extends c49 {
    public final byte a;

    public oq1(byte b) {
        this.a = b;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        gb2 gb2Var;
        f27 currentMessagesGroup;
        float[] fArr;
        gb2 gb2Var2;
        f27 currentMessagesGroup2;
        float[] fArr2;
        gb2 gb2Var3;
        f27 currentMessagesGroup3;
        float[] fArr3;
        gb2 gb2Var4;
        f27 currentMessagesGroup4;
        float[] fArr4;
        int L;
        int L2;
        int L3;
        int i = 0;
        switch (this.a) {
            case 0:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup = (gb2Var = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    c27 currentPosition = gb2Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.m != null) {
                        Point point = gl.q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = gb2Var.getExtraInsetHeight();
                        int i2 = 0;
                        while (true) {
                            if (i2 < currentPosition.m.length) {
                                extraInsetHeight += (int) Math.ceil(fArr[i2] * max);
                                i2++;
                            } else {
                                int round = (Math.round(gl.p * 7.0f) * (currentPosition.d - currentPosition.c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i < size) {
                                        c27 c27Var = (c27) arrayList.get(i);
                                        byte b = c27Var.c;
                                        byte b2 = currentPosition.c;
                                        if (b == b2 && ((c27Var.a != currentPosition.a || c27Var.b != currentPosition.b || b != b2 || c27Var.d != currentPosition.d) && b == b2)) {
                                            round = de9.f(4.0f, (int) Math.ceil(max * c27Var.f), round);
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                rect.bottom = -round;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1:
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S == 1) {
                    rect.left = gl.L(31.0f) + (-gl.L(85.0f));
                    return;
                } else if (S == 2) {
                    rect.left = gl.L(31.0f) + (-gl.L(85.0f));
                    return;
                } else {
                    return;
                }
            case 2:
                rect.right = gl.L(2.0f);
                return;
            case 3:
                rect.right = gl.L(2.0f);
                return;
            case 4:
                super.e(rect, view, recyclerView, p49Var);
                int R = RecyclerView.R(view);
                rect.left = gl.L(8.0f);
                if (R == p49Var.b() - 1) {
                    rect.right = gl.L(10.0f);
                }
                if (R == 0) {
                    rect.left = gl.L(10.0f);
                    return;
                }
                return;
            case 5:
                int L4 = gl.L(4.0f);
                rect.top = 0;
                rect.bottom = L4;
                rect.right = L4;
                rect.left = L4;
                if (RecyclerView.R(view) % 3 != 2) {
                    rect.right = 0;
                    return;
                }
                return;
            case 6:
                int L5 = gl.L(5.0f);
                rect.right = L5;
                rect.bottom = L5;
                return;
            case 7:
                rect.top = gl.L(6.0f);
                return;
            case 8:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup2 = (gb2Var2 = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    c27 currentPosition2 = gb2Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.m != null) {
                        Point point2 = gl.q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = gb2Var2.getExtraInsetHeight();
                        int i3 = 0;
                        while (true) {
                            if (i3 < currentPosition2.m.length) {
                                extraInsetHeight2 += (int) Math.ceil(fArr2[i3] * max2);
                                i3++;
                            } else {
                                int round2 = (Math.round(gl.p * 7.0f) * (currentPosition2.d - currentPosition2.c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i < size2) {
                                        c27 c27Var2 = (c27) arrayList2.get(i);
                                        byte b3 = c27Var2.c;
                                        byte b4 = currentPosition2.c;
                                        if (b3 == b4 && ((c27Var2.a != currentPosition2.a || c27Var2.b != currentPosition2.b || b3 != b4 || c27Var2.d != currentPosition2.d) && b3 == b4)) {
                                            round2 = de9.f(4.0f, (int) Math.ceil(max2 * c27Var2.f), round2);
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                rect.bottom = -round2;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 9:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup3 = (gb2Var3 = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    c27 currentPosition3 = gb2Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.m != null) {
                        Point point3 = gl.q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = gb2Var3.getExtraInsetHeight();
                        int i4 = 0;
                        while (true) {
                            if (i4 < currentPosition3.m.length) {
                                extraInsetHeight3 += (int) Math.ceil(fArr3[i4] * max3);
                                i4++;
                            } else {
                                int round3 = (Math.round(gl.p * 7.0f) * (currentPosition3.d - currentPosition3.c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i < size3) {
                                        c27 c27Var3 = (c27) arrayList3.get(i);
                                        byte b5 = c27Var3.c;
                                        byte b6 = currentPosition3.c;
                                        if (b5 == b6 && ((c27Var3.a != currentPosition3.a || c27Var3.b != currentPosition3.b || b5 != b6 || c27Var3.d != currentPosition3.d) && b5 == b6)) {
                                            round3 = de9.f(4.0f, (int) Math.ceil(max3 * c27Var3.f), round3);
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                rect.bottom = -round3;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 10:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup4 = (gb2Var4 = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    c27 currentPosition4 = gb2Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.m != null) {
                        Point point4 = gl.q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = gb2Var4.getExtraInsetHeight();
                        int i5 = 0;
                        while (true) {
                            if (i5 < currentPosition4.m.length) {
                                extraInsetHeight4 += (int) Math.ceil(fArr4[i5] * max4);
                                i5++;
                            } else {
                                int round4 = (Math.round(gl.p * 7.0f) * (currentPosition4.d - currentPosition4.c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i < size4) {
                                        c27 c27Var4 = (c27) arrayList4.get(i);
                                        byte b7 = c27Var4.c;
                                        byte b8 = currentPosition4.c;
                                        if (b7 == b8 && ((c27Var4.a != currentPosition4.a || c27Var4.b != currentPosition4.b || b7 != b8 || c27Var4.d != currentPosition4.d) && b7 == b8)) {
                                            round4 = de9.f(4.0f, (int) Math.ceil(max4 * c27Var4.f), round4);
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                rect.bottom = -round4;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 11:
                y29 y29Var = (y29) recyclerView.T(view);
                if (y29Var != null) {
                    int b9 = y29Var.b() % 4;
                    if (b9 == 0) {
                        L = 0;
                    } else {
                        L = gl.L(4.0f);
                    }
                    rect.left = L;
                    if (b9 != 3) {
                        i = gl.L(4.0f);
                    }
                    rect.right = i;
                    return;
                }
                rect.left = gl.L(4.0f);
                rect.right = gl.L(4.0f);
                return;
            case 12:
                y29 y29Var2 = (y29) recyclerView.T(view);
                if (y29Var2 != null) {
                    int b10 = y29Var2.b() % 4;
                    if (b10 == 0) {
                        L2 = 0;
                    } else {
                        L2 = gl.L(4.0f);
                    }
                    rect.left = L2;
                    if (b10 != 3) {
                        i = gl.L(4.0f);
                    }
                    rect.right = i;
                    return;
                }
                rect.left = gl.L(4.0f);
                rect.right = gl.L(4.0f);
                return;
            case 13:
                y29 y29Var3 = (y29) recyclerView.T(view);
                if (y29Var3 != null) {
                    if (y29Var3.f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b11 = y29Var3.b() % 4;
                    if (b11 == 0) {
                        L3 = 0;
                    } else {
                        L3 = gl.L(4.0f);
                    }
                    rect.left = L3;
                    if (b11 != 3) {
                        i = gl.L(4.0f);
                    }
                    rect.right = i;
                    return;
                }
                rect.left = gl.L(4.0f);
                rect.right = gl.L(4.0f);
                return;
            case 14:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            case 15:
                int R2 = RecyclerView.R(view);
                rect.left = gl.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == p49Var.b() - 1) {
                    rect.right = gl.L(12.0f);
                    return;
                }
                return;
            default:
                super.e(rect, view, recyclerView, p49Var);
                rect.top = 1;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        View view;
        Canvas canvas2;
        float L;
        int i;
        switch (this.a) {
            case 16:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i2 = childCount - 1;
                int i3 = 0;
                while (i3 < i2) {
                    View childAt = recyclerView.getChildAt(i3);
                    if (i3 < childCount - 2) {
                        view = recyclerView.getChildAt(i3 + 1);
                    } else {
                        view = null;
                    }
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof l35) && !(view instanceof l35)) {
                        int bottom = childAt.getBottom();
                        if (k96.a0) {
                            L = 0.0f;
                        } else {
                            L = gl.L(72.0f);
                        }
                        float f = L;
                        float f2 = bottom;
                        if (k96.a0) {
                            i = gl.L(72.0f);
                        } else {
                            i = 0;
                        }
                        canvas2 = canvas;
                        canvas2.drawLine(f, f2, width - i, f2, bkb.j0);
                    } else {
                        canvas2 = canvas;
                    }
                    i3++;
                    canvas = canvas2;
                }
                return;
            default:
                return;
        }
    }
}
