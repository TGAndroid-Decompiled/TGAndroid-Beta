package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u92 extends d79 {
    public final t92 f3;
    public boolean g3;
    public final Paint h3;
    public final v92 i3;

    public u92(v92 v92Var, Context context) {
        super(context, null);
        this.i3 = v92Var;
        this.g3 = false;
        this.h3 = new Paint(1);
        t92 t92Var = new t92(this);
        this.f3 = t92Var;
        setAdapter(t92Var);
        setLayoutManager(new x46());
        setOnItemClickListener(new s92(this));
        new lu5(new s10(this, (byte) 4)).h(this);
    }

    public final void A1(TLRPC.TL_username tL_username, boolean z, boolean z2) {
        TLRPC.TL_username tL_username2;
        int min;
        v92 v92Var = this.i3;
        ArrayList arrayList = v92Var.O;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) == tL_username) {
                int i3 = i2 + 1;
                if (i2 >= 0 && i2 < arrayList.size() && (tL_username2 = (TLRPC.TL_username) arrayList.get(i2)) != null) {
                    int i4 = -1;
                    if (tL_username2.active != z) {
                        tL_username2.active = z;
                        if (z) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < arrayList.size()) {
                                    if (!((TLRPC.TL_username) arrayList.get(i5)).active) {
                                        break;
                                    }
                                    i5++;
                                } else {
                                    i5 = -1;
                                    break;
                                }
                            }
                            if (i5 >= 0) {
                                min = Math.max(0, i5 - 1);
                                i4 = min + 1;
                            }
                        } else {
                            int i6 = -1;
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                if (((TLRPC.TL_username) arrayList.get(i7)).active) {
                                    i6 = i7;
                                }
                            }
                            if (i6 >= 0) {
                                min = Math.min(arrayList.size() - 1, i6 + 1);
                                i4 = min + 1;
                            }
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        if (i8 >= getChildCount()) {
                            break;
                        }
                        View childAt = getChildAt(i8);
                        if (RecyclerView.S(childAt) == i3) {
                            if (z2) {
                                hl.z3(childAt);
                            }
                            if (childAt instanceof re1) {
                                re1 re1Var = (re1) childAt;
                                re1Var.setLoading(v92Var.Q.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = re1Var.w;
                                if (tL_username3 != null) {
                                    re1Var.a(tL_username3, re1Var.x, true, re1Var.y);
                                }
                            }
                        } else {
                            i8++;
                        }
                    }
                    if (i4 >= 0 && i3 != i4) {
                        int i9 = i4 - 1;
                        t92 t92Var = this.f3;
                        ArrayList arrayList2 = t92Var.c.i3.O;
                        if (i2 < arrayList2.size() && i9 < arrayList2.size()) {
                            arrayList2.add(i9, (TLRPC.TL_username) arrayList2.remove(i2));
                            t92Var.j(i3, i4);
                            while (i < arrayList2.size()) {
                                i++;
                                t92Var.g(i);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int S;
        int size = this.i3.O.size();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && (S = RecyclerView.S(childAt)) >= 1 && S <= size) {
                i = Math.min(childAt.getTop(), i);
                i2 = Math.max(childAt.getBottom(), i2);
            }
        }
        if (i < i2) {
            int v0 = aob.v0(aob.d6, this.o2);
            Paint paint = this.h3;
            paint.setColor(v0);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i, getWidth(), i2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, -2137483649);
    }
}
