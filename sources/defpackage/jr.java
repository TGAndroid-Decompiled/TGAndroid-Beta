package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class jr extends w39 {
    public final byte c;
    public final Object d;

    public jr(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public static int D(gb2 gb2Var, int i, boolean z) {
        int i2;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p;
        i27 i27Var;
        int lineTop2;
        if (gb2Var != null) {
            nb2 nb2Var = gb2Var.ub;
            k27 messageObject = gb2Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    gb2Var.V2(true);
                    rh9 rh9Var = messageObject.y2;
                    ArrayList arrayList2 = rh9Var.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) rh9Var.o.get(size)).intValue();
                        if (i < intValue) {
                            size--;
                        } else {
                            Layout a = ((pib) arrayList2.get(size)).a();
                            if (a != null) {
                                int lineForOffset = a.getLineForOffset(Math.min(i - intValue, a.getText().length()));
                                int y = ((pib) arrayList2.get(size)).getY() + gb2Var.u0;
                                if (z) {
                                    lineTop2 = a.getLineBottom(lineForOffset);
                                } else {
                                    lineTop2 = a.getLineTop(lineForOffset);
                                }
                                return y + lineTop2;
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (!TextUtils.isEmpty(messageObject.z) && (i27Var = gb2Var.m3) != null) {
                        i2 = (int) gb2Var.t3;
                        charSequence = messageObject.z;
                        arrayList = i27Var.e;
                    } else {
                        gb2Var.V2(true);
                        int i3 = gb2Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        if (gb2Var.v1) {
                            i2 = de9.w(10.0f, gb2Var.W1, i3);
                        } else {
                            i2 = i3;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            h27 h27Var = (h27) arrayList.get(i4);
                            StaticLayout staticLayout = h27Var.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i5 = h27Var.n;
                            if (i > i5) {
                                if (i - i5 > charSequence3.length() - 1) {
                                    p = i2 + ((int) (h27Var.p(arrayList, nb2Var) + h27Var.f + h27Var.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i - h27Var.n);
                                    if (z) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p = lineTop + h27Var.p(arrayList, nb2Var) + i2 + h27Var.f;
                                }
                                return (int) p;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((or) obj).f3.size();
            case 1:
                return ((ib0) obj).f3.size() + 1;
            case 2:
                return ((b81) obj).L;
            case 3:
            case 4:
                return 1;
            case 5:
                m27 m27Var = ((f37) obj).r;
                if (m27Var == null) {
                    return 0;
                }
                return m27Var.f.size();
            default:
                return ((z08) obj).f.size();
        }
    }

    @Override
    public final long c(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 1:
                ArrayList arrayList = ((ib0) obj).f3;
                if (i >= arrayList.size()) {
                    return 1L;
                }
                return ((hb0) arrayList.get(i)).a;
            case 2:
                b81 b81Var = (b81) obj;
                return ((b81Var.J - (i / 12)) * 100) + (b81Var.K - (i % 12));
            default:
                return super.c(i);
        }
    }

    @Override
    public final int d(int i) {
        switch (this.c) {
            case 1:
                if (i < ((ib0) this.d).f3.size()) {
                    return 0;
                }
                return 1;
            case 5:
                return 0;
            default:
                return super.d(i);
        }
    }

    @Override
    public final void t(defpackage.s49 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                mr mrVar = new mr(context);
                linearLayout.c = mrVar;
                mrVar.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                linearLayout.addView(mrVar, nme.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(bkb.w0(null, bkb.F6, false));
                linearLayout.addView(textView, nme.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, gl.L(0.5f)));
                paint2.setColor(-1);
                return new s49(linearLayout);
            case 1:
                ib0 ib0Var = (ib0) obj;
                return new s49(new jb0(ib0Var.k3, ib0Var.getContext()));
            case 2:
                return new s49(new y71((b81) obj, viewGroup.getContext()));
            case 3:
                return new s49(((m52) obj).w);
            case 4:
                return new s49(new sb((byte) 6, ((f72) obj).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                f37 f37Var = (f37) obj;
                l37 l37Var = f37Var.d0;
                d37 d37Var = new d37(this, context2, l37Var.x, f37Var.K, l37Var.G);
                d37Var.setClipChildren(false);
                d37Var.setClipToPadding(false);
                d37Var.setDelegate(new e37(this));
                return new s49(d37Var);
            default:
                l46 l46Var = new l46(viewGroup.getContext(), null);
                l46Var.setGravity(17);
                l46Var.setTypeface(gl.o());
                l46Var.setTextSize(1, 14.0f);
                l46Var.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
                l46Var.setEllipsize(TextUtils.TruncateAt.END);
                l46Var.setSingleLine();
                l46Var.setMaxLines(1);
                l46Var.setLayoutParams(new e49(-2, gl.L(28.0f)));
                ote.b(l46Var, 0.075f, 1.4f);
                return new s49(l46Var);
        }
    }

    @Override
    public final void y(s49 s49Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int[] f;
        switch (this.c) {
            case 5:
                f37 f37Var = (f37) this.d;
                z27 z27Var = f37Var.e;
                l37 l37Var = f37Var.d0;
                if (f37Var.r != null && (i = f37Var.a) != 1) {
                    View view = s49Var.a;
                    if (view instanceof gb2) {
                        gb2 gb2Var = (gb2) view;
                        if (i == 0) {
                            f27 c = f37Var.c(gb2Var.getMessageObject());
                            if (c == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            gb2Var.setDrawSelectionBackground(z);
                            if (c == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            gb2Var.o3(true, z2, false);
                            o27 o27Var = l37Var.d;
                            if (!o27Var.i && o27Var.d != null && f37Var.d(gb2Var)) {
                                k27 messageObject = gb2Var.getMessageObject();
                                o27 o27Var2 = l37Var.d;
                                bu1 bu1Var = o27Var2.d;
                                if (bu1Var.m && messageObject != null && messageObject.y2 != null && ((i2 = o27Var2.e) < 0 || o27Var2.f <= i2)) {
                                    String str = bu1Var.i;
                                    if (str == null) {
                                        f = null;
                                    } else {
                                        f = vh9.f(messageObject, str, bu1Var.o);
                                    }
                                    o27 o27Var3 = l37Var.d;
                                    if (f != null) {
                                        o27Var3.e = f[0];
                                        o27Var3.f = f[1];
                                    } else {
                                        o27Var3.e = 0;
                                        o27Var3.f = Math.min(na7.q1(l37Var.x).k4.N1.f(), bu1.d(messageObject));
                                    }
                                }
                            }
                            o27 o27Var4 = l37Var.d;
                            if (!o27Var4.i && o27Var4.d != null && o27Var4.e >= 0 && f37Var.d(gb2Var) && !z27Var.w()) {
                                o27 o27Var5 = l37Var.d;
                                z27Var.Z(gb2Var, o27Var5.e, o27Var5.f);
                                if (f37Var.c0) {
                                    f37Var.M = D(gb2Var, l37Var.d.e, false);
                                    f37Var.N = D(gb2Var, l37Var.d.f, true);
                                    f37Var.O = true;
                                    f37Var.c0 = false;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        gb2Var.setDrawSelectionBackground(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s49 s49Var, int i) {
    }

    private final void F(s49 s49Var, int i) {
    }
}
