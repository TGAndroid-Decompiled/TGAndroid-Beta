package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class br1 extends p79 {
    public final byte a;

    public br1(byte b) {
        this.a = b;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        wb2 wb2Var;
        m47 currentMessagesGroup;
        float[] fArr;
        wb2 wb2Var2;
        m47 currentMessagesGroup2;
        float[] fArr2;
        wb2 wb2Var3;
        m47 currentMessagesGroup3;
        float[] fArr3;
        wb2 wb2Var4;
        m47 currentMessagesGroup4;
        float[] fArr4;
        int L;
        int L2;
        int L3;
        int i = 0;
        switch (this.a) {
            case 0:
                rect.bottom = 0;
                if ((view instanceof wb2) && (currentMessagesGroup = (wb2Var = (wb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    j47 currentPosition = wb2Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.m != null) {
                        Point point = hl.q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = wb2Var.getExtraInsetHeight();
                        int i2 = 0;
                        while (true) {
                            if (i2 < currentPosition.m.length) {
                                extraInsetHeight += (int) Math.ceil(fArr[i2] * max);
                                i2++;
                            } else {
                                int round = (Math.round(hl.p * 7.0f) * (currentPosition.d - currentPosition.c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i < size) {
                                        j47 j47Var = (j47) arrayList.get(i);
                                        byte b = j47Var.c;
                                        byte b2 = currentPosition.c;
                                        if (b == b2 && ((j47Var.a != currentPosition.a || j47Var.b != currentPosition.b || b != b2 || j47Var.d != currentPosition.d) && b == b2)) {
                                            round = uh9.f(4.0f, (int) Math.ceil(max * j47Var.f), round);
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
                int T = RecyclerView.T(view);
                rect.setEmpty();
                if (T == 1) {
                    rect.left = hl.L(31.0f) + (-hl.L(85.0f));
                    return;
                } else if (T == 2) {
                    rect.left = hl.L(31.0f) + (-hl.L(85.0f));
                    return;
                } else {
                    return;
                }
            case 2:
                rect.right = hl.L(2.0f);
                return;
            case 3:
                rect.right = hl.L(2.0f);
                return;
            case 4:
                super.d(rect, view, recyclerView, c89Var);
                int S = RecyclerView.S(view);
                rect.left = hl.L(8.0f);
                if (S == c89Var.b() - 1) {
                    rect.right = hl.L(10.0f);
                }
                if (S == 0) {
                    rect.left = hl.L(10.0f);
                    return;
                }
                return;
            case 5:
                int L4 = hl.L(4.0f);
                rect.top = 0;
                rect.bottom = L4;
                rect.right = L4;
                rect.left = L4;
                if (RecyclerView.S(view) % 3 != 2) {
                    rect.right = 0;
                    return;
                }
                return;
            case 6:
                int L5 = hl.L(5.0f);
                rect.right = L5;
                rect.bottom = L5;
                return;
            case 7:
                rect.top = hl.L(6.0f);
                return;
            case 8:
                rect.bottom = 0;
                if ((view instanceof wb2) && (currentMessagesGroup2 = (wb2Var2 = (wb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    j47 currentPosition2 = wb2Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.m != null) {
                        Point point2 = hl.q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = wb2Var2.getExtraInsetHeight();
                        int i3 = 0;
                        while (true) {
                            if (i3 < currentPosition2.m.length) {
                                extraInsetHeight2 += (int) Math.ceil(fArr2[i3] * max2);
                                i3++;
                            } else {
                                int round2 = (Math.round(hl.p * 7.0f) * (currentPosition2.d - currentPosition2.c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i < size2) {
                                        j47 j47Var2 = (j47) arrayList2.get(i);
                                        byte b3 = j47Var2.c;
                                        byte b4 = currentPosition2.c;
                                        if (b3 == b4 && ((j47Var2.a != currentPosition2.a || j47Var2.b != currentPosition2.b || b3 != b4 || j47Var2.d != currentPosition2.d) && b3 == b4)) {
                                            round2 = uh9.f(4.0f, (int) Math.ceil(max2 * j47Var2.f), round2);
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
                if ((view instanceof wb2) && (currentMessagesGroup3 = (wb2Var3 = (wb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    j47 currentPosition3 = wb2Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.m != null) {
                        Point point3 = hl.q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = wb2Var3.getExtraInsetHeight();
                        int i4 = 0;
                        while (true) {
                            if (i4 < currentPosition3.m.length) {
                                extraInsetHeight3 += (int) Math.ceil(fArr3[i4] * max3);
                                i4++;
                            } else {
                                int round3 = (Math.round(hl.p * 7.0f) * (currentPosition3.d - currentPosition3.c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i < size3) {
                                        j47 j47Var3 = (j47) arrayList3.get(i);
                                        byte b5 = j47Var3.c;
                                        byte b6 = currentPosition3.c;
                                        if (b5 == b6 && ((j47Var3.a != currentPosition3.a || j47Var3.b != currentPosition3.b || b5 != b6 || j47Var3.d != currentPosition3.d) && b5 == b6)) {
                                            round3 = uh9.f(4.0f, (int) Math.ceil(max3 * j47Var3.f), round3);
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
                if ((view instanceof wb2) && (currentMessagesGroup4 = (wb2Var4 = (wb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    j47 currentPosition4 = wb2Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.m != null) {
                        Point point4 = hl.q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = wb2Var4.getExtraInsetHeight();
                        int i5 = 0;
                        while (true) {
                            if (i5 < currentPosition4.m.length) {
                                extraInsetHeight4 += (int) Math.ceil(fArr4[i5] * max4);
                                i5++;
                            } else {
                                int round4 = (Math.round(hl.p * 7.0f) * (currentPosition4.d - currentPosition4.c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i < size4) {
                                        j47 j47Var4 = (j47) arrayList4.get(i);
                                        byte b7 = j47Var4.c;
                                        byte b8 = currentPosition4.c;
                                        if (b7 == b8 && ((j47Var4.a != currentPosition4.a || j47Var4.b != currentPosition4.b || b7 != b8 || j47Var4.d != currentPosition4.d) && b7 == b8)) {
                                            round4 = uh9.f(4.0f, (int) Math.ceil(max4 * j47Var4.f), round4);
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
                n69 n69Var = (n69) recyclerView.U(view);
                if (n69Var != null) {
                    int b9 = n69Var.b() % 4;
                    if (b9 == 0) {
                        L = 0;
                    } else {
                        L = hl.L(4.0f);
                    }
                    rect.left = L;
                    if (b9 != 3) {
                        i = hl.L(4.0f);
                    }
                    rect.right = i;
                    return;
                }
                rect.left = hl.L(4.0f);
                rect.right = hl.L(4.0f);
                return;
            case 12:
                n69 n69Var2 = (n69) recyclerView.U(view);
                if (n69Var2 != null) {
                    int b10 = n69Var2.b() % 4;
                    if (b10 == 0) {
                        L2 = 0;
                    } else {
                        L2 = hl.L(4.0f);
                    }
                    rect.left = L2;
                    if (b10 != 3) {
                        i = hl.L(4.0f);
                    }
                    rect.right = i;
                    return;
                }
                rect.left = hl.L(4.0f);
                rect.right = hl.L(4.0f);
                return;
            case 13:
                n69 n69Var3 = (n69) recyclerView.U(view);
                if (n69Var3 != null) {
                    if (n69Var3.f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b11 = n69Var3.b() % 4;
                    if (b11 == 0) {
                        L3 = 0;
                    } else {
                        L3 = hl.L(4.0f);
                    }
                    rect.left = L3;
                    if (b11 != 3) {
                        i = hl.L(4.0f);
                    }
                    rect.right = i;
                    return;
                }
                rect.left = hl.L(4.0f);
                rect.right = hl.L(4.0f);
                return;
            case 14:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            case 15:
                int S2 = RecyclerView.S(view);
                rect.left = hl.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (S2 == c89Var.b() - 1) {
                    rect.right = hl.L(12.0f);
                    return;
                }
                return;
            default:
                super.d(rect, view, recyclerView, c89Var);
                rect.top = 1;
                return;
        }
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
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
                    if (RecyclerView.S(childAt) >= 0 && !(childAt instanceof p55) && !(view instanceof p55)) {
                        int bottom = childAt.getBottom();
                        if (ob6.a0) {
                            L = 0.0f;
                        } else {
                            L = hl.L(72.0f);
                        }
                        float f = L;
                        float f2 = bottom;
                        if (ob6.a0) {
                            i = hl.L(72.0f);
                        } else {
                            i = 0;
                        }
                        canvas2 = canvas;
                        canvas2.drawLine(f, f2, width - i, f2, aob.j0);
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
