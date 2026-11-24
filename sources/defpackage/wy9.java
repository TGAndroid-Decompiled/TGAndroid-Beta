package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
public final class wy9 implements p8c {
    public final byte a;
    public final zy9 b;

    public wy9(zy9 zy9Var, byte b) {
        this.a = b;
        this.b = zy9Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ArrayList arrayList = zy9Var.b2;
                bg7 bg7Var = zy9Var.q2;
                zy9Var.i2 = str;
                byte b2 = zy9Var.m2;
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            zy9Var.h1(false, true);
                            zy9Var.e1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        gl.r(bg7Var);
                        arrayList.clear();
                        arrayList.addAll(on0.f(zy9Var.l2.id));
                        zy9Var.h1(false, true);
                        zy9Var.e1(true);
                        return;
                    } else {
                        gl.r(bg7Var);
                        gl.d3(bg7Var, 350L);
                        return;
                    }
                }
                gl.r(bg7Var);
                gl.d3(bg7Var, 350L);
                return;
            default:
                List list = (List) obj;
                ArrayList arrayList2 = zy9Var.b2;
                if (!TextUtils.isEmpty(zy9Var.i2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    zy9Var.i1(true, true);
                    zy9Var.e1(true);
                    return;
                }
                return;
        }
    }
}
