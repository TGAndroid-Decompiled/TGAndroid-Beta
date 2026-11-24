package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pa2 extends r59 {
    public final oa2 f3;
    public boolean g3;
    public final Paint h3;
    public final qa2 i3;

    public pa2(qa2 qa2Var, Context context) {
        super(context, null);
        this.i3 = qa2Var;
        this.g3 = false;
        this.h3 = new Paint(1);
        oa2 oa2Var = new oa2(this);
        this.f3 = oa2Var;
        setAdapter(oa2Var);
        setLayoutManager(new u46());
        setOnItemClickListener(new na2(this));
        new hu5(new r20(this, (byte) 4)).h(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.i3.O.size();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i = Math.min(childAt.getTop(), i);
                i2 = Math.max(childAt.getBottom(), i2);
            }
        }
        if (i < i2) {
            int v0 = cmb.v0(cmb.c6, this.o2);
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

    public final void z1(TLRPC.TL_username tL_username, boolean z, boolean z2) {
        TLRPC.TL_username tL_username2;
        int min;
        qa2 qa2Var = this.i3;
        ArrayList arrayList = qa2Var.O;
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
                        if (RecyclerView.R(childAt) == i3) {
                            if (z2) {
                                gm.z3(childAt);
                            }
                            if (childAt instanceof qf1) {
                                qf1 qf1Var = (qf1) childAt;
                                qf1Var.setLoading(qa2Var.Q.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = qf1Var.w;
                                if (tL_username3 != null) {
                                    qf1Var.a(tL_username3, qf1Var.x, true, qf1Var.y);
                                }
                            }
                        } else {
                            i8++;
                        }
                    }
                    if (i4 >= 0 && i3 != i4) {
                        int i9 = i4 - 1;
                        oa2 oa2Var = this.f3;
                        ArrayList arrayList2 = oa2Var.c.i3.O;
                        if (i2 < arrayList2.size() && i9 < arrayList2.size()) {
                            arrayList2.add(i9, (TLRPC.TL_username) arrayList2.remove(i2));
                            oa2Var.j(i3, i4);
                            while (i < arrayList2.size()) {
                                i++;
                                oa2Var.g(i);
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
}
