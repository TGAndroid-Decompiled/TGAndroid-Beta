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
public final class js extends y59 {
    public final byte c;
    public final Object d;

    public js(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public static int D(rc2 rc2Var, int i, boolean z) {
        int i2;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p;
        i47 i47Var;
        int lineTop2;
        if (rc2Var != null) {
            yc2 yc2Var = rc2Var.ub;
            k47 messageObject = rc2Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    rc2Var.V2(true);
                    uj9 uj9Var = messageObject.y2;
                    ArrayList arrayList2 = uj9Var.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) uj9Var.o.get(size)).intValue();
                        if (i < intValue) {
                            size--;
                        } else {
                            Layout a = ((qkb) arrayList2.get(size)).a();
                            if (a != null) {
                                int lineForOffset = a.getLineForOffset(Math.min(i - intValue, a.getText().length()));
                                int y = ((qkb) arrayList2.get(size)).getY() + rc2Var.u0;
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
                    if (!TextUtils.isEmpty(messageObject.z) && (i47Var = rc2Var.m3) != null) {
                        i2 = (int) rc2Var.t3;
                        charSequence = messageObject.z;
                        arrayList = i47Var.e;
                    } else {
                        rc2Var.V2(true);
                        int i3 = rc2Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        if (rc2Var.v1) {
                            i2 = hg9.v(10.0f, rc2Var.W1, i3);
                        } else {
                            i2 = i3;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            h47 h47Var = (h47) arrayList.get(i4);
                            StaticLayout staticLayout = h47Var.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i5 = h47Var.n;
                            if (i > i5) {
                                if (i - i5 > charSequence3.length() - 1) {
                                    p = i2 + ((int) (h47Var.p(arrayList, yc2Var) + h47Var.f + h47Var.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i - h47Var.n);
                                    if (z) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p = lineTop + h47Var.p(arrayList, yc2Var) + i2 + h47Var.f;
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
                return ((os) obj).f3.size();
            case 1:
                return ((ic0) obj).f3.size() + 1;
            case 2:
                return ((k91) obj).L;
            case 3:
            case 4:
                return 1;
            case 5:
                m47 m47Var = ((f57) obj).r;
                if (m47Var == null) {
                    return 0;
                }
                return m47Var.f.size();
            default:
                return ((c38) obj).f.size();
        }
    }

    @Override
    public final long c(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 1:
                ArrayList arrayList = ((ic0) obj).f3;
                if (i >= arrayList.size()) {
                    return 1L;
                }
                return ((hc0) arrayList.get(i)).a;
            case 2:
                k91 k91Var = (k91) obj;
                return ((k91Var.J - (i / 12)) * 100) + (k91Var.K - (i % 12));
            default:
                return super.c(i);
        }
    }

    @Override
    public final int d(int i) {
        switch (this.c) {
            case 1:
                if (i < ((ic0) this.d).f3.size()) {
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
    public final void t(defpackage.u69 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
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
                ms msVar = new ms(context);
                linearLayout.c = msVar;
                msVar.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                linearLayout.addView(msVar, qoe.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(cmb.w0(null, cmb.F6, false));
                linearLayout.addView(textView, qoe.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, gm.L(0.5f)));
                paint2.setColor(-1);
                return new u69(linearLayout);
            case 1:
                ic0 ic0Var = (ic0) obj;
                return new u69(new jc0(ic0Var.k3, ic0Var.getContext()));
            case 2:
                return new u69(new h91((k91) obj, viewGroup.getContext()));
            case 3:
                return new u69(((x62) obj).w);
            case 4:
                return new u69(new sb((byte) 7, ((q82) obj).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                f57 f57Var = (f57) obj;
                l57 l57Var = f57Var.d0;
                d57 d57Var = new d57(this, context2, l57Var.x, f57Var.K, l57Var.G);
                d57Var.setClipChildren(false);
                d57Var.setClipToPadding(false);
                d57Var.setDelegate(new e57(this));
                return new u69(d57Var);
            default:
                l66 l66Var = new l66(viewGroup.getContext(), null);
                l66Var.setGravity(17);
                l66Var.setTypeface(gm.o());
                l66Var.setTextSize(1, 14.0f);
                l66Var.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
                l66Var.setEllipsize(TextUtils.TruncateAt.END);
                l66Var.setSingleLine();
                l66Var.setMaxLines(1);
                l66Var.setLayoutParams(new g69(-2, gm.L(28.0f)));
                rve.b(l66Var, 0.075f, 1.4f);
                return new u69(l66Var);
        }
    }

    @Override
    public final void y(u69 u69Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int[] f;
        switch (this.c) {
            case 5:
                f57 f57Var = (f57) this.d;
                z47 z47Var = f57Var.e;
                l57 l57Var = f57Var.d0;
                if (f57Var.r != null && (i = f57Var.a) != 1) {
                    View view = u69Var.a;
                    if (view instanceof rc2) {
                        rc2 rc2Var = (rc2) view;
                        if (i == 0) {
                            f47 c = f57Var.c(rc2Var.getMessageObject());
                            if (c == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            rc2Var.setDrawSelectionBackground(z);
                            if (c == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            rc2Var.o3(true, z2, false);
                            o47 o47Var = l57Var.d;
                            if (!o47Var.i && o47Var.d != null && f57Var.d(rc2Var)) {
                                k47 messageObject = rc2Var.getMessageObject();
                                o47 o47Var2 = l57Var.d;
                                nv1 nv1Var = o47Var2.d;
                                if (nv1Var.m && messageObject != null && messageObject.y2 != null && ((i2 = o47Var2.e) < 0 || o47Var2.f <= i2)) {
                                    String str = nv1Var.i;
                                    if (str == null) {
                                        f = null;
                                    } else {
                                        f = yj9.f(messageObject, str, nv1Var.o);
                                    }
                                    o47 o47Var3 = l57Var.d;
                                    if (f != null) {
                                        o47Var3.e = f[0];
                                        o47Var3.f = f[1];
                                    } else {
                                        o47Var3.e = 0;
                                        o47Var3.f = Math.min(oc7.r1(l57Var.x).l4.N1.f(), nv1.d(messageObject));
                                    }
                                }
                            }
                            o47 o47Var4 = l57Var.d;
                            if (!o47Var4.i && o47Var4.d != null && o47Var4.e >= 0 && f57Var.d(rc2Var) && !z47Var.w()) {
                                o47 o47Var5 = l57Var.d;
                                z47Var.Z(rc2Var, o47Var5.e, o47Var5.f);
                                if (f57Var.c0) {
                                    f57Var.M = D(rc2Var, l57Var.d.e, false);
                                    f57Var.N = D(rc2Var, l57Var.d.f, true);
                                    f57Var.O = true;
                                    f57Var.c0 = false;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        rc2Var.setDrawSelectionBackground(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(u69 u69Var, int i) {
    }

    private final void F(u69 u69Var, int i) {
    }
}
