package di;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.xi0;
public final class k extends v4.m0 {
    public final int f9277a;

    public k(int i7) {
        this.f9277a = i7;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        org.telegram.ui.Cells.q1 q1Var;
        dj currentMessagesGroup;
        float[] fArr;
        org.telegram.ui.Cells.q1 q1Var2;
        dj currentMessagesGroup2;
        float[] fArr2;
        int L;
        int L2;
        int L3;
        org.telegram.ui.Cells.q1 q1Var3;
        dj currentMessagesGroup3;
        float[] fArr3;
        org.telegram.ui.Cells.q1 q1Var4;
        dj currentMessagesGroup4;
        float[] fArr4;
        switch (this.f9277a) {
            case 0:
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S == 1) {
                    rect.left = org.telegram.messenger.g0.L(31.0f) + (-org.telegram.messenger.g0.L(85.0f));
                    return;
                } else if (S == 2) {
                    rect.left = org.telegram.messenger.g0.L(31.0f) + (-org.telegram.messenger.g0.L(85.0f));
                    return;
                } else {
                    return;
                }
            case 1:
                int L4 = org.telegram.messenger.g0.L(4.0f);
                rect.top = 0;
                rect.bottom = L4;
                rect.right = L4;
                rect.left = L4;
                if (RecyclerView.R(view) % 3 != 2) {
                    rect.right = 0;
                    return;
                }
                return;
            case 2:
                int L5 = org.telegram.messenger.g0.L(5.0f);
                rect.right = L5;
                rect.bottom = L5;
                return;
            case 3:
                super.e(rect, view, recyclerView, a1Var);
                int R = RecyclerView.R(view);
                rect.left = org.telegram.messenger.g0.L(8.0f);
                if (R == a1Var.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(10.0f);
                }
                if (R == 0) {
                    rect.left = org.telegram.messenger.g0.L(10.0f);
                    return;
                }
                return;
            case 4:
                rect.top = org.telegram.messenger.g0.L(6.0f);
                return;
            case 5:
                int i7 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = (q1Var = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.f22005e;
                    aj currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.f21452m != null) {
                        Point point = org.telegram.messenger.g0.f22537q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = q1Var.getExtraInsetHeight();
                        int i10 = 0;
                        while (true) {
                            if (i10 < currentPosition.f21452m.length) {
                                extraInsetHeight += (int) Math.ceil(fArr[i10] * max);
                                i10++;
                            } else {
                                int round = (Math.round(org.telegram.messenger.g0.f22536p * 7.0f) * (currentPosition.d - currentPosition.f21444c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i7 < size) {
                                        aj ajVar = (aj) arrayList.get(i7);
                                        byte b10 = ajVar.f21444c;
                                        byte b11 = currentPosition.f21444c;
                                        if (b10 == b11 && ((ajVar.f21442a != currentPosition.f21442a || ajVar.f21443b != currentPosition.f21443b || b10 != b11 || ajVar.d != currentPosition.d) && b10 == b11)) {
                                            round = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * ajVar.f21446f), round);
                                        } else {
                                            i7++;
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
            case 6:
                rect.right = org.telegram.messenger.g0.L(2.0f);
                return;
            case 7:
                rect.right = org.telegram.messenger.g0.L(2.0f);
                return;
            case 8:
                int i11 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup2 = (q1Var2 = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.f22005e;
                    aj currentPosition2 = q1Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.f21452m != null) {
                        Point point2 = org.telegram.messenger.g0.f22537q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = q1Var2.getExtraInsetHeight();
                        int i12 = 0;
                        while (true) {
                            if (i12 < currentPosition2.f21452m.length) {
                                extraInsetHeight2 += (int) Math.ceil(fArr2[i12] * max2);
                                i12++;
                            } else {
                                int round2 = (Math.round(org.telegram.messenger.g0.f22536p * 7.0f) * (currentPosition2.d - currentPosition2.f21444c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i11 < size2) {
                                        aj ajVar2 = (aj) arrayList2.get(i11);
                                        byte b12 = ajVar2.f21444c;
                                        byte b13 = currentPosition2.f21444c;
                                        if (b12 == b13 && ((ajVar2.f21442a != currentPosition2.f21442a || ajVar2.f21443b != currentPosition2.f21443b || b12 != b13 || ajVar2.d != currentPosition2.d) && b12 == b13)) {
                                            round2 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max2 * ajVar2.f21446f), round2);
                                        } else {
                                            i11++;
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
                xi0 xi0Var = (xi0) recyclerView.T(view);
                if (xi0Var != null) {
                    int b14 = xi0Var.b() % 4;
                    int i13 = 0;
                    if (b14 == 0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.left = L;
                    if (b14 != 3) {
                        i13 = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.right = i13;
                    return;
                }
                rect.left = org.telegram.messenger.g0.L(4.0f);
                rect.right = org.telegram.messenger.g0.L(4.0f);
                return;
            case 10:
                xi0 xi0Var2 = (xi0) recyclerView.T(view);
                if (xi0Var2 != null) {
                    int b15 = xi0Var2.b() % 4;
                    int i14 = 0;
                    if (b15 == 0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.left = L2;
                    if (b15 != 3) {
                        i14 = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.right = i14;
                    return;
                }
                rect.left = org.telegram.messenger.g0.L(4.0f);
                rect.right = org.telegram.messenger.g0.L(4.0f);
                return;
            case 11:
                xi0 xi0Var3 = (xi0) recyclerView.T(view);
                if (xi0Var3 != null) {
                    int i15 = 0;
                    if (xi0Var3.f56931f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b16 = xi0Var3.b() % 4;
                    if (b16 == 0) {
                        L3 = 0;
                    } else {
                        L3 = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.left = L3;
                    if (b16 != 3) {
                        i15 = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.right = i15;
                    return;
                }
                rect.left = org.telegram.messenger.g0.L(4.0f);
                rect.right = org.telegram.messenger.g0.L(4.0f);
                return;
            case 12:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            case 13:
                int i16 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup3 = (q1Var3 = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.f22005e;
                    aj currentPosition3 = q1Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.f21452m != null) {
                        Point point3 = org.telegram.messenger.g0.f22537q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = q1Var3.getExtraInsetHeight();
                        int i17 = 0;
                        while (true) {
                            if (i17 < currentPosition3.f21452m.length) {
                                extraInsetHeight3 += (int) Math.ceil(fArr3[i17] * max3);
                                i17++;
                            } else {
                                int round3 = (Math.round(org.telegram.messenger.g0.f22536p * 7.0f) * (currentPosition3.d - currentPosition3.f21444c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i16 < size3) {
                                        aj ajVar3 = (aj) arrayList3.get(i16);
                                        byte b17 = ajVar3.f21444c;
                                        byte b18 = currentPosition3.f21444c;
                                        if (b17 == b18 && ((ajVar3.f21442a != currentPosition3.f21442a || ajVar3.f21443b != currentPosition3.f21443b || b17 != b18 || ajVar3.d != currentPosition3.d) && b17 == b18)) {
                                            round3 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max3 * ajVar3.f21446f), round3);
                                        } else {
                                            i16++;
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
            case 14:
                int R2 = RecyclerView.R(view);
                rect.left = org.telegram.messenger.g0.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == a1Var.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(12.0f);
                    return;
                }
                return;
            case 15:
                super.e(rect, view, recyclerView, a1Var);
                rect.top = 1;
                return;
            default:
                int i18 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup4 = (q1Var4 = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.f22005e;
                    aj currentPosition4 = q1Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.f21452m != null) {
                        Point point4 = org.telegram.messenger.g0.f22537q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = q1Var4.getExtraInsetHeight();
                        int i19 = 0;
                        while (true) {
                            if (i19 < currentPosition4.f21452m.length) {
                                extraInsetHeight4 += (int) Math.ceil(fArr4[i19] * max4);
                                i19++;
                            } else {
                                int round4 = (Math.round(org.telegram.messenger.g0.f22536p * 7.0f) * (currentPosition4.d - currentPosition4.f21444c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i18 < size4) {
                                        aj ajVar4 = (aj) arrayList4.get(i18);
                                        byte b19 = ajVar4.f21444c;
                                        byte b20 = currentPosition4.f21444c;
                                        if (b19 == b20 && ((ajVar4.f21442a != currentPosition4.f21442a || ajVar4.f21443b != currentPosition4.f21443b || b19 != b20 || ajVar4.d != currentPosition4.d) && b19 == b20)) {
                                            round4 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max4 * ajVar4.f21446f), round4);
                                        } else {
                                            i18++;
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
        }
    }

    @Override
    public void f(Canvas canvas, RecyclerView recyclerView) {
        View view;
        float L;
        int i7;
        switch (this.f9277a) {
            case 15:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i10 = childCount - 1;
                for (int i11 = 0; i11 < i10; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (i11 < childCount - 2) {
                        view = recyclerView.getChildAt(i11 + 1);
                    } else {
                        view = null;
                    }
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.x3) && !(view instanceof org.telegram.ui.Cells.x3)) {
                        int bottom = childAt.getBottom();
                        if (hd.f22871a0) {
                            L = 0.0f;
                        } else {
                            L = org.telegram.messenger.g0.L(72.0f);
                        }
                        float f10 = L;
                        float f11 = bottom;
                        if (hd.f22871a0) {
                            i7 = org.telegram.messenger.g0.L(72.0f);
                        } else {
                            i7 = 0;
                        }
                        canvas.drawLine(f10, f11, width - i7, f11, org.telegram.ui.ActionBar.k6.f27971k0);
                    }
                }
                return;
            default:
                return;
        }
    }
}
