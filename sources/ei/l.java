package ei;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.bj0;
public final class l extends u4.n0 {
    public final int f10598a;

    public l(int i3) {
        this.f10598a = i3;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        org.telegram.ui.Cells.q1 q1Var;
        ui currentMessagesGroup;
        float[] fArr;
        org.telegram.ui.Cells.q1 q1Var2;
        ui currentMessagesGroup2;
        float[] fArr2;
        int L;
        int L2;
        int L3;
        org.telegram.ui.Cells.q1 q1Var3;
        ui currentMessagesGroup3;
        float[] fArr3;
        org.telegram.ui.Cells.q1 q1Var4;
        ui currentMessagesGroup4;
        float[] fArr4;
        switch (this.f10598a) {
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
                int i3 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = (q1Var = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.f25702e;
                    ri currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.f25150m != null) {
                        Point point = org.telegram.messenger.g0.f22608q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = q1Var.getExtraInsetHeight();
                        int i10 = 0;
                        while (true) {
                            if (i10 < currentPosition.f25150m.length) {
                                extraInsetHeight += (int) Math.ceil(fArr[i10] * max);
                                i10++;
                            } else {
                                int round = (Math.round(org.telegram.messenger.g0.f22607p * 7.0f) * (currentPosition.d - currentPosition.f25142c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i3 < size) {
                                        ri riVar = (ri) arrayList.get(i3);
                                        byte b10 = riVar.f25142c;
                                        byte b11 = currentPosition.f25142c;
                                        if (b10 == b11 && ((riVar.f25140a != currentPosition.f25140a || riVar.f25141b != currentPosition.f25141b || b10 != b11 || riVar.d != currentPosition.d) && b10 == b11)) {
                                            round = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * riVar.f25144f), round);
                                        } else {
                                            i3++;
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
                    ArrayList arrayList2 = currentMessagesGroup2.f25702e;
                    ri currentPosition2 = q1Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.f25150m != null) {
                        Point point2 = org.telegram.messenger.g0.f22608q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = q1Var2.getExtraInsetHeight();
                        int i12 = 0;
                        while (true) {
                            if (i12 < currentPosition2.f25150m.length) {
                                extraInsetHeight2 += (int) Math.ceil(fArr2[i12] * max2);
                                i12++;
                            } else {
                                int round2 = (Math.round(org.telegram.messenger.g0.f22607p * 7.0f) * (currentPosition2.d - currentPosition2.f25142c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i11 < size2) {
                                        ri riVar2 = (ri) arrayList2.get(i11);
                                        byte b12 = riVar2.f25142c;
                                        byte b13 = currentPosition2.f25142c;
                                        if (b12 == b13 && ((riVar2.f25140a != currentPosition2.f25140a || riVar2.f25141b != currentPosition2.f25141b || b12 != b13 || riVar2.d != currentPosition2.d) && b12 == b13)) {
                                            round2 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max2 * riVar2.f25144f), round2);
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
                bj0 bj0Var = (bj0) recyclerView.T(view);
                if (bj0Var != null) {
                    int b14 = bj0Var.b() % 4;
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
                bj0 bj0Var2 = (bj0) recyclerView.T(view);
                if (bj0Var2 != null) {
                    int b15 = bj0Var2.b() % 4;
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
                bj0 bj0Var3 = (bj0) recyclerView.T(view);
                if (bj0Var3 != null) {
                    int i15 = 0;
                    if (bj0Var3.f55544f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b16 = bj0Var3.b() % 4;
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
                    ArrayList arrayList3 = currentMessagesGroup3.f25702e;
                    ri currentPosition3 = q1Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.f25150m != null) {
                        Point point3 = org.telegram.messenger.g0.f22608q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = q1Var3.getExtraInsetHeight();
                        int i17 = 0;
                        while (true) {
                            if (i17 < currentPosition3.f25150m.length) {
                                extraInsetHeight3 += (int) Math.ceil(fArr3[i17] * max3);
                                i17++;
                            } else {
                                int round3 = (Math.round(org.telegram.messenger.g0.f22607p * 7.0f) * (currentPosition3.d - currentPosition3.f25142c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i16 < size3) {
                                        ri riVar3 = (ri) arrayList3.get(i16);
                                        byte b17 = riVar3.f25142c;
                                        byte b18 = currentPosition3.f25142c;
                                        if (b17 == b18 && ((riVar3.f25140a != currentPosition3.f25140a || riVar3.f25141b != currentPosition3.f25141b || b17 != b18 || riVar3.d != currentPosition3.d) && b17 == b18)) {
                                            round3 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max3 * riVar3.f25144f), round3);
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
                    ArrayList arrayList4 = currentMessagesGroup4.f25702e;
                    ri currentPosition4 = q1Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.f25150m != null) {
                        Point point4 = org.telegram.messenger.g0.f22608q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = q1Var4.getExtraInsetHeight();
                        int i19 = 0;
                        while (true) {
                            if (i19 < currentPosition4.f25150m.length) {
                                extraInsetHeight4 += (int) Math.ceil(fArr4[i19] * max4);
                                i19++;
                            } else {
                                int round4 = (Math.round(org.telegram.messenger.g0.f22607p * 7.0f) * (currentPosition4.d - currentPosition4.f25142c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i18 < size4) {
                                        ri riVar4 = (ri) arrayList4.get(i18);
                                        byte b19 = riVar4.f25142c;
                                        byte b20 = currentPosition4.f25142c;
                                        if (b19 == b20 && ((riVar4.f25140a != currentPosition4.f25140a || riVar4.f25141b != currentPosition4.f25141b || b19 != b20 || riVar4.d != currentPosition4.d) && b19 == b20)) {
                                            round4 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max4 * riVar4.f25144f), round4);
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
        int i3;
        switch (this.f10598a) {
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
                        if (bd.f21784a0) {
                            L = 0.0f;
                        } else {
                            L = org.telegram.messenger.g0.L(72.0f);
                        }
                        float f10 = L;
                        float f11 = bottom;
                        if (bd.f21784a0) {
                            i3 = org.telegram.messenger.g0.L(72.0f);
                        } else {
                            i3 = 0;
                        }
                        canvas.drawLine(f10, f11, width - i3, f11, org.telegram.ui.ActionBar.k6.f28002k0);
                    }
                }
                return;
            default:
                return;
        }
    }
}
