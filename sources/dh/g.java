package dh;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.ej;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ck0;
import s4.m0;
import s4.z0;
public final class g extends m0 {
    public final int f5947a;

    public g(int i10) {
        this.f5947a = i10;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        q1 q1Var;
        ej currentMessagesGroup;
        float[] fArr;
        q1 q1Var2;
        ej currentMessagesGroup2;
        float[] fArr2;
        q1 q1Var3;
        ej currentMessagesGroup3;
        float[] fArr3;
        int L;
        int L2;
        int L3;
        q1 q1Var4;
        ej currentMessagesGroup4;
        float[] fArr4;
        switch (this.f5947a) {
            case 0:
                rect.top = i0.L(6.0f);
                return;
            case 1:
                int i10 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup = (q1Var = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    bj currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.f14784m != null) {
                        Point point = i0.f16026q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = q1Var.getExtraInsetHeight();
                        int i11 = 0;
                        while (true) {
                            if (i11 < currentPosition.f14784m.length) {
                                extraInsetHeight += (int) Math.ceil(fArr[i11] * max);
                                i11++;
                            } else {
                                int round = (Math.round(i0.f16025p * 7.0f) * (currentPosition.d - currentPosition.f14777c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i10 < size) {
                                        bj bjVar = (bj) arrayList.get(i10);
                                        byte b10 = bjVar.f14777c;
                                        byte b11 = currentPosition.f14777c;
                                        if (b10 == b11 && ((bjVar.f14775a != currentPosition.f14775a || bjVar.f14776b != currentPosition.f14776b || b10 != b11 || bjVar.d != currentPosition.d) && b10 == b11)) {
                                            round = m5.B(4.0f, (int) Math.ceil(max * bjVar.f14778f), round);
                                        } else {
                                            i10++;
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
            case 2:
                int i12 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup2 = (q1Var2 = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    bj currentPosition2 = q1Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.f14784m != null) {
                        Point point2 = i0.f16026q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = q1Var2.getExtraInsetHeight();
                        int i13 = 0;
                        while (true) {
                            if (i13 < currentPosition2.f14784m.length) {
                                extraInsetHeight2 += (int) Math.ceil(fArr2[i13] * max2);
                                i13++;
                            } else {
                                int round2 = (Math.round(i0.f16025p * 7.0f) * (currentPosition2.d - currentPosition2.f14777c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i12 < size2) {
                                        bj bjVar2 = (bj) arrayList2.get(i12);
                                        byte b12 = bjVar2.f14777c;
                                        byte b13 = currentPosition2.f14777c;
                                        if (b12 == b13 && ((bjVar2.f14775a != currentPosition2.f14775a || bjVar2.f14776b != currentPosition2.f14776b || b12 != b13 || bjVar2.d != currentPosition2.d) && b12 == b13)) {
                                            round2 = m5.B(4.0f, (int) Math.ceil(max2 * bjVar2.f14778f), round2);
                                        } else {
                                            i12++;
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
            case 3:
                rect.right = i0.L(2.0f);
                return;
            case 4:
                rect.right = i0.L(2.0f);
                return;
            case 5:
                int i14 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup3 = (q1Var3 = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    bj currentPosition3 = q1Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.f14784m != null) {
                        Point point3 = i0.f16026q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = q1Var3.getExtraInsetHeight();
                        int i15 = 0;
                        while (true) {
                            if (i15 < currentPosition3.f14784m.length) {
                                extraInsetHeight3 += (int) Math.ceil(fArr3[i15] * max3);
                                i15++;
                            } else {
                                int round3 = (Math.round(i0.f16025p * 7.0f) * (currentPosition3.d - currentPosition3.f14777c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i14 < size3) {
                                        bj bjVar3 = (bj) arrayList3.get(i14);
                                        byte b14 = bjVar3.f14777c;
                                        byte b15 = currentPosition3.f14777c;
                                        if (b14 == b15 && ((bjVar3.f14775a != currentPosition3.f14775a || bjVar3.f14776b != currentPosition3.f14776b || b14 != b15 || bjVar3.d != currentPosition3.d) && b14 == b15)) {
                                            round3 = m5.B(4.0f, (int) Math.ceil(max3 * bjVar3.f14778f), round3);
                                        } else {
                                            i14++;
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
            case 6:
                ck0 ck0Var = (ck0) recyclerView.T(view);
                if (ck0Var != null) {
                    int b16 = ck0Var.b() % 4;
                    int i16 = 0;
                    if (b16 == 0) {
                        L = 0;
                    } else {
                        L = i0.L(4.0f);
                    }
                    rect.left = L;
                    if (b16 != 3) {
                        i16 = i0.L(4.0f);
                    }
                    rect.right = i16;
                    return;
                }
                rect.left = i0.L(4.0f);
                rect.right = i0.L(4.0f);
                return;
            case 7:
                ck0 ck0Var2 = (ck0) recyclerView.T(view);
                if (ck0Var2 != null) {
                    int b17 = ck0Var2.b() % 4;
                    int i17 = 0;
                    if (b17 == 0) {
                        L2 = 0;
                    } else {
                        L2 = i0.L(4.0f);
                    }
                    rect.left = L2;
                    if (b17 != 3) {
                        i17 = i0.L(4.0f);
                    }
                    rect.right = i17;
                    return;
                }
                rect.left = i0.L(4.0f);
                rect.right = i0.L(4.0f);
                return;
            case 8:
                ck0 ck0Var3 = (ck0) recyclerView.T(view);
                if (ck0Var3 != null) {
                    int i18 = 0;
                    if (ck0Var3.f47901f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b18 = ck0Var3.b() % 4;
                    if (b18 == 0) {
                        L3 = 0;
                    } else {
                        L3 = i0.L(4.0f);
                    }
                    rect.left = L3;
                    if (b18 != 3) {
                        i18 = i0.L(4.0f);
                    }
                    rect.right = i18;
                    return;
                }
                rect.left = i0.L(4.0f);
                rect.right = i0.L(4.0f);
                return;
            case 9:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            case 10:
                int i19 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup4 = (q1Var4 = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    bj currentPosition4 = q1Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.f14784m != null) {
                        Point point4 = i0.f16026q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = q1Var4.getExtraInsetHeight();
                        int i20 = 0;
                        while (true) {
                            if (i20 < currentPosition4.f14784m.length) {
                                extraInsetHeight4 += (int) Math.ceil(fArr4[i20] * max4);
                                i20++;
                            } else {
                                int round4 = (Math.round(i0.f16025p * 7.0f) * (currentPosition4.d - currentPosition4.f14777c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i19 < size4) {
                                        bj bjVar4 = (bj) arrayList4.get(i19);
                                        byte b19 = bjVar4.f14777c;
                                        byte b20 = currentPosition4.f14777c;
                                        if (b19 == b20 && ((bjVar4.f14775a != currentPosition4.f14775a || bjVar4.f14776b != currentPosition4.f14776b || b19 != b20 || bjVar4.d != currentPosition4.d) && b19 == b20)) {
                                            round4 = m5.B(4.0f, (int) Math.ceil(max4 * bjVar4.f14778f), round4);
                                        } else {
                                            i19++;
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
                int R = RecyclerView.R(view);
                rect.left = i0.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R == z0Var.b() - 1) {
                    rect.right = i0.L(12.0f);
                    return;
                }
                return;
            case 12:
                super.c(rect, view, recyclerView, z0Var);
                rect.top = 1;
                return;
            case 13:
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S == 1) {
                    rect.left = i0.L(31.0f) + (-i0.L(85.0f));
                    return;
                } else if (S == 2) {
                    rect.left = i0.L(31.0f) + (-i0.L(85.0f));
                    return;
                } else {
                    return;
                }
            case 14:
                int L4 = i0.L(4.0f);
                rect.top = 0;
                rect.bottom = L4;
                rect.right = L4;
                rect.left = L4;
                if (RecyclerView.R(view) % 3 != 2) {
                    rect.right = 0;
                    return;
                }
                return;
            case 15:
                int L5 = i0.L(5.0f);
                rect.right = L5;
                rect.bottom = L5;
                return;
            default:
                super.c(rect, view, recyclerView, z0Var);
                int R2 = RecyclerView.R(view);
                rect.left = i0.L(8.0f);
                if (R2 == z0Var.b() - 1) {
                    rect.right = i0.L(10.0f);
                }
                if (R2 == 0) {
                    rect.left = i0.L(10.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(Canvas canvas, RecyclerView recyclerView) {
        View view;
        float L;
        int i10;
        switch (this.f5947a) {
            case 12:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i11 = childCount - 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    View childAt = recyclerView.getChildAt(i12);
                    if (i12 < childCount - 2) {
                        view = recyclerView.getChildAt(i12 + 1);
                    } else {
                        view = null;
                    }
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof z3) && !(view instanceof z3)) {
                        int bottom = childAt.getBottom();
                        if (cd.X) {
                            L = 0.0f;
                        } else {
                            L = i0.L(72.0f);
                        }
                        float f7 = L;
                        float f10 = bottom;
                        if (cd.X) {
                            i10 = i0.L(72.0f);
                        } else {
                            i10 = 0;
                        }
                        canvas.drawLine(f7, f10, width - i10, f10, t6.f21052k0);
                    }
                }
                return;
            default:
                return;
        }
    }
}
