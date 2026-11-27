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
public final class kr extends j79 {
    public final byte c;
    public final Object d;

    public kr(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public static int D(wb2 wb2Var, int i, boolean z) {
        int i2;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p;
        p47 p47Var;
        int lineTop2;
        if (wb2Var != null) {
            dc2 dc2Var = wb2Var.ub;
            r47 messageObject = wb2Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    wb2Var.V2(true);
                    hl9 hl9Var = messageObject.y2;
                    ArrayList arrayList2 = hl9Var.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) hl9Var.o.get(size)).intValue();
                        if (i < intValue) {
                            size--;
                        } else {
                            Layout a = ((kmb) arrayList2.get(size)).a();
                            if (a != null) {
                                int lineForOffset = a.getLineForOffset(Math.min(i - intValue, a.getText().length()));
                                int y = ((kmb) arrayList2.get(size)).getY() + wb2Var.u0;
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
                    if (!TextUtils.isEmpty(messageObject.z) && (p47Var = wb2Var.m3) != null) {
                        i2 = (int) wb2Var.t3;
                        charSequence = messageObject.z;
                        arrayList = p47Var.e;
                    } else {
                        wb2Var.V2(true);
                        int i3 = wb2Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        if (wb2Var.v1) {
                            i2 = uh9.w(10.0f, wb2Var.W1, i3);
                        } else {
                            i2 = i3;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            o47 o47Var = (o47) arrayList.get(i4);
                            StaticLayout staticLayout = o47Var.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i5 = o47Var.n;
                            if (i > i5) {
                                if (i - i5 > charSequence3.length() - 1) {
                                    p = i2 + ((int) (o47Var.p(arrayList, dc2Var) + o47Var.f + o47Var.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i - o47Var.n);
                                    if (z) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p = lineTop + o47Var.p(arrayList, dc2Var) + i2 + o47Var.f;
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
                return ((pr) obj).f3.size();
            case 1:
                return ((kb0) obj).f3.size() + 1;
            case 2:
                return ((j81) obj).L;
            case 3:
            case 4:
                return 1;
            case 5:
                t47 t47Var = ((m57) obj).r;
                if (t47Var == null) {
                    return 0;
                }
                return t47Var.f.size();
            default:
                return ((g48) obj).f.size();
        }
    }

    @Override
    public final long c(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 1:
                ArrayList arrayList = ((kb0) obj).f3;
                if (i >= arrayList.size()) {
                    return 1L;
                }
                return ((jb0) arrayList.get(i)).a;
            case 2:
                j81 j81Var = (j81) obj;
                return ((j81Var.J - (i / 12)) * 100) + (j81Var.K - (i % 12));
            default:
                return super.c(i);
        }
    }

    @Override
    public final int d(int i) {
        switch (this.c) {
            case 1:
                if (i < ((kb0) this.d).f3.size()) {
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
    public final void t(defpackage.f89 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
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
                nr nrVar = new nr(context);
                linearLayout.c = nrVar;
                nrVar.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                linearLayout.addView(nrVar, tre.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(aob.w0(null, aob.G6, false));
                linearLayout.addView(textView, tre.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, hl.L(0.5f)));
                paint2.setColor(-1);
                return new f89(linearLayout);
            case 1:
                kb0 kb0Var = (kb0) obj;
                return new f89(new lb0(kb0Var.k3, kb0Var.getContext()));
            case 2:
                return new f89(new g81((j81) obj, viewGroup.getContext()));
            case 3:
                return new f89(((c62) obj).w);
            case 4:
                return new f89(new tb((byte) 7, ((w72) obj).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                m57 m57Var = (m57) obj;
                s57 s57Var = m57Var.d0;
                k57 k57Var = new k57(this, context2, s57Var.x, m57Var.K, s57Var.G);
                k57Var.setClipChildren(false);
                k57Var.setClipToPadding(false);
                k57Var.setDelegate(new l57(this));
                return new f89(k57Var);
            default:
                p66 p66Var = new p66(viewGroup.getContext(), null);
                p66Var.setGravity(17);
                p66Var.setTypeface(hl.o());
                p66Var.setTextSize(1, 14.0f);
                p66Var.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
                p66Var.setEllipsize(TextUtils.TruncateAt.END);
                p66Var.setSingleLine();
                p66Var.setMaxLines(1);
                p66Var.setLayoutParams(new r79(-2, hl.L(28.0f)));
                iye.b(p66Var, 0.075f, 1.4f);
                return new f89(p66Var);
        }
    }

    @Override
    public final void y(f89 f89Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int[] f;
        switch (this.c) {
            case 5:
                m57 m57Var = (m57) this.d;
                g57 g57Var = m57Var.e;
                s57 s57Var = m57Var.d0;
                if (m57Var.r != null && (i = m57Var.a) != 1) {
                    View view = f89Var.a;
                    if (view instanceof wb2) {
                        wb2 wb2Var = (wb2) view;
                        if (i == 0) {
                            m47 c = m57Var.c(wb2Var.getMessageObject());
                            if (c == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            wb2Var.setDrawSelectionBackground(z);
                            if (c == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            wb2Var.o3(true, z2, false);
                            v47 v47Var = s57Var.d;
                            if (!v47Var.i && v47Var.d != null && m57Var.d(wb2Var)) {
                                r47 messageObject = wb2Var.getMessageObject();
                                v47 v47Var2 = s57Var.d;
                                ou1 ou1Var = v47Var2.d;
                                if (ou1Var.m && messageObject != null && messageObject.y2 != null && ((i2 = v47Var2.e) < 0 || v47Var2.f <= i2)) {
                                    String str = ou1Var.i;
                                    if (str == null) {
                                        f = null;
                                    } else {
                                        f = ll9.f(messageObject, str, ou1Var.o);
                                    }
                                    v47 v47Var3 = s57Var.d;
                                    if (f != null) {
                                        v47Var3.e = f[0];
                                        v47Var3.f = f[1];
                                    } else {
                                        v47Var3.e = 0;
                                        v47Var3.f = Math.min(uc7.s1(s57Var.x).k4.V1.f(), ou1.d(messageObject));
                                    }
                                }
                            }
                            v47 v47Var4 = s57Var.d;
                            if (!v47Var4.i && v47Var4.d != null && v47Var4.e >= 0 && m57Var.d(wb2Var) && !g57Var.w()) {
                                v47 v47Var5 = s57Var.d;
                                g57Var.Z(wb2Var, v47Var5.e, v47Var5.f);
                                if (m57Var.c0) {
                                    m57Var.M = D(wb2Var, s57Var.d.e, false);
                                    m57Var.N = D(wb2Var, s57Var.d.f, true);
                                    m57Var.O = true;
                                    m57Var.c0 = false;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        wb2Var.setDrawSelectionBackground(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(f89 f89Var, int i) {
    }

    private final void F(f89 f89Var, int i) {
    }
}
