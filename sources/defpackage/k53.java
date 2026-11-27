package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
public final class k53 extends ViewGroup {
    public final i53 a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final h53 h;
    public boolean n;
    public final h53 r;
    public int s;
    public int w;

    public k53(Context context) {
        super(context);
        String str;
        int i;
        this.c = new View[12];
        int i2 = 0;
        this.h = new h53(this, (byte) 0);
        this.r = new h53(this, (byte) 1);
        for (int i3 = 0; i3 < 11; i3++) {
            if (i3 != 9) {
                switch (i3) {
                    case 1:
                        str = "ABC";
                        break;
                    case 2:
                        str = "DEF";
                        break;
                    case 3:
                        str = "GHI";
                        break;
                    case 4:
                        str = "JKL";
                        break;
                    case 5:
                        str = "MNO";
                        break;
                    case 6:
                        str = "PQRS";
                        break;
                    case 7:
                        str = "TUV";
                        break;
                    case 8:
                        str = "WXYZ";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "+";
                        break;
                }
                if (i3 != 10) {
                    i = i3 + 1;
                } else {
                    i = 0;
                }
                String valueOf = String.valueOf(i);
                this.c[i3] = new j53(context, valueOf, str);
                this.c[i3].setOnClickListener(new sb1(this, valueOf, (byte) 28));
                addView(this.c[i3]);
            }
        }
        i53 i53Var = new i53(this, context, new kj4(context, new g22(this, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 1)));
        this.a = i53Var;
        i53Var.setImageResource(2131232098);
        yob.s(i53Var, aob.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = hl.L(11.0f);
        i53Var.setPadding(L, L, L, L);
        i53Var.setOnClickListener(new y00((byte) 1));
        this.c[11] = i53Var;
        addView(i53Var);
        while (true) {
            View[] viewArr = this.c;
            if (i2 < viewArr.length) {
                View view = viewArr[i2];
                if (view != null) {
                    iye.b(view, 0.02f, 1.2f);
                    a(i2, view);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static void a(int i, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        float f3;
        boolean z4 = true;
        if (i < 3) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i % 3;
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i <= 8) {
            z4 = false;
        }
        int i3 = aob.i6;
        int w0 = aob.w0(null, i3, false);
        int o = vm2.o(aob.w0(null, i3, false), 30);
        float f4 = 12.0f;
        if (z2 && z) {
            f = 24.0f;
        } else {
            f = 12.0f;
        }
        int L = hl.L(f);
        if (z3 && z) {
            f2 = 24.0f;
        } else {
            f2 = 12.0f;
        }
        int L2 = hl.L(f2);
        if (z3 && z4) {
            f3 = 24.0f;
        } else {
            f3 = 12.0f;
        }
        int L3 = hl.L(f3);
        if (z2 && z4) {
            f4 = 24.0f;
        }
        hf0 i0 = aob.i0(L, L2, L3, hl.L(f4), w0, o, o);
        uob M = yob.M(i3);
        uob g = yob.g(i3, 30);
        view.setBackground(i0);
        yob.j(view, i0, M, g, null);
    }

    @Override
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int D = ik8.D(32.0f, getWidth(), 3);
        int D2 = ik8.D(42.0f, getHeight(), 4);
        int i5 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i5 < viewArr.length) {
                int L = hl.L(6.0f) + D;
                int L2 = hl.L(10.0f) + (L * (i5 % 3));
                int L3 = hl.L(6.0f) + D2;
                int L4 = hl.L(10.0f) + (L3 * (i5 / 3));
                View view = viewArr[i5];
                if (view != null) {
                    view.layout(L2, L4, L2 + D, L4 + D2);
                }
                i5++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View[] viewArr;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int D = ik8.D(32.0f, getWidth(), 3);
        int D2 = ik8.D(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(D, 1073741824), View.MeasureSpec.makeMeasureSpec(D2, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z) {
        this.e = z;
    }

    public void setEditText(EditText editText) {
        this.b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
